package v0;

import androidx.work.OverwritingInputMerger;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f5091a;

    /* renamed from: b, reason: collision with root package name */
    public int f5092b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5093d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.g f5094e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.g f5095f;
    public final long g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public long f5096i;

    /* renamed from: j, reason: collision with root package name */
    public m0.d f5097j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5098k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5099l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5100m;

    /* renamed from: n, reason: collision with root package name */
    public long f5101n;

    /* renamed from: o, reason: collision with root package name */
    public final long f5102o;

    /* renamed from: p, reason: collision with root package name */
    public final long f5103p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5104q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5105r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5106s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5107t;

    /* renamed from: u, reason: collision with root package name */
    public final long f5108u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5109v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5110w;

    static {
        X1.g.d(m0.r.b("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public o(String str, int i3, String str2, String str3, m0.g gVar, m0.g gVar2, long j3, long j4, long j5, m0.d dVar, int i4, int i5, long j6, long j7, long j8, long j9, boolean z3, int i6, int i7, int i8, long j10, int i9, int i10) {
        X1.g.e(str, "id");
        X.d.o("state", i3);
        X1.g.e(str2, "workerClassName");
        X1.g.e(str3, "inputMergerClassName");
        X1.g.e(gVar, "input");
        X1.g.e(gVar2, "output");
        X1.g.e(dVar, "constraints");
        X.d.o("backoffPolicy", i5);
        X.d.o("outOfQuotaPolicy", i6);
        this.f5091a = str;
        this.f5092b = i3;
        this.c = str2;
        this.f5093d = str3;
        this.f5094e = gVar;
        this.f5095f = gVar2;
        this.g = j3;
        this.h = j4;
        this.f5096i = j5;
        this.f5097j = dVar;
        this.f5098k = i4;
        this.f5099l = i5;
        this.f5100m = j6;
        this.f5101n = j7;
        this.f5102o = j8;
        this.f5103p = j9;
        this.f5104q = z3;
        this.f5105r = i6;
        this.f5106s = i7;
        this.f5107t = i8;
        this.f5108u = j10;
        this.f5109v = i9;
        this.f5110w = i10;
    }

    public final long a() {
        long j3;
        boolean z3 = this.f5092b == 1 && this.f5098k > 0;
        long j4 = this.f5101n;
        boolean c = c();
        long j5 = this.f5096i;
        long j6 = this.h;
        long j7 = this.f5108u;
        int i3 = this.f5099l;
        X.d.o("backoffPolicy", i3);
        int i4 = this.f5106s;
        if (j7 != Long.MAX_VALUE && c) {
            if (i4 == 0) {
                return j7;
            }
            long j8 = j4 + 900000;
            return j7 < j8 ? j8 : j7;
        }
        if (z3) {
            int i5 = this.f5098k;
            long scalb = i3 == 2 ? this.f5100m * i5 : Math.scalb((float) r5, i5 - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            j3 = scalb + j4;
        } else {
            long j9 = this.g;
            if (c) {
                long j10 = i4 == 0 ? j4 + j9 : j4 + j6;
                j3 = (j5 == j6 || i4 != 0) ? j10 : (j6 - j5) + j10;
            } else {
                j3 = j4 == -1 ? Long.MAX_VALUE : j4 + j9;
            }
        }
        return j3;
    }

    public final boolean b() {
        return !X1.g.a(m0.d.f3963i, this.f5097j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return X1.g.a(this.f5091a, oVar.f5091a) && this.f5092b == oVar.f5092b && X1.g.a(this.c, oVar.c) && X1.g.a(this.f5093d, oVar.f5093d) && X1.g.a(this.f5094e, oVar.f5094e) && X1.g.a(this.f5095f, oVar.f5095f) && this.g == oVar.g && this.h == oVar.h && this.f5096i == oVar.f5096i && X1.g.a(this.f5097j, oVar.f5097j) && this.f5098k == oVar.f5098k && this.f5099l == oVar.f5099l && this.f5100m == oVar.f5100m && this.f5101n == oVar.f5101n && this.f5102o == oVar.f5102o && this.f5103p == oVar.f5103p && this.f5104q == oVar.f5104q && this.f5105r == oVar.f5105r && this.f5106s == oVar.f5106s && this.f5107t == oVar.f5107t && this.f5108u == oVar.f5108u && this.f5109v == oVar.f5109v && this.f5110w == oVar.f5110w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (Long.hashCode(this.f5103p) + ((Long.hashCode(this.f5102o) + ((Long.hashCode(this.f5101n) + ((Long.hashCode(this.f5100m) + ((q.h.a(this.f5099l) + ((Integer.hashCode(this.f5098k) + ((this.f5097j.hashCode() + ((Long.hashCode(this.f5096i) + ((Long.hashCode(this.h) + ((Long.hashCode(this.g) + ((this.f5095f.hashCode() + ((this.f5094e.hashCode() + ((this.f5093d.hashCode() + ((this.c.hashCode() + ((q.h.a(this.f5092b) + (this.f5091a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z3 = this.f5104q;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        return Integer.hashCode(this.f5110w) + ((Integer.hashCode(this.f5109v) + ((Long.hashCode(this.f5108u) + ((Integer.hashCode(this.f5107t) + ((Integer.hashCode(this.f5106s) + ((q.h.a(this.f5105r) + ((hashCode + i3) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f5091a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ o(String str, int i3, String str2, String str3, m0.g gVar, m0.g gVar2, long j3, long j4, long j5, m0.d dVar, int i4, int i5, long j6, long j7, long j8, long j9, boolean z3, int i6, int i7, long j10, int i8, int i9, int i10) {
        this(str, r5, str2, r7, r8, r9, (i10 & 64) != 0 ? 0L : j3, (i10 & 128) != 0 ? 0L : j4, (i10 & 256) != 0 ? 0L : j5, (i10 & 512) != 0 ? m0.d.f3963i : dVar, (i10 & 1024) != 0 ? 0 : i4, (i10 & 2048) != 0 ? 1 : i5, (i10 & 4096) != 0 ? 30000L : j6, (i10 & 8192) != 0 ? -1L : j7, (i10 & 16384) != 0 ? 0L : j8, (32768 & i10) != 0 ? -1L : j9, (65536 & i10) != 0 ? false : z3, (131072 & i10) == 0 ? i6 : 1, (262144 & i10) != 0 ? 0 : i7, 0, (1048576 & i10) != 0 ? Long.MAX_VALUE : j10, (2097152 & i10) != 0 ? 0 : i8, (i10 & 4194304) != 0 ? -256 : i9);
        m0.g gVar3;
        m0.g gVar4;
        int i11 = (i10 & 2) != 0 ? 1 : i3;
        String name = (i10 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3;
        if ((i10 & 16) != 0) {
            m0.g gVar5 = m0.g.f3972b;
            X1.g.d(gVar5, "EMPTY");
            gVar3 = gVar5;
        } else {
            gVar3 = gVar;
        }
        if ((i10 & 32) != 0) {
            m0.g gVar6 = m0.g.f3972b;
            X1.g.d(gVar6, "EMPTY");
            gVar4 = gVar6;
        } else {
            gVar4 = gVar2;
        }
    }
}
