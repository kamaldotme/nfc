package a0;

import L1.t;
import android.content.Context;
import androidx.lifecycle.InterfaceC0091h;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import f.C0150G;
import f0.C0170f;
import f0.C0171g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import r0.AbstractC0368c;

/* loaded from: classes.dex */
public final class l extends X1.h implements W1.a {
    public final /* synthetic */ int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i3, Object obj) {
        super(0);
        this.c = i3;
        this.f1421d = obj;
    }

    @Override // W1.a
    public final Object d() {
        C0170f c0170f;
        switch (this.c) {
            case 0:
                return ((m) this.f1421d).m();
            case 1:
                P p3 = (P) this.f1421d;
                X1.g.e(p3, "<this>");
                ArrayList arrayList = new ArrayList();
                X1.k.f1143a.getClass();
                Class a3 = new X1.d(K.class).a();
                X1.g.c(a3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new V.d(a3));
                V.d[] dVarArr = (V.d[]) arrayList.toArray(new V.d[0]);
                V.d[] dVarArr2 = (V.d[]) Arrays.copyOf(dVarArr, dVarArr.length);
                X1.g.e(dVarArr2, "initializers");
                O c = p3.c();
                V.b a4 = p3 instanceof InterfaceC0091h ? ((InterfaceC0091h) p3).a() : V.a.f970b;
                X1.g.e(c, "store");
                X1.g.e(a4, "defaultCreationExtras");
                LinkedHashMap linkedHashMap = c.f2032a;
                M m3 = (M) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (K.class.isInstance(m3)) {
                    X1.g.c(m3, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                } else {
                    V.c cVar = new V.c(a4);
                    cVar.f971a.put(N.f2031b, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        M m4 = null;
                        for (V.d dVar : dVarArr2) {
                            if (X1.g.a(dVar.f972a, K.class)) {
                                Object h = dVar.f973b.h(cVar);
                                m4 = h instanceof M ? (M) h : null;
                            }
                        }
                        if (m4 == null) {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(K.class.getName()));
                        }
                        M m5 = (M) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", m4);
                        if (m5 != null) {
                            m5.a();
                        }
                        m3 = m4;
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (K) m3;
            case 2:
                C0171g c0171g = (C0171g) this.f1421d;
                if (c0171g.c == null || !c0171g.f3022e) {
                    c0170f = new C0170f(c0171g.f3020b, c0171g.c, new C0150G(1), c0171g.f3021d, c0171g.f3023f);
                } else {
                    Context context = c0171g.f3020b;
                    X1.g.e(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    X1.g.d(noBackupFilesDir, "context.noBackupFilesDir");
                    c0170f = new C0170f(c0171g.f3020b, new File(noBackupFilesDir, c0171g.c).getAbsolutePath(), new C0150G(1), c0171g.f3021d, c0171g.f3023f);
                }
                c0170f.setWriteAheadLoggingEnabled(c0171g.h);
                return c0170f;
            case 3:
                return (List) this.f1421d;
            case 4:
                try {
                    return (List) ((W1.a) this.f1421d).d();
                } catch (SSLPeerUnverifiedException unused2) {
                    return t.f622b;
                }
            default:
                return new AbstractC0368c[((h2.f[]) this.f1421d).length];
        }
    }
}
