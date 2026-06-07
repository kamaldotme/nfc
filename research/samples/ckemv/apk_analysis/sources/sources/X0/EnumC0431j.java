package x0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0431j implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0431j f5212b;
    public static final /* synthetic */ EnumC0431j[] c;

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.j, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f5212b = r02;
        c = new EnumC0431j[]{r02};
    }

    public static EnumC0431j valueOf(String str) {
        return (EnumC0431j) Enum.valueOf(EnumC0431j.class, str);
    }

    public static EnumC0431j[] values() {
        return (EnumC0431j[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
