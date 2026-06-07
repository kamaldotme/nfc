package k;

import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import e.AbstractC0116a;
import xyz.happify.ckemv.R;

/* renamed from: k.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304r extends CheckedTextView {

    /* renamed from: b, reason: collision with root package name */
    public final d0.d f3765b;
    public final C0298o c;

    /* renamed from: d, reason: collision with root package name */
    public final C0269Z f3766d;

    /* renamed from: e, reason: collision with root package name */
    public C0314w f3767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004e, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004e, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0304r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        d1.a(context);
        c1.a(this, getContext());
        C0269Z c0269z = new C0269Z(this);
        this.f3766d = c0269z;
        c0269z.f(attributeSet, R.attr.checkedTextViewStyle);
        c0269z.b();
        C0298o c0298o = new C0298o(this);
        this.c = c0298o;
        c0298o.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f3765b = new d0.d(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0116a.f2673l;
        v0.m F2 = v0.m.F(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = (TypedArray) F2.f5087d;
        J.T.k(this, getContext(), iArr, attributeSet, (TypedArray) F2.f5087d, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0059a.s(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(F2.q(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC0299o0.b(typedArray.getInt(3, -1), null));
                }
                F2.J();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0059a.s(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            F2.J();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            F2.J();
            throw th;
        }
    }

    private C0314w getEmojiTextViewHelper() {
        if (this.f3767e == null) {
            this.f3767e = new C0314w(this);
        }
        return this.f3767e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0269Z c0269z = this.f3766d;
        if (c0269z != null) {
            c0269z.b();
        }
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.a();
        }
        d0.d dVar = this.f3765b;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof N.t ? ((N.t) customSelectionActionModeCallback).f675a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0298o c0298o = this.c;
        if (c0298o != null) {
            return c0298o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0298o c0298o = this.c;
        if (c0298o != null) {
            return c0298o.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        d0.d dVar = this.f3765b;
        if (dVar != null) {
            return (ColorStateList) dVar.f2611e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        d0.d dVar = this.f3765b;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2612f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3766d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3766d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        u2.d.w(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.f(i3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        d0.d dVar = this.f3765b;
        if (dVar != null) {
            if (dVar.c) {
                dVar.c = false;
            } else {
                dVar.c = true;
                dVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.f3766d;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.f3766d;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0059a.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        d0.d dVar = this.f3765b;
        if (dVar != null) {
            dVar.f2611e = colorStateList;
            dVar.f2608a = true;
            dVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        d0.d dVar = this.f3765b;
        if (dVar != null) {
            dVar.f2612f = mode;
            dVar.f2609b = true;
            dVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0269Z c0269z = this.f3766d;
        c0269z.l(colorStateList);
        c0269z.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0269Z c0269z = this.f3766d;
        c0269z.m(mode);
        c0269z.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0269Z c0269z = this.f3766d;
        if (c0269z != null) {
            c0269z.g(context, i3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i3) {
        setCheckMarkDrawable(AbstractC0059a.s(getContext(), i3));
    }
}
