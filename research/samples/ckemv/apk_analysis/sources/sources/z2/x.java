package z2;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {

    /* renamed from: d, reason: collision with root package name */
    public static final w f5364d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f5365a;

    /* renamed from: b, reason: collision with root package name */
    public long f5366b;
    public long c;

    public x a() {
        this.f5365a = false;
        return this;
    }

    public x b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.f5365a) {
            return this.f5366b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public x d(long j3) {
        this.f5365a = true;
        this.f5366b = j3;
        return this;
    }

    public boolean e() {
        return this.f5365a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f5365a && this.f5366b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j3, TimeUnit timeUnit) {
        X1.g.e(timeUnit, "unit");
        if (j3 >= 0) {
            this.c = timeUnit.toNanos(j3);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j3).toString());
    }
}
