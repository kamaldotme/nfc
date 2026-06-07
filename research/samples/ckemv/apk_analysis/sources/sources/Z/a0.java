package Z;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1229a;

    /* renamed from: b, reason: collision with root package name */
    public int f1230b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1231d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1232e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1233f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public a0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f1229a = -1;
        this.f1230b = Integer.MIN_VALUE;
        this.c = false;
        this.f1231d = false;
        this.f1232e = false;
        int[] iArr = this.f1233f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
