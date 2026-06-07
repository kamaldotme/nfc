.class public Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final b:Lcom/journeyapps/barcodescanner/BarcodeView;

.field public final c:Lcom/journeyapps/barcodescanner/ViewfinderView;

.field public final d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Ln1/g;->c:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v0, 0x0

    const v1, 0x7f0b006b

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    const p1, 0x7f0801c3

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/journeyapps/barcodescanner/BarcodeView;

    iput-object p1, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, LI1/g;->b(Landroid/util/AttributeSet;)V

    const p1, 0x7f0801cd

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/journeyapps/barcodescanner/ViewfinderView;

    iput-object p1, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->c:Lcom/journeyapps/barcodescanner/ViewfinderView;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    invoke-virtual {p1, p2}, Lcom/journeyapps/barcodescanner/ViewfinderView;->setCameraPreview(LI1/g;)V

    const p1, 0x7f0801cc

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->d:Landroid/widget/TextView;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\"."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\"."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;
    .locals 1

    const v0, 0x7f0801c3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/journeyapps/barcodescanner/BarcodeView;

    return-object v0
.end method

.method public getCameraSettings()LJ1/j;
    .locals 1

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    invoke-virtual {v0}, LI1/g;->getCameraSettings()LJ1/j;

    move-result-object v0

    return-object v0
.end method

.method public getDecoderFactory()LI1/n;
    .locals 1

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->getDecoderFactory()LI1/n;

    move-result-object v0

    return-object v0
.end method

.method public getStatusView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method public getViewFinder()Lcom/journeyapps/barcodescanner/ViewfinderView;
    .locals 1

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->c:Lcom/journeyapps/barcodescanner/ViewfinderView;

    return-object v0
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    const/16 v0, 0x18

    const/4 v1, 0x1

    if-eq p1, v0, :cond_2

    const/16 v0, 0x19

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1b

    if-eq p1, v0, :cond_0

    const/16 v0, 0x50

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    return v1

    :cond_1
    iget-object p1, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LI1/g;->setTorch(Z)V

    return v1

    :cond_2
    iget-object p1, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    invoke-virtual {p1, v1}, LI1/g;->setTorch(Z)V

    return v1
.end method

.method public setCameraSettings(LJ1/j;)V
    .locals 1

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    invoke-virtual {v0, p1}, LI1/g;->setCameraSettings(LJ1/j;)V

    return-void
.end method

.method public setDecoderFactory(LI1/n;)V
    .locals 1

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    invoke-virtual {v0, p1}, Lcom/journeyapps/barcodescanner/BarcodeView;->setDecoderFactory(LI1/n;)V

    return-void
.end method

.method public setStatusText(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setTorchListener(LI1/q;)V
    .locals 0

    return-void
.end method
