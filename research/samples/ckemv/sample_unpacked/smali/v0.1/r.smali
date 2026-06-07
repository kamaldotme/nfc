.class public final Lv0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ/q;


# instance fields
.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A(Lv0/j;)Ln0/m;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public B(IIII)F
    .locals 17

    sub-int v0, p4, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    sub-int v1, p3, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    const/4 v3, 0x1

    if-le v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    move/from16 v4, p1

    move/from16 v1, p2

    move/from16 v6, p3

    move/from16 v5, p4

    goto :goto_1

    :cond_1
    move/from16 v1, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    :goto_1
    sub-int v7, v5, v1

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    sub-int v8, v6, v4

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    neg-int v9, v7

    const/4 v10, 0x2

    div-int/2addr v9, v10

    const/4 v11, -0x1

    if-ge v1, v5, :cond_2

    move v12, v3

    goto :goto_2

    :cond_2
    move v12, v11

    :goto_2
    if-ge v4, v6, :cond_3

    move v11, v3

    :cond_3
    add-int/2addr v5, v12

    move v13, v1

    move v14, v4

    const/4 v15, 0x0

    :goto_3
    if-eq v13, v5, :cond_b

    if-eqz v0, :cond_4

    move v2, v14

    goto :goto_4

    :cond_4
    move v2, v13

    :goto_4
    if-eqz v0, :cond_5

    move v10, v13

    goto :goto_5

    :cond_5
    move v10, v14

    :goto_5
    if-ne v15, v3, :cond_6

    move/from16 v16, v0

    move v0, v3

    move/from16 p2, v5

    move-object/from16 v3, p0

    goto :goto_6

    :cond_6
    move-object/from16 v3, p0

    move/from16 v16, v0

    move/from16 p2, v5

    const/4 v0, 0x0

    :goto_6
    iget-object v5, v3, Lv0/r;->b:Ljava/lang/Object;

    check-cast v5, Lp1/b;

    invoke-virtual {v5, v2, v10}, Lp1/b;->b(II)Z

    move-result v2

    if-ne v0, v2, :cond_8

    const/4 v0, 0x2

    if-ne v15, v0, :cond_7

    invoke-static {v13, v14, v1, v4}, Lv0/f;->t(IIII)F

    move-result v0

    return v0

    :cond_7
    add-int/lit8 v15, v15, 0x1

    :cond_8
    add-int/2addr v9, v8

    if-lez v9, :cond_a

    if-eq v14, v6, :cond_9

    add-int/2addr v14, v11

    sub-int/2addr v9, v7

    goto :goto_7

    :cond_9
    const/4 v0, 0x2

    goto :goto_8

    :cond_a
    :goto_7
    add-int/2addr v13, v12

    move/from16 v5, p2

    move/from16 v0, v16

    const/4 v3, 0x1

    const/4 v10, 0x2

    goto :goto_3

    :cond_b
    move-object/from16 v3, p0

    move/from16 p2, v5

    move v0, v10

    :goto_8
    if-ne v15, v0, :cond_c

    move/from16 v5, p2

    invoke-static {v5, v6, v1, v4}, Lv0/f;->t(IIII)F

    move-result v0

    return v0

    :cond_c
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0
.end method

.method public C(IIII)F
    .locals 7

    invoke-virtual {p0, p1, p2, p3, p4}, Lv0/r;->B(IIII)F

    move-result v0

    sub-int/2addr p3, p1

    sub-int p3, p1, p3

    iget-object v1, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v1, Lp1/b;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    if-gez p3, :cond_0

    int-to-float v4, p1

    sub-int p3, p1, p3

    int-to-float p3, p3

    div-float/2addr v4, p3

    move p3, v2

    goto :goto_0

    :cond_0
    iget v4, v1, Lp1/b;->b:I

    if-lt p3, v4, :cond_1

    add-int/lit8 v5, v4, -0x1

    sub-int/2addr v5, p1

    int-to-float v5, v5

    sub-int/2addr p3, p1

    int-to-float p3, p3

    div-float p3, v5, p3

    add-int/lit8 v4, v4, -0x1

    move v6, v4

    move v4, p3

    move p3, v6

    goto :goto_0

    :cond_1
    move v4, v3

    :goto_0
    int-to-float v5, p2

    sub-int/2addr p4, p2

    int-to-float p4, p4

    mul-float/2addr p4, v4

    sub-float p4, v5, p4

    float-to-int p4, p4

    if-gez p4, :cond_2

    sub-int p4, p2, p4

    int-to-float p4, p4

    div-float/2addr v5, p4

    goto :goto_1

    :cond_2
    iget v1, v1, Lp1/b;->c:I

    if-lt p4, v1, :cond_3

    add-int/lit8 v2, v1, -0x1

    sub-int/2addr v2, p2

    int-to-float v2, v2

    sub-int/2addr p4, p2

    int-to-float p4, p4

    div-float v5, v2, p4

    add-int/lit8 v2, v1, -0x1

    goto :goto_1

    :cond_3
    move v2, p4

    move v5, v3

    :goto_1
    int-to-float p4, p1

    sub-int/2addr p3, p1

    int-to-float p3, p3

    mul-float/2addr p3, v5

    add-float/2addr p3, p4

    float-to-int p3, p3

    invoke-virtual {p0, p1, p2, p3, v2}, Lv0/r;->B(IIII)F

    move-result p1

    add-float/2addr p1, v0

    sub-float/2addr p1, v3

    return p1
