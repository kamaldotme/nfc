package m2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        X1.g.e(str, "a");
        X1.g.e(str2, "b");
        int min = Math.min(str.length(), str2.length());
        int i3 = 4;
        while (true) {
            if (i3 < min) {
                char charAt = str.charAt(i3);
                char charAt2 = str2.charAt(i3);
                if (charAt == charAt2) {
                    i3++;
                } else if (X1.g.f(charAt, charAt2) >= 0) {
                    return 1;
                }
            } else {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    return 1;
                }
            }
        }
    }
}
