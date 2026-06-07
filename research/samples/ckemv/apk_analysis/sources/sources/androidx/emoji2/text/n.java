package androidx.emoji2.text;

import J.AbstractC0026z;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1780d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f1781a;

    /* renamed from: b, reason: collision with root package name */
    public final v0.i f1782b;
    public volatile int c = 0;

    public n(v0.i iVar, int i3) {
        this.f1782b = iVar;
        this.f1781a = i3;
    }

    public final int a(int i3) {
        R.a c = c();
        int a3 = c.a(16);
        if (a3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c.f473d;
        int i4 = a3 + c.f471a;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final int b() {
        R.a c = c();
        int a3 = c.a(16);
        if (a3 == 0) {
            return 0;
        }
        int i3 = a3 + c.f471a;
        return ((ByteBuffer) c.f473d).getInt(((ByteBuffer) c.f473d).getInt(i3) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [J.z, java.lang.Object] */
    public final R.a c() {
        ThreadLocal threadLocal = f1780d;
        R.a aVar = (R.a) threadLocal.get();
        R.a aVar2 = aVar;
        if (aVar == null) {
            ?? abstractC0026z = new AbstractC0026z();
            threadLocal.set(abstractC0026z);
            aVar2 = abstractC0026z;
        }
        R.b bVar = (R.b) this.f1782b.f5076b;
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i3 = a3 + bVar.f471a;
            int i4 = (this.f1781a * 4) + ((ByteBuffer) bVar.f473d).getInt(i3) + i3 + 4;
            int i5 = ((ByteBuffer) bVar.f473d).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f473d;
            aVar2.f473d = byteBuffer;
            if (byteBuffer != null) {
                aVar2.f471a = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                aVar2.f472b = i6;
                aVar2.c = ((ByteBuffer) aVar2.f473d).getShort(i6);
            } else {
                aVar2.f471a = 0;
                aVar2.f472b = 0;
                aVar2.c = 0;
            }
        }
        return aVar2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        R.a c = c();
        int a3 = c.a(4);
        sb.append(Integer.toHexString(a3 != 0 ? ((ByteBuffer) c.f473d).getInt(a3 + c.f471a) : 0));
        sb.append(", codepoints:");
        int b3 = b();
        for (int i3 = 0; i3 < b3; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
