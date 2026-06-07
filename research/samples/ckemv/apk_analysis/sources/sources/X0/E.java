package X0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class E extends P.b {
    public static final Parcelable.Creator<E> CREATOR = new F0.f(5);

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1021d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1022e;

    public E(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1021d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1022e = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1021d) + "}";
    }

    @Override // P.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        TextUtils.writeToParcel(this.f1021d, parcel, i3);
        parcel.writeInt(this.f1022e ? 1 : 0);
    }
}
