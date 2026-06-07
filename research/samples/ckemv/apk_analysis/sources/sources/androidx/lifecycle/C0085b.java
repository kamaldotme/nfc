package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2038a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2039b;

    public C0085b(int i3, Method method) {
        this.f2038a = i3;
        this.f2039b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0085b)) {
            return false;
        }
        C0085b c0085b = (C0085b) obj;
        return this.f2038a == c0085b.f2038a && this.f2039b.getName().equals(c0085b.f2039b.getName());
    }

    public final int hashCode() {
        return this.f2039b.getName().hashCode() + (this.f2038a * 31);
    }
}
