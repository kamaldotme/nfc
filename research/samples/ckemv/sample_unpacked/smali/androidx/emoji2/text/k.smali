.class public final synthetic Landroidx/emoji2/text/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Landroidx/emoji2/text/k;->b:I

    iput-object p1, p0, Landroidx/emoji2/text/k;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/emoji2/text/k;->d:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/emoji2/text/k;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget v0, p0, Landroidx/emoji2/text/k;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/emoji2/text/k;->c:Ljava/lang/Object;

    check-cast v0, Ln0/g;

    iget-object v1, p0, Landroidx/emoji2/text/k;->d:Ljava/lang/Object;

    check-cast v1, La1/a;

    iget-object v2, p0, Landroidx/emoji2/text/k;->e:Ljava/lang/Object;

    check-cast v2, Ln0/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x1

    :goto_0
    iget-object v3, v0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v3

    :try_start_1
    iget-object v4, v2, Ln0/u;->d:Lv0/o;

    invoke-static {v4}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v4

    iget-object v5, v4, Lv0/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ln0/g;->c(Ljava/lang/String;)Ln0/u;

    move-result-object v6

    if-ne v6, v2, :cond_0

    invoke-virtual {v0, v5}, Ln0/g;->b(Ljava/lang/String;)Ln0/u;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    :goto_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Ln0/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/c;

    invoke-interface {v2, v4, v1}, Ln0/c;->d(Lv0/j;Z)V

    goto :goto_2

    :cond_1
    monitor-exit v3

    return-void

    :goto_3
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_0
    iget-object v0, p0, Landroidx/emoji2/text/k;->c:Ljava/lang/Object;

    check-cast v0, LA/h;

    iget-object v1, p0, Landroidx/emoji2/text/k;->d:Ljava/lang/Object;

    check-cast v1, Lm0/z;

    iget-object v2, p0, Landroidx/emoji2/text/k;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2
    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, La/a;->m(Landroid/content/Context;)Landroidx/emoji2/text/q;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v3, v0, LZ/w;->b:Ljava/lang/Object;

    check-cast v3, Landroidx/emoji2/text/i;

    check-cast v3, Landroidx/emoji2/text/p;

    iget-object v4, v3, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iput-object v2, v3, Landroidx/emoji2/text/p;->g:Ljava/util/concurrent/Executor;

    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    iget-object v0, v0, LZ/w;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/emoji2/text/i;

    new-instance v3, Landroidx/emoji2/text/l;

    invoke-direct {v3, v1, v2}, Landroidx/emoji2/text/l;-><init>(Lm0/z;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v3}, Landroidx/emoji2/text/i;->j(Lm0/z;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    throw v0

    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_4
    invoke-virtual {v1, v0}, Lm0/z;->T(Ljava/lang/Throwable;)V

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
