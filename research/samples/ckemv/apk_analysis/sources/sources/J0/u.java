package j0;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3450a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f3451b;
    public static final boolean c;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f3450a = true;
        f3451b = true;
        c = i3 >= 28;
    }
}
