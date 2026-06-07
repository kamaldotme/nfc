package L1;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class m extends l {
    public static int S(Iterable iterable) {
        X1.g.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
