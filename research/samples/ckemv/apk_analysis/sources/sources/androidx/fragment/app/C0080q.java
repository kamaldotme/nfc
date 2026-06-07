package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import f.AbstractActivityC0159g;
import xyz.happify.ckemv.MainActivity;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080q extends v0.f implements androidx.lifecycle.P, androidx.activity.v, androidx.activity.result.h, E {

    /* renamed from: d, reason: collision with root package name */
    public final Activity f1995d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1996e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f1997f;
    public final B g;
    public final /* synthetic */ AbstractActivityC0159g h;

    public C0080q(MainActivity mainActivity) {
        this.h = mainActivity;
        Handler handler = new Handler();
        this.g = new B();
        this.f1995d = mainActivity;
        this.f1996e = mainActivity;
        this.f1997f = handler;
    }

    @Override // v0.f
    public final View C(int i3) {
        return this.h.findViewById(i3);
    }

    @Override // v0.f
    public final boolean F() {
        Window window = this.h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        return this.h.c();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.h.f2909s;
    }

    @Override // androidx.fragment.app.E
    public final void f() {
        this.h.getClass();
    }
}
