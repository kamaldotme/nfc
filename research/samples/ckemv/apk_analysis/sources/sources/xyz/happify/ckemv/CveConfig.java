package xyz.happify.ckemv;

import X1.g;
import java.util.Map;

/* loaded from: classes.dex */
public final class CveConfig {
    private final int amount;
    private final int id;
    private final Map<String, String> mastercard_tags;
    private final String name;
    private final Map<String, String> visa_tags;

    public CveConfig(int i3, String str, int i4, Map<String, String> map, Map<String, String> map2) {
        g.e(str, "name");
        g.e(map, "mastercard_tags");
        g.e(map2, "visa_tags");
        this.id = i3;
        this.name = str;
        this.amount = i4;
        this.mastercard_tags = map;
        this.visa_tags = map2;
    }

    public static /* synthetic */ CveConfig copy$default(CveConfig cveConfig, int i3, String str, int i4, Map map, Map map2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i3 = cveConfig.id;
        }
        if ((i5 & 2) != 0) {
            str = cveConfig.name;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i4 = cveConfig.amount;
        }
        int i6 = i4;
        if ((i5 & 8) != 0) {
            map = cveConfig.mastercard_tags;
        }
        Map map3 = map;
        if ((i5 & 16) != 0) {
            map2 = cveConfig.visa_tags;
        }
        return cveConfig.copy(i3, str2, i6, map3, map2);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.amount;
    }

    public final Map<String, String> component4() {
        return this.mastercard_tags;
    }

    public final Map<String, String> component5() {
        return this.visa_tags;
    }

    public final CveConfig copy(int i3, String str, int i4, Map<String, String> map, Map<String, String> map2) {
        g.e(str, "name");
        g.e(map, "mastercard_tags");
        g.e(map2, "visa_tags");
        return new CveConfig(i3, str, i4, map, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CveConfig)) {
            return false;
        }
        CveConfig cveConfig = (CveConfig) obj;
        return this.id == cveConfig.id && g.a(this.name, cveConfig.name) && this.amount == cveConfig.amount && g.a(this.mastercard_tags, cveConfig.mastercard_tags) && g.a(this.visa_tags, cveConfig.visa_tags);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getId() {
        return this.id;
    }

    public final Map<String, String> getMastercard_tags() {
        return this.mastercard_tags;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getVisa_tags() {
        return this.visa_tags;
    }

    public int hashCode() {
        return this.visa_tags.hashCode() + ((this.mastercard_tags.hashCode() + ((Integer.hashCode(this.amount) + ((this.name.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "CveConfig(id=" + this.id + ", name=" + this.name + ", amount=" + this.amount + ", mastercard_tags=" + this.mastercard_tags + ", visa_tags=" + this.visa_tags + ")";
    }
}
