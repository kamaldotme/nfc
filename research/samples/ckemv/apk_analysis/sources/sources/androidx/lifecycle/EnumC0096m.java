package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0096m {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0096m f2044b;
    public static final EnumC0096m c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0096m f2045d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0096m f2046e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0096m f2047f;
    public static final /* synthetic */ EnumC0096m[] g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f2044b = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        c = r12;
        ?? r22 = new Enum("CREATED", 2);
        f2045d = r22;
        ?? r3 = new Enum("STARTED", 3);
        f2046e = r3;
        ?? r4 = new Enum("RESUMED", 4);
        f2047f = r4;
        g = new EnumC0096m[]{r02, r12, r22, r3, r4};
    }

    public static EnumC0096m valueOf(String str) {
        return (EnumC0096m) Enum.valueOf(EnumC0096m.class, str);
    }

    public static EnumC0096m[] values() {
        return (EnumC0096m[]) g.clone();
    }
}
