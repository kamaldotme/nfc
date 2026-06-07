package J;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* renamed from: J.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0026z {

    /* renamed from: a, reason: collision with root package name */
    public int f471a;

    /* renamed from: b, reason: collision with root package name */
    public int f472b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public Object f473d;

    public AbstractC0026z() {
        if (U0.e.c == null) {
            U0.e.c = new U0.e(6);
        }
    }

    public int a(int i3) {
        if (i3 < this.c) {
            return ((ByteBuffer) this.f473d).getShort(this.f472b + i3);
        }
        return 0;
    }

    public void b() {
        if (((M1.e) this.f473d).f643i != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public Object e(View view) {
        if (Build.VERSION.SDK_INT >= this.f472b) {
            return c(view);
        }
        Object tag = view.getTag(this.f471a);
        if (((Class) this.f473d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public void f() {
        while (true) {
            int i3 = this.f471a;
            M1.e eVar = (M1.e) this.f473d;
            if (i3 >= eVar.g || eVar.f640d[i3] >= 0) {
                return;
            } else {
                this.f471a = i3 + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.f472b) {
            d(view, obj);
            return;
        }
        if (h(e(view), obj)) {
            View.AccessibilityDelegate c = T.c(view);
            C0004c c0004c = c == null ? null : c instanceof C0000a ? ((C0000a) c).f411a : new C0004c(c);
            if (c0004c == null) {
                c0004c = new C0004c();
            }
            T.l(view, c0004c);
            view.setTag(this.f471a, obj);
            T.g(view, this.c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f471a < ((M1.e) this.f473d).g;
    }

    public void remove() {
        b();
        if (this.f472b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        M1.e eVar = (M1.e) this.f473d;
        eVar.c();
        eVar.k(this.f472b);
        this.f472b = -1;
        this.c = eVar.f643i;
    }
}
