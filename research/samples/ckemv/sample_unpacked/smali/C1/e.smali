.class public final LC1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI1/n;


# static fields
.field public static f:LC1/e;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LC1/e;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, LC1/e;->b:I

    .line 4
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LC1/e;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LC1/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LC1/a;LC1/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LC1/e;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LC1/e;->c:Ljava/lang/Object;

    .line 7
    iget p1, p1, LC1/a;->b:I

    iput p1, p0, LC1/e;->b:I

    .line 8
    iput-object p2, p0, LC1/e;->e:Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x2

    .line 9
    new-array p1, p1, [Lv0/c;

    iput-object p1, p0, LC1/e;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lv0/c;)V
    .locals 13

    if-eqz p1, :cond_e

    check-cast p1, LC1/f;

    iget-object v0, p1, Lv0/c;->d:Ljava/lang/Object;

    check-cast v0, [LC1/a;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    invoke-virtual {v4}, LC1/a;->c()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LC1/e;->c:Ljava/lang/Object;

    check-cast v1, LC1/a;

    invoke-virtual {p1, v0, v1}, LC1/f;->s([LC1/a;LC1/a;)V

    iget-object v3, p1, Lv0/c;->c:Ljava/lang/Object;

    check-cast v3, LC1/c;

    iget-boolean v4, p1, LC1/f;->e:Z

    if-eqz v4, :cond_2

    iget-object v5, v3, LC1/c;->b:Lj1/n;

    goto :goto_1

    :cond_2
    iget-object v5, v3, LC1/c;->d:Lj1/n;

    :goto_1
    if-eqz v4, :cond_3

    iget-object v3, v3, LC1/c;->c:Lj1/n;

    goto :goto_2

    :cond_3
    iget-object v3, v3, LC1/c;->e:Lj1/n;

    :goto_2
    iget v4, v5, Lj1/n;->b:F

    float-to-int v4, v4

    invoke-virtual {p1, v4}, Lv0/c;->i(I)I

    move-result v4

    iget v3, v3, Lj1/n;->b:F

    float-to-int v3, v3

    invoke-virtual {p1, v3}, Lv0/c;->i(I)I

    move-result p1

    const/4 v3, 0x1

    const/4 v5, -0x1

    move v6, v2

    move v7, v3

    :goto_3
    if-ge v4, p1, :cond_e

    aget-object v8, v0, v4

    if-eqz v8, :cond_d

    iget v9, v8, LC1/a;->f:I

    sub-int v10, v9, v5

    if-nez v10, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    :cond_4
    if-ne v10, v3, :cond_5

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget v5, v8, LC1/a;->f:I

    :goto_4
    move v6, v3

    goto :goto_9

    :cond_5
    const/4 v11, 0x0

    if-ltz v10, :cond_c

    iget v12, v1, LC1/a;->f:I

    if-ge v9, v12, :cond_c

    if-le v10, v4, :cond_6

    goto :goto_8

    :cond_6
    const/4 v9, 0x2

    if-le v7, v9, :cond_7

    add-int/lit8 v9, v7, -0x2

    mul-int/2addr v10, v9

    :cond_7
    if-lt v10, v4, :cond_8

    move v9, v3

    goto :goto_5

    :cond_8
    move v9, v2

    :goto_5
    move v12, v3

    :goto_6
    if-gt v12, v10, :cond_a

    if-nez v9, :cond_a

    sub-int v9, v4, v12

    aget-object v9, v0, v9

    if-eqz v9, :cond_9

    move v9, v3

    goto :goto_7

    :cond_9
    move v9, v2

    :goto_7
    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    :cond_a
    if-eqz v9, :cond_b

    aput-object v11, v0, v4

    goto :goto_9

    :cond_b
    iget v5, v8, LC1/a;->f:I

    goto :goto_4

    :cond_c
    :goto_8
    aput-object v11, v0, v4

    :cond_d
    :goto_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_e
    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, LC1/e;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LC1/e;->c:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    if-nez v1, :cond_1

    iget v1, p0, LC1/e;->b:I

    if-lez v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "CameraThread"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, LC1/e;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    new-instance v1, Landroid/os/Handler;

    iget-object v2, p0, LC1/e;->d:Ljava/lang/Object;

    check-cast v2, Landroid/os/HandlerThread;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, LC1/e;->c:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "CameraThread is not open"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, LC1/e;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LC1/e;->b()V

    iget-object v1, p0, LC1/e;->c:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, LC1/e;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, LC1/e;->d:Ljava/lang/Object;

    check-cast v0, [Lv0/c;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget v3, p0, LC1/e;->b:I

    if-nez v2, :cond_0

    add-int/lit8 v2, v3, 0x1

    aget-object v2, v0, v2

    :cond_0
    new-instance v4, Ljava/util/Formatter;

    invoke-direct {v4}, Ljava/util/Formatter;-><init>()V

    move v5, v1

    :goto_0
    :try_start_0
    iget-object v6, v2, Lv0/c;->d:Ljava/lang/Object;

    check-cast v6, [LC1/a;

    array-length v6, v6

    if-ge v5, v6, :cond_4

    const-string v6, "CW %3d:"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    move v6, v1

    :goto_1
    add-int/lit8 v7, v3, 0x2

    if-ge v6, v7, :cond_3

    aget-object v7, v0, v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v8, "    |   "

    if-nez v7, :cond_1

    :try_start_1
    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v8, v7}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    iget-object v7, v7, Lv0/c;->d:Ljava/lang/Object;

    check-cast v7, [LC1/a;

    aget-object v7, v7, v5

    if-nez v7, :cond_2

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v8, v7}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_2

    :cond_2
    const-string v8, " %3d|%3d"

    iget v9, v7, LC1/a;->f:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iget v7, v7, LC1/a;->e:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v9, v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v8, v7}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    const-string v6, "%n"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v6, v7}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v4}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v4}, Ljava/util/Formatter;->close()V

    return-object v0

    :goto_3
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_3
    invoke-virtual {v4}, Ljava/util/Formatter;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v2

    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
