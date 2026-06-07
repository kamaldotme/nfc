package androidx.work;

import android.content.Context;
import h0.InterfaceC0180b;
import java.util.Collections;
import java.util.List;
import m0.C0329a;
import m0.r;
import n0.s;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC0180b {
    static {
        r.b("WrkMgrInitializer");
    }

    @Override // h0.InterfaceC0180b
    public final List a() {
        return Collections.emptyList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r2 = r5.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (n0.s.f4205o != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        n0.s.f4205o = u2.l.f(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        n0.s.f4204n = n0.s.f4205o;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [m0.r, java.lang.Object] */
    @Override // h0.InterfaceC0180b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context) {
        r.a().getClass();
        C0329a c0329a = new C0329a(new Object());
        synchronized (s.f4206p) {
            try {
                s sVar = s.f4204n;
                if (sVar != null && s.f4205o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s.p0(context);
    }
}
