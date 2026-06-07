package G;

import android.os.Process;

/* loaded from: classes.dex */
public final class k extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final int f201b;

    public k(Runnable runnable, String str, int i3) {
        super(runnable, str);
        this.f201b = i3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f201b);
        super.run();
    }
}
