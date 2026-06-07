package k;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270a implements J.c0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3646b = false;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f3647d;

    public C0270a(ActionBarContextView actionBarContextView) {
        this.f3647d = actionBarContextView;
    }

    @Override // J.c0
    public final void a() {
        if (this.f3646b) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3647d;
        actionBarContextView.g = null;
        super/*android.view.View*/.setVisibility(this.c);
    }

    @Override // J.c0
    public final void e(View view) {
        this.f3646b = true;
    }

    @Override // J.c0
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f3646b = false;
    }
}
