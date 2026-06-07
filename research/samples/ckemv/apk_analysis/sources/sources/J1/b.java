package J1;

import android.hardware.Camera;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {
    public static final ArrayList g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f543a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f544b;
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final Camera f545d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f546e;

    /* renamed from: f, reason: collision with root package name */
    public final a f547f;

    static {
        ArrayList arrayList = new ArrayList(2);
        g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public b(Camera camera, j jVar) {
        I1.c cVar = new I1.c(3, this);
        this.f547f = new a(this);
        this.f546e = new Handler(cVar);
        this.f545d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        jVar.getClass();
        this.c = g.contains(focusMode);
        this.f543a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.f543a && !this.f546e.hasMessages(1)) {
            Handler handler = this.f546e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    public final void b() {
        if (!this.c || this.f543a || this.f544b) {
            return;
        }
        try {
            this.f545d.autoFocus(this.f547f);
            this.f544b = true;
        } catch (RuntimeException unused) {
            a();
        }
    }
}
