package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import u.AbstractC0390a;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0397a f5046a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5047b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5048d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5049e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5050f;
    public final int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f5051i;

    /* renamed from: j, reason: collision with root package name */
    public int f5052j;

    /* renamed from: k, reason: collision with root package name */
    public View f5053k;

    /* renamed from: l, reason: collision with root package name */
    public View f5054l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5055m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5056n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5057o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f5058p;

    public C0400d() {
        super(-2, -2);
        this.f5047b = false;
        this.c = 0;
        this.f5048d = 0;
        this.f5049e = -1;
        this.f5050f = -1;
        this.g = 0;
        this.h = 0;
        this.f5058p = new Rect();
    }

    public final boolean a(int i3) {
        if (i3 == 0) {
            return this.f5056n;
        }
        if (i3 != 1) {
            return false;
        }
        return this.f5057o;
    }

    public C0400d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0397a abstractC0397a;
        this.f5047b = false;
        this.c = 0;
        this.f5048d = 0;
        this.f5049e = -1;
        this.f5050f = -1;
        this.g = 0;
        this.h = 0;
        this.f5058p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0390a.f5015b);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f5050f = obtainStyledAttributes.getResourceId(1, -1);
        this.f5048d = obtainStyledAttributes.getInteger(2, 0);
        this.f5049e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f5047b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1698u;
            if (TextUtils.isEmpty(string)) {
                abstractC0397a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1698u;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1700w;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1699v);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0397a = (AbstractC0397a) constructor.newInstance(context, attributeSet);
                } catch (Exception e3) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e3);
                }
            }
            this.f5046a = abstractC0397a;
        }
        obtainStyledAttributes.recycle();
        AbstractC0397a abstractC0397a2 = this.f5046a;
        if (abstractC0397a2 != null) {
            abstractC0397a2.c(this);
        }
    }

    public C0400d(C0400d c0400d) {
        super((ViewGroup.MarginLayoutParams) c0400d);
        this.f5047b = false;
        this.c = 0;
        this.f5048d = 0;
        this.f5049e = -1;
        this.f5050f = -1;
        this.g = 0;
        this.h = 0;
        this.f5058p = new Rect();
    }

    public C0400d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5047b = false;
        this.c = 0;
        this.f5048d = 0;
        this.f5049e = -1;
        this.f5050f = -1;
        this.g = 0;
        this.h = 0;
        this.f5058p = new Rect();
    }

    public C0400d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5047b = false;
        this.c = 0;
        this.f5048d = 0;
        this.f5049e = -1;
        this.f5050f = -1;
        this.g = 0;
        this.h = 0;
        this.f5058p = new Rect();
    }
}
