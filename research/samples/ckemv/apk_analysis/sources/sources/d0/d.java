package d0;

import J.T;
import X1.g;
import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.C0078o;
import androidx.lifecycle.C0092i;
import e.AbstractC0116a;
import java.util.LinkedHashSet;
import k.AbstractC0299o0;
import m.f;
import v0.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2608a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2609b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2610d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f2611e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2612f;

    public /* synthetic */ d(TextView textView) {
        this.f2611e = null;
        this.f2612f = null;
        this.f2608a = false;
        this.f2609b = false;
        this.f2610d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f2610d;
        Drawable a3 = N.c.a(compoundButton);
        if (a3 != null) {
            if (this.f2608a || this.f2609b) {
                Drawable mutate = a3.mutate();
                if (this.f2608a) {
                    B.b.h(mutate, (ColorStateList) this.f2611e);
                }
                if (this.f2609b) {
                    B.b.i(mutate, (PorterDuff.Mode) this.f2612f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        CheckedTextView checkedTextView = (CheckedTextView) this.f2610d;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2608a || this.f2609b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2608a) {
                    B.b.h(mutate, (ColorStateList) this.f2611e);
                }
                if (this.f2609b) {
                    B.b.i(mutate, (PorterDuff.Mode) this.f2612f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f2609b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = (Bundle) this.f2611e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f2611e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f2611e;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2611e = null;
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i3) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f2610d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0116a.f2674m;
        m F2 = m.F(context, attributeSet, iArr, i3, 0);
        TypedArray typedArray = (TypedArray) F2.f5087d;
        T.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) F2.f5087d, i3);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0059a.s(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    N.b.c(compoundButton, F2.q(2));
                }
                if (typedArray.hasValue(3)) {
                    N.b.d(compoundButton, AbstractC0299o0.b(typedArray.getInt(3, -1), null));
                }
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0059a.s(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
        } finally {
            F2.J();
        }
    }

    public void e(String str, InterfaceC0114c interfaceC0114c) {
        Object obj;
        g.e(interfaceC0114c, "provider");
        f fVar = (f) this.f2610d;
        m.c a3 = fVar.a(str);
        if (a3 != null) {
            obj = a3.f3944b;
        } else {
            m.c cVar = new m.c(str, interfaceC0114c);
            fVar.f3950e++;
            m.c cVar2 = fVar.c;
            if (cVar2 == null) {
                fVar.f3948b = cVar;
                fVar.c = cVar;
            } else {
                cVar2.c = cVar;
                cVar.f3945d = cVar2;
                fVar.c = cVar;
            }
            obj = null;
        }
        if (((InterfaceC0114c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public void f() {
        if (!this.c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        C0078o c0078o = (C0078o) this.f2612f;
        if (c0078o == null) {
            c0078o = new C0078o(this);
        }
        this.f2612f = c0078o;
        try {
            C0092i.class.getDeclaredConstructor(null);
            C0078o c0078o2 = (C0078o) this.f2612f;
            if (c0078o2 != null) {
                ((LinkedHashSet) c0078o2.f1992b).add(C0092i.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + C0092i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }

    public d() {
        this.f2610d = new f();
        this.c = true;
    }
}
