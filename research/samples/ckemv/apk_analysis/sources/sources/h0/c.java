package H0;

import A1.m;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f277b;
    public final /* synthetic */ CarouselLayoutManager c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i3) {
        super(1);
        this.f277b = i3;
        switch (i3) {
            case 1:
                this.c = carouselLayoutManager;
                super(0);
                return;
            default:
                this.c = carouselLayoutManager;
                return;
        }
    }

    @Override // A1.m
    public final int a() {
        switch (this.f277b) {
            case 0:
                return this.c.f1169o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                return carouselLayoutManager.f1169o - carouselLayoutManager.B();
        }
    }

    @Override // A1.m
    public final int b() {
        switch (this.f277b) {
            case 0:
                return this.c.C();
            default:
                return 0;
        }
    }

    @Override // A1.m
    public final int c() {
        switch (this.f277b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.c;
                return carouselLayoutManager.f1168n - carouselLayoutManager.D();
            default:
                return this.c.f1168n;
        }
    }

    @Override // A1.m
    public final int d() {
        switch (this.f277b) {
            case 0:
                return 0;
            default:
                return this.c.E();
        }
    }
}
