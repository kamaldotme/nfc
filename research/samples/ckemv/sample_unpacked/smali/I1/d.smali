.class public final LI1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field public final synthetic a:LI1/g;


# direct methods
.method public constructor <init>(LI1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI1/d;->a:LI1/g;

    return-void
.end method


# virtual methods
.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LI1/d;->onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V

    return-void
.end method

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    new-instance p1, LI1/y;

    invoke-direct {p1, p2, p3}, LI1/y;-><init>(II)V

    iget-object p2, p0, LI1/d;->a:LI1/g;

    iput-object p1, p2, LI1/g;->q:LI1/y;

    invoke-virtual {p2}, LI1/g;->f()V

    return-void
.end method

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method
