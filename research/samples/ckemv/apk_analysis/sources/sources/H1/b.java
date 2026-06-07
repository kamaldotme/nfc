package H1;

import j1.o;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final p1.b f278a;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f280d;

    /* renamed from: e, reason: collision with root package name */
    public final int f281e;

    /* renamed from: f, reason: collision with root package name */
    public final int f282f;
    public final float g;

    /* renamed from: i, reason: collision with root package name */
    public final o f283i;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f279b = new ArrayList(5);
    public final int[] h = new int[3];

    public b(p1.b bVar, int i3, int i4, int i5, int i6, float f3, o oVar) {
        this.f278a = bVar;
        this.c = i3;
        this.f280d = i4;
        this.f281e = i5;
        this.f282f = i6;
        this.g = f3;
        this.f283i = oVar;
    }

    public final boolean a(int[] iArr) {
        float f3 = this.g;
        float f4 = f3 / 2.0f;
        for (int i3 = 0; i3 < 3; i3++) {
            if (Math.abs(f3 - iArr[i3]) >= f4) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i3, int i4, int[] iArr) {
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = i5 + i6 + iArr[2];
        float f3 = (i4 - r6) - (i6 / 2.0f);
        int i8 = (int) f3;
        int i9 = i6 * 2;
        p1.b bVar = this.f278a;
        int i10 = bVar.c;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i11 = i3;
        while (i11 >= 0 && bVar.b(i8, i11)) {
            int i12 = iArr2[1];
            if (i12 > i9) {
                break;
            }
            iArr2[1] = i12 + 1;
            i11--;
        }
        float f4 = Float.NaN;
        if (i11 >= 0 && iArr2[1] <= i9) {
            while (i11 >= 0 && !bVar.b(i8, i11)) {
                int i13 = iArr2[0];
                if (i13 > i9) {
                    break;
                }
                iArr2[0] = i13 + 1;
                i11--;
            }
            if (iArr2[0] <= i9) {
                int i14 = i3 + 1;
                while (i14 < i10 && bVar.b(i8, i14)) {
                    int i15 = iArr2[1];
                    if (i15 > i9) {
                        break;
                    }
                    iArr2[1] = i15 + 1;
                    i14++;
                }
                if (i14 != i10 && iArr2[1] <= i9) {
                    while (i14 < i10 && !bVar.b(i8, i14)) {
                        int i16 = iArr2[2];
                        if (i16 > i9) {
                            break;
                        }
                        iArr2[2] = i16 + 1;
                        i14++;
                    }
                    int i17 = iArr2[2];
                    if (i17 <= i9 && Math.abs(((iArr2[0] + iArr2[1]) + i17) - i7) * 5 < i7 * 2 && a(iArr2)) {
                        f4 = (i14 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f4)) {
            return null;
        }
        float f5 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList arrayList = this.f279b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (Math.abs(f4 - aVar.f3506b) <= f5) {
                float f6 = aVar.f3505a;
                if (Math.abs(f3 - f6) <= f5) {
                    float f7 = aVar.c;
                    float abs = Math.abs(f5 - f7);
                    if (abs <= 1.0f || abs <= f7) {
                        return new a((f6 + f3) / 2.0f, (aVar.f3506b + f4) / 2.0f, (f7 + f5) / 2.0f);
                    }
                } else {
                    continue;
                }
            }
        }
        a aVar2 = new a(f3, f4, f5);
        arrayList.add(aVar2);
        o oVar = this.f283i;
        if (oVar == null) {
            return null;
        }
        oVar.a(aVar2);
        return null;
    }
}
