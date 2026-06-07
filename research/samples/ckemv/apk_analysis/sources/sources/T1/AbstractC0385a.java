package t1;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0385a {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f4901b;

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f4902d;

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f4900a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static final char[] c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f4903e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f4901b = cArr;
        f4902d = cArr;
    }

    public static void a(int i3, int i4, int[] iArr) {
        int i5 = ((i3 << 8) + i4) - 1;
        int i6 = i5 / 1600;
        iArr[0] = i6;
        int i7 = i5 - (i6 * 1600);
        int i8 = i7 / 40;
        iArr[1] = i8;
        iArr[2] = i7 - (i8 * 40);
    }

    public static int b(int i3, int i4) {
        int i5 = i3 - (((i4 * 149) % 255) + 1);
        return i5 >= 0 ? i5 : i5 + 256;
    }
}
