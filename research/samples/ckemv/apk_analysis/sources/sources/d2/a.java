package d2;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2653a;

    static {
        Charset forName = Charset.forName("UTF-8");
        X1.g.d(forName, "forName(...)");
        f2653a = forName;
        X1.g.d(Charset.forName("UTF-16"), "forName(...)");
        X1.g.d(Charset.forName("UTF-16BE"), "forName(...)");
        X1.g.d(Charset.forName("UTF-16LE"), "forName(...)");
        X1.g.d(Charset.forName("US-ASCII"), "forName(...)");
        X1.g.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
