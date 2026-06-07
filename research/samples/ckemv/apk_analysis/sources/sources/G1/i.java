package G1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f251e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f, reason: collision with root package name */
    public static final i[] f252f = a();

    /* renamed from: a, reason: collision with root package name */
    public final int f253a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f254b;
    public final F0.e[] c;

    /* renamed from: d, reason: collision with root package name */
    public final int f255d;

    public i(int i3, int[] iArr, F0.e... eVarArr) {
        this.f253a = i3;
        this.f254b = iArr;
        this.c = eVarArr;
        F0.e eVar = eVarArr[0];
        int i4 = eVar.f166b;
        int i5 = 0;
        for (A1.i iVar : (A1.i[]) eVar.c) {
            i5 += (iVar.c + i4) * iVar.f51b;
        }
        this.f255d = i5;
    }

    public static i[] a() {
        return new i[]{new i(1, new int[0], new F0.e(7, new A1.i[]{new A1.i(1, 19, 1)}), new F0.e(10, new A1.i[]{new A1.i(1, 16, 1)}), new F0.e(13, new A1.i[]{new A1.i(1, 13, 1)}), new F0.e(17, new A1.i[]{new A1.i(1, 9, 1)})), new i(2, new int[]{6, 18}, new F0.e(10, new A1.i[]{new A1.i(1, 34, 1)}), new F0.e(16, new A1.i[]{new A1.i(1, 28, 1)}), new F0.e(22, new A1.i[]{new A1.i(1, 22, 1)}), new F0.e(28, new A1.i[]{new A1.i(1, 16, 1)})), new i(3, new int[]{6, 22}, new F0.e(15, new A1.i[]{new A1.i(1, 55, 1)}), new F0.e(26, new A1.i[]{new A1.i(1, 44, 1)}), new F0.e(18, new A1.i[]{new A1.i(2, 17, 1)}), new F0.e(22, new A1.i[]{new A1.i(2, 13, 1)})), new i(4, new int[]{6, 26}, new F0.e(20, new A1.i[]{new A1.i(1, 80, 1)}), new F0.e(18, new A1.i[]{new A1.i(2, 32, 1)}), new F0.e(26, new A1.i[]{new A1.i(2, 24, 1)}), new F0.e(16, new A1.i[]{new A1.i(4, 9, 1)})), new i(5, new int[]{6, 30}, new F0.e(26, new A1.i[]{new A1.i(1, 108, 1)}), new F0.e(24, new A1.i[]{new A1.i(2, 43, 1)}), new F0.e(18, new A1.i[]{new A1.i(2, 15, 1), new A1.i(2, 16, 1)}), new F0.e(22, new A1.i[]{new A1.i(2, 11, 1), new A1.i(2, 12, 1)})), new i(6, new int[]{6, 34}, new F0.e(18, new A1.i[]{new A1.i(2, 68, 1)}), new F0.e(16, new A1.i[]{new A1.i(4, 27, 1)}), new F0.e(24, new A1.i[]{new A1.i(4, 19, 1)}), new F0.e(28, new A1.i[]{new A1.i(4, 15, 1)})), new i(7, new int[]{6, 22, 38}, new F0.e(20, new A1.i[]{new A1.i(2, 78, 1)}), new F0.e(18, new A1.i[]{new A1.i(4, 31, 1)}), new F0.e(18, new A1.i[]{new A1.i(2, 14, 1), new A1.i(4, 15, 1)}), new F0.e(26, new A1.i[]{new A1.i(4, 13, 1), new A1.i(1, 14, 1)})), new i(8, new int[]{6, 24, 42}, new F0.e(24, new A1.i[]{new A1.i(2, 97, 1)}), new F0.e(22, new A1.i[]{new A1.i(2, 38, 1), new A1.i(2, 39, 1)}), new F0.e(22, new A1.i[]{new A1.i(4, 18, 1), new A1.i(2, 19, 1)}), new F0.e(26, new A1.i[]{new A1.i(4, 14, 1), new A1.i(2, 15, 1)})), new i(9, new int[]{6, 26, 46}, new F0.e(30, new A1.i[]{new A1.i(2, 116, 1)}), new F0.e(22, new A1.i[]{new A1.i(3, 36, 1), new A1.i(2, 37, 1)}), new F0.e(20, new A1.i[]{new A1.i(4, 16, 1), new A1.i(4, 17, 1)}), new F0.e(24, new A1.i[]{new A1.i(4, 12, 1), new A1.i(4, 13, 1)})), new i(10, new int[]{6, 28, 50}, new F0.e(18, new A1.i[]{new A1.i(2, 68, 1), new A1.i(2, 69, 1)}), new F0.e(26, new A1.i[]{new A1.i(4, 43, 1), new A1.i(1, 44, 1)}), new F0.e(24, new A1.i[]{new A1.i(6, 19, 1), new A1.i(2, 20, 1)}), new F0.e(28, new A1.i[]{new A1.i(6, 15, 1), new A1.i(2, 16, 1)})), new i(11, new int[]{6, 30, 54}, new F0.e(20, new A1.i[]{new A1.i(4, 81, 1)}), new F0.e(30, new A1.i[]{new A1.i(1, 50, 1), new A1.i(4, 51, 1)}), new F0.e(28, new A1.i[]{new A1.i(4, 22, 1), new A1.i(4, 23, 1)}), new F0.e(24, new A1.i[]{new A1.i(3, 12, 1), new A1.i(8, 13, 1)})), new i(12, new int[]{6, 32, 58}, new F0.e(24, new A1.i[]{new A1.i(2, 92, 1), new A1.i(2, 93, 1)}), new F0.e(22, new A1.i[]{new A1.i(6, 36, 1), new A1.i(2, 37, 1)}), new F0.e(26, new A1.i[]{new A1.i(4, 20, 1), new A1.i(6, 21, 1)}), new F0.e(28, new A1.i[]{new A1.i(7, 14, 1), new A1.i(4, 15, 1)})), new i(13, new int[]{6, 34, 62}, new F0.e(26, new A1.i[]{new A1.i(4, 107, 1)}), new F0.e(22, new A1.i[]{new A1.i(8, 37, 1), new A1.i(1, 38, 1)}), new F0.e(24, new A1.i[]{new A1.i(8, 20, 1), new A1.i(4, 21, 1)}), new F0.e(22, new A1.i[]{new A1.i(12, 11, 1), new A1.i(4, 12, 1)})), new i(14, new int[]{6, 26, 46, 66}, new F0.e(30, new A1.i[]{new A1.i(3, 115, 1), new A1.i(1, 116, 1)}), new F0.e(24, new A1.i[]{new A1.i(4, 40, 1), new A1.i(5, 41, 1)}), new F0.e(20, new A1.i[]{new A1.i(11, 16, 1), new A1.i(5, 17, 1)}), new F0.e(24, new A1.i[]{new A1.i(11, 12, 1), new A1.i(5, 13, 1)})), new i(15, new int[]{6, 26, 48, 70}, new F0.e(22, new A1.i[]{new A1.i(5, 87, 1), new A1.i(1, 88, 1)}), new F0.e(24, new A1.i[]{new A1.i(5, 41, 1), new A1.i(5, 42, 1)}), new F0.e(30, new A1.i[]{new A1.i(5, 24, 1), new A1.i(7, 25, 1)}), new F0.e(24, new A1.i[]{new A1.i(11, 12, 1), new A1.i(7, 13, 1)})), new i(16, new int[]{6, 26, 50, 74}, new F0.e(24, new A1.i[]{new A1.i(5, 98, 1), new A1.i(1, 99, 1)}), new F0.e(28, new A1.i[]{new A1.i(7, 45, 1), new A1.i(3, 46, 1)}), new F0.e(24, new A1.i[]{new A1.i(15, 19, 1), new A1.i(2, 20, 1)}), new F0.e(30, new A1.i[]{new A1.i(3, 15, 1), new A1.i(13, 16, 1)})), new i(17, new int[]{6, 30, 54, 78}, new F0.e(28, new A1.i[]{new A1.i(1, 107, 1), new A1.i(5, 108, 1)}), new F0.e(28, new A1.i[]{new A1.i(10, 46, 1), new A1.i(1, 47, 1)}), new F0.e(28, new A1.i[]{new A1.i(1, 22, 1), new A1.i(15, 23, 1)}), new F0.e(28, new A1.i[]{new A1.i(2, 14, 1), new A1.i(17, 15, 1)})), new i(18, new int[]{6, 30, 56, 82}, new F0.e(30, new A1.i[]{new A1.i(5, 120, 1), new A1.i(1, 121, 1)}), new F0.e(26, new A1.i[]{new A1.i(9, 43, 1), new A1.i(4, 44, 1)}), new F0.e(28, new A1.i[]{new A1.i(17, 22, 1), new A1.i(1, 23, 1)}), new F0.e(28, new A1.i[]{new A1.i(2, 14, 1), new A1.i(19, 15, 1)})), new i(19, new int[]{6, 30, 58, 86}, new F0.e(28, new A1.i[]{new A1.i(3, 113, 1), new A1.i(4, 114, 1)}), new F0.e(26, new A1.i[]{new A1.i(3, 44, 1), new A1.i(11, 45, 1)}), new F0.e(26, new A1.i[]{new A1.i(17, 21, 1), new A1.i(4, 22, 1)}), new F0.e(26, new A1.i[]{new A1.i(9, 13, 1), new A1.i(16, 14, 1)})), new i(20, new int[]{6, 34, 62, 90}, new F0.e(28, new A1.i[]{new A1.i(3, 107, 1), new A1.i(5, 108, 1)}), new F0.e(26, new A1.i[]{new A1.i(3, 41, 1), new A1.i(13, 42, 1)}), new F0.e(30, new A1.i[]{new A1.i(15, 24, 1), new A1.i(5, 25, 1)}), new F0.e(28, new A1.i[]{new A1.i(15, 15, 1), new A1.i(10, 16, 1)})), new i(21, new int[]{6, 28, 50, 72, 94}, new F0.e(28, new A1.i[]{new A1.i(4, 116, 1), new A1.i(4, 117, 1)}), new F0.e(26, new A1.i[]{new A1.i(17, 42, 1)}), new F0.e(28, new A1.i[]{new A1.i(17, 22, 1), new A1.i(6, 23, 1)}), new F0.e(30, new A1.i[]{new A1.i(19, 16, 1), new A1.i(6, 17, 1)})), new i(22, new int[]{6, 26, 50, 74, 98}, new F0.e(28, new A1.i[]{new A1.i(2, 111, 1), new A1.i(7, 112, 1)}), new F0.e(28, new A1.i[]{new A1.i(17, 46, 1)}), new F0.e(30, new A1.i[]{new A1.i(7, 24, 1), new A1.i(16, 25, 1)}), new F0.e(24, new A1.i[]{new A1.i(34, 13, 1)})), new i(23, new int[]{6, 30, 54, 78, 102}, new F0.e(30, new A1.i[]{new A1.i(4, 121, 1), new A1.i(5, 122, 1)}), new F0.e(28, new A1.i[]{new A1.i(4, 47, 1), new A1.i(14, 48, 1)}), new F0.e(30, new A1.i[]{new A1.i(11, 24, 1), new A1.i(14, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(16, 15, 1), new A1.i(14, 16, 1)})), new i(24, new int[]{6, 28, 54, 80, 106}, new F0.e(30, new A1.i[]{new A1.i(6, 117, 1), new A1.i(4, 118, 1)}), new F0.e(28, new A1.i[]{new A1.i(6, 45, 1), new A1.i(14, 46, 1)}), new F0.e(30, new A1.i[]{new A1.i(11, 24, 1), new A1.i(16, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(30, 16, 1), new A1.i(2, 17, 1)})), new i(25, new int[]{6, 32, 58, 84, 110}, new F0.e(26, new A1.i[]{new A1.i(8, 106, 1), new A1.i(4, 107, 1)}), new F0.e(28, new A1.i[]{new A1.i(8, 47, 1), new A1.i(13, 48, 1)}), new F0.e(30, new A1.i[]{new A1.i(7, 24, 1), new A1.i(22, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(22, 15, 1), new A1.i(13, 16, 1)})), new i(26, new int[]{6, 30, 58, 86, 114}, new F0.e(28, new A1.i[]{new A1.i(10, 114, 1), new A1.i(2, 115, 1)}), new F0.e(28, new A1.i[]{new A1.i(19, 46, 1), new A1.i(4, 47, 1)}), new F0.e(28, new A1.i[]{new A1.i(28, 22, 1), new A1.i(6, 23, 1)}), new F0.e(30, new A1.i[]{new A1.i(33, 16, 1), new A1.i(4, 17, 1)})), new i(27, new int[]{6, 34, 62, 90, 118}, new F0.e(30, new A1.i[]{new A1.i(8, 122, 1), new A1.i(4, 123, 1)}), new F0.e(28, new A1.i[]{new A1.i(22, 45, 1), new A1.i(3, 46, 1)}), new F0.e(30, new A1.i[]{new A1.i(8, 23, 1), new A1.i(26, 24, 1)}), new F0.e(30, new A1.i[]{new A1.i(12, 15, 1), new A1.i(28, 16, 1)})), new i(28, new int[]{6, 26, 50, 74, 98, 122}, new F0.e(30, new A1.i[]{new A1.i(3, 117, 1), new A1.i(10, 118, 1)}), new F0.e(28, new A1.i[]{new A1.i(3, 45, 1), new A1.i(23, 46, 1)}), new F0.e(30, new A1.i[]{new A1.i(4, 24, 1), new A1.i(31, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(11, 15, 1), new A1.i(31, 16, 1)})), new i(29, new int[]{6, 30, 54, 78, 102, 126}, new F0.e(30, new A1.i[]{new A1.i(7, 116, 1), new A1.i(7, 117, 1)}), new F0.e(28, new A1.i[]{new A1.i(21, 45, 1), new A1.i(7, 46, 1)}), new F0.e(30, new A1.i[]{new A1.i(1, 23, 1), new A1.i(37, 24, 1)}), new F0.e(30, new A1.i[]{new A1.i(19, 15, 1), new A1.i(26, 16, 1)})), new i(30, new int[]{6, 26, 52, 78, 104, 130}, new F0.e(30, new A1.i[]{new A1.i(5, 115, 1), new A1.i(10, 116, 1)}), new F0.e(28, new A1.i[]{new A1.i(19, 47, 1), new A1.i(10, 48, 1)}), new F0.e(30, new A1.i[]{new A1.i(15, 24, 1), new A1.i(25, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(23, 15, 1), new A1.i(25, 16, 1)})), new i(31, new int[]{6, 30, 56, 82, 108, 134}, new F0.e(30, new A1.i[]{new A1.i(13, 115, 1), new A1.i(3, 116, 1)}), new F0.e(28, new A1.i[]{new A1.i(2, 46, 1), new A1.i(29, 47, 1)}), new F0.e(30, new A1.i[]{new A1.i(42, 24, 1), new A1.i(1, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(23, 15, 1), new A1.i(28, 16, 1)})), new i(32, new int[]{6, 34, 60, 86, 112, 138}, new F0.e(30, new A1.i[]{new A1.i(17, 115, 1)}), new F0.e(28, new A1.i[]{new A1.i(10, 46, 1), new A1.i(23, 47, 1)}), new F0.e(30, new A1.i[]{new A1.i(10, 24, 1), new A1.i(35, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(19, 15, 1), new A1.i(35, 16, 1)})), new i(33, new int[]{6, 30, 58, 86, 114, 142}, new F0.e(30, new A1.i[]{new A1.i(17, 115, 1), new A1.i(1, 116, 1)}), new F0.e(28, new A1.i[]{new A1.i(14, 46, 1), new A1.i(21, 47, 1)}), new F0.e(30, new A1.i[]{new A1.i(29, 24, 1), new A1.i(19, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(11, 15, 1), new A1.i(46, 16, 1)})), new i(34, new int[]{6, 34, 62, 90, 118, 146}, new F0.e(30, new A1.i[]{new A1.i(13, 115, 1), new A1.i(6, 116, 1)}), new F0.e(28, new A1.i[]{new A1.i(14, 46, 1), new A1.i(23, 47, 1)}), new F0.e(30, new A1.i[]{new A1.i(44, 24, 1), new A1.i(7, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(59, 16, 1), new A1.i(1, 17, 1)})), new i(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new F0.e(30, new A1.i[]{new A1.i(12, 121, 1), new A1.i(7, 122, 1)}), new F0.e(28, new A1.i[]{new A1.i(12, 47, 1), new A1.i(26, 48, 1)}), new F0.e(30, new A1.i[]{new A1.i(39, 24, 1), new A1.i(14, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(22, 15, 1), new A1.i(41, 16, 1)})), new i(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new F0.e(30, new A1.i[]{new A1.i(6, 121, 1), new A1.i(14, 122, 1)}), new F0.e(28, new A1.i[]{new A1.i(6, 47, 1), new A1.i(34, 48, 1)}), new F0.e(30, new A1.i[]{new A1.i(46, 24, 1), new A1.i(10, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(2, 15, 1), new A1.i(64, 16, 1)})), new i(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new F0.e(30, new A1.i[]{new A1.i(17, 122, 1), new A1.i(4, 123, 1)}), new F0.e(28, new A1.i[]{new A1.i(29, 46, 1), new A1.i(14, 47, 1)}), new F0.e(30, new A1.i[]{new A1.i(49, 24, 1), new A1.i(10, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(24, 15, 1), new A1.i(46, 16, 1)})), new i(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new F0.e(30, new A1.i[]{new A1.i(4, 122, 1), new A1.i(18, 123, 1)}), new F0.e(28, new A1.i[]{new A1.i(13, 46, 1), new A1.i(32, 47, 1)}), new F0.e(30, new A1.i[]{new A1.i(48, 24, 1), new A1.i(14, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(42, 15, 1), new A1.i(32, 16, 1)})), new i(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new F0.e(30, new A1.i[]{new A1.i(20, 117, 1), new A1.i(4, 118, 1)}), new F0.e(28, new A1.i[]{new A1.i(40, 47, 1), new A1.i(7, 48, 1)}), new F0.e(30, new A1.i[]{new A1.i(43, 24, 1), new A1.i(22, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(10, 15, 1), new A1.i(67, 16, 1)})), new i(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new F0.e(30, new A1.i[]{new A1.i(19, 118, 1), new A1.i(6, 119, 1)}), new F0.e(28, new A1.i[]{new A1.i(18, 47, 1), new A1.i(31, 48, 1)}), new F0.e(30, new A1.i[]{new A1.i(34, 24, 1), new A1.i(34, 25, 1)}), new F0.e(30, new A1.i[]{new A1.i(20, 15, 1), new A1.i(61, 16, 1)}))};
    }

    public static i b(int i3) {
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        for (int i6 = 0; i6 < 34; i6++) {
            int i7 = f251e[i6];
            if (i7 == i3) {
                return c(i6 + 7);
            }
            int bitCount = Integer.bitCount(i7 ^ i3);
            if (bitCount < i4) {
                i5 = i6 + 7;
                i4 = bitCount;
            }
        }
        if (i4 <= 3) {
            return c(i5);
        }
        return null;
    }

    public static i c(int i3) {
        if (i3 <= 0 || i3 > 40) {
            throw new IllegalArgumentException();
        }
        return f252f[i3 - 1];
    }

    public final String toString() {
        return String.valueOf(this.f253a);
    }
}
