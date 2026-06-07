package p1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f4344a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4345b;
    public final float c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4346d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4347e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4348f;
    public final float g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4349i;

    public f(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f4344a = f3;
        this.f4345b = f6;
        this.c = f9;
        this.f4346d = f4;
        this.f4347e = f7;
        this.f4348f = f10;
        this.g = f5;
        this.h = f8;
        this.f4349i = f11;
    }

    public static f a(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        f b3 = b(f3, f4, f5, f6, f7, f8, f9, f10);
        float f19 = b3.f4347e;
        float f20 = b3.f4349i;
        float f21 = b3.f4348f;
        float f22 = b3.h;
        float f23 = (f19 * f20) - (f21 * f22);
        float f24 = b3.g;
        float f25 = b3.f4346d;
        float f26 = (f21 * f24) - (f25 * f20);
        float f27 = (f25 * f22) - (f19 * f24);
        float f28 = b3.c;
        float f29 = b3.f4345b;
        float f30 = (f28 * f22) - (f29 * f20);
        float f31 = b3.f4344a;
        float f32 = (f20 * f31) - (f28 * f24);
        float f33 = (f24 * f29) - (f22 * f31);
        float f34 = (f29 * f21) - (f28 * f19);
        float f35 = (f28 * f25) - (f21 * f31);
        float f36 = (f31 * f19) - (f29 * f25);
        f b4 = b(f11, f12, f13, f14, f15, f16, f17, f18);
        float f37 = b4.f4344a;
        float f38 = b4.f4346d;
        float f39 = b4.g;
        float f40 = (f38 * f30) + (f37 * f23) + (f39 * f34);
        float f41 = (f39 * f35) + (f38 * f32) + (f37 * f26);
        float f42 = f39 * f36;
        float f43 = f42 + (f38 * f33) + (f37 * f27);
        float f44 = b4.f4345b;
        float f45 = b4.f4347e;
        float f46 = b4.h;
        float f47 = (f46 * f34) + (f45 * f30) + (f44 * f23);
        float f48 = (f46 * f35) + (f45 * f32) + (f44 * f26);
        float f49 = (f45 * f33) + (f44 * f27) + (f46 * f36);
        float f50 = b4.c;
        float f51 = b4.f4348f;
        float f52 = f30 * f51;
        float f53 = b4.f4349i;
        return new f(f40, f41, f43, f47, f48, f49, (f34 * f53) + f52 + (f23 * f50), (f32 * f51) + (f26 * f50) + (f35 * f53), (f53 * f36) + (f51 * f33) + (f50 * f27));
    }

    public static f b(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = ((f3 - f5) + f7) - f9;
        float f12 = ((f4 - f6) + f8) - f10;
        if (f11 == 0.0f && f12 == 0.0f) {
            return new f(f5 - f3, f7 - f5, f3, f6 - f4, f8 - f6, f4, 0.0f, 0.0f, 1.0f);
        }
        float f13 = f5 - f7;
        float f14 = f9 - f7;
        float f15 = f6 - f8;
        float f16 = f10 - f8;
        float f17 = (f13 * f16) - (f14 * f15);
        float f18 = ((f16 * f11) - (f14 * f12)) / f17;
        float f19 = ((f13 * f12) - (f11 * f15)) / f17;
        return new f((f18 * f5) + (f5 - f3), (f19 * f9) + (f9 - f3), f3, (f18 * f6) + (f6 - f4), (f19 * f10) + (f10 - f4), f4, f18, f19, 1.0f);
    }
}
