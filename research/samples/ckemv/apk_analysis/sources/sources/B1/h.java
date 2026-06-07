package b1;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public static final C0103a f2219b;
    public static final /* synthetic */ h[] c;

    static {
        C0103a c0103a = new C0103a();
        f2219b = c0103a;
        c = new h[]{c0103a, new h() { // from class: b1.b
            @Override // b1.h
            public final String b(Field field) {
                return h.c(field.getName());
            }
        }, new h() { // from class: b1.c
            @Override // b1.h
            public final String b(Field field) {
                return h.c(h.a(field.getName(), ' '));
            }
        }, new h() { // from class: b1.d
            @Override // b1.h
            public final String b(Field field) {
                return h.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new h() { // from class: b1.e
            @Override // b1.h
            public final String b(Field field) {
                return h.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: b1.f
            @Override // b1.h
            public final String b(Field field) {
                return h.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: b1.g
            @Override // b1.h
            public final String b(Field field) {
                return h.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, char c3) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c3);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i3 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i3) + upperCase + str.substring(i3 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) c.clone();
    }

    public abstract String b(Field field);
}
