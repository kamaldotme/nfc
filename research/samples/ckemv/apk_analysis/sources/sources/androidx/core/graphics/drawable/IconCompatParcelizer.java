package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import l0.AbstractC0325a;
import l0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00ac. Please report as an issue. */
    public static IconCompat read(AbstractC0325a abstractC0325a) {
        IconCompat iconCompat = new IconCompat();
        int i3 = iconCompat.f1729a;
        if (abstractC0325a.e(1)) {
            i3 = ((b) abstractC0325a).f3898e.readInt();
        }
        iconCompat.f1729a = i3;
        byte[] bArr = iconCompat.c;
        if (abstractC0325a.e(2)) {
            Parcel parcel = ((b) abstractC0325a).f3898e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.f1731d = abstractC0325a.f(iconCompat.f1731d, 3);
        int i4 = iconCompat.f1732e;
        if (abstractC0325a.e(4)) {
            i4 = ((b) abstractC0325a).f3898e.readInt();
        }
        iconCompat.f1732e = i4;
        int i5 = iconCompat.f1733f;
        if (abstractC0325a.e(5)) {
            i5 = ((b) abstractC0325a).f3898e.readInt();
        }
        iconCompat.f1733f = i5;
        iconCompat.g = (ColorStateList) abstractC0325a.f(iconCompat.g, 6);
        String str = iconCompat.f1734i;
        if (abstractC0325a.e(7)) {
            str = ((b) abstractC0325a).f3898e.readString();
        }
        iconCompat.f1734i = str;
        String str2 = iconCompat.f1735j;
        if (abstractC0325a.e(8)) {
            str2 = ((b) abstractC0325a).f3898e.readString();
        }
        iconCompat.f1735j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.f1734i);
        switch (iconCompat.f1729a) {
            case -1:
                Parcelable parcelable = iconCompat.f1731d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1730b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1731d;
                if (parcelable2 != null) {
                    iconCompat.f1730b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.c;
                    iconCompat.f1730b = bArr3;
                    iconCompat.f1729a = 3;
                    iconCompat.f1732e = 0;
                    iconCompat.f1733f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.f1730b = str3;
                if (iconCompat.f1729a == 2 && iconCompat.f1735j == null) {
                    iconCompat.f1735j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1730b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0325a abstractC0325a) {
        abstractC0325a.getClass();
        iconCompat.f1734i = iconCompat.h.name();
        switch (iconCompat.f1729a) {
            case -1:
                iconCompat.f1731d = (Parcelable) iconCompat.f1730b;
                break;
            case 1:
            case 5:
                iconCompat.f1731d = (Parcelable) iconCompat.f1730b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.f1730b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.f1730b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.f1730b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f1729a;
        if (-1 != i3) {
            abstractC0325a.h(1);
            ((b) abstractC0325a).f3898e.writeInt(i3);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            abstractC0325a.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) abstractC0325a).f3898e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1731d;
        if (parcelable != null) {
            abstractC0325a.h(3);
            ((b) abstractC0325a).f3898e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f1732e;
        if (i4 != 0) {
            abstractC0325a.h(4);
            ((b) abstractC0325a).f3898e.writeInt(i4);
        }
        int i5 = iconCompat.f1733f;
        if (i5 != 0) {
            abstractC0325a.h(5);
            ((b) abstractC0325a).f3898e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            abstractC0325a.h(6);
            ((b) abstractC0325a).f3898e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1734i;
        if (str != null) {
            abstractC0325a.h(7);
            ((b) abstractC0325a).f3898e.writeString(str);
        }
        String str2 = iconCompat.f1735j;
        if (str2 != null) {
            abstractC0325a.h(8);
            ((b) abstractC0325a).f3898e.writeString(str2);
        }
    }
}
