package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new I0.b(8);

    /* renamed from: b, reason: collision with root package name */
    public String f2011b;
    public int c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f2011b);
        parcel.writeInt(this.c);
    }
}
