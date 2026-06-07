package y;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import x.AbstractC0417g;
import x.AbstractC0418h;
import x.AbstractC0420j;
import x.C0421k;
import z.AbstractC0453c;
import z.AbstractC0460j;
import z.AbstractC0464n;
import z.C0461k;
import z.C0462l;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5254a = null;

    public static int a(Activity activity, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? activity.checkPermission(str, Process.myPid(), Process.myUid()) : AbstractC0420j.a(new C0421k(activity).f5192a) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int b(Context context, String str) {
        int c;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d3 = AbstractC0417g.d(str);
        if (d3 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !I.a.a(packageName2, packageName)) {
                c = AbstractC0417g.c((AppOpsManager) AbstractC0417g.a(context, AppOpsManager.class), d3, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c3 = AbstractC0418h.c(context);
                c = AbstractC0418h.a(c3, d3, Binder.getCallingUid(), packageName);
                if (c == 0) {
                    c = AbstractC0418h.a(c3, d3, myUid, AbstractC0418h.b(context));
                }
            } else {
                c = AbstractC0417g.c((AppOpsManager) AbstractC0417g.a(context, AppOpsManager.class), d3, packageName);
            }
            if (c != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList c(Context context, int i3) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0461k c0461k;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0462l c0462l = new C0462l(resources, theme);
        synchronized (AbstractC0464n.c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0464n.f5303b.get(c0462l);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (c0461k = (C0461k) sparseArray.get(i3)) != null) {
                    if (c0461k.f5299b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (c0461k.c != 0) {
                            }
                            colorStateList2 = c0461k.f5298a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i3);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = AbstractC0464n.f5302a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i3, typedValue, true);
        int i4 = typedValue.type;
        if (i4 < 28 || i4 > 31) {
            try {
                colorStateList = AbstractC0453c.a(resources, resources.getXml(i3), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateList == null) {
            return AbstractC0460j.b(resources, i3, theme);
        }
        synchronized (AbstractC0464n.c) {
            try {
                WeakHashMap weakHashMap = AbstractC0464n.f5303b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(c0462l);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(c0462l, sparseArray2);
                }
                sparseArray2.append(i3, new C0461k(colorStateList, c0462l.f5300a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }
}
