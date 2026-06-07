.class public final Landroidx/fragment/app/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/g;->d:Z

    iput-boolean v0, p0, Landroidx/fragment/app/g;->e:Z

    iput-object p1, p0, Landroidx/fragment/app/g;->a:Landroid/view/ViewGroup;

    return-void
.end method

.method public static a(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, LJ/W;->b(Landroid/view/ViewGroup;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2, p1}, Landroidx/fragment/app/g;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public static g(Landroid/view/ViewGroup;LU0/e;)Landroidx/fragment/app/g;
    .locals 3

    const v0, 0x7f08016e

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroidx/fragment/app/g;

    if-eqz v2, :cond_0

    check-cast v1, Landroidx/fragment/app/g;

    return-object v1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Landroidx/fragment/app/g;

    invoke-direct {p1, p0}, Landroidx/fragment/app/g;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public final b(IILandroidx/fragment/app/G;)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    new-instance v1, LF/d;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, p3, Landroidx/fragment/app/G;->c:Landroidx/fragment/app/n;

    invoke-virtual {p0, v2}, Landroidx/fragment/app/g;->e(Landroidx/fragment/app/n;)Landroidx/fragment/app/T;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1, p2}, Landroidx/fragment/app/T;->c(II)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v2, Landroidx/fragment/app/T;

    invoke-direct {v2, p1, p2, p3, v1}, Landroidx/fragment/app/T;-><init>(IILandroidx/fragment/app/G;LF/d;)V

    iget-object p1, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Landroidx/fragment/app/S;

    const/4 p2, 0x0

    invoke-direct {p1, p0, v2, p2}, Landroidx/fragment/app/S;-><init>(Landroidx/fragment/app/g;Landroidx/fragment/app/T;I)V

    iget-object p2, v2, Landroidx/fragment/app/T;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Landroidx/fragment/app/S;

    const/4 p2, 0x1

    invoke-direct {p1, p0, v2, p2}, Landroidx/fragment/app/S;-><init>(Landroidx/fragment/app/g;Landroidx/fragment/app/T;I)V

    iget-object p2, v2, Landroidx/fragment/app/T;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final c(Ljava/util/ArrayList;Z)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move-object v4, v3

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x2

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/T;

    iget-object v9, v5, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    iget-object v9, v9, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-static {v9}, LX/d;->c(Landroid/view/View;)I

    move-result v9

    iget v10, v5, Landroidx/fragment/app/T;->a:I

    invoke-static {v10}, Lq/h;->a(I)I

    move-result v10

    if-eqz v10, :cond_2

    if-eq v10, v7, :cond_1

    if-eq v10, v8, :cond_2

    if-eq v10, v6, :cond_2

    goto :goto_0

    :cond_1
    if-eq v9, v8, :cond_0

    move-object v4, v5

    goto :goto_0

    :cond_2
    if-ne v9, v8, :cond_0

    if-nez v3, :cond_0

    move-object v3, v5

    goto :goto_0

    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    move-object/from16 v10, p1

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x0

    if-eqz v11, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/T;

    new-instance v13, LF/d;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v11}, Landroidx/fragment/app/T;->d()V

    iget-object v14, v11, Landroidx/fragment/app/T;->e:Ljava/util/HashSet;

    invoke-virtual {v14, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v15, Landroidx/fragment/app/e;

    invoke-direct {v15, v11, v13}, LA1/f;-><init>(Landroidx/fragment/app/T;LF/d;)V

    iput-boolean v12, v15, Landroidx/fragment/app/e;->d:Z

    iput-boolean v1, v15, Landroidx/fragment/app/e;->c:Z

    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, LF/d;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v11}, Landroidx/fragment/app/T;->d()V

    invoke-virtual {v14, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v14, Landroidx/fragment/app/f;

    if-eqz v1, :cond_4

    if-ne v11, v3, :cond_5

    :goto_2
    move v12, v7

    goto :goto_3

    :cond_4
    if-ne v11, v4, :cond_5

    goto :goto_2

    :cond_5
    :goto_3
    invoke-direct {v14, v11, v13, v1, v12}, Landroidx/fragment/app/f;-><init>(Landroidx/fragment/app/T;LF/d;ZZ)V

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LG/m;

    invoke-direct {v12, v0, v9, v11}, LG/m;-><init>(Landroidx/fragment/app/g;Ljava/util/ArrayList;Landroidx/fragment/app/T;)V

    iget-object v11, v11, Landroidx/fragment/app/T;->d:Ljava/util/ArrayList;

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/f;

    invoke-virtual {v4}, LA1/f;->h()Z

    goto :goto_4

    :cond_7
    iget-object v3, v0, Landroidx/fragment/app/g;->a:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/f;

    iget-object v10, v5, LA1/f;->a:Ljava/lang/Object;

    check-cast v10, Landroidx/fragment/app/T;

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, LA1/f;->d()V

    goto :goto_5

    :cond_8
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v11, v12

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const-string v14, "FragmentManager"

    if-eqz v13, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v15, v13

    check-cast v15, Landroidx/fragment/app/e;

    invoke-virtual {v15}, LA1/f;->h()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-virtual {v15}, LA1/f;->d()V

    goto :goto_7

    :cond_9
    invoke-virtual {v15, v5}, Landroidx/fragment/app/e;->l(Landroid/content/Context;)Lv0/l;

    move-result-object v13

    if-nez v13, :cond_a

    invoke-virtual {v15}, LA1/f;->d()V

    goto :goto_7

    :cond_a
    iget-object v13, v13, Lv0/l;->e:Ljava/lang/Object;

    check-cast v13, Landroid/animation/Animator;

    if-nez v13, :cond_b

    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_b
    iget-object v12, v15, LA1/f;->a:Ljava/lang/Object;

    check-cast v12, Landroidx/fragment/app/T;

    iget-object v7, v12, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    const/4 v6, 0x2

    invoke-static {v14, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_c
    invoke-virtual {v15}, LA1/f;->d()V

    :goto_7
    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x2

    :goto_8
    const/4 v12, 0x0

    goto :goto_6

    :cond_d
    iget v6, v12, Landroidx/fragment/app/T;->a:I

    const/4 v8, 0x3

    if-ne v6, v8, :cond_e

    const/16 v16, 0x1

    goto :goto_9

    :cond_e
    const/16 v16, 0x0

    :goto_9
    if-eqz v16, :cond_f

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_f
    iget-object v6, v7, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v7, Landroidx/fragment/app/c;

    move-object v11, v13

    move-object v13, v7

    move-object v14, v3

    move-object/from16 p2, v15

    move-object v15, v6

    move-object/from16 v17, v12

    move-object/from16 v18, p2

    invoke-direct/range {v13 .. v18}, Landroidx/fragment/app/c;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLandroidx/fragment/app/T;Landroidx/fragment/app/e;)V

    invoke-virtual {v11, v7}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v11, v6}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    invoke-virtual {v11}, Landroid/animation/Animator;->start()V

    new-instance v6, LA/h;

    const/16 v7, 0x16

    invoke-direct {v6, v7, v11}, LA/h;-><init>(ILjava/lang/Object;)V

    move-object/from16 v13, p2

    iget-object v7, v13, LA1/f;->b:Ljava/lang/Object;

    check-cast v7, LF/d;

    invoke-virtual {v7, v6}, LF/d;->b(LF/c;)V

    move v6, v8

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v11, 0x1

    goto :goto_8

    :cond_10
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/e;

    iget-object v6, v2, LA1/f;->a:Ljava/lang/Object;

    check-cast v6, Landroidx/fragment/app/T;

    iget-object v7, v6, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    if-eqz v4, :cond_12

    const/4 v8, 0x2

    invoke-static {v14, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_11
    invoke-virtual {v2}, LA1/f;->d()V

    goto :goto_a

    :cond_12
    const/4 v8, 0x2

    if-eqz v11, :cond_14

    invoke-static {v14, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_13
    invoke-virtual {v2}, LA1/f;->d()V

    goto :goto_a

    :cond_14
    iget-object v7, v7, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-virtual {v2, v5}, Landroidx/fragment/app/e;->l(Landroid/content/Context;)Lv0/l;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v10, v10, Lv0/l;->d:Ljava/lang/Object;

    check-cast v10, Landroid/view/animation/Animation;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v6, v6, Landroidx/fragment/app/T;->a:I

    const/4 v12, 0x1

    if-eq v6, v12, :cond_15

    invoke-virtual {v7, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v2}, LA1/f;->d()V

    goto :goto_b

    :cond_15
    invoke-virtual {v3, v7}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v6, Landroidx/fragment/app/r;

    invoke-direct {v6, v10, v3, v7}, Landroidx/fragment/app/r;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    new-instance v10, Landroidx/fragment/app/d;

    invoke-direct {v10, v7, v3, v2}, Landroidx/fragment/app/d;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/e;)V

    invoke-virtual {v6, v10}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v7, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :goto_b
    new-instance v6, Lv0/m;

    invoke-direct {v6, v7, v3, v2}, Lv0/m;-><init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/e;)V

    iget-object v2, v2, LA1/f;->b:Ljava/lang/Object;

    check-cast v2, LF/d;

    invoke-virtual {v2, v6}, LF/d;->b(LF/c;)V

    goto :goto_a

    :cond_16
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/T;

    iget-object v3, v2, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    iget-object v3, v3, Landroidx/fragment/app/n;->F:Landroid/view/View;

    iget v2, v2, Landroidx/fragment/app/T;->a:I

    invoke-static {v3, v2}, LX/d;->a(Landroid/view/View;I)V

    goto :goto_c

    :cond_17
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final d()V
    .locals 6

    iget-boolean v0, p0, Landroidx/fragment/app/g;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroid/view/ViewGroup;

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LJ/E;->b(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/g;->f()V

    iput-boolean v1, p0, Landroidx/fragment/app/g;->d:Z

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/T;

    const-string v4, "FragmentManager"

    const/4 v5, 0x2

    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_3
    :goto_1
    invoke-virtual {v3}, Landroidx/fragment/app/T;->a()V

    iget-boolean v4, v3, Landroidx/fragment/app/T;->g:Z

    if-nez v4, :cond_2

    iget-object v4, p0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/g;->i()V

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/T;

    invoke-virtual {v4}, Landroidx/fragment/app/T;->d()V

    goto :goto_2

    :cond_5
    iget-boolean v3, p0, Landroidx/fragment/app/g;->d:Z

    invoke-virtual {p0, v2, v3}, Landroidx/fragment/app/g;->c(Ljava/util/ArrayList;Z)V

    iput-boolean v1, p0, Landroidx/fragment/app/g;->d:Z

    :cond_6
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e(Landroidx/fragment/app/n;)Landroidx/fragment/app/T;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/T;

    iget-object v2, v1, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    invoke-virtual {v2, p1}, Landroidx/fragment/app/n;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v2, v1, Landroidx/fragment/app/T;->f:Z

    if-nez v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final f()V
    .locals 7

    iget-object v0, p0, Landroidx/fragment/app/g;->a:Landroid/view/ViewGroup;

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LJ/E;->b(Landroid/view/View;)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/g;->i()V

    iget-object v2, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/T;

    invoke-virtual {v3}, Landroidx/fragment/app/T;->d()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/g;->c:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/T;

    const-string v5, "FragmentManager"

    invoke-static {v5, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Container "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Landroidx/fragment/app/g;->a:Landroid/view/ViewGroup;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " is not attached to window. "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    invoke-virtual {v3}, Landroidx/fragment/app/T;->a()V

    goto :goto_1

    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/T;

    const-string v5, "FragmentManager"

    invoke-static {v5, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_5

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Container "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Landroidx/fragment/app/g;->a:Landroid/view/ViewGroup;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " is not attached to window. "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_4
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    invoke-virtual {v3}, Landroidx/fragment/app/T;->a()V

    goto :goto_3

    :cond_6
    monitor-exit v1

    return-void

    :goto_5
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final h()V
    .locals 7

    iget-object v0, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/g;->i()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/g;->e:Z

    iget-object v2, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    iget-object v3, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/T;

    iget-object v4, v3, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    iget-object v4, v4, Landroidx/fragment/app/n;->F:Landroid/view/View;

    invoke-static {v4}, LX/d;->c(Landroid/view/View;)I

    move-result v4

    iget v5, v3, Landroidx/fragment/app/T;->a:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_0

    if-eq v4, v6, :cond_0

    iget-object v2, v3, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean v1, p0, Landroidx/fragment/app/g;->e:Z

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/T;

    iget v2, v1, Landroidx/fragment/app/T;->b:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    iget-object v2, v1, Landroidx/fragment/app/T;->c:Landroidx/fragment/app/n;

    invoke-virtual {v2}, Landroidx/fragment/app/n;->x()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    invoke-static {v2}, LX/d;->b(I)I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroidx/fragment/app/T;->c(II)V

    goto :goto_0

    :cond_1
    return-void
.end method
