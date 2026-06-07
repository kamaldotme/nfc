package x;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0414d extends y.f {
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, String[] strArr, int i3) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (TextUtils.isEmpty(strArr[i4])) {
                throw new IllegalArgumentException(X.d.j(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < strArr.length; i6++) {
                if (!hashSet.contains(Integer.valueOf(i6))) {
                    strArr2[i5] = strArr[i6];
                    i5++;
                }
            }
        }
        if (activity instanceof InterfaceC0413c) {
            ((InterfaceC0413c) activity).getClass();
        }
        AbstractC0412b.b(activity, strArr, i3);
    }
}
