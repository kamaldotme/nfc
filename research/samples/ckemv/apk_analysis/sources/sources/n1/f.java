package n1;

import I1.h;
import android.content.Context;
import android.os.Handler;
import f.s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4240a;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f4243e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4244f;
    public boolean c = false;

    /* renamed from: b, reason: collision with root package name */
    public final s f4241b = new s(1, this);

    /* renamed from: d, reason: collision with root package name */
    public final Handler f4242d = new Handler();

    public f(Context context, h hVar) {
        this.f4240a = context;
        this.f4243e = hVar;
    }

    public final void a() {
        this.f4242d.removeCallbacksAndMessages(null);
        if (this.c) {
            this.f4240a.unregisterReceiver(this.f4241b);
            this.c = false;
        }
    }
}
