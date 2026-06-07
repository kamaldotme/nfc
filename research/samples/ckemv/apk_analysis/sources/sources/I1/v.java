package I1;

import a.AbstractC0059a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends AbstractC0059a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f379b;

    public /* synthetic */ v(int i3) {
        this.f379b = i3;
    }

    @Override // a.AbstractC0059a
    public final Object G(Intent intent, int i3) {
        switch (this.f379b) {
            case 0:
                if (i3 != -1) {
                    return new w(null, null, null, null, null, null, intent);
                }
                String stringExtra = intent.getStringExtra("SCAN_RESULT");
                String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
                byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
                int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", Integer.MIN_VALUE);
                return new w(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra("SCAN_RESULT_IMAGE_PATH"), intent);
            case 1:
                return new androidx.activity.result.a(intent, i3);
            case 2:
                L1.u uVar = L1.u.f623b;
                if (i3 != -1 || intent == null) {
                    return uVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return uVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i4 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i4 == 0));
                }
                ArrayList V2 = L1.j.V(stringArrayExtra);
                Iterator it = V2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(L1.m.S(V2), L1.m.S(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new K1.c(it.next(), it2.next()));
                }
                return L1.x.P(arrayList2);
            default:
                return new androidx.activity.result.a(intent, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.AbstractC0059a
    public final Intent n(androidx.activity.k kVar, x xVar) {
        Bundle bundleExtra;
        switch (this.f379b) {
            case 0:
                if (xVar.c == null) {
                    xVar.c = CaptureActivity.class;
                }
                Intent intent = new Intent(kVar, (Class<?>) xVar.c);
                intent.setAction("com.google.zxing.client.android.SCAN");
                if (xVar.f386b != null) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : xVar.f386b) {
                        if (sb.length() > 0) {
                            sb.append(',');
                        }
                        sb.append(str);
                    }
                    intent.putExtra("SCAN_FORMATS", sb.toString());
                }
                intent.addFlags(67108864);
                intent.addFlags(524288);
                for (Map.Entry entry : xVar.f385a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        intent.putExtra(str2, (Integer) value);
                    } else if (value instanceof Long) {
                        intent.putExtra(str2, (Long) value);
                    } else if (value instanceof Boolean) {
                        intent.putExtra(str2, (Boolean) value);
                    } else if (value instanceof Double) {
                        intent.putExtra(str2, (Double) value);
                    } else if (value instanceof Float) {
                        intent.putExtra(str2, (Float) value);
                    } else if (value instanceof Bundle) {
                        intent.putExtra(str2, (Bundle) value);
                    } else if (value instanceof int[]) {
                        intent.putExtra(str2, (int[]) value);
                    } else if (value instanceof long[]) {
                        intent.putExtra(str2, (long[]) value);
                    } else if (value instanceof boolean[]) {
                        intent.putExtra(str2, (boolean[]) value);
                    } else if (value instanceof double[]) {
                        intent.putExtra(str2, (double[]) value);
                    } else if (value instanceof float[]) {
                        intent.putExtra(str2, (float[]) value);
                    } else if (value instanceof String[]) {
                        intent.putExtra(str2, (String[]) value);
                    } else {
                        intent.putExtra(str2, value.toString());
                    }
                }
                return intent;
            case 1:
                androidx.activity.result.i iVar = (androidx.activity.result.i) xVar;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = iVar.c;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = iVar.f1492b;
                        X1.g.e(intentSender, "intentSender");
                        iVar = new androidx.activity.result.i(intentSender, null, iVar.f1493d, iVar.f1494e);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    intent2.toString();
                }
                return intent2;
            case 2:
                X1.g.e(kVar, "context");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) xVar);
                X1.g.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                Intent intent4 = (Intent) xVar;
                X1.g.e(kVar, "context");
                return intent4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.AbstractC0059a
    public K.r w(androidx.activity.k kVar, x xVar) {
        switch (this.f379b) {
            case 2:
                String[] strArr = (String[]) xVar;
                X1.g.e(kVar, "context");
                if (strArr.length == 0) {
                    return new K.r(L1.u.f623b);
                }
                for (String str : strArr) {
                    if (y.f.a(kVar, str) != 0) {
                        return null;
                    }
                }
                int O2 = L1.x.O(strArr.length);
                if (O2 < 16) {
                    O2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(O2);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new K.r(linkedHashMap);
            default:
                return super.w(kVar, xVar);
        }
    }
}
