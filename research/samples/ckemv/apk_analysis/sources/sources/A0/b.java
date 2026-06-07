package a0;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1378b;
    public final e0.b c;

    /* renamed from: d, reason: collision with root package name */
    public final A.h f1379d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1380e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1381f;
    public final int g;
    public final Executor h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f1382i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1383j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1384k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f1385l;

    /* renamed from: m, reason: collision with root package name */
    public final List f1386m;

    /* renamed from: n, reason: collision with root package name */
    public final List f1387n;

    public b(Context context, String str, e0.b bVar, A.h hVar, ArrayList arrayList, boolean z3, int i3, Executor executor, Executor executor2, boolean z4, boolean z5, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        X1.g.e(context, "context");
        X1.g.e(hVar, "migrationContainer");
        X.d.o("journalMode", i3);
        X1.g.e(arrayList2, "typeConverters");
        X1.g.e(arrayList3, "autoMigrationSpecs");
        this.f1377a = context;
        this.f1378b = str;
        this.c = bVar;
        this.f1379d = hVar;
        this.f1380e = arrayList;
        this.f1381f = z3;
        this.g = i3;
        this.h = executor;
        this.f1382i = executor2;
        this.f1383j = z4;
        this.f1384k = z5;
        this.f1385l = linkedHashSet;
        this.f1386m = arrayList2;
        this.f1387n = arrayList3;
    }

    public final boolean a(int i3, int i4) {
        if ((i3 > i4 && this.f1384k) || !this.f1383j) {
            return false;
        }
        Set set = this.f1385l;
        return set == null || !set.contains(Integer.valueOf(i3));
    }
}
