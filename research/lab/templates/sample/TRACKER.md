# <SAMPLE> — Analysis Tracker (Source of Truth)

**Read first on every resume.** If anything (memory, logs, code) disagrees with
this file, trust this file and reconcile. Disk is the source of truth, not chat
memory.

## Instance
See `INSTANCE.env` (package, AVD clone, serial/port, APK sha256, CA hash).

## Status

| Phase | Goal | Status | Output |
|-------|------|--------|--------|
| Triage | manifest, perms, components, package, signing | pending | reports/00_TRIAGE.md |
| Static | decompile (jadx), native libs, strings, threat model | pending | decompiled/, native/, reports/ |
| Dynamic setup | clone booted, frida up, CA trusted, APK installed | pending | INSTANCE.env |
| Capture | runtime behavior, network, JNI, persistence | pending | captures/ |
| Protocol RE | decode any C2 / network protocol | pending | reports/PROTOCOL.md |
| Mock + e2e | local mock; app completes lifecycle offline | pending | (lab/mock) |
| Report | findings, IOCs, detection, MITRE ATT&CK | pending | reports/REPORT.md |

## Last action
-

## Current blockers
-

## Next action
-

## Invariants
- No real C2 / live operator traffic. Sinkhole the C2 host on-device and/or
  rewrite to the local mock. The real infrastructure must never see a successful
  request from this instance.
- Malware confined to this AVD clone. Delete the clone when done; the golden
  base is never contaminated.
- All findings -> this workspace on disk. Memory holds pointers only.
