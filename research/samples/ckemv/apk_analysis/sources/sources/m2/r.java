package m2;

import java.io.Closeable;
import k.C0306s;

/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final C0306s f4110b;
    public final p c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4111d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4112e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4113f;
    public final j g;
    public final s h;

    /* renamed from: i, reason: collision with root package name */
    public final r f4114i;

    /* renamed from: j, reason: collision with root package name */
    public final r f4115j;

    /* renamed from: k, reason: collision with root package name */
    public final r f4116k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4117l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4118m;

    /* renamed from: n, reason: collision with root package name */
    public final q2.e f4119n;

    public r(C0306s c0306s, p pVar, String str, int i3, i iVar, j jVar, s sVar, r rVar, r rVar2, r rVar3, long j3, long j4, q2.e eVar) {
        this.f4110b = c0306s;
        this.c = pVar;
        this.f4111d = str;
        this.f4112e = i3;
        this.f4113f = iVar;
        this.g = jVar;
        this.h = sVar;
        this.f4114i = rVar;
        this.f4115j = rVar2;
        this.f4116k = rVar3;
        this.f4117l = j3;
        this.f4118m = j4;
        this.f4119n = eVar;
    }

    public static String a(String str, r rVar) {
        rVar.getClass();
        String a3 = rVar.g.a(str);
        if (a3 == null) {
            return null;
        }
        return a3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m2.q] */
    public final q b() {
        ?? obj = new Object();
        obj.f4100a = this.f4110b;
        obj.f4101b = this.c;
        obj.c = this.f4112e;
        obj.f4102d = this.f4111d;
        obj.f4103e = this.f4113f;
        obj.f4104f = this.g.c();
        obj.g = this.h;
        obj.h = this.f4114i;
        obj.f4105i = this.f4115j;
        obj.f4106j = this.f4116k;
        obj.f4107k = this.f4117l;
        obj.f4108l = this.f4118m;
        obj.f4109m = this.f4119n;
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        s sVar = this.h;
        if (sVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        sVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.c + ", code=" + this.f4112e + ", message=" + this.f4111d + ", url=" + ((l) this.f4110b.f3771b) + '}';
    }
}
