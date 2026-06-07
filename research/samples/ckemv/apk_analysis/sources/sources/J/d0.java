package J;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class d0 {
    public static void a(Window window, boolean z3) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
