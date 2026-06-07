package Z;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: Z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043j extends K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0045l f1290a;

    public C0043j(C0045l c0045l) {
        this.f1290a = c0045l;
    }

    @Override // Z.K
    public final void b(RecyclerView recyclerView, int i3, int i4) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0045l c0045l = this.f1290a;
        int computeVerticalScrollRange = c0045l.f1311s.computeVerticalScrollRange();
        int i5 = c0045l.f1310r;
        int i6 = computeVerticalScrollRange - i5;
        int i7 = c0045l.f1296a;
        c0045l.f1312t = i6 > 0 && i5 >= i7;
        int computeHorizontalScrollRange = c0045l.f1311s.computeHorizontalScrollRange();
        int i8 = c0045l.f1309q;
        boolean z3 = computeHorizontalScrollRange - i8 > 0 && i8 >= i7;
        c0045l.f1313u = z3;
        boolean z4 = c0045l.f1312t;
        if (!z4 && !z3) {
            if (c0045l.f1314v != 0) {
                c0045l.f(0);
                return;
            }
            return;
        }
        if (z4) {
            float f3 = i5;
            c0045l.f1304l = (int) ((((f3 / 2.0f) + computeVerticalScrollOffset) * f3) / computeVerticalScrollRange);
            c0045l.f1303k = Math.min(i5, (i5 * i5) / computeVerticalScrollRange);
        }
        if (c0045l.f1313u) {
            float f4 = computeHorizontalScrollOffset;
            float f5 = i8;
            c0045l.f1307o = (int) ((((f5 / 2.0f) + f4) * f5) / computeHorizontalScrollRange);
            c0045l.f1306n = Math.min(i8, (i8 * i8) / computeHorizontalScrollRange);
        }
        int i9 = c0045l.f1314v;
        if (i9 == 0 || i9 == 1) {
            c0045l.f(1);
        }
    }
}
