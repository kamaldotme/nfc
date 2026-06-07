package G0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends P.b {
    public static final Parcelable.Creator<b> CREATOR = new F0.f(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f207d;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f207d = parcel.readInt() == 1;
    }

    @Override // P.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f207d ? 1 : 0);
    }
}
