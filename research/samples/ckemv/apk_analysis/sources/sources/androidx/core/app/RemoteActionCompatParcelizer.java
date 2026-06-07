package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import l0.AbstractC0325a;
import l0.b;
import l0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0325a abstractC0325a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1719a;
        if (abstractC0325a.e(1)) {
            cVar = abstractC0325a.g();
        }
        remoteActionCompat.f1719a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1720b;
        if (abstractC0325a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0325a).f3898e);
        }
        remoteActionCompat.f1720b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (abstractC0325a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0325a).f3898e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.f1721d = (PendingIntent) abstractC0325a.f(remoteActionCompat.f1721d, 4);
        boolean z3 = remoteActionCompat.f1722e;
        if (abstractC0325a.e(5)) {
            z3 = ((b) abstractC0325a).f3898e.readInt() != 0;
        }
        remoteActionCompat.f1722e = z3;
        boolean z4 = remoteActionCompat.f1723f;
        if (abstractC0325a.e(6)) {
            z4 = ((b) abstractC0325a).f3898e.readInt() != 0;
        }
        remoteActionCompat.f1723f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0325a abstractC0325a) {
        abstractC0325a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1719a;
        abstractC0325a.h(1);
        abstractC0325a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1720b;
        abstractC0325a.h(2);
        Parcel parcel = ((b) abstractC0325a).f3898e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        abstractC0325a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1721d;
        abstractC0325a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f1722e;
        abstractC0325a.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f1723f;
        abstractC0325a.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
