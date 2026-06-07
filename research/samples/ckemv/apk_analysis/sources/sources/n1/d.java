package n1;

import j1.EnumC0231a;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4237a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f4238b;

    static {
        EnumSet of = EnumSet.of(EnumC0231a.f3467m);
        EnumSet of2 = EnumSet.of(EnumC0231a.g);
        EnumSet of3 = EnumSet.of(EnumC0231a.f3459b);
        EnumSet of4 = EnumSet.of(EnumC0231a.f3466l);
        EnumSet of5 = EnumSet.of(EnumC0231a.f3470p, EnumC0231a.f3471q, EnumC0231a.f3463i, EnumC0231a.h, EnumC0231a.f3468n, EnumC0231a.f3469o);
        EnumSet of6 = EnumSet.of(EnumC0231a.f3460d, EnumC0231a.f3461e, EnumC0231a.f3462f, EnumC0231a.f3464j, EnumC0231a.c);
        EnumSet copyOf = EnumSet.copyOf((Collection) of5);
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f4238b = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }
}
