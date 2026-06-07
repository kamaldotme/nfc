package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383a {

    /* renamed from: a, reason: collision with root package name */
    public int f4725a;

    /* renamed from: b, reason: collision with root package name */
    public int f4726b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public String f4727d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4728e;

    /* renamed from: f, reason: collision with root package name */
    public int f4729f;

    public C0383a(C0383a c0383a, Object obj) {
        c0383a.getClass();
        this.f4725a = c0383a.f4725a;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [t.a, java.lang.Object] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), o.c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i3 = 0;
        Object obj = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i3 = 6;
            } else {
                int i5 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i5 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i5 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i3 = 2;
                            } else if (index == 6) {
                                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                i3 = 1;
                            } else if (index == 8) {
                                obj = obtainStyledAttributes.getString(index);
                            }
                        }
                        i3 = 7;
                    }
                }
                i3 = i5;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f4725a = i3;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (q.h.a(this.f4725a)) {
            case 0:
                this.f4726b = ((Integer) obj).intValue();
                return;
            case 1:
                this.c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f4729f = ((Integer) obj).intValue();
                return;
            case 4:
                this.f4727d = (String) obj;
                return;
            case 5:
                this.f4728e = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.c = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
