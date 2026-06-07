package B2;

import e2.AbstractC0139v;
import e2.InterfaceC0137t;
import java.util.List;
import m0.z;
import xyz.happify.ckemv.AppVersion;
import xyz.happify.ckemv.CveConfig;
import xyz.happify.ckemv.MainActivity;
import xyz.happify.ckemv.MeResponse;
import xyz.happify.ckemv.Reporter;

/* loaded from: classes.dex */
public final class t extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public MeResponse f98f;
    public List g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MainActivity f99i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MainActivity mainActivity, O1.d dVar) {
        super(2, dVar);
        this.f99i = mainActivity;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new t(this.f99i, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        ((t) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
        return P1.a.f784b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:10:0x001e, B:12:0x00a5, B:14:0x00af, B:15:0x00b3, B:16:0x00b6, B:26:0x004b, B:28:0x0059, B:30:0x0061, B:32:0x0067, B:34:0x006d, B:36:0x0073, B:38:0x007a), top: B:9:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00c7 -> B:20:0x0029). Please report as a decompilation issue!!! */
    @Override // Q1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        a aVar;
        AppVersion latest_version;
        P1.a aVar2 = P1.a.f784b;
        int i3 = this.h;
        MainActivity mainActivity = this.f99i;
        if (i3 != 0) {
            if (i3 == 1) {
                List<CveConfig> cves = this.g;
                MeResponse meResponse = this.f98f;
                try {
                    z.m0(obj);
                } catch (Exception e3) {
                    e3.getMessage();
                }
                if (cves != null) {
                    cves.size();
                    meResponse.getName();
                    a aVar3 = mainActivity.f5247A;
                    if (aVar3 == null) {
                        X1.g.h("dbHelper");
                        throw null;
                    }
                    aVar3.A(cves);
                }
                this.f98f = null;
                this.g = null;
                this.h = 2;
                if (AbstractC0139v.d(60000L, this) == aVar2) {
                    return aVar2;
                }
                aVar = mainActivity.f5247A;
                if (aVar == null) {
                    X1.g.h("dbHelper");
                    throw null;
                }
                String i4 = aVar.i();
                if (i4 != null) {
                    d2.d.m0(i4, 8);
                    String fetchCves = Reporter.INSTANCE.fetchCves(i4, "https://tqqemv.xyz");
                    if (!d2.l.V(fetchCves, "Error", false)) {
                        meResponse = (MeResponse) new b1.l().b(fetchCves);
                        cves = meResponse != null ? meResponse.getCves() : null;
                        if (meResponse != null && (latest_version = meResponse.getLatest_version()) != null && (latest_version.getMajor() > 1 || (latest_version.getMajor() == 1 && latest_version.getMinor() > 7))) {
                            String str = latest_version.getMajor() + "." + latest_version.getMinor();
                            this.f98f = meResponse;
                            this.g = cves;
                            this.h = 1;
                            if (MainActivity.w(mainActivity, i4, str, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        if (cves != null) {
                        }
                    }
                }
                this.f98f = null;
                this.g = null;
                this.h = 2;
                if (AbstractC0139v.d(60000L, this) == aVar2) {
                }
                aVar = mainActivity.f5247A;
                if (aVar == null) {
                }
            } else if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        z.m0(obj);
        aVar = mainActivity.f5247A;
        if (aVar == null) {
        }
    }
}
