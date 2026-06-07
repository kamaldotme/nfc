package C1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f118a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int i3 = -1;
        for (Map.Entry entry : this.f118a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i3) {
                i3 = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i3) {
                arrayList.add(entry.getKey());
            }
        }
        return B1.a.a(arrayList);
    }

    public final void b(int i3) {
        HashMap hashMap = this.f118a;
        Integer num = (Integer) hashMap.get(Integer.valueOf(i3));
        if (num == null) {
            num = 0;
        }
        hashMap.put(Integer.valueOf(i3), Integer.valueOf(num.intValue() + 1));
    }
}
