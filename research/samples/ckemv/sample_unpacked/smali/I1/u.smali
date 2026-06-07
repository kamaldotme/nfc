.class public final LI1/u;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:LC1/e;


# direct methods
.method public constructor <init>(LC1/e;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LI1/u;->a:LC1/e;

    const/4 p1, 0x3

    invoke-direct {p0, p2, p1}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public final onOrientationChanged(I)V
    .locals 3

    iget-object p1, p0, LI1/u;->a:LC1/e;

    iget-object v0, p1, LC1/e;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/WindowManager;

    iget-object v1, p1, LC1/e;->e:Ljava/lang/Object;

    check-cast v1, LA/h;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iget v2, p1, LC1/e;->b:I

    if-eq v0, v2, :cond_0

    iput v0, p1, LC1/e;->b:I

    iget-object p1, v1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, LI1/g;

    iget-object p1, p1, LI1/g;->d:Landroid/os/Handler;

    new-instance v0, LB2/u;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, LB2/u;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0xfa

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
