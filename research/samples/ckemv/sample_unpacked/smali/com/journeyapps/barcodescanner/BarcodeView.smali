.class public Lcom/journeyapps/barcodescanner/BarcodeView;
.super LI1/g;
.source "SourceFile"


# instance fields
.field public B:I

.field public C:LI1/a;

.field public D:LI1/p;

.field public E:LI1/n;

.field public final F:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, LI1/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    iput p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->C:LI1/a;

    new-instance p1, LI1/c;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, LI1/c;-><init>(ILjava/lang/Object;)V

    new-instance p2, LC1/e;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, LC1/e;-><init>(I)V

    iput-object p2, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->E:LI1/n;

    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p2, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->F:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->i()V

    invoke-static {}, Lu2/d;->G()V

    const/4 v0, -0x1

    iput v0, p0, LI1/g;->j:I

    iget-object v0, p0, LI1/g;->b:LJ1/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lu2/d;->G()V

    iget-boolean v2, v0, LJ1/g;->f:Z

    if-eqz v2, :cond_0

    iget-object v2, v0, LJ1/g;->l:LJ1/f;

    iget-object v3, v0, LJ1/g;->a:LC1/e;

    invoke-virtual {v3, v2}, LC1/e;->c(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, v0, LJ1/g;->g:Z

    :goto_0
    const/4 v2, 0x0

    iput-boolean v2, v0, LJ1/g;->f:Z

    iput-object v1, p0, LI1/g;->b:LJ1/g;

    iput-boolean v2, p0, LI1/g;->h:Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, LI1/g;->d:Landroid/os/Handler;

    const v2, 0x7f0801c4

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :goto_1
    iget-object v0, p0, LI1/g;->q:LI1/y;

    if-nez v0, :cond_2

    iget-object v0, p0, LI1/g;->f:Landroid/view/SurfaceView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v2, p0, LI1/g;->x:LI1/e;

    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    :cond_2
    iget-object v0, p0, LI1/g;->q:LI1/y;

    if-nez v0, :cond_3

    iget-object v0, p0, LI1/g;->g:Landroid/view/TextureView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :cond_3
    iput-object v1, p0, LI1/g;->n:LI1/y;

    iput-object v1, p0, LI1/g;->o:LI1/y;

    iput-object v1, p0, LI1/g;->s:Landroid/graphics/Rect;

    iget-object v0, p0, LI1/g;->i:LC1/e;

    iget-object v2, v0, LC1/e;->d:Ljava/lang/Object;

    check-cast v2, LI1/u;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->disable()V

    :cond_4
    iput-object v1, v0, LC1/e;->d:Ljava/lang/Object;

    iput-object v1, v0, LC1/e;->c:Ljava/lang/Object;

    iput-object v1, v0, LC1/e;->e:Ljava/lang/Object;

    iget-object v0, p0, LI1/g;->z:LI1/f;

    invoke-virtual {v0}, LI1/f;->j()V

    return-void
.end method

.method public final g()LI1/m;
    .locals 5

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->E:LI1/n;

    if-nez v0, :cond_0

    new-instance v0, LC1/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LC1/e;-><init>(I)V

    iput-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->E:LI1/n;

    :cond_0
    new-instance v0, LI1/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v2, Lj1/c;->k:Lj1/c;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->E:LI1/n;

    check-cast v2, LC1/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/util/EnumMap;

    const-class v4, Lj1/c;

    invoke-direct {v3, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v3, v1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    iget-object v1, v2, LC1/e;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    :cond_1
    iget-object v1, v2, LC1/e;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_2

    sget-object v4, Lj1/c;->d:Lj1/c;

    invoke-virtual {v3, v4, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, v2, LC1/e;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_3

    sget-object v4, Lj1/c;->f:Lj1/c;

    invoke-virtual {v3, v4, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    new-instance v1, Lj1/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v3}, Lj1/g;->e(Ljava/util/Map;)V

    iget v2, v2, LC1/e;->b:I

    if-eqz v2, :cond_6

    const/4 v3, 0x1

    if-eq v2, v3, :cond_5

    const/4 v4, 0x2

    if-eq v2, v4, :cond_4

    new-instance v2, LI1/m;

    invoke-direct {v2, v1}, LI1/m;-><init>(Lj1/g;)V

    goto :goto_0

    :cond_4
    new-instance v2, LI1/s;

    invoke-direct {v2, v1}, LI1/m;-><init>(Lj1/g;)V

    iput-boolean v3, v2, LI1/s;->c:Z

    goto :goto_0

    :cond_5
    new-instance v2, LI1/r;

    invoke-direct {v2, v1}, LI1/m;-><init>(Lj1/g;)V

    goto :goto_0

    :cond_6
    new-instance v2, LI1/m;

    invoke-direct {v2, v1}, LI1/m;-><init>(Lj1/g;)V

    :goto_0
    iput-object v2, v0, LI1/o;->a:LI1/m;

    return-object v2
.end method

.method public getDecoderFactory()LI1/n;
    .locals 1

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->E:LI1/n;

    return-object v0
.end method

.method public final h()V
    .locals 5

    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->i()V

    iget v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, LI1/g;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, LI1/p;

    invoke-virtual {p0}, LI1/g;->getCameraInstance()LJ1/g;

    move-result-object v2

    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->g()LI1/m;

    move-result-object v3

    iget-object v4, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->F:Landroid/os/Handler;

    invoke-direct {v0, v2, v3, v4}, LI1/p;-><init>(LJ1/g;LI1/m;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->D:LI1/p;

    invoke-virtual {p0}, LI1/g;->getPreviewFramingRect()Landroid/graphics/Rect;

    move-result-object v2

    iput-object v2, v0, LI1/p;->f:Landroid/graphics/Rect;

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->D:LI1/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lu2/d;->G()V

    new-instance v2, Landroid/os/HandlerThread;

    const-string v3, "p"

    invoke-direct {v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v2, v0, LI1/p;->b:Landroid/os/HandlerThread;

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    new-instance v2, Landroid/os/Handler;

    iget-object v3, v0, LI1/p;->b:Landroid/os/HandlerThread;

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    iget-object v4, v0, LI1/p;->i:LI1/c;

    invoke-direct {v2, v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v2, v0, LI1/p;->c:Landroid/os/Handler;

    iput-boolean v1, v0, LI1/p;->g:Z

    iget-object v1, v0, LI1/p;->a:LJ1/g;

    iget-object v2, v1, LJ1/g;->h:Landroid/os/Handler;

    new-instance v3, LJ1/d;

    iget-object v0, v0, LI1/p;->j:LA/h;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v0, v4}, LJ1/d;-><init>(LJ1/g;LA/h;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->D:LI1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lu2/d;->G()V

    iget-object v1, v0, LI1/p;->h:Ljava/lang/Object;

    monitor-enter v1

    const/4 v2, 0x0

    :try_start_0
    iput-boolean v2, v0, LI1/p;->g:Z

    iget-object v2, v0, LI1/p;->c:Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, v0, LI1/p;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v3, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->D:LI1/p;

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public setDecoderFactory(LI1/n;)V
    .locals 1

    invoke-static {}, Lu2/d;->G()V

    iput-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->E:LI1/n;

    iget-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->D:LI1/p;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->g()LI1/m;

    move-result-object v0

    iput-object v0, p1, LI1/p;->d:LI1/m;

    :cond_0
    return-void
.end method
