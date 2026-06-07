.class public final Ls/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lr/e;

.field public b:Z

.field public c:Z

.field public d:Lr/e;

.field public e:Ljava/util/ArrayList;

.field public f:Lq1/a;

.field public g:Ls/b;

.field public h:Ljava/util/ArrayList;


# virtual methods
.method public final a(Ls/f;ILjava/util/ArrayList;Ls/k;)V
    .locals 6

    iget-object p1, p1, Ls/f;->d:Ls/m;

    iget-object v0, p1, Ls/m;->c:Ls/k;

    if-nez v0, :cond_a

    iget-object v0, p0, Ls/e;->a:Lr/e;

    iget-object v1, v0, Lr/d;->d:Ls/j;

    if-eq p1, v1, :cond_a

    iget-object v0, v0, Lr/d;->e:Ls/l;

    if-ne p1, v0, :cond_0

    goto/16 :goto_6

    :cond_0
    if-nez p4, :cond_1

    new-instance p4, Ls/k;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p4, Ls/k;->a:Ls/m;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p4, Ls/k;->b:Ljava/util/ArrayList;

    iput-object p1, p4, Ls/k;->a:Ls/m;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iput-object p4, p1, Ls/m;->c:Ls/k;

    iget-object v0, p4, Ls/k;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Ls/m;->h:Ls/f;

    iget-object v1, v0, Ls/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls/d;

    instance-of v3, v2, Ls/f;

    if-eqz v3, :cond_2

    check-cast v2, Ls/f;

    invoke-virtual {p0, v2, p2, p3, p4}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_0

    :cond_3
    iget-object v1, p1, Ls/m;->i:Ls/f;

    iget-object v2, v1, Ls/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls/d;

    instance-of v4, v3, Ls/f;

    if-eqz v4, :cond_4

    check-cast v3, Ls/f;

    invoke-virtual {p0, v3, p2, p3, p4}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_1

    :cond_5
    const/4 v2, 0x1

    if-ne p2, v2, :cond_7

    instance-of v3, p1, Ls/l;

    if-eqz v3, :cond_7

    move-object v3, p1

    check-cast v3, Ls/l;

    iget-object v3, v3, Ls/l;->k:Ls/f;

    iget-object v3, v3, Ls/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls/d;

    instance-of v5, v4, Ls/f;

    if-eqz v5, :cond_6

    check-cast v4, Ls/f;

    invoke-virtual {p0, v4, p2, p3, p4}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_2

    :cond_7
    iget-object v0, v0, Ls/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls/f;

    invoke-virtual {p0, v3, p2, p3, p4}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_3

    :cond_8
    iget-object v0, v1, Ls/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls/f;

    invoke-virtual {p0, v1, p2, p3, p4}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_4

    :cond_9
    if-ne p2, v2, :cond_a

    instance-of v0, p1, Ls/l;

    if-eqz v0, :cond_a

    check-cast p1, Ls/l;

    iget-object p1, p1, Ls/l;->k:Ls/f;

    iget-object p1, p1, Ls/f;->l:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls/f;

    invoke-virtual {p0, v0, p2, p3, p4}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_5

    :cond_a
    :goto_6
    return-void
.end method

