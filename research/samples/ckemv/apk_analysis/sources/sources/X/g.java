package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final U0.e f1002a = new U0.e(11);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1003b = {112, 114, 111, 0};
    public static final byte[] c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1004d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1005e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1006f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1007i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1008j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i3 = 0;
        for (c cVar : cVarArr) {
            i3 += ((((cVar.g * 2) + 7) & (-8)) / 8) + (cVar.f998e * 2) + d(cVar.f995a, cVar.f996b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f999f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f1006f)) {
            for (c cVar2 : cVarArr) {
                q(byteArrayOutputStream, cVar2, d(cVar2.f995a, cVar2.f996b, bArr));
                s(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.h;
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    v(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                r(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f995a, cVar3.f996b, bArr));
            }
            for (c cVar4 : cVarArr) {
                s(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.h;
                int length2 = iArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2) {
                    int i9 = iArr2[i7];
                    v(byteArrayOutputStream, i9 - i8);
                    i7++;
                    i8 = i9;
                }
                r(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : listFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return d.j(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static int e(int i3, int i4, int i5) {
        if (i3 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i3 == 2) {
            return i4;
        }
        if (i3 == 4) {
            return i4 + i5;
        }
        throw new IllegalStateException(d.f("Unexpected flag: ", i3));
    }

    public static void f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] g(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int read = inputStream.read(bArr, i4, i3 - i4);
            if (read < 0) {
                throw new IllegalStateException(d.f("Not enough bytes to read: ", i3));
            }
            i4 += read;
        }
        return bArr;
    }

    public static int[] h(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += (int) n(byteArrayInputStream, 2);
            iArr[i5] = i4;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] i(FileInputStream fileInputStream, int i3, int i4) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[2048];
            int i5 = 0;
            int i6 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i5 < i3) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i6 += inflater.inflate(bArr, i6, i4 - i6);
                    i5 += read;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i5);
        } finally {
            inflater.end();
        }
    }

    public static c[] j(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f1007i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1008j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int n3 = (int) n(fileInputStream, 2);
            byte[] i3 = i(fileInputStream, (int) n(fileInputStream, 4), (int) n(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i3);
            try {
                c[] l3 = l(byteArrayInputStream, bArr2, n3, cVarArr);
                byteArrayInputStream.close();
                return l3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f1004d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int n4 = (int) n(fileInputStream, 1);
        byte[] i4 = i(fileInputStream, (int) n(fileInputStream, 4), (int) n(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(i4);
        try {
            c[] k2 = k(byteArrayInputStream2, n4, cVarArr);
            byteArrayInputStream2.close();
            return k2;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, int i3, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int n3 = (int) n(byteArrayInputStream, 2);
            iArr[i4] = (int) n(byteArrayInputStream, 2);
            strArr[i4] = new String(g(byteArrayInputStream, n3), StandardCharsets.UTF_8);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            c cVar = cVarArr[i5];
            if (!cVar.f996b.equals(strArr[i5])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            cVar.f998e = i6;
            cVar.h = h(byteArrayInputStream, i6);
        }
        return cVarArr;
    }

    public static c[] l(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            n(byteArrayInputStream, 2);
            String str = new String(g(byteArrayInputStream, (int) n(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long n3 = n(byteArrayInputStream, 4);
            int n4 = (int) n(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i5 = 0;
                while (true) {
                    if (i5 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i5].f996b.equals(substring)) {
                        cVar = cVarArr[i5];
                        break;
                    }
                    i5++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f997d = n3;
            int[] h3 = h(byteArrayInputStream, n4);
            if (Arrays.equals(bArr, h)) {
                cVar.f998e = n4;
                cVar.h = h3;
            }
        }
        return cVarArr;
    }

    public static c[] m(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f1005e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int n3 = (int) n(fileInputStream, 1);
        byte[] i3 = i(fileInputStream, (int) n(fileInputStream, 4), (int) n(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i3);
        try {
            c[] o3 = o(byteArrayInputStream, str, n3);
            byteArrayInputStream.close();
            return o3;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long n(InputStream inputStream, int i3) {
        byte[] g3 = g(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += (g3[i4] & 255) << (i4 * 8);
        }
        return j3;
    }

    public static c[] o(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int n3 = (int) n(byteArrayInputStream, 2);
            int n4 = (int) n(byteArrayInputStream, 2);
            cVarArr[i4] = new c(str, new String(g(byteArrayInputStream, n3), StandardCharsets.UTF_8), n(byteArrayInputStream, 4), n4, (int) n(byteArrayInputStream, 4), (int) n(byteArrayInputStream, 4), new int[n4], new TreeMap());
        }
        for (int i5 = 0; i5 < i3; i5++) {
            c cVar = cVarArr[i5];
            int available = byteArrayInputStream.available() - cVar.f999f;
            int i6 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.f1000i;
                if (available2 <= available) {
                    break;
                }
                i6 += (int) n(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i6), 1);
                for (int n5 = (int) n(byteArrayInputStream, 2); n5 > 0; n5--) {
                    n(byteArrayInputStream, 2);
                    int n6 = (int) n(byteArrayInputStream, 1);
                    if (n6 != 6 && n6 != 7) {
                        while (n6 > 0) {
                            n(byteArrayInputStream, 1);
                            for (int n7 = (int) n(byteArrayInputStream, 1); n7 > 0; n7--) {
                                n(byteArrayInputStream, 2);
                            }
                            n6--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.h = h(byteArrayInputStream, cVar.f998e);
            int i7 = cVar.g;
            BitSet valueOf = BitSet.valueOf(g(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = valueOf.get(e(2, i8, i7)) ? 2 : 0;
                if (valueOf.get(e(4, i8, i7))) {
                    i9 |= 4;
                }
                if (i9 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i8));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i8), Integer.valueOf(i9 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean p(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1004d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1005e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b3 = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                u(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f1000i.size() * 4;
                    String d3 = d(cVar.f995a, cVar.f996b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d3.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.c, 4);
                    byteArrayOutputStream.write(d3.getBytes(charset));
                    Iterator it = cVar.f1000i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i4 : cVar.h) {
                        v(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1006f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b4 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b4.length, 4);
                byte[] a4 = a(b4);
                u(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr6 = h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String d4 = d(cVar2.f995a, cVar2.f996b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d4.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f1000i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.h.length);
                u(byteArrayOutputStream, cVar2.c, 4);
                byteArrayOutputStream.write(d4.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : cVar2.h) {
                    v(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.c, 4);
                u(byteArrayOutputStream2, cVar3.f997d, 4);
                u(byteArrayOutputStream2, cVar3.g, 4);
                String d5 = d(cVar3.f995a, cVar3.f996b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d5.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(d5.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            o oVar = new o(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(oVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i8];
                    v(byteArrayOutputStream3, i8);
                    v(byteArrayOutputStream3, cVar4.f998e);
                    i9 = i9 + 4 + (cVar4.f998e * 2);
                    int[] iArr = cVar4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        v(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            o oVar2 = new o(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(oVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i12];
                    Iterator it3 = cVar5.f1000i.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i12);
                            int length4 = byteArray3.length + i6 + byteArray4.length;
                            int i15 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i14);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i15 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                            i6 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            o oVar3 = new o(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(oVar3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            int i16 = 4;
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                o oVar4 = (o) arrayList2.get(i17);
                u(byteArrayOutputStream, d.e(oVar4.f1016a), i16);
                u(byteArrayOutputStream, size2, i16);
                boolean z3 = oVar4.c;
                byte[] bArr7 = oVar4.f1017b;
                if (z3) {
                    long length5 = bArr7.length;
                    byte[] a5 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a5);
                    u(byteArrayOutputStream, a5.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                arrayList5 = arrayList;
                i16 = 4;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f998e);
        u(byteArrayOutputStream, cVar.f999f, 4);
        u(byteArrayOutputStream, cVar.c, 4);
        u(byteArrayOutputStream, cVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        byte[] bArr = new byte[(((cVar.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f1000i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = intValue2 & 2;
            int i4 = cVar.g;
            if (i3 != 0) {
                int e3 = e(2, intValue, i4);
                int i5 = e3 / 8;
                bArr[i5] = (byte) ((1 << (e3 % 8)) | bArr[i5]);
            }
            if ((intValue2 & 4) != 0) {
                int e4 = e(4, intValue, i4);
                int i6 = e4 / 8;
                bArr[i6] = (byte) ((1 << (e4 % 8)) | bArr[i6]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i3 = 0;
        for (Map.Entry entry : cVar.f1000i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i3);
                v(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0137. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191 A[FALL_THROUGH, PHI: r11
  0x0191: PHI (r11v2 X.b) = (r11v1 X.b), (r11v1 X.b), (r11v1 X.b), (r11v1 X.b), (r11v4 X.b) binds: [B:52:0x012e, B:54:0x0134, B:55:0x0137, B:62:0x018e, B:63:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0199  */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, f fVar, boolean z3) {
        FileInputStream fileInputStream;
        IOException iOException;
        int i3;
        c[] cVarArr;
        c[] cVarArr2;
        c[] cVarArr3;
        byte[] bArr;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ?? r4;
        ?? byteArrayOutputStream;
        int i4;
        b bVar;
        FileInputStream a3;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z3) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            boolean z8 = readLong == packageInfo.lastUpdateTime;
                            if (z8) {
                                fVar.m(2, null);
                            }
                            if (z8) {
                                context.getPackageName();
                                n.c(context, false);
                                return;
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            context.getPackageName();
            int i5 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, fVar, name, file2);
            byte[] bArr2 = bVar2.c;
            if (bArr2 == null) {
                bVar2.b(3, Integer.valueOf(i5));
            } else if (file2.canWrite()) {
                bVar2.f994f = true;
                ?? r42 = f1003b;
                try {
                    try {
                        fileInputStream = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e3) {
                        fVar.m(6, e3);
                        fileInputStream = null;
                        if (fileInputStream != null) {
                        }
                        cVarArr2 = bVar2.g;
                        if (cVarArr2 != null) {
                        }
                        f fVar2 = bVar2.f991b;
                        cVarArr3 = bVar2.g;
                        boolean z9 = r42;
                        if (cVarArr3 != null) {
                        }
                        bArr = bVar2.h;
                        if (bArr != null) {
                        }
                        if (z5) {
                        }
                        if (z5) {
                        }
                        z7 = false;
                        n.c(context, z7);
                    } catch (IOException e4) {
                        fVar.m(7, e4);
                        fileInputStream = null;
                        if (fileInputStream != null) {
                        }
                        cVarArr2 = bVar2.g;
                        if (cVarArr2 != null) {
                        }
                        f fVar22 = bVar2.f991b;
                        cVarArr3 = bVar2.g;
                        boolean z92 = r42;
                        if (cVarArr3 != null) {
                        }
                        bArr = bVar2.h;
                        if (bArr != null) {
                        }
                        if (z5) {
                        }
                        if (z5) {
                        }
                        z7 = false;
                        n.c(context, z7);
                    }
                    if (fileInputStream != null) {
                        try {
                        } catch (IOException e5) {
                            i3 = 7;
                            fVar.m(7, e5);
                            try {
                                fileInputStream.close();
                            } catch (IOException e6) {
                                iOException = e6;
                                fVar.m(i3, iOException);
                                cVarArr = null;
                                bVar2.g = cVarArr;
                                cVarArr2 = bVar2.g;
                                if (cVarArr2 != null) {
                                }
                                f fVar222 = bVar2.f991b;
                                cVarArr3 = bVar2.g;
                                boolean z922 = r42;
                                if (cVarArr3 != null) {
                                }
                                bArr = bVar2.h;
                                if (bArr != null) {
                                }
                                if (z5) {
                                }
                                if (z5) {
                                }
                                z7 = false;
                                n.c(context, z7);
                            }
                            cVarArr = null;
                            bVar2.g = cVarArr;
                            cVarArr2 = bVar2.g;
                            if (cVarArr2 != null) {
                            }
                            f fVar2222 = bVar2.f991b;
                            cVarArr3 = bVar2.g;
                            boolean z9222 = r42;
                            if (cVarArr3 != null) {
                            }
                            bArr = bVar2.h;
                            if (bArr != null) {
                            }
                            if (z5) {
                            }
                            if (z5) {
                            }
                            z7 = false;
                            n.c(context, z7);
                        } catch (IllegalStateException e7) {
                            try {
                                fVar.m(8, e7);
                                try {
                                    fileInputStream.close();
                                } catch (IOException e8) {
                                    iOException = e8;
                                    i3 = 7;
                                    fVar.m(i3, iOException);
                                    cVarArr = null;
                                    bVar2.g = cVarArr;
                                    cVarArr2 = bVar2.g;
                                    if (cVarArr2 != null) {
                                        switch (i4) {
                                        }
                                    }
                                    f fVar22222 = bVar2.f991b;
                                    cVarArr3 = bVar2.g;
                                    boolean z92222 = r42;
                                    if (cVarArr3 != null) {
                                    }
                                    bArr = bVar2.h;
                                    if (bArr != null) {
                                    }
                                    if (z5) {
                                    }
                                    if (z5) {
                                    }
                                    z7 = false;
                                    n.c(context, z7);
                                }
                                cVarArr = null;
                                bVar2.g = cVarArr;
                                cVarArr2 = bVar2.g;
                                if (cVarArr2 != null) {
                                }
                                f fVar222222 = bVar2.f991b;
                                cVarArr3 = bVar2.g;
                                boolean z922222 = r42;
                                if (cVarArr3 != null) {
                                }
                                bArr = bVar2.h;
                                if (bArr != null) {
                                }
                                if (z5) {
                                }
                                if (z5) {
                                }
                                z7 = false;
                                n.c(context, z7);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    fileInputStream.close();
                                    throw th2;
                                } catch (IOException e9) {
                                    fVar.m(7, e9);
                                    throw th2;
                                }
                            }
                        }
                        if (!Arrays.equals((byte[]) r42, g(fileInputStream, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        cVarArr = m(fileInputStream, g(fileInputStream, 4), bVar2.f993e);
                        try {
                            fileInputStream.close();
                        } catch (IOException e10) {
                            fVar.m(7, e10);
                        }
                        bVar2.g = cVarArr;
                    }
                    cVarArr2 = bVar2.g;
                    if (cVarArr2 != null && (i4 = Build.VERSION.SDK_INT) <= 33) {
                        switch (i4) {
                            case 31:
                            case 32:
                            case 33:
                                try {
                                    a3 = bVar2.a(assets, "dexopt/baseline.profm");
                                } catch (FileNotFoundException e11) {
                                    fVar.m(9, e11);
                                } catch (IOException e12) {
                                    fVar.m(7, e12);
                                } catch (IllegalStateException e13) {
                                    bVar2.g = null;
                                    fVar.m(8, e13);
                                }
                                if (a3 != null) {
                                    try {
                                        if (!Arrays.equals(c, g(a3, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        bVar2.g = j(a3, g(a3, 4), bArr2, cVarArr2);
                                        a3.close();
                                        bVar = bVar2;
                                        if (bVar != null) {
                                            bVar2 = bVar;
                                        }
                                    } finally {
                                    }
                                } else {
                                    if (a3 != null) {
                                        a3.close();
                                    }
                                    bVar = null;
                                    if (bVar != null) {
                                    }
                                }
                            default:
                                f fVar2222222 = bVar2.f991b;
                                cVarArr3 = bVar2.g;
                                boolean z9222222 = r42;
                                if (cVarArr3 != null) {
                                    byte[] bArr3 = bVar2.c;
                                    z9222222 = r42;
                                    if (bArr3 != null) {
                                        if (!bVar2.f994f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(r42);
                                                byteArrayOutputStream.write(bArr3);
                                            } finally {
                                            }
                                        } catch (IOException e14) {
                                            r4 = 7;
                                            fVar2222222.m(7, e14);
                                        } catch (IllegalStateException e15) {
                                            fVar2222222.m(8, e15);
                                            r4 = r42;
                                        }
                                        if (p(byteArrayOutputStream, bArr3, cVarArr3)) {
                                            bVar2.h = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            r4 = r42;
                                            bVar2.g = null;
                                            z9222222 = r4;
                                        } else {
                                            fVar2222222.m(5, null);
                                            bVar2.g = null;
                                            byteArrayOutputStream.close();
                                            z9222222 = r42;
                                        }
                                    }
                                }
                                bArr = bVar2.h;
                                if (bArr != null) {
                                    z5 = false;
                                    z6 = true;
                                } else {
                                    try {
                                        if (!bVar2.f994f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(bVar2.f992d);
                                                    try {
                                                        try {
                                                            byte[] bArr4 = new byte[512];
                                                            while (true) {
                                                                int read = byteArrayInputStream.read(bArr4);
                                                                if (read > 0) {
                                                                    fileOutputStream.write(bArr4, 0, read);
                                                                } else {
                                                                    z6 = true;
                                                                    try {
                                                                        bVar2.b(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        bVar2.h = null;
                                                                        bVar2.g = null;
                                                                        z5 = true;
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        Throwable th4 = th;
                                                                        try {
                                                                            fileOutputStream.close();
                                                                            throw th4;
                                                                        } catch (Throwable th5) {
                                                                            th4.addSuppressed(th5);
                                                                            throw th4;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            Throwable th7 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th7;
                                                            } catch (Throwable th8) {
                                                                th7.addSuppressed(th8);
                                                                throw th7;
                                                            }
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                }
                                            } catch (FileNotFoundException e16) {
                                                e = e16;
                                                bVar2.b(6, e);
                                                z4 = z9222222;
                                                z5 = false;
                                                z6 = z4;
                                                if (z5) {
                                                }
                                                if (z5) {
                                                }
                                                z7 = false;
                                                n.c(context, z7);
                                            } catch (IOException e17) {
                                                e = e17;
                                                bVar2.b(7, e);
                                                z4 = z9222222;
                                                z5 = false;
                                                z6 = z4;
                                                if (z5) {
                                                }
                                                if (z5) {
                                                }
                                                z7 = false;
                                                n.c(context, z7);
                                            }
                                        } catch (FileNotFoundException e18) {
                                            e = e18;
                                            z9222222 = true;
                                            bVar2.b(6, e);
                                            z4 = z9222222;
                                            z5 = false;
                                            z6 = z4;
                                            if (z5) {
                                            }
                                            if (z5) {
                                            }
                                            z7 = false;
                                            n.c(context, z7);
                                        } catch (IOException e19) {
                                            e = e19;
                                            z9222222 = true;
                                            bVar2.b(7, e);
                                            z4 = z9222222;
                                            z5 = false;
                                            z6 = z4;
                                            if (z5) {
                                            }
                                            if (z5) {
                                            }
                                            z7 = false;
                                            n.c(context, z7);
                                        }
                                    } finally {
                                        bVar2.h = null;
                                        bVar2.g = null;
                                    }
                                }
                                if (z5) {
                                    f(packageInfo, filesDir);
                                }
                                if (z5 && z3) {
                                    z7 = z6;
                                    n.c(context, z7);
                                }
                        }
                    }
                    f fVar22222222 = bVar2.f991b;
                    cVarArr3 = bVar2.g;
                    boolean z92222222 = r42;
                    if (cVarArr3 != null) {
                    }
                    bArr = bVar2.h;
                    if (bArr != null) {
                    }
                    if (z5) {
                    }
                    if (z5) {
                        z7 = z6;
                        n.c(context, z7);
                    }
                } catch (Throwable th11) {
                    th = th11;
                }
            } else {
                bVar2.b(4, null);
            }
            z7 = false;
            n.c(context, z7);
        } catch (PackageManager.NameNotFoundException e20) {
            fVar.m(7, e20);
            n.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((j3 >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        u(byteArrayOutputStream, i3, 2);
    }
}
