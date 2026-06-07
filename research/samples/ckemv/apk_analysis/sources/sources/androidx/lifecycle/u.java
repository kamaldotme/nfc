package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class u extends Service implements r {

    /* renamed from: b, reason: collision with root package name */
    public final v0.m f2056b = new v0.m(this);

    @Override // androidx.lifecycle.r
    public final t d() {
        return (t) this.f2056b.c;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        X1.g.e(intent, "intent");
        this.f2056b.G(EnumC0095l.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f2056b.G(EnumC0095l.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0095l enumC0095l = EnumC0095l.ON_STOP;
        v0.m mVar = this.f2056b;
        mVar.G(enumC0095l);
        mVar.G(EnumC0095l.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i3) {
        this.f2056b.G(EnumC0095l.ON_START);
        super.onStart(intent, i3);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i3, int i4) {
        return super.onStartCommand(intent, i3, i4);
    }
}
