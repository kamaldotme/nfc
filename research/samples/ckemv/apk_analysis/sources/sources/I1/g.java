package I1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class g extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f327A = 0;

    /* renamed from: b, reason: collision with root package name */
    public J1.g f328b;
    public final WindowManager c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f329d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f330e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceView f331f;
    public TextureView g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final C1.e f332i;

    /* renamed from: j, reason: collision with root package name */
    public int f333j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f334k;

    /* renamed from: l, reason: collision with root package name */
    public J1.l f335l;

    /* renamed from: m, reason: collision with root package name */
    public J1.j f336m;

    /* renamed from: n, reason: collision with root package name */
    public y f337n;

    /* renamed from: o, reason: collision with root package name */
    public y f338o;

    /* renamed from: p, reason: collision with root package name */
    public Rect f339p;

    /* renamed from: q, reason: collision with root package name */
    public y f340q;

    /* renamed from: r, reason: collision with root package name */
    public Rect f341r;

    /* renamed from: s, reason: collision with root package name */
    public Rect f342s;

    /* renamed from: t, reason: collision with root package name */
    public y f343t;

    /* renamed from: u, reason: collision with root package name */
    public double f344u;

    /* renamed from: v, reason: collision with root package name */
    public J1.n f345v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f346w;

    /* renamed from: x, reason: collision with root package name */
    public final e f347x;

    /* renamed from: y, reason: collision with root package name */
    public final A.h f348y;

    /* renamed from: z, reason: collision with root package name */
    public final f f349z;

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f330e = false;
        this.h = false;
        this.f333j = -1;
        this.f334k = new ArrayList();
        this.f336m = new J1.j();
        this.f341r = null;
        this.f342s = null;
        this.f343t = null;
        this.f344u = 0.1d;
        this.f345v = null;
        this.f346w = false;
        BarcodeView barcodeView = (BarcodeView) this;
        this.f347x = new e(barcodeView);
        c cVar = new c(1, barcodeView);
        this.f348y = new A.h(4, barcodeView);
        this.f349z = new f(0, barcodeView);
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        b(attributeSet);
        this.c = (WindowManager) context.getSystemService("window");
        this.f329d = new Handler(cVar);
        this.f332i = new C1.e(2);
    }

    public static void a(g gVar) {
        if (gVar.f328b == null || gVar.getDisplayRotation() == gVar.f333j) {
            return;
        }
        gVar.c();
        gVar.d();
    }

    private int getDisplayRotation() {
        return this.c.getDefaultDisplay().getRotation();
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n1.g.f4245a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f343t = new y(dimension, dimension2);
        }
        this.f330e = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f345v = new J1.k(0);
        } else if (integer == 2) {
            this.f345v = new J1.k(1);
        } else if (integer == 3) {
            this.f345v = new J1.k(2);
        }
        obtainStyledAttributes.recycle();
    }

    public abstract void c();

    /* JADX WARN: Type inference failed for: r0v11, types: [J1.g, java.lang.Object] */
    public final void d() {
        u2.d.G();
        if (this.f328b == null) {
            Context context = getContext();
            ?? obj = new Object();
            obj.f559f = false;
            obj.g = true;
            obj.f560i = new J1.j();
            J1.f fVar = new J1.f(obj, 0);
            obj.f561j = new J1.f(obj, 1);
            obj.f562k = new J1.f(obj, 2);
            obj.f563l = new J1.f(obj, 3);
            u2.d.G();
            if (C1.e.f127f == null) {
                C1.e.f127f = new C1.e();
            }
            C1.e eVar = C1.e.f127f;
            obj.f555a = eVar;
            J1.i iVar = new J1.i(context);
            obj.c = iVar;
            iVar.g = obj.f560i;
            obj.h = new Handler();
            J1.j jVar = this.f336m;
            if (!obj.f559f) {
                obj.f560i = jVar;
                iVar.g = jVar;
            }
            this.f328b = obj;
            obj.f557d = this.f329d;
            u2.d.G();
            obj.f559f = true;
            obj.g = false;
            synchronized (eVar.f131e) {
                eVar.f129b++;
                eVar.c(fVar);
            }
            this.f333j = getDisplayRotation();
        }
        if (this.f340q != null) {
            f();
        } else {
            SurfaceView surfaceView = this.f331f;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f347x);
            } else {
                TextureView textureView = this.g;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.g.getSurfaceTexture();
                        this.f340q = new y(this.g.getWidth(), this.g.getHeight());
                        f();
                    } else {
                        this.g.setSurfaceTextureListener(new d(this));
                    }
                }
            }
        }
        requestLayout();
        C1.e eVar2 = this.f332i;
        Context context2 = getContext();
        A.h hVar = this.f348y;
        u uVar = (u) eVar2.f130d;
        if (uVar != null) {
            uVar.disable();
        }
        eVar2.f130d = null;
        eVar2.c = null;
        eVar2.f131e = null;
        Context applicationContext = context2.getApplicationContext();
        eVar2.f131e = hVar;
        eVar2.c = (WindowManager) applicationContext.getSystemService("window");
        u uVar2 = new u(eVar2, applicationContext);
        eVar2.f130d = uVar2;
        uVar2.enable();
        eVar2.f129b = ((WindowManager) eVar2.c).getDefaultDisplay().getRotation();
    }

    public final void e(v0.l lVar) {
        J1.g gVar;
        if (this.h || (gVar = this.f328b) == null) {
            return;
        }
        gVar.f556b = lVar;
        u2.d.G();
        if (!gVar.f559f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
        gVar.f555a.c(gVar.f562k);
        this.h = true;
        ((BarcodeView) this).h();
        this.f349z.g();
    }

    public final void f() {
        Rect rect;
        float f3;
        y yVar = this.f340q;
        if (yVar == null || this.f338o == null || (rect = this.f339p) == null) {
            return;
        }
        if (this.f331f != null && yVar.equals(new y(rect.width(), this.f339p.height()))) {
            SurfaceHolder holder = this.f331f.getHolder();
            v0.l lVar = new v0.l(2);
            if (holder == null) {
                throw new IllegalArgumentException("surfaceHolder may not be null");
            }
            lVar.f5083d = holder;
            e(lVar);
            return;
        }
        TextureView textureView = this.g;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f338o != null) {
            int width = this.g.getWidth();
            int height = this.g.getHeight();
            y yVar2 = this.f338o;
            float f4 = height;
            float f5 = width / f4;
            float f6 = yVar2.f387b / yVar2.c;
            float f7 = 1.0f;
            if (f5 < f6) {
                float f8 = f6 / f5;
                f3 = 1.0f;
                f7 = f8;
            } else {
                f3 = f5 / f6;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f7, f3);
            float f9 = width;
            matrix.postTranslate((f9 - (f7 * f9)) / 2.0f, (f4 - (f3 * f4)) / 2.0f);
            this.g.setTransform(matrix);
        }
        SurfaceTexture surfaceTexture = this.g.getSurfaceTexture();
        v0.l lVar2 = new v0.l(2);
        if (surfaceTexture == null) {
            throw new IllegalArgumentException("surfaceTexture may not be null");
        }
        lVar2.f5084e = surfaceTexture;
        e(lVar2);
    }

    public J1.g getCameraInstance() {
        return this.f328b;
    }

    public J1.j getCameraSettings() {
        return this.f336m;
    }

    public Rect getFramingRect() {
        return this.f341r;
    }

    public y getFramingRectSize() {
        return this.f343t;
    }

    public double getMarginFraction() {
        return this.f344u;
    }

    public Rect getPreviewFramingRect() {
        return this.f342s;
    }

    public J1.n getPreviewScalingStrategy() {
        J1.n nVar = this.f345v;
        return nVar != null ? nVar : this.g != null ? new J1.k(0) : new J1.k(1);
    }

    public y getPreviewSize() {
        return this.f338o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f330e) {
            TextureView textureView = new TextureView(getContext());
            this.g = textureView;
            textureView.setSurfaceTextureListener(new d(this));
            addView(this.g);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f331f = surfaceView;
        surfaceView.getHolder().addCallback(this.f347x);
        addView(this.f331f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        y yVar = new y(i5 - i3, i6 - i4);
        this.f337n = yVar;
        J1.g gVar = this.f328b;
        if (gVar != null && gVar.f558e == null) {
            int displayRotation = getDisplayRotation();
            J1.l lVar = new J1.l();
            lVar.f580d = new J1.k(1);
            lVar.f579b = displayRotation;
            lVar.c = yVar;
            this.f335l = lVar;
            lVar.f580d = getPreviewScalingStrategy();
            J1.g gVar2 = this.f328b;
            J1.l lVar2 = this.f335l;
            gVar2.f558e = lVar2;
            gVar2.c.h = lVar2;
            u2.d.G();
            if (!gVar2.f559f) {
                throw new IllegalStateException("CameraInstance is not open");
            }
            gVar2.f555a.c(gVar2.f561j);
            boolean z4 = this.f346w;
            if (z4) {
                J1.g gVar3 = this.f328b;
                gVar3.getClass();
                u2.d.G();
                if (gVar3.f559f) {
                    gVar3.f555a.c(new J1.e(gVar3, z4, 0));
                }
            }
        }
        SurfaceView surfaceView = this.f331f;
        if (surfaceView == null) {
            TextureView textureView = this.g;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f339p;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f346w);
        return bundle;
    }

    public void setCameraSettings(J1.j jVar) {
        this.f336m = jVar;
    }

    public void setFramingRectSize(y yVar) {
        this.f343t = yVar;
    }

    public void setMarginFraction(double d3) {
        if (d3 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f344u = d3;
    }

    public void setPreviewScalingStrategy(J1.n nVar) {
        this.f345v = nVar;
    }

    public void setTorch(boolean z3) {
        this.f346w = z3;
        J1.g gVar = this.f328b;
        if (gVar != null) {
            u2.d.G();
            if (gVar.f559f) {
                gVar.f555a.c(new J1.e(gVar, z3, 0));
            }
        }
    }

    public void setUseTextureView(boolean z3) {
        this.f330e = z3;
    }
}
