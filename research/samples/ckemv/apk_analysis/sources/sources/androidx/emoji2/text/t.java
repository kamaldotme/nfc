package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import m0.z;

/* loaded from: classes.dex */
public final class t extends SpannableStringBuilder {

    /* renamed from: b, reason: collision with root package name */
    public final Class f1797b;
    public final ArrayList c;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.c = new ArrayList();
        z.k(cls, "watcherClass cannot be null");
        this.f1797b = cls;
    }

    public final void a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i3)).c.incrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i3)).onTextChanged(this, 0, length(), length());
            i3++;
        }
    }

    public final s c(Object obj) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i3);
            if (sVar.f1796b == obj) {
                return sVar;
            }
            i3++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f1797b == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i3, int i4) {
        super.delete(i3, i4);
        return this;
    }

    public final void e() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i3)).c.decrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i3, int i4, Class cls) {
        if (this.f1797b != cls) {
            return super.getSpans(i3, i4, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i3, i4, s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
        for (int i5 = 0; i5 < sVarArr.length; i5++) {
            objArr[i5] = sVarArr[i5].f1796b;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i3, int i4, Class cls) {
        if (cls == null || this.f1797b == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.c.remove(sVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i3, int i4, CharSequence charSequence) {
        replace(i3, i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.c.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i3, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        return new t(this.f1797b, this, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i3, int i4) {
        super.delete(i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        replace(i3, i4, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i3, CharSequence charSequence, int i4, int i5) {
        super.insert(i3, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence) {
        a();
        super.replace(i3, i4, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence, int i4, int i5) {
        super.insert(i3, charSequence, i4, i5);
        return this;
    }

    public t(Class cls, CharSequence charSequence, int i3, int i4) {
        super(charSequence, i3, i4);
        this.c = new ArrayList();
        z.k(cls, "watcherClass cannot be null");
        this.f1797b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        a();
        super.replace(i3, i4, charSequence, i5, i6);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i3, int i4) {
        super.append(charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i3, int i4) {
        super.append(charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i3, int i4) {
        super.append(charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i3) {
        super.append(charSequence, obj, i3);
        return this;
    }
}
