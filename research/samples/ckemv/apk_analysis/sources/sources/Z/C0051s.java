package Z;

import android.view.View;
import java.util.List;

/* renamed from: Z.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1342a;

    /* renamed from: b, reason: collision with root package name */
    public int f1343b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f1344d;

    /* renamed from: e, reason: collision with root package name */
    public int f1345e;

    /* renamed from: f, reason: collision with root package name */
    public int f1346f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1347i;

    /* renamed from: j, reason: collision with root package name */
    public int f1348j;

    /* renamed from: k, reason: collision with root package name */
    public List f1349k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1350l;

    public final void a(View view) {
        int c;
        int size = this.f1349k.size();
        View view2 = null;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((W) this.f1349k.get(i4)).f1205a;
            I i5 = (I) view3.getLayoutParams();
            if (view3 != view && !i5.f1170a.j() && (c = (i5.f1170a.c() - this.f1344d) * this.f1345e) >= 0 && c < i3) {
                view2 = view3;
                if (c == 0) {
                    break;
                } else {
                    i3 = c;
                }
            }
        }
        if (view2 == null) {
            this.f1344d = -1;
        } else {
            this.f1344d = ((I) view2.getLayoutParams()).f1170a.c();
        }
    }

    public final View b(N n3) {
        List list = this.f1349k;
        if (list == null) {
            View view = n3.i(this.f1344d, Long.MAX_VALUE).f1205a;
            this.f1344d += this.f1345e;
            return view;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = ((W) this.f1349k.get(i3)).f1205a;
            I i4 = (I) view2.getLayoutParams();
            if (!i4.f1170a.j() && this.f1344d == i4.f1170a.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
