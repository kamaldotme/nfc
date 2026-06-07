package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import r.C0364a;
import r.d;
import r.i;
import t.b;
import t.o;

/* loaded from: classes.dex */
public class Barrier extends b {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1684i;

    /* renamed from: j, reason: collision with root package name */
    public C0364a f1685j;

    public Barrier(Context context) {
        super(context);
        this.f4730b = new int[32];
        this.g = new HashMap();
        this.f4731d = context;
        e(null);
        super.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r.a, r.i] */
    @Override // t.b
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        ?? iVar = new i();
        iVar.f4486f0 = 0;
        iVar.f4487g0 = true;
        iVar.f4488h0 = 0;
        this.f1685j = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f4881b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f1685j.f4487g0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f1685j.f4488h0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.f4732e = this.f1685j;
        g();
    }

    @Override // t.b
    public final void f(d dVar, boolean z3) {
        int i3 = this.h;
        this.f1684i = i3;
        if (z3) {
            if (i3 == 5) {
                this.f1684i = 1;
            } else if (i3 == 6) {
                this.f1684i = 0;
            }
        } else if (i3 == 5) {
            this.f1684i = 0;
        } else if (i3 == 6) {
            this.f1684i = 1;
        }
        if (dVar instanceof C0364a) {
            ((C0364a) dVar).f4486f0 = this.f1684i;
        }
    }

    public int getMargin() {
        return this.f1685j.f4488h0;
    }

    public int getType() {
        return this.h;
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f1685j.f4487g0 = z3;
    }

    public void setDpMargin(int i3) {
        this.f1685j.f4488h0 = (int) ((i3 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i3) {
        this.f1685j.f4488h0 = i3;
    }

    public void setType(int i3) {
        this.h = i3;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
