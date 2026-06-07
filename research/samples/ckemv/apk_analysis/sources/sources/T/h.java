package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p.AbstractC0355a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4859e;

    /* renamed from: a, reason: collision with root package name */
    public int f4860a;

    /* renamed from: b, reason: collision with root package name */
    public int f4861b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f4862d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4859e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f4883e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            switch (f4859e.get(index)) {
                case 1:
                    this.f4862d = obtainStyledAttributes.getFloat(index, this.f4862d);
                    break;
                case 2:
                    this.f4861b = obtainStyledAttributes.getInt(index, this.f4861b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0355a.f4296a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f4860a = k.f(obtainStyledAttributes, index, this.f4860a);
                    break;
                case 6:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
