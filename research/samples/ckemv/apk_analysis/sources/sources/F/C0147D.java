package f;

/* renamed from: f.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147D {

    /* renamed from: d, reason: collision with root package name */
    public static C0147D f2839d;

    /* renamed from: a, reason: collision with root package name */
    public long f2840a;

    /* renamed from: b, reason: collision with root package name */
    public long f2841b;
    public int c;

    public final void a(long j3, double d3, double d4) {
        double d5 = (0.01720197f * (((float) (j3 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d5) * 0.03341960161924362d) + d5 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d5) * 0.0053d) + ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d4) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d6 = 0.01745329238474369d * d3;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d6))) / (Math.cos(asin) * Math.cos(d6));
        if (sin3 >= 1.0d) {
            this.c = 1;
            this.f2840a = -1L;
            this.f2841b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.c = 0;
                this.f2840a = -1L;
                this.f2841b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f2840a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f2841b = round;
            if (round >= j3 || this.f2840a <= j3) {
                this.c = 1;
            } else {
                this.c = 0;
            }
        }
    }
}
