package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new I0.b(3);

    /* renamed from: b, reason: collision with root package name */
    public int f1239b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1240d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1241e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1239b + ", mGapDir=" + this.c + ", mHasUnwantedGapAfter=" + this.f1241e + ", mGapPerSpan=" + Arrays.toString(this.f1240d) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1239b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f1241e ? 1 : 0);
        int[] iArr = this.f1240d;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1240d);
        }
    }
}
