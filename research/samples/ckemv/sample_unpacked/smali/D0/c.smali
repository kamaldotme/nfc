.class public final LD0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/4 p3, 0x0

    iput p3, p0, LD0/c;->b:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/c;->d:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LD0/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LD0/c;->b:I

    iput-object p1, p0, LD0/c;->c:Ljava/lang/Object;

    iput-object p3, p0, LD0/c;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, LD0/c;->b:I

    iput-object p1, p0, LD0/c;->d:Ljava/lang/Object;

    iput-object p2, p0, LD0/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget v0, p0, LD0/c;->b:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    sget-object v0, Lx/f;->d:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    iget-object v2, p0, LD0/c;->c:Ljava/lang/Object;

    if-eqz v0, :cond_0

    :try_start_1
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v4, "AppCompat recreation"

    filled-new-array {v1, v3, v4}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    sget-object v0, Lx/f;->e:Ljava/lang/reflect/Method;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/RuntimeException;

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unable to stop"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    throw v0

    :catchall_0
    :cond_2
    :goto_1
    return-void

    :pswitch_0
    iget-object v0, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Lx/e;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void

    :pswitch_1
    iget-object v0, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v0, Lx/e;

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    iput-object v1, v0, Lx/e;->a:Ljava/lang/Object;

    return-void

    :pswitch_2
    const-string v0, "Worker was marked important ("

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Lw0/r;

    iget-object v1, v1, Lw0/r;->b:Lx0/k;

    iget-object v1, v1, Lx0/i;->a:Ljava/lang/Object;

    instance-of v1, v1, Lx0/a;

    if-eqz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    :try_start_2
    iget-object v1, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v1, Lx0/k;

    invoke-virtual {v1}, Lx0/i;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lm0/h;

    if-eqz v6, :cond_4

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lw0/r;->h:I

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Lw0/r;

    iget-object v1, v1, Lw0/r;->d:Lv0/o;

    iget-object v1, v1, Lv0/o;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Lw0/r;

    iget-object v1, v0, Lw0/r;->b:Lx0/k;

    iget-object v2, v0, Lw0/r;->f:Lm0/i;

    iget-object v7, v0, Lw0/r;->c:Landroid/content/Context;

    iget-object v0, v0, Lw0/r;->e:Lm0/q;

    iget-object v0, v0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    iget-object v5, v0, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    move-object v0, v2

    check-cast v0, Lw0/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Lx0/k;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    new-instance v9, Lw0/s;

    move-object v2, v9

    move-object v3, v0

    move-object v4, v8

    invoke-direct/range {v2 .. v7}, Lw0/s;-><init>(Lw0/t;Lx0/k;Ljava/util/UUID;Lm0/h;Landroid/content/Context;)V

    iget-object v0, v0, Lw0/t;->a:Lv0/i;

    invoke-virtual {v0, v9}, Lv0/i;->f(Ljava/lang/Runnable;)V

    invoke-virtual {v1, v8}, Lx0/k;->l(La1/a;)Z

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Lw0/r;

    iget-object v0, v0, Lw0/r;->d:Lv0/o;

    iget-object v0, v0, Lv0/o;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") but did not provide ForegroundInfo"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Lw0/r;

    iget-object v1, v1, Lw0/r;->b:Lx0/k;

    invoke-virtual {v1, v0}, Lx0/k;->k(Ljava/lang/Throwable;)Z

    :goto_3
    return-void

    :pswitch_3
    :try_start_3
    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    iget-object v0, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v0, Lf/B;

    iget-object v0, v0, Lf/B;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_4
    iget-object v1, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v1, Lf/B;

    invoke-virtual {v1}, Lf/B;->a()V

    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1

    :catchall_3
    move-exception v0

    iget-object v1, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v1, Lf/B;

    iget-object v1, v1, Lf/B;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_5
    iget-object v2, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v2, Lf/B;

    invoke-virtual {v2}, Lf/B;->a()V

    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw v0

    :catchall_4
    move-exception v0

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    throw v0

    :pswitch_4
    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Lu0/c;

    iget-object v0, v0, Lu0/c;->b:Ln0/s;

    iget-object v0, v0, Ln0/s;->i:Ln0/g;

    iget-object v1, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v2

    :try_start_7
    invoke-virtual {v0, v1}, Ln0/g;->c(Ljava/lang/String;)Ln0/u;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, v0, Ln0/u;->d:Lv0/o;

    monitor-exit v2

    goto :goto_4

    :catchall_5
    move-exception v0

    goto :goto_6

    :cond_5
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lv0/o;->b()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Lu0/c;

    iget-object v1, v1, Lu0/c;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_8
    iget-object v2, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v2, Lu0/c;

    iget-object v2, v2, Lu0/c;->g:Ljava/util/HashMap;

    invoke-static {v0}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v2, Lu0/c;

    iget-object v3, v2, Lu0/c;->i:Lf/G;

    iget-object v4, v2, Lu0/c;->c:Lv0/i;

    iget-object v4, v4, Lv0/i;->c:Ljava/lang/Object;

    check-cast v4, Le2/K;

    invoke-static {v3, v0, v4, v2}, Lr0/k;->a(Lf/G;Lv0/o;Le2/K;Lr0/e;)Le2/U;

    move-result-object v2

    iget-object v3, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v3, Lu0/c;

    iget-object v3, v3, Lu0/c;->h:Ljava/util/HashMap;

    invoke-static {v0}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    goto :goto_5

    :catchall_6
    move-exception v0

    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    throw v0

    :cond_6
    :goto_5
    return-void

    :goto_6
    :try_start_9
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    throw v0

    :pswitch_5
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lo0/a;->e:I

    iget-object v1, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v1, Lv0/o;

    iget-object v2, v1, Lv0/o;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Lo0/a;

    iget-object v0, v0, Lo0/a;->a:Ln0/i;

    filled-new-array {v1}, [Lv0/o;

    move-result-object v1

    invoke-interface {v0, v1}, Ln0/i;->e([Lv0/o;)V

    return-void

    :pswitch_6
    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    iget-object v0, v0, Ln0/u;->q:Lx0/k;

    iget-object v0, v0, Lx0/i;->a:Ljava/lang/Object;

    instance-of v0, v0, Lx0/a;

    if-eqz v0, :cond_7

    goto :goto_7

    :cond_7
    :try_start_a
    iget-object v0, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v0, La1/a;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Ln0/u;->s:I

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Ln0/u;

    iget-object v1, v1, Ln0/u;->d:Lv0/o;

    iget-object v1, v1, Lv0/o;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    iget-object v1, v0, Ln0/u;->q:Lx0/k;

    iget-object v0, v0, Ln0/u;->e:Lm0/q;

    invoke-virtual {v0}, Lm0/q;->d()Lx0/k;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx0/k;->l(La1/a;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    goto :goto_7

    :catchall_7
    move-exception v0

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Ln0/u;

    iget-object v1, v1, Ln0/u;->q:Lx0/k;

    invoke-virtual {v1, v0}, Lx0/k;->k(Ljava/lang/Throwable;)Z

    :goto_7
    return-void

    :pswitch_7
    :try_start_b
    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/work/Worker;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    :catchall_8
    move-exception v0

    iget-object v1, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v1, Lx0/k;

    invoke-virtual {v1, v0}, Lx0/k;->k(Ljava/lang/Throwable;)Z

    return-void

    :pswitch_8
    const/4 v0, 0x0

    :cond_8
    :try_start_c
    iget-object v1, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    goto :goto_8

    :catchall_9
    move-exception v1

    sget-object v2, LO1/j;->b:LO1/j;

    invoke-static {v2, v1}, Le2/v;->h(LO1/i;Ljava/lang/Throwable;)V

    :goto_8
    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Lj2/i;

    invoke-virtual {v1}, Lj2/i;->L()Ljava/lang/Runnable;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    iput-object v2, p0, LD0/c;->c:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    const/16 v2, 0x10

    if-lt v0, v2, :cond_8

    iget-object v2, v1, Lj2/i;->d:Le2/r;

    invoke-virtual {v2}, Le2/r;->K()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v2, v1, p0}, Le2/r;->I(LO1/i;Ljava/lang/Runnable;)V

    :goto_9
    return-void

    :pswitch_9
    iget-object v0, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v0, Le2/e;

    check-cast v0, Le2/f;

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Lf2/d;

    invoke-virtual {v0, v1}, Le2/f;->z(Le2/r;)V

    return-void

    :pswitch_a
    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Le2/e;

    check-cast v0, Le2/f;

    iget-object v1, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v1, Le2/r;

    invoke-virtual {v0, v1}, Le2/f;->z(Le2/r;)V

    return-void

    :pswitch_b
    iget-object v0, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v0, LG/g;

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LG/g;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_c
    iget-object v0, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v0, LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Lz/b;

    if-eqz v0, :cond_a

    iget-object v1, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lz/b;->h(Landroid/graphics/Typeface;)V

    :cond_a
    return-void

    :pswitch_d
    iget-object v0, p0, LD0/c;->d:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LQ/e;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, LQ/e;->f()Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object v0, p0, LD0/c;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p0}, LJ/B;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
