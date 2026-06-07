package androidx.activity;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1438a = new Object();

    public final BackEvent a(float f3, float f4, float f5, int i3) {
        return new BackEvent(f3, f4, f5, i3);
    }

    public final float b(BackEvent backEvent) {
        X1.g.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        X1.g.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        X1.g.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        X1.g.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
