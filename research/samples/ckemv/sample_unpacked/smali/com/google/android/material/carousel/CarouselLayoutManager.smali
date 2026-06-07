.class public Lcom/google/android/material/carousel/CarouselLayoutManager;
.super LZ/H;
.source "SourceFile"

# interfaces
.implements LZ/S;


# instance fields
.field public p:I

.field public q:LA1/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/H;-><init>()V

    .line 2
    new-instance v0, LH0/b;

    invoke-direct {v0}, LH0/b;-><init>()V

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0}, LZ/H;->i0()V

    .line 4
    invoke-virtual {p0, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->B0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, LZ/H;-><init>()V

    .line 6
    new-instance v0, LH0/b;

    invoke-direct {v0}, LH0/b;-><init>()V

    .line 7
    invoke-static {p1, p2, p3, p4}, LZ/H;->G(Landroid/content/Context;Landroid/util/AttributeSet;II)LZ/G;

    move-result-object p1

    .line 8
    iget p1, p1, LZ/G;->a:I

    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->B0(I)V

    .line 9
    invoke-virtual {p0}, LZ/H;->i0()V

    return-void
.end method

.method public static x0(Ljava/util/List;FZ)LU0/e;
    .locals 13

    const/4 v0, 0x0

    const/4 v1, -0x1

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    const v3, -0x800001

    const/4 v4, 0x0

    move v7, v1

    move v8, v7

    move v9, v8

    move v10, v9

    move v5, v3

    move v6, v4

    move v3, v2

    move v4, v3

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v11

    if-ge v6, v11, :cond_4

    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LH0/d;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sub-float v11, v0, p1

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v11

    cmpg-float v12, v0, p1

    if-gtz v12, :cond_0

    cmpg-float v12, v11, v2

    if-gtz v12, :cond_0

    move v7, v6

    move v2, v11

    :cond_0
    cmpl-float v12, v0, p1

    if-lez v12, :cond_1

    cmpg-float v12, v11, v3

    if-gtz v12, :cond_1

    move v9, v6

    move v3, v11

    :cond_1
    cmpg-float v11, v0, v4

    if-gtz v11, :cond_2

    move v4, v0

    move v8, v6

    :cond_2
    cmpl-float v11, v0, v5

    if-lez v11, :cond_3

    move v5, v0

    move v10, v6

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    if-ne v7, v1, :cond_5

    move v7, v8

    :cond_5
    if-ne v9, v1, :cond_6

    move v9, v10

    :cond_6
    new-instance p1, LU0/e;

    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LH0/d;

    invoke-interface {p0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LH0/d;

    invoke-direct {p1, p2, p0}, LU0/e;-><init>(LH0/d;LH0/d;)V

    return-object p1
.end method


# virtual methods
.method public final A0(ILZ/N;LZ/T;)I
    .locals 0

    invoke-virtual {p0}, LZ/H;->v()I

    move-result p2

    if-eqz p2, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:I

    add-int p3, p2, p1

    if-ltz p3, :cond_1

    if-lez p3, :cond_2

    :cond_1
    rsub-int/lit8 p1, p2, 0x0

    :cond_2
    add-int/2addr p2, p1

    iput p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:I

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->C0()V

    const/4 p1, 0x0

    throw p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final B0(I)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid orientation:"

    invoke-static {v1, p1}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, LZ/H;->c(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:LA1/m;

    if-eqz v1, :cond_2

    iget v1, v1, LA1/m;->a:I

    if-eq p1, v1, :cond_5

    :cond_2
    if-eqz p1, :cond_4

    if-ne p1, v0, :cond_3

    new-instance p1, LH0/c;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LH0/c;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;I)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid orientation"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, LH0/c;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LH0/c;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;I)V

    :goto_1
    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:LA1/m;

    invoke-virtual {p0}, LZ/H;->i0()V

    :cond_5
    return-void
.end method

.method public final C0()V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->z0()Z

    move-result v1

    throw v0
.end method

.method public final Q(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, LZ/H;->Q(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, LZ/H;->v()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, LZ/H;->F(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p0}, LZ/H;->v()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, LZ/H;->F(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_0
    return-void
.end method

.method public final Y(LZ/N;LZ/T;)V
    .locals 3

    invoke-virtual {p2}, LZ/T;->b()I

    move-result p2

    const/4 v0, 0x0

    if-gtz p2, :cond_0

    invoke-virtual {p0, p1}, LZ/H;->d0(LZ/N;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->z0()Z

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {p1, v0, v1, v2}, LZ/N;->i(IJ)LZ/W;

    move-result-object p1

    iget-object p1, p1, LZ/W;->a:Landroid/view/View;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final Z(LZ/T;)V
    .locals 1

    invoke-virtual {p0}, LZ/H;->v()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LZ/H;->u(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, LZ/H;->F(Landroid/view/View;)I

    :goto_0
    return-void
.end method

.method public final a(I)Landroid/graphics/PointF;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->y0()Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->y0()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final h0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final j(LZ/T;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final j0(ILZ/N;LZ/T;)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->y0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->A0(ILZ/N;LZ/T;)I

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final k(LZ/T;)I
    .locals 0

    iget p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:I

    return p1
.end method

.method public final k0(I)V
    .locals 0

    return-void
.end method

.method public final l(LZ/T;)I
    .locals 0

    const/4 p1, 0x0

    rsub-int/lit8 p1, p1, 0x0

    return p1
.end method

.method public final l0(ILZ/N;LZ/T;)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->A0(ILZ/N;LZ/T;)I

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final m(LZ/T;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final n(LZ/T;)I
    .locals 0

    iget p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:I

    return p1
.end method

.method public final o(LZ/T;)I
    .locals 0

    const/4 p1, 0x0

    rsub-int/lit8 p1, p1, 0x0

    return p1
.end method

.method public final r()LZ/I;
    .locals 2

    new-instance v0, LZ/I;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, LZ/I;-><init>(II)V

    return-object v0
.end method

.method public final u0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

    new-instance v0, LH0/a;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LH0/a;-><init>(Ljava/lang/Object;Landroid/content/Context;I)V

    iput p2, v0, LZ/u;->a:I

    invoke-virtual {p0, v0}, LZ/H;->v0(LZ/u;)V

    return-void
.end method

.method public final y(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1, p2}, LZ/H;->y(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    const/4 p1, 0x0

    throw p1
.end method

.method public final y0()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->q:LA1/m;

    iget v0, v0, LA1/m;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final z0()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->y0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ/H;->A()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
