package com.google.android.material.timepicker;

import J.C;
import J.T;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b, reason: collision with root package name */
    public final Chip f2554b;
    public final EditText c;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f2554b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.c = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = T.f402a;
        editText.setId(C.a());
        C.h(textView, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2554b.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z3) {
        Chip chip = this.f2554b;
        chip.setChecked(z3);
        int i3 = z3 ? 0 : 4;
        EditText editText = this.c;
        editText.setVisibility(i3);
        chip.setVisibility(z3 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new J1.e(editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2554b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i3, Object obj) {
        this.f2554b.setTag(i3, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f2554b.toggle();
    }
}
