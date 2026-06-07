package N;

import J.C0008g;
import J.InterfaceC0007f;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u implements J.r {
    public final C0008g a(View view, C0008g c0008g) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c0008g);
        }
        if (c0008g.f423a.c() == 2) {
            return c0008g;
        }
        InterfaceC0007f interfaceC0007f = c0008g.f423a;
        ClipData d3 = interfaceC0007f.d();
        int i3 = interfaceC0007f.i();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i4 = 0; i4 < d3.getItemCount(); i4++) {
            ClipData.Item itemAt = d3.getItemAt(i4);
            if ((i3 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z3) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z3 = true;
                }
            }
        }
        return null;
    }
}
