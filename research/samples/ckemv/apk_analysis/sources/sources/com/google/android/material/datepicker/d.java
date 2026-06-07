package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new I0.b(12);

    /* renamed from: b, reason: collision with root package name */
    public final long f2384b;

    public d(long j3) {
        this.f2384b = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f2384b == ((d) obj).f2384b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2384b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f2384b);
    }
}
