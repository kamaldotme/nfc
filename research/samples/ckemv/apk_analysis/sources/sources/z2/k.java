package z2;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements v {

    /* renamed from: b, reason: collision with root package name */
    public byte f5342b;
    public final p c;

    /* renamed from: d, reason: collision with root package name */
    public final Inflater f5343d;

    /* renamed from: e, reason: collision with root package name */
    public final l f5344e;

    /* renamed from: f, reason: collision with root package name */
    public final CRC32 f5345f;

    public k(v vVar) {
        X1.g.e(vVar, "source");
        p pVar = new p(vVar);
        this.c = pVar;
        Inflater inflater = new Inflater(true);
        this.f5343d = inflater;
        this.f5344e = new l(pVar, inflater);
        this.f5345f = new CRC32();
    }

    public static void a(int i3, int i4, String str) {
        if (i4 != i3) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i4), Integer.valueOf(i3)}, 3)));
        }
    }

    public final void b(f fVar, long j3, long j4) {
        q qVar = fVar.f5337b;
        X1.g.b(qVar);
        while (true) {
            int i3 = qVar.c;
            int i4 = qVar.f5356b;
            if (j3 < i3 - i4) {
                break;
            }
            j3 -= i3 - i4;
            qVar = qVar.f5359f;
            X1.g.b(qVar);
        }
        while (j4 > 0) {
            int min = (int) Math.min(qVar.c - r6, j4);
            this.f5345f.update(qVar.f5355a, (int) (qVar.f5356b + j3), min);
            j4 -= min;
            qVar = qVar.f5359f;
            X1.g.b(qVar);
            j3 = 0;
        }
    }

    @Override // z2.v
    public final x c() {
        return this.c.f5353b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5344e.close();
    }

    @Override // z2.v
    public final long z(f fVar, long j3) {
        p pVar;
        f fVar2;
        long j4;
        X1.g.e(fVar, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (j3 == 0) {
            return 0L;
        }
        byte b3 = this.f5342b;
        CRC32 crc32 = this.f5345f;
        p pVar2 = this.c;
        if (b3 == 0) {
            pVar2.n(10L);
            f fVar3 = pVar2.c;
            byte b4 = fVar3.b(3L);
            boolean z3 = ((b4 >> 1) & 1) == 1;
            if (z3) {
                b(pVar2.c, 0L, 10L);
            }
            a(8075, pVar2.y(), "ID1ID2");
            pVar2.u(8L);
            if (((b4 >> 2) & 1) == 1) {
                pVar2.n(2L);
                if (z3) {
                    b(pVar2.c, 0L, 2L);
                }
                short y3 = fVar3.y();
                long j5 = ((short) (((y3 & 255) << 8) | ((y3 & 65280) >>> 8))) & 65535;
                pVar2.n(j5);
                if (z3) {
                    b(pVar2.c, 0L, j5);
                    j4 = j5;
                } else {
                    j4 = j5;
                }
                pVar2.u(j4);
            }
            if (((b4 >> 3) & 1) == 1) {
                fVar2 = fVar3;
                long a3 = pVar2.a((byte) 0, 0L, Long.MAX_VALUE);
                if (a3 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    pVar = pVar2;
                    b(pVar2.c, 0L, a3 + 1);
                } else {
                    pVar = pVar2;
                }
                pVar.u(a3 + 1);
            } else {
                fVar2 = fVar3;
                pVar = pVar2;
            }
            if (((b4 >> 4) & 1) == 1) {
                long a4 = pVar.a((byte) 0, 0L, Long.MAX_VALUE);
                if (a4 == -1) {
                    throw new EOFException();
                }
                if (z3) {
                    b(pVar.c, 0L, a4 + 1);
                }
                pVar.u(a4 + 1);
            }
            if (z3) {
                pVar.n(2L);
                short y4 = fVar2.y();
                a((short) (((y4 & 255) << 8) | ((y4 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f5342b = (byte) 1;
        } else {
            pVar = pVar2;
        }
        if (this.f5342b == 1) {
            long j6 = fVar.c;
            long z4 = this.f5344e.z(fVar, j3);
            if (z4 != -1) {
                b(fVar, j6, z4);
                return z4;
            }
            this.f5342b = (byte) 2;
        }
        if (this.f5342b != 2) {
            return -1L;
        }
        a(pVar.b(), (int) crc32.getValue(), "CRC");
        a(pVar.b(), (int) this.f5343d.getBytesWritten(), "ISIZE");
        this.f5342b = (byte) 3;
        if (pVar.v()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
