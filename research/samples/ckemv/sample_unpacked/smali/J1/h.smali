.class public final LJ1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# instance fields
.field public a:LA/h;

.field public b:LI1/y;

.field public final synthetic c:LJ1/i;


# direct methods
.method public constructor <init>(LJ1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ1/h;->c:LJ1/i;

    return-void
.end method


# virtual methods
.method public final onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 8

    iget-object v0, p0, LJ1/h;->b:LI1/y;

    iget-object v1, p0, LJ1/h;->a:LA/h;

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    if-eqz p1, :cond_2

    :try_start_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2

    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v6

    new-instance p2, LI1/z;

    iget v4, v0, LI1/y;->b:I

    iget v5, v0, LI1/y;->c:I

    iget-object v0, p0, LJ1/h;->c:LJ1/i;

    iget v7, v0, LJ1/i;->k:I

    move-object v2, p2

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, LI1/z;-><init>([BIIII)V

    iget-object p1, p0, LJ1/h;->c:LJ1/i;

    iget-object p1, p1, LJ1/i;->b:Landroid/hardware/Camera$CameraInfo;

    iget p1, p1, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iput-boolean v0, p2, LI1/z;->e:Z

    :cond_0
    iget-object p1, v1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, LI1/p;

    iget-object p1, p1, LI1/p;->h:Ljava/lang/Object;

    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v1, LA/h;->c:Ljava/lang/Object;

    check-cast v0, LI1/p;

    iget-boolean v2, v0, LI1/p;->g:Z

    if-eqz v2, :cond_1

    iget-object v0, v0, LI1/p;->c:Landroid/os/Handler;

    const v2, 0x7f0801c6

    invoke-virtual {v0, v2, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p1

    goto :goto_2

    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p2

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "No preview data received"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    invoke-virtual {v1}, LA/h;->r()V

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "No resolution available"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, LA/h;->r()V

    :cond_4
    :goto_2
    return-void
.end method
