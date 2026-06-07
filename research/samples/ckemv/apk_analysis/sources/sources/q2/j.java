package q2;

import java.net.Proxy;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4465a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f4465a = iArr;
    }
}
