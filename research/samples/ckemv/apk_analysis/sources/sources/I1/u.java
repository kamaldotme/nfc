package I1;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class u extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1.e f378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C1.e eVar, Context context) {
        super(context, 3);
        this.f378a = eVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i3) {
        int rotation;
        C1.e eVar = this.f378a;
        WindowManager windowManager = (WindowManager) eVar.c;
        A.h hVar = (A.h) eVar.f131e;
        if (windowManager == null || hVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == eVar.f129b) {
            return;
        }
        eVar.f129b = rotation;
        ((g) hVar.c).f329d.postDelayed(new B2.u(1, hVar), 250L);
    }
}
