package a0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class h extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1400a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1400a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        X1.g.e((d) iInterface, "callback");
        X1.g.e(obj, "cookie");
        this.f1400a.c.remove((Integer) obj);
    }
}
