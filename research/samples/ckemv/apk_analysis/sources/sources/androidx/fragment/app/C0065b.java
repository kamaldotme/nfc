package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065b implements Parcelable {
    public static final Parcelable.Creator<C0065b> CREATOR = new I0.b(7);

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1901b;
    public final ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1902d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f1903e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1904f;
    public final String g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1905i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f1906j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1907k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f1908l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1909m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1910n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1911o;

    public C0065b(C0064a c0064a) {
        int size = c0064a.f1886a.size();
        this.f1901b = new int[size * 5];
        if (c0064a.g) {
            this.c = new ArrayList(size);
            this.f1902d = new int[size];
            this.f1903e = new int[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                H h = (H) c0064a.f1886a.get(i4);
                int i5 = i3 + 1;
                this.f1901b[i3] = h.f1859a;
                ArrayList arrayList = this.c;
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = h.f1860b;
                arrayList.add(abstractComponentCallbacksC0077n != null ? abstractComponentCallbacksC0077n.f1972f : null);
                int[] iArr = this.f1901b;
                iArr[i5] = h.c;
                iArr[i3 + 2] = h.f1861d;
                int i6 = i3 + 4;
                iArr[i3 + 3] = h.f1862e;
                i3 += 5;
                iArr[i6] = h.f1863f;
                this.f1902d[i4] = h.g.ordinal();
                this.f1903e[i4] = h.h.ordinal();
            }
            this.f1904f = c0064a.f1890f;
            this.g = c0064a.h;
            this.h = c0064a.f1900r;
            this.f1905i = c0064a.f1891i;
            this.f1906j = c0064a.f1892j;
            this.f1907k = c0064a.f1893k;
            this.f1908l = c0064a.f1894l;
            this.f1909m = c0064a.f1895m;
            this.f1910n = c0064a.f1896n;
            this.f1911o = c0064a.f1897o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f1901b);
        parcel.writeStringList(this.c);
        parcel.writeIntArray(this.f1902d);
        parcel.writeIntArray(this.f1903e);
        parcel.writeInt(this.f1904f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.f1905i);
        TextUtils.writeToParcel(this.f1906j, parcel, 0);
        parcel.writeInt(this.f1907k);
        TextUtils.writeToParcel(this.f1908l, parcel, 0);
        parcel.writeStringList(this.f1909m);
        parcel.writeStringList(this.f1910n);
        parcel.writeInt(this.f1911o ? 1 : 0);
    }

    public C0065b(Parcel parcel) {
        this.f1901b = parcel.createIntArray();
        this.c = parcel.createStringArrayList();
        this.f1902d = parcel.createIntArray();
        this.f1903e = parcel.createIntArray();
        this.f1904f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.f1905i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1906j = (CharSequence) creator.createFromParcel(parcel);
        this.f1907k = parcel.readInt();
        this.f1908l = (CharSequence) creator.createFromParcel(parcel);
        this.f1909m = parcel.createStringArrayList();
        this.f1910n = parcel.createStringArrayList();
        this.f1911o = parcel.readInt() != 0;
    }
}
