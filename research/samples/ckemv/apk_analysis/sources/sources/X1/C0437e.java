package x1;

import j1.C0234d;
import j1.C0238h;
import j1.C0242l;
import j1.EnumC0231a;
import java.util.Map;
import p1.C0356a;

/* renamed from: x1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437e extends AbstractC0443k {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f5226j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5227k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[][] f5228l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5229i;

    public C0437e(int i3) {
        this.h = i3;
        switch (i3) {
            case 1:
                this.f5229i = new int[4];
                return;
            case 2:
                this.f5229i = new int[4];
                return;
            case 3:
                this.f5229i = new C0437e(0);
                return;
            default:
                this.f5229i = new int[4];
                return;
        }
    }

    public static C0242l q(C0242l c0242l) {
        String str = c0242l.f3493a;
        if (str.charAt(0) != '0') {
            throw C0234d.a();
        }
        C0242l c0242l2 = new C0242l(str.substring(1), null, c0242l.c, EnumC0231a.f3470p);
        Map map = c0242l.f3496e;
        if (map != null) {
            c0242l2.a(map);
        }
        return c0242l2;
    }

    @Override // x1.AbstractC0440h, j1.InterfaceC0240j
    public C0242l a(v0.e eVar, Map map) {
        switch (this.h) {
            case 3:
                return q(((C0437e) this.f5229i).a(eVar, map));
            default:
                return super.a(eVar, map);
        }
    }

    @Override // x1.AbstractC0440h, j1.InterfaceC0240j
    public C0242l b(v0.e eVar) {
        switch (this.h) {
            case 3:
                return q(((C0437e) this.f5229i).a(eVar, null));
            default:
                return super.b(eVar);
        }
    }

    @Override // x1.AbstractC0443k, x1.AbstractC0440h
    public C0242l d(int i3, C0356a c0356a, Map map) {
        switch (this.h) {
            case 3:
                return q(((C0437e) this.f5229i).d(i3, c0356a, map));
            default:
                return super.d(i3, c0356a, map);
        }
    }

    @Override // x1.AbstractC0443k
    public boolean i(String str) {
        switch (this.h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb = new StringBuilder(12);
                sb.append(str.charAt(0));
                char c = cArr[5];
                switch (c) {
                    case '0':
                    case '1':
                    case '2':
                        sb.append(cArr, 0, 2);
                        sb.append(c);
                        sb.append("0000");
                        sb.append(cArr, 2, 3);
                        break;
                    case '3':
                        sb.append(cArr, 0, 3);
                        sb.append("00000");
                        sb.append(cArr, 3, 2);
                        break;
                    case '4':
                        sb.append(cArr, 0, 4);
                        sb.append("00000");
                        sb.append(cArr[4]);
                        break;
                    default:
                        sb.append(cArr, 0, 5);
                        sb.append("0000");
                        sb.append(c);
                        break;
                }
                if (str.length() >= 8) {
                    sb.append(str.charAt(7));
                }
                return super.i(sb.toString());
            default:
                return super.i(str);
        }
    }

    @Override // x1.AbstractC0443k
    public int[] k(C0356a c0356a, int i3) {
        switch (this.h) {
            case 1:
                return AbstractC0443k.n(c0356a, i3, true, f5227k, new int[6]);
            default:
                return super.k(c0356a, i3);
        }
    }

    @Override // x1.AbstractC0443k
    public final int l(C0356a c0356a, int[] iArr, StringBuilder sb) {
        int[][] iArr2;
        switch (this.h) {
            case 0:
                int[] iArr3 = (int[]) this.f5229i;
                iArr3[0] = 0;
                iArr3[1] = 0;
                iArr3[2] = 0;
                iArr3[3] = 0;
                int i3 = c0356a.c;
                int i4 = iArr[1];
                int i5 = 0;
                for (int i6 = 0; i6 < 6 && i4 < i3; i6++) {
                    int j3 = AbstractC0443k.j(c0356a, iArr3, i4, AbstractC0443k.g);
                    sb.append((char) ((j3 % 10) + 48));
                    for (int i7 : iArr3) {
                        i4 += i7;
                    }
                    if (j3 >= 10) {
                        i5 |= 1 << (5 - i6);
                    }
                }
                for (int i8 = 0; i8 < 10; i8++) {
                    if (i5 == f5226j[i8]) {
                        sb.insert(0, (char) (i8 + 48));
                        int i9 = AbstractC0443k.n(c0356a, i4, true, AbstractC0443k.f5242e, new int[5])[1];
                        for (int i10 = 0; i10 < 6 && i9 < i3; i10++) {
                            sb.append((char) (AbstractC0443k.j(c0356a, iArr3, i9, AbstractC0443k.f5243f) + 48));
                            for (int i11 : iArr3) {
                                i9 += i11;
                            }
                        }
                        return i9;
                    }
                }
                throw C0238h.f3489d;
            case 1:
                int[] iArr4 = (int[]) this.f5229i;
                iArr4[0] = 0;
                iArr4[1] = 0;
                iArr4[2] = 0;
                iArr4[3] = 0;
                int i12 = c0356a.c;
                int i13 = iArr[1];
                int i14 = 0;
                for (int i15 = 0; i15 < 6 && i13 < i12; i15++) {
                    int j4 = AbstractC0443k.j(c0356a, iArr4, i13, AbstractC0443k.g);
                    sb.append((char) ((j4 % 10) + 48));
                    for (int i16 : iArr4) {
                        i13 += i16;
                    }
                    if (j4 >= 10) {
                        i14 |= 1 << (5 - i15);
                    }
                }
                for (int i17 = 0; i17 <= 1; i17++) {
                    for (int i18 = 0; i18 < 10; i18++) {
                        if (i14 == f5228l[i17][i18]) {
                            sb.insert(0, (char) (i17 + 48));
                            sb.append((char) (i18 + 48));
                            return i13;
                        }
                    }
                }
                throw C0238h.f3489d;
            case 2:
                int[] iArr5 = (int[]) this.f5229i;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i19 = c0356a.c;
                int i20 = iArr[1];
                int i21 = 0;
                while (true) {
                    iArr2 = AbstractC0443k.f5243f;
                    if (i21 < 4 && i20 < i19) {
                        sb.append((char) (AbstractC0443k.j(c0356a, iArr5, i20, iArr2) + 48));
                        for (int i22 : iArr5) {
                            i20 += i22;
                        }
                        i21++;
                    }
                }
                int i23 = AbstractC0443k.n(c0356a, i20, true, AbstractC0443k.f5242e, new int[5])[1];
                for (int i24 = 0; i24 < 4 && i23 < i19; i24++) {
                    sb.append((char) (AbstractC0443k.j(c0356a, iArr5, i23, iArr2) + 48));
                    for (int i25 : iArr5) {
                        i23 += i25;
                    }
                }
                return i23;
            default:
                return ((C0437e) this.f5229i).l(c0356a, iArr, sb);
        }
    }

    @Override // x1.AbstractC0443k
    public C0242l m(int i3, C0356a c0356a, int[] iArr, Map map) {
        switch (this.h) {
            case 3:
                return q(((C0437e) this.f5229i).m(i3, c0356a, iArr, map));
            default:
                return super.m(i3, c0356a, iArr, map);
        }
    }

    @Override // x1.AbstractC0443k
    public final EnumC0231a p() {
        switch (this.h) {
            case 0:
                return EnumC0231a.f3463i;
            case 1:
                return EnumC0231a.f3471q;
            case 2:
                return EnumC0231a.h;
            default:
                return EnumC0231a.f3470p;
        }
    }
}