.method public final b(Lr/e;)V
    .locals 19

    move-object/from16 v0, p1

    iget-object v1, v0, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr/d;

    iget-object v3, v2, Lr/d;->c0:[I

    const/4 v4, 0x0

    aget v5, v3, v4

    const/4 v9, 0x1

    aget v3, v3, v9

    iget v6, v2, Lr/d;->V:I

    const/16 v7, 0x8

    if-ne v6, v7, :cond_1

    iput-boolean v9, v2, Lr/d;->a:Z

    goto :goto_0

    :cond_1
    iget v6, v2, Lr/d;->o:F

    const/high16 v10, 0x3f800000    # 1.0f

    cmpg-float v7, v6, v10

    const/4 v8, 0x3

    const/4 v11, 0x2

    if-gez v7, :cond_2

    if-ne v5, v8, :cond_2

    iput v11, v2, Lr/d;->j:I

    :cond_2
    iget v7, v2, Lr/d;->r:F

    cmpg-float v12, v7, v10

    if-gez v12, :cond_3

    if-ne v3, v8, :cond_3

    iput v11, v2, Lr/d;->k:I

    :cond_3
    iget v12, v2, Lr/d;->L:F

    const/4 v13, 0x0

    cmpl-float v12, v12, v13

    const/4 v13, 0x2

    const/4 v14, 0x1

    if-lez v12, :cond_9

    if-ne v5, v8, :cond_5

    if-eq v3, v13, :cond_4

    if-ne v3, v14, :cond_5

    :cond_4
    iput v8, v2, Lr/d;->j:I

    goto :goto_1

    :cond_5
    if-ne v3, v8, :cond_7

    if-eq v5, v13, :cond_6

    if-ne v5, v14, :cond_7

    :cond_6
    iput v8, v2, Lr/d;->k:I

    goto :goto_1

    :cond_7
    if-ne v5, v8, :cond_9

    if-ne v3, v8, :cond_9

    iget v12, v2, Lr/d;->j:I

    if-nez v12, :cond_8

    iput v8, v2, Lr/d;->j:I

    :cond_8
    iget v12, v2, Lr/d;->k:I

    if-nez v12, :cond_9

    iput v8, v2, Lr/d;->k:I

    :cond_9
    :goto_1
    iget-object v12, v2, Lr/d;->z:Lr/c;

    iget-object v15, v2, Lr/d;->x:Lr/c;

    if-ne v5, v8, :cond_b

    iget v10, v2, Lr/d;->j:I

    if-ne v10, v9, :cond_b

    iget-object v10, v15, Lr/c;->d:Lr/c;

    if-eqz v10, :cond_a

    iget-object v10, v12, Lr/c;->d:Lr/c;

    if-nez v10, :cond_b

    :cond_a
    move v5, v13

    :cond_b
    iget-object v10, v2, Lr/d;->A:Lr/c;

    iget-object v4, v2, Lr/d;->y:Lr/c;

    if-ne v3, v8, :cond_d

    iget v11, v2, Lr/d;->k:I

    if-ne v11, v9, :cond_d

    iget-object v11, v4, Lr/c;->d:Lr/c;

    if-eqz v11, :cond_c

    iget-object v11, v10, Lr/c;->d:Lr/c;

    if-nez v11, :cond_d

    :cond_c
    move v11, v13

    goto :goto_2

    :cond_d
    move v11, v3

    :goto_2
    iget-object v3, v2, Lr/d;->d:Ls/j;

    iput v5, v3, Ls/m;->d:I

    iget v9, v2, Lr/d;->j:I

    iput v9, v3, Ls/m;->a:I

    move/from16 v16, v7

    iget-object v7, v2, Lr/d;->e:Ls/l;

    iput v11, v7, Ls/m;->d:I

    iget v8, v2, Lr/d;->k:I

    iput v8, v7, Ls/m;->a:I

    const/4 v13, 0x4

    if-eq v5, v13, :cond_e

    if-eq v5, v14, :cond_e

    move-object/from16 v17, v4

    const/4 v4, 0x2

    if-ne v5, v4, :cond_10

    goto :goto_3

    :cond_e
    move-object/from16 v17, v4

    const/4 v4, 0x2

    :goto_3
    if-eq v11, v13, :cond_f

    if-eq v11, v14, :cond_f

    if-ne v11, v4, :cond_10

    :cond_f
    move-object v13, v3

    move-object v9, v7

    goto/16 :goto_d

    :cond_10
    iget-object v10, v0, Lr/d;->c0:[I

    iget-object v12, v2, Lr/d;->F:[Lr/c;

    const/high16 v15, 0x3f000000    # 0.5f

    const/4 v13, 0x3

    if-ne v5, v13, :cond_1a

    if-eq v11, v4, :cond_12

    if-ne v11, v14, :cond_11

    goto :goto_4

    :cond_11
    move-object v15, v7

    move/from16 v18, v13

    move-object v13, v3

    move/from16 v3, v18

    goto/16 :goto_8

    :cond_12
    :goto_4
    if-ne v9, v13, :cond_14

    if-ne v11, v4, :cond_13

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v13, v3

    move-object/from16 v3, p0

    move v6, v4

    move-object v9, v7

    move v7, v8

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    goto :goto_5

    :cond_13
    move-object v13, v3

    move-object v9, v7

    :goto_5
    invoke-virtual {v2}, Lr/d;->i()I

    move-result v7

    int-to-float v3, v7

    iget v4, v2, Lr/d;->L:F

    mul-float/2addr v3, v4

    add-float/2addr v3, v15

    float-to-int v5, v3

    move-object/from16 v3, p0

    move v4, v14

    move v6, v14

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    iget-object v3, v9, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lr/d;->a:Z

    goto/16 :goto_0

    :cond_14
    move-object v13, v3

    const/4 v3, 0x1

    if-ne v9, v3, :cond_15

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p0

    const/4 v4, 0x2

    move v6, v11

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v2

    iput v2, v3, Ls/g;->m:I

    goto/16 :goto_0

    :cond_15
    const/4 v3, 0x2

    if-ne v9, v3, :cond_18

    const/4 v3, 0x0

    aget v4, v10, v3

    if-eq v4, v14, :cond_17

    const/4 v3, 0x4

    if-ne v4, v3, :cond_16

    goto :goto_7

    :cond_16
    :goto_6
    move-object v15, v7

    const/4 v3, 0x3

    goto :goto_8

    :cond_17
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v6, v3

    add-float/2addr v6, v15

    float-to-int v5, v6

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v8

    move-object/from16 v3, p0

    move v4, v14

    move v6, v11

    move-object v9, v7

    move v7, v8

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    iget-object v3, v9, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lr/d;->a:Z

    goto/16 :goto_0

    :cond_18
    const/4 v3, 0x1

    const/4 v4, 0x0

    aget-object v15, v12, v4

    iget-object v4, v15, Lr/c;->d:Lr/c;

    if-eqz v4, :cond_19

    aget-object v4, v12, v3

    iget-object v3, v4, Lr/c;->d:Lr/c;

    if-nez v3, :cond_16

    :cond_19
    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object/from16 v3, p0

    const/4 v4, 0x2

    move v6, v11

    move-object v15, v7

    move v7, v8

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    iget-object v3, v15, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lr/d;->a:Z

    goto/16 :goto_0

    :cond_1a
    move-object v13, v3

    goto :goto_6

    :goto_8
    if-ne v11, v3, :cond_21

    const/4 v7, 0x2

    if-eq v5, v7, :cond_1c

    if-ne v5, v14, :cond_1b

    goto :goto_9

    :cond_1b
    move v4, v3

    const/4 v3, 0x1

    goto/16 :goto_b

    :cond_1c
    :goto_9
    if-ne v8, v3, :cond_1f

    if-ne v5, v7, :cond_1d

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p0

    move v4, v7

    move v6, v7

    move v7, v8

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    :cond_1d
    invoke-virtual {v2}, Lr/d;->l()I

    move-result v5

    iget v3, v2, Lr/d;->L:F

    iget v4, v2, Lr/d;->M:I

    const/4 v6, -0x1

    if-ne v4, v6, :cond_1e

    const/high16 v4, 0x3f800000    # 1.0f

    div-float v3, v4, v3

    :cond_1e
    int-to-float v4, v5

    mul-float/2addr v4, v3

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v4, v3

    float-to-int v7, v4

    move-object/from16 v3, p0

    move v4, v14

    move v6, v14

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    iget-object v3, v15, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lr/d;->a:Z

    goto/16 :goto_0

    :cond_1f
    const/4 v3, 0x1

    if-ne v8, v3, :cond_20

    const/4 v7, 0x0

    const/4 v6, 0x0

    move-object/from16 v3, p0

    move v4, v5

    move v5, v6

    const/4 v6, 0x2

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v15, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v2

    iput v2, v3, Ls/g;->m:I

    goto/16 :goto_0

    :cond_20
    const/4 v3, 0x2

    if-ne v8, v3, :cond_23

    const/4 v3, 0x1

    aget v4, v10, v3

    if-eq v4, v14, :cond_22

    const/4 v3, 0x4

    if-ne v4, v3, :cond_21

    goto :goto_a

    :cond_21
    const/4 v3, 0x1

    const/4 v4, 0x3

    goto :goto_b

    :cond_22
    :goto_a
    invoke-virtual {v2}, Lr/d;->l()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v3

    int-to-float v3, v3

    mul-float v7, v16, v3

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v7, v3

    float-to-int v7, v7

    move-object/from16 v3, p0

    move v4, v5

    move v5, v6

    move v6, v14

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    iget-object v3, v15, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lr/d;->a:Z

    goto/16 :goto_0

    :cond_23
    aget-object v4, v12, v3

    iget-object v3, v4, Lr/c;->d:Lr/c;

    if-eqz v3, :cond_24

    const/4 v3, 0x3

    aget-object v4, v12, v3

    iget-object v3, v4, Lr/c;->d:Lr/c;

    if-nez v3, :cond_21

    :cond_24
    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p0

    const/4 v4, 0x2

    move v6, v11

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    iget-object v3, v15, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lr/d;->a:Z

    goto/16 :goto_0

    :goto_b
    if-ne v5, v4, :cond_0

    if-ne v11, v4, :cond_0

    if-eq v9, v3, :cond_28

    if-ne v8, v3, :cond_25

    goto :goto_c

    :cond_25
    const/4 v4, 0x2

    if-ne v8, v4, :cond_0

    if-ne v9, v4, :cond_0

    const/4 v4, 0x0

    aget v4, v10, v4

    if-eq v4, v14, :cond_26

    if-ne v4, v14, :cond_0

    :cond_26
    aget v4, v10, v3

    if-eq v4, v14, :cond_27

    if-ne v4, v14, :cond_0

    :cond_27
    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v6, v3

    const/high16 v3, 0x3f000000    # 0.5f

    add-float/2addr v6, v3

    float-to-int v5, v6

    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v4

    int-to-float v4, v4

    mul-float v7, v16, v4

    add-float/2addr v7, v3

    float-to-int v7, v7

    move-object/from16 v3, p0

    move v4, v14

    move v6, v14

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    iget-object v3, v15, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lr/d;->a:Z

    goto/16 :goto_0

    :cond_28
    :goto_c
    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p0

    const/4 v6, 0x2

    move v4, v6

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v4

    iput v4, v3, Ls/g;->m:I

    iget-object v3, v15, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v2

    iput v2, v3, Ls/g;->m:I

    goto/16 :goto_0

    :goto_d
    invoke-virtual {v2}, Lr/d;->l()I

    move-result v3

    const/4 v4, 0x4

    if-ne v5, v4, :cond_29

    invoke-virtual/range {p1 .. p1}, Lr/d;->l()I

    move-result v3

    iget v5, v15, Lr/c;->e:I

    sub-int/2addr v3, v5

    iget v5, v12, Lr/c;->e:I

    sub-int/2addr v3, v5

    move v6, v3

    move v5, v14

    goto :goto_e

    :cond_29
    move v6, v3

    :goto_e
    invoke-virtual {v2}, Lr/d;->i()I

    move-result v3

    if-ne v11, v4, :cond_2a

    invoke-virtual/range {p1 .. p1}, Lr/d;->i()I

    move-result v3

    move-object/from16 v4, v17

    iget v4, v4, Lr/c;->e:I

    sub-int/2addr v3, v4

    iget v4, v10, Lr/c;->e:I

    sub-int/2addr v3, v4

    move v7, v3

    goto :goto_f

    :cond_2a
    move v7, v3

    move v14, v11

    :goto_f
    move-object/from16 v3, p0

    move v4, v5

    move v5, v6

    move v6, v14

    move-object v8, v2

    invoke-virtual/range {v3 .. v8}, Ls/e;->f(IIIILr/d;)V

    iget-object v3, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->l()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    iget-object v3, v9, Ls/m;->e:Ls/g;

    invoke-virtual {v2}, Lr/d;->i()I

    move-result v4

    invoke-virtual {v3, v4}, Ls/g;->d(I)V

    const/4 v3, 0x1

    iput-boolean v3, v2, Lr/d;->a:Z

    goto/16 :goto_0

    :cond_2b
    return-void
.end method

.method public final c()V
    .locals 8

    iget-object v0, p0, Ls/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Ls/e;->d:Lr/e;

    iget-object v2, v1, Lr/d;->d:Ls/j;

    invoke-virtual {v2}, Ls/j;->f()V

    iget-object v2, v1, Lr/d;->e:Ls/l;

    invoke-virtual {v2}, Ls/l;->f()V

    iget-object v3, v1, Lr/d;->d:Ls/j;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr/d;

    instance-of v7, v4, Lr/h;

    if-eqz v7, :cond_1

    new-instance v5, Ls/h;

    invoke-direct {v5, v4}, Ls/m;-><init>(Lr/d;)V

    iget-object v6, v4, Lr/d;->d:Ls/j;

    invoke-virtual {v6}, Ls/j;->f()V

    iget-object v6, v4, Lr/d;->e:Ls/l;

    invoke-virtual {v6}, Ls/l;->f()V

    check-cast v4, Lr/h;

    iget v4, v4, Lr/h;->h0:I

    iput v4, v5, Ls/m;->f:I

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Lr/d;->q()Z

    move-result v7

    if-eqz v7, :cond_4

    iget-object v7, v4, Lr/d;->b:Ls/c;

    if-nez v7, :cond_2

    new-instance v7, Ls/c;

    invoke-direct {v7, v4, v6}, Ls/c;-><init>(Lr/d;I)V

    iput-object v7, v4, Lr/d;->b:Ls/c;

    :cond_2
    if-nez v3, :cond_3

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    :cond_3
    iget-object v6, v4, Lr/d;->b:Ls/c;

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v6, v4, Lr/d;->d:Ls/j;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-virtual {v4}, Lr/d;->r()Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, v4, Lr/d;->c:Ls/c;

    if-nez v6, :cond_5

    new-instance v6, Ls/c;

    invoke-direct {v6, v4, v5}, Ls/c;-><init>(Lr/d;I)V

    iput-object v6, v4, Lr/d;->c:Ls/c;

    :cond_5
    if-nez v3, :cond_6

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    :cond_6
    iget-object v5, v4, Lr/d;->c:Ls/c;

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    iget-object v5, v4, Lr/d;->e:Ls/l;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    instance-of v5, v4, Lr/i;

    if-eqz v5, :cond_0

    new-instance v5, Ls/i;

    invoke-direct {v5, v4}, Ls/m;-><init>(Lr/d;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_8
    if-eqz v3, :cond_9

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls/m;

    invoke-virtual {v3}, Ls/m;->f()V

    goto :goto_3

    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls/m;

    iget-object v3, v2, Ls/m;->b:Lr/d;

    if-ne v3, v1, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {v2}, Ls/m;->d()V

    goto :goto_4

    :cond_c
    iget-object v0, p0, Ls/e;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Ls/e;->a:Lr/e;

    iget-object v2, v1, Lr/d;->d:Ls/j;

    invoke-virtual {p0, v2, v6, v0}, Ls/e;->e(Ls/m;ILjava/util/ArrayList;)V

    iget-object v1, v1, Lr/d;->e:Ls/l;

    invoke-virtual {p0, v1, v5, v0}, Ls/e;->e(Ls/m;ILjava/util/ArrayList;)V

    iput-boolean v6, p0, Ls/e;->b:Z

    return-void
.end method

.method public final d(Lr/e;I)I
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move/from16 v2, p2

    iget-object v3, v1, Ls/e;->h:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    :goto_0
    if-ge v7, v4, :cond_d

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ls/k;

    iget-object v10, v10, Ls/k;->a:Ls/m;

    instance-of v11, v10, Ls/c;

    if-eqz v11, :cond_0

    move-object v11, v10

    check-cast v11, Ls/c;

    iget v11, v11, Ls/m;->f:I

    if-eq v11, v2, :cond_2

    :goto_1
    move-object/from16 v18, v3

    move/from16 v16, v4

    move/from16 v17, v7

    const-wide/16 v0, 0x0

    goto/16 :goto_8

    :cond_0
    if-nez v2, :cond_1

    instance-of v11, v10, Ls/j;

    if-nez v11, :cond_2

    goto :goto_1

    :cond_1
    instance-of v11, v10, Ls/l;

    if-nez v11, :cond_2

    goto :goto_1

    :cond_2
    if-nez v2, :cond_3

    iget-object v11, v0, Lr/d;->d:Ls/j;

    :goto_2
    iget-object v11, v11, Ls/m;->h:Ls/f;

    goto :goto_3

    :cond_3
    iget-object v11, v0, Lr/d;->e:Ls/l;

    goto :goto_2

    :goto_3
    if-nez v2, :cond_4

    iget-object v12, v0, Lr/d;->d:Ls/j;

    :goto_4
    iget-object v12, v12, Ls/m;->i:Ls/f;

    goto :goto_5

    :cond_4
    iget-object v12, v0, Lr/d;->e:Ls/l;

    goto :goto_4

    :goto_5
    iget-object v13, v10, Ls/m;->h:Ls/f;

    iget-object v13, v13, Ls/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    iget-object v13, v10, Ls/m;->i:Ls/f;

    iget-object v14, v13, Ls/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v10}, Ls/m;->j()J

    move-result-wide v14

    iget-object v5, v10, Ls/m;->h:Ls/f;

    if-eqz v11, :cond_a

    if-eqz v12, :cond_a

    const-wide/16 v0, 0x0

    invoke-static {v5, v0, v1}, Ls/k;->b(Ls/f;J)J

    move-result-wide v11

    move-object v6, v3

    move/from16 v16, v4

    invoke-static {v13, v0, v1}, Ls/k;->a(Ls/f;J)J

    move-result-wide v3

    sub-long/2addr v11, v14

    iget v0, v13, Ls/f;->f:I

    neg-int v1, v0

    move-object/from16 v18, v6

    move/from16 v17, v7

    int-to-long v6, v1

    cmp-long v1, v11, v6

    if-ltz v1, :cond_5

    int-to-long v0, v0

    add-long/2addr v11, v0

    :cond_5
    neg-long v0, v3

    sub-long/2addr v0, v14

    iget v3, v5, Ls/f;->f:I

    int-to-long v3, v3

    sub-long/2addr v0, v3

    cmp-long v6, v0, v3

    if-ltz v6, :cond_6

    sub-long/2addr v0, v3

    :cond_6
    iget-object v3, v10, Ls/m;->b:Lr/d;

    if-nez v2, :cond_7

    iget v3, v3, Lr/d;->S:F

    goto :goto_6

    :cond_7
    const/4 v4, 0x1

    if-ne v2, v4, :cond_8

    iget v3, v3, Lr/d;->T:F

    goto :goto_6

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v3, -0x40800000    # -1.0f

    :goto_6
    const/4 v4, 0x0

    cmpl-float v4, v3, v4

    const/high16 v6, 0x3f800000    # 1.0f

    if-lez v4, :cond_9

    long-to-float v0, v0

    div-float/2addr v0, v3

    long-to-float v1, v11

    sub-float v4, v6, v3

    div-float/2addr v1, v4

    add-float/2addr v1, v0

    float-to-long v0, v1

    goto :goto_7

    :cond_9
    const-wide/16 v0, 0x0

    :goto_7
    long-to-float v0, v0

    mul-float v1, v0, v3

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v1, v4

    float-to-long v10, v1

    sub-float/2addr v6, v3

    mul-float/2addr v6, v0

    add-float/2addr v6, v4

    float-to-long v0, v6

    add-long/2addr v10, v14

    add-long/2addr v10, v0

    iget v0, v5, Ls/f;->f:I

    int-to-long v0, v0

    add-long/2addr v0, v10

    iget v3, v13, Ls/f;->f:I

    int-to-long v3, v3

    sub-long/2addr v0, v3

    goto :goto_8

    :cond_a
    move-object/from16 v18, v3

    move/from16 v16, v4

    move/from16 v17, v7

    if-eqz v11, :cond_b

    iget v0, v5, Ls/f;->f:I

    int-to-long v0, v0

    invoke-static {v5, v0, v1}, Ls/k;->b(Ls/f;J)J

    move-result-wide v0

    iget v3, v5, Ls/f;->f:I

    int-to-long v3, v3

    add-long/2addr v3, v14

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    goto :goto_8

    :cond_b
    if-eqz v12, :cond_c

    iget v0, v13, Ls/f;->f:I

    int-to-long v0, v0

    invoke-static {v13, v0, v1}, Ls/k;->a(Ls/f;J)J

    move-result-wide v0

    iget v3, v13, Ls/f;->f:I

    neg-int v3, v3

    int-to-long v3, v3

    add-long/2addr v3, v14

    neg-long v0, v0

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    goto :goto_8

    :cond_c
    iget v0, v5, Ls/f;->f:I

    int-to-long v0, v0

    invoke-virtual {v10}, Ls/m;->j()J

    move-result-wide v3

    add-long/2addr v3, v0

    iget v0, v13, Ls/f;->f:I

    int-to-long v0, v0

    sub-long v0, v3, v0

    :goto_8
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    add-int/lit8 v7, v17, 0x1

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v4, v16

    move-object/from16 v3, v18

    goto/16 :goto_0

    :cond_d
    long-to-int v0, v8

    return v0
.end method

.method public final e(Ls/m;ILjava/util/ArrayList;)V
    .locals 4

    iget-object v0, p1, Ls/m;->h:Ls/f;

    iget-object v0, v0, Ls/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p1, Ls/m;->i:Ls/f;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls/d;

    instance-of v2, v1, Ls/f;

    if-eqz v2, :cond_1

    check-cast v1, Ls/f;

    invoke-virtual {p0, v1, p2, p3, v3}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_0

    :cond_1
    instance-of v2, v1, Ls/m;

    if-eqz v2, :cond_0

    check-cast v1, Ls/m;

    iget-object v1, v1, Ls/m;->h:Ls/f;

    invoke-virtual {p0, v1, p2, p3, v3}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_0

    :cond_2
    iget-object v0, v2, Ls/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls/d;

    instance-of v2, v1, Ls/f;

    if-eqz v2, :cond_4

    check-cast v1, Ls/f;

    invoke-virtual {p0, v1, p2, p3, v3}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_1

    :cond_4
    instance-of v2, v1, Ls/m;

    if-eqz v2, :cond_3

    check-cast v1, Ls/m;

    iget-object v1, v1, Ls/m;->i:Ls/f;

    invoke-virtual {p0, v1, p2, p3, v3}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    if-ne p2, v0, :cond_7

    check-cast p1, Ls/l;

    iget-object p1, p1, Ls/l;->k:Ls/f;

    iget-object p1, p1, Ls/f;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls/d;

    instance-of v1, v0, Ls/f;

    if-eqz v1, :cond_6

    check-cast v0, Ls/f;

    invoke-virtual {p0, v0, p2, p3, v3}, Ls/e;->a(Ls/f;ILjava/util/ArrayList;Ls/k;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method public final f(IIIILr/d;)V
    .locals 1

    iget-object v0, p0, Ls/e;->g:Ls/b;

    iput p1, v0, Ls/b;->a:I

    iput p3, v0, Ls/b;->b:I

    iput p2, v0, Ls/b;->c:I

    iput p4, v0, Ls/b;->d:I

    iget-object p1, p0, Ls/e;->f:Lq1/a;

    invoke-virtual {p1, p5, v0}, Lq1/a;->d(Lr/d;Ls/b;)V

    iget p1, v0, Ls/b;->e:I

    invoke-virtual {p5, p1}, Lr/d;->y(I)V

    iget p1, v0, Ls/b;->f:I

    invoke-virtual {p5, p1}, Lr/d;->v(I)V

    iget-boolean p1, v0, Ls/b;->h:Z

    iput-boolean p1, p5, Lr/d;->w:Z

    iget p1, v0, Ls/b;->g:I

    iput p1, p5, Lr/d;->P:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p5, Lr/d;->w:Z

    return-void
.end method

.method public final g()V
    .locals 17

    move-object/from16 v6, p0

    iget-object v0, v6, Ls/e;->a:Lr/e;

    iget-object v0, v0, Lr/e;->d0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lr/d;

    iget-boolean v0, v8, Lr/d;->a:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v8, Lr/d;->c0:[I

    const/4 v1, 0x0

    aget v9, v0, v1

    const/4 v10, 0x1

    aget v11, v0, v10

    iget v0, v8, Lr/d;->j:I

    iget v2, v8, Lr/d;->k:I

    const/4 v3, 0x2

    const/4 v12, 0x3

    if-eq v9, v3, :cond_3

    if-ne v9, v12, :cond_2

    if-ne v0, v10, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_2

    :cond_3
    :goto_1
    move v0, v10

    :goto_2
    if-eq v11, v3, :cond_4

    if-ne v11, v12, :cond_5

    if-ne v2, v10, :cond_5

    :cond_4
    move v1, v10

    :cond_5
    iget-object v13, v8, Lr/d;->d:Ls/j;

    iget-object v2, v13, Ls/m;->e:Ls/g;

    iget-boolean v4, v2, Ls/f;->j:Z

    iget-object v14, v8, Lr/d;->e:Ls/l;

    iget-object v5, v14, Ls/m;->e:Ls/g;

    iget-boolean v15, v5, Ls/f;->j:Z

    const/16 v16, 0x1

    if-eqz v4, :cond_6

    if-eqz v15, :cond_6

    iget v2, v2, Ls/f;->g:I

    iget v4, v5, Ls/f;->g:I

    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v3, v16

    move-object v5, v8

    invoke-virtual/range {v0 .. v5}, Ls/e;->f(IIIILr/d;)V

    iput-boolean v10, v8, Lr/d;->a:Z

    goto :goto_3

    :cond_6
    if-eqz v4, :cond_8

    if-eqz v1, :cond_8

    iget v2, v2, Ls/f;->g:I

    iget v4, v5, Ls/f;->g:I

    move-object/from16 v0, p0

    move/from16 v1, v16

    move-object v5, v8

    invoke-virtual/range {v0 .. v5}, Ls/e;->f(IIIILr/d;)V

    if-ne v11, v12, :cond_7

    iget-object v0, v14, Ls/m;->e:Ls/g;

    invoke-virtual {v8}, Lr/d;->i()I

    move-result v1

    iput v1, v0, Ls/g;->m:I

    goto :goto_3

    :cond_7
    iget-object v0, v14, Ls/m;->e:Ls/g;

    invoke-virtual {v8}, Lr/d;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Ls/g;->d(I)V

    iput-boolean v10, v8, Lr/d;->a:Z

    goto :goto_3

    :cond_8
    if-eqz v15, :cond_a

    if-eqz v0, :cond_a

    iget v2, v2, Ls/f;->g:I

    iget v4, v5, Ls/f;->g:I

    move-object/from16 v0, p0

    move v1, v3

    move/from16 v3, v16

    move-object v5, v8

    invoke-virtual/range {v0 .. v5}, Ls/e;->f(IIIILr/d;)V

    if-ne v9, v12, :cond_9

    iget-object v0, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v8}, Lr/d;->l()I

    move-result v1

    iput v1, v0, Ls/g;->m:I

    goto :goto_3

    :cond_9
    iget-object v0, v13, Ls/m;->e:Ls/g;

    invoke-virtual {v8}, Lr/d;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Ls/g;->d(I)V

    iput-boolean v10, v8, Lr/d;->a:Z

    :cond_a
    :goto_3
    iget-boolean v0, v8, Lr/d;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, v14, Ls/l;->l:Ls/a;

    if-eqz v0, :cond_0

    iget v1, v8, Lr/d;->P:I

    invoke-virtual {v0, v1}, Ls/g;->d(I)V

    goto/16 :goto_0

    :cond_b
    return-void
.end method
