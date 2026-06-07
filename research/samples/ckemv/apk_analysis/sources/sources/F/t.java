package f;

import a.AbstractC0059a;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* loaded from: classes.dex */
public final class t extends ContentFrameLayout {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f2932j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, i.e eVar) {
        super(eVar, null);
        this.f2932j = vVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2932j.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (x2 < -5 || y3 < -5 || x2 > getWidth() + 5 || y3 > getHeight() + 5) {
                v vVar = this.f2932j;
                vVar.r(vVar.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i3) {
        setBackgroundDrawable(AbstractC0059a.s(getContext(), i3));
    }
}
