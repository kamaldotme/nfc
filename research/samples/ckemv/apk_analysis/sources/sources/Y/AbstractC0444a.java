package y;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0444a {
    public static void a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    public static void b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
