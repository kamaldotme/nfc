package K;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    public static r f598b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f599a;

    public /* synthetic */ r(Object obj) {
        this.f599a = obj;
    }

    public p a(int i3) {
        return null;
    }

    public p b(int i3) {
        return null;
    }

    public boolean c(int i3, int i4, Bundle bundle) {
        return false;
    }

    public r(int i3) {
        switch (i3) {
            case 1:
                this.f599a = new Object();
                new Handler(Looper.getMainLooper(), new I1.c(4, this));
                return;
            default:
                this.f599a = new q(this);
                return;
        }
    }
}
