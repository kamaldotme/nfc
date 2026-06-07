package v0;

import J.C0003b0;
import J.F;
import J.T;
import android.database.Cursor;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import f.v;
import i.AbstractC0184b;
import i.InterfaceC0183a;
import j.MenuC0207m;
import j1.C0244n;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import q1.C0363a;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0403c implements I1.a, InterfaceC0183a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5066b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5067d;

    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, S.a] */
    public C0403c(EditText editText) {
        this.f5066b = 3;
        this.c = editText;
        S.i iVar = new S.i(editText);
        this.f5067d = iVar;
        editText.addTextChangedListener(iVar);
        if (S.a.f848b == null) {
            synchronized (S.a.f847a) {
                try {
                    if (S.a.f848b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            S.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, S.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        S.a.f848b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(S.a.f848b);
    }

    public static C0244n m(C0244n c0244n, float f3, float f4) {
        float f5 = c0244n.f3505a;
        float f6 = f5 < f3 ? f5 - 1.0f : f5 + 1.0f;
        float f7 = c0244n.f3506b;
        return new C0244n(f6, f7 < f4 ? f7 - 1.0f : f7 + 1.0f);
    }

    public static C0244n o(C0244n c0244n, C0244n c0244n2, int i3) {
        float f3 = c0244n2.f3505a;
        float f4 = c0244n.f3505a;
        float f5 = i3 + 1;
        float f6 = c0244n2.f3506b;
        float f7 = c0244n.f3506b;
        return new C0244n(f4 + ((f3 - f4) / f5), f7 + ((f6 - f7) / f5));
    }

    @Override // i.InterfaceC0183a
    public boolean a(AbstractC0184b abstractC0184b, MenuItem menuItem) {
        return ((InterfaceC0183a) this.c).a(abstractC0184b, menuItem);
    }

    @Override // i.InterfaceC0183a
    public boolean b(AbstractC0184b abstractC0184b, MenuC0207m menuC0207m) {
        ViewGroup viewGroup = ((v) this.f5067d).f2950B;
        WeakHashMap weakHashMap = T.f402a;
        F.c(viewGroup);
        return ((InterfaceC0183a) this.c).b(abstractC0184b, menuC0207m);
    }

    @Override // i.InterfaceC0183a
    public boolean c(AbstractC0184b abstractC0184b, MenuC0207m menuC0207m) {
        return ((InterfaceC0183a) this.c).c(abstractC0184b, menuC0207m);
    }

    @Override // i.InterfaceC0183a
    public void d(AbstractC0184b abstractC0184b) {
        ((InterfaceC0183a) this.c).d(abstractC0184b);
        v vVar = (v) this.f5067d;
        if (vVar.f2995x != null) {
            vVar.f2984m.getDecorView().removeCallbacks(vVar.f2996y);
        }
        if (vVar.f2994w != null) {
            C0003b0 c0003b0 = vVar.f2997z;
            if (c0003b0 != null) {
                c0003b0.b();
            }
            C0003b0 a3 = T.a(vVar.f2994w);
            a3.a(0.0f);
            vVar.f2997z = a3;
            a3.d(new f.n(2, this));
        }
        vVar.f2993v = null;
        ViewGroup viewGroup = vVar.f2950B;
        WeakHashMap weakHashMap = T.f402a;
        F.c(viewGroup);
        vVar.H();
    }

    public View e(int i3, int i4, int i5, int i6) {
        Z.F f3 = (Z.F) this.c;
        int e3 = f3.e();
        int d3 = f3.d();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            View a3 = f3.a(i3);
            int c = f3.c(a3);
            int b3 = f3.b(a3);
            C1.a aVar = (C1.a) this.f5067d;
            aVar.c = e3;
            aVar.f115d = d3;
            aVar.f116e = c;
            aVar.f117f = b3;
            if (i5 != 0) {
                aVar.f114b = i5;
                if (aVar.a()) {
                    return a3;
                }
            }
            if (i6 != 0) {
                aVar.f114b = i6;
                if (aVar.a()) {
                    view = a3;
                }
            }
            i3 += i7;
        }
        return view;
    }

    public C1.a f(int i3) {
        C1.a aVar;
        C1.a aVar2;
        int i4 = i(i3);
        C1.a[] aVarArr = (C1.a[]) this.f5067d;
        C1.a aVar3 = aVarArr[i4];
        if (aVar3 != null) {
            return aVar3;
        }
        for (int i5 = 1; i5 < 5; i5++) {
            int i6 = i(i3) - i5;
            if (i6 >= 0 && (aVar2 = aVarArr[i6]) != null) {
                return aVar2;
            }
            int i7 = i(i3) + i5;
            if (i7 < aVarArr.length && (aVar = aVarArr[i7]) != null) {
                return aVar;
            }
        }
        return null;
    }

    public ArrayList g(String str) {
        a0.j a3 = a0.j.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        WorkDatabase workDatabase = (WorkDatabase) this.c;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
        try {
            ArrayList arrayList = new ArrayList(n3.getCount());
            while (n3.moveToNext()) {
                arrayList.add(n3.isNull(0) ? null : n3.getString(0));
            }
            return arrayList;
        } finally {
            n3.close();
            a3.o();
        }
    }

    public boolean h(String str) {
        a0.j a3 = a0.j.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        WorkDatabase workDatabase = (WorkDatabase) this.c;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
        try {
            boolean z3 = false;
            if (n3.moveToFirst()) {
                z3 = n3.getInt(0) != 0;
            }
            return z3;
        } finally {
            n3.close();
            a3.o();
        }
    }

    public int i(int i3) {
        return i3 - ((C1.c) this.c).h;
    }

    public boolean j(C0244n c0244n) {
        float f3 = c0244n.f3505a;
        if (f3 < 0.0f) {
            return false;
        }
        p1.b bVar = (p1.b) this.c;
        if (f3 >= bVar.f4328b) {
            return false;
        }
        float f4 = c0244n.f3506b;
        return f4 > 0.0f && f4 < ((float) bVar.c);
    }

    @Override // I1.a
    public void k(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0244n c0244n = (C0244n) it.next();
            ViewfinderView viewfinderView = ((DecoratedBarcodeView) this.f5067d).c;
            if (viewfinderView.h.size() < 20) {
                viewfinderView.h.add(c0244n);
            }
        }
        ((I1.a) this.c).k(list);
    }

    public boolean l(View view) {
        Z.F f3 = (Z.F) this.c;
        int e3 = f3.e();
        int d3 = f3.d();
        int c = f3.c(view);
        int b3 = f3.b(view);
        C1.a aVar = (C1.a) this.f5067d;
        aVar.c = e3;
        aVar.f115d = d3;
        aVar.f116e = c;
        aVar.f117f = b3;
        aVar.f114b = 24579;
        return aVar.a();
    }

    @Override // I1.a
    public void n(I1.b bVar) {
        ((I1.a) this.c).n(bVar);
    }

    public void p(n0.m mVar, int i3) {
        X1.g.e(mVar, "workSpecId");
        ((i) this.f5067d).f(new w0.o((n0.g) this.c, mVar, false, i3));
    }

    public int q(C0244n c0244n, C0244n c0244n2) {
        int i3 = (int) c0244n.f3505a;
        int i4 = (int) c0244n.f3506b;
        int i5 = (int) c0244n2.f3505a;
        int i6 = (int) c0244n2.f3506b;
        int i7 = 0;
        boolean z3 = Math.abs(i6 - i4) > Math.abs(i5 - i3);
        if (z3) {
            i3 = i4;
            i4 = i3;
            i5 = i6;
            i6 = i5;
        }
        int abs = Math.abs(i5 - i3);
        int abs2 = Math.abs(i6 - i4);
        int i8 = (-abs) / 2;
        int i9 = i4 < i6 ? 1 : -1;
        int i10 = i3 >= i5 ? -1 : 1;
        int i11 = z3 ? i4 : i3;
        int i12 = z3 ? i3 : i4;
        p1.b bVar = (p1.b) this.c;
        boolean b3 = bVar.b(i11, i12);
        while (i3 != i5) {
            boolean b4 = bVar.b(z3 ? i4 : i3, z3 ? i3 : i4);
            if (b4 != b3) {
                i7++;
                b3 = b4;
            }
            i8 += abs2;
            if (i8 > 0) {
                if (i4 == i6) {
                    break;
                }
                i4 += i9;
                i8 -= abs;
            }
            i3 += i10;
        }
        return i7;
    }

    public String toString() {
        switch (this.f5066b) {
            case 1:
                Formatter formatter = new Formatter();
                try {
                    int i3 = 0;
                    for (C1.a aVar : (C1.a[]) this.f5067d) {
                        if (aVar == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i3));
                            i3++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i3), Integer.valueOf(aVar.f117f), Integer.valueOf(aVar.f116e));
                            i3++;
                        }
                    }
                    String formatter2 = formatter.toString();
                    formatter.close();
                    return formatter2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            formatter.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0403c(Object obj, int i3, Object obj2) {
        this.f5066b = i3;
        this.f5067d = obj;
        this.c = obj2;
    }

    public C0403c(WorkDatabase workDatabase) {
        this.f5066b = 0;
        this.c = workDatabase;
        this.f5067d = new C0402b(workDatabase, 0);
    }

    public C0403c(C1.c cVar) {
        this.f5066b = 1;
        this.c = new C1.c(cVar);
        this.f5067d = new C1.a[(cVar.f124i - cVar.h) + 1];
    }

    public C0403c(p1.b bVar) {
        this.f5066b = 7;
        this.c = bVar;
        this.f5067d = new C0363a(bVar);
    }

    public C0403c(n0.g gVar, i iVar) {
        this.f5066b = 6;
        X1.g.e(gVar, "processor");
        X1.g.e(iVar, "workTaskExecutor");
        this.c = gVar;
        this.f5067d = iVar;
    }

    public C0403c(Z.F f3) {
        this.f5066b = 4;
        this.c = f3;
        C1.a aVar = new C1.a();
        aVar.f114b = 0;
        this.f5067d = aVar;
    }
}
