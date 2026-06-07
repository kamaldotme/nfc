package U0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.view.inputmethod.InputConnection;
import androidx.fragment.app.D;
import androidx.lifecycle.M;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import m0.z;

/* loaded from: classes.dex */
public class e implements X.f, d1.p {
    public static e c;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f886b;

    public /* synthetic */ e(int i3) {
        this.f886b = i3;
    }

    public static e a(Context context, int i3) {
        z.i(i3 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, A0.a.f30l);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList m3 = u2.l.m(context, obtainStyledAttributes, 4);
        ColorStateList m4 = u2.l.m(context, obtainStyledAttributes, 9);
        ColorStateList m5 = u2.l.m(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k a3 = k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a(0)).a();
        obtainStyledAttributes.recycle();
        return new e(m3, m4, m5, dimensionPixelSize, a3, rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0086, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0079, code lost:
    
        if (r11 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(InputConnection inputConnection, Editable editable, int i3, int i4, boolean z3) {
        int min;
        if (editable == null || inputConnection == null || i3 < 0 || i4 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z3) {
            int max = Math.max(i3, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                loop0: while (true) {
                    boolean z4 = false;
                    while (true) {
                        if (max == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart >= 0) {
                            char charAt = editable.charAt(selectionStart);
                            if (z4) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt)) {
                                max--;
                            } else {
                                if (Character.isHighSurrogate(charAt)) {
                                    break loop0;
                                }
                                z4 = true;
                            }
                        } else if (!z4) {
                            selectionStart = 0;
                        }
                    }
                    max--;
                }
            }
            selectionStart = -1;
            int max2 = Math.max(i4, 0);
            min = editable.length();
            if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                loop2: while (true) {
                    boolean z5 = false;
                    while (true) {
                        if (max2 == 0) {
                            min = selectionEnd;
                            break loop2;
                        }
                        if (selectionEnd < min) {
                            char charAt2 = editable.charAt(selectionEnd);
                            if (z5) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt2)) {
                                max2--;
                                selectionEnd++;
                            } else {
                                if (Character.isLowSurrogate(charAt2)) {
                                    break loop2;
                                }
                                selectionEnd++;
                                z5 = true;
                            }
                        }
                    }
                    max2--;
                    selectionEnd++;
                }
            }
            min = -1;
            if (selectionStart == -1 || min == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i3, 0);
            min = Math.min(selectionEnd + i4, editable.length());
        }
        androidx.emoji2.text.u[] uVarArr = (androidx.emoji2.text.u[]) editable.getSpans(selectionStart, min, androidx.emoji2.text.u.class);
        if (uVarArr == null || uVarArr.length <= 0) {
            return false;
        }
        for (androidx.emoji2.text.u uVar : uVarArr) {
            int spanStart = editable.getSpanStart(uVar);
            int spanEnd = editable.getSpanEnd(uVar);
            selectionStart = Math.min(spanStart, selectionStart);
            min = Math.max(spanEnd, min);
        }
        int max3 = Math.max(selectionStart, 0);
        int min2 = Math.min(min, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(max3, min2);
        inputConnection.endBatchEdit();
        return true;
    }

    private final void i(int i3, Object obj) {
    }

    public M b(Class cls) {
        switch (this.f886b) {
            case 9:
                return new W.a();
            default:
                return new D(true);
        }
    }

    public Signature[] c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public int d(Object obj) {
        return ((G.j) obj).c;
    }

    public boolean f(Object obj) {
        return ((G.j) obj).f199d;
    }

    @Override // d1.p
    public Object g() {
        switch (this.f886b) {
            case 24:
                return new TreeSet();
            case 25:
                return new LinkedHashSet();
            case 26:
                return new ArrayDeque();
            case 27:
                return new ArrayList();
            case 28:
                return new ConcurrentSkipListMap();
            default:
                return new ConcurrentHashMap();
        }
    }

    public boolean h(Spannable spannable) {
        return false;
    }

    @Override // X.f
    public void m(int i3, Object obj) {
        switch (this.f886b) {
            case 11:
                return;
            default:
                if (i3 == 6 || i3 == 7 || i3 == 8) {
                    return;
                }
                return;
        }
    }

    public e(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i3, k kVar, Rect rect) {
        this.f886b = 23;
        z.j(rect.left);
        z.j(rect.top);
        z.j(rect.right);
        z.j(rect.bottom);
    }

    public e(H0.d dVar, H0.d dVar2) {
        this.f886b = 2;
        dVar.getClass();
        dVar2.getClass();
        if (0.0f > 0.0f) {
            throw new IllegalArgumentException();
        }
    }
}
