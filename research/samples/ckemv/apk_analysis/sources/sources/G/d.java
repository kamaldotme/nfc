package G;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import z.AbstractC0452b;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f180a = new Object();

    public static F0.e a(Context context, e eVar) {
        Cursor cursor;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) eVar.f182b;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        String str2 = resolveContentProvider.packageName;
        String str3 = (String) eVar.c;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        b bVar = f180a;
        Collections.sort(arrayList, bVar);
        List list = (List) eVar.f185f;
        if (list == null) {
            list = AbstractC0452b.j(resources, 0);
        }
        int i3 = 0;
        loop1: while (true) {
            cursor = null;
            if (i3 >= list.size()) {
                resolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) list.get(i3));
            Collections.sort(arrayList2, bVar);
            if (arrayList.size() == arrayList2.size()) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                        break;
                    }
                }
                break loop1;
            }
            i3++;
        }
        if (resolveContentProvider == null) {
            return new F0.e(1, (Object[]) null);
        }
        String str4 = resolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str4).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        try {
            cursor = c.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) eVar.f183d}, null, null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    arrayList3.add(new j(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return new F0.e(0, (j[]) arrayList3.toArray(new j[0]));
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
