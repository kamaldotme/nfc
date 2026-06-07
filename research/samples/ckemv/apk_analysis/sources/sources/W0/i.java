package w0;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f5158a;

    public i(WorkDatabase workDatabase, int i3) {
        switch (i3) {
            case 1:
                this.f5158a = workDatabase;
                return;
            default:
                X1.g.e(workDatabase, "workDatabase");
                this.f5158a = workDatabase;
                return;
        }
    }
}
