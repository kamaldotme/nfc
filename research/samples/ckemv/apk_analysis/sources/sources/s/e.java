package S;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import v0.m;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f855a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.e f856b;

    public e(KeyListener keyListener) {
        U0.e eVar = new U0.e(8);
        this.f855a = keyListener;
        this.f856b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f855a.clearMetaKeyState(view, editable, i3);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f855a.getInputType();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.text.method.KeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        boolean g;
        this.f856b.getClass();
        if (i3 != 67) {
            if (i3 == 112) {
                g = m.g(editable, keyEvent, true);
            }
            return !this.f855a.onKeyDown(view, editable, i3, keyEvent);
        }
        g = m.g(editable, keyEvent, false);
        if (g) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        if (!this.f855a.onKeyDown(view, editable, i3, keyEvent)) {
        }
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f855a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f855a.onKeyUp(view, editable, i3, keyEvent);
    }
}
