package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import e.AbstractC0116a;
import j.ActionProviderVisibilityListenerC0210p;
import j.MenuC0207m;
import java.io.IOException;
import k.AbstractC0299o0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class j extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f3166e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f3167f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3168a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3169b;
    public final Context c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3170d;

    static {
        Class[] clsArr = {Context.class};
        f3166e = clsArr;
        f3167f = clsArr;
    }

    public j(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f3168a = objArr;
        this.f3169b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v59 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i3;
        boolean z3;
        ColorStateList colorStateList;
        int resourceId;
        i iVar = new i(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i3 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i3) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z5 && name2.equals(str)) {
                        z3 = r4;
                        z5 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r4 = z3;
                        i3 = 2;
                        z5 = z5;
                    } else if (name2.equals("group")) {
                        iVar.f3144b = 0;
                        iVar.c = 0;
                        iVar.f3145d = 0;
                        iVar.f3146e = 0;
                        iVar.f3147f = r4;
                        iVar.g = r4;
                    } else if (name2.equals("item")) {
                        if (!iVar.h) {
                            ActionProviderVisibilityListenerC0210p actionProviderVisibilityListenerC0210p = iVar.f3165z;
                            if (actionProviderVisibilityListenerC0210p == null || !actionProviderVisibilityListenerC0210p.f3358a.hasSubMenu()) {
                                iVar.h = r4;
                                iVar.b(iVar.f3143a.add(iVar.f3144b, iVar.f3148i, iVar.f3149j, iVar.f3150k));
                            } else {
                                iVar.h = r4;
                                iVar.b(iVar.f3143a.addSubMenu(iVar.f3144b, iVar.f3148i, iVar.f3149j, iVar.f3150k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z3 = r4;
                        z4 = z3;
                    }
                }
                z3 = r4;
            } else {
                if (!z5) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    j jVar = iVar.f3142E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = jVar.c.obtainStyledAttributes(attributeSet, AbstractC0116a.f2677p);
                        iVar.f3144b = obtainStyledAttributes.getResourceId(r4, 0);
                        iVar.c = obtainStyledAttributes.getInt(3, 0);
                        iVar.f3145d = obtainStyledAttributes.getInt(4, 0);
                        iVar.f3146e = obtainStyledAttributes.getInt(5, 0);
                        iVar.f3147f = obtainStyledAttributes.getBoolean(2, r4);
                        iVar.g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = jVar.c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0116a.f2678q);
                            iVar.f3148i = obtainStyledAttributes2.getResourceId(2, 0);
                            iVar.f3149j = (obtainStyledAttributes2.getInt(5, iVar.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, iVar.f3145d) & 65535);
                            iVar.f3150k = obtainStyledAttributes2.getText(7);
                            iVar.f3151l = obtainStyledAttributes2.getText(8);
                            iVar.f3152m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            iVar.f3153n = string == null ? (char) 0 : string.charAt(0);
                            iVar.f3154o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            iVar.f3155p = string2 == null ? (char) 0 : string2.charAt(0);
                            iVar.f3156q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                iVar.f3157r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                iVar.f3157r = iVar.f3146e;
                            }
                            iVar.f3158s = obtainStyledAttributes2.getBoolean(3, false);
                            iVar.f3159t = obtainStyledAttributes2.getBoolean(4, iVar.f3147f);
                            iVar.f3160u = obtainStyledAttributes2.getBoolean(1, iVar.g);
                            iVar.f3161v = obtainStyledAttributes2.getInt(21, -1);
                            iVar.f3164y = obtainStyledAttributes2.getString(12);
                            iVar.f3162w = obtainStyledAttributes2.getResourceId(13, 0);
                            iVar.f3163x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            if (string3 != null && iVar.f3162w == 0 && iVar.f3163x == null) {
                                iVar.f3165z = (ActionProviderVisibilityListenerC0210p) iVar.a(string3, f3167f, jVar.f3169b);
                            } else {
                                iVar.f3165z = null;
                            }
                            iVar.f3139A = obtainStyledAttributes2.getText(17);
                            iVar.f3140B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                iVar.D = AbstractC0299o0.b(obtainStyledAttributes2.getInt(19, -1), iVar.D);
                            } else {
                                iVar.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = y.f.c(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                iVar.f3141C = colorStateList;
                            } else {
                                iVar.f3141C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            iVar.h = false;
                            z3 = true;
                        } else if (name3.equals("menu")) {
                            z3 = true;
                            iVar.h = true;
                            SubMenu addSubMenu = iVar.f3143a.addSubMenu(iVar.f3144b, iVar.f3148i, iVar.f3149j, iVar.f3150k);
                            iVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z3 = true;
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z3;
                        i3 = 2;
                        z5 = z5;
                    }
                }
                z3 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z3;
            i3 = 2;
            z5 = z5;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof MenuC0207m)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i3);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
