package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new I0.b(10);

    /* renamed from: b, reason: collision with root package name */
    public final String f1841b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1842d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1843e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1844f;
    public final String g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1845i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1846j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f1847k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1848l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1849m;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f1850n;

    public F(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        this.f1841b = abstractComponentCallbacksC0077n.getClass().getName();
        this.c = abstractComponentCallbacksC0077n.f1972f;
        this.f1842d = abstractComponentCallbacksC0077n.f1978n;
        this.f1843e = abstractComponentCallbacksC0077n.f1987w;
        this.f1844f = abstractComponentCallbacksC0077n.f1988x;
        this.g = abstractComponentCallbacksC0077n.f1989y;
        this.h = abstractComponentCallbacksC0077n.f1954B;
        this.f1845i = abstractComponentCallbacksC0077n.f1977m;
        this.f1846j = abstractComponentCallbacksC0077n.f1953A;
        this.f1847k = abstractComponentCallbacksC0077n.g;
        this.f1848l = abstractComponentCallbacksC0077n.f1990z;
        this.f1849m = abstractComponentCallbacksC0077n.f1963L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1841b);
        sb.append(" (");
        sb.append(this.c);
        sb.append(")}:");
        if (this.f1842d) {
            sb.append(" fromLayout");
        }
        int i3 = this.f1844f;
        if (i3 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i3));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.f1845i) {
            sb.append(" removing");
        }
        if (this.f1846j) {
            sb.append(" detached");
        }
        if (this.f1848l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f1841b);
        parcel.writeString(this.c);
        parcel.writeInt(this.f1842d ? 1 : 0);
        parcel.writeInt(this.f1843e);
        parcel.writeInt(this.f1844f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.f1845i ? 1 : 0);
        parcel.writeInt(this.f1846j ? 1 : 0);
        parcel.writeBundle(this.f1847k);
        parcel.writeInt(this.f1848l ? 1 : 0);
        parcel.writeBundle(this.f1850n);
        parcel.writeInt(this.f1849m);
    }

    public F(Parcel parcel) {
        this.f1841b = parcel.readString();
        this.c = parcel.readString();
        this.f1842d = parcel.readInt() != 0;
        this.f1843e = parcel.readInt();
        this.f1844f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.f1845i = parcel.readInt() != 0;
        this.f1846j = parcel.readInt() != 0;
        this.f1847k = parcel.readBundle();
        this.f1848l = parcel.readInt() != 0;
        this.f1850n = parcel.readBundle();
        this.f1849m = parcel.readInt();
    }
}
