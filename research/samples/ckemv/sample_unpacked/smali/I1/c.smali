.class public final LI1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LI1/c;->a:I

    iput-object p2, p0, LI1/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, LI1/c;->a:I

    packed-switch v2, :pswitch_data_0

    iget v2, v0, Landroid/os/Message;->what:I

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v2, v1, LI1/c;->b:Ljava/lang/Object;

    check-cast v2, LK/r;

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    iget-object v2, v2, LK/r;->a:Ljava/lang/Object;

    monitor-enter v2

    const/4 v0, 0x0

    :try_start_0
    throw v0

    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :pswitch_0
    iget v0, v0, Landroid/os/Message;->what:I

    iget-object v2, v1, LI1/c;->b:Ljava/lang/Object;

    check-cast v2, LJ1/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    invoke-virtual {v2}, LJ1/b;->b()V

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    return v3

    :pswitch_1
    iget v2, v0, Landroid/os/Message;->what:I

    const v3, 0x7f0801c6

    iget-object v4, v1, LI1/c;->b:Ljava/lang/Object;

    check-cast v4, LI1/p;

    const/4 v5, 0x1

    if-ne v2, v3, :cond_14

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, LI1/z;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v2, v4, LI1/p;->f:Landroid/graphics/Rect;

    iput-object v2, v0, LI1/z;->d:Landroid/graphics/Rect;

    iget-object v3, v0, LI1/z;->a:LI1/t;

    const/4 v6, 0x0

    if-nez v2, :cond_2

    move-object v2, v6

    goto/16 :goto_9

    :cond_2
    iget-object v2, v3, LI1/t;->a:[B

    iget v7, v0, LI1/z;->c:I

    iget v8, v3, LI1/t;->c:I

    iget v9, v3, LI1/t;->b:I

    const/4 v10, 0x0

    const/16 v11, 0x5a

    if-eq v7, v11, :cond_8

    const/16 v11, 0xb4

    if-eq v7, v11, :cond_6

    const/16 v11, 0x10e

    if-eq v7, v11, :cond_3

    move-object v7, v3

    goto :goto_7

    :cond_3
    new-instance v7, LI1/t;

    mul-int v11, v9, v8

    new-array v12, v11, [B

    sub-int/2addr v11, v5

    move v13, v10

    :goto_2
    if-ge v13, v9, :cond_5

    add-int/lit8 v14, v8, -0x1

    :goto_3
    if-ltz v14, :cond_4

    mul-int v15, v14, v9

    add-int/2addr v15, v13

    aget-byte v15, v2, v15

    aput-byte v15, v12, v11

    add-int/lit8 v11, v11, -0x1

    add-int/lit8 v14, v14, -0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_5
    invoke-direct {v7, v8, v9, v12}, LI1/t;-><init>(II[B)V

    goto :goto_7

    :cond_6
    new-instance v7, LI1/t;

    mul-int v11, v9, v8

    new-array v12, v11, [B

    add-int/lit8 v13, v11, -0x1

    move v14, v10

    :goto_4
    if-ge v14, v11, :cond_7

    aget-byte v15, v2, v14

    aput-byte v15, v12, v13

    add-int/lit8 v13, v13, -0x1

    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_7
    invoke-direct {v7, v9, v8, v12}, LI1/t;-><init>(II[B)V

    goto :goto_7

    :cond_8
    new-instance v7, LI1/t;

    mul-int v11, v9, v8

    new-array v11, v11, [B

    move v12, v10

    move v13, v12

    :goto_5
    if-ge v12, v9, :cond_a

    add-int/lit8 v14, v8, -0x1

    :goto_6
    if-ltz v14, :cond_9

    mul-int v15, v14, v9

    add-int/2addr v15, v12

    aget-byte v15, v2, v15

    aput-byte v15, v11, v13

    add-int/lit8 v13, v13, 0x1

    add-int/lit8 v14, v14, -0x1

    goto :goto_6

    :cond_9
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_a
    invoke-direct {v7, v8, v9, v11}, LI1/t;-><init>(II[B)V

    :goto_7
    iget-object v2, v0, LI1/z;->d:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v15

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v8

    iget v9, v2, Landroid/graphics/Rect;->top:I

    mul-int v11, v15, v8

    new-array v12, v11, [B

    iget v11, v7, LI1/t;->b:I

    mul-int/2addr v9, v11

    iget v2, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v9, v2

    :goto_8
    if-ge v10, v8, :cond_b

    mul-int v2, v10, v15

    iget-object v13, v7, LI1/t;->a:[B

    invoke-static {v13, v9, v12, v2, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v9, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_b
    new-instance v2, Lj1/i;

    move-object v11, v2

    move v13, v15

    move v14, v8

    move/from16 v16, v8

    invoke-direct/range {v11 .. v16}, Lj1/i;-><init>([BIIII)V

    :goto_9
    if-eqz v2, :cond_e

    iget-object v7, v4, LI1/p;->d:LI1/m;

    invoke-virtual {v7, v2}, LI1/m;->b(Lj1/i;)Lv0/e;

    move-result-object v2

    iget-object v8, v7, LI1/m;->a:Lj1/j;

    iget-object v7, v7, LI1/m;->b:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    :try_start_1
    instance-of v7, v8, Lj1/g;

    if-eqz v7, :cond_d

    move-object v7, v8

    check-cast v7, Lj1/g;

    iget-object v9, v7, Lj1/g;->b:[Lj1/j;

    if-nez v9, :cond_c

    invoke-virtual {v7, v6}, Lj1/g;->e(Ljava/util/Map;)V

    :cond_c
    invoke-virtual {v7, v2}, Lj1/g;->d(Lv0/e;)Lj1/l;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    check-cast v8, Lj1/g;

    invoke-virtual {v8}, Lj1/g;->c()V

    goto :goto_b

    :catchall_1
    move-exception v0

    goto :goto_a

    :cond_d
    :try_start_2
    invoke-interface {v8, v2}, Lj1/j;->b(Lv0/e;)Lj1/l;

    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_0
    invoke-interface {v8}, Lj1/j;->c()V

    goto :goto_b

    :goto_a
    invoke-interface {v8}, Lj1/j;->c()V

    throw v0

    :cond_e
    :goto_b
    iget-object v2, v4, LI1/p;->e:Landroid/os/Handler;

    if-eqz v6, :cond_f

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    if-eqz v2, :cond_10

    new-instance v7, LI1/b;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iput-object v6, v7, LI1/b;->a:Lj1/l;

    iput-object v0, v7, LI1/b;->b:LI1/z;

    const v6, 0x7f0801c8

    invoke-static {v2, v6, v7}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v6, v7}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    invoke-virtual {v6}, Landroid/os/Message;->sendToTarget()V

    goto :goto_c

    :cond_f
    if-eqz v2, :cond_10

    const v6, 0x7f0801c7

    invoke-static {v2, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v6

    invoke-virtual {v6}, Landroid/os/Message;->sendToTarget()V

    :cond_10
    :goto_c
    if-eqz v2, :cond_13

    iget-object v6, v4, LI1/p;->d:LI1/m;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Ljava/util/ArrayList;

    iget-object v6, v6, LI1/m;->b:Ljava/util/ArrayList;

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj1/n;

    iget v9, v8, Lj1/n;->a:F

    int-to-float v10, v5

    mul-float/2addr v9, v10

    iget-object v11, v0, LI1/z;->d:Landroid/graphics/Rect;

    iget v12, v11, Landroid/graphics/Rect;->left:I

    int-to-float v12, v12

    add-float/2addr v9, v12

    iget v8, v8, Lj1/n;->b:F

    mul-float/2addr v8, v10

    iget v10, v11, Landroid/graphics/Rect;->top:I

    int-to-float v10, v10

    add-float/2addr v8, v10

    iget-boolean v10, v0, LI1/z;->e:Z

    if-eqz v10, :cond_11

    iget v10, v3, LI1/t;->b:I

    int-to-float v10, v10

    sub-float v9, v10, v9

    :cond_11
    new-instance v10, Lj1/n;

    invoke-direct {v10, v9, v8}, Lj1/n;-><init>(FF)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_12
    const v0, 0x7f0801c9

    invoke-static {v2, v0, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_13
    iget-object v0, v4, LI1/p;->a:LJ1/g;

    iget-object v2, v0, LJ1/g;->h:Landroid/os/Handler;

    new-instance v3, LJ1/d;

    iget-object v4, v4, LI1/p;->j:LA/h;

    const/4 v6, 0x0

    invoke-direct {v3, v0, v4, v6}, LJ1/d;-><init>(LJ1/g;LA/h;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_e

    :cond_14
    const v0, 0x7f0801ca

    if-ne v2, v0, :cond_15

    iget-object v0, v4, LI1/p;->a:LJ1/g;

    iget-object v2, v0, LJ1/g;->h:Landroid/os/Handler;

    new-instance v3, LJ1/d;

    iget-object v4, v4, LI1/p;->j:LA/h;

    const/4 v6, 0x0

    invoke-direct {v3, v0, v4, v6}, LJ1/d;-><init>(LJ1/g;LA/h;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_15
    :goto_e
    return v5

    :pswitch_2
    iget v2, v0, Landroid/os/Message;->what:I

    const v3, 0x7f0801cb

    const/4 v4, 0x0

    iget-object v5, v1, LI1/c;->b:Ljava/lang/Object;

    check-cast v5, LI1/g;

    if-ne v2, v3, :cond_1e

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, LI1/y;

    iput-object v0, v5, LI1/g;->o:LI1/y;

    iget-object v2, v5, LI1/g;->n:LI1/y;

    if-eqz v2, :cond_1d

    const/4 v3, 0x0

    if-eqz v0, :cond_1c

    iget-object v6, v5, LI1/g;->l:LJ1/l;

    if-eqz v6, :cond_1c

    iget-object v7, v6, LJ1/l;->d:Ljava/lang/Object;

    check-cast v7, LJ1/n;

    iget-object v6, v6, LJ1/l;->c:Ljava/lang/Object;

    check-cast v6, LI1/y;

    invoke-virtual {v7, v0, v6}, LJ1/n;->b(LI1/y;LI1/y;)Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v7

    if-lez v7, :cond_1b

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v7

    if-gtz v7, :cond_16

    goto/16 :goto_11

    :cond_16
    iput-object v6, v5, LI1/g;->p:Landroid/graphics/Rect;

    new-instance v6, Landroid/graphics/Rect;

    iget v7, v2, LI1/y;->b:I

    iget v2, v2, LI1/y;->c:I

    invoke-direct {v6, v4, v4, v7, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object v2, v5, LI1/g;->p:Landroid/graphics/Rect;

    new-instance v7, Landroid/graphics/Rect;

    invoke-direct {v7, v6}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v7, v2}, Landroid/graphics/Rect;->intersect(Landroid/graphics/Rect;)Z

    iget-object v2, v5, LI1/g;->t:LI1/y;

    if-eqz v2, :cond_17

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v2

    iget-object v6, v5, LI1/g;->t:LI1/y;

    iget v6, v6, LI1/y;->b:I

    sub-int/2addr v2, v6

    div-int/lit8 v2, v2, 0x2

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v6

    iget-object v8, v5, LI1/g;->t:LI1/y;

    iget v8, v8, LI1/y;->c:I

    sub-int/2addr v6, v8

    div-int/lit8 v6, v6, 0x2

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v7, v2, v4}, Landroid/graphics/Rect;->inset(II)V

    goto :goto_f

    :cond_17
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-double v8, v2

    iget-wide v10, v5, LI1/g;->u:D

    mul-double/2addr v8, v10

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-double v10, v2

    iget-wide v12, v5, LI1/g;->u:D

    mul-double/2addr v10, v12

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(DD)D

    move-result-wide v8

    double-to-int v2, v8

    invoke-virtual {v7, v2, v2}, Landroid/graphics/Rect;->inset(II)V

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v6

    if-le v2, v6, :cond_18

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v6

    sub-int/2addr v2, v6

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {v7, v4, v2}, Landroid/graphics/Rect;->inset(II)V

    :cond_18
    :goto_f
    iput-object v7, v5, LI1/g;->r:Landroid/graphics/Rect;

    new-instance v2, Landroid/graphics/Rect;

    iget-object v4, v5, LI1/g;->r:Landroid/graphics/Rect;

    invoke-direct {v2, v4}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iget-object v4, v5, LI1/g;->p:Landroid/graphics/Rect;

    iget v6, v4, Landroid/graphics/Rect;->left:I

    neg-int v6, v6

    iget v4, v4, Landroid/graphics/Rect;->top:I

    neg-int v4, v4

    invoke-virtual {v2, v6, v4}, Landroid/graphics/Rect;->offset(II)V

    new-instance v4, Landroid/graphics/Rect;

    iget v6, v2, Landroid/graphics/Rect;->left:I

    iget v7, v0, LI1/y;->b:I

    mul-int/2addr v6, v7

    iget-object v8, v5, LI1/g;->p:Landroid/graphics/Rect;

    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v8

    div-int/2addr v6, v8

    iget v8, v2, Landroid/graphics/Rect;->top:I

    iget v0, v0, LI1/y;->c:I

    mul-int/2addr v8, v0

    iget-object v9, v5, LI1/g;->p:Landroid/graphics/Rect;

    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    move-result v9

    div-int/2addr v8, v9

    iget v9, v2, Landroid/graphics/Rect;->right:I

    mul-int/2addr v9, v7

    iget-object v7, v5, LI1/g;->p:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    div-int/2addr v9, v7

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    mul-int/2addr v2, v0

    iget-object v0, v5, LI1/g;->p:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    div-int/2addr v2, v0

    invoke-direct {v4, v6, v8, v9, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v4, v5, LI1/g;->s:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_1a

    iget-object v0, v5, LI1/g;->s:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-gtz v0, :cond_19

    goto :goto_10

    :cond_19
    iget-object v0, v5, LI1/g;->z:LI1/f;

    invoke-virtual {v0}, LI1/f;->e()V

    goto :goto_11

    :cond_1a
    :goto_10
    iput-object v3, v5, LI1/g;->s:Landroid/graphics/Rect;

    iput-object v3, v5, LI1/g;->r:Landroid/graphics/Rect;

    :cond_1b
    :goto_11
    invoke-virtual {v5}, Landroid/view/View;->requestLayout()V

    invoke-virtual {v5}, LI1/g;->f()V

    goto :goto_12

    :cond_1c
    iput-object v3, v5, LI1/g;->s:Landroid/graphics/Rect;

    iput-object v3, v5, LI1/g;->r:Landroid/graphics/Rect;

    iput-object v3, v5, LI1/g;->p:Landroid/graphics/Rect;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "containerSize or previewSize is not set yet"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    :goto_12
    const/4 v4, 0x1

    goto :goto_13

    :cond_1e
    const v3, 0x7f0801c5

    if-ne v2, v3, :cond_1f

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    iget-object v2, v5, LI1/g;->b:LJ1/g;

    if-eqz v2, :cond_20

    invoke-virtual {v5}, LI1/g;->c()V

    iget-object v2, v5, LI1/g;->z:LI1/f;

    invoke-virtual {v2, v0}, LI1/f;->c(Ljava/lang/Exception;)V

    goto :goto_13

    :cond_1f
    const v0, 0x7f0801c4

    if-ne v2, v0, :cond_20

    iget-object v0, v5, LI1/g;->z:LI1/f;

    invoke-virtual {v0}, LI1/f;->a()V

    :cond_20
    :goto_13
    return v4

    :pswitch_3
    iget v2, v0, Landroid/os/Message;->what:I

    const v3, 0x7f0801c8

    const/4 v4, 0x1

    iget-object v5, v1, LI1/c;->b:Ljava/lang/Object;

    check-cast v5, Lcom/journeyapps/barcodescanner/BarcodeView;

    if-ne v2, v3, :cond_21

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, LI1/b;

    if-eqz v0, :cond_24

    iget-object v2, v5, Lcom/journeyapps/barcodescanner/BarcodeView;->C:LI1/a;

    if-eqz v2, :cond_24

    iget v3, v5, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    if-eq v3, v4, :cond_24

    invoke-interface {v2, v0}, LI1/a;->n(LI1/b;)V

    iget v0, v5, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_24

    iput v4, v5, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    const/4 v0, 0x0

    iput-object v0, v5, Lcom/journeyapps/barcodescanner/BarcodeView;->C:LI1/a;

    invoke-virtual {v5}, Lcom/journeyapps/barcodescanner/BarcodeView;->i()V

    goto :goto_14

    :cond_21
    const v3, 0x7f0801c7

    if-ne v2, v3, :cond_22

    goto :goto_14

    :cond_22
    const v3, 0x7f0801c9

    if-ne v2, v3, :cond_23

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v2, v5, Lcom/journeyapps/barcodescanner/BarcodeView;->C:LI1/a;

    if-eqz v2, :cond_24

    iget v3, v5, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    if-eq v3, v4, :cond_24

    invoke-interface {v2, v0}, LI1/a;->k(Ljava/util/List;)V

    goto :goto_14

    :cond_23
    const/4 v4, 0x0

    :cond_24
    :goto_14
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
