package J0;

import O0.h;
import O0.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends v0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f478e;

    public /* synthetic */ b(int i3, Object obj) {
        this.f477d = i3;
        this.f478e = obj;
    }

    private final void Q(int i3) {
    }

    @Override // v0.f
    public final void D(int i3) {
        switch (this.f477d) {
            case 0:
                return;
            default:
                i iVar = (i) this.f478e;
                iVar.f769d = true;
                h hVar = (h) iVar.f770e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.v();
                    fVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // v0.f
    public final void E(Typeface typeface, boolean z3) {
        switch (this.f477d) {
            case 0:
                Chip chip = (Chip) this.f478e;
                f fVar = chip.f2359f;
                chip.setText(fVar.f491E0 ? fVar.f492F : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (z3) {
                    return;
                }
                i iVar = (i) this.f478e;
                iVar.f769d = true;
                h hVar = (h) iVar.f770e.get();
                if (hVar != null) {
                    f fVar2 = (f) hVar;
                    fVar2.v();
                    fVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }
}
