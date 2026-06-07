package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class S implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1879b;
    public final /* synthetic */ T c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0070g f1880d;

    public /* synthetic */ S(C0070g c0070g, T t3, int i3) {
        this.f1879b = i3;
        this.f1880d = c0070g;
        this.c = t3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1879b) {
            case 0:
                ArrayList arrayList = this.f1880d.f1921b;
                T t3 = this.c;
                if (arrayList.contains(t3)) {
                    X.d.a(t3.c.f1957F, t3.f1881a);
                    return;
                }
                return;
            default:
                C0070g c0070g = this.f1880d;
                ArrayList arrayList2 = c0070g.f1921b;
                T t4 = this.c;
                arrayList2.remove(t4);
                c0070g.c.remove(t4);
                return;
        }
    }
}
