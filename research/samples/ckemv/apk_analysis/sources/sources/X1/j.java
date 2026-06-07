package X1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1142b;
    public Object c;

    public j(int i3) {
        this.f1142b = i3;
        switch (i3) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                g.d(compile, "compile(...)");
                this.c = compile;
                return;
            default:
                return;
        }
    }

    public final String toString() {
        switch (this.f1142b) {
            case 0:
                return String.valueOf(this.c);
            default:
                String pattern = ((Pattern) this.c).toString();
                g.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
