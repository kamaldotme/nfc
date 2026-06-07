package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import q.C0361e;
import q1.C0363a;
import r.e;
import r.g;
import r.h;
import r.i;
import s.C0373c;
import s.C0375e;
import s.C0377g;
import s.C0378h;
import s.C0380j;
import t.b;
import t.c;
import t.d;
import t.k;
import t.o;
import v0.m;
import v0.r;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f1686b;
    public final ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final e f1687d;

    /* renamed from: e, reason: collision with root package name */
    public int f1688e;

    /* renamed from: f, reason: collision with root package name */
    public int f1689f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1690i;

    /* renamed from: j, reason: collision with root package name */
    public int f1691j;

    /* renamed from: k, reason: collision with root package name */
    public k f1692k;

    /* renamed from: l, reason: collision with root package name */
    public r f1693l;

    /* renamed from: m, reason: collision with root package name */
    public int f1694m;

    /* renamed from: n, reason: collision with root package name */
    public HashMap f1695n;

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f1696o;

    /* renamed from: p, reason: collision with root package name */
    public final C0363a f1697p;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1686b = new SparseArray();
        this.c = new ArrayList(4);
        this.f1687d = new e();
        this.f1688e = 0;
        this.f1689f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.f1690i = true;
        this.f1691j = 263;
        this.f1692k = null;
        this.f1693l = null;
        this.f1694m = -1;
        this.f1695n = new HashMap();
        this.f1696o = new SparseArray();
        this.f1697p = new C0363a(this);
        c(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, t.d] */
    public static d a() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f4760a = -1;
        marginLayoutParams.f4762b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.f4765d = -1;
        marginLayoutParams.f4767e = -1;
        marginLayoutParams.f4769f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.f4773i = -1;
        marginLayoutParams.f4774j = -1;
        marginLayoutParams.f4776k = -1;
        marginLayoutParams.f4778l = -1;
        marginLayoutParams.f4779m = -1;
        marginLayoutParams.f4780n = 0;
        marginLayoutParams.f4781o = 0.0f;
        marginLayoutParams.f4782p = -1;
        marginLayoutParams.f4783q = -1;
        marginLayoutParams.f4784r = -1;
        marginLayoutParams.f4785s = -1;
        marginLayoutParams.f4786t = -1;
        marginLayoutParams.f4787u = -1;
        marginLayoutParams.f4788v = -1;
        marginLayoutParams.f4789w = -1;
        marginLayoutParams.f4790x = -1;
        marginLayoutParams.f4791y = -1;
        marginLayoutParams.f4792z = 0.5f;
        marginLayoutParams.f4735A = 0.5f;
        marginLayoutParams.f4736B = null;
        marginLayoutParams.f4737C = 1;
        marginLayoutParams.D = -1.0f;
        marginLayoutParams.f4738E = -1.0f;
        marginLayoutParams.f4739F = 0;
        marginLayoutParams.f4740G = 0;
        marginLayoutParams.f4741H = 0;
        marginLayoutParams.f4742I = 0;
        marginLayoutParams.f4743J = 0;
        marginLayoutParams.f4744K = 0;
        marginLayoutParams.f4745L = 0;
        marginLayoutParams.f4746M = 0;
        marginLayoutParams.f4747N = 1.0f;
        marginLayoutParams.f4748O = 1.0f;
        marginLayoutParams.f4749P = -1;
        marginLayoutParams.f4750Q = -1;
        marginLayoutParams.f4751R = -1;
        marginLayoutParams.f4752S = false;
        marginLayoutParams.f4753T = false;
        marginLayoutParams.f4754U = null;
        marginLayoutParams.f4755V = true;
        marginLayoutParams.f4756W = true;
        marginLayoutParams.f4757X = false;
        marginLayoutParams.f4758Y = false;
        marginLayoutParams.f4759Z = false;
        marginLayoutParams.f4761a0 = -1;
        marginLayoutParams.f4763b0 = -1;
        marginLayoutParams.f4764c0 = -1;
        marginLayoutParams.f4766d0 = -1;
        marginLayoutParams.f4768e0 = -1;
        marginLayoutParams.f4770f0 = -1;
        marginLayoutParams.f4771g0 = 0.5f;
        marginLayoutParams.f4777k0 = new r.d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
    }

    public final r.d b(View view) {
        if (view == this) {
            return this.f1687d;
        }
        if (view == null) {
            return null;
        }
        return ((d) view.getLayoutParams()).f4777k0;
    }

    public final void c(AttributeSet attributeSet, int i3) {
        e eVar = this.f1687d;
        eVar.f4527U = this;
        C0363a c0363a = this.f1697p;
        eVar.f4562g0 = c0363a;
        eVar.f4561f0.f4676f = c0363a;
        this.f1686b.put(getId(), this);
        this.f1692k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f4881b, i3, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 9) {
                    this.f1688e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1688e);
                } else if (index == 10) {
                    this.f1689f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1689f);
                } else if (index == 7) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 8) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == 89) {
                    this.f1691j = obtainStyledAttributes.getInt(index, this.f1691j);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1693l = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        k kVar = new k();
                        this.f1692k = kVar;
                        kVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1692k = null;
                    }
                    this.f1694m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i5 = this.f1691j;
        eVar.f4570p0 = i5;
        C0361e.f4380p = (i5 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v0.r, java.lang.Object] */
    public final void d(int i3) {
        char c;
        Context context = getContext();
        ?? obj = new Object();
        obj.f5124b = new SparseArray();
        obj.c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            l lVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    c = 65535;
                    if (c != 0 && c != 1) {
                        if (c == 2) {
                            lVar = new l(context, xml);
                            ((SparseArray) obj.f5124b).put(lVar.f2406b, lVar);
                        } else if (c == 3) {
                            t.e eVar = new t.e(context, xml);
                            if (lVar != null) {
                                ((ArrayList) lVar.f2407d).add(eVar);
                            }
                        } else if (c == 4) {
                            obj.y(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
        this.f1693l = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                ((b) arrayList.get(i3)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i5 = (int) ((parseInt / 1080.0f) * width);
                        int i6 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i5;
                        float f4 = i6;
                        float f5 = i5 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f3, f4, f5, f4, paint);
                        float parseInt4 = i6 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f4, f5, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f5, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f5, f4, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x0684, code lost:
    
        if (r15 != false) goto L356;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(e eVar, int i3, int i4, int i5) {
        int i6;
        int max;
        int i7;
        int max2;
        int i8;
        int i9;
        m mVar;
        C0363a c0363a;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        m mVar2;
        int i14;
        e eVar2;
        boolean z4;
        ArrayList arrayList;
        int i15;
        C0363a c0363a2;
        int i16;
        C0363a c0363a3;
        boolean z5;
        m mVar3;
        int i17;
        int i18;
        int i19;
        boolean z6;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z7;
        Iterator it;
        Iterator it2;
        boolean z8;
        e eVar3 = eVar;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i26 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C0363a c0363a4 = this.f1697p;
        c0363a4.f4419a = max3;
        c0363a4.f4420b = max4;
        c0363a4.c = paddingWidth;
        c0363a4.f4421d = i26;
        c0363a4.f4422e = i4;
        c0363a4.f4423f = i5;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i27 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i28 = size - paddingWidth;
        int i29 = size2 - i26;
        int i30 = c0363a4.f4421d;
        int i31 = c0363a4.c;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i6 = 0;
                } else {
                    i6 = Math.min(this.g - i31, i28);
                    i27 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f1688e);
                i6 = max;
                i27 = 2;
            } else {
                i6 = 0;
                i27 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f1688e);
            i6 = max;
            i27 = 2;
        } else {
            i6 = i28;
            i27 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i7 = mode2 != 1073741824 ? 0 : Math.min(this.h - i30, i29);
                i8 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1689f);
                i7 = max2;
                i8 = 2;
            } else {
                i7 = 0;
                i8 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1689f);
            i7 = max2;
            i8 = 2;
        } else {
            i7 = i29;
            i8 = 2;
        }
        int l3 = eVar.l();
        C0375e c0375e = eVar3.f4561f0;
        int i32 = i6;
        if (i32 != l3 || i7 != eVar.i()) {
            c0375e.c = true;
        }
        eVar3.f4520N = 0;
        eVar3.f4521O = 0;
        int i33 = this.g - i31;
        int[] iArr = eVar3.f4553u;
        iArr[0] = i33;
        iArr[1] = this.h - i30;
        eVar3.f4523Q = 0;
        eVar3.f4524R = 0;
        eVar3.w(i27);
        eVar3.y(i32);
        eVar3.x(i8);
        eVar3.v(i7);
        int i34 = this.f1688e - i31;
        if (i34 < 0) {
            eVar3.f4523Q = 0;
        } else {
            eVar3.f4523Q = i34;
        }
        int i35 = this.f1689f - i30;
        if (i35 < 0) {
            eVar3.f4524R = 0;
        } else {
            eVar3.f4524R = i35;
        }
        eVar3.f4564j0 = max5;
        eVar3.f4565k0 = max3;
        m mVar4 = eVar3.f4560e0;
        mVar4.getClass();
        C0363a c0363a5 = eVar3.f4562g0;
        int size3 = eVar3.f4559d0.size();
        int l4 = eVar.l();
        int i36 = eVar.i();
        boolean z9 = (i3 & 128) == 128;
        boolean z10 = z9 || (i3 & 64) == 64;
        if (z10) {
            for (int i37 = 0; i37 < size3; i37++) {
                r.d dVar = (r.d) eVar3.f4559d0.get(i37);
                int[] iArr2 = dVar.f4537c0;
                boolean z11 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.f4518L > 0.0f;
                if ((dVar.q() && z11) || ((dVar.r() && z11) || (dVar instanceof g) || dVar.q() || dVar.r())) {
                    i9 = 1073741824;
                    z10 = false;
                    break;
                }
            }
        }
        i9 = 1073741824;
        if (((mode == i9 && mode2 == i9) || z9) && z10) {
            int min = Math.min(iArr[0], i28);
            int min2 = Math.min(iArr[1], i29);
            if (mode == 1073741824 && eVar.l() != min) {
                eVar3.y(min);
                eVar3.f4561f0.f4673b = true;
            }
            if (mode2 == 1073741824 && eVar.i() != min2) {
                eVar3.v(min2);
                eVar3.f4561f0.f4673b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z12 = z9 & true;
                boolean z13 = c0375e.f4673b;
                e eVar4 = c0375e.f4672a;
                if (z13 || c0375e.c) {
                    Iterator it3 = eVar4.f4559d0.iterator();
                    while (it3.hasNext()) {
                        r.d dVar2 = (r.d) it3.next();
                        dVar2.f4533a = false;
                        dVar2.f4538d.n();
                        dVar2.f4539e.m();
                    }
                    i21 = 0;
                    eVar4.f4533a = false;
                    eVar4.f4538d.n();
                    eVar4.f4539e.m();
                    c0375e.c = false;
                } else {
                    i21 = 0;
                }
                c0375e.b(c0375e.f4674d);
                eVar4.f4520N = i21;
                eVar4.f4521O = i21;
                int h = eVar4.h(i21);
                int h3 = eVar4.h(1);
                if (c0375e.f4673b) {
                    c0375e.c();
                }
                int m3 = eVar4.m();
                int n3 = eVar4.n();
                C0380j c0380j = eVar4.f4538d;
                c0363a = c0363a5;
                c0380j.h.d(m3);
                s.l lVar = eVar4.f4539e;
                i11 = l4;
                lVar.h.d(n3);
                c0375e.g();
                ArrayList arrayList2 = c0375e.f4675e;
                i12 = i36;
                C0377g c0377g = c0380j.f4695e;
                mVar = mVar4;
                C0377g c0377g2 = lVar.f4695e;
                i10 = size3;
                if (h == 2 || h3 == 2) {
                    if (z12) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((s.m) it4.next()).k()) {
                                    z12 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z12 && h == 2) {
                        eVar4.w(1);
                        i22 = mode2;
                        eVar4.y(c0375e.d(eVar4, 0));
                        c0377g.d(eVar4.l());
                    } else {
                        i22 = mode2;
                    }
                    if (z12 && h3 == 2) {
                        i23 = 1;
                        eVar4.x(1);
                        eVar4.v(c0375e.d(eVar4, 1));
                        c0377g2.d(eVar4.i());
                        int[] iArr3 = eVar4.f4537c0;
                        i24 = iArr3[0];
                        if (i24 != i23 || i24 == 4) {
                            int l5 = eVar4.l() + m3;
                            c0380j.f4697i.d(l5);
                            c0377g.d(l5 - m3);
                            c0375e.g();
                            i25 = iArr3[1];
                            if (i25 != 1 || i25 == 4) {
                                int i38 = eVar4.i() + n3;
                                lVar.f4697i.d(i38);
                                c0377g2.d(i38 - n3);
                            }
                            c0375e.g();
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            s.m mVar5 = (s.m) it.next();
                            if (mVar5.f4693b != eVar4 || mVar5.g) {
                                mVar5.e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            s.m mVar6 = (s.m) it2.next();
                            if (z7 || mVar6.f4693b != eVar4) {
                                if (!mVar6.h.f4683j || ((!mVar6.f4697i.f4683j && !(mVar6 instanceof C0378h)) || (!mVar6.f4695e.f4683j && !(mVar6 instanceof C0373c) && !(mVar6 instanceof C0378h)))) {
                                    z8 = false;
                                    break;
                                }
                            }
                        }
                        z8 = true;
                        eVar4.w(h);
                        eVar4.x(h3);
                        eVar3 = eVar;
                        z3 = z8;
                        i20 = i22;
                        i18 = 1073741824;
                        i13 = 2;
                    }
                } else {
                    i22 = mode2;
                }
                i23 = 1;
                int[] iArr32 = eVar4.f4537c0;
                i24 = iArr32[0];
                if (i24 != i23) {
                }
                int l52 = eVar4.l() + m3;
                c0380j.f4697i.d(l52);
                c0377g.d(l52 - m3);
                c0375e.g();
                i25 = iArr32[1];
                if (i25 != 1) {
                }
                int i382 = eVar4.i() + n3;
                lVar.f4697i.d(i382);
                c0377g2.d(i382 - n3);
                c0375e.g();
                z7 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z8 = true;
                eVar4.w(h);
                eVar4.x(h3);
                eVar3 = eVar;
                z3 = z8;
                i20 = i22;
                i18 = 1073741824;
                i13 = 2;
            } else {
                mVar = mVar4;
                c0363a = c0363a5;
                i10 = size3;
                i11 = l4;
                i12 = i36;
                boolean z14 = c0375e.f4673b;
                e eVar5 = c0375e.f4672a;
                if (z14) {
                    Iterator it5 = eVar5.f4559d0.iterator();
                    while (it5.hasNext()) {
                        r.d dVar3 = (r.d) it5.next();
                        dVar3.f4533a = false;
                        C0380j c0380j2 = dVar3.f4538d;
                        c0380j2.f4695e.f4683j = false;
                        c0380j2.g = false;
                        c0380j2.n();
                        s.l lVar2 = dVar3.f4539e;
                        lVar2.f4695e.f4683j = false;
                        lVar2.g = false;
                        lVar2.m();
                    }
                    i17 = 0;
                    eVar5.f4533a = false;
                    C0380j c0380j3 = eVar5.f4538d;
                    c0380j3.f4695e.f4683j = false;
                    c0380j3.g = false;
                    c0380j3.n();
                    s.l lVar3 = eVar5.f4539e;
                    lVar3.f4695e.f4683j = false;
                    lVar3.g = false;
                    lVar3.m();
                    c0375e.c();
                } else {
                    i17 = 0;
                }
                c0375e.b(c0375e.f4674d);
                eVar5.f4520N = i17;
                eVar5.f4521O = i17;
                eVar5.f4538d.h.d(i17);
                eVar5.f4539e.h.d(i17);
                i18 = 1073741824;
                eVar3 = eVar;
                if (mode == 1073741824) {
                    boolean D = eVar3.D(i17, z9);
                    i19 = 1;
                    z6 = D & true;
                    i13 = 1;
                    i20 = mode2;
                } else {
                    i19 = 1;
                    z6 = true;
                    i20 = mode2;
                    i13 = 0;
                }
                if (i20 == 1073741824) {
                    z3 = z6 & eVar3.D(i19, z9);
                    i13++;
                } else {
                    z3 = z6;
                }
            }
            if (z3) {
                eVar3.z(mode == i18, i20 == i18);
            }
        } else {
            mVar = mVar4;
            c0363a = c0363a5;
            i10 = size3;
            i11 = l4;
            i12 = i36;
            i13 = 0;
            z3 = false;
        }
        if (z3 && i13 == 2) {
            return;
        }
        if (i10 > 0) {
            int size4 = eVar3.f4559d0.size();
            C0363a c0363a6 = eVar3.f4562g0;
            int i39 = 0;
            while (i39 < size4) {
                r.d dVar4 = (r.d) eVar3.f4559d0.get(i39);
                if ((dVar4 instanceof h) || (dVar4.f4538d.f4695e.f4683j && dVar4.f4539e.f4695e.f4683j)) {
                    mVar3 = mVar;
                } else {
                    int h4 = dVar4.h(0);
                    int h5 = dVar4.h(1);
                    if (h4 != 3 || dVar4.f4542j == 1 || h5 != 3 || dVar4.f4543k == 1) {
                        mVar3 = mVar;
                        mVar3.E(c0363a6, dVar4, false);
                    } else {
                        mVar3 = mVar;
                    }
                }
                i39++;
                mVar = mVar3;
            }
            mVar2 = mVar;
            ConstraintLayout constraintLayout = (ConstraintLayout) c0363a6.g;
            int childCount2 = constraintLayout.getChildCount();
            for (int i40 = 0; i40 < childCount2; i40++) {
                constraintLayout.getChildAt(i40);
            }
            ArrayList arrayList3 = constraintLayout.c;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i41 = 0; i41 < size5; i41++) {
                    ((b) arrayList3.get(i41)).getClass();
                }
            }
        } else {
            mVar2 = mVar;
        }
        int i42 = eVar3.f4570p0;
        ArrayList arrayList4 = (ArrayList) mVar2.c;
        int size6 = arrayList4.size();
        int i43 = i11;
        int i44 = i12;
        if (i10 > 0) {
            mVar2.K(eVar3, i43, i44);
        }
        if (size6 > 0) {
            int[] iArr4 = eVar3.f4537c0;
            boolean z15 = iArr4[0] == 2;
            boolean z16 = iArr4[1] == 2;
            int l6 = eVar.l();
            e eVar6 = (e) mVar2.f5088e;
            int max7 = Math.max(l6, eVar6.f4523Q);
            int max8 = Math.max(eVar.i(), eVar6.f4524R);
            int i45 = 0;
            boolean z17 = false;
            while (i45 < size6) {
                r.d dVar5 = (r.d) arrayList4.get(i45);
                if (dVar5 instanceof g) {
                    int l7 = dVar5.l();
                    int i46 = dVar5.i();
                    i16 = i42;
                    c0363a3 = c0363a;
                    boolean E2 = z17 | mVar2.E(c0363a3, dVar5, true);
                    int l8 = dVar5.l();
                    int i47 = dVar5.i();
                    if (l8 != l7) {
                        dVar5.y(l8);
                        if (z15 && dVar5.m() + dVar5.f4516J > max7) {
                            max7 = Math.max(max7, dVar5.g(4).c() + dVar5.m() + dVar5.f4516J);
                        }
                        z5 = true;
                    } else {
                        z5 = E2;
                    }
                    if (i47 != i46) {
                        dVar5.v(i47);
                        if (z16 && dVar5.n() + dVar5.f4517K > max8) {
                            max8 = Math.max(max8, dVar5.g(5).c() + dVar5.n() + dVar5.f4517K);
                        }
                        z5 = true;
                    }
                    z17 = ((g) dVar5).f4606l0 | z5;
                } else {
                    i16 = i42;
                    c0363a3 = c0363a;
                }
                i45++;
                c0363a = c0363a3;
                i42 = i16;
            }
            i14 = i42;
            C0363a c0363a7 = c0363a;
            int i48 = 0;
            for (int i49 = 2; i48 < i49; i49 = 2) {
                int i50 = 0;
                while (i50 < size6) {
                    r.d dVar6 = (r.d) arrayList4.get(i50);
                    if (((dVar6 instanceof i) && !(dVar6 instanceof g)) || (dVar6 instanceof h) || dVar6.f4528V == 8 || ((dVar6.f4538d.f4695e.f4683j && dVar6.f4539e.f4695e.f4683j) || (dVar6 instanceof g))) {
                        c0363a2 = c0363a7;
                        arrayList = arrayList4;
                        i15 = size6;
                    } else {
                        int l9 = dVar6.l();
                        int i51 = dVar6.i();
                        arrayList = arrayList4;
                        int i52 = dVar6.f4522P;
                        i15 = size6;
                        z17 |= mVar2.E(c0363a7, dVar6, true);
                        int l10 = dVar6.l();
                        c0363a2 = c0363a7;
                        int i53 = dVar6.i();
                        if (l10 != l9) {
                            dVar6.y(l10);
                            if (z15 && dVar6.m() + dVar6.f4516J > max7) {
                                max7 = Math.max(max7, dVar6.g(4).c() + dVar6.m() + dVar6.f4516J);
                            }
                            z17 = true;
                        }
                        if (i53 != i51) {
                            dVar6.v(i53);
                            if (z16 && dVar6.n() + dVar6.f4517K > max8) {
                                max8 = Math.max(max8, dVar6.g(5).c() + dVar6.n() + dVar6.f4517K);
                            }
                            z17 = true;
                        }
                        if (dVar6.f4555w && i52 != dVar6.f4522P) {
                            z17 = true;
                        }
                    }
                    i50++;
                    arrayList4 = arrayList;
                    size6 = i15;
                    c0363a7 = c0363a2;
                }
                C0363a c0363a8 = c0363a7;
                ArrayList arrayList5 = arrayList4;
                int i54 = size6;
                if (z17) {
                    mVar2.K(eVar, i43, i44);
                    z17 = false;
                }
                i48++;
                c0363a7 = c0363a8;
                arrayList4 = arrayList5;
                size6 = i54;
            }
            eVar2 = eVar;
            if (z17) {
                mVar2.K(eVar2, i43, i44);
                if (eVar.l() < max7) {
                    eVar2.y(max7);
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (eVar.i() < max8) {
                    eVar2.v(max8);
                }
                mVar2.K(eVar2, i43, i44);
            }
        } else {
            i14 = i42;
            eVar2 = eVar3;
        }
        int i55 = i14;
        eVar2.f4570p0 = i55;
        C0361e.f4380p = (i55 & 256) == 256;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1690i = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, t.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i3;
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f4760a = -1;
        marginLayoutParams.f4762b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.f4765d = -1;
        marginLayoutParams.f4767e = -1;
        marginLayoutParams.f4769f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.f4773i = -1;
        marginLayoutParams.f4774j = -1;
        marginLayoutParams.f4776k = -1;
        marginLayoutParams.f4778l = -1;
        marginLayoutParams.f4779m = -1;
        marginLayoutParams.f4780n = 0;
        marginLayoutParams.f4781o = 0.0f;
        marginLayoutParams.f4782p = -1;
        marginLayoutParams.f4783q = -1;
        marginLayoutParams.f4784r = -1;
        marginLayoutParams.f4785s = -1;
        marginLayoutParams.f4786t = -1;
        marginLayoutParams.f4787u = -1;
        marginLayoutParams.f4788v = -1;
        marginLayoutParams.f4789w = -1;
        marginLayoutParams.f4790x = -1;
        marginLayoutParams.f4791y = -1;
        marginLayoutParams.f4792z = 0.5f;
        marginLayoutParams.f4735A = 0.5f;
        marginLayoutParams.f4736B = null;
        marginLayoutParams.f4737C = 1;
        marginLayoutParams.D = -1.0f;
        marginLayoutParams.f4738E = -1.0f;
        marginLayoutParams.f4739F = 0;
        marginLayoutParams.f4740G = 0;
        marginLayoutParams.f4741H = 0;
        marginLayoutParams.f4742I = 0;
        marginLayoutParams.f4743J = 0;
        marginLayoutParams.f4744K = 0;
        marginLayoutParams.f4745L = 0;
        marginLayoutParams.f4746M = 0;
        marginLayoutParams.f4747N = 1.0f;
        marginLayoutParams.f4748O = 1.0f;
        marginLayoutParams.f4749P = -1;
        marginLayoutParams.f4750Q = -1;
        marginLayoutParams.f4751R = -1;
        marginLayoutParams.f4752S = false;
        marginLayoutParams.f4753T = false;
        marginLayoutParams.f4754U = null;
        marginLayoutParams.f4755V = true;
        marginLayoutParams.f4756W = true;
        marginLayoutParams.f4757X = false;
        marginLayoutParams.f4758Y = false;
        marginLayoutParams.f4759Z = false;
        marginLayoutParams.f4761a0 = -1;
        marginLayoutParams.f4763b0 = -1;
        marginLayoutParams.f4764c0 = -1;
        marginLayoutParams.f4766d0 = -1;
        marginLayoutParams.f4768e0 = -1;
        marginLayoutParams.f4770f0 = -1;
        marginLayoutParams.f4771g0 = 0.5f;
        marginLayoutParams.f4777k0 = new r.d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f4881b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            int i5 = c.f4734a.get(index);
            switch (i5) {
                case 1:
                    marginLayoutParams.f4751R = obtainStyledAttributes.getInt(index, marginLayoutParams.f4751R);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4779m);
                    marginLayoutParams.f4779m = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f4779m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f4780n = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4780n);
                    break;
                case 4:
                    float f3 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4781o) % 360.0f;
                    marginLayoutParams.f4781o = f3;
                    if (f3 < 0.0f) {
                        marginLayoutParams.f4781o = (360.0f - f3) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.f4760a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4760a);
                    break;
                case 6:
                    marginLayoutParams.f4762b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4762b);
                    break;
                case 7:
                    marginLayoutParams.c = obtainStyledAttributes.getFloat(index, marginLayoutParams.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4765d);
                    marginLayoutParams.f4765d = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f4765d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4767e);
                    marginLayoutParams.f4767e = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f4767e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4769f);
                    marginLayoutParams.f4769f = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f4769f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.g);
                    marginLayoutParams.g = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4773i);
                    marginLayoutParams.f4773i = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f4773i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4774j);
                    marginLayoutParams.f4774j = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f4774j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4776k);
                    marginLayoutParams.f4776k = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f4776k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4778l);
                    marginLayoutParams.f4778l = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f4778l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4782p);
                    marginLayoutParams.f4782p = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f4782p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4783q);
                    marginLayoutParams.f4783q = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f4783q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4784r);
                    marginLayoutParams.f4784r = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f4784r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f4785s);
                    marginLayoutParams.f4785s = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f4785s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f4786t = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4786t);
                    break;
                case 22:
                    marginLayoutParams.f4787u = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4787u);
                    break;
                case 23:
                    marginLayoutParams.f4788v = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4788v);
                    break;
                case 24:
                    marginLayoutParams.f4789w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4789w);
                    break;
                case 25:
                    marginLayoutParams.f4790x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4790x);
                    break;
                case 26:
                    marginLayoutParams.f4791y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4791y);
                    break;
                case 27:
                    marginLayoutParams.f4752S = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f4752S);
                    break;
                case 28:
                    marginLayoutParams.f4753T = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f4753T);
                    break;
                case 29:
                    marginLayoutParams.f4792z = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4792z);
                    break;
                case 30:
                    marginLayoutParams.f4735A = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4735A);
                    break;
                case 31:
                    marginLayoutParams.f4741H = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    marginLayoutParams.f4742I = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        marginLayoutParams.f4743J = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4743J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4743J) == -2) {
                            marginLayoutParams.f4743J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f4745L = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4745L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4745L) == -2) {
                            marginLayoutParams.f4745L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f4747N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f4747N));
                    marginLayoutParams.f4741H = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.f4744K = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4744K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4744K) == -2) {
                            marginLayoutParams.f4744K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f4746M = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f4746M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f4746M) == -2) {
                            marginLayoutParams.f4746M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f4748O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f4748O));
                    marginLayoutParams.f4742I = 2;
                    break;
                default:
                    switch (i5) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            marginLayoutParams.f4736B = string;
                            marginLayoutParams.f4737C = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = marginLayoutParams.f4736B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i3 = 0;
                                } else {
                                    String substring = marginLayoutParams.f4736B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        marginLayoutParams.f4737C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        marginLayoutParams.f4737C = 1;
                                    }
                                    i3 = indexOf + 1;
                                }
                                int indexOf2 = marginLayoutParams.f4736B.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = marginLayoutParams.f4736B.substring(i3, indexOf2);
                                    String substring3 = marginLayoutParams.f4736B.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (marginLayoutParams.f4737C == 1) {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = marginLayoutParams.f4736B.substring(i3);
                                    if (substring4.length() > 0) {
                                        Float.parseFloat(substring4);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            marginLayoutParams.D = obtainStyledAttributes.getFloat(index, marginLayoutParams.D);
                            break;
                        case 46:
                            marginLayoutParams.f4738E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f4738E);
                            break;
                        case 47:
                            marginLayoutParams.f4739F = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f4740G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f4749P = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4749P);
                            break;
                        case 50:
                            marginLayoutParams.f4750Q = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f4750Q);
                            break;
                        case 51:
                            marginLayoutParams.f4754U = obtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.g;
    }

    public int getMinHeight() {
        return this.f1689f;
    }

    public int getMinWidth() {
        return this.f1688e;
    }

    public int getOptimizationLevel() {
        return this.f1687d.f4570p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            d dVar = (d) childAt.getLayoutParams();
            r.d dVar2 = dVar.f4777k0;
            if (childAt.getVisibility() != 8 || dVar.f4758Y || dVar.f4759Z || isInEditMode) {
                int m3 = dVar2.m();
                int n3 = dVar2.n();
                childAt.layout(m3, n3, dVar2.l() + m3, dVar2.i() + n3);
            }
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((b) arrayList.get(i8)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:261:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0178  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i3, int i4) {
        e eVar;
        boolean z3;
        int i5;
        int i6;
        e eVar2;
        r.d dVar;
        int i7;
        r.d dVar2;
        int i8;
        r.d dVar3;
        int i9;
        float f3;
        int i10;
        int i11;
        int i12;
        float parseFloat;
        int i13;
        ArrayList arrayList;
        int i14;
        View view;
        ArrayList arrayList2;
        View view2;
        int i15;
        String resourceName;
        int id;
        r.d dVar4;
        ConstraintLayout constraintLayout = this;
        int i16 = 0;
        boolean z4 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        e eVar3 = constraintLayout.f1687d;
        eVar3.f4563h0 = z4;
        if (constraintLayout.f1690i) {
            constraintLayout.f1690i = false;
            int childCount = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    z3 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i17).isLayoutRequested()) {
                        z3 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (z3) {
                boolean isInEditMode = isInEditMode();
                int childCount2 = getChildCount();
                for (int i18 = 0; i18 < childCount2; i18++) {
                    r.d b3 = constraintLayout.b(constraintLayout.getChildAt(i18));
                    if (b3 != null) {
                        b3.s();
                    }
                }
                SparseArray sparseArray = constraintLayout.f1686b;
                if (isInEditMode) {
                    for (int i19 = 0; i19 < childCount2; i19++) {
                        View childAt = constraintLayout.getChildAt(i19);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName instanceof String) {
                                if (constraintLayout.f1695n == null) {
                                    constraintLayout.f1695n = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1695n.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view3 = (View) sparseArray.get(id);
                            if (view3 == null && (view3 = constraintLayout.findViewById(id)) != null && view3 != constraintLayout && view3.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view3);
                            }
                            if (view3 != constraintLayout) {
                                dVar4 = view3 == null ? null : ((d) view3.getLayoutParams()).f4777k0;
                                dVar4.f4529W = resourceName;
                            }
                        }
                        dVar4 = eVar3;
                        dVar4.f4529W = resourceName;
                    }
                }
                if (constraintLayout.f1694m != -1) {
                    for (int i20 = 0; i20 < childCount2; i20++) {
                        constraintLayout.getChildAt(i20).getId();
                    }
                }
                k kVar = constraintLayout.f1692k;
                if (kVar != null) {
                    kVar.a(constraintLayout);
                }
                eVar3.f4559d0.clear();
                ArrayList arrayList3 = constraintLayout.c;
                int size = arrayList3.size();
                if (size > 0) {
                    int i21 = 0;
                    while (i21 < size) {
                        b bVar = (b) arrayList3.get(i21);
                        if (bVar.isInEditMode()) {
                            bVar.setIds(bVar.f4733f);
                        }
                        i iVar = bVar.f4732e;
                        if (iVar == null) {
                            arrayList = arrayList3;
                            i14 = size;
                        } else {
                            iVar.f4627e0 = i16;
                            Arrays.fill(iVar.f4626d0, (Object) null);
                            int i22 = i16;
                            while (i22 < bVar.c) {
                                int i23 = bVar.f4730b[i22];
                                View view4 = (View) constraintLayout.f1686b.get(i23);
                                if (view4 == null) {
                                    Integer valueOf2 = Integer.valueOf(i23);
                                    HashMap hashMap = bVar.g;
                                    String str = (String) hashMap.get(valueOf2);
                                    view = view4;
                                    int d3 = bVar.d(constraintLayout, str);
                                    arrayList2 = arrayList3;
                                    if (d3 != 0) {
                                        bVar.f4730b[i22] = d3;
                                        hashMap.put(Integer.valueOf(d3), str);
                                        view2 = (View) constraintLayout.f1686b.get(d3);
                                        if (view2 != null) {
                                            i iVar2 = bVar.f4732e;
                                            r.d b4 = constraintLayout.b(view2);
                                            iVar2.getClass();
                                            if (b4 != iVar2 && b4 != null) {
                                                int i24 = iVar2.f4627e0 + 1;
                                                r.d[] dVarArr = iVar2.f4626d0;
                                                i15 = size;
                                                if (i24 > dVarArr.length) {
                                                    iVar2.f4626d0 = (r.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                                }
                                                r.d[] dVarArr2 = iVar2.f4626d0;
                                                int i25 = iVar2.f4627e0;
                                                dVarArr2[i25] = b4;
                                                iVar2.f4627e0 = i25 + 1;
                                                i22++;
                                                size = i15;
                                                arrayList3 = arrayList2;
                                            }
                                        }
                                        i15 = size;
                                        i22++;
                                        size = i15;
                                        arrayList3 = arrayList2;
                                    }
                                } else {
                                    view = view4;
                                    arrayList2 = arrayList3;
                                }
                                view2 = view;
                                if (view2 != null) {
                                }
                                i15 = size;
                                i22++;
                                size = i15;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            i14 = size;
                            bVar.f4732e.B();
                        }
                        i21++;
                        size = i14;
                        arrayList3 = arrayList;
                        i16 = 0;
                    }
                }
                for (int i26 = 0; i26 < childCount2; i26++) {
                    constraintLayout.getChildAt(i26);
                }
                SparseArray sparseArray2 = constraintLayout.f1696o;
                sparseArray2.clear();
                sparseArray2.put(0, eVar3);
                sparseArray2.put(getId(), eVar3);
                for (int i27 = 0; i27 < childCount2; i27++) {
                    View childAt2 = constraintLayout.getChildAt(i27);
                    sparseArray2.put(childAt2.getId(), constraintLayout.b(childAt2));
                }
                int i28 = 0;
                while (i28 < childCount2) {
                    View childAt3 = constraintLayout.getChildAt(i28);
                    r.d b5 = constraintLayout.b(childAt3);
                    if (b5 != null) {
                        d dVar5 = (d) childAt3.getLayoutParams();
                        eVar3.f4559d0.add(b5);
                        r.d dVar6 = b5.f4515I;
                        if (dVar6 != null) {
                            ((e) dVar6).f4559d0.remove(b5);
                            b5.f4515I = null;
                        }
                        b5.f4515I = eVar3;
                        dVar5.a();
                        b5.f4528V = childAt3.getVisibility();
                        b5.f4527U = childAt3;
                        if (childAt3 instanceof b) {
                            ((b) childAt3).f(b5, eVar3.f4563h0);
                        }
                        if (dVar5.f4758Y) {
                            h hVar = (h) b5;
                            int i29 = dVar5.f4772h0;
                            int i30 = dVar5.i0;
                            float f4 = dVar5.f4775j0;
                            if (f4 != -1.0f) {
                                if (f4 > -1.0f) {
                                    hVar.f4621d0 = f4;
                                    hVar.f4622e0 = -1;
                                    hVar.f4623f0 = -1;
                                }
                            } else if (i29 != -1) {
                                if (i29 > -1) {
                                    hVar.f4621d0 = -1.0f;
                                    hVar.f4622e0 = i29;
                                    hVar.f4623f0 = -1;
                                }
                            } else if (i30 != -1 && i30 > -1) {
                                hVar.f4621d0 = -1.0f;
                                hVar.f4622e0 = -1;
                                hVar.f4623f0 = i30;
                            }
                        } else {
                            int i31 = dVar5.f4761a0;
                            int i32 = dVar5.f4763b0;
                            int i33 = dVar5.f4764c0;
                            int i34 = dVar5.f4766d0;
                            i6 = childCount2;
                            int i35 = dVar5.f4768e0;
                            int i36 = dVar5.f4770f0;
                            float f5 = dVar5.f4771g0;
                            int i37 = dVar5.f4779m;
                            eVar2 = eVar3;
                            if (i37 != -1) {
                                r.d dVar7 = (r.d) sparseArray2.get(i37);
                                if (dVar7 != null) {
                                    float f6 = dVar5.f4781o;
                                    b5.o(7, 7, dVar5.f4780n, 0, dVar7);
                                    b5.f4554v = f6;
                                }
                            } else {
                                int i38 = -1;
                                if (i31 != -1) {
                                    r.d dVar8 = (r.d) sparseArray2.get(i31);
                                    if (dVar8 != null) {
                                        b5.o(2, 2, ((ViewGroup.MarginLayoutParams) dVar5).leftMargin, i35, dVar8);
                                    }
                                } else {
                                    if (i32 != -1) {
                                        r.d dVar9 = (r.d) sparseArray2.get(i32);
                                        if (dVar9 != null) {
                                            b5.o(2, 4, ((ViewGroup.MarginLayoutParams) dVar5).leftMargin, i35, dVar9);
                                        }
                                    }
                                    if (i33 == i38) {
                                        r.d dVar10 = (r.d) sparseArray2.get(i33);
                                        if (dVar10 != null) {
                                            b5.o(4, 2, ((ViewGroup.MarginLayoutParams) dVar5).rightMargin, i36, dVar10);
                                        }
                                    } else if (i34 != i38 && (dVar = (r.d) sparseArray2.get(i34)) != null) {
                                        b5.o(4, 4, ((ViewGroup.MarginLayoutParams) dVar5).rightMargin, i36, dVar);
                                    }
                                    i7 = dVar5.h;
                                    if (i7 == -1) {
                                        r.d dVar11 = (r.d) sparseArray2.get(i7);
                                        if (dVar11 != null) {
                                            b5.o(3, 3, ((ViewGroup.MarginLayoutParams) dVar5).topMargin, dVar5.f4787u, dVar11);
                                        }
                                    } else {
                                        int i39 = dVar5.f4773i;
                                        if (i39 != -1 && (dVar2 = (r.d) sparseArray2.get(i39)) != null) {
                                            b5.o(3, 5, ((ViewGroup.MarginLayoutParams) dVar5).topMargin, dVar5.f4787u, dVar2);
                                        }
                                    }
                                    i8 = dVar5.f4774j;
                                    if (i8 == -1) {
                                        r.d dVar12 = (r.d) sparseArray2.get(i8);
                                        if (dVar12 != null) {
                                            b5.o(5, 3, ((ViewGroup.MarginLayoutParams) dVar5).bottomMargin, dVar5.f4789w, dVar12);
                                        }
                                    } else {
                                        int i40 = dVar5.f4776k;
                                        if (i40 != -1 && (dVar3 = (r.d) sparseArray2.get(i40)) != null) {
                                            b5.o(5, 5, ((ViewGroup.MarginLayoutParams) dVar5).bottomMargin, dVar5.f4789w, dVar3);
                                        }
                                    }
                                    i9 = dVar5.f4778l;
                                    if (i9 != -1) {
                                        View view5 = (View) sparseArray.get(i9);
                                        r.d dVar13 = (r.d) sparseArray2.get(dVar5.f4778l);
                                        if (dVar13 != null && view5 != null && (view5.getLayoutParams() instanceof d)) {
                                            d dVar14 = (d) view5.getLayoutParams();
                                            dVar5.f4757X = true;
                                            dVar14.f4757X = true;
                                            b5.g(6).b(dVar13.g(6), 0, -1, true);
                                            b5.f4555w = true;
                                            dVar14.f4777k0.f4555w = true;
                                            b5.g(3).h();
                                            b5.g(5).h();
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        b5.f4525S = f5;
                                    }
                                    f3 = dVar5.f4735A;
                                    if (f3 >= 0.0f) {
                                        b5.f4526T = f3;
                                    }
                                }
                                i38 = -1;
                                if (i33 == i38) {
                                }
                                i7 = dVar5.h;
                                if (i7 == -1) {
                                }
                                i8 = dVar5.f4774j;
                                if (i8 == -1) {
                                }
                                i9 = dVar5.f4778l;
                                if (i9 != -1) {
                                }
                                if (f5 >= 0.0f) {
                                }
                                f3 = dVar5.f4735A;
                                if (f3 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i13 = dVar5.f4749P) != -1 || dVar5.f4750Q != -1)) {
                                int i41 = dVar5.f4750Q;
                                b5.f4520N = i13;
                                b5.f4521O = i41;
                            }
                            if (dVar5.f4755V) {
                                b5.w(1);
                                b5.y(((ViewGroup.MarginLayoutParams) dVar5).width);
                                if (((ViewGroup.MarginLayoutParams) dVar5).width == -2) {
                                    b5.w(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) dVar5).width == -1) {
                                if (dVar5.f4752S) {
                                    b5.w(3);
                                } else {
                                    b5.w(4);
                                }
                                b5.g(2).f4506e = ((ViewGroup.MarginLayoutParams) dVar5).leftMargin;
                                b5.g(4).f4506e = ((ViewGroup.MarginLayoutParams) dVar5).rightMargin;
                            } else {
                                b5.w(3);
                                b5.y(0);
                            }
                            if (dVar5.f4756W) {
                                i10 = -1;
                                b5.x(1);
                                b5.v(((ViewGroup.MarginLayoutParams) dVar5).height);
                                if (((ViewGroup.MarginLayoutParams) dVar5).height == -2) {
                                    b5.x(2);
                                }
                            } else {
                                i10 = -1;
                                if (((ViewGroup.MarginLayoutParams) dVar5).height == -1) {
                                    if (dVar5.f4753T) {
                                        b5.x(3);
                                    } else {
                                        b5.x(4);
                                    }
                                    b5.g(3).f4506e = ((ViewGroup.MarginLayoutParams) dVar5).topMargin;
                                    b5.g(5).f4506e = ((ViewGroup.MarginLayoutParams) dVar5).bottomMargin;
                                } else {
                                    b5.x(3);
                                    b5.v(0);
                                }
                            }
                            String str2 = dVar5.f4736B;
                            if (str2 == null || str2.length() == 0) {
                                b5.f4518L = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i11 = i10;
                                    i12 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i11 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i10;
                                    i12 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i12);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i12, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i11 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    b5.f4518L = parseFloat;
                                    b5.f4519M = i11;
                                }
                            }
                            float f7 = dVar5.D;
                            float[] fArr = b5.f4532Z;
                            fArr[0] = f7;
                            fArr[1] = dVar5.f4738E;
                            b5.f4530X = dVar5.f4739F;
                            b5.f4531Y = dVar5.f4740G;
                            int i42 = dVar5.f4741H;
                            int i43 = dVar5.f4743J;
                            int i44 = dVar5.f4745L;
                            float f8 = dVar5.f4747N;
                            b5.f4542j = i42;
                            b5.f4545m = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            b5.f4546n = i44;
                            b5.f4547o = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i42 == 0) {
                                b5.f4542j = 2;
                            }
                            int i45 = dVar5.f4742I;
                            int i46 = dVar5.f4744K;
                            int i47 = dVar5.f4746M;
                            float f9 = dVar5.f4748O;
                            b5.f4543k = i45;
                            b5.f4548p = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            b5.f4549q = i47;
                            b5.f4550r = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i45 == 0) {
                                b5.f4543k = 2;
                            }
                            i28++;
                            constraintLayout = this;
                            childCount2 = i6;
                            eVar3 = eVar2;
                        }
                    }
                    eVar2 = eVar3;
                    i6 = childCount2;
                    i28++;
                    constraintLayout = this;
                    childCount2 = i6;
                    eVar3 = eVar2;
                }
            }
            eVar = eVar3;
            if (z3) {
                ArrayList arrayList4 = (ArrayList) eVar.f4560e0.c;
                arrayList4.clear();
                int size2 = eVar.f4559d0.size();
                for (int i48 = 0; i48 < size2; i48++) {
                    r.d dVar15 = (r.d) eVar.f4559d0.get(i48);
                    int[] iArr = dVar15.f4537c0;
                    int i49 = iArr[0];
                    if (i49 == 3 || i49 == 4 || (i5 = iArr[1]) == 3 || i5 == 4) {
                        arrayList4.add(dVar15);
                    }
                }
                eVar.f4561f0.f4673b = true;
            }
        } else {
            eVar = eVar3;
        }
        e(eVar, this.f1691j, i3, i4);
        int l3 = eVar.l();
        int i50 = eVar.i();
        boolean z5 = eVar.f4571q0;
        boolean z6 = eVar.f4572r0;
        C0363a c0363a = this.f1697p;
        int i51 = c0363a.f4421d;
        int resolveSizeAndState = View.resolveSizeAndState(l3 + c0363a.c, i3, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i50 + i51, i4, 0) & 16777215;
        int min = Math.min(this.g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.h, resolveSizeAndState2);
        if (z5) {
            min |= 16777216;
        }
        if (z6) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        r.d b3 = b(view);
        if ((view instanceof t.m) && !(b3 instanceof h)) {
            d dVar = (d) view.getLayoutParams();
            h hVar = new h();
            dVar.f4777k0 = hVar;
            dVar.f4758Y = true;
            hVar.B(dVar.f4751R);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.g();
            ((d) view.getLayoutParams()).f4759Z = true;
            ArrayList arrayList = this.c;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f1686b.put(view.getId(), view);
        this.f1690i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1686b.remove(view.getId());
        r.d b3 = b(view);
        this.f1687d.f4559d0.remove(b3);
        b3.f4515I = null;
        this.c.remove(view);
        this.f1690i = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1690i = true;
        super.requestLayout();
    }

    public void setConstraintSet(k kVar) {
        this.f1692k = kVar;
    }

    @Override // android.view.View
    public void setId(int i3) {
        int id = getId();
        SparseArray sparseArray = this.f1686b;
        sparseArray.remove(id);
        super.setId(i3);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i3) {
        if (i3 == this.h) {
            return;
        }
        this.h = i3;
        requestLayout();
    }

    public void setMaxWidth(int i3) {
        if (i3 == this.g) {
            return;
        }
        this.g = i3;
        requestLayout();
    }

    public void setMinHeight(int i3) {
        if (i3 == this.f1689f) {
            return;
        }
        this.f1689f = i3;
        requestLayout();
    }

    public void setMinWidth(int i3) {
        if (i3 == this.f1688e) {
            return;
        }
        this.f1688e = i3;
        requestLayout();
    }

    public void setOnConstraintsChanged(t.l lVar) {
        r rVar = this.f1693l;
        if (rVar != null) {
            rVar.getClass();
        }
    }

    public void setOptimizationLevel(int i3) {
        this.f1691j = i3;
        this.f1687d.f4570p0 = i3;
        C0361e.f4380p = (i3 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f1686b = new SparseArray();
        this.c = new ArrayList(4);
        this.f1687d = new e();
        this.f1688e = 0;
        this.f1689f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.f1690i = true;
        this.f1691j = 263;
        this.f1692k = null;
        this.f1693l = null;
        this.f1694m = -1;
        this.f1695n = new HashMap();
        this.f1696o = new SparseArray();
        this.f1697p = new C0363a(this);
        c(attributeSet, i3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, t.d] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f4760a = -1;
        marginLayoutParams.f4762b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.f4765d = -1;
        marginLayoutParams.f4767e = -1;
        marginLayoutParams.f4769f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.f4773i = -1;
        marginLayoutParams.f4774j = -1;
        marginLayoutParams.f4776k = -1;
        marginLayoutParams.f4778l = -1;
        marginLayoutParams.f4779m = -1;
        marginLayoutParams.f4780n = 0;
        marginLayoutParams.f4781o = 0.0f;
        marginLayoutParams.f4782p = -1;
        marginLayoutParams.f4783q = -1;
        marginLayoutParams.f4784r = -1;
        marginLayoutParams.f4785s = -1;
        marginLayoutParams.f4786t = -1;
        marginLayoutParams.f4787u = -1;
        marginLayoutParams.f4788v = -1;
        marginLayoutParams.f4789w = -1;
        marginLayoutParams.f4790x = -1;
        marginLayoutParams.f4791y = -1;
        marginLayoutParams.f4792z = 0.5f;
        marginLayoutParams.f4735A = 0.5f;
        marginLayoutParams.f4736B = null;
        marginLayoutParams.f4737C = 1;
        marginLayoutParams.D = -1.0f;
        marginLayoutParams.f4738E = -1.0f;
        marginLayoutParams.f4739F = 0;
        marginLayoutParams.f4740G = 0;
        marginLayoutParams.f4741H = 0;
        marginLayoutParams.f4742I = 0;
        marginLayoutParams.f4743J = 0;
        marginLayoutParams.f4744K = 0;
        marginLayoutParams.f4745L = 0;
        marginLayoutParams.f4746M = 0;
        marginLayoutParams.f4747N = 1.0f;
        marginLayoutParams.f4748O = 1.0f;
        marginLayoutParams.f4749P = -1;
        marginLayoutParams.f4750Q = -1;
        marginLayoutParams.f4751R = -1;
        marginLayoutParams.f4752S = false;
        marginLayoutParams.f4753T = false;
        marginLayoutParams.f4754U = null;
        marginLayoutParams.f4755V = true;
        marginLayoutParams.f4756W = true;
        marginLayoutParams.f4757X = false;
        marginLayoutParams.f4758Y = false;
        marginLayoutParams.f4759Z = false;
        marginLayoutParams.f4761a0 = -1;
        marginLayoutParams.f4763b0 = -1;
        marginLayoutParams.f4764c0 = -1;
        marginLayoutParams.f4766d0 = -1;
        marginLayoutParams.f4768e0 = -1;
        marginLayoutParams.f4770f0 = -1;
        marginLayoutParams.f4771g0 = 0.5f;
        marginLayoutParams.f4777k0 = new r.d();
        return marginLayoutParams;
    }
}
