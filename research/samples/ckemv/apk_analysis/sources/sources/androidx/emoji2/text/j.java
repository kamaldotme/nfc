package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m0.z;
import n.C0334c;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f1768i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile j f1769j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1770a;

    /* renamed from: b, reason: collision with root package name */
    public final C0334c f1771b;
    public volatile int c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1772d;

    /* renamed from: e, reason: collision with root package name */
    public final f f1773e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1774f;
    public final int g;
    public final d h;

    public j(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1770a = reentrantReadWriteLock;
        this.c = 3;
        i iVar = (i) qVar.f1367b;
        this.f1774f = iVar;
        int i3 = qVar.f1366a;
        this.g = i3;
        this.h = (d) qVar.c;
        this.f1772d = new Handler(Looper.getMainLooper());
        this.f1771b = new C0334c();
        f fVar = new f(this);
        this.f1773e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.f1770a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.j(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f1768i) {
            try {
                jVar = f1769j;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f1770a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f1770a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f1770a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.f1770a.writeLock().unlock();
            f fVar = this.f1773e;
            j jVar = fVar.f1766a;
            try {
                jVar.f1774f.j(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f1770a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1770a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.f1771b);
            this.f1771b.clear();
            this.f1770a.writeLock().unlock();
            this.f1772d.post(new G.a(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.f1770a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f1770a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.f1771b);
            this.f1771b.clear();
            this.f1770a.writeLock().unlock();
            this.f1772d.post(new G.a(arrayList, this.c, (Throwable) null));
        } catch (Throwable th) {
            this.f1770a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016d A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:119:0x005a, B:122:0x005f, B:124:0x0063, B:126:0x0070, B:29:0x0083, B:31:0x008d, B:33:0x0090, B:35:0x0094, B:37:0x00a4, B:39:0x00a7, B:43:0x00b4, B:46:0x00bc, B:51:0x00db, B:75:0x00e7, B:79:0x00f3, B:80:0x00fd, B:63:0x0113, B:66:0x011a, B:54:0x011f, B:56:0x012a, B:85:0x0131, B:87:0x0135, B:89:0x013b, B:91:0x013f, B:94:0x0147, B:97:0x0153, B:98:0x0158, B:100:0x016d, B:27:0x0079), top: B:118:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:119:0x005a, B:122:0x005f, B:124:0x0063, B:126:0x0070, B:29:0x0083, B:31:0x008d, B:33:0x0090, B:35:0x0094, B:37:0x00a4, B:39:0x00a7, B:43:0x00b4, B:46:0x00bc, B:51:0x00db, B:75:0x00e7, B:79:0x00f3, B:80:0x00fd, B:63:0x0113, B:66:0x011a, B:54:0x011f, B:56:0x012a, B:85:0x0131, B:87:0x0135, B:89:0x013b, B:91:0x013f, B:94:0x0147, B:97:0x0153, B:98:0x0158, B:100:0x016d, B:27:0x0079), top: B:118:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0153 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:119:0x005a, B:122:0x005f, B:124:0x0063, B:126:0x0070, B:29:0x0083, B:31:0x008d, B:33:0x0090, B:35:0x0094, B:37:0x00a4, B:39:0x00a7, B:43:0x00b4, B:46:0x00bc, B:51:0x00db, B:75:0x00e7, B:79:0x00f3, B:80:0x00fd, B:63:0x0113, B:66:0x011a, B:54:0x011f, B:56:0x012a, B:85:0x0131, B:87:0x0135, B:89:0x013b, B:91:0x013f, B:94:0x0147, B:97:0x0153, B:98:0x0158, B:100:0x016d, B:27:0x0079), top: B:118:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence f(CharSequence charSequence, int i3, int i4) {
        o oVar;
        int codePointAt;
        w wVar;
        int i5;
        int a3;
        u[] uVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        z.i(i3 <= i4, "start should be <= than end");
        w wVar2 = null;
        if (charSequence == null) {
            return null;
        }
        z.i(i3 <= charSequence.length(), "start should be < than charSequence length");
        z.i(i4 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i3 == i4) {
            return charSequence;
        }
        v0.m mVar = this.f1773e.f1767b;
        mVar.getClass();
        boolean z3 = charSequence instanceof t;
        if (z3) {
            ((t) charSequence).a();
        }
        if (!z3) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i3 - 1, i4 + 1, u.class) <= i4) {
                        wVar2 = new w(charSequence);
                    }
                    if (wVar2 != null && (uVarArr = (u[]) wVar2.c.getSpans(i3, i4, u.class)) != null && uVarArr.length > 0) {
                        for (u uVar : uVarArr) {
                            int spanStart = wVar2.c.getSpanStart(uVar);
                            int spanEnd = wVar2.c.getSpanEnd(uVar);
                            if (spanStart != i4) {
                                wVar2.removeSpan(uVar);
                            }
                            i3 = Math.min(spanStart, i3);
                            i4 = Math.max(spanEnd, i4);
                        }
                    }
                    if (i3 != i4 && i3 < charSequence.length()) {
                        oVar = new o((r) ((v0.i) mVar.f5087d).f5077d);
                        codePointAt = Character.codePointAt(charSequence, i3);
                        int i6 = 0;
                        wVar = wVar2;
                        loop1: while (true) {
                            i5 = i3;
                            while (i3 < i4 && i6 < Integer.MAX_VALUE) {
                                a3 = oVar.a(codePointAt);
                                if (a3 != 1) {
                                    i5 += Character.charCount(Character.codePointAt(charSequence, i5));
                                    if (i5 < i4) {
                                        codePointAt = Character.codePointAt(charSequence, i5);
                                    }
                                    i3 = i5;
                                } else if (a3 == 2) {
                                    i3 += Character.charCount(codePointAt);
                                    if (i3 < i4) {
                                        codePointAt = Character.codePointAt(charSequence, i3);
                                    }
                                } else if (a3 == 3) {
                                    if (!mVar.y(charSequence, i5, i3, oVar.f1785d.f1795b)) {
                                        if (wVar == null) {
                                            wVar = new w((Spannable) new SpannableString(charSequence));
                                        }
                                        n nVar = oVar.f1785d.f1795b;
                                        ((U0.e) mVar.c).getClass();
                                        wVar.setSpan(new u(nVar), i5, i3, 33);
                                        i6++;
                                    }
                                }
                            }
                        }
                        if (oVar.f1783a == 2 && oVar.c.f1795b != null && ((oVar.f1787f > 1 || oVar.c()) && i6 < Integer.MAX_VALUE && !mVar.y(charSequence, i5, i3, oVar.c.f1795b))) {
                            if (wVar == null) {
                                wVar = new w(charSequence);
                            }
                            n nVar2 = oVar.c.f1795b;
                            ((U0.e) mVar.c).getClass();
                            wVar.setSpan(new u(nVar2), i5, i3, 33);
                        }
                        if (wVar != null) {
                            if (!z3) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = wVar.c;
                        if (z3) {
                            ((t) charSequence).b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z3) {
                    ((t) charSequence).b();
                }
            }
        }
        wVar2 = new w((Spannable) charSequence);
        if (wVar2 != null) {
            while (r7 < r6) {
            }
        }
        if (i3 != i4) {
            oVar = new o((r) ((v0.i) mVar.f5087d).f5077d);
            codePointAt = Character.codePointAt(charSequence, i3);
            int i62 = 0;
            wVar = wVar2;
            loop1: while (true) {
                i5 = i3;
                while (i3 < i4) {
                    a3 = oVar.a(codePointAt);
                    if (a3 != 1) {
                    }
                }
            }
            if (oVar.f1783a == 2) {
                if (wVar == null) {
                }
                n nVar22 = oVar.c.f1795b;
                ((U0.e) mVar.c).getClass();
                wVar.setSpan(new u(nVar22), i5, i3, 33);
            }
            if (wVar != null) {
            }
        }
        return charSequence;
    }

    public final void g(h hVar) {
        z.k(hVar, "initCallback cannot be null");
        this.f1770a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.f1771b.add(hVar);
                this.f1770a.writeLock().unlock();
            }
            this.f1772d.post(new G.a(Arrays.asList(hVar), this.c, (Throwable) null));
            this.f1770a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1770a.writeLock().unlock();
            throw th;
        }
    }
}
