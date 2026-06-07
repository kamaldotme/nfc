package J;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* renamed from: J.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015n {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f440a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f441b;
    public final View c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f442d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f443e;

    public C0015n(View view) {
        this.c = view;
    }

    public final boolean a(float f3, float f4, boolean z3) {
        ViewParent f5;
        if (!this.f442d || (f5 = f(0)) == null) {
            return false;
        }
        try {
            return X.a(f5, this.c, f3, f4, z3);
        } catch (AbstractMethodError unused) {
            Objects.toString(f5);
            return false;
        }
    }

    public final boolean b(float f3, float f4) {
        ViewParent f5;
        if (!this.f442d || (f5 = f(0)) == null) {
            return false;
        }
        try {
            return X.b(f5, this.c, f3, f4);
        } catch (AbstractMethodError unused) {
            Objects.toString(f5);
            return false;
        }
    }

    public final boolean c(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        ViewParent f3;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f442d || (f3 = f(i5)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.f443e == null) {
                this.f443e = new int[2];
            }
            iArr3 = this.f443e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z3 = f3 instanceof InterfaceC0016o;
        View view2 = this.c;
        if (z3) {
            ((InterfaceC0016o) f3).e(view2, i3, i4, iArr3, i5);
        } else if (i5 == 0) {
            try {
                X.c(f3, view2, i3, i4, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(f3);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i3, int i4, int i5, int[] iArr) {
        e(0, i3, 0, i4, null, i5, iArr);
    }

    public final boolean e(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent f3;
        int i8;
        int i9;
        int[] iArr3;
        if (!this.f442d || (f3 = f(i7)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i8 = iArr[0];
            i9 = iArr[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            if (this.f443e == null) {
                this.f443e = new int[2];
            }
            int[] iArr4 = this.f443e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z3 = f3 instanceof InterfaceC0017p;
        View view2 = this.c;
        if (z3) {
            ((InterfaceC0017p) f3).b(view2, i3, i4, i5, i6, i7, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i5;
            iArr3[1] = iArr3[1] + i6;
            if (f3 instanceof InterfaceC0016o) {
                ((InterfaceC0016o) f3).c(view2, i3, i4, i5, i6, i7);
            } else if (i7 == 0) {
                try {
                    X.d(f3, view2, i3, i4, i5, i6);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f3);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i9;
        }
        return true;
    }

    public final ViewParent f(int i3) {
        if (i3 == 0) {
            return this.f440a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f441b;
    }

    public final boolean g(int i3) {
        return f(i3) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i3, int i4) {
        boolean f3;
        if (g(i4)) {
            return true;
        }
        if (!this.f442d) {
            return false;
        }
        View view = this.c;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            boolean z3 = parent instanceof InterfaceC0016o;
            if (z3) {
                f3 = ((InterfaceC0016o) parent).f(view2, view, i3, i4);
            } else {
                if (i4 == 0) {
                    try {
                        f3 = X.f(parent, view2, view, i3);
                    } catch (AbstractMethodError unused) {
                        Objects.toString(parent);
                    }
                }
                if (!(parent instanceof View)) {
                    view2 = parent;
                }
            }
            if (f3) {
                if (i4 == 0) {
                    this.f440a = parent;
                } else if (i4 == 1) {
                    this.f441b = parent;
                }
                if (z3) {
                    ((InterfaceC0016o) parent).a(view2, view, i3, i4);
                } else if (i4 == 0) {
                    try {
                        X.e(parent, view2, view, i3);
                    } catch (AbstractMethodError unused2) {
                        Objects.toString(parent);
                    }
                }
                return true;
            }
            if (!(parent instanceof View)) {
            }
        }
        return false;
    }

    public final void i(int i3) {
        ViewParent f3 = f(i3);
        if (f3 != null) {
            boolean z3 = f3 instanceof InterfaceC0016o;
            View view = this.c;
            if (z3) {
                ((InterfaceC0016o) f3).d(view, i3);
            } else if (i3 == 0) {
                try {
                    X.g(f3, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f3);
                }
            }
            if (i3 == 0) {
                this.f440a = null;
            } else {
                if (i3 != 1) {
                    return;
                }
                this.f441b = null;
            }
        }
    }
}
