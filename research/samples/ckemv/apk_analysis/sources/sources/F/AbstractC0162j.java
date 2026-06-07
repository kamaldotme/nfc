package f;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: f.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0162j {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
