.class public final LF1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/j;


# static fields
.field public static final b:[Lj1/n;


# instance fields
.field public final a:LG1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lj1/n;

    sput-object v0, LF1/a;->b:[Lj1/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LG1/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LG1/d;-><init>(I)V

    iput-object v0, p0, LF1/a;->a:LG1/d;

    return-void
.end method


# virtual methods
.method public final a(Lv0/e;Ljava/util/Map;)Lj1/l;
    .locals 40

    move-object/from16 v0, p2

    move-object/from16 v3, p0

    iget-object v4, v3, LF1/a;->a:LG1/d;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v9, 0x1

    if-eqz v0, :cond_10

    sget-object v10, Lj1/c;->c:Lj1/c;

    invoke-interface {v0, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-virtual/range {p1 .. p1}, Lv0/e;->e()Lp1/b;

    move-result-object v1

    invoke-virtual {v1}, Lp1/b;->e()[I

    move-result-object v10

    invoke-virtual {v1}, Lp1/b;->c()[I

    move-result-object v11

    if-eqz v10, :cond_f

    if-eqz v11, :cond_f

    aget v12, v10, v7

    aget v13, v10, v9

    move v15, v7

    move v14, v9

    :goto_0
    iget v2, v1, Lp1/b;->b:I

    iget v8, v1, Lp1/b;->c:I

    if-ge v12, v2, :cond_1

    if-ge v13, v8, :cond_1

    invoke-virtual {v1, v12, v13}, Lp1/b;->b(II)Z

    move-result v5

    if-eq v14, v5, :cond_0

    add-int/2addr v15, v9

    if-eq v15, v6, :cond_1

    xor-int/2addr v14, v9

    :cond_0
    add-int/2addr v12, v9

    add-int/2addr v13, v9

    goto :goto_0

    :cond_1
    if-eq v12, v2, :cond_e

    if-eq v13, v8, :cond_e

    aget v5, v10, v7

    sub-int/2addr v12, v5

    int-to-float v6, v12

    const/high16 v8, 0x40e00000    # 7.0f

    div-float/2addr v6, v8

    aget v8, v10, v9

    aget v10, v11, v9

    aget v11, v11, v7

    if-ge v5, v11, :cond_d

    if-ge v8, v10, :cond_d

    sub-int v12, v10, v8

    sub-int v13, v11, v5

    if-eq v12, v13, :cond_3

    add-int v11, v5, v12

    if-ge v11, v2, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_3
    :goto_1
    sub-int v2, v11, v5

    add-int/2addr v2, v9

    int-to-float v2, v2

    div-float/2addr v2, v6

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    add-int/2addr v12, v9

    int-to-float v12, v12

    div-float/2addr v12, v6

    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v12

    if-lez v2, :cond_c

    if-lez v12, :cond_c

    if-ne v12, v2, :cond_b

    const/high16 v13, 0x40000000    # 2.0f

    div-float v13, v6, v13

    float-to-int v13, v13

    add-int/2addr v8, v13

    add-int/2addr v5, v13

    add-int/lit8 v14, v2, -0x1

    int-to-float v14, v14

    mul-float/2addr v14, v6

    float-to-int v14, v14

    add-int/2addr v14, v5

    sub-int/2addr v14, v11

    if-lez v14, :cond_5

    if-gt v14, v13, :cond_4

    sub-int/2addr v5, v14

    goto :goto_2

    :cond_4
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_5
    :goto_2
    add-int/lit8 v11, v12, -0x1

    int-to-float v11, v11

    mul-float/2addr v11, v6

    float-to-int v11, v11

    add-int/2addr v11, v8

    sub-int/2addr v11, v10

    if-lez v11, :cond_7

    if-gt v11, v13, :cond_6

    sub-int/2addr v8, v11

    goto :goto_3

    :cond_6
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_7
    :goto_3
    new-instance v10, Lp1/b;

    invoke-direct {v10, v2, v12}, Lp1/b;-><init>(II)V

    move v11, v7

    :goto_4
    if-ge v11, v12, :cond_a

    int-to-float v13, v11

    mul-float/2addr v13, v6

    float-to-int v13, v13

    add-int/2addr v13, v8

    move v14, v7

    :goto_5
    if-ge v14, v2, :cond_9

    int-to-float v15, v14

    mul-float/2addr v15, v6

    float-to-int v15, v15

    add-int/2addr v15, v5

    invoke-virtual {v1, v15, v13}, Lp1/b;->b(II)Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-virtual {v10, v14, v11}, Lp1/b;->f(II)V

    :cond_8
    add-int/2addr v14, v9

    goto :goto_5

    :cond_9
    add-int/2addr v11, v9

    goto :goto_4

    :cond_a
    invoke-virtual {v4, v10, v0}, LG1/d;->d(Lp1/b;Ljava/util/Map;)Lp1/d;

    move-result-object v0

    sget-object v1, LF1/a;->b:[Lj1/n;

    goto/16 :goto_1e

    :cond_b
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_c
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_d
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_e
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_f
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_10
    new-instance v2, Lv0/r;

    invoke-virtual/range {p1 .. p1}, Lv0/e;->e()Lp1/b;

    move-result-object v5

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v5, v2, Lv0/r;->b:Ljava/lang/Object;

    if-nez v0, :cond_11

    const/4 v10, 0x0

    goto :goto_6

    :cond_11
    sget-object v10, Lj1/c;->k:Lj1/c;

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lj1/o;

    :goto_6
    iput-object v10, v2, Lv0/r;->c:Ljava/lang/Object;

    new-instance v11, LH1/e;

    invoke-direct {v11, v5, v10}, LH1/e;-><init>(Lp1/b;Lj1/o;)V

    if-eqz v0, :cond_12

    sget-object v10, Lj1/c;->e:Lj1/c;

    invoke-interface {v0, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_12

    move v10, v9

    goto :goto_7

    :cond_12
    move v10, v7

    :goto_7
    iget v12, v5, Lp1/b;->c:I

    const/4 v13, 0x3

    mul-int/lit8 v14, v12, 0x3

    div-int/lit16 v14, v14, 0x184

    if-lt v14, v13, :cond_13

    if-eqz v10, :cond_14

    :cond_13
    const/4 v14, 0x3

    :cond_14
    new-array v6, v6, [I

    add-int/lit8 v10, v14, -0x1

    move v13, v7

    :goto_8
    iget-object v15, v11, LH1/e;->b:Ljava/util/ArrayList;

    if-ge v10, v12, :cond_24

    if-nez v13, :cond_24

    invoke-static {v6, v7}, Ljava/util/Arrays;->fill([II)V

    move v8, v7

    :goto_9
    iget v1, v5, Lp1/b;->b:I

    if-ge v7, v1, :cond_21

    invoke-virtual {v5, v7, v10}, Lp1/b;->b(II)Z

    move-result v19

    if-eqz v19, :cond_16

    and-int/lit8 v1, v8, 0x1

    if-ne v1, v9, :cond_15

    add-int/2addr v8, v9

    :cond_15
    aget v1, v6, v8

    add-int/2addr v1, v9

    aput v1, v6, v8

    move v3, v9

    goto/16 :goto_10

    :cond_16
    and-int/lit8 v19, v8, 0x1

    if-nez v19, :cond_20

    const/4 v9, 0x4

    if-ne v8, v9, :cond_1f

    invoke-static {v6}, LH1/e;->b([I)Z

    move-result v8

    if-eqz v8, :cond_1e

    invoke-virtual {v11, v10, v7, v6}, LH1/e;->c(II[I)Z

    move-result v8

    if-eqz v8, :cond_1d

    iget-boolean v8, v11, LH1/e;->c:Z

    if-eqz v8, :cond_17

    invoke-virtual {v11}, LH1/e;->d()Z

    move-result v13

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/16 v16, 0x2

    goto :goto_e

    :cond_17
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x1

    if-gt v8, v9, :cond_18

    move/from16 v20, v7

    const/4 v3, 0x0

    const/16 v16, 0x2

    goto :goto_c

    :cond_18
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x0

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LH1/c;

    iget v3, v14, LH1/c;->d:I

    move/from16 v20, v7

    const/4 v7, 0x2

    if-lt v3, v7, :cond_1a

    if-nez v9, :cond_19

    move-object/from16 v3, p0

    move-object v9, v14

    :goto_b
    move/from16 v7, v20

    goto :goto_a

    :cond_19
    const/4 v3, 0x1

    iput-boolean v3, v11, LH1/e;->c:Z

    iget v3, v9, Lj1/n;->a:F

    iget v7, v14, Lj1/n;->a:F

    sub-float/2addr v3, v7

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v7, v9, Lj1/n;->b:F

    iget v8, v14, Lj1/n;->b:F

    sub-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    sub-float/2addr v3, v7

    float-to-int v3, v3

    const/16 v16, 0x2

    div-int/lit8 v3, v3, 0x2

    goto :goto_c

    :cond_1a
    move-object/from16 v3, p0

    goto :goto_b

    :cond_1b
    move/from16 v20, v7

    const/16 v16, 0x2

    const/4 v3, 0x0

    :goto_c
    aget v7, v6, v16

    if-le v3, v7, :cond_1c

    sub-int/2addr v3, v7

    add-int/lit8 v3, v3, -0x2

    add-int/2addr v10, v3

    const/4 v3, 0x1

    add-int/lit8 v7, v1, -0x1

    goto :goto_d

    :cond_1c
    const/4 v3, 0x1

    move/from16 v7, v20

    :goto_d
    const/4 v1, 0x0

    :goto_e
    invoke-static {v6, v1}, Ljava/util/Arrays;->fill([II)V

    move v8, v1

    move/from16 v14, v16

    goto :goto_10

    :cond_1d
    move/from16 v20, v7

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/16 v16, 0x2

    aget v7, v6, v16

    aput v7, v6, v1

    const/16 v17, 0x3

    aget v7, v6, v17

    aput v7, v6, v3

    const/4 v7, 0x4

    aget v8, v6, v7

    aput v8, v6, v16

    aput v3, v6, v17

    aput v1, v6, v7

    move/from16 v8, v17

    :goto_f
    move/from16 v7, v20

    goto :goto_10

    :cond_1e
    move/from16 v20, v7

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v7, 0x4

    const/16 v16, 0x2

    const/16 v17, 0x3

    aget v8, v6, v16

    aput v8, v6, v1

    aget v8, v6, v17

    aput v8, v6, v3

    aget v8, v6, v7

    aput v8, v6, v16

    aput v3, v6, v17

    aput v1, v6, v7

    move/from16 v7, v20

    const/4 v8, 0x3

    goto :goto_10

    :cond_1f
    move/from16 v20, v7

    const/4 v3, 0x1

    add-int/lit8 v1, v8, 0x1

    aget v7, v6, v1

    add-int/2addr v7, v3

    aput v7, v6, v1

    move v8, v1

    goto :goto_f

    :cond_20
    move/from16 v20, v7

    move v3, v9

    aget v1, v6, v8

    add-int/2addr v1, v3

    aput v1, v6, v8

    :goto_10
    add-int/2addr v7, v3

    move v9, v3

    move-object/from16 v3, p0

    goto/16 :goto_9

    :cond_21
    invoke-static {v6}, LH1/e;->b([I)Z

    move-result v3

    if-eqz v3, :cond_23

    invoke-virtual {v11, v10, v1, v6}, LH1/e;->c(II[I)Z

    move-result v1

    if-eqz v1, :cond_23

    const/4 v1, 0x0

    aget v3, v6, v1

    iget-boolean v1, v11, LH1/e;->c:Z

    if-eqz v1, :cond_22

    invoke-virtual {v11}, LH1/e;->d()Z

    move-result v1

    move v13, v1

    :cond_22
    move v14, v3

    :cond_23
    add-int/2addr v10, v14

    move-object/from16 v3, p0

    const/4 v7, 0x0

    const/4 v9, 0x1

    goto/16 :goto_8

    :cond_24
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x3

    if-lt v1, v3, :cond_40

    sget-object v1, LH1/e;->f:LH1/d;

    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    new-array v1, v3, [LH1/c;

    const/4 v3, 0x0

    const-wide v8, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :cond_25
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x2

    sub-int/2addr v10, v11

    if-ge v3, v10, :cond_2d

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LH1/c;

    iget v11, v10, LH1/c;->c:F

    const/4 v12, 0x1

    add-int/2addr v3, v12

    move v13, v3

    :goto_11
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v14

    sub-int/2addr v14, v12

    if-ge v13, v14, :cond_25

    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LH1/c;

    invoke-static {v10, v14}, LH1/e;->e(LH1/c;LH1/c;)D

    move-result-wide v20

    add-int/2addr v13, v12

    move v12, v13

    :goto_12
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v12, v6, :cond_2c

    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LH1/c;

    iget v7, v6, LH1/c;->c:F

    const v24, 0x3fb33333    # 1.4f

    mul-float v24, v24, v11

    cmpl-float v7, v7, v24

    if-gtz v7, :cond_2b

    invoke-static {v14, v6}, LH1/e;->e(LH1/c;LH1/c;)D

    move-result-wide v24

    invoke-static {v10, v6}, LH1/e;->e(LH1/c;LH1/c;)D

    move-result-wide v26

    cmpg-double v7, v20, v24

    if-gez v7, :cond_28

    cmpl-double v7, v24, v26

    if-lez v7, :cond_27

    cmpg-double v7, v20, v26

    if-gez v7, :cond_26

    move-wide/from16 v28, v20

    goto :goto_15

    :cond_26
    move-wide/from16 v28, v26

    :goto_13
    move-wide/from16 v26, v20

    goto :goto_15

    :cond_27
    move-wide/from16 v28, v20

    move-wide/from16 v38, v24

    move-wide/from16 v24, v26

    move-wide/from16 v26, v38

    goto :goto_15

    :cond_28
    cmpg-double v7, v24, v26

    if-gez v7, :cond_2a

    cmpg-double v7, v20, v26

    if-gez v7, :cond_29

    move-wide/from16 v28, v24

    move-wide/from16 v24, v26

    goto :goto_13

    :cond_29
    move-wide/from16 v28, v24

    :goto_14
    move-wide/from16 v24, v20

    goto :goto_15

    :cond_2a
    move-wide/from16 v28, v26

    move-wide/from16 v26, v24

    goto :goto_14

    :goto_15
    const-wide/high16 v30, 0x4000000000000000L    # 2.0

    mul-double v26, v26, v30

    sub-double v26, v24, v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Math;->abs(D)D

    move-result-wide v26

    mul-double v28, v28, v30

    sub-double v24, v24, v28

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->abs(D)D

    move-result-wide v24

    add-double v24, v24, v26

    cmpg-double v7, v24, v8

    if-gez v7, :cond_2b

    const/4 v7, 0x0

    aput-object v10, v1, v7

    const/4 v7, 0x1

    aput-object v14, v1, v7

    const/4 v8, 0x2

    aput-object v6, v1, v8

    move-wide/from16 v8, v24

    goto :goto_16

    :cond_2b
    const/4 v7, 0x1

    :goto_16
    add-int/2addr v12, v7

    goto :goto_12

    :cond_2c
    const/4 v12, 0x1

    goto/16 :goto_11

    :cond_2d
    const/4 v7, 0x1

    const-wide v10, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpl-double v3, v8, v10

    if-eqz v3, :cond_3f

    const/4 v3, 0x0

    aget-object v6, v1, v3

    aget-object v8, v1, v7

    invoke-static {v6, v8}, Lj1/n;->a(Lj1/n;Lj1/n;)F

    move-result v6

    aget-object v8, v1, v7

    const/4 v9, 0x2

    aget-object v10, v1, v9

    invoke-static {v8, v10}, Lj1/n;->a(Lj1/n;Lj1/n;)F

    move-result v8

    aget-object v10, v1, v3

    aget-object v11, v1, v9

    invoke-static {v10, v11}, Lj1/n;->a(Lj1/n;Lj1/n;)F

    move-result v10

    cmpl-float v11, v8, v6

    if-ltz v11, :cond_2e

    cmpl-float v11, v8, v10

    if-ltz v11, :cond_2e

    aget-object v6, v1, v3

    aget-object v8, v1, v7

    aget-object v10, v1, v9

    goto :goto_17

    :cond_2e
    cmpl-float v8, v10, v8

    if-ltz v8, :cond_2f

    cmpl-float v6, v10, v6

    if-ltz v6, :cond_2f

    aget-object v6, v1, v7

    aget-object v8, v1, v3

    aget-object v10, v1, v9

    goto :goto_17

    :cond_2f
    aget-object v6, v1, v9

    aget-object v8, v1, v3

    aget-object v10, v1, v7

    :goto_17
    iget v3, v6, Lj1/n;->a:F

    iget v7, v10, Lj1/n;->a:F

    sub-float/2addr v7, v3

    iget v9, v8, Lj1/n;->b:F

    iget v11, v6, Lj1/n;->b:F

    sub-float/2addr v9, v11

    mul-float/2addr v9, v7

    iget v7, v10, Lj1/n;->b:F

    sub-float/2addr v7, v11

    iget v12, v8, Lj1/n;->a:F

    sub-float/2addr v12, v3

    mul-float/2addr v12, v7

    sub-float/2addr v9, v12

    const/4 v3, 0x0

    cmpg-float v3, v9, v3

    if-gez v3, :cond_30

    const/4 v3, 0x0

    move-object/from16 v38, v10

    move-object v10, v8

    move-object/from16 v8, v38

    goto :goto_18

    :cond_30
    const/4 v3, 0x0

    :goto_18
    aput-object v8, v1, v3

    const/4 v3, 0x1

    aput-object v6, v1, v3

    const/4 v3, 0x2

    aput-object v10, v1, v3

    invoke-virtual {v2, v6, v10}, Lv0/r;->a(LH1/c;LH1/c;)F

    move-result v1

    invoke-virtual {v2, v6, v8}, Lv0/r;->a(LH1/c;LH1/c;)F

    move-result v3

    add-float/2addr v3, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v3, v1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v7, v3, v1

    if-ltz v7, :cond_3e

    invoke-static {v6, v10}, Lj1/n;->a(Lj1/n;Lj1/n;)F

    move-result v7

    div-float/2addr v7, v3

    invoke-static {v7}, Lv0/f;->K(F)I

    move-result v7

    invoke-static {v6, v8}, Lj1/n;->a(Lj1/n;Lj1/n;)F

    move-result v9

    div-float/2addr v9, v3

    invoke-static {v9}, Lv0/f;->K(F)I

    move-result v9

    add-int/2addr v9, v7

    const/4 v7, 0x2

    div-int/2addr v9, v7

    add-int/lit8 v12, v9, 0x7

    const/4 v13, 0x3

    and-int/lit8 v14, v12, 0x3

    if-eqz v14, :cond_33

    if-eq v14, v7, :cond_32

    if-eq v14, v13, :cond_31

    goto :goto_19

    :cond_31
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_32
    add-int/lit8 v12, v9, 0x6

    goto :goto_19

    :cond_33
    add-int/lit8 v12, v9, 0x8

    :goto_19
    sget-object v7, LG1/i;->e:[I

    const/4 v7, 0x4

    rem-int/lit8 v9, v12, 0x4

    const/4 v13, 0x1

    if-ne v9, v13, :cond_3d

    add-int/lit8 v9, v12, -0x11

    :try_start_0
    div-int/2addr v9, v7

    invoke-static {v9}, LG1/i;->c(I)LG1/i;

    move-result-object v9
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    iget v13, v9, LG1/i;->a:I

    mul-int/2addr v13, v7

    add-int/lit8 v13, v13, 0xa

    iget-object v7, v9, LG1/i;->b:[I

    array-length v7, v7

    iget v14, v6, Lj1/n;->a:F

    iget v15, v10, Lj1/n;->b:F

    iget v1, v10, Lj1/n;->a:F

    iget v9, v8, Lj1/n;->b:F

    iget v0, v8, Lj1/n;->a:F

    if-lez v7, :cond_34

    sub-float v7, v1, v14

    add-float/2addr v7, v0

    sub-float v21, v15, v11

    add-float v21, v21, v9

    int-to-float v13, v13

    const/high16 v20, 0x40400000    # 3.0f

    div-float v13, v20, v13

    const/high16 v18, 0x3f800000    # 1.0f

    sub-float v13, v18, v13

    sub-float/2addr v7, v14

    mul-float/2addr v7, v13

    add-float/2addr v7, v14

    float-to-int v7, v7

    sub-float v21, v21, v11

    mul-float v21, v21, v13

    add-float v13, v21, v11

    float-to-int v13, v13

    move-object/from16 v18, v4

    move-object/from16 v21, v5

    const/4 v4, 0x4

    :goto_1a
    const/16 v5, 0x10

    if-gt v4, v5, :cond_35

    int-to-float v5, v4

    :try_start_1
    invoke-virtual {v2, v3, v7, v13, v5}, Lv0/r;->s(FIIF)LH1/a;

    move-result-object v2
    :try_end_1
    .catch Lj1/h; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1b

    :catch_0
    const/4 v5, 0x1

    shl-int/2addr v4, v5

    goto :goto_1a

    :cond_34
    move-object/from16 v18, v4

    move-object/from16 v21, v5

    :cond_35
    const/4 v2, 0x0

    :goto_1b
    int-to-float v3, v12

    const/high16 v4, 0x40600000    # 3.5f

    sub-float v29, v3, v4

    if-eqz v2, :cond_36

    const/high16 v3, 0x40400000    # 3.0f

    sub-float v0, v29, v3

    iget v1, v2, Lj1/n;->a:F

    iget v3, v2, Lj1/n;->b:F

    move/from16 v27, v0

    move/from16 v34, v1

    move/from16 v35, v3

    goto :goto_1c

    :cond_36
    sub-float/2addr v1, v14

    add-float/2addr v1, v0

    sub-float/2addr v15, v11

    add-float/2addr v15, v9

    move/from16 v34, v1

    move/from16 v35, v15

    move/from16 v27, v29

    :goto_1c
    iget v0, v10, Lj1/n;->a:F

    iget v1, v8, Lj1/n;->a:F

    const/high16 v22, 0x40600000    # 3.5f

    const/high16 v23, 0x40600000    # 3.5f

    const/high16 v25, 0x40600000    # 3.5f

    const/high16 v28, 0x40600000    # 3.5f

    iget v3, v6, Lj1/n;->a:F

    iget v4, v6, Lj1/n;->b:F

    iget v5, v10, Lj1/n;->b:F

    iget v7, v8, Lj1/n;->b:F

    move/from16 v24, v29

    move/from16 v26, v27

    move/from16 v30, v3

    move/from16 v31, v4

    move/from16 v32, v0

    move/from16 v33, v5

    move/from16 v36, v1

    move/from16 v37, v7

    invoke-static/range {v22 .. v37}, Lp1/f;->a(FFFFFFFFFFFFFFFF)Lp1/f;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-static {v1, v12, v12, v0}, Lu2/d;->C(Lp1/b;IILp1/f;)Lp1/b;

    move-result-object v0

    if-nez v2, :cond_37

    const/4 v1, 0x3

    new-array v2, v1, [Lj1/n;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    const/4 v4, 0x1

    aput-object v6, v2, v4

    const/4 v5, 0x2

    aput-object v10, v2, v5

    move-object v1, v2

    move-object/from16 v3, v18

    move-object/from16 v2, p2

    goto :goto_1d

    :cond_37
    const/4 v1, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v7, 0x4

    new-array v7, v7, [Lj1/n;

    aput-object v8, v7, v3

    aput-object v6, v7, v4

    aput-object v10, v7, v5

    aput-object v2, v7, v1

    move-object/from16 v2, p2

    move-object v1, v7

    move-object/from16 v3, v18

    :goto_1d
    invoke-virtual {v3, v0, v2}, LG1/d;->d(Lp1/b;Ljava/util/Map;)Lp1/d;

    move-result-object v0

    :goto_1e
    iget-object v2, v0, Lp1/d;->e:Ljava/lang/Object;

    instance-of v3, v2, LG1/h;

    if-eqz v3, :cond_39

    check-cast v2, LG1/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v2, v1

    const/4 v3, 0x3

    if-ge v2, v3, :cond_38

    goto :goto_1f

    :cond_38
    const/4 v2, 0x0

    aget-object v3, v1, v2

    const/4 v4, 0x2

    aget-object v5, v1, v4

    aput-object v5, v1, v2

    aput-object v3, v1, v4

    :cond_39
    :goto_1f
    new-instance v2, Lj1/l;

    sget-object v3, Lj1/a;->m:Lj1/a;

    iget-object v4, v0, Lp1/d;->b:Ljava/lang/String;

    iget-object v5, v0, Lp1/d;->a:[B

    invoke-direct {v2, v4, v5, v1, v3}, Lj1/l;-><init>(Ljava/lang/String;[B[Lj1/n;Lj1/a;)V

    iget-object v1, v0, Lp1/d;->c:Ljava/util/List;

    if-eqz v1, :cond_3a

    sget-object v3, Lj1/m;->c:Lj1/m;

    invoke-virtual {v2, v3, v1}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    :cond_3a
    iget-object v1, v0, Lp1/d;->d:Ljava/lang/String;

    if-eqz v1, :cond_3b

    sget-object v3, Lj1/m;->d:Lj1/m;

    invoke-virtual {v2, v3, v1}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    :cond_3b
    iget v1, v0, Lp1/d;->f:I

    if-ltz v1, :cond_3c

    iget v0, v0, Lp1/d;->g:I

    if-ltz v0, :cond_3c

    sget-object v3, Lj1/m;->j:Lj1/m;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    sget-object v0, Lj1/m;->k:Lj1/m;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    :cond_3c
    return-object v2

    :catch_1
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object v0

    throw v0

    :cond_3d
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object v0

    throw v0

    :cond_3e
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_3f
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    :cond_40
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0
.end method

.method public final b(Lv0/e;)Lj1/l;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LF1/a;->a(Lv0/e;Ljava/util/Map;)Lj1/l;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 0

    return-void
.end method
