package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Y0 extends P.b {
    public static final Parcelable.Creator<Y0> CREATOR = new F0.f(7);

    /* renamed from: d, reason: collision with root package name */
    public boolean f3630d;

    public Y0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3630d = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3630d + "}";
    }

    @Override // P.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeValue(Boolean.valueOf(this.f3630d));
    }
}
