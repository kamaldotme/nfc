package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f3126f;

    /* renamed from: a, reason: collision with root package name */
    public int f3127a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f3128b;
    public LayoutInflater c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f3129d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f3130e;

    public e(Context context, int i3) {
        super(context);
        this.f3127a = i3;
    }

    public final void a(Configuration configuration) {
        if (this.f3130e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f3129d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f3129d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f3128b == null) {
            this.f3128b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3128b.setTo(theme);
            }
        }
        this.f3128b.applyStyle(this.f3127a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f3130e == null) {
            Configuration configuration = this.f3129d;
            if (configuration != null) {
                if (f3126f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f3126f = configuration2;
                }
                if (!configuration.equals(f3126f)) {
                    this.f3130e = d.a(this, this.f3129d).getResources();
                }
            }
            this.f3130e = super.getResources();
        }
        return this.f3130e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3128b;
        if (theme != null) {
            return theme;
        }
        if (this.f3127a == 0) {
            this.f3127a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f3128b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        if (this.f3127a != i3) {
            this.f3127a = i3;
            b();
        }
    }
}
