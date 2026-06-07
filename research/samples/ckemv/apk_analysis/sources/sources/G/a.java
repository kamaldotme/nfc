package G;

import Z.H;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;
import m0.z;
import z.AbstractC0452b;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f179d;

    public /* synthetic */ a(int i3, int i4, Object obj) {
        this.f178b = i4;
        this.f179d = obj;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H h;
        switch (this.f178b) {
            case 0:
                AbstractC0452b abstractC0452b = (AbstractC0452b) ((A.h) this.f179d).c;
                if (abstractC0452b != null) {
                    abstractC0452b.g(this.c);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f179d;
                int size = arrayList.size();
                int i3 = 0;
                if (this.c != 1) {
                    while (i3 < size) {
                        ((androidx.emoji2.text.h) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    return;
                } else {
                    while (i3 < size) {
                        ((androidx.emoji2.text.h) arrayList.get(i3)).a();
                        i3++;
                    }
                    return;
                }
            case 2:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) this.f179d).f2401Z;
                if (recyclerView.f2152v || (h = recyclerView.f2136m) == null) {
                    return;
                }
                h.u0(recyclerView, this.c);
                return;
            default:
                ((SystemForegroundService) this.f179d).f2211f.cancel(this.c);
                return;
        }
    }

    public a(List list, int i3, Throwable th) {
        this.f178b = 1;
        z.k(list, "initCallbacks cannot be null");
        this.f179d = new ArrayList(list);
        this.c = i3;
    }
}
