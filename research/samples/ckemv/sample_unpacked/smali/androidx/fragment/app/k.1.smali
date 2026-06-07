.class public Landroidx/fragment/app/k;
.super Landroidx/fragment/app/n;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public S:Landroid/os/Handler;

.field public final T:LF0/h;

.field public final U:Landroidx/fragment/app/h;

.field public final V:Landroidx/fragment/app/i;

.field public W:I

.field public X:I

.field public Y:Z

.field public Z:Z

.field public a0:I

.field public b0:Z

.field public final c0:LA/h;

.field public d0:Landroid/app/Dialog;

.field public e0:Z

.field public f0:Z

.field public g0:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/n;-><init>()V

    new-instance v0, LF0/h;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p0}, LF0/h;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/fragment/app/k;->T:LF0/h;

    new-instance v0, Landroidx/fragment/app/h;

    invoke-direct {v0, p0}, Landroidx/fragment/app/h;-><init>(Landroidx/fragment/app/k;)V

    iput-object v0, p0, Landroidx/fragment/app/k;->U:Landroidx/fragment/app/h;

    new-instance v0, Landroidx/fragment/app/i;

    invoke-direct {v0, p0}, Landroidx/fragment/app/i;-><init>(Landroidx/fragment/app/k;)V

    iput-object v0, p0, Landroidx/fragment/app/k;->V:Landroidx/fragment/app/i;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/k;->W:I

    iput v0, p0, Landroidx/fragment/app/k;->X:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/fragment/app/k;->Y:Z

    iput-boolean v1, p0, Landroidx/fragment/app/k;->Z:Z

    const/4 v1, -0x1

    iput v1, p0, Landroidx/fragment/app/k;->a0:I

    new-instance v1, LA/h;

    const/16 v2, 0x17

    invoke-direct {v1, v2, p0}, LA/h;-><init>(ILjava/lang/Object;)V

    iput-object v1, p0, Landroidx/fragment/app/k;->c0:LA/h;

    iput-boolean v0, p0, Landroidx/fragment/app/k;->g0:Z

    return-void
.end method


# virtual methods
.method public final A(ZZ)V
    .locals 4

    iget-boolean v0, p0, Landroidx/fragment/app/k;->f0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/k;->f0:Z

    iget-object v1, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    if-nez p2, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    iget-object v1, p0, Landroidx/fragment/app/k;->S:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p2, v1, :cond_1

    iget-object p2, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    invoke-virtual {p0, p2}, Landroidx/fragment/app/k;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Landroidx/fragment/app/k;->S:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/fragment/app/k;->T:LF0/h;

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/k;->e0:Z

    iget p2, p0, Landroidx/fragment/app/k;->a0:I

    const/4 v1, 0x0

    if-ltz p2, :cond_4

    invoke-virtual {p0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object p1

    iget p2, p0, Landroidx/fragment/app/k;->a0:I

    if-ltz p2, :cond_3

    new-instance v0, Landroidx/fragment/app/A;

    invoke-direct {v0, p1, p2}, Landroidx/fragment/app/A;-><init>(Landroidx/fragment/app/B;I)V

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/B;->u(Landroidx/fragment/app/z;Z)V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/fragment/app/k;->a0:I

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bad id: "

    invoke-static {v0, p2}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object p2

    new-instance v2, Landroidx/fragment/app/a;

    invoke-direct {v2, p2}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/B;)V

    iget-object p2, p0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-eqz p2, :cond_6

    iget-object v3, v2, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/B;

    if-ne p2, v3, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Cannot remove Fragment attached to a different FragmentManager. Fragment "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is already attached to a FragmentManager."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    new-instance p2, Landroidx/fragment/app/H;

    const/4 v3, 0x3

    invoke-direct {p2, v3, p0}, Landroidx/fragment/app/H;-><init>(ILandroidx/fragment/app/n;)V

    invoke-virtual {v2, p2}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/H;)V

    if-eqz p1, :cond_7

    invoke-virtual {v2, v0}, Landroidx/fragment/app/a;->d(Z)I

    goto :goto_2

    :cond_7
    invoke-virtual {v2, v1}, Landroidx/fragment/app/a;->d(Z)I

    :goto_2
    return-void
.end method

.method public B()Landroid/app/Dialog;
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_0
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroidx/fragment/app/n;->w()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Landroidx/fragment/app/k;->X:I

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public final e()Lv0/f;
    .locals 2

    new-instance v0, Landroidx/fragment/app/l;

    invoke-direct {v0, p0}, Landroidx/fragment/app/l;-><init>(Landroidx/fragment/app/n;)V

    new-instance v1, Landroidx/fragment/app/j;

    invoke-direct {v1, p0, v0}, Landroidx/fragment/app/j;-><init>(Landroidx/fragment/app/k;Landroidx/fragment/app/l;)V

    return-object v1
.end method

