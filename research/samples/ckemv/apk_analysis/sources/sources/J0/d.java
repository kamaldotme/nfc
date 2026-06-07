package J0;

import K.j;
import K.p;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class d extends Q.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f480q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f480q = chip;
    }

    @Override // Q.b
    public final void l(ArrayList arrayList) {
        boolean z3 = false;
        arrayList.add(0);
        Rect rect = Chip.f2356x;
        Chip chip = this.f480q;
        if (chip.c()) {
            f fVar = chip.f2359f;
            if (fVar != null && fVar.f500L) {
                z3 = true;
            }
            if (!z3 || chip.f2360i == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // Q.b
    public final void o(int i3, p pVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f595a;
        if (i3 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2356x);
            return;
        }
        Chip chip = this.f480q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        pVar.b(j.f585e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
