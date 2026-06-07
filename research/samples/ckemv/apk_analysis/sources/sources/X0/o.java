package X0;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f1058a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1059b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1060d;

    public o(m2.n nVar, int i3, byte[] bArr, int i4) {
        this.c = nVar;
        this.f1058a = i3;
        this.f1060d = bArr;
        this.f1059b = i4;
    }

    public o(p pVar, v0.m mVar) {
        this.c = new SparseArray();
        this.f1060d = pVar;
        TypedArray typedArray = (TypedArray) mVar.f5087d;
        this.f1058a = typedArray.getResourceId(28, 0);
        this.f1059b = typedArray.getResourceId(52, 0);
    }
}
