package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import f.AbstractC0161i;
import f.AbstractC0162j;
import f.AbstractC0163k;
import f.v;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.C0338g;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1009b;
    public final /* synthetic */ Context c;

    public /* synthetic */ h(Context context, int i3) {
        this.f1009b = i3;
        this.c = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        F.h hVar;
        Object obj;
        Context context;
        switch (this.f1009b) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.c, 1));
                return;
            case 1:
                g.t(this.c, new e(0), g.f1002a, false);
                return;
            default:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context2 = this.c;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (!F.b.a()) {
                            hVar = AbstractC0163k.f2915d;
                            break;
                        } else {
                            Iterator it = AbstractC0163k.h.iterator();
                            while (true) {
                                C0338g c0338g = (C0338g) it;
                                if (c0338g.hasNext()) {
                                    AbstractC0163k abstractC0163k = (AbstractC0163k) ((WeakReference) c0338g.next()).get();
                                    if (abstractC0163k != null && (context = ((v) abstractC0163k).f2983l) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                hVar = new F.h(new F.i(AbstractC0162j.a(obj)));
                                if (hVar.f156a.f157a.isEmpty()) {
                                    String E2 = u2.l.E(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        AbstractC0162j.b(systemService, AbstractC0161i.a(E2));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            hVar = F.h.f155b;
                            if (hVar.f156a.f157a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC0163k.g = true;
                return;
        }
    }
}
