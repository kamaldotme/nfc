package a0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class j implements e0.e, e0.d {

    /* renamed from: j, reason: collision with root package name */
    public static final TreeMap f1415j = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f1416b;
    public volatile String c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f1417d;

    /* renamed from: e, reason: collision with root package name */
    public final double[] f1418e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f1419f;
    public final byte[][] g;
    public final int[] h;

    /* renamed from: i, reason: collision with root package name */
    public int f1420i;

    public j(int i3) {
        this.f1416b = i3;
        int i4 = i3 + 1;
        this.h = new int[i4];
        this.f1417d = new long[i4];
        this.f1418e = new double[i4];
        this.f1419f = new String[i4];
        this.g = new byte[i4];
    }

    public static final j a(String str, int i3) {
        TreeMap treeMap = f1415j;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i3));
            if (ceilingEntry == null) {
                j jVar = new j(i3);
                jVar.c = str;
                jVar.f1420i = i3;
                return jVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            j jVar2 = (j) ceilingEntry.getValue();
            jVar2.c = str;
            jVar2.f1420i = i3;
            return jVar2;
        }
    }

    @Override // e0.e
    public final void b(e0.d dVar) {
        int i3 = this.f1420i;
        if (1 > i3) {
            return;
        }
        int i4 = 1;
        while (true) {
            int i5 = this.h[i4];
            if (i5 == 1) {
                dVar.g(i4);
            } else if (i5 == 2) {
                dVar.x(i4, this.f1417d[i4]);
            } else if (i5 == 3) {
                dVar.l(i4, this.f1418e[i4]);
            } else if (i5 == 4) {
                String str = this.f1419f[i4];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                dVar.h(str, i4);
            } else if (i5 == 5) {
                byte[] bArr = this.g[i4];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                dVar.f(i4, bArr);
            }
            if (i4 == i3) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // e0.d
    public final void f(int i3, byte[] bArr) {
        this.h[i3] = 5;
        this.g[i3] = bArr;
    }

    @Override // e0.d
    public final void g(int i3) {
        this.h[i3] = 1;
    }

    @Override // e0.d
    public final void h(String str, int i3) {
        X1.g.e(str, "value");
        this.h[i3] = 4;
        this.f1419f[i3] = str;
    }

    @Override // e0.e
    public final String i() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // e0.d
    public final void l(int i3, double d3) {
        this.h[i3] = 3;
        this.f1418e[i3] = d3;
    }

    public final void o() {
        TreeMap treeMap = f1415j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f1416b), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                X1.g.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i3 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i3;
                }
            }
        }
    }

    @Override // e0.d
    public final void x(int i3, long j3) {
        this.h[i3] = 2;
        this.f1417d[i3] = j3;
    }
}
