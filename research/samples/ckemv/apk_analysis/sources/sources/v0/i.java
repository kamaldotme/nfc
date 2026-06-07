package v0;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase;
import f.ExecutorC0145B;
import i.AbstractC0184b;
import i.InterfaceC0183a;
import j.MenuC0191C;
import j.MenuC0207m;
import j.MenuItemC0214t;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.z;
import n.C0336e;
import n.C0342k;

/* loaded from: classes.dex */
public final class i implements InterfaceC0183a {

    /* renamed from: b, reason: collision with root package name */
    public Object f5076b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5077d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5078e;

    public i(int i3) {
        switch (i3) {
            case 4:
                this.c = new ArrayDeque();
                this.f5077d = new ArrayDeque();
                this.f5078e = new ArrayDeque();
                return;
            case 7:
                this.f5076b = new I.b(10);
                this.c = new C0342k();
                this.f5077d = new ArrayList();
                this.f5078e = new HashSet();
                return;
            default:
                this.f5076b = new C0342k();
                this.c = new SparseArray();
                this.f5077d = new C0336e();
                this.f5078e = new C0342k();
                return;
        }
    }

    @Override // i.InterfaceC0183a
    public boolean a(AbstractC0184b abstractC0184b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f5076b).onActionItemClicked(h(abstractC0184b), new MenuItemC0214t((Context) this.c, (C.a) menuItem));
    }

    @Override // i.InterfaceC0183a
    public boolean b(AbstractC0184b abstractC0184b, MenuC0207m menuC0207m) {
        i.g h = h(abstractC0184b);
        C0342k c0342k = (C0342k) this.f5078e;
        Menu menu = (Menu) c0342k.getOrDefault(menuC0207m, null);
        if (menu == null) {
            menu = new MenuC0191C((Context) this.c, menuC0207m);
            c0342k.put(menuC0207m, menu);
        }
        return ((ActionMode.Callback) this.f5076b).onPrepareActionMode(h, menu);
    }

    @Override // i.InterfaceC0183a
    public boolean c(AbstractC0184b abstractC0184b, MenuC0207m menuC0207m) {
        i.g h = h(abstractC0184b);
        C0342k c0342k = (C0342k) this.f5078e;
        Menu menu = (Menu) c0342k.getOrDefault(menuC0207m, null);
        if (menu == null) {
            menu = new MenuC0191C((Context) this.c, menuC0207m);
            c0342k.put(menuC0207m, menu);
        }
        return ((ActionMode.Callback) this.f5076b).onCreateActionMode(h, menu);
    }

    @Override // i.InterfaceC0183a
    public void d(AbstractC0184b abstractC0184b) {
        ((ActionMode.Callback) this.f5076b).onDestroyActionMode(h(abstractC0184b));
    }

    public void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0342k) this.c).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                e(arrayList2.get(i3), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void f(Runnable runnable) {
        ((ExecutorC0145B) this.f5076b).execute(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(q2.i iVar) {
        X1.g.e(iVar, "call");
        ArrayDeque arrayDeque = (ArrayDeque) this.f5078e;
        synchronized (this) {
            if (!arrayDeque.remove(iVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        byte[] bArr = n2.b.f4249a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.c).iterator();
                X1.g.d(it, "readyAsyncCalls.iterator()");
                if (it.hasNext()) {
                    X.d.q(it.next());
                    if (((ArrayDeque) this.f5077d).size() < 64) {
                        throw null;
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f5077d).size();
                    ((ArrayDeque) this.f5078e).size();
                }
                if (arrayList.size() <= 0) {
                    X.d.q(arrayList.get(0));
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f5076b) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = n2.b.f4253f + " Dispatcher";
                                X1.g.e(str, "name");
                                this.f5076b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new n2.a(false, str));
                            }
                            X1.g.b((ThreadPoolExecutor) this.f5076b);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    throw null;
                }
                return;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList.size() <= 0) {
        }
    }

    public i.g h(AbstractC0184b abstractC0184b) {
        ArrayList arrayList = (ArrayList) this.f5077d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            i.g gVar = (i.g) arrayList.get(i3);
            if (gVar != null && gVar.f3136b == abstractC0184b) {
                return gVar;
            }
        }
        i.g gVar2 = new i.g((Context) this.c, abstractC0184b);
        arrayList.add(gVar2);
        return gVar2;
    }

    public g i(j jVar) {
        X1.g.e(jVar, "id");
        a0.j a3 = a0.j.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        String str = jVar.f5079a;
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        a3.x(2, jVar.f5080b);
        WorkDatabase workDatabase = (WorkDatabase) this.f5076b;
        workDatabase.b();
        g gVar = null;
        String string = null;
        Cursor n3 = workDatabase.n(a3, null);
        try {
            int B3 = z.B(n3, "work_spec_id");
            int B4 = z.B(n3, "generation");
            int B5 = z.B(n3, "system_id");
            if (n3.moveToFirst()) {
                if (!n3.isNull(B3)) {
                    string = n3.getString(B3);
                }
                gVar = new g(n3.getInt(B4), n3.getInt(B5), string);
            }
            return gVar;
        } finally {
            n3.close();
            a3.o();
        }
    }

    public void j(g gVar) {
        WorkDatabase workDatabase = (WorkDatabase) this.f5076b;
        workDatabase.b();
        workDatabase.c();
        try {
            ((C0402b) this.c).t(gVar);
            workDatabase.p();
        } finally {
            workDatabase.k();
        }
    }

    public i(Typeface typeface, R.b bVar) {
        int i3;
        int i4;
        this.f5078e = typeface;
        this.f5076b = bVar;
        this.f5077d = new androidx.emoji2.text.r(1024);
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i5 = a3 + bVar.f471a;
            i3 = ((ByteBuffer) bVar.f473d).getInt(((ByteBuffer) bVar.f473d).getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        this.c = new char[i3 * 2];
        int a4 = bVar.a(6);
        if (a4 != 0) {
            int i6 = a4 + bVar.f471a;
            i4 = ((ByteBuffer) bVar.f473d).getInt(((ByteBuffer) bVar.f473d).getInt(i6) + i6);
        } else {
            i4 = 0;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(this, i7);
            R.a c = nVar.c();
            int a5 = c.a(4);
            Character.toChars(a5 != 0 ? ((ByteBuffer) c.f473d).getInt(a5 + c.f471a) : 0, (char[]) this.c, i7 * 2);
            z.i(nVar.b() > 0, "invalid metadata codepoint length");
            ((androidx.emoji2.text.r) this.f5077d).a(nVar, 0, nVar.b() - 1);
        }
    }
}
