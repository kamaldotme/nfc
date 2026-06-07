package P;

import F0.f;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f783b;
    public static final a c = new b();
    public static final Parcelable.Creator<b> CREATOR = new f(3);

    public b() {
        this.f783b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f783b, i3);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f783b = parcelable == c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f783b = readParcelable == null ? c : readParcelable;
    }
}
