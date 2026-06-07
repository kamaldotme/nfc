package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f1783a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final r f1784b;
    public r c;

    /* renamed from: d, reason: collision with root package name */
    public r f1785d;

    /* renamed from: e, reason: collision with root package name */
    public int f1786e;

    /* renamed from: f, reason: collision with root package name */
    public int f1787f;

    public o(r rVar) {
        this.f1784b = rVar;
        this.c = rVar;
    }

    public final int a(int i3) {
        SparseArray sparseArray = this.c.f1794a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(i3);
        int i4 = 1;
        int i5 = 2;
        if (this.f1783a == 2) {
            if (rVar != null) {
                this.c = rVar;
                this.f1787f++;
            } else if (i3 == 65038) {
                b();
            } else if (i3 != 65039) {
                r rVar2 = this.c;
                if (rVar2.f1795b != null) {
                    i5 = 3;
                    if (this.f1787f != 1) {
                        this.f1785d = rVar2;
                        b();
                    } else if (c()) {
                        this.f1785d = this.c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i4 = i5;
        } else if (rVar == null) {
            b();
        } else {
            this.f1783a = 2;
            this.c = rVar;
            this.f1787f = 1;
            i4 = i5;
        }
        this.f1786e = i3;
        return i4;
    }

    public final void b() {
        this.f1783a = 1;
        this.c = this.f1784b;
        this.f1787f = 0;
    }

    public final boolean c() {
        R.a c = this.c.f1795b.c();
        int a3 = c.a(6);
        return !(a3 == 0 || ((ByteBuffer) c.f473d).get(a3 + c.f471a) == 0) || this.f1786e == 65039;
    }
}
