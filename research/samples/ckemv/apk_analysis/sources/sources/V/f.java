package v;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class f extends P.b {
    public static final Parcelable.Creator<f> CREATOR = new F0.f(9);

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f5060d;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f5060d = new SparseArray(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            this.f5060d.append(iArr[i3], readParcelableArray[i3]);
        }
    }

    @Override // P.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        SparseArray sparseArray = this.f5060d;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f5060d.keyAt(i4);
            parcelableArr[i4] = (Parcelable) this.f5060d.valueAt(i4);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i3);
    }
}
