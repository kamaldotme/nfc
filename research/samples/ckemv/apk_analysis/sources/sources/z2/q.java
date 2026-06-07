package z2;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5355a;

    /* renamed from: b, reason: collision with root package name */
    public int f5356b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5357d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5358e;

    /* renamed from: f, reason: collision with root package name */
    public q f5359f;
    public q g;

    public q() {
        this.f5355a = new byte[8192];
        this.f5358e = true;
        this.f5357d = false;
    }

    public final q a() {
        q qVar = this.f5359f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.g;
        X1.g.b(qVar2);
        qVar2.f5359f = this.f5359f;
        q qVar3 = this.f5359f;
        X1.g.b(qVar3);
        qVar3.g = this.g;
        this.f5359f = null;
        this.g = null;
        return qVar;
    }

    public final void b(q qVar) {
        qVar.g = this;
        qVar.f5359f = this.f5359f;
        q qVar2 = this.f5359f;
        X1.g.b(qVar2);
        qVar2.g = qVar;
        this.f5359f = qVar;
    }

    public final q c() {
        this.f5357d = true;
        return new q(this.f5355a, this.f5356b, this.c, true);
    }

    public final void d(q qVar, int i3) {
        if (!qVar.f5358e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i4 = qVar.c;
        int i5 = i4 + i3;
        byte[] bArr = qVar.f5355a;
        if (i5 > 8192) {
            if (qVar.f5357d) {
                throw new IllegalArgumentException();
            }
            int i6 = qVar.f5356b;
            if (i5 - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            L1.j.R(0, i6, i4, bArr, bArr);
            qVar.c -= qVar.f5356b;
            qVar.f5356b = 0;
        }
        int i7 = qVar.c;
        int i8 = this.f5356b;
        L1.j.R(i7, i8, i8 + i3, this.f5355a, bArr);
        qVar.c += i3;
        this.f5356b += i3;
    }

    public q(byte[] bArr, int i3, int i4, boolean z3) {
        X1.g.e(bArr, "data");
        this.f5355a = bArr;
        this.f5356b = i3;
        this.c = i4;
        this.f5357d = z3;
        this.f5358e = false;
    }
}
