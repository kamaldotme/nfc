package f;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: f.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0145B implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2834b;
    public final ArrayDeque c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f2835d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f2836e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2837f;

    public ExecutorC0145B(ExecutorService executorService) {
        this.f2834b = 1;
        this.f2835d = executorService;
        this.c = new ArrayDeque();
        this.f2837f = new Object();
    }

    public final void a() {
        switch (this.f2834b) {
            case 0:
                synchronized (this.f2837f) {
                    try {
                        Runnable runnable = (Runnable) this.c.poll();
                        this.f2836e = runnable;
                        if (runnable != null) {
                            this.f2835d.execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.c.poll();
                this.f2836e = runnable2;
                if (runnable2 != null) {
                    this.f2835d.execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2834b) {
            case 0:
                synchronized (this.f2837f) {
                    try {
                        this.c.add(new I1.k(this, 2, runnable));
                        if (this.f2836e == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.f2837f) {
                    try {
                        this.c.add(new D0.c(this, 10, runnable));
                        if (this.f2836e == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public ExecutorC0145B(ExecutorC0146C executorC0146C) {
        this.f2834b = 0;
        this.f2837f = new Object();
        this.c = new ArrayDeque();
        this.f2835d = executorC0146C;
    }
}
