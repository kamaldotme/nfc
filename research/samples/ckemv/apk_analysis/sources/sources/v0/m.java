package v0;

import J.B;
import J.T;
import Z.C0035b;
import Z.C0057y;
import Z.W;
import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.u;
import androidx.fragment.app.AbstractComponentCallbacksC0077n;
import androidx.fragment.app.C0068e;
import androidx.fragment.app.D;
import androidx.fragment.app.G;
import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.L;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import f0.C0173i;
import j1.C0234d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import k.C0264U;
import k.C0308t;
import p1.C0356a;
import q1.C0363a;
import s.C0372b;
import z.AbstractC0464n;

/* loaded from: classes.dex */
public final class m implements F.c {

    /* renamed from: f, reason: collision with root package name */
    public static m f5085f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5086b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5087d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5088e;

    public m(androidx.lifecycle.r rVar) {
        this.f5086b = 6;
        X1.g.e(rVar, "provider");
        this.c = new t(rVar);
        this.f5087d = new Handler();
    }

    public static m F(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4) {
        return new m(context, context.obtainStyledAttributes(attributeSet, iArr, i3, i4));
    }

    public static boolean g(Editable editable, KeyEvent keyEvent, boolean z3) {
        u[] uVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) != null && uVarArr.length > 0) {
            for (u uVar : uVarArr) {
                int spanStart = editable.getSpanStart(uVar);
                int spanEnd = editable.getSpanEnd(uVar);
                if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static int j(int i3, int i4, C0356a c0356a) {
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (c0356a.a(i3 + i6)) {
                i5 |= 1 << ((i4 - i6) - 1);
            }
        }
        return i5;
    }

    public boolean A(int i3) {
        int i4;
        int i5 = i3 + 1;
        C0356a c0356a = (C0356a) this.c;
        if (i5 > c0356a.c) {
            return false;
        }
        for (int i6 = 0; i6 < 5 && (i4 = i6 + i3) < c0356a.c; i6++) {
            if (i6 == 2) {
                if (!c0356a.a(i3 + 2)) {
                    return false;
                }
            } else if (c0356a.a(i4)) {
                return false;
            }
        }
        return true;
    }

    public boolean B(View view) {
        return ((ArrayList) this.f5088e).contains(view);
    }

    public void C(G g) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g.c;
        String str = abstractComponentCallbacksC0077n.f1972f;
        HashMap hashMap = (HashMap) this.f5087d;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0077n.f1972f, g);
        if (Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC0077n.toString();
        }
    }

    public void D(G g) {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g.c;
        if (abstractComponentCallbacksC0077n.f1954B) {
            ((D) this.f5088e).b(abstractComponentCallbacksC0077n);
        }
        if (((G) ((HashMap) this.f5087d).put(abstractComponentCallbacksC0077n.f1972f, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC0077n.toString();
        }
    }

    public boolean E(C0363a c0363a, r.d dVar, boolean z3) {
        int[] iArr = dVar.f4537c0;
        int i3 = iArr[0];
        C0372b c0372b = (C0372b) this.f5087d;
        c0372b.f4663a = i3;
        c0372b.f4664b = iArr[1];
        c0372b.c = dVar.l();
        c0372b.f4665d = dVar.i();
        c0372b.f4668i = false;
        c0372b.f4669j = z3;
        boolean z4 = c0372b.f4663a == 3;
        boolean z5 = c0372b.f4664b == 3;
        boolean z6 = z4 && dVar.f4518L > 0.0f;
        boolean z7 = z5 && dVar.f4518L > 0.0f;
        int[] iArr2 = dVar.f4544l;
        if (z6 && iArr2[0] == 4) {
            c0372b.f4663a = 1;
        }
        if (z7 && iArr2[1] == 4) {
            c0372b.f4664b = 1;
        }
        c0363a.d(dVar, c0372b);
        dVar.y(c0372b.f4666e);
        dVar.v(c0372b.f4667f);
        dVar.f4555w = c0372b.h;
        int i4 = c0372b.g;
        dVar.f4522P = i4;
        dVar.f4555w = i4 > 0;
        c0372b.f4669j = false;
        return c0372b.f4668i;
    }

    public void G(EnumC0095l enumC0095l) {
        L l3 = (L) this.f5088e;
        if (l3 != null) {
            l3.run();
        }
        L l4 = new L((t) this.c, enumC0095l);
        this.f5088e = l4;
        ((Handler) this.f5087d).postAtFrontOfQueue(l4);
    }

    public boolean H(int i3, int i4, int i5, int i6) {
        if (i3 < 0) {
            i3 += i5;
            i4 += 4 - ((i5 + 4) & 7);
        }
        if (i4 < 0) {
            i4 += i6;
            i3 += 4 - ((i6 + 4) & 7);
        }
        ((p1.b) this.f5087d).f(i4, i3);
        return ((p1.b) this.c).b(i4, i3);
    }

    public int I(int i3, int i4, int i5, int i6) {
        int i7 = i3 - 2;
        int i8 = i4 - 2;
        int i9 = (H(i7, i8, i5, i6) ? 1 : 0) << 1;
        int i10 = i4 - 1;
        if (H(i7, i10, i5, i6)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        int i12 = i3 - 1;
        if (H(i12, i8, i5, i6)) {
            i11 |= 1;
        }
        int i13 = i11 << 1;
        if (H(i12, i10, i5, i6)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (H(i12, i4, i5, i6)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (H(i3, i8, i5, i6)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (H(i3, i10, i5, i6)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        return H(i3, i4, i5, i6) ? i17 | 1 : i17;
    }

    public void J() {
        ((TypedArray) this.f5087d).recycle();
    }

    public void K(r.e eVar, int i3, int i4) {
        int i5 = eVar.f4523Q;
        int i6 = eVar.f4524R;
        eVar.f4523Q = 0;
        eVar.f4524R = 0;
        eVar.y(i3);
        eVar.v(i4);
        if (i5 < 0) {
            eVar.f4523Q = 0;
        } else {
            eVar.f4523Q = i5;
        }
        if (i6 < 0) {
            eVar.f4524R = 0;
        } else {
            eVar.f4524R = i6;
        }
        ((r.e) this.f5088e).E();
    }

    public void L(View view) {
        if (((ArrayList) this.f5088e).remove(view)) {
            C0057y c0057y = (C0057y) this.c;
            c0057y.getClass();
            W I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i3 = I2.f1217p;
                RecyclerView recyclerView = c0057y.f1371a;
                if (recyclerView.L()) {
                    I2.f1218q = i3;
                    recyclerView.f2145q0.add(I2);
                } else {
                    WeakHashMap weakHashMap = T.f402a;
                    B.s(I2.f1205a, i3);
                }
                I2.f1217p = 0;
            }
        }
    }

    public void a(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (((ArrayList) this.c).contains(abstractComponentCallbacksC0077n)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0077n);
        }
        synchronized (((ArrayList) this.c)) {
            ((ArrayList) this.c).add(abstractComponentCallbacksC0077n);
        }
        abstractComponentCallbacksC0077n.f1976l = true;
    }

    public void b(View view, int i3, boolean z3) {
        C0057y c0057y = (C0057y) this.c;
        int childCount = i3 < 0 ? c0057y.f1371a.getChildCount() : v(i3);
        ((C0035b) this.f5087d).e(childCount, z3);
        if (z3) {
            z(view);
        }
        c0057y.f1371a.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void c(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z3) {
        C0057y c0057y = (C0057y) this.c;
        int childCount = i3 < 0 ? c0057y.f1371a.getChildCount() : v(i3);
        ((C0035b) this.f5087d).e(childCount, z3);
        if (z3) {
            z(view);
        }
        c0057y.getClass();
        W I2 = RecyclerView.I(view);
        RecyclerView recyclerView = c0057y.f1371a;
        if (I2 != null) {
            if (!I2.l() && !I2.q()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f1211j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public String d(StringBuilder sb, int i3) {
        String str = null;
        while (true) {
            A1.k e3 = e(str, i3);
            String a3 = A1.n.a(e3.f53b);
            if (a3 != null) {
                sb.append(a3);
            }
            String valueOf = e3.f54d ? String.valueOf(e3.c) : null;
            int i4 = e3.f56a;
            if (i3 == i4) {
                return sb.toString();
            }
            i3 = i4;
            str = valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0212, code lost:
    
        if (r5 <= r6.c) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0215, code lost:
    
        if (r3 >= r5) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x021b, code lost:
    
        if (r6.a(r3) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0237, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x023a, code lost:
    
        r1.f51b += 3;
        r1.c = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0243, code lost:
    
        r5 = new A1.h((java.lang.Object) null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0223, code lost:
    
        if (A(r1.f51b) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0225, code lost:
    
        r3 = r1.f51b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0229, code lost:
    
        if ((r3 + 5) >= r13) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x022b, code lost:
    
        r1.f51b = r3 + 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0234, code lost:
    
        r1.c = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0231, code lost:
    
        r1.f51b = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02c3, code lost:
    
        r3 = r5;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0316 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A1.k e(String str, int i3) {
        int i4;
        boolean z3;
        A1.h hVar;
        boolean z4;
        int i5;
        A1.l lVar;
        int i6;
        A1.h hVar2;
        A1.h hVar3;
        int j3;
        int j4;
        int j5;
        char c;
        A1.j jVar;
        int i7;
        int i8;
        int j6;
        int j7;
        char c3;
        A1.j jVar2;
        A1.j jVar3;
        StringBuilder sb = (StringBuilder) this.f5088e;
        sb.setLength(0);
        if (str != null) {
            sb.append(str);
        }
        A1.i iVar = (A1.i) this.f5087d;
        iVar.f51b = i3;
        do {
            int i9 = iVar.f51b;
            int i10 = iVar.c;
            C0356a c0356a = (C0356a) this.c;
            if (i10 == 2) {
                while (true) {
                    int i11 = iVar.f51b;
                    int i12 = i11 + 5;
                    i8 = c0356a.c;
                    if (i12 <= i8 && (((j6 = j(i11, 5, c0356a)) >= 5 && j6 < 16) || (i11 + 6 <= i8 && (j7 = j(i11, 6, c0356a)) >= 16 && j7 < 63))) {
                        int i13 = iVar.f51b;
                        int j8 = j(i13, 5, c0356a);
                        if (j8 == 15) {
                            jVar3 = new A1.j('$', i13 + 5);
                        } else {
                            if (j8 < 5 || j8 >= 15) {
                                int j9 = j(i13, 6, c0356a);
                                if (j9 < 32 || j9 >= 58) {
                                    switch (j9) {
                                        case 58:
                                            c3 = '*';
                                            break;
                                        case 59:
                                            c3 = ',';
                                            break;
                                        case 60:
                                            c3 = '-';
                                            break;
                                        case 61:
                                            c3 = '.';
                                            break;
                                        case 62:
                                            c3 = '/';
                                            break;
                                        default:
                                            throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(j9)));
                                    }
                                    jVar2 = new A1.j(c3, i13 + 6);
                                } else {
                                    jVar2 = new A1.j((char) (j9 + 33), i13 + 6);
                                }
                            } else {
                                jVar2 = new A1.j((char) (j8 + 43), i13 + 5);
                            }
                            jVar3 = jVar2;
                        }
                        int i14 = jVar3.f56a;
                        iVar.f51b = i14;
                        char c4 = jVar3.f52b;
                        if (c4 == '$') {
                            hVar3 = new A1.h((Object) new A1.k(sb.toString(), i14), true);
                        } else {
                            sb.append(c4);
                        }
                    }
                }
                int i15 = iVar.f51b;
                int i16 = i15 + 3;
                if (i16 <= c0356a.c) {
                    while (i15 < i16) {
                        if (!c0356a.a(i15)) {
                            i15++;
                        }
                    }
                    iVar.f51b += 3;
                    iVar.c = 1;
                    hVar3 = new A1.h((Object) null, false);
                    z4 = hVar3.f48a;
                }
                if (A(iVar.f51b)) {
                    int i17 = iVar.f51b;
                    if (i17 + 5 < i8) {
                        iVar.f51b = i17 + 5;
                    } else {
                        iVar.f51b = i8;
                    }
                    iVar.c = 3;
                }
                hVar3 = new A1.h((Object) null, false);
                z4 = hVar3.f48a;
            } else if (i10 == 3) {
                while (true) {
                    int i18 = iVar.f51b;
                    int i19 = i18 + 5;
                    int i20 = c0356a.c;
                    if (i19 <= i20 && (((j3 = j(i18, 5, c0356a)) >= 5 && j3 < 16) || (i18 + 7 <= i20 && (((j4 = j(i18, 7, c0356a)) >= 64 && j4 < 116) || (i18 + 8 <= i20 && (j5 = j(i18, 8, c0356a)) >= 232 && j5 < 253))))) {
                        int i21 = iVar.f51b;
                        int j10 = j(i21, 5, c0356a);
                        if (j10 == 15) {
                            jVar = new A1.j('$', i21 + 5);
                        } else if (j10 < 5 || j10 >= 15) {
                            int j11 = j(i21, 7, c0356a);
                            if (j11 >= 64 && j11 < 90) {
                                jVar = new A1.j((char) (j11 + 1), i21 + 7);
                            } else if (j11 < 90 || j11 >= 116) {
                                switch (j(i21, 8, c0356a)) {
                                    case 232:
                                        c = '!';
                                        break;
                                    case 233:
                                        c = '\"';
                                        break;
                                    case 234:
                                        c = '%';
                                        break;
                                    case 235:
                                        c = '&';
                                        break;
                                    case 236:
                                        c = '\'';
                                        break;
                                    case 237:
                                        c = '(';
                                        break;
                                    case 238:
                                        c = ')';
                                        break;
                                    case 239:
                                        c = '*';
                                        break;
                                    case 240:
                                        c = '+';
                                        break;
                                    case 241:
                                        c = ',';
                                        break;
                                    case 242:
                                        c = '-';
                                        break;
                                    case 243:
                                        c = '.';
                                        break;
                                    case 244:
                                        c = '/';
                                        break;
                                    case 245:
                                        c = ':';
                                        break;
                                    case 246:
                                        c = ';';
                                        break;
                                    case 247:
                                        c = '<';
                                        break;
                                    case 248:
                                        c = '=';
                                        break;
                                    case 249:
                                        c = '>';
                                        break;
                                    case 250:
                                        c = '?';
                                        break;
                                    case 251:
                                        c = '_';
                                        break;
                                    case 252:
                                        c = ' ';
                                        break;
                                    default:
                                        throw C0234d.a();
                                }
                                jVar = new A1.j(c, i21 + 8);
                            } else {
                                jVar = new A1.j((char) (j11 + 7), i21 + 7);
                            }
                        } else {
                            jVar = new A1.j((char) (j10 + 43), i21 + 5);
                        }
                        int i22 = jVar.f56a;
                        iVar.f51b = i22;
                        char c5 = jVar.f52b;
                        if (c5 == '$') {
                            hVar3 = new A1.h((Object) new A1.k(sb.toString(), i22), true);
                        } else {
                            sb.append(c5);
                        }
                    }
                }
                z4 = hVar3.f48a;
            } else {
                while (true) {
                    int i23 = iVar.f51b;
                    int i24 = i23 + 7;
                    i4 = c0356a.c;
                    if (i24 > i4) {
                        if (i23 + 4 > i4) {
                        }
                        int i25 = iVar.f51b;
                        i5 = i25 + 7;
                        if (i5 <= i4) {
                            int j12 = j(i25, 4, c0356a);
                            lVar = j12 == 0 ? new A1.l(i4, 10, 10) : new A1.l(i4, j12 - 1, 10);
                        } else {
                            int j13 = j(i25, 7, c0356a) - 8;
                            lVar = new A1.l(i5, j13 / 11, j13 % 11);
                        }
                        int i26 = lVar.f56a;
                        iVar.f51b = i26;
                        int i27 = lVar.c;
                        i6 = lVar.f55b;
                        if (i6 != 10) {
                            hVar2 = new A1.h((Object) (i27 == 10 ? new A1.k(sb.toString(), i26) : new A1.k(i26, i27, sb.toString())), true);
                        } else {
                            sb.append(i6);
                            if (i27 == 10) {
                                hVar2 = new A1.h((Object) new A1.k(sb.toString(), iVar.f51b), true);
                            } else {
                                sb.append(i27);
                            }
                        }
                    } else {
                        int i28 = i23;
                        while (true) {
                            int i29 = i23 + 3;
                            if (i28 < i29) {
                                if (!c0356a.a(i28)) {
                                    i28++;
                                }
                            } else if (!c0356a.a(i29)) {
                            }
                        }
                        int i252 = iVar.f51b;
                        i5 = i252 + 7;
                        if (i5 <= i4) {
                        }
                        int i262 = lVar.f56a;
                        iVar.f51b = i262;
                        int i272 = lVar.c;
                        i6 = lVar.f55b;
                        if (i6 != 10) {
                        }
                    }
                    hVar = r3;
                    z4 = r3.f48a;
                    i7 = iVar.f51b;
                    if (i9 == i7 && !z4) {
                    }
                    A1.k kVar = (A1.k) hVar.f49b;
                    return (kVar == null && kVar.f54d) ? new A1.k(i7, kVar.c, sb.toString()) : new A1.k(sb.toString(), i7);
                }
                int i30 = iVar.f51b;
                if (i30 + 1 <= i4) {
                    for (int i31 = 0; i31 < 4; i31++) {
                        int i32 = i31 + i30;
                        if (i32 >= i4) {
                            iVar.c = 2;
                            iVar.f51b += 4;
                        } else if (!c0356a.a(i32)) {
                        }
                    }
                    iVar.c = 2;
                    iVar.f51b += 4;
                }
                z3 = false;
                A1.h hVar4 = new A1.h((Object) null, false);
                hVar = hVar4;
                z4 = hVar4.f48a;
                i7 = iVar.f51b;
                if (i9 == i7) {
                    A1.k kVar2 = (A1.k) hVar.f49b;
                    if (kVar2 == null) {
                    }
                }
            }
            hVar = hVar3;
            z3 = false;
            i7 = iVar.f51b;
            if (i9 == i7) {
            }
        } while (!z4);
        A1.k kVar22 = (A1.k) hVar.f49b;
        if (kVar22 == null) {
        }
    }

    public void f(String str) {
        WorkDatabase workDatabase = (WorkDatabase) this.c;
        workDatabase.b();
        h hVar = (h) this.f5087d;
        C0173i a3 = hVar.a();
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        workDatabase.c();
        try {
            a3.b();
            workDatabase.p();
        } finally {
            workDatabase.k();
            hVar.p(a3);
        }
    }

    @Override // F.c
    public void h() {
        View view = (View) this.c;
        view.clearAnimation();
        ((ViewGroup) this.f5087d).endViewTransition(view);
        ((C0068e) this.f5088e).d();
    }

    public void i(int i3) {
        W I2;
        int v3 = v(i3);
        ((C0035b) this.f5087d).g(v3);
        RecyclerView recyclerView = ((C0057y) this.c).f1371a;
        View childAt = recyclerView.getChildAt(v3);
        if (childAt != null && (I2 = RecyclerView.I(childAt)) != null) {
            if (I2.l() && !I2.q()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I2 + recyclerView.y());
            }
            I2.b(256);
        }
        recyclerView.detachViewFromParent(v3);
    }

    public AbstractComponentCallbacksC0077n k(String str) {
        G g = (G) ((HashMap) this.f5087d).get(str);
        if (g != null) {
            return g.c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0077n l(String str) {
        for (G g : ((HashMap) this.f5087d).values()) {
            if (g != null) {
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g.c;
                if (!str.equals(abstractComponentCallbacksC0077n.f1972f)) {
                    abstractComponentCallbacksC0077n = abstractComponentCallbacksC0077n.f1985u.c.l(str);
                }
                if (abstractComponentCallbacksC0077n != null) {
                    return abstractComponentCallbacksC0077n;
                }
            }
        }
        return null;
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        for (G g : ((HashMap) this.f5087d).values()) {
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    public ArrayList n() {
        ArrayList arrayList = new ArrayList();
        for (G g : ((HashMap) this.f5087d).values()) {
            if (g != null) {
                arrayList.add(g.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public View o(int i3) {
        return ((C0057y) this.c).f1371a.getChildAt(v(i3));
    }

    public int p() {
        return ((C0057y) this.c).f1371a.getChildCount() - ((ArrayList) this.f5088e).size();
    }

    public ColorStateList q(int i3) {
        int resourceId;
        ColorStateList c;
        TypedArray typedArray = (TypedArray) this.f5087d;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (c = y.f.c((Context) this.c, resourceId)) == null) ? typedArray.getColorStateList(i3) : c;
    }

    public Drawable r(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f5087d;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : AbstractC0059a.s((Context) this.c, resourceId);
    }

    public Drawable s(int i3) {
        int resourceId;
        Drawable f3;
        if (!((TypedArray) this.f5087d).hasValue(i3) || (resourceId = ((TypedArray) this.f5087d).getResourceId(i3, 0)) == 0) {
            return null;
        }
        C0308t a3 = C0308t.a();
        Context context = (Context) this.c;
        synchronized (a3) {
            f3 = a3.f3777a.f(context, resourceId, true);
        }
        return f3;
    }

    public Typeface t(int i3, int i4, C0264U c0264u) {
        int resourceId = ((TypedArray) this.f5087d).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f5088e) == null) {
            this.f5088e = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f5088e;
        ThreadLocal threadLocal = AbstractC0464n.f5302a;
        Context context = (Context) this.c;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0464n.b(context, resourceId, typedValue, i4, c0264u, true, false);
    }

    public String toString() {
        switch (this.f5086b) {
            case 2:
                return ((C0035b) this.f5087d).toString() + ", hidden list:" + ((ArrayList) this.f5088e).size();
            default:
                return super.toString();
        }
    }

    public List u() {
        ArrayList arrayList;
        if (((ArrayList) this.c).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.c)) {
            arrayList = new ArrayList((ArrayList) this.c);
        }
        return arrayList;
    }

    public int v(int i3) {
        if (i3 < 0) {
            return -1;
        }
        int childCount = ((C0057y) this.c).f1371a.getChildCount();
        int i4 = i3;
        while (i4 < childCount) {
            C0035b c0035b = (C0035b) this.f5087d;
            int b3 = i3 - (i4 - c0035b.b(i4));
            if (b3 == 0) {
                while (c0035b.d(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += b3;
        }
        return -1;
    }

    public View w(int i3) {
        return ((C0057y) this.c).f1371a.getChildAt(i3);
    }

    public int x() {
        return ((C0057y) this.c).f1371a.getChildCount();
    }

    public boolean y(CharSequence charSequence, int i3, int i4, androidx.emoji2.text.n nVar) {
        if (nVar.c == 0) {
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f5088e;
            R.a c = nVar.c();
            int a3 = c.a(8);
            if (a3 != 0) {
                ((ByteBuffer) c.f473d).getShort(a3 + c.f471a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) gVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f1763b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i3 < i4) {
                sb.append(charSequence.charAt(i3));
                i3++;
            }
            TextPaint textPaint = dVar.f1764a;
            String sb2 = sb.toString();
            int i5 = A.f.f5a;
            nVar.c = A.e.a(textPaint, sb2) ? 2 : 1;
        }
        return nVar.c == 2;
    }

    public void z(View view) {
        ((ArrayList) this.f5088e).add(view);
        C0057y c0057y = (C0057y) this.c;
        c0057y.getClass();
        W I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i3 = I2.f1218q;
            View view2 = I2.f1205a;
            if (i3 != -1) {
                I2.f1217p = i3;
            } else {
                WeakHashMap weakHashMap = T.f402a;
                I2.f1217p = B.c(view2);
            }
            RecyclerView recyclerView = c0057y.f1371a;
            if (recyclerView.L()) {
                I2.f1218q = 4;
                recyclerView.f2145q0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = T.f402a;
                B.s(view2, 4);
            }
        }
    }

    public m(WorkDatabase workDatabase) {
        this.f5086b = 0;
        this.c = workDatabase;
        new C0402b(workDatabase, 4);
        this.f5087d = new h(workDatabase, 2);
        this.f5088e = new h(workDatabase, 3);
    }

    public m() {
        this.f5086b = 5;
        this.c = new ArrayList();
        this.f5087d = new HashMap();
    }

    public m(p1.b bVar) {
        int i3;
        int i4;
        this.f5086b = 10;
        int i5 = bVar.c;
        if (i5 >= 8 && i5 <= 144 && (i3 = i5 & 1) == 0) {
            t1.b[] bVarArr = t1.b.h;
            if (i3 == 0) {
                int i6 = bVar.f4328b;
                if ((i6 & 1) == 0) {
                    t1.b[] bVarArr2 = t1.b.h;
                    for (int i7 = 0; i7 < 30; i7++) {
                        t1.b bVar2 = bVarArr2[i7];
                        int i8 = bVar2.f4905b;
                        if (i8 == i5 && (i4 = bVar2.c) == i6) {
                            this.f5088e = bVar2;
                            if (i5 == i8) {
                                int i9 = bVar2.f4906d;
                                int i10 = i8 / i9;
                                int i11 = bVar2.f4907e;
                                int i12 = i4 / i11;
                                p1.b bVar3 = new p1.b(i12 * i11, i10 * i9);
                                for (int i13 = 0; i13 < i10; i13++) {
                                    int i14 = i13 * i9;
                                    for (int i15 = 0; i15 < i12; i15++) {
                                        int i16 = i15 * i11;
                                        for (int i17 = 0; i17 < i9; i17++) {
                                            int i18 = ((i9 + 2) * i13) + 1 + i17;
                                            int i19 = i14 + i17;
                                            for (int i20 = 0; i20 < i11; i20++) {
                                                if (bVar.b(((i11 + 2) * i15) + 1 + i20, i18)) {
                                                    bVar3.f(i16 + i20, i19);
                                                }
                                            }
                                        }
                                    }
                                }
                                this.c = bVar3;
                                this.f5087d = new p1.b(bVar3.f4328b, bVar3.c);
                                return;
                            }
                            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                        }
                    }
                    throw C0234d.a();
                }
            }
            throw C0234d.a();
        }
        throw C0234d.a();
    }

    public m(C0356a c0356a) {
        this.f5086b = 1;
        A1.i iVar = new A1.i(0);
        iVar.f51b = 0;
        iVar.c = 1;
        this.f5087d = iVar;
        this.f5088e = new StringBuilder();
        this.c = c0356a;
    }

    public m(C0057y c0057y) {
        this.f5086b = 2;
        this.c = c0057y;
        this.f5087d = new C0035b();
        this.f5088e = new ArrayList();
    }

    public m(Context context, TypedArray typedArray) {
        this.f5086b = 8;
        this.c = context;
        this.f5087d = typedArray;
    }

    public m(Context context, LocationManager locationManager) {
        this.f5086b = 7;
        this.f5088e = new Object();
        this.c = context;
        this.f5087d = locationManager;
    }

    public m(r.e eVar) {
        this.f5086b = 9;
        this.c = new ArrayList();
        this.f5087d = new Object();
        this.f5088e = eVar;
    }

    public m(i iVar, U0.e eVar, androidx.emoji2.text.d dVar) {
        this.f5086b = 3;
        this.c = eVar;
        this.f5087d = iVar;
        this.f5088e = dVar;
    }

    public m(View view, ViewGroup viewGroup, C0068e c0068e) {
        this.f5086b = 4;
        this.c = view;
        this.f5087d = viewGroup;
        this.f5088e = c0068e;
    }
}
