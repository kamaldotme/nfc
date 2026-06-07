#!/usr/bin/env python3
"""
Local C2 mock for CKEMV harvester dynamic analysis.

Impersonates https://tqqemv.xyz so the malware completes its full lifecycle
against an analyst-controlled endpoint that NEVER forwards anything to the real
operator. Endpoints reconstructed from the deobfuscated source:

  GET  /me          (Reporter.fetchCves)        -> MeResponse JSON
  POST /harvest     (Reporter.uploadHarvestData)-> body containing "Success"
  GET  /report      (Reporter.fetchReport)      -> JSON (no Java caller; included for completeness)
  POST /update_apk  (MainActivity OkHttp)       -> {"api_key":...} in, update info out

Every request (method, path, headers incl. Authorization, raw body) is appended
to captures/local_c2_access.log AND echoed to stdout, so this doubles as the
Phase E capture mechanism for the request side of the wire protocol.

Auth: callers send `Authorization: Bearer <apiKey>`. We log it but accept all.

Run:  python local_c2/server.py --port 8080
Device reaches the host loopback at 10.0.2.2, so point baseUrl at
http://10.0.2.2:8080 (via the capture_c2.js baseUrl rewrite, or directly).
"""
import argparse
import datetime as dt
import json
import os
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer

ACCESS_LOG = os.path.join(os.path.dirname(__file__), "..", "captures", "local_c2_access.log")

# --- canned scenario set returned by GET /me -------------------------------
# One Visa + one Mastercard scenario so a tapped card of either scheme finds an
# applicable CveConfig. mastercard_tags / visa_tags are EMV tag(hex)->value(hex)
# overlays applied to the terminal side of GENERATE AC. Values below are benign
# placeholders for analysis (amount/currency/country/terminal-capabilities).
ME_RESPONSE = {
    "name": "analyst-mock",
    "cves": [
        {
            "id": 1,
            "name": "visa-baseline",
            "amount": 5000,
            "mastercard_tags": {},
            "visa_tags": {
                "9F02": "000000005000",  # amount, authorised
                "5F2A": "0840",          # txn currency (USD)
                "9F1A": "0840",          # terminal country (US)
                "9F35": "22",            # terminal type
                "9F33": "E0F8C8",        # terminal capabilities
                "9C":   "00",            # txn type (purchase)
            },
        },
        {
            "id": 2,
            "name": "mc-baseline",
            "amount": 5000,
            "mastercard_tags": {
                "9F02": "000000005000",
                "5F2A": "0840",
                "9F1A": "0840",
                "9F35": "22",
                "9F33": "E0F8C8",
                "9C":   "00",
            },
            "visa_tags": {},
        },
    ],
    # null = no self-update advertised. Set {"major":1,"minor":8,"hash":"..."}
    # to exercise the self-updater / ApkSideloader path.
    "latest_version": None,
}


def _log(entry: dict):
    line = json.dumps(entry, ensure_ascii=False)
    print(line, flush=True)
    os.makedirs(os.path.dirname(ACCESS_LOG), exist_ok=True)
    with open(ACCESS_LOG, "a") as f:
        f.write(line + "\n")


class Handler(BaseHTTPRequestHandler):
    server_version = "nginx"           # cosmetic; mimic a generic operator stack
    sys_version = ""

    def _capture(self, body: bytes):
        _log({
            "ts": dt.datetime.now().isoformat(timespec="milliseconds"),
            "method": self.command,
            "path": self.path,
            "headers": {k: v for k, v in self.headers.items()},
            "authorization": self.headers.get("Authorization"),
            "content_type": self.headers.get("Content-Type"),
            "body_len": len(body),
            "body": body.decode("utf-8", "replace"),
        })

    def _send(self, code: int, payload, content_type="application/json"):
        if isinstance(payload, (dict, list)):
            data = json.dumps(payload).encode()
        elif isinstance(payload, str):
            data = payload.encode()
        else:
            data = payload
        self.send_response(code)
        self.send_header("Content-Type", content_type)
        self.send_header("Content-Length", str(len(data)))
        self.end_headers()
        self.wfile.write(data)

    def _read_body(self) -> bytes:
        n = int(self.headers.get("Content-Length", 0) or 0)
        return self.rfile.read(n) if n else b""

    # GET /me, GET /report
    def do_GET(self):
        body = self._read_body()
        self._capture(body)
        path = self.path.split("?", 1)[0]
        if path == "/me":
            self._send(200, ME_RESPONSE)
        elif path == "/report":
            self._send(200, {"status": "ok", "note": "mock /report (no Java caller)"})
        else:
            self._send(404, {"error": "not found", "path": path})

    # POST /harvest, POST /update_apk
    def do_POST(self):
        body = self._read_body()
        self._capture(body)
        path = self.path.split("?", 1)[0]
        if path == "/harvest":
            # Callers only check for the substring "Success".
            self._send(200, {"result": "Success", "stored": True}, "application/json")
        elif path == "/update_apk":
            # Java OkHttp posts {"api_key":...}. Returning no real APK keeps the
            # sideloader inert; structure here is a placeholder.
            self._send(200, {"result": "Success", "update": False})
        else:
            self._send(404, {"error": "not found", "path": path})

    def log_message(self, *a):  # silence default stderr logging; we log ourselves
        pass


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--port", type=int, default=8080)
    ap.add_argument("--host", default="0.0.0.0")
    args = ap.parse_args()
    httpd = ThreadingHTTPServer((args.host, args.port), Handler)
    print(f"[local_c2] listening on {args.host}:{args.port} "
          f"(device reaches it at http://10.0.2.2:{args.port}) — logging to {ACCESS_LOG}",
          flush=True)
    try:
        httpd.serve_forever()
    except KeyboardInterrupt:
        pass


if __name__ == "__main__":
    main()
