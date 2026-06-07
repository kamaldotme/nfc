package X0;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1019b;
    public final /* synthetic */ TextInputLayout c;

    public /* synthetic */ B(TextInputLayout textInputLayout, int i3) {
        this.f1019b = i3;
        this.c = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1019b) {
            case 0:
                CheckableImageButton checkableImageButton = this.c.f2511d.h;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            default:
                this.c.f2513e.requestLayout();
                return;
        }
    }
}
