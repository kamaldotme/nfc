package f;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: f.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2875a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f2876b;
    public Drawable c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f2877d;

    /* renamed from: e, reason: collision with root package name */
    public View f2878e;

    /* renamed from: f, reason: collision with root package name */
    public DialogInterface.OnKeyListener f2879f;
    public ListAdapter g;
    public DialogInterface.OnClickListener h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2880i;

    /* renamed from: j, reason: collision with root package name */
    public int f2881j = -1;

    public C0154b(ContextThemeWrapper contextThemeWrapper) {
        this.f2875a = contextThemeWrapper;
        this.f2876b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
