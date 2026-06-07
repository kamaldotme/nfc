.class public final synthetic LB2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LB2/u;->b:I

    iput-object p2, p0, LB2/u;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 7

    iget-object v0, p0, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    const-string v1, "this$0"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    iget-object v1, v1, Lx0/i;->a:Ljava/lang/Object;

    instance-of v1, v1, Lx0/a;

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v1, v0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    iget-object v1, v1, Landroidx/work/WorkerParameters;->b:Lm0/g;

    const-string v2, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    iget-object v1, v1, Lm0/g;->a:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    const-string v3, "get()"

    invoke-static {v2, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_3

    :cond_2
    iget-object v2, v0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    iget-object v2, v2, Landroidx/work/WorkerParameters;->e:Lm0/B;

    iget-object v3, v0, Lm0/q;->b:Landroid/content/Context;

    iget-object v4, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->f:Landroidx/work/WorkerParameters;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v1, v4}, Lm0/B;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lm0/q;

    move-result-object v1

    iput-object v1, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lm0/q;

    if-nez v1, :cond_3

    sget v1, Lz0/a;->a:I

    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    const-string v1, "future"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm0/m;

    invoke-direct {v1}, Lm0/m;-><init>()V

    invoke-virtual {v0, v1}, Lx0/k;->j(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_3
    iget-object v1, v0, Lm0/q;->b:Landroid/content/Context;

    invoke-static {v1}, Ln0/s;->p0(Landroid/content/Context;)Ln0/s;

    move-result-object v1

    iget-object v2, v1, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v2

    iget-object v3, v0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    iget-object v3, v3, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "id.toString()"

    invoke-static {v3, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lv0/p;->i(Ljava/lang/String;)Lv0/o;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    const-string v1, "future"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lz0/a;->a:I

    new-instance v1, Lm0/m;

    invoke-direct {v1}, Lm0/m;-><init>()V

    invoke-virtual {v0, v1}, Lx0/k;->j(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_4
    new-instance v3, Lf/G;

    iget-object v4, v1, Ln0/s;->m:Lv0/i;

    const-string v5, "workManagerImpl.trackers"

    invoke-static {v4, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lf/G;-><init>(Lv0/i;)V

    iget-object v1, v1, Ln0/s;->g:Lv0/i;

    iget-object v1, v1, Lv0/i;->c:Ljava/lang/Object;

    check-cast v1, Le2/K;

    const-string v4, "workManagerImpl.workTask\u2026r.taskCoroutineDispatcher"

    invoke-static {v1, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2, v1, v0}, Lr0/k;->a(Lf/G;Lv0/o;Le2/K;Lr0/e;)Le2/U;

    move-result-object v1

    iget-object v4, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    new-instance v5, LB2/u;

    const/16 v6, 0x10

    invoke-direct {v5, v6, v1}, LB2/u;-><init>(ILjava/lang/Object;)V

    new-instance v1, Lf/C;

    const/4 v6, 0x1

    invoke-direct {v1, v6}, Lf/C;-><init>(I)V

    invoke-virtual {v4, v5, v1}, Lx0/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v3, v2}, Lf/G;->k(Lv0/o;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget v1, Lz0/a;->a:I

    :try_start_0
    iget-object v1, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lm0/q;

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm0/q;->d()Lx0/k;

    move-result-object v1

    const-string v2, "delegate!!.startWork()"

    invoke-static {v1, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LI1/k;

    const/16 v3, 0x8

    invoke-direct {v2, v0, v3, v1}, LI1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v3, v0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    iget-object v3, v3, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v3}, Lx0/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    sget v1, Lz0/a;->a:I

    iget-object v1, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-boolean v2, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->h:Z

    if-eqz v2, :cond_5

    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    const-string v2, "future"

    invoke-static {v0, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lm0/n;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2}, Lx0/k;->j(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_5
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    const-string v2, "future"

    invoke-static {v0, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lm0/m;

    invoke-direct {v2}, Lm0/m;-><init>()V

    invoke-virtual {v0, v2}, Lx0/k;->j(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    monitor-exit v1

    goto :goto_4

    :goto_2
    monitor-exit v1

    throw v0

    :cond_6
    sget v1, Lz0/a;->a:I

    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    const-string v1, "future"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm0/n;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Lx0/k;->j(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    :goto_3
    sget v1, Lz0/a;->a:I

    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    const-string v1, "future"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm0/m;

    invoke-direct {v1}, Lm0/m;-><init>()V

    invoke-virtual {v0, v1}, Lx0/k;->j(Ljava/lang/Object;)Z

    :goto_4
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    const/4 v0, 0x2

    const/16 v2, 0xd

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget v6, v1, LB2/u;->b:I

    packed-switch v6, :pswitch_data_0

    const-string v0, "$job"

    iget-object v2, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v2, Le2/Q;

    invoke-static {v2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v4}, Le2/Q;->a(Ljava/util/concurrent/CancellationException;)V

    return-void

    :pswitch_0
    invoke-direct/range {p0 .. p0}, LB2/u;->a()V

    return-void

    :pswitch_1
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_9

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-lt v0, v6, :cond_0

    sget-object v0, Lx/f;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V

    goto/16 :goto_5

    :cond_0
    sget-object v6, Lx/f;->a:Ljava/lang/Class;

    const/16 v6, 0x1b

    const/16 v7, 0x1a

    if-eq v0, v7, :cond_2

    if-ne v0, v6, :cond_1

    goto :goto_0

    :cond_1
    move v3, v5

    :cond_2
    :goto_0
    sget-object v8, Lx/f;->f:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_3

    if-nez v8, :cond_3

    goto/16 :goto_4

    :cond_3
    sget-object v3, Lx/f;->e:Ljava/lang/reflect/Method;

    if-nez v3, :cond_4

    sget-object v3, Lx/f;->d:Ljava/lang/reflect/Method;

    if-nez v3, :cond_4

    goto/16 :goto_4

    :cond_4
    :try_start_0
    sget-object v3, Lx/f;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_5

    goto/16 :goto_4

    :cond_5
    sget-object v3, Lx/f;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_6

    goto/16 :goto_4

    :cond_6
    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v15

    new-instance v14, Lx/e;

    invoke-direct {v14, v4}, Lx/e;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v15, v14}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    sget-object v13, Lx/f;->g:Landroid/os/Handler;

    :try_start_1
    new-instance v10, LD0/c;

    const/16 v11, 0xc

    invoke-direct {v10, v14, v11, v9}, LD0/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v13, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eq v0, v7, :cond_8

    if-ne v0, v6, :cond_7

    goto :goto_1

    :cond_7
    :try_start_2
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V

    move-object v6, v13

    move-object v7, v14

    move-object/from16 v18, v15

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v6, v13

    move-object v7, v14

    move-object v3, v15

    goto :goto_3

    :cond_8
    :goto_1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    sget-object v17, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v0, 0x0

    const/4 v5, 0x0

    move-object v6, v13

    move-object/from16 v13, v17

    move-object v7, v14

    move-object v14, v0

    move-object/from16 v18, v15

    move-object v15, v5

    move-object/from16 v16, v17

    :try_start_3
    filled-new-array/range {v9 .. v17}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v8, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    :try_start_4
    new-instance v0, LD0/c;

    move-object/from16 v3, v18

    invoke-direct {v0, v3, v2, v7}, LD0/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object/from16 v3, v18

    :goto_3
    new-instance v5, LD0/c;

    invoke-direct {v5, v3, v2, v7}, LD0/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v6, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    :goto_4
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V

    :cond_9
    :goto_5
    return-void

    :pswitch_2
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/work/CoroutineWorker;

    const-string v2, "this$0"

    invoke-static {v0, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Landroidx/work/CoroutineWorker;->g:Lx0/k;

    iget-object v2, v2, Lx0/i;->a:Ljava/lang/Object;

    instance-of v2, v2, Lx0/a;

    if-eqz v2, :cond_a

    iget-object v0, v0, Landroidx/work/CoroutineWorker;->f:Le2/U;

    invoke-virtual {v0, v4}, Le2/Z;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_a
    return-void

    :pswitch_3
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->L:Lk/i1;

    if-nez v0, :cond_b

    goto :goto_6

    :cond_b
    iget-object v4, v0, Lk/i1;->c:Lj/o;

    :goto_6
    if-eqz v4, :cond_c

    invoke-virtual {v4}, Lj/o;->collapseActionView()Z

    :cond_c
    return-void

    :pswitch_4
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/timepicker/e;

    invoke-virtual {v0}, Lcom/google/android/material/timepicker/e;->f()V

    return-void

    :pswitch_5
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/D;

    const-string v2, "this$0"

    invoke-static {v0, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, v0, Landroidx/lifecycle/D;->c:I

    iget-object v4, v0, Landroidx/lifecycle/D;->g:Landroidx/lifecycle/t;

    if-nez v2, :cond_d

    iput-boolean v3, v0, Landroidx/lifecycle/D;->d:Z

    sget-object v2, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    invoke-virtual {v4, v2}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    :cond_d
    iget v2, v0, Landroidx/lifecycle/D;->b:I

    if-nez v2, :cond_e

    iget-boolean v2, v0, Landroidx/lifecycle/D;->d:Z

    if-eqz v2, :cond_e

    sget-object v2, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    invoke-virtual {v4, v2}, Landroidx/lifecycle/t;->d(Landroidx/lifecycle/l;)V

    iput-boolean v3, v0, Landroidx/lifecycle/D;->e:Z

    :cond_e
    return-void

    :pswitch_6
    iget-object v2, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/emoji2/text/p;

    const-string v3, "fetchFonts result is not OK. ("

    iget-object v4, v2, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    monitor-enter v4

    :try_start_5
    iget-object v6, v2, Landroidx/emoji2/text/p;->i:Lm0/z;

    if-nez v6, :cond_f

    monitor-exit v4

    goto/16 :goto_c

    :catchall_3
    move-exception v0

    goto/16 :goto_e

    :cond_f
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    invoke-virtual {v2}, Landroidx/emoji2/text/p;->c()LG/j;

    move-result-object v4

    iget v6, v4, LG/j;->e:I

    if-ne v6, v0, :cond_10

    iget-object v7, v2, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    monitor-enter v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    monitor-exit v7

    goto :goto_7

    :catchall_4
    move-exception v0

    monitor-exit v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception v0

    goto/16 :goto_a

    :cond_10
    :goto_7
    if-nez v6, :cond_13

    :try_start_9
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    sget v3, LF/k;->a:I

    invoke-static {v0}, LF/j;->a(Ljava/lang/String;)V

    iget-object v0, v2, Landroidx/emoji2/text/p;->d:LU0/e;

    iget-object v3, v2, Landroidx/emoji2/text/p;->b:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v4}, [LG/j;

    move-result-object v0

    sget-object v6, LA/i;->a:Lm0/z;

    invoke-virtual {v6, v3, v0, v5}, Lm0/z;->s(Landroid/content/Context;[LG/j;I)Landroid/graphics/Typeface;

    move-result-object v0

    iget-object v3, v2, Landroidx/emoji2/text/p;->b:Landroid/content/Context;

    iget-object v4, v4, LG/j;->a:Landroid/net/Uri;

    invoke-static {v3, v4}, Lu2/d;->u(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    move-result-object v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    if-eqz v3, :cond_12

    if-eqz v0, :cond_12

    :try_start_a
    const-string v4, "EmojiCompat.MetadataRepo.create"

    invoke-static {v4}, LF/j;->a(Ljava/lang/String;)V

    new-instance v4, Lv0/i;

    invoke-static {v3}, Lu2/d;->y(Ljava/nio/MappedByteBuffer;)LR/b;

    move-result-object v3

    invoke-direct {v4, v0, v3}, Lv0/i;-><init>(Landroid/graphics/Typeface;LR/b;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    :try_start_b
    invoke-static {}, LF/j;->b()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    :try_start_c
    invoke-static {}, LF/j;->b()V

    iget-object v3, v2, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    monitor-enter v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    :try_start_d
    iget-object v0, v2, Landroidx/emoji2/text/p;->i:Lm0/z;

    if-eqz v0, :cond_11

    invoke-virtual {v0, v4}, Lm0/z;->U(Lv0/i;)V

    goto :goto_8

    :catchall_6
    move-exception v0

    goto :goto_9

    :cond_11
    :goto_8
    monitor-exit v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    :try_start_e
    invoke-virtual {v2}, Landroidx/emoji2/text/p;->a()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    goto :goto_c

    :goto_9
    :try_start_f
    monitor-exit v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    :try_start_10
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :catchall_7
    move-exception v0

    :try_start_11
    sget v3, LF/k;->a:I

    invoke-static {}, LF/j;->b()V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "Unable to open file."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception v0

    :try_start_12
    sget v3, LF/k;->a:I

    invoke-static {}, LF/j;->b()V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    :goto_a
    iget-object v3, v2, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    monitor-enter v3

    :try_start_13
    iget-object v4, v2, Landroidx/emoji2/text/p;->i:Lm0/z;

    if-eqz v4, :cond_14

    invoke-virtual {v4, v0}, Lm0/z;->T(Ljava/lang/Throwable;)V

    goto :goto_b

    :catchall_9
    move-exception v0

    goto :goto_d

    :cond_14
    :goto_b
    monitor-exit v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    invoke-virtual {v2}, Landroidx/emoji2/text/p;->a()V

    :goto_c
    return-void

    :goto_d
    :try_start_14
    monitor-exit v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    throw v0

    :goto_e
    :try_start_15
    monitor-exit v4
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    throw v0

    :pswitch_7
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, Lf/f;

    invoke-static {v0}, Lf/f;->a(Lf/f;)V

    return-void

    :pswitch_8
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/j;

    iget-object v2, v0, Landroidx/activity/j;->c:Ljava/lang/Runnable;

    if-eqz v2, :cond_15

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    iput-object v4, v0, Landroidx/activity/j;->c:Ljava/lang/Runnable;

    :cond_15
    return-void

    :pswitch_9
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, LX0/k;

    iget-object v2, v0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v2

    invoke-virtual {v0, v2}, LX0/k;->t(Z)V

    iput-boolean v2, v0, LX0/k;->m:Z

    return-void

    :pswitch_a
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, LX0/e;

    invoke-virtual {v0, v3}, LX0/e;->t(Z)V

    return-void

    :pswitch_b
    iget-object v2, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v2, LF0/i;

    iput-boolean v5, v2, LF0/i;->c:Z

    iget-object v3, v2, LF0/i;->e:Lv/a;

    check-cast v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:LQ/e;

    if-eqz v4, :cond_16

    invoke-virtual {v4}, LQ/e;->f()Z

    move-result v4

    if-eqz v4, :cond_16

    iget v0, v2, LF0/i;->b:I

    invoke-virtual {v2, v0}, LF0/i;->a(I)V

    goto :goto_f

    :cond_16
    iget v4, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    if-ne v4, v0, :cond_17

    iget v0, v2, LF0/i;->b:I

    invoke-virtual {v3, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    :cond_17
    :goto_f
    return-void

    :pswitch_c
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, LJ1/a;

    iget-object v0, v0, LJ1/a;->a:LJ1/b;

    iput-boolean v5, v0, LJ1/b;->b:Z

    invoke-virtual {v0}, LJ1/b;->a()V

    return-void

    :pswitch_d
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "input_method"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v2, v0, v5}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void

    :pswitch_e
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, LI1/g;

    invoke-static {v0}, LI1/g;->a(LI1/g;)V

    return-void

    :pswitch_f
    iget-object v0, v1, LB2/u;->c:Ljava/lang/Object;

    check-cast v0, LB2/w;

    const-string v2, "this$0"

    invoke-static {v0, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_10
    iget-boolean v2, v0, LB2/w;->d:Z

    if-eqz v2, :cond_1d

    iget-object v2, v0, LB2/w;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_18
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LB2/v;

    iget v4, v3, LB2/v;->a:F

    iget v5, v3, LB2/v;->d:F

    add-float/2addr v4, v5

    iput v4, v3, LB2/v;->a:F

    iget v5, v3, LB2/v;->b:F

    iget v6, v3, LB2/v;->e:F

    add-float/2addr v5, v6

    iput v5, v3, LB2/v;->b:F

    iget v5, v3, LB2/v;->c:F

    sub-float v6, v4, v5

    const/4 v7, 0x0

    cmpg-float v6, v6, v7

    const/4 v8, -0x1

    if-ltz v6, :cond_19

    add-float/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    cmpl-float v4, v4, v6

    if-lez v4, :cond_1a

    :cond_19
    iget v4, v3, LB2/v;->d:F

    int-to-float v6, v8

    mul-float/2addr v4, v6

    iput v4, v3, LB2/v;->d:F

    :cond_1a
    iget v4, v3, LB2/v;->b:F

    sub-float v6, v4, v5

    cmpg-float v6, v6, v7

    if-ltz v6, :cond_1b

    add-float/2addr v4, v5

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_18

    :cond_1b
    iget v4, v3, LB2/v;->e:F

    int-to-float v5, v8

    mul-float/2addr v4, v5

    iput v4, v3, LB2/v;->e:F

    goto :goto_11

    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->postInvalidate()V

    const-wide/16 v2, 0x10

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_10

    :cond_1d
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
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
