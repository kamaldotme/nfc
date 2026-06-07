package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2032a = new LinkedHashMap();

    public final void a() {
        for (M m3 : this.f2032a.values()) {
            HashMap hashMap = m3.f2028a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object obj : m3.f2028a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = m3.f2029b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : m3.f2029b) {
                            if (closeable instanceof Closeable) {
                                try {
                                    closeable.close();
                                } catch (IOException e4) {
                                    throw new RuntimeException(e4);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            m3.a();
        }
        this.f2032a.clear();
    }
}
