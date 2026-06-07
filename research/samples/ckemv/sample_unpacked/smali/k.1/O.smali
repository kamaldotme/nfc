.class public final Lk/O;
.super Lk/G0;
.source "SourceFile"

# interfaces
.implements Lk/Q;


# instance fields
.field public D:Ljava/lang/CharSequence;

.field public E:Landroid/widget/ListAdapter;

.field public final F:Landroid/graphics/Rect;

.field public G:I

.field public final synthetic H:Lk/S;


# direct methods
.method public constructor <init>(Lk/S;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    iput-object p1, p0, Lk/O;->H:Lk/S;

    const/4 v0, 0x0

    const v1, 0x7f030399

    invoke-direct {p0, p2, p3, v1, v0}, Lk/G0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lk/O;->F:Landroid/graphics/Rect;

    iput-object p1, p0, Lk/G0;->p:Landroid/view/View;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lk/G0;->z:Z

    iget-object p2, p0, Lk/G0;->A:Lk/A;

    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    new-instance p1, LX0/u;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p0}, LX0/u;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lk/G0;->q:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lk/O;->D:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final g(II)V
    .locals 4

    iget-object v0, p0, Lk/G0;->A:Lk/A;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    invoke-virtual {p0}, Lk/O;->s()V

    const/4 v2, 0x2

    iget-object v3, p0, Lk/G0;->A:Lk/A;

    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    invoke-virtual {p0}, Lk/G0;->i()V

    iget-object v2, p0, Lk/G0;->d:Lk/u0;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    invoke-static {v2, p1}, Lk/J;->d(Landroid/view/View;I)V

    invoke-static {v2, p2}, Lk/J;->c(Landroid/view/View;I)V

    iget-object p1, p0, Lk/O;->H:Lk/S;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p2

    iget-object v2, p0, Lk/G0;->d:Lk/u0;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lk/u0;->setListSelectionHidden(Z)V

    invoke-virtual {v2, p2}, Landroid/widget/AdapterView;->setSelection(I)V

    invoke-virtual {v2}, Landroid/widget/AbsListView;->getChoiceMode()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2, p2, v3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    :cond_0
    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance p2, Lj/d;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p0}, Lj/d;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    new-instance p1, Lk/N;

    invoke-direct {p1, p0, p2}, Lk/N;-><init>(Lk/O;Lj/d;)V

    iget-object p2, p0, Lk/G0;->A:Lk/A;

    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    :cond_2
    return-void
.end method

.method public final h(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lk/O;->D:Ljava/lang/CharSequence;

    return-void
.end method

.method public final o(Landroid/widget/ListAdapter;)V
    .locals 0

    invoke-super {p0, p1}, Lk/G0;->o(Landroid/widget/ListAdapter;)V

    iput-object p1, p0, Lk/O;->E:Landroid/widget/ListAdapter;

    return-void
.end method

.method public final p(I)V
    .locals 0

    iput p1, p0, Lk/O;->G:I

    return-void
.end method

.method public final s()V
    .locals 9

    iget-object v0, p0, Lk/G0;->A:Lk/A;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lk/O;->H:Lk/S;

    if-eqz v1, :cond_1

    iget-object v3, v2, Lk/S;->i:Landroid/graphics/Rect;

    invoke-virtual {v1, v3}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    invoke-static {v2}, Lk/r1;->a(Landroid/view/View;)Z

    move-result v1

    iget-object v3, v2, Lk/S;->i:Landroid/graphics/Rect;

    if-eqz v1, :cond_0

    iget v1, v3, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_0
    iget v1, v3, Landroid/graphics/Rect;->left:I

    neg-int v1, v1

    goto :goto_0

    :cond_1
    iget-object v1, v2, Lk/S;->i:Landroid/graphics/Rect;

    const/4 v3, 0x0

    iput v3, v1, Landroid/graphics/Rect;->right:I

    iput v3, v1, Landroid/graphics/Rect;->left:I

    move v1, v3

    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v5

    iget v6, v2, Lk/S;->h:I

    const/4 v7, -0x2

    if-ne v6, v7, :cond_3

    iget-object v6, p0, Lk/O;->E:Landroid/widget/ListAdapter;

    check-cast v6, Landroid/widget/SpinnerAdapter;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lk/S;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v0

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v7, v2, Lk/S;->i:Landroid/graphics/Rect;

    iget v8, v7, Landroid/graphics/Rect;->left:I

    sub-int/2addr v6, v8

    iget v7, v7, Landroid/graphics/Rect;->right:I

    sub-int/2addr v6, v7

    if-le v0, v6, :cond_2

    move v0, v6

    :cond_2
    sub-int v6, v5, v3

    sub-int/2addr v6, v4

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lk/G0;->r(I)V

    goto :goto_1

    :cond_3
    const/4 v0, -0x1

    if-ne v6, v0, :cond_4

    sub-int v0, v5, v3

    sub-int/2addr v0, v4

    invoke-virtual {p0, v0}, Lk/G0;->r(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v6}, Lk/G0;->r(I)V

    :goto_1
    invoke-static {v2}, Lk/r1;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_5

    sub-int/2addr v5, v4

    iget v0, p0, Lk/G0;->f:I

    sub-int/2addr v5, v0

    iget v0, p0, Lk/O;->G:I

    sub-int/2addr v5, v0

    add-int/2addr v5, v1

    goto :goto_2

    :cond_5
    iget v0, p0, Lk/O;->G:I

    add-int/2addr v3, v0

    add-int v5, v3, v1

    :goto_2
    iput v5, p0, Lk/G0;->g:I

    return-void
.end method
