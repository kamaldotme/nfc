package d2;

import W1.p;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements c2.c {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2660b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final p f2661d;

    public c(CharSequence charSequence, int i3, int i4, p pVar) {
        X1.g.e(charSequence, "input");
        this.f2659a = charSequence;
        this.f2660b = i3;
        this.c = i4;
        this.f2661d = pVar;
    }

    @Override // c2.c
    public final Iterator iterator() {
        return new b(this);
    }
}
