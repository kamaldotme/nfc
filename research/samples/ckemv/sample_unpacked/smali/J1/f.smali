.class public final LJ1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LJ1/g;


# direct methods
.method public synthetic constructor <init>(LJ1/g;I)V
    .locals 0

    iput p2, p0, LJ1/f;->b:I

    iput-object p1, p0, LJ1/f;->c:LJ1/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const/4 v0, 0x0

    const v1, 0x7f0801c5

    iget v2, p0, LJ1/f;->b:I

    packed-switch v2, :pswitch_data_0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, LJ1/f;->c:LJ1/g;

    iget-object v2, v2, LJ1/g;->c:LJ1/i;

    iget-object v3, v2, LJ1/i;->c:LJ1/b;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iput-boolean v1, v3, LJ1/b;->a:Z

    iput-boolean v4, v3, LJ1/b;->b:Z

    iget-object v5, v3, LJ1/b;->e:Landroid/os/Handler;

    invoke-virtual {v5, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-boolean v5, v3, LJ1/b;->c:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v5, :cond_0

    :try_start_1
    iget-object v3, v3, LJ1/b;->d:Landroid/hardware/Camera;

    invoke-virtual {v3}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_0
    :cond_0
    :try_start_2
    iput-object v0, v2, LJ1/i;->c:LJ1/b;

    :cond_1
    iget-object v3, v2, LJ1/i;->d:Ln1/a;

    if-eqz v3, :cond_2

    iput-object v0, v2, LJ1/i;->d:Ln1/a;

    :cond_2
    iget-object v3, v2, LJ1/i;->a:Landroid/hardware/Camera;

    if-eqz v3, :cond_3

    iget-boolean v5, v2, LJ1/i;->e:Z

    if-eqz v5, :cond_3

    invoke-virtual {v3}, Landroid/hardware/Camera;->stopPreview()V

    iget-object v3, v2, LJ1/i;->l:LJ1/h;

    iput-object v0, v3, LJ1/h;->a:LA/h;

    iput-boolean v4, v2, LJ1/i;->e:Z

    :cond_3
    iget-object v2, p0, LJ1/f;->c:LJ1/g;

    iget-object v2, v2, LJ1/g;->c:LJ1/i;

    iget-object v3, v2, LJ1/i;->a:Landroid/hardware/Camera;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/hardware/Camera;->release()V

    iput-object v0, v2, LJ1/i;->a:Landroid/hardware/Camera;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_4
    iget-object v2, p0, LJ1/f;->c:LJ1/g;

    iput-boolean v1, v2, LJ1/g;->g:Z

    iget-object v2, v2, LJ1/g;->d:Landroid/os/Handler;

    const v3, 0x7f0801c4

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iget-object v2, p0, LJ1/f;->c:LJ1/g;

    iget-object v2, v2, LJ1/g;->a:LC1/e;

    iget-object v3, v2, LC1/e;->e:Ljava/lang/Object;

    monitor-enter v3

    :try_start_3
    iget v4, v2, LC1/e;->b:I

    sub-int/2addr v4, v1

    iput v4, v2, LC1/e;->b:I

    if-nez v4, :cond_5

    iget-object v1, v2, LC1/e;->e:Ljava/lang/Object;

    monitor-enter v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v4, v2, LC1/e;->d:Ljava/lang/Object;

    check-cast v4, Landroid/os/HandlerThread;

    invoke-virtual {v4}, Landroid/os/HandlerThread;->quit()Z

    iput-object v0, v2, LC1/e;->d:Ljava/lang/Object;

    iput-object v0, v2, LC1/e;->c:Ljava/lang/Object;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0

    :cond_5
    :goto_0
    monitor-exit v3

    return-void

    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :pswitch_0
    iget-object v0, p0, LJ1/f;->c:LJ1/g;

    :try_start_6
    iget-object v2, v0, LJ1/g;->c:LJ1/i;

    iget-object v3, v0, LJ1/g;->b:Lv0/l;

    iget-object v2, v2, LJ1/i;->a:Landroid/hardware/Camera;

    iget-object v4, v3, Lv0/l;->d:Ljava/lang/Object;

    check-cast v4, Landroid/view/SurfaceHolder;

    if-eqz v4, :cond_6

    invoke-virtual {v2, v4}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    goto :goto_1

    :cond_6
    iget-object v3, v3, Lv0/l;->e:Ljava/lang/Object;

    check-cast v3, Landroid/graphics/SurfaceTexture;

    invoke-virtual {v2, v3}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    :goto_1
    iget-object v2, v0, LJ1/g;->c:LJ1/i;

    invoke-virtual {v2}, LJ1/i;->e()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_2

    :catch_2
    move-exception v2

    iget-object v0, v0, LJ1/g;->d:Landroid/os/Handler;

    if-eqz v0, :cond_7

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_7
    :goto_2
    return-void

    :pswitch_1
    iget-object v2, p0, LJ1/f;->c:LJ1/g;

    :try_start_7
    iget-object v3, v2, LJ1/g;->c:LJ1/i;

    invoke-virtual {v3}, LJ1/i;->a()V

    iget-object v3, v2, LJ1/g;->d:Landroid/os/Handler;

    if-eqz v3, :cond_b

    iget-object v4, v2, LJ1/g;->c:LJ1/i;

    iget-object v5, v4, LJ1/i;->j:LI1/y;

    if-nez v5, :cond_8

    goto :goto_3

    :cond_8
    iget v0, v4, LJ1/i;->k:I

    const/4 v4, -0x1

    if-eq v0, v4, :cond_a

    rem-int/lit16 v0, v0, 0xb4

    if-eqz v0, :cond_9

    new-instance v0, LI1/y;

    iget v4, v5, LI1/y;->c:I

    iget v5, v5, LI1/y;->b:I

    invoke-direct {v0, v4, v5}, LI1/y;-><init>(II)V

    goto :goto_3

    :cond_9
    move-object v0, v5

    :goto_3
    const v4, 0x7f0801cb

    invoke-virtual {v3, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_4

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Rotation not calculated yet. Call configure() first."

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    :goto_4
    iget-object v2, v2, LJ1/g;->d:Landroid/os/Handler;

    if-eqz v2, :cond_b

    invoke-virtual {v2, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_b
    :goto_5
    return-void

    :pswitch_2
    iget-object v0, p0, LJ1/f;->c:LJ1/g;

    :try_start_8
    iget-object v2, v0, LJ1/g;->c:LJ1/i;

    invoke-virtual {v2}, LJ1/i;->b()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_6

    :catch_4
    move-exception v2

    iget-object v0, v0, LJ1/g;->d:Landroid/os/Handler;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_c
    :goto_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
