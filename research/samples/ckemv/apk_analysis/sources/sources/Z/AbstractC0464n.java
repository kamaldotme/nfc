package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import n.C0337f;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: z.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0464n {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f5302a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f5303b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i3) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i3, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context context, int i3, TypedValue typedValue, int i4, AbstractC0452b abstractC0452b, boolean z3, boolean z4) {
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i3) + "\" (" + Integer.toHexString(i3) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i5 = typedValue.assetCookie;
            C0337f c0337f = A.i.f10b;
            Typeface typeface2 = (Typeface) c0337f.a(A.i.b(resources, i3, charSequence2, i5, i4));
            if (typeface2 != null) {
                if (abstractC0452b != null) {
                    new Handler(Looper.getMainLooper()).post(new I1.k(abstractC0452b, 7, typeface2));
                }
                typeface = typeface2;
            } else if (!z4) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        InterfaceC0455e i6 = AbstractC0452b.i(resources.getXml(i3), resources);
                        if (i6 != null) {
                            typeface = A.i.a(context, i6, resources, i3, charSequence2, typedValue.assetCookie, i4, abstractC0452b, z3);
                        } else if (abstractC0452b != null) {
                            abstractC0452b.a(-3);
                        }
                    } else {
                        int i7 = typedValue.assetCookie;
                        Typeface t3 = A.i.f9a.t(context, resources, i3, charSequence2, i4);
                        if (t3 != null) {
                            c0337f.b(A.i.b(resources, i3, charSequence2, i7, i4), t3);
                        }
                        if (abstractC0452b != null) {
                            if (t3 != null) {
                                new Handler(Looper.getMainLooper()).post(new I1.k(abstractC0452b, 7, t3));
                            } else {
                                abstractC0452b.a(-3);
                            }
                        }
                        typeface = t3;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (abstractC0452b != null) {
                        abstractC0452b.a(-3);
                    }
                }
            }
        } else if (abstractC0452b != null) {
            abstractC0452b.a(-3);
        }
        if (typeface != null || abstractC0452b != null || z4) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i3) + " could not be retrieved.");
    }
}
