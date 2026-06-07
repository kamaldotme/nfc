package e2;

import java.util.concurrent.CancellationException;

/* renamed from: e2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2809a;

    /* renamed from: b, reason: collision with root package name */
    public final C0122d f2810b;
    public final W1.l c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2811d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f2812e;

    public C0130l(Object obj, C0122d c0122d, W1.l lVar, Object obj2, Throwable th) {
        this.f2809a = obj;
        this.f2810b = c0122d;
        this.c = lVar;
        this.f2811d = obj2;
        this.f2812e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0130l a(C0130l c0130l, C0122d c0122d, CancellationException cancellationException, int i3) {
        Object obj = c0130l.f2809a;
        if ((i3 & 2) != 0) {
            c0122d = c0130l.f2810b;
        }
        C0122d c0122d2 = c0122d;
        W1.l lVar = c0130l.c;
        Object obj2 = c0130l.f2811d;
        CancellationException cancellationException2 = cancellationException;
        if ((i3 & 16) != 0) {
            cancellationException2 = c0130l.f2812e;
        }
        c0130l.getClass();
        return new C0130l(obj, c0122d2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0130l)) {
            return false;
        }
        C0130l c0130l = (C0130l) obj;
        return X1.g.a(this.f2809a, c0130l.f2809a) && X1.g.a(this.f2810b, c0130l.f2810b) && X1.g.a(this.c, c0130l.c) && X1.g.a(this.f2811d, c0130l.f2811d) && X1.g.a(this.f2812e, c0130l.f2812e);
    }

    public final int hashCode() {
        Object obj = this.f2809a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0122d c0122d = this.f2810b;
        int hashCode2 = (hashCode + (c0122d == null ? 0 : c0122d.hashCode())) * 31;
        W1.l lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f2811d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2812e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2809a + ", cancelHandler=" + this.f2810b + ", onCancellation=" + this.c + ", idempotentResume=" + this.f2811d + ", cancelCause=" + this.f2812e + ')';
    }

    public /* synthetic */ C0130l(Object obj, C0122d c0122d, W1.l lVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : c0122d, (i3 & 4) != 0 ? null : lVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
