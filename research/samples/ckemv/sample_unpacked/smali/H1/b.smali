.class public final LH1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/b;

.field public final b:Ljava/util/ArrayList;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:F

.field public final h:[I

.field public final i:Lj1/o;


# direct methods
.method public constructor <init>(Lp1/b;IIIIFLj1/o;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH1/b;->a:Lp1/b;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x5

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, LH1/b;->b:Ljava/util/ArrayList;

    iput p2, p0, LH1/b;->c:I

    iput p3, p0, LH1/b;->d:I

    iput p4, p0, LH1/b;->e:I

    iput p5, p0, LH1/b;->f:I

    iput p6, p0, LH1/b;->g:F

    const/4 p1, 0x3

    new-array p1, p1, [I

    iput-object p1, p0, LH1/b;->h:[I

    iput-object p7, p0, LH1/b;->i:Lj1/o;

    return-void
.end method


# virtual methods
.method public final a([I)Z
    .locals 5

    iget v0, p0, LH1/b;->g:F

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x3

    if-ge v3, v4, :cond_1

    aget v4, p1, v3

    int-to-float v4, v4

    sub-float v4, v0, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v4, v4, v1

    if-ltz v4, :cond_0

    return v2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final b(II[I)LH1/a;
    .locals 15

    move-object v0, p0

    const/4 v1, 0x0

    aget v2, p3, v1

    const/4 v3, 0x1

    aget v4, p3, v3

    add-int/2addr v2, v4

    const/4 v5, 0x2

    aget v6, p3, v5

    add-int/2addr v2, v6

    sub-int v6, p2, v6

    int-to-float v6, v6

    int-to-float v7, v4

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    sub-float/2addr v6, v7

    float-to-int v7, v6

    mul-int/2addr v4, v5

    iget-object v9, v0, LH1/b;->a:Lp1/b;

    iget v10, v9, Lp1/b;->c:I

    iget-object v11, v0, LH1/b;->h:[I

    aput v1, v11, v1

    aput v1, v11, v3

    aput v1, v11, v5

    move/from16 v12, p1

    :goto_0
    if-ltz v12, :cond_0

    invoke-virtual {v9, v7, v12}, Lp1/b;->b(II)Z

    move-result v13

    if-eqz v13, :cond_0

    aget v13, v11, v3

    if-gt v13, v4, :cond_0

    add-int/lit8 v13, v13, 0x1

    aput v13, v11, v3

    add-int/lit8 v12, v12, -0x1

    goto :goto_0

    :cond_0
    const/high16 v13, 0x7fc00000    # Float.NaN

    if-ltz v12, :cond_9

    aget v14, v11, v3

    if-le v14, v4, :cond_1

    goto/16 :goto_4

    :cond_1
    :goto_1
    if-ltz v12, :cond_2

    invoke-virtual {v9, v7, v12}, Lp1/b;->b(II)Z

    move-result v14

    if-nez v14, :cond_2

    aget v14, v11, v1

    if-gt v14, v4, :cond_2

    add-int/lit8 v14, v14, 0x1

    aput v14, v11, v1

    add-int/lit8 v12, v12, -0x1

    goto :goto_1

    :cond_2
    aget v12, v11, v1

    if-le v12, v4, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v12, p1, 0x1

    :goto_2
    if-ge v12, v10, :cond_4

    invoke-virtual {v9, v7, v12}, Lp1/b;->b(II)Z

    move-result v14

    if-eqz v14, :cond_4

    aget v14, v11, v3

    if-gt v14, v4, :cond_4

    add-int/lit8 v14, v14, 0x1

    aput v14, v11, v3

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_4
    if-eq v12, v10, :cond_9

    aget v14, v11, v3

    if-le v14, v4, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    if-ge v12, v10, :cond_6

    invoke-virtual {v9, v7, v12}, Lp1/b;->b(II)Z

    move-result v14

    if-nez v14, :cond_6

    aget v14, v11, v5

    if-gt v14, v4, :cond_6

    add-int/lit8 v14, v14, 0x1

    aput v14, v11, v5

    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_6
    aget v7, v11, v5

    if-le v7, v4, :cond_7

    goto :goto_4

    :cond_7
    aget v4, v11, v1

    aget v9, v11, v3

    add-int/2addr v4, v9

    add-int/2addr v4, v7

    sub-int/2addr v4, v2

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x5

    mul-int/2addr v2, v5

    if-lt v4, v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0, v11}, LH1/b;->a([I)Z

    move-result v2

    if-eqz v2, :cond_9

    aget v2, v11, v5

    sub-int/2addr v12, v2

    int-to-float v2, v12

    aget v4, v11, v3

    int-to-float v4, v4

    div-float/2addr v4, v8

    sub-float v13, v2, v4

    :cond_9
    :goto_4
    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_d

    aget v1, p3, v1

    aget v2, p3, v3

    add-int/2addr v1, v2

    aget v2, p3, v5

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40400000    # 3.0f

    div-float/2addr v1, v2

    iget-object v2, v0, LH1/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LH1/a;

    iget v5, v4, Lj1/n;->b:F

    sub-float v5, v13, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v5, v5, v1

    if-gtz v5, :cond_a

    iget v5, v4, Lj1/n;->a:F

    sub-float v7, v6, v5

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    cmpg-float v7, v7, v1

    if-gtz v7, :cond_a

    iget v7, v4, LH1/a;->c:F

    sub-float v9, v1, v7

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    const/high16 v10, 0x3f800000    # 1.0f

    cmpg-float v10, v9, v10

    if-lez v10, :cond_b

    cmpg-float v9, v9, v7

    if-gtz v9, :cond_a

    :cond_b
    add-float/2addr v5, v6

    div-float/2addr v5, v8

    iget v2, v4, Lj1/n;->b:F

    add-float/2addr v2, v13

    div-float/2addr v2, v8

    add-float/2addr v7, v1

    div-float/2addr v7, v8

    new-instance v1, LH1/a;

    invoke-direct {v1, v5, v2, v7}, LH1/a;-><init>(FFF)V

    return-object v1

    :cond_c
    new-instance v3, LH1/a;

    invoke-direct {v3, v6, v13, v1}, LH1/a;-><init>(FFF)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, LH1/b;->i:Lj1/o;

    if-eqz v1, :cond_d

    invoke-interface {v1, v3}, Lj1/o;->a(Lj1/n;)V

    :cond_d
    const/4 v1, 0x0

    return-object v1
.end method
