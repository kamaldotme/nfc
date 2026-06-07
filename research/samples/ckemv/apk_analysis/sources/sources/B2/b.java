package B2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import e0.C0117a;
import f0.C0171g;
import xyz.happify.ckemv.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.activity.result.b, K.d, e0.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76b;

    public /* synthetic */ b() {
        this.f76b = m2.b.f4005d;
    }

    @Override // androidx.activity.result.b
    public void a(Object obj) {
        I1.w wVar = (I1.w) obj;
        int i3 = MainActivity.f5246F;
        MainActivity mainActivity = (MainActivity) this.f76b;
        X1.g.e(mainActivity, "this$0");
        X1.g.e(wVar, "result");
        String str = wVar.f380a;
        if (str != null) {
            a aVar = mainActivity.f5247A;
            if (aVar == null) {
                X1.g.h("dbHelper");
                throw null;
            }
            SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("api_key", str);
            writableDatabase.update("stats", contentValues, "id = 1", null);
        }
    }

    @Override // e0.b
    public e0.c c(C0117a c0117a) {
        Context context = (Context) this.f76b;
        X1.g.e(context, "$context");
        J1.l lVar = c0117a.c;
        X1.g.e(lVar, "callback");
        String str = c0117a.f2689b;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
        }
        return new C0171g(context, str, lVar, true, true);
    }

    public /* synthetic */ b(Object obj) {
        this.f76b = obj;
    }
}
