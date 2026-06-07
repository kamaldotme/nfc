package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0082t implements LayoutInflater.Factory2 {

    /* renamed from: b, reason: collision with root package name */
    public final B f2003b;

    public LayoutInflaterFactory2C0082t(B b3) {
        this.f2003b = b3;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0262, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.widget.FrameLayout, android.view.View, androidx.fragment.app.FragmentContainerView, android.view.ViewGroup] */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        G f3;
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n;
        View view2;
        String str2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        B b3 = this.f2003b;
        if (equals) {
            ?? frameLayout = new FrameLayout(context, attributeSet);
            frameLayout.f1854e = true;
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T.a.f868b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
            }
            String string = obtainStyledAttributes.getString(1);
            obtainStyledAttributes.recycle();
            int id = frameLayout.getId();
            AbstractComponentCallbacksC0077n z3 = b3.z(id);
            if (classAttribute != null && z3 == null) {
                if (id <= 0) {
                    if (string != null) {
                        str2 = " with tag ".concat(string);
                    } else {
                        str2 = "";
                    }
                    throw new IllegalStateException(X.d.i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str2));
                }
                w B3 = b3.B();
                context.getClassLoader();
                AbstractComponentCallbacksC0077n a3 = B3.a(classAttribute);
                a3.D = true;
                C0080q c0080q = a3.f1984t;
                if ((c0080q == null ? null : c0080q.f1995d) != null) {
                    a3.D = true;
                }
                C0064a c0064a = new C0064a(b3);
                c0064a.f1897o = true;
                a3.f1956E = frameLayout;
                int id2 = frameLayout.getId();
                Class<?> cls = a3.getClass();
                int modifiers = cls.getModifiers();
                if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                    if (string != null) {
                        String str3 = a3.f1989y;
                        if (str3 != null && !string.equals(str3)) {
                            throw new IllegalStateException("Can't change tag of fragment " + a3 + ": was " + a3.f1989y + " now " + string);
                        }
                        a3.f1989y = string;
                    }
                    if (id2 != 0) {
                        if (id2 == -1) {
                            throw new IllegalArgumentException("Can't add fragment " + a3 + " with tag " + string + " to container view with no id");
                        }
                        int i3 = a3.f1987w;
                        if (i3 != 0 && i3 != id2) {
                            throw new IllegalStateException("Can't change container ID of fragment " + a3 + ": was " + a3.f1987w + " now " + id2);
                        }
                        a3.f1987w = id2;
                        a3.f1988x = id2;
                    }
                    c0064a.b(new H(1, a3));
                    B b4 = c0064a.f1898p;
                    a3.f1983s = b4;
                    if (!c0064a.g) {
                        if (b4.f1819n != null && !b4.f1803A) {
                            b4.v(true);
                            c0064a.a(b4.f1805C, b4.D);
                            b4.f1810b = true;
                            try {
                                b4.M(b4.f1805C, b4.D);
                                b4.d();
                                b4.V();
                                if (b4.f1804B) {
                                    b4.f1804B = false;
                                    b4.U();
                                }
                                ((HashMap) b4.c.f5087d).values().removeAll(Collections.singleton(null));
                            } catch (Throwable th) {
                                b4.d();
                                throw th;
                            }
                        }
                    } else {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                } else {
                    throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
                }
            }
            Iterator it = b3.c.m().iterator();
            while (it.hasNext()) {
                G g = (G) it.next();
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = g.c;
                if (abstractComponentCallbacksC0077n2.f1988x == frameLayout.getId() && (view2 = abstractComponentCallbacksC0077n2.f1957F) != null && view2.getParent() == null) {
                    abstractComponentCallbacksC0077n2.f1956E = frameLayout;
                    g.b();
                }
            }
            return frameLayout;
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, T.a.f867a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes2.getString(0);
        }
        int resourceId = obtainStyledAttributes2.getResourceId(1, -1);
        String string2 = obtainStyledAttributes2.getString(2);
        obtainStyledAttributes2.recycle();
        if (attributeValue == null) {
            return null;
        }
        try {
            if (AbstractComponentCallbacksC0077n.class.isAssignableFrom(w.b(context.getClassLoader(), attributeValue))) {
                int id3 = view != null ? view.getId() : 0;
                if (id3 == -1 && resourceId == -1 && string2 == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0077n z4 = resourceId != -1 ? b3.z(resourceId) : null;
                if (z4 == null && string2 != null) {
                    v0.m mVar = b3.c;
                    ArrayList arrayList = (ArrayList) mVar.c;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            abstractComponentCallbacksC0077n = (AbstractComponentCallbacksC0077n) arrayList.get(size);
                            if (abstractComponentCallbacksC0077n != null && string2.equals(abstractComponentCallbacksC0077n.f1989y)) {
                                break;
                            }
                            size--;
                        } else {
                            for (G g3 : ((HashMap) mVar.f5087d).values()) {
                                if (g3 != null) {
                                    abstractComponentCallbacksC0077n = g3.c;
                                    if (string2.equals(abstractComponentCallbacksC0077n.f1989y)) {
                                    }
                                }
                            }
                            z4 = null;
                        }
                    }
                }
                if (z4 == null && id3 != -1) {
                    z4 = b3.z(id3);
                }
                if (z4 == null) {
                    w B4 = b3.B();
                    context.getClassLoader();
                    z4 = B4.a(attributeValue);
                    z4.f1978n = true;
                    z4.f1987w = resourceId != 0 ? resourceId : id3;
                    z4.f1988x = id3;
                    z4.f1989y = string2;
                    z4.f1979o = true;
                    z4.f1983s = b3;
                    C0080q c0080q2 = b3.f1819n;
                    z4.f1984t = c0080q2;
                    Context context2 = c0080q2.f1996e;
                    z4.D = true;
                    if ((c0080q2 == null ? null : c0080q2.f1995d) != null) {
                        z4.D = true;
                    }
                    f3 = b3.a(z4);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        z4.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!z4.f1979o) {
                    z4.f1979o = true;
                    z4.f1983s = b3;
                    C0080q c0080q3 = b3.f1819n;
                    z4.f1984t = c0080q3;
                    Context context3 = c0080q3.f1996e;
                    z4.D = true;
                    if ((c0080q3 == null ? null : c0080q3.f1995d) != null) {
                        z4.D = true;
                    }
                    f3 = b3.f(z4);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        z4.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id3) + " with another fragment for " + attributeValue);
                }
                z4.f1956E = (ViewGroup) view;
                f3.k();
                f3.j();
                View view3 = z4.f1957F;
                if (view3 != null) {
                    if (resourceId != 0) {
                        view3.setId(resourceId);
                    }
                    if (z4.f1957F.getTag() == null) {
                        z4.f1957F.setTag(string2);
                    }
                    z4.f1957F.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0081s(this, f3));
                    return z4.f1957F;
                }
                throw new IllegalStateException(X.d.i("Fragment ", attributeValue, " did not create a view."));
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }
}
