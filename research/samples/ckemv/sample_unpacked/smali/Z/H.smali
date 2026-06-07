.class public abstract LZ/H;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lv0/m;

.field public b:Landroidx/recyclerview/widget/RecyclerView;

.field public final c:Lv0/c;

.field public final d:Lv0/c;

.field public e:LZ/u;

.field public f:Z

.field public g:Z

.field public final h:Z

.field public final i:Z

.field public j:I

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LZ/F;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LZ/F;-><init>(LZ/H;I)V

    new-instance v1, LZ/F;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, LZ/F;-><init>(LZ/H;I)V

    new-instance v2, Lv0/c;

    invoke-direct {v2, v0}, Lv0/c;-><init>(LZ/F;)V

    iput-object v2, p0, LZ/H;->c:Lv0/c;

    new-instance v0, Lv0/c;

    invoke-direct {v0, v1}, Lv0/c;-><init>(LZ/F;)V

    iput-object v0, p0, LZ/H;->d:Lv0/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, LZ/H;->f:Z

    iput-boolean v0, p0, LZ/H;->g:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, LZ/H;->h:Z

    iput-boolean v0, p0, LZ/H;->i:Z

    return-void
.end method

.method public static F(Landroid/view/View;)I
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, LZ/I;

    iget-object p0, p0, LZ/I;->a:LZ/W;

    invoke-virtual {p0}, LZ/W;->c()I

    move-result p0

    return p0
.end method

