package P1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f784b;
    public static final /* synthetic */ a[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [P1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [P1.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [P1.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f784b = r02;
        c = new a[]{r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) c.clone();
    }
}
