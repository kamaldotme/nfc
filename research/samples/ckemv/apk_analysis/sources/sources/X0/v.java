package X0;

import J.T;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v extends ArrayAdapter {

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1114b;
    public ColorStateList c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f1115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Context context, int i3, String[] strArr) {
        super(context, i3, strArr);
        this.f1115d = wVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        w wVar = this.f1115d;
        ColorStateList colorStateList2 = wVar.f1121m;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.c = colorStateList;
        if (wVar.f1120l != 0 && wVar.f1121m != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{A.a.b(wVar.f1121m.getColorForState(iArr3, 0), wVar.f1120l), A.a.b(wVar.f1121m.getColorForState(iArr2, 0), wVar.f1120l), wVar.f1120l});
        }
        this.f1114b = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i3, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            w wVar = this.f1115d;
            Drawable drawable = null;
            if (wVar.getText().toString().contentEquals(textView.getText()) && wVar.f1120l != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(wVar.f1120l);
                if (this.c != null) {
                    B.b.h(colorDrawable, this.f1114b);
                    drawable = new RippleDrawable(this.c, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = T.f402a;
            J.B.q(textView, drawable);
        }
        return view2;
    }
}
