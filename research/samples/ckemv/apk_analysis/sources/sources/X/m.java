package X;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f1011a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1012b;
    public final long c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1013d;

    public m(int i3, int i4, long j3, long j4) {
        this.f1011a = i3;
        this.f1012b = i4;
        this.c = j3;
        this.f1013d = j4;
    }

    public static m a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            m mVar = new m(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return mVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1011a);
            dataOutputStream.writeInt(this.f1012b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.f1013d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1012b == mVar.f1012b && this.c == mVar.c && this.f1011a == mVar.f1011a && this.f1013d == mVar.f1013d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1012b), Long.valueOf(this.c), Integer.valueOf(this.f1011a), Long.valueOf(this.f1013d));
    }
}
