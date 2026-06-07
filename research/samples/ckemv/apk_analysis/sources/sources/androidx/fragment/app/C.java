package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C implements Parcelable {
    public static final Parcelable.Creator<C> CREATOR = new I0.b(9);

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1832b;
    public ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public C0065b[] f1833d;

    /* renamed from: e, reason: collision with root package name */
    public int f1834e;

    /* renamed from: f, reason: collision with root package name */
    public String f1835f;
    public ArrayList g;
    public ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f1836i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeTypedList(this.f1832b);
        parcel.writeStringList(this.c);
        parcel.writeTypedArray(this.f1833d, i3);
        parcel.writeInt(this.f1834e);
        parcel.writeString(this.f1835f);
        parcel.writeStringList(this.g);
        parcel.writeTypedList(this.h);
        parcel.writeTypedList(this.f1836i);
    }
}
