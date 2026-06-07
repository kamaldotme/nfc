package B2;

import a2.C0062a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w extends View {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f106b;
    public final ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v0, types: [a2.a, a2.c] */
    /* JADX WARN: Type inference failed for: r12v0, types: [a2.a, a2.c] */
    /* JADX WARN: Type inference failed for: r13v0, types: [a2.a, a2.c] */
    /* JADX WARN: Type inference failed for: r2v0, types: [B2.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [a2.a, a2.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a2.a, a2.c] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a2.a, a2.c] */
    /* JADX WARN: Type inference failed for: r7v2, types: [a2.a, a2.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [a2.a, a2.c] */
    public w(Context context) {
        super(context);
        X1.g.e(context, "context");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setAntiAlias(true);
        this.f106b = paint;
        this.c = new ArrayList();
        this.f107d = true;
        for (int i3 = 0; i3 < 16; i3++) {
            ArrayList arrayList = this.c;
            ?? c0062a = new C0062a(100, 500, 1);
            Y1.d dVar = Y1.e.f1147b;
            float D = u2.l.D(dVar, c0062a);
            float D2 = u2.l.D(dVar, new C0062a(100, 500, 1));
            float D3 = u2.l.D(dVar, new C0062a(20, 80, 1));
            float D4 = u2.l.D(dVar, new C0062a(-10, 10, 1));
            float D5 = u2.l.D(dVar, new C0062a(-10, 10, 1));
            int rgb = Color.rgb(u2.l.D(dVar, new C0062a(50, 255, 1)), u2.l.D(dVar, new C0062a(50, 255, 1)), u2.l.D(dVar, new C0062a(50, 255, 1)));
            ?? obj = new Object();
            obj.f101a = D;
            obj.f102b = D2;
            obj.c = D3;
            obj.f103d = D4;
            obj.f104e = D5;
            obj.f105f = rgb;
            arrayList.add(obj);
        }
        new Thread(new u(0, this)).start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f107d = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        X1.g.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#121212"));
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            paint = this.f106b;
            if (!hasNext) {
                break;
            }
            v vVar = (v) it.next();
            paint.setColor(vVar.f105f);
            canvas.drawCircle(vVar.f101a, vVar.f102b, vVar.c, paint);
        }
        paint.setColor(Color.parseColor("#33FFFFFF"));
        paint.setStrokeWidth(1.0f);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            int size2 = arrayList.size();
            for (int i5 = i4; i5 < size2; i5++) {
                v vVar2 = (v) arrayList.get(i3);
                v vVar3 = (v) arrayList.get(i5);
                if (((float) Math.hypot(vVar3.f101a - vVar2.f101a, vVar3.f102b - vVar2.f102b)) < 200.0f) {
                    canvas.drawLine(vVar2.f101a, vVar2.f102b, vVar3.f101a, vVar3.f102b, paint);
                }
            }
            i3 = i4;
        }
        paint.setStrokeWidth(3.0f);
    }
}
