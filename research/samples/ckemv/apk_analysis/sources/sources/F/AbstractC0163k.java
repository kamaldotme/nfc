package f;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import n.C0334c;

/* renamed from: f.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0163k {

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorC0145B f2914b = new ExecutorC0145B(new ExecutorC0146C(0));
    public static final int c = -100;

    /* renamed from: d, reason: collision with root package name */
    public static F.h f2915d = null;

    /* renamed from: e, reason: collision with root package name */
    public static F.h f2916e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f2917f = null;
    public static boolean g = false;
    public static final C0334c h = new C0334c();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f2918i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f2919j = new Object();

    public static boolean b(Context context) {
        if (f2917f == null) {
            try {
                int i3 = AbstractServiceC0144A.f2833b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0144A.class), z.a() | 128).metaData;
                if (bundle != null) {
                    f2917f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f2917f = Boolean.FALSE;
            }
        }
        return f2917f.booleanValue();
    }

    public static void f(AbstractC0163k abstractC0163k) {
        synchronized (f2918i) {
            try {
                Iterator it = h.iterator();
                while (it.hasNext()) {
                    AbstractC0163k abstractC0163k2 = (AbstractC0163k) ((WeakReference) it.next()).get();
                    if (abstractC0163k2 == abstractC0163k || abstractC0163k2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean h(int i3);

    public abstract void i(int i3);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
