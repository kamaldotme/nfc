package xyz.happify.ckemv;

import X1.g;

/* loaded from: classes.dex */
public final class HarvestedTx {
    private final String arqc;
    private final String atc;
    private final int cve_id;
    private final String params;
    private final double timeMs;

    public HarvestedTx(String str, String str2, double d3, String str3, int i3) {
        g.e(str, "atc");
        g.e(str2, "arqc");
        g.e(str3, "params");
        this.atc = str;
        this.arqc = str2;
        this.timeMs = d3;
        this.params = str3;
        this.cve_id = i3;
    }

    public static /* synthetic */ HarvestedTx copy$default(HarvestedTx harvestedTx, String str, String str2, double d3, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = harvestedTx.atc;
        }
        if ((i4 & 2) != 0) {
            str2 = harvestedTx.arqc;
        }
        String str4 = str2;
        if ((i4 & 4) != 0) {
            d3 = harvestedTx.timeMs;
        }
        double d4 = d3;
        if ((i4 & 8) != 0) {
            str3 = harvestedTx.params;
        }
        String str5 = str3;
        if ((i4 & 16) != 0) {
            i3 = harvestedTx.cve_id;
        }
        return harvestedTx.copy(str, str4, d4, str5, i3);
    }

    public final String component1() {
        return this.atc;
    }

    public final String component2() {
        return this.arqc;
    }

    public final double component3() {
        return this.timeMs;
    }

    public final String component4() {
        return this.params;
    }

    public final int component5() {
        return this.cve_id;
    }

    public final HarvestedTx copy(String str, String str2, double d3, String str3, int i3) {
        g.e(str, "atc");
        g.e(str2, "arqc");
        g.e(str3, "params");
        return new HarvestedTx(str, str2, d3, str3, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HarvestedTx)) {
            return false;
        }
        HarvestedTx harvestedTx = (HarvestedTx) obj;
        return g.a(this.atc, harvestedTx.atc) && g.a(this.arqc, harvestedTx.arqc) && Double.compare(this.timeMs, harvestedTx.timeMs) == 0 && g.a(this.params, harvestedTx.params) && this.cve_id == harvestedTx.cve_id;
    }

    public final String getArqc() {
        return this.arqc;
    }

    public final String getAtc() {
        return this.atc;
    }

    public final int getCve_id() {
        return this.cve_id;
    }

    public final String getParams() {
        return this.params;
    }

    public final double getTimeMs() {
        return this.timeMs;
    }

    public int hashCode() {
        return Integer.hashCode(this.cve_id) + ((this.params.hashCode() + ((Double.hashCode(this.timeMs) + ((this.arqc.hashCode() + (this.atc.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "HarvestedTx(atc=" + this.atc + ", arqc=" + this.arqc + ", timeMs=" + this.timeMs + ", params=" + this.params + ", cve_id=" + this.cve_id + ")";
    }
}
