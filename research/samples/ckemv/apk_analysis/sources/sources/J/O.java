package J;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class O {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0008g b(View view, C0008g c0008g) {
        ContentInfo l3 = c0008g.f423a.l();
        Objects.requireNonNull(l3);
        ContentInfo g = F0.a.g(l3);
        ContentInfo performReceiveContent = view.performReceiveContent(g);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g ? c0008g : new C0008g(new A.h(performReceiveContent));
    }

    public static void c(View view, String[] strArr, r rVar) {
        if (rVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new P(rVar));
        }
    }
}
