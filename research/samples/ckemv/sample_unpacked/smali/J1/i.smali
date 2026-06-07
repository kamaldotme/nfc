.class public final LJ1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic m:I


# instance fields
.field public a:Landroid/hardware/Camera;

.field public b:Landroid/hardware/Camera$CameraInfo;

.field public c:LJ1/b;

.field public d:Ln1/a;

.field public e:Z

.field public f:Ljava/lang/String;

.field public g:LJ1/j;

.field public h:LJ1/l;

.field public i:LI1/y;

.field public j:LI1/y;

.field public k:I

.field public final l:LJ1/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, LJ1/j;

    invoke-direct {p1}, LJ1/j;-><init>()V

    iput-object p1, p0, LJ1/i;->g:LJ1/j;

    const/4 p1, -0x1

    iput p1, p0, LJ1/i;->k:I

    new-instance p1, LJ1/h;

    invoke-direct {p1, p0}, LJ1/h;-><init>(LJ1/i;)V

    iput-object p1, p0, LJ1/i;->l:LJ1/h;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, LJ1/i;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_6

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, LJ1/i;->h:LJ1/l;

    iget v3, v3, LJ1/l;->b:I

    if-eqz v3, :cond_0

    if-eq v3, v2, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    :cond_0
    move v3, v1

    goto :goto_0

    :cond_1
    const/16 v3, 0x10e

    goto :goto_0

    :cond_2
    const/16 v3, 0xb4

    goto :goto_0

    :cond_3
    const/16 v3, 0x5a

    :goto_0
    iget-object v4, p0, LJ1/i;->b:Landroid/hardware/Camera$CameraInfo;

    iget v5, v4, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v5, v2, :cond_4

    iget v4, v4, Landroid/hardware/Camera$CameraInfo;->orientation:I

    add-int/2addr v4, v3

    rem-int/lit16 v4, v4, 0x168

    rsub-int v3, v4, 0x168

    rem-int/lit16 v3, v3, 0x168

    goto :goto_1

    :cond_4
    iget v4, v4, Landroid/hardware/Camera$CameraInfo;->orientation:I

    sub-int/2addr v4, v3

    add-int/lit16 v4, v4, 0x168

    rem-int/lit16 v3, v4, 0x168

    :goto_1
    iput v3, p0, LJ1/i;->k:I

    invoke-virtual {v0, v3}, Landroid/hardware/Camera;->setDisplayOrientation(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    invoke-virtual {p0, v1}, LJ1/i;->c(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    :try_start_2
    invoke-virtual {p0, v2}, LJ1/i;->c(Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :goto_2
    iget-object v0, p0, LJ1/i;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    if-nez v0, :cond_5

    iget-object v0, p0, LJ1/i;->i:LI1/y;

    iput-object v0, p0, LJ1/i;->j:LI1/y;

    goto :goto_3

    :cond_5
    new-instance v1, LI1/y;

    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v1, v2, v0}, LI1/y;-><init>(II)V

    iput-object v1, p0, LJ1/i;->j:LI1/y;

    :goto_3
    iget-object v0, p0, LJ1/i;->j:LI1/y;

    iget-object v1, p0, LJ1/i;->l:LJ1/h;

    iput-object v0, v1, LJ1/h;->b:LI1/y;

    return-void

    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Camera not open"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LJ1/i;->g:LJ1/j;

    iget v0, v0, LJ1/j;->a:I

    invoke-static {v0}, Lm0/z;->z(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v0

    :goto_0
    iput-object v0, p0, LJ1/i;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    iget-object v0, p0, LJ1/i;->g:LJ1/j;

    iget v0, v0, LJ1/j;->a:I

    invoke-static {v0}, Lm0/z;->z(I)I

    move-result v0

    new-instance v1, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    iput-object v1, p0, LJ1/i;->b:Landroid/hardware/Camera$CameraInfo;

    invoke-static {v0, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to open camera"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Z)V
    .locals 8

    iget-object v0, p0, LJ1/i;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    iget-object v1, p0, LJ1/i;->f:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LJ1/i;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->unflatten(Ljava/lang/String;)V

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    iget-object v1, p0, LJ1/i;->g:LJ1/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, LJ1/c;->a:I

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v1

    const-string v2, "auto"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LJ1/c;->a(Ljava/util/List;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez p1, :cond_2

    if-nez v2, :cond_2

    const-string v2, "edof"

    const-string v3, "macro"

    filled-new-array {v3, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LJ1/c;->a(Ljava/util/List;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_2
    if-eqz v2, :cond_4

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v2}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    :cond_4
    :goto_1
    const/4 v1, 0x0

    if-nez p1, :cond_5

    invoke-static {v0, v1}, LJ1/c;->b(Landroid/hardware/Camera$Parameters;Z)V

    iget-object p1, p0, LJ1/i;->g:LJ1/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, LJ1/i;->g:LJ1/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, LJ1/i;->g:LJ1/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_5
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_6

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object p1

    if-eqz p1, :cond_7

    iget v3, p1, Landroid/hardware/Camera$Size;->width:I

    iget p1, p1, Landroid/hardware/Camera$Size;->height:I

    new-instance v4, LI1/y;

    invoke-direct {v4, v3, p1}, LI1/y;-><init>(II)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/hardware/Camera$Size;

    new-instance v4, LI1/y;

    iget v5, v3, Landroid/hardware/Camera$Size;->width:I

    iget v3, v3, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v4, v5, v3}, LI1/y;-><init>(II)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez p1, :cond_8

    iput-object v4, p0, LJ1/i;->i:LI1/y;

    goto :goto_7

    :cond_8
    iget-object p1, p0, LJ1/i;->h:LJ1/l;

    iget v5, p0, LJ1/i;->k:I

    const/4 v6, -0x1

    if-eq v5, v6, :cond_14

    rem-int/lit16 v5, v5, 0xb4

    if-eqz v5, :cond_9

    move v5, v3

    goto :goto_4

    :cond_9
    move v5, v1

    :goto_4
    iget-object v6, p1, LJ1/l;->c:Ljava/lang/Object;

    check-cast v6, LI1/y;

    if-nez v6, :cond_a

    move-object v6, v4

    goto :goto_5

    :cond_a
    if-eqz v5, :cond_b

    new-instance v5, LI1/y;

    iget v7, v6, LI1/y;->c:I

    iget v6, v6, LI1/y;->b:I

    invoke-direct {v5, v7, v6}, LI1/y;-><init>(II)V

    move-object v6, v5

    :cond_b
    :goto_5
    iget-object p1, p1, LJ1/l;->d:Ljava/lang/Object;

    check-cast p1, LJ1/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v6, :cond_c

    goto :goto_6

    :cond_c
    new-instance v5, LJ1/m;

    invoke-direct {v5, p1, v6}, LJ1/m;-><init>(LJ1/n;LI1/y;)V

    invoke-static {v2, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :goto_6
    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LI1/y;

    iput-object p1, p0, LJ1/i;->i:LI1/y;

    iget v2, p1, LI1/y;->b:I

    iget p1, p1, LI1/y;->c:I

    invoke-virtual {v0, v2, p1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    :goto_7
    sget-object p1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v2, "glass-1"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [I

    invoke-static {v5}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    goto :goto_8

    :cond_e
    :goto_9
    if-eqz p1, :cond_13

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_13

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    aget v5, v2, v1

    aget v6, v2, v3

    const/16 v7, 0x2710

    if-lt v5, v7, :cond_f

    const/16 v5, 0x4e20

    if-gt v6, v5, :cond_f

    move-object v4, v2

    :cond_10
    if-nez v4, :cond_11

    goto :goto_a

    :cond_11
    const/4 p1, 0x2

    new-array p1, p1, [I

    invoke-virtual {v0, p1}, Landroid/hardware/Camera$Parameters;->getPreviewFpsRange([I)V

    invoke-static {p1, v4}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_12

    invoke-static {v4}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    goto :goto_a

    :cond_12
    invoke-static {v4}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    aget p1, v4, v1

    aget v1, v4, v3

    invoke-virtual {v0, p1, v1}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    :cond_13
    :goto_a
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    iget-object p1, p0, LJ1/i;->a:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    return-void

    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Rotation not calculated yet. Call configure() first."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Z)V
    .locals 4

    iget-object v0, p0, LJ1/i;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v3, "on"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "torch"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eq p1, v0, :cond_3

    iget-object v0, p0, LJ1/i;->c:LJ1/b;

    if-eqz v0, :cond_2

    iput-boolean v1, v0, LJ1/b;->a:Z

    iput-boolean v2, v0, LJ1/b;->b:Z

    iget-object v3, v0, LJ1/b;->e:Landroid/os/Handler;

    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-boolean v1, v0, LJ1/b;->c:Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v1, :cond_2

    :try_start_1
    iget-object v0, v0, LJ1/b;->d:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_2
    :try_start_2
    iget-object v0, p0, LJ1/i;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-static {v0, p1}, LJ1/c;->b(Landroid/hardware/Camera$Parameters;Z)V

    iget-object p1, p0, LJ1/i;->g:LJ1/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, LJ1/i;->a:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    iget-object p1, p0, LJ1/i;->c:LJ1/b;

    if-eqz p1, :cond_3

    iput-boolean v2, p1, LJ1/b;->a:Z

    invoke-virtual {p1}, LJ1/b;->b()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_3
    return-void
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, LJ1/i;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, LJ1/i;->e:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LJ1/i;->e:Z

    new-instance v0, LJ1/b;

    iget-object v1, p0, LJ1/i;->a:Landroid/hardware/Camera;

    iget-object v2, p0, LJ1/i;->g:LJ1/j;

    invoke-direct {v0, v1, v2}, LJ1/b;-><init>(Landroid/hardware/Camera;LJ1/j;)V

    iput-object v0, p0, LJ1/i;->c:LJ1/b;

    new-instance v0, Ln1/a;

    iget-object v1, p0, LJ1/i;->g:LJ1/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Ln1/a;->a:LJ1/i;

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, v0, Ln1/a;->b:Landroid/os/Handler;

    iput-object v0, p0, LJ1/i;->d:Ln1/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method
