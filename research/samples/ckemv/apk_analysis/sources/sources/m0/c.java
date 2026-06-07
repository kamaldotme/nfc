package m0;

import android.net.Uri;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3961a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3962b;

    public c(Uri uri, boolean z3) {
        this.f3961a = uri;
        this.f3962b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!X1.g.a(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        X1.g.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        c cVar = (c) obj;
        return X1.g.a(this.f3961a, cVar.f3961a) && this.f3962b == cVar.f3962b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3962b) + (this.f3961a.hashCode() * 31);
    }
}
