package J1;

import B2.u;
import android.hardware.Camera;

/* loaded from: classes.dex */
public final class a implements Camera.AutoFocusCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f542a;

    public a(b bVar) {
        this.f542a = bVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z3, Camera camera) {
        this.f542a.f546e.post(new u(3, this));
    }
}
