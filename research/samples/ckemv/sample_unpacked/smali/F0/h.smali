.class public final LF0/h;
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

    .line 1
    iput p1, p0, LF0/h;->b:I

    iput-object p2, p0, LF0/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ln0/u;Ljava/lang/String;)V
    .locals 0

    const/16 p2, 0x10

    iput p2, p0, LF0/h;->b:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/h;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()LM1/h;
    .locals 4

    iget-object v0, p0, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, La0/f;

    new-instance v1, LM1/h;

    invoke-direct {v1}, LM1/h;-><init>()V

    iget-object v0, v0, La0/f;->a:Landroidx/work/impl/WorkDatabase;

    new-instance v2, Ld1/f;

    const-string v3, "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"

    invoke-direct {v2, v3}, Ld1/f;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v0

    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LM1/h;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    invoke-static {v0, v3}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v1}, Lm0/z;->c(LM1/h;)LM1/h;

    move-result-object v0

    iget-object v1, v0, LM1/h;->b:LM1/e;

    invoke-virtual {v1}, LM1/e;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_3

    iget-object v1, p0, LF0/h;->c:Ljava/lang/Object;

    check-cast v1, La0/f;

    iget-object v1, v1, La0/f;->g:Lf0/i;

    const-string v2, "Required value was null."

    if-eqz v1, :cond_2

    iget-object v1, p0, LF0/h;->c:Ljava/lang/Object;

    check-cast v1, La0/f;

    iget-object v1, v1, La0/f;->g:Lf0/i;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lf0/i;->b()I

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    return-object v0

    :goto_2
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    const-wide/16 v4, -0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    iget v9, v1, LF0/h;->b:I

    packed-switch v9, :pswitch_data_0

    :cond_0
    :goto_0
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp2/d;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2}, Lp2/d;->c()Lp2/a;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v2

    if-nez v3, :cond_1

    return-void

    :cond_1
    iget-object v2, v3, Lp2/a;->c:Lp2/c;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp2/d;

    sget-object v0, Lp2/d;->i:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v0, v2, Lp2/c;->a:Lp2/d;

    iget-object v0, v0, Lp2/d;->a:Lf/G;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    const-string v0, "starting"

    invoke-static {v3, v2, v0}, Lu2/l;->a(Lp2/a;Lp2/c;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-wide v8, v4

    :goto_1
    :try_start_1
    invoke-static {v6, v3}, Lp2/d;->a(Lp2/d;Lp2/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v7, :cond_0

    iget-object v0, v2, Lp2/c;->a:Lp2/d;

    iget-object v0, v0, Lp2/d;->a:Lf/G;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long/2addr v6, v8

    invoke-static {v6, v7}, Lu2/l;->i(J)Ljava/lang/String;

    move-result-object v0

    const-string v6, "finished run in "

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v0}, Lu2/l;->a(Lp2/a;Lp2/c;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v4, v0

    :try_start_2
    iget-object v0, v6, Lp2/d;->a:Lf/G;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    if-eqz v7, :cond_3

    iget-object v4, v2, Lp2/c;->a:Lp2/d;

    iget-object v4, v4, Lp2/d;->a:Lf/G;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v8

    invoke-static {v4, v5}, Lu2/l;->i(J)Ljava/lang/String;

    move-result-object v4

    const-string v5, "failed a run in "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lu2/l;->a(Lp2/a;Lp2/c;Ljava/lang/String;)V

    :cond_3
    throw v0

    :catchall_2
    move-exception v0

    move-object v3, v0

    monitor-exit v2

    throw v3

    :pswitch_0
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ln0/u;

    :try_start_3
    iget-object v0, v2, Ln0/u;->q:Lx0/k;

    invoke-virtual {v0}, Lx0/i;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/p;

    if-nez v0, :cond_4

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v3, Ln0/u;->s:I

    iget-object v3, v2, Ln0/u;->d:Lv0/o;

    iget-object v3, v3, Lv0/o;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :catchall_3
    move-exception v0

    goto :goto_4

    :cond_4
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v3

    sget v4, Ln0/u;->s:I

    iget-object v4, v2, Ln0/u;->d:Lv0/o;

    iget-object v4, v4, Lv0/o;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, v2, Ln0/u;->g:Lm0/p;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_2
    invoke-virtual {v2}, Ln0/u;->b()V

    goto :goto_3

    :catch_0
    :try_start_4
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v3, Ln0/u;->s:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :catch_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v3, Ln0/u;->s:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_2

    :goto_3
    return-void

    :goto_4
    invoke-virtual {v2}, Ln0/u;->b()V

    throw v0

    :pswitch_1
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/work/Worker;

    :try_start_5
    invoke-virtual {v2}, Landroidx/work/Worker;->f()Lm0/o;

    move-result-object v0

    iget-object v3, v2, Landroidx/work/Worker;->f:Lx0/k;

    invoke-virtual {v3, v0}, Lx0/k;->j(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v0

    iget-object v2, v2, Landroidx/work/Worker;->f:Lx0/k;

    invoke-virtual {v2, v0}, Lx0/k;->k(Ljava/lang/Throwable;)Z

    :goto_5
    return-void

    :pswitch_2
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->b:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_5

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->u:Lk/j;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lk/j;->l()Z

    :cond_5
    return-void

    :pswitch_3
    const/4 v0, 0x0

    iget-object v2, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v2, Lk/u0;

    iput-object v0, v2, Lk/u0;->m:LF0/h;

    invoke-virtual {v2}, Lk/u0;->drawableStateChanged()V

    return-void

    :pswitch_4
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/y;

    iget-object v2, v0, Landroidx/lifecycle/y;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_6
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/y;

    iget-object v0, v0, Landroidx/lifecycle/y;->f:Ljava/lang/Object;

    iget-object v3, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v3, Landroidx/lifecycle/y;

    sget-object v4, Landroidx/lifecycle/y;->k:Ljava/lang/Object;

    iput-object v4, v3, Landroidx/lifecycle/y;->f:Ljava/lang/Object;

    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    iget-object v2, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/y;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/y;->e(Ljava/lang/Object;)V

    return-void

    :catchall_5
    move-exception v0

    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    throw v0

    :pswitch_5
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    invoke-virtual {v0, v7}, Landroidx/fragment/app/B;->w(Z)Z

    return-void

    :pswitch_6
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/k;

    iget-object v2, v0, Landroidx/fragment/app/k;->V:Landroidx/fragment/app/i;

    iget-object v0, v0, Landroidx/fragment/app/k;->d0:Landroid/app/Dialog;

    invoke-virtual {v2, v0}, Landroidx/fragment/app/i;->onDismiss(Landroid/content/DialogInterface;)V

    return-void

    :pswitch_7
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v2, 0x4

    invoke-static {v0, v2}, Landroidx/fragment/app/I;->a(Ljava/util/ArrayList;I)V

    return-void

    :pswitch_8
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/d;

    iget-object v2, v0, Landroidx/fragment/app/d;->a:Landroid/view/ViewGroup;

    iget-object v3, v0, Landroidx/fragment/app/d;->b:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, v0, Landroidx/fragment/app/d;->c:Landroidx/fragment/app/e;

    invoke-virtual {v0}, LA1/f;->d()V

    return-void

    :pswitch_9
    :try_start_8
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/k;

    invoke-static {v0}, Landroidx/activity/k;->f(Landroidx/activity/k;)V
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_8

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_7

    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference"

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_8

    :cond_6
    throw v0

    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Can not perform this action after onSaveInstanceState"

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    :goto_8
    return-void

    :cond_7
    throw v0

    :pswitch_a
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, La0/f;

    iget-object v0, v0, La0/f;->a:Landroidx/work/impl/WorkDatabase;

    iget-object v0, v0, Landroidx/work/impl/WorkDatabase;->h:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    const-string v0, "readWriteLock.readLock()"

    invoke-static {v2, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_9
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, La0/f;

    invoke-virtual {v0}, La0/f;->a()Z

    move-result v0
    :try_end_9
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    if-nez v0, :cond_8

    :goto_9
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, La0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_e

    :cond_8
    :try_start_a
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, La0/f;

    iget-object v0, v0, La0/f;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_9

    :cond_9
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, La0/f;

    iget-object v0, v0, La0/f;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    invoke-interface {v0}, Le0/c;->s()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->G()Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_9

    :cond_a
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, La0/f;

    iget-object v0, v0, La0/f;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    invoke-interface {v0}, Le0/c;->s()Lf0/c;

    move-result-object v3

    invoke-virtual {v3}, Lf0/c;->b()V
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :try_start_b
    invoke-virtual/range {p0 .. p0}, LF0/h;->a()LM1/h;

    move-result-object v0

    invoke-virtual {v3}, Lf0/c;->M()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    :try_start_c
    invoke-virtual {v3}, Lf0/c;->o()V
    :try_end_c
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :goto_a
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v2, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v2, La0/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_b

    :catchall_6
    move-exception v0

    goto :goto_f

    :catchall_7
    move-exception v0

    :try_start_d
    invoke-virtual {v3}, Lf0/c;->o()V

    throw v0
    :try_end_d
    .catch Ljava/lang/IllegalStateException; {:try_start_d .. :try_end_d} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    :catch_4
    :try_start_e
    sget-object v0, LL1/v;->b:LL1/v;

    goto :goto_a

    :catch_5
    sget-object v0, LL1/v;->b:LL1/v;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto :goto_a

    :goto_b
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v7

    if-eqz v2, :cond_c

    iget-object v2, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v2, La0/f;

    iget-object v3, v2, La0/f;->i:Lm/f;

    monitor-enter v3

    :try_start_f
    iget-object v2, v2, La0/f;->i:Lm/f;

    invoke-virtual {v2}, Lm/f;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_c
    move-object v4, v2

    check-cast v4, Lm/b;

    invoke-virtual {v4}, Lm/b;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v4}, Lm/b;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La0/e;

    invoke-virtual {v4, v0}, La0/e;->a(Ljava/util/Set;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    goto :goto_c

    :catchall_8
    move-exception v0

    goto :goto_d

    :cond_b
    monitor-exit v3

    goto :goto_e

    :goto_d
    monitor-exit v3

    throw v0

    :cond_c
    :goto_e
    return-void

    :goto_f
    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v2, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v2, La0/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0

    :pswitch_b
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y0()Z

    return-void

    :pswitch_c
    iget-object v4, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v5, :cond_19

    check-cast v5, LZ/i;

    iget-object v9, v5, LZ/i;->h:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    xor-int/2addr v10, v7

    iget-object v11, v5, LZ/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    xor-int/2addr v12, v7

    iget-object v13, v5, LZ/i;->k:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v14

    xor-int/2addr v14, v7

    iget-object v15, v5, LZ/i;->i:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v16

    xor-int/lit8 v16, v16, 0x1

    if-nez v10, :cond_d

    if-nez v12, :cond_d

    if-nez v16, :cond_d

    if-nez v14, :cond_d

    goto/16 :goto_17

    :cond_d
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_10
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    iget-wide v2, v5, LZ/D;->d:J

    if-eqz v18, :cond_e

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v6, v18

    check-cast v6, LZ/W;

    iget-object v7, v6, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v8

    iget-object v0, v5, LZ/i;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v2, LZ/d;

    invoke-direct {v2, v5, v6, v8, v7}, LZ/d;-><init>(LZ/i;LZ/W;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    const/4 v7, 0x1

    const/4 v8, 0x0

    goto :goto_10

    :cond_e
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    if-eqz v12, :cond_10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v5, LZ/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    new-instance v6, LZ/c;

    const/4 v7, 0x0

    invoke-direct {v6, v5, v0, v7}, LZ/c;-><init>(LZ/i;Ljava/util/ArrayList;I)V

    if-eqz v10, :cond_f

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ/h;

    iget-object v0, v0, LZ/h;->a:LZ/W;

    iget-object v0, v0, LZ/W;->a:Landroid/view/View;

    sget-object v7, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, v6, v2, v3}, LJ/B;->n(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto :goto_11

    :cond_f
    invoke-virtual {v6}, LZ/c;->run()V

    :cond_10
    :goto_11
    if-eqz v14, :cond_12

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v5, LZ/i;->n:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    new-instance v6, LZ/c;

    const/4 v7, 0x1

    invoke-direct {v6, v5, v0, v7}, LZ/c;-><init>(LZ/i;Ljava/util/ArrayList;I)V

    if-eqz v10, :cond_11

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ/g;

    iget-object v0, v0, LZ/g;->a:LZ/W;

    iget-object v0, v0, LZ/W;->a:Landroid/view/View;

    sget-object v7, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, v6, v2, v3}, LJ/B;->n(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto :goto_12

    :cond_11
    invoke-virtual {v6}, LZ/c;->run()V

    :cond_12
    :goto_12
    if-eqz v16, :cond_18

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v5, LZ/i;->l:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    new-instance v6, LZ/c;

    const/4 v7, 0x2

    invoke-direct {v6, v5, v0, v7}, LZ/c;-><init>(LZ/i;Ljava/util/ArrayList;I)V

    if-nez v10, :cond_14

    if-nez v12, :cond_14

    if-eqz v14, :cond_13

    goto :goto_13

    :cond_13
    invoke-virtual {v6}, LZ/c;->run()V

    goto :goto_17

    :cond_14
    :goto_13
    if-eqz v10, :cond_15

    goto :goto_14

    :cond_15
    const-wide/16 v2, 0x0

    :goto_14
    if-eqz v12, :cond_16

    iget-wide v7, v5, LZ/D;->e:J

    goto :goto_15

    :cond_16
    const-wide/16 v7, 0x0

    :goto_15
    if-eqz v14, :cond_17

    iget-wide v9, v5, LZ/D;->f:J

    goto :goto_16

    :cond_17
    const-wide/16 v9, 0x0

    :goto_16
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    add-long/2addr v7, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ/W;

    iget-object v0, v0, LZ/W;->a:Landroid/view/View;

    sget-object v2, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, v6, v7, v8}, LJ/B;->n(Landroid/view/View;Ljava/lang/Runnable;J)V

    :cond_18
    :goto_17
    const/4 v0, 0x0

    goto :goto_18

    :cond_19
    move v0, v8

    :goto_18
    iput-boolean v0, v4, Landroidx/recyclerview/widget/RecyclerView;->j0:Z

    return-void

    :pswitch_d
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, LZ/l;

    iget v2, v0, LZ/l;->A:I

    iget-object v3, v0, LZ/l;->z:Landroid/animation/ValueAnimator;

    const/4 v4, 0x1

    if-eq v2, v4, :cond_1a

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1b

    goto :goto_19

    :cond_1a
    const/4 v4, 0x2

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1b
    const/4 v2, 0x3

    iput v2, v0, LZ/l;->A:I

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    new-array v2, v4, [F

    const/4 v6, 0x0

    aput v0, v2, v6

    const/4 v0, 0x0

    const/4 v4, 0x1

    aput v0, v2, v4

    invoke-virtual {v3, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    const/16 v0, 0x1f4

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->start()V

    :goto_19
    return-void

    :pswitch_e
    move v6, v8

    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, LQ/e;

    invoke-virtual {v0, v6}, LQ/e;->m(I)V

    return-void

    :pswitch_f
    move v6, v8

    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, LN/g;

    iget-boolean v2, v0, LN/g;->p:Z

    if-nez v2, :cond_1c

    goto/16 :goto_1c

    :cond_1c
    iget-boolean v2, v0, LN/g;->n:Z

    iget-object v3, v0, LN/g;->b:LN/a;

    if-eqz v2, :cond_1d

    iput-boolean v6, v0, LN/g;->n:Z

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    iput-wide v6, v3, LN/a;->e:J

    iput-wide v4, v3, LN/a;->g:J

    iput-wide v6, v3, LN/a;->f:J

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, v3, LN/a;->h:F

    :cond_1d
    iget-wide v4, v3, LN/a;->g:J

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-lez v2, :cond_1e

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v4

    iget-wide v6, v3, LN/a;->g:J

    iget v2, v3, LN/a;->i:I

    int-to-long v8, v2

    add-long/2addr v6, v8

    cmp-long v2, v4, v6

    if-lez v2, :cond_1e

    :goto_1a
    const/4 v2, 0x0

    goto :goto_1b

    :cond_1e
    invoke-virtual {v0}, LN/g;->e()Z

    move-result v2

    if-nez v2, :cond_1f

    goto :goto_1a

    :goto_1b
    iput-boolean v2, v0, LN/g;->p:Z

    goto :goto_1c

    :cond_1f
    const/4 v2, 0x0

    iget-boolean v4, v0, LN/g;->o:Z

    iget-object v5, v0, LN/g;->d:Landroid/view/View;

    if-eqz v4, :cond_20

    iput-boolean v2, v0, LN/g;->o:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-wide v6, v8

    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    :cond_20
    iget-wide v6, v3, LN/a;->f:J

    const-wide/16 v8, 0x0

    cmp-long v2, v6, v8

    if-eqz v2, :cond_21

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, LN/a;->a(J)F

    move-result v2

    const/high16 v4, -0x3f800000    # -4.0f

    mul-float/2addr v4, v2

    mul-float/2addr v4, v2

    const/high16 v8, 0x40800000    # 4.0f

    mul-float/2addr v2, v8

    add-float/2addr v2, v4

    iget-wide v8, v3, LN/a;->f:J

    sub-long v8, v6, v8

    iput-wide v6, v3, LN/a;->f:J

    long-to-float v4, v8

    mul-float/2addr v4, v2

    iget v2, v3, LN/a;->d:F

    mul-float/2addr v4, v2

    float-to-int v2, v4

    iget-object v0, v0, LN/g;->r:Landroid/widget/ListView;

    invoke-static {v0, v2}, LN/h;->b(Landroid/widget/ListView;I)V

    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v5, v1}, LJ/B;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    :goto_1c
    return-void

    :cond_21
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_10
    iget-object v0, v1, LF0/h;->c:Ljava/lang/Object;

    check-cast v0, LF0/i;

    const/4 v2, 0x0

    iput-boolean v2, v0, LF0/i;->c:Z

    iget-object v2, v0, LF0/i;->e:Lv/a;

    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:LQ/e;

    if-eqz v3, :cond_22

    invoke-virtual {v3}, LQ/e;->f()Z

    move-result v3

    if-eqz v3, :cond_22

    iget v2, v0, LF0/i;->b:I

    invoke-virtual {v0, v2}, LF0/i;->a(I)V

    goto :goto_1d

    :cond_22
    iget v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_23

    iget v0, v0, LF0/i;->b:I

    invoke-virtual {v2, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    :cond_23
    :goto_1d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
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
