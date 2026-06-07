package j;

import J.T;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.AbstractC0253I;
import k.AbstractC0254J;
import k.C0259O;
import k.C0262S;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0198d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3270b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0198d(int i3, Object obj) {
        this.f3270b = i3;
        this.c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object obj = this.c;
        switch (this.f3270b) {
            case 0:
                ViewOnKeyListenerC0201g viewOnKeyListenerC0201g = (ViewOnKeyListenerC0201g) obj;
                if (viewOnKeyListenerC0201g.b()) {
                    ArrayList arrayList = viewOnKeyListenerC0201g.f3282j;
                    if (arrayList.size() <= 0 || ((C0200f) arrayList.get(0)).f3274a.f3590z) {
                        return;
                    }
                    View view = viewOnKeyListenerC0201g.f3289q;
                    if (view == null || !view.isShown()) {
                        viewOnKeyListenerC0201g.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0200f) it.next()).f3274a.i();
                    }
                    return;
                }
                return;
            case 1:
                ViewOnKeyListenerC0193E viewOnKeyListenerC0193E = (ViewOnKeyListenerC0193E) obj;
                if (!viewOnKeyListenerC0193E.b() || viewOnKeyListenerC0193E.f3240j.f3590z) {
                    return;
                }
                View view2 = viewOnKeyListenerC0193E.f3245o;
                if (view2 == null || !view2.isShown()) {
                    viewOnKeyListenerC0193E.dismiss();
                    return;
                } else {
                    viewOnKeyListenerC0193E.f3240j.i();
                    return;
                }
            case 2:
                C0262S c0262s = (C0262S) obj;
                if (!c0262s.getInternalPopup().b()) {
                    c0262s.g.g(AbstractC0254J.b(c0262s), AbstractC0254J.a(c0262s));
                }
                ViewTreeObserver viewTreeObserver = c0262s.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC0253I.a(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                C0259O c0259o = (C0259O) obj;
                C0262S c0262s2 = c0259o.f3606H;
                c0259o.getClass();
                WeakHashMap weakHashMap = T.f402a;
                if (!J.E.b(c0262s2) || !c0262s2.getGlobalVisibleRect(c0259o.f3604F)) {
                    c0259o.dismiss();
                    return;
                } else {
                    c0259o.s();
                    c0259o.i();
                    return;
                }
        }
    }
}
