package t2;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends p2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4947e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f4948f;
    public final /* synthetic */ int g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i3, List list) {
        super(true, str);
        this.f4948f = qVar;
        this.g = i3;
        this.h = list;
    }

    @Override // p2.a
    public final long a() {
        switch (this.f4947e) {
            case 0:
                B b3 = this.f4948f.f4964m;
                List list = this.h;
                b3.getClass();
                X1.g.e(list, "responseHeaders");
                try {
                    this.f4948f.f4977z.D(this.g, 9);
                    synchronized (this.f4948f) {
                        this.f4948f.f4955B.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                B b4 = this.f4948f.f4964m;
                List list2 = this.h;
                b4.getClass();
                X1.g.e(list2, "requestHeaders");
                try {
                    this.f4948f.f4977z.D(this.g, 9);
                    synchronized (this.f4948f) {
                        this.f4948f.f4955B.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, q qVar, int i3, List list, boolean z3) {
        super(true, str);
        this.f4948f = qVar;
        this.g = i3;
        this.h = list;
    }
}
