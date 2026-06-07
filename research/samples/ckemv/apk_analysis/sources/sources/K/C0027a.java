package K;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: K.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f582a;

    /* renamed from: b, reason: collision with root package name */
    public final p f583b;
    public final int c;

    public C0027a(int i3, p pVar, int i4) {
        this.f582a = i3;
        this.f583b = pVar;
        this.c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f582a);
        this.f583b.f595a.performAction(this.c, bundle);
    }
}
