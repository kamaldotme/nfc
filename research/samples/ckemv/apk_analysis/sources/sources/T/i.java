package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f4863a;

    /* renamed from: b, reason: collision with root package name */
    public int f4864b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f4865d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f4884f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 1) {
                this.c = obtainStyledAttributes.getFloat(index, this.c);
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.f4863a);
                this.f4863a = i4;
                this.f4863a = k.f4876d[i4];
            } else if (index == 4) {
                this.f4864b = obtainStyledAttributes.getInt(index, this.f4864b);
            } else if (index == 3) {
                this.f4865d = obtainStyledAttributes.getFloat(index, this.f4865d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
