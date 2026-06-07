package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093j {
    public static EnumC0095l a(EnumC0096m enumC0096m) {
        X1.g.e(enumC0096m, "state");
        int ordinal = enumC0096m.ordinal();
        if (ordinal == 1) {
            return EnumC0095l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0095l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0095l.ON_RESUME;
    }
}
