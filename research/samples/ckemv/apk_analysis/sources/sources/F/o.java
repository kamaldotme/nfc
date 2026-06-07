package f;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class o {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static F.h b(Configuration configuration) {
        return F.h.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(F.h hVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(hVar.f156a.f157a.toLanguageTags()));
    }

    public static void d(Configuration configuration, F.h hVar) {
        configuration.setLocales(LocaleList.forLanguageTags(hVar.f156a.f157a.toLanguageTags()));
    }
}
