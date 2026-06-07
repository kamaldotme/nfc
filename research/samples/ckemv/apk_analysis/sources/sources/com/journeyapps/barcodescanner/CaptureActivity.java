package com.journeyapps.barcodescanner;

import I1.h;
import I1.l;
import J1.g;
import J1.j;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import j1.EnumC0231a;
import j1.EnumC0233c;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import n1.d;
import n1.e;
import v0.C0403c;
import x.AbstractC0414d;
import xyz.happify.ckemv.R;
import y.f;

/* loaded from: classes.dex */
public class CaptureActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public l f2595b;
    public DecoratedBarcodeView c;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0166  */
    /* JADX WARN: Type inference failed for: r8v2, types: [j1.g, java.lang.Object] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Set set;
        Bundle extras;
        j jVar;
        String stringExtra;
        int intExtra;
        int i3;
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.c = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        DecoratedBarcodeView decoratedBarcodeView = this.c;
        l lVar = new l(this, decoratedBarcodeView);
        this.f2595b = lVar;
        Intent intent = getIntent();
        getWindow().addFlags(128);
        if (bundle != null) {
            lVar.c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                if (lVar.c == -1) {
                    int rotation = getWindowManager().getDefaultDisplay().getRotation();
                    int i4 = getResources().getConfiguration().orientation;
                    if (i4 == 2) {
                        if (rotation != 0 && rotation != 1) {
                            i3 = 8;
                            lVar.c = i3;
                        }
                        i3 = 0;
                        lVar.c = i3;
                    } else {
                        if (i4 == 1) {
                            i3 = (rotation == 0 || rotation == 3) ? 1 : 9;
                            lVar.c = i3;
                        }
                        i3 = 0;
                        lVar.c = i3;
                    }
                }
                setRequestedOrientation(lVar.c);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                Pattern pattern = d.f4237a;
                String stringExtra2 = intent.getStringExtra("SCAN_FORMATS");
                EnumMap enumMap = null;
                List asList = stringExtra2 != null ? Arrays.asList(d.f4237a.split(stringExtra2)) : null;
                String stringExtra3 = intent.getStringExtra("SCAN_MODE");
                if (asList != null) {
                    set = EnumSet.noneOf(EnumC0231a.class);
                    try {
                        Iterator it = asList.iterator();
                        while (it.hasNext()) {
                            set.add(EnumC0231a.valueOf((String) it.next()));
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    int i5 = e.f4239a;
                    extras = intent.getExtras();
                    if (extras != null && !extras.isEmpty()) {
                        enumMap = new EnumMap(EnumC0233c.class);
                        for (EnumC0233c enumC0233c : EnumC0233c.values()) {
                            if (enumC0233c != EnumC0233c.f3477f && enumC0233c != EnumC0233c.f3480k && enumC0233c != EnumC0233c.f3475d) {
                                String name = enumC0233c.name();
                                if (extras.containsKey(name)) {
                                    Class cls = enumC0233c.f3483b;
                                    if (cls.equals(Void.class)) {
                                        enumMap.put((EnumMap) enumC0233c, (EnumC0233c) Boolean.TRUE);
                                    } else {
                                        Object obj = extras.get(name);
                                        if (cls.isInstance(obj)) {
                                            enumMap.put((EnumMap) enumC0233c, (EnumC0233c) obj);
                                        } else {
                                            enumC0233c.toString();
                                            Objects.toString(obj);
                                        }
                                    }
                                }
                            }
                        }
                        enumMap.toString();
                    }
                    jVar = new j();
                    if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                        jVar.f576a = intExtra;
                    }
                    if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
                        decoratedBarcodeView.f2596b.setTorch(true);
                    }
                    stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                    if (stringExtra != null) {
                        decoratedBarcodeView.setStatusText(stringExtra);
                    }
                    int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
                    String stringExtra4 = intent.getStringExtra("CHARACTER_SET");
                    new Object().e(enumMap);
                    decoratedBarcodeView.f2596b.setCameraSettings(jVar);
                    BarcodeView barcodeView = decoratedBarcodeView.f2596b;
                    C1.e eVar = new C1.e(1);
                    eVar.c = set;
                    eVar.f130d = enumMap;
                    eVar.f131e = stringExtra4;
                    eVar.f129b = intExtra2;
                    barcodeView.setDecoderFactory(eVar);
                }
                set = stringExtra3 != null ? (Set) d.f4238b.get(stringExtra3) : null;
                int i52 = e.f4239a;
                extras = intent.getExtras();
                if (extras != null) {
                    enumMap = new EnumMap(EnumC0233c.class);
                    while (r13 < r12) {
                    }
                    enumMap.toString();
                }
                jVar = new j();
                if (intent.hasExtra("SCAN_CAMERA_ID")) {
                    jVar.f576a = intExtra;
                }
                if (intent.hasExtra("TORCH_ENABLED")) {
                    decoratedBarcodeView.f2596b.setTorch(true);
                }
                stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                if (stringExtra != null) {
                }
                int intExtra22 = intent.getIntExtra("SCAN_TYPE", 0);
                String stringExtra42 = intent.getStringExtra("CHARACTER_SET");
                new Object().e(enumMap);
                decoratedBarcodeView.f2596b.setCameraSettings(jVar);
                BarcodeView barcodeView2 = decoratedBarcodeView.f2596b;
                C1.e eVar2 = new C1.e(1);
                eVar2.c = set;
                eVar2.f130d = enumMap;
                eVar2.f131e = stringExtra42;
                eVar2.f129b = intExtra22;
                barcodeView2.setDecoderFactory(eVar2);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                lVar.f361i.f48a = false;
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                boolean booleanExtra = intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true);
                String stringExtra5 = intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE");
                lVar.f359e = booleanExtra;
                if (stringExtra5 == null) {
                    stringExtra5 = "";
                }
                lVar.f360f = stringExtra5;
            }
            if (intent.hasExtra("TIMEOUT")) {
                lVar.f362j.postDelayed(new h(lVar, 1), intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                lVar.f358d = true;
            }
        }
        l lVar2 = this.f2595b;
        A.h hVar = lVar2.f364l;
        DecoratedBarcodeView decoratedBarcodeView2 = lVar2.f357b;
        BarcodeView barcodeView3 = decoratedBarcodeView2.f2596b;
        C0403c c0403c = new C0403c(decoratedBarcodeView2, 2, hVar);
        barcodeView3.f2591B = 2;
        barcodeView3.f2592C = c0403c;
        barcodeView3.h();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f2595b;
        lVar.g = true;
        lVar.h.a();
        lVar.f362j.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        return this.c.onKeyDown(i3, keyEvent) || super.onKeyDown(i3, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        l lVar = this.f2595b;
        lVar.h.a();
        BarcodeView barcodeView = lVar.f357b.f2596b;
        g cameraInstance = barcodeView.getCameraInstance();
        barcodeView.c();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.g && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        l lVar = this.f2595b;
        lVar.getClass();
        if (i3 == 250) {
            if (iArr.length > 0 && iArr[0] == 0) {
                lVar.f357b.f2596b.d();
                return;
            }
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            lVar.f356a.setResult(0, intent);
            if (lVar.f359e) {
                lVar.b(lVar.f360f);
            } else {
                lVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        l lVar = this.f2595b;
        Activity activity = lVar.f356a;
        if (f.a(activity, "android.permission.CAMERA") == 0) {
            lVar.f357b.f2596b.d();
        } else if (!lVar.f365m) {
            AbstractC0414d.d(activity, new String[]{"android.permission.CAMERA"}, 250);
            lVar.f365m = true;
        }
        n1.f fVar = lVar.h;
        if (!fVar.c) {
            fVar.f4240a.registerReceiver(fVar.f4241b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            fVar.c = true;
        }
        fVar.f4242d.removeCallbacksAndMessages(null);
        if (fVar.f4244f) {
            fVar.f4242d.postDelayed(fVar.f4243e, 300000L);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f2595b.c);
    }
}
