// Ghidra Java post-script v2. Decompiles every function whose name OR symbol
// contains the operator prefix (default "ckemv"). Walks BOTH FunctionManager
// and SymbolTable, creating Function objects on demand for LOCAL .symtab
// entries that Ghidra's auto-analysis did not promote.
//
// Env vars:
//   GHIDRA_OUT     output directory (default /out)
//   GHIDRA_FILTER  substring filter on function/symbol name (default "ckemv")
//
// @category CKEMV

import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.DecompInterface;
import ghidra.app.decompiler.DecompileOptions;
import ghidra.app.decompiler.DecompileResults;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionManager;
import ghidra.program.model.symbol.Symbol;
import ghidra.program.model.symbol.SymbolTable;
import ghidra.program.model.symbol.SymbolIterator;
import ghidra.util.task.ConsoleTaskMonitor;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class decompile_operator extends GhidraScript {

    @Override
    public void run() throws Exception {
        String outDir = System.getenv("GHIDRA_OUT");
        if (outDir == null) outDir = "/out";
        String filter = System.getenv("GHIDRA_FILTER");
        if (filter == null) filter = "ckemv";

        new File(outDir).mkdirs();
        println("[+] outDir=" + outDir + " filter=" + filter);

        DecompInterface decompiler = new DecompInterface();
        DecompileOptions options = new DecompileOptions();
        decompiler.setOptions(options);
        decompiler.toggleCCode(true);
        decompiler.toggleSyntaxTree(true);
        if (!decompiler.openProgram(currentProgram)) {
            println("[!] failed to open program in decompiler");
            return;
        }

        ConsoleTaskMonitor monitor = new ConsoleTaskMonitor();
        FunctionManager fm = currentProgram.getFunctionManager();
        SymbolTable st = currentProgram.getSymbolTable();

        // Collect (address, name) pairs we want to decompile, dedup by address.
        // Sources: FunctionManager.getFunctions(true) + SymbolTable.getDefinedSymbols()
        LinkedHashMap<Long, String> targets = new LinkedHashMap<>();
        int nFnTotal = 0, nFnMatched = 0;
        for (Function fn : fm.getFunctions(true)) {
            nFnTotal++;
            String n = fn.getName();
            if (!n.contains(filter)) continue;
            nFnMatched++;
            targets.put(fn.getEntryPoint().getOffset(), n);
        }
        println(String.format("[+] FunctionManager: total=%d, matched=%d", nFnTotal, nFnMatched));

        int nSymTotal = 0, nSymMatched = 0;
        SymbolIterator si = st.getDefinedSymbols();
        while (si.hasNext()) {
            Symbol s = si.next();
            nSymTotal++;
            String n = s.getName();
            if (!n.contains(filter)) continue;
            // Skip non-function symbols like LABEL/DATA
            if (s.getSymbolType().toString().toLowerCase().contains("data")) continue;
            Address addr = s.getAddress();
            if (addr == null) continue;
            long off = addr.getOffset();
            if (!targets.containsKey(off)) {
                nSymMatched++;
                targets.put(off, n);
            }
        }
        println(String.format("[+] SymbolTable: total=%d, additional matched=%d", nSymTotal, nSymMatched));
        println(String.format("[+] unique targets to decompile: %d", targets.size()));

        StringBuilder indexJson = new StringBuilder();
        indexJson.append("[\n");
        boolean first = true;
        int nOk = 0, nCreated = 0, nFailed = 0;

        for (Map.Entry<Long, String> e : targets.entrySet()) {
            long off = e.getKey();
            String name = e.getValue();
            Address addr = currentProgram.getAddressFactory().getDefaultAddressSpace().getAddress(off);
            Function fn = fm.getFunctionAt(addr);
            if (fn == null) {
                try {
                    fn = createFunction(addr, name);
                    if (fn != null) nCreated++;
                } catch (Exception ex) {
                    println("[!] createFunction failed for " + name + " @ 0x" + Long.toHexString(off) + ": " + ex);
                }
            }
            if (fn == null) {
                nFailed++;
                continue;
            }
            try {
                DecompileResults res = decompiler.decompileFunction(fn, 90, monitor);
                if (res == null || !res.decompileCompleted()) {
                    println("[!] decompile failed: " + name);
                    nFailed++;
                    continue;
                }
                String csrc = res.getDecompiledFunction().getC();
                String sig = res.getDecompiledFunction().getSignature();
                long size = fn.getBody().getNumAddresses();

                Set<String> callees = new TreeSet<>();
                for (Function c : fn.getCalledFunctions(monitor)) callees.add(c.getName());
                Set<String> callers = new TreeSet<>();
                for (Function c : fn.getCallingFunctions(monitor)) callers.add(c.getName());

                String safeName = name.replaceAll("[^A-Za-z0-9_.\\-]", "_");
                if (safeName.length() > 180) safeName = safeName.substring(0, 180);
                String fname = String.format("%s_%08x.c", safeName, off);
                File f = new File(outDir, fname);
                try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
                    pw.println("// " + name);
                    pw.println("// offset: 0x" + Long.toHexString(off) + "   size: " + size + " bytes");
                    pw.println("// signature: " + sig);
                    pw.println("// callees (" + callees.size() + "):");
                    for (String c : callees) pw.println("//   " + c);
                    pw.println("// callers (" + callers.size() + "):");
                    for (String c : callers) pw.println("//   " + c);
                    pw.println();
                    pw.println(csrc);
                }
                if (!first) indexJson.append(",\n");
                first = false;
                indexJson.append("  {\"name\":").append(jstr(name))
                        .append(", \"offset\": \"0x").append(Long.toHexString(off))
                        .append("\", \"size\": ").append(size)
                        .append(", \"file\": ").append(jstr(fname))
                        .append(", \"signature\": ").append(jstr(sig))
                        .append(", \"callees\": ").append(jarr(callees))
                        .append(", \"callers\": ").append(jarr(callers))
                        .append("}");
                nOk++;
                println("[+] " + name);
            } catch (Exception ex) {
                println("[!] exception on " + name + ": " + ex);
                nFailed++;
            }
        }
        indexJson.append("\n]\n");
        try (PrintWriter pw = new PrintWriter(new FileWriter(new File(outDir, "index.json")))) {
            pw.println(indexJson.toString());
        }
        println(String.format("[+] DONE. decompiled=%d, created_fns=%d, failed=%d", nOk, nCreated, nFailed));
    }

    private static String jstr(String s) {
        if (s == null) return "null";
        StringBuilder sb = new StringBuilder("\"");
        for (char c : s.toCharArray()) {
            if (c == '"') sb.append("\\\"");
            else if (c == '\\') sb.append("\\\\");
            else if (c == '\n') sb.append("\\n");
            else if (c == '\r') sb.append("\\r");
            else if (c == '\t') sb.append("\\t");
            else if (c < 0x20) sb.append(String.format("\\u%04x", (int) c));
            else sb.append(c);
        }
        sb.append("\"");
        return sb.toString();
    }

    private static String jarr(Set<String> set) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;
        for (String s : set) {
            if (!first) sb.append(", ");
            first = false;
            sb.append(jstr(s));
        }
        sb.append("]");
        return sb.toString();
    }
}
