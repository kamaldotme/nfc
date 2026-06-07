.class public final Lo0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i;
.implements Lr0/e;
.implements Ln0/c;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/HashMap;

.field public final d:Lo0/a;

.field public e:Z

.field public final f:Ljava/lang/Object;

.field public final g:Lv0/r;

.field public final h:Ln0/g;

.field public final i:Lv0/c;

.field public final j:Lm0/a;

.field public final k:Ljava/util/HashMap;

.field public l:Ljava/lang/Boolean;

.field public final m:Lf/G;

.field public final n:Lv0/i;

.field public final o:Lo0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "GreedyScheduler"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm0/a;Lv0/i;Ln0/g;Lv0/c;Lv0/i;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo0/c;->c:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo0/c;->f:Ljava/lang/Object;

    new-instance v0, Lv0/r;

    invoke-direct {v0}, Lv0/r;-><init>()V

    iput-object v0, p0, Lo0/c;->g:Lv0/r;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo0/c;->k:Ljava/util/HashMap;

    iput-object p1, p0, Lo0/c;->b:Landroid/content/Context;

    new-instance p1, Lo0/a;

    iget-object v0, p2, Lm0/a;->c:Lm0/r;

    iget-object v1, p2, Lm0/a;->f:Lf/G;

    invoke-direct {p1, p0, v1, v0}, Lo0/a;-><init>(Ln0/i;Lf/G;Lm0/r;)V

    iput-object p1, p0, Lo0/c;->d:Lo0/a;

    new-instance p1, Lo0/d;

    invoke-direct {p1, v1, p5}, Lo0/d;-><init>(Lf/G;Lv0/c;)V

    iput-object p1, p0, Lo0/c;->o:Lo0/d;

    iput-object p6, p0, Lo0/c;->n:Lv0/i;

    new-instance p1, Lf/G;

    invoke-direct {p1, p3}, Lf/G;-><init>(Lv0/i;)V

    iput-object p1, p0, Lo0/c;->m:Lf/G;

    iput-object p2, p0, Lo0/c;->j:Lm0/a;

    iput-object p4, p0, Lo0/c;->h:Ln0/g;

    iput-object p5, p0, Lo0/c;->i:Lv0/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lo0/c;->l:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    iget-object v0, p0, Lo0/c;->b:Landroid/content/Context;

    iget-object v1, p0, Lo0/c;->j:Lm0/a;

    invoke-static {v0, v1}, Lw0/n;->a(Landroid/content/Context;Lm0/a;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo0/c;->l:Ljava/lang/Boolean;

    :cond_0
    iget-object v0, p0, Lo0/c;->l:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    iget-boolean v0, p0, Lo0/c;->e:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lo0/c;->h:Ln0/g;

    invoke-virtual {v0, p0}, Ln0/g;->a(Ln0/c;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo0/c;->e:Z

    :cond_2
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lo0/c;->d:Lo0/a;

    if-eqz v0, :cond_3

    iget-object v1, v0, Lo0/a;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    if-eqz v1, :cond_3

    iget-object v0, v0, Lo0/a;->b:Lf/G;

    iget-object v0, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_3
    iget-object v0, p0, Lo0/c;->g:Lv0/r;

    invoke-virtual {v0, p1}, Lv0/r;->z(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/m;

    iget-object v1, p0, Lo0/c;->o:Lo0/d;

    invoke-virtual {v1, v0}, Lo0/d;->a(Ln0/m;)V

    iget-object v1, p0, Lo0/c;->i:Lv0/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, -0x200

    invoke-virtual {v1, v0, v2}, Lv0/c;->p(Ln0/m;I)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c(Lv0/o;Lr0/c;)V
    .locals 4

    invoke-static {p1}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object p1

    instance-of v0, p2, Lr0/a;

    iget-object v1, p0, Lo0/c;->i:Lv0/c;

    iget-object v2, p0, Lo0/c;->o:Lo0/d;

    iget-object v3, p0, Lo0/c;->g:Lv0/r;

    if-eqz v0, :cond_0

    invoke-virtual {v3, p1}, Lv0/r;->b(Lv0/j;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, p1}, Lv0/r;->D(Lv0/j;)Ln0/m;

    move-result-object p1

    invoke-virtual {v2, p1}, Lo0/d;->b(Ln0/m;)V

    new-instance p2, LG/m;

    iget-object v0, v1, Lv0/c;->c:Ljava/lang/Object;

    check-cast v0, Ln0/g;

    const/4 v2, 0x0

    invoke-direct {p2, v0, p1, v2}, LG/m;-><init>(Ln0/g;Ln0/m;Lm0/r;)V

    iget-object p1, v1, Lv0/c;->d:Ljava/lang/Object;

    check-cast p1, Lv0/i;

    invoke-virtual {p1, p2}, Lv0/i;->f(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, p1}, Lv0/r;->A(Lv0/j;)Ln0/m;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v2, p1}, Lo0/d;->a(Ln0/m;)V

    check-cast p2, Lr0/b;

    iget p2, p2, Lr0/b;->a:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, p1, p2}, Lv0/c;->p(Ln0/m;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final d(Lv0/j;Z)V
    .locals 2

    iget-object v0, p0, Lo0/c;->g:Lv0/r;

    invoke-virtual {v0, p1}, Lv0/r;->A(Lv0/j;)Ln0/m;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lo0/c;->o:Lo0/d;

    invoke-virtual {v1, v0}, Lo0/d;->a(Ln0/m;)V

    :cond_0
    iget-object v0, p0, Lo0/c;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo0/c;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le2/Q;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Le2/Q;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    if-nez p2, :cond_2

    iget-object p2, p0, Lo0/c;->f:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    iget-object v0, p0, Lo0/c;->k:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    :goto_0
    return-void

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final varargs e([Lv0/o;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lo0/c;->l:Ljava/lang/Boolean;

    if-nez v2, :cond_0

    iget-object v2, v1, Lo0/c;->b:Landroid/content/Context;

    iget-object v3, v1, Lo0/c;->j:Lm0/a;

    invoke-static {v2, v3}, Lw0/n;->a(Landroid/content/Context;Lm0/a;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lo0/c;->l:Ljava/lang/Boolean;

    :cond_0
    iget-object v2, v1, Lo0/c;->l:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    iget-boolean v2, v1, Lo0/c;->e:Z

    const/4 v3, 0x1

    if-nez v2, :cond_2

    iget-object v2, v1, Lo0/c;->h:Ln0/g;

    invoke-virtual {v2, v1}, Ln0/g;->a(Ln0/c;)V

    iput-boolean v3, v1, Lo0/c;->e:Z

    :cond_2
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    array-length v5, v0

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_b

    aget-object v8, v0, v7

    invoke-static {v8}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v9

    iget-object v10, v1, Lo0/c;->g:Lv0/r;

    invoke-virtual {v10, v9}, Lv0/r;->b(Lv0/j;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto/16 :goto_2

    :cond_3
    iget-object v9, v1, Lo0/c;->f:Ljava/lang/Object;

    monitor-enter v9

    :try_start_0
    invoke-static {v8}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v10

    iget-object v11, v1, Lo0/c;->k:Ljava/util/HashMap;

    invoke-virtual {v11, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lo0/b;

    if-nez v11, :cond_4

    new-instance v11, Lo0/b;

    iget v12, v8, Lv0/o;->k:I

    iget-object v13, v1, Lo0/c;->j:Lm0/a;

    iget-object v13, v13, Lm0/a;->c:Lm0/r;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-direct {v11, v12, v13, v14}, Lo0/b;-><init>(IJ)V

    iget-object v12, v1, Lo0/c;->k:Ljava/util/HashMap;

    invoke-virtual {v12, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_4
    :goto_1
    iget-wide v12, v11, Lo0/b;->b:J

    iget v10, v8, Lv0/o;->k:I

    iget v11, v11, Lo0/b;->a:I

    sub-int/2addr v10, v11

    add-int/lit8 v10, v10, -0x5

    invoke-static {v10, v6}, Ljava/lang/Math;->max(II)I

    move-result v10

    int-to-long v10, v10

    const-wide/16 v14, 0x7530

    mul-long/2addr v10, v14

    add-long/2addr v10, v12

    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v8}, Lv0/o;->a()J

    move-result-wide v12

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    iget-object v11, v1, Lo0/c;->j:Lm0/a;

    iget-object v11, v11, Lm0/a;->c:Lm0/r;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    iget v13, v8, Lv0/o;->b:I

    if-ne v13, v3, :cond_a

    cmp-long v11, v11, v9

    if-gez v11, :cond_6

    iget-object v11, v1, Lo0/c;->d:Lo0/a;

    if-eqz v11, :cond_a

    iget-object v12, v11, Lo0/a;->d:Ljava/util/HashMap;

    iget-object v13, v8, Lv0/o;->a:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Runnable;

    iget-object v14, v11, Lo0/a;->b:Lf/G;

    if-eqz v13, :cond_5

    iget-object v15, v14, Lf/G;->b:Ljava/lang/Object;

    check-cast v15, Landroid/os/Handler;

    invoke-virtual {v15, v13}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_5
    new-instance v13, LD0/c;

    const/16 v15, 0x8

    const/4 v6, 0x0

    invoke-direct {v13, v11, v8, v15, v6}, LD0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    iget-object v6, v8, Lv0/o;->a:Ljava/lang/String;

    invoke-virtual {v12, v6, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v11, Lo0/a;->c:Lm0/r;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sub-long/2addr v9, v11

    iget-object v6, v14, Lf/G;->b:Ljava/lang/Object;

    check-cast v6, Landroid/os/Handler;

    invoke-virtual {v6, v13, v9, v10}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_2

    :cond_6
    invoke-virtual {v8}, Lv0/o;->b()Z

    move-result v6

    if-eqz v6, :cond_9

    iget-object v6, v8, Lv0/o;->j:Lm0/d;

    iget-boolean v9, v6, Lm0/d;->c:Z

    if-eqz v9, :cond_7

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v6

    invoke-virtual {v8}, Lv0/o;->toString()Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_7
    iget-object v6, v6, Lm0/d;->h:Ljava/util/Set;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v3

    if-eqz v6, :cond_8

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v6

    invoke-virtual {v8}, Lv0/o;->toString()Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_8
    invoke-virtual {v2, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v6, v8, Lv0/o;->a:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    iget-object v6, v1, Lo0/c;->g:Lv0/r;

    invoke-static {v8}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v9

    invoke-virtual {v6, v9}, Lv0/r;->b(Lv0/j;)Z

    move-result v6

    if-nez v6, :cond_a

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v1, Lo0/c;->g:Lv0/r;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v8

    invoke-virtual {v6, v8}, Lv0/r;->D(Lv0/j;)Ln0/m;

    move-result-object v6

    iget-object v8, v1, Lo0/c;->o:Lo0/d;

    invoke-virtual {v8, v6}, Lo0/d;->b(Ln0/m;)V

    iget-object v8, v1, Lo0/c;->i:Lv0/c;

    new-instance v9, LG/m;

    iget-object v10, v8, Lv0/c;->c:Ljava/lang/Object;

    check-cast v10, Ln0/g;

    const/4 v11, 0x0

    invoke-direct {v9, v10, v6, v11}, LG/m;-><init>(Ln0/g;Ln0/m;Lm0/r;)V

    iget-object v6, v8, Lv0/c;->d:Ljava/lang/Object;

    check-cast v6, Lv0/i;

    invoke-virtual {v6, v9}, Lv0/i;->f(Ljava/lang/Runnable;)V

    :cond_a
    :goto_2
    add-int/lit8 v7, v7, 0x1

    const/4 v6, 0x0

    goto/16 :goto_0

    :goto_3
    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_b
    iget-object v3, v1, Lo0/c;->f:Ljava/lang/Object;

    monitor-enter v3

    :try_start_2
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, ","

    invoke-static {v0, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv0/o;

    invoke-static {v2}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v4

    iget-object v5, v1, Lo0/c;->c:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    iget-object v5, v1, Lo0/c;->m:Lf/G;

    iget-object v6, v1, Lo0/c;->n:Lv0/i;

    iget-object v6, v6, Lv0/i;->c:Ljava/lang/Object;

    check-cast v6, Le2/K;

    invoke-static {v5, v2, v6, v1}, Lr0/k;->a(Lf/G;Lv0/o;Le2/K;Lr0/e;)Le2/U;

    move-result-object v2

    iget-object v5, v1, Lo0/c;->c:Ljava/util/HashMap;

    invoke-virtual {v5, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_d
    monitor-exit v3

    return-void

    :goto_5
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
