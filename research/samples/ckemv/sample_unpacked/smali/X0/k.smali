.class public final LX0/k;
.super LX0/q;
.source "SourceFile"


# instance fields
.field public final e:I

.field public final f:I

.field public final g:Landroid/animation/TimeInterpolator;

.field public h:Landroid/widget/AutoCompleteTextView;

.field public final i:LX0/a;

.field public final j:LX0/b;

.field public final k:LB2/b;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:J

.field public p:Landroid/view/accessibility/AccessibilityManager;

.field public q:Landroid/animation/ValueAnimator;

.field public r:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(LX0/p;)V
    .locals 3

    invoke-direct {p0, p1}, LX0/q;-><init>(LX0/p;)V

    new-instance v0, LX0/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, LX0/a;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LX0/k;->i:LX0/a;

    new-instance v0, LX0/b;

    invoke-direct {v0, p0, v1}, LX0/b;-><init>(LX0/q;I)V

    iput-object v0, p0, LX0/k;->j:LX0/b;

    new-instance v0, LB2/b;

    invoke-direct {v0, p0}, LB2/b;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LX0/k;->k:LB2/b;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, LX0/k;->o:J

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0302ff

    const/16 v2, 0x43

    invoke-static {v0, v1, v2}, Lu2/l;->G(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, LX0/k;->f:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v2, 0x32

    invoke-static {v0, v1, v2}, Lu2/l;->G(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, LX0/k;->e:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, LB0/a;->a:Landroid/view/animation/LinearInterpolator;

    const v1, 0x7f030308

    invoke-static {p1, v1, v0}, Lu2/l;->H(Landroid/content/Context;ILandroid/view/animation/Interpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, LX0/k;->g:Landroid/animation/TimeInterpolator;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LX0/k;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-static {v0}, Lu2/l;->w(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LX0/q;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    :cond_0
    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, LB2/u;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final c()I
    .locals 1

    const v0, 0x7f100032

    return v0
.end method

.method public final d()I
    .locals 1

    const v0, 0x7f0700bc

    return v0
.end method

.method public final e()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    iget-object v0, p0, LX0/k;->j:LX0/b;

    return-object v0
.end method

.method public final f()Landroid/view/View$OnClickListener;
    .locals 1

    iget-object v0, p0, LX0/k;->i:LX0/a;

    return-object v0
.end method

.method public final h()LK/d;
    .locals 1

    iget-object v0, p0, LX0/k;->k:LB2/b;

    return-object v0
.end method

.method public final i(I)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, LX0/k;->l:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, LX0/k;->n:Z

    return v0
.end method

.method public final m(Landroid/widget/EditText;)V
    .locals 2

    instance-of v0, p1, Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/widget/AutoCompleteTextView;

    iput-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, LX0/i;

    invoke-direct {v1, p0}, LX0/i;-><init>(LX0/k;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    new-instance v1, LX0/j;

    invoke-direct {v1, p0}, LX0/j;-><init>(LX0/k;)V

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    const/4 v0, 0x0

    iget-object v1, p0, LX0/q;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {p1}, Lu2/l;->w(Landroid/widget/EditText;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LX0/k;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object p1, p0, LX0/q;->d:Lcom/google/android/material/internal/CheckableImageButton;

    const/4 v0, 0x2

    invoke-static {p1, v0}, LJ/B;->s(Landroid/view/View;I)V

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconVisible(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LK/p;)V
    .locals 1

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-static {v0}, Lu2/l;->w(Landroid/widget/EditText;)Z

    move-result v0

    iget-object p1, p1, LK/p;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-nez v0, :cond_0

    const-class v0, Landroid/widget/Spinner;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isShowingHintText()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHintText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final o(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    iget-object v0, p0, LX0/k;->p:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-static {v0}, Lu2/l;->w(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const v1, 0x8000

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, LX0/k;->n:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p1

    if-eq p1, v2, :cond_2

    if-eqz v0, :cond_3

    :cond_2
    invoke-virtual {p0}, LX0/k;->u()V

    iput-boolean v2, p0, LX0/k;->m:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, LX0/k;->o:J

    :cond_3
    :goto_1
    return-void
.end method

.method public final r()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iget-object v2, p0, LX0/k;->g:Landroid/animation/TimeInterpolator;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget v3, p0, LX0/k;->f:I

    int-to-long v3, v3

    invoke-virtual {v1, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v3, LJ/Y;

    invoke-direct {v3, p0}, LJ/Y;-><init>(LX0/k;)V

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iput-object v1, p0, LX0/k;->r:Landroid/animation/ValueAnimator;

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget v1, p0, LX0/k;->e:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, LJ/Y;

    invoke-direct {v1, p0}, LJ/Y;-><init>(LX0/k;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iput-object v0, p0, LX0/k;->q:Landroid/animation/ValueAnimator;

    new-instance v1, LD0/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, LD0/a;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v0, p0, LX0/q;->c:Landroid/content/Context;

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, LX0/k;->p:Landroid/view/accessibility/AccessibilityManager;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final s()V
    .locals 2

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setOnDismissListener(Landroid/widget/AutoCompleteTextView$OnDismissListener;)V

    :cond_0
    return-void
.end method

.method public final t(Z)V
    .locals 1

    iget-boolean v0, p0, LX0/k;->n:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, LX0/k;->n:Z

    iget-object p1, p0, LX0/k;->r:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object p1, p0, LX0/k;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method public final u()V
    .locals 7

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, LX0/k;->o:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ltz v2, :cond_2

    const-wide/16 v5, 0x12c

    cmp-long v0, v0, v5

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v3

    :goto_1
    if-eqz v0, :cond_3

    iput-boolean v4, p0, LX0/k;->m:Z

    :cond_3
    iget-boolean v0, p0, LX0/k;->m:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, LX0/k;->n:Z

    xor-int/2addr v0, v3

    invoke-virtual {p0, v0}, LX0/k;->t(Z)V

    iget-boolean v0, p0, LX0/k;->n:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    goto :goto_2

    :cond_4
    iget-object v0, p0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    goto :goto_2

    :cond_5
    iput-boolean v4, p0, LX0/k;->m:Z

    :goto_2
    return-void
.end method
