package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0095l {
    private static final /* synthetic */ EnumC0095l[] $VALUES;
    public static final C0093j Companion;
    public static final EnumC0095l ON_ANY;
    public static final EnumC0095l ON_CREATE;
    public static final EnumC0095l ON_DESTROY;
    public static final EnumC0095l ON_PAUSE;
    public static final EnumC0095l ON_RESUME;
    public static final EnumC0095l ON_START;
    public static final EnumC0095l ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r3 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r3;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        $VALUES = new EnumC0095l[]{r02, r12, r22, r3, r4, r5, r6};
        Companion = new Object();
    }

    public static EnumC0095l valueOf(String str) {
        return (EnumC0095l) Enum.valueOf(EnumC0095l.class, str);
    }

    public static EnumC0095l[] values() {
        return (EnumC0095l[]) $VALUES.clone();
    }

    public final EnumC0096m a() {
        switch (AbstractC0094k.f2043a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0096m.f2045d;
            case 3:
            case 4:
                return EnumC0096m.f2046e;
            case 5:
                return EnumC0096m.f2047f;
            case 6:
                return EnumC0096m.f2044b;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
