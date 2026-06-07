package O1;

import W1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final j f782b = new Object();

    @Override // O1.i
    public final g A(h hVar) {
        X1.g.e(hVar, "key");
        return null;
    }

    @Override // O1.i
    public final Object D(Object obj, p pVar) {
        return obj;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // O1.i
    public final i i(h hVar) {
        X1.g.e(hVar, "key");
        return this;
    }

    @Override // O1.i
    public final i o(i iVar) {
        X1.g.e(iVar, "context");
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
