.class public final Lf/s;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lf/s;->a:I

    iput-object p2, p0, Lf/s;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    iget v0, p0, Lf/s;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lf/s;->b:Ljava/lang/Object;

    check-cast p1, Lt0/a;

    invoke-virtual {p1, p2}, Lt0/a;->f(Landroid/content/Intent;)V

    return-void

    :pswitch_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "plugged"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lf/s;->b:Ljava/lang/Object;

    check-cast p2, Ln1/f;

    iget-object p2, p2, Ln1/f;->d:Landroid/os/Handler;

    new-instance v0, LJ1/e;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, v1}, LJ1/e;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void

    :pswitch_1
    iget-object p1, p0, Lf/s;->b:Ljava/lang/Object;

    check-cast p1, LA1/f;

    invoke-virtual {p1}, LA1/f;->i()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
