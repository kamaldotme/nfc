package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class J extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f1864a;

    public J(Rect rect) {
        this.f1864a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f1864a;
    }
}
