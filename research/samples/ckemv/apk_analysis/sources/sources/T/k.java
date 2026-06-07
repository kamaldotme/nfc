package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0355a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4876d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4877e;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4878a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4879b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4877e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(Barrier barrier, String str) {
        int i3;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < split.length) {
            String trim = split[i4].trim();
            Object obj = null;
            try {
                i3 = n.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i3 = 0;
            }
            if (i3 == 0) {
                i3 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i3 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1695n) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f1695n.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i3 = ((Integer) obj).intValue();
                }
            }
            iArr[i5] = i3;
            i4++;
            i5++;
        }
        return i5 != split.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    public static f d(Context context, AttributeSet attributeSet) {
        f fVar = new f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f4880a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            i iVar = fVar.f4798b;
            h hVar = fVar.c;
            j jVar = fVar.f4800e;
            g gVar = fVar.f4799d;
            if (index != 1 && 23 != index && 24 != index) {
                hVar.getClass();
                gVar.getClass();
                iVar.getClass();
                jVar.getClass();
            }
            SparseIntArray sparseIntArray = f4877e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    gVar.f4847o = f(obtainStyledAttributes, index, gVar.f4847o);
                    break;
                case 2:
                    gVar.f4807F = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4807F);
                    break;
                case 3:
                    gVar.f4846n = f(obtainStyledAttributes, index, gVar.f4846n);
                    break;
                case 4:
                    gVar.f4845m = f(obtainStyledAttributes, index, gVar.f4845m);
                    break;
                case 5:
                    gVar.f4854v = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    gVar.f4858z = obtainStyledAttributes.getDimensionPixelOffset(index, gVar.f4858z);
                    break;
                case 7:
                    gVar.f4803A = obtainStyledAttributes.getDimensionPixelOffset(index, gVar.f4803A);
                    break;
                case 8:
                    gVar.f4808G = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4808G);
                    break;
                case 9:
                    gVar.f4851s = f(obtainStyledAttributes, index, gVar.f4851s);
                    break;
                case 10:
                    gVar.f4850r = f(obtainStyledAttributes, index, gVar.f4850r);
                    break;
                case 11:
                    gVar.f4813L = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4813L);
                    break;
                case 12:
                    gVar.f4814M = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4814M);
                    break;
                case 13:
                    gVar.f4810I = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4810I);
                    break;
                case 14:
                    gVar.f4812K = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4812K);
                    break;
                case 15:
                    gVar.f4815N = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4815N);
                    break;
                case 16:
                    gVar.f4811J = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4811J);
                    break;
                case 17:
                    gVar.f4833d = obtainStyledAttributes.getDimensionPixelOffset(index, gVar.f4833d);
                    break;
                case 18:
                    gVar.f4835e = obtainStyledAttributes.getDimensionPixelOffset(index, gVar.f4835e);
                    break;
                case 19:
                    gVar.f4837f = obtainStyledAttributes.getFloat(index, gVar.f4837f);
                    break;
                case 20:
                    gVar.f4852t = obtainStyledAttributes.getFloat(index, gVar.f4852t);
                    break;
                case 21:
                    gVar.c = obtainStyledAttributes.getLayoutDimension(index, gVar.c);
                    break;
                case 22:
                    iVar.f4863a = f4876d[obtainStyledAttributes.getInt(index, iVar.f4863a)];
                    break;
                case 23:
                    gVar.f4830b = obtainStyledAttributes.getLayoutDimension(index, gVar.f4830b);
                    break;
                case 24:
                    gVar.f4805C = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4805C);
                    break;
                case 25:
                    gVar.g = f(obtainStyledAttributes, index, gVar.g);
                    break;
                case 26:
                    gVar.h = f(obtainStyledAttributes, index, gVar.h);
                    break;
                case 27:
                    gVar.f4804B = obtainStyledAttributes.getInt(index, gVar.f4804B);
                    break;
                case 28:
                    gVar.D = obtainStyledAttributes.getDimensionPixelSize(index, gVar.D);
                    break;
                case 29:
                    gVar.f4841i = f(obtainStyledAttributes, index, gVar.f4841i);
                    break;
                case 30:
                    gVar.f4842j = f(obtainStyledAttributes, index, gVar.f4842j);
                    break;
                case 31:
                    gVar.f4809H = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4809H);
                    break;
                case 32:
                    gVar.f4848p = f(obtainStyledAttributes, index, gVar.f4848p);
                    break;
                case 33:
                    gVar.f4849q = f(obtainStyledAttributes, index, gVar.f4849q);
                    break;
                case 34:
                    gVar.f4806E = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4806E);
                    break;
                case 35:
                    gVar.f4844l = f(obtainStyledAttributes, index, gVar.f4844l);
                    break;
                case 36:
                    gVar.f4843k = f(obtainStyledAttributes, index, gVar.f4843k);
                    break;
                case 37:
                    gVar.f4853u = obtainStyledAttributes.getFloat(index, gVar.f4853u);
                    break;
                case 38:
                    fVar.f4797a = obtainStyledAttributes.getResourceId(index, fVar.f4797a);
                    break;
                case 39:
                    gVar.f4817P = obtainStyledAttributes.getFloat(index, gVar.f4817P);
                    break;
                case 40:
                    gVar.f4816O = obtainStyledAttributes.getFloat(index, gVar.f4816O);
                    break;
                case 41:
                    gVar.f4818Q = obtainStyledAttributes.getInt(index, gVar.f4818Q);
                    break;
                case 42:
                    gVar.f4819R = obtainStyledAttributes.getInt(index, gVar.f4819R);
                    break;
                case 43:
                    iVar.c = obtainStyledAttributes.getFloat(index, iVar.c);
                    break;
                case 44:
                    jVar.f4874k = true;
                    jVar.f4875l = obtainStyledAttributes.getDimension(index, jVar.f4875l);
                    break;
                case 45:
                    jVar.f4868b = obtainStyledAttributes.getFloat(index, jVar.f4868b);
                    break;
                case 46:
                    jVar.c = obtainStyledAttributes.getFloat(index, jVar.c);
                    break;
                case 47:
                    jVar.f4869d = obtainStyledAttributes.getFloat(index, jVar.f4869d);
                    break;
                case 48:
                    jVar.f4870e = obtainStyledAttributes.getFloat(index, jVar.f4870e);
                    break;
                case 49:
                    jVar.f4871f = obtainStyledAttributes.getDimension(index, jVar.f4871f);
                    break;
                case 50:
                    jVar.g = obtainStyledAttributes.getDimension(index, jVar.g);
                    break;
                case 51:
                    jVar.h = obtainStyledAttributes.getDimension(index, jVar.h);
                    break;
                case 52:
                    jVar.f4872i = obtainStyledAttributes.getDimension(index, jVar.f4872i);
                    break;
                case 53:
                    jVar.f4873j = obtainStyledAttributes.getDimension(index, jVar.f4873j);
                    break;
                case 54:
                    gVar.f4820S = obtainStyledAttributes.getInt(index, gVar.f4820S);
                    break;
                case 55:
                    gVar.f4821T = obtainStyledAttributes.getInt(index, gVar.f4821T);
                    break;
                case 56:
                    gVar.f4822U = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4822U);
                    break;
                case 57:
                    gVar.f4823V = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4823V);
                    break;
                case 58:
                    gVar.f4824W = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4824W);
                    break;
                case 59:
                    gVar.f4825X = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4825X);
                    break;
                case 60:
                    jVar.f4867a = obtainStyledAttributes.getFloat(index, jVar.f4867a);
                    break;
                case 61:
                    gVar.f4855w = f(obtainStyledAttributes, index, gVar.f4855w);
                    break;
                case 62:
                    gVar.f4856x = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4856x);
                    break;
                case 63:
                    gVar.f4857y = obtainStyledAttributes.getFloat(index, gVar.f4857y);
                    break;
                case 64:
                    hVar.f4860a = f(obtainStyledAttributes, index, hVar.f4860a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        hVar.getClass();
                        break;
                    } else {
                        String str = AbstractC0355a.f4296a[obtainStyledAttributes.getInteger(index, 0)];
                        hVar.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    hVar.getClass();
                    break;
                case 67:
                    hVar.f4862d = obtainStyledAttributes.getFloat(index, hVar.f4862d);
                    break;
                case 68:
                    iVar.f4865d = obtainStyledAttributes.getFloat(index, iVar.f4865d);
                    break;
                case 69:
                    gVar.f4826Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    gVar.f4827Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    gVar.f4829a0 = obtainStyledAttributes.getInt(index, gVar.f4829a0);
                    break;
                case 73:
                    gVar.f4831b0 = obtainStyledAttributes.getDimensionPixelSize(index, gVar.f4831b0);
                    break;
                case 74:
                    gVar.f4836e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    gVar.i0 = obtainStyledAttributes.getBoolean(index, gVar.i0);
                    break;
                case 76:
                    hVar.f4861b = obtainStyledAttributes.getInt(index, hVar.f4861b);
                    break;
                case 77:
                    gVar.f4838f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    iVar.f4864b = obtainStyledAttributes.getInt(index, iVar.f4864b);
                    break;
                case 79:
                    hVar.c = obtainStyledAttributes.getFloat(index, hVar.c);
                    break;
                case 80:
                    gVar.f4839g0 = obtainStyledAttributes.getBoolean(index, gVar.f4839g0);
                    break;
                case 81:
                    gVar.f4840h0 = obtainStyledAttributes.getBoolean(index, gVar.f4840h0);
                    break;
                case 82:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return fVar;
    }

    public static int f(TypedArray typedArray, int i3, int i4) {
        int resourceId = typedArray.getResourceId(i3, i4);
        return resourceId == -1 ? typedArray.getInt(i3, -1) : resourceId;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00e2. Please report as an issue. */
    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (this.f4879b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    f fVar = (f) hashMap.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        fVar.f4799d.f4832c0 = 1;
                    }
                    int i4 = fVar.f4799d.f4832c0;
                    if (i4 != -1 && i4 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        g gVar = fVar.f4799d;
                        barrier.setType(gVar.f4829a0);
                        barrier.setMargin(gVar.f4831b0);
                        barrier.setAllowsGoneWidget(gVar.i0);
                        int[] iArr = gVar.f4834d0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = gVar.f4836e0;
                            if (str != null) {
                                int[] c = c(barrier, str);
                                gVar.f4834d0 = c;
                                barrier.setReferencedIds(c);
                            }
                        }
                    }
                    d dVar = (d) childAt.getLayoutParams();
                    dVar.a();
                    fVar.a(dVar);
                    HashMap hashMap2 = fVar.f4801f;
                    Class<?> cls = childAt.getClass();
                    for (String str2 : hashMap2.keySet()) {
                        C0383a c0383a = (C0383a) hashMap2.get(str2);
                        String str3 = "set" + str2;
                        try {
                            switch (q.h.a(c0383a.f4725a)) {
                                case 0:
                                    cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(c0383a.f4726b));
                                    break;
                                case 1:
                                    cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(c0383a.c));
                                    break;
                                case 2:
                                    cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(c0383a.f4729f));
                                    break;
                                case 3:
                                    Method method = cls.getMethod(str3, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(c0383a.f4729f);
                                    method.invoke(childAt, colorDrawable);
                                    break;
                                case 4:
                                    cls.getMethod(str3, CharSequence.class).invoke(childAt, c0383a.f4727d);
                                    break;
                                case 5:
                                    cls.getMethod(str3, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0383a.f4728e));
                                    break;
                                case 6:
                                    cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(c0383a.c));
                                    break;
                            }
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        } catch (NoSuchMethodException e4) {
                            e4.getMessage();
                        } catch (InvocationTargetException e5) {
                            e5.printStackTrace();
                        }
                    }
                    childAt.setLayoutParams(dVar);
                    i iVar = fVar.f4798b;
                    if (iVar.f4864b == 0) {
                        childAt.setVisibility(iVar.f4863a);
                    }
                    childAt.setAlpha(iVar.c);
                    j jVar = fVar.f4800e;
                    childAt.setRotation(jVar.f4867a);
                    childAt.setRotationX(jVar.f4868b);
                    childAt.setRotationY(jVar.c);
                    childAt.setScaleX(jVar.f4869d);
                    childAt.setScaleY(jVar.f4870e);
                    if (!Float.isNaN(jVar.f4871f)) {
                        childAt.setPivotX(jVar.f4871f);
                    }
                    if (!Float.isNaN(jVar.g)) {
                        childAt.setPivotY(jVar.g);
                    }
                    childAt.setTranslationX(jVar.h);
                    childAt.setTranslationY(jVar.f4872i);
                    childAt.setTranslationZ(jVar.f4873j);
                    if (jVar.f4874k) {
                        childAt.setElevation(jVar.f4875l);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            f fVar2 = (f) hashMap.get(num);
            g gVar2 = fVar2.f4799d;
            int i5 = gVar2.f4832c0;
            if (i5 != -1 && i5 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = gVar2.f4834d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str4 = gVar2.f4836e0;
                    if (str4 != null) {
                        int[] c3 = c(barrier2, str4);
                        gVar2.f4834d0 = c3;
                        barrier2.setReferencedIds(c3);
                    }
                }
                barrier2.setType(gVar2.f4829a0);
                barrier2.setMargin(gVar2.f4831b0);
                d a3 = ConstraintLayout.a();
                barrier2.g();
                fVar2.a(a3);
                constraintLayout.addView(barrier2, a3);
            }
            if (gVar2.f4828a) {
                View mVar = new m(constraintLayout.getContext());
                mVar.setId(num.intValue());
                d a4 = ConstraintLayout.a();
                fVar2.a(a4);
                constraintLayout.addView(mVar, a4);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        k kVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = kVar.c;
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (kVar.f4879b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new f());
            }
            f fVar = (f) hashMap.get(Integer.valueOf(id));
            HashMap hashMap2 = kVar.f4878a;
            HashMap hashMap3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap2.keySet()) {
                C0383a c0383a = (C0383a) hashMap2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new C0383a(c0383a, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        hashMap3.put(str, new C0383a(c0383a, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                } catch (NoSuchMethodException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
            fVar.f4801f = hashMap3;
            fVar.f4797a = id;
            int i4 = dVar.f4765d;
            g gVar = fVar.f4799d;
            gVar.g = i4;
            gVar.h = dVar.f4767e;
            gVar.f4841i = dVar.f4769f;
            gVar.f4842j = dVar.g;
            gVar.f4843k = dVar.h;
            gVar.f4844l = dVar.f4773i;
            gVar.f4845m = dVar.f4774j;
            gVar.f4846n = dVar.f4776k;
            gVar.f4847o = dVar.f4778l;
            gVar.f4848p = dVar.f4782p;
            gVar.f4849q = dVar.f4783q;
            gVar.f4850r = dVar.f4784r;
            gVar.f4851s = dVar.f4785s;
            gVar.f4852t = dVar.f4792z;
            gVar.f4853u = dVar.f4735A;
            gVar.f4854v = dVar.f4736B;
            gVar.f4855w = dVar.f4779m;
            gVar.f4856x = dVar.f4780n;
            gVar.f4857y = dVar.f4781o;
            gVar.f4858z = dVar.f4749P;
            gVar.f4803A = dVar.f4750Q;
            gVar.f4804B = dVar.f4751R;
            gVar.f4837f = dVar.c;
            gVar.f4833d = dVar.f4760a;
            gVar.f4835e = dVar.f4762b;
            gVar.f4830b = ((ViewGroup.MarginLayoutParams) dVar).width;
            gVar.c = ((ViewGroup.MarginLayoutParams) dVar).height;
            gVar.f4805C = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            gVar.D = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
            gVar.f4806E = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
            gVar.f4807F = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            gVar.f4816O = dVar.f4738E;
            gVar.f4817P = dVar.D;
            gVar.f4819R = dVar.f4740G;
            gVar.f4818Q = dVar.f4739F;
            gVar.f4839g0 = dVar.f4752S;
            gVar.f4840h0 = dVar.f4753T;
            gVar.f4820S = dVar.f4741H;
            gVar.f4821T = dVar.f4742I;
            gVar.f4822U = dVar.f4745L;
            gVar.f4823V = dVar.f4746M;
            gVar.f4824W = dVar.f4743J;
            gVar.f4825X = dVar.f4744K;
            gVar.f4826Y = dVar.f4747N;
            gVar.f4827Z = dVar.f4748O;
            gVar.f4838f0 = dVar.f4754U;
            gVar.f4811J = dVar.f4787u;
            gVar.f4813L = dVar.f4789w;
            gVar.f4810I = dVar.f4786t;
            gVar.f4812K = dVar.f4788v;
            gVar.f4815N = dVar.f4790x;
            gVar.f4814M = dVar.f4791y;
            gVar.f4808G = dVar.getMarginEnd();
            gVar.f4809H = dVar.getMarginStart();
            int visibility = childAt.getVisibility();
            i iVar = fVar.f4798b;
            iVar.f4863a = visibility;
            iVar.c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            j jVar = fVar.f4800e;
            jVar.f4867a = rotation;
            jVar.f4868b = childAt.getRotationX();
            jVar.c = childAt.getRotationY();
            jVar.f4869d = childAt.getScaleX();
            jVar.f4870e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                jVar.f4871f = pivotX;
                jVar.g = pivotY;
            }
            jVar.h = childAt.getTranslationX();
            jVar.f4872i = childAt.getTranslationY();
            jVar.f4873j = childAt.getTranslationZ();
            if (jVar.f4874k) {
                jVar.f4875l = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                gVar.i0 = barrier.f1685j.f4487g0;
                gVar.f4834d0 = barrier.getReferencedIds();
                gVar.f4829a0 = barrier.getType();
                gVar.f4831b0 = barrier.getMargin();
            }
            i3++;
            kVar = this;
        }
    }

    public final void e(Context context, int i3) {
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    f d3 = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d3.f4799d.f4828a = true;
                    }
                    this.c.put(Integer.valueOf(d3.f4797a), d3);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
