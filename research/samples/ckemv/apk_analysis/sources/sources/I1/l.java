package I1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f355n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Activity f356a;

    /* renamed from: b, reason: collision with root package name */
    public final DecoratedBarcodeView f357b;
    public final n1.f h;

    /* renamed from: i, reason: collision with root package name */
    public final A1.h f361i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f362j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f365m;
    public int c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f358d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f359e = true;

    /* renamed from: f, reason: collision with root package name */
    public String f360f = "";
    public boolean g = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f363k = false;

    /* renamed from: l, reason: collision with root package name */
    public final A.h f364l = new A.h(5, this);

    public l(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        f fVar = new f(1, this);
        this.f365m = false;
        this.f356a = activity;
        this.f357b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f334k.add(fVar);
        this.f362j = new Handler();
        this.h = new n1.f(activity, new h(this, 0));
        this.f361i = new A1.h(activity);
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.f357b;
        J1.g gVar = decoratedBarcodeView.getBarcodeView().f328b;
        if (gVar == null || gVar.g) {
            this.f356a.finish();
        } else {
            this.f363k = true;
        }
        decoratedBarcodeView.f2596b.c();
        this.h.a();
    }

    public final void b(String str) {
        Activity activity = this.f356a;
        if (activity.isFinishing() || this.g || this.f363k) {
            return;
        }
        if (str.isEmpty()) {
            str = activity.getString(R.string.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(activity.getString(R.string.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(R.string.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: I1.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                l.this.f356a.finish();
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: I1.j
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                l.this.f356a.finish();
            }
        });
        builder.show();
    }
}
