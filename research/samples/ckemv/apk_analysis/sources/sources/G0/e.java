package G0;

import J.C0004c;
import K.o;
import K.p;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class e extends C0004c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f227e;

    public /* synthetic */ e(int i3, Object obj) {
        this.f226d = i3;
        this.f227e = obj;
    }

    @Override // J.C0004c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f226d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f227e).f2446e);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // J.C0004c
    public final void d(View view, p pVar) {
        Object obj = this.f227e;
        View.AccessibilityDelegate accessibilityDelegate = this.f413a;
        switch (this.f226d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, pVar.f595a);
                int i3 = MaterialButtonToggleGroup.f2346l;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                int i4 = -1;
                if (view instanceof MaterialButton) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i5) == view) {
                                i4 = i6;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.c(i5)) {
                                    i6++;
                                }
                                i5++;
                            }
                        }
                    }
                }
                pVar.h(o.a(0, 1, i4, 1, ((MaterialButton) view).f2343p));
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = pVar.f595a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2447f);
                accessibilityNodeInfo.setChecked(checkableImageButton.f2446e);
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = pVar.f595a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f2457y);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = pVar.f595a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                k kVar = (k) obj;
                accessibilityNodeInfo3.setHintText(kVar.f2405d0.getVisibility() == 0 ? kVar.w().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : kVar.w().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                return;
        }
    }
}
