package Y1;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: b, reason: collision with root package name */
    public static final d f1147b = new e();
    public static final a c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.e, Y1.d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Y1.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        Integer num = T1.a.f878a;
        c = (num == null || num.intValue() >= 34) ? new e() : new c();
    }

    public abstract int a(int i3);

    public abstract int b();

    public int c(int i3, int i4) {
        int b3;
        int i5;
        int i6;
        if (i4 <= i3) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i3) + ", " + Integer.valueOf(i4) + ").").toString());
        }
        int i7 = i4 - i3;
        if (i7 > 0 || i7 == Integer.MIN_VALUE) {
            if (((-i7) & i7) == i7) {
                i6 = a(31 - Integer.numberOfLeadingZeros(i7));
                return i3 + i6;
            }
            do {
                b3 = b() >>> 1;
                i5 = b3 % i7;
            } while ((i7 - 1) + (b3 - i5) < 0);
            i6 = i5;
            return i3 + i6;
        }
        while (true) {
            int b4 = b();
            if (i3 <= b4 && b4 < i4) {
                return b4;
            }
        }
    }
}
