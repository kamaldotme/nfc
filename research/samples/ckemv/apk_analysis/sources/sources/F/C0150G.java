package f;

import J.InterfaceC0018q;
import J.T;
import J.w0;
import J.y0;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c0.C0108a;
import c0.C0109b;
import f0.C0167c;
import j.C0200f;
import j.C0209o;
import j.InterfaceC0205k;
import j.InterfaceC0219y;
import j.MenuC0207m;
import j.RunnableC0199e;
import j.SubMenuC0194F;
import j.ViewOnKeyListenerC0201g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import k.C0288j;
import k.H0;
import k.InterfaceC0271a0;
import k.InterfaceC0294m;
import k.g1;
import r1.C0370a;
import s0.C0381a;
import t0.C0384a;
import v.C0400d;

/* renamed from: f.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0150G implements H0, InterfaceC0219y, InterfaceC0205k, InterfaceC0271a0, InterfaceC0018q {

    /* renamed from: b, reason: collision with root package name */
    public Object f2846b;

    public /* synthetic */ C0150G(Object obj) {
        this.f2846b = obj;
    }

    public static void m(C0167c c0167c) {
        c0167c.A("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0167c.A("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c0167c.A("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c0167c.A("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c0167c.A("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c0167c.A("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0167c.A("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c0167c.A("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0167c.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c0167c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0167c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    public static A1.h o(C0167c c0167c) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C0108a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new C0108a("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C0109b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C0109b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new c0.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new c0.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        c0.e eVar = new c0.e("Dependency", hashMap, hashSet, hashSet2);
        c0.e a3 = c0.e.a(c0167c, "Dependency");
        if (!eVar.equals(a3)) {
            return new A1.h(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a3);
        }
        HashMap hashMap2 = new HashMap(30);
        hashMap2.put("id", new C0108a("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new C0108a("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new C0108a("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new C0108a("input_merger_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input", new C0108a("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new C0108a("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new C0108a("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new C0108a("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new C0108a("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new C0108a("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new C0108a("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new C0108a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new C0108a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        hashMap2.put("minimum_retention_duration", new C0108a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new C0108a("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new C0108a("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new C0108a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new C0108a("period_count", "INTEGER", true, 0, "0", 1));
        hashMap2.put("generation", new C0108a("generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("next_schedule_time_override", new C0108a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        hashMap2.put("next_schedule_time_override_generation", new C0108a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        hashMap2.put("stop_reason", new C0108a("stop_reason", "INTEGER", true, 0, "-256", 1));
        hashMap2.put("required_network_type", new C0108a("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_charging", new C0108a("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new C0108a("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new C0108a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new C0108a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new C0108a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new C0108a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new C0108a("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new c0.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new c0.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        c0.e eVar2 = new c0.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        c0.e a4 = c0.e.a(c0167c, "WorkSpec");
        if (!eVar2.equals(a4)) {
            return new A1.h(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a4);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C0108a("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new C0108a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C0109b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new c0.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        c0.e eVar3 = new c0.e("WorkTag", hashMap3, hashSet5, hashSet6);
        c0.e a5 = c0.e.a(c0167c, "WorkTag");
        if (!eVar3.equals(a5)) {
            return new A1.h(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a5);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new C0108a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new C0108a("generation", "INTEGER", true, 2, "0", 1));
        hashMap4.put("system_id", new C0108a("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C0109b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        c0.e eVar4 = new c0.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        c0.e a6 = c0.e.a(c0167c, "SystemIdInfo");
        if (!eVar4.equals(a6)) {
            return new A1.h(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a6);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C0108a("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new C0108a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C0109b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new c0.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        c0.e eVar5 = new c0.e("WorkName", hashMap5, hashSet8, hashSet9);
        c0.e a7 = c0.e.a(c0167c, "WorkName");
        if (!eVar5.equals(a7)) {
            return new A1.h(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a7);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C0108a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new C0108a("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C0109b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        c0.e eVar6 = new c0.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        c0.e a8 = c0.e.a(c0167c, "WorkProgress");
        if (!eVar6.equals(a8)) {
            return new A1.h(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a8);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C0108a("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new C0108a("long_value", "INTEGER", false, 0, null, 1));
        c0.e eVar7 = new c0.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        c0.e a9 = c0.e.a(c0167c, "Preference");
        if (eVar7.equals(a9)) {
            return new A1.h(true, (String) null);
        }
        return new A1.h(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a9);
    }

    @Override // j.InterfaceC0219y
    public void a(MenuC0207m menuC0207m, boolean z3) {
        if (menuC0207m instanceof SubMenuC0194F) {
            ((SubMenuC0194F) menuC0207m).f3254z.k().c(false);
        }
        InterfaceC0219y interfaceC0219y = ((C0288j) this.f2846b).f3695f;
        if (interfaceC0219y != null) {
            interfaceC0219y.a(menuC0207m, z3);
        }
    }

    @Override // j.InterfaceC0219y
    public boolean b(MenuC0207m menuC0207m) {
        C0288j c0288j = (C0288j) this.f2846b;
        if (menuC0207m == c0288j.f3693d) {
            return false;
        }
        ((SubMenuC0194F) menuC0207m).f3253A.getClass();
        c0288j.getClass();
        InterfaceC0219y interfaceC0219y = c0288j.f3695f;
        if (interfaceC0219y != null) {
            return interfaceC0219y.b(menuC0207m);
        }
        return false;
    }

    @Override // k.InterfaceC0271a0
    public void c(int i3) {
    }

    @Override // k.H0
    public void d(MenuC0207m menuC0207m, C0209o c0209o) {
        ViewOnKeyListenerC0201g viewOnKeyListenerC0201g = (ViewOnKeyListenerC0201g) this.f2846b;
        viewOnKeyListenerC0201g.h.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0201g.f3282j;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (menuC0207m == ((C0200f) arrayList.get(i3)).f3275b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        viewOnKeyListenerC0201g.h.postAtTime(new RunnableC0199e(this, i4 < arrayList.size() ? (C0200f) arrayList.get(i4) : null, c0209o, menuC0207m), menuC0207m, SystemClock.uptimeMillis() + 200);
    }

    @Override // j.InterfaceC0205k
    public void e(MenuC0207m menuC0207m) {
        InterfaceC0205k interfaceC0205k = ((ActionMenuView) this.f2846b).f1585w;
        if (interfaceC0205k != null) {
            interfaceC0205k.e(menuC0207m);
        }
    }

    @Override // J.InterfaceC0018q
    public y0 f(View view, y0 y0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2846b;
        if (!I.a.a(coordinatorLayout.f1713o, y0Var)) {
            coordinatorLayout.f1713o = y0Var;
            boolean z3 = y0Var.d() > 0;
            coordinatorLayout.f1714p = z3;
            coordinatorLayout.setWillNotDraw(!z3 && coordinatorLayout.getBackground() == null);
            w0 w0Var = y0Var.f470a;
            if (!w0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    WeakHashMap weakHashMap = T.f402a;
                    if (J.B.b(childAt) && ((C0400d) childAt.getLayoutParams()).f5046a != null && w0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return y0Var;
    }

    @Override // j.InterfaceC0205k
    public boolean g(MenuC0207m menuC0207m, MenuItem menuItem) {
        InterfaceC0294m interfaceC0294m = ((ActionMenuView) this.f2846b).f1578B;
        if (interfaceC0294m == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((g1) interfaceC0294m).f3687b.f1645H.c).iterator();
        if (!it.hasNext()) {
            return false;
        }
        X.d.q(it.next());
        throw null;
    }

    @Override // k.InterfaceC0271a0
    public void h(int i3) {
    }

    public void i(String str, String str2) {
        X1.g.e(str, "name");
        X1.g.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f2846b;
        arrayList.add(str);
        arrayList.add(d2.d.n0(str2).toString());
    }

    @Override // k.H0
    public void j(MenuC0207m menuC0207m, MenuItem menuItem) {
        ((ViewOnKeyListenerC0201g) this.f2846b).h.removeCallbacksAndMessages(menuC0207m);
    }

    public boolean k(v0.o oVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) this.f2846b) {
            s0.e eVar = (s0.e) obj;
            eVar.getClass();
            if (eVar.b(oVar) && eVar.c(eVar.f4704a.a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            m0.r a3 = m0.r.a();
            int i3 = r0.k.f4640a;
            L1.k.W(arrayList, null, null, null, r0.f.c, 31);
            a3.getClass();
        }
        return arrayList.isEmpty();
    }

    public m2.j l() {
        return new m2.j((String[]) ((ArrayList) this.f2846b).toArray(new String[0]));
    }

    public void n(int[] iArr, int i3) {
        int[] iArr2;
        C0370a c0370a;
        int[] iArr3;
        int i4;
        int i5;
        v0.l lVar;
        v0.l lVar2;
        v0.l lVar3;
        int i6;
        int i7 = i3;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        int i8 = 0;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i9 = 1;
            while (i9 < length && iArr[i9] == 0) {
                i9++;
            }
            if (i9 == length) {
                iArr2 = new int[]{0};
            } else {
                int i10 = length - i9;
                int[] iArr4 = new int[i10];
                System.arraycopy(iArr, i9, iArr4, 0, i10);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i7];
        boolean z3 = true;
        int i11 = 0;
        while (true) {
            c0370a = (C0370a) this.f2846b;
            if (i11 >= i7) {
                break;
            }
            int i12 = c0370a.f4648a[c0370a.g + i11];
            if (i12 == 0) {
                i6 = iArr2[iArr2.length - 1];
            } else if (i12 == 1) {
                int i13 = 0;
                for (int i14 : iArr2) {
                    C0370a c0370a2 = C0370a.h;
                    i13 ^= i14;
                }
                i6 = i13;
            } else {
                int i15 = iArr2[0];
                int length2 = iArr2.length;
                for (int i16 = 1; i16 < length2; i16++) {
                    i15 = c0370a.b(i12, i15) ^ iArr2[i16];
                }
                i6 = i15;
            }
            iArr5[(i7 - 1) - i11] = i6;
            if (i6 != 0) {
                z3 = false;
            }
            i11++;
        }
        if (z3) {
            return;
        }
        v0.l lVar4 = new v0.l(c0370a, iArr5);
        c0370a.getClass();
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        int[] iArr6 = new int[i7 + 1];
        iArr6[0] = 1;
        v0.l lVar5 = new v0.l(c0370a, iArr6);
        if (lVar5.d() >= lVar4.d()) {
            lVar5 = lVar4;
            lVar4 = lVar5;
        }
        v0.l lVar6 = c0370a.c;
        v0.l lVar7 = c0370a.f4650d;
        v0.l lVar8 = lVar6;
        while (true) {
            v0.l lVar9 = lVar5;
            lVar5 = lVar4;
            lVar4 = lVar9;
            if (lVar4.d() < i7 / 2) {
                int i17 = i8;
                int c = lVar7.c(i17);
                if (c == 0) {
                    throw new Exception("sigmaTilde(0) was zero");
                }
                int a3 = c0370a.a(c);
                v0.l[] lVarArr = {lVar7.i(a3), lVar4.i(a3)};
                v0.l lVar10 = lVarArr[i17];
                v0.l lVar11 = lVarArr[1];
                int d3 = lVar10.d();
                if (d3 == 1) {
                    iArr3 = new int[]{lVar10.c(1)};
                } else {
                    int[] iArr7 = new int[d3];
                    int i18 = i17;
                    int i19 = 1;
                    while (i19 < c0370a.f4651e && i18 < d3) {
                        if (lVar10.b(i19) == 0) {
                            iArr7[i18] = c0370a.a(i19);
                            i4 = 1;
                            i18++;
                        } else {
                            i4 = 1;
                        }
                        i19 += i4;
                    }
                    if (i18 != d3) {
                        throw new Exception("Error locator degree does not match number of roots");
                    }
                    iArr3 = iArr7;
                }
                int length3 = iArr3.length;
                int[] iArr8 = new int[length3];
                for (int i20 = i17; i20 < length3; i20++) {
                    int a4 = c0370a.a(iArr3[i20]);
                    int i21 = i17;
                    int i22 = 1;
                    while (i21 < length3) {
                        if (i20 != i21) {
                            int b3 = c0370a.b(iArr3[i21], a4);
                            i5 = 1;
                            i22 = c0370a.b(i22, (b3 & 1) == 0 ? b3 | 1 : b3 & (-2));
                        } else {
                            i5 = 1;
                        }
                        i21 += i5;
                    }
                    int b4 = c0370a.b(lVar11.b(a4), c0370a.a(i22));
                    iArr8[i20] = b4;
                    if (c0370a.g != 0) {
                        iArr8[i20] = c0370a.b(b4, a4);
                    }
                }
                int i23 = 1;
                int i24 = i17;
                while (i24 < iArr3.length) {
                    int length4 = iArr.length - i23;
                    int i25 = iArr3[i24];
                    if (i25 == 0) {
                        throw new IllegalArgumentException();
                    }
                    int i26 = length4 - c0370a.f4649b[i25];
                    if (i26 < 0) {
                        throw new Exception("Bad error location");
                    }
                    iArr[i26] = iArr[i26] ^ iArr8[i24];
                    i24++;
                    i23 = 1;
                }
                return;
            }
            if (lVar4.g()) {
                throw new Exception("r_{i-1} was zero");
            }
            int a5 = c0370a.a(lVar4.c(lVar4.d()));
            v0.l lVar12 = lVar6;
            while (lVar5.d() >= lVar4.d() && !lVar5.g()) {
                int d4 = lVar5.d() - lVar4.d();
                int b5 = c0370a.b(lVar5.c(lVar5.d()), a5);
                if (d4 < 0) {
                    throw new IllegalArgumentException();
                }
                if (b5 == 0) {
                    lVar2 = lVar6;
                } else {
                    int[] iArr9 = new int[d4 + 1];
                    iArr9[i8] = b5;
                    lVar2 = new v0.l(c0370a, iArr9);
                }
                lVar12 = lVar12.a(lVar2);
                if (d4 < 0) {
                    throw new IllegalArgumentException();
                }
                C0370a c0370a3 = (C0370a) lVar4.f5083d;
                if (b5 == 0) {
                    lVar3 = c0370a3.c;
                } else {
                    int[] iArr10 = (int[]) lVar4.f5084e;
                    int length5 = iArr10.length;
                    int[] iArr11 = new int[d4 + length5];
                    int i27 = 0;
                    while (i27 < length5) {
                        iArr11[i27] = c0370a3.b(iArr10[i27], b5);
                        i27++;
                        length5 = length5;
                    }
                    lVar3 = new v0.l(c0370a3, iArr11);
                }
                lVar5 = lVar5.a(lVar3);
                i8 = 0;
            }
            lVar12.getClass();
            C0370a c0370a4 = (C0370a) lVar7.f5083d;
            C0370a c0370a5 = (C0370a) lVar12.f5083d;
            if (!c0370a5.equals(c0370a4)) {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            if (lVar12.g() || lVar7.g()) {
                lVar = c0370a5.c;
            } else {
                int[] iArr12 = (int[]) lVar12.f5084e;
                int length6 = iArr12.length;
                int[] iArr13 = (int[]) lVar7.f5084e;
                int length7 = iArr13.length;
                int[] iArr14 = new int[(length6 + length7) - 1];
                int i28 = 0;
                while (i28 < length6) {
                    int i29 = iArr12[i28];
                    int[] iArr15 = iArr12;
                    int i30 = 0;
                    while (i30 < length7) {
                        int i31 = i28 + i30;
                        iArr14[i31] = iArr14[i31] ^ c0370a5.b(i29, iArr13[i30]);
                        i30++;
                        length6 = length6;
                    }
                    i28++;
                    iArr12 = iArr15;
                    length6 = length6;
                }
                lVar = new v0.l(c0370a5, iArr14);
            }
            v0.l a6 = lVar.a(lVar8);
            if (lVar5.d() >= lVar4.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            lVar8 = lVar7;
            i8 = 0;
            lVar7 = a6;
            i7 = i3;
        }
    }

    public void p(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f2846b;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i3 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        m0.g gVar = m0.g.f3972b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i3 < zArr.length) {
                            boolArr[i3] = Boolean.valueOf(zArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        m0.g gVar2 = m0.g.f3972b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i3 < bArr.length) {
                            bArr2[i3] = Byte.valueOf(bArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        m0.g gVar3 = m0.g.f3972b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i3 < iArr.length) {
                            numArr[i3] = Integer.valueOf(iArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        m0.g gVar4 = m0.g.f3972b;
                        Long[] lArr = new Long[jArr.length];
                        while (i3 < jArr.length) {
                            lArr[i3] = Long.valueOf(jArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        m0.g gVar5 = m0.g.f3972b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i3 < fArr.length) {
                            fArr2[i3] = Float.valueOf(fArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        m0.g gVar6 = m0.g.f3972b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i3 < dArr.length) {
                            dArr2[i3] = Double.valueOf(dArr[i3]);
                            i3++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public void q(String str) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f2846b;
            if (i3 >= arrayList.size()) {
                return;
            }
            if (d2.l.Q(str, (String) arrayList.get(i3))) {
                arrayList.remove(i3);
                arrayList.remove(i3);
                i3 -= 2;
            }
            i3 += 2;
        }
    }

    public C0150G(v0.i iVar) {
        X1.g.e(iVar, "trackers");
        C0381a c0381a = new C0381a((t0.e) iVar.f5076b, 0);
        C0381a c0381a2 = new C0381a((C0384a) iVar.c);
        C0381a c0381a3 = new C0381a((t0.e) iVar.f5078e, 4);
        t0.e eVar = (t0.e) iVar.f5077d;
        this.f2846b = L1.l.R(c0381a, c0381a2, c0381a3, new C0381a(eVar, 2), new C0381a(eVar, 3), new s0.g(eVar), new s0.f(eVar));
    }

    public C0150G(int i3) {
        Handler handler;
        Handler handler2;
        switch (i3) {
            case 7:
                this.f2846b = new HashMap();
                return;
            case 8:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                X1.g.e(timeUnit, "timeUnit");
                this.f2846b = new q2.m(p2.d.h, timeUnit);
                return;
            case 9:
                this.f2846b = new ArrayList(20);
                return;
            case 10:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = F.e.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                        handler = new Handler(mainLooper);
                    } catch (InvocationTargetException e3) {
                        Throwable cause = e3.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handler2 = handler;
                }
                this.f2846b = handler2;
                return;
            case 11:
            case 12:
            default:
                this.f2846b = null;
                return;
            case 13:
                this.f2846b = new LinkedHashSet();
                return;
        }
    }
}
