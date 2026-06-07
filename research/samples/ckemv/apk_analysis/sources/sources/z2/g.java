package z2;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface g extends t, WritableByteChannel {
    g B(int i3);

    g F(i iVar);

    g d(byte[] bArr);

    g e(int i3);

    @Override // z2.t, java.io.Flushable
    void flush();

    g k(long j3);

    g q(String str);

    g w(int i3);
}
