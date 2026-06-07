package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f1801a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1802b = 1;
    public final /* synthetic */ B c;

    public A(B b3, int i3) {
        this.c = b3;
        this.f1801a = i3;
    }

    @Override // androidx.fragment.app.z
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        B b3 = this.c;
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = b3.f1822q;
        int i3 = this.f1801a;
        if (abstractComponentCallbacksC0077n == null || i3 >= 0 || !abstractComponentCallbacksC0077n.g().J()) {
            return b3.K(arrayList, arrayList2, i3, this.f1802b);
        }
        return false;
    }
}
