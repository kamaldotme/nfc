package J1;

import I1.y;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class m implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f581b;
    public final /* synthetic */ n c;

    public m(n nVar, y yVar) {
        this.c = nVar;
        this.f581b = yVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        n nVar = this.c;
        y yVar = this.f581b;
        return Float.compare(nVar.a((y) obj2, yVar), nVar.a((y) obj, yVar));
    }
}
