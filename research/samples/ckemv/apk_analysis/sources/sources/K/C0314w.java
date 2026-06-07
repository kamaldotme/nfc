package k;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import e.AbstractC0116a;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314w {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3793a;

    /* renamed from: b, reason: collision with root package name */
    public final A.h f3794b;

    public C0314w(TextView textView) {
        this.f3793a = textView;
        this.f3794b = new A.h(textView);
    }

    public final void a(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = this.f3793a.getContext().obtainStyledAttributes(attributeSet, AbstractC0116a.f2670i, i3, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z3) {
        ((u2.d) this.f3794b.c).D(z3);
    }

    public final void c(boolean z3) {
        ((u2.d) this.f3794b.c).E(z3);
    }
}
