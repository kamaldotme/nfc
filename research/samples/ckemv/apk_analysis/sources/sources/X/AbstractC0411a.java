package x;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0411a {
    public static void a(Activity activity) {
        activity.finishAffinity();
    }

    public static void b(Activity activity, Intent intent, int i3, Bundle bundle) {
        activity.startActivityForResult(intent, i3, bundle);
    }

    public static void c(Activity activity, IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }
}
