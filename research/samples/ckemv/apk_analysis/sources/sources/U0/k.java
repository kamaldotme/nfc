package U0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public u2.l f935a = new i();

    /* renamed from: b, reason: collision with root package name */
    public u2.l f936b = new i();
    public u2.l c = new i();

    /* renamed from: d, reason: collision with root package name */
    public u2.l f937d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f938e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f939f = new a(0.0f);
    public c g = new a(0.0f);
    public c h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f940i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f941j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f942k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f943l = new e(0);

    public static j a(Context context, int i3, int i4, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i3);
        if (i4 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i4);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(A0.a.f39u);
        try {
            int i5 = obtainStyledAttributes.getInt(0, 0);
            int i6 = obtainStyledAttributes.getInt(3, i5);
            int i7 = obtainStyledAttributes.getInt(4, i5);
            int i8 = obtainStyledAttributes.getInt(2, i5);
            int i9 = obtainStyledAttributes.getInt(1, i5);
            c c = c(obtainStyledAttributes, 5, aVar);
            c c3 = c(obtainStyledAttributes, 8, c);
            c c4 = c(obtainStyledAttributes, 9, c);
            c c5 = c(obtainStyledAttributes, 7, c);
            c c6 = c(obtainStyledAttributes, 6, c);
            j jVar = new j();
            u2.l p3 = v0.f.p(i6);
            jVar.f926a = p3;
            j.b(p3);
            jVar.f929e = c3;
            u2.l p4 = v0.f.p(i7);
            jVar.f927b = p4;
            j.b(p4);
            jVar.f930f = c4;
            u2.l p5 = v0.f.p(i8);
            jVar.c = p5;
            j.b(p5);
            jVar.g = c5;
            u2.l p6 = v0.f.p(i9);
            jVar.f928d = p6;
            j.b(p6);
            jVar.h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i3, int i4) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.a.f33o, i3, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i3, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i3);
        if (peekValue == null) {
            return cVar;
        }
        int i4 = peekValue.type;
        return i4 == 5 ? new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i4 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z3 = this.f943l.getClass().equals(e.class) && this.f941j.getClass().equals(e.class) && this.f940i.getClass().equals(e.class) && this.f942k.getClass().equals(e.class);
        float a3 = this.f938e.a(rectF);
        return z3 && ((this.f939f.a(rectF) > a3 ? 1 : (this.f939f.a(rectF) == a3 ? 0 : -1)) == 0 && (this.h.a(rectF) > a3 ? 1 : (this.h.a(rectF) == a3 ? 0 : -1)) == 0 && (this.g.a(rectF) > a3 ? 1 : (this.g.a(rectF) == a3 ? 0 : -1)) == 0) && ((this.f936b instanceof i) && (this.f935a instanceof i) && (this.c instanceof i) && (this.f937d instanceof i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U0.j, java.lang.Object] */
    public final j e() {
        ?? obj = new Object();
        obj.f926a = this.f935a;
        obj.f927b = this.f936b;
        obj.c = this.c;
        obj.f928d = this.f937d;
        obj.f929e = this.f938e;
        obj.f930f = this.f939f;
        obj.g = this.g;
        obj.h = this.h;
        obj.f931i = this.f940i;
        obj.f932j = this.f941j;
        obj.f933k = this.f942k;
        obj.f934l = this.f943l;
        return obj;
    }
}
