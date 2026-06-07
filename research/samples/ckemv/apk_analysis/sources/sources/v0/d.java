package V0;

import F0.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class d extends P.b {
    public static final Parcelable.Creator<d> CREATOR = new f(4);

    /* renamed from: d, reason: collision with root package name */
    public final int f979d;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f979d = parcel.readInt();
    }

    @Override // P.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f979d);
    }

    public d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f979d = sideSheetBehavior.h;
    }
}
