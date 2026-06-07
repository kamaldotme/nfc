.class public final Ls1/a;
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

    sput-object v0, Ls1/a;->b:[Lj1/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LG1/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LG1/d;-><init>(I)V

    iput-object v0, p0, Ls1/a;->a:LG1/d;

    return-void
.end method


# virtual methods
.method public final a(Lv0/e;Ljava/util/Map;)Lj1/l;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Ls1/a;->a:LG1/d;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_8

    sget-object v5, Lj1/c;->c:Lj1/c;

    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lv0/e;->e()Lp1/b;

    move-result-object v1

    invoke-virtual {v1}, Lp1/b;->e()[I

    move-result-object v5

    invoke-virtual {v1}, Lp1/b;->c()[I

    move-result-object v6

    if-eqz v5, :cond_7

    if-eqz v6, :cond_7

    aget v7, v5, v3

    aget v8, v5, v4

    :goto_0
    iget v9, v1, Lp1/b;->b:I

    if-ge v7, v9, :cond_0

    invoke-virtual {v1, v7, v8}, Lp1/b;->b(II)Z

    move-result v10

    if-eqz v10, :cond_0

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    if-eq v7, v9, :cond_6

    aget v8, v5, v3

    sub-int/2addr v7, v8

    if-eqz v7, :cond_5

    aget v5, v5, v4

    aget v9, v6, v4

    aget v6, v6, v3

    sub-int/2addr v6, v8

    add-int/2addr v6, v4

    div-int/2addr v6, v7

    sub-int/2addr v9, v5

    add-int/2addr v9, v4

    div-int/2addr v9, v7

    if-lez v6, :cond_4

    if-lez v9, :cond_4

    div-int/lit8 v4, v7, 0x2

    add-int/2addr v5, v4

    add-int/2addr v8, v4

    new-instance v4, Lp1/b;

    invoke-direct {v4, v6, v9}, Lp1/b;-><init>(II)V

    move v10, v3

    :goto_1
    if-ge v10, v9, :cond_3

    mul-int v11, v10, v7

    add-int/2addr v11, v5

    move v12, v3

    :goto_2
    if-ge v12, v6, :cond_2

    mul-int v13, v12, v7

    add-int/2addr v13, v8

    invoke-virtual {v1, v13, v11}, Lp1/b;->b(II)Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-virtual {v4, v12, v10}, Lp1/b;->f(II)V

    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v4}, LG1/d;->c(Lp1/b;)Lp1/d;

    move-result-object v1

    sget-object v2, Ls1/a;->b:[Lj1/n;

    goto/16 :goto_8

    :cond_4
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_5
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_6
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_7
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_8
    new-instance v1, Lv0/c;

    invoke-virtual/range {p1 .. p1}, Lv0/e;->e()Lp1/b;

    move-result-object v5

    invoke-direct {v1, v5}, Lv0/c;-><init>(Lp1/b;)V

    iget-object v6, v1, Lv0/c;->d:Ljava/lang/Object;

    check-cast v6, Lq1/a;

    invoke-virtual {v6}, Lq1/a;->b()[Lj1/n;

    move-result-object v6

    aget-object v7, v6, v3

    aget-object v8, v6, v4

    const/4 v9, 0x3

    aget-object v10, v6, v9

    const/4 v11, 0x2

    aget-object v6, v6, v11

    invoke-virtual {v1, v7, v8}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v12

    invoke-virtual {v1, v8, v10}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v13

    invoke-virtual {v1, v10, v6}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v14

    invoke-virtual {v1, v6, v7}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v15

    const/4 v9, 0x4

    new-array v9, v9, [Lj1/n;

    aput-object v6, v9, v3

    aput-object v7, v9, v4

    aput-object v8, v9, v11

    const/16 v16, 0x3

    aput-object v10, v9, v16

    if-le v12, v13, :cond_9

    aput-object v7, v9, v3

    aput-object v8, v9, v4

    aput-object v10, v9, v11

    aput-object v6, v9, v16

    move v12, v13

    :cond_9
    if-le v12, v14, :cond_a

    aput-object v8, v9, v3

    aput-object v10, v9, v4

    aput-object v6, v9, v11

    aput-object v7, v9, v16

    goto :goto_3

    :cond_a
    move v14, v12

    :goto_3
    if-le v14, v15, :cond_b

    aput-object v10, v9, v3

    aput-object v6, v9, v4

    aput-object v7, v9, v11

    aput-object v8, v9, v16

    :cond_b
    aget-object v6, v9, v3

    aget-object v7, v9, v4

    aget-object v8, v9, v11

    aget-object v10, v9, v16

    invoke-virtual {v1, v6, v10}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v12

    add-int/2addr v12, v4

    shl-int/2addr v12, v11

    invoke-static {v7, v8, v12}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v13

    invoke-static {v8, v7, v12}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v12

    invoke-virtual {v1, v13, v6}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v13

    invoke-virtual {v1, v12, v10}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v12

    if-ge v13, v12, :cond_c

    aput-object v6, v9, v3

    aput-object v7, v9, v4

    aput-object v8, v9, v11

    const/4 v12, 0x3

    aput-object v10, v9, v12

    goto :goto_4

    :cond_c
    const/4 v12, 0x3

    aput-object v7, v9, v3

    aput-object v8, v9, v4

    aput-object v10, v9, v11

    aput-object v6, v9, v12

    :goto_4
    aget-object v6, v9, v3

    aget-object v7, v9, v4

    aget-object v8, v9, v11

    aget-object v10, v9, v12

    invoke-virtual {v1, v6, v10}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v12

    invoke-virtual {v1, v7, v10}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v13

    add-int/2addr v13, v4

    shl-int/2addr v13, v11

    invoke-static {v6, v7, v13}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v13

    add-int/2addr v12, v4

    shl-int/2addr v12, v11

    invoke-static {v8, v7, v12}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v12

    invoke-virtual {v1, v13, v10}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v14

    invoke-virtual {v1, v12, v10}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v15

    new-instance v11, Lj1/n;

    iget v3, v8, Lj1/n;->a:F

    iget v0, v7, Lj1/n;->a:F

    sub-float/2addr v3, v0

    add-int/2addr v14, v4

    int-to-float v14, v14

    div-float/2addr v3, v14

    iget v4, v10, Lj1/n;->a:F

    add-float/2addr v3, v4

    iget v8, v8, Lj1/n;->b:F

    iget v7, v7, Lj1/n;->b:F

    sub-float/2addr v8, v7

    div-float/2addr v8, v14

    iget v10, v10, Lj1/n;->b:F

    add-float/2addr v8, v10

    invoke-direct {v11, v3, v8}, Lj1/n;-><init>(FF)V

    new-instance v3, Lj1/n;

    iget v8, v6, Lj1/n;->a:F

    sub-float/2addr v8, v0

    const/4 v0, 0x1

    add-int/2addr v15, v0

    int-to-float v0, v15

    div-float/2addr v8, v0

    add-float/2addr v8, v4

    iget v4, v6, Lj1/n;->b:F

    sub-float/2addr v4, v7

    div-float/2addr v4, v0

    add-float/2addr v4, v10

    invoke-direct {v3, v8, v4}, Lj1/n;-><init>(FF)V

    invoke-virtual {v1, v11}, Lv0/c;->j(Lj1/n;)Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {v1, v3}, Lv0/c;->j(Lj1/n;)Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_d
    move-object v11, v3

    :goto_5
    const/4 v0, 0x3

    goto :goto_7

    :cond_e
    const/4 v11, 0x0

    goto :goto_5

    :cond_f
    invoke-virtual {v1, v3}, Lv0/c;->j(Lj1/n;)Z

    move-result v0

    if-nez v0, :cond_10

    :goto_6
    goto :goto_5

    :cond_10
    invoke-virtual {v1, v13, v11}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v0

    invoke-virtual {v1, v12, v11}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {v1, v13, v3}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v0

    invoke-virtual {v1, v12, v3}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v6

    add-int/2addr v6, v0

    if-le v4, v6, :cond_d

    goto :goto_6

    :goto_7
    aput-object v11, v9, v0

    if-eqz v11, :cond_18

    const/4 v0, 0x0

    aget-object v3, v9, v0

    const/4 v0, 0x1

    aget-object v4, v9, v0

    const/4 v6, 0x2

    aget-object v7, v9, v6

    invoke-virtual {v1, v3, v11}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v8

    add-int/2addr v8, v0

    invoke-virtual {v1, v7, v11}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v9

    add-int/2addr v9, v0

    shl-int/lit8 v0, v9, 0x2

    invoke-static {v3, v4, v0}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v0

    shl-int/2addr v8, v6

    invoke-static {v7, v4, v8}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v8

    invoke-virtual {v1, v0, v11}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v0

    add-int/lit8 v9, v0, 0x1

    invoke-virtual {v1, v8, v11}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v8

    add-int/lit8 v10, v8, 0x1

    and-int/lit8 v12, v9, 0x1

    const/4 v13, 0x1

    if-ne v12, v13, :cond_11

    add-int/lit8 v9, v0, 0x2

    :cond_11
    and-int/lit8 v0, v10, 0x1

    if-ne v0, v13, :cond_12

    add-int/lit8 v10, v8, 0x2

    :cond_12
    iget v0, v3, Lj1/n;->a:F

    iget v6, v4, Lj1/n;->a:F

    add-float/2addr v0, v6

    iget v6, v7, Lj1/n;->a:F

    add-float/2addr v0, v6

    iget v6, v11, Lj1/n;->a:F

    add-float/2addr v0, v6

    const/high16 v6, 0x40800000    # 4.0f

    div-float/2addr v0, v6

    iget v8, v3, Lj1/n;->b:F

    iget v12, v4, Lj1/n;->b:F

    add-float/2addr v8, v12

    iget v12, v7, Lj1/n;->b:F

    add-float/2addr v8, v12

    iget v12, v11, Lj1/n;->b:F

    add-float/2addr v8, v12

    div-float/2addr v8, v6

    invoke-static {v3, v0, v8}, Lv0/c;->m(Lj1/n;FF)Lj1/n;

    move-result-object v3

    invoke-static {v4, v0, v8}, Lv0/c;->m(Lj1/n;FF)Lj1/n;

    move-result-object v4

    invoke-static {v7, v0, v8}, Lv0/c;->m(Lj1/n;FF)Lj1/n;

    move-result-object v6

    invoke-static {v11, v0, v8}, Lv0/c;->m(Lj1/n;FF)Lj1/n;

    move-result-object v0

    const/4 v7, 0x2

    shl-int/lit8 v8, v10, 0x2

    invoke-static {v3, v4, v8}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v10

    shl-int/2addr v9, v7

    invoke-static {v10, v0, v9}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v7

    invoke-static {v4, v3, v8}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v10

    invoke-static {v10, v6, v9}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v10

    invoke-static {v6, v0, v8}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v11

    invoke-static {v11, v4, v9}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v4

    invoke-static {v0, v6, v8}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v0

    invoke-static {v0, v3, v9}, Lv0/c;->o(Lj1/n;Lj1/n;I)Lj1/n;

    move-result-object v0

    filled-new-array {v7, v10, v4, v0}, [Lj1/n;

    move-result-object v0

    const/4 v3, 0x0

    aget-object v3, v0, v3

    const/4 v4, 0x1

    aget-object v6, v0, v4

    const/4 v7, 0x2

    aget-object v8, v0, v7

    const/4 v9, 0x3

    aget-object v0, v0, v9

    invoke-virtual {v1, v3, v0}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v9

    add-int/lit8 v10, v9, 0x1

    invoke-virtual {v1, v8, v0}, Lv0/c;->q(Lj1/n;Lj1/n;)I

    move-result v1

    add-int/lit8 v11, v1, 0x1

    and-int/lit8 v12, v10, 0x1

    if-ne v12, v4, :cond_13

    add-int/lit8 v10, v9, 0x2

    :cond_13
    and-int/lit8 v9, v11, 0x1

    if-ne v9, v4, :cond_14

    add-int/lit8 v11, v1, 0x2

    :cond_14
    mul-int/lit8 v1, v10, 0x4

    mul-int/lit8 v4, v11, 0x7

    if-ge v1, v4, :cond_15

    mul-int/lit8 v1, v11, 0x4

    mul-int/lit8 v4, v10, 0x7

    if-ge v1, v4, :cond_15

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    move v11, v10

    :cond_15
    int-to-float v1, v10

    const/high16 v4, 0x3f000000    # 0.5f

    sub-float v16, v1, v4

    int-to-float v1, v11

    sub-float v19, v1, v4

    iget v1, v6, Lj1/n;->a:F

    const/high16 v12, 0x3f000000    # 0.5f

    const/high16 v13, 0x3f000000    # 0.5f

    const/high16 v18, 0x3f000000    # 0.5f

    iget v4, v3, Lj1/n;->a:F

    iget v7, v3, Lj1/n;->b:F

    iget v9, v0, Lj1/n;->a:F

    iget v14, v0, Lj1/n;->b:F

    iget v15, v8, Lj1/n;->a:F

    move/from16 v17, v15

    iget v15, v8, Lj1/n;->b:F

    move/from16 v20, v15

    iget v15, v6, Lj1/n;->b:F

    move/from16 v23, v14

    move/from16 v14, v16

    move/from16 v27, v15

    move/from16 v24, v17

    move/from16 v25, v20

    const/high16 v15, 0x3f000000    # 0.5f

    move/from16 v17, v19

    move/from16 v20, v4

    move/from16 v21, v7

    move/from16 v22, v9

    move/from16 v26, v1

    invoke-static/range {v12 .. v27}, Lp1/f;->a(FFFFFFFFFFFFFFFF)Lp1/f;

    move-result-object v1

    invoke-static {v5, v10, v11, v1}, Lu2/d;->C(Lp1/b;IILp1/f;)Lp1/b;

    move-result-object v1

    filled-new-array {v3, v6, v8, v0}, [Lj1/n;

    move-result-object v0

    invoke-virtual {v2, v1}, LG1/d;->c(Lp1/b;)Lp1/d;

    move-result-object v1

    move-object v2, v0

    :goto_8
    new-instance v0, Lj1/l;

    sget-object v3, Lj1/a;->g:Lj1/a;

    iget-object v4, v1, Lp1/d;->b:Ljava/lang/String;

    iget-object v5, v1, Lp1/d;->a:[B

    invoke-direct {v0, v4, v5, v2, v3}, Lj1/l;-><init>(Ljava/lang/String;[B[Lj1/n;Lj1/a;)V

    iget-object v2, v1, Lp1/d;->c:Ljava/util/List;

    if-eqz v2, :cond_16

    sget-object v3, Lj1/m;->c:Lj1/m;

    invoke-virtual {v0, v3, v2}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    :cond_16
    iget-object v1, v1, Lp1/d;->d:Ljava/lang/String;

    if-eqz v1, :cond_17

    sget-object v2, Lj1/m;->d:Lj1/m;

    invoke-virtual {v0, v2, v1}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    :cond_17
    return-object v0

    :cond_18
    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0
.end method

.method public final b(Lv0/e;)Lj1/l;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ls1/a;->a(Lv0/e;Ljava/util/Map;)Lj1/l;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 0

    return-void
.end method
