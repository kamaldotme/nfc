package O;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f687a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(new Handler());
        this.f687a = cVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        Cursor cursor;
        c cVar = this.f687a;
        if (!cVar.c || (cursor = cVar.f691d) == null || cursor.isClosed()) {
            return;
        }
        cVar.f690b = cVar.f691d.requery();
    }
}
