package x1;

import j1.AbstractC0241k;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0243m;
import java.util.ArrayList;
import java.util.EnumMap;
import p1.C0356a;

/* renamed from: x1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442j {
    public static final int[] c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    public final Object f5239a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5240b;

    public C0442j(int i3) {
        switch (i3) {
            case 1:
                this.f5239a = new ArrayList();
                this.f5240b = new ArrayList();
                return;
            default:
                this.f5239a = new C0441i(1);
                this.f5240b = new C0441i(0);
                return;
        }
    }

    public void a(int[] iArr, String str) {
        ((ArrayList) this.f5239a).add(iArr);
        ((ArrayList) this.f5240b).add(str);
    }

    public C0242l b(int i3, int i4, C0356a c0356a) {
        EnumMap enumMap;
        int[] n3 = AbstractC0443k.n(c0356a, i4, false, c, new int[3]);
        try {
            return ((C0441i) this.f5240b).a(i3, c0356a, n3);
        } catch (AbstractC0241k unused) {
            C0441i c0441i = (C0441i) this.f5239a;
            StringBuilder sb = c0441i.f5238b;
            sb.setLength(0);
            int[] iArr = c0441i.f5237a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i5 = n3[1];
            int i6 = 0;
            for (int i7 = 0; i7 < 2 && i5 < c0356a.c; i7++) {
                int j3 = AbstractC0443k.j(c0356a, iArr, i5, AbstractC0443k.g);
                sb.append((char) ((j3 % 10) + 48));
                for (int i8 : iArr) {
                    i5 += i8;
                }
                if (j3 >= 10) {
                    i6 |= 1 << (1 - i7);
                }
                if (i7 != 1) {
                    i5 = c0356a.c(c0356a.b(i5));
                }
            }
            if (sb.length() != 2) {
                throw C0238h.f3489d;
            }
            if (Integer.parseInt(sb.toString()) % 4 != i6) {
                throw C0238h.f3489d;
            }
            String sb2 = sb.toString();
            if (sb2.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(EnumC0243m.class);
                enumMap.put((EnumMap) EnumC0243m.f3499e, (EnumC0243m) Integer.valueOf(sb2));
            }
            float f3 = i3;
            C0242l c0242l = new C0242l(sb2, null, new C0244n[]{new C0244n((n3[0] + n3[1]) / 2.0f, f3), new C0244n(i5, f3)}, EnumC0231a.f3472r);
            if (enumMap != null) {
                c0242l.a(enumMap);
            }
            return c0242l;
        }
    }
}
