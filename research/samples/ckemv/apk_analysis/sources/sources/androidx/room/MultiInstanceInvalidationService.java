package androidx.room;

import a0.g;
import a0.h;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public int f2178b;
    public final LinkedHashMap c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final h f2179d = new h(this);

    /* renamed from: e, reason: collision with root package name */
    public final g f2180e = new g(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        X1.g.e(intent, "intent");
        return this.f2180e;
    }
}
