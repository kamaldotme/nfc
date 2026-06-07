package X1;

import W1.p;
import W1.q;
import W1.s;
import f0.C0166b;

/* loaded from: classes.dex */
public abstract class m {
    public static void a(int i3, Object obj) {
        if (obj != null) {
            if (obj instanceof K1.a) {
                if ((obj instanceof e ? ((e) obj).g() : obj instanceof W1.a ? 0 : obj instanceof W1.l ? 1 : obj instanceof p ? 2 : obj instanceof q ? 3 : obj instanceof C0166b ? 4 : obj instanceof s ? 6 : -1) == i3) {
                    return;
                }
            }
            String f3 = X.d.f("kotlin.jvm.functions.Function", i3);
            ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + f3);
            g.g(classCastException, m.class.getName());
            throw classCastException;
        }
    }
}
