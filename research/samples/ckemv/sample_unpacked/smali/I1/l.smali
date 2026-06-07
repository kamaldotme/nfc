.class public final LI1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic n:I


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Ljava/lang/String;

.field public g:Z

.field public final h:Ln1/f;

.field public final i:LA1/h;

.field public final j:Landroid/os/Handler;

.field public k:Z

.field public final l:LA/h;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LI1/l;->c:I

    const/4 v0, 0x0

    iput-boolean v0, p0, LI1/l;->d:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, LI1/l;->e:Z

    const-string v1, ""

    iput-object v1, p0, LI1/l;->f:Ljava/lang/String;

    iput-boolean v0, p0, LI1/l;->g:Z

    iput-boolean v0, p0, LI1/l;->k:Z

    new-instance v1, LA/h;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p0}, LA/h;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, LI1/l;->l:LA/h;

    new-instance v1, LI1/f;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, LI1/f;-><init>(ILjava/lang/Object;)V

    iput-boolean v0, p0, LI1/l;->m:Z

    iput-object p1, p0, LI1/l;->a:Landroid/app/Activity;

    iput-object p2, p0, LI1/l;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    invoke-virtual {p2}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    move-result-object p2

    iget-object p2, p2, LI1/g;->k:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, LI1/l;->j:Landroid/os/Handler;

    new-instance p2, Ln1/f;

    new-instance v0, LI1/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LI1/h;-><init>(LI1/l;I)V

    invoke-direct {p2, p1, v0}, Ln1/f;-><init>(Landroid/content/Context;LI1/h;)V

    iput-object p2, p0, LI1/l;->h:Ln1/f;

    new-instance p2, LA1/h;

    invoke-direct {p2, p1}, LA1/h;-><init>(Landroid/app/Activity;)V

    iput-object p2, p0, LI1/l;->i:LA1/h;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LI1/l;->b:Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->getBarcodeView()Lcom/journeyapps/barcodescanner/BarcodeView;

    move-result-object v1

    iget-object v1, v1, LI1/g;->b:LJ1/g;

    if-eqz v1, :cond_1

    iget-boolean v1, v1, LJ1/g;->g:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, LI1/l;->k:Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v1, p0, LI1/l;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    :goto_1
    iget-object v0, v0, Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;->b:Lcom/journeyapps/barcodescanner/BarcodeView;

    invoke-virtual {v0}, Lcom/journeyapps/barcodescanner/BarcodeView;->c()V

    iget-object v0, p0, LI1/l;->h:Ln1/f;

    invoke-virtual {v0}, Ln1/f;->a()V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LI1/l;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    iget-boolean v1, p0, LI1/l;->g:Z

    if-nez v1, :cond_2

    iget-boolean v1, p0, LI1/l;->k:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const p1, 0x7f1000b3

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :cond_1
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f1000b1

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    new-instance p1, LI1/i;

    invoke-direct {p1, p0}, LI1/i;-><init>(LI1/l;)V

    const v0, 0x7f1000b2

    invoke-virtual {v1, v0, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    new-instance p1, LI1/j;

    invoke-direct {p1, p0}, LI1/j;-><init>(LI1/l;)V

    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    :cond_2
    :goto_0
    return-void
.end method
