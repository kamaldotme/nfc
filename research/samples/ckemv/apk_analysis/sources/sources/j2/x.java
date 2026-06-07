package j2;

import e2.g0;

/* loaded from: classes.dex */
public final class x extends X1.h implements W1.p {

    /* renamed from: d, reason: collision with root package name */
    public static final x f3543d = new x(2, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final x f3544e = new x(2, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final x f3545f = new x(2, 2);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i3, int i4) {
        super(i3);
        this.c = i4;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                O1.g gVar = (O1.g) obj2;
                if (!(gVar instanceof g0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 1:
                g0 g0Var = (g0) obj;
                O1.g gVar2 = (O1.g) obj2;
                if (g0Var != null) {
                    return g0Var;
                }
                if (gVar2 instanceof g0) {
                    return (g0) gVar2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
