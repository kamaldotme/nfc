package j0;

import android.view.View;
import android.view.WindowId;

/* renamed from: j0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224D {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f3390a;

    public C0224D(View view) {
        this.f3390a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0224D) && ((C0224D) obj).f3390a.equals(this.f3390a);
    }

    public final int hashCode() {
        return this.f3390a.hashCode();
    }
}
