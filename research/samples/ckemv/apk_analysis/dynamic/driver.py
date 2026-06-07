#!/usr/bin/env python3
"""
Frida driver for CKEMV dynamic analysis (Mac/arm64).

Spawns xyz.happify.ckemv under Frida, loads one or more JS hook scripts, runs
for a fixed duration, and streams both console.log (set_log_handler) and send()
(on 'message') to stdout with timestamps so captures are append-only and
greppable.

Usage:
    python driver.py --duration 30 hooks/trace_jni.js hooks/rustls_bypass.js
    python driver.py --attach --duration 60 hooks/capture_c2.js   # attach to running app
    python driver.py --load-delay 3 ...   # seconds to wait after resume before
                                          # loading scripts (lets app classes load)

Invariant: this only instruments; it never relaxes the C2 sinkhole. The real
tqqemv.xyz is blocked at /system/etc/hosts on the device regardless.
"""
import argparse
import sys
import time
import frida

PKG = "xyz.happify.ckemv"


def ts() -> str:
    return time.strftime("%H:%M:%S")


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("scripts", nargs="+", help="JS hook scripts to load, in order")
    ap.add_argument("--duration", type=int, default=30, help="seconds to run")
    ap.add_argument("--load-delay", type=float, default=3.0,
                    help="seconds after resume before loading scripts (Java class load)")
    ap.add_argument("--attach", action="store_true",
                    help="attach to a already-running app instead of spawning")
    ap.add_argument("--pid", type=int, default=0,
                    help="attach to this exact pid (implies --attach)")
    args = ap.parse_args()

    dev = frida.get_usb_device(timeout=15)
    print(f"[{ts()}] device: {dev}")

    if args.attach or args.pid:
        target = args.pid if args.pid else PKG
        session = dev.attach(target)
        print(f"[{ts()}] attached to running target={target}")
        pid = None
    else:
        pid = dev.spawn([PKG])
        session = dev.attach(pid)
        print(f"[{ts()}] spawned {PKG} pid={pid}")
        dev.resume(pid)
        print(f"[{ts()}] resumed; waiting {args.load_delay}s for runtime/classes")
        time.sleep(args.load_delay)

    def on_message(message, data):
        if message["type"] == "send":
            print(f"[{ts()}][send] {message['payload']}", flush=True)
        elif message["type"] == "error":
            print(f"[{ts()}][error] {message.get('stack') or message.get('description')}",
                  flush=True)

    def make_log_handler(tag):
        def on_log(level, text):
            print(f"[{ts()}][{tag}:{level}] {text}", flush=True)
        return on_log

    scripts = []
    for path in args.scripts:
        with open(path, "r") as f:
            src = f.read()
        s = session.create_script(src)
        s.on("message", on_message)
        s.set_log_handler(make_log_handler(path.split("/")[-1]))
        s.load()
        print(f"[{ts()}] loaded {path}", flush=True)
        scripts.append(s)

    print(f"[{ts()}] running for {args.duration}s ...", flush=True)
    try:
        time.sleep(args.duration)
    except KeyboardInterrupt:
        pass

    for s in scripts:
        try:
            s.unload()
        except Exception:
            pass
    try:
        session.detach()
    except Exception:
        pass
    print(f"[{ts()}] done.", flush=True)
    return 0


if __name__ == "__main__":
    sys.exit(main())
