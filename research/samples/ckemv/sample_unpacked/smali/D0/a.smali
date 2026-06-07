.class public final LD0/a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LD0/a;->a:I

    iput-object p2, p0, LD0/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, LD0/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    const/4 p1, 0x0

    iget-object v0, p0, LD0/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iput-object p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->x:Landroid/view/ViewPropertyAnimator;

    const/4 p1, 0x0

    iput-boolean p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    iget v0, p0, LD0/a;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, LD0/a;->b:Ljava/lang/Object;

    check-cast v0, Lk0/f;

    iget-object v1, v0, Lk0/f;->f:Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LI0/a;

    iget-object v3, v3, LI0/a;->b:LI0/d;

    iget-object v3, v3, LI0/d;->p:Landroid/content/res/ColorStateList;

    if-eqz v3, :cond_0

    invoke-static {v0, v3}, LB/b;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    :pswitch_0
    const/4 p1, 0x0

    iget-object v0, p0, LD0/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iput-object p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->x:Landroid/view/ViewPropertyAnimator;

    const/4 p1, 0x0

    iput-boolean p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Z

    return-void

    :pswitch_1
    iget-object v0, p0, LD0/a;->b:Ljava/lang/Object;

    check-cast v0, Lj0/o;

    invoke-virtual {v0}, Lj0/o;->m()V

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :pswitch_2
    iget-object p1, p0, LD0/a;->b:Ljava/lang/Object;

    check-cast p1, LX0/k;

    invoke-virtual {p1}, LX0/q;->q()V

    iget-object p1, p1, LX0/k;->r:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :pswitch_3
    iget-object p1, p0, LD0/a;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->h:Landroid/view/ViewPropertyAnimator;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 6

    iget v0, p0, LD0/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, LD0/a;->b:Ljava/lang/Object;

    check-cast v0, Lk0/f;

    iget-object v1, v0, Lk0/f;->f:Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LI0/a;

    iget-object v3, v3, LI0/a;->b:LI0/d;

    iget-object v4, v3, LI0/d;->p:Landroid/content/res/ColorStateList;

    if-eqz v4, :cond_0

    iget-object v3, v3, LI0/d;->t:[I

    invoke-virtual {v4}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v5

    invoke-virtual {v4, v3, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    invoke-static {v0, v3}, LB/b;->g(Landroid/graphics/drawable/Drawable;I)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
