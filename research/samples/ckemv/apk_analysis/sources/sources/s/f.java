package S;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends u2.d {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f857a;

    /* renamed from: b, reason: collision with root package name */
    public final d f858b;
    public boolean c = true;

    public f(TextView textView) {
        this.f857a = textView;
        this.f858b = new d(textView);
    }

    @Override // u2.d
    public final void D(boolean z3) {
        if (z3) {
            H();
        }
    }

    @Override // u2.d
    public final void E(boolean z3) {
        this.c = z3;
        H();
        TextView textView = this.f857a;
        textView.setFilters(m(textView.getFilters()));
    }

    public final void H() {
        TextView textView = this.f857a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f864a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // u2.d
    public final InputFilter[] m(InputFilter[] inputFilterArr) {
        if (!this.c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof d) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (sparseArray.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i6 = 0;
        while (true) {
            d dVar = this.f858b;
            if (i6 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i6] == dVar) {
                return inputFilterArr;
            }
            i6++;
        }
    }
}
