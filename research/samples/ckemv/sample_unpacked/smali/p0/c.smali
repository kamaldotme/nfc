.class public final Lp0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/c;


# static fields
.field public static final synthetic g:I


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/HashMap;

.field public final d:Ljava/lang/Object;

.field public final e:Lm0/r;

.field public final f:Lv0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "CommandHandler"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm0/r;Lv0/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/c;->b:Landroid/content/Context;

    iput-object p2, p0, Lp0/c;->e:Lm0/r;

    iput-object p3, p0, Lp0/c;->f:Lv0/r;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lp0/c;->c:Ljava/util/HashMap;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/content/Intent;)Lv0/j;
    .locals 4

    new-instance v0, Lv0/j;

    const-string v1, "KEY_WORKSPEC_ID"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_WORKSPEC_GENERATION"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    invoke-direct {v0, v1, p0}, Lv0/j;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static c(Landroid/content/Intent;Lv0/j;)V
    .locals 2

    iget-object v0, p1, Lv0/j;->a:Ljava/lang/String;

    const-string v1, "KEY_WORKSPEC_ID"

    invoke-virtual {p0, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "KEY_WORKSPEC_GENERATION"

    iget p1, p1, Lv0/j;->b:I

    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;ILp0/j;)V
    .locals 10

    const/4 v0, 0x4

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ACTION_CONSTRAINTS_CHANGED"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lp0/e;

    iget-object v1, p0, Lp0/c;->b:Landroid/content/Context;

    iget-object v2, p0, Lp0/c;->e:Lm0/r;

    invoke-direct {p1, v1, v2, p2, p3}, Lp0/e;-><init>(Landroid/content/Context;Lm0/r;ILp0/j;)V

    iget-object p2, p3, Lp0/j;->f:Ln0/s;

    iget-object p2, p2, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p2}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object p2

    invoke-virtual {p2}, Lv0/p;->f()Ljava/util/ArrayList;

    move-result-object p2

    sget v1, Lp0/d;->a:I

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v4

    move v5, v2

    move v6, v5

    move v7, v6

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lv0/o;

    iget-object v8, v8, Lv0/o;->j:Lm0/d;

    iget-boolean v9, v8, Lm0/d;->d:Z

    or-int/2addr v2, v9

    iget-boolean v9, v8, Lm0/d;->b:Z

    or-int/2addr v5, v9

    iget-boolean v9, v8, Lm0/d;->e:Z

    or-int/2addr v6, v9

    iget v8, v8, Lm0/d;->a:I

    if-eq v8, v3, :cond_1

    move v8, v3

    goto :goto_0

    :cond_1
    move v8, v4

    :goto_0
    or-int/2addr v7, v8

    if-eqz v2, :cond_0

    if-eqz v5, :cond_0

    if-eqz v6, :cond_0

    if-eqz v7, :cond_0

    :cond_2
    sget v1, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:I

    new-instance v1, Landroid/content/Intent;

    const-string v3, "androidx.work.impl.background.systemalarm.UpdateProxies"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, p1, Lp0/e;->a:Landroid/content/Context;

    const-class v8, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;

    invoke-direct {v3, v4, v8}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v3, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    invoke-virtual {v2, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    invoke-virtual {v2, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "KEY_NETWORK_STATE_PROXY_ENABLED"

    invoke-virtual {v2, v3, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p1, Lp0/e;->b:Lm0/r;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv0/o;

    invoke-virtual {v5}, Lv0/o;->a()J

    move-result-wide v6

    cmp-long v6, v2, v6

    if-ltz v6, :cond_3

    invoke-virtual {v5}, Lv0/o;->b()Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, p1, Lp0/e;->d:Lf/G;

    invoke-virtual {v6, v5}, Lf/G;->k(Lv0/o;)Z

    move-result v6

    if-eqz v6, :cond_3

    :cond_4
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv0/o;

    iget-object v2, v1, Lv0/o;->a:Ljava/lang/String;

    invoke-static {v1}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    const-class v3, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    invoke-direct {v2, v4, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "ACTION_DELAY_MET"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v2, v1}, Lp0/c;->c(Landroid/content/Intent;Lv0/j;)V

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p3, Lp0/j;->c:Lv0/i;

    iget-object v1, v1, Lv0/i;->e:Ljava/lang/Object;

    check-cast v1, Ly0/a;

    new-instance v3, LF0/b;

    iget v5, p1, Lp0/e;->c:I

    invoke-direct {v3, p3, v2, v5, v0}, LF0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v1, v3}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_6
    const-string v2, "ACTION_RESCHEDULE"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p3, Lp0/j;->f:Ln0/s;

    invoke-virtual {p1}, Ln0/s;->r0()V

    goto/16 :goto_d

    :cond_7
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v5, "KEY_WORKSPEC_ID"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    if-eqz v2, :cond_16

    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_8

    goto/16 :goto_c

    :cond_8
    aget-object v5, v5, v4

    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_9

    goto/16 :goto_c

    :cond_9
    const-string v2, "ACTION_SCHEDULE_WORK"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {p1}, Lp0/c;->b(Landroid/content/Intent;)Lv0/j;

    move-result-object p1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p3, Lp0/j;->f:Ln0/s;

    iget-object v1, v1, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v2

    iget-object v3, p1, Lv0/j;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lv0/p;->i(Ljava/lang/String;)Lv0/o;

    move-result-object v2

    if-nez v2, :cond_a

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    goto/16 :goto_d

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_a
    :try_start_1
    iget v3, v2, Lv0/o;->b:I

    invoke-static {v3}, LX/d;->d(I)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_b
    invoke-virtual {v2}, Lv0/o;->a()J

    move-result-wide v3

    invoke-virtual {v2}, Lv0/o;->b()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v5, p0, Lp0/c;->b:Landroid/content/Context;

    if-nez v2, :cond_c

    :try_start_2
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v1, p1, v3, v4}, Lp0/b;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lv0/j;J)V

    goto :goto_4

    :cond_c
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v1, p1, v3, v4}, Lp0/b;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lv0/j;J)V

    new-instance p1, Landroid/content/Intent;

    const-class v2, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    invoke-direct {p1, v5, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "ACTION_CONSTRAINTS_CHANGED"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v2, p3, Lp0/j;->c:Lv0/i;

    iget-object v2, v2, Lv0/i;->e:Ljava/lang/Object;

    check-cast v2, Ly0/a;

    new-instance v3, LF0/b;

    invoke-direct {v3, p3, p1, p2, v0}, LF0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v2, v3}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    :goto_4
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :goto_5
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    throw p1

    :cond_d
    const-string v0, "ACTION_DELAY_MET"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lp0/c;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_3
    invoke-static {p1}, Lp0/c;->b(Landroid/content/Intent;)Lv0/j;

    move-result-object p1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lp0/c;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    new-instance v1, Lp0/g;

    iget-object v2, p0, Lp0/c;->b:Landroid/content/Context;

    iget-object v3, p0, Lp0/c;->f:Lv0/r;

    invoke-virtual {v3, p1}, Lv0/r;->D(Lv0/j;)Ln0/m;

    move-result-object v3

    invoke-direct {v1, v2, p2, p3, v3}, Lp0/g;-><init>(Landroid/content/Context;ILp0/j;Ln0/m;)V

    iget-object p2, p0, Lp0/c;->c:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lp0/g;->e()V

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_7

    :cond_e
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_6
    monitor-exit v0

    goto/16 :goto_d

    :goto_7
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_f
    const-string p2, "ACTION_STOP_WORK"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_14

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string p2, "KEY_WORKSPEC_ID"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "KEY_WORKSPEC_GENERATION"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Lp0/c;->f:Lv0/r;

    if-eqz v1, :cond_10

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Lv0/j;

    invoke-direct {v1, p2, p1}, Lv0/j;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v1}, Lv0/r;->A(Lv0/j;)Ln0/m;

    move-result-object p1

    if-eqz p1, :cond_11

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    invoke-virtual {v2, p2}, Lv0/r;->z(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    :cond_11
    :goto_8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_17

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln0/m;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p3, Lp0/j;->k:Lv0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "workSpecId"

    invoke-static {p2, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, -0x200

    invoke-virtual {v0, p2, v1}, Lv0/c;->p(Ln0/m;I)V

    iget-object v0, p3, Lp0/j;->f:Ln0/s;

    iget-object v0, v0, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    sget v1, Lp0/b;->a:I

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->q()Lv0/i;

    move-result-object v0

    iget-object p2, p2, Ln0/m;->a:Lv0/j;

    invoke-virtual {v0, p2}, Lv0/i;->i(Lv0/j;)Lv0/g;

    move-result-object v1

    if-eqz v1, :cond_13

    iget v1, v1, Lv0/g;->c:I

    iget-object v2, p0, Lp0/c;->b:Landroid/content/Context;

    invoke-static {v2, p2, v1}, Lp0/b;->a(Landroid/content/Context;Lv0/j;I)V

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {p2}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lv0/i;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->b()V

    iget-object v0, v0, Lv0/i;->d:Ljava/lang/Object;

    check-cast v0, Lv0/h;

    invoke-virtual {v0}, La0/m;->a()Lf0/i;

    move-result-object v2

    iget-object v5, p2, Lv0/j;->a:Ljava/lang/String;

    if-nez v5, :cond_12

    invoke-interface {v2, v3}, Le0/d;->g(I)V

    goto :goto_a

    :cond_12
    invoke-interface {v2, v5, v3}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_a
    iget v5, p2, Lv0/j;->b:I

    int-to-long v5, v5

    const/4 v7, 0x2

    invoke-interface {v2, v7, v5, v6}, Le0/d;->x(IJ)V

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_4
    invoke-virtual {v2}, Lf0/i;->b()I

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v0, v2}, La0/m;->p(Lf0/i;)V

    goto :goto_b

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v0, v2}, La0/m;->p(Lf0/i;)V

    throw p1

    :cond_13
    :goto_b
    invoke-virtual {p3, p2, v4}, Lp0/j;->d(Lv0/j;Z)V

    goto/16 :goto_9

    :cond_14
    const-string p2, "ACTION_EXECUTION_COMPLETED"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_15

    invoke-static {p1}, Lp0/c;->b(Landroid/content/Intent;)Lv0/j;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p3

    const-string v0, "KEY_NEEDS_RESCHEDULE"

    invoke-virtual {p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p2, p3}, Lp0/c;->d(Lv0/j;Z)V

    goto :goto_d

    :cond_15
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_d

    :cond_16
    :goto_c
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_17
    :goto_d
    return-void
.end method

.method public final d(Lv0/j;Z)V
    .locals 3

    iget-object v0, p0, Lp0/c;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp0/c;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp0/g;

    iget-object v2, p0, Lp0/c;->f:Lv0/r;

    invoke-virtual {v2, p1}, Lv0/r;->A(Lv0/j;)Ln0/m;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p2}, Lp0/g;->f(Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
