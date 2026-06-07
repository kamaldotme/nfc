package I0;

import N.l;
import X1.g;
import Z.C0052t;
import Z.c0;
import Z.d0;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.result.i;
import androidx.fragment.app.C;
import androidx.fragment.app.C0065b;
import androidx.fragment.app.F;
import androidx.fragment.app.y;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.o;
import java.util.ArrayList;
import k.C0260P;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295a;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$BaseSavedState, java.lang.Object, I0.c] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, androidx.fragment.app.y] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.fragment.app.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, java.lang.Object, N.l] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.view.View$BaseSavedState, java.lang.Object, k.P] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Z.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Z.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Z.d0, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f295a) {
            case 0:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f296b = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return baseSavedState;
            case 1:
                ?? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f674b = parcel.readInt();
                return baseSavedState2;
            case 2:
                ?? obj = new Object();
                obj.f1351b = parcel.readInt();
                obj.c = parcel.readInt();
                obj.f1352d = parcel.readInt() == 1;
                return obj;
            case 3:
                ?? obj2 = new Object();
                obj2.f1239b = parcel.readInt();
                obj2.c = parcel.readInt();
                obj2.f1241e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj2.f1240d = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj2;
            case 4:
                ?? obj3 = new Object();
                obj3.f1246b = parcel.readInt();
                obj3.c = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj3.f1247d = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj3.f1248e = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj3.f1249f = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj3.g = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj3.f1250i = parcel.readInt() == 1;
                obj3.f1251j = parcel.readInt() == 1;
                obj3.f1252k = parcel.readInt() == 1;
                obj3.h = parcel.readArrayList(c0.class.getClassLoader());
                return obj3;
            case 5:
                return new androidx.activity.result.a(parcel);
            case 6:
                g.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                g.b(readParcelable);
                return new i((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 7:
                return new C0065b(parcel);
            case 8:
                ?? obj4 = new Object();
                obj4.f2011b = parcel.readString();
                obj4.c = parcel.readInt();
                return obj4;
            case 9:
                ?? obj5 = new Object();
                obj5.f1835f = null;
                obj5.g = new ArrayList();
                obj5.h = new ArrayList();
                obj5.f1832b = parcel.createTypedArrayList(F.CREATOR);
                obj5.c = parcel.createStringArrayList();
                obj5.f1833d = (C0065b[]) parcel.createTypedArray(C0065b.CREATOR);
                obj5.f1834e = parcel.readInt();
                obj5.f1835f = parcel.readString();
                obj5.g = parcel.createStringArrayList();
                obj5.h = parcel.createTypedArrayList(Bundle.CREATOR);
                obj5.f1836i = parcel.createTypedArrayList(y.CREATOR);
                return obj5;
            case 10:
                return new F(parcel);
            case 11:
                return new com.google.android.material.datepicker.b((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
            case 12:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 13:
                return o.a(parcel.readInt(), parcel.readInt());
            case 14:
                ?? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.f3612b = parcel.readByte() != 0;
                return baseSavedState3;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f295a) {
            case 0:
                return new c[i3];
            case 1:
                return new l[i3];
            case 2:
                return new C0052t[i3];
            case 3:
                return new c0[i3];
            case 4:
                return new d0[i3];
            case 5:
                return new androidx.activity.result.a[i3];
            case 6:
                return new i[i3];
            case 7:
                return new C0065b[i3];
            case 8:
                return new y[i3];
            case 9:
                return new C[i3];
            case 10:
                return new F[i3];
            case 11:
                return new com.google.android.material.datepicker.b[i3];
            case 12:
                return new com.google.android.material.datepicker.d[i3];
            case 13:
                return new o[i3];
            case 14:
                return new C0260P[i3];
            default:
                return new ParcelImpl[i3];
        }
    }
}
