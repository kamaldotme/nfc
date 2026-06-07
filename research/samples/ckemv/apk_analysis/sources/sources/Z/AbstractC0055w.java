package Z;

import android.graphics.Rect;
import android.view.View;

/* renamed from: Z.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0055w {

    /* renamed from: a, reason: collision with root package name */
    public int f1366a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1367b;
    public final Object c;

    public AbstractC0055w(H h) {
        this.f1366a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.f1367b = h;
    }

    public static AbstractC0055w a(H h, int i3) {
        if (i3 == 0) {
            return new C0054v(h, 0);
        }
        if (i3 == 1) {
            return new C0054v(h, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f1366a) {
            return 0;
        }
        return l() - this.f1366a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i3);

    public AbstractC0055w(androidx.emoji2.text.i iVar) {
        this.f1366a = 0;
        this.c = new androidx.emoji2.text.d();
        this.f1367b = iVar;
    }
}
