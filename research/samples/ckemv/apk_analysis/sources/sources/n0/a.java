package N0;

import android.content.Context;
import u2.d;
import u2.l;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f680f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f681a;

    /* renamed from: b, reason: collision with root package name */
    public final int f682b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f683d;

    /* renamed from: e, reason: collision with root package name */
    public final float f684e;

    public a(Context context) {
        boolean A3 = d.A(context, R.attr.elevationOverlayEnabled, false);
        int k2 = l.k(context, R.attr.elevationOverlayColor, 0);
        int k3 = l.k(context, R.attr.elevationOverlayAccentColor, 0);
        int k4 = l.k(context, R.attr.colorSurface, 0);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f681a = A3;
        this.f682b = k2;
        this.c = k3;
        this.f683d = k4;
        this.f684e = f3;
    }
}
