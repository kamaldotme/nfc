package v0;

import android.animation.Animator;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.animation.Animation;
import androidx.lifecycle.y;
import androidx.work.impl.WorkDatabase;
import l.C0324a;
import m0.u;
import m0.w;
import m0.x;
import r1.C0370a;
import x0.C0432k;

/* loaded from: classes.dex */
public final class l implements x {
    public final /* synthetic */ int c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5083d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5084e;

    public l(WorkDatabase workDatabase) {
        this.c = 0;
        this.f5083d = workDatabase;
        this.f5084e = new C0402b(workDatabase, 3);
    }

    public static int e(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        return i5 + 1 > i4 ? i6 + 1 : i6;
    }

    public l a(l lVar) {
        C0370a c0370a = (C0370a) lVar.f5083d;
        C0370a c0370a2 = (C0370a) this.f5083d;
        if (!c0370a2.equals(c0370a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g()) {
            return lVar;
        }
        if (lVar.g()) {
            return this;
        }
        int[] iArr = (int[]) this.f5084e;
        int length = iArr.length;
        int[] iArr2 = (int[]) lVar.f5084e;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i3 = length2; i3 < iArr.length; i3++) {
            iArr3[i3] = iArr2[i3 - length2] ^ iArr[i3];
        }
        return new l(c0370a2, iArr3);
    }

    public int b(int i3) {
        if (i3 == 0) {
            return c(0);
        }
        int[] iArr = (int[]) this.f5084e;
        if (i3 != 1) {
            int i4 = iArr[0];
            int length = iArr.length;
            for (int i5 = 1; i5 < length; i5++) {
                i4 = ((C0370a) this.f5083d).b(i3, i4) ^ iArr[i5];
            }
            return i4;
        }
        int i6 = 0;
        for (int i7 : iArr) {
            C0370a c0370a = C0370a.h;
            i6 ^= i7;
        }
        return i6;
    }

    public int c(int i3) {
        return ((int[]) this.f5084e)[(r0.length - 1) - i3];
    }

    public int d() {
        return ((int[]) this.f5084e).length - 1;
    }

    public void f() {
        ((SparseIntArray) this.f5083d).clear();
    }

    public boolean g() {
        return ((int[]) this.f5084e)[0] == 0;
    }

    public void h(u2.d dVar) {
        boolean z3;
        y yVar = (y) this.f5083d;
        synchronized (yVar.f2063a) {
            z3 = yVar.f2067f == y.f2062k;
            yVar.f2067f = dVar;
        }
        if (z3) {
            C0324a.O().P(yVar.f2069j);
        }
        if (dVar instanceof w) {
            ((C0432k) this.f5084e).j((w) dVar);
        } else if (dVar instanceof u) {
            ((C0432k) this.f5084e).k(((u) dVar).f3986a);
        }
    }

    public l i(int i3) {
        C0370a c0370a = (C0370a) this.f5083d;
        if (i3 == 0) {
            return c0370a.c;
        }
        if (i3 == 1) {
            return this;
        }
        int[] iArr = (int[]) this.f5084e;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = c0370a.b(iArr[i4], i3);
        }
        return new l(c0370a, iArr2);
    }

    public void j(G.h hVar) {
        int i3 = hVar.f193b;
        Handler handler = (Handler) this.f5084e;
        A.h hVar2 = (A.h) this.f5083d;
        if (i3 != 0) {
            handler.post(new G.a(i3, 0, hVar2));
        } else {
            handler.post(new D0.c(hVar2, 1, hVar.f192a));
        }
    }

    public String toString() {
        switch (this.c) {
            case 6:
                if (g()) {
                    return "0";
                }
                StringBuilder sb = new StringBuilder(d() * 8);
                for (int d3 = d(); d3 >= 0; d3--) {
                    int c = c(d3);
                    if (c != 0) {
                        if (c < 0) {
                            if (d3 == d()) {
                                sb.append("-");
                            } else {
                                sb.append(" - ");
                            }
                            c = -c;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (d3 == 0 || c != 1) {
                            C0370a c0370a = (C0370a) this.f5083d;
                            if (c == 0) {
                                c0370a.getClass();
                                throw new IllegalArgumentException();
                            }
                            int i3 = c0370a.f4649b[c];
                            if (i3 == 0) {
                                sb.append('1');
                            } else if (i3 == 1) {
                                sb.append('a');
                            } else {
                                sb.append("a^");
                                sb.append(i3);
                            }
                        }
                        if (d3 != 0) {
                            if (d3 == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(d3);
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public l(int i3) {
        this.c = i3;
        switch (i3) {
            case 3:
                this.f5083d = new SparseIntArray();
                this.f5084e = new SparseIntArray();
                return;
            case 4:
            default:
                return;
            case 5:
                this.f5083d = new y();
                this.f5084e = new Object();
                h(x.f3988b);
                return;
        }
    }

    public l(A.h hVar, Handler handler) {
        this.c = 1;
        this.f5083d = hVar;
        this.f5084e = handler;
    }

    public l(C0370a c0370a, int[] iArr) {
        this.c = 6;
        if (iArr.length != 0) {
            this.f5083d = c0370a;
            int length = iArr.length;
            int i3 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i3 < length && iArr[i3] == 0) {
                    i3++;
                }
                if (i3 == length) {
                    this.f5084e = new int[]{0};
                    return;
                }
                int i4 = length - i3;
                int[] iArr2 = new int[i4];
                this.f5084e = iArr2;
                System.arraycopy(iArr, i3, iArr2, 0, i4);
                return;
            }
            this.f5084e = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public l(Animation animation) {
        this.c = 4;
        this.f5083d = animation;
        this.f5084e = null;
    }

    public l(Animator animator) {
        this.c = 4;
        this.f5083d = null;
        this.f5084e = animator;
    }
}