.end method

.method public D(Lv0/j;)Ln0/m;
    .locals 3

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ln0/m;

    invoke-direct {v2, p1}, Ln0/m;-><init>(Lv0/j;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v2, Ln0/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public a(LH1/c;LH1/c;)F
    .locals 4

    iget v0, p1, Lj1/n;->a:F

    float-to-int v0, v0

    iget v1, p1, Lj1/n;->b:F

    float-to-int v1, v1

    iget v2, p2, Lj1/n;->a:F

    float-to-int v2, v2

    iget v3, p2, Lj1/n;->b:F

    float-to-int v3, v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lv0/r;->C(IIII)F

    move-result v0

    iget p2, p2, Lj1/n;->a:F

    float-to-int p2, p2

    iget p1, p1, Lj1/n;->a:F

    float-to-int p1, p1

    invoke-virtual {p0, p2, v3, p1, v1}, Lv0/r;->C(IIII)F

    move-result p1

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    const/high16 v1, 0x40e00000    # 7.0f

    if-eqz p2, :cond_0

    div-float/2addr p1, v1

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-eqz p2, :cond_1

    div-float/2addr v0, v1

    return v0

    :cond_1
    add-float/2addr v0, p1

    const/high16 p1, 0x41600000    # 14.0f

    div-float/2addr v0, p1

    return v0
.end method

.method public b(Lv0/j;)Z
    .locals 2

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public c(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->c(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public d(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v1, v0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v1, v1, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->d(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public e(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->e(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public f(Landroid/view/View;LJ/y0;)LJ/y0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v3, LO0/n;

    iget v4, v3, LO0/n;->a:I

    iget-object v5, v0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v5, LA1/h;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v2, LJ/y0;->a:LJ/w0;

    const/4 v7, 0x7

    invoke-virtual {v6, v7}, LJ/w0;->f(I)LA/d;

    move-result-object v7

    const/16 v8, 0x20

    invoke-virtual {v6, v8}, LJ/w0;->f(I)LA/d;

    move-result-object v6

    iget v8, v7, LA/d;->b:I

    iget-object v9, v5, LA1/h;->b:Ljava/lang/Object;

    check-cast v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput v8, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    invoke-static/range {p1 .. p1}, LO0/k;->e(Landroid/view/View;)Z

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingRight()I

    move-result v12

    iget-boolean v13, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    if-eqz v13, :cond_0

    invoke-virtual/range {p2 .. p2}, LJ/y0;->a()I

    move-result v10

    iput v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I

    iget v14, v3, LO0/n;->c:I

    add-int/2addr v10, v14

    :cond_0
    iget v3, v3, LO0/n;->b:I

    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    iget v15, v7, LA/d;->a:I

    if-eqz v14, :cond_2

    if-eqz v8, :cond_1

    move v11, v3

    goto :goto_0

    :cond_1
    move v11, v4

    :goto_0
    add-int/2addr v11, v15

    :cond_2
    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    iget v0, v7, LA/d;->c:I

    if-eqz v14, :cond_4

    if-eqz v8, :cond_3

    goto :goto_1

    :cond_3
    move v4, v3

    :goto_1
    add-int v12, v4, v0

    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-boolean v4, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    const/4 v8, 0x1

    if-eqz v4, :cond_5

    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-eq v4, v15, :cond_5

    iput v15, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move v4, v8

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    :goto_2
    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    if-eqz v14, :cond_6

    iget v14, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v14, v0, :cond_6

    iput v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_3

    :cond_6
    move v8, v4

    :goto_3
    iget-boolean v0, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    if-eqz v0, :cond_7

    iget v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v7, LA/d;->b:I

    if-eq v0, v4, :cond_7

    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_4

    :cond_7
    if-eqz v8, :cond_8

    :goto_4
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {v1, v11, v0, v12, v10}, Landroid/view/View;->setPadding(IIII)V

    iget-boolean v0, v5, LA1/h;->a:Z

    if-eqz v0, :cond_9

    iget v1, v6, LA/d;->d:I

    iput v1, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    :cond_9
    if-nez v13, :cond_a

    if-eqz v0, :cond_b

    :cond_a
    invoke-virtual {v9}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I()V

    :cond_b
    return-object v2
.end method

.method public g(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->g(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public h(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->h(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public i(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->i(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public j(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v1, v0, Landroidx/fragment/app/B;->n:Landroidx/fragment/app/q;

    iget-object v1, v1, Landroidx/fragment/app/q;->e:Landroid/content/Context;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->j(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public k(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->k(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public l(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->l(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public m(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->m(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public n(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->n(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public o(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->o(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public p(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->p(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public q(Z)V
    .locals 2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/B;

    iget-object v0, v0, Landroidx/fragment/app/B;->p:Landroidx/fragment/app/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/n;->j()Landroidx/fragment/app/B;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v0, v0, Landroidx/fragment/app/B;->k:Lv0/r;

    invoke-virtual {v0, v1}, Lv0/r;->q(Z)V

    :cond_0
    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LX/d;->q(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public r(I)V
    .locals 4

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    new-array p1, p1, [I

    iput-object p1, p0, Lv0/r;->b:Ljava/lang/Object;

    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([II)V

    goto :goto_1

    :cond_0
    array-length v2, v0

    if-lt p1, v2, :cond_2

    array-length v2, v0

    :goto_0
    if-gt v2, p1, :cond_1

    mul-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_1
    new-array p1, v2, [I

    iput-object p1, p0, Lv0/r;->b:Ljava/lang/Object;

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast p1, [I

    array-length v0, v0

    array-length v2, p1

    invoke-static {p1, v0, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    :cond_2
    :goto_1
    return-void
.end method

.method public s(FIIF)LH1/a;
    .locals 11

    mul-float/2addr p4, p1

    float-to-int p4, p4

    sub-int v0, p2, p4

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Lp1/b;

    iget v2, v0, Lp1/b;->b:I

    const/4 v10, 0x1

    sub-int/2addr v2, v10

    add-int/2addr p2, p4

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int v6, p2, v4

    int-to-float p2, v6

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v2, p1

    cmpg-float p2, p2, v2

    if-ltz p2, :cond_c

    sub-int p2, p3, p4

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget p2, v0, Lp1/b;->c:I

    sub-int/2addr p2, v10

    add-int/2addr p3, p4

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int v7, p2, v5

    int-to-float p2, v7

    cmpg-float p2, p2, v2

    if-ltz p2, :cond_b

    new-instance p2, LH1/b;

    iget-object p3, p0, Lv0/r;->b:Ljava/lang/Object;

    move-object v3, p3

    check-cast v3, Lp1/b;

    iget-object p3, p0, Lv0/r;->c:Ljava/lang/Object;

    move-object v9, p3

    check-cast v9, Lj1/o;

    move-object v2, p2

    move v8, p1

    invoke-direct/range {v2 .. v9}, LH1/b;-><init>(Lp1/b;IIIIFLj1/o;)V

    iget p1, p2, LH1/b;->e:I

    iget p3, p2, LH1/b;->c:I

    add-int/2addr p1, p3

    iget p4, p2, LH1/b;->f:I

    div-int/lit8 v0, p4, 0x2

    iget v2, p2, LH1/b;->d:I

    add-int/2addr v0, v2

    const/4 v2, 0x3

    new-array v2, v2, [I

    move v3, v1

    :goto_0
    if-ge v3, p4, :cond_9

    and-int/lit8 v4, v3, 0x1

    const/4 v5, 0x2

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    div-int/2addr v4, v5

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v3, 0x1

    div-int/2addr v4, v5

    neg-int v4, v4

    :goto_1
    add-int/2addr v4, v0

    aput v1, v2, v1

    aput v1, v2, v10

    aput v1, v2, v5

    move v6, p3

    :goto_2
    iget-object v7, p2, LH1/b;->a:Lp1/b;

    if-ge v6, p1, :cond_1

    invoke-virtual {v7, v6, v4}, Lp1/b;->b(II)Z

    move-result v8

    if-nez v8, :cond_1

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    move v8, v1

    :goto_3
    if-ge v6, p1, :cond_7

    invoke-virtual {v7, v6, v4}, Lp1/b;->b(II)Z

    move-result v9

    if-eqz v9, :cond_5

    if-ne v8, v10, :cond_2

    aget v9, v2, v10

    add-int/2addr v9, v10

    aput v9, v2, v10

    goto :goto_4

    :cond_2
    if-ne v8, v5, :cond_4

    invoke-virtual {p2, v2}, LH1/b;->a([I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {p2, v4, v6, v2}, LH1/b;->b(II[I)LH1/a;

    move-result-object v8

    if-eqz v8, :cond_3

    goto :goto_5

    :cond_3
    aget v8, v2, v5

    aput v8, v2, v1

    aput v10, v2, v10

    aput v1, v2, v5

    move v8, v10

    goto :goto_4

    :cond_4
    add-int/lit8 v8, v8, 0x1

    aget v9, v2, v8

    add-int/2addr v9, v10

    aput v9, v2, v8

    goto :goto_4

    :cond_5
    if-ne v8, v10, :cond_6

    add-int/lit8 v8, v8, 0x1

    :cond_6
    aget v9, v2, v8

    add-int/2addr v9, v10

    aput v9, v2, v8

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {p2, v2}, LH1/b;->a([I)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {p2, v4, p1, v2}, LH1/b;->b(II[I)LH1/a;

    move-result-object v8

    if-eqz v8, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_9
    iget-object p1, p2, LH1/b;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_a

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, LH1/a;

    :goto_5
    return-object v8

    :cond_a
    sget-object p1, Lj1/h;->d:Lj1/h;

    throw p1

    :cond_b
    sget-object p1, Lj1/h;->d:Lj1/h;

    throw p1

    :cond_c
    sget-object p1, Lj1/h;->d:Lj1/h;

    throw p1
.end method

.method public t(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    const-string v0, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, La0/j;->g(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, v1}, La0/j;->h(Ljava/lang/String;I)V

    :goto_0
    iget-object p1, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->b()V

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v3, v1

    goto :goto_2

    :cond_1
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    return-object v2

    :goto_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    throw v1
.end method

.method public u(Ljava/lang/String;Ljava/util/Set;)V
    .locals 3

    const-string v0, "tags"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lv0/q;

    invoke-direct {v1, v0, p1}, Lv0/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->b()V

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    iget-object v2, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v2, Lv0/b;

    invoke-virtual {v2, v1}, Lv0/b;->t(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    throw p1

    :cond_0
    return-void
.end method

.method public v(I)I
    .locals 5

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    array-length v0, v0

    if-lt p1, v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_3

    :cond_2
    move v0, v1

    goto :goto_4

    :cond_3
    const/4 v2, 0x0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_6

    iget-object v3, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZ/c0;

    iget v4, v3, LZ/c0;->b:I

    if-ne v4, p1, :cond_5

    move-object v2, v3

    goto :goto_1

    :cond_5
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_6
    :goto_1
    if-eqz v2, :cond_7

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_7
    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v0, :cond_9

    iget-object v3, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZ/c0;

    iget v3, v3, LZ/c0;->b:I

    if-lt v3, p1, :cond_8

    goto :goto_3

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    move v2, v1

    :goto_3
    if-eq v2, v1, :cond_2

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ/c0;

    iget-object v3, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget v0, v0, LZ/c0;->b:I

    :goto_4
    if-ne v0, v1, :cond_a

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, [I

    array-length v2, v0

    invoke-static {v0, p1, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    iget-object p1, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast p1, [I

    array-length p1, p1

    return p1

    :cond_a
    iget-object v2, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v2, [I

    add-int/lit8 v0, v0, 0x1

    invoke-static {v2, p1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    return v0
.end method

.method public w(II)V
    .locals 3

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_3

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, Lv0/r;->r(I)V

    iget-object v1, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v1, [I

    const/4 v2, -0x1

    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v0, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v1, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ/c0;

    iget v2, v1, LZ/c0;->b:I

    if-ge v2, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v2, p2

    iput v2, v1, LZ/c0;->b:I

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public x(II)V
    .locals 5

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_4

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, Lv0/r;->r(I)V

    iget-object v1, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lv0/r;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p2

    array-length v3, v1

    const/4 v4, -0x1

    invoke-static {v1, v2, v3, v4}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v1, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_4

    iget-object v2, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZ/c0;

    iget v3, v2, LZ/c0;->b:I

    if-ge v3, p1, :cond_2

    goto :goto_1

    :cond_2
    if-ge v3, v0, :cond_3

    iget-object v2, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    sub-int/2addr v3, p2

    iput v3, v2, LZ/c0;->b:I

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public y(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 12

    new-instance v0, Lt/k;

    invoke-direct {v0}, Lt/k;-><init>()V

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_f

    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "id"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v6, -0x1

    if-eqz v3, :cond_0

    const/16 v3, 0x2f

    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v3, v5, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    goto :goto_1

    :cond_0
    move v3, v6

    :goto_1
    if-ne v3, v6, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-le v5, v4, :cond_1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    :cond_1
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x0

    move-object v7, v5

    :goto_2
    if-eq v1, v4, :cond_d

    if-eqz v1, :cond_b

    const-string v8, "Constraint"

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-eq v1, v10, :cond_4

    if-eq v1, v9, :cond_2

    goto/16 :goto_5

    :cond_2
    :try_start_1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v9, "ConstraintSet"

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto/16 :goto_8

    :cond_3
    invoke-virtual {v1, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, v0, Lt/k;->c:Ljava/util/HashMap;

    iget v8, v7, Lt/f;->a:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v7, v5

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :catch_1
    move-exception p1

    goto/16 :goto_7

    :cond_4
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v9, v2

    goto :goto_4

    :sswitch_1
    const-string v8, "CustomAttribute"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v9, 0x7

    goto :goto_4

    :sswitch_2
    const-string v8, "Barrier"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v9, v10

    goto :goto_4

    :sswitch_3
    const-string v8, "Guideline"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v9, v4

    goto :goto_4

    :sswitch_4
    const-string v8, "Transform"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v9, 0x4

    goto :goto_4

    :sswitch_5
    const-string v8, "PropertySet"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_4

    :sswitch_6
    const-string v8, "Motion"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v9, 0x6

    goto :goto_4

    :sswitch_7
    const-string v8, "Layout"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v1, :cond_5

    const/4 v9, 0x5

    goto :goto_4

    :cond_5
    :goto_3
    move v9, v6

    :goto_4
    const-string v1, "XML parser error must be within a Constraint "

    packed-switch v9, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    if-eqz v7, :cond_6

    :try_start_2
    iget-object v1, v7, Lt/f;->f:Ljava/util/HashMap;

    invoke-static {p1, p2, v1}, Lt/a;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Ljava/util/HashMap;)V

    goto/16 :goto_5

    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    if-eqz v7, :cond_7

    iget-object v1, v7, Lt/f;->c:Lt/h;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    invoke-virtual {v1, p1, v8}, Lt/h;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_5

    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    if-eqz v7, :cond_8

    iget-object v1, v7, Lt/f;->d:Lt/g;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    invoke-virtual {v1, p1, v8}, Lt/g;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_5

    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    if-eqz v7, :cond_9

    iget-object v1, v7, Lt/f;->e:Lt/j;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    invoke-virtual {v1, p1, v8}, Lt/j;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    if-eqz v7, :cond_a

    iget-object v1, v7, Lt/f;->b:Lt/i;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    invoke-virtual {v1, p1, v8}, Lt/i;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_5

    :cond_a
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_5
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    invoke-static {p1, v1}, Lt/k;->d(Landroid/content/Context;Landroid/util/AttributeSet;)Lt/f;

    move-result-object v7

    iget-object v1, v7, Lt/f;->d:Lt/g;

    iput v4, v1, Lt/g;->c0:I

    goto :goto_5

    :pswitch_6
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    invoke-static {p1, v1}, Lt/k;->d(Landroid/content/Context;Landroid/util/AttributeSet;)Lt/f;

    move-result-object v7

    iget-object v1, v7, Lt/f;->d:Lt/g;

    iput-boolean v4, v1, Lt/g;->a:Z

    goto :goto_5

    :pswitch_7
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    invoke-static {p1, v1}, Lt/k;->d(Landroid/content/Context;Landroid/util/AttributeSet;)Lt/f;

    move-result-object v7

    goto :goto_5

    :cond_b
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :cond_c
    :goto_5
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_2

    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_8

    :goto_7
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_d
    :goto_8
    iget-object p1, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_9

    :cond_e
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_f
    :goto_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78c018b6 -> :sswitch_7
        -0x7648542a -> :sswitch_6
        -0x4bab3dd3 -> :sswitch_5
        -0x49cf74b4 -> :sswitch_4
        -0x446d330 -> :sswitch_3
        0x4f5d3b97 -> :sswitch_2
        0x6acd460b -> :sswitch_1
        0x6b78f1fd -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public z(Ljava/lang/String;)Ljava/util/List;
    .locals 5

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv0/r;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv0/j;

    iget-object v4, v4, Lv0/j;->a:Ljava/lang/String;

    invoke-static {v4, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv0/j;

    iget-object v3, p0, Lv0/r;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashMap;

    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-static {p1}, LL1/k;->Y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :goto_2
    monitor-exit v0

    throw p1
.end method
