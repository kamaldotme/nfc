package f;

import J.C0003b0;
import J.T;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import i.AbstractC0184b;
import i.InterfaceC0183a;
import j.MenuC0207m;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n.C0342k;
import v0.C0403c;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class q implements Window.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f2924b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2925d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f2927f;

    public q(v vVar, Window.Callback callback) {
        this.f2927f = vVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2924b = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i3, Menu menu) {
        return this.f2924b.onMenuOpened(i3, menu);
    }

    public final void c(int i3, Menu menu) {
        this.f2924b.onPanelClosed(i3, menu);
    }

    public final void d(List list, Menu menu, int i3) {
        i.n.a(this.f2924b, list, menu, i3);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2924b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f2925d;
        Window.Callback callback = this.f2924b;
        return z3 ? callback.dispatchKeyEvent(keyEvent) : this.f2927f.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C0151H c0151h;
        MenuC0207m menuC0207m;
        if (this.f2924b.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        v vVar = this.f2927f;
        vVar.z();
        C0152I c0152i = vVar.f2987p;
        if (c0152i != null && (c0151h = c0152i.f2857i) != null && (menuC0207m = c0151h.f2848e) != null) {
            menuC0207m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
            if (menuC0207m.performShortcut(keyCode, keyEvent, 0)) {
                return true;
            }
        }
        u uVar = vVar.f2961N;
        if (uVar != null && vVar.E(uVar, keyEvent.getKeyCode(), keyEvent)) {
            u uVar2 = vVar.f2961N;
            if (uVar2 == null) {
                return true;
            }
            uVar2.f2941l = true;
            return true;
        }
        if (vVar.f2961N == null) {
            u y3 = vVar.y(0);
            vVar.F(y3, keyEvent);
            boolean E2 = vVar.E(y3, keyEvent.getKeyCode(), keyEvent);
            y3.f2940k = false;
            if (E2) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2924b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2924b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2924b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2924b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2924b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2924b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.f2924b.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0 || (menu instanceof MenuC0207m)) {
            return this.f2924b.onCreatePanelMenu(i3, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i3) {
        return this.f2924b.onCreatePanelView(i3);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2924b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        return this.f2924b.onMenuItemSelected(i3, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i3, Menu menu) {
        b(i3, menu);
        v vVar = this.f2927f;
        if (i3 == 108) {
            vVar.z();
            C0152I c0152i = vVar.f2987p;
            if (c0152i != null && true != c0152i.f2860l) {
                c0152i.f2860l = true;
                ArrayList arrayList = c0152i.f2861m;
                if (arrayList.size() > 0) {
                    X.d.q(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            vVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        if (this.f2926e) {
            this.f2924b.onPanelClosed(i3, menu);
            return;
        }
        c(i3, menu);
        v vVar = this.f2927f;
        if (i3 != 108) {
            if (i3 != 0) {
                vVar.getClass();
                return;
            }
            u y3 = vVar.y(i3);
            if (y3.f2942m) {
                vVar.r(y3, false);
                return;
            }
            return;
        }
        vVar.z();
        C0152I c0152i = vVar.f2987p;
        if (c0152i == null || !c0152i.f2860l) {
            return;
        }
        c0152i.f2860l = false;
        ArrayList arrayList = c0152i.f2861m;
        if (arrayList.size() <= 0) {
            return;
        }
        X.d.q(arrayList.get(0));
        throw null;
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z3) {
        i.o.a(this.f2924b, z3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        MenuC0207m menuC0207m = menu instanceof MenuC0207m ? (MenuC0207m) menu : null;
        if (i3 == 0 && menuC0207m == null) {
            return false;
        }
        if (menuC0207m != null) {
            menuC0207m.f3329x = true;
        }
        boolean onPreparePanel = this.f2924b.onPreparePanel(i3, view, menu);
        if (menuC0207m != null) {
            menuC0207m.f3329x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i3) {
        MenuC0207m menuC0207m = this.f2927f.y(0).h;
        if (menuC0207m != null) {
            d(list, menuC0207m, i3);
        } else {
            d(list, menu, i3);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return i.m.a(this.f2924b, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2924b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        this.f2924b.onWindowFocusChanged(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Type inference failed for: r10v1, types: [v0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [i.f, j.k, java.lang.Object, i.b] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i3) {
        boolean z3;
        ViewGroup viewGroup;
        int i4 = 1;
        v vVar = this.f2927f;
        vVar.getClass();
        if (i3 != 0) {
            return i.m.b(this.f2924b, callback, i3);
        }
        Context context = vVar.f2983l;
        ?? obj = new Object();
        obj.c = context;
        obj.f5076b = callback;
        obj.f5077d = new ArrayList();
        obj.f5078e = new C0342k();
        AbstractC0184b abstractC0184b = vVar.f2993v;
        if (abstractC0184b != null) {
            abstractC0184b.a();
        }
        C0403c c0403c = new C0403c(vVar, 5, obj);
        vVar.z();
        C0152I c0152i = vVar.f2987p;
        if (c0152i != null) {
            C0151H c0151h = c0152i.f2857i;
            if (c0151h != null) {
                c0151h.a();
            }
            c0152i.c.setHideOnContentScrollEnabled(false);
            c0152i.f2856f.e();
            C0151H c0151h2 = new C0151H(c0152i, c0152i.f2856f.getContext(), c0403c);
            MenuC0207m menuC0207m = c0151h2.f2848e;
            menuC0207m.w();
            try {
                if (c0151h2.f2849f.c(c0151h2, menuC0207m)) {
                    c0152i.f2857i = c0151h2;
                    c0151h2.i();
                    c0152i.f2856f.c(c0151h2);
                    c0152i.H(true);
                } else {
                    c0151h2 = null;
                }
                vVar.f2993v = c0151h2;
            } finally {
                menuC0207m.v();
            }
        }
        if (vVar.f2993v == null) {
            C0003b0 c0003b0 = vVar.f2997z;
            if (c0003b0 != null) {
                c0003b0.b();
            }
            AbstractC0184b abstractC0184b2 = vVar.f2993v;
            if (abstractC0184b2 != null) {
                abstractC0184b2.a();
            }
            if (vVar.f2986o != null) {
                boolean z4 = vVar.f2965R;
            }
            if (vVar.f2994w == null) {
                boolean z5 = vVar.f2957J;
                Context context2 = vVar.f2983l;
                if (z5) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        i.e eVar = new i.e(context2, 0);
                        eVar.getTheme().setTo(newTheme);
                        context2 = eVar;
                    }
                    vVar.f2994w = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    vVar.f2995x = popupWindow;
                    N.n.d(popupWindow, 2);
                    vVar.f2995x.setContentView(vVar.f2994w);
                    vVar.f2995x.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    vVar.f2994w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    vVar.f2995x.setHeight(-2);
                    vVar.f2996y = new RunnableC0164l(vVar, i4);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) vVar.f2950B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        vVar.z();
                        C0152I c0152i2 = vVar.f2987p;
                        Context I2 = c0152i2 != null ? c0152i2.I() : null;
                        if (I2 != null) {
                            context2 = I2;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        vVar.f2994w = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (vVar.f2994w != null) {
                C0003b0 c0003b02 = vVar.f2997z;
                if (c0003b02 != null) {
                    c0003b02.b();
                }
                vVar.f2994w.e();
                Context context3 = vVar.f2994w.getContext();
                ActionBarContextView actionBarContextView = vVar.f2994w;
                ?? obj2 = new Object();
                obj2.f3131d = context3;
                obj2.f3132e = actionBarContextView;
                obj2.f3133f = c0403c;
                MenuC0207m menuC0207m2 = new MenuC0207m(actionBarContextView.getContext());
                menuC0207m2.f3317l = 1;
                obj2.f3134i = menuC0207m2;
                menuC0207m2.f3312e = obj2;
                if (((InterfaceC0183a) c0403c.c).c(obj2, menuC0207m2)) {
                    obj2.i();
                    vVar.f2994w.c(obj2);
                    vVar.f2993v = obj2;
                    if (vVar.f2949A && (viewGroup = vVar.f2950B) != null) {
                        WeakHashMap weakHashMap = T.f402a;
                        if (J.E.c(viewGroup)) {
                            z3 = true;
                            if (!z3) {
                                vVar.f2994w.setAlpha(0.0f);
                                C0003b0 a3 = T.a(vVar.f2994w);
                                a3.a(1.0f);
                                vVar.f2997z = a3;
                                a3.d(new n(i4, vVar));
                            } else {
                                vVar.f2994w.setAlpha(1.0f);
                                vVar.f2994w.setVisibility(0);
                                if (vVar.f2994w.getParent() instanceof View) {
                                    View view = (View) vVar.f2994w.getParent();
                                    WeakHashMap weakHashMap2 = T.f402a;
                                    J.F.c(view);
                                }
                            }
                            if (vVar.f2995x != null) {
                                vVar.f2984m.getDecorView().post(vVar.f2996y);
                            }
                        }
                    }
                    z3 = false;
                    if (!z3) {
                    }
                    if (vVar.f2995x != null) {
                    }
                } else {
                    vVar.f2993v = null;
                }
            }
            vVar.H();
            vVar.f2993v = vVar.f2993v;
        }
        vVar.H();
        AbstractC0184b abstractC0184b3 = vVar.f2993v;
        if (abstractC0184b3 != null) {
            return obj.h(abstractC0184b3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2924b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
