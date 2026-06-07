.class public final Lt0/a;
.super Lt0/e;
.source "SourceFile"


# instance fields
.field public final f:Lf/s;

.field public final synthetic g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lv0/i;I)V
    .locals 0

    iput p3, p0, Lt0/a;->g:I

    const-string p3, "taskExecutor"

    invoke-static {p2, p3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lt0/e;-><init>(Landroid/content/Context;Lv0/i;)V

    new-instance p1, Lf/s;

    const/4 p2, 0x2

    invoke-direct {p1, p2, p0}, Lf/s;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lt0/a;->f:Lf/s;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    const/4 v0, -0x1

    const-string v1, "status"

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget-object v6, p0, Lt0/e;->b:Landroid/content/Context;

    iget v7, p0, Lt0/a;->g:I

    packed-switch v7, :pswitch_data_0

    invoke-virtual {p0}, Lt0/a;->e()Landroid/content/IntentFilter;

    move-result-object v0

    invoke-virtual {v6, v5, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x46671f94

    if-eq v1, v2, :cond_3

    const v2, -0x2b8fb65c

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "android.intent.action.DEVICE_STORAGE_OK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move v3, v4

    goto :goto_1

    :cond_3
    const-string v1, "android.intent.action.DEVICE_STORAGE_LOW"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    :cond_4
    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v7, Landroid/content/IntentFilter;

    invoke-direct {v7, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/c;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_5
    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v5, "level"

    invoke-virtual {v2, v5, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    const-string v6, "scale"

    invoke-virtual {v2, v6, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    int-to-float v2, v5

    int-to-float v0, v0

    div-float/2addr v2, v0

    if-eq v1, v4, :cond_6

    const v0, 0x3e19999a    # 0.15f

    cmpl-float v0, v2, v0

    if-lez v0, :cond_7

    :cond_6
    move v3, v4

    :cond_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_2
    return-object v0

    :pswitch_1
    new-instance v7, Landroid/content/IntentFilter;

    invoke-direct {v7, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v2

    if-nez v2, :cond_8

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/b;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_3

    :cond_8
    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    const/4 v1, 0x5

    if-ne v0, v1, :cond_a

    :cond_9
    move v3, v4

    :cond_a
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 3

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/d;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lt0/a;->e()Landroid/content/IntentFilter;

    move-result-object v0

    iget-object v1, p0, Lt0/e;->b:Landroid/content/Context;

    iget-object v2, p0, Lt0/a;->f:Lf/s;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final d()V
    .locals 2

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/d;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lt0/a;->f:Lf/s;

    iget-object v1, p0, Lt0/e;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public final e()Landroid/content/IntentFilter;
    .locals 2

    iget v0, p0, Lt0/a;->g:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.DEVICE_STORAGE_OK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.DEVICE_STORAGE_LOW"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.BATTERY_OKAY"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.BATTERY_LOW"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0

    :pswitch_1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.os.action.CHARGING"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.os.action.DISCHARGING"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "intent"

    iget v1, p0, Lt0/a;->g:I

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/j;->a:I

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x46671f94

    if-eq v0, v1, :cond_3

    const v1, -0x2b8fb65c

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "android.intent.action.DEVICE_STORAGE_OK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lt0/e;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    const-string v0, "android.intent.action.DEVICE_STORAGE_LOW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lt0/e;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/c;->a:I

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x7606c095    # -6.0004207E-33f

    if-eq v0, v1, :cond_9

    const v1, 0x1d398bfd

    if-eq v0, v1, :cond_7

    goto :goto_1

    :cond_7
    const-string v0, "android.intent.action.BATTERY_LOW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lt0/e;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_9
    const-string v0, "android.intent.action.BATTERY_OKAY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lt0/e;->b(Ljava/lang/Object;)V

    :cond_b
    :goto_1
    return-void

    :pswitch_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_c

    goto :goto_2

    :cond_c
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lt0/b;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v0, "android.intent.action.ACTION_POWER_CONNECTED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_2

    :cond_d
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lt0/e;->b(Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_1
    const-string v0, "android.os.action.CHARGING"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_2

    :cond_e
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lt0/e;->b(Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_2
    const-string v0, "android.os.action.DISCHARGING"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_2

    :cond_f
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lt0/e;->b(Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_3
    const-string v0, "android.intent.action.ACTION_POWER_DISCONNECTED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_2

    :cond_10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lt0/e;->b(Ljava/lang/Object;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x7073f927 -> :sswitch_3
        -0x3465cce -> :sswitch_2
        0x388694fe -> :sswitch_1
        0x3cbf870b -> :sswitch_0
    .end sparse-switch
.end method
