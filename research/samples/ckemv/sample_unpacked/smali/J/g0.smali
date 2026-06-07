.class public final LJ/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final a:LJ/e;

.field public b:LJ/y0;


# direct methods
.method public constructor <init>(Landroid/view/View;LJ/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LJ/g0;->a:LJ/e;

    sget-object p2, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, LJ/I;->a(Landroid/view/View;)LJ/y0;

    move-result-object p1

    if-eqz p1, :cond_2

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p2, v0, :cond_0

    new-instance p2, LJ/p0;

    invoke-direct {p2, p1}, LJ/p0;-><init>(LJ/y0;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x1d

    if-lt p2, v0, :cond_1

    new-instance p2, LJ/o0;

    invoke-direct {p2, p1}, LJ/o0;-><init>(LJ/y0;)V

    goto :goto_0

    :cond_1
    new-instance p2, LJ/n0;

    invoke-direct {p2, p1}, LJ/n0;-><init>(LJ/y0;)V

    :goto_0
    invoke-virtual {p2}, LJ/q0;->b()LJ/y0;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, LJ/g0;->b:LJ/y0;

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    const/4 v1, 0x2

    const/16 v2, 0x8

    const/4 v9, 0x1

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isLaidOut()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static/range {p1 .. p2}, LJ/y0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LJ/y0;

    move-result-object v1

    iput-object v1, v0, LJ/g0;->b:LJ/y0;

    invoke-static/range {p1 .. p2}, LJ/h0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-static/range {p1 .. p2}, LJ/y0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LJ/y0;

    move-result-object v10

    iget-object v3, v0, LJ/g0;->b:LJ/y0;

    if-nez v3, :cond_1

    sget-object v3, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static/range {p1 .. p1}, LJ/I;->a(Landroid/view/View;)LJ/y0;

    move-result-object v3

    iput-object v3, v0, LJ/g0;->b:LJ/y0;

    :cond_1
    iget-object v3, v0, LJ/g0;->b:LJ/y0;

    if-nez v3, :cond_2

    iput-object v10, v0, LJ/g0;->b:LJ/y0;

    invoke-static/range {p1 .. p2}, LJ/h0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_2
    invoke-static/range {p1 .. p1}, LJ/h0;->j(Landroid/view/View;)LJ/e;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v3, v3, LJ/e;->c:Ljava/lang/Object;

    check-cast v3, Landroid/view/WindowInsets;

    invoke-static {v3, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static/range {p1 .. p2}, LJ/h0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_3
    iget-object v3, v0, LJ/g0;->b:LJ/y0;

    move v6, v9

    const/4 v5, 0x0

    :goto_0
    iget-object v11, v10, LJ/y0;->a:LJ/w0;

    const/16 v12, 0x100

    if-gt v6, v12, :cond_5

    invoke-virtual {v11, v6}, LJ/w0;->f(I)LA/d;

    move-result-object v11

    iget-object v12, v3, LJ/y0;->a:LJ/w0;

    invoke-virtual {v12, v6}, LJ/w0;->f(I)LA/d;

    move-result-object v12

    invoke-virtual {v11, v12}, LA/d;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    or-int/2addr v5, v6

    :cond_4
    shl-int/2addr v6, v9

    goto :goto_0

    :cond_5
    if-nez v5, :cond_6

    invoke-static/range {p1 .. p2}, LJ/h0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :cond_6
    iget-object v6, v0, LJ/g0;->b:LJ/y0;

    and-int/lit8 v3, v5, 0x8

    if-eqz v3, :cond_8

    invoke-virtual {v11, v2}, LJ/w0;->f(I)LA/d;

    move-result-object v3

    iget v3, v3, LA/d;->d:I

    iget-object v12, v6, LJ/y0;->a:LJ/w0;

    invoke-virtual {v12, v2}, LJ/w0;->f(I)LA/d;

    move-result-object v2

    iget v2, v2, LA/d;->d:I

    if-le v3, v2, :cond_7

    sget-object v2, LJ/h0;->e:Landroid/view/animation/PathInterpolator;

    goto :goto_1

    :cond_7
    sget-object v2, LJ/h0;->f:LU/a;

    goto :goto_1

    :cond_8
    sget-object v2, LJ/h0;->g:Landroid/view/animation/DecelerateInterpolator;

    :goto_1
    new-instance v12, LJ/l0;

    const-wide/16 v13, 0xa0

    invoke-direct {v12, v5, v2, v13, v14}, LJ/l0;-><init>(ILandroid/view/animation/Interpolator;J)V

    iget-object v2, v12, LJ/l0;->a:LJ/k0;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, LJ/k0;->d(F)V

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    iget-object v3, v12, LJ/l0;->a:LJ/k0;

    invoke-virtual {v3}, LJ/k0;->a()J

    move-result-wide v13

    invoke-virtual {v2, v13, v14}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v13

    invoke-virtual {v11, v5}, LJ/w0;->f(I)LA/d;

    move-result-object v2

    iget-object v3, v6, LJ/y0;->a:LJ/w0;

    invoke-virtual {v3, v5}, LJ/w0;->f(I)LA/d;

    move-result-object v3

    iget v11, v2, LA/d;->a:I

    iget v14, v3, LA/d;->a:I

    invoke-static {v11, v14}, Ljava/lang/Math;->min(II)I

    move-result v11

    iget v14, v2, LA/d;->b:I

    iget v15, v3, LA/d;->b:I

    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v9

    iget v4, v2, LA/d;->c:I

    iget v1, v3, LA/d;->c:I

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    move-object/from16 v16, v13

    iget v13, v2, LA/d;->d:I

    move/from16 v17, v5

    iget v5, v3, LA/d;->d:I

    move-object/from16 v18, v6

    invoke-static {v13, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {v11, v9, v0, v6}, LA/d;->b(IIII)LA/d;

    move-result-object v0

    iget v2, v2, LA/d;->a:I

    iget v3, v3, LA/d;->a:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v13, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v2, v3, v1, v4}, LA/d;->b(IIII)LA/d;

    move-result-object v1

    new-instance v9, Lv0/e;

    const/4 v2, 0x2

    invoke-direct {v9, v0, v2, v1}, Lv0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v7, v8, v0}, LJ/h0;->f(Landroid/view/View;Landroid/view/WindowInsets;Z)V

    new-instance v0, LJ/f0;

    move-object v1, v0

    move-object v2, v12

    move-object v3, v10

    move-object/from16 v4, v18

    move/from16 v5, v17

    move-object/from16 v6, p1

    invoke-direct/range {v1 .. v6}, LJ/f0;-><init>(LJ/l0;LJ/y0;LJ/y0;ILandroid/view/View;)V

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v0, LJ/Z;

    const/4 v2, 0x1

    invoke-direct {v0, v12, v7, v2}, LJ/Z;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    invoke-virtual {v1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v0, LG/m;

    invoke-direct {v0, v7, v12, v9, v1}, LG/m;-><init>(Landroid/view/View;LJ/l0;Lv0/e;Landroid/animation/ValueAnimator;)V

    invoke-static {v7, v0}, LJ/t;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    move-object/from16 v0, p0

    iput-object v10, v0, LJ/g0;->b:LJ/y0;

    invoke-static/range {p1 .. p2}, LJ/h0;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    return-object v1

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
