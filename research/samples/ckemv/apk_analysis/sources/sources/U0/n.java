package U0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends t {
    public final /* synthetic */ List c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f954d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.f954d = matrix;
    }

    @Override // U0.t
    public final void a(Matrix matrix, T0.a aVar, int i3, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f954d, aVar, i3, canvas);
        }
    }
}
