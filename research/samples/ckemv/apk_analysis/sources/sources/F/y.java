package f;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import k.C0247C;
import k.C0275c0;
import k.C0296n;
import k.C0300p;
import k.C0302q;
import n.C0342k;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f3002b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3003d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3004e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3005f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final C0342k h = new C0342k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3006a = new Object[2];

    public C0296n a(Context context, AttributeSet attributeSet) {
        return new C0296n(context, attributeSet);
    }

    public C0300p b(Context context, AttributeSet attributeSet) {
        return new C0300p(context, attributeSet, xyz.happify.ckemv.R.attr.buttonStyle);
    }

    public C0302q c(Context context, AttributeSet attributeSet) {
        return new C0302q(context, attributeSet, xyz.happify.ckemv.R.attr.checkboxStyle);
    }

    public C0247C d(Context context, AttributeSet attributeSet) {
        return new C0247C(context, attributeSet);
    }

    public C0275c0 e(Context context, AttributeSet attributeSet) {
        return new C0275c0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        C0342k c0342k = h;
        Constructor constructor = (Constructor) c0342k.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3002b);
            c0342k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3006a);
    }
}
