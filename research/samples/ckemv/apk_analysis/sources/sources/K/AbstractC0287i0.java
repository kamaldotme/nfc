package k;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: k.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0287i0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0289j0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
