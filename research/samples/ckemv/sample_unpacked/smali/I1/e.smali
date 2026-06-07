.class public final LI1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field public final synthetic a:LI1/g;


# direct methods
.method public constructor <init>(Lcom/journeyapps/barcodescanner/BarcodeView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI1/e;->a:LI1/g;

    return-void
.end method


# virtual methods
.method public final surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    if-nez p1, :cond_0

    sget p1, LI1/g;->A:I

    return-void

    :cond_0
    new-instance p1, LI1/y;

    invoke-direct {p1, p3, p4}, LI1/y;-><init>(II)V

    iget-object p2, p0, LI1/e;->a:LI1/g;

    iput-object p1, p2, LI1/g;->q:LI1/y;

    invoke-virtual {p2}, LI1/g;->f()V

    return-void
.end method

.method public final surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 0

    return-void
.end method

.method public final surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object p1, p0, LI1/e;->a:LI1/g;

    const/4 v0, 0x0

    iput-object v0, p1, LI1/g;->q:LI1/y;

    return-void
.end method
