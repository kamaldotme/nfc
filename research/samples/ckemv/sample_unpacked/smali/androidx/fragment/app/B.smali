.class public final Landroidx/fragment/app/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public C:Ljava/util/ArrayList;

.field public D:Ljava/util/ArrayList;

.field public E:Ljava/util/ArrayList;

.field public F:Landroidx/fragment/app/D;

.field public final G:LF0/h;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Lv0/m;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Landroidx/fragment/app/t;

.field public g:Landroidx/activity/u;

.field public final h:Landroidx/fragment/app/v;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Lv0/r;

.field public final l:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public m:I

.field public n:Landroidx/fragment/app/q;

.field public o:Lv0/f;

.field public p:Landroidx/fragment/app/n;

.field public q:Landroidx/fragment/app/n;

.field public final r:Landroidx/fragment/app/w;

.field public final s:LU0/e;

.field public t:Landroidx/activity/result/d;

.field public u:Landroidx/activity/result/d;

.field public v:Landroidx/activity/result/d;

.field public w:Ljava/util/ArrayDeque;

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    new-instance v0, Lv0/m;

    invoke-direct {v0}, Lv0/m;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    new-instance v0, Landroidx/fragment/app/t;

    invoke-direct {v0, p0}, Landroidx/fragment/app/t;-><init>(Landroidx/fragment/app/B;)V

    iput-object v0, p0, Landroidx/fragment/app/B;->f:Landroidx/fragment/app/t;

    new-instance v0, Landroidx/fragment/app/v;

    invoke-direct {v0, p0}, Landroidx/fragment/app/v;-><init>(Landroidx/fragment/app/B;)V

    iput-object v0, p0, Landroidx/fragment/app/B;->h:Landroidx/fragment/app/v;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/B;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/B;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, LU0/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1, p0}, LU0/e;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lv0/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, v0, Lv0/r;->b:Ljava/lang/Object;

    iput-object p0, v0, Lv0/r;->c:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/fragment/app/B;->k:Lv0/r;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/B;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/B;->m:I

    new-instance v0, Landroidx/fragment/app/w;

    invoke-direct {v0, p0}, Landroidx/fragment/app/w;-><init>(Landroidx/fragment/app/B;)V

    iput-object v0, p0, Landroidx/fragment/app/B;->r:Landroidx/fragment/app/w;

    new-instance v0, LU0/e;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, LU0/e;-><init>(I)V

    iput-object v0, p0, Landroidx/fragment/app/B;->s:LU0/e;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/B;->w:Ljava/util/ArrayDeque;

    new-instance v0, LF0/h;

    const/16 v1, 0xb

    invoke-direct {v0, v1, p0}, LF0/h;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/fragment/app/B;->G:LF0/h;

    return-void
.end method

