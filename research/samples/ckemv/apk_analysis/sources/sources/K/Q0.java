package k;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3613a;

    /* renamed from: b, reason: collision with root package name */
    public int f3614b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f3615d;

    /* renamed from: e, reason: collision with root package name */
    public int f3616e;

    /* renamed from: f, reason: collision with root package name */
    public int f3617f;
    public boolean g;
    public boolean h;

    public final void a(int i3, int i4) {
        this.c = i3;
        this.f3615d = i4;
        this.h = true;
        if (this.g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f3613a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f3614b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f3613a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f3614b = i4;
        }
    }
}
