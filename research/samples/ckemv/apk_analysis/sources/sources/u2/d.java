package u2;

import J.AbstractC0026z;
import L1.x;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import b2.InterfaceC0107b;
import g2.o;
import j1.C0238h;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.r;
import m0.z;
import n0.C0344a;
import n0.p;

/* loaded from: classes.dex */
public abstract class d {
    public static boolean A(Context context, int i3, boolean z3) {
        TypedValue z4 = z(context, i3);
        return (z4 == null || z4.type != 18) ? z3 : z4.data != 0;
    }

    public static TypedValue B(Context context, int i3, String str) {
        TypedValue z3 = z(context, i3);
        if (z3 != null) {
            return z3;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        r6 = r1 - 2;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
    
        if (r6 < 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        if (r8 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        r8 = (int) r5[r6];
        r11 = r6 + 1;
        r12 = (int) r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ad, code lost:
    
        if (r8 < (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
    
        if (r8 > r9) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        if (r12 < (-1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b3, code lost:
    
        if (r12 > r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        if (r8 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b7, code lost:
    
        r5[r6] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c4, code lost:
    
        if (r12 != (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        r5[r11] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c8, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d2, code lost:
    
        r6 = r6 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
    
        if (r12 != r15) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
    
        r5[r11] = r15 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bb, code lost:
    
        if (r8 != r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bd, code lost:
    
        r5[r6] = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c3, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d7, code lost:
    
        throw j1.C0238h.f3489d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d8, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d9, code lost:
    
        if (r6 >= r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e7, code lost:
    
        if (r17.b((int) r5[r6], (int) r5[r6 + 1]) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e9, code lost:
    
        r4.f(r6 / 2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ee, code lost:
    
        r6 = r6 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f3, code lost:
    
        throw j1.C0238h.f3489d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f4, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p1.b C(p1.b bVar, int i3, int i4, p1.f fVar) {
        if (i3 <= 0 || i4 <= 0) {
            throw C0238h.f3489d;
        }
        p1.b bVar2 = new p1.b(i3, i4);
        int i5 = i3 * 2;
        float[] fArr = new float[i5];
        int i6 = 0;
        loop0: while (i6 < i4) {
            float f3 = i6 + 0.5f;
            for (int i7 = 0; i7 < i5; i7 += 2) {
                fArr[i7] = (i7 / 2) + 0.5f;
                fArr[i7 + 1] = f3;
            }
            int i8 = i5 - 1;
            for (int i9 = 0; i9 < i8; i9 += 2) {
                float f4 = fArr[i9];
                int i10 = i9 + 1;
                float f5 = fArr[i10];
                float f6 = (fVar.f4348f * f5) + (fVar.c * f4) + fVar.f4349i;
                fArr[i9] = (((fVar.f4346d * f5) + (fVar.f4344a * f4)) + fVar.g) / f6;
                fArr[i10] = (((fVar.f4347e * f5) + (fVar.f4345b * f4)) + fVar.h) / f6;
            }
            int i11 = bVar.f4328b;
            boolean z3 = true;
            int i12 = 0;
            while (true) {
                int i13 = bVar.c;
                if (i12 >= i8 || !z3) {
                    break;
                }
                int i14 = (int) fArr[i12];
                int i15 = i12 + 1;
                int i16 = (int) fArr[i15];
                if (i14 < -1 || i14 > i11 || i16 < -1 || i16 > i13) {
                    break loop0;
                }
                if (i14 == -1) {
                    fArr[i12] = 0.0f;
                } else if (i14 == i11) {
                    fArr[i12] = i11 - 1;
                } else {
                    z3 = false;
                    if (i16 != -1) {
                        fArr[i15] = 0.0f;
                    } else if (i16 == i13) {
                        fArr[i15] = i13 - 1;
                    } else {
                        i12 += 2;
                    }
                    z3 = true;
                    i12 += 2;
                }
                z3 = true;
                if (i16 != -1) {
                }
                z3 = true;
                i12 += 2;
            }
            throw C0238h.f3489d;
        }
        return bVar2;
    }

    public static void F(EditorInfo editorInfo, CharSequence charSequence, int i3, int i4) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i4);
    }

    public static void G() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static g2.d a(int i3, int i4, int i5) {
        g2.d oVar;
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        if (i3 != -2) {
            if (i3 == -1) {
                if (i4 == 1) {
                    return new o(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i3 != 0) {
                return i3 != Integer.MAX_VALUE ? i4 == 1 ? new g2.d(i3, null) : new o(i3, i4, null) : new g2.d(Integer.MAX_VALUE, null);
            }
            oVar = i4 == 1 ? new g2.d(0, null) : new o(1, i4, null);
        } else if (i4 == 1) {
            g2.h.f3071a.getClass();
            oVar = new g2.d(g2.g.f3070b, null);
        } else {
            oVar = new o(1, i4, null);
        }
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [z2.f, z2.v, java.lang.Object] */
    public static void b(long j3, z2.f fVar, int i3, ArrayList arrayList, int i4, int i5, ArrayList arrayList2) {
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj;
        int i10 = i3;
        if (i4 >= i5) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i11 = i4; i11 < i5; i11++) {
            if (((z2.i) arrayList.get(i11)).c() < i10) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        z2.i iVar = (z2.i) arrayList.get(i4);
        z2.i iVar2 = (z2.i) arrayList.get(i5 - 1);
        int i12 = -1;
        if (i10 == iVar.c()) {
            int intValue = ((Number) arrayList2.get(i4)).intValue();
            int i13 = i4 + 1;
            z2.i iVar3 = (z2.i) arrayList.get(i13);
            i6 = i13;
            i7 = intValue;
            iVar = iVar3;
        } else {
            i6 = i4;
            i7 = -1;
        }
        if (iVar.f(i10) == iVar2.f(i10)) {
            int min = Math.min(iVar.c(), iVar2.c());
            int i14 = 0;
            for (int i15 = i10; i15 < min && iVar.f(i15) == iVar2.f(i15); i15++) {
                i14++;
            }
            long j4 = 4;
            long j5 = (fVar.c / j4) + j3 + 2 + i14 + 1;
            fVar.N(-i14);
            fVar.N(i7);
            int i16 = i14 + i10;
            while (i10 < i16) {
                fVar.N(iVar.f(i10) & 255);
                i10++;
            }
            if (i6 + 1 == i5) {
                if (i16 != ((z2.i) arrayList.get(i6)).c()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                fVar.N(((Number) arrayList2.get(i6)).intValue());
                return;
            } else {
                ?? obj2 = new Object();
                fVar.N(((int) ((obj2.c / j4) + j5)) * (-1));
                b(j5, obj2, i16, arrayList, i6, i5, arrayList2);
                fVar.K(obj2);
                return;
            }
        }
        int i17 = 1;
        for (int i18 = i6 + 1; i18 < i5; i18++) {
            if (((z2.i) arrayList.get(i18 - 1)).f(i10) != ((z2.i) arrayList.get(i18)).f(i10)) {
                i17++;
            }
        }
        long j6 = 4;
        long j7 = (fVar.c / j6) + j3 + 2 + (i17 * 2);
        fVar.N(i17);
        fVar.N(i7);
        for (int i19 = i6; i19 < i5; i19++) {
            byte f3 = ((z2.i) arrayList.get(i19)).f(i10);
            if (i19 == i6 || f3 != ((z2.i) arrayList.get(i19 - 1)).f(i10)) {
                fVar.N(f3 & 255);
            }
        }
        int i20 = i6;
        z2.f fVar2 = new Object();
        while (i20 < i5) {
            byte f4 = ((z2.i) arrayList.get(i20)).f(i10);
            int i21 = i20 + 1;
            int i22 = i21;
            while (true) {
                if (i22 >= i5) {
                    i8 = i5;
                    break;
                } else {
                    if (f4 != ((z2.i) arrayList.get(i22)).f(i10)) {
                        i8 = i22;
                        break;
                    }
                    i22++;
                }
            }
            if (i21 == i8 && i10 + 1 == ((z2.i) arrayList.get(i20)).c()) {
                fVar.N(((Number) arrayList2.get(i20)).intValue());
                i9 = i8;
                obj = fVar2;
            } else {
                fVar.N(((int) ((fVar2.c / j6) + j7)) * i12);
                i9 = i8;
                obj = fVar2;
                b(j7, fVar2, i10 + 1, arrayList, i20, i8, arrayList2);
            }
            fVar2 = obj;
            i20 = i9;
            i12 = -1;
        }
        fVar.K(fVar2);
    }

    public static void c(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(n2.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i3), str).toString());
            }
        }
    }

    public static void d(int i3, int i4, int i5) {
        if (i3 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
        }
        if (i3 <= i4) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i4);
    }

    public static void e(String str, String str2) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(n2.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i3), str2));
                sb.append(n2.b.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int g(int i3, int i4) {
        int i5 = i3 - i4;
        if (i5 > i4) {
            i5 = i4;
            i4 = i5;
        }
        int i6 = 1;
        int i7 = 1;
        while (i3 > i4) {
            i6 *= i3;
            if (i7 <= i5) {
                i6 /= i7;
                i7++;
            }
            i3--;
        }
        while (i7 <= i5) {
            i6 /= i7;
            i7++;
        }
        return i6;
    }

    public static boolean h(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
            try {
                boolean i4 = i(file, inputStream);
                f(inputStream);
                return i4;
            } catch (Throwable th) {
                th = th;
                f(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean i(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    f(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            f(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            f(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean j(String str, String str2) {
        X1.g.e(str, "current");
        if (X1.g.a(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i3 < str.length()) {
                    char charAt = str.charAt(i3);
                    int i6 = i5 + 1;
                    if (i5 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i4 - 1 == 0 && i5 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i4++;
                    }
                    i3++;
                    i5 = i6;
                } else if (i4 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return X1.g.a(d2.d.n0(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final v0.j k(v0.o oVar) {
        X1.g.e(oVar, "<this>");
        return new v0.j(oVar.f5091a, oVar.f5107t);
    }

    public static O1.g l(O1.g gVar, O1.h hVar) {
        X1.g.e(hVar, "key");
        if (X1.g.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final Class n(InterfaceC0107b interfaceC0107b) {
        X1.g.e(interfaceC0107b, "<this>");
        Class a3 = ((X1.c) interfaceC0107b).a();
        if (!a3.isPrimitive()) {
            return a3;
        }
        String name = a3.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a3 : Double.class;
            case 104431:
                return !name.equals("int") ? a3 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a3 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a3 : Character.class;
            case 3327612:
                return !name.equals("long") ? a3 : Long.class;
            case 3625364:
                return !name.equals("void") ? a3 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a3 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a3 : Float.class;
            case 109413500:
                return !name.equals("short") ? a3 : Short.class;
            default:
                return a3;
        }
    }

    public static int o(int[] iArr, int i3, boolean z3) {
        int[] iArr2 = iArr;
        int i4 = 0;
        for (int i5 : iArr2) {
            i4 += i5;
        }
        int length = iArr2.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = length - 1;
            if (i6 >= i9) {
                return i7;
            }
            int i10 = 1 << i6;
            i8 |= i10;
            int i11 = 1;
            while (i11 < iArr2[i6]) {
                int i12 = i4 - i11;
                int i13 = length - i6;
                int i14 = i13 - 2;
                int g = g(i12 - 1, i14);
                if (z3 && i8 == 0) {
                    int i15 = i13 - 1;
                    if (i12 - i15 >= i15) {
                        g -= g(i12 - i13, i14);
                    }
                }
                if (i13 - 1 > 1) {
                    int i16 = 0;
                    for (int i17 = i12 - i14; i17 > i3; i17--) {
                        i16 += g((i12 - i17) - 1, i13 - 3);
                    }
                    g -= (i9 - i6) * i16;
                } else if (i12 > i3) {
                    g--;
                }
                i7 += g;
                i11++;
                i8 &= ~i10;
                iArr2 = iArr;
            }
            i4 -= i11;
            i6++;
            iArr2 = iArr;
        }
    }

    public static File p(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static String q(String str, String str2) {
        X1.g.e(str, "tableName");
        X1.g.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    public static boolean r() {
        return e.f5031d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map, java.lang.Object] */
    public static final void s(Context context) {
        LinkedHashMap linkedHashMap;
        X1.g.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        X1.g.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            r a3 = r.a();
            String[] strArr = p.f4202a;
            a3.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            X1.g.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(C0344a.f4164a.a(context), "androidx.work.workdb");
            String[] strArr2 = p.f4202a;
            int O2 = x.O(strArr2.length);
            if (O2 < 16) {
                O2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(O2);
            for (String str : strArr2) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap2.isEmpty()) {
                ?? singletonMap = Collections.singletonMap(databasePath2, file);
                X1.g.d(singletonMap, "singletonMap(...)");
                linkedHashMap = singletonMap;
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        r a4 = r.a();
                        String[] strArr3 = p.f4202a;
                        file3.toString();
                        a4.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    r a5 = r.a();
                    String[] strArr4 = p.f4202a;
                    a5.getClass();
                }
            }
        }
    }

    public static O1.i t(O1.g gVar, O1.h hVar) {
        X1.g.e(hVar, "key");
        return X1.g.a(gVar.getKey(), hVar) ? O1.j.f782b : gVar;
    }

    public static MappedByteBuffer u(Context context, Uri uri) {
        try {
            ParcelFileDescriptor a3 = A.m.a(context.getContentResolver(), uri, "r", null);
            if (a3 == null) {
                if (a3 != null) {
                    a3.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(a3.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    a3.close();
                    return map;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    a3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static m2.j v(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr2[i4];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            strArr2[i4] = d2.d.n0(str).toString();
        }
        int I2 = z.I(0, strArr2.length - 1, 2);
        if (I2 >= 0) {
            while (true) {
                String str2 = strArr2[i3];
                String str3 = strArr2[i3 + 1];
                c(str2);
                e(str3, str2);
                if (i3 == I2) {
                    break;
                }
                i3 += 2;
            }
        }
        return new m2.j(strArr2);
    }

    public static void w(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static O1.i x(O1.g gVar, O1.i iVar) {
        X1.g.e(iVar, "context");
        return z.a0(gVar, iVar);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [J.z, R.b] */
    public static R.b y(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i3 = duplicate.getShort() & 65535;
        if (i3 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                j3 = -1;
                break;
            }
            int i5 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j3 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i5) {
                break;
            }
            i4++;
        }
        if (j3 != -1) {
            duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j4 = duplicate.getInt() & 4294967295L;
            for (int i6 = 0; i6 < j4; i6++) {
                int i7 = duplicate.getInt();
                long j5 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i7 || 1701669481 == i7) {
                    duplicate.position((int) (j5 + j3));
                    ?? abstractC0026z = new AbstractC0026z();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    abstractC0026z.f473d = duplicate;
                    abstractC0026z.f471a = position;
                    int i8 = position - duplicate.getInt(position);
                    abstractC0026z.f472b = i8;
                    abstractC0026z.c = ((ByteBuffer) abstractC0026z.f473d).getShort(i8);
                    return abstractC0026z;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static TypedValue z(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public abstract void D(boolean z3);

    public abstract void E(boolean z3);

    public abstract InputFilter[] m(InputFilter[] inputFilterArr);
}
