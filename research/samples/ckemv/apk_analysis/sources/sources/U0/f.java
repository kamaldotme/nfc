package U0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f887a;

    /* renamed from: b, reason: collision with root package name */
    public N0.a f888b;
    public ColorStateList c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f889d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f890e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f891f;
    public PorterDuff.Mode g;
    public Rect h;

    /* renamed from: i, reason: collision with root package name */
    public final float f892i;

    /* renamed from: j, reason: collision with root package name */
    public float f893j;

    /* renamed from: k, reason: collision with root package name */
    public float f894k;

    /* renamed from: l, reason: collision with root package name */
    public int f895l;

    /* renamed from: m, reason: collision with root package name */
    public float f896m;

    /* renamed from: n, reason: collision with root package name */
    public float f897n;

    /* renamed from: o, reason: collision with root package name */
    public final float f898o;

    /* renamed from: p, reason: collision with root package name */
    public final int f899p;

    /* renamed from: q, reason: collision with root package name */
    public int f900q;

    /* renamed from: r, reason: collision with root package name */
    public int f901r;

    /* renamed from: s, reason: collision with root package name */
    public final int f902s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f903t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint.Style f904u;

    public f(k kVar) {
        this.c = null;
        this.f889d = null;
        this.f890e = null;
        this.f891f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.f892i = 1.0f;
        this.f893j = 1.0f;
        this.f895l = 255;
        this.f896m = 0.0f;
        this.f897n = 0.0f;
        this.f898o = 0.0f;
        this.f899p = 0;
        this.f900q = 0;
        this.f901r = 0;
        this.f902s = 0;
        this.f903t = false;
        this.f904u = Paint.Style.FILL_AND_STROKE;
        this.f887a = kVar;
        this.f888b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f909f = true;
        return gVar;
    }

    public f(f fVar) {
        this.c = null;
        this.f889d = null;
        this.f890e = null;
        this.f891f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.f892i = 1.0f;
        this.f893j = 1.0f;
        this.f895l = 255;
        this.f896m = 0.0f;
        this.f897n = 0.0f;
        this.f898o = 0.0f;
        this.f899p = 0;
        this.f900q = 0;
        this.f901r = 0;
        this.f902s = 0;
        this.f903t = false;
        this.f904u = Paint.Style.FILL_AND_STROKE;
        this.f887a = fVar.f887a;
        this.f888b = fVar.f888b;
        this.f894k = fVar.f894k;
        this.c = fVar.c;
        this.f889d = fVar.f889d;
        this.g = fVar.g;
        this.f891f = fVar.f891f;
        this.f895l = fVar.f895l;
        this.f892i = fVar.f892i;
        this.f901r = fVar.f901r;
        this.f899p = fVar.f899p;
        this.f903t = fVar.f903t;
        this.f893j = fVar.f893j;
        this.f896m = fVar.f896m;
        this.f897n = fVar.f897n;
        this.f898o = fVar.f898o;
        this.f900q = fVar.f900q;
        this.f902s = fVar.f902s;
        this.f890e = fVar.f890e;
        this.f904u = fVar.f904u;
        if (fVar.h != null) {
            this.h = new Rect(fVar.h);
        }
    }
}
