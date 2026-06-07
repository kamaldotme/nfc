package j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import i.InterfaceC0185c;

/* renamed from: j.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211q extends FrameLayout implements InterfaceC0185c {

    /* renamed from: b, reason: collision with root package name */
    public final CollapsibleActionView f3360b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0211q(View view) {
        super(view.getContext());
        this.f3360b = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // i.InterfaceC0185c
    public final void a() {
        this.f3360b.onActionViewExpanded();
    }

    @Override // i.InterfaceC0185c
    public final void e() {
        this.f3360b.onActionViewCollapsed();
    }
}
