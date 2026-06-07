package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f4793a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4794b;
    public final float c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4795d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4796e;

    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.f4793a = Float.NaN;
        this.f4794b = Float.NaN;
        this.c = Float.NaN;
        this.f4795d = Float.NaN;
        this.f4796e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), o.f4885i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4796e);
                this.f4796e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new k().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4795d = obtainStyledAttributes.getDimension(index, this.f4795d);
            } else if (index == 2) {
                this.f4794b = obtainStyledAttributes.getDimension(index, this.f4794b);
            } else if (index == 3) {
                this.c = obtainStyledAttributes.getDimension(index, this.c);
            } else if (index == 4) {
                this.f4793a = obtainStyledAttributes.getDimension(index, this.f4793a);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
