package z;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461k {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f5298a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f5299b;
    public final int c;

    public C0461k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f5298a = colorStateList;
        this.f5299b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
