.class public final Landroidx/fragment/app/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic b:Landroidx/fragment/app/k;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/h;->b:Landroidx/fragment/app/k;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/h;->b:Landroidx/fragment/app/k;

    iget-object v0, p1, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/k;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