.method public static G(Landroid/content/Context;Landroid/util/AttributeSet;II)LZ/G;
    .locals 2

    new-instance v0, LZ/G;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, LY/a;->a:[I

    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, v0, LZ/G;->a:I

    const/16 p3, 0xa

    invoke-virtual {p0, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, v0, LZ/G;->b:I

    const/16 p2, 0x9

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, v0, LZ/G;->c:Z

    const/16 p2, 0xb

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, LZ/G;->d:Z

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method public static K(III)Z
    .locals 3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    if-eq p0, p2, :cond_0

    return v1

    :cond_0
    const/high16 p2, -0x80000000

    const/4 v2, 0x1

    if-eq v0, p2, :cond_4

    if-eqz v0, :cond_3

    const/high16 p2, 0x40000000    # 2.0f

    if-eq v0, p2, :cond_1

    return v1

    :cond_1
    if-ne p1, p0, :cond_2

    move v1, v2

    :cond_2
    return v1

    :cond_3
    return v2

    :cond_4
    if-lt p1, p0, :cond_5

    move v1, v2

    :cond_5
    return v1
.end method

.method public static L(Landroid/view/View;IIII)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LZ/I;

    iget-object v1, v0, LZ/I;->b:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p2, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p3, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p3, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p4, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p4, v0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public static g(III)I
    .locals 2

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    :cond_0
    return p0

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static w(IIIIZ)I
    .locals 4

    sub-int/2addr p0, p2

    const/4 p2, 0x0

    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 v0, -0x2

    const/4 v1, -0x1

    const/high16 v2, -0x80000000

    const/high16 v3, 0x40000000    # 2.0f

    if-eqz p4, :cond_2

    if-ltz p3, :cond_0

    :goto_0
    move p1, v3

    goto :goto_2

    :cond_0
    if-ne p3, v1, :cond_1

    if-eq p1, v2, :cond_4

    if-eqz p1, :cond_1

    if-eq p1, v3, :cond_4

    :cond_1
    move p1, p2

    move p3, p1

    goto :goto_2

    :cond_2
    if-ltz p3, :cond_3

    goto :goto_0

    :cond_3
    if-ne p3, v1, :cond_5

    :cond_4
    move p3, p0

    goto :goto_2

    :cond_5
    if-ne p3, v0, :cond_1

    if-eq p1, v2, :cond_7

    if-ne p1, v3, :cond_6

    goto :goto_1

    :cond_6
    move p3, p0

    move p1, p2

    goto :goto_2

    :cond_7
    :goto_1
    move p3, p0

    move p1, v2

    :goto_2
    invoke-static {p3, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final A()I
    .locals 2

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LJ/C;->d(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public final B()I
    .locals 1

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final C()I
    .locals 1

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final D()I
    .locals 1

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final E()I
    .locals 1

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public H(LZ/N;LZ/T;)I
    .locals 0

    iget-object p1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LZ/H;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    invoke-virtual {p1}, LZ/z;->a()I

    move-result p2

    :cond_1
    :goto_0
    return p2
.end method

.method public final I(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 6

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LZ/I;

    iget-object v0, v0, LZ/I;->b:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    neg-int v1, v1

    iget v2, v0, Landroid/graphics/Rect;->top:I

    neg-int v2, v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    iget v4, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v4, v0

    invoke-virtual {p2, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->k:Landroid/graphics/RectF;

    invoke-virtual {v1, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v0, v1, Landroid/graphics/RectF;->left:F

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v0, v2

    iget v2, v1, Landroid/graphics/RectF;->top:F

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v3, v1, Landroid/graphics/RectF;->right:F

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v1, v4

    invoke-virtual {p2, v0, v2, v3, v1}, Landroid/graphics/Rect;->set(IIII)V

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p2, v0, p1}, Landroid/graphics/Rect;->offset(II)V

    return-void
.end method

.method public J()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public M(I)V
    .locals 4

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v1}, Lv0/m;->p()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v3, v2}, Lv0/m;->o(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public N(I)V
    .locals 4

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v1}, Lv0/m;->p()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    invoke-virtual {v3, v2}, Lv0/m;->o(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public O(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public P(Landroid/view/View;ILZ/N;LZ/T;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public Q(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LZ/z;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public R(LZ/N;LZ/T;Landroid/view/View;LK/p;)V
    .locals 1

    invoke-virtual {p0}, LZ/H;->e()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-static {p3}, LZ/H;->F(Landroid/view/View;)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-virtual {p0}, LZ/H;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p3}, LZ/H;->F(Landroid/view/View;)I

    move-result p3

    goto :goto_1

    :cond_1
    move p3, p2

    :goto_1
    const/4 v0, 0x1

    invoke-static {p1, v0, p3, v0, p2}, LK/o;->a(IIIIZ)LK/o;

    move-result-object p1

    invoke-virtual {p4, p1}, LK/p;->h(LK/o;)V

    return-void
.end method

.method public final S(Landroid/view/View;LK/p;)V
    .locals 2

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZ/W;->j()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LZ/H;->a:Lv0/m;

    iget-object v1, v1, Lv0/m;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v0, v0, LZ/W;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {p0, v1, v0, p1, p2}, LZ/H;->R(LZ/N;LZ/T;Landroid/view/View;LK/p;)V

    :cond_0
    return-void
.end method

.method public T(II)V
    .locals 0

    return-void
.end method

.method public U()V
    .locals 0

    return-void
.end method

.method public V(II)V
    .locals 0

    return-void
.end method

.method public W(II)V
    .locals 0

    return-void
.end method

.method public X(II)V
    .locals 0

    return-void
.end method

.method public abstract Y(LZ/N;LZ/T;)V
.end method

.method public abstract Z(LZ/T;)V
.end method

.method public a0(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public final b(Landroid/view/View;IZ)V
    .locals 8

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p3, :cond_1

    invoke-virtual {v0}, LZ/W;->j()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    invoke-virtual {p3, v0}, Lv0/e;->o(LZ/W;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p3, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    iget-object p3, p3, Lv0/e;->b:Ljava/lang/Object;

    check-cast p3, Ln/k;

    invoke-virtual {p3, v0, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LZ/f0;

    if-nez v3, :cond_2

    invoke-static {}, LZ/f0;->a()LZ/f0;

    move-result-object v3

    invoke-virtual {p3, v0, v3}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget p3, v3, LZ/f0;->a:I

    or-int/2addr p3, v2

    iput p3, v3, LZ/f0;->a:I

    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, LZ/I;

    invoke-virtual {v0}, LZ/W;->r()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_d

    invoke-virtual {v0}, LZ/W;->k()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    iget-object v5, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v6, -0x1

    if-ne v3, v5, :cond_b

    iget-object v3, p0, LZ/H;->a:Lv0/m;

    iget-object v5, v3, Lv0/m;->c:Ljava/lang/Object;

    check-cast v5, LZ/y;

    iget-object v5, v5, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v5

    if-ne v5, v6, :cond_4

    :goto_2
    move v5, v6

    goto :goto_3

    :cond_4
    iget-object v3, v3, Lv0/m;->d:Ljava/lang/Object;

    check-cast v3, LZ/b;

    invoke-virtual {v3, v5}, LZ/b;->d(I)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v3, v5}, LZ/b;->b(I)I

    move-result v3

    sub-int/2addr v5, v3

    :goto_3
    if-ne p2, v6, :cond_6

    iget-object p2, p0, LZ/H;->a:Lv0/m;

    invoke-virtual {p2}, Lv0/m;->p()I

    move-result p2

    :cond_6
    if-eq v5, v6, :cond_a

    if-eq v5, p2, :cond_f

    iget-object p1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {p1, v5}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {p1, v5}, LZ/H;->u(I)Landroid/view/View;

    iget-object v6, p1, LZ/H;->a:Lv0/m;

    invoke-virtual {v6, v5}, Lv0/m;->i(I)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, LZ/I;

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v6

    invoke-virtual {v6}, LZ/W;->j()Z

    move-result v7

    if-eqz v7, :cond_8

    iget-object v7, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    iget-object v7, v7, Lv0/e;->b:Ljava/lang/Object;

    check-cast v7, Ln/k;

    invoke-virtual {v7, v6, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ/f0;

    if-nez v1, :cond_7

    invoke-static {}, LZ/f0;->a()LZ/f0;

    move-result-object v1

    invoke-virtual {v7, v6, v1}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget v7, v1, LZ/f0;->a:I

    or-int/2addr v2, v7

    iput v2, v1, LZ/f0;->a:I

    goto :goto_4

    :cond_8
    iget-object v1, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    invoke-virtual {v1, v6}, Lv0/e;->o(LZ/W;)V

    :goto_4
    iget-object p1, p1, LZ/H;->a:Lv0/m;

    invoke-virtual {v6}, LZ/W;->j()Z

    move-result v1

    invoke-virtual {p1, v3, p2, v5, v1}, Lv0/m;->c(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    goto/16 :goto_7

    :cond_9
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Cannot move a child from non-existing index:"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_a
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    iget-object v1, p0, LZ/H;->a:Lv0/m;

    invoke-virtual {v1, p1, p2, v4}, Lv0/m;->b(Landroid/view/View;IZ)V

    iput-boolean v2, p3, LZ/I;->c:Z

    iget-object p2, p0, LZ/H;->e:LZ/u;

    if-eqz p2, :cond_f

    iget-boolean v1, p2, LZ/u;->e:Z

    if-eqz v1, :cond_f

    iget-object v1, p2, LZ/u;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LZ/W;->c()I

    move-result v6

    :cond_c
    iget v1, p2, LZ/u;->a:I

    if-ne v6, v1, :cond_f

    iput-object p1, p2, LZ/u;->f:Landroid/view/View;

    goto :goto_7

    :cond_d
    :goto_5
    invoke-virtual {v0}, LZ/W;->k()Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, v0, LZ/W;->n:LZ/N;

    invoke-virtual {v1, v0}, LZ/N;->j(LZ/W;)V

    goto :goto_6

    :cond_e
    iget v1, v0, LZ/W;->j:I

    and-int/lit8 v1, v1, -0x21

    iput v1, v0, LZ/W;->j:I

    :goto_6
    iget-object v1, p0, LZ/H;->a:Lv0/m;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v1, p1, p2, v2, v4}, Lv0/m;->c(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    :cond_f
    :goto_7
    iget-boolean p1, p3, LZ/I;->d:Z

    if-eqz p1, :cond_10

    iget-object p1, v0, LZ/W;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    iput-boolean v4, p3, LZ/I;->d:Z

    :cond_10
    return-void
.end method

.method public b0()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->i(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public c0(I)V
    .locals 0

    return-void
.end method

.method public abstract d()Z
.end method

.method public final d0(LZ/N;)V
    .locals 2

    invoke-virtual {p0}, LZ/H;->v()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v1

    invoke-virtual {v1}, LZ/W;->q()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0}, LZ/H;->g0(I)V

    invoke-virtual {p1, v1}, LZ/N;->f(Landroid/view/View;)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abstract e()Z
.end method

.method public final e0(LZ/N;)V
    .locals 6

    iget-object v0, p1, LZ/N;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    :goto_0
    iget-object v2, p1, LZ/N;->a:Ljava/util/ArrayList;

    if-ltz v1, :cond_3

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZ/W;

    iget-object v2, v2, LZ/W;->a:Landroid/view/View;

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v3

    invoke-virtual {v3}, LZ/W;->q()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, LZ/W;->p(Z)V

    invoke-virtual {v3}, LZ/W;->l()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_1
    iget-object v5, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->I:LZ/D;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v3}, LZ/D;->d(LZ/W;)V

    :cond_2
    const/4 v5, 0x1

    invoke-virtual {v3, v5}, LZ/W;->p(Z)V

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v2

    const/4 v3, 0x0

    iput-object v3, v2, LZ/W;->n:LZ/N;

    iput-boolean v4, v2, LZ/W;->o:Z

    iget v3, v2, LZ/W;->j:I

    and-int/lit8 v3, v3, -0x21

    iput v3, v2, LZ/W;->j:I

    invoke-virtual {p1, v2}, LZ/N;->g(LZ/W;)V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p1, LZ/N;->b:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_4
    if-lez v0, :cond_5

    iget-object p1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_5
    return-void
.end method

.method public f(LZ/I;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f0(Landroid/view/View;LZ/N;)V
    .locals 4

    iget-object v0, p0, LZ/H;->a:Lv0/m;

    iget-object v1, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, LZ/y;

    iget-object v2, v1, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v3, LZ/b;

    invoke-virtual {v3, v2}, LZ/b;->g(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, p1}, Lv0/m;->L(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v1, v2}, LZ/y;->h(I)V

    :goto_0
    invoke-virtual {p2, p1}, LZ/N;->f(Landroid/view/View;)V

    return-void
.end method

.method public final g0(I)V
    .locals 4

    invoke-virtual {p0, p1}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LZ/H;->a:Lv0/m;

    invoke-virtual {v0, p1}, Lv0/m;->v(I)I

    move-result p1

    iget-object v1, v0, Lv0/m;->c:Ljava/lang/Object;

    check-cast v1, LZ/y;

    iget-object v2, v1, LZ/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lv0/m;->d:Ljava/lang/Object;

    check-cast v3, LZ/b;

    invoke-virtual {v3, p1}, LZ/b;->g(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Lv0/m;->L(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v1, p1}, LZ/y;->h(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public h(IILZ/T;LC0/b;)V
    .locals 0

    return-void
.end method

.method public h0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 8

    invoke-virtual {p0}, LZ/H;->C()I

    move-result v0

    invoke-virtual {p0}, LZ/H;->E()I

    move-result v1

    iget v2, p0, LZ/H;->n:I

    invoke-virtual {p0}, LZ/H;->D()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, LZ/H;->o:I

    invoke-virtual {p0}, LZ/H;->B()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v4

    iget v5, p3, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v5

    iget v6, p3, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    invoke-virtual {p2}, Landroid/view/View;->getScrollY()I

    move-result p2

    sub-int/2addr v5, p2

    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result p2

    add-int/2addr p2, v4

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    add-int/2addr p3, v5

    sub-int/2addr v4, v0

    const/4 v0, 0x0

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v5, v1

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr p2, v2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr p3, v3

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    invoke-virtual {p0}, LZ/H;->A()I

    move-result v3

    const/4 v7, 0x1

    if-ne v3, v7, :cond_1

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v6, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_0
    move v2, v6

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v5, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_2
    filled-new-array {v2, v1}, [I

    move-result-object p2

    aget p3, p2, v0

    aget p2, p2, v7

    if-eqz p5, :cond_5

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object p5

    if-nez p5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, LZ/H;->C()I

    move-result v1

    invoke-virtual {p0}, LZ/H;->E()I

    move-result v2

    iget v3, p0, LZ/H;->n:I

    invoke-virtual {p0}, LZ/H;->D()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, LZ/H;->o:I

    invoke-virtual {p0}, LZ/H;->B()I

    move-result v5

    sub-int/2addr v4, v5

    iget-object v5, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->i:Landroid/graphics/Rect;

    invoke-virtual {p0, p5, v5}, LZ/H;->y(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p5, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr p5, p3

    if-ge p5, v3, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p3

    if-le p5, v1, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr p5, p2

    if-ge p5, v4, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, p2

    if-gt p5, v2, :cond_5

    goto :goto_3

    :cond_5
    if-nez p3, :cond_7

    if-eqz p2, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    return v0

    :cond_7
    :goto_4
    if-eqz p4, :cond_8

    invoke-virtual {p1, p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    goto :goto_5

    :cond_8
    invoke-virtual {p1, p3, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->b0(IIZ)V

    :goto_5
    return v7
.end method

.method public i(ILC0/b;)V
    .locals 0

    return-void
.end method

.method public final i0()V
    .locals 1

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public abstract j(LZ/T;)I
.end method

.method public abstract j0(ILZ/N;LZ/T;)I
.end method

.method public abstract k(LZ/T;)I
.end method

.method public abstract k0(I)V
.end method

.method public abstract l(LZ/T;)I
.end method

.method public abstract l0(ILZ/N;LZ/T;)I
.end method

.method public abstract m(LZ/T;)I
.end method

.method public final m0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-virtual {p0, v0, p1}, LZ/H;->n0(II)V

    return-void
.end method

.method public abstract n(LZ/T;)I
.end method

.method public final n0(II)V
    .locals 1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, LZ/H;->n:I

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, LZ/H;->l:I

    if-nez p1, :cond_0

    sget-object p1, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, LZ/H;->o:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, LZ/H;->m:I

    if-nez p1, :cond_1

    sget-object p1, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    :cond_1
    return-void
.end method

.method public abstract o(LZ/T;)I
.end method

.method public o0(Landroid/graphics/Rect;II)V
    .locals 3

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, LZ/H;->C()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, LZ/H;->D()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0}, LZ/H;->E()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {p0}, LZ/H;->B()I

    move-result p1

    add-int/2addr p1, v1

    iget-object v1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v2, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, LJ/B;->e(Landroid/view/View;)I

    move-result v1

    invoke-static {p2, v0, v1}, LZ/H;->g(III)I

    move-result p2

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, LJ/B;->d(Landroid/view/View;)I

    move-result v0

    invoke-static {p3, p1, v0}, LZ/H;->g(III)I

    move-result p1

    iget-object p3, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p3, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->e(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public final p(LZ/N;)V
    .locals 4

    invoke-virtual {p0}, LZ/H;->v()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    invoke-virtual {p0, v0}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v2

    invoke-virtual {v2}, LZ/W;->q()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, LZ/W;->h()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, LZ/W;->j()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    iget-boolean v3, v3, LZ/z;->b:Z

    if-nez v3, :cond_1

    invoke-virtual {p0, v0}, LZ/H;->g0(I)V

    invoke-virtual {p1, v2}, LZ/N;->g(LZ/W;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0}, LZ/H;->u(I)Landroid/view/View;

    iget-object v3, p0, LZ/H;->a:Lv0/m;

    invoke-virtual {v3, v0}, Lv0/m;->i(I)V

    invoke-virtual {p1, v1}, LZ/N;->h(Landroid/view/View;)V

    iget-object v1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->g:Lv0/e;

    invoke-virtual {v1, v2}, Lv0/e;->o(LZ/W;)V

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final p0(II)V
    .locals 8

    invoke-virtual {p0}, LZ/H;->v()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    return-void

    :cond_0
    const/high16 v1, -0x80000000

    const v2, 0x7fffffff

    const/4 v3, 0x0

    move v4, v2

    move v5, v3

    move v2, v1

    move v3, v4

    :goto_0
    if-ge v5, v0, :cond_5

    invoke-virtual {p0, v5}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v6

    iget-object v7, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->i:Landroid/graphics/Rect;

    invoke-virtual {p0, v6, v7}, LZ/H;->y(Landroid/view/View;Landroid/graphics/Rect;)V

    iget v6, v7, Landroid/graphics/Rect;->left:I

    if-ge v6, v3, :cond_1

    move v3, v6

    :cond_1
    iget v6, v7, Landroid/graphics/Rect;->right:I

    if-le v6, v1, :cond_2

    move v1, v6

    :cond_2
    iget v6, v7, Landroid/graphics/Rect;->top:I

    if-ge v6, v4, :cond_3

    move v4, v6

    :cond_3
    iget v6, v7, Landroid/graphics/Rect;->bottom:I

    if-le v6, v2, :cond_4

    move v2, v6

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->i:Landroid/graphics/Rect;

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->i:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, p1, p2}, LZ/H;->o0(Landroid/graphics/Rect;II)V

    return-void
.end method

.method public q(I)Landroid/view/View;
    .locals 5

    invoke-virtual {p0}, LZ/H;->v()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-virtual {p0, v1}, LZ/H;->u(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)LZ/W;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, LZ/W;->c()I

    move-result v4

    if-ne v4, p1, :cond_2

    invoke-virtual {v3}, LZ/W;->q()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    iget-boolean v4, v4, LZ/T;->g:Z

    if-nez v4, :cond_1

    invoke-virtual {v3}, LZ/W;->j()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    return-object v2

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final q0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, LZ/H;->a:Lv0/m;

    const/4 p1, 0x0

    iput p1, p0, LZ/H;->n:I

    iput p1, p0, LZ/H;->o:I

    goto :goto_0

    :cond_0
    iput-object p1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->f:Lv0/m;

    iput-object v0, p0, LZ/H;->a:Lv0/m;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, LZ/H;->n:I

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, LZ/H;->o:I

    :goto_0
    const/high16 p1, 0x40000000    # 2.0f

    iput p1, p0, LZ/H;->l:I

    iput p1, p0, LZ/H;->m:I

    return-void
.end method

.method public abstract r()LZ/I;
.end method

.method public final r0(Landroid/view/View;IILZ/I;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, LZ/H;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, LZ/H;->K(III)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, LZ/H;->K(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public s(Landroid/content/Context;Landroid/util/AttributeSet;)LZ/I;
    .locals 1

    new-instance v0, LZ/I;

    invoke-direct {v0, p1, p2}, LZ/I;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public s0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t(Landroid/view/ViewGroup$LayoutParams;)LZ/I;
    .locals 1

    instance-of v0, p1, LZ/I;

    if-eqz v0, :cond_0

    new-instance v0, LZ/I;

    check-cast p1, LZ/I;

    invoke-direct {v0, p1}, LZ/I;-><init>(LZ/I;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    new-instance v0, LZ/I;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, LZ/I;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_1
    new-instance v0, LZ/I;

    invoke-direct {v0, p1}, LZ/I;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final t0(Landroid/view/View;IILZ/I;)Z
    .locals 2

    iget-boolean v0, p0, LZ/H;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, LZ/H;->K(III)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, LZ/H;->K(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final u(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LZ/H;->a:Lv0/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lv0/m;->o(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public abstract u0(Landroidx/recyclerview/widget/RecyclerView;I)V
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, LZ/H;->a:Lv0/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lv0/m;->p()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final v0(LZ/u;)V
    .locals 3

    iget-object v0, p0, LZ/H;->e:LZ/u;

    if-eqz v0, :cond_0

    if-eq p1, v0, :cond_0

    iget-boolean v1, v0, LZ/u;->e:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LZ/u;->i()V

    :cond_0
    iput-object p1, p0, LZ/H;->e:LZ/u;

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    iget-object v2, v1, LZ/V;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, v1, LZ/V;->d:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    iput-object v0, p1, LZ/u;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p0, p1, LZ/u;->c:LZ/H;

    iget v1, p1, LZ/u;->a:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    iput v1, v2, LZ/T;->a:I

    const/4 v2, 0x1

    iput-boolean v2, p1, LZ/u;->e:Z

    iput-boolean v2, p1, LZ/u;->d:Z

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    invoke-virtual {v0, v1}, LZ/H;->q(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, LZ/u;->f:Landroid/view/View;

    iget-object p1, p1, LZ/u;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    invoke-virtual {p1}, LZ/V;->a()V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid target position"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public w0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x(LZ/N;LZ/T;)I
    .locals 0

    iget-object p1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LZ/H;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    invoke-virtual {p1}, LZ/z;->a()I

    move-result p2

    :cond_1
    :goto_0
    return p2
.end method

.method public y(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 6

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->t0:[I

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LZ/I;

    iget-object v1, v0, LZ/I;->b:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    iget v3, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v3

    iget v4, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v4

    iget v5, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v5

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    invoke-virtual {p2, v2, v3, v4, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()LZ/z;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LZ/z;->a()I

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method
