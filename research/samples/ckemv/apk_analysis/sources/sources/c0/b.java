package C0;

import J.T;
import Z.H;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f110a;

    /* renamed from: b, reason: collision with root package name */
    public int f111b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public Object f112d;

    public void a(int i3, int i4) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i5 = this.c;
        int i6 = i5 * 2;
        int[] iArr = (int[]) this.f112d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f112d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i6 >= iArr.length) {
            int[] iArr3 = new int[i5 * 4];
            this.f112d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f112d;
        iArr4[i6] = i3;
        iArr4[i6 + 1] = i4;
        this.c++;
    }

    public void b() {
        int i3 = this.c;
        View view = (View) this.f112d;
        int top = i3 - (view.getTop() - this.f110a);
        WeakHashMap weakHashMap = T.f402a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f111b));
    }

    public void c(RecyclerView recyclerView, boolean z3) {
        this.c = 0;
        int[] iArr = (int[]) this.f112d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        H h = recyclerView.f2136m;
        if (recyclerView.f2134l == null || h == null || !h.f1163i) {
            return;
        }
        if (z3) {
            if (!recyclerView.f2123e.h()) {
                h.i(recyclerView.f2134l.a(), this);
            }
        } else if (!recyclerView.K()) {
            h.h(this.f110a, this.f111b, recyclerView.f2122d0, this);
        }
        int i3 = this.c;
        if (i3 > h.f1164j) {
            h.f1164j = i3;
            h.f1165k = z3;
            recyclerView.c.k();
        }
    }
}
