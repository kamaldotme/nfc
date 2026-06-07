package I1;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f350b;
    public final /* synthetic */ l c;

    public /* synthetic */ h(l lVar, int i3) {
        this.f350b = i3;
        this.c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f350b) {
            case 0:
                this.c.f356a.finish();
                return;
            default:
                l lVar = this.c;
                lVar.getClass();
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra("TIMEOUT", true);
                lVar.f356a.setResult(0, intent);
                lVar.a();
                return;
        }
    }
}
