package U0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f925a;

    public h(float f3) {
        this.f925a = f3;
    }

    @Override // U0.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f925a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f925a == ((h) obj).f925a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f925a)});
    }
}
