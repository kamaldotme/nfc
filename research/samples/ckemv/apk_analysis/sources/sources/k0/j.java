package k0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import n.C0333b;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3845a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3846b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f3847d;

    /* renamed from: e, reason: collision with root package name */
    public float f3848e;

    /* renamed from: f, reason: collision with root package name */
    public float f3849f;
    public float g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f3850i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f3851j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3852k;

    /* renamed from: l, reason: collision with root package name */
    public String f3853l;

    public j() {
        this.f3845a = new Matrix();
        this.f3846b = new ArrayList();
        this.c = 0.0f;
        this.f3847d = 0.0f;
        this.f3848e = 0.0f;
        this.f3849f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.f3850i = 0.0f;
        this.f3851j = new Matrix();
        this.f3853l = null;
    }

    @Override // k0.k
    public final boolean a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f3846b;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i3)).a()) {
                return true;
            }
            i3++;
        }
    }

    @Override // k0.k
    public final boolean b(int[] iArr) {
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f3846b;
            if (i3 >= arrayList.size()) {
                return z3;
            }
            z3 |= ((k) arrayList.get(i3)).b(iArr);
            i3++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3851j;
        matrix.reset();
        matrix.postTranslate(-this.f3847d, -this.f3848e);
        matrix.postScale(this.f3849f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.f3847d, this.f3850i + this.f3848e);
    }

    public String getGroupName() {
        return this.f3853l;
    }

    public Matrix getLocalMatrix() {
        return this.f3851j;
    }

    public float getPivotX() {
        return this.f3847d;
    }

    public float getPivotY() {
        return this.f3848e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f3849f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f3850i;
    }

    public void setPivotX(float f3) {
        if (f3 != this.f3847d) {
            this.f3847d = f3;
            c();
        }
    }

    public void setPivotY(float f3) {
        if (f3 != this.f3848e) {
            this.f3848e = f3;
            c();
        }
    }

    public void setRotation(float f3) {
        if (f3 != this.c) {
            this.c = f3;
            c();
        }
    }

    public void setScaleX(float f3) {
        if (f3 != this.f3849f) {
            this.f3849f = f3;
            c();
        }
    }

    public void setScaleY(float f3) {
        if (f3 != this.g) {
            this.g = f3;
            c();
        }
    }

    public void setTranslateX(float f3) {
        if (f3 != this.h) {
            this.h = f3;
            c();
        }
    }

    public void setTranslateY(float f3) {
        if (f3 != this.f3850i) {
            this.f3850i = f3;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [k0.i, k0.l] */
    public j(j jVar, C0333b c0333b) {
        l lVar;
        this.f3845a = new Matrix();
        this.f3846b = new ArrayList();
        this.c = 0.0f;
        this.f3847d = 0.0f;
        this.f3848e = 0.0f;
        this.f3849f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.f3850i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3851j = matrix;
        this.f3853l = null;
        this.c = jVar.c;
        this.f3847d = jVar.f3847d;
        this.f3848e = jVar.f3848e;
        this.f3849f = jVar.f3849f;
        this.g = jVar.g;
        this.h = jVar.h;
        this.f3850i = jVar.f3850i;
        String str = jVar.f3853l;
        this.f3853l = str;
        this.f3852k = jVar.f3852k;
        if (str != null) {
            c0333b.put(str, this);
        }
        matrix.set(jVar.f3851j);
        ArrayList arrayList = jVar.f3846b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Object obj = arrayList.get(i3);
            if (obj instanceof j) {
                this.f3846b.add(new j((j) obj, c0333b));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f3837f = 0.0f;
                    lVar2.h = 1.0f;
                    lVar2.f3838i = 1.0f;
                    lVar2.f3839j = 0.0f;
                    lVar2.f3840k = 1.0f;
                    lVar2.f3841l = 0.0f;
                    lVar2.f3842m = Paint.Cap.BUTT;
                    lVar2.f3843n = Paint.Join.MITER;
                    lVar2.f3844o = 4.0f;
                    lVar2.f3836e = iVar.f3836e;
                    lVar2.f3837f = iVar.f3837f;
                    lVar2.h = iVar.h;
                    lVar2.g = iVar.g;
                    lVar2.c = iVar.c;
                    lVar2.f3838i = iVar.f3838i;
                    lVar2.f3839j = iVar.f3839j;
                    lVar2.f3840k = iVar.f3840k;
                    lVar2.f3841l = iVar.f3841l;
                    lVar2.f3842m = iVar.f3842m;
                    lVar2.f3843n = iVar.f3843n;
                    lVar2.f3844o = iVar.f3844o;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3846b.add(lVar);
                Object obj2 = lVar.f3855b;
                if (obj2 != null) {
                    c0333b.put(obj2, lVar);
                }
            }
        }
    }
}
