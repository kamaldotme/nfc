package A;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m0.z;
import z.C0456f;
import z.C0457g;

/* loaded from: classes.dex */
public class j extends z {

    /* renamed from: k, reason: collision with root package name */
    public static Class f11k = null;

    /* renamed from: l, reason: collision with root package name */
    public static Constructor f12l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Method f13m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f14n = null;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f15o = false;

    /* renamed from: d, reason: collision with root package name */
    public final Class f16d;

    /* renamed from: e, reason: collision with root package name */
    public final Constructor f17e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f18f;
    public final Method g;
    public final Method h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f19i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f20j;

    public j() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = x0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = y0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f16d = cls;
        this.f17e = constructor;
        this.f18f = method2;
        this.g = method3;
        this.h = method4;
        this.f19i = method5;
        this.f20j = method;
    }

    public static boolean r0(Object obj, String str, int i3, boolean z3) {
        v0();
        try {
            return ((Boolean) f13m.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void v0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f15o) {
            return;
        }
        f15o = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f12l = constructor;
        f11k = cls;
        f13m = method2;
        f14n = method;
    }

    public static Method x0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void p0(Object obj) {
        try {
            this.f19i.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean q0(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f18f.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // m0.z
    public final Typeface r(Context context, C0456f c0456f, Resources resources, int i3) {
        if (this.f18f == null) {
            return t0(context, c0456f, resources, i3);
        }
        Object w02 = w0();
        if (w02 == null) {
            return null;
        }
        for (C0457g c0457g : c0456f.f5289a) {
            if (!q0(context, w02, c0457g.f5290a, c0457g.f5293e, c0457g.f5291b, c0457g.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0457g.f5292d))) {
                p0(w02);
                return null;
            }
        }
        if (u0(w02)) {
            return s0(w02);
        }
        return null;
    }

    @Override // m0.z
    public final Typeface s(Context context, G.j[] jVarArr, int i3) {
        Typeface s02;
        if (jVarArr.length < 1) {
            return null;
        }
        if (this.f18f == null) {
            G.j v3 = v(jVarArr, i3);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(v3.f197a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(v3.c).setItalic(v3.f199d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        int i4 = 0;
        for (G.j jVar : jVarArr) {
            if (jVar.f200e == 0) {
                Uri uri = jVar.f197a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, u2.d.u(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object w02 = w0();
        if (w02 == null) {
            return null;
        }
        int length = jVarArr.length;
        boolean z3 = false;
        while (i4 < length) {
            G.j jVar2 = jVarArr[i4];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.f197a);
            if (byteBuffer != null) {
                if (!((Boolean) this.g.invoke(w02, byteBuffer, Integer.valueOf(jVar2.f198b), null, Integer.valueOf(jVar2.c), Integer.valueOf(jVar2.f199d ? 1 : 0))).booleanValue()) {
                    p0(w02);
                    return null;
                }
                z3 = true;
            }
            i4++;
            z3 = z3;
        }
        if (!z3) {
            p0(w02);
            return null;
        }
        if (u0(w02) && (s02 = s0(w02)) != null) {
            return Typeface.create(s02, i3);
        }
        return null;
    }

    public Typeface s0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f16d, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f20j.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // m0.z
    public final Typeface t(Context context, Resources resources, int i3, String str, int i4) {
        if (this.f18f == null) {
            return super.t(context, resources, i3, str, i4);
        }
        Object w02 = w0();
        if (w02 == null) {
            return null;
        }
        if (!q0(context, w02, str, 0, -1, -1, null)) {
            p0(w02);
            return null;
        }
        if (u0(w02)) {
            return s0(w02);
        }
        return null;
    }

    public final Typeface t0(Context context, C0456f c0456f, Resources resources, int i3) {
        v0();
        try {
            Object newInstance = f12l.newInstance(null);
            for (C0457g c0457g : c0456f.f5289a) {
                File p3 = u2.d.p(context);
                if (p3 == null) {
                    return null;
                }
                try {
                    if (!u2.d.h(p3, resources, c0457g.f5294f)) {
                        return null;
                    }
                    if (!r0(newInstance, p3.getPath(), c0457g.f5291b, c0457g.c)) {
                        return null;
                    }
                    p3.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    p3.delete();
                }
            }
            v0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f11k, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f14n.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final boolean u0(Object obj) {
        try {
            return ((Boolean) this.h.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object w0() {
        try {
            return this.f17e.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method y0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
