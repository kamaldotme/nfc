package k;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: k.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260P extends View.BaseSavedState {
    public static final Parcelable.Creator<C0260P> CREATOR = new I0.b(14);

    /* renamed from: b, reason: collision with root package name */
    public boolean f3612b;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeByte(this.f3612b ? (byte) 1 : (byte) 0);
    }
}
