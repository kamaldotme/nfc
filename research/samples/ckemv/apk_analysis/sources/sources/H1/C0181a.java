package h1;

import b1.x;
import e1.C0118a;
import i1.C0186a;
import i1.C0187b;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181a extends x {
    public static final C0118a c = new C0118a(3);

    /* renamed from: d, reason: collision with root package name */
    public static final C0118a f3086d = new C0118a(4);

    /* renamed from: e, reason: collision with root package name */
    public static final C0118a f3087e = new C0118a(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3088a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3089b;

    public C0181a(int i3) {
        this.f3088a = i3;
        switch (i3) {
            case 1:
                this.f3089b = new SimpleDateFormat("hh:mm:ss a");
                return;
            default:
                this.f3089b = new SimpleDateFormat("MMM d, yyyy");
                return;
        }
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        Date parse;
        Time time;
        switch (this.f3088a) {
            case 0:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                String U2 = c0186a.U();
                try {
                    synchronized (this) {
                        parse = ((SimpleDateFormat) this.f3089b).parse(U2);
                    }
                    return new java.sql.Date(parse.getTime());
                } catch (ParseException e3) {
                    throw new RuntimeException("Failed parsing '" + U2 + "' as SQL Date; at path " + c0186a.I(true), e3);
                }
            case 1:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                String U3 = c0186a.U();
                try {
                    synchronized (this) {
                        time = new Time(((SimpleDateFormat) this.f3089b).parse(U3).getTime());
                    }
                    return time;
                } catch (ParseException e4) {
                    throw new RuntimeException("Failed parsing '" + U3 + "' as SQL Time; at path " + c0186a.I(true), e4);
                }
            default:
                Date date = (Date) ((x) this.f3089b).a(c0186a);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
        }
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        String format;
        String format2;
        switch (this.f3088a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    c0187b.J();
                    return;
                }
                synchronized (this) {
                    format = ((SimpleDateFormat) this.f3089b).format((Date) date);
                }
                c0187b.Q(format);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    c0187b.J();
                    return;
                }
                synchronized (this) {
                    format2 = ((SimpleDateFormat) this.f3089b).format((Date) time);
                }
                c0187b.Q(format2);
                return;
            default:
                ((x) this.f3089b).b(c0187b, (Timestamp) obj);
                return;
        }
    }

    public C0181a(x xVar) {
        this.f3088a = 2;
        this.f3089b = xVar;
    }
}
