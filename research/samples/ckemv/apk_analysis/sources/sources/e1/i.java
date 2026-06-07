package e1;

import b1.w;
import b1.x;
import b1.y;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class i implements y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2708b;
    public final /* synthetic */ Object c;

    public i(j jVar) {
        this.f2708b = 0;
        this.c = jVar;
    }

    @Override // b1.y
    public final x a(b1.l lVar, TypeToken typeToken) {
        switch (this.f2708b) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (j) this.c;
                }
                return null;
            default:
                if (typeToken.getRawType() == Object.class) {
                    return new k(lVar, (w) this.c);
                }
                return null;
        }
    }

    public i() {
        this.f2708b = 1;
        this.c = w.f2233b;
    }
}
