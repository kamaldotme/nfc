package p2;

import X1.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import u2.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f4357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4358b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public a f4359d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4360e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4361f;

    public c(d dVar, String str) {
        g.e(dVar, "taskRunner");
        g.e(str, "name");
        this.f4357a = dVar;
        this.f4358b = str;
        this.f4360e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = n2.b.f4249a;
        synchronized (this.f4357a) {
            if (b()) {
                this.f4357a.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f4359d;
        if (aVar != null && aVar.f4353b) {
            this.f4361f = true;
        }
        ArrayList arrayList = this.f4360e;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f4353b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.f4362i.isLoggable(Level.FINE)) {
                    l.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void c(a aVar, long j3) {
        g.e(aVar, "task");
        synchronized (this.f4357a) {
            if (!this.c) {
                if (d(aVar, j3, false)) {
                    this.f4357a.e(this);
                }
            } else if (aVar.f4353b) {
                d dVar = d.h;
                if (d.f4362i.isLoggable(Level.FINE)) {
                    l.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                d dVar2 = d.h;
                if (d.f4362i.isLoggable(Level.FINE)) {
                    l.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j3, boolean z3) {
        g.e(aVar, "task");
        c cVar = aVar.c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            aVar.c = this;
        }
        this.f4357a.f4363a.getClass();
        long nanoTime = System.nanoTime();
        long j4 = nanoTime + j3;
        ArrayList arrayList = this.f4360e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f4354d <= j4) {
                if (d.f4362i.isLoggable(Level.FINE)) {
                    l.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f4354d = j4;
        if (d.f4362i.isLoggable(Level.FINE)) {
            l.a(aVar, this, z3 ? "run again after ".concat(l.i(j4 - nanoTime)) : "scheduled after ".concat(l.i(j4 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (((a) it.next()).f4354d - nanoTime > j3) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            i3 = arrayList.size();
        }
        arrayList.add(i3, aVar);
        return i3 == 0;
    }

    public final void e() {
        byte[] bArr = n2.b.f4249a;
        synchronized (this.f4357a) {
            this.c = true;
            if (b()) {
                this.f4357a.e(this);
            }
        }
    }

    public final String toString() {
        return this.f4358b;
    }
}
