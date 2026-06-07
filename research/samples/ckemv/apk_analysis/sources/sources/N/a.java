package N;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f652a;

    /* renamed from: b, reason: collision with root package name */
    public int f653b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f654d;

    /* renamed from: e, reason: collision with root package name */
    public long f655e;

    /* renamed from: f, reason: collision with root package name */
    public long f656f;
    public long g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public int f657i;

    public final float a(long j3) {
        long j4 = this.f655e;
        if (j3 < j4) {
            return 0.0f;
        }
        long j5 = this.g;
        if (j5 < 0 || j3 < j5) {
            return g.b(((float) (j3 - j4)) / this.f652a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.h;
        return (g.b(((float) (j3 - j5)) / this.f657i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
