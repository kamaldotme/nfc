.class public final LX0/g;
.super LU0/f;
.source "SourceFile"


# instance fields
.field public final v:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(LU0/k;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LU0/f;-><init>(LU0/k;)V

    .line 2
    iput-object p2, p0, LX0/g;->v:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(LX0/g;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LU0/f;-><init>(LU0/f;)V

    .line 4
    iget-object p1, p1, LX0/g;->v:Landroid/graphics/RectF;

    iput-object p1, p0, LX0/g;->v:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, LX0/h;

    invoke-direct {v0, p0}, LX0/h;-><init>(LX0/g;)V

    invoke-virtual {v0}, LU0/g;->invalidateSelf()V

    return-object v0
.end method
