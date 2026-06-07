#!/usr/bin/env bash
# Copy the prior session's auto-memory snapshot into this Mac's Claude
# Code project memory directory. Optional — the memory files are also
# usable directly as project files (see CLAUDE_RESUME.md §5).

set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
SRC="$REPO_ROOT/memory"

if [ ! -d "$SRC" ]; then
    echo "FATAL: $SRC not found. Are you in the Research repo root?"
    exit 1
fi

# Claude Code derives the project memory dir from the project root path.
# Mac path format is the absolute path with '/' replaced by '-'.
# Example: /Users/alice/Prj/Research → -Users-alice-Prj-Research
PROJECT_KEY="$(echo "$REPO_ROOT" | sed 's|/|-|g')"
DEST="$HOME/.claude/projects/${PROJECT_KEY}/memory"

mkdir -p "$DEST"
cp -v "$SRC"/*.md "$DEST/"

echo
echo "Memory restored to: $DEST"
echo "Open Claude Code in $REPO_ROOT — it will auto-load these entries."
