package androidx.profileinstaller;

import I1.k;
import U0.e;
import X.j;
import android.content.Context;
import h0.InterfaceC0180b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0180b {
    @Override // h0.InterfaceC0180b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // h0.InterfaceC0180b
    public final Object b(Context context) {
        j.a(new k(this, 1, context.getApplicationContext()));
        return new e(13);
    }
}
