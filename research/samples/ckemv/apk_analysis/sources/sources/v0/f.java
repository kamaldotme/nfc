package v0;

import J.A;
import J.B;
import J.H;
import J.T;
import J.c0;
import a2.C0062a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e2.AbstractC0139v;
import e2.C0131m;
import e2.M;
import e2.N;
import f.C0150G;
import f0.C0167c;
import j2.t;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import m0.C0329a;

/* loaded from: classes.dex */
public abstract class f implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public static long f5072b;
    public static Method c;

    public static final boolean A(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }

    public static List B(Object obj) {
        List singletonList = Collections.singletonList(obj);
        X1.g.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static float G(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return N.e.c(edgeEffect, f3, f4);
        }
        N.d.a(edgeEffect, f3, f4);
        return f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m2.c H(m2.j jVar) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        String str;
        int i6;
        m2.j jVar2 = jVar;
        X1.g.e(jVar2, "headers");
        int size = jVar.size();
        int i7 = 0;
        boolean z4 = true;
        String str2 = null;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = -1;
        int i9 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i10 = -1;
        int i11 = -1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (i7 < size) {
            String b3 = jVar2.b(i7);
            String d3 = jVar2.d(i7);
            if (d2.l.Q(b3, "Cache-Control")) {
                if (str2 == null) {
                    str2 = d3;
                    i4 = 0;
                    while (i4 < d3.length()) {
                        int length = d3.length();
                        int i12 = i4;
                        while (true) {
                            if (i12 >= length) {
                                i5 = size;
                                i12 = d3.length();
                                break;
                            }
                            i5 = size;
                            if (d2.d.W("=,;", d3.charAt(i12))) {
                                break;
                            }
                            i12++;
                            size = i5;
                        }
                        String substring = d3.substring(i4, i12);
                        X1.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String obj = d2.d.n0(substring).toString();
                        if (i12 == d3.length() || d3.charAt(i12) == ',' || d3.charAt(i12) == ';') {
                            z3 = z4;
                            i4 = i12 + 1;
                            str = null;
                        } else {
                            int i13 = i12 + 1;
                            byte[] bArr = n2.b.f4249a;
                            int length2 = d3.length();
                            while (true) {
                                if (i13 >= length2) {
                                    i6 = 1;
                                    i13 = d3.length();
                                    break;
                                }
                                char charAt = d3.charAt(i13);
                                int i14 = length2;
                                if (charAt != ' ' && charAt != '\t') {
                                    i6 = 1;
                                    break;
                                }
                                i13++;
                                length2 = i14;
                            }
                            if (i13 < d3.length()) {
                                z3 = z4;
                                if (d3.charAt(i13) == '\"') {
                                    int i15 = i13 + i6;
                                    int b02 = d2.d.b0(d3, '\"', i15, false, 4);
                                    str = d3.substring(i15, b02);
                                    X1.g.d(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                    i4 = b02 + 1;
                                }
                            } else {
                                z3 = z4;
                            }
                            int length3 = d3.length();
                            int i16 = i13;
                            while (true) {
                                if (i16 >= length3) {
                                    i16 = d3.length();
                                    break;
                                }
                                int i17 = length3;
                                if (d2.d.W(",;", d3.charAt(i16))) {
                                    break;
                                }
                                i16++;
                                length3 = i17;
                            }
                            String substring2 = d3.substring(i13, i16);
                            X1.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            str = d2.d.n0(substring2).toString();
                            i4 = i16;
                        }
                        if (d2.l.Q("no-cache", obj)) {
                            size = i5;
                            z4 = z3;
                            z5 = true;
                        } else if (d2.l.Q("no-store", obj)) {
                            size = i5;
                            z4 = z3;
                            z6 = true;
                        } else {
                            if (d2.l.Q("max-age", obj)) {
                                i8 = n2.b.w(str, -1);
                            } else if (d2.l.Q("s-maxage", obj)) {
                                i9 = n2.b.w(str, -1);
                            } else if (d2.l.Q("private", obj)) {
                                size = i5;
                                z4 = z3;
                                z7 = true;
                            } else if (d2.l.Q("public", obj)) {
                                size = i5;
                                z4 = z3;
                                z8 = true;
                            } else if (d2.l.Q("must-revalidate", obj)) {
                                size = i5;
                                z4 = z3;
                                z9 = true;
                            } else if (d2.l.Q("max-stale", obj)) {
                                i10 = n2.b.w(str, Integer.MAX_VALUE);
                            } else if (d2.l.Q("min-fresh", obj)) {
                                i11 = n2.b.w(str, -1);
                            } else if (d2.l.Q("only-if-cached", obj)) {
                                size = i5;
                                z4 = z3;
                                z10 = true;
                            } else if (d2.l.Q("no-transform", obj)) {
                                size = i5;
                                z4 = z3;
                                z11 = true;
                            } else if (d2.l.Q("immutable", obj)) {
                                size = i5;
                                z4 = z3;
                                z12 = true;
                            }
                            size = i5;
                            z4 = z3;
                        }
                    }
                    i3 = size;
                    i7++;
                    jVar2 = jVar;
                    size = i3;
                }
            } else if (!d2.l.Q(b3, "Pragma")) {
                i3 = size;
                i7++;
                jVar2 = jVar;
                size = i3;
            }
            z4 = false;
            i4 = 0;
            while (i4 < d3.length()) {
            }
            i3 = size;
            i7++;
            jVar2 = jVar;
            size = i3;
        }
        return new m2.c(z5, z6, i8, i9, z7, z8, z9, i10, i11, z10, z11, z12, !z4 ? null : str2);
    }

    public static void I(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j3 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Animator animator = (Animator) arrayList.get(i3);
            j3 = Math.max(j3, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j3);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static void J(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        B.b.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static int K(float f3) {
        return (int) (f3 + (f3 < 0.0f ? -0.5f : 0.5f));
    }

    public static void L(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = T.f402a;
        boolean a3 = A.a(checkableImageButton);
        boolean z3 = onLongClickListener != null;
        boolean z4 = a3 || z3;
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(a3);
        checkableImageButton.setPressable(a3);
        checkableImageButton.setLongClickable(z3);
        B.s(checkableImageButton, z4 ? 1 : 2);
    }

    public static void M(View view, U0.g gVar) {
        N0.a aVar = gVar.f906b.f888b;
        if (aVar == null || !aVar.f681a) {
            return;
        }
        float f3 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = T.f402a;
            f3 += H.i((View) parent);
        }
        U0.f fVar = gVar.f906b;
        if (fVar.f896m != f3) {
            fVar.f896m = f3;
            gVar.n();
        }
    }

    public static final Object N(t tVar, t tVar2, W1.p pVar) {
        Object c0131m;
        Object L2;
        M m3;
        try {
            X1.m.a(2, pVar);
            c0131m = pVar.e(tVar2, tVar);
        } catch (Throwable th) {
            c0131m = new C0131m(th, false);
        }
        P1.a aVar = P1.a.f784b;
        if (c0131m == aVar || (L2 = tVar.L(c0131m)) == AbstractC0139v.f2825e) {
            return aVar;
        }
        if (L2 instanceof C0131m) {
            throw ((C0131m) L2).f2814a;
        }
        N n3 = L2 instanceof N ? (N) L2 : null;
        return (n3 == null || (m3 = n3.f2779a) == null) ? L2 : m3;
    }

    public static int O(int[] iArr) {
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        return i3;
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [z2.f, java.lang.Object] */
    public static final String P(String str) {
        X1.g.e(str, "<this>");
        int i3 = 0;
        int i4 = -1;
        if (!d2.d.X(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                X1.g.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                X1.g.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                X1.g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = lowerCase.charAt(i5);
                    if (X1.g.f(charAt, 31) <= 0 || X1.g.f(charAt, 127) >= 0 || d2.d.b0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress r3 = (d2.l.V(str, "[", false) && d2.l.P(str, "]")) ? r(1, str.length() - 1, str) : r(0, str.length(), str);
        if (r3 == null) {
            return null;
        }
        byte[] address = r3.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return r3.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < address.length) {
            int i8 = i6;
            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i4 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        ?? obj = new Object();
        while (i3 < address.length) {
            if (i3 == i4) {
                obj.L(58);
                i3 += i7;
                if (i3 == 16) {
                    obj.L(58);
                }
            } else {
                if (i3 > 0) {
                    obj.L(58);
                }
                byte b3 = address[i3];
                byte[] bArr = n2.b.f4249a;
                obj.M(((b3 & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return obj.A(obj.c, d2.a.f2653a);
    }

    public static void h(Throwable th, Throwable th2) {
        X1.g.e(th, "<this>");
        X1.g.e(th2, "exception");
        if (th != th2) {
            Integer num = S1.a.f866a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = R1.a.f846a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void i(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                B.b.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                B.b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                B.b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final boolean j(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        X1.g.e(bArr, "a");
        X1.g.e(bArr2, "b");
        for (int i6 = 0; i6 < i5; i6++) {
            if (bArr[i6 + i3] != bArr2[i6 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static M1.b k(M1.b bVar) {
        if (bVar.f634f != null) {
            throw new IllegalStateException();
        }
        bVar.g();
        bVar.f633e = true;
        return bVar.f632d > 0 ? bVar : M1.b.h;
    }

    public static final void l(WorkDatabase workDatabase, C0329a c0329a, n0.n nVar) {
        int i3;
        X1.g.e(c0329a, "configuration");
        X1.g.e(nVar, "continuation");
        ArrayList arrayList = new ArrayList(new L1.h(new n0.n[]{nVar}, true));
        int i4 = 0;
        while (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            List list = ((n0.n) arrayList.remove(L1.l.Q(arrayList))).h;
            X1.g.d(list, "current.work");
            if (list.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it = list.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if ((!((m0.A) it.next()).f3952b.f5097j.h.isEmpty()) && (i3 = i3 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i4 += i3;
        }
        if (i4 == 0) {
            return;
        }
        p u3 = workDatabase.u();
        u3.getClass();
        a0.j a3 = a0.j.a("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        WorkDatabase workDatabase2 = u3.f5111a;
        workDatabase2.b();
        Cursor n3 = workDatabase2.n(a3, null);
        try {
            int i5 = n3.moveToFirst() ? n3.getInt(0) : 0;
            n3.close();
            a3.o();
            int i6 = i5 + i4;
            int i7 = c0329a.h;
            if (i6 <= i7) {
                return;
            }
            throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + i7 + ";\nalready enqueued count: " + i5 + ";\ncurrent enqueue operation count: " + i4 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
        } catch (Throwable th) {
            n3.close();
            a3.o();
            throw th;
        }
    }

    public static final void m(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException("size=" + j3 + " offset=" + j4 + " byteCount=" + j5);
        }
    }

    public static void n(int i3) {
        C0062a c0062a = new C0062a(2, 36, 1);
        if (2 > i3 || i3 > c0062a.c) {
            throw new IllegalArgumentException("radix " + i3 + " was not in valid range " + new C0062a(2, 36, 1));
        }
    }

    public static ImageView.ScaleType o(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 5 ? i3 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, u2.l] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u2.l] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, u2.l] */
    public static u2.l p(int i3) {
        if (i3 != 0 && i3 == 1) {
            return new Object();
        }
        return new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static O1.d q(W1.p pVar, Object obj, O1.d dVar) {
        X1.g.e(dVar, "completion");
        return ((Q1.b) pVar).b(dVar, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress r(int i3, int i4, String str) {
        int i5;
        int i6;
        int i7;
        int i8 = 16;
        byte[] bArr = new byte[16];
        boolean z3 = false;
        int i9 = i3;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i9 >= i4) {
                i5 = i8;
                break;
            }
            if (i10 != i8) {
                int i13 = i9 + 2;
                if (i13 <= i4 && d2.l.U(str, "::", i9, z3)) {
                    if (i11 == -1) {
                        i10 += 2;
                        if (i13 != i4) {
                            i11 = i10;
                            i12 = i13;
                            i9 = i12;
                            int i14 = 0;
                            while (i9 < i4) {
                            }
                            i7 = i9 - i12;
                            if (i7 == 0) {
                                break;
                            }
                            break;
                        }
                        i5 = i8;
                        i11 = i10;
                        break;
                    }
                    return null;
                }
                if (i10 != 0) {
                    if (!d2.l.U(str, ":", i9, z3)) {
                        if (d2.l.U(str, ".", i9, z3)) {
                            int i15 = i10 - 2;
                            int i16 = i15;
                            loop2: while (true) {
                                if (i12 < i4) {
                                    if (i16 == i8) {
                                        break;
                                    }
                                    if (i16 != i15) {
                                        if (str.charAt(i12) != '.') {
                                            break;
                                        }
                                        i12++;
                                    }
                                    ?? r14 = z3;
                                    int i17 = i12;
                                    while (i17 < i4) {
                                        char charAt = str.charAt(i17);
                                        if (X1.g.f(charAt, 48) < 0 || X1.g.f(charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 == 0 && i12 != i17) || (i6 = ((r14 * 10) + charAt) - 48) > 255) {
                                            break loop2;
                                        }
                                        i17++;
                                        r14 = i6;
                                    }
                                    if (i17 - i12 == 0) {
                                        break;
                                    }
                                    bArr[i16] = (byte) r14;
                                    i16++;
                                    i12 = i17;
                                    i8 = 16;
                                    z3 = false;
                                } else if (i16 == i10 + 2) {
                                    i10 += 2;
                                    i5 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i9++;
                }
                i12 = i9;
                i9 = i12;
                int i142 = 0;
                while (i9 < i4) {
                    int q3 = n2.b.q(str.charAt(i9));
                    if (q3 == -1) {
                        break;
                    }
                    i142 = (i142 << 4) + q3;
                    i9++;
                }
                i7 = i9 - i12;
                if (i7 == 0 || i7 > 4) {
                    break;
                }
                int i18 = i10 + 1;
                bArr[i10] = (byte) ((i142 >>> 8) & 255);
                i10 += 2;
                bArr[i18] = (byte) (i142 & 255);
                i8 = 16;
                z3 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    public static float s(float f3, float f4, float f5, float f6) {
        double d3 = f3 - f5;
        double d4 = f4 - f6;
        return (float) Math.sqrt((d4 * d4) + (d3 * d3));
    }

    public static float t(int i3, int i4, int i5, int i6) {
        double d3 = i3 - i5;
        double d4 = i4 - i6;
        return (float) Math.sqrt((d4 * d4) + (d3 * d3));
    }

    public static final boolean u(char c3, char c4, boolean z3) {
        if (c3 == c4) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c4);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static m2.p v(String str) {
        if (X1.g.a(str, "http/1.0")) {
            return m2.p.HTTP_1_0;
        }
        if (X1.g.a(str, "http/1.1")) {
            return m2.p.HTTP_1_1;
        }
        if (X1.g.a(str, "h2_prior_knowledge")) {
            return m2.p.H2_PRIOR_KNOWLEDGE;
        }
        if (X1.g.a(str, "h2")) {
            return m2.p.HTTP_2;
        }
        if (X1.g.a(str, "spdy/3.1")) {
            return m2.p.SPDY_3;
        }
        if (X1.g.a(str, "quic")) {
            return m2.p.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static float w(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return N.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static C0167c x(C0150G c0150g, SQLiteDatabase sQLiteDatabase) {
        X1.g.e(c0150g, "refHolder");
        X1.g.e(sQLiteDatabase, "sqLiteDatabase");
        C0167c c0167c = (C0167c) c0150g.f2846b;
        if (c0167c != null && X1.g.a(c0167c.f3011b, sQLiteDatabase)) {
            return c0167c;
        }
        C0167c c0167c2 = new C0167c(sQLiteDatabase);
        c0150g.f2846b = c0167c2;
        return c0167c2;
    }

    public static O1.d y(O1.d dVar) {
        X1.g.e(dVar, "<this>");
        Q1.b bVar = dVar instanceof Q1.b ? (Q1.b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        O1.d dVar2 = bVar.f822d;
        if (dVar2 != null) {
            return dVar2;
        }
        O1.i iVar = bVar.c;
        X1.g.b(iVar);
        O1.f fVar = (O1.f) iVar.A(O1.e.f781b);
        O1.d hVar = fVar != null ? new j2.h((e2.r) fVar, bVar) : bVar;
        bVar.f822d = hVar;
        return hVar;
    }

    public static boolean z() {
        boolean isEnabled;
        try {
            if (c == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (c == null) {
                f5072b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) c.invoke(null, Long.valueOf(f5072b))).booleanValue();
        } catch (Exception e3) {
            if (!(e3 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public abstract View C(int i3);

    public abstract void D(int i3);

    public abstract void E(Typeface typeface, boolean z3);

    public abstract boolean F();

    @Override // J.c0
    public void e(View view) {
    }

    @Override // J.c0
    public void g() {
    }
}
