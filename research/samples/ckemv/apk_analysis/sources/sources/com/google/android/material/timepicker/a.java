package com.google.android.material.timepicker;

import O0.j;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f2581b;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f2581b = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2581b;
        if (isEmpty) {
            chipTextInputComboView.f2554b.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a3 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2554b;
        if (TextUtils.isEmpty(a3)) {
            a3 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a3);
    }
}
