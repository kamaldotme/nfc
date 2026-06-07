package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o.h f1014a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1015b = new Object();
    public static U0.e c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? l.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static U0.e b() {
        U0.e eVar = new U0.e(14);
        c = eVar;
        o.h hVar = f1014a;
        hVar.getClass();
        if (o.g.f4267f.g(hVar, null, eVar)) {
            o.g.c(hVar);
        }
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z3) {
        m a3;
        m mVar;
        int i3;
        if (z3 || c == null) {
            synchronized (f1015b) {
                if (!z3) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28 && i4 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i5 = 0;
                    boolean z4 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z5 = file2.exists() && length2 > 0;
                    try {
                        long a4 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a3 = m.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a3 = null;
                        }
                        if (a3 != null && a3.c == a4 && (i3 = a3.f1012b) != 2) {
                            i5 = i3;
                            if (z3 && z5 && i5 != 1) {
                                i5 = 2;
                            }
                            mVar = new m(1, (a3 == null && a3.f1012b == 2 && i5 == 1 && length < a3.f1013d) ? 3 : i5, a4, length2);
                            if (a3 != null || !a3.equals(mVar)) {
                                mVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z5) {
                            i5 = 2;
                        }
                        if (z3) {
                            i5 = 2;
                        }
                        mVar = new m(1, (a3 == null && a3.f1012b == 2 && i5 == 1 && length < a3.f1013d) ? 3 : i5, a4, length2);
                        if (a3 != null) {
                        }
                        mVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
