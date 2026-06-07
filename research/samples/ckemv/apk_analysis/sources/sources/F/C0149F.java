package f;

import J.T;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import i.InterfaceC0183a;
import java.util.WeakHashMap;

/* renamed from: f.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149F extends v0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0152I f2845e;

    public /* synthetic */ C0149F(C0152I c0152i, int i3) {
        this.f2844d = i3;
        this.f2845e = c0152i;
    }

    @Override // J.c0
    public final void a() {
        View view;
        C0152I c0152i = this.f2845e;
        switch (this.f2844d) {
            case 0:
                if (c0152i.f2863o && (view = c0152i.g) != null) {
                    view.setTranslationY(0.0f);
                    c0152i.f2854d.setTranslationY(0.0f);
                }
                c0152i.f2854d.setVisibility(8);
                c0152i.f2854d.setTransitioning(false);
                c0152i.f2868t = null;
                InterfaceC0183a interfaceC0183a = c0152i.f2859k;
                if (interfaceC0183a != null) {
                    interfaceC0183a.d(c0152i.f2858j);
                    c0152i.f2858j = null;
                    c0152i.f2859k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0152i.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = T.f402a;
                    J.F.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                c0152i.f2868t = null;
                c0152i.f2854d.requestLayout();
                return;
        }
    }
}