.method public static E(Landroidx/fragment/app/n;)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    iget-object p0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {p0}, Lv0/m;->n()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/n;

    if-eqz v2, :cond_1

    invoke-static {v2}, Landroidx/fragment/app/B;->E(Landroidx/fragment/app/n;)Z

    move-result v1

    :cond_1
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public static F(Landroidx/fragment/app/n;)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    iget-boolean v1, p0, Landroidx/fragment/app/n;->C:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-eqz v1, :cond_2

    iget-object p0, p0, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/n;

    invoke-static {p0}, Landroidx/fragment/app/B;->F(Landroidx/fragment/app/n;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return v0
.end method

.method public static G(Landroidx/fragment/app/n;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    iget-object v2, v1, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    invoke-virtual {p0, v2}, Landroidx/fragment/app/n;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, v1, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    invoke-static {p0}, Landroidx/fragment/app/B;->G(Landroidx/fragment/app/n;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final A(Landroidx/fragment/app/n;)Landroid/view/ViewGroup;
    .locals 2

    iget-object v0, p1, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget v0, p1, Landroidx/fragment/app/n;->x:I

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/B;->o:Lv0/f;

    invoke-virtual {v0}, Lv0/f;->F()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/B;->o:Lv0/f;

    iget p1, p1, Landroidx/fragment/app/n;->x:I

    invoke-virtual {v0, p1}, Lv0/f;->C(I)Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_2
    return-object v1
.end method

.method public final B()Landroidx/fragment/app/w;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->B()Landroidx/fragment/app/w;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/B;->r:Landroidx/fragment/app/w;

    return-object v0
.end method

.method public final C()LU0/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Landroidx/fragment/app/B;->C()LU0/e;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/B;->s:LU0/e;

    return-object v0
.end method

.method public final D(Landroidx/fragment/app/n;)V
    .locals 2

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/n;->z:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/n;->z:Z

    iget-boolean v1, p1, Landroidx/fragment/app/n;->J:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Landroidx/fragment/app/n;->J:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/B;->T(Landroidx/fragment/app/n;)V

    :cond_1
    return-void
.end method

.method public final H(IZ)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    iget p2, p0, Landroidx/fragment/app/B;->m:I

    if-ne p1, p2, :cond_2

    return-void

    :cond_2
    iput p1, p0, Landroidx/fragment/app/B;->m:I

    iget-object p1, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object p2, p1, Lv0/m;->c:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    iget-object v1, p1, Lv0/m;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/n;

    iget-object v0, v0, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/G;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/fragment/app/G;->k()V

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/G;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroidx/fragment/app/G;->k()V

    iget-object v1, v0, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-boolean v2, v1, Landroidx/fragment/app/n;->m:Z

    if-eqz v2, :cond_5

    iget v1, v1, Landroidx/fragment/app/n;->r:I

    if-lez v1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1, v0}, Lv0/m;->D(Landroidx/fragment/app/G;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/B;->U()V

    iget-boolean p1, p0, Landroidx/fragment/app/B;->x:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    if-eqz p1, :cond_8

    iget p2, p0, Landroidx/fragment/app/B;->m:I

    const/4 v0, 0x7

    if-ne p2, v0, :cond_8

    iget-object p1, p1, Landroidx/fragment/app/q;->h:Lf/g;

    invoke-virtual {p1}, Lf/g;->k()Lf/k;

    move-result-object p1

    invoke-virtual {p1}, Lf/k;->a()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/B;->x:Z

    :cond_8
    return-void
.end method

.method public final I()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/B;->y:Z

    iput-boolean v0, p0, Landroidx/fragment/app/B;->z:Z

    iget-object v1, p0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v0, v1, Landroidx/fragment/app/D;->h:Z

    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n;

    if-eqz v1, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v1}, Landroidx/fragment/app/B;->I()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final J()Z
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/B;->w(Z)Z

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/B;->v(Z)V

    iget-object v2, p0, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/fragment/app/n;->g()Landroidx/fragment/app/B;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/B;->J()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/B;->C:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/B;->D:Ljava/util/ArrayList;

    const/4 v4, -0x1

    invoke-virtual {p0, v2, v3, v4, v0}, Landroidx/fragment/app/B;->K(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result v2

    if-eqz v2, :cond_1

    iput-boolean v1, p0, Landroidx/fragment/app/B;->b:Z

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/B;->C:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/B;->D:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v3}, Landroidx/fragment/app/B;->M(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/fragment/app/B;->d()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Landroidx/fragment/app/B;->d()V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/B;->V()V

    iget-boolean v1, p0, Landroidx/fragment/app/B;->B:Z

    if-eqz v1, :cond_2

    iput-boolean v0, p0, Landroidx/fragment/app/B;->B:Z

    invoke-virtual {p0}, Landroidx/fragment/app/B;->U()V

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object v0, v0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move v1, v2

    :goto_1
    return v1
.end method

.method public final K(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-gez p3, :cond_2

    and-int/lit8 v3, p4, 0x1

    if-nez v3, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v2

    if-gez p3, :cond_1

    return v1

    :cond_1
    iget-object p4, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_2
    if-ltz p3, :cond_6

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v2

    :goto_0
    if-ltz v0, :cond_4

    iget-object v3, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    if-ltz p3, :cond_3

    iget v3, v3, Landroidx/fragment/app/a;->r:I

    if-ne p3, v3, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    :goto_1
    if-gez v0, :cond_5

    return v1

    :cond_5
    and-int/2addr p4, v2

    if-eqz p4, :cond_7

    :goto_2
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_7

    iget-object p4, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/fragment/app/a;

    if-ltz p3, :cond_7

    iget p4, p4, Landroidx/fragment/app/a;->r:I

    if-ne p3, p4, :cond_7

    goto :goto_2

    :cond_6
    const/4 v0, -0x1

    :cond_7
    iget-object p3, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v2

    if-ne v0, p3, :cond_8

    return v1

    :cond_8
    iget-object p3, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v2

    :goto_3
    if-le p3, v0, :cond_9

    iget-object p4, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, -0x1

    goto :goto_3

    :cond_9
    :goto_4
    return v2
.end method

.method public final L(Landroidx/fragment/app/n;)V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget v0, p1, Landroidx/fragment/app/n;->r:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    xor-int/2addr v0, v2

    iget-boolean v3, p1, Landroidx/fragment/app/n;->A:Z

    if-eqz v3, :cond_2

    if-eqz v0, :cond_4

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object v3, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v0, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p1, Landroidx/fragment/app/n;->l:Z

    invoke-static {p1}, Landroidx/fragment/app/B;->E(Landroidx/fragment/app/n;)Z

    move-result v0

    if-eqz v0, :cond_3

    iput-boolean v2, p0, Landroidx/fragment/app/B;->x:Z

    :cond_3
    iput-boolean v2, p1, Landroidx/fragment/app/n;->m:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/B;->T(Landroidx/fragment/app/n;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final M(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-virtual {p0, p1, p2, v2, v1}, Landroidx/fragment/app/B;->x(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Landroidx/fragment/app/B;->x(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-virtual {p0, p1, p2, v2, v0}, Landroidx/fragment/app/B;->x(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final N(Landroid/os/Parcelable;)V
    .locals 17

    move-object/from16 v0, p0

    if-nez p1, :cond_0

    return-void

    :cond_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/fragment/app/C;

    iget-object v2, v1, Landroidx/fragment/app/C;->b:Ljava/util/ArrayList;

    if-nez v2, :cond_1

    return-void

    :cond_1
    iget-object v2, v0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object v3, v2, Lv0/m;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    iget-object v3, v1, Landroidx/fragment/app/C;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x2

    iget-object v6, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    const-string v7, "FragmentManager"

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Landroidx/fragment/app/F;

    if-eqz v13, :cond_2

    iget-object v4, v0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iget-object v4, v4, Landroidx/fragment/app/D;->c:Ljava/util/HashMap;

    iget-object v8, v13, Landroidx/fragment/app/F;->c:Ljava/lang/String;

    invoke-virtual {v4, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/n;

    if-eqz v4, :cond_4

    invoke-static {v7, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v4}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_3
    new-instance v8, Landroidx/fragment/app/G;

    invoke-direct {v8, v6, v2, v4, v13}, Landroidx/fragment/app/G;-><init>(Lv0/r;Lv0/m;Landroidx/fragment/app/n;Landroidx/fragment/app/F;)V

    goto :goto_1

    :cond_4
    new-instance v4, Landroidx/fragment/app/G;

    iget-object v6, v0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v6, v6, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/B;->B()Landroidx/fragment/app/w;

    move-result-object v12

    iget-object v9, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    iget-object v10, v0, Landroidx/fragment/app/B;->c:Lv0/m;

    move-object v8, v4

    invoke-direct/range {v8 .. v13}, Landroidx/fragment/app/G;-><init>(Lv0/r;Lv0/m;Ljava/lang/ClassLoader;Landroidx/fragment/app/w;Landroidx/fragment/app/F;)V

    :goto_1
    iget-object v4, v8, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iput-object v0, v4, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    invoke-static {v7, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v4}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_5
    iget-object v4, v0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v4, v4, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v8, v4}, Landroidx/fragment/app/G;->m(Ljava/lang/ClassLoader;)V

    invoke-virtual {v2, v8}, Lv0/m;->C(Landroidx/fragment/app/G;)V

    iget v4, v0, Landroidx/fragment/app/B;->m:I

    iput v4, v8, Landroidx/fragment/app/G;->e:I

    goto :goto_0

    :cond_6
    iget-object v3, v0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v3, v3, Landroidx/fragment/app/D;->c:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v9, 0x1

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/n;

    iget-object v10, v4, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iget-object v11, v2, Lv0/m;->d:Ljava/lang/Object;

    check-cast v11, Ljava/util/HashMap;

    invoke-virtual {v11, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_8

    move v8, v9

    goto :goto_3

    :cond_8
    const/4 v8, 0x0

    :goto_3
    if-nez v8, :cond_7

    invoke-static {v7, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v4}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    iget-object v8, v1, Landroidx/fragment/app/C;->b:Ljava/util/ArrayList;

    invoke-static {v8}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_9
    iget-object v8, v0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    invoke-virtual {v8, v4}, Landroidx/fragment/app/D;->b(Landroidx/fragment/app/n;)V

    iput-object v0, v4, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    new-instance v8, Landroidx/fragment/app/G;

    invoke-direct {v8, v6, v2, v4}, Landroidx/fragment/app/G;-><init>(Lv0/r;Lv0/m;Landroidx/fragment/app/n;)V

    iput v9, v8, Landroidx/fragment/app/G;->e:I

    invoke-virtual {v8}, Landroidx/fragment/app/G;->k()V

    iput-boolean v9, v4, Landroidx/fragment/app/n;->m:Z

    invoke-virtual {v8}, Landroidx/fragment/app/G;->k()V

    goto :goto_2

    :cond_a
    iget-object v3, v1, Landroidx/fragment/app/C;->c:Ljava/util/ArrayList;

    iget-object v4, v2, Lv0/m;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    if-eqz v3, :cond_d

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Lv0/m;->k(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v6

    if-eqz v6, :cond_c

    invoke-static {v7, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v6}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_b
    invoke-virtual {v2, v6}, Lv0/m;->a(Landroidx/fragment/app/n;)V

    goto :goto_4

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No instantiated fragment for ("

    const-string v3, ")"

    invoke-static {v2, v4, v3}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    iget-object v3, v1, Landroidx/fragment/app/C;->d:[Landroidx/fragment/app/b;

    const/4 v4, 0x0

    if-eqz v3, :cond_13

    new-instance v3, Ljava/util/ArrayList;

    iget-object v6, v1, Landroidx/fragment/app/C;->d:[Landroidx/fragment/app/b;

    array-length v6, v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, v0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    const/4 v3, 0x0

    :goto_5
    iget-object v6, v1, Landroidx/fragment/app/C;->d:[Landroidx/fragment/app/b;

    array-length v10, v6

    if-ge v3, v10, :cond_12

    aget-object v6, v6, v3

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Landroidx/fragment/app/a;

    invoke-direct {v10, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/B;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_6
    iget-object v13, v6, Landroidx/fragment/app/b;->b:[I

    array-length v14, v13

    if-ge v11, v14, :cond_10

    new-instance v14, Landroidx/fragment/app/H;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    add-int/lit8 v15, v11, 0x1

    aget v8, v13, v11

    iput v8, v14, Landroidx/fragment/app/H;->a:I

    invoke-static {v7, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-virtual {v10}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    aget v8, v13, v15

    :cond_e
    iget-object v8, v6, Landroidx/fragment/app/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_f

    invoke-virtual {v2, v8}, Lv0/m;->k(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v8

    iput-object v8, v14, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    goto :goto_7

    :cond_f
    iput-object v4, v14, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    :goto_7
    invoke-static {}, Landroidx/lifecycle/m;->values()[Landroidx/lifecycle/m;

    move-result-object v8

    iget-object v4, v6, Landroidx/fragment/app/b;->d:[I

    aget v4, v4, v12

    aget-object v4, v8, v4

    iput-object v4, v14, Landroidx/fragment/app/H;->g:Landroidx/lifecycle/m;

    invoke-static {}, Landroidx/lifecycle/m;->values()[Landroidx/lifecycle/m;

    move-result-object v4

    iget-object v8, v6, Landroidx/fragment/app/b;->e:[I

    aget v8, v8, v12

    aget-object v4, v4, v8

    iput-object v4, v14, Landroidx/fragment/app/H;->h:Landroidx/lifecycle/m;

    add-int/lit8 v4, v11, 0x2

    aget v8, v13, v15

    iput v8, v14, Landroidx/fragment/app/H;->c:I

    add-int/lit8 v15, v11, 0x3

    aget v4, v13, v4

    iput v4, v14, Landroidx/fragment/app/H;->d:I

    add-int/lit8 v16, v11, 0x4

    aget v15, v13, v15

    iput v15, v14, Landroidx/fragment/app/H;->e:I

    add-int/lit8 v11, v11, 0x5

    aget v13, v13, v16

    iput v13, v14, Landroidx/fragment/app/H;->f:I

    iput v8, v10, Landroidx/fragment/app/a;->b:I

    iput v4, v10, Landroidx/fragment/app/a;->c:I

    iput v15, v10, Landroidx/fragment/app/a;->d:I

    iput v13, v10, Landroidx/fragment/app/a;->e:I

    invoke-virtual {v10, v14}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/H;)V

    add-int/lit8 v12, v12, 0x1

    const/4 v4, 0x0

    goto :goto_6

    :cond_10
    iget v4, v6, Landroidx/fragment/app/b;->f:I

    iput v4, v10, Landroidx/fragment/app/a;->f:I

    iget-object v4, v6, Landroidx/fragment/app/b;->g:Ljava/lang/String;

    iput-object v4, v10, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    iget v4, v6, Landroidx/fragment/app/b;->h:I

    iput v4, v10, Landroidx/fragment/app/a;->r:I

    iput-boolean v9, v10, Landroidx/fragment/app/a;->g:Z

    iget v4, v6, Landroidx/fragment/app/b;->i:I

    iput v4, v10, Landroidx/fragment/app/a;->i:I

    iget-object v4, v6, Landroidx/fragment/app/b;->j:Ljava/lang/CharSequence;

    iput-object v4, v10, Landroidx/fragment/app/a;->j:Ljava/lang/CharSequence;

    iget v4, v6, Landroidx/fragment/app/b;->k:I

    iput v4, v10, Landroidx/fragment/app/a;->k:I

    iget-object v4, v6, Landroidx/fragment/app/b;->l:Ljava/lang/CharSequence;

    iput-object v4, v10, Landroidx/fragment/app/a;->l:Ljava/lang/CharSequence;

    iget-object v4, v6, Landroidx/fragment/app/b;->m:Ljava/util/ArrayList;

    iput-object v4, v10, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    iget-object v4, v6, Landroidx/fragment/app/b;->n:Ljava/util/ArrayList;

    iput-object v4, v10, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    iget-boolean v4, v6, Landroidx/fragment/app/b;->o:Z

    iput-boolean v4, v10, Landroidx/fragment/app/a;->o:Z

    invoke-virtual {v10, v9}, Landroidx/fragment/app/a;->c(I)V

    invoke-static {v7, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v10}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    new-instance v4, Landroidx/fragment/app/Q;

    invoke-direct {v4}, Landroidx/fragment/app/Q;-><init>()V

    new-instance v6, Ljava/io/PrintWriter;

    invoke-direct {v6, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v4, "  "

    const/4 v8, 0x0

    invoke-virtual {v10, v4, v6, v8}, Landroidx/fragment/app/a;->e(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    invoke-virtual {v6}, Ljava/io/PrintWriter;->close()V

    goto :goto_8

    :cond_11
    const/4 v8, 0x0

    :goto_8
    iget-object v4, v0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    goto/16 :goto_5

    :cond_12
    const/4 v8, 0x0

    goto :goto_9

    :cond_13
    move-object v3, v4

    const/4 v8, 0x0

    iput-object v3, v0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    :goto_9
    iget-object v3, v0, Landroidx/fragment/app/B;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v4, v1, Landroidx/fragment/app/C;->e:I

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v3, v1, Landroidx/fragment/app/C;->f:Ljava/lang/String;

    if-eqz v3, :cond_14

    invoke-virtual {v2, v3}, Lv0/m;->k(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v2

    iput-object v2, v0, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/B;->p(Landroidx/fragment/app/n;)V

    :cond_14
    iget-object v2, v1, Landroidx/fragment/app/C;->g:Ljava/util/ArrayList;

    if-eqz v2, :cond_15

    :goto_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v8, v3, :cond_15

    iget-object v3, v1, Landroidx/fragment/app/C;->h:Ljava/util/ArrayList;

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    iget-object v4, v0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v4, v4, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v4, v0, Landroidx/fragment/app/B;->j:Ljava/util/Map;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_15
    new-instance v2, Ljava/util/ArrayDeque;

    iget-object v1, v1, Landroidx/fragment/app/C;->i:Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Landroidx/fragment/app/B;->w:Ljava/util/ArrayDeque;

    return-void
.end method

.method public final O()Landroidx/fragment/app/C;
    .locals 11

    invoke-virtual {p0}, Landroidx/fragment/app/B;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/g;

    iget-boolean v3, v1, Landroidx/fragment/app/g;->e:Z

    if-eqz v3, :cond_0

    iput-boolean v2, v1, Landroidx/fragment/app/g;->e:Z

    invoke-virtual {v1}, Landroidx/fragment/app/g;->d()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/B;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/g;

    invoke-virtual {v1}, Landroidx/fragment/app/g;->f()V

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/B;->w(Z)Z

    iput-boolean v0, p0, Landroidx/fragment/app/B;->y:Z

    iget-object v1, p0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iput-boolean v0, v1, Landroidx/fragment/app/D;->h:Z

    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, v0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v3, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/G;

    if-eqz v3, :cond_3

    new-instance v6, Landroidx/fragment/app/F;

    iget-object v7, v3, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    invoke-direct {v6, v7}, Landroidx/fragment/app/F;-><init>(Landroidx/fragment/app/n;)V

    iget v8, v7, Landroidx/fragment/app/n;->b:I

    const/4 v9, -0x1

    if-le v8, v9, :cond_e

    iget-object v8, v6, Landroidx/fragment/app/F;->n:Landroid/os/Bundle;

    if-nez v8, :cond_e

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v7, v8}, Landroidx/fragment/app/n;->q(Landroid/os/Bundle;)V

    iget-object v9, v7, Landroidx/fragment/app/n;->P:Landroidx/activity/l;

    invoke-virtual {v9, v8}, Landroidx/activity/l;->e(Landroid/os/Bundle;)V

    iget-object v9, v7, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v9}, Landroidx/fragment/app/B;->O()Landroidx/fragment/app/C;

    move-result-object v9

    if-eqz v9, :cond_4

    const-string v10, "android:support:fragments"

    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_4
    iget-object v9, v3, Landroidx/fragment/app/G;->a:Lv0/r;

    invoke-virtual {v9, v2}, Lv0/r;->m(Z)V

    invoke-virtual {v8}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    move-object v5, v8

    :goto_3
    iget-object v8, v7, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v8, :cond_6

    invoke-virtual {v3}, Landroidx/fragment/app/G;->o()V

    :cond_6
    iget-object v3, v7, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    if-eqz v3, :cond_8

    if-nez v5, :cond_7

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    :cond_7
    const-string v3, "android:view_state"

    iget-object v8, v7, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_8
    iget-object v3, v7, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    if-eqz v3, :cond_a

    if-nez v5, :cond_9

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    :cond_9
    const-string v3, "android:view_registry_state"

    iget-object v8, v7, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_a
    iget-boolean v3, v7, Landroidx/fragment/app/n;->H:Z

    if-nez v3, :cond_c

    if-nez v5, :cond_b

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    :cond_b
    const-string v3, "android:user_visible_hint"

    iget-boolean v8, v7, Landroidx/fragment/app/n;->H:Z

    invoke-virtual {v5, v3, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_c
    iput-object v5, v6, Landroidx/fragment/app/F;->n:Landroid/os/Bundle;

    iget-object v3, v7, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    if-eqz v3, :cond_f

    if-nez v5, :cond_d

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    iput-object v3, v6, Landroidx/fragment/app/F;->n:Landroid/os/Bundle;

    :cond_d
    iget-object v3, v6, Landroidx/fragment/app/F;->n:Landroid/os/Bundle;

    const-string v5, "android:target_state"

    iget-object v8, v7, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    invoke-virtual {v3, v5, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget v3, v7, Landroidx/fragment/app/n;->j:I

    if-eqz v3, :cond_f

    iget-object v5, v6, Landroidx/fragment/app/F;->n:Landroid/os/Bundle;

    const-string v8, "android:target_req_state"

    invoke-virtual {v5, v8, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_4

    :cond_e
    iget-object v3, v7, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    iput-object v3, v6, Landroidx/fragment/app/F;->n:Landroid/os/Bundle;

    :cond_f
    :goto_4
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v3, "FragmentManager"

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object v3, v6, Landroidx/fragment/app/F;->n:Landroid/os/Bundle;

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto/16 :goto_2

    :cond_10
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    return-object v5

    :cond_11
    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object v3, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v6, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_12

    monitor-exit v3

    move-object v6, v5

    goto :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_12
    new-instance v6, Ljava/util/ArrayList;

    iget-object v7, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_13
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/n;

    iget-object v8, v7, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v8, "FragmentManager"

    invoke-static {v8, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-virtual {v7}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    goto :goto_5

    :cond_14
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_6
    iget-object v0, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_16

    new-array v3, v0, [Landroidx/fragment/app/b;

    :goto_7
    if-ge v2, v0, :cond_17

    new-instance v7, Landroidx/fragment/app/b;

    iget-object v8, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/a;

    invoke-direct {v7, v8}, Landroidx/fragment/app/b;-><init>(Landroidx/fragment/app/a;)V

    aput-object v7, v3, v2

    const-string v7, "FragmentManager"

    invoke-static {v7, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_15

    iget-object v7, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_15
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_16
    move-object v3, v5

    :cond_17
    new-instance v0, Landroidx/fragment/app/C;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v5, v0, Landroidx/fragment/app/C;->f:Ljava/lang/String;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Landroidx/fragment/app/C;->g:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Landroidx/fragment/app/C;->h:Ljava/util/ArrayList;

    iput-object v1, v0, Landroidx/fragment/app/C;->b:Ljava/util/ArrayList;

    iput-object v6, v0, Landroidx/fragment/app/C;->c:Ljava/util/ArrayList;

    iput-object v3, v0, Landroidx/fragment/app/C;->d:[Landroidx/fragment/app/b;

    iget-object v1, p0, Landroidx/fragment/app/B;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iput v1, v0, Landroidx/fragment/app/C;->e:I

    iget-object v1, p0, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    if-eqz v1, :cond_18

    iget-object v1, v1, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iput-object v1, v0, Landroidx/fragment/app/C;->f:Ljava/lang/String;

    :cond_18
    iget-object v1, p0, Landroidx/fragment/app/B;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/fragment/app/B;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/B;->w:Ljava/util/ArrayDeque;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Landroidx/fragment/app/C;->i:Ljava/util/ArrayList;

    return-object v0

    :goto_8
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final P()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v1, v1, Landroidx/fragment/app/q;->f:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/fragment/app/B;->G:LF0/h;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v1, v1, Landroidx/fragment/app/q;->f:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/fragment/app/B;->G:LF0/h;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/B;->V()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final Q(Landroidx/fragment/app/n;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/B;->A(Landroidx/fragment/app/n;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    :cond_0
    return-void
.end method

.method public final R(Landroidx/fragment/app/n;Landroidx/lifecycle/m;)V
    .locals 2

    iget-object v0, p1, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v1, v0}, Lv0/m;->k(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/n;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-ne v0, p0, :cond_1

    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/n;->L:Landroidx/lifecycle/m;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final S(Landroidx/fragment/app/n;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v1, v0}, Lv0/m;->k(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/n;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    iput-object p1, p0, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/B;->p(Landroidx/fragment/app/n;)V

    iget-object p1, p0, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/B;->p(Landroidx/fragment/app/n;)V

    return-void
.end method

.method public final T(Landroidx/fragment/app/n;)V
    .locals 5

    invoke-virtual {p0, p1}, Landroidx/fragment/app/B;->A(Landroidx/fragment/app/n;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p1, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget v3, v1, Landroidx/fragment/app/m;->b:I

    :goto_0
    if-nez v1, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    iget v4, v1, Landroidx/fragment/app/m;->c:I

    :goto_1
    add-int/2addr v4, v3

    if-nez v1, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    iget v3, v1, Landroidx/fragment/app/m;->d:I

    :goto_2
    add-int/2addr v3, v4

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    iget v1, v1, Landroidx/fragment/app/m;->e:I

    :goto_3
    add-int/2addr v1, v3

    if-lez v1, :cond_7

    const v1, 0x7f0801bb

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/n;

    iget-object p1, p1, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    iget-boolean v2, p1, Landroidx/fragment/app/m;->a:Z

    :goto_4
    iget-object p1, v0, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Landroidx/fragment/app/n;->f()Landroidx/fragment/app/m;

    move-result-object p1

    iput-boolean v2, p1, Landroidx/fragment/app/m;->a:Z

    :cond_7
    :goto_5
    return-void
.end method

.method public final U()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->m()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/G;

    iget-object v2, v1, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-boolean v3, v2, Landroidx/fragment/app/n;->G:Z

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Landroidx/fragment/app/B;->b:Z

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/fragment/app/B;->B:Z

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    iput-boolean v3, v2, Landroidx/fragment/app/n;->G:Z

    invoke-virtual {v1}, Landroidx/fragment/app/G;->k()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final V()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/B;->h:Landroidx/fragment/app/v;

    iput-boolean v2, v1, Landroidx/fragment/app/v;->a:Z

    iget-object v1, v1, Landroidx/fragment/app/v;->c:LW1/a;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LW1/a;->d()Ljava/lang/Object;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/fragment/app/B;->h:Landroidx/fragment/app/v;

    iget-object v1, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    invoke-static {v1}, Landroidx/fragment/app/B;->G(Landroidx/fragment/app/n;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v0, Landroidx/fragment/app/v;->a:Z

    iget-object v0, v0, Landroidx/fragment/app/v;->c:LW1/a;

    if-eqz v0, :cond_3

    invoke-interface {v0}, LW1/a;->d()Ljava/lang/Object;

    :cond_3
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final a(Landroidx/fragment/app/n;)Landroidx/fragment/app/G;
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/B;->f(Landroidx/fragment/app/n;)Landroidx/fragment/app/G;

    move-result-object v0

    iput-object p0, p1, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    iget-object v1, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v1, v0}, Lv0/m;->C(Landroidx/fragment/app/G;)V

    iget-boolean v2, p1, Landroidx/fragment/app/n;->A:Z

    if-nez v2, :cond_2

    invoke-virtual {v1, p1}, Lv0/m;->a(Landroidx/fragment/app/n;)V

    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/n;->m:Z

    iget-object v2, p1, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-nez v2, :cond_1

    iput-boolean v1, p1, Landroidx/fragment/app/n;->J:Z

    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/B;->E(Landroidx/fragment/app/n;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/B;->x:Z

    :cond_2
    return-object v0
.end method

.method public final b(Landroidx/fragment/app/q;Lv0/f;Landroidx/fragment/app/n;)V
    .locals 6

    iget-object v0, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    if-nez v0, :cond_f

    iput-object p1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iput-object p2, p0, Landroidx/fragment/app/B;->o:Lv0/f;

    iput-object p3, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    iget-object p2, p0, Landroidx/fragment/app/B;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz p3, :cond_0

    new-instance v0, Landroidx/fragment/app/x;

    invoke-direct {v0, p3}, Landroidx/fragment/app/x;-><init>(Landroidx/fragment/app/n;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, Landroidx/fragment/app/E;

    if-eqz v0, :cond_1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/B;->V()V

    :cond_2
    instance-of p2, p1, Landroidx/activity/v;

    if-eqz p2, :cond_4

    iget-object p2, p1, Landroidx/fragment/app/q;->h:Lf/g;

    invoke-virtual {p2}, Landroidx/activity/k;->h()Landroidx/activity/u;

    move-result-object p2

    iput-object p2, p0, Landroidx/fragment/app/B;->g:Landroidx/activity/u;

    if-eqz p3, :cond_3

    move-object v0, p3

    goto :goto_1

    :cond_3
    move-object v0, p1

    :goto_1
    iget-object v1, p0, Landroidx/fragment/app/B;->h:Landroidx/fragment/app/v;

    invoke-virtual {p2, v0, v1}, Landroidx/activity/u;->a(Landroidx/lifecycle/r;Landroidx/fragment/app/v;)V

    :cond_4
    const/4 p2, 0x0

    if-eqz p3, :cond_6

    iget-object p1, p3, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    iget-object p1, p1, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iget-object v0, p1, Landroidx/fragment/app/D;->d:Ljava/util/HashMap;

    iget-object v1, p3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/D;

    if-nez v1, :cond_5

    new-instance v1, Landroidx/fragment/app/D;

    iget-boolean p1, p1, Landroidx/fragment/app/D;->f:Z

    invoke-direct {v1, p1}, Landroidx/fragment/app/D;-><init>(Z)V

    iget-object p1, p3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iput-object v1, p0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    goto/16 :goto_5

    :cond_6
    instance-of v0, p1, Landroidx/lifecycle/P;

    if-eqz v0, :cond_a

    iget-object p1, p1, Landroidx/fragment/app/q;->h:Lf/g;

    invoke-virtual {p1}, Landroidx/activity/k;->c()Landroidx/lifecycle/O;

    move-result-object p1

    const-string v0, "store"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/fragment/app/D;->i:LU0/e;

    const-string v1, "factory"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LV/a;->b:LV/a;

    const-string v2, "defaultCreationExtras"

    invoke-static {v1, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Landroidx/fragment/app/D;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_9

    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "key"

    invoke-static {v3, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Landroidx/lifecycle/O;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/M;

    invoke-virtual {v2, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    invoke-static {v4, p1}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, v1, LV/b;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v4, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object v1, Landroidx/lifecycle/N;->b:Landroidx/lifecycle/N;

    invoke-interface {v4, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {v0, v2}, LU0/e;->b(Ljava/lang/Class;)Landroidx/lifecycle/M;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    move-object v4, v0

    goto :goto_3

    :catch_0
    invoke-virtual {v0, v2}, LU0/e;->b(Ljava/lang/Class;)Landroidx/lifecycle/M;

    move-result-object v0

    goto :goto_2

    :goto_3
    const-string v0, "viewModel"

    invoke-static {v4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/M;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroidx/lifecycle/M;->a()V

    :cond_8
    :goto_4
    check-cast v4, Landroidx/fragment/app/D;

    iput-object v4, p0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Landroidx/fragment/app/D;

    invoke-direct {p1, p2}, Landroidx/fragment/app/D;-><init>(Z)V

    iput-object p1, p0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    :goto_5
    iget-object p1, p0, Landroidx/fragment/app/B;->F:Landroidx/fragment/app/D;

    iget-boolean v0, p0, Landroidx/fragment/app/B;->y:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Landroidx/fragment/app/B;->z:Z

    if-eqz v0, :cond_c

    :cond_b
    const/4 p2, 0x1

    :cond_c
    iput-boolean p2, p1, Landroidx/fragment/app/D;->h:Z

    iget-object p2, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iput-object p1, p2, Lv0/m;->e:Ljava/lang/Object;

    iget-object p1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    instance-of p2, p1, Landroidx/activity/result/h;

    if-eqz p2, :cond_e

    iget-object p1, p1, Landroidx/fragment/app/q;->h:Lf/g;

    iget-object p1, p1, Landroidx/activity/k;->l:Landroidx/activity/g;

    if-eqz p3, :cond_d

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p3, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    const-string v0, ":"

    invoke-static {p2, p3, v0}, LX/d;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_6

    :cond_d
    const-string p2, ""

    :goto_6
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "FragmentManager:"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "StartActivityForResult"

    invoke-static {p2, p3}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-instance v0, LI1/v;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, LI1/v;-><init>(I)V

    new-instance v1, Landroidx/fragment/app/u;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/u;-><init>(Landroidx/fragment/app/B;I)V

    invoke-virtual {p1, p3, v0, v1}, Landroidx/activity/result/g;->d(Ljava/lang/String;La/a;Landroidx/activity/result/b;)Landroidx/activity/result/d;

    move-result-object p3

    iput-object p3, p0, Landroidx/fragment/app/B;->t:Landroidx/activity/result/d;

    const-string p3, "StartIntentSenderForResult"

    invoke-static {p2, p3}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-instance v0, LI1/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LI1/v;-><init>(I)V

    new-instance v1, Landroidx/fragment/app/u;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/u;-><init>(Landroidx/fragment/app/B;I)V

    invoke-virtual {p1, p3, v0, v1}, Landroidx/activity/result/g;->d(Ljava/lang/String;La/a;Landroidx/activity/result/b;)Landroidx/activity/result/d;

    move-result-object p3

    iput-object p3, p0, Landroidx/fragment/app/B;->u:Landroidx/activity/result/d;

    const-string p3, "RequestPermissions"

    invoke-static {p2, p3}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, LI1/v;

    const/4 v0, 0x2

    invoke-direct {p3, v0}, LI1/v;-><init>(I)V

    new-instance v0, Landroidx/fragment/app/u;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/u;-><init>(Landroidx/fragment/app/B;I)V

    invoke-virtual {p1, p2, p3, v0}, Landroidx/activity/result/g;->d(Ljava/lang/String;La/a;Landroidx/activity/result/b;)Landroidx/activity/result/d;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/B;->v:Landroidx/activity/result/d;

    :cond_e
    return-void

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Landroidx/fragment/app/n;)V
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-boolean v2, p1, Landroidx/fragment/app/n;->A:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    iput-boolean v2, p1, Landroidx/fragment/app/n;->A:Z

    iget-boolean v2, p1, Landroidx/fragment/app/n;->l:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v2, p1}, Lv0/m;->a(Landroidx/fragment/app/n;)V

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/B;->E(Landroidx/fragment/app/n;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/B;->x:Z

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/B;->b:Z

    iget-object v0, p0, Landroidx/fragment/app/B;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/fragment/app/B;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v1}, Lv0/m;->m()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/G;

    iget-object v2, v2, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget-object v2, v2, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/B;->C()LU0/e;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/fragment/app/g;->g(Landroid/view/ViewGroup;LU0/e;)Landroidx/fragment/app/g;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final f(Landroidx/fragment/app/n;)Landroidx/fragment/app/G;
    .locals 3

    iget-object v0, p1, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object v2, v1, Lv0/m;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/G;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Landroidx/fragment/app/G;

    iget-object v2, p0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/G;-><init>(Lv0/r;Lv0/m;Landroidx/fragment/app/n;)V

    iget-object p1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object p1, p1, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/G;->m(Ljava/lang/ClassLoader;)V

    iget p1, p0, Landroidx/fragment/app/B;->m:I

    iput p1, v0, Landroidx/fragment/app/G;->e:I

    return-object v0
.end method

.method public final g(Landroidx/fragment/app/n;)V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    iget-boolean v2, p1, Landroidx/fragment/app/n;->A:Z

    if-nez v2, :cond_3

    const/4 v2, 0x1

    iput-boolean v2, p1, Landroidx/fragment/app/n;->A:Z

    iget-boolean v3, p1, Landroidx/fragment/app/n;->l:Z

    if-eqz v3, :cond_3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object v1, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/n;->l:Z

    invoke-static {p1}, Landroidx/fragment/app/B;->E(Landroidx/fragment/app/n;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v2, p0, Landroidx/fragment/app/B;->x:Z

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/B;->T(Landroidx/fragment/app/n;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroidx/fragment/app/n;->D:Z

    iget-object v1, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v1}, Landroidx/fragment/app/B;->h()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final i()Z
    .locals 5

    iget v0, p0, Landroidx/fragment/app/B;->m:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/n;

    if-eqz v3, :cond_1

    iget-boolean v4, v3, Landroidx/fragment/app/n;->z:Z

    if-nez v4, :cond_1

    iget-object v3, v3, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v3}, Landroidx/fragment/app/B;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final j()Z
    .locals 7

    iget v0, p0, Landroidx/fragment/app/B;->m:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/n;

    if-eqz v5, :cond_1

    invoke-static {v5}, Landroidx/fragment/app/B;->F(Landroidx/fragment/app/n;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-boolean v6, v5, Landroidx/fragment/app/n;->z:Z

    if-nez v6, :cond_1

    iget-object v6, v5, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v6}, Landroidx/fragment/app/B;->j()Z

    move-result v6

    if-eqz v6, :cond_1

    if-nez v3, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v2

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/B;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    :goto_1
    iget-object v0, p0, Landroidx/fragment/app/B;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    iget-object v0, p0, Landroidx/fragment/app/B;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/n;

    if-eqz v3, :cond_4

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    iput-object v3, p0, Landroidx/fragment/app/B;->e:Ljava/util/ArrayList;

    return v4
.end method

.method public final k()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/B;->A:Z

    invoke-virtual {p0, v0}, Landroidx/fragment/app/B;->w(Z)Z

    invoke-virtual {p0}, Landroidx/fragment/app/B;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/g;

    invoke-virtual {v1}, Landroidx/fragment/app/g;->f()V

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/B;->s(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iput-object v0, p0, Landroidx/fragment/app/B;->o:Lv0/f;

    iput-object v0, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    iget-object v1, p0, Landroidx/fragment/app/B;->g:Landroidx/activity/u;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/B;->h:Landroidx/fragment/app/v;

    iget-object v1, v1, Landroidx/fragment/app/v;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/activity/c;

    invoke-interface {v2}, Landroidx/activity/c;->cancel()V

    goto :goto_1

    :cond_1
    iput-object v0, p0, Landroidx/fragment/app/B;->g:Landroidx/activity/u;

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/B;->t:Landroidx/activity/result/d;

    if-eqz v0, :cond_3

    iget-object v1, v0, Landroidx/activity/result/d;->e:Landroidx/activity/result/g;

    iget-object v0, v0, Landroidx/activity/result/d;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroidx/activity/result/g;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/B;->u:Landroidx/activity/result/d;

    iget-object v1, v0, Landroidx/activity/result/d;->e:Landroidx/activity/result/g;

    iget-object v0, v0, Landroidx/activity/result/d;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroidx/activity/result/g;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/B;->v:Landroidx/activity/result/d;

    iget-object v1, v0, Landroidx/activity/result/d;->e:Landroidx/activity/result/g;

    iget-object v0, v0, Landroidx/activity/result/d;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroidx/activity/result/g;->f(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroidx/fragment/app/n;->D:Z

    iget-object v1, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v1}, Landroidx/fragment/app/B;->l()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final m(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n;

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/B;->m(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final n()Z
    .locals 5

    iget v0, p0, Landroidx/fragment/app/B;->m:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/n;

    if-eqz v3, :cond_1

    iget-boolean v4, v3, Landroidx/fragment/app/n;->z:Z

    if-nez v4, :cond_1

    iget-object v3, v3, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v3}, Landroidx/fragment/app/B;->n()Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final o()V
    .locals 3

    iget v0, p0, Landroidx/fragment/app/B;->m:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n;

    if-eqz v1, :cond_1

    iget-boolean v2, v1, Landroidx/fragment/app/n;->z:Z

    if-nez v2, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v1}, Landroidx/fragment/app/B;->o()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final p(Landroidx/fragment/app/n;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v1, v0}, Lv0/m;->k(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/n;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/fragment/app/B;->G(Landroidx/fragment/app/n;)Z

    move-result v0

    iget-object v1, p1, Landroidx/fragment/app/n;->k:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/n;->k:Ljava/lang/Boolean;

    iget-object p1, p1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {p1}, Landroidx/fragment/app/B;->V()V

    iget-object v0, p1, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/B;->p(Landroidx/fragment/app/n;)V

    :cond_1
    return-void
.end method

.method public final q(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n;

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/B;->q(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final r()Z
    .locals 5

    iget v0, p0, Landroidx/fragment/app/B;->m:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v0}, Lv0/m;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/n;

    if-eqz v3, :cond_1

    invoke-static {v3}, Landroidx/fragment/app/B;->F(Landroidx/fragment/app/n;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-boolean v4, v3, Landroidx/fragment/app/n;->z:Z

    if-nez v4, :cond_1

    iget-object v3, v3, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v3}, Landroidx/fragment/app/B;->r()Z

    move-result v3

    if-eqz v3, :cond_1

    move v1, v2

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final s(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/B;->b:Z

    iget-object v2, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object v2, v2, Lv0/m;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/G;

    if-eqz v3, :cond_0

    iput p1, v3, Landroidx/fragment/app/G;->e:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/B;->H(IZ)V

    invoke-virtual {p0}, Landroidx/fragment/app/B;->e()Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/g;

    invoke-virtual {v2}, Landroidx/fragment/app/g;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/B;->b:Z

    invoke-virtual {p0, v0}, Landroidx/fragment/app/B;->w(Z)Z

    return-void

    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/B;->b:Z

    throw p1
.end method

.method public final t(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 9

    const-string v0, "    "

    invoke-static {p1, v0}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lv0/m;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_1c

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "Active Fragments:"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/G;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-eqz v4, :cond_1b

    iget-object v4, v4, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mFragmentId=#"

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/n;->w:I

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, " mContainerId=#"

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/n;->x:I

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, " mTag="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->y:Ljava/lang/String;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/n;->b:I

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(I)V

    const-string v6, " mWho="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->f:Ljava/lang/String;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, " mBackStackNesting="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/n;->r:I

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mAdded="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/n;->l:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mRemoving="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/n;->m:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mFromLayout="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/n;->n:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mInLayout="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/n;->o:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mHidden="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/n;->z:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mDetached="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/n;->A:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mMenuVisible="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/n;->C:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mHasMenu="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mRetainInstance="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/n;->B:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mUserVisibleHint="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Landroidx/fragment/app/n;->H:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v6, v4, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-eqz v6, :cond_0

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mFragmentManager="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v6, v4, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    if-eqz v6, :cond_1

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mHost="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->t:Landroidx/fragment/app/q;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v6, v4, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/n;

    if-eqz v6, :cond_2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mParentFragment="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->v:Landroidx/fragment/app/n;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v6, v4, Landroidx/fragment/app/n;->g:Landroid/os/Bundle;

    if-eqz v6, :cond_3

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mArguments="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->g:Landroid/os/Bundle;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v6, v4, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    if-eqz v6, :cond_4

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mSavedFragmentState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->c:Landroid/os/Bundle;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v6, v4, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    if-eqz v6, :cond_5

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mSavedViewState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->d:Landroid/util/SparseArray;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v6, v4, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    if-eqz v6, :cond_6

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mSavedViewRegistryState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->e:Landroid/os/Bundle;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    iget-object v6, v4, Landroidx/fragment/app/n;->h:Landroidx/fragment/app/n;

    const/4 v7, 0x0

    if-eqz v6, :cond_7

    goto :goto_1

    :cond_7
    iget-object v6, v4, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-eqz v6, :cond_8

    iget-object v8, v4, Landroidx/fragment/app/n;->i:Ljava/lang/String;

    if-eqz v8, :cond_8

    iget-object v6, v6, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v6, v8}, Lv0/m;->k(Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object v6

    goto :goto_1

    :cond_8
    move-object v6, v7

    :goto_1
    if-eqz v6, :cond_9

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mTarget="

    invoke-virtual {p3, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v6, " mTargetRequestCode="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Landroidx/fragment/app/n;->j:I

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_9
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mPopDirection="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_a

    move v6, v5

    goto :goto_2

    :cond_a
    iget-boolean v6, v6, Landroidx/fragment/app/m;->a:Z

    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_b

    goto :goto_4

    :cond_b
    iget v6, v6, Landroidx/fragment/app/m;->b:I

    if-eqz v6, :cond_d

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getEnterAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_c

    move v6, v5

    goto :goto_3

    :cond_c
    iget v6, v6, Landroidx/fragment/app/m;->b:I

    :goto_3
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_d
    :goto_4
    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_e

    goto :goto_6

    :cond_e
    iget v6, v6, Landroidx/fragment/app/m;->c:I

    if-eqz v6, :cond_10

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getExitAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_f

    move v6, v5

    goto :goto_5

    :cond_f
    iget v6, v6, Landroidx/fragment/app/m;->c:I

    :goto_5
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_10
    :goto_6
    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_11

    goto :goto_8

    :cond_11
    iget v6, v6, Landroidx/fragment/app/m;->d:I

    if-eqz v6, :cond_13

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getPopEnterAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_12

    move v6, v5

    goto :goto_7

    :cond_12
    iget v6, v6, Landroidx/fragment/app/m;->d:I

    :goto_7
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_13
    :goto_8
    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_14

    goto :goto_a

    :cond_14
    iget v6, v6, Landroidx/fragment/app/m;->e:I

    if-eqz v6, :cond_16

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getPopExitAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_15

    move v6, v5

    goto :goto_9

    :cond_15
    iget v6, v6, Landroidx/fragment/app/m;->e:I

    :goto_9
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_16
    :goto_a
    iget-object v6, v4, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v6, :cond_17

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mContainer="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_17
    iget-object v6, v4, Landroidx/fragment/app/n;->F:Landroid/view/View;

    if-eqz v6, :cond_18

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mView="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_18
    iget-object v6, v4, Landroidx/fragment/app/n;->I:Landroidx/fragment/app/m;

    if-nez v6, :cond_19

    goto :goto_b

    :cond_19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_b
    invoke-virtual {v4}, Landroidx/fragment/app/n;->h()Landroid/content/Context;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v6, Lv0/e;

    invoke-interface {v4}, Landroidx/lifecycle/P;->c()Landroidx/lifecycle/O;

    move-result-object v7

    invoke-direct {v6, v4, v7}, Lv0/e;-><init>(Landroidx/lifecycle/r;Landroidx/lifecycle/O;)V

    invoke-virtual {v6, v2, p3}, Lv0/e;->c(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_1a
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Child "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v4, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v4, v4, Landroidx/fragment/app/n;->u:Landroidx/fragment/app/B;

    const-string v6, "  "

    invoke-static {v2, v6}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, p2, p3, p4}, Landroidx/fragment/app/B;->t(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1b
    const-string v4, "null"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1c
    iget-object p2, v1, Lv0/m;->c:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_1d

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Added Fragments:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v1, v5

    :goto_c
    if-ge v1, p4, :cond_1d

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/n;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_1d
    iget-object p2, p0, Landroidx/fragment/app/B;->e:Ljava/util/ArrayList;

    if-eqz p2, :cond_1e

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1e

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Fragments Created Menus:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v5

    :goto_d
    if-ge p4, p2, :cond_1e

    iget-object v1, p0, Landroidx/fragment/app/B;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/n;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/fragment/app/n;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_d

    :cond_1e
    iget-object p2, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_1f

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1f

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Back Stack:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v5

    :goto_e
    if-ge p4, p2, :cond_1f

    iget-object v1, p0, Landroidx/fragment/app/B;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v0, p3, v2}, Landroidx/fragment/app/a;->e(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_e

    :cond_1f
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Back Stack Index: "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, Landroidx/fragment/app/B;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_0
    iget-object p4, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_20

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Actions:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_f
    if-ge v5, p4, :cond_20

    iget-object v0, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/z;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "  #"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    const-string v1, ": "

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :catchall_0
    move-exception p1

    goto :goto_10

    :cond_20
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/B;->o:Lv0/f;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz p2, :cond_21

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mParent="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_21
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/B;->m:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/B;->y:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/B;->z:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/B;->A:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean p2, p0, Landroidx/fragment/app/B;->x:Z

    if-eqz p2, :cond_22

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNeedMenuInvalidate="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p1, p0, Landroidx/fragment/app/B;->x:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_22
    return-void

    :goto_10
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Landroidx/fragment/app/z;Z)V
    .locals 2

    if-nez p2, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Landroidx/fragment/app/B;->A:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has not been attached to a host."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v0, p0, Landroidx/fragment/app/B;->y:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Landroidx/fragment/app/B;->z:Z

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    if-nez v1, :cond_5

    if-eqz p2, :cond_4

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object p2, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/B;->P()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final v(Z)V
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/B;->b:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Landroidx/fragment/app/B;->A:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has been destroyed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has not been attached to a host."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v1, v1, Landroidx/fragment/app/q;->f:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_5

    if-nez p1, :cond_3

    iget-boolean p1, p0, Landroidx/fragment/app/B;->y:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Landroidx/fragment/app/B;->z:Z

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/B;->C:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/B;->C:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/B;->D:Ljava/util/ArrayList;

    :cond_4
    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/B;->b:Z

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called from main thread of fragment host"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager is already executing transactions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final w(Z)Z
    .locals 8

    invoke-virtual {p0, p1}, Landroidx/fragment/app/B;->v(Z)V

    const/4 p1, 0x0

    move v0, p1

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/B;->C:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/B;->D:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    iget-object v4, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, p1

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_1

    iget-object v7, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/z;

    invoke-interface {v7, v1, v2}, Landroidx/fragment/app/z;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v7

    or-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/B;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v1, v1, Landroidx/fragment/app/q;->f:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/fragment/app/B;->G:LF0/h;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/B;->b:Z

    :try_start_1
    iget-object v1, p0, Landroidx/fragment/app/B;->C:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/B;->D:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/B;->M(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {p0}, Landroidx/fragment/app/B;->d()V

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Landroidx/fragment/app/B;->d()V

    throw p1

    :cond_2
    :goto_2
    invoke-virtual {p0}, Landroidx/fragment/app/B;->V()V

    iget-boolean v1, p0, Landroidx/fragment/app/B;->B:Z

    if-eqz v1, :cond_3

    iput-boolean p1, p0, Landroidx/fragment/app/B;->B:Z

    invoke-virtual {p0}, Landroidx/fragment/app/B;->U()V

    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object p1, p1, Lv0/m;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return v0

    :goto_3
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final x(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    iget-boolean v5, v5, Landroidx/fragment/app/a;->o:Z

    iget-object v6, v0, Landroidx/fragment/app/B;->E:Ljava/util/ArrayList;

    if-nez v6, :cond_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, Landroidx/fragment/app/B;->E:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v6, v0, Landroidx/fragment/app/B;->E:Ljava/util/ArrayList;

    iget-object v7, v0, Landroidx/fragment/app/B;->c:Lv0/m;

    invoke-virtual {v7}, Lv0/m;->u()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v0, Landroidx/fragment/app/B;->q:Landroidx/fragment/app/n;

    move v9, v3

    const/4 v10, 0x0

    :goto_1
    const/4 v11, 0x1

    if-ge v9, v4, :cond_13

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/fragment/app/a;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-nez v13, :cond_d

    iget-object v13, v0, Landroidx/fragment/app/B;->E:Ljava/util/ArrayList;

    const/4 v8, 0x0

    :goto_2
    iget-object v15, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v8, v14, :cond_c

    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/fragment/app/H;

    iget v3, v14, Landroidx/fragment/app/H;->a:I

    if-eq v3, v11, :cond_b

    const/4 v11, 0x2

    const/16 v2, 0x9

    if-eq v3, v11, :cond_5

    const/4 v11, 0x3

    if-eq v3, v11, :cond_4

    const/4 v11, 0x6

    if-eq v3, v11, :cond_4

    const/4 v11, 0x7

    if-eq v3, v11, :cond_3

    const/16 v11, 0x8

    if-eq v3, v11, :cond_1

    goto :goto_3

    :cond_1
    new-instance v3, Landroidx/fragment/app/H;

    invoke-direct {v3, v2, v6}, Landroidx/fragment/app/H;-><init>(ILandroidx/fragment/app/n;)V

    invoke-virtual {v15, v8, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    iget-object v2, v14, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    move-object v6, v2

    :cond_2
    :goto_3
    move-object/from16 v19, v7

    const/4 v1, 0x1

    goto/16 :goto_7

    :cond_3
    move-object/from16 v19, v7

    const/4 v1, 0x1

    goto/16 :goto_6

    :cond_4
    iget-object v3, v14, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v3, v14, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    if-ne v3, v6, :cond_2

    new-instance v6, Landroidx/fragment/app/H;

    invoke-direct {v6, v2, v3}, Landroidx/fragment/app/H;-><init>(ILandroidx/fragment/app/n;)V

    invoke-virtual {v15, v8, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v19, v7

    const/4 v1, 0x1

    const/4 v6, 0x0

    goto/16 :goto_7

    :cond_5
    iget-object v3, v14, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    iget v11, v3, Landroidx/fragment/app/n;->x:I

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v17

    const/16 v16, 0x1

    add-int/lit8 v17, v17, -0x1

    move/from16 v2, v17

    const/16 v17, 0x0

    :goto_4
    if-ltz v2, :cond_9

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v7

    move-object/from16 v7, v18

    check-cast v7, Landroidx/fragment/app/n;

    iget v1, v7, Landroidx/fragment/app/n;->x:I

    if-ne v1, v11, :cond_8

    if-ne v7, v3, :cond_6

    const/4 v1, 0x1

    const/16 v17, 0x1

    goto :goto_5

    :cond_6
    if-ne v7, v6, :cond_7

    new-instance v1, Landroidx/fragment/app/H;

    const/16 v6, 0x9

    invoke-direct {v1, v6, v7}, Landroidx/fragment/app/H;-><init>(ILandroidx/fragment/app/n;)V

    invoke-virtual {v15, v8, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    const/4 v6, 0x0

    :cond_7
    new-instance v1, Landroidx/fragment/app/H;

    move-object/from16 v18, v6

    const/4 v6, 0x3

    invoke-direct {v1, v6, v7}, Landroidx/fragment/app/H;-><init>(ILandroidx/fragment/app/n;)V

    iget v6, v14, Landroidx/fragment/app/H;->c:I

    iput v6, v1, Landroidx/fragment/app/H;->c:I

    iget v6, v14, Landroidx/fragment/app/H;->e:I

    iput v6, v1, Landroidx/fragment/app/H;->e:I

    iget v6, v14, Landroidx/fragment/app/H;->d:I

    iput v6, v1, Landroidx/fragment/app/H;->d:I

    iget v6, v14, Landroidx/fragment/app/H;->f:I

    iput v6, v1, Landroidx/fragment/app/H;->f:I

    invoke-virtual {v15, v8, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    add-int/2addr v8, v1

    move-object/from16 v6, v18

    goto :goto_5

    :cond_8
    const/4 v1, 0x1

    :goto_5
    add-int/lit8 v2, v2, -0x1

    move-object/from16 v1, p1

    move-object/from16 v7, v19

    goto :goto_4

    :cond_9
    move-object/from16 v19, v7

    const/4 v1, 0x1

    if-eqz v17, :cond_a

    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v8, v8, -0x1

    goto :goto_7

    :cond_a
    iput v1, v14, Landroidx/fragment/app/H;->a:I

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_b
    move-object/from16 v19, v7

    move v1, v11

    :goto_6
    iget-object v2, v14, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/2addr v8, v1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move v11, v1

    move-object/from16 v7, v19

    move-object/from16 v1, p1

    goto/16 :goto_2

    :cond_c
    move-object/from16 v19, v7

    goto :goto_a

    :cond_d
    move-object/from16 v19, v7

    move v1, v11

    iget-object v2, v0, Landroidx/fragment/app/B;->E:Ljava/util/ArrayList;

    iget-object v3, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int/2addr v7, v1

    :goto_8
    if-ltz v7, :cond_10

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/H;

    iget v11, v8, Landroidx/fragment/app/H;->a:I

    if-eq v11, v1, :cond_f

    const/4 v1, 0x3

    if-eq v11, v1, :cond_e

    packed-switch v11, :pswitch_data_0

    goto :goto_9

    :pswitch_0
    iget-object v11, v8, Landroidx/fragment/app/H;->g:Landroidx/lifecycle/m;

    iput-object v11, v8, Landroidx/fragment/app/H;->h:Landroidx/lifecycle/m;

    goto :goto_9

    :pswitch_1
    iget-object v6, v8, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    goto :goto_9

    :pswitch_2
    const/4 v6, 0x0

    goto :goto_9

    :cond_e
    :pswitch_3
    iget-object v8, v8, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_f
    const/4 v1, 0x3

    :pswitch_4
    iget-object v8, v8, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_9
    add-int/lit8 v7, v7, -0x1

    const/4 v1, 0x1

    goto :goto_8

    :cond_10
    :goto_a
    if-nez v10, :cond_12

    iget-boolean v1, v12, Landroidx/fragment/app/a;->g:Z

    if-eqz v1, :cond_11

    goto :goto_b

    :cond_11
    const/4 v10, 0x0

    goto :goto_c

    :cond_12
    :goto_b
    const/4 v10, 0x1

    :goto_c
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v7, v19

    goto/16 :goto_1

    :cond_13
    move-object/from16 v19, v7

    iget-object v1, v0, Landroidx/fragment/app/B;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v5, :cond_16

    iget v1, v0, Landroidx/fragment/app/B;->m:I

    const/4 v2, 0x1

    if-lt v1, v2, :cond_16

    move/from16 v1, p3

    :goto_d
    if-ge v1, v4, :cond_16

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-object v3, v3, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/H;

    iget-object v5, v5, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    if-eqz v5, :cond_14

    iget-object v6, v5, Landroidx/fragment/app/n;->s:Landroidx/fragment/app/B;

    if-eqz v6, :cond_14

    invoke-virtual {v0, v5}, Landroidx/fragment/app/B;->f(Landroidx/fragment/app/n;)Landroidx/fragment/app/G;

    move-result-object v5

    move-object/from16 v6, v19

    invoke-virtual {v6, v5}, Lv0/m;->C(Landroidx/fragment/app/G;)V

    goto :goto_f

    :cond_14
    move-object/from16 v6, v19

    :goto_f
    move-object/from16 v19, v6

    goto :goto_e

    :cond_15
    move-object/from16 v6, v19

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_16
    move-object/from16 v2, p1

    move/from16 v1, p3

    :goto_10
    const/4 v3, -0x1

    if-ge v1, v4, :cond_18

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    move-object/from16 v6, p2

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-virtual {v5, v3}, Landroidx/fragment/app/a;->c(I)V

    invoke-virtual {v5}, Landroidx/fragment/app/a;->g()V

    goto :goto_11

    :cond_17
    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Landroidx/fragment/app/a;->c(I)V

    invoke-virtual {v5}, Landroidx/fragment/app/a;->f()V

    :goto_11
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_18
    move-object/from16 v6, p2

    add-int/lit8 v1, v4, -0x1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move/from16 v5, p3

    :goto_12
    if-ge v5, v4, :cond_1d

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/a;

    if-eqz v1, :cond_1a

    iget-object v8, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    :goto_13
    if-ltz v8, :cond_1c

    iget-object v9, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/H;

    iget-object v9, v9, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    if-eqz v9, :cond_19

    invoke-virtual {v0, v9}, Landroidx/fragment/app/B;->f(Landroidx/fragment/app/n;)Landroidx/fragment/app/G;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/fragment/app/G;->k()V

    :cond_19
    add-int/lit8 v8, v8, -0x1

    goto :goto_13

    :cond_1a
    iget-object v7, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1b
    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/H;

    iget-object v8, v8, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    if-eqz v8, :cond_1b

    invoke-virtual {v0, v8}, Landroidx/fragment/app/B;->f(Landroidx/fragment/app/n;)Landroidx/fragment/app/G;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/fragment/app/G;->k()V

    goto :goto_14

    :cond_1c
    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    :cond_1d
    iget v5, v0, Landroidx/fragment/app/B;->m:I

    const/4 v7, 0x1

    invoke-virtual {v0, v5, v7}, Landroidx/fragment/app/B;->H(IZ)V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    move/from16 v7, p3

    :goto_15
    if-ge v7, v4, :cond_20

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/a;

    iget-object v8, v8, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1e
    :goto_16
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1f

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/H;

    iget-object v9, v9, Landroidx/fragment/app/H;->b:Landroidx/fragment/app/n;

    if-eqz v9, :cond_1e

    iget-object v9, v9, Landroidx/fragment/app/n;->E:Landroid/view/ViewGroup;

    if-eqz v9, :cond_1e

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/B;->C()LU0/e;

    move-result-object v10

    invoke-static {v9, v10}, Landroidx/fragment/app/g;->g(Landroid/view/ViewGroup;LU0/e;)Landroidx/fragment/app/g;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_1f
    add-int/lit8 v7, v7, 0x1

    goto :goto_15

    :cond_20
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_17
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_21

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/g;

    iput-boolean v1, v7, Landroidx/fragment/app/g;->d:Z

    invoke-virtual {v7}, Landroidx/fragment/app/g;->h()V

    invoke-virtual {v7}, Landroidx/fragment/app/g;->d()V

    goto :goto_17

    :cond_21
    move/from16 v1, p3

    :goto_18
    if-ge v1, v4, :cond_23

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_22

    iget v7, v5, Landroidx/fragment/app/a;->r:I

    if-ltz v7, :cond_22

    iput v3, v5, Landroidx/fragment/app/a;->r:I

    :cond_22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v1, v1, 0x1

    goto :goto_18

    :cond_23
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final y(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    return-void
.end method

.method public final z(I)Landroidx/fragment/app/n;
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/B;->c:Lv0/m;

    iget-object v1, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/n;

    if-eqz v3, :cond_0

    iget v4, v3, Landroidx/fragment/app/n;->w:I

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/G;

    if-eqz v1, :cond_2

    iget-object v3, v1, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    iget v1, v3, Landroidx/fragment/app/n;->w:I

    if-ne v1, p1, :cond_2

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method
