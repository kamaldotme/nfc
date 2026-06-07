package f1;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0174a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f3025a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i3, char c) {
        return i3 < str.length() && str.charAt(i3) == c;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date b(String str, ParsePosition parsePosition) {
        String message;
        int i3;
        int i4;
        int i5;
        int i6;
        int length;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i7 = index + 4;
            int c = c(index, i7, str);
            if (a(str, i7, '-')) {
                i7 = index + 5;
            }
            int i8 = i7 + 2;
            int c3 = c(i7, i8, str);
            if (a(str, i8, '-')) {
                i8 = i7 + 3;
            }
            int i9 = i8 + 2;
            int c4 = c(i8, i9, str);
            boolean a3 = a(str, i9, 'T');
            if (!a3 && str.length() <= i9) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c, c3 - 1, c4);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i9);
                return gregorianCalendar.getTime();
            }
            if (a3) {
                int i10 = i8 + 5;
                int c5 = c(i8 + 3, i10, str);
                if (a(str, i10, ':')) {
                    i10 = i8 + 6;
                }
                int i11 = i10 + 2;
                int c6 = c(i10, i11, str);
                if (a(str, i11, ':')) {
                    i11 = i10 + 3;
                }
                if (str.length() <= i11 || (charAt = str.charAt(i11)) == 'Z' || charAt == '+' || charAt == '-') {
                    i4 = c6;
                    i5 = 0;
                    i6 = 0;
                    i9 = i11;
                    i3 = c5;
                } else {
                    int i12 = i11 + 2;
                    i6 = c(i11, i12, str);
                    if (i6 > 59 && i6 < 63) {
                        i6 = 59;
                    }
                    if (a(str, i12, '.')) {
                        int i13 = i11 + 3;
                        for (int i14 = i11 + 4; i14 < str.length(); i14++) {
                            char charAt2 = str.charAt(i14);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i14;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i11 + 6);
                        i5 = c(i13, min, str);
                        int i15 = min - i13;
                        if (i15 == 1) {
                            i5 *= 100;
                        } else if (i15 == 2) {
                            i5 *= 10;
                        }
                        i3 = c5;
                        i9 = length2;
                        i4 = c6;
                    } else {
                        i3 = c5;
                        i9 = i12;
                        i4 = c6;
                        i5 = 0;
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
            }
            if (str.length() <= i9) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt3 = str.charAt(i9);
            TimeZone timeZone = f3025a;
            if (charAt3 == 'Z') {
                length = i9 + 1;
            } else {
                if (charAt3 != '+' && charAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                }
                String substring = str.substring(i9);
                if (substring.length() < 5) {
                    substring = substring + "00";
                }
                length = i9 + substring.length();
                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                    String str2 = "GMT" + substring;
                    timeZone = TimeZone.getTimeZone(str2);
                    String id = timeZone.getID();
                    if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, c);
            gregorianCalendar2.set(2, c3 - 1);
            gregorianCalendar2.set(5, c4);
            gregorianCalendar2.set(11, i3);
            gregorianCalendar2.set(12, i4);
            gregorianCalendar2.set(13, i6);
            gregorianCalendar2.set(14, i5);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e3) {
            e = e3;
            String str3 = str == null ? null : "\"" + str + '\"';
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e5) {
            e = e5;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException22 = new ParseException("Failed to parse date [" + str3 + "]: " + message, parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    public static int c(int i3, int i4, String str) {
        int i5;
        int i6;
        if (i3 < 0 || i4 > str.length() || i3 > i4) {
            throw new NumberFormatException(str);
        }
        if (i3 < i4) {
            i6 = i3 + 1;
            int digit = Character.digit(str.charAt(i3), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i4));
            }
            i5 = -digit;
        } else {
            i5 = 0;
            i6 = i3;
        }
        while (i6 < i4) {
            int i7 = i6 + 1;
            int digit2 = Character.digit(str.charAt(i6), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i3, i4));
            }
            i5 = (i5 * 10) - digit2;
            i6 = i7;
        }
        return -i5;
    }
}
