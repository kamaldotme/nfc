package d1;

import android.graphics.Path;
import e0.C0117a;
import f0.C0171g;
import j.InterfaceC0219y;
import j.MenuC0207m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public final class e implements p, e0.b, InterfaceC0219y {
    public static e c;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2618b;

    public /* synthetic */ e(int i3) {
        this.f2618b = i3;
    }

    public static final String d(byte[] bArr, byte[][] bArr2, int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f4291e;
        int length = bArr.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = (i8 + length) / 2;
            while (i9 > i7 && bArr[i9] != 10) {
                i9 += i7;
            }
            int i10 = i9 + 1;
            int i11 = 1;
            while (true) {
                i4 = i10 + i11;
                if (bArr[i4] == 10) {
                    break;
                }
                i11++;
            }
            int i12 = i4 - i10;
            int i13 = i3;
            boolean z4 = false;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (z4) {
                    i5 = 46;
                    z3 = false;
                } else {
                    byte b3 = bArr2[i13][i14];
                    byte[] bArr4 = n2.b.f4249a;
                    int i16 = b3 & 255;
                    z3 = z4;
                    i5 = i16;
                }
                byte b4 = bArr[i10 + i15];
                byte[] bArr5 = n2.b.f4249a;
                i6 = i5 - (b4 & 255);
                if (i6 != 0) {
                    break;
                }
                i15++;
                i14++;
                if (i15 == i12) {
                    break;
                }
                if (bArr2[i13].length != i14) {
                    z4 = z3;
                } else {
                    if (i13 == bArr2.length - 1) {
                        break;
                    }
                    i13++;
                    z4 = true;
                    i14 = -1;
                }
            }
            if (i6 >= 0) {
                if (i6 <= 0) {
                    int i17 = i12 - i15;
                    int length2 = bArr2[i13].length - i14;
                    int length3 = bArr2.length;
                    for (int i18 = i13 + 1; i18 < length3; i18++) {
                        length2 += bArr2[i18].length;
                    }
                    if (length2 >= i17) {
                        if (length2 <= i17) {
                            Charset charset = StandardCharsets.UTF_8;
                            X1.g.d(charset, "UTF_8");
                            return new String(bArr, i10, i12, charset);
                        }
                    }
                }
                i8 = i4 + 1;
                i7 = -1;
            }
            length = i9;
            i7 = -1;
        }
        return null;
    }

    public static ArrayList e(List list) {
        X1.g.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((m2.p) obj) != m2.p.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(L1.m.S(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((m2.p) it.next()).f4099b);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [z2.f, java.lang.Object] */
    public static byte[] f(List list) {
        X1.g.e(list, "protocols");
        ?? obj = new Object();
        Iterator it = e(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.L(str.length());
            obj.Q(str);
        }
        return obj.o(obj.c);
    }

    public static z2.i h(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            bArr[i3] = (byte) (A2.b.a(str.charAt(i4 + 1)) + (A2.b.a(str.charAt(i4)) << 4));
        }
        return new z2.i(bArr);
    }

    public static z2.i i(String str) {
        X1.g.e(str, "<this>");
        byte[] bytes = str.getBytes(d2.a.f2653a);
        X1.g.d(bytes, "this as java.lang.String).getBytes(charset)");
        z2.i iVar = new z2.i(bytes);
        iVar.f5340d = str;
        return iVar;
    }

    public static Path j(float f3, float f4, float f5, float f6) {
        Path path = new Path();
        path.moveTo(f3, f4);
        path.lineTo(f5, f6);
        return path;
    }

    public static boolean k() {
        return X1.g.a("Dalvik", System.getProperty("java.vm.name"));
    }

    public static z2.i l(byte[] bArr) {
        z2.i iVar = z2.i.f5338e;
        int length = bArr.length;
        v0.f.m(bArr.length, 0, length);
        u2.l.e(length, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length);
        X1.g.d(copyOfRange, "copyOfRange(...)");
        return new z2.i(copyOfRange);
    }

    @Override // j.InterfaceC0219y
    public void a(MenuC0207m menuC0207m, boolean z3) {
    }

    @Override // j.InterfaceC0219y
    public boolean b(MenuC0207m menuC0207m) {
        return false;
    }

    @Override // e0.b
    public e0.c c(C0117a c0117a) {
        return new C0171g(c0117a.f2688a, c0117a.f2689b, c0117a.c, c0117a.f2690d, c0117a.f2691e);
    }

    @Override // d1.p
    public Object g() {
        switch (this.f2618b) {
            case 0:
                return new TreeMap();
            case 1:
                return new LinkedHashMap();
            default:
                return new o(true);
        }
    }
}
