package k;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ProgressBar;
import e.AbstractC0116a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v0.C0403c;

/* renamed from: k.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0246B {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3551d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3552a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f3553b;
    public Object c;

    public /* synthetic */ C0246B() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((C0403c) ((A.h) this.c).c).getClass();
        if (keyListener instanceof S.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new S.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i3) {
        switch (this.f3552a) {
            case 0:
                ProgressBar progressBar = (ProgressBar) this.f3553b;
                v0.m F2 = v0.m.F(progressBar.getContext(), attributeSet, f3551d, i3, 0);
                Drawable s3 = F2.s(0);
                if (s3 != null) {
                    if (s3 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) s3;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i4 = 0; i4 < numberOfFrames; i4++) {
                            Drawable e3 = e(animationDrawable.getFrame(i4), true);
                            e3.setLevel(10000);
                            animationDrawable2.addFrame(e3, animationDrawable.getDuration(i4));
                        }
                        animationDrawable2.setLevel(10000);
                        s3 = animationDrawable2;
                    }
                    progressBar.setIndeterminateDrawable(s3);
                }
                Drawable s4 = F2.s(1);
                if (s4 != null) {
                    progressBar.setProgressDrawable(e(s4, false));
                }
                F2.J();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f3553b).getContext().obtainStyledAttributes(attributeSet, AbstractC0116a.f2670i, i3, 0);
                try {
                    boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z3);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public S.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        A.h hVar = (A.h) this.c;
        if (inputConnection == null) {
            hVar.getClass();
            inputConnection = null;
        } else {
            C0403c c0403c = (C0403c) hVar.c;
            c0403c.getClass();
            if (!(inputConnection instanceof S.b)) {
                inputConnection = new S.b((EditText) c0403c.c, inputConnection, editorInfo);
            }
        }
        return (S.b) inputConnection;
    }

    public void d(boolean z3) {
        S.i iVar = (S.i) ((C0403c) ((A.h) this.c).c).f5067d;
        if (iVar.f863e != z3) {
            if (iVar.f862d != null) {
                androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
                S.h hVar = iVar.f862d;
                a3.getClass();
                m0.z.k(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a3.f1770a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a3.f1771b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f863e = z3;
            if (z3) {
                S.i.a(iVar.f861b, androidx.emoji2.text.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z3) {
        if (drawable instanceof B.e) {
            ((B.f) ((B.e) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    int id = layerDrawable.getId(i3);
                    drawableArr[i3] = e(layerDrawable.getDrawable(i3), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    layerDrawable2.setId(i4, layerDrawable.getId(i4));
                    layerDrawable2.setLayerGravity(i4, layerDrawable.getLayerGravity(i4));
                    layerDrawable2.setLayerWidth(i4, layerDrawable.getLayerWidth(i4));
                    layerDrawable2.setLayerHeight(i4, layerDrawable.getLayerHeight(i4));
                    layerDrawable2.setLayerInsetLeft(i4, layerDrawable.getLayerInsetLeft(i4));
                    layerDrawable2.setLayerInsetRight(i4, layerDrawable.getLayerInsetRight(i4));
                    layerDrawable2.setLayerInsetTop(i4, layerDrawable.getLayerInsetTop(i4));
                    layerDrawable2.setLayerInsetBottom(i4, layerDrawable.getLayerInsetBottom(i4));
                    layerDrawable2.setLayerInsetStart(i4, layerDrawable.getLayerInsetStart(i4));
                    layerDrawable2.setLayerInsetEnd(i4, layerDrawable.getLayerInsetEnd(i4));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0246B(EditText editText) {
        this.f3553b = editText;
        this.c = new A.h(editText);
    }

    public C0246B(ProgressBar progressBar) {
        this.f3553b = progressBar;
    }
}
