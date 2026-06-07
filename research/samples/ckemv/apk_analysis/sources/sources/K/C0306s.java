package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xyz.happify.ckemv.R;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3770a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3771b;
    public final Serializable c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3772d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3773e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3774f;
    public Object g;

    public C0306s(m2.l lVar, String str, m2.j jVar, X0.o oVar, Map map) {
        this.f3770a = 1;
        X1.g.e(str, "method");
        this.f3771b = lVar;
        this.c = str;
        this.f3772d = jVar;
        this.f3773e = oVar;
        this.f3774f = map;
    }

    public static boolean a(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i3) {
        int c = c1.c(context, R.attr.colorControlHighlight);
        int b3 = c1.b(context, R.attr.colorButtonNormal);
        int[] iArr = c1.f3676b;
        int[] iArr2 = c1.f3677d;
        int b4 = A.a.b(c, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, c1.c, c1.f3679f}, new int[]{b3, b4, A.a.b(c, i3), i3});
    }

    public static LayerDrawable c(O0 o02, Context context, int i3) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        Drawable e3 = o02.e(context, R.drawable.abc_star_black_48dp);
        Drawable e4 = o02.e(context, R.drawable.abc_star_half_black_48dp);
        if ((e3 instanceof BitmapDrawable) && e3.getIntrinsicWidth() == dimensionPixelSize && e3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) e3;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            e3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e3.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((e4 instanceof BitmapDrawable) && e4.getIntrinsicWidth() == dimensionPixelSize && e4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) e4;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            e4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e4.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void f(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter g;
        int[] iArr = AbstractC0299o0.f3754a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0308t.f3776b;
        }
        PorterDuff.Mode mode2 = C0308t.f3776b;
        synchronized (C0308t.class) {
            g = O0.g(i3, mode);
        }
        mutate.setColorFilter(g);
    }

    public ColorStateList d(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return y.f.c(context, R.color.abc_tint_edittext);
        }
        if (i3 == R.drawable.abc_switch_track_mtrl_alpha) {
            return y.f.c(context, R.color.abc_tint_switch_track);
        }
        if (i3 != R.drawable.abc_switch_thumb_material) {
            if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, c1.c(context, R.attr.colorButtonNormal));
            }
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return b(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return b(context, c1.c(context, R.attr.colorAccent));
            }
            if (i3 == R.drawable.abc_spinner_mtrl_am_alpha || i3 == R.drawable.abc_spinner_textfield_background_material) {
                return y.f.c(context, R.color.abc_tint_spinner);
            }
            if (a((int[]) this.c, i3)) {
                return c1.d(context, R.attr.colorControlNormal);
            }
            if (a((int[]) this.f3774f, i3)) {
                return y.f.c(context, R.color.abc_tint_default);
            }
            if (a((int[]) this.g, i3)) {
                return y.f.c(context, R.color.abc_tint_btn_checkable);
            }
            if (i3 == R.drawable.abc_seekbar_thumb_material) {
                return y.f.c(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList d3 = c1.d(context, R.attr.colorSwitchThumbNormal);
        if (d3 == null || !d3.isStateful()) {
            iArr[0] = c1.f3676b;
            iArr2[0] = c1.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = c1.f3678e;
            iArr2[1] = c1.c(context, R.attr.colorControlActivated);
            iArr[2] = c1.f3679f;
            iArr2[2] = c1.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = c1.f3676b;
            iArr[0] = iArr3;
            iArr2[0] = d3.getColorForState(iArr3, 0);
            iArr[1] = c1.f3678e;
            iArr2[1] = c1.c(context, R.attr.colorControlActivated);
            iArr[2] = c1.f3679f;
            iArr2[2] = d3.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public G.e e() {
        G.e eVar = new G.e(false);
        eVar.f185f = new LinkedHashMap();
        eVar.c = (m2.l) this.f3771b;
        eVar.f182b = (String) this.c;
        eVar.f184e = (X0.o) this.f3773e;
        Map map = (Map) this.f3774f;
        eVar.f185f = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        eVar.f183d = ((m2.j) this.f3772d).c();
        return eVar;
    }

    public String toString() {
        switch (this.f3770a) {
            case 1:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.c);
                sb.append(", url=");
                sb.append((m2.l) this.f3771b);
                m2.j jVar = (m2.j) this.f3772d;
                if (jVar.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = jVar.iterator();
                    int i3 = 0;
                    while (true) {
                        L1.b bVar = (L1.b) it;
                        if (bVar.hasNext()) {
                            Object next = bVar.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            K1.c cVar = (K1.c) next;
                            String str = (String) cVar.f600b;
                            String str2 = (String) cVar.c;
                            if (i3 > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i3 = i4;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.f3774f;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                X1.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [int[], java.io.Serializable] */
    public C0306s() {
        this.f3770a = 0;
        this.f3771b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f3772d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f3773e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f3774f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }
}
