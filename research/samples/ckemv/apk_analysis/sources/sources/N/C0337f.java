package n;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0337f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4144a;

    /* renamed from: b, reason: collision with root package name */
    public int f4145b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public int f4146d;

    /* renamed from: e, reason: collision with root package name */
    public int f4147e;

    public C0337f(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i3;
        this.f4144a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f4144a.get(obj);
                if (obj2 != null) {
                    this.f4146d++;
                    return obj2;
                }
                this.f4147e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f4145b++;
                put = this.f4144a.put(obj, obj2);
                if (put != null) {
                    this.f4145b--;
                }
            } finally {
            }
        }
        int i3 = this.c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f4145b < 0 || (this.f4144a.isEmpty() && this.f4145b != 0)) {
                        break;
                    }
                    if (this.f4145b <= i3 || this.f4144a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f4144a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f4144a.remove(key);
                    this.f4145b--;
                } finally {
                }
            }
        }
        return put;
    }

    public final synchronized String toString() {
        int i3;
        try {
            int i4 = this.f4146d;
            int i5 = this.f4147e + i4;
            i3 = i5 != 0 ? (i4 * 100) / i5 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.c + ",hits=" + this.f4146d + ",misses=" + this.f4147e + ",hitRate=" + i3 + "%]";
    }
}
