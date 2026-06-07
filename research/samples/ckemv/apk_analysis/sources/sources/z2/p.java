package z2;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: b, reason: collision with root package name */
    public final v f5353b;
    public final f c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5354d;

    /* JADX WARN: Type inference failed for: r2v1, types: [z2.f, java.lang.Object] */
    public p(v vVar) {
        X1.g.e(vVar, "source");
        this.f5353b = vVar;
        this.c = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        v0.f.n(16);
        v0.f.n(16);
        r1 = java.lang.Integer.toString(r2, 16);
        X1.g.d(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // z2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long C() {
        f fVar;
        n(1L);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            boolean i5 = i(i4);
            fVar = this.c;
            if (!i5) {
                break;
            }
            byte b3 = fVar.b(i3);
            if ((b3 < 48 || b3 > 57) && ((b3 < 97 || b3 > 102) && (b3 < 65 || b3 > 70))) {
                break;
            }
            i3 = i4;
        }
        return fVar.C();
    }

    @Override // z2.h
    public final byte E() {
        n(1L);
        return this.c.E();
    }

    @Override // z2.h
    public final int H() {
        n(4L);
        return this.c.H();
    }

    public final long a(byte b3, long j3, long j4) {
        if (!(!this.f5354d)) {
            throw new IllegalStateException("closed".toString());
        }
        long j5 = 0;
        if (0 > j4) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j4).toString());
        }
        while (j5 < j4) {
            long i3 = this.c.i(b3, j5, j4);
            if (i3 != -1) {
                return i3;
            }
            f fVar = this.c;
            long j6 = fVar.c;
            if (j6 >= j4 || this.f5353b.z(fVar, 8192L) == -1) {
                return -1L;
            }
            j5 = Math.max(j5, j6);
        }
        return -1L;
    }

    public final int b() {
        n(4L);
        int H2 = this.c.H();
        return ((H2 & 255) << 24) | (((-16777216) & H2) >>> 24) | ((16711680 & H2) >>> 8) | ((65280 & H2) << 8);
    }

    @Override // z2.v
    public final x c() {
        return this.f5353b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f5354d) {
            return;
        }
        this.f5354d = true;
        this.f5353b.close();
        f fVar = this.c;
        fVar.u(fVar.c);
    }

    public final boolean i(long j3) {
        f fVar;
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (!(!this.f5354d)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            fVar = this.c;
            if (fVar.c >= j3) {
                return true;
            }
        } while (this.f5353b.z(fVar, 8192L) != -1);
        return false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f5354d;
    }

    @Override // z2.h
    public final String j() {
        return r(Long.MAX_VALUE);
    }

    @Override // z2.h
    public final void n(long j3) {
        if (!i(j3)) {
            throw new EOFException();
        }
    }

    @Override // z2.h
    public final i p(long j3) {
        n(j3);
        return this.c.p(j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [z2.f, java.lang.Object] */
    @Override // z2.h
    public final String r(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j3).toString());
        }
        long j4 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
        long a3 = a((byte) 10, 0L, j4);
        f fVar = this.c;
        if (a3 != -1) {
            return A2.a.a(fVar, a3);
        }
        if (j4 < Long.MAX_VALUE && i(j4) && fVar.b(j4 - 1) == 13 && i(1 + j4) && fVar.b(j4) == 10) {
            return A2.a.a(fVar, j4);
        }
        ?? obj = new Object();
        fVar.a(obj, 0L, Math.min(32, fVar.c));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.c, j3) + " content=" + obj.p(obj.c).d() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        X1.g.e(byteBuffer, "sink");
        f fVar = this.c;
        if (fVar.c == 0 && this.f5353b.z(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // z2.h
    public final f t() {
        return this.c;
    }

    public final String toString() {
        return "buffer(" + this.f5353b + ')';
    }

    @Override // z2.h
    public final void u(long j3) {
        if (!(!this.f5354d)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j3 > 0) {
            f fVar = this.c;
            if (fVar.c == 0 && this.f5353b.z(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j3, fVar.c);
            fVar.u(min);
            j3 -= min;
        }
    }

    @Override // z2.h
    public final boolean v() {
        if (!(!this.f5354d)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.c;
        return fVar.v() && this.f5353b.z(fVar, 8192L) == -1;
    }

    @Override // z2.h
    public final short y() {
        n(2L);
        return this.c.y();
    }

    @Override // z2.v
    public final long z(f fVar, long j3) {
        X1.g.e(fVar, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (!(!this.f5354d)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar2 = this.c;
        if (fVar2.c == 0 && this.f5353b.z(fVar2, 8192L) == -1) {
            return -1L;
        }
        return fVar2.z(fVar, Math.min(j3, fVar2.c));
    }
}
