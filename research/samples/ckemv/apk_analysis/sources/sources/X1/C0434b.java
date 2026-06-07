package x1;

import j1.C0232b;
import j1.C0234d;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0233c;
import java.util.ArrayList;
import java.util.Map;
import p1.C0356a;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434b extends AbstractC0440h {

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f5218a;

    static {
        int[] iArr = new int[6];
        // fill-array-data instruction
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 2;
        iArr[3] = 2;
        iArr[4] = 3;
        iArr[5] = 1;
        f5218a = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, iArr, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x019a, code lost:
    
        if (r11 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0146, code lost:
    
        if (r11 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0148, code lost:
    
        r6 = 'd';
        r10 = false;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:110:0x017a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x00f1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x0126. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0152 A[PHI: r2 r19 r20
  0x0152: PHI (r2v13 char) = 
  (r2v6 char)
  (r2v6 char)
  (r2v17 char)
  (r2v6 char)
  (r2v6 char)
  (r2v6 char)
  (r2v6 char)
  (r2v19 char)
  (r2v6 char)
  (r2v26 char)
  (r2v6 char)
  (r2v6 char)
  (r2v6 char)
 binds: [B:60:0x00f1, B:110:0x017a, B:116:0x0190, B:111:0x017e, B:115:0x018a, B:114:0x0186, B:102:0x015f, B:99:0x0155, B:85:0x0126, B:98:0x0150, B:86:0x012a, B:90:0x0136, B:89:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0152: PHI (r19v3 int) = 
  (r19v2 int)
  (r19v6 int)
  (r19v6 int)
  (r19v6 int)
  (r19v6 int)
  (r19v6 int)
  (r19v8 int)
  (r19v10 int)
  (r19v17 int)
  (r19v17 int)
  (r19v17 int)
  (r19v17 int)
  (r19v17 int)
 binds: [B:60:0x00f1, B:110:0x017a, B:116:0x0190, B:111:0x017e, B:115:0x018a, B:114:0x0186, B:102:0x015f, B:99:0x0155, B:85:0x0126, B:98:0x0150, B:86:0x012a, B:90:0x0136, B:89:0x0132] A[DONT_GENERATE, DONT_INLINE]
  0x0152: PHI (r20v2 boolean) = 
  (r20v1 boolean)
  (r20v1 boolean)
  (r20v1 boolean)
  (r20v1 boolean)
  (r20v1 boolean)
  (r20v1 boolean)
  (r20v4 boolean)
  (r20v1 boolean)
  (r20v1 boolean)
  (r20v1 boolean)
  (r20v1 boolean)
  (r20v1 boolean)
  (r20v1 boolean)
 binds: [B:60:0x00f1, B:110:0x017a, B:116:0x0190, B:111:0x017e, B:115:0x018a, B:114:0x0186, B:102:0x015f, B:99:0x0155, B:85:0x0126, B:98:0x0150, B:86:0x012a, B:90:0x0136, B:89:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0155 A[PHI: r19
  0x0155: PHI (r19v10 int) = (r19v6 int), (r19v17 int) binds: [B:110:0x017a, B:85:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // x1.AbstractC0440h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0242l d(int i3, C0356a c0356a, Map map) {
        int i4;
        int i5;
        int[][] iArr;
        float f3;
        char c;
        char c3;
        boolean z3;
        int i6 = 1;
        int i7 = 0;
        boolean z4 = map != null && map.containsKey(EnumC0233c.f3478i);
        int i8 = c0356a.c;
        int b3 = c0356a.b(0);
        int i9 = 6;
        int[] iArr2 = new int[6];
        boolean z5 = false;
        int i10 = 0;
        int i11 = b3;
        while (b3 < i8) {
            if (c0356a.a(b3) != z5) {
                iArr2[i10] = iArr2[i10] + i6;
                int i12 = i7;
                i5 = i6;
                i4 = i12;
            } else {
                if (i10 == 5) {
                    int i13 = 103;
                    int i14 = -1;
                    float f4 = 0.25f;
                    while (true) {
                        iArr = f5218a;
                        f3 = 0.7f;
                        if (i13 > 105) {
                            break;
                        }
                        float f5 = AbstractC0440h.f(iArr2, iArr[i13], 0.7f);
                        if (f5 < f4) {
                            f4 = f5;
                            i14 = i13;
                        }
                        i13++;
                    }
                    if (i14 >= 0 && c0356a.d(Math.max(i7, i11 - ((b3 - i11) / 2)), i11)) {
                        int[] iArr3 = {i11, b3, i14};
                        int i15 = iArr3[2];
                        ArrayList arrayList = new ArrayList(20);
                        arrayList.add(Byte.valueOf((byte) i15));
                        switch (i15) {
                            case 103:
                                c = 'e';
                                break;
                            case 104:
                                c = 'd';
                                break;
                            case 105:
                                c = 'c';
                                break;
                            default:
                                throw C0234d.a();
                        }
                        StringBuilder sb = new StringBuilder(20);
                        int i16 = iArr3[i7];
                        int i17 = iArr3[i6];
                        int[] iArr4 = new int[i9];
                        int i18 = i6;
                        char c4 = c;
                        boolean z6 = false;
                        boolean z7 = false;
                        int i19 = 0;
                        boolean z8 = false;
                        boolean z9 = false;
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = i16;
                        int i23 = i17;
                        while (!z8) {
                            AbstractC0440h.g(i23, c0356a, iArr4);
                            int i24 = -1;
                            float f6 = 0.25f;
                            for (int i25 = 0; i25 < 107; i25++) {
                                float f7 = AbstractC0440h.f(iArr4, iArr[i25], f3);
                                if (f7 < f6) {
                                    i24 = i25;
                                    f6 = f7;
                                }
                            }
                            if (i24 < 0) {
                                throw C0238h.f3489d;
                            }
                            arrayList.add(Byte.valueOf((byte) i24));
                            if (i24 != 106) {
                                i18 = 1;
                            }
                            if (i24 != 106) {
                                i21++;
                                i15 = (i21 * i24) + i15;
                            }
                            int i26 = i23;
                            for (int i27 = 0; i27 < i9; i27++) {
                                i26 += iArr4[i27];
                            }
                            switch (i24) {
                                case 103:
                                case 104:
                                case 105:
                                    throw C0234d.a();
                                default:
                                    switch (c4) {
                                        case 'c':
                                            c3 = 'd';
                                            if (i24 >= 100) {
                                                if (i24 != 106) {
                                                    i18 = 0;
                                                }
                                                if (i24 != 106) {
                                                    switch (i24) {
                                                        case 100:
                                                            c4 = 'd';
                                                            break;
                                                        case 101:
                                                            c4 = 'e';
                                                            break;
                                                        case 102:
                                                            if (z4) {
                                                                if (sb.length() == 0) {
                                                                    sb.append("]C1");
                                                                    break;
                                                                } else {
                                                                    sb.append((char) 29);
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    z3 = false;
                                                    z8 = true;
                                                    break;
                                                }
                                            } else {
                                                if (i24 < 10) {
                                                    sb.append('0');
                                                }
                                                sb.append(i24);
                                            }
                                            z3 = false;
                                            break;
                                        case 'd':
                                            if (i24 < 96) {
                                                if (z7 == z6) {
                                                    sb.append((char) (i24 + 32));
                                                } else {
                                                    sb.append((char) (i24 + 160));
                                                }
                                                c3 = 'd';
                                                z7 = false;
                                                z3 = false;
                                                break;
                                            } else {
                                                if (i24 != 106) {
                                                    i18 = 0;
                                                }
                                                if (i24 != 106) {
                                                    switch (i24) {
                                                        case 96:
                                                        case 97:
                                                        default:
                                                            c3 = 'd';
                                                            z3 = false;
                                                            break;
                                                        case 98:
                                                            c4 = 'e';
                                                            c3 = 'd';
                                                            z3 = true;
                                                            break;
                                                        case 99:
                                                            c4 = 'c';
                                                            c3 = 'd';
                                                            z3 = false;
                                                            break;
                                                        case 100:
                                                            if (z6 || !z7) {
                                                                if (z6) {
                                                                }
                                                                c3 = 'd';
                                                                z7 = true;
                                                                z3 = false;
                                                                break;
                                                            }
                                                            c3 = 'd';
                                                            z6 = true;
                                                            z7 = false;
                                                            z3 = false;
                                                            break;
                                                        case 101:
                                                            c4 = 'e';
                                                            c3 = 'd';
                                                            z3 = false;
                                                            break;
                                                        case 102:
                                                            if (z4) {
                                                                if (sb.length() == 0) {
                                                                    sb.append("]C1");
                                                                } else {
                                                                    sb.append((char) 29);
                                                                }
                                                            }
                                                            c3 = 'd';
                                                            z3 = false;
                                                            break;
                                                    }
                                                }
                                                z8 = true;
                                                c3 = 'd';
                                                z3 = false;
                                            }
                                            break;
                                        case 'e':
                                            if (i24 < 64) {
                                                if (z7 == z6) {
                                                    sb.append((char) (i24 + 32));
                                                } else {
                                                    sb.append((char) (i24 + 160));
                                                }
                                            } else if (i24 >= 96) {
                                                if (i24 != 106) {
                                                    i18 = 0;
                                                }
                                                if (i24 != 106) {
                                                    switch (i24) {
                                                        case 98:
                                                            c4 = 'd';
                                                            c3 = 'd';
                                                            z3 = true;
                                                            break;
                                                        case 100:
                                                            c4 = 'd';
                                                            c3 = 'd';
                                                            z3 = false;
                                                            break;
                                                        case 101:
                                                            if (z6 || !z7) {
                                                                if (z6) {
                                                                }
                                                                c3 = 'd';
                                                                z7 = true;
                                                                z3 = false;
                                                                break;
                                                            }
                                                            c3 = 'd';
                                                            z6 = true;
                                                            z7 = false;
                                                            z3 = false;
                                                            break;
                                                        case 102:
                                                            if (z4) {
                                                                if (sb.length() == 0) {
                                                                    sb.append("]C1");
                                                                } else {
                                                                    sb.append((char) 29);
                                                                }
                                                            }
                                                            c3 = 'd';
                                                            z3 = false;
                                                            break;
                                                    }
                                                }
                                                z8 = true;
                                                c3 = 'd';
                                                z3 = false;
                                            } else if (z7 == z6) {
                                                sb.append((char) (i24 - 64));
                                            } else {
                                                sb.append((char) (i24 + 64));
                                            }
                                            c3 = 'd';
                                            z7 = false;
                                            z3 = false;
                                            break;
                                    }
                                    if (z9) {
                                        c4 = c4 == 'e' ? c3 : 'e';
                                    }
                                    z9 = z3;
                                    i19 = i20;
                                    i9 = 6;
                                    f3 = 0.7f;
                                    i20 = i24;
                                    i22 = i23;
                                    i23 = i26;
                                    break;
                            }
                        }
                        int i28 = i23 - i22;
                        int c5 = c0356a.c(i23);
                        if (!c0356a.d(c5, Math.min(c0356a.c, ((c5 - i22) / 2) + c5))) {
                            throw C0238h.f3489d;
                        }
                        if ((i15 - (i21 * i19)) % 103 != i19) {
                            throw C0232b.a();
                        }
                        int length = sb.length();
                        if (length == 0) {
                            throw C0238h.f3489d;
                        }
                        if (length > 0 && i18 != 0) {
                            if (c4 == 'c') {
                                sb.delete(length - 2, length);
                            } else {
                                sb.delete(length - 1, length);
                            }
                        }
                        float f8 = (iArr3[1] + iArr3[0]) / 2.0f;
                        float f9 = (i28 / 2.0f) + i22;
                        int size = arrayList.size();
                        byte[] bArr = new byte[size];
                        for (int i29 = 0; i29 < size; i29++) {
                            bArr[i29] = ((Byte) arrayList.get(i29)).byteValue();
                        }
                        float f10 = i3;
                        return new C0242l(sb.toString(), bArr, new C0244n[]{new C0244n(f8, f10), new C0244n(f9, f10)}, EnumC0231a.f3462f);
                    }
                    i4 = i7;
                    i11 += iArr2[i4] + iArr2[1];
                    int i30 = i10 - 1;
                    System.arraycopy(iArr2, 2, iArr2, i4, i30);
                    iArr2[i30] = i4;
                    iArr2[i10] = i4;
                    i10--;
                } else {
                    i4 = i7;
                    i10++;
                }
                i5 = 1;
                iArr2[i10] = 1;
                z5 = !z5;
            }
            b3++;
            i9 = 6;
            int i31 = i5;
            i7 = i4;
            i6 = i31;
        }
        throw C0238h.f3489d;
    }
}
