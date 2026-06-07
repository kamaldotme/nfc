package Y1;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1145a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1145a) {
            case 0:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(n2.b.f4251d);
                return simpleDateFormat;
        }
    }
}
