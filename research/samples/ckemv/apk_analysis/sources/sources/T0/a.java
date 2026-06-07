package T0;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f869i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f870j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f871k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f872l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f873a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f874b;
    public final Paint c;

    /* renamed from: d, reason: collision with root package name */
    public int f875d;

    /* renamed from: e, reason: collision with root package name */
    public int f876e;

    /* renamed from: f, reason: collision with root package name */
    public int f877f;
    public final Path g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f873a = paint2;
        this.f875d = A.a.d(-16777216, 68);
        this.f876e = A.a.d(-16777216, 20);
        this.f877f = A.a.d(-16777216, 0);
        paint2.setColor(this.f875d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f874b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint3);
    }
}
