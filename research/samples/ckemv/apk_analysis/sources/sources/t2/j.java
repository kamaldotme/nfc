package t2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends p2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f4941f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, q qVar, int i3, int i4, int i5) {
        super(true, str);
        this.f4940e = i5;
        this.f4941f = qVar;
        this.g = i3;
        this.h = i4;
    }

    @Override // p2.a
    public final long a() {
        switch (this.f4940e) {
            case 0:
                int i3 = this.g;
                int i4 = this.h;
                q qVar = this.f4941f;
                qVar.getClass();
                try {
                    qVar.f4977z.A(i3, i4, true);
                    return -1L;
                } catch (IOException e3) {
                    qVar.a(2, 2, e3);
                    return -1L;
                }
            case 1:
                B b3 = this.f4941f.f4964m;
                int i5 = this.h;
                b3.getClass();
                X.d.o("errorCode", i5);
                synchronized (this.f4941f) {
                    this.f4941f.f4955B.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                q qVar2 = this.f4941f;
                try {
                    int i6 = this.g;
                    int i7 = this.h;
                    qVar2.getClass();
                    X.d.o("statusCode", i7);
                    qVar2.f4977z.D(i6, i7);
                    return -1L;
                } catch (IOException e4) {
                    qVar2.a(2, 2, e4);
                    return -1L;
                }
        }
    }
}
