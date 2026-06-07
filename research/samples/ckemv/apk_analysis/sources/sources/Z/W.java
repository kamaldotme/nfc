package Z;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: s, reason: collision with root package name */
    public static final List f1204s = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f1205a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f1206b;

    /* renamed from: j, reason: collision with root package name */
    public int f1211j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f1219r;
    public int c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f1207d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f1208e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f1209f = -1;
    public int g = -1;
    public W h = null;

    /* renamed from: i, reason: collision with root package name */
    public W f1210i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f1212k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f1213l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f1214m = 0;

    /* renamed from: n, reason: collision with root package name */
    public N f1215n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1216o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f1217p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f1218q = -1;

    public W(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f1205a = view;
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
            return;
        }
        if ((1024 & this.f1211j) == 0) {
            if (this.f1212k == null) {
                ArrayList arrayList = new ArrayList();
                this.f1212k = arrayList;
                this.f1213l = Collections.unmodifiableList(arrayList);
            }
            this.f1212k.add(obj);
        }
    }

    public final void b(int i3) {
        this.f1211j = i3 | this.f1211j;
    }

    public final int c() {
        int i3 = this.g;
        return i3 == -1 ? this.c : i3;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.f1211j & 1024) != 0 || (arrayList = this.f1212k) == null || arrayList.size() == 0) ? f1204s : this.f1213l;
    }

    public final boolean e(int i3) {
        return (i3 & this.f1211j) != 0;
    }

    public final boolean f() {
        View view = this.f1205a;
        return (view.getParent() == null || view.getParent() == this.f1219r) ? false : true;
    }

    public final boolean g() {
        return (this.f1211j & 1) != 0;
    }

    public final boolean h() {
        return (this.f1211j & 4) != 0;
    }

    public final boolean i() {
        if ((this.f1211j & 16) == 0) {
            WeakHashMap weakHashMap = J.T.f402a;
            if (!J.B.i(this.f1205a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return (this.f1211j & 8) != 0;
    }

    public final boolean k() {
        return this.f1215n != null;
    }

    public final boolean l() {
        return (this.f1211j & 256) != 0;
    }

    public final boolean m() {
        return (this.f1211j & 2) != 0;
    }

    public final void n(int i3, boolean z3) {
        if (this.f1207d == -1) {
            this.f1207d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z3) {
            this.g += i3;
        }
        this.c += i3;
        View view = this.f1205a;
        if (view.getLayoutParams() != null) {
            ((I) view.getLayoutParams()).c = true;
        }
    }

    public final void o() {
        this.f1211j = 0;
        this.c = -1;
        this.f1207d = -1;
        this.f1208e = -1L;
        this.g = -1;
        this.f1214m = 0;
        this.h = null;
        this.f1210i = null;
        ArrayList arrayList = this.f1212k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f1211j &= -1025;
        this.f1217p = 0;
        this.f1218q = -1;
        RecyclerView.j(this);
    }

    public final void p(boolean z3) {
        int i3 = this.f1214m;
        int i4 = z3 ? i3 - 1 : i3 + 1;
        this.f1214m = i4;
        if (i4 < 0) {
            this.f1214m = 0;
            toString();
        } else if (!z3 && i4 == 1) {
            this.f1211j |= 16;
        } else if (z3 && i4 == 0) {
            this.f1211j &= -17;
        }
    }

    public final boolean q() {
        return (this.f1211j & 128) != 0;
    }

    public final boolean r() {
        return (this.f1211j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.f1208e + ", oldPos=" + this.f1207d + ", pLpos:" + this.g);
        if (k()) {
            sb.append(" scrap ");
            sb.append(this.f1216o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.f1211j & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (q()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f1214m + ")");
        }
        if ((this.f1211j & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f1205a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
