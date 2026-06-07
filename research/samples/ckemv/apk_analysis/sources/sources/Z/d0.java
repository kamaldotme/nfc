package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new I0.b(4);

    /* renamed from: b, reason: collision with root package name */
    public int f1246b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f1247d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1248e;

    /* renamed from: f, reason: collision with root package name */
    public int f1249f;
    public int[] g;
    public List h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1250i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1251j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1252k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1246b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f1247d);
        if (this.f1247d > 0) {
            parcel.writeIntArray(this.f1248e);
        }
        parcel.writeInt(this.f1249f);
        if (this.f1249f > 0) {
            parcel.writeIntArray(this.g);
        }
        parcel.writeInt(this.f1250i ? 1 : 0);
        parcel.writeInt(this.f1251j ? 1 : 0);
        parcel.writeInt(this.f1252k ? 1 : 0);
        parcel.writeList(this.h);
    }
}
