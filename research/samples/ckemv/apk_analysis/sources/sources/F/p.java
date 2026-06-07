package f;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class p {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, v vVar) {
        Objects.requireNonNull(vVar);
        androidx.activity.o oVar = new androidx.activity.o(1, vVar);
        K.h.e(obj).registerOnBackInvokedCallback(1000000, oVar);
        return oVar;
    }

    public static void c(Object obj, Object obj2) {
        K.h.e(obj).unregisterOnBackInvokedCallback(K.h.b(obj2));
    }
}
