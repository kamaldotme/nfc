package S;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends u2.d {

    /* renamed from: a, reason: collision with root package name */
    public final f f859a;

    public g(TextView textView) {
        this.f859a = new f(textView);
    }

    @Override // u2.d
    public final void D(boolean z3) {
        if (!(androidx.emoji2.text.j.f1769j != null)) {
            return;
        }
        this.f859a.D(z3);
    }

    @Override // u2.d
    public final void E(boolean z3) {
        boolean z4 = !(androidx.emoji2.text.j.f1769j != null);
        f fVar = this.f859a;
        if (z4) {
            fVar.c = z3;
        } else {
            fVar.E(z3);
        }
    }

    @Override // u2.d
    public final InputFilter[] m(InputFilter[] inputFilterArr) {
        return (androidx.emoji2.text.j.f1769j != null) ^ true ? inputFilterArr : this.f859a.m(inputFilterArr);
    }
}
