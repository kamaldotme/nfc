package k;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* renamed from: k.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285h0 extends C0283g0 {
    @Override // k.C0283g0, k.AbstractC0287i0
    public void a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // k.AbstractC0287i0
    public boolean b(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
