.class public final Lw0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Lw0/x;

.field public final c:Lv0/j;


# direct methods
.method public constructor <init>(Lw0/x;Lv0/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/w;->b:Lw0/x;

    iput-object p2, p0, Lw0/w;->c:Lv0/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lw0/w;->b:Lw0/x;

    iget-object v0, v0, Lw0/x;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw0/w;->b:Lw0/x;

    iget-object v1, v1, Lw0/x;->b:Ljava/util/HashMap;

    iget-object v2, p0, Lw0/w;->c:Lv0/j;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw0/w;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lw0/w;->b:Lw0/x;

    iget-object v1, v1, Lw0/x;->c:Ljava/util/HashMap;

    iget-object v2, p0, Lw0/w;->c:Lv0/j;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw0/v;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lw0/w;->c:Lv0/j;

    check-cast v1, Lp0/g;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v3

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lp0/g;->i:Lf/B;

    new-instance v3, Lp0/f;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lp0/f;-><init>(Lp0/g;I)V

    invoke-virtual {v2, v3}, Lf/B;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    iget-object v2, p0, Lw0/w;->c:Lv0/j;

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
