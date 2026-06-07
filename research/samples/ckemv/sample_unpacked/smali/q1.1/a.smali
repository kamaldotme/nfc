.class public final Lq1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lq1/a;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp1/b;)V
    .locals 3

    .line 13
    iget v0, p1, Lp1/b;->b:I

    .line 14
    div-int/lit8 v0, v0, 0x2

    iget v1, p1, Lp1/b;->c:I

    div-int/lit8 v1, v1, 0x2

    const/16 v2, 0xa

    invoke-direct {p0, p1, v2, v0, v1}, Lq1/a;-><init>(Lp1/b;III)V

    return-void
.end method

.method public constructor <init>(Lp1/b;III)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq1/a;->g:Ljava/lang/Object;

    .line 3
    iget v0, p1, Lp1/b;->c:I

    .line 4
    iput v0, p0, Lq1/a;->a:I

    .line 5
    iget p1, p1, Lp1/b;->b:I

    iput p1, p0, Lq1/a;->b:I

    .line 6
    div-int/lit8 p2, p2, 0x2

    sub-int v1, p3, p2

    .line 7
    iput v1, p0, Lq1/a;->c:I

    add-int/2addr p3, p2

    .line 8
    iput p3, p0, Lq1/a;->d:I

    sub-int v2, p4, p2

    .line 9
    iput v2, p0, Lq1/a;->f:I

    add-int/2addr p4, p2

    .line 10
    iput p4, p0, Lq1/a;->e:I

    if-ltz v2, :cond_0

    if-ltz v1, :cond_0

    if-ge p4, v0, :cond_0

    if-ge p3, p1, :cond_0

    return-void

    .line 11
    :cond_0
    sget-object p1, Lj1/h;->d:Lj1/h;

    .line 12
    throw p1
.end method


