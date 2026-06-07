.class public final synthetic LJ1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LJ1/g;

.field public final synthetic d:LA/h;


# direct methods
.method public synthetic constructor <init>(LJ1/g;LA/h;I)V
    .locals 0

    iput p3, p0, LJ1/d;->b:I

    iput-object p1, p0, LJ1/d;->c:LJ1/g;

    iput-object p2, p0, LJ1/d;->d:LA/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, LJ1/d;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LJ1/d;->c:LJ1/g;

    iget-object v0, v0, LJ1/g;->c:LJ1/i;

    iget-object v1, v0, LJ1/i;->a:Landroid/hardware/Camera;

    if-eqz v1, :cond_0

    iget-boolean v2, v0, LJ1/i;->e:Z

    if-eqz v2, :cond_0

    iget-object v0, v0, LJ1/i;->l:LJ1/h;

    iget-object v2, p0, LJ1/d;->d:LA/h;

    iput-object v2, v0, LJ1/h;->a:LA/h;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setOneShotPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, LJ1/d;->c:LJ1/g;

    iget-boolean v1, v0, LJ1/g;->f:Z

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, LJ1/d;

    iget-object v2, p0, LJ1/d;->d:LA/h;

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, LJ1/d;-><init>(LJ1/g;LA/h;I)V

    iget-object v0, v0, LJ1/g;->a:LC1/e;

    invoke-virtual {v0, v1}, LC1/e;->c(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
