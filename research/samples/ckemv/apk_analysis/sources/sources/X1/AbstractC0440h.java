package x1;

import j1.AbstractC0236f;
import j1.AbstractC0241k;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0233c;
import j1.EnumC0243m;
import j1.InterfaceC0240j;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import p1.C0356a;

/* renamed from: x1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0440h implements InterfaceC0240j {
    public static float f(int[] iArr, int[] iArr2, float f3) {
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            i3 += iArr[i5];
            i4 += iArr2[i5];
        }
        if (i3 < i4) {
            return Float.POSITIVE_INFINITY;
        }
        float f4 = i3;
        float f5 = f4 / i4;
        float f6 = f3 * f5;
        float f7 = 0.0f;
        for (int i6 = 0; i6 < length; i6++) {
            float f8 = iArr2[i6] * f5;
            float f9 = iArr[i6];
            float f10 = f9 > f8 ? f9 - f8 : f8 - f9;
            if (f10 > f6) {
                return Float.POSITIVE_INFINITY;
            }
            f7 += f10;
        }
        return f7 / f4;
    }

    public static void g(int i3, C0356a c0356a, int[] iArr) {
        int length = iArr.length;
        int i4 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i5 = c0356a.c;
        if (i3 >= i5) {
            throw C0238h.f3489d;
        }
        boolean z3 = !c0356a.a(i3);
        while (i3 < i5) {
            if (c0356a.a(i3) == z3) {
                i4++;
                if (i4 == length) {
                    break;
                }
                iArr[i4] = 1;
                z3 = !z3;
            } else {
                iArr[i4] = iArr[i4] + 1;
            }
            i3++;
        }
        if (i4 != length) {
            if (i4 != length - 1 || i3 != i5) {
                throw C0238h.f3489d;
            }
        }
    }

    public static void h(int i3, C0356a c0356a, int[] iArr) {
        int length = iArr.length;
        boolean a3 = c0356a.a(i3);
        while (i3 > 0 && length >= 0) {
            i3--;
            if (c0356a.a(i3) != a3) {
                length--;
                a3 = !a3;
            }
        }
        if (length >= 0) {
            throw C0238h.f3489d;
        }
        g(i3 + 1, c0356a, iArr);
    }

    @Override // j1.InterfaceC0240j
    public C0242l a(v0.e eVar, Map map) {
        try {
            return e(eVar, map);
        } catch (C0238h e3) {
            if (map == null || !map.containsKey(EnumC0233c.f3476e) || !((p1.e) eVar.f5071b).f4341a.c()) {
                throw e3;
            }
            AbstractC0236f d3 = ((p1.e) eVar.f5071b).f4341a.d();
            C0242l e4 = e(new v0.e(new p1.e(d3)), map);
            Map map2 = e4.f3496e;
            EnumC0243m enumC0243m = EnumC0243m.f3497b;
            int i3 = 270;
            if (map2 != null && map2.containsKey(enumC0243m)) {
                i3 = (((Integer) map2.get(enumC0243m)).intValue() + 270) % 360;
            }
            e4.b(enumC0243m, Integer.valueOf(i3));
            C0244n[] c0244nArr = e4.c;
            if (c0244nArr != null) {
                int i4 = d3.f3486b;
                for (int i5 = 0; i5 < c0244nArr.length; i5++) {
                    C0244n c0244n = c0244nArr[i5];
                    c0244nArr[i5] = new C0244n((i4 - c0244n.f3506b) - 1.0f, c0244n.f3505a);
                }
            }
            return e4;
        }
    }

    @Override // j1.InterfaceC0240j
    public C0242l b(v0.e eVar) {
        return a(eVar, null);
    }

    @Override // j1.InterfaceC0240j
    public void c() {
    }

    public abstract C0242l d(int i3, C0356a c0356a, Map map);

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: k -> 0x00b9, TRY_LEAVE, TryCatch #3 {k -> 0x00b9, blocks: (B:31:0x0073, B:33:0x0079), top: B:30:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0242l e(v0.e eVar, Map map) {
        AbstractC0440h abstractC0440h;
        Map map2;
        int i3;
        v0.e eVar2 = eVar;
        Map map3 = map;
        AbstractC0236f abstractC0236f = ((p1.e) eVar2.f5071b).f4341a;
        int i4 = abstractC0236f.f3485a;
        int i5 = abstractC0236f.f3486b;
        C0356a c0356a = new C0356a(i4);
        int i6 = 1;
        int i7 = 0;
        boolean z3 = map3 != null && map3.containsKey(EnumC0233c.f3476e);
        int max = Math.max(1, i5 >> (z3 ? 8 : 5));
        int i8 = z3 ? i5 : 15;
        int i9 = i5 / 2;
        int i10 = 0;
        while (i10 < i8) {
            int i11 = i10 + 1;
            int i12 = i11 / 2;
            if ((i10 & 1) != 0) {
                i12 = -i12;
            }
            int i13 = (i12 * max) + i9;
            if (i13 < 0 || i13 >= i5) {
                break;
            }
            try {
                c0356a = eVar2.f(c0356a, i13);
                int i14 = i7;
                while (i14 < 2) {
                    try {
                        if (i14 == i6) {
                            c0356a.e();
                            if (map3 != null) {
                                EnumC0233c enumC0233c = EnumC0233c.f3480k;
                                if (map3.containsKey(enumC0233c)) {
                                    EnumMap enumMap = new EnumMap(EnumC0233c.class);
                                    enumMap.putAll(map3);
                                    enumMap.remove(enumC0233c);
                                    abstractC0440h = this;
                                    map3 = enumMap;
                                    C0242l d3 = abstractC0440h.d(i13, c0356a, map3);
                                    if (i14 != i6) {
                                        try {
                                            d3.b(EnumC0243m.f3497b, 180);
                                            C0244n[] c0244nArr = d3.c;
                                            if (c0244nArr != null) {
                                                float f3 = i4;
                                                map2 = map3;
                                                try {
                                                    C0244n c0244n = c0244nArr[i7];
                                                    c0244nArr[0] = new C0244n((f3 - c0244n.f3505a) - 1.0f, c0244n.f3506b);
                                                    try {
                                                        C0244n c0244n2 = c0244nArr[1];
                                                        C0244n c0244n3 = new C0244n((f3 - c0244n2.f3505a) - 1.0f, c0244n2.f3506b);
                                                        i3 = 1;
                                                        try {
                                                            c0244nArr[1] = c0244n3;
                                                        } catch (AbstractC0241k unused) {
                                                            continue;
                                                            i14++;
                                                            i6 = i3;
                                                            map3 = map2;
                                                            i7 = 0;
                                                        }
                                                    } catch (AbstractC0241k unused2) {
                                                        i3 = 1;
                                                    }
                                                } catch (AbstractC0241k unused3) {
                                                    i3 = 1;
                                                    i14++;
                                                    i6 = i3;
                                                    map3 = map2;
                                                    i7 = 0;
                                                }
                                            }
                                        } catch (AbstractC0241k unused4) {
                                            map2 = map3;
                                        }
                                    }
                                    return d3;
                                }
                            }
                        }
                        C0242l d32 = abstractC0440h.d(i13, c0356a, map3);
                        if (i14 != i6) {
                        }
                        return d32;
                    } catch (AbstractC0241k unused5) {
                        map2 = map3;
                        i3 = i6;
                    }
                    abstractC0440h = this;
                }
            } catch (C0238h unused6) {
            }
            i6 = i6;
            i10 = i11;
            i7 = 0;
            eVar2 = eVar;
        }
        throw C0238h.f3489d;
    }
}
