package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o implements Comparable, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new I0.b(13);

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f2429b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2430d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2431e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2432f;
    public final long g;
    public String h;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b3 = w.b(calendar);
        this.f2429b = b3;
        this.c = b3.get(2);
        this.f2430d = b3.get(1);
        this.f2431e = b3.getMaximum(7);
        this.f2432f = b3.getActualMaximum(5);
        this.g = b3.getTimeInMillis();
    }

    public static o a(int i3, int i4) {
        Calendar d3 = w.d(null);
        d3.set(1, i3);
        d3.set(2, i4);
        return new o(d3);
    }

    public static o b(long j3) {
        Calendar d3 = w.d(null);
        d3.setTimeInMillis(j3);
        return new o(d3);
    }

    public final String c() {
        if (this.h == null) {
            this.h = w.a("yMMMM", Locale.getDefault()).format(new Date(this.f2429b.getTimeInMillis()));
        }
        return this.h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2429b.compareTo(((o) obj).f2429b);
    }

    public final int d(o oVar) {
        if (!(this.f2429b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (oVar.c - this.c) + ((oVar.f2430d - this.f2430d) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.c == oVar.c && this.f2430d == oVar.f2430d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.f2430d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f2430d);
        parcel.writeInt(this.c);
    }
}
