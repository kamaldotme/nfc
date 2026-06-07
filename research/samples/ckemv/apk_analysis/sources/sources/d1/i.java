package d1;

import b1.y;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements y, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final i f2626d;

    /* renamed from: b, reason: collision with root package name */
    public List f2627b;
    public List c;

    /* JADX WARN: Type inference failed for: r0v0, types: [d1.i, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f2627b = Collections.emptyList();
        obj.c = Collections.emptyList();
        f2626d = obj;
    }

    public static boolean c(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // b1.y
    public final b1.x a(b1.l lVar, TypeToken typeToken) {
        boolean z3;
        boolean z4;
        boolean c = c(typeToken.getRawType());
        if (c) {
            z3 = true;
        } else {
            b(true);
            z3 = false;
        }
        if (c) {
            z4 = true;
        } else {
            b(false);
            z4 = false;
        }
        if (z3 || z4) {
            return new h(this, z4, z3, lVar, typeToken);
        }
        return null;
    }

    public final void b(boolean z3) {
        Iterator it = (z3 ? this.f2627b : this.c).iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            throw null;
        }
    }

    public final Object clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }
}
