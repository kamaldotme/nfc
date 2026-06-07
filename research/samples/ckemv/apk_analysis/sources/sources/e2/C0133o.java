package e2;

/* renamed from: e2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133o extends X1.h implements W1.p {

    /* renamed from: d, reason: collision with root package name */
    public static final C0133o f2818d = new C0133o(2, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final C0133o f2819e = new C0133o(2, 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0133o(int i3, int i4) {
        super(i3);
        this.c = i4;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((O1.i) obj).o((O1.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((O1.i) obj).o((O1.g) obj2);
        }
    }
}
