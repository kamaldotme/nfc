# Ghidra Jython post-script.
# Decompiles every function whose name contains the operator prefix (ckemv_)
# and writes one .c file per function plus an index JSON.
#
# Invoked by blacktop/ghidra entrypoint which passes the binary and this script.
# Env var GHIDRA_OUT controls the output directory.
# Env var GHIDRA_FILTER controls the substring to filter on (default "ckemv").

# @category CKEMV

import os
import json
import re

from ghidra.app.decompiler import DecompInterface, DecompileOptions
from ghidra.util.task import ConsoleTaskMonitor


def safe_filename(name):
    return re.sub(r"[^A-Za-z0-9_.\-]", "_", name)[:200]


def main():
    out_dir = os.environ.get("GHIDRA_OUT", "/out/ghidra")
    flt = os.environ.get("GHIDRA_FILTER", "ckemv")
    try:
        os.makedirs(out_dir)
    except OSError:
        pass

    program = getCurrentProgram()
    if program is None:
        print("[!] no current program")
        return

    print("[+] Program: %s" % program.getName())

    decompiler = DecompInterface()
    options = DecompileOptions()
    decompiler.setOptions(options)
    decompiler.toggleCCode(True)
    decompiler.toggleSyntaxTree(True)
    decompiler.setSimplificationStyle("decompile")
    decompiler.openProgram(program)

    monitor = ConsoleTaskMonitor()
    fm = program.getFunctionManager()

    index = []
    n_total = 0
    n_op = 0

    for fn in fm.getFunctions(True):
        n_total += 1
        name = fn.getName()
        if flt not in name:
            continue
        n_op += 1
        try:
            res = decompiler.decompileFunction(fn, 60, monitor)
            if res is None or not res.decompileCompleted():
                print("[!] decompile failed: %s" % name)
                continue
            csrc = res.getDecompiledFunction().getC()
            sig = res.getDecompiledFunction().getSignature()
        except Exception as e:
            print("[!] exception on %s: %s" % (name, str(e)))
            continue

        addr = fn.getEntryPoint().getOffset()
        size = fn.getBody().getNumAddresses()

        # callees and callers
        callees = sorted({f.getName() for f in fn.getCalledFunctions(monitor)})
        callers = sorted({f.getName() for f in fn.getCallingFunctions(monitor)})

        fname = safe_filename("%s_%08x.c" % (name, addr))
        fpath = os.path.join(out_dir, fname)
        with open(fpath, "w") as f:
            f.write("// %s\n" % name)
            f.write("// offset: 0x%x   size: %d bytes\n" % (addr, size))
            f.write("// signature: %s\n" % sig)
            f.write("// callees (%d):\n" % len(callees))
            for c in callees:
                f.write("//   %s\n" % c)
            f.write("// callers (%d):\n" % len(callers))
            for c in callers:
                f.write("//   %s\n" % c)
            f.write("\n")
            f.write(csrc)

        index.append({
            "name": name,
            "offset": "0x%x" % addr,
            "size": size,
            "signature": sig,
            "file": fname,
            "callees": callees,
            "callers": callers,
        })
        print("[+] decompiled %s -> %s" % (name, fname))

    idx_path = os.path.join(out_dir, "index.json")
    with open(idx_path, "w") as f:
        json.dump(index, f, indent=2)

    print("[+] done. total fns=%d, matched filter=%d, out=%s" % (n_total, n_op, out_dir))


main()
