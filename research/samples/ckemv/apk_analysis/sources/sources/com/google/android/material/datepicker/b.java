package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new I0.b(11);

    /* renamed from: b, reason: collision with root package name */
    public final o f2378b;
    public final o c;

    /* renamed from: d, reason: collision with root package name */
    public final d f2379d;

    /* renamed from: e, reason: collision with root package name */
    public final o f2380e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2381f;
    public final int g;
    public final int h;

    public b(o oVar, o oVar2, d dVar, o oVar3, int i3) {
        Objects.requireNonNull(oVar, "start cannot be null");
        Objects.requireNonNull(oVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f2378b = oVar;
        this.c = oVar2;
        this.f2380e = oVar3;
        this.f2381f = i3;
        this.f2379d = dVar;
        if (oVar3 != null && oVar.f2429b.compareTo(oVar3.f2429b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (oVar3 != null && oVar3.f2429b.compareTo(oVar2.f2429b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i3 < 0 || i3 > w.d(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.h = oVar.d(oVar2) + 1;
        this.g = (oVar2.f2430d - oVar.f2430d) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2378b.equals(bVar.f2378b) && this.c.equals(bVar.c) && I.a.a(this.f2380e, bVar.f2380e) && this.f2381f == bVar.f2381f && this.f2379d.equals(bVar.f2379d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2378b, this.c, this.f2380e, Integer.valueOf(this.f2381f), this.f2379d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f2378b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.f2380e, 0);
        parcel.writeParcelable(this.f2379d, 0);
        parcel.writeInt(this.f2381f);
    }
}
