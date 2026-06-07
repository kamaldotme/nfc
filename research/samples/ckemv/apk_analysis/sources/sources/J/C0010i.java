package J;

import android.view.DisplayCutout;

/* renamed from: J.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f428a;

    public C0010i(DisplayCutout displayCutout) {
        this.f428a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0010i.class != obj.getClass()) {
            return false;
        }
        return I.a.a(this.f428a, ((C0010i) obj).f428a);
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f428a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f428a + "}";
    }
}
