package E0;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import k.r1;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f147b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f146a = i3;
        this.f147b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        switch (this.f146a) {
            case 0:
                ((BottomAppBar$Behavior) this.f147b).getClass();
                throw null;
            default:
                SearchView searchView = (SearchView) this.f147b;
                View view2 = searchView.f1635y;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f1629s.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a3 = r1.a(searchView);
                    int dimensionPixelSize = searchView.f1610N ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f1627q;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a3 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
