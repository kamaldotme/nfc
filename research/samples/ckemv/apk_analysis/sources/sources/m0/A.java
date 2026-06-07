package m0;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f3951a;

    /* renamed from: b, reason: collision with root package name */
    public final v0.o f3952b;
    public final Set c;

    public A(UUID uuid, v0.o oVar, LinkedHashSet linkedHashSet) {
        X1.g.e(uuid, "id");
        X1.g.e(oVar, "workSpec");
        X1.g.e(linkedHashSet, "tags");
        this.f3951a = uuid;
        this.f3952b = oVar;
        this.c = linkedHashSet;
    }
}
