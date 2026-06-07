package U0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f884a;

    /* renamed from: b, reason: collision with root package name */
    public final float f885b;

    public b(float f3, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f884a;
            f3 += ((b) cVar).f885b;
        }
        this.f884a = cVar;
        this.f885b = f3;
    }

    @Override // U0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f884a.a(rectF) + this.f885b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f884a.equals(bVar.f884a) && this.f885b == bVar.f885b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f884a, Float.valueOf(this.f885b)});
    }
}
