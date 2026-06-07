package U0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f965a;

    /* renamed from: b, reason: collision with root package name */
    public float f966b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f967d;

    /* renamed from: e, reason: collision with root package name */
    public float f968e;

    /* renamed from: f, reason: collision with root package name */
    public float f969f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f3) {
        float f4 = this.f968e;
        if (f4 == f3) {
            return;
        }
        float f5 = ((f3 - f4) + 360.0f) % 360.0f;
        if (f5 > 180.0f) {
            return;
        }
        float f6 = this.c;
        float f7 = this.f967d;
        q qVar = new q(f6, f7, f6, f7);
        qVar.f960f = this.f968e;
        qVar.g = f5;
        this.h.add(new o(qVar));
        this.f968e = f3;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((s) arrayList.get(i3)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U0.s, U0.r, java.lang.Object] */
    public final void c(float f3, float f4) {
        ?? sVar = new s();
        sVar.f961b = f3;
        sVar.c = f4;
        this.g.add(sVar);
        p pVar = new p(sVar, this.c, this.f967d);
        float b3 = pVar.b() + 270.0f;
        float b4 = pVar.b() + 270.0f;
        a(b3);
        this.h.add(pVar);
        this.f968e = b4;
        this.c = f3;
        this.f967d = f4;
    }

    public final void d(float f3, float f4, float f5) {
        this.f965a = 0.0f;
        this.f966b = f3;
        this.c = 0.0f;
        this.f967d = f3;
        this.f968e = f4;
        this.f969f = (f4 + f5) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
