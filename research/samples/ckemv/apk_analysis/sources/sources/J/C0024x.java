package J;

import android.text.TextUtils;
import android.view.View;

/* renamed from: J.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024x extends AbstractC0026z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f467e;

    public C0024x(int i3, Class cls, int i4, int i5, int i6) {
        this.f467e = i6;
        this.f471a = i3;
        this.f473d = cls;
        this.c = i4;
        this.f472b = i5;
    }

    @Override // J.AbstractC0026z
    public final Object c(View view) {
        switch (this.f467e) {
            case 0:
                return Boolean.valueOf(L.d(view));
            case 1:
                return L.b(view);
            default:
                return Boolean.valueOf(L.c(view));
        }
    }

    @Override // J.AbstractC0026z
    public final void d(View view, Object obj) {
        switch (this.f467e) {
            case 0:
                L.j(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                L.h(view, (CharSequence) obj);
                return;
            default:
                L.g(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // J.AbstractC0026z
    public final boolean h(Object obj, Object obj2) {
        switch (this.f467e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
