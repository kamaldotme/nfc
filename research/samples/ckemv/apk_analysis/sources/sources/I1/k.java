package I1;

import a1.InterfaceFutureC0061a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.YuvImage;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import f.ExecutorC0145B;
import j1.C0242l;
import j1.EnumC0243m;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o0.C0354d;
import x0.C0422a;
import x0.C0432k;
import z.AbstractC0452b;
import z0.AbstractC0466a;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f353b;
    public final /* synthetic */ Object c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f354d;

    public /* synthetic */ k(Object obj, int i3, Object obj2) {
        this.f353b = i3;
        this.c = obj;
        this.f354d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        Intent intent;
        byte[] bArr;
        Map map;
        int i3 = 0;
        switch (this.f353b) {
            case 0:
                l lVar = (l) ((A.h) this.c).c;
                boolean z3 = lVar.f358d;
                b bVar = (b) this.f354d;
                Activity activity = lVar.f356a;
                if (z3) {
                    z zVar = bVar.f320b;
                    t tVar = zVar.f388a;
                    Rect rect = new Rect(0, 0, tVar.f377b, tVar.c);
                    YuvImage yuvImage = new YuvImage(tVar.f376a, zVar.f389b, tVar.f377b, tVar.c, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    int i4 = zVar.c;
                    if (i4 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i4);
                        decodeByteArray = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                    }
                    try {
                        File createTempFile = File.createTempFile("barcodeimage", ".jpg", activity.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        str = createTempFile.getAbsolutePath();
                    } catch (IOException e3) {
                        e3.toString();
                    }
                    intent = new Intent("com.google.zxing.client.android.SCAN");
                    intent.addFlags(524288);
                    intent.putExtra("SCAN_RESULT", bVar.f319a.f3493a);
                    C0242l c0242l = bVar.f319a;
                    intent.putExtra("SCAN_RESULT_FORMAT", c0242l.f3495d.toString());
                    bArr = c0242l.f3494b;
                    if (bArr != null && bArr.length > 0) {
                        intent.putExtra("SCAN_RESULT_BYTES", bArr);
                    }
                    map = c0242l.f3496e;
                    if (map != null) {
                        EnumC0243m enumC0243m = EnumC0243m.h;
                        if (map.containsKey(enumC0243m)) {
                            intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", map.get(enumC0243m).toString());
                        }
                        Number number = (Number) map.get(EnumC0243m.f3497b);
                        if (number != null) {
                            intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                        }
                        String str2 = (String) map.get(EnumC0243m.f3498d);
                        if (str2 != null) {
                            intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
                        }
                        Iterable iterable = (Iterable) map.get(EnumC0243m.c);
                        if (iterable != null) {
                            Iterator it = iterable.iterator();
                            while (it.hasNext()) {
                                intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i3, (byte[]) it.next());
                                i3++;
                            }
                        }
                    }
                    if (str != null) {
                        intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
                    }
                    activity.setResult(-1, intent);
                    lVar.a();
                    return;
                }
                str = null;
                intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.addFlags(524288);
                intent.putExtra("SCAN_RESULT", bVar.f319a.f3493a);
                C0242l c0242l2 = bVar.f319a;
                intent.putExtra("SCAN_RESULT_FORMAT", c0242l2.f3495d.toString());
                bArr = c0242l2.f3494b;
                if (bArr != null) {
                    intent.putExtra("SCAN_RESULT_BYTES", bArr);
                }
                map = c0242l2.f3496e;
                if (map != null) {
                }
                if (str != null) {
                }
                activity.setResult(-1, intent);
                lVar.a();
                return;
            case 1:
                ((ProfileInstallerInitializer) this.c).getClass();
                (Build.VERSION.SDK_INT >= 28 ? X.k.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new X.h((Context) this.f354d, i3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 2:
                Runnable runnable = (Runnable) this.f354d;
                ExecutorC0145B executorC0145B = (ExecutorC0145B) this.c;
                executorC0145B.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0145B.a();
                }
            case 3:
                n0.u uVar = (n0.u) this.c;
                InterfaceFutureC0061a interfaceFutureC0061a = (InterfaceFutureC0061a) this.f354d;
                if (uVar.f4233q.f5210a instanceof C0422a) {
                    interfaceFutureC0061a.cancel(true);
                    return;
                }
                return;
            case 4:
                C0354d c0354d = (C0354d) this.c;
                X1.g.e(c0354d, "this$0");
                n0.m mVar = (n0.m) this.f354d;
                X1.g.e(mVar, "$token");
                c0354d.f4288b.p(mVar, 3);
                return;
            case 5:
                List list = (List) this.c;
                X1.g.e(list, "$listenersList");
                t0.e eVar = (t0.e) this.f354d;
                X1.g.e(eVar, "this$0");
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((s0.c) it2.next()).a(eVar.f4894e);
                }
                return;
            case 6:
                w0.r rVar = (w0.r) this.c;
                C0432k c0432k = (C0432k) this.f354d;
                if (rVar.f5165b.f5210a instanceof C0422a) {
                    c0432k.cancel(true);
                    return;
                } else {
                    c0432k.l(rVar.f5167e.a());
                    return;
                }
            case 7:
                ((AbstractC0452b) this.c).h((Typeface) this.f354d);
                return;
            default:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.c;
                InterfaceFutureC0061a interfaceFutureC0061a2 = (InterfaceFutureC0061a) this.f354d;
                X1.g.e(constraintTrackingWorker, "this$0");
                X1.g.e(interfaceFutureC0061a2, "$innerFuture");
                synchronized (constraintTrackingWorker.g) {
                    try {
                        if (constraintTrackingWorker.h) {
                            C0432k c0432k2 = constraintTrackingWorker.f2213i;
                            X1.g.d(c0432k2, "future");
                            int i5 = AbstractC0466a.f5312a;
                            c0432k2.j(new Object());
                        } else {
                            constraintTrackingWorker.f2213i.l(interfaceFutureC0061a2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
