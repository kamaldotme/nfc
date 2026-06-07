package a;

import I1.x;
import K1.f;
import N.o;
import N.r;
import N.s;
import N.t;
import W1.l;
import X1.g;
import Y1.d;
import Y1.e;
import Z.AbstractC0055w;
import a2.c;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.k;
import androidx.emoji2.text.p;
import androidx.emoji2.text.q;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.O0;
import m0.z;
import m2.h;
import m2.n;
import n2.b;
import o.C0348c;
import x.AbstractC0419i;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0059a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f1376a = true;

    public static f A(W1.a aVar) {
        return new f(aVar);
    }

    public static int B(int i3, Rect rect, Rect rect2) {
        int i4;
        int i5;
        if (i3 == 17) {
            i4 = rect.left;
            i5 = rect2.right;
        } else if (i3 == 33) {
            i4 = rect.top;
            i5 = rect2.bottom;
        } else if (i3 == 66) {
            i4 = rect2.left;
            i5 = rect.right;
        } else {
            if (i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i4 = rect2.top;
            i5 = rect.bottom;
        }
        return Math.max(0, i4 - i5);
    }

    public static Typeface C(Configuration configuration, Typeface typeface) {
        int i3;
        int i4;
        int weight;
        int i5;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i3 = configuration.fontWeightAdjustment;
        if (i3 == Integer.MAX_VALUE) {
            return null;
        }
        i4 = configuration.fontWeightAdjustment;
        if (i4 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i5 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, i(i5 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static int D(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final int E(d dVar, c cVar) {
        g.e(dVar, "<this>");
        if (cVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + cVar);
        }
        int i3 = cVar.f1424b;
        int i4 = cVar.c;
        if (i4 < Integer.MAX_VALUE) {
            return e.c.c(i3, i4 + 1);
        }
        if (i3 <= Integer.MIN_VALUE) {
            return e.c.b();
        }
        return e.c.c(i3 - 1, i4) + 1;
    }

    public static long F(String str, int i3) {
        int q3 = q(str, 0, i3, false);
        Matcher matcher = h.f4044m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (q3 < i3) {
            int q4 = q(str, q3 + 1, i3, true);
            matcher.region(q3, q4);
            if (i5 == -1 && matcher.usePattern(h.f4044m).matches()) {
                String group = matcher.group(1);
                g.d(group, "matcher.group(1)");
                i5 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                g.d(group2, "matcher.group(2)");
                i8 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                g.d(group3, "matcher.group(3)");
                i9 = Integer.parseInt(group3);
            } else if (i6 == -1 && matcher.usePattern(h.f4043l).matches()) {
                String group4 = matcher.group(1);
                g.d(group4, "matcher.group(1)");
                i6 = Integer.parseInt(group4);
            } else {
                if (i7 == -1) {
                    Pattern pattern = h.f4042k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        g.d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        g.d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        g.d(pattern2, "MONTH_PATTERN.pattern()");
                        i7 = d2.d.c0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(h.f4041j).matches()) {
                    String group6 = matcher.group(1);
                    g.d(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
            }
            q3 = q(str, q4 + 1, i3, false);
        }
        if (70 <= i4 && i4 < 100) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 < 70) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i7 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (1 > i6 || i6 >= 32) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i5 < 0 || i5 >= 24) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(b.f4251d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i7 - 1);
        gregorianCalendar.set(5, i6);
        gregorianCalendar.set(11, i5);
        gregorianCalendar.set(12, i8);
        gregorianCalendar.set(13, i9);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean H(String str) {
        g.e(str, "method");
        return (g.a(str, "GET") || g.a(str, "HEAD")) ? false : true;
    }

    public static void K(TextView textView, int i3) {
        z.j(i3);
        if (Build.VERSION.SDK_INT >= 28) {
            s.d(textView, i3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = o.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i3 + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void L(TextView textView, int i3) {
        z.j(i3);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = o.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i4);
        }
    }

    public static void M(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z3);
        } else if (f1376a) {
            try {
                viewGroup.suppressLayout(z3);
            } catch (NoSuchMethodError unused) {
                f1376a = false;
            }
        }
    }

    public static ActionMode.Callback N(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof t) || callback == null) ? callback : new t(callback, textView);
    }

    public static void a(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.h(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static z2.e b() {
        z2.e eVar = z2.e.f5334l;
        g.b(eVar);
        z2.e eVar2 = eVar.f5336f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            z2.e.f5331i.await(z2.e.f5332j, TimeUnit.MILLISECONDS);
            z2.e eVar3 = z2.e.f5334l;
            g.b(eVar3);
            if (eVar3.f5336f != null || System.nanoTime() - nanoTime < z2.e.f5333k) {
                return null;
            }
            return z2.e.f5334l;
        }
        long nanoTime2 = eVar2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            z2.e.f5331i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        z2.e eVar4 = z2.e.f5334l;
        g.b(eVar4);
        eVar4.f5336f = eVar2.f5336f;
        eVar2.f5336f = null;
        return eVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = B(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(int i3, Rect rect, Rect rect2, Rect rect3) {
        boolean d3 = d(i3, rect, rect2);
        if (d(i3, rect, rect3) || !d3) {
            return false;
        }
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static boolean d(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean e(A.g[] gVarArr, A.g[] gVarArr2) {
        if (gVarArr == null || gVarArr2 == null || gVarArr.length != gVarArr2.length) {
            return false;
        }
        for (int i3 = 0; i3 < gVarArr.length; i3++) {
            A.g gVar = gVarArr[i3];
            char c = gVar.f6a;
            A.g gVar2 = gVarArr2[i3];
            if (c != gVar2.f6a || gVar.f7b.length != gVar2.f7b.length) {
                return false;
            }
        }
        return true;
    }

    public static int i(int i3, int i4, int i5) {
        return i3 < i4 ? i4 : i3 > i5 ? i5 : i3;
    }

    public static final void j(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                v0.f.h(th, th2);
            }
        }
    }

    public static float[] k(float[] fArr, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i3, length);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X0.o l(String str, n nVar) {
        String str2;
        Charset forName;
        g.e(str, "<this>");
        Charset charset = d2.a.f2653a;
        Pattern pattern = n.c;
        String[] strArr = nVar.f4070b;
        int I2 = z.I(0, strArr.length - 1, 2);
        if (I2 >= 0) {
            int i3 = 0;
            while (!d2.l.Q(strArr[i3], "charset")) {
                if (i3 != I2) {
                    i3 += 2;
                }
            }
            str2 = strArr[i3 + 1];
            if (str2 != null) {
                try {
                    forName = Charset.forName(str2);
                } catch (IllegalArgumentException unused) {
                }
                if (forName == null) {
                    forName = d2.a.f2653a;
                    Pattern pattern2 = n.c;
                    String str3 = nVar + "; charset=utf-8";
                    g.e(str3, "<this>");
                    try {
                        nVar = u2.l.j(str3);
                    } catch (IllegalArgumentException unused2) {
                        nVar = null;
                    }
                }
                byte[] bytes = str.getBytes(forName);
                g.d(bytes, "this as java.lang.String).getBytes(charset)");
                int length = bytes.length;
                b.b(bytes.length, 0, length);
                return new X0.o(nVar, length, bytes, 0);
            }
            forName = null;
            if (forName == null) {
            }
            byte[] bytes2 = str.getBytes(forName);
            g.d(bytes2, "this as java.lang.String).getBytes(charset)");
            int length2 = bytes2.length;
            b.b(bytes2.length, 0, length2);
            return new X0.o(nVar, length2, bytes2, 0);
        }
        str2 = null;
        if (str2 != null) {
        }
        forName = null;
        if (forName == null) {
        }
        byte[] bytes22 = str.getBytes(forName);
        g.d(bytes22, "this as java.lang.String).getBytes(charset)");
        int length22 = bytes22.length;
        b.b(bytes22.length, 0, length22);
        return new X0.o(nVar, length22, bytes22, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Z.w, androidx.emoji2.text.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q m(Context context) {
        ProviderInfo providerInfo;
        G.e eVar;
        ApplicationInfo applicationInfo;
        U0.e eVar2 = Build.VERSION.SDK_INT >= 28 ? new U0.e(16) : new U0.e(16);
        PackageManager packageManager = context.getPackageManager();
        z.k(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] c = eVar2.c(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : c) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new G.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
            }
            if (eVar != null) {
                return null;
            }
            return new AbstractC0055w(new p(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x007f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[Catch: NumberFormatException -> 0x00af, LOOP:3: B:29:0x006d->B:39:0x009b, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:39:0x009b, B:43:0x00a1, B:48:0x00b6, B:60:0x00b9), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[Catch: NumberFormatException -> 0x00af, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:39:0x009b, B:43:0x00a1, B:48:0x00b6, B:60:0x00b9), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6 A[Catch: NumberFormatException -> 0x00af, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:39:0x009b, B:43:0x00a1, B:48:0x00b6, B:60:0x00b9), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, A.g] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, A.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static A.g[] o(String str) {
        String trim;
        int i3;
        float[] fArr;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < str.length()) {
            while (i6 < str.length()) {
                char charAt = str.charAt(i6);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i6++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i5, i6).trim();
                    if (trim.length() > 0) {
                        if (trim.charAt(i4) == 'z' || trim.charAt(i4) == 'Z') {
                            i3 = i4;
                            fArr = new float[i3];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i7 = i4;
                                int i8 = 1;
                                while (i8 < length) {
                                    int i9 = i4;
                                    int i10 = i9;
                                    int i11 = i10;
                                    int i12 = i11;
                                    for (int i13 = i8; i13 < trim.length(); i13++) {
                                        char charAt2 = trim.charAt(i13);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i13 != i8 && i9 == 0) {
                                                            i9 = 0;
                                                            i11 = 1;
                                                            i12 = 1;
                                                            break;
                                                        }
                                                        i9 = 0;
                                                        break;
                                                    case '.':
                                                        if (i10 == 0) {
                                                            i9 = 0;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i9 = 0;
                                                        i11 = 1;
                                                        i12 = 1;
                                                        break;
                                                    default:
                                                        i9 = 0;
                                                        break;
                                                }
                                            } else {
                                                i9 = 1;
                                            }
                                            if (i11 == 0) {
                                                if (i8 < i13) {
                                                    fArr2[i7] = Float.parseFloat(trim.substring(i8, i13));
                                                    i7++;
                                                }
                                                i8 = i12 == 0 ? i13 : i13 + 1;
                                                i4 = 0;
                                            }
                                        }
                                        i9 = 0;
                                        i11 = 1;
                                        if (i11 == 0) {
                                        }
                                    }
                                    if (i8 < i13) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    i4 = 0;
                                }
                                fArr = k(fArr2, i7);
                                i3 = 0;
                            } catch (NumberFormatException e3) {
                                throw new RuntimeException(X.d.i("error in parsing \"", trim, "\""), e3);
                            }
                        }
                        char charAt3 = trim.charAt(i3);
                        ?? obj = new Object();
                        obj.f6a = charAt3;
                        obj.f7b = fArr;
                        arrayList.add(obj);
                    }
                    i5 = i6;
                    i4 = 0;
                    i6++;
                }
                i6++;
            }
            trim = str.substring(i5, i6).trim();
            if (trim.length() > 0) {
            }
            i5 = i6;
            i4 = 0;
            i6++;
        }
        if (i6 - i5 == 1 && i5 < str.length()) {
            char charAt4 = str.charAt(i5);
            ?? obj2 = new Object();
            obj2.f6a = charAt4;
            obj2.f7b = new float[0];
            arrayList.add(obj2);
        }
        return (A.g[]) arrayList.toArray(new A.g[arrayList.size()]);
    }

    public static Path p(String str) {
        Path path = new Path();
        A.g[] o3 = o(str);
        if (o3 == null) {
            return null;
        }
        try {
            A.g.b(o3, path);
            return path;
        } catch (RuntimeException e3) {
            throw new RuntimeException("Error in parsing " + str, e3);
        }
    }

    public static int q(String str, int i3, int i4, boolean z3) {
        while (i3 < i4) {
            char charAt = str.charAt(i3);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z3)) {
                return i3;
            }
            i3++;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, A.g] */
    public static A.g[] r(A.g[] gVarArr) {
        if (gVarArr == null) {
            return null;
        }
        A.g[] gVarArr2 = new A.g[gVarArr.length];
        for (int i3 = 0; i3 < gVarArr.length; i3++) {
            A.g gVar = gVarArr[i3];
            ?? obj = new Object();
            obj.f6a = gVar.f6a;
            float[] fArr = gVar.f7b;
            obj.f7b = k(fArr, fArr.length);
            gVarArr2[i3] = obj;
        }
        return gVarArr2;
    }

    public static Drawable s(Context context, int i3) {
        return O0.c().e(context, i3);
    }

    public static Intent t(Activity activity) {
        Intent a3 = AbstractC0419i.a(activity);
        if (a3 != null) {
            return a3;
        }
        try {
            String v3 = v(activity, activity.getComponentName());
            if (v3 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, v3);
            try {
                return v(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static Intent u(Context context, ComponentName componentName) {
        String v3 = v(context, componentName);
        if (v3 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), v3);
        return v(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String v(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static H.e x(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new H.e(s.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a3 = N.q.a(textView);
        int d3 = N.q.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i3 < 28 || (textView.getInputType() & 15) != 3) {
                boolean z3 = N.p.b(textView) == 1;
                switch (N.p.c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(s.b(r.a(N.p.d(textView)))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new H.e(textPaint, textDirectionHeuristic, a3, d3);
    }

    public static int y(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 4) {
            return 2;
        }
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 32) {
            return 5;
        }
        if (i3 == 64) {
            return 6;
        }
        if (i3 == 128) {
            return 7;
        }
        if (i3 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(X.d.f("type needs to be >= FIRST and <= LAST, type=", i3));
    }

    public static boolean z(int i3, Rect rect, Rect rect2) {
        if (i3 == 17) {
            int i4 = rect.right;
            int i5 = rect2.right;
            return (i4 > i5 || rect.left >= i5) && rect.left > rect2.left;
        }
        if (i3 == 33) {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            return (i6 > i7 || rect.top >= i7) && rect.top > rect2.top;
        }
        if (i3 == 66) {
            int i8 = rect.left;
            int i9 = rect2.left;
            return (i8 < i9 || rect.right <= i9) && rect.right < rect2.right;
        }
        if (i3 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i10 = rect.top;
        int i11 = rect2.top;
        return (i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom;
    }

    public abstract Object G(Intent intent, int i3);

    public abstract void I(o.f fVar, o.f fVar2);

    public abstract void J(o.f fVar, Thread thread);

    public abstract boolean f(o.g gVar, C0348c c0348c, C0348c c0348c2);

    public abstract boolean g(o.g gVar, Object obj, Object obj2);

    public abstract boolean h(o.g gVar, o.f fVar, o.f fVar2);

    public abstract Intent n(k kVar, x xVar);

    public K.r w(k kVar, x xVar) {
        g.e(kVar, "context");
        return null;
    }
}
