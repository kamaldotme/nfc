.class public final Lcom/google/android/material/datepicker/k;
.super Lcom/google/android/material/datepicker/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/t;"
    }
.end annotation


# instance fields
.field public T:I

.field public U:Lcom/google/android/material/datepicker/b;

.field public V:Lcom/google/android/material/datepicker/o;

.field public W:I

.field public X:Lcom/google/android/material/datepicker/c;

.field public Y:Landroidx/recyclerview/widget/RecyclerView;

.field public Z:Landroidx/recyclerview/widget/RecyclerView;

.field public a0:Landroid/view/View;

.field public b0:Landroid/view/View;

.field public c0:Landroid/view/View;

.field public d0:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/datepicker/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(Lcom/google/android/material/datepicker/o;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()LZ/z;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/s;

    iget-object v1, v0, Lcom/google/android/material/datepicker/s;->c:Lcom/google/android/material/datepicker/b;

    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->b:Lcom/google/android/material/datepicker/o;

    invoke-virtual {v1, p1}, Lcom/google/android/material/datepicker/o;->d(Lcom/google/android/material/datepicker/o;)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/datepicker/k;->V:Lcom/google/android/material/datepicker/o;

    iget-object v0, v0, Lcom/google/android/material/datepicker/s;->c:Lcom/google/android/material/datepicker/b;

    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->b:Lcom/google/android/material/datepicker/o;

    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/o;->d(Lcom/google/android/material/datepicker/o;)I

    move-result v0

    sub-int v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-le v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    if-lez v0, :cond_1

    move v4, v5

    :cond_1
    iput-object p1, p0, Lcom/google/android/material/datepicker/k;->V:Lcom/google/android/material/datepicker/o;

    if-eqz v2, :cond_2

    if-eqz v4, :cond_2

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, -0x3

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LG/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, p0}, LG/a;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, 0x3

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LG/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, p0}, LG/a;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LG/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, p0}, LG/a;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_1
    return-void
.end method

