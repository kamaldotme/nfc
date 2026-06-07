package m0;

import Z.AbstractC0055w;
import Z.H;
import Z.T;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.Socket;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import x0.AbstractC0430i;
import x0.C0425d;
import x0.C0429h;
import z.C0456f;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static Field f3989a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3990b = false;
    public static boolean c = true;

    public z() {
        new ConcurrentHashMap();
    }

    public static final int B(Cursor cursor, String str) {
        String str2;
        X1.g.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            X1.g.d(columnNames, "c.columnNames");
            str2 = L1.j.W(columnNames);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static final int I(int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i3 >= i4) {
                return i4;
            }
            int i6 = i4 % i5;
            if (i6 < 0) {
                i6 += i5;
            }
            int i7 = i3 % i5;
            if (i7 < 0) {
                i7 += i5;
            }
            int i8 = (i6 - i7) % i5;
            if (i8 < 0) {
                i8 += i5;
            }
            return i4 - i8;
        }
        if (i5 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i3 <= i4) {
            return i4;
        }
        int i9 = -i5;
        int i10 = i3 % i9;
        if (i10 < 0) {
            i10 += i9;
        }
        int i11 = i4 % i9;
        if (i11 < 0) {
            i11 += i9;
        }
        int i12 = (i10 - i11) % i9;
        if (i12 < 0) {
            i12 += i9;
        }
        return i4 + i12;
    }

    public static final boolean O(AssertionError assertionError) {
        String message;
        Logger logger = z2.m.f5349a;
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !d2.d.X(message, "getsockname failed")) ? false : true;
    }

    public static J1.l Z(String str) {
        int i3;
        String str2;
        X1.g.e(str, "statusLine");
        boolean V2 = d2.l.V(str, "HTTP/1.", false);
        m2.p pVar = m2.p.HTTP_1_0;
        if (V2) {
            i3 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                pVar = m2.p.HTTP_1_1;
            }
        } else {
            if (!d2.l.V(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i3 = 4;
        }
        int i4 = i3 + 3;
        if (str.length() < i4) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i3, i4);
            X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i4) {
                str2 = "";
            } else {
                if (str.charAt(i4) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i3 + 4);
                X1.g.d(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new J1.l(pVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final ExecutorService a(boolean z3) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0330b(z3));
        X1.g.d(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    public static O1.i a0(O1.i iVar, O1.i iVar2) {
        X1.g.e(iVar2, "context");
        return iVar2 == O1.j.f782b ? iVar : (O1.i) iVar2.D(iVar, O1.b.f779e);
    }

    public static void b(e0.d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i3 = 0;
        while (i3 < length) {
            Object obj = objArr[i3];
            i3++;
            if (obj == null) {
                dVar.g(i3);
            } else if (obj instanceof byte[]) {
                dVar.f(i3, (byte[]) obj);
            } else if (obj instanceof Float) {
                dVar.l(i3, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dVar.l(i3, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                dVar.x(i3, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                dVar.x(i3, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                dVar.x(i3, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                dVar.x(i3, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                dVar.h((String) obj, i3);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i3 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                dVar.x(i3, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static M1.h c(M1.h hVar) {
        M1.e eVar = hVar.f651b;
        eVar.b();
        return eVar.f644j > 0 ? hVar : M1.h.c;
    }

    public static void i(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void j(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static final z2.c j0(Socket socket) {
        Logger logger = z2.m.f5349a;
        z2.u uVar = new z2.u(socket);
        OutputStream outputStream = socket.getOutputStream();
        X1.g.d(outputStream, "getOutputStream(...)");
        return new z2.c(uVar, 0, new z2.c(outputStream, 1, uVar));
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static z2.c k0(File file) {
        Logger logger = z2.m.f5349a;
        return new z2.c(new FileOutputStream(file, false), 1, new Object());
    }

    public static final z2.d l0(Socket socket) {
        Logger logger = z2.m.f5349a;
        z2.u uVar = new z2.u(socket);
        InputStream inputStream = socket.getInputStream();
        X1.g.d(inputStream, "getInputStream(...)");
        return new z2.d(uVar, 0, new z2.d(inputStream, 1, uVar));
    }

    public static final void m0(Object obj) {
        if (obj instanceof K1.d) {
            throw ((K1.d) obj).f601b;
        }
    }

    public static int n(T t3, AbstractC0055w abstractC0055w, View view, View view2, H h, boolean z3) {
        if (h.v() == 0 || t3.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(H.F(view) - H.F(view2)) + 1;
        }
        return Math.min(abstractC0055w.l(), abstractC0055w.b(view2) - abstractC0055w.e(view));
    }

    public static int o(T t3, AbstractC0055w abstractC0055w, View view, View view2, H h, boolean z3, boolean z4) {
        if (h.v() == 0 || t3.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z4 ? Math.max(0, (t3.b() - Math.max(H.F(view), H.F(view2))) - 1) : Math.max(0, Math.min(H.F(view), H.F(view2)));
        if (z3) {
            return Math.round((max * (Math.abs(abstractC0055w.b(view2) - abstractC0055w.e(view)) / (Math.abs(H.F(view) - H.F(view2)) + 1))) + (abstractC0055w.k() - abstractC0055w.e(view)));
        }
        return max;
    }

    public static int p(T t3, AbstractC0055w abstractC0055w, View view, View view2, H h, boolean z3) {
        if (h.v() == 0 || t3.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return t3.b();
        }
        return (int) (((abstractC0055w.b(view2) - abstractC0055w.e(view)) / (Math.abs(H.F(view) - H.F(view2)) + 1)) * t3.b());
    }

    public static final K1.d q(Throwable th) {
        X1.g.e(th, "exception");
        return new K1.d(th);
    }

    public static Object u(Object[] objArr, int i3, U0.e eVar) {
        int i4 = (i3 & 1) == 0 ? 400 : 700;
        boolean z3 = (i3 & 2) != 0;
        Object obj = null;
        int i5 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(eVar.d(obj2) - i4) * 2) + (eVar.f(obj2) == z3 ? 0 : 1);
            if (obj == null || i5 > abs) {
                obj = obj2;
                i5 = abs;
            }
        }
        return obj;
    }

    public static m2.u w(String str) {
        X1.g.e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return m2.u.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return m2.u.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return m2.u.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return m2.u.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return m2.u.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m2.i x(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = L1.t.f622b;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
        if (X1.g.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || X1.g.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        m2.f c3 = m2.f.f4019b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null".toString());
        }
        if (X1.g.a("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        m2.u w3 = w(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = n2.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = n2.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new m2.i(w3, c3, list2, new a0.l(3, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new m2.i(w3, c3, list2, new a0.l(3, list));
    }

    public static int z(int i3) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        boolean z3 = i3 >= 0;
        if (!z3) {
            i3 = 0;
            while (i3 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i3, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i3++;
            }
        }
        return i3 < numberOfCameras ? i3 : z3 ? -1 : 0;
    }

    public abstract Constructor A(Class cls);

    public abstract int C();

    public abstract int D();

    public abstract int E();

    public abstract int F();

    public abstract int G(View view);

    public abstract int H(CoordinatorLayout coordinatorLayout);

    public abstract String[] J(Class cls);

    public abstract int K();

    public float L(View view) {
        float transitionAlpha;
        if (c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    public int M(View view) {
        return 0;
    }

    public int N() {
        return 0;
    }

    public abstract boolean P(float f3);

    public abstract boolean Q(Class cls);

    public abstract boolean R(View view);

    public abstract boolean S(float f3, float f4);

    public abstract void T(Throwable th);

    public abstract void U(v0.i iVar);

    public void V(View view, int i3) {
    }

    public abstract void W(int i3);

    public abstract void X(View view, int i3, int i4);

    public abstract void Y(View view, float f3, float f4);

    public abstract void b0(C0429h c0429h, C0429h c0429h2);

    public abstract void c0(C0429h c0429h, Thread thread);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract void d0(boolean z3);

    public abstract float e(int i3);

    public abstract void e0(boolean z3);

    public abstract boolean f(AbstractC0430i abstractC0430i, C0425d c0425d, C0425d c0425d2);

    public void f0(View view, float f3) {
        if (c) {
            try {
                view.setTransitionAlpha(f3);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f3);
    }

    public abstract boolean g(AbstractC0430i abstractC0430i, Object obj, Object obj2);

    public void g0(View view, int i3) {
        if (!f3990b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3989a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3990b = true;
        }
        Field field = f3989a;
        if (field != null) {
            try {
                f3989a.setInt(view, i3 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean h(AbstractC0430i abstractC0430i, C0429h c0429h, C0429h c0429h2);

    public abstract boolean h0(View view, float f3);

    public abstract void i0();

    public abstract int l(View view, int i3);

    public abstract int m(View view, int i3);

    public abstract boolean n0(View view, int i3);

    public abstract void o0(ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4);

    public abstract Typeface r(Context context, C0456f c0456f, Resources resources, int i3);

    public abstract Typeface s(Context context, G.j[] jVarArr, int i3);

    public Typeface t(Context context, Resources resources, int i3, String str, int i4) {
        File p3 = u2.d.p(context);
        if (p3 == null) {
            return null;
        }
        try {
            if (u2.d.h(p3, resources, i3)) {
                return Typeface.createFromFile(p3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            p3.delete();
        }
    }

    public G.j v(G.j[] jVarArr, int i3) {
        return (G.j) u(jVarArr, i3, new U0.e(1));
    }

    public abstract Method y(Class cls, Field field);
}
