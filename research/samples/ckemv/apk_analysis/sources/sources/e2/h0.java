package e2;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2804a = new ThreadLocal();

    public static I a() {
        ThreadLocal threadLocal = f2804a;
        I i3 = (I) threadLocal.get();
        if (i3 != null) {
            return i3;
        }
        C0121c c0121c = new C0121c(Thread.currentThread());
        threadLocal.set(c0121c);
        return c0121c;
    }
}
