package androidx.work;

import D0.c;
import F0.h;
import a1.InterfaceFutureC0061a;
import android.content.Context;
import m0.o;
import m0.q;
import x0.C0432k;

/* loaded from: classes.dex */
public abstract class Worker extends q {

    /* renamed from: f, reason: collision with root package name */
    public C0432k f2184f;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a1.a] */
    @Override // m0.q
    public final InterfaceFutureC0061a a() {
        ?? obj = new Object();
        this.c.c.execute(new c(this, obj, 6, false));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.k, java.lang.Object] */
    @Override // m0.q
    public final C0432k d() {
        this.f2184f = new Object();
        this.c.c.execute(new h(15, this));
        return this.f2184f;
    }

    public abstract o f();
}
