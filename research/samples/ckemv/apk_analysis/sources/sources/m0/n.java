package m0;

/* loaded from: classes.dex */
public final class n extends p {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n.class == obj.getClass();
    }

    public final int hashCode() {
        return n.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
