package k;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3648a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f3649b;
    public final ImageView c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f3650d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f3651e;

    public a1(View view) {
        this.f3648a = (TextView) view.findViewById(R.id.text1);
        this.f3649b = (TextView) view.findViewById(R.id.text2);
        this.c = (ImageView) view.findViewById(R.id.icon1);
        this.f3650d = (ImageView) view.findViewById(R.id.icon2);
        this.f3651e = (ImageView) view.findViewById(xyz.happify.ckemv.R.id.edit_query);
    }
}
