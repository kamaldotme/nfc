.class public final LX0/e;
.super LX0/q;
.source "SourceFile"


# instance fields
.field public final e:I

.field public final f:I

.field public final g:Landroid/animation/TimeInterpolator;

.field public final h:Landroid/animation/TimeInterpolator;

.field public i:Landroid/widget/EditText;

.field public final j:LX0/a;

.field public final k:LX0/b;

.field public l:Landroid/animation/AnimatorSet;

.field public m:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(LX0/p;)V
    .locals 3

    invoke-direct {p0, p1}, LX0/q;-><init>(LX0/p;)V

    new-instance v0, LX0/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LX0/a;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LX0/e;->j:LX0/a;

    new-instance v0, LX0/b;

    invoke-direct {v0, p0, v1}, LX0/b;-><init>(LX0/q;I)V

    iput-object v0, p0, LX0/e;->k:LX0/b;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0302ff

    const/16 v2, 0x64

    invoke-static {v0, v1, v2}, Lu2/l;->G(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, LX0/e;->e:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v2, 0x96

    invoke-static {v0, v1, v2}, Lu2/l;->G(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, LX0/e;->f:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LB0/a;->a:Landroid/view/animation/LinearInterpolator;

    const v2, 0x7f030308

    invoke-static {v0, v2, v1}, Lu2/l;->H(Landroid/content/Context;ILandroid/view/animation/Interpolator;)Landroid/animation/TimeInterpolator;

    move-result-object v0

    iput-object v0, p0, LX0/e;->g:Landroid/animation/TimeInterpolator;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, LB0/a;->d:LU/a;

    const v1, 0x7f030306

    invoke-static {p1, v1, v0}, Lu2/l;->H(Landroid/content/Context;ILandroid/view/animation/Interpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    iput-object p1, p0, LX0/e;->h:Landroid/animation/TimeInterpolator;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LX0/q;->b:LX0/p;

    iget-object v0, v0, LX0/p;->q:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LX0/e;->u()Z

    move-result v0

    invoke-virtual {p0, v0}, LX0/e;->t(Z)V

    return-void
.end method

.method public final c()I
    .locals 1

    const v0, 0x7f10002e

    return v0
.end method

.method public final d()I
    .locals 1

    const v0, 0x7f0700bf

    return v0
.end method

.method public final e()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    iget-object v0, p0, LX0/e;->k:LX0/b;

    return-object v0
.end method

.method public final f()Landroid/view/View$OnClickListener;
    .locals 1

    iget-object v0, p0, LX0/e;->j:LX0/a;

    return-object v0
.end method

.method public final g()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    iget-object v0, p0, LX0/e;->k:LX0/b;

    return-object v0
.end method

.method public final m(Landroid/widget/EditText;)V
    .locals 1

    iput-object p1, p0, LX0/e;->i:Landroid/widget/EditText;

    iget-object p1, p0, LX0/q;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, LX0/e;->u()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconVisible(Z)V

    return-void
.end method

.method public final p(Z)V
    .locals 1

    iget-object v0, p0, LX0/q;->b:LX0/p;

    iget-object v0, v0, LX0/p;->q:Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LX0/e;->t(Z)V

    return-void
.end method

.method public final r()V
    .locals 9

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    new-array v3, v2, [F

    fill-array-data v3, :array_0

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v3

    iget-object v4, p0, LX0/e;->h:Landroid/animation/TimeInterpolator;

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget v4, p0, LX0/e;->f:I

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v4, LX0/c;

    invoke-direct {v4, p0, v0}, LX0/c;-><init>(LX0/e;I)V

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v4, v2, [F

    fill-array-data v4, :array_1

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v4

    iget-object v5, p0, LX0/e;->g:Landroid/animation/TimeInterpolator;

    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget v6, p0, LX0/e;->e:I

    int-to-long v7, v6

    invoke-virtual {v4, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v7, LX0/c;

    invoke-direct {v7, p0, v1}, LX0/c;-><init>(LX0/e;I)V

    invoke-virtual {v4, v7}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v7, Landroid/animation/AnimatorSet;

    invoke-direct {v7}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v7, p0, LX0/e;->l:Landroid/animation/AnimatorSet;

    new-array v8, v2, [Landroid/animation/Animator;

    aput-object v3, v8, v1

    aput-object v4, v8, v0

    invoke-virtual {v7, v8}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    iget-object v3, p0, LX0/e;->l:Landroid/animation/AnimatorSet;

    new-instance v4, LX0/d;

    invoke-direct {v4, p0, v1}, LX0/d;-><init>(LX0/e;I)V

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-array v2, v2, [F

    fill-array-data v2, :array_2

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    int-to-long v3, v6

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v3, LX0/c;

    invoke-direct {v3, p0, v1}, LX0/c;-><init>(LX0/e;I)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iput-object v2, p0, LX0/e;->m:Landroid/animation/ValueAnimator;

    new-instance v1, LX0/d;

    invoke-direct {v1, p0, v0}, LX0/d;-><init>(LX0/e;I)V

    invoke-virtual {v2, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :array_0
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final s()V
    .locals 3

    iget-object v0, p0, LX0/e;->i:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    new-instance v1, LB2/u;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final t(Z)V
    .locals 2

    iget-object v0, p0, LX0/q;->b:LX0/p;

    invoke-virtual {v0}, LX0/p;->d()Z

    move-result v0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p0, LX0/e;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p1, p0, LX0/e;->m:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object p1, p0, LX0/e;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    if-eqz v0, :cond_2

    iget-object p1, p0, LX0/e;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->end()V

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    iget-object p1, p0, LX0/e;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->cancel()V

    iget-object p1, p0, LX0/e;->m:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    if-eqz v0, :cond_2

    iget-object p1, p0, LX0/e;->m:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->end()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, LX0/e;->i:Landroid/widget/EditText;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LX0/q;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, LX0/e;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