.method public final B(I)V
    .locals 4

    iput p1, p0, Lcom/google/android/material/datepicker/k;->W:I

    const/4 v0, 0x2

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->Y:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->Y:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()LZ/z;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/y;

    iget-object v3, p0, Lcom/google/android/material/datepicker/k;->V:Lcom/google/android/material/datepicker/o;

    iget v3, v3, Lcom/google/android/material/datepicker/o;->d:I

    iget-object v0, v0, Lcom/google/android/material/datepicker/y;->c:Lcom/google/android/material/datepicker/k;

    iget-object v0, v0, Lcom/google/android/material/datepicker/k;->U:Lcom/google/android/material/datepicker/b;

    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->b:Lcom/google/android/material/datepicker/o;

    iget v0, v0, Lcom/google/android/material/datepicker/o;->d:I

    sub-int/2addr v3, v0

    invoke-virtual {p1, v3}, LZ/H;->k0(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->c0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->d0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->a0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->b0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->c0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->d0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->a0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->b0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->V:Lcom/google/android/material/datepicker/o;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/k;->A(Lcom/google/android/material/datepicker/o;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final l(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/n;->l(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/n;->g:Landroid/os/Bundle;

    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/datepicker/k;->T:I

    const-string v0, "GRID_SELECTOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, LX/d;->m(Landroid/os/Parcelable;)V

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/b;

    iput-object v0, p0, Lcom/google/android/material/datepicker/k;->U:Lcom/google/android/material/datepicker/b;

    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, LX/d;->m(Landroid/os/Parcelable;)V

    const-string v0, "CURRENT_MONTH_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/o;

    iput-object p1, p0, Lcom/google/android/material/datepicker/k;->V:Lcom/google/android/material/datepicker/o;

    return-void
.end method

.method public final m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroidx/fragment/app/n;->h()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/google/android/material/datepicker/k;->T:I

    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    new-instance v1, Lcom/google/android/material/datepicker/c;

    invoke-direct {v1, v0}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/google/android/material/datepicker/k;->X:Lcom/google/android/material/datepicker/c;

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->U:Lcom/google/android/material/datepicker/b;

    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->b:Lcom/google/android/material/datepicker/o;

    const v2, 0x101020d

    invoke-static {v0, v2}, Lcom/google/android/material/datepicker/m;->E(Landroid/content/Context;I)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    const v3, 0x7f0b0050

    move v6, v4

    goto :goto_0

    :cond_0
    const v3, 0x7f0b004b

    move v6, v5

    :goto_0
    invoke-virtual {p1, v3, p2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/n;->w()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v3, 0x7f060285

    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    const v7, 0x7f060286

    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    add-int/2addr v7, v3

    const v3, 0x7f060284

    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    add-int/2addr v3, v7

    const v7, 0x7f060275

    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    sget v8, Lcom/google/android/material/datepicker/p;->e:I

    const v9, 0x7f060270

    invoke-virtual {p2, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    mul-int/2addr v9, v8

    sub-int/2addr v8, v4

    const v10, 0x7f060283

    invoke-virtual {p2, v10}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v10

    mul-int/2addr v10, v8

    add-int/2addr v10, v9

    const v8, 0x7f06026d

    invoke-virtual {p2, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p2

    add-int/2addr v3, v7

    add-int/2addr v3, v10

    add-int/2addr v3, p2

    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumHeight(I)V

    const p2, 0x7f0800f9

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/GridView;

    new-instance v3, LN/i;

    const/4 v7, 0x1

    invoke-direct {v3, v7}, LN/i;-><init>(I)V

    invoke-static {p2, v3}, LJ/T;->l(Landroid/view/View;LJ/c;)V

    iget-object v3, p0, Lcom/google/android/material/datepicker/k;->U:Lcom/google/android/material/datepicker/b;

    iget v3, v3, Lcom/google/android/material/datepicker/b;->f:I

    new-instance v7, Lcom/google/android/material/datepicker/e;

    if-lez v3, :cond_1

    invoke-direct {v7, v3}, Lcom/google/android/material/datepicker/e;-><init>(I)V

    goto :goto_1

    :cond_1
    invoke-direct {v7}, Lcom/google/android/material/datepicker/e;-><init>()V

    :goto_1
    invoke-virtual {p2, v7}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v1, v1, Lcom/google/android/material/datepicker/o;->e:I

    invoke-virtual {p2, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    invoke-virtual {p2, v5}, Landroid/view/View;->setEnabled(Z)V

    const p2, 0x7f0800fc

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Lcom/google/android/material/datepicker/g;

    invoke-virtual {p0}, Landroidx/fragment/app/n;->h()Landroid/content/Context;

    invoke-direct {p2, p0, v6, v6}, Lcom/google/android/material/datepicker/g;-><init>(Lcom/google/android/material/datepicker/k;II)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(LZ/H;)V

    iget-object p2, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "MONTHS_VIEW_GROUP_TAG"

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance p2, Lcom/google/android/material/datepicker/s;

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->U:Lcom/google/android/material/datepicker/b;

    new-instance v3, LA/h;

    const/16 v5, 0x1b

    invoke-direct {v3, v5, p0}, LA/h;-><init>(ILjava/lang/Object;)V

    invoke-direct {p2, v0, v1, v3}, Lcom/google/android/material/datepicker/s;-><init>(Landroid/view/ContextThemeWrapper;Lcom/google/android/material/datepicker/b;LA/h;)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LZ/z;)V

    invoke-virtual {v0}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f090032

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    const v3, 0x7f0800ff

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v5, p0, Lcom/google/android/material/datepicker/k;->Y:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v5, p0, Lcom/google/android/material/datepicker/k;->Y:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {v6, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(LZ/H;)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->Y:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Lcom/google/android/material/datepicker/y;

    invoke-direct {v5, p0}, Lcom/google/android/material/datepicker/y;-><init>(Lcom/google/android/material/datepicker/k;)V

    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LZ/z;)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->Y:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Lcom/google/android/material/datepicker/h;

    invoke-direct {v5, p0}, Lcom/google/android/material/datepicker/h;-><init>(Lcom/google/android/material/datepicker/k;)V

    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->g(LZ/E;)V

    :cond_2
    const v1, 0x7f0800f2

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    const-string v5, "SELECTOR_TOGGLE_TAG"

    invoke-virtual {v1, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v5, LG0/e;

    const/4 v6, 0x3

    invoke-direct {v5, v6, p0}, LG0/e;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v5}, LJ/T;->l(Landroid/view/View;LJ/c;)V

    const v5, 0x7f0800f4

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/material/datepicker/k;->a0:Landroid/view/View;

    const-string v6, "NAVIGATION_PREV_TAG"

    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const v5, 0x7f0800f3

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/material/datepicker/k;->b0:Landroid/view/View;

    const-string v6, "NAVIGATION_NEXT_TAG"

    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/material/datepicker/k;->c0:Landroid/view/View;

    const v3, 0x7f0800f8

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/material/datepicker/k;->d0:Landroid/view/View;

    invoke-virtual {p0, v4}, Lcom/google/android/material/datepicker/k;->B(I)V

    iget-object v3, p0, Lcom/google/android/material/datepicker/k;->V:Lcom/google/android/material/datepicker/o;

    invoke-virtual {v3}, Lcom/google/android/material/datepicker/o;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v4, Lcom/google/android/material/datepicker/i;

    invoke-direct {v4, p0, p2, v1}, Lcom/google/android/material/datepicker/i;-><init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/s;Lcom/google/android/material/button/MaterialButton;)V

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->h(LZ/K;)V

    new-instance v3, Lcom/google/android/material/datepicker/j;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0}, Lcom/google/android/material/datepicker/j;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->b0:Landroid/view/View;

    new-instance v3, Lcom/google/android/material/datepicker/f;

    const/4 v4, 0x1

    invoke-direct {v3, p0, p2, v4}, Lcom/google/android/material/datepicker/f;-><init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/s;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->a0:Landroid/view/View;

    new-instance v3, Lcom/google/android/material/datepicker/f;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p2, v4}, Lcom/google/android/material/datepicker/f;-><init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/s;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    invoke-static {v0, v2}, Lcom/google/android/material/datepicker/m;->E(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_8

    new-instance v0, LZ/x;

    invoke-direct {v0}, LZ/x;-><init>()V

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v0, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, v0, LZ/x;->b:LZ/Z;

    if-eqz v2, :cond_6

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->f0:Ljava/util/ArrayList;

    if-eqz v2, :cond_5

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_5
    iget-object v2, v0, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(LZ/J;)V

    :cond_6
    iput-object v1, v0, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getOnFlingListener()LZ/J;

    move-result-object v1

    if-nez v1, :cond_7

    iget-object v1, v0, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->h(LZ/K;)V

    iget-object v1, v0, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(LZ/J;)V

    new-instance v1, Landroid/widget/Scroller;

    iget-object v2, v0, LZ/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-direct {v1, v2, v3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    invoke-virtual {v0}, LZ/x;->f()V

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "An instance of OnFlingListener already set."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->V:Lcom/google/android/material/datepicker/o;

    iget-object p2, p2, Lcom/google/android/material/datepicker/s;->c:Lcom/google/android/material/datepicker/b;

    iget-object p2, p2, Lcom/google/android/material/datepicker/b;->b:Lcom/google/android/material/datepicker/o;

    invoke-virtual {p2, v1}, Lcom/google/android/material/datepicker/o;->d(Lcom/google/android/material/datepicker/o;)I

    move-result p2

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    iget-object p2, p0, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LN/i;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, LN/i;-><init>(I)V

    invoke-static {p2, v0}, LJ/T;->l(Landroid/view/View;LJ/c;)V

    return-object p1
.end method

.method public final q(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "THEME_RES_ID_KEY"

    iget v1, p0, Lcom/google/android/material/datepicker/k;->T:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "GRID_SELECTOR_KEY"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    iget-object v2, p0, Lcom/google/android/material/datepicker/k;->U:Lcom/google/android/material/datepicker/b;

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "CURRENT_MONTH_KEY"

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->V:Lcom/google/android/material/datepicker/o;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method
