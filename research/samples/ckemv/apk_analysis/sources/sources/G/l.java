package G;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class l implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public String f202a;

    /* renamed from: b, reason: collision with root package name */
    public int f203b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new k(runnable, this.f202a, this.f203b);
    }
}
