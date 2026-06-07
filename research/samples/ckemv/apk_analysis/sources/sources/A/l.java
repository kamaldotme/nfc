package A;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import m0.z;
import z.C0456f;
import z.C0457g;

/* loaded from: classes.dex */
public final class l extends z {
    public static Font p0(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int q02 = q0(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int q03 = q0(fontStyle, font2.getStyle());
            if (q03 < q02) {
                font = font2;
                q02 = q03;
            }
        }
        return font;
    }

    public static int q0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // m0.z
    public final Typeface r(Context context, C0456f c0456f, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (C0457g c0457g : c0456f.f5289a) {
                try {
                    Font build = new Font.Builder(resources, c0457g.f5294f).setWeight(c0457g.f5291b).setSlant(c0457g.c ? 1 : 0).setTtcIndex(c0457g.f5293e).setFontVariationSettings(c0457g.f5292d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(p0(build2, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // m0.z
    public final Typeface s(Context context, G.j[] jVarArr, int i3) {
        int i4;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = jVarArr.length;
            FontFamily.Builder builder = null;
            while (i4 < length) {
                G.j jVar = jVarArr[i4];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(jVar.f197a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(jVar.c).setSlant(jVar.f199d ? 1 : 0).setTtcIndex(jVar.f198b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    i4 = openFileDescriptor == null ? i4 + 1 : 0;
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(p0(build2, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // m0.z
    public final Typeface t(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // m0.z
    public final G.j v(G.j[] jVarArr, int i3) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
