package u2;

import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public abstract class f {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }

    public static boolean b() {
        return h.f5033d;
    }
}
