package J;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f399d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f400a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f401b;
    public WeakReference c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f400a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a3 = a(viewGroup.getChildAt(childCount));
                    if (a3 != null) {
                        return a3;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                X.d.q(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}
