package G;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b3 = bArr[i3];
            byte b4 = bArr2[i3];
            if (b3 != b4) {
                return b3 - b4;
            }
        }
        return 0;
    }
}
