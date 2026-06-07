package B2;

import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import e2.InterfaceC0137t;
import java.io.File;
import m0.z;
import xyz.happify.ckemv.MainActivity;

/* loaded from: classes.dex */
public final class h extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity f84f;
    public final /* synthetic */ File g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MainActivity mainActivity, File file, O1.d dVar) {
        super(2, dVar);
        this.f84f = mainActivity;
        this.g = file;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new h(this.f84f, this.g, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        h hVar = (h) b((O1.d) obj2, (InterfaceC0137t) obj);
        K1.h hVar2 = K1.h.f605a;
        hVar.k(hVar2);
        return hVar2;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        z.m0(obj);
        File file = this.g;
        int i3 = MainActivity.f5246F;
        MainActivity mainActivity = this.f84f;
        mainActivity.getClass();
        try {
            Uri c = FileProvider.c(mainActivity, mainActivity.getApplicationContext().getPackageName() + ".fileprovider", file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(c, "application/vnd.android.package-archive");
            intent.setFlags(268435457);
            mainActivity.startActivity(intent);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return K1.h.f605a;
    }
}
