package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0074k;
import java.util.Map;
import java.util.Objects;
import l.C0324a;

/* loaded from: classes.dex */
public class y {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2062k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2063a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final m.f f2064b = new m.f();
    public int c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2065d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2066e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2067f;
    public int g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2068i;

    /* renamed from: j, reason: collision with root package name */
    public final F0.h f2069j;

    public y() {
        Object obj = f2062k;
        this.f2067f = obj;
        this.f2069j = new F0.h(12, this);
        this.f2066e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        C0324a.O().f3891b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(X.d.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(x xVar) {
        if (xVar.c) {
            if (!xVar.e()) {
                xVar.c(false);
                return;
            }
            int i3 = xVar.f2060d;
            int i4 = this.g;
            if (i3 >= i4) {
                return;
            }
            xVar.f2060d = i4;
            A.h hVar = xVar.f2059b;
            Object obj = this.f2066e;
            hVar.getClass();
            if (((r) obj) != null) {
                DialogInterfaceOnCancelListenerC0074k dialogInterfaceOnCancelListenerC0074k = (DialogInterfaceOnCancelListenerC0074k) hVar.c;
                if (dialogInterfaceOnCancelListenerC0074k.f1935Z) {
                    View x2 = dialogInterfaceOnCancelListenerC0074k.x();
                    if (x2.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0074k.f1939d0 != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(dialogInterfaceOnCancelListenerC0074k.f1939d0);
                        }
                        dialogInterfaceOnCancelListenerC0074k.f1939d0.setContentView(x2);
                    }
                }
            }
        }
    }

    public final void c(x xVar) {
        if (this.h) {
            this.f2068i = true;
            return;
        }
        this.h = true;
        do {
            this.f2068i = false;
            if (xVar != null) {
                b(xVar);
                xVar = null;
            } else {
                m.f fVar = this.f2064b;
                fVar.getClass();
                m.d dVar = new m.d(fVar);
                fVar.f3949d.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((x) ((Map.Entry) dVar.next()).getValue());
                    if (this.f2068i) {
                        break;
                    }
                }
            }
        } while (this.f2068i);
        this.h = false;
    }

    public final void d(A.h hVar) {
        Object obj;
        a("observeForever");
        x xVar = new x(this, hVar);
        m.f fVar = this.f2064b;
        m.c a3 = fVar.a(hVar);
        if (a3 != null) {
            obj = a3.f3944b;
        } else {
            m.c cVar = new m.c(hVar, xVar);
            fVar.f3950e++;
            m.c cVar2 = fVar.c;
            if (cVar2 == null) {
                fVar.f3948b = cVar;
                fVar.c = cVar;
            } else {
                cVar2.c = cVar;
                cVar.f3945d = cVar2;
                fVar.c = cVar;
            }
            obj = null;
        }
        x xVar2 = (x) obj;
        if (xVar2 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (xVar2 != null) {
            return;
        }
        xVar.c(true);
    }

    public final void e(Object obj) {
        a("setValue");
        this.g++;
        this.f2066e = obj;
        c(null);
    }
}
