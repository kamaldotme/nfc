package androidx.activity;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f1439a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1440b;
    public final float c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1441d;

    public b(BackEvent backEvent) {
        X1.g.e(backEvent, "backEvent");
        a aVar = a.f1438a;
        float d3 = aVar.d(backEvent);
        float e3 = aVar.e(backEvent);
        float b3 = aVar.b(backEvent);
        int c = aVar.c(backEvent);
        this.f1439a = d3;
        this.f1440b = e3;
        this.c = b3;
        this.f1441d = c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1439a + ", touchY=" + this.f1440b + ", progress=" + this.c + ", swipeEdge=" + this.f1441d + '}';
    }
}
