package Q;

import J.B;
import J.T;
import K.p;
import K.r;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends r {
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(0);
        this.c = bVar;
    }

    @Override // K.r
    public final p a(int i3) {
        return new p(AccessibilityNodeInfo.obtain(this.c.n(i3).f595a));
    }

    @Override // K.r
    public final p b(int i3) {
        b bVar = this.c;
        int i4 = i3 == 2 ? bVar.f793k : bVar.f794l;
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i4);
    }

    @Override // K.r
    public final boolean c(int i3, int i4, Bundle bundle) {
        int i5;
        b bVar = this.c;
        View view = bVar.f791i;
        if (i3 == -1) {
            WeakHashMap weakHashMap = T.f402a;
            return B.j(view, i4, bundle);
        }
        boolean z3 = true;
        if (i4 == 1) {
            return bVar.p(i3);
        }
        if (i4 == 2) {
            return bVar.j(i3);
        }
        boolean z4 = false;
        if (i4 == 64) {
            AccessibilityManager accessibilityManager = bVar.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i5 = bVar.f793k) != i3) {
                if (i5 != Integer.MIN_VALUE) {
                    bVar.f793k = Integer.MIN_VALUE;
                    bVar.f791i.invalidate();
                    bVar.q(i5, 65536);
                }
                bVar.f793k = i3;
                view.invalidate();
                bVar.q(i3, 32768);
            }
            z3 = false;
        } else {
            if (i4 != 128) {
                J0.d dVar = (J0.d) bVar;
                if (i4 != 16) {
                    return false;
                }
                Chip chip = dVar.f480q;
                if (i3 == 0) {
                    return chip.performClick();
                }
                if (i3 != 1) {
                    return false;
                }
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f2360i;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z4 = true;
                }
                if (!chip.f2371t) {
                    return z4;
                }
                chip.f2370s.q(1, 1);
                return z4;
            }
            if (bVar.f793k == i3) {
                bVar.f793k = Integer.MIN_VALUE;
                view.invalidate();
                bVar.q(i3, 65536);
            }
            z3 = false;
        }
        return z3;
    }
}
