.class public Lcom/google/android/material/behavior/SwipeDismissBehavior;
.super Lv/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Lv/a;"
    }
.end annotation


# instance fields
.field public a:LQ/e;

.field public b:Z

.field public c:Z

.field public d:I

.field public final e:F

.field public f:F

.field public g:F

.field public final h:LD0/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:I

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->e:F

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->f:F

    iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->g:F

    new-instance v0, LD0/b;

    invoke-direct {v0, p0}, LD0/b;-><init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;)V

    iput-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->h:LD0/b;

    return-void
.end method


# virtual methods
.method public f(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Z

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    const/4 p2, 0x3

    if-eq v1, p2, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Z

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1, p2, v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(Landroid/view/View;II)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b:Z

    :goto_0
    if-eqz v0, :cond_4

    iget-object p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LQ/e;

    if-nez p2, :cond_2

    new-instance p2, LQ/e;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->h:LD0/b;

    invoke-direct {p2, v0, p1, v1}, LQ/e;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lm0/z;)V

    iput-object p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LQ/e;

    :cond_2
    iget-boolean p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->c:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LQ/e;

    invoke-virtual {p1, p3}, LQ/e;->o(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :goto_1
    return v2

    :cond_4
    return v3
.end method

.method public final g(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 2

    const/4 p1, 0x1

    sget-object p3, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p2}, LJ/B;->c(Landroid/view/View;)I

    move-result p3

    const/4 v0, 0x0

    if-nez p3, :cond_0

    invoke-static {p2, p1}, LJ/B;->s(Landroid/view/View;I)V

    const/high16 p3, 0x100000

    invoke-static {p2, p3}, LJ/T;->i(Landroid/view/View;I)V

    invoke-static {p2, v0}, LJ/T;->g(Landroid/view/View;I)V

    invoke-virtual {p0, p2}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->r(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, LK/j;->j:LK/j;

    new-instance v1, LA/h;

    invoke-direct {v1, p1, p0}, LA/h;-><init>(ILjava/lang/Object;)V

    invoke-static {p2, p3, v1}, LJ/T;->j(Landroid/view/View;LK/j;LK/B;)V

    :cond_0
    return v0
.end method

.method public final q(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LQ/e;

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->c:Z

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LQ/e;

    invoke-virtual {p1, p2}, LQ/e;->i(Landroid/view/MotionEvent;)V

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public r(Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
