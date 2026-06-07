package f0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.io.Closeable;
import java.util.List;
import m0.z;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167c implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f3009d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f3010e = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f3011b;
    public final List c;

    public C0167c(SQLiteDatabase sQLiteDatabase) {
        X1.g.e(sQLiteDatabase, "delegate");
        this.f3011b = sQLiteDatabase;
        this.c = sQLiteDatabase.getAttachedDbs();
    }

    public final void A(String str) {
        X1.g.e(str, "sql");
        this.f3011b.execSQL(str);
    }

    public final void D(String str, Object[] objArr) {
        X1.g.e(str, "sql");
        X1.g.e(objArr, "bindArgs");
        this.f3011b.execSQL(str, objArr);
    }

    public final boolean G() {
        return this.f3011b.inTransaction();
    }

    public final boolean I() {
        SQLiteDatabase sQLiteDatabase = this.f3011b;
        X1.g.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor J(e0.e eVar) {
        Cursor rawQueryWithFactory = this.f3011b.rawQueryWithFactory(new C0165a(1, new C0166b(eVar)), eVar.i(), f3010e, null);
        X1.g.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final Cursor K(e0.e eVar, CancellationSignal cancellationSignal) {
        String i3 = eVar.i();
        String[] strArr = f3010e;
        X1.g.b(cancellationSignal);
        C0165a c0165a = new C0165a(0, eVar);
        SQLiteDatabase sQLiteDatabase = this.f3011b;
        X1.g.e(sQLiteDatabase, "sQLiteDatabase");
        X1.g.e(i3, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c0165a, i3, strArr, null, cancellationSignal);
        X1.g.d(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public final Cursor L(String str) {
        X1.g.e(str, "query");
        return J(new d1.f(str));
    }

    public final void M() {
        this.f3011b.setTransactionSuccessful();
    }

    public final int N(String str, int i3, ContentValues contentValues, String str2, Object[] objArr) {
        X1.g.e(str, "table");
        X1.g.e(contentValues, "values");
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f3009d[i3]);
        sb.append(str);
        sb.append(" SET ");
        int i4 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i4 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i4] = contentValues.get(str3);
            sb.append("=?");
            i4++;
        }
        if (objArr != null) {
            for (int i5 = size; i5 < length; i5++) {
                objArr2[i5] = objArr[i5 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        X1.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
        C0173i i6 = i(sb2);
        z.b(i6, objArr2);
        return i6.c.executeUpdateDelete();
    }

    public final void a() {
        this.f3011b.beginTransaction();
    }

    public final void b() {
        this.f3011b.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3011b.close();
    }

    public final C0173i i(String str) {
        X1.g.e(str, "sql");
        SQLiteStatement compileStatement = this.f3011b.compileStatement(str);
        X1.g.d(compileStatement, "delegate.compileStatement(sql)");
        return new C0173i(compileStatement);
    }

    public final boolean isOpen() {
        return this.f3011b.isOpen();
    }

    public final void o() {
        this.f3011b.endTransaction();
    }
}
