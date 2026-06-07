package d2;

import W1.p;
import a2.C0062a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m extends X1.h implements p {
    public final /* synthetic */ int c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, boolean z3, int i3) {
        super(2);
        this.c = i3;
        this.f2663e = obj;
        this.f2662d = z3;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        Object obj3;
        K1.c cVar;
        Object obj4;
        switch (this.c) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                X1.g.e(charSequence, "$this$$receiver");
                int d02 = d.d0(charSequence, (char[]) this.f2663e, intValue, this.f2662d);
                if (d02 < 0) {
                    return null;
                }
                return new K1.c(Integer.valueOf(d02), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                X1.g.e(charSequence2, "$this$$receiver");
                List list = (List) this.f2663e;
                boolean z3 = this.f2662d;
                if (z3 || list.size() != 1) {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    C0062a c0062a = new C0062a(intValue2, charSequence2.length(), 1);
                    boolean z4 = charSequence2 instanceof String;
                    int i3 = c0062a.f1425d;
                    int i4 = c0062a.c;
                    if (z4) {
                        if ((i3 > 0 && intValue2 <= i4) || (i3 < 0 && i4 <= intValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str = (String) obj4;
                                        if (l.S(0, intValue2, str.length(), str, (String) charSequence2, z3)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str2 = (String) obj4;
                                if (str2 != null) {
                                    cVar = new K1.c(Integer.valueOf(intValue2), str2);
                                } else if (intValue2 != i4) {
                                    intValue2 += i3;
                                }
                            }
                        }
                        cVar = null;
                    } else {
                        if ((i3 > 0 && intValue2 <= i4) || (i3 < 0 && i4 <= intValue2)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str3 = (String) obj3;
                                        if (d.g0(str3, 0, charSequence2, intValue2, str3.length(), z3)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str4 = (String) obj3;
                                if (str4 != null) {
                                    cVar = new K1.c(Integer.valueOf(intValue2), str4);
                                } else if (intValue2 != i4) {
                                    intValue2 += i3;
                                }
                            }
                        }
                        cVar = null;
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int c02 = d.c0(charSequence2, str5, intValue2, false, 4);
                    if (c02 >= 0) {
                        cVar = new K1.c(Integer.valueOf(c02), str5);
                    }
                    cVar = null;
                }
                if (cVar == null) {
                    return null;
                }
                return new K1.c(cVar.f600b, Integer.valueOf(((String) cVar.c).length()));
        }
    }
}
