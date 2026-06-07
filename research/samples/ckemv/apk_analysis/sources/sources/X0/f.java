package X0;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class f extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i3) {
        super(pVar);
        this.f1037e = i3;
    }

    @Override // X0.q
    public void r() {
        switch (this.f1037e) {
            case 0:
                p pVar = this.f1081b;
                pVar.f1072p = null;
                CheckableImageButton checkableImageButton = pVar.h;
                checkableImageButton.setOnLongClickListener(null);
                v0.f.L(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
