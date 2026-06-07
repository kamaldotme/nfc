.class public final Landroidx/fragment/app/G;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv0/r;

.field public final b:Lv0/m;

.field public final c:Landroidx/fragment/app/n;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Lv0/r;Lv0/m;Landroidx/fragment/app/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/G;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/fragment/app/G;->e:I

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/G;->b:Lv0/m;

    .line 6
    iput-object p3, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    return-void
.end method

.method public constructor <init>(Lv0/r;Lv0/m;Landroidx/fragment/app/n;Landroidx/fragment/app/F;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Landroidx/fragment/app/G;->d:Z

    const/4 v1, -0x1

    .line 34
    iput v1, p0, Landroidx/fragment/app/G;->e:I

    .line 35
    iput-object p1, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    .line 36
    iput-object p2, p0, Landroidx/fragment/app/G;->b:Lv0/m;

    .line 37
    iput-object p3, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    const/4 p1, 0x0

    .line 38
    iput-object p1, p3, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    .line 39
    iput-object p1, p3, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    .line 40
    iput v0, p3, Landroidx/fragment/app/n;->r:I

    .line 41
    iput-boolean v0, p3, Landroidx/fragment/app/n;->o:Z

    .line 42
    iput-boolean v0, p3, Landroidx/fragment/app/n;->l:Z

    .line 43
    iget-object p2, p3, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    .line 44
    iput-object p1, p3, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    .line 45
    iget-object p1, p4, Landroidx/fragment/app/F;->n:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 46
    iput-object p1, p3, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p3, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    :goto_1
    return-void
.end method

.method public constructor <init>(Lv0/r;Lv0/m;Ljava/lang/ClassLoader;Landroidx/fragment/app/w;Landroidx/fragment/app/F;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/G;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/fragment/app/G;->e:I

    .line 10
    iput-object p1, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    .line 11
    iput-object p2, p0, Landroidx/fragment/app/G;->b:Lv0/m;

    .line 12
    iget-object p1, p5, Landroidx/fragment/app/F;->b:Ljava/lang/String;

    invoke-virtual {p4, p1}, Landroidx/fragment/app/w;->a(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    .line 13
    iget-object p2, p5, Landroidx/fragment/app/F;->k:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/fragment/app/n;->z(Landroid/os/Bundle;)V

    .line 16
    iget-object p2, p5, Landroidx/fragment/app/F;->c:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    .line 17
    iget-boolean p2, p5, Landroidx/fragment/app/F;->d:Z

    iput-boolean p2, p1, Landroidx/fragment/app/n;->n:Z

    const/4 p2, 0x1

    .line 18
    iput-boolean p2, p1, Landroidx/fragment/app/n;->p:Z

    .line 19
    iget p2, p5, Landroidx/fragment/app/F;->e:I

    iput p2, p1, Landroidx/fragment/app/n;->w:I

    .line 20
    iget p2, p5, Landroidx/fragment/app/F;->f:I

    iput p2, p1, Landroidx/fragment/app/n;->x:I

    .line 21
    iget-object p2, p5, Landroidx/fragment/app/F;->g:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/n;->y:Ljava/lang/String;

    .line 22
    iget-boolean p2, p5, Landroidx/fragment/app/F;->h:Z

    iput-boolean p2, p1, Landroidx/fragment/app/n;->B:Z

    .line 23
    iget-boolean p2, p5, Landroidx/fragment/app/F;->i:Z

    iput-boolean p2, p1, Landroidx/fragment/app/n;->m:Z

    .line 24
    iget-boolean p2, p5, Landroidx/fragment/app/F;->j:Z

    iput-boolean p2, p1, Landroidx/fragment/app/n;->A:Z

    .line 25
    iget-boolean p2, p5, Landroidx/fragment/app/F;->l:Z

    iput-boolean p2, p1, Landroidx/fragment/app/n;->z:Z

    .line 26
    invoke-static {}, Landroidx/lifecycle/m;->values()[Landroidx/lifecycle/m;

    move-result-object p2

    iget p3, p5, Landroidx/fragment/app/F;->m:I

    aget-object p2, p2, p3

    iput-object p2, p1, Landroidx/fragment/app/n;->L:Landroidx/lifecycle/m;

    .line 27
    iget-object p2, p5, Landroidx/fragment/app/F;->n:Landroid/os/Bundle;

    if-eqz p2, :cond_1

    .line 28
    iput-object p2, p1, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    goto :goto_0

    .line 29
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    .line 30
    :goto_0
    const-string p2, "FragmentManager"

    const/4 p3, 0x2

    invoke-static {p2, p3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 31
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    iget-object v3, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v2, :cond_0

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v2, v3, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    iget-object v2, v3, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v2}, Landroidx/fragment/app/B;->I()V

    iput v1, v3, Landroidx/fragment/app/n;->b:I

    const/4 v2, 0x1

    iput-boolean v2, v3, Landroidx/fragment/app/n;->D:Z

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_1
    iget-object v0, v3, Landroidx/fragment/app/n;->F:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    iget-object v4, v3, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    iget-object v5, v3, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    if-eqz v5, :cond_2

    invoke-virtual {v0, v5}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    iput-object v2, v3, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    :cond_2
    iget-object v0, v3, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v0, v3, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    iget-object v5, v3, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    iget-object v0, v0, Landroidx/fragment/app/P;->d:Landroidx/activity/l;

    invoke-virtual {v0, v5}, Landroidx/activity/l;->d(Landroid/os/Bundle;)V

    iput-object v2, v3, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    :cond_3
    iput-boolean v1, v3, Landroidx/fragment/app/n;->D:Z

    invoke-virtual {v3, v4}, Landroidx/fragment/app/n;->t(Landroid/os/Bundle;)V

    iget-boolean v0, v3, Landroidx/fragment/app/n;->D:Z

    if-eqz v0, :cond_4

    iget-object v0, v3, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, v3, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    sget-object v4, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    invoke-virtual {v0, v4}, Landroidx/fragment/app/P;->e(Landroidx/lifecycle/l;)V

    goto :goto_0

    :cond_4
    new-instance v0, Landroidx/fragment/app/U;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_0
    iput-object v2, v3, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    iget-object v0, v3, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iput-boolean v1, v0, Landroidx/fragment/app/B;->y:Z

    iput-boolean v1, v0, Landroidx/fragment/app/B;->z:Z

    iget-object v2, v0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v1, v2, Landroidx/fragment/app/D;->h:Z

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroidx/fragment/app/B;->s(I)V

    iget-object v0, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->c(Z)V

    return-void
.end method

.method public final b()V
    .locals 8

    iget-object v0, p0, Landroidx/fragment/app/G;->b:Lv0/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-object v2, v1, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    const/4 v3, -0x1

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v4

    add-int/lit8 v5, v4, -0x1

    :goto_0
    if-ltz v5, :cond_2

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/n;

    iget-object v7, v6, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-ne v7, v2, :cond_1

    iget-object v6, v6, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v6, :cond_1

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/n;

    iget-object v6, v5, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-ne v6, v2, :cond_3

    iget-object v5, v5, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v5, :cond_3

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v3

    goto :goto_2

    :cond_3
    goto :goto_1

    :cond_4
    :goto_2
    iget-object v0, v1, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    iget-object v1, v1, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final c()V
    .locals 8

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    const-string v2, " that does not belong to this FragmentManager!"

    const-string v3, " declared target fragment "

    iget-object v4, p0, Landroidx/fragment/app/G;->b:Lv0/m;

    const/4 v5, 0x0

    const-string v6, "Fragment "

    if-eqz v0, :cond_2

    iget-object v0, v0, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iget-object v4, v4, Lv0/m;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/G;

    if-eqz v0, :cond_1

    iget-object v2, v1, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    iget-object v2, v2, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iput-object v2, v1, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    iput-object v5, v1, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v4, v4, Lv0/m;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/G;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    invoke-static {v4, v1, v2}, LX/d;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object v0, v5

    :goto_0
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroidx/fragment/app/G;->k()V

    :cond_5
    iget-object v0, v1, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    iget-object v2, v0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iput-object v2, v1, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    iput-object v0, v1, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/n;

    iget-object v0, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lv0/r;->j(Z)V

    iget-object v3, v1, Landroidx/fragment/app/n;->Q:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v3, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iget-object v4, v1, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    invoke-virtual {v1}, Landroidx/fragment/app/n;->e()Lv0/f;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v1}, Landroidx/fragment/app/B;->b(Landroidx/fragment/app/q;Lv0/f;Landroidx/fragment/app/n;)V

    iput v2, v1, Landroidx/fragment/app/n;->b:I

    iput-boolean v2, v1, Landroidx/fragment/app/n;->D:Z

    iget-object v3, v1, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    iget-object v3, v3, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroidx/fragment/app/n;->k(Landroid/content/Context;)V

    iget-boolean v3, v1, Landroidx/fragment/app/n;->D:Z

    if-eqz v3, :cond_7

    iget-object v3, v1, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    iget-object v3, v3, Landroidx/fragment/app/B;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/E;

    invoke-interface {v4}, Landroidx/fragment/app/E;->f()V

    goto :goto_1

    :cond_6
    iget-object v1, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iput-boolean v2, v1, Landroidx/fragment/app/B;->y:Z

    iput-boolean v2, v1, Landroidx/fragment/app/B;->z:Z

    iget-object v3, v1, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v2, v3, Landroidx/fragment/app/D;->h:Z

    invoke-virtual {v1, v2}, Landroidx/fragment/app/B;->s(I)V

    invoke-virtual {v0, v2}, Lv0/r;->d(Z)V

    return-void

    :cond_7
    new-instance v0, Landroidx/fragment/app/U;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onAttach()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    throw v5
.end method

.method public final d()I
    .locals 12

    iget-object v0, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-object v1, v0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-nez v1, :cond_0

    iget v0, v0, Landroidx/fragment/app/n;->b:I

    return v0

    :cond_0
    iget v1, p0, Landroidx/fragment/app/G;->e:I

    iget-object v2, v0, Landroidx/fragment/app/n;->L:Landroidx/lifecycle/m;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x5

    const/4 v8, -0x1

    const/4 v9, 0x4

    if-eq v2, v3, :cond_3

    if-eq v2, v4, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v9, :cond_4

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_3
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_4
    :goto_0
    iget-boolean v2, v0, Landroidx/fragment/app/n;->n:Z

    if-eqz v2, :cond_7

    iget-boolean v2, v0, Landroidx/fragment/app/n;->o:Z

    if-eqz v2, :cond_5

    iget v1, p0, Landroidx/fragment/app/G;->e:I

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_7

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_5
    iget v2, p0, Landroidx/fragment/app/G;->e:I

    if-ge v2, v9, :cond_6

    iget v2, v0, Landroidx/fragment/app/n;->b:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_6
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_7
    :goto_1
    iget-boolean v2, v0, Landroidx/fragment/app/n;->l:Z

    if-nez v2, :cond_8

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_8
    iget-object v2, v0, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/fragment/app/B;->C()LU0/e;

    move-result-object v10

    invoke-static {v2, v10}, Landroidx/fragment/app/g;->g(Landroid/view/ViewGroup;LU0/e;)Landroidx/fragment/app/g;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v0}, Landroidx/fragment/app/g;->e(Landroidx/fragment/app/n;)Landroidx/fragment/app/T;

    move-result-object v10

    if-eqz v10, :cond_9

    iget v6, v10, Landroidx/fragment/app/T;->b:I

    :cond_9
    iget-object v2, v2, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/T;

    iget-object v11, v10, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    invoke-virtual {v11, v0}, Landroidx/fragment/app/n;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    iget-boolean v11, v10, Landroidx/fragment/app/T;->f:Z

    if-nez v11, :cond_a

    goto :goto_2

    :cond_b
    const/4 v10, 0x0

    :goto_2
    if-eqz v10, :cond_d

    if-eqz v6, :cond_c

    if-ne v6, v3, :cond_d

    :cond_c
    iget v2, v10, Landroidx/fragment/app/T;->b:I

    move v6, v2

    :cond_d
    if-ne v6, v4, :cond_e

    const/4 v2, 0x6

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    :cond_e
    if-ne v6, v5, :cond_f

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_3

    :cond_f
    iget-boolean v2, v0, Landroidx/fragment/app/n;->m:Z

    if-eqz v2, :cond_11

    iget v2, v0, Landroidx/fragment/app/n;->r:I

    if-lez v2, :cond_10

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    :cond_10
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_11
    :goto_3
    iget-boolean v2, v0, Landroidx/fragment/app/n;->G:Z

    if-eqz v2, :cond_12

    iget v2, v0, Landroidx/fragment/app/n;->b:I

    if-ge v2, v7, :cond_12

    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_12
    const-string v2, "FragmentManager"

    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_13
    return v1
.end method

.method public final e()V
    .locals 7

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-boolean v0, v1, Landroidx/fragment/app/n;->K:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v0, v2}, Lv0/r;->k(Z)V

    iget-object v4, v1, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    iget-object v5, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v5}, Landroidx/fragment/app/B;->I()V

    iput v3, v1, Landroidx/fragment/app/n;->b:I

    iput-boolean v2, v1, Landroidx/fragment/app/n;->D:Z

    iget-object v5, v1, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    new-instance v6, Landroidx/fragment/app/Fragment$5;

    invoke-direct {v6, v1}, Landroidx/fragment/app/Fragment$5;-><init>(Landroidx/fragment/app/n;)V

    invoke-virtual {v5, v6}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    iget-object v5, v1, Landroidx/fragment/app/n;->P:Landroidx/activity/l;

    invoke-virtual {v5, v4}, Landroidx/activity/l;->d(Landroid/os/Bundle;)V

    invoke-virtual {v1, v4}, Landroidx/fragment/app/n;->l(Landroid/os/Bundle;)V

    iput-boolean v3, v1, Landroidx/fragment/app/n;->K:Z

    iget-boolean v3, v1, Landroidx/fragment/app/n;->D:Z

    if-eqz v3, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    sget-object v3, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    invoke-virtual {v1, v3}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    invoke-virtual {v0, v2}, Lv0/r;->e(Z)V

    goto :goto_0

    :cond_1
    new-instance v0, Landroidx/fragment/app/U;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onCreate()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    const-string v4, "android:support:fragments"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v4, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v4, v0}, Landroidx/fragment/app/B;->N(Landroid/os/Parcelable;)V

    iget-object v0, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iput-boolean v2, v0, Landroidx/fragment/app/B;->y:Z

    iput-boolean v2, v0, Landroidx/fragment/app/B;->z:Z

    iget-object v4, v0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v2, v4, Landroidx/fragment/app/D;->h:Z

    invoke-virtual {v0, v3}, Landroidx/fragment/app/B;->s(I)V

    :cond_3
    iput v3, v1, Landroidx/fragment/app/n;->b:I

    :goto_0
    return-void
