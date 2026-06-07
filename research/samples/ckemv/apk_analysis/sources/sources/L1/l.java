package L1;

import java.util.List;

/* loaded from: classes.dex */
public abstract class l extends v0.f {
    public static int Q(List list) {
        X1.g.e(list, "<this>");
        return list.size() - 1;
    }

    public static List R(Object... objArr) {
        X1.g.e(objArr, "elements");
        return objArr.length > 0 ? j.Q(objArr) : t.f622b;
    }
}
