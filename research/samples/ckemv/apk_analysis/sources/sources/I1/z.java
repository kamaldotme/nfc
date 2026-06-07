package I1;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final t f388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f389b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f390d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f391e;

    public z(byte[] bArr, int i3, int i4, int i5, int i6) {
        this.f388a = new t(i3, i4, bArr);
        this.c = i6;
        this.f389b = i5;
        if (i3 * i4 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i3 + "x" + i4 + " > " + bArr.length);
    }
}
