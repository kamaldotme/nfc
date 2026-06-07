package a0;

import android.database.sqlite.SQLiteException;
import androidx.work.impl.WorkDatabase;
import f0.C0167c;
import f0.C0173i;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f1389m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f1390a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f1391b;
    public final LinkedHashMap c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f1392d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1393e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1394f;
    public volatile C0173i g;
    public final G1.a h;

    /* renamed from: i, reason: collision with root package name */
    public final m.f f1395i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1396j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1397k;

    /* renamed from: l, reason: collision with root package name */
    public final F0.h f1398l;

    public f(WorkDatabase workDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        X1.g.e(workDatabase, "database");
        this.f1390a = workDatabase;
        this.f1391b = hashMap;
        this.f1393e = new AtomicBoolean(false);
        this.h = new G1.a(strArr.length);
        X1.g.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f1395i = new m.f();
        this.f1396j = new Object();
        this.f1397k = new Object();
        this.c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            String str2 = strArr[i3];
            Locale locale = Locale.US;
            X1.g.d(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            X1.g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.c.put(lowerCase, Integer.valueOf(i3));
            String str3 = (String) this.f1391b.get(strArr[i3]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                X1.g.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i3] = lowerCase;
        }
        this.f1392d = strArr2;
        for (Map.Entry entry : this.f1391b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            X1.g.d(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            X1.g.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                X1.g.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.c;
                X1.g.e(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase2);
                if (obj == null && !linkedHashMap.containsKey(lowerCase2)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase2) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase3, obj);
            }
        }
        this.f1398l = new F0.h(6, this);
    }

    public final boolean a() {
        if (!this.f1390a.l()) {
            return false;
        }
        if (!this.f1394f) {
            this.f1390a.h().s();
        }
        return this.f1394f;
    }

    public final void b(C0167c c0167c, int i3) {
        c0167c.A("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i3 + ", 0)");
        String str = this.f1392d[i3];
        String[] strArr = f1389m;
        for (int i4 = 0; i4 < 3; i4++) {
            String str2 = strArr[i4];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + u2.d.q(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i3 + " AND invalidated = 0; END";
            X1.g.d(str3, "StringBuilder().apply(builderAction).toString()");
            c0167c.A(str3);
        }
    }

    public final void c(C0167c c0167c) {
        X1.g.e(c0167c, "database");
        if (c0167c.G()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f1390a.h.readLock();
            X1.g.d(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f1396j) {
                    int[] b3 = this.h.b();
                    if (b3 == null) {
                        return;
                    }
                    if (c0167c.I()) {
                        c0167c.b();
                    } else {
                        c0167c.a();
                    }
                    try {
                        int length = b3.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = b3[i3];
                            int i6 = i4 + 1;
                            if (i5 == 1) {
                                b(c0167c, i4);
                            } else if (i5 == 2) {
                                String str = this.f1392d[i4];
                                String[] strArr = f1389m;
                                for (int i7 = 0; i7 < 3; i7++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + u2.d.q(str, strArr[i7]);
                                    X1.g.d(str2, "StringBuilder().apply(builderAction).toString()");
                                    c0167c.A(str2);
                                }
                            }
                            i3++;
                            i4 = i6;
                        }
                        c0167c.M();
                        c0167c.o();
                    } catch (Throwable th) {
                        c0167c.o();
                        throw th;
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }
}
