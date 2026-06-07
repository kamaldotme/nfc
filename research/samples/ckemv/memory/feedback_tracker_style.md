---
name: Persistent tracker + memory for long research sessions
description: For multi-phase research, maintain a live tracker file + append-only log + memory entries so a future session resumes seamlessly
type: feedback
originSessionId: 61ec3028-602d-486d-800c-a4a9cfa6a4be
---
For multi-phase research tasks in this project, maintain three persistence layers:

1. **`samples/ckemv/apk_analysis/RESEARCH_TRACKER.md`** — checklist organized by phase; mark `[~]` when starting an item and `[x]` when done. Tracker is the single source of truth for "what's next".
2. **`samples/ckemv/apk_analysis/RESEARCH_LOG.md`** — append-only log of every concrete step, observation, dead end. Newest entries at the bottom under a dated heading.
3. **Memory entries under `memory/`** — durable cross-session facts (project context, user role, key constraints).

**Why:** User explicitly asked (2026-05-16) for resumability — "if this session lost it should start from where u left the research". Long static-analysis sessions on a 1M-context model can still be terminated; the disk-based tracker survives.

**How to apply:**
- On task start: claim the tracker item with `[~]`, mark TaskUpdate in_progress, write a 1-line plan to the log.
- During work: keep tooling output in the log (commands run, paths, key strings observed) so a successor can re-derive the same findings.
- On task end: flip `[~]` → `[x]`, write a 1–3 line "what I found" entry to the log, save/update any project memory that captures non-obvious findings.
- Don't update the tracker for trivial sub-steps; one checkbox per phase item is enough.
