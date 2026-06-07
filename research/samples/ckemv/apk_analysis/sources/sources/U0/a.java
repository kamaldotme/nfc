package U0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f883a;

    public a(float f3) {
        this.f883a = f3;
    }

    @Override // U0.c
    public final float a(RectF rectF) {
        return this.f883a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f883a == ((a) obj).f883a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f883a)});
    }
}
