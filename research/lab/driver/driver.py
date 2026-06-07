#!/usr/bin/env python3
"""
Generic Frida driver for the malware-analysis lab.

Works for ANY sample: pass --package and one or more hook scripts. The driver
prepends a `LAB` config object (package, mockUrl, traceClasses, extraPrefixes)
that the shared hooks read, so the same hooks generalize across APKs.

Defaults to launch-then-ATTACH (spawn-gating is unreliable on the emulator).
Resolves the target PID via `adb pidof` on the chosen serial.

Examples:
  # trace + ssl bypass on a sample running on emulator-5556
  python driver.py --serial emulator-5556 --package com.evil.app \
      --duration 60 ../hooks/trace_jni.js ../hooks/ssl_bypass.js

  # spawn instead of attach (if the image supports it)
  python driver.py --serial emulator-5556 --package com.evil.app --spawn ...

Streams console.log (set_log_handler) and send() (on 'message') with timestamps.
"""
import argparse
import json
import subprocess
import sys
import time

import frida


def ts() -> str:
    return time.strftime("%H:%M:%S")


def adb_pidof(adb: str, serial: str, package: str) -> int:
    out = subprocess.run([adb, "-s", serial, "shell", "pidof", package],
                         capture_output=True, text=True).stdout.strip()
    return int(out.split()[0]) if out.split() else 0


def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument("scripts", nargs="+", help="hook scripts to load, in order")
    ap.add_argument("--package", required=True, help="target app package")
    ap.add_argument("--serial", default=None, help="emulator serial (e.g. emulator-5556)")
    ap.add_argument("--adb", default="adb", help="path to adb")
    ap.add_argument("--mock-url", default="", help="LAB.mockUrl for host/baseURL rewriting")
    ap.add_argument("--trace-classes", default="", help="comma-separated explicit classes to trace")
    ap.add_argument("--extra-prefixes", default="", help="comma-separated extra class prefixes (e.g. B2.)")
    ap.add_argument("--duration", type=int, default=60, help="seconds to run (<=0 = until Ctrl-C)")
    ap.add_argument("--load-delay", type=float, default=2.0, help="post-resume delay before loading (spawn only)")
    ap.add_argument("--spawn", action="store_true", help="spawn instead of attach")
    ap.add_argument("--pid", type=int, default=0, help="attach to this exact pid")
    args = ap.parse_args()

    dev = frida.get_device(args.serial) if args.serial else frida.get_usb_device(timeout=15)
    print(f"[{ts()}] device: {dev.id}")

    lab_cfg = {
        "package": args.package,
        "mockUrl": args.mock_url,
        "traceClasses": [c for c in args.trace_classes.split(",") if c],
        "extraPrefixes": [p for p in args.extra_prefixes.split(",") if p],
    }
    prelude = "var LAB = " + json.dumps(lab_cfg) + ";\n"

    pid = None
    if args.spawn:
        pid = dev.spawn([args.package])
        session = dev.attach(pid)
        dev.resume(pid)
        print(f"[{ts()}] spawned pid={pid}; waiting {args.load_delay}s")
        time.sleep(args.load_delay)
    else:
        target = args.pid or adb_pidof(args.adb, args.serial or "emulator-5554", args.package)
        if not target:
            print(f"[{ts()}] ERROR: {args.package} not running on {args.serial}. Launch it first.")
            return 2
        session = dev.attach(target)
        print(f"[{ts()}] attached pid={target}")

    def on_message(message, data):
        if message["type"] == "send":
            print(f"[{ts()}][send] {json.dumps(message['payload'], ensure_ascii=False)}", flush=True)
        elif message["type"] == "error":
            print(f"[{ts()}][error] {message.get('stack') or message.get('description')}", flush=True)

    def make_log(tag):
        def on_log(level, text):
            print(f"[{ts()}][{tag}:{level}] {text}", flush=True)
        return on_log

    scripts = []
    for path in args.scripts:
        with open(path) as f:
            src = prelude + f.read()
        s = session.create_script(src)
        s.on("message", on_message)
        s.set_log_handler(make_log(path.split("/")[-1]))
        s.load()
        print(f"[{ts()}] loaded {path}", flush=True)
        scripts.append(s)

    if args.duration <= 0:
        print(f"[{ts()}] running until Ctrl-C ...", flush=True)
        try:
            sys.stdin.read()
        except KeyboardInterrupt:
            pass
    else:
        print(f"[{ts()}] running {args.duration}s ...", flush=True)
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
