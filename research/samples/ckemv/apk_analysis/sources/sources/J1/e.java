package J1;

import J.B0;
import J.N;
import J.T;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import f.s;
import java.util.WeakHashMap;
import n1.C0345a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f551b;
    public final /* synthetic */ boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f552d;

    public /* synthetic */ e(EditText editText) {
        this.f551b = 1;
        this.f552d = editText;
        this.c = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B0 b02 = null;
        boolean z3 = this.c;
        Object obj = this.f552d;
        switch (this.f551b) {
            case 0:
                ((g) obj).c.d(z3);
                return;
            case 1:
                View view = (View) obj;
                if (z3) {
                    WeakHashMap weakHashMap = T.f402a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        b02 = N.c(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        b02 = new B0(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                        }
                    }
                    if (b02 != null) {
                        b02.f395a.i0();
                        return;
                    }
                }
                ((InputMethodManager) y.d.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                ((C0345a) obj).f4235a.d(z3);
                return;
            default:
                n1.f fVar = (n1.f) ((s) obj).f2931b;
                fVar.f4244f = z3;
                if (fVar.c) {
                    fVar.f4242d.removeCallbacksAndMessages(null);
                    if (fVar.f4244f) {
                        fVar.f4242d.postDelayed(fVar.f4243e, 300000L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e(Object obj, boolean z3, int i3) {
        this.f551b = i3;
        this.f552d = obj;
        this.c = z3;
    }
}
