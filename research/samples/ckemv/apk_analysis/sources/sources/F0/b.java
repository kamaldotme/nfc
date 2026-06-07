package F0;

import K.r;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p0.j;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f159b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f160d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f161e;

    public /* synthetic */ b(Object obj, int i3, Object obj2, int i4) {
        this.f159b = i4;
        this.f161e = obj;
        this.c = i3;
        this.f160d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.b bVar;
        switch (this.f159b) {
            case 0:
                ((BottomSheetBehavior) this.f161e).E((View) this.f160d, this.c, false);
                return;
            case 1:
                Object obj = ((r) this.f160d).f599a;
                androidx.activity.g gVar = (androidx.activity.g) this.f161e;
                String str = (String) gVar.f1487a.get(Integer.valueOf(this.c));
                if (str == null) {
                    return;
                }
                androidx.activity.result.e eVar = (androidx.activity.result.e) gVar.f1490e.get(str);
                if (eVar == null || (bVar = eVar.f1483a) == null) {
                    gVar.g.remove(str);
                    gVar.f1491f.put(str, obj);
                    return;
                } else {
                    if (gVar.f1489d.remove(str)) {
                        bVar.a(obj);
                        return;
                    }
                    return;
                }
            case 2:
                ((androidx.activity.g) this.f161e).a(this.c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f160d));
                return;
            case 3:
                ((TextView) this.f160d).setTypeface((Typeface) this.f161e, this.c);
                return;
            case 4:
                ((j) this.f160d).a((Intent) this.f161e, this.c);
                return;
            default:
                ((SystemForegroundService) this.f161e).f2211f.notify(this.c, (Notification) this.f160d);
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i3, int i4) {
        this.f159b = i4;
        this.f160d = obj;
        this.f161e = obj2;
        this.c = i3;
    }

    public b(BottomSheetBehavior bottomSheetBehavior, View view, int i3) {
        this.f159b = 0;
        this.f161e = bottomSheetBehavior;
        this.f160d = view;
        this.c = i3;
    }
}
