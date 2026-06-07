package L0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final Dialog f606b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f607d;

    /* renamed from: e, reason: collision with root package name */
    public final int f608e;

    public a(Dialog dialog, Rect rect) {
        this.f606b = dialog;
        this.c = rect.left;
        this.f607d = rect.top;
        this.f608e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.c;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f607d, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i3 = this.f608e;
            obtain.setLocation((-i3) - 1, (-i3) - 1);
        }
        view.performClick();
        return this.f606b.onTouchEvent(obtain);
    }
}
