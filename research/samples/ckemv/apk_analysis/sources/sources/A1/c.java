package A1;

import j1.C0238h;
import p1.C0356a;

/* loaded from: classes.dex */
public final class c extends e {
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final String f45d;

    public c(C0356a c0356a, String str, String str2) {
        super(c0356a);
        this.c = str2;
        this.f45d = str;
    }

    @Override // A1.f
    public final String j() {
        if (((C0356a) this.f46a).c != 84) {
            throw C0238h.f3489d;
        }
        StringBuilder sb = new StringBuilder();
        l(sb, 8);
        p(sb, 48, 20);
        int j3 = v0.m.j(68, 16, (C0356a) ((v0.m) this.f47b).c);
        if (j3 != 38400) {
            sb.append('(');
            sb.append(this.c);
            sb.append(')');
            int i3 = j3 % 32;
            int i4 = j3 / 32;
            int i5 = (i4 % 12) + 1;
            int i6 = i4 / 12;
            if (i6 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i6);
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i3 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i3);
        }
        return sb.toString();
    }

    @Override // A1.e
    public final void n(StringBuilder sb, int i3) {
        sb.append('(');
        sb.append(this.f45d);
        sb.append(i3 / 100000);
        sb.append(')');
    }

    @Override // A1.e
    public final int o(int i3) {
        return i3 % 100000;
    }
}
