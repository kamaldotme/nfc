package t;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends View {
    public m(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i3) {
        d dVar = (d) getLayoutParams();
        dVar.f4760a = i3;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i3) {
        d dVar = (d) getLayoutParams();
        dVar.f4762b = i3;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f3) {
        d dVar = (d) getLayoutParams();
        dVar.c = f3;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
    }
}
