package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083u implements androidx.activity.result.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2004b;
    public final /* synthetic */ B c;

    public /* synthetic */ C0083u(B b3, int i3) {
        this.f2004b = i3;
        this.c = b3;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        switch (this.f2004b) {
            case 0:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                B b3 = this.c;
                y yVar = (y) b3.f1828w.pollFirst();
                if (yVar == null) {
                    return;
                }
                AbstractComponentCallbacksC0077n l3 = b3.c.l(yVar.f2011b);
                if (l3 == null) {
                    return;
                }
                int i3 = aVar.f1477b;
                if (Log.isLoggable("FragmentManager", 2)) {
                    l3.toString();
                    Objects.toString(aVar.c);
                    return;
                }
                return;
            case 1:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
                }
                B b4 = this.c;
                y yVar2 = (y) b4.f1828w.pollFirst();
                if (yVar2 == null) {
                    return;
                }
                b4.c.l(yVar2.f2011b);
                return;
            default:
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                B b5 = this.c;
                y yVar3 = (y) b5.f1828w.pollFirst();
                if (yVar3 == null) {
                    return;
                }
                AbstractComponentCallbacksC0077n l4 = b5.c.l(yVar3.f2011b);
                if (l4 == null) {
                    return;
                }
                int i5 = aVar2.f1477b;
                if (Log.isLoggable("FragmentManager", 2)) {
                    l4.toString();
                    Objects.toString(aVar2.c);
                    return;
                }
                return;
        }
    }
}
