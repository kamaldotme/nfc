package b1;

import i1.C0186a;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: b, reason: collision with root package name */
    public static final s f2233b;
    public static final t c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w[] f2234d;

    static {
        s sVar = new s();
        f2233b = sVar;
        t tVar = new t();
        c = tVar;
        f2234d = new w[]{sVar, tVar, new w() { // from class: b1.u
            @Override // b1.w
            public final Number a(C0186a c0186a) {
                String U2 = c0186a.U();
                try {
                    return Long.valueOf(Long.parseLong(U2));
                } catch (NumberFormatException unused) {
                    try {
                        Double valueOf = Double.valueOf(U2);
                        if (!valueOf.isInfinite()) {
                            if (valueOf.isNaN()) {
                            }
                            return valueOf;
                        }
                        if (!c0186a.c) {
                            throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + c0186a.I(true));
                        }
                        return valueOf;
                    } catch (NumberFormatException e3) {
                        throw new RuntimeException("Cannot parse " + U2 + "; at path " + c0186a.I(true), e3);
                    }
                }
            }
        }, new w() { // from class: b1.v
            @Override // b1.w
            public final Number a(C0186a c0186a) {
                String U2 = c0186a.U();
                try {
                    return new BigDecimal(U2);
                } catch (NumberFormatException e3) {
                    throw new RuntimeException("Cannot parse " + U2 + "; at path " + c0186a.I(true), e3);
                }
            }
        }};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f2234d.clone();
    }

    public abstract Number a(C0186a c0186a);
}
