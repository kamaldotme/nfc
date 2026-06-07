package q;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4396a;

    /* renamed from: e, reason: collision with root package name */
    public float f4399e;

    /* renamed from: l, reason: collision with root package name */
    public int f4404l;

    /* renamed from: b, reason: collision with root package name */
    public int f4397b = -1;
    public int c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f4398d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4400f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public C0359c[] f4401i = new C0359c[16];

    /* renamed from: j, reason: collision with root package name */
    public int f4402j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f4403k = 0;

    public i(int i3) {
        this.f4404l = i3;
    }

    public final void a(C0359c c0359c) {
        int i3 = 0;
        while (true) {
            int i4 = this.f4402j;
            if (i3 >= i4) {
                C0359c[] c0359cArr = this.f4401i;
                if (i4 >= c0359cArr.length) {
                    this.f4401i = (C0359c[]) Arrays.copyOf(c0359cArr, c0359cArr.length * 2);
                }
                C0359c[] c0359cArr2 = this.f4401i;
                int i5 = this.f4402j;
                c0359cArr2[i5] = c0359c;
                this.f4402j = i5 + 1;
                return;
            }
            if (this.f4401i[i3] == c0359c) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void b(C0359c c0359c) {
        int i3 = this.f4402j;
        int i4 = 0;
        while (i4 < i3) {
            if (this.f4401i[i4] == c0359c) {
                while (i4 < i3 - 1) {
                    C0359c[] c0359cArr = this.f4401i;
                    int i5 = i4 + 1;
                    c0359cArr[i4] = c0359cArr[i5];
                    i4 = i5;
                }
                this.f4402j--;
                return;
            }
            i4++;
        }
    }

    public final void c() {
        this.f4404l = 5;
        this.f4398d = 0;
        this.f4397b = -1;
        this.c = -1;
        this.f4399e = 0.0f;
        this.f4400f = false;
        int i3 = this.f4402j;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f4401i[i4] = null;
        }
        this.f4402j = 0;
        this.f4403k = 0;
        this.f4396a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public final void d(C0359c c0359c) {
        int i3 = this.f4402j;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f4401i[i4].h(c0359c, false);
        }
        this.f4402j = 0;
    }

    public final String toString() {
        return "" + this.f4397b;
    }
}
