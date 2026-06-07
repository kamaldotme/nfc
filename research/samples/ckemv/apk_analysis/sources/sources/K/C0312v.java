package k;

import J.C0006e;
import J.C0008g;
import J.InterfaceC0005d;
import J.InterfaceC0019s;
import a.AbstractC0059a;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import xyz.happify.ckemv.R;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0312v extends EditText implements InterfaceC0019s {

    /* renamed from: b, reason: collision with root package name */
    public final C0298o f3789b;
    public final C0269Z c;

    /* renamed from: d, reason: collision with root package name */
    public final C0246B f3790d;

    /* renamed from: e, reason: collision with root package name */
    public final N.u f3791e;

    /* renamed from: f, reason: collision with root package name */
    public final C0246B f3792f;
    public C0310u g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [N.u, java.lang.Object] */
    public C0312v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        d1.a(context);
        c1.a(this, getContext());
        C0298o c0298o = new C0298o(this);
        this.f3789b = c0298o;
        c0298o.d(attributeSet, R.attr.editTextStyle);
        C0269Z c0269z = new C0269Z(this);
        this.c = c0269z;
        c0269z.f(attributeSet, R.attr.editTextStyle);
        c0269z.b();
        C0246B c0246b = new C0246B();
        c0246b.f3553b = this;
        this.f3790d = c0246b;
        this.f3791e = new Object();
        C0246B c0246b2 = new C0246B(this);
        this.f3792f = c0246b2;
        c0246b2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a3 = c0246b2.a(keyListener);
            if (a3 == keyListener) {
                return;
            }
            super.setKeyListener(a3);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    private C0310u getSuperCaller() {
        if (this.g == null) {
            this.g = new C0310u(this);
        }
        return this.g;
    }

    @Override // J.InterfaceC0019s
    public final C0008g a(C0008g c0008g) {
        return this.f3791e.a(this, c0008g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0298o c0298o = this.f3789b;
        if (c0298o != null) {
            c0298o.a();
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof N.t ? ((N.t) customSelectionActionModeCallback).f675a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0298o c0298o = this.f3789b;
        if (c0298o != null) {
            return c0298o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0298o c0298o = this.f3789b;
        if (c0298o != null) {
            return c0298o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0246B c0246b;
        if (Build.VERSION.SDK_INT >= 28 || (c0246b = this.f3790d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0246b.c;
        return textClassifier == null ? AbstractC0263T.a((TextView) c0246b.f3553b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f3;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.c.getClass();
        C0269Z.h(this, onCreateInputConnection, editorInfo);
        u2.d.w(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f3 = J.T.f(this)) != null) {
            editorInfo.contentMimeTypes = f3;
            onCreateInputConnection = new M.b(onCreateInputConnection, new B2.b(this));
        }
        return this.f3792f.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && J.T.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && AbstractC0249E.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i3) {
        InterfaceC0005d interfaceC0005d;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 || J.T.f(this) == null || !(i3 == 16908322 || i3 == 16908337)) {
            return super.onTextContextMenuItem(i3);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i4 >= 31) {
                interfaceC0005d = new A.h(primaryClip, 1);
            } else {
                C0006e c0006e = new C0006e();
                c0006e.c = primaryClip;
                c0006e.f416d = 1;
                interfaceC0005d = c0006e;
            }
            interfaceC0005d.o(i3 == 16908322 ? 0 : 1);
            J.T.h(this, interfaceC0005d.f());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0298o c0298o = this.f3789b;
        if (c0298o != null) {
            c0298o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0298o c0298o = this.f3789b;
        if (c0298o != null) {
            c0298o.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0059a.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f3792f.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3792f.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0298o c0298o = this.f3789b;
        if (c0298o != null) {
            c0298o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0298o c0298o = this.f3789b;
        if (c0298o != null) {
            c0298o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0269Z c0269z = this.c;
        c0269z.l(colorStateList);
        c0269z.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0269Z c0269z = this.c;
        c0269z.m(mode);
        c0269z.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0246B c0246b;
        if (Build.VERSION.SDK_INT >= 28 || (c0246b = this.f3790d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0246b.c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
