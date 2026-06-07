.class public final synthetic Ln0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ln0/g;

.field public final synthetic c:Lv0/j;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Ln0/g;Lv0/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/f;->b:Ln0/g;

    iput-object p2, p0, Ln0/f;->c:Lv0/j;

    const/4 p1, 0x0

    iput-boolean p1, p0, Ln0/f;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Ln0/f;->b:Ln0/g;

    iget-object v1, p0, Ln0/f;->c:Lv0/j;

    iget-boolean v2, p0, Ln0/f;->d:Z

    iget-object v3, v0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v0, v0, Ln0/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln0/c;

    invoke-interface {v4, v1, v2}, Ln0/c;->d(Lv0/j;Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit v3

    return-void

    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
