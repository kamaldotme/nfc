package S;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f849a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.e f850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        U0.e eVar = new U0.e(7);
        this.f849a = editText;
        this.f850b = eVar;
        if (androidx.emoji2.text.j.f1769j != null) {
            androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
            if (a3.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a3.f1773e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            R.b bVar = (R.b) fVar.c.f5076b;
            int a4 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a4 != 0 ? ((ByteBuffer) bVar.f473d).getInt(a4 + bVar.f471a) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f1766a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        Editable editableText = this.f849a.getEditableText();
        this.f850b.getClass();
        return U0.e.e(this, editableText, i3, i4, false) || super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        Editable editableText = this.f849a.getEditableText();
        this.f850b.getClass();
        return U0.e.e(this, editableText, i3, i4, true) || super.deleteSurroundingTextInCodePoints(i3, i4);
    }
}
