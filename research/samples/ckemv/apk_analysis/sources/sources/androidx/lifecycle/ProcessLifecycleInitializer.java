package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import h0.C0179a;
import h0.InterfaceC0180b;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0180b {
    @Override // h0.InterfaceC0180b
    public final List a() {
        return L1.t.f622b;
    }

    @Override // h0.InterfaceC0180b
    public final Object b(Context context) {
        X1.g.e(context, "context");
        C0179a c = C0179a.c(context);
        X1.g.d(c, "getInstance(context)");
        if (!c.f3085b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!AbstractC0098o.f2048a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            X1.g.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0097n());
        }
        D d3 = D.f2013j;
        d3.getClass();
        d3.f2017f = new Handler();
        d3.g.d(EnumC0095l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        X1.g.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C(d3));
        return d3;
    }
}
