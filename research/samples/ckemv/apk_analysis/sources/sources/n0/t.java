package n0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import m0.C0329a;
import u0.InterfaceC0391a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4215a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0391a f4216b;
    public final v0.i c;

    /* renamed from: d, reason: collision with root package name */
    public final C0329a f4217d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f4218e;

    /* renamed from: f, reason: collision with root package name */
    public final v0.o f4219f;
    public final List g;

    public t(Context context, C0329a c0329a, v0.i iVar, InterfaceC0391a interfaceC0391a, WorkDatabase workDatabase, v0.o oVar, ArrayList arrayList) {
        new m0.r();
        this.f4215a = context.getApplicationContext();
        this.c = iVar;
        this.f4216b = interfaceC0391a;
        this.f4217d = c0329a;
        this.f4218e = workDatabase;
        this.f4219f = oVar;
        this.g = arrayList;
    }
}
