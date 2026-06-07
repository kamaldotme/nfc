package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class n1 implements InterfaceC0297n0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f3737a;

    /* renamed from: b, reason: collision with root package name */
    public int f3738b;
    public View c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f3739d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3740e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3741f;
    public boolean g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f3742i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3743j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3744k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3745l;

    /* renamed from: m, reason: collision with root package name */
    public C0288j f3746m;

    /* renamed from: n, reason: collision with root package name */
    public int f3747n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f3748o;

    public final void a(int i3) {
        View view;
        int i4 = this.f3738b ^ i3;
        this.f3738b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                int i5 = this.f3738b & 4;
                Toolbar toolbar = this.f3737a;
                if (i5 != 0) {
                    Drawable drawable = this.f3741f;
                    if (drawable == null) {
                        drawable = this.f3748o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            int i6 = i4 & 8;
            Toolbar toolbar2 = this.f3737a;
            if (i6 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.f3742i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f3738b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f3743j);
            Toolbar toolbar = this.f3737a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f3747n);
            } else {
                toolbar.setNavigationContentDescription(this.f3743j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f3738b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) != 0) {
            drawable = this.f3740e;
            if (drawable == null) {
                drawable = this.f3739d;
            }
        } else {
            drawable = this.f3739d;
        }
        this.f3737a.setLogo(drawable);
    }
}
