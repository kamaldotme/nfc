package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Z.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052t implements Parcelable {
    public static final Parcelable.Creator<C0052t> CREATOR = new I0.b(2);

    /* renamed from: b, reason: collision with root package name */
    public int f1351b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1352d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1351b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f1352d ? 1 : 0);
    }
}
