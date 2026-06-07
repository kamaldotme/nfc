package androidx.activity.result;

import I1.v;
import I1.x;
import a.AbstractC0059a;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends v0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0059a f1479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f1480f;

    public c(g gVar, String str, v vVar) {
        this.f1480f = gVar;
        this.f1478d = str;
        this.f1479e = vVar;
    }

    public final void Q(Object obj) {
        g gVar = this.f1480f;
        HashMap hashMap = gVar.f1488b;
        String str = this.f1478d;
        Integer num = (Integer) hashMap.get(str);
        AbstractC0059a abstractC0059a = this.f1479e;
        if (num != null) {
            gVar.f1489d.add(str);
            try {
                gVar.b(num.intValue(), abstractC0059a, (x) obj);
                return;
            } catch (Exception e3) {
                gVar.f1489d.remove(str);
                throw e3;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0059a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
