package k;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: k.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0283g0 extends AbstractC0287i0 {
    @Override // k.AbstractC0287i0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0289j0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
