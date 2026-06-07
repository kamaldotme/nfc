package G;

import java.util.ArrayList;
import n.C0342k;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191b;

    public /* synthetic */ g(int i3, Object obj) {
        this.f190a = i3;
        this.f191b = obj;
    }

    public final void a(Object obj) {
        switch (this.f190a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((v0.l) this.f191b).j(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.c) {
                    try {
                        C0342k c0342k = i.f196d;
                        ArrayList arrayList = (ArrayList) c0342k.getOrDefault((String) this.f191b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c0342k.remove((String) this.f191b);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((g) arrayList.get(i3)).a(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
