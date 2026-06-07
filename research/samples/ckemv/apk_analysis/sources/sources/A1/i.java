package A1;

import Z.W;
import android.view.View;
import j1.C0244n;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50a;

    /* renamed from: b, reason: collision with root package name */
    public int f51b;
    public int c;

    public void a(W w3) {
        View view = w3.f1205a;
        this.f51b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public C0244n b() {
        return new C0244n(this.f51b, this.c);
    }

    public String toString() {
        switch (this.f50a) {
            case 4:
                return "<" + this.f51b + ' ' + this.c + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(int i3, int i4, int i5) {
        this.f50a = i5;
        this.f51b = i3;
        this.c = i4;
    }
}
