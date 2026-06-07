package F0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class g extends P.b {
    public static final Parcelable.Creator<g> CREATOR = new f(0);

    /* renamed from: d, reason: collision with root package name */
    public final int f168d;

    /* renamed from: e, reason: collision with root package name */
    public final int f169e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f170f;
    public final boolean g;
    public final boolean h;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f168d = parcel.readInt();
        this.f169e = parcel.readInt();
        this.f170f = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1;
        this.h = parcel.readInt() == 1;
    }

    @Override // P.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f168d);
        parcel.writeInt(this.f169e);
        parcel.writeInt(this.f170f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }

    public g(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f168d = bottomSheetBehavior.f2290L;
        this.f169e = bottomSheetBehavior.f2312e;
        this.f170f = bottomSheetBehavior.f2307b;
        this.g = bottomSheetBehavior.f2287I;
        this.h = bottomSheetBehavior.f2288J;
    }
}
