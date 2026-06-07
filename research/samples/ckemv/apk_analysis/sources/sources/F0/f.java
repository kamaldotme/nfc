package F0;

import X0.E;
import Z.P;
import android.os.Parcel;
import android.os.Parcelable;
import k.Y0;
import k.l1;

/* loaded from: classes.dex */
public final class f implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167a;

    public /* synthetic */ f(int i3) {
        this.f167a = i3;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f167a) {
            case 0:
                return new g(parcel, classLoader);
            case 1:
                return new G0.b(parcel, classLoader);
            case 2:
                return new O0.a(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return P.b.c;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new V0.d(parcel, classLoader);
            case 5:
                return new E(parcel, classLoader);
            case 6:
                return new P(parcel, classLoader);
            case 7:
                return new Y0(parcel, classLoader);
            case 8:
                return new l1(parcel, classLoader);
            default:
                return new v.f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f167a) {
            case 0:
                return new g[i3];
            case 1:
                return new G0.b[i3];
            case 2:
                return new O0.a[i3];
            case 3:
                return new P.b[i3];
            case 4:
                return new V0.d[i3];
            case 5:
                return new E[i3];
            case 6:
                return new P[i3];
            case 7:
                return new Y0[i3];
            case 8:
                return new l1[i3];
            default:
                return new v.f[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f167a) {
            case 0:
                return new g(parcel, (ClassLoader) null);
            case 1:
                return new G0.b(parcel, null);
            case 2:
                return new O0.a(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return P.b.c;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new V0.d(parcel, (ClassLoader) null);
            case 5:
                return new E(parcel, null);
            case 6:
                return new P(parcel, null);
            case 7:
                return new Y0(parcel, null);
            case 8:
                return new l1(parcel, null);
            default:
                return new v.f(parcel, null);
        }
    }
}
