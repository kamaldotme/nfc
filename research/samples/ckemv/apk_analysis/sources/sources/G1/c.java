package G1;

import I1.t;
import j1.C0234d;
import j1.EnumC0233c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f237a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(t tVar, StringBuilder sb, int i3, boolean z3) {
        while (i3 > 1) {
            if (tVar.a() < 11) {
                throw C0234d.a();
            }
            int b3 = tVar.b(11);
            sb.append(f(b3 / 45));
            sb.append(f(b3 % 45));
            i3 -= 2;
        }
        if (i3 == 1) {
            if (tVar.a() < 6) {
                throw C0234d.a();
            }
            sb.append(f(tVar.b(6)));
        }
        if (z3) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i4 = length + 1;
                        if (sb.charAt(i4) == '%') {
                            sb.deleteCharAt(i4);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016f, code lost:
    
        if (r2 == 2) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0173, code lost:
    
        if ((r21 * 10) >= r27) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(t tVar, StringBuilder sb, int i3, p1.c cVar, ArrayList arrayList, Map map) {
        String name;
        char c = '@';
        if ((i3 << 3) > tVar.a()) {
            throw C0234d.a();
        }
        byte[] bArr = new byte[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr[i5] = (byte) tVar.b(8);
        }
        if (cVar == null) {
            String str = p1.g.f4350a;
            if (map != null) {
                EnumC0233c enumC0233c = EnumC0233c.f3477f;
                if (map.containsKey(enumC0233c)) {
                    name = map.get(enumC0233c).toString();
                }
            }
            boolean z3 = i3 > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
            boolean z4 = true;
            boolean z5 = true;
            boolean z6 = true;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i6 < i3 && (z4 || z5 || z6)) {
                byte b3 = bArr[i6];
                int i17 = b3 & 255;
                if (z6) {
                    if (i7 > 0) {
                        if ((b3 & 128) != 0) {
                            i7--;
                        }
                        z6 = false;
                        if (z4) {
                            if (i17 > 127 && i17 < 160) {
                                z4 = false;
                            } else if (i17 > 159 && (i17 < 192 || i17 == 215 || i17 == 247)) {
                                i14++;
                            }
                        }
                        if (z5) {
                            if (i8 > 0) {
                                if (i17 >= c && i17 != 127 && i17 <= 252) {
                                    i8--;
                                }
                                z5 = false;
                            } else if (i17 == 128 || i17 == 160 || i17 > 239) {
                                i13 = i13;
                                i12 = i12;
                                z5 = false;
                            } else if (i17 <= 160 || i17 >= 224) {
                                int i18 = i13;
                                if (i17 > 127) {
                                    i8++;
                                    int i19 = i15 + 1;
                                    int i20 = i12;
                                    i13 = i18;
                                    if (i19 > i20) {
                                        i12 = i19;
                                        i15 = i12;
                                    } else {
                                        i15 = i19;
                                        i12 = i20;
                                    }
                                } else {
                                    i13 = i18;
                                    i15 = 0;
                                }
                                i16 = 0;
                            } else {
                                i13++;
                                int i21 = i16 + 1;
                                if (i21 > i4) {
                                    i4 = i21;
                                    i16 = i4;
                                } else {
                                    i16 = i21;
                                }
                                i15 = 0;
                            }
                        }
                        i6++;
                        c = '@';
                    } else if ((b3 & 128) != 0) {
                        if ((b3 & 64) != 0) {
                            int i22 = i7 + 1;
                            if ((b3 & 32) == 0) {
                                i9++;
                                i7 = i22;
                            } else {
                                int i23 = i7 + 2;
                                if ((b3 & 16) == 0) {
                                    i10++;
                                    i7 = i23;
                                } else {
                                    i7 += 3;
                                    if ((b3 & 8) == 0) {
                                        i11++;
                                        if (z4) {
                                        }
                                        if (z5) {
                                        }
                                        i6++;
                                        c = '@';
                                    }
                                    z6 = false;
                                    if (z4) {
                                    }
                                    if (z5) {
                                    }
                                    i6++;
                                    c = '@';
                                }
                            }
                        }
                        z6 = false;
                        if (z4) {
                        }
                        if (z5) {
                        }
                        i6++;
                        c = '@';
                    }
                }
                if (z4) {
                }
                if (z5) {
                }
                i6++;
                c = '@';
            }
            int i24 = i12;
            int i25 = i13;
            if (z6 && i7 > 0) {
                z6 = false;
            }
            if (z5 && i8 > 0) {
                z5 = false;
            }
            if (!z6 || (!z3 && i9 + i10 + i11 <= 0)) {
                if (!z5 || (!p1.g.f4351b && i4 < 3 && i24 < 3)) {
                    if (!z4 || !z5) {
                        if (!z4) {
                            if (!z5) {
                                if (!z6) {
                                    name = p1.g.f4350a;
                                }
                            }
                        }
                        name = "ISO8859_1";
                    } else if (i4 == 2) {
                    }
                }
                name = "SJIS";
            }
            name = "UTF8";
        } else {
            name = cVar.name();
        }
        try {
            sb.append(new String(bArr, name));
            arrayList.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw C0234d.a();
        }
    }

    public static void c(t tVar, StringBuilder sb, int i3) {
        if (i3 * 13 > tVar.a()) {
            throw C0234d.a();
        }
        byte[] bArr = new byte[i3 * 2];
        int i4 = 0;
        while (i3 > 0) {
            int b3 = tVar.b(13);
            int i5 = (b3 % 96) | ((b3 / 96) << 8);
            int i6 = i5 + (i5 < 2560 ? 41377 : 42657);
            bArr[i4] = (byte) (i6 >> 8);
            bArr[i4 + 1] = (byte) i6;
            i4 += 2;
            i3--;
        }
        try {
            sb.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw C0234d.a();
        }
    }

    public static void d(t tVar, StringBuilder sb, int i3) {
        if (i3 * 13 > tVar.a()) {
            throw C0234d.a();
        }
        byte[] bArr = new byte[i3 * 2];
        int i4 = 0;
        while (i3 > 0) {
            int b3 = tVar.b(13);
            int i5 = (b3 % 192) | ((b3 / 192) << 8);
            int i6 = i5 + (i5 < 7936 ? 33088 : 49472);
            bArr[i4] = (byte) (i6 >> 8);
            bArr[i4 + 1] = (byte) i6;
            i4 += 2;
            i3--;
        }
        try {
            sb.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw C0234d.a();
        }
    }

    public static void e(t tVar, StringBuilder sb, int i3) {
        while (i3 >= 3) {
            if (tVar.a() < 10) {
                throw C0234d.a();
            }
            int b3 = tVar.b(10);
            if (b3 >= 1000) {
                throw C0234d.a();
            }
            sb.append(f(b3 / 100));
            sb.append(f((b3 / 10) % 10));
            sb.append(f(b3 % 10));
            i3 -= 3;
        }
        if (i3 == 2) {
            if (tVar.a() < 7) {
                throw C0234d.a();
            }
            int b4 = tVar.b(7);
            if (b4 >= 100) {
                throw C0234d.a();
            }
            sb.append(f(b4 / 10));
            sb.append(f(b4 % 10));
            return;
        }
        if (i3 == 1) {
            if (tVar.a() < 4) {
                throw C0234d.a();
            }
            int b5 = tVar.b(4);
            if (b5 >= 10) {
                throw C0234d.a();
            }
            sb.append(f(b5));
        }
    }

    public static char f(int i3) {
        char[] cArr = f237a;
        if (i3 < cArr.length) {
            return cArr[i3];
        }
        throw C0234d.a();
    }
}
