package J1;

import android.hardware.Camera;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f548a = 0;

    static {
        Pattern.compile(";");
    }

    public static String a(List list, String... strArr) {
        Arrays.toString(strArr);
        Objects.toString(list);
        if (list == null) {
            return null;
        }
        for (String str : strArr) {
            if (list.contains(str)) {
                return str;
            }
        }
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z3) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String a3 = z3 ? a(supportedFlashModes, "torch", "on") : a(supportedFlashModes, "off");
        if (a3 == null || a3.equals(parameters.getFlashMode())) {
            return;
        }
        parameters.setFlashMode(a3);
    }
}