.method public final k(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/n;->k(Landroid/content/Context;)V

    iget-object p1, p0, Landroidx/fragment/app/k;->c0:LA/h;

    iget-object v0, p0, Landroidx/fragment/app/n;->O:Landroidx/lifecycle/y;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/y;->d(LA/h;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/k;->f0:Z

    return-void
.end method

.method public l(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/n;->l(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/k;->S:Landroid/os/Handler;

    iget v0, p0, Landroidx/fragment/app/n;->x:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/k;->Z:Z

    if-eqz p1, :cond_1

    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/k;->W:I

    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/k;->X:I

    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/fragment/app/k;->Y:Z

    const-string v0, "android:showsDialog"

    iget-boolean v1, p0, Landroidx/fragment/app/k;->Z:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/fragment/app/k;->Z:Z

    const-string v0, "android:backStackId"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Landroidx/fragment/app/k;->a0:I

    :cond_1
    return-void
.end method

.method public final n()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    iget-object v1, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz v1, :cond_1

    iput-boolean v0, p0, Landroidx/fragment/app/k;->e0:Z

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    iget-boolean v1, p0, Landroidx/fragment/app/k;->f0:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    invoke-virtual {p0, v1}, Landroidx/fragment/app/k;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    iput-object v0, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/k;->g0:Z

    :cond_1
    return-void
.end method

.method public final o()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    iget-boolean v1, p0, Landroidx/fragment/app/k;->f0:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Landroidx/fragment/app/k;->f0:Z

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/k;->c0:LA/h;

    iget-object v1, p0, Landroidx/fragment/app/n;->O:Landroidx/lifecycle/y;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "removeObserver"

    invoke-static {v2}, Landroidx/lifecycle/y;->a(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/y;->b:Lm/f;

    invoke-virtual {v1, v0}, Lm/f;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/x;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/lifecycle/x;->d()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->c(Z)V

    :goto_0
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-boolean p1, p0, Landroidx/fragment/app/k;->e0:Z

    if-nez p1, :cond_1

    const-string p1, "FragmentManager"

    const/4 v0, 0x3

    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, Landroidx/fragment/app/k;->A(ZZ)V

    :cond_1
    return-void
.end method

.method public final p(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 7

    invoke-super {p0, p1}, Landroidx/fragment/app/n;->p(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-boolean v0, p0, Landroidx/fragment/app/k;->Z:Z

    const-string v1, "FragmentManager"

    const/4 v2, 0x2

    if-eqz v0, :cond_9

    iget-boolean v3, p0, Landroidx/fragment/app/k;->b0:Z

    if-eqz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    if-nez v0, :cond_1

    goto :goto_4

    :cond_1
    iget-boolean v0, p0, Landroidx/fragment/app/k;->g0:Z

    if-nez v0, :cond_6

    const/4 v0, 0x0

    const/4 v3, 0x1

    :try_start_0
    iput-boolean v3, p0, Landroidx/fragment/app/k;->b0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/k;->B()Landroid/app/Dialog;

    move-result-object v4

    iput-object v4, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    iget-boolean v5, p0, Landroidx/fragment/app/k;->Z:Z

    if-eqz v5, :cond_5

    iget v5, p0, Landroidx/fragment/app/k;->W:I

    if-eq v5, v3, :cond_3

    if-eq v5, v2, :cond_3

    const/4 v6, 0x3

    if-eq v5, v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    if-eqz v5, :cond_3

    const/16 v6, 0x18

    invoke-virtual {v5, v6}, Landroid/view/Window;->addFlags(I)V

    :cond_3
    invoke-virtual {v4, v3}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/n;->h()Landroid/content/Context;

    move-result-object v4

    instance-of v5, v4, Landroid/app/Activity;

    if-eqz v5, :cond_4

    iget-object v5, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    check-cast v4, Landroid/app/Activity;

    invoke-virtual {v5, v4}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_1
    iget-object v4, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    iget-boolean v5, p0, Landroidx/fragment/app/k;->Y:Z

    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object v4, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    iget-object v5, p0, Landroidx/fragment/app/k;->U:Landroidx/fragment/app/h;

    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v4, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    iget-object v5, p0, Landroidx/fragment/app/k;->V:Landroidx/fragment/app/i;

    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-boolean v3, p0, Landroidx/fragment/app/k;->g0:Z

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    iput-object v3, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    iput-boolean v0, p0, Landroidx/fragment/app/k;->b0:Z

    goto :goto_4

    :goto_3
    iput-boolean v0, p0, Landroidx/fragment/app/k;->b0:Z

    throw p1

    :cond_6
    :goto_4
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_7
    iget-object v0, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    :cond_8
    return-object p1

    :cond_9
    :goto_5
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_a
    return-object p1
.end method

.method public q(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android:dialogShowing"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    iget v0, p0, Landroidx/fragment/app/k;->W:I

    if-eqz v0, :cond_1

    const-string v1, "android:style"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget v0, p0, Landroidx/fragment/app/k;->X:I

    if-eqz v0, :cond_2

    const-string v1, "android:theme"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    iget-boolean v0, p0, Landroidx/fragment/app/k;->Y:Z

    if-nez v0, :cond_3

    const-string v1, "android:cancelable"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-boolean v0, p0, Landroidx/fragment/app/k;->Z:Z

    if-nez v0, :cond_4

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget v0, p0, Landroidx/fragment/app/k;->a0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method public r()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    iget-object v0, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/k;->e0:Z

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0801b6

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const v1, 0x7f0801b9

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const v1, 0x7f0801b8

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    iget-object v0, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_0
    return-void
.end method

.method public final t(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/n;->D:Z

    iget-object v0, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final u(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/n;->u(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "android:savedDialogState"

    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    invoke-virtual {p2, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method
