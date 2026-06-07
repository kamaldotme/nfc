package f0;

import android.database.sqlite.SQLiteStatement;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173i extends C0172h implements e0.d {
    public final SQLiteStatement c;

    public C0173i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.c = sQLiteStatement;
    }

    public final long a() {
        return this.c.executeInsert();
    }

    public final int b() {
        return this.c.executeUpdateDelete();
    }
}
