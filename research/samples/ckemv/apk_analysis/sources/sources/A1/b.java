package A1;

import j1.C0238h;
import p1.C0356a;

/* loaded from: classes.dex */
public final class b extends d {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(C0356a c0356a, int i3) {
        super(c0356a);
        this.c = i3;
    }

    @Override // A1.f
    public final String j() {
        switch (this.c) {
            case 0:
                if (((C0356a) this.f46a).c < 48) {
                    throw C0238h.f3489d;
                }
                StringBuilder sb = new StringBuilder();
                l(sb, 8);
                v0.m mVar = (v0.m) this.f47b;
                int j3 = v0.m.j(48, 2, (C0356a) mVar.c);
                sb.append("(392");
                sb.append(j3);
                sb.append(')');
                sb.append(mVar.e(null, 50).f53b);
                return sb.toString();
            case 1:
                if (((C0356a) this.f46a).c < 48) {
                    throw C0238h.f3489d;
                }
                StringBuilder sb2 = new StringBuilder();
                l(sb2, 8);
                v0.m mVar2 = (v0.m) this.f47b;
                int j4 = v0.m.j(48, 2, (C0356a) mVar2.c);
                sb2.append("(393");
                sb2.append(j4);
                sb2.append(')');
                int j5 = v0.m.j(50, 10, (C0356a) mVar2.c);
                if (j5 / 100 == 0) {
                    sb2.append('0');
                }
                if (j5 / 10 == 0) {
                    sb2.append('0');
                }
                sb2.append(j5);
                sb2.append(mVar2.e(null, 60).f53b);
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder();
                sb3.append("(01)");
                int length = sb3.length();
                v0.m mVar3 = (v0.m) this.f47b;
                sb3.append(v0.m.j(4, 4, (C0356a) mVar3.c));
                m(sb3, 8, length);
                return mVar3.d(sb3, 48);
        }
    }
}
