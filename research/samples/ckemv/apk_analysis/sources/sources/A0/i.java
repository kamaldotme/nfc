package a0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import b0.AbstractC0102a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1401a;
    public final String c;
    public Executor g;
    public Executor h;

    /* renamed from: i, reason: collision with root package name */
    public e0.b f1406i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1407j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1410m;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f1414q;

    /* renamed from: b, reason: collision with root package name */
    public final Class f1402b = WorkDatabase.class;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1403d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1404e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1405f = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final int f1408k = 1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1409l = true;

    /* renamed from: n, reason: collision with root package name */
    public final long f1411n = -1;

    /* renamed from: o, reason: collision with root package name */
    public final A.h f1412o = new A.h(20);

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f1413p = new LinkedHashSet();

    public i(Context context, String str) {
        this.f1401a = context;
        this.c = str;
    }

    public final void a(AbstractC0102a... abstractC0102aArr) {
        if (this.f1414q == null) {
            this.f1414q = new HashSet();
        }
        for (AbstractC0102a abstractC0102a : abstractC0102aArr) {
            HashSet hashSet = this.f1414q;
            X1.g.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC0102a.f2217a));
            HashSet hashSet2 = this.f1414q;
            X1.g.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC0102a.f2218b));
        }
        this.f1412o.p((AbstractC0102a[]) Arrays.copyOf(abstractC0102aArr, abstractC0102aArr.length));
    }
}
