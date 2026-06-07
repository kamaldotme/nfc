package k;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: k.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0255K {
    public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (I.a.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
