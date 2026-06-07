package J1;

import J.T;
import L1.t;
import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase_Impl;
import b0.AbstractC0102a;
import e.AbstractC0116a;
import f.C0150G;
import f0.C0167c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;
import k.AbstractC0299o0;
import k.C0308t;
import k.e1;
import m2.p;
import n0.o;
import org.xmlpull.v1.XmlPullParserException;
import w.AbstractC0405a;
import z.AbstractC0452b;
import z.AbstractC0453c;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f578a;

    /* renamed from: b, reason: collision with root package name */
    public int f579b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Object f580d;

    public /* synthetic */ l() {
        this.f578a = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l b(Resources resources, int i3, Resources.Theme theme) {
        int next;
        float f3;
        int i4;
        float f4;
        float f5;
        float f6;
        float f7;
        int i5;
        Shader radialGradient;
        XmlResourceParser xml = resources.getXml(i3);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b3 = AbstractC0453c.b(resources, xml, asAttributeSet, theme);
                return new l((Shader) null, b3, b3.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f8 = AbstractC0452b.f(resources, theme, asAttributeSet, AbstractC0405a.f5143d);
        float f9 = !AbstractC0452b.c(xml, "startX") ? 0.0f : f8.getFloat(8, 0.0f);
        float f10 = !AbstractC0452b.c(xml, "startY") ? 0.0f : f8.getFloat(9, 0.0f);
        float f11 = !AbstractC0452b.c(xml, "endX") ? 0.0f : f8.getFloat(10, 0.0f);
        float f12 = !AbstractC0452b.c(xml, "endY") ? 0.0f : f8.getFloat(11, 0.0f);
        float f13 = !AbstractC0452b.c(xml, "centerX") ? 0.0f : f8.getFloat(3, 0.0f);
        float f14 = !AbstractC0452b.c(xml, "centerY") ? 0.0f : f8.getFloat(4, 0.0f);
        int i6 = !AbstractC0452b.c(xml, "type") ? 0 : f8.getInt(2, 0);
        int color = !AbstractC0452b.c(xml, "startColor") ? 0 : f8.getColor(0, 0);
        boolean c = AbstractC0452b.c(xml, "centerColor");
        int color2 = !AbstractC0452b.c(xml, "centerColor") ? 0 : f8.getColor(7, 0);
        int color3 = !AbstractC0452b.c(xml, "endColor") ? 0 : f8.getColor(1, 0);
        if (AbstractC0452b.c(xml, "tileMode")) {
            f3 = f13;
            i4 = f8.getInt(6, 0);
        } else {
            f3 = f13;
            i4 = 0;
        }
        if (AbstractC0452b.c(xml, "gradientRadius")) {
            f4 = f14;
            f5 = f8.getFloat(5, 0.0f);
        } else {
            f4 = f14;
            f5 = 0.0f;
        }
        f8.recycle();
        int depth = xml.getDepth() + 1;
        float f15 = f5;
        ArrayList arrayList = new ArrayList(20);
        float f16 = f12;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f6 = f11;
            if (next2 == 1) {
                f7 = f10;
                break;
            }
            int depth2 = xml.getDepth();
            f7 = f10;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f17 = AbstractC0452b.f(resources, theme, asAttributeSet, AbstractC0405a.f5144e);
                boolean hasValue = f17.hasValue(0);
                boolean hasValue2 = f17.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = f17.getColor(0, 0);
                float f18 = f17.getFloat(1, 0.0f);
                f17.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f18));
            }
            f11 = f6;
            f10 = f7;
        }
        v0.e eVar = arrayList2.size() > 0 ? new v0.e(arrayList2, arrayList) : null;
        if (eVar == null) {
            eVar = c ? new v0.e(color, color2, color3) : new v0.e(color, color3);
        }
        if (i6 == 1) {
            float f19 = f3;
            float f20 = f4;
            i5 = 0;
            if (f15 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f19, f20, f15, (int[]) eVar.f5071b, (float[]) eVar.c, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i6 != 2) {
            i5 = 0;
            radialGradient = new LinearGradient(f9, f7, f6, f16, (int[]) eVar.f5071b, (float[]) eVar.c, i4 != 1 ? i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i5 = 0;
            radialGradient = new SweepGradient(f3, f4, (int[]) eVar.f5071b, (float[]) eVar.c);
        }
        return new l(radialGradient, (ColorStateList) null, i5);
    }

    public static void c(String str) {
        if (d2.l.Q(str, ":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length) {
            boolean z4 = X1.g.f(str.charAt(!z3 ? i3 : length), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length--;
                }
            } else if (z4) {
                i3++;
            } else {
                z3 = true;
            }
        }
        if (str.subSequence(i3, length + 1).toString().length() != 0) {
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception unused) {
            }
        }
    }

    public void a() {
        e1 e1Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0299o0.a(drawable);
        }
        if (drawable == null || (e1Var = (e1) this.f580d) == null) {
            return;
        }
        C0308t.d(drawable, e1Var, imageView.getDrawableState());
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.f580d) != null && colorStateList.isStateful();
    }

    public void e(AttributeSet attributeSet, int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0116a.f2669f;
        v0.m F2 = v0.m.F(context, attributeSet, iArr, i3, 0);
        T.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) F2.f5087d, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) F2.f5087d;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0059a.s(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0299o0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                N.f.c(imageView, F2.q(2));
            }
            if (typedArray.hasValue(3)) {
                N.f.d(imageView, AbstractC0299o0.b(typedArray.getInt(3, -1), null));
            }
            F2.J();
        } catch (Throwable th) {
            F2.J();
            throw th;
        }
    }

    public void f(C0167c c0167c) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(C0167c c0167c) {
        boolean z3;
        List list;
        Cursor L2 = c0167c.L("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (L2.moveToFirst()) {
                if (L2.getInt(0) == 0) {
                    z3 = true;
                    AbstractC0059a.j(L2, null);
                    C0150G c0150g = (C0150G) this.f580d;
                    c0150g.getClass();
                    C0150G.m(c0167c);
                    if (!z3) {
                        A1.h o3 = C0150G.o(c0167c);
                        if (!o3.f48a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) o3.f49b));
                        }
                    }
                    k(c0167c);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0150g.f2846b;
                    list = workDatabase_Impl.f2193f;
                    if (list == null) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((n0.b) workDatabase_Impl.f2193f.get(i3)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z3 = false;
            AbstractC0059a.j(L2, null);
            C0150G c0150g2 = (C0150G) this.f580d;
            c0150g2.getClass();
            C0150G.m(c0167c);
            if (!z3) {
            }
            k(c0167c);
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c0150g2.f2846b;
            list = workDatabase_Impl2.f2193f;
            if (list == null) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0059a.j(L2, th);
                throw th2;
            }
        }
    }

    public void h(C0167c c0167c, int i3, int i4) {
        j(c0167c, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(C0167c c0167c) {
        boolean z3;
        a0.f fVar;
        Cursor L2 = c0167c.L("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (L2.moveToFirst()) {
                if (L2.getInt(0) != 0) {
                    z3 = true;
                    AbstractC0059a.j(L2, null);
                    if (z3) {
                        ((C0150G) this.f580d).getClass();
                        A1.h o3 = C0150G.o(c0167c);
                        if (!o3.f48a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) o3.f49b));
                        }
                        k(c0167c);
                    } else {
                        Cursor J2 = c0167c.J(new d1.f("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = J2.moveToFirst() ? J2.getString(0) : null;
                            AbstractC0059a.j(J2, null);
                            if (!X1.g.a("7d73d21f1bd82c9e5268b6dcf9fde2cb", string) && !X1.g.a("3071c8717539de5d5353f4c8cd59a032", string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7d73d21f1bd82c9e5268b6dcf9fde2cb, found: " + string);
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC0059a.j(J2, th);
                                throw th2;
                            }
                        }
                    }
                    C0150G c0150g = (C0150G) this.f580d;
                    ((WorkDatabase_Impl) c0150g.f2846b).f2189a = c0167c;
                    c0167c.A("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0150g.f2846b;
                    workDatabase_Impl.getClass();
                    fVar = workDatabase_Impl.f2191d;
                    fVar.getClass();
                    synchronized (fVar.f1397k) {
                        if (!fVar.f1394f) {
                            c0167c.A("PRAGMA temp_store = MEMORY;");
                            c0167c.A("PRAGMA recursive_triggers='ON';");
                            c0167c.A("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            fVar.c(c0167c);
                            fVar.g = c0167c.i("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            fVar.f1394f = true;
                        }
                    }
                    List list = ((WorkDatabase_Impl) c0150g.f2846b).f2193f;
                    if (list != null) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            n0.b bVar = (n0.b) ((WorkDatabase_Impl) c0150g.f2846b).f2193f.get(i3);
                            bVar.getClass();
                            c0167c.a();
                            try {
                                StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                                bVar.f4165a.getClass();
                                sb.append(System.currentTimeMillis() - o.f4201a);
                                sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                c0167c.A(sb.toString());
                                c0167c.M();
                                c0167c.o();
                            } catch (Throwable th3) {
                                c0167c.o();
                                throw th3;
                            }
                        }
                    }
                    this.c = null;
                    return;
                }
            }
            z3 = false;
            AbstractC0059a.j(L2, null);
            if (z3) {
            }
            C0150G c0150g2 = (C0150G) this.f580d;
            ((WorkDatabase_Impl) c0150g2.f2846b).f2189a = c0167c;
            c0167c.A("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c0150g2.f2846b;
            workDatabase_Impl2.getClass();
            fVar = workDatabase_Impl2.f2191d;
            fVar.getClass();
            synchronized (fVar.f1397k) {
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                AbstractC0059a.j(L2, th4);
                throw th5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0041 A[EDGE_INSN: B:86:0x0041->B:69:0x0041 BREAK  A[LOOP:3: B:48:0x002a->B:70:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(C0167c c0167c, int i3, int i4) {
        Iterable iterable;
        TreeMap treeMap;
        boolean z3;
        a0.b bVar = (a0.b) this.c;
        C0150G c0150g = (C0150G) this.f580d;
        if (bVar != null) {
            A.h hVar = bVar.f1379d;
            hVar.getClass();
            if (i3 == i4) {
                iterable = t.f622b;
            } else {
                boolean z4 = i4 > i3;
                ArrayList arrayList = new ArrayList();
                int i5 = i3;
                do {
                    if (z4) {
                        if (i5 >= i4) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) hVar.c).get(Integer.valueOf(i5));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z4 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z4) {
                                int i6 = i5 + 1;
                                X1.g.d(num, "targetVersion");
                                int intValue = num.intValue();
                                if (i6 <= intValue && intValue <= i4) {
                                    Object obj = treeMap.get(num);
                                    X1.g.b(obj);
                                    arrayList.add(obj);
                                    i5 = num.intValue();
                                    z3 = true;
                                    break;
                                }
                            } else {
                                X1.g.d(num, "targetVersion");
                                int intValue2 = num.intValue();
                                if (i4 <= intValue2 && intValue2 < i5) {
                                    Object obj2 = treeMap.get(num);
                                    X1.g.b(obj2);
                                    arrayList.add(obj2);
                                    i5 = num.intValue();
                                    z3 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z3 = false;
                    } else {
                        if (i5 <= i4) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((LinkedHashMap) hVar.c).get(Integer.valueOf(i5));
                        if (treeMap == null) {
                        }
                    }
                } while (z3);
                iterable = null;
            }
            if (iterable != null) {
                c0150g.getClass();
                M1.b bVar2 = new M1.b();
                Cursor L2 = c0167c.L("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (L2.moveToNext()) {
                    try {
                        bVar2.add(L2.getString(0));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC0059a.j(L2, th);
                            throw th2;
                        }
                    }
                }
                AbstractC0059a.j(L2, null);
                ListIterator listIterator = v0.f.k(bVar2).listIterator(0);
                while (true) {
                    M1.a aVar = (M1.a) listIterator;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    String str = (String) aVar.next();
                    X1.g.d(str, "triggerName");
                    if (d2.l.V(str, "room_fts_content_sync_", false)) {
                        c0167c.A("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractC0102a) it.next()).a(c0167c);
                }
                A1.h o3 = C0150G.o(c0167c);
                if (!o3.f48a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + ((String) o3.f49b));
                }
                k(c0167c);
                return;
            }
        }
        a0.b bVar3 = (a0.b) this.c;
        if (bVar3 == null || bVar3.a(i3, i4)) {
            throw new IllegalStateException("A migration from " + i3 + " to " + i4 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        c0150g.getClass();
        c0167c.A("DROP TABLE IF EXISTS `Dependency`");
        c0167c.A("DROP TABLE IF EXISTS `WorkSpec`");
        c0167c.A("DROP TABLE IF EXISTS `WorkTag`");
        c0167c.A("DROP TABLE IF EXISTS `SystemIdInfo`");
        c0167c.A("DROP TABLE IF EXISTS `WorkName`");
        c0167c.A("DROP TABLE IF EXISTS `WorkProgress`");
        c0167c.A("DROP TABLE IF EXISTS `Preference`");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0150g.f2846b;
        List list = workDatabase_Impl.f2193f;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((n0.b) workDatabase_Impl.f2193f.get(i7)).getClass();
            }
        }
        C0150G.m(c0167c);
    }

    public void k(C0167c c0167c) {
        c0167c.A("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0167c.A("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    public String toString() {
        switch (this.f578a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                if (((p) this.c) == p.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f579b);
                sb.append(' ');
                sb.append((String) this.f580d);
                String sb2 = sb.toString();
                X1.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public l(p pVar, int i3, String str) {
        this.f578a = 3;
        this.c = pVar;
        this.f579b = i3;
        this.f580d = str;
    }

    public l(a0.b bVar, C0150G c0150g) {
        this.f578a = 1;
        this.f578a = 1;
        this.f579b = 20;
        this.c = bVar;
        this.f580d = c0150g;
    }

    public l(ImageView imageView) {
        this.f578a = 2;
        this.f579b = 0;
        this.c = imageView;
    }

    public l(Shader shader, ColorStateList colorStateList, int i3) {
        this.f578a = 4;
        this.c = shader;
        this.f580d = colorStateList;
        this.f579b = i3;
    }
}
