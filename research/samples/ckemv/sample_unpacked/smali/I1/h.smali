.class public final synthetic LI1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LI1/l;


# direct methods
.method public synthetic constructor <init>(LI1/l;I)V
    .locals 0

    iput p2, p0, LI1/h;->b:I

    iput-object p1, p0, LI1/h;->c:LI1/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, LI1/h;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LI1/h;->c:LI1/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.zxing.client.android.SCAN"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "TIMEOUT"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v2, v0, LI1/l;->a:Landroid/app/Activity;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v0}, LI1/l;->a()V

    return-void

    :pswitch_0
    iget-object v0, p0, LI1/h;->c:LI1/l;

    iget-object v0, v0, LI1/l;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
