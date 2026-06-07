package M1;

import J.AbstractC0026z;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends AbstractC0026z implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f635e;

    public c(e eVar, int i3) {
        this.f635e = i3;
        X1.g.e(eVar, "map");
        this.f473d = eVar;
        this.f472b = -1;
        this.c = eVar.f643i;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f635e) {
            case 0:
                b();
                int i3 = this.f471a;
                e eVar = (e) this.f473d;
                if (i3 >= eVar.g) {
                    throw new NoSuchElementException();
                }
                this.f471a = i3 + 1;
                this.f472b = i3;
                d dVar = new d(eVar, i3);
                f();
                return dVar;
            case 1:
                b();
                int i4 = this.f471a;
                e eVar2 = (e) this.f473d;
                if (i4 >= eVar2.g) {
                    throw new NoSuchElementException();
                }
                this.f471a = i4 + 1;
                this.f472b = i4;
                Object obj = eVar2.f639b[i4];
                f();
                return obj;
            default:
                b();
                int i5 = this.f471a;
                e eVar3 = (e) this.f473d;
                if (i5 >= eVar3.g) {
                    throw new NoSuchElementException();
                }
                this.f471a = i5 + 1;
                this.f472b = i5;
                Object[] objArr = eVar3.c;
                X1.g.b(objArr);
                Object obj2 = objArr[this.f472b];
                f();
                return obj2;
        }
    }
}
