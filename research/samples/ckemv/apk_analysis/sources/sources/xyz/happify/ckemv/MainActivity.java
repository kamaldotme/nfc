package xyz.happify.ckemv;

import B2.a;
import B2.b;
import B2.f;
import B2.q;
import B2.t;
import B2.w;
import G.e;
import I1.v;
import I1.x;
import K1.h;
import L1.k;
import O1.d;
import X1.g;
import a.AbstractC0059a;
import android.R;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.c;
import e2.AbstractC0139v;
import e2.B;
import f.AbstractActivityC0159g;
import f.C0152I;
import h2.o;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m0.y;
import m0.z;
import m2.n;
import m2.r;
import m2.s;
import q2.i;
import u2.l;
import xyz.happify.ckemv.MainActivity;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0159g {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f5246F = 0;

    /* renamed from: A, reason: collision with root package name */
    public a f5247A;

    /* renamed from: B, reason: collision with root package name */
    public LinearLayout f5248B;

    /* renamed from: C, reason: collision with root package name */
    public ProgressBar f5249C;
    public final o D = new o(0);

    /* renamed from: E, reason: collision with root package name */
    public final c f5250E = this.f1456l.c("activity_rq#" + this.f1455k.getAndIncrement(), this, new v(0), new b(this));

    /* renamed from: x, reason: collision with root package name */
    public NfcAdapter f5251x;

    /* renamed from: y, reason: collision with root package name */
    public PendingIntent f5252y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5253z;

    public static final String v(MainActivity mainActivity, byte[] bArr) {
        mainActivity.getClass();
        StringBuilder sb = new StringBuilder();
        for (byte b3 : bArr) {
            sb.append(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b3)}, 1)));
        }
        String sb2 = sb.toString();
        g.d(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(12:5|6|7|(1:(7:(1:(1:(6:13|14|15|16|17|18)(2:21|22))(1:23))(1:31)|24|25|15|16|17|18)(1:32))(4:65|(2:67|(1:70)(1:69))|17|18)|33|34|35|(2:56|(1:58))(7:41|(1:45)|46|(2:49|47)|50|51|(2:53|54))|55|16|17|18))|72|6|7|(0)(0)|33|34|35|(1:37)|56|(0)|55|16|17|18|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:(1:(6:13|14|15|16|17|18)(2:21|22))(1:23))(1:31)|24|25|15|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0167, code lost:
    
        r0.printStackTrace();
        r0 = e2.B.f2767a;
        r0 = j2.o.f3534a;
        r1 = new Q1.g(2, null);
        r4.f80e = r2;
        r4.f81f = null;
        r4.g = null;
        r4.f83j = 4;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017f, code lost:
    
        if (e2.AbstractC0139v.p(r0, r1, r4) == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ec, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0182, code lost:
    
        r2.f5253z = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0184, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r1v13, types: [W1.p, Q1.g] */
    /* JADX WARN: Type inference failed for: r1v21, types: [W1.p, Q1.g] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [xyz.happify.ckemv.MainActivity] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [xyz.happify.ckemv.MainActivity] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [W1.p, Q1.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w(MainActivity mainActivity, String str, String str2, d dVar) {
        f fVar;
        P1.a aVar;
        int i3;
        String str3;
        String str4;
        MainActivity mainActivity2;
        MainActivity mainActivity3;
        int i4;
        f2.d dVar2;
        ?? gVar;
        s sVar;
        mainActivity.getClass();
        ?? r22 = "update_v";
        try {
            if (dVar instanceof f) {
                fVar = (f) dVar;
                int i5 = fVar.f83j;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    fVar.f83j = i5 - Integer.MIN_VALUE;
                    Object obj = fVar.h;
                    aVar = P1.a.f784b;
                    i3 = fVar.f83j;
                    h hVar = h.f605a;
                    if (i3 != 0) {
                        z.m0(obj);
                        if (!mainActivity.f5253z) {
                            mainActivity.f5253z = true;
                            l2.d dVar3 = B.f2767a;
                            f2.d dVar4 = j2.o.f3534a;
                            ?? gVar2 = new Q1.g(2, null);
                            fVar.f80e = mainActivity;
                            str3 = str;
                            fVar.f81f = str3;
                            str4 = str2;
                            fVar.g = str4;
                            fVar.f83j = 1;
                            if (AbstractC0139v.p(dVar4, gVar2, fVar) == aVar) {
                                return aVar;
                            }
                            mainActivity2 = mainActivity;
                        }
                        return hVar;
                    }
                    if (i3 != 1) {
                        if (i3 == 2) {
                            mainActivity3 = fVar.f80e;
                        } else {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                MainActivity mainActivity4 = fVar.f80e;
                                z.m0(obj);
                                r22 = mainActivity4;
                                r22.f5253z = false;
                                return hVar;
                            }
                            mainActivity3 = fVar.f80e;
                        }
                        z.m0(obj);
                        r22 = mainActivity3;
                        r22.f5253z = false;
                        return hVar;
                    }
                    String str5 = fVar.g;
                    String str6 = fVar.f81f;
                    mainActivity2 = fVar.f80e;
                    z.m0(obj);
                    str4 = str5;
                    str3 = str6;
                    Pattern pattern = n.c;
                    X0.o l3 = AbstractC0059a.l("{\"api_key\": \"" + str3 + "\"}", l.j("application/json"));
                    e eVar = new e();
                    eVar.p();
                    eVar.j("POST", l3);
                    r c = new i(new m2.o(), eVar.a(), false).c();
                    i4 = c.f4112e;
                    if (200 <= i4 || i4 >= 300 || (sVar = c.h) == null) {
                        l2.d dVar5 = B.f2767a;
                        dVar2 = j2.o.f3534a;
                        gVar = new Q1.g(2, null);
                        fVar.f80e = mainActivity2;
                        fVar.f81f = null;
                        fVar.g = null;
                        fVar.f83j = 3;
                        if (AbstractC0139v.p(dVar2, gVar, fVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        File externalFilesDir = mainActivity2.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                        if (externalFilesDir != null && !externalFilesDir.exists()) {
                            externalFilesDir.mkdirs();
                        }
                        File file = new File(externalFilesDir, "update_v" + str4 + ".apk");
                        z2.o oVar = new z2.o(z.k0(file));
                        z2.h b3 = sVar.b();
                        g.e(b3, "source");
                        while (b3.z(oVar.c, 8192L) != -1) {
                            oVar.a();
                        }
                        oVar.close();
                        l2.d dVar6 = B.f2767a;
                        f2.d dVar7 = j2.o.f3534a;
                        B2.h hVar2 = new B2.h(mainActivity2, file, null);
                        fVar.f80e = mainActivity2;
                        fVar.f81f = null;
                        fVar.g = null;
                        fVar.f83j = 2;
                        if (AbstractC0139v.p(dVar7, hVar2, fVar) == aVar) {
                            return aVar;
                        }
                    }
                    r22 = mainActivity2;
                    r22.f5253z = false;
                    return hVar;
                }
            }
            if (i3 != 0) {
            }
            Pattern pattern2 = n.c;
            X0.o l32 = AbstractC0059a.l("{\"api_key\": \"" + str3 + "\"}", l.j("application/json"));
            e eVar2 = new e();
            eVar2.p();
            eVar2.j("POST", l32);
            r c3 = new i(new m2.o(), eVar2.a(), false).c();
            i4 = c3.f4112e;
            if (200 <= i4) {
            }
            l2.d dVar52 = B.f2767a;
            dVar2 = j2.o.f3534a;
            gVar = new Q1.g(2, null);
            fVar.f80e = mainActivity2;
            fVar.f81f = null;
            fVar.g = null;
            fVar.f83j = 3;
            if (AbstractC0139v.p(dVar2, gVar, fVar) == aVar) {
            }
            r22 = mainActivity2;
            r22.f5253z = false;
            return hVar;
        } catch (Throwable th) {
            th = th;
        }
        fVar = new f(mainActivity, dVar);
        Object obj2 = fVar.h;
        aVar = P1.a.f784b;
        i3 = fVar.f83j;
        h hVar3 = h.f605a;
    }

    public static final byte[] x(MainActivity mainActivity, String str) {
        mainActivity.getClass();
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i3 = 0; i3 < length; i3 += 2) {
            bArr[i3 / 2] = (byte) (Character.digit(str.charAt(i3 + 1), 16) + (Character.digit(str.charAt(i3), 16) << 4));
        }
        return bArr;
    }

    @Override // f.AbstractActivityC0159g, androidx.activity.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        C0152I l3 = l();
        final int i3 = 1;
        final int i4 = 0;
        if (l3 != null && !l3.f2864p) {
            l3.f2864p = true;
            l3.M(false);
        }
        this.f5247A = new a(this);
        Intent intent = new Intent();
        String packageName = getPackageName();
        Object systemService = getSystemService("power");
        g.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        if (!((PowerManager) systemService).isIgnoringBatteryOptimizations(packageName)) {
            intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + packageName));
            startActivity(intent);
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(Color.parseColor("#121212"));
        m0.d dVar = new m0.d(2, false, false, false, false, -1L, -1L, k.Z(new LinkedHashSet()));
        TimeUnit timeUnit = TimeUnit.MINUTES;
        g.e(timeUnit, "repeatIntervalTimeUnit");
        m0.s sVar = new m0.s(1, SyncWorker.class);
        v0.o oVar = (v0.o) sVar.f1423b;
        long millis = timeUnit.toMillis(15L);
        oVar.getClass();
        if (millis < 900000) {
            m0.r.a().getClass();
        }
        long j3 = millis < 900000 ? 900000L : millis;
        if (millis < 900000) {
            millis = 900000;
        }
        if (j3 < 900000) {
            m0.r.a().getClass();
        }
        oVar.h = j3 >= 900000 ? j3 : 900000L;
        if (millis < 300000) {
            m0.r.a().getClass();
        }
        if (millis > oVar.h) {
            m0.r.a().getClass();
        }
        long j4 = oVar.h;
        if (300000 > j4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum 300000.");
        }
        if (millis < 300000) {
            millis = 300000;
        } else if (millis > j4) {
            millis = j4;
        }
        oVar.f5096i = millis;
        ((v0.o) sVar.f1423b).f5097j = dVar;
        new n0.n(n0.s.p0(this), "CkemvSyncWork", 2, Collections.singletonList((y) sVar.b())).Q();
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setPadding(32, 32, 32, 0);
        TextView textView = new TextView(this);
        textView.setText("");
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.parseColor("#00E676"));
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        textView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: B2.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f78b;

            {
                this.f78b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final MainActivity mainActivity = this.f78b;
                switch (i4) {
                    case 0:
                        int i5 = MainActivity.f5246F;
                        X1.g.e(mainActivity, "this$0");
                        final EditText editText = new EditText(mainActivity);
                        editText.setHint("Paste API Key here...");
                        editText.setTextColor(-1);
                        editText.setHintTextColor(-7829368);
                        editText.setBackgroundColor(Color.parseColor("#1E1E1E"));
                        editText.setPadding(32, 32, 32, 32);
                        a aVar = mainActivity.f5247A;
                        if (aVar == null) {
                            X1.g.h("dbHelper");
                            throw null;
                        }
                        String i6 = aVar.i();
                        if (i6 == null) {
                            i6 = "";
                        }
                        editText.setText(i6);
                        new AlertDialog.Builder(mainActivity, R.style.Theme.DeviceDefault.Dialog.Alert).setTitle("Manual Key Update").setView(editText).setPositiveButton("UPDATE", new DialogInterface.OnClickListener() { // from class: B2.e
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                int i8 = MainActivity.f5246F;
                                EditText editText2 = editText;
                                X1.g.e(editText2, "$input");
                                MainActivity mainActivity2 = mainActivity;
                                X1.g.e(mainActivity2, "this$0");
                                String obj = d2.d.n0(editText2.getText().toString()).toString();
                                if (obj.length() > 0) {
                                    a aVar2 = mainActivity2.f5247A;
                                    if (aVar2 == null) {
                                        X1.g.h("dbHelper");
                                        throw null;
                                    }
                                    SQLiteDatabase writableDatabase = aVar2.getWritableDatabase();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("api_key", obj);
                                    writableDatabase.update("stats", contentValues, "id = 1", null);
                                }
                            }
                        }).setNegativeButton("CANCEL", (DialogInterface.OnClickListener) null).show();
                        return true;
                    default:
                        int i7 = MainActivity.f5246F;
                        X1.g.e(mainActivity, "this$0");
                        x xVar = new x();
                        xVar.f386b = Arrays.asList("QR_CODE");
                        HashMap hashMap = xVar.f385a;
                        hashMap.put("PROMPT_MESSAGE", "Scan Collector API Key");
                        hashMap.put("SCAN_CAMERA_ID", 0);
                        hashMap.put("BEEP_ENABLED", Boolean.TRUE);
                        Boolean bool = Boolean.FALSE;
                        hashMap.put("BARCODE_IMAGE_ENABLED", bool);
                        hashMap.put("SCAN_ORIENTATION_LOCKED", bool);
                        mainActivity.f5250E.Q(xVar);
                        return true;
                }
            }
        });
        linearLayout2.addView(textView);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setPadding(32, 32, 32, 32);
        linearLayout3.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: B2.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f78b;

            {
                this.f78b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final MainActivity mainActivity = this.f78b;
                switch (i3) {
                    case 0:
                        int i5 = MainActivity.f5246F;
                        X1.g.e(mainActivity, "this$0");
                        final EditText editText = new EditText(mainActivity);
                        editText.setHint("Paste API Key here...");
                        editText.setTextColor(-1);
                        editText.setHintTextColor(-7829368);
                        editText.setBackgroundColor(Color.parseColor("#1E1E1E"));
                        editText.setPadding(32, 32, 32, 32);
                        a aVar = mainActivity.f5247A;
                        if (aVar == null) {
                            X1.g.h("dbHelper");
                            throw null;
                        }
                        String i6 = aVar.i();
                        if (i6 == null) {
                            i6 = "";
                        }
                        editText.setText(i6);
                        new AlertDialog.Builder(mainActivity, R.style.Theme.DeviceDefault.Dialog.Alert).setTitle("Manual Key Update").setView(editText).setPositiveButton("UPDATE", new DialogInterface.OnClickListener() { // from class: B2.e
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                int i8 = MainActivity.f5246F;
                                EditText editText2 = editText;
                                X1.g.e(editText2, "$input");
                                MainActivity mainActivity2 = mainActivity;
                                X1.g.e(mainActivity2, "this$0");
                                String obj = d2.d.n0(editText2.getText().toString()).toString();
                                if (obj.length() > 0) {
                                    a aVar2 = mainActivity2.f5247A;
                                    if (aVar2 == null) {
                                        X1.g.h("dbHelper");
                                        throw null;
                                    }
                                    SQLiteDatabase writableDatabase = aVar2.getWritableDatabase();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("api_key", obj);
                                    writableDatabase.update("stats", contentValues, "id = 1", null);
                                }
                            }
                        }).setNegativeButton("CANCEL", (DialogInterface.OnClickListener) null).show();
                        return true;
                    default:
                        int i7 = MainActivity.f5246F;
                        X1.g.e(mainActivity, "this$0");
                        x xVar = new x();
                        xVar.f386b = Arrays.asList("QR_CODE");
                        HashMap hashMap = xVar.f385a;
                        hashMap.put("PROMPT_MESSAGE", "Scan Collector API Key");
                        hashMap.put("SCAN_CAMERA_ID", 0);
                        hashMap.put("BEEP_ENABLED", Boolean.TRUE);
                        Boolean bool = Boolean.FALSE;
                        hashMap.put("BARCODE_IMAGE_ENABLED", bool);
                        hashMap.put("SCAN_ORIENTATION_LOCKED", bool);
                        mainActivity.f5250E.Q(xVar);
                        return true;
                }
            }
        });
        this.f5248B = linearLayout3;
        TextView textView2 = new TextView(this);
        textView2.setText("Active");
        textView2.setTextSize(10.0f);
        textView2.setTextColor(Color.parseColor("#444444"));
        LinearLayout linearLayout4 = this.f5248B;
        if (linearLayout4 == null) {
            g.h("rightActionArea");
            throw null;
        }
        linearLayout4.addView(textView2);
        TextView textView3 = new TextView(this);
        textView3.setText(" •");
        textView3.setTextSize(10.0f);
        textView3.setTypeface(null, 1);
        textView3.setTextColor(Color.parseColor("#444444"));
        LinearLayout linearLayout5 = this.f5248B;
        if (linearLayout5 == null) {
            g.h("rightActionArea");
            throw null;
        }
        linearLayout5.addView(textView3);
        LinearLayout linearLayout6 = this.f5248B;
        if (linearLayout6 == null) {
            g.h("rightActionArea");
            throw null;
        }
        linearLayout2.addView(linearLayout6);
        linearLayout.addView(linearLayout2);
        ProgressBar progressBar = new ProgressBar(this, null, R.attr.progressBarStyleHorizontal);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 8);
        layoutParams.setMargins(0, 0, 0, 0);
        progressBar.setLayoutParams(layoutParams);
        progressBar.setMax(100);
        progressBar.setProgress(0);
        progressBar.setVisibility(4);
        progressBar.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#00E676")));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(0));
        this.f5249C = progressBar;
        linearLayout.addView(progressBar);
        View wVar = new w(this);
        wVar.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout.addView(wVar);
        setContentView(linearLayout);
        l2.d dVar2 = B.f2767a;
        AbstractC0139v.k(AbstractC0139v.a(j2.o.f3534a), 0, new B2.l(this, null), 3);
        this.f5251x = NfcAdapter.getDefaultAdapter(this);
        Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
        intent2.addFlags(536870912);
        this.f5252y = PendingIntent.getActivity(this, 0, intent2, 167772160);
        l2.c cVar = B.f2768b;
        AbstractC0139v.k(AbstractC0139v.a(cVar), 0, new B2.s(this, null), 3);
        AbstractC0139v.k(AbstractC0139v.a(cVar), 0, new t(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // f.AbstractActivityC0159g, androidx.activity.k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!g.a("android.nfc.action.TECH_DISCOVERED", intent != null ? intent.getAction() : null)) {
            if (!g.a("android.nfc.action.TAG_DISCOVERED", intent != null ? intent.getAction() : null)) {
                if (!g.a("android.nfc.action.NDEF_DISCOVERED", intent != null ? intent.getAction() : null)) {
                    return;
                }
            }
        }
        Tag tag = intent != null ? (Tag) intent.getParcelableExtra("android.nfc.extra.TAG") : null;
        if (tag == null) {
            runOnUiThread(new Object());
            return;
        }
        IsoDep isoDep = IsoDep.get(tag);
        if (isoDep != null) {
            AbstractC0139v.k(AbstractC0139v.a(B.f2768b), 0, new q(this, isoDep, null), 3);
        } else {
            runOnUiThread(new Object());
        }
    }

    @Override // f.AbstractActivityC0159g, android.app.Activity
    public final void onPause() {
        super.onPause();
        NfcAdapter nfcAdapter = this.f5251x;
        if (nfcAdapter != null) {
            nfcAdapter.disableForegroundDispatch(this);
        }
    }

    @Override // f.AbstractActivityC0159g, android.app.Activity
    public final void onResume() {
        super.onResume();
        String[][] strArr = {new String[]{IsoDep.class.getName()}};
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.TECH_DISCOVERED");
        IntentFilter intentFilter2 = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        try {
            intentFilter2.addDataType("*/*");
        } catch (IntentFilter.MalformedMimeTypeException e3) {
            e3.printStackTrace();
        }
        IntentFilter[] intentFilterArr = {intentFilter, intentFilter2, new IntentFilter("android.nfc.action.TAG_DISCOVERED")};
        NfcAdapter nfcAdapter = this.f5251x;
        if (nfcAdapter != null) {
            nfcAdapter.enableForegroundDispatch(this, this.f5252y, intentFilterArr, strArr);
        }
    }
}
