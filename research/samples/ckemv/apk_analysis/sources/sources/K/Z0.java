package k;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class Z0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f3641a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3642b;
    public final Rect c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3643d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3644e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3645f;

    public Z0(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f3644e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f3642b = rect3;
        Rect rect4 = new Rect();
        this.f3643d = rect4;
        Rect rect5 = new Rect();
        this.c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i3 = -scaledTouchSlop;
        rect4.inset(i3, i3);
        rect5.set(rect2);
        this.f3641a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int x2 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z4 = this.f3645f;
                if (z4 && !this.f3643d.contains(x2, y3)) {
                    z5 = z4;
                    z3 = false;
                }
            } else {
                if (action == 3) {
                    z4 = this.f3645f;
                    this.f3645f = false;
                }
                z3 = true;
                z5 = false;
            }
            z5 = z4;
            z3 = true;
        } else {
            if (this.f3642b.contains(x2, y3)) {
                this.f3645f = true;
                z3 = true;
            }
            z3 = true;
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        Rect rect = this.c;
        View view = this.f3641a;
        if (!z3 || rect.contains(x2, y3)) {
            motionEvent.setLocation(x2 - rect.left, y3 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
