package u2;

import J.E;
import J.InterfaceC0012k;
import J.S;
import J.T;
import L1.u;
import W1.p;
import a.AbstractC0059a;
import a2.C0062a;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EditText;
import androidx.fragment.app.AbstractComponentCallbacksC0077n;
import androidx.fragment.app.C0076m;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import b0.AbstractC0102a;
import e2.AbstractC0119a;
import e2.C0124f;
import e2.C0136s;
import e2.K;
import f.ExecutorC0145B;
import g2.q;
import g2.r;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import l.C0324a;
import m0.C0329a;
import m0.z;
import n0.s;
import o0.C0353c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import t0.C0384a;
import v0.C0403c;
import xyz.happify.ckemv.R;
import y0.ExecutorC0445a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f5039a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f5040b = null;
    public static boolean c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f5041d;

    public static v0.l A(Context context, AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n, boolean z3, boolean z4) {
        int i3;
        C0076m c0076m = abstractComponentCallbacksC0077n.f1960I;
        int i4 = c0076m == null ? 0 : c0076m.f1948f;
        if (z4) {
            if (z3) {
                if (c0076m != null) {
                    i3 = c0076m.f1946d;
                }
                i3 = 0;
            } else {
                if (c0076m != null) {
                    i3 = c0076m.f1947e;
                }
                i3 = 0;
            }
        } else if (z3) {
            if (c0076m != null) {
                i3 = c0076m.f1945b;
            }
            i3 = 0;
        } else {
            if (c0076m != null) {
                i3 = c0076m.c;
            }
            i3 = 0;
        }
        abstractComponentCallbacksC0077n.y(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0077n.f1956E;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC0077n.f1956E.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0077n.f1956E;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (i3 == 0 && i4 != 0) {
            i3 = i4 != 4097 ? i4 != 4099 ? i4 != 8194 ? -1 : z3 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z3 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z3 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i3 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i3));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i3);
                    if (loadAnimation != null) {
                        return new v0.l(loadAnimation);
                    }
                } catch (Resources.NotFoundException e3) {
                    throw e3;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, i3);
                if (loadAnimator != null) {
                    return new v0.l(loadAnimator);
                }
            } catch (RuntimeException e4) {
                if (equals) {
                    throw e4;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i3);
                if (loadAnimation2 != null) {
                    return new v0.l(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static final int B(int i3) {
        X.d.o("networkType", i3);
        int a3 = q.h.a(i3);
        if (a3 == 0) {
            return 0;
        }
        if (a3 == 1) {
            return 1;
        }
        if (a3 == 2) {
            return 2;
        }
        if (a3 == 3) {
            return 3;
        }
        if (a3 == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && i3 == 6) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + X.d.y(i3) + " to int");
    }

    public static void C(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, null);
                newSerializer.startDocument("UTF-8", Boolean.TRUE);
                newSerializer.startTag(null, "locales");
                newSerializer.attribute(null, "application_locales", str);
                newSerializer.endTag(null, "locales");
                newSerializer.endDocument();
                if (openFileOutput == null) {
                    return;
                }
            } catch (Exception unused) {
                if (openFileOutput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            openFileOutput.close();
        } catch (FileNotFoundException | IOException unused3) {
        }
    }

    public static int D(Y1.d dVar, a2.c cVar) {
        X1.g.e(dVar, "random");
        try {
            return AbstractC0059a.E(dVar, cVar);
        } catch (IllegalArgumentException e3) {
            throw new NoSuchElementException(e3.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r1.isEmpty() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        if (r5 != 4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        if (r3.getName().equals("locales") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003a, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        if (r2 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String E(Context context) {
        String str = "";
        try {
            FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int depth = newPullParser.getDepth();
                while (true) {
                    int next = newPullParser.next();
                    if (next != 1) {
                        if (next == 3 && newPullParser.getDepth() <= depth) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (IOException | XmlPullParserException unused) {
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    public static final void F(Object[] objArr, int i3, int i4) {
        X1.g.e(objArr, "<this>");
        while (i3 < i4) {
            objArr[i3] = null;
            i3++;
        }
    }

    public static int G(Context context, int i3, int i4) {
        TypedValue z3 = d.z(context, i3);
        return (z3 == null || z3.type != 16) ? i4 : z3.data;
    }

    public static TimeInterpolator H(Context context, int i3, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!y(valueOf, "cubic-bezier") && !y(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!y(valueOf, "cubic-bezier")) {
            if (y(valueOf, "path")) {
                return L.a.c(AbstractC0059a.p(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
        if (split.length == 4) {
            return L.a.b(q(0, split), q(1, split), q(2, split), q(3, split));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }

    public static final byte[] I(Set set) {
        X1.g.e(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    m0.c cVar = (m0.c) it.next();
                    objectOutputStream.writeUTF(cVar.f3961a.toString());
                    objectOutputStream.writeBoolean(cVar.f3962b);
                }
                AbstractC0059a.j(objectOutputStream, null);
                AbstractC0059a.j(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                X1.g.d(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC0059a.j(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC0059a.j(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static void J(Drawable drawable, int i3) {
        B.b.g(drawable, i3);
    }

    public static void K(Drawable drawable, ColorStateList colorStateList) {
        B.b.h(drawable, colorStateList);
    }

    public static void L(Drawable drawable, PorterDuff.Mode mode) {
        B.b.i(drawable, mode);
    }

    public static void M(p pVar, AbstractC0119a abstractC0119a, AbstractC0119a abstractC0119a2) {
        try {
            j2.a.i(v0.f.y(v0.f.q(pVar, abstractC0119a, abstractC0119a2)), K1.h.f605a, null);
        } catch (Throwable th) {
            abstractC0119a2.c(z.q(th));
            throw th;
        }
    }

    public static final int N(int i3) {
        X.d.o("state", i3);
        int a3 = q.h.a(i3);
        if (a3 == 0) {
            return 0;
        }
        if (a3 == 1) {
            return 1;
        }
        if (a3 == 2) {
            return 2;
        }
        if (a3 == 3) {
            return 3;
        }
        if (a3 == 4) {
            return 4;
        }
        if (a3 == 5) {
            return 5;
        }
        throw new RuntimeException();
    }

    public static C0062a O(a2.c cVar, int i3) {
        X1.g.e(cVar, "<this>");
        boolean z3 = i3 > 0;
        Integer valueOf = Integer.valueOf(i3);
        if (z3) {
            if (cVar.f1425d <= 0) {
                i3 = -i3;
            }
            return new C0062a(cVar.f1424b, cVar.c, i3);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a2.a, a2.c] */
    public static a2.c P(int i3, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new C0062a(i3, i4 - 1, 1);
        }
        a2.c cVar = a2.c.f1429e;
        return a2.c.f1429e;
    }

    public static final void a(p2.a aVar, p2.c cVar, String str) {
        p2.d.f4362i.fine(cVar.f4358b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f4352a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v2, types: [Q1.b, g2.p, java.lang.Object, O1.d] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r5v6, types: [W1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(r rVar, s0.b bVar, O1.d dVar) {
        ?? r02;
        int i3;
        try {
            if (dVar instanceof g2.p) {
                g2.p pVar = (g2.p) dVar;
                int i4 = pVar.g;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    pVar.g = i4 - Integer.MIN_VALUE;
                    r02 = pVar;
                    Object obj = r02.f3078f;
                    P1.a aVar = P1.a.f784b;
                    i3 = r02.g;
                    if (i3 != 0) {
                        z.m0(obj);
                        O1.i iVar = r02.c;
                        X1.g.b(iVar);
                        if (iVar.A(C0136s.c) != rVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                        }
                        r02.getClass();
                        r02.f3077e = bVar;
                        r02.g = 1;
                        C0124f c0124f = new C0124f(1, v0.f.y(r02));
                        c0124f.r();
                        ((q) rVar).e(new L1.a(2, c0124f));
                        bVar = bVar;
                        if (c0124f.q() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = r02.f3077e;
                        z.m0(obj);
                        bVar = r5;
                    }
                    bVar.d();
                    return K1.h.f605a;
                }
            }
            if (i3 != 0) {
            }
            bVar.d();
            return K1.h.f605a;
        } catch (Throwable th) {
            bVar.d();
            throw th;
        }
        r02 = new Q1.b(dVar);
        Object obj2 = r02.f3078f;
        P1.a aVar2 = P1.a.f784b;
        i3 = r02.g;
    }

    public static final LinkedHashSet c(byte[] bArr) {
        ObjectInputStream objectInputStream;
        X1.g.e(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC0059a.j(byteArrayInputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                Uri parse = Uri.parse(objectInputStream.readUTF());
                boolean readBoolean = objectInputStream.readBoolean();
                X1.g.d(parse, "uri");
                linkedHashSet.add(new m0.c(parse, readBoolean));
            }
            AbstractC0059a.j(objectInputStream, null);
            AbstractC0059a.j(byteArrayInputStream, null);
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC0059a.j(objectInputStream, th3);
                throw th4;
            }
        }
    }

    public static final void e(int i3, int i4) {
        if (i3 <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i4 + ").");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03eb A[LOOP:6: B:104:0x03ba->B:116:0x03eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b9 A[LOOP:1: B:52:0x0284->B:64:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [v0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [v0.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final s f(Context context, C0329a c0329a) {
        a0.i iVar;
        int i3;
        int i4 = 3;
        X1.g.e(context, "context");
        ExecutorService executorService = c0329a.f3954b;
        ?? obj = new Object();
        obj.f5077d = new Handler(Looper.getMainLooper());
        obj.f5078e = new ExecutorC0445a(obj);
        ExecutorC0145B executorC0145B = new ExecutorC0145B(executorService);
        obj.f5076b = executorC0145B;
        obj.c = new K(executorC0145B);
        Context applicationContext = context.getApplicationContext();
        X1.g.d(applicationContext, "context.applicationContext");
        ExecutorC0145B executorC0145B2 = (ExecutorC0145B) obj.f5076b;
        X1.g.d(executorC0145B2, "workTaskExecutor.serialTaskExecutor");
        boolean z3 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        m0.r rVar = c0329a.c;
        X1.g.e(rVar, "clock");
        if (z3) {
            iVar = new a0.i(applicationContext, null);
            iVar.f1407j = true;
        } else {
            if (!(!d2.l.R("androidx.work.workdb"))) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
            }
            a0.i iVar2 = new a0.i(applicationContext, "androidx.work.workdb");
            iVar2.f1406i = new B2.b(applicationContext);
            iVar = iVar2;
        }
        iVar.g = executorC0145B2;
        n0.b bVar = new n0.b(rVar);
        ArrayList arrayList = iVar.f1403d;
        arrayList.add(bVar);
        iVar.a(n0.d.h);
        iVar.a(new n0.h(applicationContext, 2, 3));
        iVar.a(n0.d.f4169i);
        iVar.a(n0.d.f4170j);
        iVar.a(new n0.h(applicationContext, 5, 6));
        iVar.a(n0.d.f4171k);
        iVar.a(n0.d.f4172l);
        iVar.a(n0.d.f4173m);
        iVar.a(new n0.h(applicationContext));
        iVar.a(new n0.h(applicationContext, 10, 11));
        iVar.a(n0.d.f4166d);
        iVar.a(n0.d.f4167e);
        iVar.a(n0.d.f4168f);
        iVar.a(n0.d.g);
        iVar.f1409l = false;
        iVar.f1410m = true;
        Executor executor = iVar.g;
        if (executor == null && iVar.h == null) {
            X.e eVar = C0324a.f3890d;
            iVar.h = eVar;
            iVar.g = eVar;
        } else if (executor != null && iVar.h == null) {
            iVar.h = executor;
        } else if (executor == null) {
            iVar.g = iVar.h;
        }
        HashSet hashSet = iVar.f1414q;
        LinkedHashSet linkedHashSet = iVar.f1413p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!(!linkedHashSet.contains(Integer.valueOf(intValue)))) {
                    throw new IllegalArgumentException(X.d.f("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                }
            }
        }
        e0.b bVar2 = iVar.f1406i;
        if (bVar2 == null) {
            bVar2 = new d1.e(i4);
        }
        e0.b bVar3 = bVar2;
        if (iVar.f1411n > 0) {
            if (iVar.c != null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
        }
        boolean z4 = iVar.f1407j;
        int i5 = iVar.f1408k;
        if (i5 == 0) {
            throw null;
        }
        Context context2 = iVar.f1401a;
        X1.g.e(context2, "context");
        if (i5 != 1) {
            i3 = i5;
        } else {
            Object systemService = context2.getSystemService("activity");
            X1.g.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i3 = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = iVar.g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Executor executor3 = iVar.h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        a0.b bVar4 = new a0.b(context2, iVar.c, bVar3, iVar.f1412o, arrayList, z4, i3, executor2, executor3, iVar.f1409l, iVar.f1410m, linkedHashSet, iVar.f1404e, iVar.f1405f);
        Class cls = iVar.f1402b;
        X1.g.e(cls, "klass");
        Package r22 = cls.getPackage();
        X1.g.b(r22);
        String name = r22.getName();
        String canonicalName = cls.getCanonicalName();
        X1.g.b(canonicalName);
        X1.g.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            X1.g.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String replace = canonicalName.replace('.', '_');
        X1.g.d(replace, "replace(...)");
        String concat = replace.concat("_Impl");
        try {
            Class<?> cls2 = Class.forName(name.length() == 0 ? concat : name + '.' + concat, true, cls.getClassLoader());
            X1.g.c(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls2.newInstance();
            workDatabase.getClass();
            workDatabase.c = workDatabase.e(bVar4);
            Set i6 = workDatabase.i();
            BitSet bitSet = new BitSet();
            Iterator it2 = i6.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = workDatabase.g;
                List list = bVar4.f1387n;
                if (hasNext) {
                    Class cls3 = (Class) it2.next();
                    int size = list.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i7 = size - 1;
                            if (cls3.isAssignableFrom(list.get(size).getClass())) {
                                bitSet.set(size);
                                break;
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size = i7;
                        }
                        if (size >= 0) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(cls3, list.get(size));
                    }
                    size = -1;
                    if (size >= 0) {
                    }
                } else {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i8 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                            }
                            if (i8 < 0) {
                                break;
                            }
                            size2 = i8;
                        }
                    }
                    for (AbstractC0102a abstractC0102a : workDatabase.g(linkedHashMap)) {
                        int i9 = abstractC0102a.f2217a;
                        A.h hVar = bVar4.f1379d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) hVar.c;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i9))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i9));
                            if (map == null) {
                                map = u.f623b;
                            }
                            if (!map.containsKey(Integer.valueOf(abstractC0102a.f2218b))) {
                            }
                        }
                        hVar.p(abstractC0102a);
                    }
                    workDatabase.h().setWriteAheadLoggingEnabled(bVar4.g == 3);
                    workDatabase.f2193f = bVar4.f1380e;
                    workDatabase.f2190b = bVar4.h;
                    X1.g.e(bVar4.f1382i, "executor");
                    new ArrayDeque();
                    workDatabase.f2192e = bVar4.f1381f;
                    Map j3 = workDatabase.j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = j3.entrySet().iterator();
                    while (true) {
                        boolean hasNext2 = it3.hasNext();
                        List list2 = bVar4.f1386m;
                        if (!hasNext2) {
                            int size3 = list2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i10 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i10 < 0) {
                                        break;
                                    }
                                    size3 = i10;
                                }
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            X1.g.d(applicationContext2, "context.applicationContext");
                            Context applicationContext3 = applicationContext2.getApplicationContext();
                            X1.g.d(applicationContext3, "context.applicationContext");
                            X1.g.e(obj, "taskExecutor");
                            C0384a c0384a = new C0384a(applicationContext3, obj, 0);
                            Context applicationContext4 = applicationContext2.getApplicationContext();
                            X1.g.d(applicationContext4, "context.applicationContext");
                            X1.g.e(obj, "taskExecutor");
                            C0384a c0384a2 = new C0384a(applicationContext4, obj, 1);
                            Context applicationContext5 = applicationContext2.getApplicationContext();
                            X1.g.d(applicationContext5, "context.applicationContext");
                            int i11 = t0.i.f4898a;
                            X1.g.e(obj, "taskExecutor");
                            t0.h hVar2 = new t0.h(applicationContext5, obj);
                            Context applicationContext6 = applicationContext2.getApplicationContext();
                            X1.g.d(applicationContext6, "context.applicationContext");
                            X1.g.e(obj, "taskExecutor");
                            C0384a c0384a3 = new C0384a(applicationContext6, obj, 2);
                            X1.g.e(obj, "taskExecutor");
                            ?? obj2 = new Object();
                            obj2.f5076b = c0384a;
                            obj2.c = c0384a2;
                            obj2.f5077d = hVar2;
                            obj2.f5078e = c0384a3;
                            n0.g gVar = new n0.g(context.getApplicationContext(), c0329a, obj, workDatabase);
                            int i12 = n0.l.f4193a;
                            q0.b bVar5 = new q0.b(context, workDatabase, c0329a);
                            w0.m.a(context, SystemJobService.class, true);
                            m0.r.a().getClass();
                            return new s(context.getApplicationContext(), c0329a, obj, workDatabase, L1.l.R(bVar5, new C0353c(context, c0329a, obj2, gVar, new C0403c(gVar, obj), obj)), gVar, obj2);
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls4 = (Class) entry.getKey();
                        for (Class cls5 : (List) entry.getValue()) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i13 = size4 - 1;
                                    if (cls5.isAssignableFrom(list2.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i13 < 0) {
                                        break;
                                    }
                                    size4 = i13;
                                }
                                if (size4 >= 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls5 + ") for " + cls4.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                workDatabase.f2195j.put(cls5, list2.get(size4));
                            }
                            size4 = -1;
                            if (size4 >= 0) {
                            }
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + concat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, J.S] */
    public static boolean g(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = T.f402a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = S.f399d;
        S s3 = (S) view.getTag(R.id.tag_unhandled_key_event_manager);
        S s4 = s3;
        if (s3 == null) {
            ?? obj = new Object();
            obj.f400a = null;
            obj.f401b = null;
            obj.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            s4 = obj;
        }
        WeakReference weakReference2 = s4.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        s4.c = new WeakReference(keyEvent);
        if (s4.f401b == null) {
            s4.f401b = new SparseArray();
        }
        SparseArray sparseArray = s4.f401b;
        if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !E.b(view2) || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        X.d.q(arrayList.get(size));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(InterfaceC0012k interfaceC0012k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        if (interfaceC0012k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0012k.e(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f5039a) {
                        try {
                            f5040b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f5039a = true;
                    }
                    Method method = f5040b;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, keyEvent);
                            if (invoke != null) {
                                if (((Boolean) invoke).booleanValue()) {
                                    return true;
                                }
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (T.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && T.b(view, keyEvent)) || interfaceC0012k.e(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f5041d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            c = true;
        }
        Field field = f5041d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
            }
            if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            window = dialog.getWindow();
            if (!window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window.getDecorView();
            if (T.b(decorView2, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        onKeyListener = null;
        if (onKeyListener == null) {
        }
        window = dialog.getWindow();
        if (!window.superDispatchKeyEvent(keyEvent)) {
        }
    }

    public static final String i(long j3) {
        String str;
        if (j3 <= -999500000) {
            str = ((j3 - 500000000) / 1000000000) + " s ";
        } else if (j3 <= -999500) {
            str = ((j3 - 500000) / 1000000) + " ms";
        } else if (j3 <= 0) {
            str = ((j3 - 500) / 1000) + " µs";
        } else if (j3 < 999500) {
            str = ((j3 + 500) / 1000) + " µs";
        } else if (j3 < 999500000) {
            str = ((j3 + 500000) / 1000000) + " ms";
        } else {
            str = ((j3 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static m2.n j(String str) {
        Matcher matcher = m2.n.c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        X1.g.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        X1.g.d(locale, "US");
        X1.g.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        X1.g.d(group2, "typeSubtype.group(2)");
        X1.g.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = m2.n.f4068d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                X1.g.d(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (d2.l.V(group4, "'", false) && d2.l.P(group4, "'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    X1.g.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new m2.n(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static int k(Context context, int i3, int i4) {
        TypedValue z3 = d.z(context, i3);
        if (z3 == null) {
            return i4;
        }
        int i5 = z3.resourceId;
        return i5 != 0 ? y.d.a(context, i5) : z3.data;
    }

    public static int l(View view, int i3) {
        Context context = view.getContext();
        TypedValue B3 = d.B(view.getContext(), i3, view.getClass().getCanonicalName());
        int i4 = B3.resourceId;
        return i4 != 0 ? y.d.a(context, i4) : B3.data;
    }

    public static ColorStateList m(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        ColorStateList c3;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (c3 = y.f.c(context, resourceId)) == null) ? typedArray.getColorStateList(i3) : c3;
    }

    public static ColorStateList n(Context context, v0.m mVar, int i3) {
        int resourceId;
        ColorStateList c3;
        TypedArray typedArray = (TypedArray) mVar.f5087d;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (c3 = y.f.c(context, resourceId)) == null) ? mVar.q(i3) : c3;
    }

    public static Drawable p(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        Drawable s3;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (s3 = AbstractC0059a.s(context, resourceId)) == null) ? typedArray.getDrawable(i3) : s3;
    }

    public static float q(int i3, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i3]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final int r(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(X.d.g("Could not convert ", i3, " to BackoffPolicy"));
    }

    public static final int s(int i3) {
        if (i3 == 0) {
            return 1;
        }
        int i4 = 2;
        if (i3 != 1) {
            if (i3 == 2) {
                return 3;
            }
            i4 = 4;
            if (i3 != 3) {
                if (i3 == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT < 30 || i3 != 5) {
                    throw new IllegalArgumentException(X.d.g("Could not convert ", i3, " to NetworkType"));
                }
                return 6;
            }
        }
        return i4;
    }

    public static final int t(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(X.d.g("Could not convert ", i3, " to OutOfQuotaPolicy"));
    }

    public static final int u(int i3) {
        if (i3 == 0) {
            return 1;
        }
        int i4 = 2;
        if (i3 != 1) {
            if (i3 == 2) {
                return 3;
            }
            i4 = 4;
            if (i3 != 3) {
                if (i3 == 4) {
                    return 5;
                }
                if (i3 == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(X.d.g("Could not convert ", i3, " to State"));
            }
        }
        return i4;
    }

    public static boolean v(int i3) {
        boolean z3;
        if (i3 != 0) {
            ThreadLocal threadLocal = A.a.f0a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i3);
            int green = Color.green(i3);
            int blue = Color.blue(i3);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d3 = red / 255.0d;
            double pow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = green / 255.0d;
            double pow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            double d5 = blue / 255.0d;
            double pow3 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            z3 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d6 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d6;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d6 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z3 = false;
        }
        return z3;
    }

    public static boolean w(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean x(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean y(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int z(int i3, int i4, float f3) {
        return A.a.b(A.a.d(i4, Math.round(Color.alpha(i4) * f3)), i3);
    }

    public abstract List d(List list, String str);

    public abstract void o(U0.u uVar, float f3, float f4);
}
