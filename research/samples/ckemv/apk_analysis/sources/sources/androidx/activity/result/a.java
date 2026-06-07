package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new I0.b(5);

    /* renamed from: b, reason: collision with root package name */
    public final int f1477b;
    public final Intent c;

    public a(Intent intent, int i3) {
        this.f1477b = i3;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f1477b;
        sb.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1477b);
        Intent intent = this.c;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }

    public a(Parcel parcel) {
        this.f1477b = parcel.readInt();
        this.c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
