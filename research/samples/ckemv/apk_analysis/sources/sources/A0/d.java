package a0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f1388a;

    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f1388a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1388a;
    }
}
