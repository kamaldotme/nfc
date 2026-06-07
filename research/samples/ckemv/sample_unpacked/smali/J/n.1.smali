.class public final LJ/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/ViewParent;

.field public b:Landroid/view/ViewParent;

.field public final c:Landroid/view/View;

.field public d:Z

.field public e:[I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ/n;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(FFZ)Z
    .locals 3

    iget-boolean v0, p0, LJ/n;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, LJ/n;->f(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, LJ/n;->c:Landroid/view/View;

    :try_start_0
    invoke-static {v0, v2, p1, p2, p3}, LJ/X;->a(Landroid/view/ViewParent;Landroid/view/View;FFZ)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    :goto_0
    return v1
.end method

.method public final b(FF)Z
    .locals 3

    iget-boolean v0, p0, LJ/n;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, LJ/n;->f(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, LJ/n;->c:Landroid/view/View;

    :try_start_0
    invoke-static {v0, v2, p1, p2}, LJ/X;->b(Landroid/view/ViewParent;Landroid/view/View;FF)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    :goto_0
    return v1
.end method

.method public final c(II[I[II)Z
    .locals 14

    move-object v0, p0

    move v3, p1

    move/from16 v4, p2

    move-object/from16 v7, p4

    move/from16 v6, p5

    iget-boolean v1, v0, LJ/n;->d:Z

    const/4 v8, 0x0

    if-eqz v1, :cond_a

    invoke-virtual {p0, v6}, LJ/n;->f(I)Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_0

    return v8

    :cond_0
    const/4 v9, 0x1

    if-nez v3, :cond_2

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v7, :cond_a

    aput v8, v7, v8

    aput v8, v7, v9

    goto/16 :goto_4

    :cond_2
    :goto_0
    iget-object v10, v0, LJ/n;->c:Landroid/view/View;

    if-eqz v7, :cond_3

    invoke-virtual {v10, v7}, Landroid/view/View;->getLocationInWindow([I)V

    aget v2, v7, v8

    aget v5, v7, v9

    move v11, v2

    move v12, v5

    goto :goto_1

    :cond_3
    move v11, v8

    move v12, v11

    :goto_1
    if-nez p3, :cond_5

    iget-object v2, v0, LJ/n;->e:[I

    if-nez v2, :cond_4

    const/4 v2, 0x2

    new-array v2, v2, [I

    iput-object v2, v0, LJ/n;->e:[I

    :cond_4
    iget-object v2, v0, LJ/n;->e:[I

    move-object v13, v2

    goto :goto_2

    :cond_5
    move-object/from16 v13, p3

    :goto_2
    aput v8, v13, v8

    aput v8, v13, v9

    instance-of v2, v1, LJ/o;

    iget-object v5, v0, LJ/n;->c:Landroid/view/View;

    if-eqz v2, :cond_6

    check-cast v1, LJ/o;

    move-object v2, v5

    move v3, p1

    move/from16 v4, p2

    move-object v5, v13

    move/from16 v6, p5

    invoke-interface/range {v1 .. v6}, LJ/o;->e(Landroid/view/View;II[II)V

    goto :goto_3

    :cond_6
    if-nez v6, :cond_7

    :try_start_0
    invoke-static {v1, v5, p1, v4, v13}, LJ/X;->c(Landroid/view/ViewParent;Landroid/view/View;II[I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_7
    :goto_3
    if-eqz v7, :cond_8

    invoke-virtual {v10, v7}, Landroid/view/View;->getLocationInWindow([I)V

    aget v1, v7, v8

    sub-int/2addr v1, v11

    aput v1, v7, v8

    aget v1, v7, v9

    sub-int/2addr v1, v12

    aput v1, v7, v9

    :cond_8
    aget v1, v13, v8

    if-nez v1, :cond_9

    aget v1, v13, v9

    if-eqz v1, :cond_a

    :cond_9
    move v8, v9

    :cond_a
    :goto_4
    return v8
.end method

.method public final d(III[I)V
    .locals 8

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    move v6, p3

    move-object v7, p4

    invoke-virtual/range {v0 .. v7}, LJ/n;->e(IIII[II[I)Z

    return-void
.end method

.method public final e(IIII[II[I)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v9, p5

    move/from16 v7, p6

    iget-boolean v1, v0, LJ/n;->d:Z

    const/4 v10, 0x0

    if-eqz v1, :cond_a

    invoke-virtual {v0, v7}, LJ/n;->f(I)Landroid/view/ViewParent;

    move-result-object v8

    if-nez v8, :cond_0

    return v10

    :cond_0
    const/4 v11, 0x1

    if-nez p1, :cond_2

    if-nez p2, :cond_2

    if-nez p3, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v9, :cond_a

    aput v10, v9, v10

    aput v10, v9, v11

    goto/16 :goto_4

    :cond_2
    :goto_0
    iget-object v12, v0, LJ/n;->c:Landroid/view/View;

    if-eqz v9, :cond_3

    invoke-virtual {v12, v9}, Landroid/view/View;->getLocationInWindow([I)V

    aget v1, v9, v10

    aget v2, v9, v11

    move v13, v1

    move v14, v2

    goto :goto_1

    :cond_3
    move v13, v10

    move v14, v13

    :goto_1
    if-nez p7, :cond_5

    iget-object v1, v0, LJ/n;->e:[I

    if-nez v1, :cond_4

    const/4 v1, 0x2

    new-array v1, v1, [I

    iput-object v1, v0, LJ/n;->e:[I

    :cond_4
    iget-object v1, v0, LJ/n;->e:[I

    aput v10, v1, v10

    aput v10, v1, v11

    move-object v15, v1

    goto :goto_2

    :cond_5
    move-object/from16 v15, p7

    :goto_2
    instance-of v1, v8, LJ/p;

    iget-object v2, v0, LJ/n;->c:Landroid/view/View;

    if-eqz v1, :cond_6

    move-object v1, v8

    check-cast v1, LJ/p;

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p6

    move-object v8, v15

    invoke-interface/range {v1 .. v8}, LJ/p;->b(Landroid/view/View;IIIII[I)V

    goto :goto_3

    :cond_6
    aget v1, v15, v10

    add-int v1, v1, p3

    aput v1, v15, v10

    aget v1, v15, v11

    add-int v1, v1, p4

    aput v1, v15, v11

    instance-of v1, v8, LJ/o;

    if-eqz v1, :cond_7

    move-object v1, v8

    check-cast v1, LJ/o;

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p6

    invoke-interface/range {v1 .. v7}, LJ/o;->c(Landroid/view/View;IIIII)V

    goto :goto_3

    :cond_7
    if-nez v7, :cond_8

    move-object v1, v8

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    :try_start_0
    invoke-static/range {v1 .. v6}, LJ/X;->d(Landroid/view/ViewParent;Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    invoke-static {v8}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_8
    :goto_3
    if-eqz v9, :cond_9

    invoke-virtual {v12, v9}, Landroid/view/View;->getLocationInWindow([I)V

    aget v1, v9, v10

    sub-int/2addr v1, v13

    aput v1, v9, v10

    aget v1, v9, v11

    sub-int/2addr v1, v14

    aput v1, v9, v11

    :cond_9
    return v11

    :cond_a
    :goto_4
    return v10
.end method

.method public final f(I)Landroid/view/ViewParent;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, LJ/n;->b:Landroid/view/ViewParent;

    return-object p1

    :cond_1
    iget-object p1, p0, LJ/n;->a:Landroid/view/ViewParent;

    return-object p1
.end method

.method public final g(I)Z
    .locals 0

    invoke-virtual {p0, p1}, LJ/n;->f(I)Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final h(II)Z
    .locals 6

    invoke-virtual {p0, p2}, LJ/n;->g(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, LJ/n;->d:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, LJ/n;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    move-object v3, v0

    :goto_0
    if-eqz v2, :cond_8

    instance-of v4, v2, LJ/o;

    if-eqz v4, :cond_1

    move-object v5, v2

    check-cast v5, LJ/o;

    invoke-interface {v5, v3, v0, p1, p2}, LJ/o;->f(Landroid/view/View;Landroid/view/View;II)Z

    move-result v5

    goto :goto_1

    :cond_1
    if-nez p2, :cond_6

    :try_start_0
    invoke-static {v2, v3, v0, p1}, LJ/X;->f(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_1

    :goto_1
    if-eqz v5, :cond_6

    if-eqz p2, :cond_3

    if-eq p2, v1, :cond_2

    goto :goto_2

    :cond_2
    iput-object v2, p0, LJ/n;->b:Landroid/view/ViewParent;

    goto :goto_2

    :cond_3
    iput-object v2, p0, LJ/n;->a:Landroid/view/ViewParent;

    :goto_2
    if-eqz v4, :cond_4

    check-cast v2, LJ/o;

    invoke-interface {v2, v3, v0, p1, p2}, LJ/o;->a(Landroid/view/View;Landroid/view/View;II)V

    goto :goto_3

    :cond_4
    if-nez p2, :cond_5

    :try_start_1
    invoke-static {v2, v3, v0, p1}, LJ/X;->e(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)V
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    :goto_3
    return v1

    :catch_1
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_6
    instance-of v4, v2, Landroid/view/View;

    if-eqz v4, :cond_7

    move-object v3, v2

    check-cast v3, Landroid/view/View;

    :cond_7
    invoke-interface {v2}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    goto :goto_0

    :cond_8
    const/4 p1, 0x0

    return p1
.end method

.method public final i(I)V
    .locals 3

    invoke-virtual {p0, p1}, LJ/n;->f(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_4

    instance-of v1, v0, LJ/o;

    iget-object v2, p0, LJ/n;->c:Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, LJ/o;

    invoke-interface {v0, v2, p1}, LJ/o;->d(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    :try_start_0
    invoke-static {v0, v2}, LJ/X;->g(Landroid/view/ViewParent;Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    iput-object v0, p0, LJ/n;->b:Landroid/view/ViewParent;

    goto :goto_1

    :cond_3
    iput-object v0, p0, LJ/n;->a:Landroid/view/ViewParent;

    :cond_4
    :goto_1
    return-void
.end method
