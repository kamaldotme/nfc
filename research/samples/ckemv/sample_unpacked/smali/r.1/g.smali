.class public final Lr/g;
.super Lr/i;
.source "SourceFile"


# instance fields
.field public A0:F

.field public B0:F

.field public C0:I

.field public D0:I

.field public E0:I

.field public F0:I

.field public G0:I

.field public H0:I

.field public I0:I

.field public J0:Ljava/util/ArrayList;

.field public K0:[Lr/d;

.field public L0:[Lr/d;

.field public M0:[I

.field public N0:[Lr/d;

.field public O0:I

.field public f0:I

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:I

.field public k0:I

.field public l0:Z

.field public m0:I

.field public n0:I

.field public o0:Ls/b;

.field public p0:Lq1/a;

.field public q0:I

.field public r0:I

.field public s0:I

.field public t0:I

.field public u0:I

.field public v0:I

.field public w0:F

.field public x0:F

.field public y0:F

.field public z0:F


# virtual methods
.method public final B()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lr/i;->e0:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lr/i;->d0:[Lr/d;

    aget-object v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final C(Lr/d;I)I
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p1, Lr/d;->c0:[I

    const/4 v2, 0x1

    aget v3, v1, v2

    const/4 v4, 0x3

    if-ne v3, v4, :cond_5

    iget v3, p1, Lr/d;->k:I

    if-nez v3, :cond_1

    return v0

    :cond_1
    const/4 v5, 0x2

    if-ne v3, v5, :cond_3

    iget v2, p1, Lr/d;->r:F

    int-to-float p2, p2

    mul-float/2addr v2, p2

    float-to-int p2, v2

    invoke-virtual {p1}, Lr/d;->i()I

    move-result v2

    if-eq p2, v2, :cond_2

    aget v4, v1, v0

    invoke-virtual {p1}, Lr/d;->l()I

    move-result v5

    const/4 v6, 0x1

    move-object v3, p0

    move v7, p2

    move-object v8, p1

    invoke-virtual/range {v3 .. v8}, Lr/g;->E(IIIILr/d;)V

    :cond_2
    return p2

    :cond_3
    if-ne v3, v2, :cond_4

    invoke-virtual {p1}, Lr/d;->i()I

    move-result p1

    return p1

    :cond_4
    if-ne v3, v4, :cond_5

    invoke-virtual {p1}, Lr/d;->l()I

    move-result p2

    int-to-float p2, p2

    iget p1, p1, Lr/d;->L:F

    mul-float/2addr p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1

    :cond_5
    invoke-virtual {p1}, Lr/d;->i()I

    move-result p1

    return p1
.end method

.method public final D(Lr/d;I)I
    .locals 11

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p1, Lr/d;->c0:[I

    aget v2, v1, v0

    const/4 v3, 0x3

    if-ne v2, v3, :cond_5

    iget v2, p1, Lr/d;->j:I

    if-nez v2, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x2

    const/4 v4, 0x1

    if-ne v2, v0, :cond_3

    iget v0, p1, Lr/d;->o:F

    int-to-float p2, p2

    mul-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1}, Lr/d;->l()I

    move-result v0

    if-eq p2, v0, :cond_2

    aget v8, v1, v4

    invoke-virtual {p1}, Lr/d;->i()I

    move-result v9

    const/4 v6, 0x1

    move-object v5, p0

    move v7, p2

    move-object v10, p1

    invoke-virtual/range {v5 .. v10}, Lr/g;->E(IIIILr/d;)V

    :cond_2
    return p2

    :cond_3
    if-ne v2, v4, :cond_4

    invoke-virtual {p1}, Lr/d;->l()I

    move-result p1

    return p1

    :cond_4
    if-ne v2, v3, :cond_5

    invoke-virtual {p1}, Lr/d;->i()I

    move-result p2

    int-to-float p2, p2

    iget p1, p1, Lr/d;->L:F

    mul-float/2addr p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1

    :cond_5
    invoke-virtual {p1}, Lr/d;->l()I

    move-result p1

    return p1
.end method

.method public final E(IIIILr/d;)V
    .locals 2

    :goto_0
    iget-object v0, p0, Lr/g;->p0:Lq1/a;

    if-nez v0, :cond_0

    iget-object v1, p0, Lr/d;->I:Lr/d;

    if-eqz v1, :cond_0

    check-cast v1, Lr/e;

    iget-object v0, v1, Lr/e;->g0:Lq1/a;

    iput-object v0, p0, Lr/g;->p0:Lq1/a;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lr/g;->o0:Ls/b;

    iput p1, v1, Ls/b;->a:I

    iput p3, v1, Ls/b;->b:I

    iput p2, v1, Ls/b;->c:I

    iput p4, v1, Ls/b;->d:I

    invoke-virtual {v0, p5, v1}, Lq1/a;->d(Lr/d;Ls/b;)V

    iget p1, v1, Ls/b;->e:I

    invoke-virtual {p5, p1}, Lr/d;->y(I)V

    iget p1, v1, Ls/b;->f:I

    invoke-virtual {p5, p1}, Lr/d;->v(I)V

    iget-boolean p1, v1, Ls/b;->h:Z

    iput-boolean p1, p5, Lr/d;->w:Z

    iget p1, v1, Ls/b;->g:I

    iput p1, p5, Lr/d;->P:I

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p5, Lr/d;->w:Z

    return-void
.end method

.method public final a(Lq/e;)V
    .locals 11

    invoke-super {p0, p1}, Lr/d;->a(Lq/e;)V

    iget-object p1, p0, Lr/d;->I:Lr/d;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    check-cast p1, Lr/e;

    iget-boolean p1, p1, Lr/e;->h0:Z

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iget v1, p0, Lr/g;->G0:I

    iget-object v2, p0, Lr/g;->J0:Ljava/util/ArrayList;

    const/4 v3, 0x1

    if-eqz v1, :cond_19

    if-eq v1, v3, :cond_17

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto/16 :goto_c

    :cond_1
    iget-object v1, p0, Lr/g;->M0:[I

    if-eqz v1, :cond_1a

    iget-object v1, p0, Lr/g;->L0:[Lr/d;

    if-eqz v1, :cond_1a

    iget-object v1, p0, Lr/g;->K0:[Lr/d;

    if-nez v1, :cond_2

    goto/16 :goto_c

    :cond_2
    move v1, v0

    :goto_1
    iget v2, p0, Lr/g;->O0:I

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lr/g;->N0:[Lr/d;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lr/d;->t()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lr/g;->M0:[I

    aget v2, v1, v0

    aget v1, v1, v3

    const/4 v4, 0x0

    move v5, v0

    :goto_2
    const/16 v6, 0x8

    if-ge v5, v2, :cond_a

    if-eqz p1, :cond_4

    sub-int v7, v2, v5

    sub-int/2addr v7, v3

    goto :goto_3

    :cond_4
    move v7, v5

    :goto_3
    iget-object v8, p0, Lr/g;->L0:[Lr/d;

    aget-object v7, v8, v7

    if-eqz v7, :cond_9

    iget v8, v7, Lr/d;->V:I

    if-ne v8, v6, :cond_5

    goto :goto_4

    :cond_5
    iget-object v6, v7, Lr/d;->x:Lr/c;

    if-nez v5, :cond_6

    iget v8, p0, Lr/g;->j0:I

    iget-object v9, p0, Lr/d;->x:Lr/c;

    invoke-virtual {v7, v6, v9, v8}, Lr/d;->e(Lr/c;Lr/c;I)V

    iget v8, p0, Lr/g;->q0:I

    iput v8, v7, Lr/d;->X:I

    iget v8, p0, Lr/g;->w0:F

    iput v8, v7, Lr/d;->S:F

    :cond_6
    add-int/lit8 v8, v2, -0x1

    if-ne v5, v8, :cond_7

    iget v8, p0, Lr/g;->k0:I

    iget-object v9, v7, Lr/d;->z:Lr/c;

    iget-object v10, p0, Lr/d;->z:Lr/c;

    invoke-virtual {v7, v9, v10, v8}, Lr/d;->e(Lr/c;Lr/c;I)V

    :cond_7
    if-lez v5, :cond_8

    iget-object v8, v4, Lr/d;->z:Lr/c;

    iget v9, p0, Lr/g;->C0:I

    invoke-virtual {v7, v6, v8, v9}, Lr/d;->e(Lr/c;Lr/c;I)V

    iget-object v8, v4, Lr/d;->z:Lr/c;

    invoke-virtual {v4, v8, v6, v0}, Lr/d;->e(Lr/c;Lr/c;I)V

    :cond_8
    move-object v4, v7

    :cond_9
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_a
    move p1, v0

    :goto_5
    if-ge p1, v1, :cond_10

    iget-object v5, p0, Lr/g;->K0:[Lr/d;

    aget-object v5, v5, p1

    if-eqz v5, :cond_f

    iget v7, v5, Lr/d;->V:I

    if-ne v7, v6, :cond_b

    goto :goto_6

    :cond_b
    iget-object v7, v5, Lr/d;->y:Lr/c;

    if-nez p1, :cond_c

    iget v8, p0, Lr/g;->f0:I

    iget-object v9, p0, Lr/d;->y:Lr/c;

    invoke-virtual {v5, v7, v9, v8}, Lr/d;->e(Lr/c;Lr/c;I)V

    iget v8, p0, Lr/g;->r0:I

    iput v8, v5, Lr/d;->Y:I

    iget v8, p0, Lr/g;->x0:F

    iput v8, v5, Lr/d;->T:F

    :cond_c
    add-int/lit8 v8, v1, -0x1

    if-ne p1, v8, :cond_d

    iget v8, p0, Lr/g;->g0:I

    iget-object v9, v5, Lr/d;->A:Lr/c;

    iget-object v10, p0, Lr/d;->A:Lr/c;

    invoke-virtual {v5, v9, v10, v8}, Lr/d;->e(Lr/c;Lr/c;I)V

    :cond_d
    if-lez p1, :cond_e

    iget-object v8, v4, Lr/d;->A:Lr/c;

    iget v9, p0, Lr/g;->D0:I

    invoke-virtual {v5, v7, v8, v9}, Lr/d;->e(Lr/c;Lr/c;I)V

    iget-object v8, v4, Lr/d;->A:Lr/c;

    invoke-virtual {v4, v8, v7, v0}, Lr/d;->e(Lr/c;Lr/c;I)V

    :cond_e
    move-object v4, v5

    :cond_f
    :goto_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    :cond_10
    move p1, v0

    :goto_7
    if-ge p1, v2, :cond_1a

    move v4, v0

    :goto_8
    if-ge v4, v1, :cond_16

    mul-int v5, v4, v2

    add-int/2addr v5, p1

    iget v7, p0, Lr/g;->I0:I

    if-ne v7, v3, :cond_11

    mul-int v5, p1, v1

    add-int/2addr v5, v4

    :cond_11
    iget-object v7, p0, Lr/g;->N0:[Lr/d;

    array-length v8, v7

    if-lt v5, v8, :cond_12

    goto :goto_9

    :cond_12
    aget-object v5, v7, v5

    if-eqz v5, :cond_15

    iget v7, v5, Lr/d;->V:I

    if-ne v7, v6, :cond_13

    goto :goto_9

    :cond_13
    iget-object v7, p0, Lr/g;->L0:[Lr/d;

    aget-object v7, v7, p1

    iget-object v8, p0, Lr/g;->K0:[Lr/d;

    aget-object v8, v8, v4

    if-eq v5, v7, :cond_14

    iget-object v9, v7, Lr/d;->x:Lr/c;

    iget-object v10, v5, Lr/d;->x:Lr/c;

    invoke-virtual {v5, v10, v9, v0}, Lr/d;->e(Lr/c;Lr/c;I)V

    iget-object v9, v5, Lr/d;->z:Lr/c;

    iget-object v7, v7, Lr/d;->z:Lr/c;

    invoke-virtual {v5, v9, v7, v0}, Lr/d;->e(Lr/c;Lr/c;I)V

    :cond_14
    if-eq v5, v8, :cond_15

    iget-object v7, v8, Lr/d;->y:Lr/c;

    iget-object v9, v5, Lr/d;->y:Lr/c;

    invoke-virtual {v5, v9, v7, v0}, Lr/d;->e(Lr/c;Lr/c;I)V

    iget-object v7, v5, Lr/d;->A:Lr/c;

    iget-object v8, v8, Lr/d;->A:Lr/c;

    invoke-virtual {v5, v7, v8, v0}, Lr/d;->e(Lr/c;Lr/c;I)V

    :cond_15
    :goto_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_16
    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    :cond_17
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v4, v0

    :goto_a
    if-ge v4, v1, :cond_1a

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr/f;

    add-int/lit8 v6, v1, -0x1

    if-ne v4, v6, :cond_18

    move v6, v3

    goto :goto_b

    :cond_18
    move v6, v0

    :goto_b
    invoke-virtual {v5, v4, p1, v6}, Lr/f;->b(IZZ)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1a

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr/f;

    invoke-virtual {v1, v0, p1, v3}, Lr/f;->b(IZZ)V

    :cond_1a
    :goto_c
    iput-boolean v0, p0, Lr/g;->l0:Z

    return-void
.end method
