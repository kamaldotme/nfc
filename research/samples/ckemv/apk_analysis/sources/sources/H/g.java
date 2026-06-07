package H;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f268a = new Object();

    public final int a(CharSequence charSequence, int i3) {
        int i4 = 2;
        for (int i5 = 0; i5 < i3 && i4 == 2; i5++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i5));
            A1.h hVar = h.f269a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i4 = 2;
                            break;
                    }
                }
                i4 = 0;
            }
            i4 = 1;
        }
        return i4;
    }
}
