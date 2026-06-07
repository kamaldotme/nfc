package f;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153a implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0157e f2874b;
    public final /* synthetic */ C0154b c;

    public C0153a(C0154b c0154b, C0157e c0157e) {
        this.c = c0154b;
        this.f2874b = c0157e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        C0154b c0154b = this.c;
        DialogInterface.OnClickListener onClickListener = c0154b.h;
        C0157e c0157e = this.f2874b;
        onClickListener.onClick(c0157e.f2884b, i3);
        if (c0154b.f2880i) {
            return;
        }
        c0157e.f2884b.dismiss();
    }
}
