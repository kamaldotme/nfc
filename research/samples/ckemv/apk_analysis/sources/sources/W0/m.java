package w0;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class m {
    static {
        m0.r.b("PackageManagerHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        m0.r.a().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, Class cls, boolean z3) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z4 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z4 = true;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z3 ? 1 : 2, 1);
            m0.r.a().getClass();
        } catch (Exception unused) {
            m0.r.a().getClass();
        }
    }
}
