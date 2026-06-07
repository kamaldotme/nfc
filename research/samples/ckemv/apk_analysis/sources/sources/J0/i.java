package j0;

import Z.C0044k;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f3407z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: y, reason: collision with root package name */
    public final int f3408y;

    public i(int i3) {
        this();
        this.f3408y = i3;
    }

    public static void H(v vVar) {
        int visibility = vVar.f3453b.getVisibility();
        HashMap hashMap = vVar.f3452a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = vVar.f3453b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j0.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0223C J(v vVar, v vVar2) {
        ?? obj = new Object();
        obj.f3385a = false;
        obj.f3386b = false;
        if (vVar != null) {
            HashMap hashMap = vVar.f3452a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                obj.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                obj.f3388e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (vVar2 != null) {
                    HashMap hashMap2 = vVar2.f3452a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        obj.f3387d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        obj.f3389f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (vVar == null && vVar2 != null) {
                            int i3 = obj.c;
                            int i4 = obj.f3387d;
                            if (i3 == i4 && obj.f3388e == obj.f3389f) {
                                return obj;
                            }
                            if (i3 != i4) {
                                if (i3 == 0) {
                                    obj.f3386b = false;
                                    obj.f3385a = true;
                                } else if (i4 == 0) {
                                    obj.f3386b = true;
                                    obj.f3385a = true;
                                }
                            } else if (obj.f3389f == null) {
                                obj.f3386b = false;
                                obj.f3385a = true;
                            } else if (obj.f3388e == null) {
                                obj.f3386b = true;
                                obj.f3385a = true;
                            }
                        } else if (vVar != null && obj.f3387d == 0) {
                            obj.f3386b = true;
                            obj.f3385a = true;
                        } else if (vVar2 == null && obj.c == 0) {
                            obj.f3386b = false;
                            obj.f3385a = true;
                        }
                        return obj;
                    }
                }
                obj.f3387d = -1;
                obj.f3389f = null;
                if (vVar == null) {
                }
                if (vVar != null) {
                }
                if (vVar2 == null) {
                    obj.f3386b = false;
                    obj.f3385a = true;
                }
                return obj;
            }
        }
        obj.c = -1;
        obj.f3388e = null;
        if (vVar2 != null) {
        }
        obj.f3387d = -1;
        obj.f3389f = null;
        if (vVar == null) {
        }
        if (vVar != null) {
        }
        if (vVar2 == null) {
        }
        return obj;
    }

    public final ObjectAnimator I(View view, float f3, float f4) {
        int i3 = 0;
        if (f3 == f4) {
            return null;
        }
        w.f3454a.f0(view, f3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, w.f3455b, f4);
        ofFloat.addListener(new C0044k(view));
        a(new h(i3, view));
        return ofFloat;
    }

    @Override // j0.o
    public final void d(v vVar) {
        H(vVar);
    }

    @Override // j0.o
    public final void g(v vVar) {
        H(vVar);
        vVar.f3452a.put("android:fade:transitionAlpha", Float.valueOf(w.f3454a.L(vVar.f3453b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (J(n(r3, false), q(r3, false)).f3385a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f6  */
    @Override // j0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        boolean z3;
        View view;
        int i3;
        Object obj;
        View view2;
        v vVar3;
        View view3;
        float f3;
        boolean z4;
        boolean z5;
        ViewGroup viewGroup2;
        int i4;
        Bitmap bitmap;
        float f4;
        i iVar;
        float f5;
        Float f6;
        int i5 = this.f3408y;
        C0223C J2 = J(vVar, vVar2);
        if (!J2.f3385a || (J2.f3388e == null && J2.f3389f == null)) {
            return null;
        }
        boolean z6 = true;
        if (J2.f3386b) {
            if ((i5 & 1) == 1 && vVar2 != null) {
                View view4 = vVar2.f3453b;
                if (vVar == null) {
                    View view5 = (View) view4.getParent();
                }
                float floatValue = (vVar == null || (f6 = (Float) vVar.f3452a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f6.floatValue();
                return I(view4, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
            }
            return null;
        }
        int i6 = J2.f3387d;
        if ((i5 & 2) == 2 && vVar != null) {
            View view6 = vVar2 != null ? vVar2.f3453b : null;
            View view7 = vVar.f3453b;
            View view8 = (View) view7.getTag(R.id.save_overlay_view);
            if (view8 != null) {
                vVar3 = vVar;
                i3 = i6;
                obj = "android:fade:transitionAlpha";
                f3 = 1.0f;
                view3 = null;
            } else {
                if (view6 == null || view6.getParent() == null) {
                    if (view6 != null) {
                        z3 = false;
                        view = null;
                        if (z3) {
                            if (view7.getParent() == null) {
                                vVar3 = vVar;
                                i3 = i6;
                                obj = "android:fade:transitionAlpha";
                                f3 = 1.0f;
                                z6 = false;
                                view3 = view;
                                view8 = view7;
                            } else if (view7.getParent() instanceof View) {
                                View view9 = (View) view7.getParent();
                                if (J(q(view9, true), n(view9, true)).f3385a) {
                                    i3 = i6;
                                    obj = "android:fade:transitionAlpha";
                                    view2 = view;
                                    int id = view9.getId();
                                    if (view9.getParent() == null && id != -1) {
                                        viewGroup.findViewById(id);
                                    }
                                    vVar3 = vVar;
                                    view8 = view6;
                                    view3 = view2;
                                    f3 = 1.0f;
                                    z6 = false;
                                } else {
                                    boolean z7 = u.f3450a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    y yVar = w.f3454a;
                                    yVar.q0(view7, matrix);
                                    yVar.r0(viewGroup, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix.mapRect(rectF);
                                    int round = Math.round(rectF.left);
                                    int round2 = Math.round(rectF.top);
                                    int round3 = Math.round(rectF.right);
                                    int round4 = Math.round(rectF.bottom);
                                    ImageView imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    if (u.f3450a) {
                                        z4 = !view7.isAttachedToWindow();
                                        z5 = viewGroup.isAttachedToWindow();
                                    } else {
                                        z4 = false;
                                        z5 = false;
                                    }
                                    boolean z8 = u.f3451b;
                                    if (!z8 || !z4) {
                                        view2 = view;
                                        viewGroup2 = null;
                                        i4 = 0;
                                    } else if (z5) {
                                        ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                        int indexOfChild = viewGroup3.indexOfChild(view7);
                                        viewGroup.getOverlay().add(view7);
                                        viewGroup2 = viewGroup3;
                                        view2 = view;
                                        i4 = indexOfChild;
                                    } else {
                                        i3 = i6;
                                        obj = "android:fade:transitionAlpha";
                                        view2 = view;
                                        bitmap = null;
                                        if (bitmap != null) {
                                            imageView.setImageBitmap(bitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        vVar3 = vVar;
                                        view8 = imageView;
                                        view3 = view2;
                                        f3 = 1.0f;
                                        z6 = false;
                                    }
                                    i3 = i6;
                                    int round5 = Math.round(rectF.width());
                                    int round6 = Math.round(rectF.height());
                                    if (round5 <= 0 || round6 <= 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                        int round7 = Math.round(round5 * min);
                                        int round8 = Math.round(round6 * min);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(min, min);
                                        if (u.c) {
                                            Picture picture = new Picture();
                                            Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            view7.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = Bitmap.createBitmap(picture);
                                        } else {
                                            bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmap);
                                            canvas.concat(matrix);
                                            view7.draw(canvas);
                                        }
                                    }
                                    if (z8 && z4) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i4);
                                    }
                                    if (bitmap != null) {
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                    imageView.layout(round, round2, round3, round4);
                                    vVar3 = vVar;
                                    view8 = imageView;
                                    view3 = view2;
                                    f3 = 1.0f;
                                    z6 = false;
                                }
                            }
                        }
                        i3 = i6;
                        obj = "android:fade:transitionAlpha";
                        view2 = view;
                        vVar3 = vVar;
                        view8 = view6;
                        view3 = view2;
                        f3 = 1.0f;
                        z6 = false;
                    }
                } else if (i6 == 4 || view7 == view6) {
                    view = view6;
                    z3 = false;
                    view6 = null;
                    if (z3) {
                    }
                    i3 = i6;
                    obj = "android:fade:transitionAlpha";
                    view2 = view;
                    vVar3 = vVar;
                    view8 = view6;
                    view3 = view2;
                    f3 = 1.0f;
                    z6 = false;
                }
                z3 = true;
                view6 = null;
                view = null;
                if (z3) {
                }
                i3 = i6;
                obj = "android:fade:transitionAlpha";
                view2 = view;
                vVar3 = vVar;
                view8 = view6;
                view3 = view2;
                f3 = 1.0f;
                z6 = false;
            }
            HashMap hashMap = vVar3.f3452a;
            if (view8 != null) {
                if (!z6) {
                    int[] iArr = (int[]) hashMap.get("android:visibility:screenLocation");
                    int i7 = iArr[0];
                    int i8 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i7 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i8 - iArr2[1]) - view8.getTop());
                    viewGroup.getOverlay().add(view8);
                }
                w.f3454a.getClass();
                Float f7 = (Float) hashMap.get(obj);
                if (f7 != null) {
                    f5 = f7.floatValue();
                    f4 = 0.0f;
                    iVar = this;
                } else {
                    f4 = 0.0f;
                    iVar = this;
                    f5 = f3;
                }
                ObjectAnimator I2 = iVar.I(view8, f5, f4);
                if (z6) {
                    return I2;
                }
                if (I2 == null) {
                    viewGroup.getOverlay().remove(view8);
                    return I2;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                iVar.a(new C0221A(iVar, viewGroup, view8, view7));
                return I2;
            }
            Object obj2 = obj;
            if (view3 != null) {
                int visibility = view3.getVisibility();
                y yVar2 = w.f3454a;
                yVar2.g0(view3, 0);
                yVar2.getClass();
                Float f8 = (Float) hashMap.get(obj2);
                ObjectAnimator I3 = I(view3, f8 != null ? f8.floatValue() : f3, 0.0f);
                if (I3 != null) {
                    C0222B c0222b = new C0222B(view3, i3);
                    I3.addListener(c0222b);
                    I3.addPauseListener(c0222b);
                    a(c0222b);
                } else {
                    yVar2.g0(view3, visibility);
                }
                return I3;
            }
        }
        return null;
    }

    @Override // j0.o
    public final String[] p() {
        return f3407z;
    }

    @Override // j0.o
    public final boolean r(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f3452a.containsKey("android:visibility:visibility") != vVar.f3452a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0223C J2 = J(vVar, vVar2);
        if (J2.f3385a) {
            return J2.c == 0 || J2.f3387d == 0;
        }
        return false;
    }

    public i() {
        this.f3408y = 3;
    }
}
