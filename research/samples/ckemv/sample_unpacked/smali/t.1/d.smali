.class public final Lt/d;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "SourceFile"


# instance fields
.field public A:F

.field public B:Ljava/lang/String;

.field public C:I

.field public D:F

.field public E:F

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:F

.field public O:F

.field public P:I

.field public Q:I

.field public R:I

.field public S:Z

.field public T:Z

.field public U:Ljava/lang/String;

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public a:I

.field public a0:I

.field public b:I

.field public b0:I

.field public c:F

.field public c0:I

.field public d:I

.field public d0:I

.field public e:I

.field public e0:I

.field public f:I

.field public f0:I

.field public g:I

.field public g0:F

.field public h:I

.field public h0:I

.field public i:I

.field public i0:I

.field public j:I

.field public j0:F

.field public k:I

.field public k0:Lr/d;

.field public l:I

.field public m:I

.field public n:I

.field public o:F

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:F


# virtual methods
.method public final a()V
    .locals 6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt/d;->Y:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lt/d;->V:Z

    iput-boolean v1, p0, Lt/d;->W:Z

    iget v2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v3, -0x2

    if-ne v2, v3, :cond_0

    iget-boolean v4, p0, Lt/d;->S:Z

    if-eqz v4, :cond_0

    iput-boolean v0, p0, Lt/d;->V:Z

    iget v4, p0, Lt/d;->H:I

    if-nez v4, :cond_0

    iput v1, p0, Lt/d;->H:I

    :cond_0
    iget v4, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v4, v3, :cond_1

    iget-boolean v5, p0, Lt/d;->T:Z

    if-eqz v5, :cond_1

    iput-boolean v0, p0, Lt/d;->W:Z

    iget v5, p0, Lt/d;->I:I

    if-nez v5, :cond_1

    iput v1, p0, Lt/d;->I:I

    :cond_1
    const/4 v5, -0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_3

    :cond_2
    iput-boolean v0, p0, Lt/d;->V:Z

    if-nez v2, :cond_3

    iget v2, p0, Lt/d;->H:I

    if-ne v2, v1, :cond_3

    iput v3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput-boolean v1, p0, Lt/d;->S:Z

    :cond_3
    if-eqz v4, :cond_4

    if-ne v4, v5, :cond_5

    :cond_4
    iput-boolean v0, p0, Lt/d;->W:Z

    if-nez v4, :cond_5

    iget v0, p0, Lt/d;->I:I

    if-ne v0, v1, :cond_5

    iput v3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput-boolean v1, p0, Lt/d;->T:Z

    :cond_5
    iget v0, p0, Lt/d;->c:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v0, v0, v2

    if-nez v0, :cond_6

    iget v0, p0, Lt/d;->a:I

    if-ne v0, v5, :cond_6

    iget v0, p0, Lt/d;->b:I

    if-eq v0, v5, :cond_8

    :cond_6
    iput-boolean v1, p0, Lt/d;->Y:Z

    iput-boolean v1, p0, Lt/d;->V:Z

    iput-boolean v1, p0, Lt/d;->W:Z

    iget-object v0, p0, Lt/d;->k0:Lr/d;

    instance-of v0, v0, Lr/h;

    if-nez v0, :cond_7

    new-instance v0, Lr/h;

    invoke-direct {v0}, Lr/h;-><init>()V

    iput-object v0, p0, Lt/d;->k0:Lr/d;

    :cond_7
    iget-object v0, p0, Lt/d;->k0:Lr/d;

    check-cast v0, Lr/h;

    iget v1, p0, Lt/d;->R:I

    invoke-virtual {v0, v1}, Lr/h;->B(I)V

    :cond_8
    return-void
.end method

