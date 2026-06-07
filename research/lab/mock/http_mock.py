#!/usr/bin/env python3
"""
Generic logging HTTP mock for the lab.

Logs every request (method, path, headers, Authorization, body) to an access
log AND stdout, and replies from a routes file. Reusable across samples: point a
sample's traffic here (rewrite baseURL/host to http://10.0.2.2:<port>) to capture
the request wire-format and drive the app through its lifecycle with canned
responses.

Routes file (JSON): list of {method, path, status, content_type, body}.
  body may be a string or a JSON object/array. First match wins; unmatched
  requests get --default-status (200) with --default-body.

Usage:
  python http_mock.py --port 8771 --routes routes.json --access-log captures/c2.log
"""
import argparse
import datetime as dt
import json
import os
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer

ROUTES = []
ACCESS_LOG = None
DEFAULT_STATUS = 200
DEFAULT_BODY = {"ok": True}


def log_entry(entry: dict):
    line = json.dumps(entry, ensure_ascii=False)
    print(line, flush=True)
    if ACCESS_LOG:
        os.makedirs(os.path.dirname(ACCESS_LOG), exist_ok=True)
        with open(ACCESS_LOG, "a") as f:
            f.write(line + "\n")


def match_route(method: str, path: str):
    for r in ROUTES:
        if r.get("method", "GET").upper() == method and r.get("path") == path:
            return r
    return None


class Handler(BaseHTTPRequestHandler):
    server_version = "nginx"
    sys_version = ""

    def _body(self) -> bytes:
        n = int(self.headers.get("Content-Length", 0) or 0)
        return self.rfile.read(n) if n else b""

    def _serve(self):
        body = self._body()
        path = self.path.split("?", 1)[0]
        log_entry({
            "ts": dt.datetime.now().isoformat(timespec="milliseconds"),
            "method": self.command, "path": self.path,
            "authorization": self.headers.get("Authorization"),
            "content_type": self.headers.get("Content-Type"),
            "headers": {k: v for k, v in self.headers.items()},
            "body_len": len(body),
            "body": body.decode("utf-8", "replace"),
        })
        route = match_route(self.command, path)
        if route:
            status = route.get("status", 200)
            ctype = route.get("content_type", "application/json")
            payload = route.get("body", "")
        else:
            status, ctype, payload = DEFAULT_STATUS, "application/json", DEFAULT_BODY
        data = json.dumps(payload).encode() if isinstance(payload, (dict, list)) else str(payload).encode()
        self.send_response(status)
        self.send_header("Content-Type", ctype)
        self.send_header("Content-Length", str(len(data)))
        self.end_headers()
        self.wfile.write(data)

    do_GET = _serve
    do_POST = _serve
    do_PUT = _serve
    do_DELETE = _serve

    def log_message(self, *a):
        pass


def main():
    global ROUTES, ACCESS_LOG, DEFAULT_STATUS, DEFAULT_BODY
    ap = argparse.ArgumentParser()
    ap.add_argument("--port", type=int, default=8771)
    ap.add_argument("--host", default="0.0.0.0")
    ap.add_argument("--routes", default="")
    ap.add_argument("--access-log", default="")
    ap.add_argument("--default-status", type=int, default=200)
    ap.add_argument("--default-body", default='{"ok": true}')
    args = ap.parse_args()

    if args.routes and os.path.exists(args.routes):
        with open(args.routes) as f:
            ROUTES = json.load(f)
    ACCESS_LOG = os.path.abspath(args.access_log) if args.access_log else None
    DEFAULT_STATUS = args.default_status
    try:
        DEFAULT_BODY = json.loads(args.default_body)
    except Exception:
        DEFAULT_BODY = args.default_body

    httpd = ThreadingHTTPServer((args.host, args.port), Handler)
    print(f"[mock] listening on {args.host}:{args.port} "
          f"(device: http://10.0.2.2:{args.port}) routes={len(ROUTES)} log={ACCESS_LOG}", flush=True)
    try:
        httpd.serve_forever()
    except KeyboardInterrupt:
        pass


if __name__ == "__main__":
    main()
