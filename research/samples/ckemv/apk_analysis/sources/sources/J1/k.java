package J1;

import I1.y;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f577a;

    @Override // J1.n
    public final float a(y yVar, y yVar2) {
        int i3;
        switch (this.f577a) {
            case 0:
                if (yVar.f387b <= 0 || yVar.c <= 0) {
                    return 0.0f;
                }
                int i4 = yVar.a(yVar2).f387b;
                float f3 = (i4 * 1.0f) / yVar.f387b;
                if (f3 > 1.0f) {
                    f3 = (float) Math.pow(1.0f / f3, 1.1d);
                }
                float f4 = ((r0.c * 1.0f) / yVar2.c) + ((i4 * 1.0f) / yVar2.f387b);
                return ((1.0f / f4) / f4) * f3;
            case 1:
                if (yVar.f387b <= 0 || yVar.c <= 0) {
                    return 0.0f;
                }
                int i5 = yVar.b(yVar2).f387b;
                float f5 = (i5 * 1.0f) / yVar.f387b;
                if (f5 > 1.0f) {
                    f5 = (float) Math.pow(1.0f / f5, 1.1d);
                }
                float f6 = ((yVar2.c * 1.0f) / r0.c) * ((yVar2.f387b * 1.0f) / i5);
                return (((1.0f / f6) / f6) / f6) * f5;
            default:
                int i6 = yVar.f387b;
                if (i6 <= 0 || (i3 = yVar.c) <= 0) {
                    return 0.0f;
                }
                int i7 = yVar2.f387b;
                float f7 = (i6 * 1.0f) / i7;
                if (f7 < 1.0f) {
                    f7 = 1.0f / f7;
                }
                float f8 = i3;
                float f9 = yVar2.c;
                float f10 = (f8 * 1.0f) / f9;
                if (f10 < 1.0f) {
                    f10 = 1.0f / f10;
                }
                float f11 = (1.0f / f7) / f10;
                float f12 = ((i6 * 1.0f) / f8) / ((i7 * 1.0f) / f9);
                if (f12 < 1.0f) {
                    f12 = 1.0f / f12;
                }
                return (((1.0f / f12) / f12) / f12) * f11;
        }
    }

    @Override // J1.n
    public final Rect b(y yVar, y yVar2) {
        switch (this.f577a) {
            case 0:
                y a3 = yVar.a(yVar2);
                yVar.toString();
                a3.toString();
                yVar2.toString();
                int i3 = a3.f387b;
                int i4 = (i3 - yVar2.f387b) / 2;
                int i5 = a3.c;
                int i6 = (i5 - yVar2.c) / 2;
                return new Rect(-i4, -i6, i3 - i4, i5 - i6);
            case 1:
                y b3 = yVar.b(yVar2);
                yVar.toString();
                b3.toString();
                yVar2.toString();
                int i7 = b3.f387b;
                int i8 = (i7 - yVar2.f387b) / 2;
                int i9 = b3.c;
                int i10 = (i9 - yVar2.c) / 2;
                return new Rect(-i8, -i10, i7 - i8, i9 - i10);
            default:
                return new Rect(0, 0, yVar2.f387b, yVar2.c);
        }
    }
}
