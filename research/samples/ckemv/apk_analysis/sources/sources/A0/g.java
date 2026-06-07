package a0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class g extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1399a;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1399a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final void a(int i3, String[] strArr) {
        X1.g.e(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1399a;
        synchronized (multiInstanceInvalidationService.f2179d) {
            try {
                String str = (String) multiInstanceInvalidationService.c.get(Integer.valueOf(i3));
                if (str == null) {
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.f2179d.beginBroadcast();
                for (int i4 = 0; i4 < beginBroadcast; i4++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f2179d.getBroadcastCookie(i4);
                        X1.g.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.c.get(num);
                        if (i3 != intValue && X1.g.a(str, str2)) {
                            try {
                                ((d) multiInstanceInvalidationService.f2179d.getBroadcastItem(i4)).a(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.f2179d.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final int b(d dVar, String str) {
        X1.g.e(dVar, "callback");
        int i3 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1399a;
        synchronized (multiInstanceInvalidationService.f2179d) {
            try {
                int i4 = multiInstanceInvalidationService.f2178b + 1;
                multiInstanceInvalidationService.f2178b = i4;
                if (multiInstanceInvalidationService.f2179d.register(dVar, Integer.valueOf(i4))) {
                    multiInstanceInvalidationService.c.put(Integer.valueOf(i4), str);
                    i3 = i4;
                } else {
                    multiInstanceInvalidationService.f2178b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [a0.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [a0.d, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i3 == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i3 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                    ?? obj = new Object();
                    obj.f1388a = readStrongBinder;
                    dVar = obj;
                } else {
                    dVar = (d) queryLocalInterface;
                }
            }
            int b3 = b(dVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(b3);
        } else if (i3 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof d)) {
                    ?? obj2 = new Object();
                    obj2.f1388a = readStrongBinder2;
                    dVar2 = obj2;
                } else {
                    dVar2 = (d) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            X1.g.e(dVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1399a;
            synchronized (multiInstanceInvalidationService.f2179d) {
                multiInstanceInvalidationService.f2179d.unregister(dVar2);
            }
            parcel2.writeNoException();
        } else {
            if (i3 != 3) {
                return super.onTransact(i3, parcel, parcel2, i4);
            }
            a(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }
}
