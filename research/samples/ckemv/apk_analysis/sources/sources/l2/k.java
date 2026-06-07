package l2;

import j2.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3930a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f3931b;
    public static final int c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3932d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f3933e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f3934f;
    public static final i g;
    public static final i h;

    static {
        String str;
        int i3 = w.f3542a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f3930a = str;
        f3931b = j2.a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = w.f3542a;
        if (i4 < 2) {
            i4 = 2;
        }
        c = j2.a.l("kotlinx.coroutines.scheduler.core.pool.size", i4, 1, 0, 8);
        f3932d = j2.a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f3933e = TimeUnit.SECONDS.toNanos(j2.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f3934f = f.f3925a;
        g = new i(0);
        h = new i(1);
    }
}
