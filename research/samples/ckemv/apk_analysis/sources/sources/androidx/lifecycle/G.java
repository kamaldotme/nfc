package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class G extends Fragment {
    public static final /* synthetic */ int c = 0;

    /* renamed from: b, reason: collision with root package name */
    public A.h f2020b;

    public final void a(EnumC0095l enumC0095l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            X1.g.d(activity, "activity");
            I.a(activity, enumC0095l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0095l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0095l.ON_DESTROY);
        this.f2020b = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0095l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        A.h hVar = this.f2020b;
        if (hVar != null) {
            ((D) hVar.c).a();
        }
        a(EnumC0095l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        A.h hVar = this.f2020b;
        if (hVar != null) {
            D d3 = (D) hVar.c;
            int i3 = d3.f2014b + 1;
            d3.f2014b = i3;
            if (i3 == 1 && d3.f2016e) {
                d3.g.d(EnumC0095l.ON_START);
                d3.f2016e = false;
            }
        }
        a(EnumC0095l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0095l.ON_STOP);
    }
}
