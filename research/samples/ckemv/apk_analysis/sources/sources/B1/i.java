package b1;

import i1.C0186a;
import i1.C0187b;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public final class i extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2220a;

    public /* synthetic */ i(int i3) {
        this.f2220a = i3;
    }

    public static n c(C0186a c0186a, int i3) {
        int a3 = q.h.a(i3);
        if (a3 == 5) {
            return new r(c0186a.U());
        }
        if (a3 == 6) {
            return new r(new d1.k(c0186a.U()));
        }
        if (a3 == 7) {
            return new r(Boolean.valueOf(c0186a.M()));
        }
        if (a3 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(X.d.x(i3)));
        }
        c0186a.S();
        return p.f2230b;
    }

    public static void d(C0187b c0187b, n nVar) {
        if (nVar == null || (nVar instanceof p)) {
            c0187b.J();
            return;
        }
        boolean z3 = nVar instanceof r;
        if (z3) {
            if (!z3) {
                throw new IllegalStateException("Not a JSON Primitive: " + nVar);
            }
            r rVar = (r) nVar;
            Serializable serializable = rVar.f2232b;
            if (serializable instanceof Number) {
                c0187b.P(rVar.a());
                return;
            } else if (serializable instanceof Boolean) {
                c0187b.R(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(rVar.b()));
                return;
            } else {
                c0187b.Q(rVar.b());
                return;
            }
        }
        boolean z4 = nVar instanceof m;
        if (z4) {
            c0187b.b();
            if (!z4) {
                throw new IllegalStateException("Not a JSON Array: " + nVar);
            }
            Iterator it = ((m) nVar).f2229b.iterator();
            while (it.hasNext()) {
                d(c0187b, (n) it.next());
            }
            c0187b.A();
            return;
        }
        boolean z5 = nVar instanceof q;
        if (!z5) {
            throw new IllegalArgumentException("Couldn't write " + nVar.getClass());
        }
        c0187b.i();
        if (!z5) {
            throw new IllegalStateException("Not a JSON Object: " + nVar);
        }
        Iterator it2 = ((d1.m) ((q) nVar).f2231b.entrySet()).iterator();
        while (((d1.l) it2).hasNext()) {
            d1.n b3 = ((d1.l) it2).b();
            c0187b.G((String) b3.getKey());
            d(c0187b, (n) b3.getValue());
        }
        c0187b.D();
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        n mVar;
        n mVar2;
        switch (this.f2220a) {
            case 0:
                if (c0186a.W() != 9) {
                    return Double.valueOf(c0186a.N());
                }
                c0186a.S();
                return null;
            case 1:
                if (c0186a.W() != 9) {
                    return Float.valueOf((float) c0186a.N());
                }
                c0186a.S();
                return null;
            case 2:
                ArrayList arrayList = new ArrayList();
                c0186a.a();
                while (c0186a.J()) {
                    try {
                        arrayList.add(Integer.valueOf(c0186a.O()));
                    } catch (NumberFormatException e3) {
                        throw new RuntimeException(e3);
                    }
                }
                c0186a.A();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicIntegerArray.set(i3, ((Integer) arrayList.get(i3)).intValue());
                }
                return atomicIntegerArray;
            case 3:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                try {
                    return Long.valueOf(c0186a.P());
                } catch (NumberFormatException e4) {
                    throw new RuntimeException(e4);
                }
            case 4:
                if (c0186a.W() != 9) {
                    return Float.valueOf((float) c0186a.N());
                }
                c0186a.S();
                return null;
            case 5:
                if (c0186a.W() != 9) {
                    return Double.valueOf(c0186a.N());
                }
                c0186a.S();
                return null;
            case 6:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                String U2 = c0186a.U();
                if (U2.length() == 1) {
                    return Character.valueOf(U2.charAt(0));
                }
                throw new RuntimeException("Expecting character, got: " + U2 + "; at " + c0186a.I(true));
            case 7:
                int W2 = c0186a.W();
                if (W2 != 9) {
                    return W2 == 8 ? Boolean.toString(c0186a.M()) : c0186a.U();
                }
                c0186a.S();
                return null;
            case 8:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                String U3 = c0186a.U();
                try {
                    return new BigDecimal(U3);
                } catch (NumberFormatException e5) {
                    throw new RuntimeException("Failed parsing '" + U3 + "' as BigDecimal; at path " + c0186a.I(true), e5);
                }
            case 9:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                String U4 = c0186a.U();
                try {
                    return new BigInteger(U4);
                } catch (NumberFormatException e6) {
                    throw new RuntimeException("Failed parsing '" + U4 + "' as BigInteger; at path " + c0186a.I(true), e6);
                }
            case 10:
                if (c0186a.W() != 9) {
                    return new d1.k(c0186a.U());
                }
                c0186a.S();
                return null;
            case 11:
                if (c0186a.W() != 9) {
                    return new StringBuilder(c0186a.U());
                }
                c0186a.S();
                return null;
            case 12:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 13:
                if (c0186a.W() != 9) {
                    return new StringBuffer(c0186a.U());
                }
                c0186a.S();
                return null;
            case 14:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                String U5 = c0186a.U();
                if ("null".equals(U5)) {
                    return null;
                }
                return new URL(U5);
            case 15:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                try {
                    String U6 = c0186a.U();
                    if ("null".equals(U6)) {
                        return null;
                    }
                    return new URI(U6);
                } catch (URISyntaxException e7) {
                    throw new RuntimeException(e7);
                }
            case 16:
                if (c0186a.W() != 9) {
                    return InetAddress.getByName(c0186a.U());
                }
                c0186a.S();
                return null;
            case 17:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                String U7 = c0186a.U();
                try {
                    return UUID.fromString(U7);
                } catch (IllegalArgumentException e8) {
                    throw new RuntimeException("Failed parsing '" + U7 + "' as UUID; at path " + c0186a.I(true), e8);
                }
            case 18:
                String U8 = c0186a.U();
                try {
                    return Currency.getInstance(U8);
                } catch (IllegalArgumentException e9) {
                    throw new RuntimeException("Failed parsing '" + U8 + "' as Currency; at path " + c0186a.I(true), e9);
                }
            case 19:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                c0186a.b();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (c0186a.W() != 4) {
                    String Q2 = c0186a.Q();
                    int O2 = c0186a.O();
                    if ("year".equals(Q2)) {
                        i4 = O2;
                    } else if ("month".equals(Q2)) {
                        i5 = O2;
                    } else if ("dayOfMonth".equals(Q2)) {
                        i6 = O2;
                    } else if ("hourOfDay".equals(Q2)) {
                        i7 = O2;
                    } else if ("minute".equals(Q2)) {
                        i8 = O2;
                    } else if ("second".equals(Q2)) {
                        i9 = O2;
                    }
                }
                c0186a.D();
                return new GregorianCalendar(i4, i5, i6, i7, i8, i9);
            case 20:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c0186a.U(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            case 21:
                int W3 = c0186a.W();
                int a3 = q.h.a(W3);
                if (a3 == 0) {
                    c0186a.a();
                    mVar = new m();
                } else if (a3 != 2) {
                    mVar = null;
                } else {
                    c0186a.b();
                    mVar = new q();
                }
                if (mVar == null) {
                    return c(c0186a, W3);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c0186a.J()) {
                        String Q3 = mVar instanceof q ? c0186a.Q() : null;
                        int W4 = c0186a.W();
                        int a4 = q.h.a(W4);
                        if (a4 == 0) {
                            c0186a.a();
                            mVar2 = new m();
                        } else if (a4 != 2) {
                            mVar2 = null;
                        } else {
                            c0186a.b();
                            mVar2 = new q();
                        }
                        boolean z3 = mVar2 != null;
                        if (mVar2 == null) {
                            mVar2 = c(c0186a, W4);
                        }
                        if (mVar instanceof m) {
                            ((m) mVar).f2229b.add(mVar2);
                        } else {
                            ((q) mVar).f2231b.put(Q3, mVar2);
                        }
                        if (z3) {
                            arrayDeque.addLast(mVar);
                            mVar = mVar2;
                        }
                    } else {
                        if (mVar instanceof m) {
                            c0186a.A();
                        } else {
                            c0186a.D();
                        }
                        if (arrayDeque.isEmpty()) {
                            return mVar;
                        }
                        mVar = (n) arrayDeque.removeLast();
                    }
                }
            case 22:
                BitSet bitSet = new BitSet();
                c0186a.a();
                int W5 = c0186a.W();
                int i10 = 0;
                while (W5 != 2) {
                    int a5 = q.h.a(W5);
                    if (a5 == 5 || a5 == 6) {
                        int O3 = c0186a.O();
                        if (O3 != 0) {
                            if (O3 != 1) {
                                throw new RuntimeException("Invalid bitset value " + O3 + ", expected 0 or 1; at path " + c0186a.I(true));
                            }
                            bitSet.set(i10);
                            i10++;
                            W5 = c0186a.W();
                        } else {
                            continue;
                            i10++;
                            W5 = c0186a.W();
                        }
                    } else {
                        if (a5 != 7) {
                            throw new RuntimeException("Invalid bitset value type: " + X.d.x(W5) + "; at path " + c0186a.I(false));
                        }
                        if (!c0186a.M()) {
                            i10++;
                            W5 = c0186a.W();
                        }
                        bitSet.set(i10);
                        i10++;
                        W5 = c0186a.W();
                    }
                }
                c0186a.A();
                return bitSet;
            case 23:
                int W6 = c0186a.W();
                if (W6 != 9) {
                    return W6 == 6 ? Boolean.valueOf(Boolean.parseBoolean(c0186a.U())) : Boolean.valueOf(c0186a.M());
                }
                c0186a.S();
                return null;
            case 24:
                if (c0186a.W() != 9) {
                    return Boolean.valueOf(c0186a.U());
                }
                c0186a.S();
                return null;
            case 25:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                try {
                    int O4 = c0186a.O();
                    if (O4 <= 255 && O4 >= -128) {
                        return Byte.valueOf((byte) O4);
                    }
                    throw new RuntimeException("Lossy conversion from " + O4 + " to byte; at path " + c0186a.I(true));
                } catch (NumberFormatException e10) {
                    throw new RuntimeException(e10);
                }
            case 26:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                try {
                    int O5 = c0186a.O();
                    if (O5 <= 65535 && O5 >= -32768) {
                        return Short.valueOf((short) O5);
                    }
                    throw new RuntimeException("Lossy conversion from " + O5 + " to short; at path " + c0186a.I(true));
                } catch (NumberFormatException e11) {
                    throw new RuntimeException(e11);
                }
            case 27:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                try {
                    return Integer.valueOf(c0186a.O());
                } catch (NumberFormatException e12) {
                    throw new RuntimeException(e12);
                }
            case 28:
                try {
                    return new AtomicInteger(c0186a.O());
                } catch (NumberFormatException e13) {
                    throw new RuntimeException(e13);
                }
            default:
                return new AtomicBoolean(c0186a.M());
        }
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        switch (this.f2220a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    c0187b.J();
                    return;
                }
                double doubleValue = number.doubleValue();
                l.a(doubleValue);
                c0187b.M(doubleValue);
                return;
            case 1:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c0187b.J();
                    return;
                }
                float floatValue = number2.floatValue();
                l.a(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                c0187b.P(number2);
                return;
            case 2:
                c0187b.b();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i3 = 0; i3 < length; i3++) {
                    c0187b.N(r6.get(i3));
                }
                c0187b.A();
                return;
            case 3:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c0187b.J();
                    return;
                } else {
                    c0187b.N(number3.longValue());
                    return;
                }
            case 4:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    c0187b.J();
                    return;
                }
                if (!(number4 instanceof Float)) {
                    number4 = Float.valueOf(number4.floatValue());
                }
                c0187b.P(number4);
                return;
            case 5:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    c0187b.J();
                    return;
                } else {
                    c0187b.M(number5.doubleValue());
                    return;
                }
            case 6:
                Character ch = (Character) obj;
                c0187b.Q(ch == null ? null : String.valueOf(ch));
                return;
            case 7:
                c0187b.Q((String) obj);
                return;
            case 8:
                c0187b.P((BigDecimal) obj);
                return;
            case 9:
                c0187b.P((BigInteger) obj);
                return;
            case 10:
                c0187b.P((d1.k) obj);
                return;
            case 11:
                StringBuilder sb = (StringBuilder) obj;
                c0187b.Q(sb == null ? null : sb.toString());
                return;
            case 12:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 13:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c0187b.Q(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 14:
                URL url = (URL) obj;
                c0187b.Q(url == null ? null : url.toExternalForm());
                return;
            case 15:
                URI uri = (URI) obj;
                c0187b.Q(uri == null ? null : uri.toASCIIString());
                return;
            case 16:
                InetAddress inetAddress = (InetAddress) obj;
                c0187b.Q(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 17:
                UUID uuid = (UUID) obj;
                c0187b.Q(uuid == null ? null : uuid.toString());
                return;
            case 18:
                c0187b.Q(((Currency) obj).getCurrencyCode());
                return;
            case 19:
                if (((Calendar) obj) == null) {
                    c0187b.J();
                    return;
                }
                c0187b.i();
                c0187b.G("year");
                c0187b.N(r6.get(1));
                c0187b.G("month");
                c0187b.N(r6.get(2));
                c0187b.G("dayOfMonth");
                c0187b.N(r6.get(5));
                c0187b.G("hourOfDay");
                c0187b.N(r6.get(11));
                c0187b.G("minute");
                c0187b.N(r6.get(12));
                c0187b.G("second");
                c0187b.N(r6.get(13));
                c0187b.D();
                return;
            case 20:
                Locale locale = (Locale) obj;
                c0187b.Q(locale == null ? null : locale.toString());
                return;
            case 21:
                d(c0187b, (n) obj);
                return;
            case 22:
                BitSet bitSet = (BitSet) obj;
                c0187b.b();
                int length2 = bitSet.length();
                for (int i4 = 0; i4 < length2; i4++) {
                    c0187b.N(bitSet.get(i4) ? 1L : 0L);
                }
                c0187b.A();
                return;
            case 23:
                c0187b.O((Boolean) obj);
                return;
            case 24:
                Boolean bool = (Boolean) obj;
                c0187b.Q(bool == null ? "null" : bool.toString());
                return;
            case 25:
                if (((Number) obj) == null) {
                    c0187b.J();
                    return;
                } else {
                    c0187b.N(r6.byteValue());
                    return;
                }
            case 26:
                if (((Number) obj) == null) {
                    c0187b.J();
                    return;
                } else {
                    c0187b.N(r6.shortValue());
                    return;
                }
            case 27:
                if (((Number) obj) == null) {
                    c0187b.J();
                    return;
                } else {
                    c0187b.N(r6.intValue());
                    return;
                }
            case 28:
                c0187b.N(((AtomicInteger) obj).get());
                return;
            default:
                c0187b.R(((AtomicBoolean) obj).get());
                return;
        }
    }
}
