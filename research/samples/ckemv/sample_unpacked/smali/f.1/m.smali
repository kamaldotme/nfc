.class public final Lf/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ/q;
.implements Lk/l0;
.implements Lj/y;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lf/v;


# direct methods
.method public synthetic constructor <init>(Lf/v;I)V
    .locals 0

    iput p2, p0, Lf/m;->b:I

    iput-object p1, p0, Lf/m;->c:Lf/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj/m;Z)V
    .locals 9

    iget v0, p0, Lf/m;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lj/m;->k()Lj/m;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    move-object p1, v0

    :cond_1
    iget-object v4, p0, Lf/m;->c:Lf/v;

    iget-object v5, v4, Lf/v;->M:[Lf/u;

    if-eqz v5, :cond_2

    array-length v6, v5

    goto :goto_1

    :cond_2
    move v6, v1

    :goto_1
    if-ge v1, v6, :cond_4

    aget-object v7, v5, v1

    if-eqz v7, :cond_3

    iget-object v8, v7, Lf/u;->h:Lj/m;

    if-ne v8, p1, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_6

    if-eqz v3, :cond_5

    iget p1, v7, Lf/u;->a:I

    invoke-virtual {v4, p1, v7, v0}, Lf/v;->p(ILf/u;Lj/m;)V

    invoke-virtual {v4, v7, v2}, Lf/v;->r(Lf/u;Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v4, v7, p2}, Lf/v;->r(Lf/u;Z)V

    :cond_6
    :goto_3
    return-void

    :pswitch_0
    iget-object p2, p0, Lf/m;->c:Lf/v;

    invoke-virtual {p2, p1}, Lf/v;->q(Lj/m;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lj/m;)Z
    .locals 2

    iget v0, p0, Lf/m;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lj/m;->k()Lj/m;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lf/m;->c:Lf/v;

    iget-boolean v1, v0, Lf/v;->G:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Lf/v;->m:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lf/v;->R:Z

    if-nez v0, :cond_0

    const/16 v0, 0x6c

    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    iget-object v0, p0, Lf/m;->c:Lf/v;

    iget-object v0, v0, Lf/v;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public f(Landroid/view/View;LJ/y0;)LJ/y0;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual/range {p2 .. p2}, LJ/y0;->d()I

    move-result v2

    move-object/from16 v3, p0

    iget-object v4, v3, Lf/m;->c:Lf/v;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, LJ/y0;->d()I

    move-result v5

    iget-object v6, v4, Lf/v;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v7, 0x0

    const/16 v8, 0x8

    if-eqz v6, :cond_f

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    instance-of v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v6, :cond_f

    iget-object v6, v4, Lf/v;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v9, v4, Lf/v;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v9}, Landroid/view/View;->isShown()Z

    move-result v9

    if-eqz v9, :cond_d

    iget-object v9, v4, Lf/v;->d0:Landroid/graphics/Rect;

    if-nez v9, :cond_0

    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    iput-object v9, v4, Lf/v;->d0:Landroid/graphics/Rect;

    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    iput-object v9, v4, Lf/v;->e0:Landroid/graphics/Rect;

    :cond_0
    iget-object v9, v4, Lf/v;->d0:Landroid/graphics/Rect;

    iget-object v11, v4, Lf/v;->e0:Landroid/graphics/Rect;

    invoke-virtual/range {p2 .. p2}, LJ/y0;->b()I

    move-result v12

    invoke-virtual/range {p2 .. p2}, LJ/y0;->d()I

    move-result v13

    invoke-virtual/range {p2 .. p2}, LJ/y0;->c()I

    move-result v14

    invoke-virtual/range {p2 .. p2}, LJ/y0;->a()I

    move-result v15

    invoke-virtual {v9, v12, v13, v14, v15}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v12, v4, Lf/v;->B:Landroid/view/ViewGroup;

    sget-object v13, Lk/r1;->a:Ljava/lang/reflect/Method;

    if-eqz v13, :cond_1

    :try_start_0
    filled-new-array {v9, v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v13, v12, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    iget v11, v9, Landroid/graphics/Rect;->top:I

    iget v12, v9, Landroid/graphics/Rect;->left:I

    iget v9, v9, Landroid/graphics/Rect;->right:I

    iget-object v13, v4, Lf/v;->B:Landroid/view/ViewGroup;

    sget-object v14, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v13}, LJ/I;->a(Landroid/view/View;)LJ/y0;

    move-result-object v13

    if-nez v13, :cond_2

    move v14, v7

    goto :goto_0

    :cond_2
    invoke-virtual {v13}, LJ/y0;->b()I

    move-result v14

    :goto_0
    if-nez v13, :cond_3

    move v13, v7

    goto :goto_1

    :cond_3
    invoke-virtual {v13}, LJ/y0;->c()I

    move-result v13

    :goto_1
    iget v15, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v15, v11, :cond_5

    iget v15, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v15, v12, :cond_5

    iget v15, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v15, v9, :cond_4

    goto :goto_2

    :cond_4
    move v9, v7

    goto :goto_3

    :cond_5
    :goto_2
    iput v11, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v12, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v9, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v9, 0x1

    :goto_3
    iget-object v12, v4, Lf/v;->l:Landroid/content/Context;

    if-lez v11, :cond_6

    iget-object v11, v4, Lf/v;->D:Landroid/view/View;

    if-nez v11, :cond_6

    new-instance v11, Landroid/view/View;

    invoke-direct {v11, v12}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v11, v4, Lf/v;->D:Landroid/view/View;

    invoke-virtual {v11, v8}, Landroid/view/View;->setVisibility(I)V

    new-instance v11, Landroid/widget/FrameLayout$LayoutParams;

    iget v15, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/16 v8, 0x33

    const/4 v10, -0x1

    invoke-direct {v11, v10, v15, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    iput v14, v11, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v13, v11, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget-object v8, v4, Lf/v;->B:Landroid/view/ViewGroup;

    iget-object v13, v4, Lf/v;->D:Landroid/view/View;

    invoke-virtual {v8, v13, v10, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_4

    :cond_6
    iget-object v8, v4, Lf/v;->D:Landroid/view/View;

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v11, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v10, v11, :cond_7

    iget v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v10, v14, :cond_7

    iget v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v10, v13, :cond_8

    :cond_7
    iput v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v14, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v13, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v10, v4, Lf/v;->D:Landroid/view/View;

    invoke-virtual {v10, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    :goto_4
    iget-object v8, v4, Lf/v;->D:Landroid/view/View;

    if-eqz v8, :cond_9

    const/4 v10, 0x1

    goto :goto_5

    :cond_9
    move v10, v7

    :goto_5
    if-eqz v10, :cond_b

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eqz v8, :cond_b

    iget-object v8, v4, Lf/v;->D:Landroid/view/View;

    invoke-static {v8}, LJ/B;->g(Landroid/view/View;)I

    move-result v11

    and-int/lit16 v11, v11, 0x2000

    if-eqz v11, :cond_a

    const v11, 0x7f050006

    invoke-static {v12, v11}, Ly/d;->a(Landroid/content/Context;I)I

    move-result v11

    goto :goto_6

    :cond_a
    const v11, 0x7f050005

    invoke-static {v12, v11}, Ly/d;->a(Landroid/content/Context;I)I

    move-result v11

    :goto_6
    invoke-virtual {v8, v11}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_b
    iget-boolean v8, v4, Lf/v;->I:Z

    if-nez v8, :cond_c

    if-eqz v10, :cond_c

    move v5, v7

    :cond_c
    move v8, v10

    move v10, v9

    goto :goto_7

    :cond_d
    iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v8, :cond_e

    iput v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move v8, v7

    const/4 v10, 0x1

    goto :goto_7

    :cond_e
    move v8, v7

    move v10, v8

    :goto_7
    if-eqz v10, :cond_10

    iget-object v9, v4, Lf/v;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v9, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_8

    :cond_f
    move v8, v7

    :cond_10
    :goto_8
    iget-object v4, v4, Lf/v;->D:Landroid/view/View;

    if-eqz v4, :cond_12

    if-eqz v8, :cond_11

    goto :goto_9

    :cond_11
    const/16 v7, 0x8

    :goto_9
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_12
    if-eq v2, v5, :cond_15

    invoke-virtual/range {p2 .. p2}, LJ/y0;->b()I

    move-result v2

    invoke-virtual/range {p2 .. p2}, LJ/y0;->c()I

    move-result v4

    invoke-virtual/range {p2 .. p2}, LJ/y0;->a()I

    move-result v6

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1e

    if-lt v7, v8, :cond_13

    new-instance v7, LJ/p0;

    invoke-direct {v7, v1}, LJ/p0;-><init>(LJ/y0;)V

    goto :goto_a

    :cond_13
    const/16 v8, 0x1d

    if-lt v7, v8, :cond_14

    new-instance v7, LJ/o0;

    invoke-direct {v7, v1}, LJ/o0;-><init>(LJ/y0;)V

    goto :goto_a

    :cond_14
    new-instance v7, LJ/n0;

    invoke-direct {v7, v1}, LJ/n0;-><init>(LJ/y0;)V

    :goto_a
    invoke-static {v2, v5, v4, v6}, LA/d;->b(IIII)LA/d;

    move-result-object v1

    invoke-virtual {v7, v1}, LJ/q0;->g(LA/d;)V

    invoke-virtual {v7}, LJ/q0;->b()LJ/y0;

    move-result-object v1

    :cond_15
    sget-object v2, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, LJ/y0;->f()Landroid/view/WindowInsets;

    move-result-object v2

    if-eqz v2, :cond_16

    invoke-static {v0, v2}, LJ/F;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    invoke-static {v0, v4}, LJ/y0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LJ/y0;

    move-result-object v1

    :cond_16
    return-object v1
.end method
