package f2;

import O1.g;
import O1.i;
import android.os.Build;
import e2.C0136s;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class b extends O1.a implements g {
    private volatile Object _preHandler;

    public b() {
        super(C0136s.f2821b);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(i iVar, Throwable th) {
        Method method;
        if (Build.VERSION.SDK_INT < 28) {
            Object obj = this._preHandler;
            if (obj != this) {
                method = (Method) obj;
            } else {
                try {
                    method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                    if (Modifier.isPublic(method.getModifiers())) {
                    }
                } catch (Throwable unused) {
                }
                method = null;
                this._preHandler = method;
            }
            Object invoke = method != null ? method.invoke(null, null) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
