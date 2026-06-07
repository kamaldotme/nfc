.class public abstract Lcom/google/android/material/timepicker/e;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:LB2/u;

.field public r:I

.field public final s:LU0/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const v0, 0x7f0302c5

    invoke-direct {p0, p1, p2, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0b003a

    invoke-virtual {v1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    new-instance v1, LU0/g;

    invoke-direct {v1}, LU0/g;-><init>()V

    iput-object v1, p0, Lcom/google/android/material/timepicker/e;->s:LU0/g;

    new-instance v2, LU0/h;

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-direct {v2, v3}, LU0/h;-><init>(F)V

    iget-object v3, v1, LU0/g;->b:LU0/f;

    iget-object v3, v3, LU0/f;->a:LU0/k;

    invoke-virtual {v3}, LU0/k;->e()LU0/j;

    move-result-object v3

    iput-object v2, v3, LU0/j;->e:LU0/c;

    iput-object v2, v3, LU0/j;->f:LU0/c;

    iput-object v2, v3, LU0/j;->g:LU0/c;

    iput-object v2, v3, LU0/j;->h:LU0/c;

    invoke-virtual {v3}, LU0/j;->a()LU0/k;

    move-result-object v2

    invoke-virtual {v1, v2}, LU0/g;->setShapeAppearanceModel(LU0/k;)V

    iget-object v1, p0, Lcom/google/android/material/timepicker/e;->s:LU0/g;

    const/4 v2, -0x1

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, LU0/g;->k(Landroid/content/res/ColorStateList;)V

    iget-object v1, p0, Lcom/google/android/material/timepicker/e;->s:LU0/g;

    sget-object v2, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p0, v1}, LJ/B;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    sget-object v1, LA0/a;->s:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/timepicker/e;->r:I

    new-instance p2, LB2/u;

    const/16 v0, 0xb

    invoke-direct {p2, v0, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    iput-object p2, p0, Lcom/google/android/material/timepicker/e;->q:LB2/u;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    sget-object p2, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {}, LJ/C;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setId(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/google/android/material/timepicker/e;->q:LB2/u;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public abstract f()V
.end method

.method public final onFinishInflate()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    invoke-virtual {p0}, Lcom/google/android/material/timepicker/e;->f()V

    return-void
.end method

.method public final onViewRemoved(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/timepicker/e;->q:LB2/u;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/timepicker/e;->s:LU0/g;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, LU0/g;->k(Landroid/content/res/ColorStateList;)V

    return-void
.end method
