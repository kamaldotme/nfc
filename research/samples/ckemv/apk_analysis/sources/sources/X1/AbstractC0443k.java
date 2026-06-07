package x1;

import j1.AbstractC0241k;
import j1.C0232b;
import j1.C0234d;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0233c;
import j1.EnumC0243m;
import j1.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p1.C0356a;

/* renamed from: x1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0443k extends AbstractC0440h {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5241d = {1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5242e = {1, 1, 1, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f5243f;
    public static final int[][] g;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f5244a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public final C0442j f5245b = new C0442j(0);
    public final C0442j c = new C0442j(1);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f5243f = iArr;
        int[][] iArr2 = new int[20];
        g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i3 = 10; i3 < 20; i3++) {
            int[] iArr3 = f5243f[i3 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i4 = 0; i4 < iArr3.length; i4++) {
                iArr4[i4] = iArr3[(iArr3.length - i4) - 1];
            }
            g[i3] = iArr4;
        }
    }

    public static int j(C0356a c0356a, int[] iArr, int i3, int[][] iArr2) {
        AbstractC0440h.g(i3, c0356a, iArr);
        int length = iArr2.length;
        float f3 = 0.48f;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            float f4 = AbstractC0440h.f(iArr, iArr2[i5], 0.7f);
            if (f4 < f3) {
                i4 = i5;
                f3 = f4;
            }
        }
        if (i4 >= 0) {
            return i4;
        }
        throw C0238h.f3489d;
    }

    public static int[] n(C0356a c0356a, int i3, boolean z3, int[] iArr, int[] iArr2) {
        int i4 = c0356a.c;
        int c = z3 ? c0356a.c(i3) : c0356a.b(i3);
        int length = iArr.length;
        boolean z4 = z3;
        int i5 = 0;
        int i6 = c;
        while (c < i4) {
            if (c0356a.a(c) != z4) {
                iArr2[i5] = iArr2[i5] + 1;
            } else {
                if (i5 != length - 1) {
                    i5++;
                } else {
                    if (AbstractC0440h.f(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i6, c};
                    }
                    i6 += iArr2[0] + iArr2[1];
                    int i7 = i5 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i7);
                    iArr2[i7] = 0;
                    iArr2[i5] = 0;
                    i5--;
                }
                iArr2[i5] = 1;
                z4 = !z4;
            }
            c++;
        }
        throw C0238h.f3489d;
    }

    public static int[] o(C0356a c0356a) {
        int[] iArr = new int[3];
        int[] iArr2 = null;
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            Arrays.fill(iArr, 0, 3, 0);
            iArr2 = n(c0356a, i3, false, f5241d, iArr);
            int i4 = iArr2[0];
            int i5 = iArr2[1];
            int i6 = i4 - (i5 - i4);
            if (i6 >= 0) {
                z3 = c0356a.d(i6, i4);
            }
            i3 = i5;
        }
        return iArr2;
    }

    @Override // x1.AbstractC0440h
    public C0242l d(int i3, C0356a c0356a, Map map) {
        return m(i3, c0356a, o(c0356a), map);
    }

    public boolean i(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i3 = length - 1;
        int digit = Character.digit(str.charAt(i3), 10);
        CharSequence subSequence = str.subSequence(0, i3);
        int length2 = subSequence.length();
        int i4 = 0;
        for (int i5 = length2 - 1; i5 >= 0; i5 -= 2) {
            int charAt = subSequence.charAt(i5) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C0234d.a();
            }
            i4 += charAt;
        }
        int i6 = i4 * 3;
        for (int i7 = length2 - 2; i7 >= 0; i7 -= 2) {
            int charAt2 = subSequence.charAt(i7) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C0234d.a();
            }
            i6 += charAt2;
        }
        return (1000 - i6) % 10 == digit;
    }

    public int[] k(C0356a c0356a, int i3) {
        return n(c0356a, i3, false, f5241d, new int[3]);
    }

    public abstract int l(C0356a c0356a, int[] iArr, StringBuilder sb);

    public C0242l m(int i3, C0356a c0356a, int[] iArr, Map map) {
        int i4;
        String str = null;
        o oVar = map == null ? null : (o) map.get(EnumC0233c.f3480k);
        if (oVar != null) {
            oVar.a(new C0244n((iArr[0] + iArr[1]) / 2.0f, i3));
        }
        StringBuilder sb = this.f5244a;
        sb.setLength(0);
        int l3 = l(c0356a, iArr, sb);
        if (oVar != null) {
            oVar.a(new C0244n(l3, i3));
        }
        int[] k2 = k(c0356a, l3);
        if (oVar != null) {
            oVar.a(new C0244n((k2[0] + k2[1]) / 2.0f, i3));
        }
        int i5 = k2[1];
        int i6 = (i5 - k2[0]) + i5;
        if (i6 >= c0356a.c || !c0356a.d(i5, i6)) {
            throw C0238h.f3489d;
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw C0234d.a();
        }
        if (!i(sb2)) {
            throw C0232b.a();
        }
        EnumC0231a p3 = p();
        float f3 = i3;
        C0242l c0242l = new C0242l(sb2, null, new C0244n[]{new C0244n((iArr[1] + iArr[0]) / 2.0f, f3), new C0244n((k2[1] + k2[0]) / 2.0f, f3)}, p3);
        try {
            C0242l b3 = this.f5245b.b(i3, k2[1], c0356a);
            c0242l.b(EnumC0243m.h, b3.f3493a);
            c0242l.a(b3.f3496e);
            C0244n[] c0244nArr = b3.c;
            C0244n[] c0244nArr2 = c0242l.c;
            if (c0244nArr2 == null) {
                c0242l.c = c0244nArr;
            } else if (c0244nArr != null && c0244nArr.length > 0) {
                C0244n[] c0244nArr3 = new C0244n[c0244nArr2.length + c0244nArr.length];
                System.arraycopy(c0244nArr2, 0, c0244nArr3, 0, c0244nArr2.length);
                System.arraycopy(c0244nArr, 0, c0244nArr3, c0244nArr2.length, c0244nArr.length);
                c0242l.c = c0244nArr3;
            }
            i4 = b3.f3493a.length();
        } catch (AbstractC0241k unused) {
            i4 = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(EnumC0233c.f3481l);
        if (iArr2 != null) {
            for (int i7 : iArr2) {
                if (i4 != i7) {
                }
            }
            throw C0238h.f3489d;
        }
        if (p3 == EnumC0231a.f3463i || p3 == EnumC0231a.f3470p) {
            C0442j c0442j = this.c;
            synchronized (c0442j) {
                if (((ArrayList) c0442j.f5239a).isEmpty()) {
                    c0442j.a(new int[]{0, 19}, "US/CA");
                    c0442j.a(new int[]{30, 39}, "US");
                    c0442j.a(new int[]{60, 139}, "US/CA");
                    c0442j.a(new int[]{300, 379}, "FR");
                    c0442j.a(new int[]{380}, "BG");
                    c0442j.a(new int[]{383}, "SI");
                    c0442j.a(new int[]{385}, "HR");
                    c0442j.a(new int[]{387}, "BA");
                    c0442j.a(new int[]{400, 440}, "DE");
                    c0442j.a(new int[]{450, 459}, "JP");
                    c0442j.a(new int[]{460, 469}, "RU");
                    c0442j.a(new int[]{471}, "TW");
                    c0442j.a(new int[]{474}, "EE");
                    c0442j.a(new int[]{475}, "LV");
                    c0442j.a(new int[]{476}, "AZ");
                    c0442j.a(new int[]{477}, "LT");
                    c0442j.a(new int[]{478}, "UZ");
                    c0442j.a(new int[]{479}, "LK");
                    c0442j.a(new int[]{480}, "PH");
                    c0442j.a(new int[]{481}, "BY");
                    c0442j.a(new int[]{482}, "UA");
                    c0442j.a(new int[]{484}, "MD");
                    c0442j.a(new int[]{485}, "AM");
                    c0442j.a(new int[]{486}, "GE");
                    c0442j.a(new int[]{487}, "KZ");
                    c0442j.a(new int[]{489}, "HK");
                    c0442j.a(new int[]{490, 499}, "JP");
                    c0442j.a(new int[]{500, 509}, "GB");
                    c0442j.a(new int[]{520}, "GR");
                    c0442j.a(new int[]{528}, "LB");
                    c0442j.a(new int[]{529}, "CY");
                    c0442j.a(new int[]{531}, "MK");
                    c0442j.a(new int[]{535}, "MT");
                    c0442j.a(new int[]{539}, "IE");
                    c0442j.a(new int[]{540, 549}, "BE/LU");
                    c0442j.a(new int[]{560}, "PT");
                    c0442j.a(new int[]{569}, "IS");
                    c0442j.a(new int[]{570, 579}, "DK");
                    c0442j.a(new int[]{590}, "PL");
                    c0442j.a(new int[]{594}, "RO");
                    c0442j.a(new int[]{599}, "HU");
                    c0442j.a(new int[]{600, 601}, "ZA");
                    c0442j.a(new int[]{603}, "GH");
                    c0442j.a(new int[]{608}, "BH");
                    c0442j.a(new int[]{609}, "MU");
                    c0442j.a(new int[]{611}, "MA");
                    c0442j.a(new int[]{613}, "DZ");
                    c0442j.a(new int[]{616}, "KE");
                    c0442j.a(new int[]{618}, "CI");
                    c0442j.a(new int[]{619}, "TN");
                    c0442j.a(new int[]{621}, "SY");
                    c0442j.a(new int[]{622}, "EG");
                    c0442j.a(new int[]{624}, "LY");
                    c0442j.a(new int[]{625}, "JO");
                    c0442j.a(new int[]{626}, "IR");
                    c0442j.a(new int[]{627}, "KW");
                    c0442j.a(new int[]{628}, "SA");
                    c0442j.a(new int[]{629}, "AE");
                    c0442j.a(new int[]{640, 649}, "FI");
                    c0442j.a(new int[]{690, 695}, "CN");
                    c0442j.a(new int[]{700, 709}, "NO");
                    c0442j.a(new int[]{729}, "IL");
                    c0442j.a(new int[]{730, 739}, "SE");
                    c0442j.a(new int[]{740}, "GT");
                    c0442j.a(new int[]{741}, "SV");
                    c0442j.a(new int[]{742}, "HN");
                    c0442j.a(new int[]{743}, "NI");
                    c0442j.a(new int[]{744}, "CR");
                    c0442j.a(new int[]{745}, "PA");
                    c0442j.a(new int[]{746}, "DO");
                    c0442j.a(new int[]{750}, "MX");
                    c0442j.a(new int[]{754, 755}, "CA");
                    c0442j.a(new int[]{759}, "VE");
                    c0442j.a(new int[]{760, 769}, "CH");
                    c0442j.a(new int[]{770}, "CO");
                    c0442j.a(new int[]{773}, "UY");
                    c0442j.a(new int[]{775}, "PE");
                    c0442j.a(new int[]{777}, "BO");
                    c0442j.a(new int[]{779}, "AR");
                    c0442j.a(new int[]{780}, "CL");
                    c0442j.a(new int[]{784}, "PY");
                    c0442j.a(new int[]{785}, "PE");
                    c0442j.a(new int[]{786}, "EC");
                    c0442j.a(new int[]{789, 790}, "BR");
                    c0442j.a(new int[]{800, 839}, "IT");
                    c0442j.a(new int[]{840, 849}, "ES");
                    c0442j.a(new int[]{850}, "CU");
                    c0442j.a(new int[]{858}, "SK");
                    c0442j.a(new int[]{859}, "CZ");
                    c0442j.a(new int[]{860}, "YU");
                    c0442j.a(new int[]{865}, "MN");
                    c0442j.a(new int[]{867}, "KP");
                    c0442j.a(new int[]{868, 869}, "TR");
                    c0442j.a(new int[]{870, 879}, "NL");
                    c0442j.a(new int[]{880}, "KR");
                    c0442j.a(new int[]{885}, "TH");
                    c0442j.a(new int[]{888}, "SG");
                    c0442j.a(new int[]{890}, "IN");
                    c0442j.a(new int[]{893}, "VN");
                    c0442j.a(new int[]{896}, "PK");
                    c0442j.a(new int[]{899}, "ID");
                    c0442j.a(new int[]{900, 919}, "AT");
                    c0442j.a(new int[]{930, 939}, "AU");
                    c0442j.a(new int[]{940, 949}, "AZ");
                    c0442j.a(new int[]{955}, "MY");
                    c0442j.a(new int[]{958}, "MO");
                }
            }
            int parseInt = Integer.parseInt(sb2.substring(0, 3));
            int size = ((ArrayList) c0442j.f5239a).size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                int[] iArr3 = (int[]) ((ArrayList) c0442j.f5239a).get(i8);
                int i9 = iArr3[0];
                if (parseInt < i9) {
                    break;
                }
                if (iArr3.length != 1) {
                    i9 = iArr3[1];
                }
                if (parseInt <= i9) {
                    str = (String) ((ArrayList) c0442j.f5240b).get(i8);
                    break;
                }
                i8++;
            }
            if (str != null) {
                c0242l.b(EnumC0243m.g, str);
            }
        }
        return c0242l;
    }

    public abstract EnumC0231a p();
}
