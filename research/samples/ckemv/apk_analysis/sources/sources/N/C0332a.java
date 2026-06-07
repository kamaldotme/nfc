package n;

import a0.m;
import java.util.Map;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332a extends m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4129e;

    public /* synthetic */ C0332a(int i3, Object obj) {
        this.f4128d = i3;
        this.f4129e = obj;
    }

    @Override // a0.m
    public final void d() {
        switch (this.f4128d) {
            case 0:
                ((C0333b) this.f4129e).clear();
                return;
            default:
                ((C0334c) this.f4129e).clear();
                return;
        }
    }

    @Override // a0.m
    public final Object e(int i3, int i4) {
        switch (this.f4128d) {
            case 0:
                return ((C0333b) this.f4129e).c[(i3 << 1) + i4];
            default:
                return ((C0334c) this.f4129e).c[i3];
        }
    }

    @Override // a0.m
    public final Map f() {
        switch (this.f4128d) {
            case 0:
                return (C0333b) this.f4129e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // a0.m
    public final int g() {
        switch (this.f4128d) {
            case 0:
                return ((C0333b) this.f4129e).f4160d;
            default:
                return ((C0334c) this.f4129e).f4136d;
        }
    }

    @Override // a0.m
    public final int h(Object obj) {
        switch (this.f4128d) {
            case 0:
                return ((C0333b) this.f4129e).e(obj);
            default:
                return ((C0334c) this.f4129e).indexOf(obj);
        }
    }

    @Override // a0.m
    public final int i(Object obj) {
        switch (this.f4128d) {
            case 0:
                return ((C0333b) this.f4129e).g(obj);
            default:
                return ((C0334c) this.f4129e).indexOf(obj);
        }
    }

    @Override // a0.m
    public final void j(Object obj, Object obj2) {
        switch (this.f4128d) {
            case 0:
                ((C0333b) this.f4129e).put(obj, obj2);
                return;
            default:
                ((C0334c) this.f4129e).add(obj);
                return;
        }
    }

    @Override // a0.m
    public final void k(int i3) {
        switch (this.f4128d) {
            case 0:
                ((C0333b) this.f4129e).i(i3);
                return;
            default:
                ((C0334c) this.f4129e).e(i3);
                return;
        }
    }

    @Override // a0.m
    public final Object l(int i3, Object obj) {
        switch (this.f4128d) {
            case 0:
                int i4 = (i3 << 1) + 1;
                Object[] objArr = ((C0333b) this.f4129e).c;
                Object obj2 = objArr[i4];
                objArr[i4] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
