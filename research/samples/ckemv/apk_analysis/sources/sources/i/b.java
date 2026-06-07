package I;

import q.C0359c;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f291b;
    public int c;

    public b(int i3) {
        this.f290a = 0;
        if (i3 > 0) {
            this.f291b = new Object[i3];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        switch (this.f290a) {
            case 0:
                int i3 = this.c;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object[] objArr = this.f291b;
                Object obj = objArr[i4];
                objArr[i4] = null;
                this.c = i3 - 1;
                return obj;
            default:
                int i5 = this.c;
                if (i5 <= 0) {
                    return null;
                }
                int i6 = i5 - 1;
                Object[] objArr2 = this.f291b;
                Object obj2 = objArr2[i6];
                objArr2[i6] = null;
                this.c = i5 - 1;
                return obj2;
        }
    }

    public void b(C0359c c0359c) {
        int i3 = this.c;
        Object[] objArr = this.f291b;
        if (i3 < objArr.length) {
            objArr[i3] = c0359c;
            this.c = i3 + 1;
        }
    }

    public boolean c(Object obj) {
        int i3 = 0;
        while (true) {
            int i4 = this.c;
            Object[] objArr = this.f291b;
            if (i3 >= i4) {
                if (i4 >= objArr.length) {
                    return false;
                }
                objArr[i4] = obj;
                this.c = i4 + 1;
                return true;
            }
            if (objArr[i3] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i3++;
        }
    }

    public b() {
        this.f290a = 1;
        this.f291b = new Object[256];
    }
}
