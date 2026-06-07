package z;

import android.content.res.Resources;

/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462l {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f5300a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f5301b;

    public C0462l(Resources resources, Resources.Theme theme) {
        this.f5300a = resources;
        this.f5301b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0462l.class != obj.getClass()) {
            return false;
        }
        C0462l c0462l = (C0462l) obj;
        return this.f5300a.equals(c0462l.f5300a) && I.a.a(this.f5301b, c0462l.f5301b);
    }

    public final int hashCode() {
        return I.a.b(this.f5300a, this.f5301b);
    }
}
