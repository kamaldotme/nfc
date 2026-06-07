package k;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3681a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3682b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f3683d;

    public m2.g a() {
        return new m2.g(this.f3681a, this.f3682b, (String[]) this.c, (String[]) this.f3683d);
    }

    public void b(String... strArr) {
        X1.g.e(strArr, "cipherSuites");
        if (!this.f3681a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        this.c = (String[]) strArr.clone();
    }

    public void c(m2.f... fVarArr) {
        X1.g.e(fVarArr, "cipherSuites");
        if (!this.f3681a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (m2.f fVar : fVarArr) {
            arrayList.add(fVar.f4035a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void d() {
        if (!this.f3681a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        this.f3682b = true;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String[], java.io.Serializable] */
    public void e(String... strArr) {
        X1.g.e(strArr, "tlsVersions");
        if (!this.f3681a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        this.f3683d = (String[]) strArr.clone();
    }

    public void f(m2.u... uVarArr) {
        if (!this.f3681a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(uVarArr.length);
        for (m2.u uVar : uVarArr) {
            arrayList.add(uVar.f4127b);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
