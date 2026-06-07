.class public final LB1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/j;


# static fields
.field public static final a:[Lj1/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lj1/l;

    sput-object v0, LB1/b;->a:[Lj1/l;

    return-void
.end method

.method public static d(Lj1/n;Lj1/n;)I
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget p0, p0, Lj1/n;->a:F

    iget p1, p1, Lj1/n;->a:F

    sub-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    float-to-int p0, p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Lj1/n;Lj1/n;)I
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget p0, p0, Lj1/n;->a:F

    iget p1, p1, Lj1/n;->a:F

    sub-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    float-to-int p0, p0

    return p0

    :cond_1
    :goto_0
    const p0, 0x7fffffff

    return p0
.end method


# virtual methods
.method public final a(Lv0/e;Ljava/util/Map;)Lj1/l;
    .locals 36

    const/4 v1, 0x2

    const/4 v2, 0x1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lv0/e;->e()Lp1/b;

    move-result-object v4

    invoke-static {v4}, LE1/a;->a(Lp1/b;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    new-instance v5, Lp1/b;

    iget-object v6, v4, Lp1/b;->e:[I

    invoke-virtual {v6}, [I->clone()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [I

    iget v8, v4, Lp1/b;->d:I

    iget v9, v4, Lp1/b;->b:I

    iget v4, v4, Lp1/b;->c:I

    invoke-direct {v5, v9, v4, v8, v6}, Lp1/b;-><init>(III[I)V

    new-instance v6, Lp1/a;

    invoke-direct {v6, v9}, Lp1/a;-><init>(I)V

    new-instance v8, Lp1/a;

    invoke-direct {v8, v9}, Lp1/a;-><init>(I)V

    add-int/lit8 v9, v4, 0x1

    div-int/2addr v9, v1

    move v10, v7

    :goto_0
    if-ge v10, v9, :cond_0

    invoke-virtual {v5, v6, v10}, Lp1/b;->d(Lp1/a;I)Lp1/a;

    move-result-object v6

    add-int/lit8 v11, v4, -0x1

    sub-int/2addr v11, v10

    invoke-virtual {v5, v8, v11}, Lp1/b;->d(Lp1/a;I)Lp1/a;

    move-result-object v8

    invoke-virtual {v6}, Lp1/a;->e()V

    invoke-virtual {v8}, Lp1/a;->e()V

    iget-object v12, v8, Lp1/a;->b:[I

    iget v13, v5, Lp1/b;->d:I

    mul-int v14, v10, v13

    iget-object v15, v5, Lp1/b;->e:[I

    invoke-static {v12, v7, v15, v14, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v12, v6, Lp1/a;->b:[I

    mul-int/2addr v11, v13

    invoke-static {v12, v7, v15, v11, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v10, v2

    goto :goto_0

    :cond_0
    invoke-static {v5}, LE1/a;->a(Lp1/b;)Ljava/util/ArrayList;

    move-result-object v4

    move-object/from16 v35, v5

    move-object v5, v4

    move-object/from16 v4, v35

    :cond_1
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lj1/n;

    const/16 v16, 0x4

    aget-object v14, v6, v16

    const/16 v17, 0x5

    aget-object v11, v6, v17

    const/16 v18, 0x6

    aget-object v15, v6, v18

    const/16 v19, 0x7

    aget-object v13, v6, v19

    aget-object v8, v6, v7

    invoke-static {v8, v14}, LB1/b;->e(Lj1/n;Lj1/n;)I

    move-result v8

    aget-object v9, v6, v18

    aget-object v10, v6, v1

    invoke-static {v9, v10}, LB1/b;->e(Lj1/n;Lj1/n;)I

    move-result v9

    mul-int/lit8 v9, v9, 0x11

    div-int/lit8 v9, v9, 0x12

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    aget-object v9, v6, v2

    aget-object v10, v6, v17

    invoke-static {v9, v10}, LB1/b;->e(Lj1/n;Lj1/n;)I

    move-result v9

    aget-object v10, v6, v19

    const/16 v20, 0x3

    aget-object v12, v6, v20

    invoke-static {v10, v12}, LB1/b;->e(Lj1/n;Lj1/n;)I

    move-result v10

    mul-int/lit8 v10, v10, 0x11

    div-int/lit8 v10, v10, 0x12

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v21

    aget-object v8, v6, v7

    aget-object v9, v6, v16

    invoke-static {v8, v9}, LB1/b;->d(Lj1/n;Lj1/n;)I

    move-result v8

    aget-object v9, v6, v18

    aget-object v10, v6, v1

    invoke-static {v9, v10}, LB1/b;->d(Lj1/n;Lj1/n;)I

    move-result v9

    mul-int/lit8 v9, v9, 0x11

    div-int/lit8 v9, v9, 0x12

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    aget-object v9, v6, v2

    aget-object v10, v6, v17

    invoke-static {v9, v10}, LB1/b;->d(Lj1/n;Lj1/n;)I

    move-result v9

    aget-object v10, v6, v19

    aget-object v12, v6, v20

    invoke-static {v10, v12}, LB1/b;->d(Lj1/n;Lj1/n;)I

    move-result v10

    mul-int/lit8 v10, v10, 0x11

    div-int/lit8 v10, v10, 0x12

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v22

    sget-object v8, LC1/h;->a:LA/h;

    new-instance v23, LC1/c;

    move-object/from16 v8, v23

    move-object v9, v4

    move-object v10, v14

    move-object v12, v15

    invoke-direct/range {v8 .. v13}, LC1/c;-><init>(Lp1/b;Lj1/n;Lj1/n;Lj1/n;Lj1/n;)V

    const/4 v13, 0x0

    move/from16 v24, v2

    move-object v8, v13

    move-object/from16 v12, v23

    move-object/from16 v23, v8

    :goto_2
    if-eqz v14, :cond_2

    const/4 v11, 0x1

    move-object v8, v4

    move-object v9, v12

    move-object v10, v14

    move-object/from16 p1, v12

    move/from16 v12, v21

    move/from16 v13, v22

    invoke-static/range {v8 .. v13}, LC1/h;->d(Lp1/b;LC1/c;Lj1/n;ZII)LC1/f;

    move-result-object v8

    :goto_3
    move-object/from16 v25, v8

    goto :goto_4

    :cond_2
    move-object/from16 p1, v12

    goto :goto_3

    :goto_4
    if-eqz v15, :cond_3

    const/4 v11, 0x0

    move-object v8, v4

    move-object/from16 v9, p1

    move-object v10, v15

    move/from16 v12, v21

    move/from16 v13, v22

    invoke-static/range {v8 .. v13}, LC1/h;->d(Lp1/b;LC1/c;Lj1/n;ZII)LC1/f;

    move-result-object v8

    move-object/from16 v23, v8

    :cond_3
    if-nez v25, :cond_4

    if-nez v23, :cond_4

    :goto_5
    const/4 v1, 0x0

    goto/16 :goto_a

    :cond_4
    if-eqz v25, :cond_7

    invoke-virtual/range {v25 .. v25}, LC1/f;->r()LC1/a;

    move-result-object v13

    if-nez v13, :cond_5

    goto :goto_7

    :cond_5
    if-eqz v23, :cond_9

    invoke-virtual/range {v23 .. v23}, LC1/f;->r()LC1/a;

    move-result-object v8

    if-nez v8, :cond_6

    goto :goto_8

    :cond_6
    iget v9, v13, LC1/a;->b:I

    iget v10, v8, LC1/a;->b:I

    if-eq v9, v10, :cond_9

    iget v9, v13, LC1/a;->c:I

    iget v10, v8, LC1/a;->c:I

    if-eq v9, v10, :cond_9

    iget v9, v13, LC1/a;->f:I

    iget v8, v8, LC1/a;->f:I

    if-eq v9, v8, :cond_9

    :goto_6
    const/4 v13, 0x0

    goto :goto_8

    :cond_7
    :goto_7
    if-nez v23, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual/range {v23 .. v23}, LC1/f;->r()LC1/a;

    move-result-object v13

    :cond_9
    :goto_8
    if-nez v13, :cond_a

    goto :goto_5

    :cond_a
    invoke-static/range {v25 .. v25}, LC1/h;->a(LC1/f;)LC1/c;

    move-result-object v8

    invoke-static/range {v23 .. v23}, LC1/h;->a(LC1/f;)LC1/c;

    move-result-object v9

    if-nez v8, :cond_b

    move-object v8, v9

    goto :goto_9

    :cond_b
    if-nez v9, :cond_c

    goto :goto_9

    :cond_c
    new-instance v10, LC1/c;

    iget-object v11, v8, LC1/c;->b:Lj1/n;

    iget-object v12, v8, LC1/c;->c:Lj1/n;

    iget-object v8, v8, LC1/c;->a:Lp1/b;

    iget-object v1, v9, LC1/c;->d:Lj1/n;

    iget-object v9, v9, LC1/c;->e:Lj1/n;

    move-object/from16 v26, v10

    move-object/from16 v27, v8

    move-object/from16 v28, v11

    move-object/from16 v29, v12

    move-object/from16 v30, v1

    move-object/from16 v31, v9

    invoke-direct/range {v26 .. v31}, LC1/c;-><init>(Lp1/b;Lj1/n;Lj1/n;Lj1/n;Lj1/n;)V

    move-object v8, v10

    :goto_9
    new-instance v1, LC1/e;

    invoke-direct {v1, v13, v8}, LC1/e;-><init>(LC1/a;LC1/c;)V

    :goto_a
    if-eqz v1, :cond_5e

    iget-object v8, v1, LC1/e;->e:Ljava/lang/Object;

    move-object v12, v8

    check-cast v12, LC1/c;

    move-object/from16 v13, p1

    iget v11, v13, LC1/c;->i:I

    iget v10, v13, LC1/c;->h:I

    if-eqz v24, :cond_e

    if-eqz v12, :cond_e

    iget v8, v12, LC1/c;->h:I

    if-lt v8, v10, :cond_d

    iget v8, v12, LC1/c;->i:I

    if-le v8, v11, :cond_e

    :cond_d
    move/from16 v24, v7

    move-object/from16 v8, v25

    const/4 v1, 0x2

    const/4 v13, 0x0

    goto/16 :goto_2

    :cond_e
    iput-object v13, v1, LC1/e;->e:Ljava/lang/Object;

    iget v15, v1, LC1/e;->b:I

    add-int/lit8 v14, v15, 0x1

    iget-object v8, v1, LC1/e;->d:Ljava/lang/Object;

    move-object v12, v8

    check-cast v12, [Lv0/c;

    aput-object v25, v12, v7

    aput-object v23, v12, v14

    if-eqz v25, :cond_f

    move/from16 v23, v2

    goto :goto_b

    :cond_f
    move/from16 v23, v7

    :goto_b
    move v9, v2

    :goto_c
    if-gt v9, v14, :cond_28

    if-eqz v23, :cond_10

    move v8, v9

    goto :goto_d

    :cond_10
    sub-int v8, v14, v9

    :goto_d
    aget-object v24, v12, v8

    if-nez v24, :cond_27

    if-eqz v8, :cond_12

    if-ne v8, v14, :cond_11

    goto :goto_e

    :cond_11
    new-instance v7, Lv0/c;

    invoke-direct {v7, v13}, Lv0/c;-><init>(LC1/c;)V

    goto :goto_10

    :cond_12
    :goto_e
    new-instance v7, LC1/f;

    if-nez v8, :cond_13

    move v0, v2

    goto :goto_f

    :cond_13
    const/4 v0, 0x0

    :goto_f
    invoke-direct {v7, v13, v0}, LC1/f;-><init>(LC1/c;Z)V

    :goto_10
    aput-object v7, v12, v8

    move v2, v10

    move/from16 v0, v21

    move/from16 v21, v22

    const/16 v32, -0x1

    :goto_11
    if-gt v2, v11, :cond_26

    move-object/from16 v26, v5

    if-eqz v23, :cond_14

    const/16 v22, 0x1

    goto :goto_12

    :cond_14
    const/16 v22, -0x1

    :goto_12
    sub-int v5, v8, v22

    move/from16 v27, v9

    if-ltz v5, :cond_15

    const/16 v25, 0x1

    add-int/lit8 v9, v15, 0x1

    if-gt v5, v9, :cond_15

    aget-object v9, v12, v5

    move/from16 v28, v10

    iget-object v10, v9, Lv0/c;->d:Ljava/lang/Object;

    check-cast v10, [LC1/a;

    invoke-virtual {v9, v2}, Lv0/c;->i(I)I

    move-result v9

    aget-object v9, v10, v9

    goto :goto_13

    :cond_15
    move/from16 v28, v10

    const/4 v9, 0x0

    :goto_13
    if-eqz v9, :cond_17

    if-eqz v23, :cond_16

    iget v5, v9, LC1/a;->c:I

    :goto_14
    move/from16 v29, v8

    goto/16 :goto_18

    :cond_16
    iget v5, v9, LC1/a;->b:I

    goto :goto_14

    :cond_17
    aget-object v9, v12, v8

    invoke-virtual {v9, v2}, Lv0/c;->f(I)LC1/a;

    move-result-object v9

    if-eqz v9, :cond_19

    if-eqz v23, :cond_18

    iget v5, v9, LC1/a;->b:I

    goto :goto_14

    :cond_18
    iget v5, v9, LC1/a;->c:I

    goto :goto_14

    :cond_19
    move/from16 v29, v8

    if-ltz v5, :cond_1a

    const/4 v10, 0x1

    add-int/lit8 v8, v15, 0x1

    if-gt v5, v8, :cond_1a

    aget-object v5, v12, v5

    invoke-virtual {v5, v2}, Lv0/c;->f(I)LC1/a;

    move-result-object v9

    :cond_1a
    if-eqz v9, :cond_1c

    if-eqz v23, :cond_1b

    iget v5, v9, LC1/a;->c:I

    goto :goto_18

    :cond_1b
    iget v5, v9, LC1/a;->b:I

    goto :goto_18

    :cond_1c
    move/from16 v8, v29

    const/4 v5, 0x0

    :goto_15
    sub-int v8, v8, v22

    if-ltz v8, :cond_20

    const/4 v9, 0x1

    add-int/lit8 v10, v15, 0x1

    if-gt v8, v10, :cond_20

    aget-object v9, v12, v8

    iget-object v9, v9, Lv0/c;->d:Ljava/lang/Object;

    check-cast v9, [LC1/a;

    array-length v10, v9

    move/from16 v30, v8

    const/4 v8, 0x0

    :goto_16
    if-ge v8, v10, :cond_1f

    move/from16 v31, v10

    aget-object v10, v9, v8

    if-eqz v10, :cond_1e

    iget v8, v10, LC1/a;->b:I

    iget v9, v10, LC1/a;->c:I

    if-eqz v23, :cond_1d

    move v10, v9

    goto :goto_17

    :cond_1d
    move v10, v8

    :goto_17
    mul-int v22, v22, v5

    sub-int/2addr v9, v8

    mul-int v9, v9, v22

    add-int v5, v9, v10

    goto :goto_18

    :cond_1e
    const/4 v10, 0x1

    add-int/2addr v8, v10

    move/from16 v10, v31

    goto :goto_16

    :cond_1f
    const/4 v10, 0x1

    add-int/2addr v5, v10

    move/from16 v8, v30

    goto :goto_15

    :cond_20
    if-eqz v23, :cond_21

    iget-object v5, v1, LC1/e;->e:Ljava/lang/Object;

    check-cast v5, LC1/c;

    iget v5, v5, LC1/c;->f:I

    goto :goto_18

    :cond_21
    iget-object v5, v1, LC1/e;->e:Ljava/lang/Object;

    check-cast v5, LC1/c;

    iget v5, v5, LC1/c;->g:I

    :goto_18
    if-ltz v5, :cond_22

    iget v8, v13, LC1/c;->g:I

    if-le v5, v8, :cond_23

    :cond_22
    move/from16 v5, v32

    const/4 v8, -0x1

    goto :goto_19

    :cond_23
    move/from16 v35, v32

    move/from16 v32, v5

    move/from16 v5, v35

    goto :goto_1a

    :goto_19
    if-eq v5, v8, :cond_25

    move/from16 v32, v5

    :goto_1a
    iget v9, v13, LC1/c;->f:I

    iget v10, v13, LC1/c;->g:I

    move/from16 v22, v29

    move-object v8, v4

    move/from16 v29, v11

    move/from16 v11, v23

    move-object/from16 v30, v4

    move-object v4, v12

    move/from16 v12, v32

    move-object/from16 v31, v13

    move v13, v2

    move/from16 v33, v5

    move v5, v14

    move v14, v0

    move-object/from16 v34, v3

    move v3, v15

    move/from16 v15, v21

    invoke-static/range {v8 .. v15}, LC1/h;->c(Lp1/b;IIZIIII)LC1/a;

    move-result-object v8

    if-eqz v8, :cond_24

    iget-object v9, v7, Lv0/c;->d:Ljava/lang/Object;

    check-cast v9, [LC1/a;

    invoke-virtual {v7, v2}, Lv0/c;->i(I)I

    move-result v10

    aput-object v8, v9, v10

    iget v9, v8, LC1/a;->c:I

    iget v8, v8, LC1/a;->b:I

    sub-int v10, v9, v8

    invoke-static {v0, v10}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int/2addr v9, v8

    move/from16 v8, v21

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    move/from16 v21, v8

    :goto_1b
    const/4 v9, 0x1

    goto :goto_1d

    :cond_24
    move/from16 v8, v21

    goto :goto_1c

    :cond_25
    move-object/from16 v34, v3

    move-object/from16 v30, v4

    move/from16 v33, v5

    move-object v4, v12

    move-object/from16 v31, v13

    move v5, v14

    move v3, v15

    move/from16 v8, v21

    move/from16 v22, v29

    move/from16 v29, v11

    :goto_1c
    move/from16 v21, v8

    move/from16 v32, v33

    goto :goto_1b

    :goto_1d
    add-int/2addr v2, v9

    move v15, v3

    move-object v12, v4

    move v14, v5

    move/from16 v8, v22

    move-object/from16 v5, v26

    move/from16 v9, v27

    move/from16 v10, v28

    move/from16 v11, v29

    move-object/from16 v4, v30

    move-object/from16 v13, v31

    move-object/from16 v3, v34

    goto/16 :goto_11

    :cond_26
    move-object/from16 v34, v3

    move-object/from16 v30, v4

    move-object/from16 v26, v5

    move/from16 v27, v9

    move/from16 v28, v10

    move/from16 v29, v11

    move-object v4, v12

    move-object/from16 v31, v13

    move v5, v14

    move v3, v15

    move/from16 v8, v21

    const/4 v9, 0x1

    move/from16 v21, v0

    move/from16 v22, v8

    goto :goto_1e

    :cond_27
    move-object/from16 v34, v3

    move-object/from16 v30, v4

    move-object/from16 v26, v5

    move/from16 v27, v9

    move/from16 v28, v10

    move/from16 v29, v11

    move-object v4, v12

    move-object/from16 v31, v13

    move v5, v14

    move v3, v15

    move v9, v2

    :goto_1e
    add-int/lit8 v0, v27, 0x1

    move v15, v3

    move-object v12, v4

    move v14, v5

    move v2, v9

    move-object/from16 v5, v26

    move/from16 v10, v28

    move/from16 v11, v29

    move-object/from16 v4, v30

    move-object/from16 v13, v31

    move-object/from16 v3, v34

    const/4 v7, 0x0

    move v9, v0

    goto/16 :goto_c

    :cond_28
    move v9, v2

    move-object/from16 v34, v3

    move-object/from16 v30, v4

    move-object/from16 v26, v5

    move-object v4, v12

    move v5, v14

    move v3, v15

    iget-object v0, v1, LC1/e;->c:Ljava/lang/Object;

    check-cast v0, LC1/a;

    iget v2, v0, LC1/a;->f:I

    const/4 v7, 0x2

    add-int/lit8 v15, v3, 0x2

    new-array v8, v7, [I

    aput v15, v8, v9

    const/4 v7, 0x0

    aput v2, v8, v7

    const-class v2, LC1/b;

    invoke-static {v2, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[LC1/b;

    const/4 v7, 0x0

    :goto_1f
    array-length v8, v2

    if-ge v7, v8, :cond_2a

    const/4 v8, 0x0

    :goto_20
    aget-object v9, v2, v7

    array-length v10, v9

    if-ge v8, v10, :cond_29

    new-instance v10, LC1/b;

    invoke-direct {v10}, LC1/b;-><init>()V

    aput-object v10, v9, v8

    const/4 v9, 0x1

    add-int/2addr v8, v9

    goto :goto_20

    :cond_29
    const/4 v9, 0x1

    add-int/2addr v7, v9

    goto :goto_1f

    :cond_2a
    const/4 v7, 0x0

    aget-object v8, v4, v7

    invoke-virtual {v1, v8}, LC1/e;->a(Lv0/c;)V

    aget-object v8, v4, v5

    invoke-virtual {v1, v8}, LC1/e;->a(Lv0/c;)V

    const/16 v8, 0x3a0

    :goto_21
    aget-object v9, v4, v7

    if-eqz v9, :cond_2e

    aget-object v7, v4, v5

    if-nez v7, :cond_2b

    goto :goto_26

    :cond_2b
    const/4 v10, 0x0

    :goto_22
    iget-object v11, v9, Lv0/c;->d:Ljava/lang/Object;

    check-cast v11, [LC1/a;

    array-length v12, v11

    if-ge v10, v12, :cond_2e

    aget-object v12, v11, v10

    if-eqz v12, :cond_2d

    iget-object v13, v7, Lv0/c;->d:Ljava/lang/Object;

    check-cast v13, [LC1/a;

    aget-object v13, v13, v10

    if-eqz v13, :cond_2d

    iget v12, v12, LC1/a;->f:I

    iget v13, v13, LC1/a;->f:I

    if-ne v12, v13, :cond_2d

    const/4 v12, 0x1

    :goto_23
    if-gt v12, v3, :cond_2d

    aget-object v13, v4, v12

    iget-object v13, v13, Lv0/c;->d:Ljava/lang/Object;

    check-cast v13, [LC1/a;

    aget-object v13, v13, v10

    if-eqz v13, :cond_2c

    aget-object v14, v11, v10

    iget v14, v14, LC1/a;->f:I

    iput v14, v13, LC1/a;->f:I

    invoke-virtual {v13, v14}, LC1/a;->b(I)Z

    move-result v13

    if-nez v13, :cond_2c

    aget-object v13, v4, v12

    iget-object v13, v13, Lv0/c;->d:Ljava/lang/Object;

    check-cast v13, [LC1/a;

    const/4 v14, 0x0

    aput-object v14, v13, v10

    :goto_24
    const/4 v13, 0x1

    goto :goto_25

    :cond_2c
    const/4 v14, 0x0

    goto :goto_24

    :goto_25
    add-int/2addr v12, v13

    goto :goto_23

    :cond_2d
    const/4 v13, 0x1

    const/4 v14, 0x0

    add-int/2addr v10, v13

    goto :goto_22

    :cond_2e
    :goto_26
    const/4 v14, 0x0

    const/4 v7, 0x0

    aget-object v9, v4, v7

    if-nez v9, :cond_2f

    const/4 v10, 0x0

    goto :goto_2c

    :cond_2f
    const/4 v7, 0x0

    const/4 v10, 0x0

    :goto_27
    iget-object v11, v9, Lv0/c;->d:Ljava/lang/Object;

    check-cast v11, [LC1/a;

    array-length v12, v11

    if-ge v7, v12, :cond_36

    aget-object v11, v11, v7

    if-eqz v11, :cond_35

    iget v11, v11, LC1/a;->f:I

    move v12, v10

    const/4 v10, 0x0

    const/4 v13, 0x1

    :goto_28
    if-ge v13, v5, :cond_34

    const/4 v15, 0x2

    if-ge v10, v15, :cond_34

    aget-object v15, v4, v13

    iget-object v15, v15, Lv0/c;->d:Ljava/lang/Object;

    check-cast v15, [LC1/a;

    aget-object v15, v15, v7

    if-eqz v15, :cond_32

    iget v14, v15, LC1/a;->f:I

    invoke-virtual {v15, v14}, LC1/a;->b(I)Z

    move-result v14

    if-nez v14, :cond_30

    invoke-virtual {v15, v11}, LC1/a;->b(I)Z

    move-result v14

    if-eqz v14, :cond_31

    iput v11, v15, LC1/a;->f:I

    const/4 v10, 0x0

    :cond_30
    const/4 v14, 0x1

    goto :goto_29

    :cond_31
    const/4 v14, 0x1

    add-int/2addr v10, v14

    :goto_29
    iget v1, v15, LC1/a;->f:I

    invoke-virtual {v15, v1}, LC1/a;->b(I)Z

    move-result v1

    if-nez v1, :cond_33

    add-int/2addr v12, v14

    goto :goto_2a

    :cond_32
    const/4 v14, 0x1

    :cond_33
    :goto_2a
    add-int/2addr v13, v14

    const/4 v14, 0x0

    goto :goto_28

    :cond_34
    const/4 v14, 0x1

    move v10, v12

    goto :goto_2b

    :cond_35
    const/4 v14, 0x1

    :goto_2b
    add-int/2addr v7, v14

    const/4 v14, 0x0

    goto :goto_27

    :cond_36
    :goto_2c
    aget-object v1, v4, v5

    if-nez v1, :cond_37

    const/4 v9, 0x0

    goto :goto_33

    :cond_37
    const/4 v7, 0x0

    const/4 v9, 0x0

    :goto_2d
    iget-object v11, v1, Lv0/c;->d:Ljava/lang/Object;

    check-cast v11, [LC1/a;

    array-length v12, v11

    if-ge v7, v12, :cond_3d

    aget-object v11, v11, v7

    if-eqz v11, :cond_3c

    iget v11, v11, LC1/a;->f:I

    move v14, v5

    move v12, v9

    const/4 v9, 0x0

    :goto_2e
    if-lez v14, :cond_3b

    const/4 v13, 0x2

    if-ge v9, v13, :cond_3b

    aget-object v13, v4, v14

    iget-object v13, v13, Lv0/c;->d:Ljava/lang/Object;

    check-cast v13, [LC1/a;

    aget-object v13, v13, v7

    if-eqz v13, :cond_3a

    iget v15, v13, LC1/a;->f:I

    invoke-virtual {v13, v15}, LC1/a;->b(I)Z

    move-result v15

    if-nez v15, :cond_39

    invoke-virtual {v13, v11}, LC1/a;->b(I)Z

    move-result v15

    if-eqz v15, :cond_38

    iput v11, v13, LC1/a;->f:I

    const/4 v9, 0x0

    goto :goto_2f

    :cond_38
    const/4 v15, 0x1

    add-int/2addr v9, v15

    :cond_39
    :goto_2f
    iget v15, v13, LC1/a;->f:I

    invoke-virtual {v13, v15}, LC1/a;->b(I)Z

    move-result v13

    if-nez v13, :cond_3a

    const/4 v13, 0x1

    add-int/2addr v12, v13

    :goto_30
    const/4 v15, -0x1

    goto :goto_31

    :cond_3a
    const/4 v13, 0x1

    goto :goto_30

    :goto_31
    add-int/2addr v14, v15

    goto :goto_2e

    :cond_3b
    const/4 v13, 0x1

    move v9, v12

    goto :goto_32

    :cond_3c
    const/4 v13, 0x1

    :goto_32
    add-int/2addr v7, v13

    goto :goto_2d

    :cond_3d
    :goto_33
    add-int v1, v10, v9

    if-nez v1, :cond_3e

    const/4 v1, 0x0

    goto/16 :goto_3a

    :cond_3e
    const/4 v7, 0x1

    :goto_34
    if-ge v7, v5, :cond_49

    aget-object v9, v4, v7

    iget-object v9, v9, Lv0/c;->d:Ljava/lang/Object;

    check-cast v9, [LC1/a;

    const/4 v10, 0x0

    :goto_35
    array-length v11, v9

    if-ge v10, v11, :cond_48

    aget-object v11, v9, v10

    if-eqz v11, :cond_47

    iget v12, v11, LC1/a;->f:I

    invoke-virtual {v11, v12}, LC1/a;->b(I)Z

    move-result v11

    if-nez v11, :cond_47

    aget-object v11, v9, v10

    const/4 v12, 0x1

    add-int/lit8 v13, v7, -0x1

    aget-object v13, v4, v13

    iget-object v13, v13, Lv0/c;->d:Ljava/lang/Object;

    check-cast v13, [LC1/a;

    add-int/lit8 v14, v7, 0x1

    aget-object v12, v4, v14

    if-eqz v12, :cond_3f

    iget-object v12, v12, Lv0/c;->d:Ljava/lang/Object;

    check-cast v12, [LC1/a;

    goto :goto_36

    :cond_3f
    move-object v12, v13

    :goto_36
    const/16 v14, 0xe

    new-array v15, v14, [LC1/a;

    aget-object v22, v13, v10

    const/16 v23, 0x2

    aput-object v22, v15, v23

    aget-object v22, v12, v10

    aput-object v22, v15, v20

    const/4 v14, 0x1

    if-lez v10, :cond_40

    add-int/lit8 v23, v10, -0x1

    aget-object v25, v9, v23

    const/16 v27, 0x0

    aput-object v25, v15, v27

    aget-object v25, v13, v23

    aput-object v25, v15, v16

    aget-object v23, v12, v23

    aput-object v23, v15, v17

    :cond_40
    if-le v10, v14, :cond_41

    const/4 v14, 0x2

    add-int/lit8 v23, v10, -0x2

    aget-object v14, v9, v23

    const/16 v27, 0x8

    aput-object v14, v15, v27

    const/16 v14, 0xa

    aget-object v27, v13, v23

    aput-object v27, v15, v14

    const/16 v14, 0xb

    aget-object v23, v12, v23

    aput-object v23, v15, v14

    :cond_41
    array-length v14, v9

    const/16 v23, 0x1

    add-int/lit8 v14, v14, -0x1

    if-ge v10, v14, :cond_42

    add-int/lit8 v14, v10, 0x1

    aget-object v25, v9, v14

    aput-object v25, v15, v23

    aget-object v23, v13, v14

    aput-object v23, v15, v18

    aget-object v14, v12, v14

    aput-object v14, v15, v19

    :cond_42
    array-length v14, v9

    const/16 v23, 0x2

    add-int/lit8 v14, v14, -0x2

    if-ge v10, v14, :cond_43

    add-int/lit8 v14, v10, 0x2

    aget-object v23, v9, v14

    const/16 v27, 0x9

    aput-object v23, v15, v27

    const/16 v23, 0xc

    aget-object v13, v13, v14

    aput-object v13, v15, v23

    const/16 v13, 0xd

    aget-object v12, v12, v14

    aput-object v12, v15, v13

    :cond_43
    const/4 v12, 0x0

    :goto_37
    const/16 v13, 0xe

    if-ge v12, v13, :cond_47

    aget-object v14, v15, v12

    if-nez v14, :cond_46

    :cond_44
    move/from16 v23, v1

    :cond_45
    const/4 v1, 0x1

    goto :goto_38

    :cond_46
    iget v13, v14, LC1/a;->f:I

    invoke-virtual {v14, v13}, LC1/a;->b(I)Z

    move-result v13

    if-eqz v13, :cond_44

    iget v13, v11, LC1/a;->d:I

    move/from16 v23, v1

    iget v1, v14, LC1/a;->d:I

    if-ne v1, v13, :cond_45

    iget v1, v14, LC1/a;->f:I

    iput v1, v11, LC1/a;->f:I

    goto :goto_39

    :goto_38
    add-int/2addr v12, v1

    move/from16 v1, v23

    goto :goto_37

    :cond_47
    move/from16 v23, v1

    :goto_39
    const/4 v1, 0x1

    add-int/2addr v10, v1

    move/from16 v1, v23

    goto/16 :goto_35

    :cond_48
    move/from16 v23, v1

    const/4 v1, 0x1

    add-int/2addr v7, v1

    move/from16 v1, v23

    goto/16 :goto_34

    :cond_49
    move/from16 v23, v1

    :goto_3a
    if-lez v1, :cond_4b

    if-lt v1, v8, :cond_4a

    goto :goto_3b

    :cond_4a
    move v8, v1

    const/4 v7, 0x0

    goto/16 :goto_21

    :cond_4b
    :goto_3b
    array-length v1, v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_3c
    if-ge v5, v1, :cond_4e

    aget-object v8, v4, v5

    if-eqz v8, :cond_4d

    iget-object v8, v8, Lv0/c;->d:Ljava/lang/Object;

    check-cast v8, [LC1/a;

    array-length v9, v8

    const/4 v10, 0x0

    :goto_3d
    if-ge v10, v9, :cond_4d

    aget-object v11, v8, v10

    if-eqz v11, :cond_4c

    iget v12, v11, LC1/a;->f:I

    if-ltz v12, :cond_4c

    array-length v13, v2

    if-ge v12, v13, :cond_4c

    aget-object v12, v2, v12

    aget-object v12, v12, v7

    iget v11, v11, LC1/a;->e:I

    invoke-virtual {v12, v11}, LC1/b;->b(I)V

    :cond_4c
    const/4 v11, 0x1

    add-int/2addr v10, v11

    goto :goto_3d

    :cond_4d
    const/4 v11, 0x1

    add-int/2addr v7, v11

    add-int/2addr v5, v11

    goto :goto_3c

    :cond_4e
    const/4 v5, 0x0

    const/4 v11, 0x1

    aget-object v1, v2, v5

    aget-object v1, v1, v11

    invoke-virtual {v1}, LC1/b;->a()[I

    move-result-object v4

    iget v5, v0, LC1/a;->f:I

    mul-int v15, v3, v5

    iget v0, v0, LC1/a;->c:I

    const/4 v7, 0x2

    shl-int v8, v7, v0

    sub-int v8, v15, v8

    array-length v9, v4

    if-nez v9, :cond_50

    if-lez v8, :cond_4f

    const/16 v9, 0x3a0

    if-gt v8, v9, :cond_4f

    invoke-virtual {v1, v8}, LC1/b;->b(I)V

    goto :goto_3e

    :cond_4f
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_50
    const/16 v9, 0x3a0

    const/4 v10, 0x0

    aget v4, v4, v10

    if-eq v4, v8, :cond_51

    if-lez v8, :cond_51

    if-gt v8, v9, :cond_51

    invoke-virtual {v1, v8}, LC1/b;->b(I)V

    :cond_51
    :goto_3e
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-array v4, v15, [I

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    :goto_3f
    if-ge v10, v5, :cond_55

    const/4 v11, 0x0

    :goto_40
    if-ge v11, v3, :cond_54

    aget-object v12, v2, v10

    const/4 v13, 0x1

    add-int/lit8 v14, v11, 0x1

    aget-object v12, v12, v14

    invoke-virtual {v12}, LC1/b;->a()[I

    move-result-object v12

    mul-int v15, v10, v3

    add-int/2addr v15, v11

    array-length v11, v12

    if-nez v11, :cond_52

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v13, 0x1

    goto :goto_41

    :cond_52
    array-length v11, v12

    const/4 v13, 0x1

    if-ne v11, v13, :cond_53

    const/4 v11, 0x0

    aget v12, v12, v11

    aput v12, v4, v15

    goto :goto_41

    :cond_53
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_41
    move v11, v14

    goto :goto_40

    :cond_54
    const/4 v13, 0x1

    add-int/2addr v10, v13

    goto :goto_3f

    :cond_55
    const/4 v13, 0x1

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v3, v2, [[I

    const/4 v5, 0x0

    :goto_42
    if-ge v5, v2, :cond_56

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [I

    aput-object v10, v3, v5

    add-int/2addr v5, v13

    goto :goto_42

    :cond_56
    invoke-static {v1}, LB1/a;->a(Ljava/util/ArrayList;)[I

    move-result-object v1

    invoke-static {v9}, LB1/a;->a(Ljava/util/ArrayList;)[I

    move-result-object v2

    array-length v5, v2

    new-array v8, v5, [I

    const/16 v9, 0x64

    const/4 v10, -0x1

    :goto_43
    add-int/lit8 v11, v9, -0x1

    if-lez v9, :cond_5d

    const/4 v9, 0x0

    :goto_44
    if-ge v9, v5, :cond_57

    aget v12, v2, v9

    aget-object v13, v3, v9

    aget v14, v8, v9

    aget v13, v13, v14

    aput v13, v4, v12

    const/4 v12, 0x1

    add-int/2addr v9, v12

    goto :goto_44

    :cond_57
    :try_start_0
    invoke-static {v4, v0, v1}, LC1/h;->b([II[I)Lp1/d;

    move-result-object v0
    :try_end_0
    .catch Lj1/b; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Lj1/l;

    sget-object v2, Lj1/a;->l:Lj1/a;

    iget-object v3, v0, Lp1/d;->b:Ljava/lang/String;

    const/4 v9, 0x0

    invoke-direct {v1, v3, v9, v6, v2}, Lj1/l;-><init>(Ljava/lang/String;[B[Lj1/n;Lj1/a;)V

    sget-object v2, Lj1/m;->d:Lj1/m;

    iget-object v3, v0, Lp1/d;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    iget-object v0, v0, Lp1/d;->e:Ljava/lang/Object;

    check-cast v0, LB1/c;

    if-eqz v0, :cond_58

    sget-object v2, Lj1/m;->i:Lj1/m;

    invoke-virtual {v1, v2, v0}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    :cond_58
    move-object/from16 v12, v34

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v7

    move-object v3, v12

    move-object/from16 v5, v26

    move-object/from16 v4, v30

    const/4 v2, 0x1

    const/4 v7, 0x0

    goto/16 :goto_1

    :catch_0
    move-object/from16 v12, v34

    const/4 v9, 0x0

    if-eqz v5, :cond_5c

    const/4 v13, 0x0

    :goto_45
    if-ge v13, v5, :cond_5b

    aget v14, v8, v13

    aget-object v15, v3, v13

    array-length v15, v15

    const/16 v16, 0x1

    add-int/lit8 v15, v15, -0x1

    if-ge v14, v15, :cond_59

    add-int/lit8 v14, v14, 0x1

    aput v14, v8, v13

    goto :goto_46

    :cond_59
    const/4 v14, 0x0

    aput v14, v8, v13

    add-int/lit8 v14, v5, -0x1

    if-eq v13, v14, :cond_5a

    add-int/lit8 v13, v13, 0x1

    goto :goto_45

    :cond_5a
    invoke-static {}, Lj1/b;->a()Lj1/b;

    move-result-object v0

    throw v0

    :cond_5b
    const/16 v16, 0x1

    :goto_46
    move v9, v11

    move-object/from16 v34, v12

    goto :goto_43

    :cond_5c
    invoke-static {}, Lj1/b;->a()Lj1/b;

    move-result-object v0

    throw v0

    :cond_5d
    invoke-static {}, Lj1/b;->a()Lj1/b;

    move-result-object v0

    throw v0

    :cond_5e
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_5f
    move-object v12, v3

    sget-object v0, LB1/b;->a:[Lj1/l;

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj1/l;

    array-length v1, v0

    if-eqz v1, :cond_60

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_60

    return-object v0

    :cond_60
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0
.end method

.method public final b(Lv0/e;)Lj1/l;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LB1/b;->a(Lv0/e;Ljava/util/Map;)Lj1/l;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 0

    return-void
.end method
