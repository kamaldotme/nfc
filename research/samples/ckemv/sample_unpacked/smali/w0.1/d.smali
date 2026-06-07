.class public abstract Lw0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Lv0/l;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv0/l;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lv0/l;-><init>(I)V

    iput-object v0, p0, Lw0/d;->b:Lv0/l;

    return-void
.end method

.method public static a(Ln0/s;Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->f()Lv0/c;

    move-result-object v0

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v2, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_2

    invoke-virtual {v2}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Lv0/p;->g(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x3

    if-eq v5, v6, :cond_1

    const/4 v6, 0x4

    if-eq v5, v6, :cond_1

    iget-object v5, v1, Lv0/p;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->b()V

    iget-object v6, v1, Lv0/p;->e:Lv0/h;

    invoke-virtual {v6}, La0/m;->a()Lf0/i;

    move-result-object v7

    if-nez v3, :cond_0

    invoke-interface {v7, v4}, Le0/d;->g(I)V

    goto :goto_1

    :cond_0
    invoke-interface {v7, v3, v4}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_1
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    invoke-virtual {v7}, Lf0/i;->b()I

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v6, v7}, La0/m;->p(Lf0/i;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v6, v7}, La0/m;->p(Lf0/i;)V

    throw p0

    :cond_1
    :goto_2
    invoke-virtual {v0, v3}, Lv0/c;->g(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ln0/s;->i:Ln0/g;

    iget-object v1, v0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Ln0/g;->i:Ljava/util/HashSet;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1}, Ln0/g;->b(Ljava/lang/String;)Ln0/u;

    move-result-object v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {v0, v4}, Ln0/g;->d(Ln0/u;I)Z

    iget-object p0, p0, Ln0/s;->h:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/i;

    invoke-interface {v0, p1}, Ln0/i;->a(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    return-void

    :catchall_1
    move-exception p0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method


# virtual methods
.method public abstract b()V
.end method

.method public final run()V
    .locals 3

    iget-object v0, p0, Lw0/d;->b:Lv0/l;

    :try_start_0
    invoke-virtual {p0}, Lw0/d;->b()V

    sget-object v1, Lm0/x;->a:Lm0/w;

    invoke-virtual {v0, v1}, Lv0/l;->h(Lu2/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    new-instance v2, Lm0/u;

    invoke-direct {v2, v1}, Lm0/u;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Lv0/l;->h(Lu2/d;)V

    :goto_0
    return-void
.end method