.method public final resolveLayoutDirection(I)V
    .locals 9

    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    invoke-super {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->resolveLayoutDirection(I)V

    invoke-virtual {p0}, Landroid/view/ViewGroup$MarginLayoutParams;->getLayoutDirection()I

    move-result p1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v3, p1, :cond_0

    move p1, v3

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    const/4 v4, -0x1

    iput v4, p0, Lt/d;->c0:I

    iput v4, p0, Lt/d;->d0:I

    iput v4, p0, Lt/d;->a0:I

    iput v4, p0, Lt/d;->b0:I

    iget v5, p0, Lt/d;->t:I

    iput v5, p0, Lt/d;->e0:I

    iget v5, p0, Lt/d;->v:I

    iput v5, p0, Lt/d;->f0:I

    iget v5, p0, Lt/d;->z:F

    iput v5, p0, Lt/d;->g0:F

    iget v6, p0, Lt/d;->a:I

    iput v6, p0, Lt/d;->h0:I

    iget v7, p0, Lt/d;->b:I

    iput v7, p0, Lt/d;->i0:I

    iget v8, p0, Lt/d;->c:F

    iput v8, p0, Lt/d;->j0:F

    if-eqz p1, :cond_a

    iget p1, p0, Lt/d;->p:I

    if-eq p1, v4, :cond_1

    iput p1, p0, Lt/d;->c0:I

    :goto_1
    move v2, v3

    goto :goto_2

    :cond_1
    iget p1, p0, Lt/d;->q:I

    if-eq p1, v4, :cond_2

    iput p1, p0, Lt/d;->d0:I

    goto :goto_1

    :cond_2
    :goto_2
    iget p1, p0, Lt/d;->r:I

    if-eq p1, v4, :cond_3

    iput p1, p0, Lt/d;->b0:I

    move v2, v3

    :cond_3
    iget p1, p0, Lt/d;->s:I

    if-eq p1, v4, :cond_4

    iput p1, p0, Lt/d;->a0:I

    move v2, v3

    :cond_4
    iget p1, p0, Lt/d;->x:I

    if-eq p1, v4, :cond_5

    iput p1, p0, Lt/d;->f0:I

    :cond_5
    iget p1, p0, Lt/d;->y:I

    if-eq p1, v4, :cond_6

    iput p1, p0, Lt/d;->e0:I

    :cond_6
    const/high16 p1, 0x3f800000    # 1.0f

    if-eqz v2, :cond_7

    sub-float v2, p1, v5

    iput v2, p0, Lt/d;->g0:F

    :cond_7
    iget-boolean v2, p0, Lt/d;->Y:Z

    if-eqz v2, :cond_10

    iget v2, p0, Lt/d;->R:I

    if-ne v2, v3, :cond_10

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v3, v8, v2

    if-eqz v3, :cond_8

    sub-float/2addr p1, v8

    iput p1, p0, Lt/d;->j0:F

    iput v4, p0, Lt/d;->h0:I

    iput v4, p0, Lt/d;->i0:I

    goto :goto_3

    :cond_8
    if-eq v6, v4, :cond_9

    iput v6, p0, Lt/d;->i0:I

    iput v4, p0, Lt/d;->h0:I

    iput v2, p0, Lt/d;->j0:F

    goto :goto_3

    :cond_9
    if-eq v7, v4, :cond_10

    iput v7, p0, Lt/d;->h0:I

    iput v4, p0, Lt/d;->i0:I

    iput v2, p0, Lt/d;->j0:F

    goto :goto_3

    :cond_a
    iget p1, p0, Lt/d;->p:I

    if-eq p1, v4, :cond_b

    iput p1, p0, Lt/d;->b0:I

    :cond_b
    iget p1, p0, Lt/d;->q:I

    if-eq p1, v4, :cond_c

    iput p1, p0, Lt/d;->a0:I

    :cond_c
    iget p1, p0, Lt/d;->r:I

    if-eq p1, v4, :cond_d

    iput p1, p0, Lt/d;->c0:I

    :cond_d
    iget p1, p0, Lt/d;->s:I

    if-eq p1, v4, :cond_e

    iput p1, p0, Lt/d;->d0:I

    :cond_e
    iget p1, p0, Lt/d;->x:I

    if-eq p1, v4, :cond_f

    iput p1, p0, Lt/d;->e0:I

    :cond_f
    iget p1, p0, Lt/d;->y:I

    if-eq p1, v4, :cond_10

    iput p1, p0, Lt/d;->f0:I

    :cond_10
    :goto_3
    iget p1, p0, Lt/d;->r:I

    if-ne p1, v4, :cond_14

    iget p1, p0, Lt/d;->s:I

    if-ne p1, v4, :cond_14

    iget p1, p0, Lt/d;->q:I

    if-ne p1, v4, :cond_14

    iget p1, p0, Lt/d;->p:I

    if-ne p1, v4, :cond_14

    iget p1, p0, Lt/d;->f:I

    if-eq p1, v4, :cond_11

    iput p1, p0, Lt/d;->c0:I

    iget p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-gtz p1, :cond_12

    if-lez v1, :cond_12

    iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_4

    :cond_11
    iget p1, p0, Lt/d;->g:I

    if-eq p1, v4, :cond_12

    iput p1, p0, Lt/d;->d0:I

    iget p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-gtz p1, :cond_12

    if-lez v1, :cond_12

    iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    :cond_12
    :goto_4
    iget p1, p0, Lt/d;->d:I

    if-eq p1, v4, :cond_13

    iput p1, p0, Lt/d;->a0:I

    iget p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-gtz p1, :cond_14

    if-lez v0, :cond_14

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    goto :goto_5

    :cond_13
    iget p1, p0, Lt/d;->e:I

    if-eq p1, v4, :cond_14

    iput p1, p0, Lt/d;->b0:I

    iget p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-gtz p1, :cond_14

    if-lez v0, :cond_14

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :cond_14
    :goto_5
    return-void
.end method
