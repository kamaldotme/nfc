package L1;

import a.AbstractC0059a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class k extends q {
    public static final void U(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, W1.l lVar) {
        X1.g.e(iterable, "<this>");
        X1.g.e(charSequence, "separator");
        X1.g.e(charSequence2, "prefix");
        X1.g.e(charSequence3, "postfix");
        X1.g.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i4 = 0;
        for (Object obj : iterable) {
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            } else {
                AbstractC0059a.a(sb, obj, lVar);
            }
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void V(ArrayList arrayList, StringBuilder sb) {
        U(arrayList, sb, "\n", "", "", -1, "...", null);
    }

    public static String W(Iterable iterable, String str, String str2, String str3, W1.l lVar, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i3 & 2) != 0 ? "" : str2;
        String str6 = (i3 & 4) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        X1.g.e(iterable, "<this>");
        X1.g.e(str4, "separator");
        X1.g.e(str5, "prefix");
        X1.g.e(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        U(iterable, sb, str4, str5, str6, -1, "...", lVar);
        String sb2 = sb.toString();
        X1.g.d(sb2, "toString(...)");
        return sb2;
    }

    public static final void X(Iterable iterable, AbstractCollection abstractCollection) {
        X1.g.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List Y(Iterable iterable) {
        ArrayList arrayList;
        X1.g.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        t tVar = t.f622b;
        if (!z3) {
            if (z3) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                X(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : v0.f.B(arrayList.get(0)) : tVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return tVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return v0.f.B(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set Z(AbstractCollection abstractCollection) {
        X1.g.e(abstractCollection, "<this>");
        v vVar = v.f624b;
        int size = abstractCollection.size();
        if (size == 0) {
            return vVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(x.O(abstractCollection.size()));
            X(abstractCollection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(abstractCollection instanceof List ? ((List) abstractCollection).get(0) : abstractCollection.iterator().next());
        X1.g.d(singleton, "singleton(...)");
        return singleton;
    }
}
