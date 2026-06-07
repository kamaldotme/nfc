package O0;

import J.C;
import J.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f772a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f773b = {R.attr.colorPrimaryVariant};
    public static final l c = new l(0);

    public static void a(Context context, AttributeSet attributeSet, int i3, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.a.f21A, i3, i4);
        boolean z3 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z3) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f773b, "Theme.MaterialComponents");
            }
        }
        c(context, f772a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.a.f21A, i3, i4);
        boolean z3 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
            for (int i5 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i5, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z3 = true;
            obtainStyledAttributes.recycle();
            if (!z3) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (!obtainStyledAttributes.hasValue(i3)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(X.d.i("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static ArrayList d(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < toolbar.getChildCount(); i3++) {
            View childAt = toolbar.getChildAt(i3);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean e(View view) {
        WeakHashMap weakHashMap = T.f402a;
        return C.d(view) == 1;
    }

    public static TypedArray f(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        a(context, attributeSet, i3, i4);
        b(context, attributeSet, iArr, i3, i4, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
    }

    public static PorterDuff.Mode g(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
