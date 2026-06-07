package m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import k.e1;
import m0.z;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f4036e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f4037f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4038a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4039b;
    public final String[] c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f4040d;

    static {
        f fVar = f.f4032r;
        f fVar2 = f.f4033s;
        f fVar3 = f.f4034t;
        f fVar4 = f.f4026l;
        f fVar5 = f.f4028n;
        f fVar6 = f.f4027m;
        f fVar7 = f.f4029o;
        f fVar8 = f.f4031q;
        f fVar9 = f.f4030p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f4024j, f.f4025k, f.h, f.f4023i, f.f4022f, f.g, f.f4021e};
        e1 e1Var = new e1();
        e1Var.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        u uVar = u.TLS_1_3;
        u uVar2 = u.TLS_1_2;
        e1Var.f(uVar, uVar2);
        e1Var.d();
        e1Var.a();
        e1 e1Var2 = new e1();
        e1Var2.c((f[]) Arrays.copyOf(fVarArr, 16));
        e1Var2.f(uVar, uVar2);
        e1Var2.d();
        f4036e = e1Var2.a();
        e1 e1Var3 = new e1();
        e1Var3.c((f[]) Arrays.copyOf(fVarArr, 16));
        e1Var3.f(uVar, uVar2, u.TLS_1_1, u.TLS_1_0);
        e1Var3.d();
        e1Var3.a();
        f4037f = new g(false, false, null, null);
    }

    public g(boolean z3, boolean z4, String[] strArr, String[] strArr2) {
        this.f4038a = z3;
        this.f4039b = z4;
        this.c = strArr;
        this.f4040d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f4019b.c(str));
        }
        return L1.k.Y(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f4038a) {
            return false;
        }
        String[] strArr = this.f4040d;
        if (strArr != null && !n2.b.i(strArr, sSLSocket.getEnabledProtocols(), N1.a.c)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || n2.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), f.c);
    }

    public final List c() {
        String[] strArr = this.f4040d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(z.w(str));
        }
        return L1.k.Y(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        boolean z3 = gVar.f4038a;
        boolean z4 = this.f4038a;
        if (z4 != z3) {
            return false;
        }
        return !z4 || (Arrays.equals(this.c, gVar.c) && Arrays.equals(this.f4040d, gVar.f4040d) && this.f4039b == gVar.f4039b);
    }

    public final int hashCode() {
        if (!this.f4038a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f4040d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f4039b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f4038a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f4039b + ')';
    }
}
