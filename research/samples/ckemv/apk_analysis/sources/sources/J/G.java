package J;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public y0 f396a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f397b;
    public final /* synthetic */ InterfaceC0018q c;

    public G(View view, InterfaceC0018q interfaceC0018q) {
        this.f397b = view;
        this.c = interfaceC0018q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        y0 g = y0.g(view, windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0018q interfaceC0018q = this.c;
        if (i3 < 30) {
            H.a(windowInsets, this.f397b);
            if (g.equals(this.f396a)) {
                return interfaceC0018q.f(view, g).f();
            }
        }
        this.f396a = g;
        y0 f3 = interfaceC0018q.f(view, g);
        if (i3 >= 30) {
            return f3.f();
        }
        WeakHashMap weakHashMap = T.f402a;
        F.c(view);
        return f3.f();
    }
}
