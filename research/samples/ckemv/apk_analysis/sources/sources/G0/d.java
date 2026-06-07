package G0;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f225b;

    public d(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f225b = materialButtonToggleGroup;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int compareTo = Boolean.valueOf(materialButton.f2343p).compareTo(Boolean.valueOf(materialButton2.f2343p));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f225b;
        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
    }
}
