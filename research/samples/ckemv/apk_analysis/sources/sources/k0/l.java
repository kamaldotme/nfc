package k0;

import a.AbstractC0059a;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public A.g[] f3854a;

    /* renamed from: b, reason: collision with root package name */
    public String f3855b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3856d;

    public l() {
        this.f3854a = null;
        this.c = 0;
    }

    public A.g[] getPathData() {
        return this.f3854a;
    }

    public String getPathName() {
        return this.f3855b;
    }

    public void setPathData(A.g[] gVarArr) {
        if (!AbstractC0059a.e(this.f3854a, gVarArr)) {
            this.f3854a = AbstractC0059a.r(gVarArr);
            return;
        }
        A.g[] gVarArr2 = this.f3854a;
        for (int i3 = 0; i3 < gVarArr.length; i3++) {
            gVarArr2[i3].f6a = gVarArr[i3].f6a;
            int i4 = 0;
            while (true) {
                float[] fArr = gVarArr[i3].f7b;
                if (i4 < fArr.length) {
                    gVarArr2[i3].f7b[i4] = fArr[i4];
                    i4++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f3854a = null;
        this.c = 0;
        this.f3855b = lVar.f3855b;
        this.f3856d = lVar.f3856d;
        this.f3854a = AbstractC0059a.r(lVar.f3854a);
    }
}
