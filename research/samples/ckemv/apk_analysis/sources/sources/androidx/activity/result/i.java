package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new I0.b(6);

    /* renamed from: b, reason: collision with root package name */
    public final IntentSender f1492b;
    public final Intent c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1493d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1494e;

    public i(IntentSender intentSender, Intent intent, int i3, int i4) {
        X1.g.e(intentSender, "intentSender");
        this.f1492b = intentSender;
        this.c = intent;
        this.f1493d = i3;
        this.f1494e = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        X1.g.e(parcel, "dest");
        parcel.writeParcelable(this.f1492b, i3);
        parcel.writeParcelable(this.c, i3);
        parcel.writeInt(this.f1493d);
        parcel.writeInt(this.f1494e);
    }
}
