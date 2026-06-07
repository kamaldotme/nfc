.class public final Ln0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic s:I


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Lv0/o;

.field public e:Lm0/q;

.field public final f:Lv0/i;

.field public g:Lm0/p;

.field public final h:Lm0/a;

.field public final i:Lm0/r;

.field public final j:Lu0/a;

.field public final k:Landroidx/work/impl/WorkDatabase;

.field public final l:Lv0/p;

.field public final m:Lv0/c;

.field public final n:Ljava/util/List;

.field public o:Ljava/lang/String;

.field public final p:Lx0/k;

.field public final q:Lx0/k;

.field public volatile r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkerWrapper"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ln0/t;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm0/m;

    invoke-direct {v0}, Lm0/m;-><init>()V

    iput-object v0, p0, Ln0/u;->g:Lm0/p;

    new-instance v0, Lx0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ln0/u;->p:Lx0/k;

    new-instance v0, Lx0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ln0/u;->q:Lx0/k;

    const/16 v0, -0x100

    iput v0, p0, Ln0/u;->r:I

    iget-object v0, p1, Ln0/t;->a:Landroid/content/Context;

    iput-object v0, p0, Ln0/u;->b:Landroid/content/Context;

    iget-object v0, p1, Ln0/t;->c:Lv0/i;

    iput-object v0, p0, Ln0/u;->f:Lv0/i;

    iget-object v0, p1, Ln0/t;->b:Lu0/a;

    iput-object v0, p0, Ln0/u;->j:Lu0/a;

    iget-object v0, p1, Ln0/t;->f:Lv0/o;

    iput-object v0, p0, Ln0/u;->d:Lv0/o;

    iget-object v0, v0, Lv0/o;->a:Ljava/lang/String;

    iput-object v0, p0, Ln0/u;->c:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Ln0/u;->e:Lm0/q;

    iget-object v0, p1, Ln0/t;->d:Lm0/a;

    iput-object v0, p0, Ln0/u;->h:Lm0/a;

    iget-object v0, v0, Lm0/a;->c:Lm0/r;

    iput-object v0, p0, Ln0/u;->i:Lm0/r;

    iget-object v0, p1, Ln0/t;->e:Landroidx/work/impl/WorkDatabase;

    iput-object v0, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v1

    iput-object v1, p0, Ln0/u;->l:Lv0/p;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->f()Lv0/c;

    move-result-object v0

    iput-object v0, p0, Ln0/u;->m:Lv0/c;

    iget-object p1, p1, Ln0/t;->g:Ljava/util/List;

    iput-object p1, p0, Ln0/u;->n:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lm0/p;)V
    .locals 9

    instance-of v0, p1, Lm0/o;

    iget-object v1, p0, Ln0/u;->d:Lv0/o;

    if-eqz v0, :cond_3

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Lv0/o;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ln0/u;->d()V

    goto/16 :goto_2

    :cond_0
    iget-object p1, p0, Ln0/u;->m:Lv0/c;

    iget-object v0, p0, Ln0/u;->c:Ljava/lang/String;

    iget-object v1, p0, Ln0/u;->l:Lv0/p;

    iget-object v2, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->c()V

    const/4 v3, 0x0

    const/4 v4, 0x3

    :try_start_0
    invoke-virtual {v1, v0, v4}, Lv0/p;->o(Ljava/lang/String;I)V

    iget-object v4, p0, Ln0/u;->g:Lm0/p;

    check-cast v4, Lm0/o;

    iget-object v4, v4, Lm0/o;->a:Lm0/g;

    invoke-virtual {v1, v0, v4}, Lv0/p;->n(Ljava/lang/String;Lm0/g;)V

    iget-object v4, p0, Ln0/u;->i:Lm0/r;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p1, v0}, Lv0/c;->g(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v1, v6}, Lv0/p;->g(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x5

    if-ne v7, v8, :cond_1

    invoke-virtual {p1, v6}, Lv0/c;->h(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x1

    invoke-virtual {v1, v6, v7}, Lv0/p;->o(Ljava/lang/String;I)V

    invoke-virtual {v1, v6, v4, v5}, Lv0/p;->m(Ljava/lang/String;J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {p0, v3}, Ln0/u;->e(Z)V

    goto :goto_2

    :goto_1
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {p0, v3}, Ln0/u;->e(Z)V

    throw p1

    :cond_3
    instance-of p1, p1, Lm0/n;

    if-eqz p1, :cond_4

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ln0/u;->c()V

    goto :goto_2

    :cond_4
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Lv0/o;->c()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Ln0/u;->d()V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Ln0/u;->g()V

    :goto_2
    return-void
.end method

.method public final b()V
    .locals 3

    invoke-virtual {p0}, Ln0/u;->h()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    iget-object v0, p0, Ln0/u;->l:Lv0/p;

    iget-object v1, p0, Ln0/u;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lv0/p;->g(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->t()Lv0/m;

    move-result-object v1

    iget-object v2, p0, Ln0/u;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lv0/m;->f(Ljava/lang/String;)V

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ln0/u;->e(Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ln0/u;->g:Lm0/p;

    invoke-virtual {p0, v0}, Ln0/u;->a(Lm0/p;)V

    goto :goto_0

    :cond_1
    invoke-static {v0}, LX/d;->d(I)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, -0x200

    iput v0, p0, Ln0/u;->r:I

    invoke-virtual {p0}, Ln0/u;->c()V

    :cond_2
    :goto_0
    iget-object v0, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    goto :goto_2

    :goto_1
    iget-object v1, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v0

    :cond_3
    :goto_2
    return-void
.end method

.method public final c()V
    .locals 6

    iget-object v0, p0, Ln0/u;->c:Ljava/lang/String;

    iget-object v1, p0, Ln0/u;->l:Lv0/p;

    iget-object v2, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->c()V

    const/4 v3, 0x1

    :try_start_0
    invoke-virtual {v1, v0, v3}, Lv0/p;->o(Ljava/lang/String;I)V

    iget-object v4, p0, Ln0/u;->i:Lm0/r;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v1, v0, v4, v5}, Lv0/p;->m(Ljava/lang/String;J)V

    iget-object v4, p0, Ln0/u;->d:Lv0/o;

    iget v4, v4, Lv0/o;->v:I

    invoke-virtual {v1, v0, v4}, Lv0/p;->l(Ljava/lang/String;I)V

    const-wide/16 v4, -0x1

    invoke-virtual {v1, v0, v4, v5}, Lv0/p;->k(Ljava/lang/String;J)V

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {p0, v3}, Ln0/u;->e(Z)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {p0, v3}, Ln0/u;->e(Z)V

    throw v0
.end method

.method public final d()V
    .locals 8

    iget-object v0, p0, Ln0/u;->c:Ljava/lang/String;

    iget-object v1, p0, Ln0/u;->l:Lv0/p;

    iget-object v2, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->c()V

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Ln0/u;->i:Lm0/r;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v1, v0, v4, v5}, Lv0/p;->m(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v4, v1, Lv0/p;->a:Landroidx/work/impl/WorkDatabase;

    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {v1, v0, v5}, Lv0/p;->o(Ljava/lang/String;I)V

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->b()V

    iget-object v6, v1, Lv0/p;->j:Lv0/h;

    invoke-virtual {v6}, La0/m;->a()Lf0/i;

    move-result-object v7

    if-nez v0, :cond_0

    invoke-interface {v7, v5}, Le0/d;->g(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v7, v0, v5}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_0
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v7}, Lf0/i;->b()I

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v6, v7}, La0/m;->p(Lf0/i;)V

    iget-object v6, p0, Ln0/u;->d:Lv0/o;

    iget v6, v6, Lv0/o;->v:I

    invoke-virtual {v1, v0, v6}, Lv0/p;->l(Ljava/lang/String;I)V

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->b()V

    iget-object v6, v1, Lv0/p;->f:Lv0/h;

    invoke-virtual {v6}, La0/m;->a()Lf0/i;

    move-result-object v7

    if-nez v0, :cond_1

    invoke-interface {v7, v5}, Le0/d;->g(I)V

    goto :goto_1

    :cond_1
    invoke-interface {v7, v0, v5}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_1
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v7}, Lf0/i;->b()I

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v6, v7}, La0/m;->p(Lf0/i;)V

    const-wide/16 v4, -0x1

    invoke-virtual {v1, v0, v4, v5}, Lv0/p;->k(Ljava/lang/String;J)V

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {p0, v3}, Ln0/u;->e(Z)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v6, v7}, La0/m;->p(Lf0/i;)V

    throw v0

    :catchall_2
    move-exception v0

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v6, v7}, La0/m;->p(Lf0/i;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_2
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {p0, v3}, Ln0/u;->e(Z)V

    throw v0
.end method

.method public final e(Z)V
    .locals 5

    iget-object v0, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    iget-object v0, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"

    const/4 v2, 0x0

    invoke-static {v1, v2}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v1

    iget-object v0, v0, Lv0/p;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->b()V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move v3, v2

    :goto_0
    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, La0/j;->o()V

    if-nez v3, :cond_1

    iget-object v0, p0, Ln0/u;->b:Landroid/content/Context;

    const-class v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    invoke-static {v0, v1, v2}, Lw0/m;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Ln0/u;->l:Lv0/p;

    iget-object v1, p0, Ln0/u;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lv0/p;->o(Ljava/lang/String;I)V

    iget-object v0, p0, Ln0/u;->l:Lv0/p;

    iget-object v1, p0, Ln0/u;->c:Ljava/lang/String;

    iget v2, p0, Ln0/u;->r:I

    invoke-virtual {v0, v1, v2}, Lv0/p;->p(Ljava/lang/String;I)V

    iget-object v0, p0, Ln0/u;->l:Lv0/p;

    iget-object v1, p0, Ln0/u;->c:Ljava/lang/String;

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lv0/p;->k(Ljava/lang/String;J)V

    :cond_2
    iget-object v0, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    iget-object v0, p0, Ln0/u;->p:Lx0/k;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx0/k;->j(Ljava/lang/Object;)Z

    return-void

    :goto_2
    :try_start_3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, La0/j;->o()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    iget-object v0, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    throw p1
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Ln0/u;->l:Lv0/p;

    iget-object v1, p0, Ln0/u;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lv0/p;->g(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ln0/u;->e(Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ln0/u;->e(Z)V

    :goto_0
    return-void
.end method

.method public final g()V
    .locals 8

    iget-object v0, p0, Ln0/u;->c:Ljava/lang/String;

    iget-object v1, p0, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->c()V

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v5, p0, Ln0/u;->l:Lv0/p;

    if-nez v4, :cond_1

    :try_start_1
    invoke-virtual {v3}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v5, v4}, Lv0/p;->g(Ljava/lang/String;)I

    move-result v6

    const/4 v7, 0x6

    if-eq v6, v7, :cond_0

    const/4 v6, 0x4

    invoke-virtual {v5, v4, v6}, Lv0/p;->o(Ljava/lang/String;I)V

    :cond_0
    iget-object v5, p0, Ln0/u;->m:Lv0/c;

    invoke-virtual {v5, v4}, Lv0/c;->g(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    iget-object v3, p0, Ln0/u;->g:Lm0/p;

    check-cast v3, Lm0/m;

    iget-object v3, v3, Lm0/m;->a:Lm0/g;

    iget-object v4, p0, Ln0/u;->d:Lv0/o;

    iget v4, v4, Lv0/o;->v:I

    invoke-virtual {v5, v0, v4}, Lv0/p;->l(Ljava/lang/String;I)V

    invoke-virtual {v5, v0, v3}, Lv0/p;->n(Ljava/lang/String;Lm0/g;)V

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {p0, v2}, Ln0/u;->e(Z)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {p0, v2}, Ln0/u;->e(Z)V

    throw v0
.end method

.method public final h()Z
    .locals 3

    iget v0, p0, Ln0/u;->r:I

    const/16 v1, -0x100

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ln0/u;->l:Lv0/p;

    iget-object v1, p0, Ln0/u;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lv0/p;->g(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, v2}, Ln0/u;->e(Z)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, LX/d;->d(I)Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ln0/u;->e(Z)V

    :goto_0
    return v1

    :cond_1
    return v2
.end method

.method public final run()V
    .locals 20

    move-object/from16 v1, p0

    const/4 v0, 0x0

    const/4 v2, 0x1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Work [ id="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Ln0/u;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", tags={ "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Ln0/u;->n:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v2

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v7, :cond_0

    move v7, v0

    goto :goto_1

    :cond_0
    const-string v9, ", "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v6, " } ]"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Ln0/u;->o:Ljava/lang/String;

    iget-object v3, v1, Ln0/u;->d:Lv0/o;

    invoke-virtual/range {p0 .. p0}, Ln0/u;->h()Z

    move-result v6

    if-eqz v6, :cond_2

    goto/16 :goto_a

    :cond_2
    iget-object v6, v1, Ln0/u;->k:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    iget v7, v3, Lv0/o;->b:I

    if-eq v7, v2, :cond_3

    invoke-virtual/range {p0 .. p0}, Ln0/u;->f()V

    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->p()V

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->k()V

    goto/16 :goto_a

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :cond_3
    :try_start_1
    invoke-virtual {v3}, Lv0/o;->c()Z

    move-result v7

    if-nez v7, :cond_4

    iget v7, v3, Lv0/o;->b:I

    if-ne v7, v2, :cond_5

    iget v7, v3, Lv0/o;->k:I

    if-lez v7, :cond_5

    :cond_4
    iget-object v7, v1, Ln0/u;->i:Lm0/r;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v3}, Lv0/o;->a()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-gez v7, :cond_5

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ln0/u;->e(Z)V

    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->p()V

    goto :goto_2

    :cond_5
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v3}, Lv0/o;->c()Z

    move-result v7

    iget-object v8, v3, Lv0/o;->e:Lm0/g;

    iget-object v9, v1, Ln0/u;->l:Lv0/p;

    iget-object v10, v1, Ln0/u;->h:Lm0/a;

    if-eqz v7, :cond_6

    goto/16 :goto_7

    :cond_6
    iget-object v7, v10, Lm0/a;->e:Lm0/r;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v3, Lv0/o;->d:Ljava/lang/String;

    const-string v11, "className"

    invoke-static {v7, v11}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v11, Lm0/k;->a:I

    const/4 v11, 0x0

    :try_start_2
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v12, "null cannot be cast to non-null type androidx.work.InputMerger"

    invoke-static {v7, v12}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm0/j;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v7, v11

    :goto_3
    if-nez v7, :cond_7

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p0 .. p0}, Ln0/u;->g()V

    goto/16 :goto_a

    :cond_7
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"

    invoke-static {v8, v2}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v8

    if-nez v4, :cond_8

    invoke-virtual {v8, v2}, La0/j;->g(I)V

    goto :goto_4

    :cond_8
    invoke-virtual {v8, v4, v2}, La0/j;->h(Ljava/lang/String;I)V

    :goto_4
    iget-object v13, v9, Lv0/p;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v13}, Landroidx/work/impl/WorkDatabase;->b()V

    invoke-virtual {v13, v8, v11}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v13

    :try_start_3
    new-instance v14, Ljava/util/ArrayList;

    invoke-interface {v13}, Landroid/database/Cursor;->getCount()I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    :goto_5
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    move-result v15

    if-eqz v15, :cond_a

    invoke-interface {v13, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_9

    move-object v15, v11

    goto :goto_6

    :cond_9
    invoke-interface {v13, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v15

    :goto_6
    invoke-static {v15}, Lm0/g;->a([B)Lm0/g;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    goto/16 :goto_c

    :cond_a
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    invoke-virtual {v8}, La0/j;->o()V

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v7, v12}, Lm0/j;->a(Ljava/util/ArrayList;)Lm0/g;

    move-result-object v8

    :goto_7
    new-instance v7, Landroidx/work/WorkerParameters;

    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v11

    iget-object v12, v10, Lm0/a;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v13, Lw0/u;

    new-instance v13, Lw0/t;

    iget-object v14, v1, Ln0/u;->j:Lu0/a;

    iget-object v15, v1, Ln0/u;->f:Lv0/i;

    invoke-direct {v13, v6, v14, v15}, Lw0/t;-><init>(Landroidx/work/impl/WorkDatabase;Lu0/a;Lv0/i;)V

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-object v11, v7, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    iput-object v8, v7, Landroidx/work/WorkerParameters;->b:Lm0/g;

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v12, v7, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/Executor;

    iput-object v15, v7, Landroidx/work/WorkerParameters;->d:Lv0/i;

    iget-object v5, v10, Lm0/a;->d:Lm0/B;

    iput-object v5, v7, Landroidx/work/WorkerParameters;->e:Lm0/B;

    iget-object v8, v1, Ln0/u;->e:Lm0/q;

    if-nez v8, :cond_b

    iget-object v8, v1, Ln0/u;->b:Landroid/content/Context;

    iget-object v3, v3, Lv0/o;->c:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3, v7}, Lm0/B;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lm0/q;

    move-result-object v3

    iput-object v3, v1, Ln0/u;->e:Lm0/q;

    :cond_b
    iget-object v3, v1, Ln0/u;->e:Lm0/q;

    if-nez v3, :cond_c

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p0 .. p0}, Ln0/u;->g()V

    goto/16 :goto_a

    :cond_c
    iget-boolean v5, v3, Lm0/q;->e:Z

    if-eqz v5, :cond_d

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p0 .. p0}, Ln0/u;->g()V

    goto/16 :goto_a

    :cond_d
    iput-boolean v2, v3, Lm0/q;->e:Z

    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_4
    invoke-virtual {v9, v4}, Lv0/p;->g(Ljava/lang/String;)I

    move-result v3

    if-ne v3, v2, :cond_f

    const/4 v3, 0x2

    invoke-virtual {v9, v4, v3}, Lv0/p;->o(Ljava/lang/String;I)V

    iget-object v3, v9, Lv0/p;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->b()V

    iget-object v5, v9, Lv0/p;->i:Lv0/h;

    invoke-virtual {v5}, La0/m;->a()Lf0/i;

    move-result-object v7

    if-nez v4, :cond_e

    invoke-interface {v7, v2}, Le0/d;->g(I)V

    goto :goto_8

    :cond_e
    invoke-interface {v7, v4, v2}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_8
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v7}, Lf0/i;->b()I

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v5, v7}, La0/m;->p(Lf0/i;)V

    const/16 v3, -0x100

    invoke-virtual {v9, v4, v3}, Lv0/p;->p(Ljava/lang/String;I)V

    move v3, v2

    goto :goto_9

    :catchall_2
    move-exception v0

    goto :goto_b

    :catchall_3
    move-exception v0

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v5, v7}, La0/m;->p(Lf0/i;)V

    throw v0

    :cond_f
    move v3, v0

    :goto_9
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->k()V

    if-eqz v3, :cond_11

    invoke-virtual/range {p0 .. p0}, Ln0/u;->h()Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_a

    :cond_10
    new-instance v3, Lw0/r;

    iget-object v4, v1, Ln0/u;->e:Lm0/q;

    iget-object v5, v1, Ln0/u;->b:Landroid/content/Context;

    iget-object v6, v1, Ln0/u;->d:Lv0/o;

    iget-object v7, v1, Ln0/u;->f:Lv0/i;

    move-object v14, v3

    move-object v8, v15

    move-object v15, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v4

    move-object/from16 v18, v13

    move-object/from16 v19, v7

    invoke-direct/range {v14 .. v19}, Lw0/r;-><init>(Landroid/content/Context;Lv0/o;Lm0/q;Lw0/t;Lv0/i;)V

    iget-object v4, v8, Lv0/i;->e:Ljava/lang/Object;

    check-cast v4, Ly0/a;

    invoke-virtual {v4, v3}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    new-instance v4, LI1/k;

    iget-object v3, v3, Lw0/r;->b:Lx0/k;

    const/4 v5, 0x3

    invoke-direct {v4, v1, v5, v3}, LI1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    new-instance v5, Lf/C;

    invoke-direct {v5, v2}, Lf/C;-><init>(I)V

    iget-object v2, v1, Ln0/u;->q:Lx0/k;

    invoke-virtual {v2, v4, v5}, Lx0/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v4, LD0/c;

    const/4 v5, 0x7

    invoke-direct {v4, v1, v3, v5, v0}, LD0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    iget-object v0, v8, Lv0/i;->e:Ljava/lang/Object;

    check-cast v0, Ly0/a;

    invoke-virtual {v3, v4, v0}, Lx0/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, v1, Ln0/u;->o:Ljava/lang/String;

    new-instance v3, LF0/h;

    invoke-direct {v3, v1, v0}, LF0/h;-><init>(Ln0/u;Ljava/lang/String;)V

    iget-object v0, v8, Lv0/i;->b:Ljava/lang/Object;

    check-cast v0, Lf/B;

    invoke-virtual {v2, v3, v0}, Lx0/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_a

    :cond_11
    invoke-virtual/range {p0 .. p0}, Ln0/u;->f()V

    :goto_a
    return-void

    :goto_b
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v0

    :goto_c
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    invoke-virtual {v8}, La0/j;->o()V

    throw v0

    :goto_d
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v0
.end method
