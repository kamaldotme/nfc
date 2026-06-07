package A1;

import p1.C0356a;

/* loaded from: classes.dex */
public abstract class e extends d {
    public abstract void n(StringBuilder sb, int i3);

    public abstract int o(int i3);

    public final void p(StringBuilder sb, int i3, int i4) {
        int j3 = v0.m.j(i3, i4, (C0356a) ((v0.m) this.f47b).c);
        n(sb, j3);
        int o3 = o(j3);
        int i5 = 100000;
        for (int i6 = 0; i6 < 5; i6++) {
            if (o3 / i5 == 0) {
                sb.append('0');
            }
            i5 /= 10;
        }
        sb.append(o3);
    }
}
