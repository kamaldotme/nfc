.class public Lj0/l;
.super Landroidx/fragment/app/O;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    if-eqz p2, :cond_0

    check-cast p2, Lj0/o;

    invoke-virtual {p2, p1}, Lj0/o;->b(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 4

    check-cast p1, Lj0/o;

    if-nez p1, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lj0/t;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Lj0/t;

    iget-object v0, p1, Lj0/t;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-ge v2, v0, :cond_5

    if-ltz v2, :cond_2

    iget-object v3, p1, Lj0/t;->y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v2, v3, :cond_1

    goto :goto_1

    :cond_1
    iget-object v3, p1, Lj0/t;->y:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj0/o;

    goto :goto_2

    :cond_2
    :goto_1
    move-object v3, v1

    :goto_2
    invoke-virtual {p0, v3, p2}, Lj0/l;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p1, Lj0/o;->f:Ljava/util/ArrayList;

    invoke-static {v0}, Landroidx/fragment/app/O;->f(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v1}, Landroidx/fragment/app/O;->f(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v1}, Landroidx/fragment/app/O;->f(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    iget-object v0, p1, Lj0/o;->g:Ljava/util/ArrayList;

    invoke-static {v0}, Landroidx/fragment/app/O;->f(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_3
    if-ge v2, v0, :cond_5

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p1, v1}, Lj0/o;->b(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    :goto_4
    return-void
.end method

.method public final c(Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lj0/o;

    invoke-static {p1, p2}, Lj0/s;->a(Landroid/view/ViewGroup;Lj0/o;)V

    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lj0/o;

    check-cast p2, Lj0/o;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    new-instance v0, Lj0/t;

    invoke-direct {v0}, Lj0/t;-><init>()V

    invoke-virtual {v0, p1}, Lj0/t;->H(Lj0/o;)V

    invoke-virtual {v0, p2}, Lj0/t;->H(Lj0/o;)V

    const/4 p1, 0x0

    iput-boolean p1, v0, Lj0/t;->z:Z

    move-object p1, v0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    move-object p1, p2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lj0/t;

    invoke-direct {v0}, Lj0/t;-><init>()V

    if-eqz p1, :cond_0

    check-cast p1, Lj0/o;

    invoke-virtual {v0, p1}, Lj0/t;->H(Lj0/o;)V

    :cond_0
    if-eqz p2, :cond_1

    check-cast p2, Lj0/o;

    invoke-virtual {v0, p2}, Lj0/t;->H(Lj0/o;)V

    :cond_1
    if-eqz p3, :cond_2

    check-cast p3, Lj0/o;

    invoke-virtual {v0, p3}, Lj0/t;->H(Lj0/o;)V

    :cond_2
    return-object v0
.end method

.method public final j(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 1

    check-cast p1, Lj0/o;

    new-instance v0, Lj0/j;

    invoke-direct {v0, p2, p3}, Lj0/j;-><init>(Landroid/view/View;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v0}, Lj0/o;->a(Lj0/n;)V

    return-void
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 10

    move-object v0, p1

    check-cast v0, Lj0/o;

    new-instance v9, Lj0/k;

    move-object v1, v9

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lj0/k;-><init>(Lj0/l;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v9}, Lj0/o;->a(Lj0/n;)V

    return-void
.end method

.method public final l(Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    check-cast p2, Lj0/o;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-static {p1, v0}, Landroidx/fragment/app/O;->e(Landroid/view/View;Landroid/graphics/Rect;)V

    new-instance p1, Ld1/e;

    const/4 v0, 0x5

    invoke-direct {p1, v0}, Ld1/e;-><init>(I)V

    invoke-virtual {p2, p1}, Lj0/o;->A(Ld1/e;)V

    :cond_0
    return-void
.end method

.method public final n(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    check-cast p1, Lj0/t;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lj0/o;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0, p1, p2, p3}, Lj0/l;->o(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method public final o(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    check-cast p1, Lj0/o;

    instance-of v0, p1, Lj0/t;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lj0/t;

    iget-object v0, p1, Lj0/t;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-ge v2, v0, :cond_6

    if-ltz v2, :cond_1

    iget-object v3, p1, Lj0/t;->y:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v2, v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p1, Lj0/t;->y:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj0/o;

    goto :goto_2

    :cond_1
    :goto_1
    move-object v3, v1

    :goto_2
    invoke-virtual {p0, v3, p2, p3}, Lj0/l;->o(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lj0/o;->f:Ljava/util/ArrayList;

    invoke-static {v0}, Landroidx/fragment/app/O;->f(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v1}, Landroidx/fragment/app/O;->f(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v1}, Landroidx/fragment/app/O;->f(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_5

    :cond_3
    iget-object v0, p1, Lj0/o;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v1, v3, :cond_6

    invoke-interface {v0, p2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez p3, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_3
    if-ge v2, v0, :cond_5

    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {p1, v1}, Lj0/o;->b(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    :goto_4
    if-ltz p3, :cond_6

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Lj0/o;->w(Landroid/view/View;)V

    add-int/lit8 p3, p3, -0x1

    goto :goto_4

    :cond_6
    :goto_5
    return-void
.end method
