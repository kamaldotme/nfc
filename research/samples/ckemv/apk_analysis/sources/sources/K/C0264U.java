package k;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import z.AbstractC0452b;

/* renamed from: k.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264U extends AbstractC0452b {
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3626i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f3627j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0269Z f3628k;

    public C0264U(C0269Z c0269z, int i3, int i4, WeakReference weakReference) {
        this.f3628k = c0269z;
        this.h = i3;
        this.f3626i = i4;
        this.f3627j = weakReference;
    }

    @Override // z.AbstractC0452b
    public final void g(int i3) {
    }

    @Override // z.AbstractC0452b
    public final void h(Typeface typeface) {
        int i3;
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.h) != -1) {
            typeface = AbstractC0268Y.a(typeface, i3, (this.f3626i & 2) != 0);
        }
        C0269Z c0269z = this.f3628k;
        if (c0269z.f3640m) {
            c0269z.f3639l = typeface;
            TextView textView = (TextView) this.f3627j.get();
            if (textView != null) {
                WeakHashMap weakHashMap = J.T.f402a;
                if (J.E.b(textView)) {
                    textView.post(new F0.b(textView, typeface, c0269z.f3637j, 3));
                } else {
                    textView.setTypeface(typeface, c0269z.f3637j);
                }
            }
        }
    }
}
