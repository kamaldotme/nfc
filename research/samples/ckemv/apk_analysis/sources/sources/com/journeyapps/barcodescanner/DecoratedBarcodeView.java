package com.journeyapps.barcodescanner;

import I1.n;
import I1.q;
import J1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import n1.g;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeView f2596b;
    public final ViewfinderView c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f2597d;

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.c);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.f2596b = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView.b(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
        this.c = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView.setCameraPreview(this.f2596b);
        this.f2597d = (TextView) findViewById(R.id.zxing_status_view);
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public j getCameraSettings() {
        return this.f2596b.getCameraSettings();
    }

    public n getDecoderFactory() {
        return this.f2596b.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f2597d;
    }

    public ViewfinderView getViewFinder() {
        return this.c;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 == 24) {
            this.f2596b.setTorch(true);
            return true;
        }
        if (i3 == 25) {
            this.f2596b.setTorch(false);
            return true;
        }
        if (i3 == 27 || i3 == 80) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    public void setCameraSettings(j jVar) {
        this.f2596b.setCameraSettings(jVar);
    }

    public void setDecoderFactory(n nVar) {
        this.f2596b.setDecoderFactory(nVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f2597d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(q qVar) {
    }
}
