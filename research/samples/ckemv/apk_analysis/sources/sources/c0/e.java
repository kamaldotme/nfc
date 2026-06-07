package c0;

import L1.j;
import L1.k;
import L1.u;
import M1.h;
import X1.g;
import a.AbstractC0059a;
import android.database.Cursor;
import f0.C0167c;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import m0.z;
import v0.f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2250a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2251b;
    public final Set c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2252d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        g.e(abstractSet, "foreignKeys");
        this.f2250a = str;
        this.f2251b = map;
        this.c = abstractSet;
        this.f2252d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final e a(C0167c c0167c, String str) {
        Map b3;
        List Q2;
        h hVar;
        h hVar2;
        int i3;
        String str2;
        int i4;
        int i5;
        Throwable th;
        d dVar;
        C0167c c0167c2 = c0167c;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        String str3 = "`)";
        sb.append("`)");
        Cursor L2 = c0167c2.L(sb.toString());
        try {
            String str4 = "name";
            if (L2.getColumnCount() <= 0) {
                b3 = u.f623b;
                AbstractC0059a.j(L2, null);
            } else {
                int columnIndex = L2.getColumnIndex("name");
                int columnIndex2 = L2.getColumnIndex("type");
                int columnIndex3 = L2.getColumnIndex("notnull");
                int columnIndex4 = L2.getColumnIndex("pk");
                int columnIndex5 = L2.getColumnIndex("dflt_value");
                M1.e eVar = new M1.e();
                while (L2.moveToNext()) {
                    String string = L2.getString(columnIndex);
                    String string2 = L2.getString(columnIndex2);
                    boolean z3 = L2.getInt(columnIndex3) != 0;
                    int i6 = L2.getInt(columnIndex4);
                    String string3 = L2.getString(columnIndex5);
                    g.d(string, "name");
                    g.d(string2, "type");
                    eVar.put(string, new C0108a(string, string2, z3, i6, string3, 2));
                    columnIndex = columnIndex;
                }
                b3 = eVar.b();
                AbstractC0059a.j(L2, null);
            }
            L2 = c0167c2.L("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = L2.getColumnIndex("id");
                int columnIndex7 = L2.getColumnIndex("seq");
                int columnIndex8 = L2.getColumnIndex("table");
                int columnIndex9 = L2.getColumnIndex("on_delete");
                int columnIndex10 = L2.getColumnIndex("on_update");
                int columnIndex11 = L2.getColumnIndex("id");
                int columnIndex12 = L2.getColumnIndex("seq");
                int columnIndex13 = L2.getColumnIndex("from");
                int columnIndex14 = L2.getColumnIndex("to");
                M1.b bVar = new M1.b();
                while (L2.moveToNext()) {
                    String str5 = str4;
                    int i7 = L2.getInt(columnIndex11);
                    int i8 = columnIndex11;
                    int i9 = L2.getInt(columnIndex12);
                    int i10 = columnIndex12;
                    String string4 = L2.getString(columnIndex13);
                    int i11 = columnIndex13;
                    g.d(string4, "cursor.getString(fromColumnIndex)");
                    String string5 = L2.getString(columnIndex14);
                    g.d(string5, "cursor.getString(toColumnIndex)");
                    bVar.add(new c(i7, i9, string4, string5));
                    b3 = b3;
                    str4 = str5;
                    columnIndex11 = i8;
                    columnIndex12 = i10;
                    columnIndex13 = i11;
                    columnIndex14 = columnIndex14;
                }
                Map map = b3;
                String str6 = str4;
                M1.b k2 = f.k(bVar);
                g.e(k2, "<this>");
                if (k2.a() <= 1) {
                    Q2 = k.Y(k2);
                } else {
                    Object[] array = k2.toArray(new Comparable[0]);
                    Comparable[] comparableArr = (Comparable[]) array;
                    if (comparableArr.length > 1) {
                        Arrays.sort(comparableArr);
                    }
                    Q2 = j.Q(array);
                }
                L2.moveToPosition(-1);
                h hVar3 = new h();
                while (L2.moveToNext()) {
                    if (L2.getInt(columnIndex7) == 0) {
                        int i12 = L2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : Q2) {
                            List list = Q2;
                            if (((c) obj).f2244b == i12) {
                                arrayList3.add(obj);
                            }
                            Q2 = list;
                        }
                        List list2 = Q2;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f2245d);
                            arrayList2.add(cVar.f2246e);
                        }
                        String string6 = L2.getString(columnIndex8);
                        g.d(string6, "cursor.getString(tableColumnIndex)");
                        String string7 = L2.getString(columnIndex9);
                        g.d(string7, "cursor.getString(onDeleteColumnIndex)");
                        String string8 = L2.getString(columnIndex10);
                        g.d(string8, "cursor.getString(onUpdateColumnIndex)");
                        hVar3.add(new C0109b(string6, string7, string8, arrayList, arrayList2));
                        columnIndex6 = columnIndex6;
                        Q2 = list2;
                    }
                }
                h c = z.c(hVar3);
                AbstractC0059a.j(L2, null);
                L2 = c0167c2.L("PRAGMA index_list(`" + str + "`)");
                String str7 = str6;
                try {
                    int columnIndex15 = L2.getColumnIndex(str7);
                    int columnIndex16 = L2.getColumnIndex("origin");
                    int columnIndex17 = L2.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        hVar = null;
                        AbstractC0059a.j(L2, null);
                    } else {
                        h hVar4 = new h();
                        while (L2.moveToNext()) {
                            if (g.a("c", L2.getString(columnIndex16))) {
                                String string9 = L2.getString(columnIndex15);
                                boolean z4 = L2.getInt(columnIndex17) == 1;
                                g.d(string9, str7);
                                L2 = c0167c2.L("PRAGMA index_xinfo(`" + string9 + str3);
                                try {
                                    int columnIndex18 = L2.getColumnIndex("seqno");
                                    int columnIndex19 = L2.getColumnIndex("cid");
                                    int columnIndex20 = L2.getColumnIndex(str7);
                                    int columnIndex21 = L2.getColumnIndex("desc");
                                    String str8 = str7;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        i3 = columnIndex15;
                                        str2 = str3;
                                        i4 = columnIndex16;
                                        i5 = columnIndex17;
                                        th = null;
                                        AbstractC0059a.j(L2, null);
                                        dVar = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        i3 = columnIndex15;
                                        TreeMap treeMap2 = new TreeMap();
                                        while (L2.moveToNext()) {
                                            if (L2.getInt(columnIndex19) >= 0) {
                                                int i13 = L2.getInt(columnIndex18);
                                                String str9 = str3;
                                                String string10 = L2.getString(columnIndex20);
                                                int i14 = columnIndex21;
                                                String str10 = L2.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i15 = columnIndex16;
                                                Integer valueOf = Integer.valueOf(i13);
                                                g.d(string10, "columnName");
                                                treeMap.put(valueOf, string10);
                                                treeMap2.put(Integer.valueOf(i13), str10);
                                                str3 = str9;
                                                columnIndex16 = i15;
                                                columnIndex21 = i14;
                                                columnIndex17 = columnIndex17;
                                            }
                                        }
                                        str2 = str3;
                                        i4 = columnIndex16;
                                        i5 = columnIndex17;
                                        Collection values = treeMap.values();
                                        g.d(values, "columnsMap.values");
                                        List Y2 = k.Y(values);
                                        Collection values2 = treeMap2.values();
                                        g.d(values2, "ordersMap.values");
                                        dVar = new d(string9, z4, Y2, k.Y(values2));
                                        AbstractC0059a.j(L2, null);
                                        th = null;
                                    }
                                    if (dVar == null) {
                                        AbstractC0059a.j(L2, th);
                                        hVar2 = null;
                                        break;
                                    }
                                    hVar4.add(dVar);
                                    c0167c2 = c0167c;
                                    str7 = str8;
                                    columnIndex15 = i3;
                                    str3 = str2;
                                    columnIndex16 = i4;
                                    columnIndex17 = i5;
                                } finally {
                                }
                            }
                        }
                        hVar = z.c(hVar4);
                        AbstractC0059a.j(L2, null);
                    }
                    hVar2 = hVar;
                    return new e(str, map, c, hVar2);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        } finally {
            try {
                throw th2;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!g.a(this.f2250a, eVar.f2250a) || !g.a(this.f2251b, eVar.f2251b) || !g.a(this.c, eVar.c)) {
            return false;
        }
        Set set2 = this.f2252d;
        if (set2 == null || (set = eVar.f2252d) == null) {
            return true;
        }
        return g.a(set2, set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f2251b.hashCode() + (this.f2250a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f2250a + "', columns=" + this.f2251b + ", foreignKeys=" + this.c + ", indices=" + this.f2252d + '}';
    }
}
