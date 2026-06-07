package s0;

import android.os.Build;
import r0.C0369d;
import t0.C0384a;
import v0.o;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381a extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4699b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381a(t0.e eVar, int i3) {
        super(eVar);
        this.f4699b = i3;
        switch (i3) {
            case 2:
                X1.g.e(eVar, "tracker");
                super(eVar);
                this.c = 7;
                return;
            case 3:
                X1.g.e(eVar, "tracker");
                super(eVar);
                this.c = 7;
                return;
            case 4:
                X1.g.e(eVar, "tracker");
                super(eVar);
                this.c = 9;
                return;
            default:
                X1.g.e(eVar, "tracker");
                this.c = 6;
                return;
        }
    }

    @Override // s0.e
    public final int a() {
        switch (this.f4699b) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            case 3:
                return this.c;
            default:
                return this.c;
        }
    }

    @Override // s0.e
    public final boolean b(o oVar) {
        switch (this.f4699b) {
            case 0:
                return oVar.f5097j.f3965b;
            case 1:
                return oVar.f5097j.f3966d;
            case 2:
                return oVar.f5097j.f3964a == 2;
            case 3:
                int i3 = oVar.f5097j.f3964a;
                return i3 == 3 || (Build.VERSION.SDK_INT >= 30 && i3 == 6);
            default:
                return oVar.f5097j.f3967e;
        }
    }

    @Override // s0.e
    public final boolean c(Object obj) {
        switch (this.f4699b) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C0369d c0369d = (C0369d) obj;
                X1.g.e(c0369d, "value");
                return (c0369d.f4631a && c0369d.f4632b) ? false : true;
            case 3:
                C0369d c0369d2 = (C0369d) obj;
                X1.g.e(c0369d2, "value");
                return !c0369d2.f4631a || c0369d2.c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381a(C0384a c0384a) {
        super(c0384a);
        this.f4699b = 1;
        X1.g.e(c0384a, "tracker");
        this.c = 5;
    }
}
