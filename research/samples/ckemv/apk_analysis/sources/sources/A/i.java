package A;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m0.z;
import n.C0337f;
import n.C0342k;
import z.AbstractC0452b;
import z.C0456f;
import z.C0458h;
import z.InterfaceC0455e;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final z f9a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0337f f10b;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f9a = new z();
        } else if (i3 >= 28) {
            f9a = new j();
        } else {
            f9a = new j();
        }
        f10b = new C0337f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r4.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, InterfaceC0455e interfaceC0455e, Resources resources, int i3, String str, int i4, int i5, AbstractC0452b abstractC0452b, boolean z3) {
        Typeface r3;
        Typeface typeface;
        Typeface typeface2;
        int i6 = 7;
        int i7 = 1;
        int i8 = 0;
        int i9 = -3;
        if (interfaceC0455e instanceof C0458h) {
            C0458h c0458h = (C0458h) interfaceC0455e;
            String str2 = c0458h.f5297d;
            r3 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (abstractC0452b != null) {
                    new Handler(Looper.getMainLooper()).post(new I1.k(abstractC0452b, i6, typeface));
                }
                return typeface;
            }
            boolean z4 = !z3 ? abstractC0452b != null : c0458h.c != 0;
            int i10 = z3 ? c0458h.f5296b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            h hVar = new h(0);
            hVar.c = abstractC0452b;
            G.e eVar = c0458h.f5295a;
            v0.l lVar = new v0.l(hVar, handler);
            if (z4) {
                C0337f c0337f = G.i.f194a;
                String str3 = ((String) eVar.f184e) + "-" + i5;
                typeface2 = (Typeface) G.i.f194a.a(str3);
                if (typeface2 != null) {
                    handler.post(new D0.c(hVar, i7, typeface2));
                } else if (i10 == -1) {
                    G.h a3 = G.i.a(str3, context, eVar, i5);
                    lVar.j(a3);
                    r3 = a3.f192a;
                } else {
                    try {
                        try {
                            try {
                                G.h hVar2 = (G.h) G.i.f195b.submit(new G.f(str3, context, eVar, i5, 0)).get(i10, TimeUnit.MILLISECONDS);
                                lVar.j(hVar2);
                                r3 = hVar2.f192a;
                            } catch (InterruptedException e3) {
                                throw e3;
                            }
                        } catch (ExecutionException e4) {
                            throw new RuntimeException(e4);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) lVar.f5084e).post(new G.a(i9, i8, (h) lVar.f5083d));
                    }
                }
            } else {
                C0337f c0337f2 = G.i.f194a;
                String str4 = ((String) eVar.f184e) + "-" + i5;
                typeface2 = (Typeface) G.i.f194a.a(str4);
                if (typeface2 != null) {
                    handler.post(new D0.c(hVar, i7, typeface2));
                } else {
                    G.g gVar = new G.g(i8, lVar);
                    synchronized (G.i.c) {
                        try {
                            C0342k c0342k = G.i.f196d;
                            ArrayList arrayList = (ArrayList) c0342k.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                c0342k.put(str4, arrayList2);
                                G.f fVar = new G.f(str4, context, eVar, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = G.i.f195b;
                                G.g gVar2 = new G.g(i7, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                G.m mVar = new G.m();
                                mVar.c = fVar;
                                mVar.f205d = gVar2;
                                mVar.f206e = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            r3 = typeface2;
        } else {
            r3 = f9a.r(context, (C0456f) interfaceC0455e, resources, i5);
            if (abstractC0452b != null) {
                if (r3 != null) {
                    new Handler(Looper.getMainLooper()).post(new I1.k(abstractC0452b, i6, r3));
                } else {
                    abstractC0452b.a(-3);
                }
            }
        }
        if (r3 != null) {
            f10b.b(b(resources, i3, str, i4, i5), r3);
        }
        return r3;
    }

    public static String b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }
}
