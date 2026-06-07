package Y1;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends e {
    @Override // Y1.e
    public final int a(int i3) {
        return ((-i3) >> 31) & (d().nextInt() >>> (32 - i3));
    }

    @Override // Y1.e
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
