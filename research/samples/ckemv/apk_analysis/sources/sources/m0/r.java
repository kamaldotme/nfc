package m0;

import java.util.Collections;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static volatile r f3984b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3983a = new Object();
    public static final r c = new Object();

    public r() {
        Collections.emptyList();
        Collections.emptyList();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [m0.r, java.lang.Object] */
    public static r a() {
        r rVar;
        synchronized (f3983a) {
            try {
                if (f3984b == null) {
                    f3984b = new Object();
                }
                rVar = f3984b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public static String b(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
