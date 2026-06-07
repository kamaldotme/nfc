package A1;

import j1.C0238h;
import p1.C0356a;

/* loaded from: classes.dex */
public final class a extends e {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(C0356a c0356a, int i3) {
        super(c0356a);
        this.c = i3;
    }

    @Override // A1.f
    public final String j() {
        if (((C0356a) this.f46a).c != 60) {
            throw C0238h.f3489d;
        }
        StringBuilder sb = new StringBuilder();
        l(sb, 5);
        p(sb, 45, 15);
        return sb.toString();
    }

    @Override // A1.e
    public final void n(StringBuilder sb, int i3) {
        switch (this.c) {
            case 0:
                sb.append("(3103)");
                return;
            default:
                if (i3 < 10000) {
                    sb.append("(3202)");
                    return;
                } else {
                    sb.append("(3203)");
                    return;
                }
        }
    }

    @Override // A1.e
    public final int o(int i3) {
        switch (this.c) {
            case 0:
                return i3;
            default:
                return i3 < 10000 ? i3 : i3 - 10000;
        }
    }
}
