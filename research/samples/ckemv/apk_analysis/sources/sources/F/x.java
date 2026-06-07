package f;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class x implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f2999b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public Method f3000d;

    /* renamed from: e, reason: collision with root package name */
    public Context f3001e;

    public x(View view, String str) {
        this.f2999b = view;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f3000d == null) {
            View view2 = this.f2999b;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.c;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f3000d = method;
                        this.f3001e = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f3000d.invoke(this.f3001e, view);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("Could not execute method for android:onClick", e4);
        }
    }
}
