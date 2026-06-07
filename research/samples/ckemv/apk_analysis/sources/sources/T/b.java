package t;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: b, reason: collision with root package name */
    public int[] f4730b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public Context f4731d;

    /* renamed from: e, reason: collision with root package name */
    public r.i f4732e;

    /* renamed from: f, reason: collision with root package name */
    public String f4733f;
    public HashMap g;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4730b = new int[32];
        this.g = new HashMap();
        this.f4731d = context;
        e(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        Context context;
        int i3;
        HashMap hashMap;
        if (str == null || str.length() == 0 || (context = this.f4731d) == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = ((trim instanceof String) && (hashMap = constraintLayout.f1695n) != null && hashMap.containsKey(trim)) ? constraintLayout.f1695n.get(trim) : null;
            if (obj instanceof Integer) {
                i3 = ((Integer) obj).intValue();
                if (i3 == 0 && constraintLayout != null) {
                    i3 = d(constraintLayout, trim);
                }
                if (i3 == 0) {
                    try {
                        i3 = n.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i3 == 0) {
                    i3 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
                }
                if (i3 == 0) {
                    this.g.put(Integer.valueOf(i3), trim);
                    b(i3);
                    return;
                }
                return;
            }
        }
        i3 = 0;
        if (i3 == 0) {
            i3 = d(constraintLayout, trim);
        }
        if (i3 == 0) {
        }
        if (i3 == 0) {
        }
        if (i3 == 0) {
        }
    }

    public final void b(int i3) {
        if (i3 == getId()) {
            return;
        }
        int i4 = this.c + 1;
        int[] iArr = this.f4730b;
        if (i4 > iArr.length) {
            this.f4730b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f4730b;
        int i5 = this.c;
        iArr2[i5] = i3;
        this.c = i5 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i3 = 0; i3 < this.c; i3++) {
            View view = (View) constraintLayout.f1686b.get(this.f4730b[i3]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f4731d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f4881b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f4733f = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(r.d dVar, boolean z3);

    public final void g() {
        if (this.f4732e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof d) {
            ((d) layoutParams).f4777k0 = this.f4732e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4730b, this.c);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4733f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f4733f = str;
        if (str == null) {
            return;
        }
        int i3 = 0;
        this.c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i3);
            if (indexOf == -1) {
                a(str.substring(i3));
                return;
            } else {
                a(str.substring(i3, indexOf));
                i3 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4733f = null;
        this.c = 0;
        for (int i3 : iArr) {
            b(i3);
        }
    }
}
