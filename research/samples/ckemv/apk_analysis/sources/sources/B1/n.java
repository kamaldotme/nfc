package b1;

import i1.C0187b;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class n {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0187b c0187b = new C0187b(stringWriter);
            c0187b.f3197f = true;
            e1.r rVar = e1.u.f2743a;
            i.d(c0187b, this);
            return stringWriter.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
