.class public Landroidx/core/widget/NestedScrollView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements LJ/p;


# static fields
.field public static final B:F

.field public static final C:LN/i;

.field public static final D:[I


# instance fields
.field public A:F

.field public final b:F

.field public c:J

.field public final d:Landroid/graphics/Rect;

.field public final e:Landroid/widget/OverScroller;

.field public final f:Landroid/widget/EdgeEffect;

.field public final g:Landroid/widget/EdgeEffect;

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Landroid/view/View;

.field public l:Z

.field public m:Landroid/view/VelocityTracker;

.field public n:Z

.field public o:Z

.field public final p:I

.field public final q:I

.field public final r:I

.field public s:I

.field public final t:[I

.field public final u:[I

.field public v:I

.field public w:I

.field public x:LN/l;

.field public final y:LA1/i;

.field public final z:LJ/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide v0, 0x3fe8f5c28f5c28f6L    # 0.78

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    double-to-float v0, v0

    sput v0, Landroidx/core/widget/NestedScrollView;->B:F

    new-instance v0, LN/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN/i;-><init>(I)V

    sput-object v0, Landroidx/core/widget/NestedScrollView;->C:LN/i;

    const v0, 0x101017a

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/core/widget/NestedScrollView;->D:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    const v0, 0x7f03031e

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/core/widget/NestedScrollView;->d:Landroid/graphics/Rect;

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->i:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Landroidx/core/widget/NestedScrollView;->j:Z

    const/4 v3, 0x0

    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->k:Landroid/view/View;

    iput-boolean v2, p0, Landroidx/core/widget/NestedScrollView;->l:Z

    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->o:Z

    const/4 v3, -0x1

    iput v3, p0, Landroidx/core/widget/NestedScrollView;->s:I

    const/4 v3, 0x2

    new-array v4, v3, [I

    iput-object v4, p0, Landroidx/core/widget/NestedScrollView;->t:[I

    new-array v3, v3, [I

    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->u:[I

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v3, v4, :cond_0

    invoke-static {p1, p2}, LN/e;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v5

    goto :goto_0

    :cond_0
    new-instance v5, Landroid/widget/EdgeEffect;

    invoke-direct {v5, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object v5, p0, Landroidx/core/widget/NestedScrollView;->f:Landroid/widget/EdgeEffect;

    if-lt v3, v4, :cond_1

    invoke-static {p1, p2}, LN/e;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v3

    goto :goto_1

    :cond_1
    new-instance v3, Landroid/widget/EdgeEffect;

    invoke-direct {v3, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    :goto_1
    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->g:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    const/high16 v4, 0x43200000    # 160.0f

    mul-float/2addr v3, v4

    const v4, 0x43c10b3d

    mul-float/2addr v3, v4

    const v4, 0x3f570a3d    # 0.84f

    mul-float/2addr v3, v4

    iput v3, p0, Landroidx/core/widget/NestedScrollView;->b:F

    new-instance v3, Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    const/high16 v3, 0x40000

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v4

    iput v4, p0, Landroidx/core/widget/NestedScrollView;->p:I

    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v4

    iput v4, p0, Landroidx/core/widget/NestedScrollView;->q:I

    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v3

    iput v3, p0, Landroidx/core/widget/NestedScrollView;->r:I

    sget-object v3, Landroidx/core/widget/NestedScrollView;->D:[I

    invoke-virtual {p1, p2, v3, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->setFillViewport(Z)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p1, LA1/i;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, LA1/i;-><init>(I)V

    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->y:LA1/i;

    new-instance p1, LJ/n;

    invoke-direct {p1, p0}, LJ/n;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {p0, v1}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    sget-object p1, Landroidx/core/widget/NestedScrollView;->C:LN/i;

    invoke-static {p0, p1}, LJ/T;->l(Landroid/view/View;LJ/c;)V

    return-void
.end method

.method private getVerticalScrollFactorCompat()F
    .locals 5

    iget v0, p0, Landroidx/core/widget/NestedScrollView;->A:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x101004d

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->A:F

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected theme to define listPreferredItemHeight."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->A:F

    return v0
.end method

.method public static l(Landroid/view/View;Landroid/view/View;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    check-cast p0, Landroid/view/View;

    invoke-static {p0, p1}, Landroidx/core/widget/NestedScrollView;->l(Landroid/view/View;Landroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    const/4 p1, 0x1

    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->y:LA1/i;

    if-ne p4, p1, :cond_0

    iput p3, p2, LA1/i;->c:I

    goto :goto_0

    :cond_0
    iput p3, p2, LA1/i;->b:I

    :goto_0
    const/4 p1, 0x2

    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {p2, p1, p4}, LJ/n;->h(II)Z

    return-void
.end method

.method public final addView(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ScrollView can host only one direct child"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 5
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 11
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 8
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Landroid/view/View;IIIII[I)V
    .locals 0

    invoke-virtual {p0, p5, p6, p7}, Landroidx/core/widget/NestedScrollView;->n(II[I)V

    return-void
.end method

.method public final c(Landroid/view/View;IIIII)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p5, p6, p1}, Landroidx/core/widget/NestedScrollView;->n(II[I)V

    return-void
.end method

.method public final computeHorizontalScrollExtent()I
    .locals 1

    invoke-super {p0}, Landroid/view/View;->computeHorizontalScrollExtent()I

    move-result v0

    return v0
.end method

.method public final computeHorizontalScrollOffset()I
    .locals 1

    invoke-super {p0}, Landroid/view/View;->computeHorizontalScrollOffset()I

    move-result v0

    return v0
.end method

.method public final computeHorizontalScrollRange()I
    .locals 1

    invoke-super {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    move-result v0

    return v0
.end method

.method public final computeScroll()V
    .locals 15

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v1

    iget v2, p0, Landroidx/core/widget/NestedScrollView;->w:I

    sub-int v2, v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->g:Landroid/widget/EdgeEffect;

    iget-object v5, p0, Landroidx/core/widget/NestedScrollView;->f:Landroid/widget/EdgeEffect;

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x0

    const/high16 v8, 0x40800000    # 4.0f

    if-lez v2, :cond_2

    invoke-static {v5}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v9

    cmpl-float v9, v9, v7

    if-eqz v9, :cond_2

    neg-int v7, v2

    int-to-float v7, v7

    mul-float/2addr v7, v8

    int-to-float v9, v3

    div-float/2addr v7, v9

    neg-int v3, v3

    int-to-float v3, v3

    div-float/2addr v3, v8

    invoke-static {v5, v7, v6}, Lv0/f;->G(Landroid/widget/EdgeEffect;FF)F

    move-result v6

    mul-float/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v3

    if-eq v3, v2, :cond_1

    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->finish()V

    :cond_1
    :goto_0
    sub-int/2addr v2, v3

    goto :goto_1

    :cond_2
    if-gez v2, :cond_3

    invoke-static {v4}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v9

    cmpl-float v7, v9, v7

    if-eqz v7, :cond_3

    int-to-float v7, v2

    mul-float/2addr v7, v8

    int-to-float v3, v3

    div-float/2addr v7, v3

    div-float/2addr v3, v8

    invoke-static {v4, v7, v6}, Lv0/f;->G(Landroid/widget/EdgeEffect;FF)F

    move-result v6

    mul-float/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v3

    if-eq v3, v2, :cond_1

    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->finish()V

    goto :goto_0

    :cond_3
    :goto_1
    iput v1, p0, Landroidx/core/widget/NestedScrollView;->w:I

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->u:[I

    const/4 v3, 0x1

    const/4 v12, 0x0

    aput v12, v1, v3

    const/4 v10, 0x0

    iget-object v6, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    const/4 v7, 0x0

    const/4 v11, 0x1

    move v8, v2

    move-object v9, v1

    invoke-virtual/range {v6 .. v11}, LJ/n;->c(II[I[II)Z

    aget v6, v1, v3

    sub-int/2addr v2, v6

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v14

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v7

    invoke-virtual {p0, v2, v7, v6, v14}, Landroidx/core/widget/NestedScrollView;->p(IIII)Z

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v7

    sub-int v8, v7, v6

    sub-int/2addr v2, v8

    aput v12, v1, v3

    const/4 v7, 0x0

    const/4 v9, 0x0

    iget-object v6, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    iget-object v11, p0, Landroidx/core/widget/NestedScrollView;->t:[I

    const/4 v12, 0x1

    move v10, v2

    move-object v13, v1

    invoke-virtual/range {v6 .. v13}, LJ/n;->e(IIII[II[I)Z

    aget v1, v1, v3

    sub-int/2addr v2, v1

    :cond_4
    if-eqz v2, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v1

    if-eqz v1, :cond_5

    if-ne v1, v3, :cond_7

    if-lez v14, :cond_7

    :cond_5
    if-gez v2, :cond_6

    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v5, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_2

    :cond_6
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v4, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_7
    :goto_2
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    invoke-virtual {p0, v3}, Landroidx/core/widget/NestedScrollView;->w(I)V

    :cond_8
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->k(Landroid/view/View;)V

    goto :goto_3

    :cond_9
    invoke-virtual {p0, v3}, Landroidx/core/widget/NestedScrollView;->w(I)V

    :goto_3
    return-void
.end method

.method public final computeVerticalScrollExtent()I
    .locals 1

    invoke-super {p0}, Landroid/view/View;->computeVerticalScrollExtent()I

    move-result v0

    return v0
.end method

.method public final computeVerticalScrollOffset()I
    .locals 2

    const/4 v0, 0x0

    invoke-super {p0}, Landroid/view/View;->computeVerticalScrollOffset()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final computeVerticalScrollRange()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    iget v3, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    sub-int v1, v2, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-gez v3, :cond_1

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_1
    if-le v3, v0, :cond_2

    sub-int/2addr v3, v0

    add-int/2addr v2, v3

    :cond_2
    :goto_0
    return v2
.end method

.method public final d(Landroid/view/View;I)V
    .locals 2

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->y:LA1/i;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    iput v1, p1, LA1/i;->c:I

    goto :goto_0

    :cond_0
    iput v1, p1, LA1/i;->b:I

    :goto_0
    invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->w(I)V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

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

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {v0, p1, p2, p3}, LJ/n;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {v0, p1, p2}, LJ/n;->b(FF)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    const/4 v5, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, LJ/n;->c(II[I[II)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v7}, LJ/n;->e(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 10

    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->f:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {p0}, LN/j;->a(Landroid/view/ViewGroup;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v8

    add-int/2addr v8, v7

    sub-int/2addr v4, v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    goto :goto_0

    :cond_0
    move v7, v3

    :goto_0
    invoke-static {p0}, LN/j;->a(Landroid/view/ViewGroup;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    add-int/2addr v9, v8

    sub-int/2addr v5, v9

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    add-int/2addr v6, v8

    :cond_1
    int-to-float v7, v7

    int-to-float v6, v6

    invoke-virtual {p1, v7, v6}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {v1, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V

    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_2
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_3
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->g:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v6

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v5

    invoke-static {p0}, LN/j;->a(Landroid/view/ViewGroup;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    add-int/2addr v6, v3

    sub-int/2addr v4, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    :cond_4
    invoke-static {p0}, LN/j;->a(Landroid/view/ViewGroup;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    add-int/2addr v7, v6

    sub-int/2addr v5, v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v0, v6

    :cond_5
    sub-int/2addr v3, v4

    int-to-float v3, v3

    int-to-float v0, v0

    invoke-virtual {p1, v3, v0}, Landroid/graphics/Canvas;->translate(FF)V

    int-to-float v0, v4

    const/4 v3, 0x0

    const/high16 v6, 0x43340000    # 180.0f

    invoke-virtual {p1, v6, v0, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    invoke-virtual {v1, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V

    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_6
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_7
    return-void
.end method

.method public final e(Landroid/view/View;II[II)V
    .locals 6

    const/4 v4, 0x0

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, LJ/n;->c(II[I[II)Z

    return-void
.end method

.method public final f(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g(I)Z
    .locals 8

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    :cond_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getMaxScrollAmount()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {p0, v1, v2, v5}, Landroidx/core/widget/NestedScrollView;->m(Landroid/view/View;II)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->d:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->h(Landroid/graphics/Rect;)I

    move-result v2

    invoke-virtual {p0, v2, v4, v3, v3}, Landroidx/core/widget/NestedScrollView;->s(IIIZ)I

    invoke-virtual {v1, p1}, Landroid/view/View;->requestFocus(I)Z

    goto :goto_2

    :cond_1
    const/16 v1, 0x21

    const/16 v5, 0x82

    if-ne p1, v1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-ge v1, v2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    goto :goto_0

    :cond_2
    if-ne p1, v5, :cond_3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    iget v6, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v6

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v7, v6

    sub-int/2addr v1, v7

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_3
    :goto_0
    if-nez v2, :cond_4

    return v4

    :cond_4
    if-ne p1, v5, :cond_5

    goto :goto_1

    :cond_5
    neg-int v2, v2

    :goto_1
    invoke-virtual {p0, v2, v4, v3, v3}, Landroidx/core/widget/NestedScrollView;->s(IIIZ)I

    :goto_2
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {p0, v0, v4, p1}, Landroidx/core/widget/NestedScrollView;->m(Landroid/view/View;II)Z

    move-result p1

    xor-int/2addr p1, v3

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result p1

    const/high16 v0, 0x20000

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    :cond_6
    return v3
.end method

.method public getBottomFadingEdgeStrength()F
    .locals 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int/2addr v0, v1

    sub-int/2addr v0, v3

    if-ge v0, v2, :cond_1

    int-to-float v0, v0

    int-to-float v1, v2

    div-float/2addr v0, v1

    return v0

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getMaxScrollAmount()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public getNestedScrollAxes()I
    .locals 2

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:LA1/i;

    iget v1, v0, LA1/i;->b:I

    iget v0, v0, LA1/i;->c:I

    or-int/2addr v0, v1

    return v0
.end method

.method public getScrollRange()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v3

    iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_0
    return v1
.end method

.method public getTopFadingEdgeStrength()F
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-ge v1, v0, :cond_1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    return v1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final h(Landroid/graphics/Rect;)I
    .locals 10

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    add-int v3, v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v4

    iget v5, p1, Landroid/graphics/Rect;->top:I

    if-lez v5, :cond_1

    add-int/2addr v2, v4

    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v8

    iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v8, v9

    iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v8, v9

    if-ge v7, v8, :cond_2

    sub-int v4, v3, v4

    goto :goto_0

    :cond_2
    move v4, v3

    :goto_0
    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    if-le v7, v4, :cond_4

    iget v8, p1, Landroid/graphics/Rect;->top:I

    if-le v8, v2, :cond_4

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-le v1, v0, :cond_3

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, v2

    goto :goto_1

    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, v4

    :goto_1
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    sub-int/2addr v0, v3

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    :cond_4
    iget v3, p1, Landroid/graphics/Rect;->top:I

    if-ge v3, v2, :cond_6

    if-ge v7, v4, :cond_6

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-le v3, v0, :cond_5

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, p1

    sub-int/2addr v1, v4

    goto :goto_2

    :cond_5
    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, p1

    sub-int/2addr v1, v2

    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    neg-int p1, p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result v1

    :cond_6
    :goto_3
    return v1
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LJ/n;->g(I)Z

    move-result v0

    return v0
.end method

.method public final i(Landroid/view/KeyEvent;)Z
    .locals 5

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x82

    if-lez v0, :cond_b

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v4, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v4

    iget v3, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    if-le v0, v3, :cond_b

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v3, 0x13

    const/16 v4, 0x21

    if-eq v0, v3, :cond_8

    const/16 v3, 0x14

    if-eq v0, v3, :cond_6

    const/16 v3, 0x3e

    if-eq v0, v3, :cond_4

    const/16 p1, 0x5c

    if-eq v0, p1, :cond_3

    const/16 p1, 0x5d

    if-eq v0, p1, :cond_2

    const/16 p1, 0x7a

    if-eq v0, p1, :cond_1

    const/16 p1, 0x7b

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->q(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->q(I)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->k(I)Z

    move-result v1

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->k(I)Z

    move-result v1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result p1

    if-eqz p1, :cond_5

    move v2, v4

    :cond_5
    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->q(I)V

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->k(I)Z

    move-result v1

    goto :goto_0

    :cond_7
    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->g(I)Z

    move-result v1

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->k(I)Z

    move-result v1

    goto :goto_0

    :cond_9
    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->g(I)Z

    move-result v1

    :cond_a
    :goto_0
    return v1

    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_d

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-ne p1, p0, :cond_c

    const/4 p1, 0x0

    :cond_c
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p1, v2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_d

    if-eq p1, p0, :cond_d

    invoke-virtual {p1, v2}, Landroid/view/View;->requestFocus(I)Z

    move-result p1

    if-eqz p1, :cond_d

    const/4 v1, 0x1

    :cond_d
    return v1
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    iget-boolean v0, v0, LJ/n;->d:Z

    return v0
.end method

.method public final j(I)V
    .locals 12

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v5, p1

    invoke-virtual/range {v1 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    const/4 p1, 0x2

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, LJ/n;->h(II)Z

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->w:I

    sget-object p1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final k(I)Z
    .locals 5

    const/16 v0, 0x82

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->d:Landroid/graphics/Rect;

    iput v1, v4, Landroid/graphics/Rect;->top:I

    iput v3, v4, Landroid/graphics/Rect;->bottom:I

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, v4, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v3

    iput v1, v4, Landroid/graphics/Rect;->top:I

    :cond_1
    iget v0, v4, Landroid/graphics/Rect;->top:I

    iget v1, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, p1, v0, v1}, Landroidx/core/widget/NestedScrollView;->r(III)Z

    move-result p1

    return p1
.end method

.method public final m(Landroid/view/View;II)Z
    .locals 2

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->d:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-lt p1, v1, :cond_0

    iget p1, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    add-int/2addr p2, p3

    if-gt p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final measureChild(Landroid/view/View;II)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v0

    iget p3, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {p2, v1, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    const/4 p3, 0x0

    invoke-static {p3, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public final measureChildWithMargins(Landroid/view/View;IIII)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    add-int/2addr v0, p5

    iget p5, p4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, p5

    iget p5, p4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, p5

    add-int/2addr v0, p3

    iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {p2, v0, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget p4, p4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p3, p4

    const/4 p4, 0x0

    invoke-static {p3, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public final n(II[I)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->scrollBy(II)V

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int/2addr v1, v0

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    aget v2, p3, v0

    add-int/2addr v2, v1

    aput v2, p3, v0

    :cond_0
    sub-int/2addr p1, v1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {v0, v1, p1, p2, p3}, LJ/n;->d(III[I)V

    return-void
.end method

.method public final o(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Landroidx/core/widget/NestedScrollView;->s:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Landroidx/core/widget/NestedScrollView;->h:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->s:I

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    :cond_1
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->j:Z

    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne v0, v1, :cond_4

    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->l:Z

    if-nez v0, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/4 v1, 0x2

    and-int/2addr v0, v1

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const/4 v4, 0x0

    if-eqz v0, :cond_1

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/high16 v5, 0x400000

    and-int/2addr v0, v5

    if-ne v0, v5, :cond_2

    const/16 v0, 0x1a

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    div-int/lit8 v1, v5, 0x2

    goto :goto_1

    :cond_2
    move v1, v2

    move v0, v4

    :goto_1
    cmpl-float v4, v0, v4

    if-eqz v4, :cond_4

    invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->getVerticalScrollFactorCompat()F

    move-result v4

    mul-float/2addr v0, v4

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const/16 v4, 0x2002

    and-int/2addr p1, v4

    if-ne p1, v4, :cond_3

    move v2, v3

    :cond_3
    neg-int p1, v0

    invoke-virtual {p0, p1, v1, v3, v2}, Landroidx/core/widget/NestedScrollView;->s(IIIZ)I

    return v3

    :cond_4
    return v2
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    iget-boolean v4, p0, Landroidx/core/widget/NestedScrollView;->l:Z

    if-eqz v4, :cond_0

    return v2

    :cond_0
    and-int/lit16 v1, v1, 0xff

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_9

    const/4 v0, -0x1

    if-eq v1, v2, :cond_6

    if-eq v1, v3, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_6

    const/4 v0, 0x6

    if-eq v1, v0, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->o(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    :cond_2
    iget v1, p0, Landroidx/core/widget/NestedScrollView;->s:I

    if-ne v1, v0, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    if-ne v1, v0, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Landroidx/core/widget/NestedScrollView;->h:I

    sub-int v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v4, p0, Landroidx/core/widget/NestedScrollView;->p:I

    if-le v1, v4, :cond_10

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getNestedScrollAxes()I

    move-result v1

    and-int/2addr v1, v3

    if-nez v1, :cond_10

    iput-boolean v2, p0, Landroidx/core/widget/NestedScrollView;->l:Z

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->h:I

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-nez v0, :cond_5

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    :cond_5
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iput v5, p0, Landroidx/core/widget/NestedScrollView;->v:I

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_3

    :cond_6
    iput-boolean v5, p0, Landroidx/core/widget/NestedScrollView;->l:Z

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->s:I

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v4, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    :cond_7
    iget-object v6, p0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v8

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v12

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v6 .. v12}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object p1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_8
    invoke-virtual {p0, v5}, Landroidx/core/widget/NestedScrollView;->w(I)V

    goto/16 :goto_3

    :cond_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    if-lez v7, :cond_d

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v7

    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    move-result v9

    sub-int/2addr v9, v7

    if-lt v1, v9, :cond_d

    invoke-virtual {v8}, Landroid/view/View;->getBottom()I

    move-result v9

    sub-int/2addr v9, v7

    if-ge v1, v9, :cond_d

    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    move-result v7

    if-lt v6, v7, :cond_d

    invoke-virtual {v8}, Landroid/view/View;->getRight()I

    move-result v7

    if-ge v6, v7, :cond_d

    iput v1, p0, Landroidx/core/widget/NestedScrollView;->h:I

    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, p0, Landroidx/core/widget/NestedScrollView;->s:I

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-nez v1, :cond_a

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v1

    iput-object v1, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    goto :goto_0

    :cond_a
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    :goto_0
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    invoke-virtual {v1, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->v(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_c

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_1

    :cond_b
    move v2, v5

    :cond_c
    :goto_1
    iput-boolean v2, p0, Landroidx/core/widget/NestedScrollView;->l:Z

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {p1, v3, v5}, LJ/n;->h(II)Z

    goto :goto_3

    :cond_d
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->v(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_f

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_2

    :cond_e
    move v2, v5

    :cond_f
    :goto_2
    iput-boolean v2, p0, Landroidx/core/widget/NestedScrollView;->l:Z

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v4, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    :cond_10
    :goto_3
    iget-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->l:Z

    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->i:Z

    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->k:Landroid/view/View;

    if-eqz p2, :cond_0

    invoke-static {p2, p0}, Landroidx/core/widget/NestedScrollView;->l(Landroid/view/View;Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->k:Landroid/view/View;

    iget-object p4, p0, Landroidx/core/widget/NestedScrollView;->d:Landroid/graphics/Rect;

    invoke-virtual {p2, p4}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    invoke-virtual {p0, p2, p4}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p0, p4}, Landroidx/core/widget/NestedScrollView;->h(Landroid/graphics/Rect;)I

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollBy(II)V

    :cond_0
    const/4 p2, 0x0

    iput-object p2, p0, Landroidx/core/widget/NestedScrollView;->k:Landroid/view/View;

    iget-boolean p4, p0, Landroidx/core/widget/NestedScrollView;->j:Z

    if-nez p4, :cond_6

    iget-object p4, p0, Landroidx/core/widget/NestedScrollView;->x:LN/l;

    if-eqz p4, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p4

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->x:LN/l;

    iget v0, v0, LN/l;->b:I

    invoke-virtual {p0, p4, v0}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    iput-object p2, p0, Landroidx/core/widget/NestedScrollView;->x:LN/l;

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_2

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    iget v0, p4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr p2, v0

    iget p4, p4, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr p2, p4

    goto :goto_0

    :cond_2
    move p2, p1

    :goto_0
    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p3

    if-ge p5, p2, :cond_5

    if-gez p3, :cond_3

    goto :goto_1

    :cond_3
    add-int p1, p5, p3

    if-le p1, p2, :cond_4

    sub-int p1, p2, p5

    goto :goto_1

    :cond_4
    move p1, p3

    :cond_5
    :goto_1
    if-eq p1, p3, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p2

    invoke-virtual {p0, p2, p1}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->j:Z

    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->n:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_2

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v2, v3

    if-ge v1, v2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr v3, v1

    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    invoke-static {p1, v3, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/view/View;->measure(II)V

    :cond_2
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    if-nez p4, :cond_0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p3, p2}, Landroidx/core/widget/NestedScrollView;->dispatchNestedFling(FFZ)Z

    float-to-int p1, p3

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->j(I)V

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {p1, p2, p3}, LJ/n;->b(FF)Z

    move-result p1

    return p1
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 6

    const/4 v4, 0x0

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    const/4 v5, 0x0

    move v1, p2

    move v2, p3

    move-object v3, p4

    invoke-virtual/range {v0 .. v5}, LJ/n;->c(II[I[II)Z

    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-virtual {p0, p5, p1, p2}, Landroidx/core/widget/NestedScrollView;->n(II[I)V

    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public final onOverScrolled(IIZZ)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    const/16 p1, 0x82

    goto :goto_0

    :cond_0
    if-ne p1, v1, :cond_1

    const/16 p1, 0x21

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p2, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v0

    :goto_1
    const/4 v2, 0x0

    if-nez v0, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0, v0, v2, v3}, Landroidx/core/widget/NestedScrollView;->m(Landroid/view/View;II)Z

    move-result v3

    xor-int/2addr v1, v3

    if-eqz v1, :cond_4

    return v2

    :cond_4
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, LN/l;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, LN/l;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->x:LN/l;

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->requestLayout()V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, LN/l;

    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    iput v0, v1, LN/l;->b:I

    return-object v1
.end method

.method public final onScrollChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onScrollChanged(IIII)V

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p4}, Landroidx/core/widget/NestedScrollView;->m(Landroid/view/View;II)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Landroidx/core/widget/NestedScrollView;->d:Landroid/graphics/Rect;

    invoke-virtual {p1, p3}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    invoke-virtual {p0, p1, p3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p0, p3}, Landroidx/core/widget/NestedScrollView;->h(Landroid/graphics/Rect;)I

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p3, p0, Landroidx/core/widget/NestedScrollView;->o:Z

    if-eqz p3, :cond_1

    invoke-virtual {p0, p2, p1, p2}, Landroidx/core/widget/NestedScrollView;->u(IIZ)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->scrollBy(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/core/widget/NestedScrollView;->f(Landroid/view/View;Landroid/view/View;II)Z

    move-result p1

    return p1
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;->d(Landroid/view/View;I)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    iget v3, v0, Landroidx/core/widget/NestedScrollView;->p:I

    iget-object v4, v0, Landroidx/core/widget/NestedScrollView;->f:Landroid/widget/EdgeEffect;

    iget-object v5, v0, Landroidx/core/widget/NestedScrollView;->g:Landroid/widget/EdgeEffect;

    iget-object v6, v0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-nez v6, :cond_0

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v6

    iput-object v6, v0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_1

    iput v7, v0, Landroidx/core/widget/NestedScrollView;->v:I

    :cond_1
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v8

    iget v9, v0, Landroidx/core/widget/NestedScrollView;->v:I

    int-to-float v9, v9

    const/4 v10, 0x0

    invoke-virtual {v8, v10, v9}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    iget-object v9, v0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    const/4 v11, 0x1

    const/4 v12, 0x2

    if-eqz v6, :cond_19

    const/4 v2, 0x0

    const/4 v13, -0x1

    if-eq v6, v11, :cond_11

    if-eq v6, v12, :cond_7

    const/4 v3, 0x3

    if-eq v6, v3, :cond_4

    const/4 v2, 0x5

    if-eq v6, v2, :cond_3

    const/4 v2, 0x6

    if-eq v6, v2, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-virtual/range {p0 .. p1}, Landroidx/core/widget/NestedScrollView;->o(Landroid/view/MotionEvent;)V

    iget v2, v0, Landroidx/core/widget/NestedScrollView;->s:I

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Landroidx/core/widget/NestedScrollView;->h:I

    goto/16 :goto_3

    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    float-to-int v3, v3

    iput v3, v0, Landroidx/core/widget/NestedScrollView;->h:I

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, v0, Landroidx/core/widget/NestedScrollView;->s:I

    goto/16 :goto_3

    :cond_4
    iget-boolean v1, v0, Landroidx/core/widget/NestedScrollView;->l:Z

    if-eqz v1, :cond_5

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_5

    iget-object v14, v0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v16

    invoke-virtual/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v20

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-virtual/range {v14 .. v20}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static/range {p0 .. p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_5
    iput v13, v0, Landroidx/core/widget/NestedScrollView;->s:I

    iput-boolean v7, v0, Landroidx/core/widget/NestedScrollView;->l:Z

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v2, v0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    :cond_6
    invoke-virtual {v0, v7}, Landroidx/core/widget/NestedScrollView;->w(I)V

    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->onRelease()V

    goto/16 :goto_3

    :cond_7
    iget v2, v0, Landroidx/core/widget/NestedScrollView;->s:I

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    if-ne v2, v13, :cond_8

    goto/16 :goto_3

    :cond_8
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    float-to-int v6, v6

    iget v9, v0, Landroidx/core/widget/NestedScrollView;->h:I

    sub-int/2addr v9, v6

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v12

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v13

    int-to-float v13, v13

    div-float/2addr v12, v13

    int-to-float v13, v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v14

    int-to-float v14, v14

    div-float/2addr v13, v14

    invoke-static {v4}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v14

    cmpl-float v14, v14, v10

    if-eqz v14, :cond_a

    neg-float v5, v13

    invoke-static {v4, v5, v12}, Lv0/f;->G(Landroid/widget/EdgeEffect;FF)F

    move-result v5

    neg-float v5, v5

    invoke-static {v4}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v12

    cmpl-float v10, v12, v10

    if-nez v10, :cond_9

    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_9
    move v10, v5

    goto :goto_0

    :cond_a
    invoke-static {v5}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpl-float v4, v4, v10

    if-eqz v4, :cond_c

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float/2addr v4, v12

    invoke-static {v5, v13, v4}, Lv0/f;->G(Landroid/widget/EdgeEffect;FF)F

    move-result v4

    invoke-static {v5}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v12

    cmpl-float v10, v12, v10

    if-nez v10, :cond_b

    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_b
    move v10, v4

    :cond_c
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v10, v4

    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    :cond_d
    sub-int/2addr v9, v4

    iget-boolean v4, v0, Landroidx/core/widget/NestedScrollView;->l:Z

    if-nez v4, :cond_10

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v4

    if-le v4, v3, :cond_10

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-interface {v4, v11}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_e
    iput-boolean v11, v0, Landroidx/core/widget/NestedScrollView;->l:Z

    if-lez v9, :cond_f

    sub-int/2addr v9, v3

    goto :goto_1

    :cond_f
    add-int/2addr v9, v3

    :cond_10
    :goto_1
    iget-boolean v3, v0, Landroidx/core/widget/NestedScrollView;->l:Z

    if-eqz v3, :cond_1d

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v9, v1, v7, v7}, Landroidx/core/widget/NestedScrollView;->s(IIIZ)I

    move-result v1

    sub-int/2addr v6, v1

    iput v6, v0, Landroidx/core/widget/NestedScrollView;->h:I

    iget v2, v0, Landroidx/core/widget/NestedScrollView;->v:I

    add-int/2addr v2, v1

    iput v2, v0, Landroidx/core/widget/NestedScrollView;->v:I

    goto/16 :goto_3

    :cond_11
    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    iget v3, v0, Landroidx/core/widget/NestedScrollView;->r:I

    int-to-float v3, v3

    const/16 v6, 0x3e8

    invoke-virtual {v1, v6, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    iget v3, v0, Landroidx/core/widget/NestedScrollView;->s:I

    invoke-virtual {v1, v3}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v6, v0, Landroidx/core/widget/NestedScrollView;->q:I

    if-lt v3, v6, :cond_16

    invoke-static {v4}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v3

    cmpl-float v3, v3, v10

    if-eqz v3, :cond_13

    invoke-virtual {v0, v4, v1}, Landroidx/core/widget/NestedScrollView;->t(Landroid/widget/EdgeEffect;I)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v4, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_2

    :cond_12
    neg-int v1, v1

    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->j(I)V

    goto :goto_2

    :cond_13
    invoke-static {v5}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v3

    cmpl-float v3, v3, v10

    if-eqz v3, :cond_15

    neg-int v1, v1

    invoke-virtual {v0, v5, v1}, Landroidx/core/widget/NestedScrollView;->t(Landroid/widget/EdgeEffect;I)Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-virtual {v5, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_2

    :cond_14
    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->j(I)V

    goto :goto_2

    :cond_15
    neg-int v1, v1

    int-to-float v3, v1

    invoke-virtual {v9, v10, v3}, LJ/n;->b(FF)Z

    move-result v6

    if-nez v6, :cond_17

    invoke-virtual {v0, v10, v3, v11}, Landroidx/core/widget/NestedScrollView;->dispatchNestedFling(FFZ)Z

    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->j(I)V

    goto :goto_2

    :cond_16
    iget-object v14, v0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v16

    invoke-virtual/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v20

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-virtual/range {v14 .. v20}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result v1

    if-eqz v1, :cond_17

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static/range {p0 .. p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_17
    :goto_2
    iput v13, v0, Landroidx/core/widget/NestedScrollView;->s:I

    iput-boolean v7, v0, Landroidx/core/widget/NestedScrollView;->l:Z

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v2, v0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    :cond_18
    invoke-virtual {v0, v7}, Landroidx/core/widget/NestedScrollView;->w(I)V

    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_3

    :cond_19
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-nez v3, :cond_1a

    return v7

    :cond_1a
    iget-boolean v3, v0, Landroidx/core/widget/NestedScrollView;->l:Z

    if-eqz v3, :cond_1b

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_1b

    invoke-interface {v3, v11}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1b
    invoke-virtual {v2}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v3

    if-nez v3, :cond_1c

    invoke-virtual {v2}, Landroid/widget/OverScroller;->abortAnimation()V

    invoke-virtual {v0, v11}, Landroidx/core/widget/NestedScrollView;->w(I)V

    :cond_1c
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v2, v0, Landroidx/core/widget/NestedScrollView;->h:I

    iput v1, v0, Landroidx/core/widget/NestedScrollView;->s:I

    invoke-virtual {v9, v12, v7}, LJ/n;->h(II)Z

    :cond_1d
    :goto_3
    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_1e

    invoke-virtual {v1, v8}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_1e
    invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V

    return v11
.end method

.method public final p(IIII)Z
    .locals 9

    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v0

    invoke-super {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    invoke-super {p0}, Landroid/view/View;->computeHorizontalScrollExtent()I

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollRange()I

    invoke-super {p0}, Landroid/view/View;->computeVerticalScrollExtent()I

    const/4 v1, 0x1

    add-int/2addr p3, p1

    const/4 p1, 0x0

    if-lez p2, :cond_0

    :goto_0
    move p2, p1

    move v0, v1

    goto :goto_1

    :cond_0
    if-gez p2, :cond_1

    goto :goto_0

    :cond_1
    move v0, p1

    :goto_1
    if-le p3, p4, :cond_2

    :goto_2
    move p3, v1

    goto :goto_3

    :cond_2
    if-gez p3, :cond_3

    move p4, p1

    goto :goto_2

    :cond_3
    move p4, p3

    move p3, p1

    :goto_3
    if-eqz p3, :cond_4

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {v2, v1}, LJ/n;->g(I)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v3, p2

    move v4, p4

    invoke-virtual/range {v2 .. v8}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    :cond_4
    invoke-super {p0, p2, p4}, Landroid/view/View;->scrollTo(II)V

    if-nez v0, :cond_6

    if-eqz p3, :cond_5

    goto :goto_4

    :cond_5
    move v1, p1

    :cond_6
    :goto_4
    return v1
.end method

.method public final q(I)V
    .locals 5

    const/16 v0, 0x82

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->d:Landroid/graphics/Rect;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    add-int/2addr v0, v3

    iput v0, v4, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    iget v0, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v3

    if-le v0, v1, :cond_2

    sub-int/2addr v1, v3

    iput v1, v4, Landroid/graphics/Rect;->top:I

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    sub-int/2addr v0, v3

    iput v0, v4, Landroid/graphics/Rect;->top:I

    if-gez v0, :cond_2

    iput v1, v4, Landroid/graphics/Rect;->top:I

    :cond_2
    :goto_1
    iget v0, v4, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v0

    iput v3, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, p1, v0, v3}, Landroidx/core/widget/NestedScrollView;->r(III)Z

    return-void
.end method

.method public final r(III)Z
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v6, 0x21

    if-ne v1, v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const/4 v9, 0x2

    invoke-virtual {v0, v9}, Landroid/view/View;->getFocusables(I)Ljava/util/ArrayList;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_1
    if-ge v12, v10, :cond_9

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    move-result v15

    invoke-virtual {v14}, Landroid/view/View;->getBottom()I

    move-result v7

    if-ge v2, v7, :cond_8

    if-ge v15, v3, :cond_8

    if-ge v2, v15, :cond_1

    if-ge v7, v3, :cond_1

    const/16 v16, 0x1

    goto :goto_2

    :cond_1
    const/16 v16, 0x0

    :goto_2
    if-nez v11, :cond_2

    move-object v11, v14

    move/from16 v13, v16

    goto :goto_5

    :cond_2
    if-eqz v6, :cond_3

    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v8

    if-lt v15, v8, :cond_4

    :cond_3
    if-nez v6, :cond_5

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v8

    if-le v7, v8, :cond_5

    :cond_4
    const/4 v7, 0x1

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    :goto_3
    if-eqz v13, :cond_6

    if-eqz v16, :cond_8

    if-eqz v7, :cond_8

    goto :goto_4

    :cond_6
    if-eqz v16, :cond_7

    move-object v11, v14

    const/4 v13, 0x1

    goto :goto_5

    :cond_7
    if-eqz v7, :cond_8

    :goto_4
    move-object v11, v14

    :cond_8
    :goto_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_9
    if-nez v11, :cond_a

    move-object v11, v0

    :cond_a
    if-lt v2, v5, :cond_b

    if-gt v3, v4, :cond_b

    const/4 v7, 0x0

    goto :goto_8

    :cond_b
    if-eqz v6, :cond_c

    sub-int/2addr v2, v5

    :goto_6
    const/4 v3, 0x0

    const/4 v4, 0x1

    goto :goto_7

    :cond_c
    sub-int v2, v3, v4

    goto :goto_6

    :goto_7
    invoke-virtual {v0, v2, v3, v4, v4}, Landroidx/core/widget/NestedScrollView;->s(IIIZ)I

    move v7, v4

    :goto_8
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v2

    if-eq v11, v2, :cond_d

    invoke-virtual {v11, v1}, Landroid/view/View;->requestFocus(I)Z

    :cond_d
    return v7
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->d:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->h(Landroid/graphics/Rect;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->scrollBy(II)V

    goto :goto_0

    :cond_0
    iput-object p2, p0, Landroidx/core/widget/NestedScrollView;->k:Landroid/view/View;

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    sub-int/2addr v1, p1

    invoke-virtual {p2, v0, v1}, Landroid/graphics/Rect;->offset(II)V

    invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->h(Landroid/graphics/Rect;)I

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->scrollBy(II)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p2, p1, p2}, Landroidx/core/widget/NestedScrollView;->u(IIZ)V

    :cond_2
    :goto_1
    return v0
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public final requestLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->i:Z

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final s(IIIZ)I
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v10, p3

    iget-object v8, v0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    const/4 v11, 0x1

    if-ne v10, v11, :cond_0

    const/4 v2, 0x2

    invoke-virtual {v8, v2, v10}, LJ/n;->h(II)Z

    :cond_0
    iget-object v5, v0, Landroidx/core/widget/NestedScrollView;->u:[I

    iget-object v6, v0, Landroidx/core/widget/NestedScrollView;->t:[I

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    const/4 v3, 0x0

    move/from16 v4, p1

    move/from16 v7, p3

    invoke-virtual/range {v2 .. v7}, LJ/n;->c(II[I[II)Z

    move-result v2

    const/4 v3, 0x0

    iget-object v12, v0, Landroidx/core/widget/NestedScrollView;->u:[I

    iget-object v13, v0, Landroidx/core/widget/NestedScrollView;->t:[I

    if-eqz v2, :cond_1

    aget v2, v12, v11

    sub-int v2, p1, v2

    aget v4, v13, v11

    move v14, v2

    move v15, v4

    goto :goto_0

    :cond_1
    move/from16 v14, p1

    move v15, v3

    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v2

    if-eqz v2, :cond_2

    if-ne v2, v11, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v2

    if-lez v2, :cond_3

    :cond_2
    if-nez p4, :cond_3

    move/from16 v16, v11

    goto :goto_1

    :cond_3
    move/from16 v16, v3

    :goto_1
    invoke-virtual {v0, v14, v3, v9, v7}, Landroidx/core/widget/NestedScrollView;->p(IIII)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v8, v10}, LJ/n;->g(I)Z

    move-result v2

    if-nez v2, :cond_4

    move/from16 v17, v11

    goto :goto_2

    :cond_4
    move/from16 v17, v3

    :goto_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    sub-int v4, v2, v9

    sub-int v6, v14, v4

    aput v3, v12, v11

    const/4 v3, 0x0

    const/4 v5, 0x0

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    iget-object v8, v0, Landroidx/core/widget/NestedScrollView;->t:[I

    move/from16 v18, v7

    move-object v7, v8

    move/from16 v8, p3

    move/from16 v19, v9

    move-object v9, v12

    invoke-virtual/range {v2 .. v9}, LJ/n;->e(IIII[II[I)Z

    aget v2, v13, v11

    add-int/2addr v15, v2

    aget v2, v12, v11

    sub-int/2addr v14, v2

    add-int v9, v19, v14

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->g:Landroid/widget/EdgeEffect;

    iget-object v3, v0, Landroidx/core/widget/NestedScrollView;->f:Landroid/widget/EdgeEffect;

    if-gez v9, :cond_5

    if-eqz v16, :cond_6

    neg-int v4, v14

    int-to-float v4, v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    int-to-float v1, v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v1, v5

    invoke-static {v3, v4, v1}, Lv0/f;->G(Landroid/widget/EdgeEffect;FF)F

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_3

    :cond_5
    move/from16 v4, v18

    if-le v9, v4, :cond_6

    if-eqz v16, :cond_6

    int-to-float v4, v14

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    int-to-float v1, v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v1, v5

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v5, v1

    invoke-static {v2, v4, v5}, Lv0/f;->G(Landroid/widget/EdgeEffect;FF)F

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_6
    :goto_3
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    if-eqz v17, :cond_9

    if-nez v10, :cond_9

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->m:Landroid/view/VelocityTracker;

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_5

    :cond_8
    :goto_4
    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static/range {p0 .. p0}, LJ/B;->k(Landroid/view/View;)V

    :cond_9
    :goto_5
    if-ne v10, v11, :cond_a

    invoke-virtual {v0, v10}, Landroidx/core/widget/NestedScrollView;->w(I)V

    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_a
    return v15
.end method

.method public final scrollTo(II)V
    .locals 7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_7

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    iget v5, v2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v4, v5

    iget v5, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget v6, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v1, v6

    iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    if-ge v3, v4, :cond_1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    add-int v2, v3, p1

    if-le v2, v4, :cond_2

    sub-int p1, v4, v3

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v0

    :cond_2
    :goto_1
    if-ge v5, v1, :cond_4

    if-gez p2, :cond_3

    goto :goto_2

    :cond_3
    add-int v0, v5, p2

    if-le v0, v1, :cond_5

    sub-int p2, v1, v5

    goto :goto_3

    :cond_4
    :goto_2
    move p2, v0

    :cond_5
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    if-ne p1, v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-eq p2, v0, :cond_7

    :cond_6
    invoke-super {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    :cond_7
    return-void
.end method

.method public setFillViewport(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->n:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->n:Z

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    iget-boolean v1, v0, LJ/n;->d:Z

    if-eqz v1, :cond_0

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object v1, v0, LJ/n;->c:Landroid/view/View;

    invoke-static {v1}, LJ/H;->z(Landroid/view/View;)V

    :cond_0
    iput-boolean p1, v0, LJ/n;->d:Z

    return-void
.end method

.method public setOnScrollChangeListener(LN/k;)V
    .locals 0

    return-void
.end method

.method public setSmoothScrollingEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->o:Z

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LJ/n;->h(II)Z

    move-result p1

    return p1
.end method

.method public final stopNestedScroll()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->w(I)V

    return-void
.end method

.method public final t(Landroid/widget/EdgeEffect;I)Z
    .locals 10

    const/4 v0, 0x1

    if-lez p2, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr p1, v1

    neg-int p2, p2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    int-to-float p2, p2

    const v1, 0x3eb33333    # 0.35f

    mul-float/2addr p2, v1

    iget v1, p0, Landroidx/core/widget/NestedScrollView;->b:F

    const v2, 0x3c75c28f    # 0.015f

    mul-float/2addr v1, v2

    div-float/2addr p2, v1

    float-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    sget p2, Landroidx/core/widget/NestedScrollView;->B:F

    float-to-double v4, p2

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    sub-double v6, v4, v6

    float-to-double v8, v1

    div-double/2addr v4, v6

    mul-double/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    move-result-wide v1

    mul-double/2addr v1, v8

    double-to-float p2, v1

    cmpg-float p1, p2, p1

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u(IIZ)V
    .locals 9

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Landroidx/core/widget/NestedScrollView;->c:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0xfa

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    if-lez v1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v3, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v3

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v1, v3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    sub-int/2addr v0, v1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr p2, v5

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int v7, p1, v5

    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->e:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    const/4 v6, 0x0

    const/16 v8, 0xfa

    invoke-virtual/range {v3 .. v8}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    if-eqz p3, :cond_1

    const/4 p1, 0x2

    iget-object p2, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {p2, p1, v2}, LJ/n;->h(II)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->w(I)V

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->w:I

    sget-object p1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, LJ/B;->k(Landroid/view/View;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p3

    if-nez p3, :cond_3

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->w(I)V

    :cond_3
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollBy(II)V

    :goto_1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/core/widget/NestedScrollView;->c:J

    return-void
.end method

.method public final v(Landroid/view/MotionEvent;)Z
    .locals 5

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->f:Landroid/widget/EdgeEffect;

    invoke-static {v0}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v1, v4

    invoke-static {v0, v2, v1}, Lv0/f;->G(Landroid/widget/EdgeEffect;FF)F

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->g:Landroid/widget/EdgeEffect;

    invoke-static {v1}, Lv0/f;->w(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpl-float v4, v4, v2

    if-eqz v4, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    invoke-static {v1, v2, v0}, Lv0/f;->G(Landroid/widget/EdgeEffect;FF)F

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    return v3
.end method

.method public final w(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:LJ/n;

    invoke-virtual {v0, p1}, LJ/n;->i(I)V

    return-void
.end method
