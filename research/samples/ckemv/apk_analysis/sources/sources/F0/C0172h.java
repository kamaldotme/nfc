package f0;

import android.database.sqlite.SQLiteProgram;

/* renamed from: f0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0172h implements e0.d {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteProgram f3024b;

    public C0172h(SQLiteProgram sQLiteProgram) {
        X1.g.e(sQLiteProgram, "delegate");
        this.f3024b = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3024b.close();
    }

    @Override // e0.d
    public final void f(int i3, byte[] bArr) {
        this.f3024b.bindBlob(i3, bArr);
    }

    @Override // e0.d
    public final void g(int i3) {
        this.f3024b.bindNull(i3);
    }

    @Override // e0.d
    public final void h(String str, int i3) {
        X1.g.e(str, "value");
        this.f3024b.bindString(i3, str);
    }

    @Override // e0.d
    public final void l(int i3, double d3) {
        this.f3024b.bindDouble(i3, d3);
    }

    @Override // e0.d
    public final void x(int i3, long j3) {
        this.f3024b.bindLong(i3, j3);
    }
}
