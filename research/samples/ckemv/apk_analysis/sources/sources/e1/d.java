package e1;

import b1.x;
import f1.AbstractC0174a;
import i1.C0186a;
import i1.C0187b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d extends x {

    /* renamed from: b, reason: collision with root package name */
    public static final C0118a f2697b = new C0118a(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2698a;

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f2698a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d1.j.f2628a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        Date b3;
        if (c0186a.W() == 9) {
            c0186a.S();
            return null;
        }
        String U2 = c0186a.U();
        synchronized (this.f2698a) {
            try {
                Iterator it = this.f2698a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            b3 = AbstractC0174a.b(U2, new ParsePosition(0));
                            break;
                        } catch (ParseException e3) {
                            throw new RuntimeException("Failed parsing '" + U2 + "' as Date; at path " + c0186a.I(true), e3);
                        }
                    }
                    try {
                        b3 = ((DateFormat) it.next()).parse(U2);
                    } catch (ParseException unused) {
                    }
                }
            } finally {
            }
        }
        return b3;
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            c0187b.J();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f2698a.get(0);
        synchronized (this.f2698a) {
            format = dateFormat.format(date);
        }
        c0187b.Q(format);
    }
}
