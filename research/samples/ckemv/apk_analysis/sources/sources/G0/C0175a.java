package g0;

import X1.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f3030e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3031a;

    /* renamed from: b, reason: collision with root package name */
    public final File f3032b;
    public final Lock c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f3033d;

    public C0175a(String str, File file, boolean z3) {
        Lock lock;
        this.f3031a = z3;
        File file2 = new File(file, str.concat(".lck"));
        this.f3032b = file2;
        String absolutePath = file2.getAbsolutePath();
        g.d(absolutePath, "lockFile.absolutePath");
        HashMap hashMap = f3030e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(absolutePath);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(absolutePath, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = lock;
    }

    public final void a(boolean z3) {
        this.c.lock();
        if (z3) {
            File file = this.f3032b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f3033d = channel;
            } catch (IOException unused) {
                this.f3033d = null;
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f3033d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
