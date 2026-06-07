package f0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0165a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3008b;

    public /* synthetic */ C0165a(int i3, Object obj) {
        this.f3007a = i3;
        this.f3008b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f3007a) {
            case 0:
                e0.e eVar = (e0.e) this.f3008b;
                X1.g.e(eVar, "$query");
                X1.g.b(sQLiteQuery);
                eVar.b(new C0172h(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                C0166b c0166b = (C0166b) this.f3008b;
                X1.g.e(c0166b, "$tmp0");
                X1.g.b(sQLiteQuery);
                c0166b.c.b(new C0172h(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
