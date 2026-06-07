package Z1;

import X1.g;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends Y1.a {
    @Override // Y1.e
    public final int c(int i3, int i4) {
        return ThreadLocalRandom.current().nextInt(i3, i4);
    }

    @Override // Y1.a
    public final Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        g.d(current, "current(...)");
        return current;
    }
}
