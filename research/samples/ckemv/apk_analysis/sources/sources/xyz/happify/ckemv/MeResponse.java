package xyz.happify.ckemv;

import X1.g;
import java.util.List;

/* loaded from: classes.dex */
public final class MeResponse {
    private final List<CveConfig> cves;
    private final AppVersion latest_version;
    private final String name;

    public MeResponse(String str, List<CveConfig> list, AppVersion appVersion) {
        g.e(str, "name");
        g.e(list, "cves");
        this.name = str;
        this.cves = list;
        this.latest_version = appVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MeResponse copy$default(MeResponse meResponse, String str, List list, AppVersion appVersion, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = meResponse.name;
        }
        if ((i3 & 2) != 0) {
            list = meResponse.cves;
        }
        if ((i3 & 4) != 0) {
            appVersion = meResponse.latest_version;
        }
        return meResponse.copy(str, list, appVersion);
    }

    public final String component1() {
        return this.name;
    }

    public final List<CveConfig> component2() {
        return this.cves;
    }

    public final AppVersion component3() {
        return this.latest_version;
    }

    public final MeResponse copy(String str, List<CveConfig> list, AppVersion appVersion) {
        g.e(str, "name");
        g.e(list, "cves");
        return new MeResponse(str, list, appVersion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeResponse)) {
            return false;
        }
        MeResponse meResponse = (MeResponse) obj;
        return g.a(this.name, meResponse.name) && g.a(this.cves, meResponse.cves) && g.a(this.latest_version, meResponse.latest_version);
    }

    public final List<CveConfig> getCves() {
        return this.cves;
    }

    public final AppVersion getLatest_version() {
        return this.latest_version;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = (this.cves.hashCode() + (this.name.hashCode() * 31)) * 31;
        AppVersion appVersion = this.latest_version;
        return hashCode + (appVersion == null ? 0 : appVersion.hashCode());
    }

    public String toString() {
        return "MeResponse(name=" + this.name + ", cves=" + this.cves + ", latest_version=" + this.latest_version + ")";
    }
}
