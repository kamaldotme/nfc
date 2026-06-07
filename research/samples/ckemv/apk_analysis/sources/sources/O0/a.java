package O0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends P.b {
    public static final Parcelable.Creator<a> CREATOR = new F0.f(2);

    /* renamed from: d, reason: collision with root package name */
    public boolean f695d;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f695d = parcel.readInt() == 1;
    }

    @Override // P.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f695d ? 1 : 0);
    }
}
