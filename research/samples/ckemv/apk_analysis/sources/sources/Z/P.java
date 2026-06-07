package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class P extends P.b {
    public static final Parcelable.Creator<P> CREATOR = new F0.f(6);

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1183d;

    public P(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1183d = parcel.readParcelable(classLoader == null ? H.class.getClassLoader() : classLoader);
    }

    @Override // P.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f1183d, 0);
    }
}
