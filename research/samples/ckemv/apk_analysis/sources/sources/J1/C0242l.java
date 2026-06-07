package j1;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: j1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242l {

    /* renamed from: a, reason: collision with root package name */
    public final String f3493a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3494b;
    public C0244n[] c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0231a f3495d;

    /* renamed from: e, reason: collision with root package name */
    public Map f3496e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0242l(String str, byte[] bArr, C0244n[] c0244nArr, EnumC0231a enumC0231a) {
        this(str, bArr, c0244nArr, enumC0231a, 0);
        System.currentTimeMillis();
    }

    public final void a(Map map) {
        if (map != null) {
            Map map2 = this.f3496e;
            if (map2 == null) {
                this.f3496e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void b(EnumC0243m enumC0243m, Object obj) {
        if (this.f3496e == null) {
            this.f3496e = new EnumMap(EnumC0243m.class);
        }
        this.f3496e.put(enumC0243m, obj);
    }

    public final String toString() {
        return this.f3493a;
    }

    public C0242l(String str, byte[] bArr, C0244n[] c0244nArr, EnumC0231a enumC0231a, int i3) {
        this.f3493a = str;
        this.f3494b = bArr;
        this.c = c0244nArr;
        this.f3495d = enumC0231a;
        this.f3496e = null;
    }
}
