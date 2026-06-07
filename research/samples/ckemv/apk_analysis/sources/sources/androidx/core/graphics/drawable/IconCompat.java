package androidx.core.graphics.drawable;

import B.d;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1728k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f1730b;

    /* renamed from: j, reason: collision with root package name */
    public String f1735j;

    /* renamed from: a, reason: collision with root package name */
    public int f1729a = -1;
    public byte[] c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1731d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1732e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1733f = 0;
    public ColorStateList g = null;
    public PorterDuff.Mode h = f1728k;

    /* renamed from: i, reason: collision with root package name */
    public String f1734i = null;

    public final String toString() {
        String str;
        int i3;
        if (this.f1729a == -1) {
            return String.valueOf(this.f1730b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1729a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1729a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1730b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1730b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1735j);
                sb.append(" id=");
                int i4 = this.f1729a;
                if (i4 == -1) {
                    int i5 = Build.VERSION.SDK_INT;
                    Object obj = this.f1730b;
                    if (i5 >= 28) {
                        i3 = d.a(obj);
                    } else {
                        i3 = 0;
                        try {
                            i3 = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i3 = this.f1732e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i3)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1732e);
                if (this.f1733f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1733f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1730b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != f1728k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
