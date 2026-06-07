package b1;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f2232b;

    public r(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f2232b = bool;
    }

    public static boolean c(r rVar) {
        Serializable serializable = rVar.f2232b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number a() {
        Serializable serializable = this.f2232b;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new d1.k((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String b() {
        Serializable serializable = this.f2232b;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return a().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        Serializable serializable = this.f2232b;
        Serializable serializable2 = rVar.f2232b;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (c(this) && c(rVar)) {
            return a().longValue() == rVar.a().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double doubleValue = a().doubleValue();
        double doubleValue2 = rVar.a().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f2232b;
        if (serializable == null) {
            return 31;
        }
        if (c(this)) {
            doubleToLongBits = a().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public r(Number number) {
        Objects.requireNonNull(number);
        this.f2232b = number;
    }

    public r(String str) {
        Objects.requireNonNull(str);
        this.f2232b = str;
    }
}
