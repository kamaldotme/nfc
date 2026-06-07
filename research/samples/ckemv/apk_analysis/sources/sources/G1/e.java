package G1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f239a = {2, 1, 4, 3};

    public static /* synthetic */ boolean a(int i3, int i4, int i5) {
        switch (i3) {
            case 1:
                return b(i3, i4, i5);
            case 2:
                return c(i3, i4, i5);
            case 3:
                return d(i3, i4, i5);
            case 4:
                return e(i3, i4, i5);
            case 5:
                return f(i3, i4, i5);
            case 6:
                return g(i3, i4, i5);
            case 7:
                return h(i3, i4, i5);
            default:
                return i(i3, i4, i5);
        }
    }

    public static final boolean b(int i3, int i4, int i5) {
        return ((i4 + i5) & 1) == 0;
    }

    public static final boolean c(int i3, int i4, int i5) {
        return (i4 & 1) == 0;
    }

    public static final boolean d(int i3, int i4, int i5) {
        return i5 % 3 == 0;
    }

    public static final boolean e(int i3, int i4, int i5) {
        return (i4 + i5) % 3 == 0;
    }

    public static final boolean f(int i3, int i4, int i5) {
        return (((i5 / 3) + (i4 / 2)) & 1) == 0;
    }

    public static final boolean g(int i3, int i4, int i5) {
        return (i4 * i5) % 6 == 0;
    }

    public static final boolean h(int i3, int i4, int i5) {
        return (i4 * i5) % 6 < 3;
    }

    public static final boolean i(int i3, int i4, int i5) {
        return ((((i4 * i5) % 3) + (i4 + i5)) & 1) == 0;
    }

    public static /* synthetic */ String j(int i3) {
        if (i3 == 1) {
            return "L";
        }
        if (i3 == 2) {
            return "M";
        }
        if (i3 == 3) {
            return "Q";
        }
        if (i3 == 4) {
            return "H";
        }
        throw null;
    }
}
