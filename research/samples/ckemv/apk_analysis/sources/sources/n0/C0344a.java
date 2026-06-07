package n0;

import android.content.Context;
import java.io.File;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0344a f4164a = new Object();

    public final File a(Context context) {
        X1.g.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        X1.g.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
