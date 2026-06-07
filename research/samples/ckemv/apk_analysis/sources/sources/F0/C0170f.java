package f0;

import J1.l;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import f.C0150G;
import g0.C0175a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170f extends SQLiteOpenHelper {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f3015i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3016b;
    public final C0150G c;

    /* renamed from: d, reason: collision with root package name */
    public final l f3017d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3018e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3019f;
    public final C0175a g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0170f(Context context, String str, final C0150G c0150g, final l lVar, boolean z3) {
        super(context, str, null, lVar.f579b, new DatabaseErrorHandler() { // from class: f0.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                X1.g.e(l.this, "$callback");
                C0150G c0150g2 = c0150g;
                X1.g.e(c0150g2, "$dbRef");
                int i3 = C0170f.f3015i;
                X1.g.d(sQLiteDatabase, "dbObj");
                C0167c x2 = v0.f.x(c0150g2, sQLiteDatabase);
                SQLiteDatabase sQLiteDatabase2 = x2.f3011b;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        l.c(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = x2.c;
                    } finally {
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                X1.g.d(obj, "p.second");
                                l.c((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                l.c(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    x2.close();
                } catch (IOException unused2) {
                    if (list != null) {
                        return;
                    }
                }
            }
        });
        X1.g.e(context, "context");
        X1.g.e(lVar, "callback");
        this.f3016b = context;
        this.c = c0150g;
        this.f3017d = lVar;
        this.f3018e = z3;
        if (str == null) {
            str = UUID.randomUUID().toString();
            X1.g.d(str, "randomUUID().toString()");
        }
        File cacheDir = context.getCacheDir();
        X1.g.d(cacheDir, "context.cacheDir");
        this.g = new C0175a(str, cacheDir, false);
    }

    public final C0167c a(boolean z3) {
        C0175a c0175a = this.g;
        try {
            c0175a.a((this.h || getDatabaseName() == null) ? false : true);
            this.f3019f = false;
            SQLiteDatabase o3 = o(z3);
            if (!this.f3019f) {
                C0167c b3 = b(o3);
                c0175a.b();
                return b3;
            }
            close();
            C0167c a3 = a(z3);
            c0175a.b();
            return a3;
        } catch (Throwable th) {
            c0175a.b();
            throw th;
        }
    }

    public final C0167c b(SQLiteDatabase sQLiteDatabase) {
        X1.g.e(sQLiteDatabase, "sqLiteDatabase");
        return v0.f.x(this.c, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0175a c0175a = this.g;
        try {
            c0175a.a(c0175a.f3031a);
            super.close();
            this.c.f2846b = null;
            this.h = false;
        } finally {
            c0175a.b();
        }
    }

    public final SQLiteDatabase i(boolean z3) {
        if (z3) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            X1.g.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        X1.g.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase o(boolean z3) {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f3016b;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            return i(z3);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return i(z3);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C0169e) {
                    C0169e c0169e = th;
                    int a3 = q.h.a(c0169e.f3014b);
                    Throwable th2 = c0169e.c;
                    if (a3 == 0 || a3 == 1 || a3 == 2 || a3 == 3) {
                        throw th2;
                    }
                    if (!(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else {
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                    if (databaseName == null || !this.f3018e) {
                        throw th;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return i(z3);
                } catch (C0169e e3) {
                    throw e3.c;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        X1.g.e(sQLiteDatabase, "db");
        try {
            this.f3017d.f(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C0169e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        X1.g.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f3017d.g(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C0169e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        X1.g.e(sQLiteDatabase, "db");
        this.f3019f = true;
        try {
            this.f3017d.h(b(sQLiteDatabase), i3, i4);
        } catch (Throwable th) {
            throw new C0169e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        X1.g.e(sQLiteDatabase, "db");
        if (!this.f3019f) {
            try {
                this.f3017d.i(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C0169e(5, th);
            }
        }
        this.h = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        X1.g.e(sQLiteDatabase, "sqLiteDatabase");
        this.f3019f = true;
        try {
            this.f3017d.j(b(sQLiteDatabase), i3, i4);
        } catch (Throwable th) {
            throw new C0169e(3, th);
        }
    }
}
