.class public final Lq/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static o:I = 0x3e8

.field public static p:Z = true


# instance fields
.field public a:I

.field public final b:Lq/g;

.field public c:I

.field public d:I

.field public e:[Lq/c;

.field public f:Z

.field public g:[Z

.field public h:I

.field public i:I

.field public j:I

.field public final k:Lv0/i;

.field public l:[Lq/i;

.field public m:I

.field public n:Lq/c;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lq/e;->a:I

    const/16 v1, 0x20

    iput v1, p0, Lq/e;->c:I

    iput v1, p0, Lq/e;->d:I

    const/4 v2, 0x0

    iput-object v2, p0, Lq/e;->e:[Lq/c;

    iput-boolean v0, p0, Lq/e;->f:Z

    new-array v2, v1, [Z

    iput-object v2, p0, Lq/e;->g:[Z

    const/4 v2, 0x1

    iput v2, p0, Lq/e;->h:I

    iput v0, p0, Lq/e;->i:I

    iput v1, p0, Lq/e;->j:I

    sget v2, Lq/e;->o:I

    new-array v2, v2, [Lq/i;

    iput-object v2, p0, Lq/e;->l:[Lq/i;

    iput v0, p0, Lq/e;->m:I

    new-array v2, v1, [Lq/c;

    iput-object v2, p0, Lq/e;->e:[Lq/c;

    invoke-virtual {p0}, Lq/e;->q()V

    new-instance v2, Lv0/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, LI/b;

    invoke-direct {v3}, LI/b;-><init>()V

    iput-object v3, v2, Lv0/i;->b:Ljava/lang/Object;

    new-instance v3, LI/b;

    invoke-direct {v3}, LI/b;-><init>()V

    iput-object v3, v2, Lv0/i;->c:Ljava/lang/Object;

    new-instance v3, LI/b;

    invoke-direct {v3}, LI/b;-><init>()V

    iput-object v3, v2, Lv0/i;->d:Ljava/lang/Object;

    new-array v1, v1, [Lq/i;

    iput-object v1, v2, Lv0/i;->e:Ljava/lang/Object;

    iput-object v2, p0, Lq/e;->k:Lv0/i;

    new-instance v1, Lq/g;

    invoke-direct {v1, v2}, Lq/c;-><init>(Lv0/i;)V

    const/16 v3, 0x80

    new-array v4, v3, [Lq/i;

    iput-object v4, v1, Lq/g;->f:[Lq/i;

    new-array v3, v3, [Lq/i;

    iput-object v3, v1, Lq/g;->g:[Lq/i;

    iput v0, v1, Lq/g;->h:I

    new-instance v0, Lq/f;

    invoke-direct {v0, v1}, Lq/f;-><init>(Lq/g;)V

    iput-object v0, v1, Lq/g;->i:Lq/f;

    iput-object v1, p0, Lq/e;->b:Lq/g;

    sget-boolean v0, Lq/e;->p:Z

    if-eqz v0, :cond_0

    new-instance v0, Lq/d;

    invoke-direct {v0, v2}, Lq/d;-><init>(Lv0/i;)V

    iput-object v0, p0, Lq/e;->n:Lq/c;

    goto :goto_0

    :cond_0
    new-instance v0, Lq/c;

    invoke-direct {v0, v2}, Lq/c;-><init>(Lv0/i;)V

    iput-object v0, p0, Lq/e;->n:Lq/c;

    :goto_0
    return-void
.end method

.method public static m(Lr/c;)I
    .locals 1

    iget-object p0, p0, Lr/c;->g:Lq/i;

    if-eqz p0, :cond_0

    iget p0, p0, Lq/i;->e:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p0, v0

    float-to-int p0, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(I)Lq/i;
    .locals 3

    iget-object v0, p0, Lq/e;->k:Lv0/i;

    iget-object v0, v0, Lv0/i;->d:Ljava/lang/Object;

    check-cast v0, LI/b;

    invoke-virtual {v0}, LI/b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/i;

    if-nez v0, :cond_0

    new-instance v0, Lq/i;

    invoke-direct {v0, p1}, Lq/i;-><init>(I)V

    iput p1, v0, Lq/i;->l:I

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lq/i;->c()V

    iput p1, v0, Lq/i;->l:I

    :goto_0
    iget p1, p0, Lq/e;->m:I

    sget v1, Lq/e;->o:I

    if-lt p1, v1, :cond_1

    mul-int/lit8 v1, v1, 0x2

    sput v1, Lq/e;->o:I

    iget-object p1, p0, Lq/e;->l:[Lq/i;

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lq/i;

    iput-object p1, p0, Lq/e;->l:[Lq/i;

    :cond_1
    iget-object p1, p0, Lq/e;->l:[Lq/i;

    iget v1, p0, Lq/e;->m:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lq/e;->m:I

    aput-object v0, p1, v1

    return-object v0
.end method

.method public final b(Lq/i;Lq/i;IFLq/i;Lq/i;II)V
    .locals 6

    invoke-virtual {p0}, Lq/e;->k()Lq/c;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-ne p2, p5, :cond_0

    iget-object p3, v0, Lq/c;->d:Lq/b;

    invoke-interface {p3, p1, v1}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p6, v1}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    const/high16 p3, -0x40000000    # -2.0f

    invoke-interface {p1, p2, p3}, Lq/b;->g(Lq/i;F)V

    goto/16 :goto_0

    :cond_0
    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v2, p4, v2

    const/high16 v3, -0x40800000    # -1.0f

    if-nez v2, :cond_2

    iget-object p4, v0, Lq/c;->d:Lq/b;

    invoke-interface {p4, p1, v1}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p2, v3}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p5, v3}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p6, v1}, Lq/b;->g(Lq/i;F)V

    if-gtz p3, :cond_1

    if-lez p7, :cond_6

    :cond_1
    neg-int p1, p3

    add-int/2addr p1, p7

    int-to-float p1, p1

    iput p1, v0, Lq/c;->b:F

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, p4, v2

    if-gtz v2, :cond_3

    iget-object p4, v0, Lq/c;->d:Lq/b;

    invoke-interface {p4, p1, v3}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p2, v1}, Lq/b;->g(Lq/i;F)V

    int-to-float p1, p3

    iput p1, v0, Lq/c;->b:F

    goto :goto_0

    :cond_3
    cmpl-float v2, p4, v1

    if-ltz v2, :cond_4

    iget-object p1, v0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p6, v3}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p5, v1}, Lq/b;->g(Lq/i;F)V

    neg-int p1, p7

    int-to-float p1, p1

    iput p1, v0, Lq/c;->b:F

    goto :goto_0

    :cond_4
    iget-object v2, v0, Lq/c;->d:Lq/b;

    sub-float v4, v1, p4

    mul-float v5, v4, v1

    invoke-interface {v2, p1, v5}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    mul-float v2, v4, v3

    invoke-interface {p1, p2, v2}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    mul-float/2addr v3, p4

    invoke-interface {p1, p5, v3}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v0, Lq/c;->d:Lq/b;

    mul-float/2addr v1, p4

    invoke-interface {p1, p6, v1}, Lq/b;->g(Lq/i;F)V

    if-gtz p3, :cond_5

    if-lez p7, :cond_6

    :cond_5
    neg-int p1, p3

    int-to-float p1, p1

    mul-float/2addr p1, v4

    int-to-float p2, p7

    mul-float/2addr p2, p4

    add-float/2addr p2, p1

    iput p2, v0, Lq/c;->b:F

    :cond_6
    :goto_0
    const/16 p1, 0x8

    if-eq p8, p1, :cond_7

    invoke-virtual {v0, p0, p8}, Lq/c;->a(Lq/e;I)V

    :cond_7
    invoke-virtual {p0, v0}, Lq/e;->c(Lq/c;)V

    return-void
.end method

.method public final c(Lq/c;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lq/e;->i:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iget v4, v0, Lq/e;->j:I

    if-ge v2, v4, :cond_0

    iget v2, v0, Lq/e;->h:I

    add-int/2addr v2, v3

    iget v4, v0, Lq/e;->d:I

    if-lt v2, v4, :cond_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lq/e;->n()V

    :cond_1
    iget-boolean v2, v1, Lq/c;->e:Z

    if-nez v2, :cond_20

    iget-object v2, v0, Lq/e;->e:[Lq/c;

    array-length v2, v2

    const/4 v4, -0x1

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_9

    iget-object v6, v1, Lq/c;->d:Lq/b;

    invoke-interface {v6}, Lq/b;->k()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    iget-object v8, v1, Lq/c;->c:Ljava/util/ArrayList;

    if-ge v7, v6, :cond_5

    iget-object v9, v1, Lq/c;->d:Lq/b;

    invoke-interface {v9, v7}, Lq/b;->b(I)Lq/i;

    move-result-object v9

    iget v10, v9, Lq/i;->c:I

    if-ne v10, v4, :cond_3

    iget-boolean v10, v9, Lq/i;->f:Z

    if-eqz v10, :cond_4

    :cond_3
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_8

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq/i;

    iget-boolean v9, v7, Lq/i;->f:Z

    if-eqz v9, :cond_6

    invoke-virtual {v1, v7, v3}, Lq/c;->g(Lq/i;Z)V

    goto :goto_2

    :cond_6
    iget-object v9, v0, Lq/e;->e:[Lq/c;

    iget v7, v7, Lq/i;->c:I

    aget-object v7, v9, v7

    invoke-virtual {v1, v7, v3}, Lq/c;->h(Lq/c;Z)V

    goto :goto_2

    :cond_7
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    goto :goto_0

    :cond_8
    move v2, v3

    goto :goto_0

    :cond_9
    :goto_3
    iget-object v2, v1, Lq/c;->a:Lq/i;

    const/4 v6, 0x0

    if-nez v2, :cond_a

    iget v2, v1, Lq/c;->b:F

    cmpl-float v2, v2, v6

    if-nez v2, :cond_a

    iget-object v2, v1, Lq/c;->d:Lq/b;

    invoke-interface {v2}, Lq/b;->k()I

    move-result v2

    if-nez v2, :cond_a

    return-void

    :cond_a
    iget v2, v1, Lq/c;->b:F

    cmpg-float v7, v2, v6

    if-gez v7, :cond_b

    const/high16 v7, -0x40800000    # -1.0f

    mul-float/2addr v2, v7

    iput v2, v1, Lq/c;->b:F

    iget-object v2, v1, Lq/c;->d:Lq/b;

    invoke-interface {v2}, Lq/b;->j()V

    :cond_b
    iget-object v2, v1, Lq/c;->d:Lq/b;

    invoke-interface {v2}, Lq/b;->k()I

    move-result v2

    const/4 v7, 0x0

    move v11, v6

    move v13, v11

    move-object v9, v7

    move-object v10, v9

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_4
    if-ge v8, v2, :cond_14

    iget-object v15, v1, Lq/c;->d:Lq/b;

    invoke-interface {v15, v8}, Lq/b;->a(I)F

    move-result v15

    iget-object v5, v1, Lq/c;->d:Lq/b;

    invoke-interface {v5, v8}, Lq/b;->b(I)Lq/i;

    move-result-object v5

    iget v4, v5, Lq/i;->l:I

    if-ne v4, v3, :cond_f

    if-nez v9, :cond_d

    iget v4, v5, Lq/i;->k:I

    if-gt v4, v3, :cond_c

    goto :goto_6

    :cond_c
    const/4 v12, 0x0

    :goto_5
    move-object v9, v5

    move v11, v15

    goto :goto_9

    :cond_d
    cmpl-float v4, v11, v15

    if-lez v4, :cond_e

    iget v4, v5, Lq/i;->k:I

    if-gt v4, v3, :cond_c

    goto :goto_6

    :cond_e
    if-nez v12, :cond_13

    iget v4, v5, Lq/i;->k:I

    if-gt v4, v3, :cond_13

    :goto_6
    move v12, v3

    goto :goto_5

    :cond_f
    if-nez v9, :cond_13

    cmpg-float v4, v15, v6

    if-gez v4, :cond_13

    if-nez v10, :cond_11

    iget v4, v5, Lq/i;->k:I

    if-gt v4, v3, :cond_10

    goto :goto_8

    :cond_10
    const/4 v14, 0x0

    :goto_7
    move-object v10, v5

    move v13, v15

    goto :goto_9

    :cond_11
    cmpl-float v4, v13, v15

    if-lez v4, :cond_12

    iget v4, v5, Lq/i;->k:I

    if-gt v4, v3, :cond_10

    goto :goto_8

    :cond_12
    if-nez v14, :cond_13

    iget v4, v5, Lq/i;->k:I

    if-gt v4, v3, :cond_13

    :goto_8
    move v14, v3

    goto :goto_7

    :cond_13
    :goto_9
    add-int/lit8 v8, v8, 0x1

    const/4 v4, -0x1

    goto :goto_4

    :cond_14
    if-eqz v9, :cond_15

    goto :goto_a

    :cond_15
    move-object v9, v10

    :goto_a
    if-nez v9, :cond_16

    move v2, v3

    goto :goto_b

    :cond_16
    invoke-virtual {v1, v9}, Lq/c;->f(Lq/i;)V

    const/4 v2, 0x0

    :goto_b
    iget-object v4, v1, Lq/c;->d:Lq/b;

    invoke-interface {v4}, Lq/b;->k()I

    move-result v4

    if-nez v4, :cond_17

    iput-boolean v3, v1, Lq/c;->e:Z

    :cond_17
    if-eqz v2, :cond_1d

    iget v2, v0, Lq/e;->h:I

    add-int/2addr v2, v3

    iget v4, v0, Lq/e;->d:I

    if-lt v2, v4, :cond_18

    invoke-virtual/range {p0 .. p0}, Lq/e;->n()V

    :cond_18
    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lq/e;->a(I)Lq/i;

    move-result-object v2

    iget v4, v0, Lq/e;->a:I

    add-int/2addr v4, v3

    iput v4, v0, Lq/e;->a:I

    iget v5, v0, Lq/e;->h:I

    add-int/2addr v5, v3

    iput v5, v0, Lq/e;->h:I

    iput v4, v2, Lq/i;->b:I

    iget-object v5, v0, Lq/e;->k:Lv0/i;

    iget-object v5, v5, Lv0/i;->e:Ljava/lang/Object;

    check-cast v5, [Lq/i;

    aput-object v2, v5, v4

    iput-object v2, v1, Lq/c;->a:Lq/i;

    invoke-virtual/range {p0 .. p1}, Lq/e;->h(Lq/c;)V

    iget-object v4, v0, Lq/e;->n:Lq/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v7, v4, Lq/c;->a:Lq/i;

    iget-object v5, v4, Lq/c;->d:Lq/b;

    invoke-interface {v5}, Lq/b;->clear()V

    const/4 v5, 0x0

    :goto_c
    iget-object v8, v1, Lq/c;->d:Lq/b;

    invoke-interface {v8}, Lq/b;->k()I

    move-result v8

    if-ge v5, v8, :cond_19

    iget-object v8, v1, Lq/c;->d:Lq/b;

    invoke-interface {v8, v5}, Lq/b;->b(I)Lq/i;

    move-result-object v8

    iget-object v9, v1, Lq/c;->d:Lq/b;

    invoke-interface {v9, v5}, Lq/b;->a(I)F

    move-result v9

    iget-object v10, v4, Lq/c;->d:Lq/b;

    invoke-interface {v10, v8, v9, v3}, Lq/b;->f(Lq/i;FZ)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :cond_19
    iget-object v4, v0, Lq/e;->n:Lq/c;

    invoke-virtual {v0, v4}, Lq/e;->p(Lq/c;)V

    iget v4, v2, Lq/i;->c:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1c

    iget-object v4, v1, Lq/c;->a:Lq/i;

    if-ne v4, v2, :cond_1a

    invoke-virtual {v1, v7, v2}, Lq/c;->e([ZLq/i;)Lq/i;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-virtual {v1, v2}, Lq/c;->f(Lq/i;)V

    :cond_1a
    iget-boolean v2, v1, Lq/c;->e:Z

    if-nez v2, :cond_1b

    iget-object v2, v1, Lq/c;->a:Lq/i;

    invoke-virtual {v2, v1}, Lq/i;->d(Lq/c;)V

    :cond_1b
    iget v2, v0, Lq/e;->i:I

    sub-int/2addr v2, v3

    iput v2, v0, Lq/e;->i:I

    :cond_1c
    move v5, v3

    goto :goto_d

    :cond_1d
    const/4 v5, 0x0

    :goto_d
    iget-object v2, v1, Lq/c;->a:Lq/i;

    if-eqz v2, :cond_1f

    iget v2, v2, Lq/i;->l:I

    if-eq v2, v3, :cond_1e

    iget v2, v1, Lq/c;->b:F

    cmpg-float v2, v2, v6

    if-ltz v2, :cond_1f

    :cond_1e
    if-nez v5, :cond_21

    goto :goto_e

    :cond_1f
    return-void

    :cond_20
    :goto_e
    invoke-virtual/range {p0 .. p1}, Lq/e;->h(Lq/c;)V

    :cond_21
    return-void
.end method

.method public final d(Lq/i;I)V
    .locals 4

    iget v0, p1, Lq/i;->c:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    int-to-float p2, p2

    iput p2, p1, Lq/i;->e:F

    iput-boolean v1, p1, Lq/i;->f:Z

    iget p2, p1, Lq/i;->j:I

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    iget-object v2, p1, Lq/i;->i:[Lq/c;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, v0}, Lq/c;->g(Lq/i;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p1, Lq/i;->j:I

    return-void

    :cond_1
    if-eq v0, v2, :cond_5

    iget-object v3, p0, Lq/e;->e:[Lq/c;

    aget-object v0, v3, v0

    iget-boolean v3, v0, Lq/c;->e:Z

    if-eqz v3, :cond_2

    int-to-float p1, p2

    iput p1, v0, Lq/c;->b:F

    goto :goto_2

    :cond_2
    iget-object v3, v0, Lq/c;->d:Lq/b;

    invoke-interface {v3}, Lq/b;->k()I

    move-result v3

    if-nez v3, :cond_3

    iput-boolean v1, v0, Lq/c;->e:Z

    int-to-float p1, p2

    iput p1, v0, Lq/c;->b:F

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lq/e;->k()Lq/c;

    move-result-object v0

    if-gez p2, :cond_4

    mul-int/2addr p2, v2

    int-to-float p2, p2

    iput p2, v0, Lq/c;->b:F

    iget-object p2, v0, Lq/c;->d:Lq/b;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {p2, p1, v1}, Lq/b;->g(Lq/i;F)V

    goto :goto_1

    :cond_4
    int-to-float p2, p2

    iput p2, v0, Lq/c;->b:F

    iget-object p2, v0, Lq/c;->d:Lq/b;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-interface {p2, p1, v1}, Lq/b;->g(Lq/i;F)V

    :goto_1
    invoke-virtual {p0, v0}, Lq/e;->c(Lq/c;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lq/e;->k()Lq/c;

    move-result-object v0

    iput-object p1, v0, Lq/c;->a:Lq/i;

    int-to-float p2, p2

    iput p2, p1, Lq/i;->e:F

    iput p2, v0, Lq/c;->b:F

    iput-boolean v1, v0, Lq/c;->e:Z

    invoke-virtual {p0, v0}, Lq/e;->c(Lq/c;)V

    :goto_2
    return-void
.end method

.method public final e(Lq/i;Lq/i;II)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-ne p4, v2, :cond_1

    iget-boolean v3, p2, Lq/i;->f:Z

    if-eqz v3, :cond_1

    iget v3, p1, Lq/i;->c:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    iget p2, p2, Lq/i;->e:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    iput p2, p1, Lq/i;->e:F

    iput-boolean v1, p1, Lq/i;->f:Z

    iget p2, p1, Lq/i;->j:I

    move p3, v0

    :goto_0
    if-ge p3, p2, :cond_0

    iget-object p4, p1, Lq/i;->i:[Lq/c;

    aget-object p4, p4, p3

    invoke-virtual {p4, p1, v0}, Lq/c;->g(Lq/i;Z)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    iput v0, p1, Lq/i;->j:I

    return-void

    :cond_1
    invoke-virtual {p0}, Lq/e;->k()Lq/c;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, -0x40800000    # -1.0f

    if-eqz p3, :cond_4

    if-gez p3, :cond_2

    mul-int/lit8 p3, p3, -0x1

    move v0, v1

    :cond_2
    int-to-float p3, p3

    iput p3, v3, Lq/c;->b:F

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object p3, v3, Lq/c;->d:Lq/b;

    invoke-interface {p3, p1, v4}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v3, Lq/c;->d:Lq/b;

    invoke-interface {p1, p2, v5}, Lq/b;->g(Lq/i;F)V

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p3, v3, Lq/c;->d:Lq/b;

    invoke-interface {p3, p1, v5}, Lq/b;->g(Lq/i;F)V

    iget-object p1, v3, Lq/c;->d:Lq/b;

    invoke-interface {p1, p2, v4}, Lq/b;->g(Lq/i;F)V

    :goto_2
    if-eq p4, v2, :cond_5

    invoke-virtual {v3, p0, p4}, Lq/c;->a(Lq/e;I)V

    :cond_5
    invoke-virtual {p0, v3}, Lq/e;->c(Lq/c;)V

    return-void
.end method

.method public final f(Lq/i;Lq/i;II)V
    .locals 3

    invoke-virtual {p0}, Lq/e;->k()Lq/c;

    move-result-object v0

    invoke-virtual {p0}, Lq/e;->l()Lq/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lq/i;->d:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lq/c;->b(Lq/i;Lq/i;Lq/i;I)V

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lq/c;->d:Lq/b;

    invoke-interface {p1, v1}, Lq/b;->h(Lq/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, p4}, Lq/e;->i(I)Lq/i;

    move-result-object p2

    iget-object p3, v0, Lq/c;->d:Lq/b;

    int-to-float p1, p1

    invoke-interface {p3, p2, p1}, Lq/b;->g(Lq/i;F)V

    :cond_0
    invoke-virtual {p0, v0}, Lq/e;->c(Lq/c;)V

    return-void
.end method

.method public final g(Lq/i;Lq/i;II)V
    .locals 3

    invoke-virtual {p0}, Lq/e;->k()Lq/c;

    move-result-object v0

    invoke-virtual {p0}, Lq/e;->l()Lq/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Lq/i;->d:I

    invoke-virtual {v0, p1, p2, v1, p3}, Lq/c;->c(Lq/i;Lq/i;Lq/i;I)V

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Lq/c;->d:Lq/b;

    invoke-interface {p1, v1}, Lq/b;->h(Lq/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, p4}, Lq/e;->i(I)Lq/i;

    move-result-object p2

    iget-object p3, v0, Lq/c;->d:Lq/b;

    int-to-float p1, p1

    invoke-interface {p3, p2, p1}, Lq/b;->g(Lq/i;F)V

    :cond_0
    invoke-virtual {p0, v0}, Lq/e;->c(Lq/c;)V

    return-void
.end method

.method public final h(Lq/c;)V
    .locals 3

    sget-boolean v0, Lq/e;->p:Z

    iget-object v1, p0, Lq/e;->k:Lv0/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq/e;->e:[Lq/c;

    iget v2, p0, Lq/e;->i:I

    aget-object v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v1, v1, Lv0/i;->b:Ljava/lang/Object;

    check-cast v1, LI/b;

    invoke-virtual {v1, v0}, LI/b;->b(Lq/c;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq/e;->e:[Lq/c;

    iget v2, p0, Lq/e;->i:I

    aget-object v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v1, v1, Lv0/i;->c:Ljava/lang/Object;

    check-cast v1, LI/b;

    invoke-virtual {v1, v0}, LI/b;->b(Lq/c;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lq/e;->e:[Lq/c;

    iget v1, p0, Lq/e;->i:I

    aput-object p1, v0, v1

    iget-object v0, p1, Lq/c;->a:Lq/i;

    iput v1, v0, Lq/i;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq/e;->i:I

    invoke-virtual {v0, p1}, Lq/i;->d(Lq/c;)V

    return-void
.end method

.method public final i(I)Lq/i;
    .locals 4

    iget v0, p0, Lq/e;->h:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lq/e;->d:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lq/e;->n()V

    :cond_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lq/e;->a(I)Lq/i;

    move-result-object v0

    iget v1, p0, Lq/e;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq/e;->a:I

    iget v2, p0, Lq/e;->h:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lq/e;->h:I

    iput v1, v0, Lq/i;->b:I

    iput p1, v0, Lq/i;->d:I

    iget-object p1, p0, Lq/e;->k:Lv0/i;

    iget-object p1, p1, Lv0/i;->e:Ljava/lang/Object;

    check-cast p1, [Lq/i;

    aput-object v0, p1, v1

    iget-object p1, p0, Lq/e;->b:Lq/g;

    iget-object v1, p1, Lq/g;->i:Lq/f;

    iput-object v0, v1, Lq/f;->b:Lq/i;

    iget-object v1, v0, Lq/i;->h:[F

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([FF)V

    iget v2, v0, Lq/i;->d:I

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v1, v2

    invoke-virtual {p1, v0}, Lq/g;->i(Lq/i;)V

    return-object v0
.end method

.method public final j(Ljava/lang/Object;)Lq/i;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Lq/e;->h:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iget v3, p0, Lq/e;->d:I

    if-lt v1, v3, :cond_1

    invoke-virtual {p0}, Lq/e;->n()V

    :cond_1
    instance-of v1, p1, Lr/c;

    if-eqz v1, :cond_5

    check-cast p1, Lr/c;

    iget-object v0, p1, Lr/c;->g:Lq/i;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lr/c;->i()V

    iget-object p1, p1, Lr/c;->g:Lq/i;

    move-object v0, p1

    :cond_2
    iget p1, v0, Lq/i;->b:I

    iget-object v1, p0, Lq/e;->k:Lv0/i;

    const/4 v3, -0x1

    if-eq p1, v3, :cond_3

    iget v4, p0, Lq/e;->a:I

    if-gt p1, v4, :cond_3

    iget-object v4, v1, Lv0/i;->e:Ljava/lang/Object;

    check-cast v4, [Lq/i;

    aget-object v4, v4, p1

    if-nez v4, :cond_5

    :cond_3
    if-eq p1, v3, :cond_4

    invoke-virtual {v0}, Lq/i;->c()V

    :cond_4
    iget p1, p0, Lq/e;->a:I

    add-int/2addr p1, v2

    iput p1, p0, Lq/e;->a:I

    iget v3, p0, Lq/e;->h:I

    add-int/2addr v3, v2

    iput v3, p0, Lq/e;->h:I

    iput p1, v0, Lq/i;->b:I

    iput v2, v0, Lq/i;->l:I

    iget-object v1, v1, Lv0/i;->e:Ljava/lang/Object;

    check-cast v1, [Lq/i;

    aput-object v0, v1, p1

    :cond_5
    return-object v0
.end method

.method public final k()Lq/c;
    .locals 5

    sget-boolean v0, Lq/e;->p:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lq/e;->k:Lv0/i;

    if-eqz v0, :cond_1

    iget-object v0, v4, Lv0/i;->b:Ljava/lang/Object;

    check-cast v0, LI/b;

    invoke-virtual {v0}, LI/b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/c;

    if-nez v0, :cond_0

    new-instance v0, Lq/d;

    invoke-direct {v0, v4}, Lq/d;-><init>(Lv0/i;)V

    goto :goto_0

    :cond_0
    iput-object v3, v0, Lq/c;->a:Lq/i;

    iget-object v3, v0, Lq/c;->d:Lq/b;

    invoke-interface {v3}, Lq/b;->clear()V

    iput v2, v0, Lq/c;->b:F

    iput-boolean v1, v0, Lq/c;->e:Z

    goto :goto_0

    :cond_1
    iget-object v0, v4, Lv0/i;->c:Ljava/lang/Object;

    check-cast v0, LI/b;

    invoke-virtual {v0}, LI/b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/c;

    if-nez v0, :cond_2

    new-instance v0, Lq/c;

    invoke-direct {v0, v4}, Lq/c;-><init>(Lv0/i;)V

    goto :goto_0

    :cond_2
    iput-object v3, v0, Lq/c;->a:Lq/i;

    iget-object v3, v0, Lq/c;->d:Lq/b;

    invoke-interface {v3}, Lq/b;->clear()V

    iput v2, v0, Lq/c;->b:F

    iput-boolean v1, v0, Lq/c;->e:Z

    :goto_0
    return-object v0
.end method

.method public final l()Lq/i;
    .locals 3

    iget v0, p0, Lq/e;->h:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lq/e;->d:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lq/e;->n()V

    :cond_0
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lq/e;->a(I)Lq/i;

    move-result-object v0

    iget v1, p0, Lq/e;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lq/e;->a:I

    iget v2, p0, Lq/e;->h:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lq/e;->h:I

    iput v1, v0, Lq/i;->b:I

    iget-object v2, p0, Lq/e;->k:Lv0/i;

    iget-object v2, v2, Lv0/i;->e:Ljava/lang/Object;

    check-cast v2, [Lq/i;

    aput-object v0, v2, v1

    return-object v0
.end method

.method public final n()V
    .locals 3

    iget v0, p0, Lq/e;->c:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lq/e;->c:I

    iget-object v1, p0, Lq/e;->e:[Lq/c;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq/c;

    iput-object v0, p0, Lq/e;->e:[Lq/c;

    iget-object v0, p0, Lq/e;->k:Lv0/i;

    iget-object v1, v0, Lv0/i;->e:Ljava/lang/Object;

    check-cast v1, [Lq/i;

    iget v2, p0, Lq/e;->c:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lq/i;

    iput-object v1, v0, Lv0/i;->e:Ljava/lang/Object;

    iget v0, p0, Lq/e;->c:I

    new-array v1, v0, [Z

    iput-object v1, p0, Lq/e;->g:[Z

    iput v0, p0, Lq/e;->d:I

    iput v0, p0, Lq/e;->j:I

    return-void
.end method

.method public final o(Lq/g;)V
    .locals 18

    move-object/from16 v0, p0

    const/4 v2, 0x0

    :goto_0
    iget v3, v0, Lq/e;->i:I

    if-ge v2, v3, :cond_d

    iget-object v3, v0, Lq/e;->e:[Lq/c;

    aget-object v3, v3, v2

    iget-object v4, v3, Lq/c;->a:Lq/i;

    iget v4, v4, Lq/i;->l:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    goto/16 :goto_8

    :cond_0
    iget v3, v3, Lq/c;->b:F

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-gez v3, :cond_c

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-nez v2, :cond_d

    add-int/2addr v3, v5

    const/4 v6, -0x1

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    move v9, v6

    move v10, v9

    const/4 v8, 0x0

    const/4 v11, 0x0

    :goto_2
    iget v12, v0, Lq/e;->i:I

    iget-object v13, v0, Lq/e;->k:Lv0/i;

    if-ge v8, v12, :cond_9

    iget-object v12, v0, Lq/e;->e:[Lq/c;

    aget-object v12, v12, v8

    iget-object v14, v12, Lq/c;->a:Lq/i;

    iget v14, v14, Lq/i;->l:I

    if-ne v14, v5, :cond_1

    goto :goto_6

    :cond_1
    iget-boolean v14, v12, Lq/c;->e:Z

    if-eqz v14, :cond_2

    goto :goto_6

    :cond_2
    iget v14, v12, Lq/c;->b:F

    cmpg-float v14, v14, v4

    if-gez v14, :cond_8

    move v14, v5

    :goto_3
    iget v15, v0, Lq/e;->h:I

    if-ge v14, v15, :cond_8

    iget-object v15, v13, Lv0/i;->e:Ljava/lang/Object;

    check-cast v15, [Lq/i;

    aget-object v15, v15, v14

    iget-object v1, v12, Lq/c;->d:Lq/b;

    invoke-interface {v1, v15}, Lq/b;->h(Lq/i;)F

    move-result v1

    cmpg-float v16, v1, v4

    if-gtz v16, :cond_3

    goto :goto_5

    :cond_3
    const/4 v4, 0x0

    :goto_4
    const/16 v5, 0x9

    if-ge v4, v5, :cond_7

    iget-object v5, v15, Lq/i;->g:[F

    aget v5, v5, v4

    div-float/2addr v5, v1

    cmpg-float v17, v5, v7

    if-gez v17, :cond_4

    if-eq v4, v11, :cond_5

    :cond_4
    if-le v4, v11, :cond_6

    :cond_5
    move v11, v4

    move v7, v5

    move v9, v8

    move v10, v14

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    goto :goto_3

    :cond_8
    :goto_6
    add-int/lit8 v8, v8, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    goto :goto_2

    :cond_9
    if-eq v9, v6, :cond_a

    iget-object v1, v0, Lq/e;->e:[Lq/c;

    aget-object v1, v1, v9

    iget-object v4, v1, Lq/c;->a:Lq/i;

    iput v6, v4, Lq/i;->c:I

    iget-object v4, v13, Lv0/i;->e:Ljava/lang/Object;

    check-cast v4, [Lq/i;

    aget-object v4, v4, v10

    invoke-virtual {v1, v4}, Lq/c;->f(Lq/i;)V

    iget-object v4, v1, Lq/c;->a:Lq/i;

    iput v9, v4, Lq/i;->c:I

    invoke-virtual {v4, v1}, Lq/i;->d(Lq/c;)V

    goto :goto_7

    :cond_a
    const/4 v2, 0x1

    :goto_7
    iget v1, v0, Lq/e;->h:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_b

    const/4 v2, 0x1

    :cond_b
    const/4 v4, 0x0

    const/4 v5, 0x1

    goto/16 :goto_1

    :cond_c
    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_d
    invoke-virtual/range {p0 .. p1}, Lq/e;->p(Lq/c;)V

    const/4 v1, 0x0

    :goto_9
    iget v2, v0, Lq/e;->i:I

    if-ge v1, v2, :cond_e

    iget-object v2, v0, Lq/e;->e:[Lq/c;

    aget-object v2, v2, v1

    iget-object v3, v2, Lq/c;->a:Lq/i;

    iget v2, v2, Lq/c;->b:F

    iput v2, v3, Lq/i;->e:F

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_e
    return-void
.end method

.method public final p(Lq/c;)V
    .locals 12

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lq/e;->h:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lq/e;->g:[Z

    aput-boolean v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    move v2, v1

    :cond_1
    :goto_1
    if-nez v1, :cond_b

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iget v4, p0, Lq/e;->h:I

    mul-int/lit8 v4, v4, 0x2

    if-lt v2, v4, :cond_2

    return-void

    :cond_2
    iget-object v4, p1, Lq/c;->a:Lq/i;

    if-eqz v4, :cond_3

    iget-object v5, p0, Lq/e;->g:[Z

    iget v4, v4, Lq/i;->b:I

    aput-boolean v3, v5, v4

    :cond_3
    iget-object v4, p0, Lq/e;->g:[Z

    invoke-virtual {p1, v4}, Lq/c;->d([Z)Lq/i;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v5, p0, Lq/e;->g:[Z

    iget v6, v4, Lq/i;->b:I

    aget-boolean v7, v5, v6

    if-eqz v7, :cond_4

    return-void

    :cond_4
    aput-boolean v3, v5, v6

    :cond_5
    if-eqz v4, :cond_a

    const/4 v5, -0x1

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    move v7, v0

    move v8, v5

    :goto_2
    iget v9, p0, Lq/e;->i:I

    if-ge v7, v9, :cond_9

    iget-object v9, p0, Lq/e;->e:[Lq/c;

    aget-object v9, v9, v7

    iget-object v10, v9, Lq/c;->a:Lq/i;

    iget v10, v10, Lq/i;->l:I

    if-ne v10, v3, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v10, v9, Lq/c;->e:Z

    if-eqz v10, :cond_7

    goto :goto_3

    :cond_7
    iget-object v10, v9, Lq/c;->d:Lq/b;

    invoke-interface {v10, v4}, Lq/b;->d(Lq/i;)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-object v10, v9, Lq/c;->d:Lq/b;

    invoke-interface {v10, v4}, Lq/b;->h(Lq/i;)F

    move-result v10

    const/4 v11, 0x0

    cmpg-float v11, v10, v11

    if-gez v11, :cond_8

    iget v9, v9, Lq/c;->b:F

    neg-float v9, v9

    div-float/2addr v9, v10

    cmpg-float v10, v9, v6

    if-gez v10, :cond_8

    move v8, v7

    move v6, v9

    :cond_8
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_9
    if-le v8, v5, :cond_1

    iget-object v3, p0, Lq/e;->e:[Lq/c;

    aget-object v3, v3, v8

    iget-object v6, v3, Lq/c;->a:Lq/i;

    iput v5, v6, Lq/i;->c:I

    invoke-virtual {v3, v4}, Lq/c;->f(Lq/i;)V

    iget-object v4, v3, Lq/c;->a:Lq/i;

    iput v8, v4, Lq/i;->c:I

    invoke-virtual {v4, v3}, Lq/i;->d(Lq/c;)V

    goto :goto_1

    :cond_a
    move v1, v3

    goto :goto_1

    :cond_b
    return-void
.end method

.method public final q()V
    .locals 5

    sget-boolean v0, Lq/e;->p:Z

    const/4 v1, 0x0

    iget-object v2, p0, Lq/e;->k:Lv0/i;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    :goto_0
    iget-object v0, p0, Lq/e;->e:[Lq/c;

    array-length v4, v0

    if-ge v3, v4, :cond_3

    aget-object v0, v0, v3

    if-eqz v0, :cond_0

    iget-object v4, v2, Lv0/i;->b:Ljava/lang/Object;

    check-cast v4, LI/b;

    invoke-virtual {v4, v0}, LI/b;->b(Lq/c;)V

    :cond_0
    iget-object v0, p0, Lq/e;->e:[Lq/c;

    aput-object v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lq/e;->e:[Lq/c;

    array-length v4, v0

    if-ge v3, v4, :cond_3

    aget-object v0, v0, v3

    if-eqz v0, :cond_2

    iget-object v4, v2, Lv0/i;->c:Ljava/lang/Object;

    check-cast v4, LI/b;

    invoke-virtual {v4, v0}, LI/b;->b(Lq/c;)V

    :cond_2
    iget-object v0, p0, Lq/e;->e:[Lq/c;

    aput-object v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final r()V
    .locals 10

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lq/e;->k:Lv0/i;

    iget-object v3, v2, Lv0/i;->e:Ljava/lang/Object;

    check-cast v3, [Lq/i;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lq/i;->c()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v2, Lv0/i;->d:Ljava/lang/Object;

    check-cast v1, LI/b;

    iget-object v3, p0, Lq/e;->l:[Lq/i;

    iget v4, p0, Lq/e;->m:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v5, v3

    if-le v4, v5, :cond_2

    array-length v4, v3

    :cond_2
    move v5, v0

    :goto_1
    if-ge v5, v4, :cond_4

    aget-object v6, v3, v5

    iget v7, v1, LI/b;->c:I

    iget-object v8, v1, LI/b;->b:[Ljava/lang/Object;

    array-length v9, v8

    if-ge v7, v9, :cond_3

    aput-object v6, v8, v7

    add-int/lit8 v7, v7, 0x1

    iput v7, v1, LI/b;->c:I

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    iput v0, p0, Lq/e;->m:I

    iget-object v1, v2, Lv0/i;->e:Ljava/lang/Object;

    check-cast v1, [Lq/i;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iput v0, p0, Lq/e;->a:I

    iget-object v1, p0, Lq/e;->b:Lq/g;

    iput v0, v1, Lq/g;->h:I

    const/4 v3, 0x0

    iput v3, v1, Lq/c;->b:F

    const/4 v1, 0x1

    iput v1, p0, Lq/e;->h:I

    move v1, v0

    :goto_2
    iget v3, p0, Lq/e;->i:I

    if-ge v1, v3, :cond_5

    iget-object v3, p0, Lq/e;->e:[Lq/c;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lq/e;->q()V

    iput v0, p0, Lq/e;->i:I

    sget-boolean v0, Lq/e;->p:Z

    if-eqz v0, :cond_6

    new-instance v0, Lq/d;

    invoke-direct {v0, v2}, Lq/d;-><init>(Lv0/i;)V

    iput-object v0, p0, Lq/e;->n:Lq/c;

    goto :goto_3

    :cond_6
    new-instance v0, Lq/c;

    invoke-direct {v0, v2}, Lq/c;-><init>(Lv0/i;)V

    iput-object v0, p0, Lq/e;->n:Lq/c;

    :goto_3
    return-void
.end method
