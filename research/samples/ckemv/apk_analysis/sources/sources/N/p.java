package N;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class p {
    public static Drawable[] a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int b(View view) {
        return view.getLayoutDirection();
    }

    public static int c(View view) {
        return view.getTextDirection();
    }

    public static Locale d(TextView textView) {
        return textView.getTextLocale();
    }

    public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void f(TextView textView, int i3, int i4, int i5, int i6) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, i4, i5, i6);
    }

    public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void h(View view, int i3) {
        view.setTextDirection(i3);
    }
}
