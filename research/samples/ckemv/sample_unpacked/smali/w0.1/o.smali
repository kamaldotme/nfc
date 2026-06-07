.class public final Lw0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Ln0/g;

.field public final c:Ln0/m;

.field public final d:Z

.field public final e:I


# direct methods
.method public constructor <init>(Ln0/g;Ln0/m;ZI)V
    .locals 1

    const-string v0, "processor"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/o;->b:Ln0/g;

    iput-object p2, p0, Lw0/o;->c:Ln0/m;

    iput-boolean p3, p0, Lw0/o;->d:Z

    iput p4, p0, Lw0/o;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-boolean v0, p0, Lw0/o;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw0/o;->b:Ln0/g;

    iget-object v1, p0, Lw0/o;->c:Ln0/m;

    iget v2, p0, Lw0/o;->e:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Ln0/m;->a:Lv0/j;

    iget-object v1, v1, Lv0/j;->a:Ljava/lang/String;

    iget-object v3, v0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    invoke-virtual {v0, v1}, Ln0/g;->b(Ljava/lang/String;)Ln0/u;

    move-result-object v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v2}, Ln0/g;->d(Ln0/u;I)Z

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    iget-object v0, p0, Lw0/o;->b:Ln0/g;

    iget-object v1, p0, Lw0/o;->c:Ln0/m;

    iget v2, p0, Lw0/o;->e:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Ln0/m;->a:Lv0/j;

    iget-object v3, v3, Lv0/j;->a:Ljava/lang/String;

    iget-object v4, v0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v4

    :try_start_2
    iget-object v5, v0, Ln0/g;->f:Ljava/util/HashMap;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v5, v0, Ln0/g;->h:Ljava/util/HashMap;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    if-eqz v5, :cond_3

    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v3}, Ln0/g;->b(Ljava/lang/String;)Ln0/u;

    move-result-object v0

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {v0, v2}, Ln0/g;->d(Ln0/u;I)Z

    goto :goto_1

    :cond_3
    :goto_0
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    const-string v1, "StopWorkRunnable"

    invoke-static {v1}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lw0/o;->c:Ln0/m;

    iget-object v1, v1, Ln0/m;->a:Lv0/j;

    iget-object v1, v1, Lv0/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :goto_2
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method
