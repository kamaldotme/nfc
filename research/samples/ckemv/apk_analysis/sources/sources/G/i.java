package G;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.C0337f;
import n.C0342k;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0337f f194a = new C0337f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f195b;
    public static final Object c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0342k f196d;

    /* JADX WARN: Type inference failed for: r9v0, types: [G.l, java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ?? obj = new Object();
        obj.f202a = "fonts-androidx";
        obj.f203b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f195b = threadPoolExecutor;
        c = new Object();
        f196d = new C0342k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h a(String str, Context context, e eVar, int i3) {
        C0337f c0337f = f194a;
        Typeface typeface = (Typeface) c0337f.a(str);
        if (typeface != null) {
            return new h(typeface);
        }
        try {
            F0.e a3 = d.a(context, eVar);
            int i4 = 1;
            j[] jVarArr = (j[]) a3.c;
            int i5 = a3.f166b;
            if (i5 != 0) {
                if (i5 == 1) {
                    i4 = -2;
                    if (i4 != 0) {
                        return new h(i4);
                    }
                    Typeface s3 = A.i.f9a.s(context, jVarArr, i3);
                    if (s3 == null) {
                        return new h(-3);
                    }
                    c0337f.b(str, s3);
                    return new h(s3);
                }
                i4 = -3;
                if (i4 != 0) {
                }
            } else {
                if (jVarArr != null && jVarArr.length != 0) {
                    int length = jVarArr.length;
                    i4 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        int i7 = jVarArr[i6].f200e;
                        if (i7 == 0) {
                            i6++;
                        } else if (i7 >= 0) {
                            i4 = i7;
                        }
                    }
                }
                if (i4 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(-1);
        }
    }
}