# virtual methods
.method public a(IIIZ)Z
    .locals 2

    iget-object v0, p0, Lq1/a;->g:Ljava/lang/Object;

    check-cast v0, Lp1/b;

    const/4 v1, 0x1

    if-eqz p4, :cond_1

    :goto_0
    if-gt p1, p2, :cond_3

    invoke-virtual {v0, p1, p3}, Lp1/b;->b(II)Z

    move-result p4

    if-eqz p4, :cond_0

    return v1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-gt p1, p2, :cond_3

    invoke-virtual {v0, p3, p1}, Lp1/b;->b(II)Z

    move-result p4

    if-eqz p4, :cond_2

    return v1

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public b()[Lj1/n;
    .locals 14

    iget v0, p0, Lq1/a;->c:I

    iget v1, p0, Lq1/a;->d:I

    iget v2, p0, Lq1/a;->f:I

    iget v3, p0, Lq1/a;->e:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    move v7, v4

    move v8, v7

    move v9, v8

    move v10, v9

    move v6, v5

    :cond_0
    iget v11, p0, Lq1/a;->b:I

    if-eqz v6, :cond_14

    move v12, v4

    move v6, v5

    :cond_1
    :goto_0
    if-nez v6, :cond_2

    if-nez v7, :cond_4

    :cond_2
    if-ge v1, v11, :cond_4

    invoke-virtual {p0, v2, v3, v1, v4}, Lq1/a;->a(IIIZ)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v1, v1, 0x1

    move v7, v5

    move v12, v7

    goto :goto_0

    :cond_3
    if-nez v7, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-lt v1, v11, :cond_5

    :goto_1
    move v4, v5

    goto/16 :goto_5

    :cond_5
    move v6, v5

    :cond_6
    :goto_2
    iget v13, p0, Lq1/a;->a:I

    if-nez v6, :cond_7

    if-nez v8, :cond_9

    :cond_7
    if-ge v3, v13, :cond_9

    invoke-virtual {p0, v0, v1, v3, v5}, Lq1/a;->a(IIIZ)Z

    move-result v6

    if-eqz v6, :cond_8

    add-int/lit8 v3, v3, 0x1

    move v8, v5

    move v12, v8

    goto :goto_2

    :cond_8
    if-nez v8, :cond_6

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_9
    if-lt v3, v13, :cond_a

    goto :goto_1

    :cond_a
    move v6, v5

    :cond_b
    :goto_3
    if-nez v6, :cond_c

    if-nez v9, :cond_e

    :cond_c
    if-ltz v0, :cond_e

    invoke-virtual {p0, v2, v3, v0, v4}, Lq1/a;->a(IIIZ)Z

    move-result v6

    if-eqz v6, :cond_d

    add-int/lit8 v0, v0, -0x1

    move v9, v5

    move v12, v9

    goto :goto_3

    :cond_d
    if-nez v9, :cond_b

    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    :cond_e
    if-gez v0, :cond_f

    goto :goto_1

    :cond_f
    move v6, v12

    move v12, v5

    :cond_10
    :goto_4
    if-nez v12, :cond_11

    if-nez v10, :cond_13

    :cond_11
    if-ltz v2, :cond_13

    invoke-virtual {p0, v0, v1, v2, v5}, Lq1/a;->a(IIIZ)Z

    move-result v12

    if-eqz v12, :cond_12

    add-int/lit8 v2, v2, -0x1

    move v6, v5

    move v10, v6

    goto :goto_4

    :cond_12
    if-nez v10, :cond_10

    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    :cond_13
    if-gez v2, :cond_0

    goto :goto_1

    :cond_14
    :goto_5
    if-nez v4, :cond_1e

    sub-int v4, v1, v0

    const/4 v6, 0x0

    move v8, v5

    move-object v7, v6

    :goto_6
    if-nez v7, :cond_15

    if-ge v8, v4, :cond_15

    int-to-float v7, v0

    sub-int v9, v3, v8

    int-to-float v9, v9

    add-int v10, v0, v8

    int-to-float v10, v10

    int-to-float v12, v3

    invoke-virtual {p0, v7, v9, v10, v12}, Lq1/a;->c(FFFF)Lj1/n;

    move-result-object v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_15
    if-eqz v7, :cond_1d

    move v9, v5

    move-object v8, v6

    :goto_7
    if-nez v8, :cond_16

    if-ge v9, v4, :cond_16

    int-to-float v8, v0

    add-int v10, v2, v9

    int-to-float v10, v10

    add-int v12, v0, v9

    int-to-float v12, v12

    int-to-float v13, v2

    invoke-virtual {p0, v8, v10, v12, v13}, Lq1/a;->c(FFFF)Lj1/n;

    move-result-object v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_16
    if-eqz v8, :cond_1c

    move v9, v5

    move-object v0, v6

    :goto_8
    if-nez v0, :cond_17

    if-ge v9, v4, :cond_17

    int-to-float v0, v1

    add-int v10, v2, v9

    int-to-float v10, v10

    sub-int v12, v1, v9

    int-to-float v12, v12

    int-to-float v13, v2

    invoke-virtual {p0, v0, v10, v12, v13}, Lq1/a;->c(FFFF)Lj1/n;

    move-result-object v0

    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    :cond_17
    if-eqz v0, :cond_1b

    :goto_9
    if-nez v6, :cond_18

    if-ge v5, v4, :cond_18

    int-to-float v2, v1

    sub-int v6, v3, v5

    int-to-float v6, v6

    sub-int v9, v1, v5

    int-to-float v9, v9

    int-to-float v10, v3

    invoke-virtual {p0, v2, v6, v9, v10}, Lq1/a;->c(FFFF)Lj1/n;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_18
    if-eqz v6, :cond_1a

    int-to-float v1, v11

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, v6, Lj1/n;->a:F

    cmpg-float v1, v2, v1

    iget v3, v7, Lj1/n;->a:F

    iget v4, v0, Lj1/n;->a:F

    iget v5, v8, Lj1/n;->a:F

    const/high16 v9, 0x3f800000    # 1.0f

    iget v6, v6, Lj1/n;->b:F

    iget v7, v7, Lj1/n;->b:F

    iget v0, v0, Lj1/n;->b:F

    iget v8, v8, Lj1/n;->b:F

    if-gez v1, :cond_19

    new-instance v1, Lj1/n;

    sub-float/2addr v5, v9

    add-float/2addr v8, v9

    invoke-direct {v1, v5, v8}, Lj1/n;-><init>(FF)V

    new-instance v5, Lj1/n;

    add-float/2addr v3, v9

    add-float/2addr v7, v9

    invoke-direct {v5, v3, v7}, Lj1/n;-><init>(FF)V

    new-instance v3, Lj1/n;

    sub-float/2addr v4, v9

    sub-float/2addr v0, v9

    invoke-direct {v3, v4, v0}, Lj1/n;-><init>(FF)V

    new-instance v0, Lj1/n;

    add-float/2addr v2, v9

    sub-float/2addr v6, v9

    invoke-direct {v0, v2, v6}, Lj1/n;-><init>(FF)V

    filled-new-array {v1, v5, v3, v0}, [Lj1/n;

    move-result-object v0

    goto :goto_a

    :cond_19
    new-instance v1, Lj1/n;

    add-float/2addr v5, v9

    add-float/2addr v8, v9

    invoke-direct {v1, v5, v8}, Lj1/n;-><init>(FF)V

    new-instance v5, Lj1/n;

    add-float/2addr v3, v9

    sub-float/2addr v7, v9

    invoke-direct {v5, v3, v7}, Lj1/n;-><init>(FF)V

    new-instance v3, Lj1/n;

    sub-float/2addr v4, v9

    add-float/2addr v0, v9

    invoke-direct {v3, v4, v0}, Lj1/n;-><init>(FF)V

    new-instance v0, Lj1/n;

    sub-float/2addr v2, v9

    sub-float/2addr v6, v9

    invoke-direct {v0, v2, v6}, Lj1/n;-><init>(FF)V

    filled-new-array {v1, v5, v3, v0}, [Lj1/n;

    move-result-object v0

    :goto_a
    return-object v0

    :cond_1a
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_1b
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_1c
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_1d
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_1e
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0
.end method

.method public c(FFFF)Lj1/n;
    .locals 5

    invoke-static {p1, p2, p3, p4}, Lv0/f;->s(FFFF)F

    move-result v0

    invoke-static {v0}, Lv0/f;->K(F)I

    move-result v0

    sub-float/2addr p3, p1

    int-to-float v1, v0

    div-float/2addr p3, v1

    sub-float/2addr p4, p2

    div-float/2addr p4, v1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    int-to-float v2, v1

    mul-float v3, v2, p3

    add-float/2addr v3, p1

    invoke-static {v3}, Lv0/f;->K(F)I

    move-result v3

    mul-float/2addr v2, p4

    add-float/2addr v2, p2

    invoke-static {v2}, Lv0/f;->K(F)I

    move-result v2

    iget-object v4, p0, Lq1/a;->g:Ljava/lang/Object;

    check-cast v4, Lp1/b;

    invoke-virtual {v4, v3, v2}, Lp1/b;->b(II)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance p1, Lj1/n;

    int-to-float p2, v3

    int-to-float p3, v2

    invoke-direct {p1, p2, p3}, Lj1/n;-><init>(FF)V

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Lr/d;Ls/b;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget v3, v1, Lr/d;->V:I

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    iput v5, v2, Ls/b;->e:I

    iput v5, v2, Ls/b;->f:I

    iput v5, v2, Ls/b;->g:I

    return-void

    :cond_1
    iget v3, v2, Ls/b;->a:I

    iget v4, v2, Ls/b;->b:I

    iget v6, v2, Ls/b;->c:I

    iget v7, v2, Ls/b;->d:I

    iget v8, v0, Lq1/a;->a:I

    iget v9, v0, Lq1/a;->b:I

    add-int/2addr v8, v9

    iget v9, v0, Lq1/a;->c:I

    iget-object v10, v1, Lr/d;->U:Ljava/lang/Object;

    check-cast v10, Landroid/view/View;

    invoke-static {v3}, Lq/h;->a(I)I

    move-result v11

    iget-object v12, v1, Lr/d;->z:Lr/c;

    iget-object v13, v1, Lr/d;->x:Lr/c;

    iget-object v14, v1, Lr/d;->g:[I

    const/4 v15, 0x1

    const/4 v5, 0x2

    if-eqz v11, :cond_c

    if-eq v11, v15, :cond_b

    if-eq v11, v5, :cond_5

    const/4 v6, 0x3

    if-eq v11, v6, :cond_2

    const/4 v6, 0x0

    :goto_0
    const/4 v9, 0x0

    goto/16 :goto_8

    :cond_2
    iget v6, v0, Lq1/a;->e:I

    if-eqz v13, :cond_3

    iget v11, v13, Lr/c;->e:I

    goto :goto_1

    :cond_3
    const/4 v11, 0x0

    :goto_1
    if-eqz v12, :cond_4

    iget v15, v12, Lr/c;->e:I

    add-int/2addr v11, v15

    :cond_4
    add-int/2addr v9, v11

    const/4 v11, -0x1

    invoke-static {v6, v9, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    aput v11, v14, v5

    goto :goto_0

    :cond_5
    iget v6, v0, Lq1/a;->e:I

    const/4 v11, -0x2

    invoke-static {v6, v9, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    iget v9, v1, Lr/d;->j:I

    const/4 v11, 0x1

    if-ne v9, v11, :cond_6

    const/4 v9, 0x1

    :goto_2
    const/4 v11, 0x0

    goto :goto_3

    :cond_6
    const/4 v9, 0x0

    goto :goto_2

    :goto_3
    aput v11, v14, v5

    iget-boolean v15, v2, Ls/b;->j:Z

    if-eqz v15, :cond_9

    if-eqz v9, :cond_8

    const/4 v15, 0x3

    aget v16, v14, v15

    if-eqz v16, :cond_8

    aget v15, v14, v11

    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v11

    if-ne v15, v11, :cond_7

    goto :goto_4

    :cond_7
    const/4 v11, 0x1

    goto :goto_5

    :cond_8
    :goto_4
    const/4 v11, 0x0

    :goto_5
    if-eqz v9, :cond_a

    if-eqz v11, :cond_9

    goto :goto_6

    :cond_9
    const/high16 v11, 0x40000000    # 2.0f

    goto :goto_7

    :cond_a
    :goto_6
    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v6

    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v6, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    goto :goto_0

    :goto_7
    const/4 v9, 0x1

    goto :goto_8

    :cond_b
    const/high16 v11, 0x40000000    # 2.0f

    iget v6, v0, Lq1/a;->e:I

    const/4 v15, -0x2

    invoke-static {v6, v9, v15}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v6

    aput v15, v14, v5

    goto :goto_7

    :cond_c
    const/high16 v11, 0x40000000    # 2.0f

    invoke-static {v6, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    aput v6, v14, v5

    move v6, v9

    goto :goto_0

    :goto_8
    invoke-static {v4}, Lq/h;->a(I)I

    move-result v11

    if-eqz v11, :cond_17

    const/4 v15, 0x1

    if-eq v11, v15, :cond_16

    if-eq v11, v5, :cond_10

    const/4 v7, 0x3

    if-eq v11, v7, :cond_d

    move v8, v7

    const/4 v7, 0x0

    const/4 v11, 0x0

    goto/16 :goto_12

    :cond_d
    iget v7, v0, Lq1/a;->f:I

    if-eqz v13, :cond_e

    iget-object v11, v1, Lr/d;->y:Lr/c;

    iget v11, v11, Lr/c;->e:I

    goto :goto_9

    :cond_e
    const/4 v11, 0x0

    :goto_9
    if-eqz v12, :cond_f

    iget-object v12, v1, Lr/d;->A:Lr/c;

    iget v12, v12, Lr/c;->e:I

    add-int/2addr v11, v12

    :cond_f
    add-int/2addr v8, v11

    const/4 v11, -0x1

    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    const/4 v12, 0x3

    aput v11, v14, v12

    move v11, v7

    move v8, v12

    :goto_a
    const/4 v7, 0x0

    goto :goto_12

    :cond_10
    const/4 v12, 0x3

    iget v7, v0, Lq1/a;->f:I

    const/4 v11, -0x2

    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v11

    iget v7, v1, Lr/d;->k:I

    const/4 v8, 0x1

    if-ne v7, v8, :cond_11

    move v7, v8

    :goto_b
    const/4 v13, 0x0

    goto :goto_c

    :cond_11
    const/4 v7, 0x0

    goto :goto_b

    :goto_c
    aput v13, v14, v12

    iget-boolean v12, v2, Ls/b;->j:Z

    if-eqz v12, :cond_14

    if-eqz v7, :cond_13

    aget v12, v14, v5

    if-eqz v12, :cond_13

    aget v12, v14, v8

    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v8

    if-ne v12, v8, :cond_12

    goto :goto_d

    :cond_12
    const/4 v8, 0x1

    goto :goto_e

    :cond_13
    :goto_d
    const/4 v8, 0x0

    :goto_e
    if-eqz v7, :cond_15

    if-eqz v8, :cond_14

    goto :goto_f

    :cond_14
    const/high16 v12, 0x40000000    # 2.0f

    goto :goto_11

    :cond_15
    :goto_f
    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v7

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    const/4 v7, 0x0

    :goto_10
    const/4 v8, 0x3

    goto :goto_12

    :goto_11
    const/4 v7, 0x1

    goto :goto_10

    :cond_16
    const/high16 v12, 0x40000000    # 2.0f

    iget v7, v0, Lq1/a;->f:I

    const/4 v11, -0x2

    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    const/4 v8, 0x3

    aput v11, v14, v8

    move v11, v7

    const/4 v7, 0x1

    goto :goto_12

    :cond_17
    const/4 v8, 0x3

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    aput v7, v14, v8

    goto :goto_a

    :goto_12
    if-ne v3, v8, :cond_18

    const/4 v12, 0x1

    goto :goto_13

    :cond_18
    const/4 v12, 0x0

    :goto_13
    if-ne v4, v8, :cond_19

    const/4 v8, 0x1

    goto :goto_14

    :cond_19
    const/4 v8, 0x0

    :goto_14
    const/4 v13, 0x4

    const/4 v15, 0x1

    if-eq v4, v13, :cond_1b

    if-ne v4, v15, :cond_1a

    goto :goto_15

    :cond_1a
    const/4 v4, 0x0

    goto :goto_16

    :cond_1b
    :goto_15
    move v4, v15

    :goto_16
    if-eq v3, v13, :cond_1d

    if-ne v3, v15, :cond_1c

    goto :goto_17

    :cond_1c
    const/4 v3, 0x0

    goto :goto_18

    :cond_1d
    :goto_17
    const/4 v3, 0x1

    :goto_18
    const/4 v13, 0x0

    if-eqz v12, :cond_1e

    iget v15, v1, Lr/d;->L:F

    cmpl-float v15, v15, v13

    if-lez v15, :cond_1e

    const/4 v15, 0x1

    goto :goto_19

    :cond_1e
    const/4 v15, 0x0

    :goto_19
    if-eqz v8, :cond_1f

    iget v5, v1, Lr/d;->L:F

    cmpl-float v5, v5, v13

    if-lez v5, :cond_1f

    const/4 v5, 0x1

    goto :goto_1a

    :cond_1f
    const/4 v5, 0x0

    :goto_1a
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    check-cast v13, Lt/d;

    iget-boolean v0, v2, Ls/b;->j:Z

    if-nez v0, :cond_21

    if-eqz v12, :cond_21

    iget v0, v1, Lr/d;->j:I

    if-nez v0, :cond_21

    if-eqz v8, :cond_21

    iget v0, v1, Lr/d;->k:I

    if-eqz v0, :cond_20

    goto :goto_1b

    :cond_20
    const/4 v0, -0x1

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    goto/16 :goto_24

    :cond_21
    :goto_1b
    instance-of v0, v10, Lt/p;

    if-eqz v0, :cond_22

    instance-of v0, v1, Lr/g;

    if-eqz v0, :cond_22

    move-object v0, v1

    check-cast v0, Lr/g;

    move-object v8, v10

    check-cast v8, Lt/p;

    invoke-virtual {v8, v0, v6, v11}, Lt/p;->h(Lr/g;II)V

    goto :goto_1c

    :cond_22
    invoke-virtual {v10, v6, v11}, Landroid/view/View;->measure(II)V

    :goto_1c
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v12

    if-eqz v9, :cond_23

    const/4 v9, 0x0

    aput v0, v14, v9

    const/16 v16, 0x2

    aput v8, v14, v16

    goto :goto_1d

    :cond_23
    const/4 v9, 0x0

    const/16 v16, 0x2

    aput v9, v14, v9

    aput v9, v14, v16

    :goto_1d
    if-eqz v7, :cond_24

    const/4 v7, 0x1

    aput v8, v14, v7

    const/16 v16, 0x3

    aput v0, v14, v16

    goto :goto_1e

    :cond_24
    const/4 v7, 0x1

    const/16 v16, 0x3

    aput v9, v14, v7

    aput v9, v14, v16

    :goto_1e
    iget v7, v1, Lr/d;->m:I

    if-lez v7, :cond_25

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v7

    goto :goto_1f

    :cond_25
    move v7, v0

    :goto_1f
    iget v14, v1, Lr/d;->n:I

    if-lez v14, :cond_26

    invoke-static {v14, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_26
    iget v14, v1, Lr/d;->p:I

    if-lez v14, :cond_27

    invoke-static {v14, v8}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_20

    :cond_27
    move v14, v8

    :goto_20
    iget v9, v1, Lr/d;->q:I

    if-lez v9, :cond_28

    invoke-static {v9, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    :cond_28
    const/high16 v9, 0x3f000000    # 0.5f

    if-eqz v15, :cond_29

    if-eqz v4, :cond_29

    iget v3, v1, Lr/d;->L:F

    int-to-float v4, v14

    mul-float/2addr v4, v3

    add-float/2addr v4, v9

    float-to-int v3, v4

    move v7, v3

    goto :goto_21

    :cond_29
    if-eqz v5, :cond_2a

    if-eqz v3, :cond_2a

    iget v3, v1, Lr/d;->L:F

    int-to-float v4, v7

    div-float/2addr v4, v3

    add-float/2addr v4, v9

    float-to-int v3, v4

    move v14, v3

    :cond_2a
    :goto_21
    if-ne v0, v7, :cond_2c

    if-eq v8, v14, :cond_2b

    goto :goto_22

    :cond_2b
    move v11, v12

    const/4 v0, -0x1

    goto :goto_24

    :cond_2c
    :goto_22
    if-eq v0, v7, :cond_2d

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v7, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    goto :goto_23

    :cond_2d
    const/high16 v0, 0x40000000    # 2.0f

    :goto_23
    if-eq v8, v14, :cond_2e

    invoke-static {v14, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    :cond_2e
    invoke-virtual {v10, v6, v11}, Landroid/view/View;->measure(II)V

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    move-result v3

    move v14, v0

    move v7, v11

    const/4 v0, -0x1

    move v11, v3

    :goto_24
    if-eq v11, v0, :cond_2f

    const/4 v0, 0x1

    goto :goto_25

    :cond_2f
    const/4 v0, 0x0

    :goto_25
    iget v3, v2, Ls/b;->c:I

    if-ne v7, v3, :cond_31

    iget v3, v2, Ls/b;->d:I

    if-eq v14, v3, :cond_30

    goto :goto_26

    :cond_30
    const/4 v5, 0x0

    goto :goto_27

    :cond_31
    :goto_26
    const/4 v5, 0x1

    :goto_27
    iput-boolean v5, v2, Ls/b;->i:Z

    iget-boolean v3, v13, Lt/d;->X:Z

    if-eqz v3, :cond_32

    const/4 v0, 0x1

    :cond_32
    if-eqz v0, :cond_33

    const/4 v3, -0x1

    if-eq v11, v3, :cond_33

    iget v1, v1, Lr/d;->P:I

    if-eq v1, v11, :cond_33

    const/4 v1, 0x1

    iput-boolean v1, v2, Ls/b;->i:Z

    :cond_33
    iput v7, v2, Ls/b;->e:I

    iput v14, v2, Ls/b;->f:I

    iput-boolean v0, v2, Ls/b;->h:Z

    iput v11, v2, Ls/b;->g:I

    return-void
.end method