.end method

.method public final f()V
    .locals 7

    iget-object v0, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-boolean v1, v0, Landroidx/fragment/app/n;->n:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x3

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->p(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget-object v3, v0, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget v3, v0, Landroidx/fragment/app/n;->x:I

    if-eqz v3, :cond_5

    const/4 v4, -0x1

    if-eq v3, v4, :cond_4

    iget-object v4, v0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    iget-object v4, v4, Landroidx/fragment/app/B;->o:Lv0/f;

    invoke-virtual {v4, v3}, Lv0/f;->C(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    if-nez v3, :cond_6

    iget-boolean v4, v0, Landroidx/fragment/app/n;->p:Z

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/n;->w()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, v0, Landroidx/fragment/app/n;->x:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "unknown"

    :goto_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "No view found for id 0x"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v0, Landroidx/fragment/app/n;->x:I

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") for fragment "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot create fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for a container view with no id"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    const/4 v3, 0x0

    :cond_6
    :goto_1
    iput-object v3, v0, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    iget-object v4, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v3, v4}, Landroidx/fragment/app/n;->u(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    const/4 v4, 0x2

    if-eqz v1, :cond_b

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    const v6, 0x7f0800ad

    invoke-virtual {v1, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Landroidx/fragment/app/G;->b()V

    :cond_7
    iget-boolean v1, v0, Landroidx/fragment/app/n;->z:Z

    if-eqz v1, :cond_8

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    sget-object v3, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, LJ/E;->b(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-static {v1}, LJ/F;->c(Landroid/view/View;)V

    goto :goto_2

    :cond_9
    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    new-instance v3, LX0/n;

    const/4 v6, 0x1

    invoke-direct {v3, v6, v1}, LX0/n;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_2
    iget-object v1, v0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v1, v4}, Landroidx/fragment/app/B;->s(I)V

    iget-object v1, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v1, v5}, Lv0/r;->p(Z)V

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    iget-object v3, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    move-result v3

    invoke-virtual {v0}, Landroidx/fragment/app/n;->f()Landroidx/fragment/app/m;

    move-result-object v5

    iput v3, v5, Landroidx/fragment/app/m;->j:F

    iget-object v3, v0, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v3, :cond_b

    if-nez v1, :cond_b

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Landroidx/fragment/app/n;->f()Landroidx/fragment/app/m;

    move-result-object v3

    iput-object v1, v3, Landroidx/fragment/app/m;->k:Landroid/view/View;

    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_a
    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_b
    iput v4, v0, Landroidx/fragment/app/n;->b:I

    return-void
.end method

.method public final g()V
    .locals 10

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    iget-object v3, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v2, :cond_0

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-boolean v2, v3, Landroidx/fragment/app/n;->m:Z

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    iget v2, v3, Landroidx/fragment/app/n;->r:I

    if-lez v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v5

    goto :goto_1

    :cond_2
    :goto_0
    move v2, v4

    :goto_1
    iget-object v6, p0, Landroidx/fragment/app/G;->b:Lv0/m;

    if-nez v2, :cond_6

    iget-object v7, v6, Lv0/m;->e:Ljava/lang/Object;

    check-cast v7, Landroidx/fragment/app/D;

    iget-object v8, v7, Landroidx/fragment/app/D;->c:Ljava/util/HashMap;

    iget-object v9, v3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_2

    :cond_3
    iget-boolean v8, v7, Landroidx/fragment/app/D;->f:Z

    if-eqz v8, :cond_6

    iget-boolean v7, v7, Landroidx/fragment/app/D;->g:Z

    if-eqz v7, :cond_4

    goto :goto_2

    :cond_4
    iget-object v0, v3, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {v6, v0}, Lv0/m;->k(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-boolean v1, v0, Landroidx/fragment/app/n;->B:Z

    if-eqz v1, :cond_5

    iput-object v0, v3, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    :cond_5
    iput v4, v3, Landroidx/fragment/app/n;->b:I

    goto/16 :goto_5

    :cond_6
    :goto_2
    iget-object v7, v3, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    instance-of v8, v7, Landroidx/lifecycle/P;

    if-eqz v8, :cond_7

    iget-object v7, v6, Lv0/m;->e:Ljava/lang/Object;

    check-cast v7, Landroidx/fragment/app/D;

    iget-boolean v7, v7, Landroidx/fragment/app/D;->g:Z

    goto :goto_3

    :cond_7
    iget-object v7, v7, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    instance-of v8, v7, Landroid/app/Activity;

    if-eqz v8, :cond_8

    check-cast v7, Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v7

    xor-int/2addr v7, v5

    goto :goto_3

    :cond_8
    move v7, v5

    :goto_3
    if-nez v2, :cond_9

    if-eqz v7, :cond_c

    :cond_9
    iget-object v2, v6, Lv0/m;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/D;

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_a
    iget-object v0, v2, Landroidx/fragment/app/D;->d:Ljava/util/HashMap;

    iget-object v1, v3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/D;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroidx/fragment/app/D;->a()V

    iget-object v1, v3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget-object v0, v2, Landroidx/fragment/app/D;->e:Ljava/util/HashMap;

    iget-object v1, v3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/O;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Landroidx/lifecycle/O;->a()V

    iget-object v1, v3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iget-object v0, v3, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->k()V

    iget-object v0, v3, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iput v4, v3, Landroidx/fragment/app/n;->b:I

    iput-boolean v4, v3, Landroidx/fragment/app/n;->K:Z

    iput-boolean v5, v3, Landroidx/fragment/app/n;->D:Z

    iget-object v0, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v0, v4}, Lv0/r;->g(Z)V

    invoke-virtual {v6}, Lv0/m;->m()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/G;

    if-eqz v1, :cond_d

    iget-object v2, v3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iget-object v1, v1, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-object v4, v1, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    iput-object v3, v1, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    const/4 v2, 0x0

    iput-object v2, v1, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    goto :goto_4

    :cond_e
    iget-object v0, v3, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    if-eqz v0, :cond_f

    invoke-virtual {v6, v0}, Lv0/m;->k(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v0

    iput-object v0, v3, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    :cond_f
    invoke-virtual {v6, p0}, Lv0/m;->D(Landroidx/fragment/app/G;)V

    :goto_5
    return-void
.end method

.method public final h()V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    iget-object v2, v1, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/n;->v()V

    iget-object v0, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lv0/r;->q(Z)V

    const/4 v0, 0x0

    iput-object v0, v1, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    iput-object v0, v1, Landroidx/fragment/app/n;->F:Landroid/view/View;

    iput-object v0, v1, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    iget-object v3, v1, Landroidx/fragment/app/n;->O:Landroidx/lifecycle/y;

    invoke-virtual {v3, v0}, Landroidx/lifecycle/y;->e(Ljava/lang/Object;)V

    iput-boolean v2, v1, Landroidx/fragment/app/n;->o:Z

    return-void
.end method

.method public final i()V
    .locals 8

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    iget-object v3, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v2, :cond_0

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    const/4 v2, -0x1

    iput v2, v3, Landroidx/fragment/app/n;->b:I

    const/4 v4, 0x0

    iput-boolean v4, v3, Landroidx/fragment/app/n;->D:Z

    invoke-virtual {v3}, Landroidx/fragment/app/n;->o()V

    iget-boolean v5, v3, Landroidx/fragment/app/n;->D:Z

    if-eqz v5, :cond_7

    iget-object v5, v3, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iget-boolean v6, v5, Landroidx/fragment/app/B;->A:Z

    if-nez v6, :cond_1

    invoke-virtual {v5}, Landroidx/fragment/app/B;->k()V

    new-instance v5, Landroidx/fragment/app/B;

    invoke-direct {v5}, Landroidx/fragment/app/B;-><init>()V

    iput-object v5, v3, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    :cond_1
    iget-object v5, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v5, v4}, Lv0/r;->h(Z)V

    iput v2, v3, Landroidx/fragment/app/n;->b:I

    const/4 v2, 0x0

    iput-object v2, v3, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    iput-object v2, v3, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/n;

    iput-object v2, v3, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    iget-boolean v5, v3, Landroidx/fragment/app/n;->m:Z

    if-eqz v5, :cond_2

    iget v5, v3, Landroidx/fragment/app/n;->r:I

    if-lez v5, :cond_4

    :cond_2
    iget-object v5, p0, Landroidx/fragment/app/G;->b:Lv0/m;

    iget-object v5, v5, Lv0/m;->e:Ljava/lang/Object;

    check-cast v5, Landroidx/fragment/app/D;

    iget-object v6, v5, Landroidx/fragment/app/D;->c:Ljava/util/HashMap;

    iget-object v7, v3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v6, v5, Landroidx/fragment/app/D;->f:Z

    if-eqz v6, :cond_4

    iget-boolean v5, v5, Landroidx/fragment/app/D;->g:Z

    if-eqz v5, :cond_6

    :cond_4
    :goto_0
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, v3}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, v3, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    new-instance v0, Landroidx/activity/l;

    invoke-direct {v0, v3}, Landroidx/activity/l;-><init>(Ld0/e;)V

    iput-object v0, v3, Landroidx/fragment/app/n;->P:Landroidx/activity/l;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iput-boolean v4, v3, Landroidx/fragment/app/n;->l:Z

    iput-boolean v4, v3, Landroidx/fragment/app/n;->m:Z

    iput-boolean v4, v3, Landroidx/fragment/app/n;->n:Z

    iput-boolean v4, v3, Landroidx/fragment/app/n;->o:Z

    iput-boolean v4, v3, Landroidx/fragment/app/n;->p:Z

    iput v4, v3, Landroidx/fragment/app/n;->r:I

    iput-object v2, v3, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    new-instance v0, Landroidx/fragment/app/B;

    invoke-direct {v0}, Landroidx/fragment/app/B;-><init>()V

    iput-object v0, v3, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iput-object v2, v3, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    iput v4, v3, Landroidx/fragment/app/n;->w:I

    iput v4, v3, Landroidx/fragment/app/n;->x:I

    iput-object v2, v3, Landroidx/fragment/app/n;->y:Ljava/lang/String;

    iput-boolean v4, v3, Landroidx/fragment/app/n;->z:Z

    iput-boolean v4, v3, Landroidx/fragment/app/n;->A:Z

    :cond_6
    return-void

    :cond_7
    new-instance v0, Landroidx/fragment/app/U;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-boolean v1, v0, Landroidx/fragment/app/n;->n:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Landroidx/fragment/app/n;->o:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Landroidx/fragment/app/n;->q:Z

    if-nez v1, :cond_2

    const-string v1, "FragmentManager"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/n;->p(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/fragment/app/n;->u(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    const v3, 0x7f0800ad

    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-boolean v1, v0, Landroidx/fragment/app/n;->z:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Landroidx/fragment/app/B;->s(I)V

    iget-object v1, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v1, v2}, Lv0/r;->p(Z)V

    iput v3, v0, Landroidx/fragment/app/n;->b:I

    :cond_2
    return-void
.end method

.method public final k()V
    .locals 8

    iget-boolean v0, p0, Landroidx/fragment/app/G;->d:Z

    const-string v1, "FragmentManager"

    const/4 v2, 0x2

    iget-object v3, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v0, :cond_1

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x1

    const/4 v4, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/G;->d:Z

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/G;->d()I

    move-result v5

    iget v6, v3, Landroidx/fragment/app/n;->b:I

    const/4 v7, 0x3

    if-eq v5, v6, :cond_9

    if-le v5, v6, :cond_4

    add-int/lit8 v6, v6, 0x1

    packed-switch v6, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Landroidx/fragment/app/G;->n()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :pswitch_1
    const/4 v5, 0x6

    iput v5, v3, Landroidx/fragment/app/n;->b:I

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/G;->p()V

    goto :goto_0

    :pswitch_3
    iget-object v5, v3, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v5, :cond_3

    iget-object v5, v3, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v5, :cond_3

    invoke-virtual {v3}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/fragment/app/B;->C()LU0/e;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/fragment/app/g;->g(Landroid/view/ViewGroup;LU0/e;)Landroidx/fragment/app/g;

    move-result-object v5

    iget-object v6, v3, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v6

    invoke-static {v6}, LX/d;->b(I)I

    move-result v6

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    invoke-virtual {v5, v6, v2, p0}, Landroidx/fragment/app/g;->b(IILandroidx/fragment/app/G;)V

    :cond_3
    const/4 v5, 0x4

    iput v5, v3, Landroidx/fragment/app/n;->b:I

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/G;->a()V

    goto :goto_0

    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/G;->j()V

    invoke-virtual {p0}, Landroidx/fragment/app/G;->f()V

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/G;->e()V

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/G;->c()V

    goto :goto_0

    :cond_4
    add-int/lit8 v6, v6, -0x1

    packed-switch v6, :pswitch_data_1

    goto :goto_0

    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/G;->l()V

    goto :goto_0

    :pswitch_9
    const/4 v5, 0x5

    iput v5, v3, Landroidx/fragment/app/n;->b:I

    goto :goto_0

    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/G;->q()V

    goto :goto_0

    :pswitch_b
    invoke-static {v1, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    iget-object v5, v3, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v5, :cond_6

    iget-object v5, v3, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    if-nez v5, :cond_6

    invoke-virtual {p0}, Landroidx/fragment/app/G;->o()V

    :cond_6
    iget-object v5, v3, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v5, :cond_8

    iget-object v5, v3, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v5, :cond_8

    invoke-virtual {v3}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/fragment/app/B;->C()LU0/e;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/fragment/app/g;->g(Landroid/view/ViewGroup;LU0/e;)Landroidx/fragment/app/g;

    move-result-object v5

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_7
    invoke-virtual {v5, v0, v7, p0}, Landroidx/fragment/app/g;->b(IILandroidx/fragment/app/G;)V

    :cond_8
    iput v7, v3, Landroidx/fragment/app/n;->b:I

    goto/16 :goto_0

    :pswitch_c
    iput-boolean v4, v3, Landroidx/fragment/app/n;->o:Z

    iput v2, v3, Landroidx/fragment/app/n;->b:I

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/G;->h()V

    iput v0, v3, Landroidx/fragment/app/n;->b:I

    goto/16 :goto_0

    :pswitch_e
    invoke-virtual {p0}, Landroidx/fragment/app/G;->g()V

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/G;->i()V

    goto/16 :goto_0

    :cond_9
    iget-boolean v5, v3, Landroidx/fragment/app/n;->J:Z

    if-eqz v5, :cond_f

    iget-object v5, v3, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v5, :cond_d

    iget-object v5, v3, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v5, :cond_d

    invoke-virtual {v3}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/fragment/app/B;->C()LU0/e;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/fragment/app/g;->g(Landroid/view/ViewGroup;LU0/e;)Landroidx/fragment/app/g;

    move-result-object v5

    iget-boolean v6, v3, Landroidx/fragment/app/n;->z:Z

    if-eqz v6, :cond_b

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_a
    invoke-virtual {v5, v7, v0, p0}, Landroidx/fragment/app/g;->b(IILandroidx/fragment/app/G;)V

    goto :goto_1

    :cond_b
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_c
    invoke-virtual {v5, v2, v0, p0}, Landroidx/fragment/app/g;->b(IILandroidx/fragment/app/G;)V

    :cond_d
    :goto_1
    iget-object v1, v3, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-eqz v1, :cond_e

    iget-boolean v2, v3, Landroidx/fragment/app/n;->l:Z

    if-eqz v2, :cond_e

    invoke-static {v3}, Landroidx/fragment/app/B;->E(Landroidx/fragment/app/n;)Z

    move-result v2

    if-eqz v2, :cond_e

    iput-boolean v0, v1, Landroidx/fragment/app/B;->x:Z

    :cond_e
    iput-boolean v4, v3, Landroidx/fragment/app/n;->J:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_f
    iput-boolean v4, p0, Landroidx/fragment/app/G;->d:Z

    return-void

    :goto_2
    iput-boolean v4, p0, Landroidx/fragment/app/G;->d:Z

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final l()V
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Landroidx/fragment/app/B;->s(I)V

    iget-object v0, v1, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, v1, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    sget-object v2, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/P;->e(Landroidx/lifecycle/l;)V

    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    sget-object v2, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    invoke-virtual {v0, v2}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    const/4 v0, 0x6

    iput v0, v1, Landroidx/fragment/app/n;->b:I

    const/4 v0, 0x1

    iput-boolean v0, v1, Landroidx/fragment/app/n;->D:Z

    iget-object v0, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lv0/r;->i(Z)V

    return-void
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-object v1, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object p1, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    iget-object p1, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    const-string v1, "android:view_registry_state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    iget-object p1, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p1, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    const-string v1, "android:target_req_state"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, v0, Landroidx/fragment/app/n;->j:I

    :cond_1
    iget-object p1, v0, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    const-string v1, "android:user_visible_hint"

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Landroidx/fragment/app/n;->H:Z

    if-nez p1, :cond_2

    iput-boolean v2, v0, Landroidx/fragment/app/n;->G:Z

    :cond_2
    return-void
.end method

.method public final n()V
    .locals 6

    const/4 v0, 0x3

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v2, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v2, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    const/4 v3, 0x0

    if-nez v0, :cond_1

    move-object v0, v3

    goto :goto_0

    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/m;->k:Landroid/view/View;

    :goto_0
    if-eqz v0, :cond_4

    iget-object v4, v2, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-ne v0, v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    :goto_1
    if-eqz v4, :cond_4

    iget-object v5, v2, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-ne v4, v5, :cond_3

    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const/4 v4, 0x2

    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object v0, v2, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_3

    :cond_3
    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    goto :goto_1

    :cond_4
    :goto_3
    invoke-virtual {v2}, Landroidx/fragment/app/n;->f()Landroidx/fragment/app/m;

    move-result-object v0

    iput-object v3, v0, Landroidx/fragment/app/m;->k:Landroid/view/View;

    iget-object v0, v2, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->I()V

    iget-object v0, v2, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/B;->w(Z)Z

    const/4 v0, 0x7

    iput v0, v2, Landroidx/fragment/app/n;->b:I

    iput-boolean v1, v2, Landroidx/fragment/app/n;->D:Z

    iget-object v1, v2, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    sget-object v4, Landroidx/lifecycle/l;->ON_RESUME:Landroidx/lifecycle/l;

    invoke-virtual {v1, v4}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iget-object v1, v2, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v1, :cond_5

    iget-object v1, v2, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    iget-object v1, v1, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    invoke-virtual {v1, v4}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    :cond_5
    iget-object v1, v2, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    const/4 v4, 0x0

    iput-boolean v4, v1, Landroidx/fragment/app/B;->y:Z

    iput-boolean v4, v1, Landroidx/fragment/app/B;->z:Z

    iget-object v5, v1, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v4, v5, Landroidx/fragment/app/D;->h:Z

    invoke-virtual {v1, v0}, Landroidx/fragment/app/B;->s(I)V

    iget-object v0, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v0, v4}, Lv0/r;->l(Z)V

    iput-object v3, v2, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    iput-object v3, v2, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    iput-object v3, v2, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    return-void
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-object v1, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-nez v1, :cond_0

    return-void

    :cond_0
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iget-object v2, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-lez v2, :cond_1

    iput-object v1, v0, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    :cond_1
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    iget-object v2, v2, Landroidx/fragment/app/P;->d:Landroidx/activity/l;

    invoke-virtual {v2, v1}, Landroidx/activity/l;->e(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iput-object v1, v0, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    :cond_2
    return-void
.end method

.method public final p()V
    .locals 5

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->I()V

    iget-object v0, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroidx/fragment/app/B;->w(Z)Z

    const/4 v0, 0x5

    iput v0, v1, Landroidx/fragment/app/n;->b:I

    const/4 v2, 0x0

    iput-boolean v2, v1, Landroidx/fragment/app/n;->D:Z

    invoke-virtual {v1}, Landroidx/fragment/app/n;->r()V

    iget-boolean v3, v1, Landroidx/fragment/app/n;->D:Z

    if-eqz v3, :cond_2

    iget-object v3, v1, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    sget-object v4, Landroidx/lifecycle/l;->ON_START:Landroidx/lifecycle/l;

    invoke-virtual {v3, v4}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iget-object v3, v1, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v3, :cond_1

    iget-object v3, v1, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    iget-object v3, v3, Landroidx/fragment/app/P;->c:Landroidx/lifecycle/t;

    invoke-virtual {v3, v4}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iput-boolean v2, v1, Landroidx/fragment/app/B;->y:Z

    iput-boolean v2, v1, Landroidx/fragment/app/B;->z:Z

    iget-object v3, v1, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v2, v3, Landroidx/fragment/app/D;->h:Z

    invoke-virtual {v1, v0}, Landroidx/fragment/app/B;->s(I)V

    iget-object v0, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v0, v2}, Lv0/r;->n(Z)V

    return-void

    :cond_2
    new-instance v0, Landroidx/fragment/app/U;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onStart()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q()V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroidx/fragment/app/B;->z:Z

    iget-object v3, v0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v2, v3, Landroidx/fragment/app/D;->h:Z

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroidx/fragment/app/B;->s(I)V

    iget-object v0, v1, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, v1, Landroidx/fragment/app/n;->N:Landroidx/fragment/app/P;

    sget-object v3, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v0, v3}, Landroidx/fragment/app/P;->e(Landroidx/lifecycle/l;)V

    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/n;->M:Landroidx/lifecycle/t;

    sget-object v3, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v0, v3}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iput v2, v1, Landroidx/fragment/app/n;->b:I

    const/4 v0, 0x0

    iput-boolean v0, v1, Landroidx/fragment/app/n;->D:Z

    invoke-virtual {v1}, Landroidx/fragment/app/n;->s()V

    iget-boolean v2, v1, Landroidx/fragment/app/n;->D:Z

    if-eqz v2, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v1, v0}, Lv0/r;->o(Z)V

    return-void

    :cond_2
    new-instance v0, Landroidx/fragment/app/U;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onStop()"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
