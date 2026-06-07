package d1;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class k extends Number {

    /* renamed from: b, reason: collision with root package name */
    public final String f2629b;

    public k(String str) {
        this.f2629b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f2629b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        Object obj2 = ((k) obj).f2629b;
        String str = this.f2629b;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f2629b);
    }

    public final int hashCode() {
        return this.f2629b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f2629b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f2629b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f2629b;
    }
}
