package i;

import J.C0003b0;
import J.c0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {
    public Interpolator c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f3176d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3177e;

    /* renamed from: b, reason: collision with root package name */
    public long f3175b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final k f3178f = new k(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3174a = new ArrayList();

    public final void a() {
        if (this.f3177e) {
            Iterator it = this.f3174a.iterator();
            while (it.hasNext()) {
                ((C0003b0) it.next()).b();
            }
            this.f3177e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f3177e) {
            return;
        }
        Iterator it = this.f3174a.iterator();
        while (it.hasNext()) {
            C0003b0 c0003b0 = (C0003b0) it.next();
            long j3 = this.f3175b;
            if (j3 >= 0) {
                c0003b0.c(j3);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) c0003b0.f412a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f3176d != null) {
                c0003b0.d(this.f3178f);
            }
            View view2 = (View) c0003b0.f412a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3177e = true;
    }
}
