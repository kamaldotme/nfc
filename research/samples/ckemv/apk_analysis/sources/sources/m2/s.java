package m2;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4120b;
    public final long c;

    /* renamed from: d, reason: collision with root package name */
    public final z2.h f4121d;

    public /* synthetic */ s(long j3, z2.h hVar, int i3) {
        this.f4120b = i3;
        this.c = j3;
        this.f4121d = hVar;
    }

    public final long a() {
        switch (this.f4120b) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final z2.h b() {
        switch (this.f4120b) {
            case 0:
                return this.f4121d;
            default:
                return this.f4121d;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n2.b.c(b());
    }
}
