package v2;

import L1.u;
import L1.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import m2.o;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f5129a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f5130b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = o.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(o.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(t2.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(p2.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        f5130b = size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : x.R(linkedHashMap) : u.f623b;
    }
}
