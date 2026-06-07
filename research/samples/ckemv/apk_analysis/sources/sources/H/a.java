package H;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f256e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f257a;

    /* renamed from: b, reason: collision with root package name */
    public final int f258b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public char f259d;

    static {
        for (int i3 = 0; i3 < 1792; i3++) {
            f256e[i3] = Character.getDirectionality(i3);
        }
    }

    public a(CharSequence charSequence) {
        this.f257a = charSequence;
        this.f258b = charSequence.length();
    }

    public final byte a() {
        int i3 = this.c - 1;
        CharSequence charSequence = this.f257a;
        char charAt = charSequence.charAt(i3);
        this.f259d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.c);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c--;
        char c = this.f259d;
        return c < 1792 ? f256e[c] : Character.getDirectionality(c);
    }
}
