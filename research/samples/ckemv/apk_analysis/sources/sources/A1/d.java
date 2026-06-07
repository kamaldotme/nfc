package A1;

import p1.C0356a;

/* loaded from: classes.dex */
public abstract class d extends f {
    public final void l(StringBuilder sb, int i3) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        m(sb, i3, length);
    }

    public final void m(StringBuilder sb, int i3, int i4) {
        for (int i5 = 0; i5 < 4; i5++) {
            int j3 = v0.m.j((i5 * 10) + i3, 10, (C0356a) ((v0.m) this.f47b).c);
            if (j3 / 100 == 0) {
                sb.append('0');
            }
            if (j3 / 10 == 0) {
                sb.append('0');
            }
            sb.append(j3);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 13; i7++) {
            int charAt = sb.charAt(i7 + i4) - '0';
            if ((i7 & 1) == 0) {
                charAt *= 3;
            }
            i6 += charAt;
        }
        int i8 = 10 - (i6 % 10);
        sb.append(i8 != 10 ? i8 : 0);
    }
}
