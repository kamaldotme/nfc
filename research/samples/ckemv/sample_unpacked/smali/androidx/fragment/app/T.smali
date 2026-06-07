.class public final Landroidx/fragment/app/T;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public final c:Landroidx/fragment/app/n;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/HashSet;

.field public f:Z

.field public g:Z

.field public final h:Landroidx/fragment/app/G;


# direct methods
.method public constructor <init>(IILandroidx/fragment/app/G;LF/d;)V
    .locals 2

    iget-object v0, p3, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/T;->d:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Landroidx/fragment/app/T;->e:Ljava/util/HashSet;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/T;->f:Z

    iput-boolean v1, p0, Landroidx/fragment/app/T;->g:Z

    iput p1, p0, Landroidx/fragment/app/T;->a:I

    iput p2, p0, Landroidx/fragment/app/T;->b:I

    iput-object v0, p0, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    new-instance p1, LA/h;

    const/16 p2, 0x19

    invoke-direct {p1, p2, p0}, LA/h;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p4, p1}, LF/d;->b(LF/c;)V

    iput-object p3, p0, Landroidx/fragment/app/T;->h:Landroidx/fragment/app/G;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/T;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/T;->f:Z

    iget-object v0, p0, Landroidx/fragment/app/T;->e:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/T;->b()V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF/d;

    invoke-virtual {v1}, LF/d;->a()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final b()V
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/T;->g:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/T;->toString()Ljava/lang/String;

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/T;->g:Z

    iget-object v0, p0, Landroidx/fragment/app/T;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Landroidx/fragment/app/T;->h:Landroidx/fragment/app/G;

    invoke-virtual {v0}, Landroidx/fragment/app/G;->k()V

    return-void
.end method

.method public final c(II)V
    .locals 4

    invoke-static {p2}, Lq/h;->a(I)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x2

    iget-object v2, p0, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    const-string v3, "FragmentManager"

    if-eqz p2, :cond_4

    if-eq p2, v0, :cond_2

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    iput v0, p0, Landroidx/fragment/app/T;->a:I

    const/4 p1, 0x3

    iput p1, p0, Landroidx/fragment/app/T;->b:I

    goto :goto_0

    :cond_2
    iget p1, p0, Landroidx/fragment/app/T;->a:I

    if-ne p1, v0, :cond_6

    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_3
    iput v1, p0, Landroidx/fragment/app/T;->a:I

    iput v1, p0, Landroidx/fragment/app/T;->b:I

    goto :goto_0

    :cond_4
    iget p2, p0, Landroidx/fragment/app/T;->a:I

    if-eq p2, v0, :cond_6

    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    iput p1, p0, Landroidx/fragment/app/T;->a:I

    :cond_6
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 5

    iget v0, p0, Landroidx/fragment/app/T;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Landroidx/fragment/app/T;->h:Landroidx/fragment/app/G;

    iget-object v2, v0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-object v3, v2, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Landroidx/fragment/app/n;->f()Landroidx/fragment/app/m;

    move-result-object v4

    iput-object v3, v4, Landroidx/fragment/app/m;->k:Landroid/view/View;

    const-string v4, "FragmentManager"

    invoke-static {v4, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v2}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    invoke-virtual {v1}, Landroidx/fragment/app/n;->x()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/G;->b()V

    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v0

    cmpl-float v0, v0, v4

    if-nez v0, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object v0, v2, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v0, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_3
    iget v0, v0, Landroidx/fragment/app/m;->j:F

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_4
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Operation {"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} {mFinalState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/T;->a:I

    invoke-static {v1}, LX/d;->v(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} {mLifecycleImpact = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/T;->b:I

    invoke-static {v1}, LX/d;->u(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} {mFragment = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
