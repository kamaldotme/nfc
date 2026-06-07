package z2;

import a.AbstractC0059a;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e b3;
        while (true) {
            try {
                reentrantLock = e.h;
                reentrantLock.lock();
                try {
                    b3 = AbstractC0059a.b();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (b3 == e.f5334l) {
                e.f5334l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (b3 != null) {
                    b3.k();
                }
            }
        }
    }
}
