package F;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale[] f154a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f154a;
        int length = localeArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String c = H.c.c(H.c.a(H.c.b(locale)));
                if (!c.isEmpty()) {
                    return c.equals(H.c.c(H.c.a(H.c.b(locale2))));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i3].equals(locale)) {
                break;
            }
            i3++;
        }
        return false;
    }
}
