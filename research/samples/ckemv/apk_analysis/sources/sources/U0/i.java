package U0;

/* loaded from: classes.dex */
public final class i extends u2.l {
    @Override // u2.l
    public final void o(u uVar, float f3, float f4) {
        uVar.d(f4 * f3, 180.0f, 90.0f);
        float f5 = f4 * 2.0f * f3;
        q qVar = new q(0.0f, 0.0f, f5, f5);
        qVar.f960f = 180.0f;
        qVar.g = 90.0f;
        uVar.g.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.h.add(oVar);
        uVar.f968e = 270.0f;
        float f6 = (0.0f + f5) * 0.5f;
        float f7 = (f5 - 0.0f) / 2.0f;
        double d3 = 270.0f;
        uVar.c = (((float) Math.cos(Math.toRadians(d3))) * f7) + f6;
        uVar.f967d = (f7 * ((float) Math.sin(Math.toRadians(d3)))) + f6;
    }
}
