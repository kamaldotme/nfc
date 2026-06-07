.class public final LQ/a;
.super LK/r;
.source "SourceFile"


# instance fields
.field public final synthetic c:LQ/b;


# direct methods
.method public constructor <init>(LQ/b;)V
    .locals 0

    iput-object p1, p0, LQ/a;->c:LQ/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LK/r;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)LK/p;
    .locals 1

    iget-object v0, p0, LQ/a;->c:LQ/b;

    invoke-virtual {v0, p1}, LQ/b;->n(I)LK/p;

    move-result-object p1

    iget-object p1, p1, LK/p;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    new-instance v0, LK/p;

    invoke-direct {v0, p1}, LK/p;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-object v0
.end method

.method public final b(I)LK/p;
    .locals 2

    const/4 v0, 0x2

    iget-object v1, p0, LQ/a;->c:LQ/b;

    if-ne p1, v0, :cond_0

    iget p1, v1, LQ/b;->k:I

    goto :goto_0

    :cond_0
    iget p1, v1, LQ/b;->l:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, LQ/a;->a(I)LK/p;

    move-result-object p1

    return-object p1
.end method

.method public final c(IILandroid/os/Bundle;)Z
    .locals 6

    iget-object v0, p0, LQ/a;->c:LQ/b;

    iget-object v1, v0, LQ/b;->i:Landroid/view/View;

    const/4 v2, -0x1

    if-eq p1, v2, :cond_9

    const/4 p3, 0x1

    if-eq p2, p3, :cond_8

    const/4 v2, 0x2

    if-eq p2, v2, :cond_7

    const/16 v2, 0x40

    const/high16 v3, 0x10000

    const/high16 v4, -0x80000000

    const/4 v5, 0x0

    if-eq p2, v2, :cond_4

    const/16 v2, 0x80

    if-eq p2, v2, :cond_2

    check-cast v0, LJ0/d;

    const/16 v1, 0x10

    if-ne p2, v1, :cond_a

    iget-object p2, v0, LJ0/d;->q:Lcom/google/android/material/chip/Chip;

    if-nez p1, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->performClick()Z

    move-result v5

    goto/16 :goto_2

    :cond_0
    if-ne p1, p3, :cond_a

    invoke-virtual {p2, v5}, Landroid/view/View;->playSoundEffect(I)V

    iget-object p1, p2, Lcom/google/android/material/chip/Chip;->i:Landroid/view/View$OnClickListener;

    if-eqz p1, :cond_1

    invoke-interface {p1, p2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    move v5, p3

    :cond_1
    iget-boolean p1, p2, Lcom/google/android/material/chip/Chip;->t:Z

    if-eqz p1, :cond_a

    iget-object p1, p2, Lcom/google/android/material/chip/Chip;->s:LJ0/d;

    invoke-virtual {p1, p3, p3}, LQ/b;->q(II)V

    goto :goto_2

    :cond_2
    iget p2, v0, LQ/b;->k:I

    if-ne p2, p1, :cond_3

    iput v4, v0, LQ/b;->k:I

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    invoke-virtual {v0, p1, v3}, LQ/b;->q(II)V

    goto :goto_1

    :cond_3
    :goto_0
    move p3, v5

    :goto_1
    move v5, p3

    goto :goto_2

    :cond_4
    iget-object p2, v0, LQ/b;->h:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_0

    :cond_5
    iget p2, v0, LQ/b;->k:I

    if-eq p2, p1, :cond_3

    if-eq p2, v4, :cond_6

    iput v4, v0, LQ/b;->k:I

    iget-object v2, v0, LQ/b;->i:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    invoke-virtual {v0, p2, v3}, LQ/b;->q(II)V

    :cond_6
    iput p1, v0, LQ/b;->k:I

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    const p2, 0x8000

    invoke-virtual {v0, p1, p2}, LQ/b;->q(II)V

    goto :goto_1

    :cond_7
    invoke-virtual {v0, p1}, LQ/b;->j(I)Z

    move-result v5

    goto :goto_2

    :cond_8
    invoke-virtual {v0, p1}, LQ/b;->p(I)Z

    move-result v5

    goto :goto_2

    :cond_9
    sget-object p1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v1, p2, p3}, LJ/B;->j(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v5

    :cond_a
    :goto_2
    return v5
.end method
