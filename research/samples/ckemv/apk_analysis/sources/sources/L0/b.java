package l0;

import X.d;
import android.os.Parcel;
import android.util.SparseIntArray;
import n.C0333b;
import n.C0342k;

/* loaded from: classes.dex */
public final class b extends AbstractC0325a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f3897d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3898e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3899f;
    public final int g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public int f3900i;

    /* renamed from: j, reason: collision with root package name */
    public int f3901j;

    /* renamed from: k, reason: collision with root package name */
    public int f3902k;

    /* JADX WARN: Type inference failed for: r5v0, types: [n.b, n.k] */
    /* JADX WARN: Type inference failed for: r6v0, types: [n.b, n.k] */
    /* JADX WARN: Type inference failed for: r7v0, types: [n.b, n.k] */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0342k(), new C0342k(), new C0342k());
    }

    @Override // l0.AbstractC0325a
    public final b a() {
        Parcel parcel = this.f3898e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f3901j;
        if (i3 == this.f3899f) {
            i3 = this.g;
        }
        return new b(parcel, dataPosition, i3, d.j(new StringBuilder(), this.h, "  "), this.f3895a, this.f3896b, this.c);
    }

    @Override // l0.AbstractC0325a
    public final boolean e(int i3) {
        while (this.f3901j < this.g) {
            int i4 = this.f3902k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f3901j;
            Parcel parcel = this.f3898e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f3902k = parcel.readInt();
            this.f3901j += readInt;
        }
        return this.f3902k == i3;
    }

    @Override // l0.AbstractC0325a
    public final void h(int i3) {
        int i4 = this.f3900i;
        SparseIntArray sparseIntArray = this.f3897d;
        Parcel parcel = this.f3898e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f3900i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i4, String str, C0333b c0333b, C0333b c0333b2, C0333b c0333b3) {
        super(c0333b, c0333b2, c0333b3);
        this.f3897d = new SparseIntArray();
        this.f3900i = -1;
        this.f3902k = -1;
        this.f3898e = parcel;
        this.f3899f = i3;
        this.g = i4;
        this.f3901j = i3;
        this.h = str;
    }
}
