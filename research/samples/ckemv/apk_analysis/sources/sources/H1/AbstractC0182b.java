package h1;

import e1.C0118a;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0182b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3090a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0118a f3091b;
    public static final C0118a c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0118a f3092d;

    static {
        boolean z3;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f3090a = z3;
        if (z3) {
            f3091b = C0181a.c;
            c = C0181a.f3086d;
            f3092d = C0181a.f3087e;
        } else {
            f3091b = null;
            c = null;
            f3092d = null;
        }
    }
}
