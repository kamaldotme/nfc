package Z;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public int f1184a;

    /* renamed from: b, reason: collision with root package name */
    public int f1185b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f1186d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f1187e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1188f;

    public final void a(RecyclerView recyclerView) {
        int i3 = this.f1186d;
        if (i3 >= 0) {
            this.f1186d = -1;
            recyclerView.M(i3);
            this.f1188f = false;
        } else if (this.f1188f) {
            Interpolator interpolator = this.f1187e;
            if (interpolator != null && this.c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i4 = this.c;
            if (i4 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.f2117a0.b(this.f1184a, this.f1185b, i4, interpolator);
            this.f1188f = false;
        }
    }
}
