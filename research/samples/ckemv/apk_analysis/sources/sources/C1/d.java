package C1;

import j1.C0234d;
import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f125a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f126b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    public static final BigInteger[] c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i3 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = c;
            if (i3 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i3] = bigIntegerArr2[i3 - 1].multiply(valueOf);
            i3++;
        }
    }

    public static String a(int[] iArr, int i3) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i4 = 0; i4 < i3; i4++) {
            bigInteger = bigInteger.add(c[(i3 - i4) - 1].multiply(BigInteger.valueOf(iArr[i4])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C0234d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r10.append(a(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(int[] iArr, int i3, StringBuilder sb) {
        int[] iArr2 = new int[15];
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            int i5 = iArr[0];
            if (i3 < i5 && !z3) {
                int i6 = i3 + 1;
                int i7 = iArr[i3];
                if (i6 == i5) {
                    z3 = true;
                }
                if (i7 < 900) {
                    iArr2[i4] = i7;
                    i4++;
                } else {
                    if (i7 != 900 && i7 != 901 && i7 != 928) {
                        switch (i7) {
                        }
                        if (i4 % 15 == 0 || i7 == 902 || z3) {
                        }
                    }
                    z3 = true;
                    if (i4 % 15 == 0) {
                    }
                }
                i3 = i6;
                if (i4 % 15 == 0) {
                }
            }
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a5, code lost:
    
        if (r12 != 900) goto L43;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x00ce. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x00f0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int[] iArr, int i3, StringBuilder sb) {
        char c3;
        char c4;
        int i4;
        int i5 = 1;
        int i6 = (iArr[0] - i3) << 1;
        int[] iArr2 = new int[i6];
        int[] iArr3 = new int[i6];
        int i7 = i3;
        boolean z3 = false;
        int i8 = 0;
        while (i7 < iArr[0] && !z3) {
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            if (i10 < 900) {
                iArr2[i8] = i10 / 30;
                iArr2[i8 + 1] = i10 % 30;
                i8 += 2;
            } else if (i10 != 913) {
                if (i10 != 928) {
                    switch (i10) {
                        case 900:
                            iArr2[i8] = 900;
                            i8++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i10) {
                            }
                    }
                }
                z3 = true;
            } else {
                iArr2[i8] = 913;
                i7 += 2;
                iArr3[i8] = iArr[i9];
                i8++;
            }
            i7 = i9;
        }
        int i11 = 0;
        int i12 = 1;
        int i13 = 1;
        while (i11 < i8) {
            int i14 = iArr2[i11];
            int a3 = q.h.a(i12);
            char c5 = ' ';
            if (a3 != 0) {
                if (a3 != i5) {
                    if (a3 != 2) {
                        char[] cArr = f125a;
                        if (a3 != 3) {
                            if (a3 != 4) {
                                if (a3 == 5) {
                                    if (i14 < 29) {
                                        c5 = cArr[i14];
                                        i12 = i13;
                                        c4 = c5;
                                        c3 = 913;
                                    } else {
                                        if (i14 != 29 && i14 != 900) {
                                            if (i14 == 913) {
                                                sb.append((char) iArr3[i11]);
                                            }
                                            i12 = i13;
                                        }
                                        c3 = 913;
                                        c4 = 0;
                                        i12 = 1;
                                    }
                                }
                                c3 = 913;
                                c4 = 0;
                            } else if (i14 < 26) {
                                c4 = (char) (i14 + 65);
                                i12 = i13;
                                c3 = 913;
                            } else {
                                if (i14 != 26) {
                                }
                                i12 = i13;
                                c4 = c5;
                                c3 = 913;
                            }
                        } else if (i14 < 29) {
                            c5 = cArr[i14];
                            c4 = c5;
                            c3 = 913;
                        } else {
                            if (i14 != 29 && i14 != 900) {
                                if (i14 == 913) {
                                    sb.append((char) iArr3[i11]);
                                }
                                c3 = 913;
                                c4 = 0;
                            }
                            c3 = 913;
                            c4 = 0;
                            i12 = 1;
                        }
                    } else {
                        if (i14 < 25) {
                            c5 = f126b[i14];
                        } else {
                            if (i14 != 900) {
                                if (i14 != 913) {
                                    switch (i14) {
                                        case 25:
                                            i12 = 4;
                                            break;
                                        case 27:
                                            i12 = 2;
                                            break;
                                        case 29:
                                            i13 = i12;
                                            i12 = 6;
                                            break;
                                    }
                                } else {
                                    sb.append((char) iArr3[i11]);
                                }
                                c3 = 913;
                                c4 = 0;
                            }
                            c3 = 913;
                            c4 = 0;
                            i12 = 1;
                        }
                        c4 = c5;
                        c3 = 913;
                    }
                } else if (i14 < 26) {
                    i4 = i14 + 97;
                    c4 = (char) i4;
                    c3 = 913;
                } else {
                    if (i14 != 900) {
                        if (i14 != 913) {
                            switch (i14) {
                                case 26:
                                    c4 = c5;
                                    c3 = 913;
                                    break;
                                case 27:
                                    i13 = i12;
                                    c4 = 0;
                                    i12 = 5;
                                    c3 = 913;
                                    break;
                                case 28:
                                    i12 = 3;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr3[i11]);
                        }
                        c3 = 913;
                        c4 = 0;
                    }
                    i12 = 1;
                    c3 = 913;
                    c4 = 0;
                }
                if (c4 != 0) {
                    sb.append(c4);
                }
                i11++;
                i5 = 1;
            } else if (i14 < 26) {
                i4 = i14 + 65;
                c4 = (char) i4;
                c3 = 913;
                if (c4 != 0) {
                }
                i11++;
                i5 = 1;
            } else {
                if (i14 != 900) {
                    c3 = 913;
                    if (i14 != 913) {
                        switch (i14) {
                            case 26:
                                c4 = ' ';
                                break;
                            case 27:
                                i12 = 2;
                                break;
                            case 28:
                                i12 = 3;
                                break;
                            case 29:
                                i13 = i12;
                                i12 = 6;
                                break;
                        }
                    } else {
                        sb.append((char) iArr3[i11]);
                    }
                } else {
                    c3 = 913;
                    i12 = 1;
                }
                c4 = 0;
                if (c4 != 0) {
                }
                i11++;
                i5 = 1;
            }
        }
        return i7;
    }
}
