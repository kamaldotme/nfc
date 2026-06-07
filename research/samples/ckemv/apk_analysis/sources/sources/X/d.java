package X;

import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ String A(int i3) {
        switch (i3) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case 6:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i3) {
        switch (i3) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "PROTOCOL_ERROR";
            case 3:
                return "INTERNAL_ERROR";
            case 4:
                return "FLOW_CONTROL_ERROR";
            case 5:
                return "SETTINGS_TIMEOUT";
            case 6:
                return "STREAM_CLOSED";
            case 7:
                return "FRAME_SIZE_ERROR";
            case 8:
                return "REFUSED_STREAM";
            case 9:
                return "CANCEL";
            case 10:
                return "COMPRESSION_ERROR";
            case 11:
                return "CONNECT_ERROR";
            case 12:
                return "ENHANCE_YOUR_CALM";
            case 13:
                return "INADEQUATE_SECURITY";
            case 14:
                return "HTTP_1_1_REQUIRED";
            default:
                return "null";
        }
    }

    public static final void a(View view, int i3) {
        int a3 = q.h.a(i3);
        if (a3 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (a3 == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(0);
        } else if (a3 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (a3 != 3) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }

    public static int b(int i3) {
        if (i3 == 0) {
            return 2;
        }
        if (i3 == 4) {
            return 4;
        }
        if (i3 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(f("Unknown visibility ", i3));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static final boolean d(int i3) {
        return i3 == 3 || i3 == 4 || i3 == 6;
    }

    public static /* synthetic */ long e(int i3) {
        if (i3 == 1) {
            return 0L;
        }
        if (i3 == 2) {
            return 1L;
        }
        if (i3 == 3) {
            return 2L;
        }
        if (i3 == 4) {
            return 3L;
        }
        if (i3 == 5) {
            return 4L;
        }
        throw null;
    }

    public static String f(String str, int i3) {
        return str + i3;
    }

    public static String g(String str, int i3, String str2) {
        return str + i3 + str2;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ Iterator k() {
        try {
            return Arrays.asList(new f2.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void l(int i3) {
        if (i3 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        X1.g.g(nullPointerException, X1.g.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void m(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void n(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void o(String str, int i3) {
        if (i3 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = X1.g.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            X1.g.g(nullPointerException, X1.g.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [f2.a, java.lang.Object] */
    public static Iterator p() {
        try {
            return Arrays.asList(new Object()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String r(int i3) {
        switch (i3) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String s(int i3) {
        switch (i3) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String t(int i3) {
        switch (i3) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String u(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String v(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String w(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static /* synthetic */ String x(int i3) {
        switch (i3) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i3) {
        switch (i3) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i3) {
        switch (i3) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
