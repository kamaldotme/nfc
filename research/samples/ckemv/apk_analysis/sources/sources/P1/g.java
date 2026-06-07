package p1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4350a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f4351b;

    static {
        String name = Charset.defaultCharset().name();
        f4350a = name;
        f4351b = "SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name);
    }
}
