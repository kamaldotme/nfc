package xyz.happify.ckemv;

import X.d;
import X1.g;

/* loaded from: classes.dex */
public final class AppVersion {
    private final String hash;
    private final int major;
    private final int minor;

    public AppVersion(int i3, int i4, String str) {
        g.e(str, "hash");
        this.major = i3;
        this.minor = i4;
        this.hash = str;
    }

    public static /* synthetic */ AppVersion copy$default(AppVersion appVersion, int i3, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i3 = appVersion.major;
        }
        if ((i5 & 2) != 0) {
            i4 = appVersion.minor;
        }
        if ((i5 & 4) != 0) {
            str = appVersion.hash;
        }
        return appVersion.copy(i3, i4, str);
    }

    public final int component1() {
        return this.major;
    }

    public final int component2() {
        return this.minor;
    }

    public final String component3() {
        return this.hash;
    }

    public final AppVersion copy(int i3, int i4, String str) {
        g.e(str, "hash");
        return new AppVersion(i3, i4, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersion)) {
            return false;
        }
        AppVersion appVersion = (AppVersion) obj;
        return this.major == appVersion.major && this.minor == appVersion.minor && g.a(this.hash, appVersion.hash);
    }

    public final String getHash() {
        return this.hash;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        return this.hash.hashCode() + ((Integer.hashCode(this.minor) + (Integer.hashCode(this.major) * 31)) * 31);
    }

    public String toString() {
        int i3 = this.major;
        int i4 = this.minor;
        String str = this.hash;
        StringBuilder sb = new StringBuilder("AppVersion(major=");
        sb.append(i3);
        sb.append(", minor=");
        sb.append(i4);
        sb.append(", hash=");
        return d.j(sb, str, ")");
    }
}
