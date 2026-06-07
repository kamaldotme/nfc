package z2;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i implements Serializable, Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final i f5338e = new i(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5339b;
    public transient int c;

    /* renamed from: d, reason: collision with root package name */
    public transient String f5340d;

    public i(byte[] bArr) {
        X1.g.e(bArr, "data");
        this.f5339b = bArr;
    }

    public String a() {
        byte[] bArr = a.f5326a;
        byte[] bArr2 = this.f5339b;
        X1.g.e(bArr2, "<this>");
        X1.g.e(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte b3 = bArr2[i3];
            int i5 = i3 + 2;
            byte b4 = bArr2[i3 + 1];
            i3 += 3;
            byte b5 = bArr2[i5];
            bArr3[i4] = bArr[(b3 & 255) >> 2];
            bArr3[i4 + 1] = bArr[((b3 & 3) << 4) | ((b4 & 255) >> 4)];
            int i6 = i4 + 3;
            bArr3[i4 + 2] = bArr[((b4 & 15) << 2) | ((b5 & 255) >> 6)];
            i4 += 4;
            bArr3[i6] = bArr[b5 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b6 = bArr2[i3];
            bArr3[i4] = bArr[(b6 & 255) >> 2];
            bArr3[i4 + 1] = bArr[(b6 & 3) << 4];
            bArr3[i4 + 2] = 61;
            bArr3[i4 + 3] = 61;
        } else if (length2 == 2) {
            int i7 = i3 + 1;
            byte b7 = bArr2[i3];
            byte b8 = bArr2[i7];
            bArr3[i4] = bArr[(b7 & 255) >> 2];
            bArr3[i4 + 1] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr3[i4 + 2] = bArr[(b8 & 15) << 2];
            bArr3[i4 + 3] = 61;
        }
        return new String(bArr3, d2.a.f2653a);
    }

    public i b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f5339b, 0, c());
        byte[] digest = messageDigest.digest();
        X1.g.b(digest);
        return new i(digest);
    }

    public int c() {
        return this.f5339b.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        X1.g.e(iVar, "other");
        int c = c();
        int c3 = iVar.c();
        int min = Math.min(c, c3);
        for (int i3 = 0; i3 < min; i3++) {
            int f3 = f(i3) & 255;
            int f4 = iVar.f(i3) & 255;
            if (f3 == f4) {
            }
        }
        if (c == c3) {
            return 0;
        }
    }

    public String d() {
        byte[] bArr = this.f5339b;
        char[] cArr = new char[bArr.length * 2];
        int i3 = 0;
        for (byte b3 : bArr) {
            int i4 = i3 + 1;
            char[] cArr2 = A2.b.f62a;
            cArr[i3] = cArr2[(b3 >> 4) & 15];
            i3 += 2;
            cArr[i4] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.f5339b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int c = iVar.c();
            byte[] bArr = this.f5339b;
            if (c == bArr.length && iVar.g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i3) {
        return this.f5339b[i3];
    }

    public boolean g(int i3, byte[] bArr, int i4, int i5) {
        X1.g.e(bArr, "other");
        if (i3 >= 0) {
            byte[] bArr2 = this.f5339b;
            if (i3 <= bArr2.length - i5 && i4 >= 0 && i4 <= bArr.length - i5 && v0.f.j(i3, i4, i5, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(i iVar, int i3) {
        X1.g.e(iVar, "other");
        return iVar.g(0, this.f5339b, 0, i3);
    }

    public int hashCode() {
        int i3 = this.c;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Arrays.hashCode(this.f5339b);
        this.c = hashCode;
        return hashCode;
    }

    public i i() {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f5339b;
            if (i3 >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i3];
            if (b3 >= 65 && b3 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                X1.g.d(copyOf, "copyOf(this, size)");
                copyOf[i3] = (byte) (b3 + 32);
                for (int i4 = i3 + 1; i4 < copyOf.length; i4++) {
                    byte b4 = copyOf[i4];
                    if (b4 >= 65 && b4 <= 90) {
                        copyOf[i4] = (byte) (b4 + 32);
                    }
                }
                return new i(copyOf);
            }
            i3++;
        }
    }

    public final String j() {
        String str = this.f5340d;
        if (str != null) {
            return str;
        }
        byte[] e3 = e();
        X1.g.e(e3, "<this>");
        String str2 = new String(e3, d2.a.f2653a);
        this.f5340d = str2;
        return str2;
    }

    public void k(f fVar, int i3) {
        X1.g.e(fVar, "buffer");
        fVar.I(0, i3, this.f5339b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0120, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0124, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00c8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0163, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x016a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x015c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x019e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a1, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01a4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        i iVar;
        byte b3;
        int i3;
        byte[] bArr = this.f5339b;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                int i7 = i6 + 1;
                if (i6 == 64) {
                    break;
                }
                if ((b4 != 10 && b4 != 13 && ((b4 >= 0 && b4 < 32) || (Byte.MAX_VALUE <= b4 && b4 < 160))) || b4 == 65533) {
                    break;
                }
                i5 += b4 < 65536 ? 1 : 2;
                i4++;
                while (true) {
                    i6 = i7;
                    if (i4 < length && (b3 = bArr[i4]) >= 0) {
                        i4++;
                        i7 = i6 + 1;
                        if (i6 == 64) {
                            break loop0;
                        }
                        if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (Byte.MAX_VALUE <= b3 && b3 < 160))) || b3 == 65533) {
                            break loop0;
                        }
                        i5 += b3 < 65536 ? 1 : 2;
                    }
                }
            } else if ((b4 >> 5) == -2) {
                int i8 = i4 + 1;
                if (length > i8) {
                    byte b5 = bArr[i8];
                    if ((b5 & 192) == 128) {
                        int i9 = (b5 ^ 3968) ^ (b4 << 6);
                        if (i9 >= 128) {
                            i3 = i6 + 1;
                            if (i6 == 64) {
                                break;
                            }
                            if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                break;
                            }
                            i5 += i9 < 65536 ? 1 : 2;
                            i4 += 2;
                            i6 = i3;
                        }
                    }
                }
            } else if ((b4 >> 4) == -2) {
                int i10 = i4 + 2;
                if (length > i10) {
                    byte b6 = bArr[i4 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i10];
                        if ((b7 & 192) == 128) {
                            int i11 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b4 << 12);
                            if (i11 >= 2048) {
                                if (55296 > i11 || i11 >= 57344) {
                                    i3 = i6 + 1;
                                    if (i6 == 64) {
                                        break;
                                    }
                                    if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                        break;
                                    }
                                    i5 += i11 < 65536 ? 1 : 2;
                                    i4 += 3;
                                    i6 = i3;
                                }
                            }
                        }
                    }
                }
            } else if ((b4 >> 3) == -2) {
                int i12 = i4 + 3;
                if (length > i12) {
                    byte b8 = bArr[i4 + 1];
                    if ((b8 & 192) == 128) {
                        byte b9 = bArr[i4 + 2];
                        if ((b9 & 192) == 128) {
                            byte b10 = bArr[i12];
                            if ((b10 & 192) == 128) {
                                int i13 = (((b10 ^ 3678080) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b4 << 18);
                                if (i13 <= 1114111) {
                                    if (55296 > i13 || i13 >= 57344) {
                                        if (i13 >= 65536) {
                                            i3 = i6 + 1;
                                            if (i6 == 64) {
                                                break;
                                            }
                                            if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                                break;
                                            }
                                            i5 += i13 < 65536 ? 1 : 2;
                                            i4 += 4;
                                            i6 = i3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i5 != -1) {
            String j3 = j();
            String substring = j3.substring(0, i5);
            X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String T2 = d2.l.T(d2.l.T(d2.l.T(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i5 >= j3.length()) {
                return "[text=" + T2 + ']';
            }
            return "[size=" + bArr.length + " text=" + T2 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + d() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 == bArr.length) {
            iVar = this;
        } else {
            u2.l.e(64, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            X1.g.d(copyOfRange, "copyOfRange(...)");
            iVar = new i(copyOfRange);
        }
        sb.append(iVar.d());
        sb.append("…]");
        return sb.toString();
    }
}
