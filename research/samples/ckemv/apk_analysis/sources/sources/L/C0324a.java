package l;

import X.e;
import a.AbstractC0059a;
import android.os.Looper;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324a extends AbstractC0059a {
    public static volatile C0324a c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f3890d = new e(1);

    /* renamed from: b, reason: collision with root package name */
    public final c f3891b = new c();

    public static C0324a O() {
        if (c != null) {
            return c;
        }
        synchronized (C0324a.class) {
            try {
                if (c == null) {
                    c = new C0324a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public final void P(Runnable runnable) {
        c cVar = this.f3891b;
        if (cVar.f3894d == null) {
            synchronized (cVar.f3893b) {
                try {
                    if (cVar.f3894d == null) {
                        cVar.f3894d = c.O(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.f3894d.post(runnable);
    }
}
