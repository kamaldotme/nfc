package C1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113a;

    /* renamed from: b, reason: collision with root package name */
    public int f114b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f115d;

    /* renamed from: e, reason: collision with root package name */
    public int f116e;

    /* renamed from: f, reason: collision with root package name */
    public int f117f;

    public boolean a() {
        int i3 = this.f114b;
        int i4 = 2;
        if ((i3 & 7) != 0) {
            int i5 = this.f116e;
            int i6 = this.c;
            if (((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 112) != 0) {
            int i7 = this.f116e;
            int i8 = this.f115d;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 4) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 1792) != 0) {
            int i9 = this.f117f;
            int i10 = this.c;
            if ((((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8) & i3) == 0) {
                return false;
            }
        }
        if ((i3 & 28672) != 0) {
            int i11 = this.f117f;
            int i12 = this.f115d;
            if (i11 > i12) {
                i4 = 1;
            } else if (i11 != i12) {
                i4 = 4;
            }
            if ((i3 & (i4 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean b(int i3) {
        if (i3 != -1) {
            return this.f115d == (i3 % 3) * 3;
        }
        return false;
    }

    public void c() {
        this.f117f = (this.f115d / 3) + ((this.f116e / 30) * 3);
    }

    public String toString() {
        switch (this.f113a) {
            case 1:
                return this.f117f + "|" + this.f116e;
            default:
                return super.toString();
        }
    }

    public a(int i3, int i4, int i5, int i6, int i7) {
        this.f113a = i7;
        switch (i7) {
            case 1:
                this.f117f = -1;
                this.f114b = i3;
                this.c = i4;
                this.f115d = i5;
                this.f116e = i6;
                return;
            default:
                this.f114b = i3;
                this.c = i6;
                this.f115d = i4;
                this.f116e = i5;
                this.f117f = i4 + i5;
                return;
        }
    }
}
