package d1;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f2648a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [d1.s] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        ?? r12;
        if (j.f2628a >= 9) {
            try {
                r12 = new q(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
            if (r12 == 0) {
                r12 = new Object();
            }
            f2648a = r12;
        }
        r12 = 0;
        if (r12 == 0) {
        }
        f2648a = r12;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
