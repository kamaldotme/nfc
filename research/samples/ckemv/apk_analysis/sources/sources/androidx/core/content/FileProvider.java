package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import xyz.happify.ckemv.MainActivity;
import y.b;
import y.g;
import y.h;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1724d = {"_display_name", "_size"};

    /* renamed from: e, reason: collision with root package name */
    public static final File f1725e = new File("/");

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f1726f = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public h f1727b;
    public String c;

    public static h b(Context context, String str) {
        h hVar;
        HashMap hashMap = f1726f;
        synchronized (hashMap) {
            try {
                hVar = (h) hashMap.get(str);
                if (hVar == null) {
                    try {
                        try {
                            hVar = d(context, str);
                            hashMap.put(str, hVar);
                        } catch (IOException e3) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                        }
                    } catch (XmlPullParserException e4) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static Uri c(MainActivity mainActivity, String str, File file) {
        h b3 = b(mainActivity, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : b3.f5256b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(b3.f5255a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static h d(Context context, String str) {
        h hVar = new h(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return hVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f1725e;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] b3 = b.b(context, null);
                    if (b3.length > 0) {
                        file = b3[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] a3 = b.a(context);
                    if (a3.length > 0) {
                        file = a3[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a4 = g.a(context);
                    if (a4.length > 0) {
                        file = a4[0];
                    }
                }
                if (file == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        file = new File(file, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        hVar.f5256b.put(attributeValue, file.getCanonicalFile());
                    } catch (IOException e3) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e3);
                    }
                }
            }
        }
    }

    public final h a() {
        h hVar;
        synchronized (this) {
            try {
                if (this.f1727b == null) {
                    this.f1727b = b(getContext(), this.c);
                }
                hVar = this.f1727b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.c = providerInfo.authority.split(";")[0];
        HashMap hashMap = f1726f;
        synchronized (hashMap) {
            hashMap.remove(this.c);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return a().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File a3 = a().a(uri);
        int lastIndexOf = a3.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a3.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i3;
        File a3 = a().a(uri);
        if ("r".equals(str)) {
            i3 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i3 = 738197504;
        } else if ("wa".equals(str)) {
            i3 = 704643072;
        } else if ("rw".equals(str)) {
            i3 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException("Invalid mode: " + str);
            }
            i3 = 1006632960;
        }
        return ParcelFileDescriptor.open(a3, i3);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i3;
        File a3 = a().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f1724d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i4 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i4] = "_display_name";
                i3 = i4 + 1;
                objArr[i4] = queryParameter == null ? a3.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i4] = "_size";
                i3 = i4 + 1;
                objArr[i4] = Long.valueOf(a3.length());
            }
            i4 = i3;
        }
        String[] strArr4 = new String[i4];
        System.arraycopy(strArr3, 0, strArr4, 0, i4);
        Object[] objArr2 = new Object[i4];
        System.arraycopy(objArr, 0, objArr2, 0, i4);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
