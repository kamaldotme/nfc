package J;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final r f398a;

    public P(r rVar) {
        this.f398a = rVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0008g c0008g = new C0008g(new A.h(contentInfo));
        C0008g a3 = ((N.u) this.f398a).a(view, c0008g);
        if (a3 == null) {
            return null;
        }
        if (a3 == c0008g) {
            return contentInfo;
        }
        ContentInfo l3 = a3.f423a.l();
        Objects.requireNonNull(l3);
        return F0.a.g(l3);
    }
}
