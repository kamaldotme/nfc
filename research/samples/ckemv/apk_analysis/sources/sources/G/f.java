package G;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f187b;
    public final /* synthetic */ Context c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f189e;

    public /* synthetic */ f(String str, Context context, e eVar, int i3, int i4) {
        this.f186a = i4;
        this.f187b = str;
        this.c = context;
        this.f188d = eVar;
        this.f189e = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f186a) {
            case 0:
                return i.a(this.f187b, this.c, this.f188d, this.f189e);
            default:
                try {
                    return i.a(this.f187b, this.c, this.f188d, this.f189e);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
