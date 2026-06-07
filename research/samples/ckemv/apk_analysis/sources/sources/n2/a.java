package n2;

import X1.g;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4248b;

    public /* synthetic */ a(boolean z3, String str) {
        this.f4247a = str;
        this.f4248b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f4247a;
        g.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f4248b);
        return thread;
    }
}
