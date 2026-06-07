package C1;

import I1.n;
import android.os.Handler;
import android.os.HandlerThread;
import j1.C0244n;
import java.util.Formatter;
import v0.C0403c;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: f, reason: collision with root package name */
    public static e f127f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128a;

    /* renamed from: b, reason: collision with root package name */
    public int f129b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Object f130d;

    /* renamed from: e, reason: collision with root package name */
    public Object f131e;

    public /* synthetic */ e(int i3) {
        this.f128a = i3;
    }

    public void a(C0403c c0403c) {
        if (c0403c != null) {
            f fVar = (f) c0403c;
            a[] aVarArr = (a[]) fVar.f5067d;
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    aVar.c();
                }
            }
            a aVar2 = (a) this.c;
            fVar.s(aVarArr, aVar2);
            c cVar = (c) fVar.c;
            boolean z3 = fVar.f132e;
            C0244n c0244n = z3 ? cVar.f120b : cVar.f121d;
            C0244n c0244n2 = z3 ? cVar.c : cVar.f122e;
            int i3 = fVar.i((int) c0244n.f3506b);
            int i4 = fVar.i((int) c0244n2.f3506b);
            int i5 = -1;
            int i6 = 0;
            int i7 = 1;
            while (i3 < i4) {
                a aVar3 = aVarArr[i3];
                if (aVar3 != null) {
                    int i8 = aVar3.f117f;
                    int i9 = i8 - i5;
                    if (i9 == 0) {
                        i6++;
                    } else {
                        if (i9 == 1) {
                            i7 = Math.max(i7, i6);
                            i5 = aVar3.f117f;
                        } else if (i9 < 0 || i8 >= aVar2.f117f || i9 > i3) {
                            aVarArr[i3] = null;
                        } else {
                            if (i7 > 2) {
                                i9 *= i7 - 2;
                            }
                            boolean z4 = i9 >= i3;
                            for (int i10 = 1; i10 <= i9 && !z4; i10++) {
                                z4 = aVarArr[i3 - i10] != null;
                            }
                            if (z4) {
                                aVarArr[i3] = null;
                            } else {
                                i5 = aVar3.f117f;
                            }
                        }
                        i6 = 1;
                    }
                }
                i3++;
            }
        }
    }

    public void b() {
        synchronized (this.f131e) {
            try {
                if (((Handler) this.c) == null) {
                    if (this.f129b <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f130d = handlerThread;
                    handlerThread.start();
                    this.c = new Handler(((HandlerThread) this.f130d).getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Runnable runnable) {
        synchronized (this.f131e) {
            b();
            ((Handler) this.c).post(runnable);
        }
    }

    public String toString() {
        switch (this.f128a) {
            case 0:
                C0403c[] c0403cArr = (C0403c[]) this.f130d;
                C0403c c0403c = c0403cArr[0];
                int i3 = this.f129b;
                if (c0403c == null) {
                    c0403c = c0403cArr[i3 + 1];
                }
                Formatter formatter = new Formatter();
                for (int i4 = 0; i4 < ((a[]) c0403c.f5067d).length; i4++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i4));
                        for (int i5 = 0; i5 < i3 + 2; i5++) {
                            C0403c c0403c2 = c0403cArr[i5];
                            if (c0403c2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                a aVar = ((a[]) c0403c2.f5067d)[i4];
                                if (aVar == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(aVar.f117f), Integer.valueOf(aVar.f116e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } finally {
                    }
                }
                String formatter2 = formatter.toString();
                formatter.close();
                return formatter2;
            default:
                return super.toString();
        }
    }

    public e() {
        this.f128a = 3;
        this.f129b = 0;
        this.f131e = new Object();
    }

    public e(a aVar, c cVar) {
        this.f128a = 0;
        this.c = aVar;
        int i3 = aVar.f114b;
        this.f129b = i3;
        this.f131e = cVar;
        this.f130d = new C0403c[i3 + 2];
    }
}
