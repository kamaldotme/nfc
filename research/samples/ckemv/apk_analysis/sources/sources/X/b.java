package X;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f990a;

    /* renamed from: b, reason: collision with root package name */
    public final f f991b;
    public final byte[] c;

    /* renamed from: d, reason: collision with root package name */
    public final File f992d;

    /* renamed from: e, reason: collision with root package name */
    public final String f993e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f994f = false;
    public c[] g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        this.f990a = executor;
        this.f991b = fVar;
        this.f993e = str;
        this.f992d = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 <= 33) {
            switch (i3) {
                case 26:
                    bArr = g.g;
                    break;
                case 27:
                    bArr = g.f1006f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f1005e;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = g.f1004d;
                    break;
            }
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f991b.getClass();
            }
            return null;
        }
    }

    public final void b(final int i3, final Serializable serializable) {
        this.f990a.execute(new Runnable() { // from class: X.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f991b.m(i3, serializable);
            }
        });
    }
}
