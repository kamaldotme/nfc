package H0;

import Z.E;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class b extends E {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f275a;

    /* renamed from: b, reason: collision with root package name */
    public final List f276b;

    public b() {
        Paint paint = new Paint();
        this.f275a = paint;
        this.f276b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // Z.E
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f275a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (d dVar : this.f276b) {
            dVar.getClass();
            ThreadLocal threadLocal = A.a.f0a;
            float f3 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f3)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f3)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f3)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f3))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).y0()) {
                float d3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2355q.d();
                float a3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2355q.a();
                dVar.getClass();
                canvas.drawLine(0.0f, d3, 0.0f, a3, paint);
            } else {
                float b3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2355q.b();
                float c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2355q.c();
                dVar.getClass();
                canvas.drawLine(b3, 0.0f, c, 0.0f, paint);
            }
        }
    }
}
