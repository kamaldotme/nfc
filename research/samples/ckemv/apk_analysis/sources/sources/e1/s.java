package e1;

import b1.x;
import b1.y;
import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class s implements y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2737b;
    public final /* synthetic */ Class c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Class f2738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f2739e;

    public s(Class cls, Class cls2, x xVar) {
        this.f2737b = 0;
        this.c = cls;
        this.f2738d = cls2;
        this.f2739e = xVar;
    }

    @Override // b1.y
    public final x a(b1.l lVar, TypeToken typeToken) {
        switch (this.f2737b) {
            case 0:
                Class rawType = typeToken.getRawType();
                if (rawType == this.c || rawType == this.f2738d) {
                    return this.f2739e;
                }
                return null;
            default:
                Class rawType2 = typeToken.getRawType();
                if (rawType2 == this.c || rawType2 == this.f2738d) {
                    return this.f2739e;
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f2737b) {
            case 0:
                return "Factory[type=" + this.f2738d.getName() + "+" + this.c.getName() + ",adapter=" + this.f2739e + "]";
            default:
                return "Factory[type=" + this.c.getName() + "+" + this.f2738d.getName() + ",adapter=" + this.f2739e + "]";
        }
    }

    public s(b1.i iVar) {
        this.f2737b = 1;
        this.c = Calendar.class;
        this.f2738d = GregorianCalendar.class;
        this.f2739e = iVar;
    }
}
