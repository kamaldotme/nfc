package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l1 extends P.b {
    public static final Parcelable.Creator<l1> CREATOR = new F0.f(8);

    /* renamed from: d, reason: collision with root package name */
    public int f3731d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3732e;

    public l1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3731d = parcel.readInt();
        this.f3732e = parcel.readInt() != 0;
    }

    @Override // P.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f3731d);
        parcel.writeInt(this.f3732e ? 1 : 0);
    }
}
