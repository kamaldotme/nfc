.class public final Landroidx/work/impl/WorkDatabase_Impl;
.super Landroidx/work/impl/WorkDatabase;
.source "SourceFile"


# instance fields
.field public volatile k:Lv0/p;

.field public volatile l:Lv0/c;

.field public volatile m:Lv0/r;

.field public volatile n:Lv0/i;

.field public volatile o:Lv0/l;

.field public volatile p:Lv0/m;

.field public volatile q:Lv0/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()La0/f;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, La0/f;

    const-string v6, "SystemIdInfo"

    const-string v7, "WorkName"

    const-string v3, "Dependency"

    const-string v4, "WorkSpec"

    const-string v5, "WorkTag"

    const-string v8, "WorkProgress"

    const-string v9, "Preference"

    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p0, v0, v2, v3}, La0/f;-><init>(Landroidx/work/impl/WorkDatabase;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v1
.end method

.method public final e(La0/b;)Le0/c;
    .locals 7

    new-instance v3, LJ1/l;

    new-instance v0, Lf/G;

    invoke-direct {v0, p0}, Lf/G;-><init>(Ljava/lang/Object;)V

    invoke-direct {v3, p1, v0}, LJ1/l;-><init>(La0/b;Lf/G;)V

    iget-object v1, p1, La0/b;->a:Landroid/content/Context;

    const-string v0, "context"

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Le0/a;

    const/4 v5, 0x0

    const/4 v4, 0x0

    iget-object v2, p1, La0/b;->b:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Le0/a;-><init>(Landroid/content/Context;Ljava/lang/String;LJ1/l;ZZ)V

    iget-object p1, p1, La0/b;->c:Le0/b;

    invoke-interface {p1, v6}, Le0/b;->c(Le0/a;)Le0/c;

    move-result-object p1

    return-object p1
.end method

.method public final f()Lv0/c;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->l:Lv0/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->l:Lv0/c;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->l:Lv0/c;

    if-nez v0, :cond_1

    new-instance v0, Lv0/c;

    invoke-direct {v0, p0}, Lv0/c;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->l:Lv0/c;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->l:Lv0/c;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final g(Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 9

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/16 v1, 0xd

    new-instance v2, Ln0/d;

    const/16 v3, 0xe

    const/16 v4, 0xa

    invoke-direct {v2, v1, v3, v4}, Ln0/d;-><init>(III)V

    new-instance v3, Ln0/q;

    invoke-direct {v3, v0}, Ln0/q;-><init>(I)V

    new-instance v4, Ln0/d;

    const/16 v5, 0x10

    const/16 v6, 0x11

    const/16 v7, 0xb

    invoke-direct {v4, v5, v6, v7}, Ln0/d;-><init>(III)V

    new-instance v5, Ln0/d;

    const/16 v7, 0x12

    const/16 v8, 0xc

    invoke-direct {v5, v6, v7, v8}, Ln0/d;-><init>(III)V

    new-instance v6, Ln0/d;

    const/16 v8, 0x13

    invoke-direct {v6, v7, v8, v1}, Ln0/d;-><init>(III)V

    new-instance v1, Ln0/q;

    invoke-direct {v1, p1}, Ln0/q;-><init>(I)V

    const/4 v7, 0x6

    new-array v7, v7, [Lb0/a;

    aput-object v2, v7, v0

    aput-object v3, v7, p1

    const/4 p1, 0x2

    aput-object v4, v7, p1

    const/4 p1, 0x3

    aput-object v5, v7, p1

    const/4 p1, 0x4

    aput-object v6, v7, p1

    const/4 p1, 0x5

    aput-object v1, v7, p1

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final i()Ljava/util/Set;
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public final j()Ljava/util/Map;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-class v2, Lv0/p;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-class v2, Lv0/c;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-class v2, Lv0/r;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-class v2, Lv0/i;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-class v2, Lv0/l;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-class v2, Lv0/m;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-class v2, Lv0/e;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-class v2, Lv0/f;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final m()Lv0/e;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lv0/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lv0/e;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lv0/e;

    if-nez v0, :cond_1

    new-instance v0, Lv0/e;

    invoke-direct {v0, p0}, Lv0/e;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lv0/e;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->q:Lv0/e;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final q()Lv0/i;
    .locals 3

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lv0/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lv0/i;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lv0/i;

    if-nez v0, :cond_1

    new-instance v0, Lv0/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Lv0/i;->b:Ljava/lang/Object;

    new-instance v1, Lv0/b;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lv0/b;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    iput-object v1, v0, Lv0/i;->c:Ljava/lang/Object;

    new-instance v1, Lv0/h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lv0/h;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    iput-object v1, v0, Lv0/i;->d:Ljava/lang/Object;

    new-instance v1, Lv0/h;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lv0/h;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    iput-object v1, v0, Lv0/i;->e:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lv0/i;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->n:Lv0/i;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final s()Lv0/l;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lv0/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lv0/l;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lv0/l;

    if-nez v0, :cond_1

    new-instance v0, Lv0/l;

    invoke-direct {v0, p0}, Lv0/l;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lv0/l;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->o:Lv0/l;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final t()Lv0/m;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lv0/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lv0/m;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lv0/m;

    if-nez v0, :cond_1

    new-instance v0, Lv0/m;

    invoke-direct {v0, p0}, Lv0/m;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lv0/m;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->p:Lv0/m;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final u()Lv0/p;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->k:Lv0/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->k:Lv0/p;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->k:Lv0/p;

    if-nez v0, :cond_1

    new-instance v0, Lv0/p;

    invoke-direct {v0, p0}, Lv0/p;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->k:Lv0/p;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->k:Lv0/p;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final v()Lv0/r;
    .locals 3

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lv0/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lv0/r;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lv0/r;

    if-nez v0, :cond_1

    new-instance v0, Lv0/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Lv0/r;->b:Ljava/lang/Object;

    new-instance v1, Lv0/b;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Lv0/b;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    iput-object v1, v0, Lv0/r;->c:Ljava/lang/Object;

    new-instance v1, Lv0/h;

    const/16 v2, 0x14

    invoke-direct {v1, p0, v2}, Lv0/h;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lv0/r;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->m:Lv0/r;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
