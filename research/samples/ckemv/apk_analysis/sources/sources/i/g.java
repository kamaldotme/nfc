package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.MenuC0191C;

/* loaded from: classes.dex */
public final class g extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3135a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0184b f3136b;

    public g(Context context, AbstractC0184b abstractC0184b) {
        this.f3135a = context;
        this.f3136b = abstractC0184b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3136b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3136b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0191C(this.f3135a, this.f3136b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3136b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3136b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3136b.f3125b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3136b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3136b.c;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3136b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3136b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3136b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3136b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3136b.f3125b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3136b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z3) {
        this.f3136b.p(z3);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i3) {
        this.f3136b.l(i3);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i3) {
        this.f3136b.n(i3);
    }
}
