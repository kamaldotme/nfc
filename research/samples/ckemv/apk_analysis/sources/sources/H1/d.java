package H1;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Serializable, Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((c) obj).c, ((c) obj2).c);
    }
}
