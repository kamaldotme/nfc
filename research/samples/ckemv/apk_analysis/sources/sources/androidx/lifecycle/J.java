package androidx.lifecycle;

import android.os.Bundle;
import d0.InterfaceC0114c;
import f.AbstractActivityC0159g;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements InterfaceC0114c {

    /* renamed from: a, reason: collision with root package name */
    public final d0.d f2023a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2024b;
    public Bundle c;

    /* renamed from: d, reason: collision with root package name */
    public final K1.f f2025d;

    public J(d0.d dVar, AbstractActivityC0159g abstractActivityC0159g) {
        X1.g.e(dVar, "savedStateRegistry");
        this.f2023a = dVar;
        this.f2025d = new K1.f(new a0.l(1, abstractActivityC0159g));
    }

    @Override // d0.InterfaceC0114c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((K) this.f2025d.a()).c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f2024b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        X.d.q(entry.getValue());
        throw null;
    }
}
