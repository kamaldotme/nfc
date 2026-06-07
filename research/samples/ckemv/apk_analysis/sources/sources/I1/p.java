package I1;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final J1.g f369a;

    /* renamed from: b, reason: collision with root package name */
    public HandlerThread f370b;
    public Handler c;

    /* renamed from: d, reason: collision with root package name */
    public m f371d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f372e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f373f;
    public boolean g = false;
    public final Object h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final c f374i = new c(2, this);

    /* renamed from: j, reason: collision with root package name */
    public final A.h f375j = new A.h(6, this);

    public p(J1.g gVar, m mVar, Handler handler) {
        u2.d.G();
        this.f369a = gVar;
        this.f371d = mVar;
        this.f372e = handler;
    }
}
