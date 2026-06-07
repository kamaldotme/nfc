.class public final LG/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LG/m;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;Landroid/content/Context;Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LG/m;->b:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG/m;->c:Ljava/lang/Object;

    iput-object p2, p0, LG/m;->d:Ljava/lang/Object;

    iput-object p3, p0, LG/m;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LJ/l0;Lv0/e;Landroid/animation/ValueAnimator;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, LG/m;->b:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG/m;->c:Ljava/lang/Object;

    iput-object p3, p0, LG/m;->d:Ljava/lang/Object;

    iput-object p4, p0, LG/m;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/g;Ljava/util/ArrayList;Landroidx/fragment/app/T;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LG/m;->b:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG/m;->e:Ljava/lang/Object;

    iput-object p2, p0, LG/m;->c:Ljava/lang/Object;

    iput-object p3, p0, LG/m;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln0/g;Ln0/m;Lm0/r;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LG/m;->b:I

    const-string v0, "processor"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LG/m;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LG/m;->d:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, LG/m;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, LG/m;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LG/m;->d:Ljava/lang/Object;

    check-cast v0, Ln0/m;

    iget-object v1, p0, LG/m;->e:Ljava/lang/Object;

    check-cast v1, Lm0/r;

    iget-object v2, p0, LG/m;->c:Ljava/lang/Object;

    check-cast v2, Ln0/g;

    invoke-virtual {v2, v0, v1}, Ln0/g;->h(Ln0/m;Lm0/r;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, LG/m;->e:Ljava/lang/Object;

    check-cast v0, Landroid/content/BroadcastReceiver$PendingResult;

    iget-object v1, p0, LG/m;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LG/m;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/Intent;

    :try_start_0
    const-string v3, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    const-string v5, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    invoke-virtual {v2, v5, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v5

    const-string v6, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    invoke-virtual {v2, v6, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v6

    const-string v7, "KEY_NETWORK_STATE_PROXY_ENABLED"

    invoke-virtual {v2, v7, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v4

    sget v7, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:I

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v4, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryNotLowProxy;

    invoke-static {v1, v4, v3}, Lw0/m;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryChargingProxy;

    invoke-static {v1, v3, v5}, Lw0/m;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$StorageNotLowProxy;

    invoke-static {v1, v3, v6}, Lw0/m;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    const-class v3, Landroidx/work/impl/background/systemalarm/ConstraintProxy$NetworkStateProxy;

    invoke-static {v1, v3, v2}, Lw0/m;->a(Landroid/content/Context;Ljava/lang/Class;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    throw v1

    :pswitch_1
    iget-object v0, p0, LG/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, LG/m;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/T;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, LG/m;->e:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    iget-object v0, v0, Landroidx/fragment/app/n;->F:Landroid/view/View;

    iget v1, v1, Landroidx/fragment/app/T;->a:I

    invoke-static {v0, v1}, LX/d;->a(Landroid/view/View;I)V

    :cond_0
    return-void

    :pswitch_2
    iget-object v0, p0, LG/m;->d:Ljava/lang/Object;

    check-cast v0, Lv0/e;

    iget-object v1, p0, LG/m;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, LJ/h0;->h(Landroid/view/View;Lv0/e;)V

    iget-object v0, p0, LG/m;->e:Ljava/lang/Object;

    check-cast v0, Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :pswitch_3
    :try_start_1
    iget-object v0, p0, LG/m;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, LD0/c;

    iget-object v2, p0, LG/m;->d:Ljava/lang/Object;

    check-cast v2, LG/g;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3, v0}, LD0/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v0, p0, LG/m;->e:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
