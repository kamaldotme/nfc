package androidx.versionedparcelable;

import I0.b;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import l0.c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(15);

    /* renamed from: b, reason: collision with root package name */
    public final c f2182b;

    public ParcelImpl(Parcel parcel) {
        this.f2182b = new l0.b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new l0.b(parcel).i(this.f2182b);
    }
}
