package com.journeyapps.barcodescanner;

import I1.f;
import I1.g;
import I1.y;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import j1.C0244n;
import java.util.ArrayList;
import java.util.List;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class ViewfinderView extends View {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f2598m = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2599b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2600d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2601e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2602f;
    public int g;
    public List h;

    /* renamed from: i, reason: collision with root package name */
    public List f2603i;

    /* renamed from: j, reason: collision with root package name */
    public g f2604j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f2605k;

    /* renamed from: l, reason: collision with root package name */
    public y f2606l;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2599b = new Paint(1);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n1.g.f4246b);
        this.c = obtainStyledAttributes.getColor(4, resources.getColor(R.color.zxing_viewfinder_mask));
        obtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.f2600d = obtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.f2601e = obtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        this.f2602f = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        this.g = 0;
        this.h = new ArrayList(20);
        this.f2603i = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        y yVar;
        g gVar = this.f2604j;
        if (gVar != null) {
            Rect framingRect = gVar.getFramingRect();
            y previewSize = this.f2604j.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f2605k = framingRect;
                this.f2606l = previewSize;
            }
        }
        Rect rect = this.f2605k;
        if (rect == null || (yVar = this.f2606l) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        Paint paint = this.f2599b;
        paint.setColor(this.c);
        float f3 = width;
        canvas.drawRect(0.0f, 0.0f, f3, rect.top, paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
        canvas.drawRect(rect.right + 1, rect.top, f3, rect.bottom + 1, paint);
        canvas.drawRect(0.0f, rect.bottom + 1, f3, height, paint);
        if (this.f2602f) {
            paint.setColor(this.f2600d);
            paint.setAlpha(f2598m[this.g]);
            this.g = (this.g + 1) % 8;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, paint);
        }
        float width2 = getWidth() / yVar.f387b;
        float height3 = getHeight() / yVar.c;
        boolean isEmpty = this.f2603i.isEmpty();
        int i3 = this.f2601e;
        if (!isEmpty) {
            paint.setAlpha(80);
            paint.setColor(i3);
            for (C0244n c0244n : this.f2603i) {
                canvas.drawCircle((int) (c0244n.f3505a * width2), (int) (c0244n.f3506b * height3), 3.0f, paint);
            }
            this.f2603i.clear();
        }
        if (!this.h.isEmpty()) {
            paint.setAlpha(160);
            paint.setColor(i3);
            for (C0244n c0244n2 : this.h) {
                canvas.drawCircle((int) (c0244n2.f3505a * width2), (int) (c0244n2.f3506b * height3), 6.0f, paint);
            }
            List list = this.h;
            List list2 = this.f2603i;
            this.h = list2;
            this.f2603i = list;
            list2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(g gVar) {
        this.f2604j = gVar;
        gVar.f334k.add(new f(2, this));
    }

    public void setLaserVisibility(boolean z3) {
        this.f2602f = z3;
    }

    public void setMaskColor(int i3) {
        this.c = i3;
    }
}
