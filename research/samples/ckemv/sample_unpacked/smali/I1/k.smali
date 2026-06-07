.class public final synthetic LI1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    iput p2, p0, LI1/k;->b:I

    iput-object p1, p0, LI1/k;->c:Ljava/lang/Object;

    iput-object p3, p0, LI1/k;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget v0, v1, LI1/k;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, LI1/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    iget-object v2, v1, LI1/k;->d:Ljava/lang/Object;

    check-cast v2, La1/a;

    const-string v3, "this$0"

    invoke-static {v0, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$innerFuture"

    invoke-static {v2, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-boolean v4, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->h:Z

    if-eqz v4, :cond_0

    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    const-string v2, "future"

    invoke-static {v0, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lz0/a;->a:I

    new-instance v2, Lm0/n;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2}, Lx0/k;->j(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    invoke-virtual {v0, v2}, Lx0/k;->l(La1/a;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v3

    return-void

    :goto_1
    monitor-exit v3

    throw v0

    :pswitch_0
    iget-object v0, v1, LI1/k;->c:Ljava/lang/Object;

    check-cast v0, Lz/b;

    iget-object v2, v1, LI1/k;->d:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Typeface;

    invoke-virtual {v0, v2}, Lz/b;->h(Landroid/graphics/Typeface;)V

    return-void

    :pswitch_1
    iget-object v0, v1, LI1/k;->c:Ljava/lang/Object;

    check-cast v0, Lw0/r;

    iget-object v2, v1, LI1/k;->d:Ljava/lang/Object;

    check-cast v2, Lx0/k;

    iget-object v4, v0, Lw0/r;->b:Lx0/k;

    iget-object v4, v4, Lx0/i;->a:Ljava/lang/Object;

    instance-of v4, v4, Lx0/a;

    if-nez v4, :cond_1

    iget-object v0, v0, Lw0/r;->e:Lm0/q;

    invoke-virtual {v0}, Lm0/q;->a()La1/a;

    move-result-object v0

    invoke-virtual {v2, v0}, Lx0/k;->l(La1/a;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {v2, v3}, Lx0/i;->cancel(Z)Z

    :goto_2
    return-void

    :pswitch_2
    const-string v0, "$listenersList"

    iget-object v2, v1, LI1/k;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    iget-object v3, v1, LI1/k;->d:Ljava/lang/Object;

    check-cast v3, Lt0/e;

    invoke-static {v3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls0/c;

    iget-object v4, v3, Lt0/e;->e:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Ls0/c;->a(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    return-void

    :pswitch_3
    const-string v0, "this$0"

    iget-object v2, v1, LI1/k;->c:Ljava/lang/Object;

    check-cast v2, Lo0/d;

    invoke-static {v2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$token"

    iget-object v3, v1, LI1/k;->d:Ljava/lang/Object;

    check-cast v3, Ln0/m;

    invoke-static {v3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v2, Lo0/d;->b:Lv0/c;

    const/4 v2, 0x3

    invoke-virtual {v0, v3, v2}, Lv0/c;->p(Ln0/m;I)V

    return-void

    :pswitch_4
    iget-object v0, v1, LI1/k;->c:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    iget-object v2, v1, LI1/k;->d:Ljava/lang/Object;

    check-cast v2, La1/a;

    iget-object v0, v0, Ln0/u;->q:Lx0/k;

    iget-object v0, v0, Lx0/i;->a:Ljava/lang/Object;

    instance-of v0, v0, Lx0/a;

    if-eqz v0, :cond_3

    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_3
    return-void

    :pswitch_5
    iget-object v0, v1, LI1/k;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    iget-object v2, v1, LI1/k;->c:Ljava/lang/Object;

    check-cast v2, Lf/B;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v2}, Lf/B;->a()V

    return-void

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2}, Lf/B;->a()V

    throw v3

    :pswitch_6
    iget-object v0, v1, LI1/k;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/profileinstaller/ProfileInstallerInitializer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-lt v0, v4, :cond_4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, LX/k;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    goto :goto_4

    :cond_4
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_4
    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    const/16 v5, 0x3e8

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v4, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    new-instance v4, LX/h;

    iget-object v5, v1, LI1/k;->d:Ljava/lang/Object;

    check-cast v5, Landroid/content/Context;

    invoke-direct {v4, v5, v2}, LX/h;-><init>(Landroid/content/Context;I)V

    add-int/lit16 v3, v3, 0x1388

    int-to-long v2, v3

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_7
    iget-object v0, v1, LI1/k;->c:Ljava/lang/Object;

    check-cast v0, LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, LI1/l;

    iget-boolean v0, v4, LI1/l;->d:Z

    iget-object v5, v1, LI1/k;->d:Ljava/lang/Object;

    check-cast v5, LI1/b;

    iget-object v6, v4, LI1/l;->a:Landroid/app/Activity;

    if-eqz v0, :cond_6

    iget-object v0, v5, LI1/b;->b:LI1/z;

    iget-object v7, v0, LI1/z;->a:LI1/t;

    new-instance v8, Landroid/graphics/Rect;

    iget v9, v7, LI1/t;->b:I

    iget v10, v7, LI1/t;->c:I

    invoke-direct {v8, v2, v2, v9, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance v9, Landroid/graphics/YuvImage;

    iget v14, v7, LI1/t;->b:I

    iget v15, v7, LI1/t;->c:I

    iget-object v12, v7, LI1/t;->a:[B

    iget v13, v0, LI1/z;->b:I

    const/16 v16, 0x0

    move-object v11, v9

    invoke-direct/range {v11 .. v16}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v10, 0x5a

    invoke-virtual {v9, v8, v10, v7}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    new-instance v8, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v8}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v9, 0x2

    iput v9, v8, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    array-length v9, v7

    invoke-static {v7, v2, v9, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v10

    iget v0, v0, LI1/z;->c:I

    if-eqz v0, :cond_5

    new-instance v15, Landroid/graphics/Matrix;

    invoke-direct {v15}, Landroid/graphics/Matrix;-><init>()V

    int-to-float v0, v0

    invoke-virtual {v15, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v16}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v10

    :cond_5
    :try_start_2
    const-string v0, "barcodeimage"

    const-string v7, ".jpg"

    invoke-virtual {v6}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v8

    invoke-static {v0, v7, v8}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sget-object v8, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v9, 0x64

    invoke-virtual {v10, v8, v9, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_6
    const/4 v0, 0x0

    :goto_5
    new-instance v7, Landroid/content/Intent;

    const-string v8, "com.google.zxing.client.android.SCAN"

    invoke-direct {v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v8, 0x80000

    invoke-virtual {v7, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v8, v5, LI1/b;->a:Lj1/l;

    iget-object v8, v8, Lj1/l;->a:Ljava/lang/String;

    const-string v9, "SCAN_RESULT"

    invoke-virtual {v7, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v5, v5, LI1/b;->a:Lj1/l;

    iget-object v8, v5, Lj1/l;->d:Lj1/a;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "SCAN_RESULT_FORMAT"

    invoke-virtual {v7, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v8, v5, Lj1/l;->b:[B

    if-eqz v8, :cond_7

    array-length v9, v8

    if-lez v9, :cond_7

    const-string v9, "SCAN_RESULT_BYTES"

    invoke-virtual {v7, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    :cond_7
    iget-object v5, v5, Lj1/l;->e:Ljava/util/Map;

    if-eqz v5, :cond_b

    sget-object v8, Lj1/m;->h:Lj1/m;

    invoke-interface {v5, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "SCAN_RESULT_UPC_EAN_EXTENSION"

    invoke-virtual {v7, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_8
    sget-object v8, Lj1/m;->b:Lj1/m;

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    if-eqz v8, :cond_9

    const-string v9, "SCAN_RESULT_ORIENTATION"

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v7, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_9
    sget-object v8, Lj1/m;->d:Lj1/m;

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_a

    const-string v9, "SCAN_RESULT_ERROR_CORRECTION_LEVEL"

    invoke-virtual {v7, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_a
    sget-object v8, Lj1/m;->c:Lj1/m;

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    if-eqz v5, :cond_b

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [B

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "SCAN_RESULT_BYTE_SEGMENTS_"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    add-int/2addr v2, v3

    goto :goto_6

    :cond_b
    if-eqz v0, :cond_c

    const-string v2, "SCAN_RESULT_IMAGE_PATH"

    invoke-virtual {v7, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_c
    const/4 v0, -0x1

    invoke-virtual {v6, v0, v7}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v4}, LI1/l;->a()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
