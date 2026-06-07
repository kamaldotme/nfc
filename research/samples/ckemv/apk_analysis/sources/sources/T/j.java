package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f4866m;

    /* renamed from: a, reason: collision with root package name */
    public float f4867a;

    /* renamed from: b, reason: collision with root package name */
    public float f4868b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f4869d;

    /* renamed from: e, reason: collision with root package name */
    public float f4870e;

    /* renamed from: f, reason: collision with root package name */
    public float f4871f;
    public float g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f4872i;

    /* renamed from: j, reason: collision with root package name */
    public float f4873j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4874k;

    /* renamed from: l, reason: collision with root package name */
    public float f4875l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4866m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            switch (f4866m.get(index)) {
                case 1:
                    this.f4867a = obtainStyledAttributes.getFloat(index, this.f4867a);
                    break;
                case 2:
                    this.f4868b = obtainStyledAttributes.getFloat(index, this.f4868b);
                    break;
                case 3:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 4:
                    this.f4869d = obtainStyledAttributes.getFloat(index, this.f4869d);
                    break;
                case 5:
                    this.f4870e = obtainStyledAttributes.getFloat(index, this.f4870e);
                    break;
                case 6:
                    this.f4871f = obtainStyledAttributes.getDimension(index, this.f4871f);
                    break;
                case 7:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 8:
                    this.h = obtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 9:
                    this.f4872i = obtainStyledAttributes.getDimension(index, this.f4872i);
                    break;
                case 10:
                    this.f4873j = obtainStyledAttributes.getDimension(index, this.f4873j);
                    break;
                case 11:
                    this.f4874k = true;
                    this.f4875l = obtainStyledAttributes.getDimension(index, this.f4875l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
