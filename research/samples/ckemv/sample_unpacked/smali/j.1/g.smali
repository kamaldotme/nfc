.class public final Lj/g;
.super Lj/u;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public A:Landroid/widget/PopupWindow$OnDismissListener;

.field public B:Z

.field public final c:Landroid/content/Context;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Z

.field public final h:Landroid/os/Handler;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public final k:Lj/d;

.field public final l:LX0/n;

.field public final m:Lf/G;

.field public n:I

.field public o:I

.field public p:Landroid/view/View;

.field public q:Landroid/view/View;

.field public r:I

.field public s:Z

.field public t:Z

.field public u:I

.field public v:I

.field public w:Z

.field public x:Z

.field public y:Lj/y;

.field public z:Landroid/view/ViewTreeObserver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IIZ)V
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lj/g;->i:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lj/g;->j:Ljava/util/ArrayList;

    new-instance v2, Lj/d;

    invoke-direct {v2, v1, p0}, Lj/d;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, Lj/g;->k:Lj/d;

    new-instance v2, LX0/n;

    invoke-direct {v2, v0, p0}, LX0/n;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, Lj/g;->l:LX0/n;

    new-instance v2, Lf/G;

    invoke-direct {v2, p0}, Lf/G;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lj/g;->m:Lf/G;

    iput v1, p0, Lj/g;->n:I

    iput v1, p0, Lj/g;->o:I

    iput-object p1, p0, Lj/g;->c:Landroid/content/Context;

    iput-object p2, p0, Lj/g;->p:Landroid/view/View;

    iput p3, p0, Lj/g;->e:I

    iput p4, p0, Lj/g;->f:I

    iput-boolean p5, p0, Lj/g;->g:Z

    iput-boolean v1, p0, Lj/g;->w:Z

    sget-object p3, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p2}, LJ/C;->d(Landroid/view/View;)I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    move v1, p3

    :goto_0
    iput v1, p0, Lj/g;->r:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/2addr p2, v0

    const p3, 0x7f060017

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lj/g;->d:I

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lj/g;->h:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(Lj/m;Z)V
    .locals 7

    const/4 v0, 0x1

    iget-object v1, p0, Lj/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj/f;

    iget-object v5, v5, Lj/f;->b:Lj/m;

    if-ne p1, v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v4, v0

    goto :goto_0

    :cond_1
    const/4 v4, -0x1

    :goto_1
    if-gez v4, :cond_2

    return-void

    :cond_2
    add-int/lit8 v2, v4, 0x1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_3

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj/f;

    iget-object v2, v2, Lj/f;->b:Lj/m;

    invoke-virtual {v2, v3}, Lj/m;->c(Z)V

    :cond_3
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj/f;

    iget-object v4, v2, Lj/f;->b:Lj/m;

    invoke-virtual {v4, p0}, Lj/m;->r(Lj/z;)V

    iget-boolean v4, p0, Lj/g;->B:Z

    const/4 v5, 0x0

    iget-object v2, v2, Lj/f;->a:Lk/M0;

    if-eqz v4, :cond_4

    iget-object v4, v2, Lk/G0;->A:Lk/A;

    invoke-static {v4, v5}, Lk/I0;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    iget-object v4, v2, Lk/G0;->A:Lk/A;

    invoke-virtual {v4, v3}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    :cond_4
    invoke-virtual {v2}, Lk/G0;->dismiss()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_5

    add-int/lit8 v4, v2, -0x1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj/f;

    iget v4, v4, Lj/f;->c:I

    iput v4, p0, Lj/g;->r:I

    goto :goto_3

    :cond_5
    iget-object v4, p0, Lj/g;->p:Landroid/view/View;

    sget-object v6, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v4}, LJ/C;->d(Landroid/view/View;)I

    move-result v4

    if-ne v4, v0, :cond_6

    move v4, v3

    goto :goto_2

    :cond_6
    move v4, v0

    :goto_2
    iput v4, p0, Lj/g;->r:I

    :goto_3
    if-nez v2, :cond_a

    invoke-virtual {p0}, Lj/g;->dismiss()V

    iget-object p2, p0, Lj/g;->y:Lj/y;

    if-eqz p2, :cond_7

    invoke-interface {p2, p1, v0}, Lj/y;->a(Lj/m;Z)V

    :cond_7
    iget-object p1, p0, Lj/g;->z:Landroid/view/ViewTreeObserver;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lj/g;->z:Landroid/view/ViewTreeObserver;

    iget-object p2, p0, Lj/g;->k:Lj/d;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_8
    iput-object v5, p0, Lj/g;->z:Landroid/view/ViewTreeObserver;

    :cond_9
    iget-object p1, p0, Lj/g;->q:Landroid/view/View;

    iget-object p2, p0, Lj/g;->l:LX0/n;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lj/g;->A:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    goto :goto_4

    :cond_a
    if-eqz p2, :cond_b

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/f;

    iget-object p1, p1, Lj/f;->b:Lj/m;

    invoke-virtual {p1, v3}, Lj/m;->c(Z)V

    :cond_b
    :goto_4
    return-void
.end method

.method public final b()Z
    .locals 3

    iget-object v0, p0, Lj/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/f;

    iget-object v0, v0, Lj/f;->a:Lk/M0;

    iget-object v0, v0, Lk/G0;->A:Lk/A;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lj/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj/f;

    iget-object v1, v1, Lj/f;->a:Lk/M0;

    iget-object v1, v1, Lk/G0;->d:Lk/u0;

    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    check-cast v1, Lj/j;

    goto :goto_1

    :cond_0
    check-cast v1, Lj/j;

    :goto_1
    invoke-virtual {v1}, Lj/j;->notifyDataSetChanged()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final dismiss()V
    .locals 4

    iget-object v0, p0, Lj/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    new-array v2, v1, [Lj/f;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj/f;

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    aget-object v2, v0, v1

    iget-object v3, v2, Lj/f;->a:Lk/M0;

    iget-object v3, v3, Lk/G0;->A:Lk/A;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Lj/f;->a:Lk/M0;

    invoke-virtual {v2}, Lk/G0;->dismiss()V

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final f()Lk/u0;
    .locals 2

    iget-object v0, p0, Lj/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/f;

    iget-object v0, v0, Lj/f;->a:Lk/M0;

    iget-object v0, v0, Lk/G0;->d:Lk/u0;

    :goto_0
    return-object v0
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final h(Lj/y;)V
    .locals 0

    iput-object p1, p0, Lj/g;->y:Lj/y;

    return-void
.end method

.method public final i()V
    .locals 3

    invoke-virtual {p0}, Lj/g;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj/g;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj/m;

    invoke-virtual {p0, v2}, Lj/g;->v(Lj/m;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lj/g;->p:Landroid/view/View;

    iput-object v0, p0, Lj/g;->q:Landroid/view/View;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lj/g;->z:Landroid/view/ViewTreeObserver;

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lj/g;->z:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lj/g;->k:Lj/d;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    iget-object v0, p0, Lj/g;->q:Landroid/view/View;

    iget-object v1, p0, Lj/g;->l:LX0/n;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_4
    return-void
.end method

.method public final j(Lj/F;)Z
    .locals 4

    iget-object v0, p0, Lj/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj/f;

    iget-object v3, v1, Lj/f;->b:Lj/m;

    if-ne p1, v3, :cond_0

    iget-object p1, v1, Lj/f;->a:Lk/M0;

    iget-object p1, p1, Lk/G0;->d:Lk/u0;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return v2

    :cond_1
    invoke-virtual {p1}, Lj/m;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Lj/g;->l(Lj/m;)V

    iget-object v0, p0, Lj/g;->y:Lj/y;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lj/y;->b(Lj/m;)Z

    :cond_2
    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final l(Lj/m;)V
    .locals 1

    iget-object v0, p0, Lj/g;->c:Landroid/content/Context;

    invoke-virtual {p1, p0, v0}, Lj/m;->b(Lj/z;Landroid/content/Context;)V

    invoke-virtual {p0}, Lj/g;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lj/g;->v(Lj/m;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj/g;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lj/g;->p:Landroid/view/View;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lj/g;->p:Landroid/view/View;

    iget v0, p0, Lj/g;->n:I

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, LJ/C;->d(Landroid/view/View;)I

    move-result p1

    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    iput p1, p0, Lj/g;->o:I

    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 0

    iput-boolean p1, p0, Lj/g;->w:Z

    return-void
.end method

.method public final onDismiss()V
    .locals 6

    iget-object v0, p0, Lj/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj/f;

    iget-object v5, v4, Lj/f;->a:Lk/M0;

    iget-object v5, v5, Lk/G0;->A:Lk/A;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_2

    iget-object v0, v4, Lj/f;->b:Lj/m;

    invoke-virtual {v0, v2}, Lj/m;->c(Z)V

    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lj/g;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p(I)V
    .locals 2

    iget v0, p0, Lj/g;->n:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lj/g;->n:I

    iget-object v0, p0, Lj/g;->p:Landroid/view/View;

    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LJ/C;->d(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    iput p1, p0, Lj/g;->o:I

    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/g;->s:Z

    iput p1, p0, Lj/g;->u:I

    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Lj/g;->A:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, Lj/g;->x:Z

    return-void
.end method

.method public final t(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/g;->t:Z

    iput p1, p0, Lj/g;->v:I

    return-void
.end method

.method public final v(Lj/m;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lj/g;->c:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    new-instance v4, Lj/j;

    iget-boolean v5, v0, Lj/g;->g:Z

    const v6, 0x7f0b000b

    invoke-direct {v4, v1, v3, v5, v6}, Lj/j;-><init>(Lj/m;Landroid/view/LayoutInflater;ZI)V

    invoke-virtual/range {p0 .. p0}, Lj/g;->b()Z

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_0

    iget-boolean v5, v0, Lj/g;->w:Z

    if-eqz v5, :cond_0

    iput-boolean v6, v4, Lj/j;->d:Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lj/g;->b()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static/range {p1 .. p1}, Lj/u;->u(Lj/m;)Z

    move-result v5

    iput-boolean v5, v4, Lj/j;->d:Z

    :cond_1
    :goto_0
    iget v5, v0, Lj/g;->d:I

    invoke-static {v4, v2, v5}, Lj/u;->m(Lj/j;Landroid/content/Context;I)I

    move-result v5

    new-instance v7, Lk/M0;

    iget v8, v0, Lj/g;->e:I

    iget v9, v0, Lj/g;->f:I

    const/4 v10, 0x0

    invoke-direct {v7, v2, v10, v8, v9}, Lk/G0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iget-object v2, v0, Lj/g;->m:Lf/G;

    iput-object v2, v7, Lk/M0;->D:Lk/H0;

    iput-object v0, v7, Lk/G0;->q:Landroid/widget/AdapterView$OnItemClickListener;

    iget-object v2, v7, Lk/G0;->A:Lk/A;

    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v2, v0, Lj/g;->p:Landroid/view/View;

    iput-object v2, v7, Lk/G0;->p:Landroid/view/View;

    iget v2, v0, Lj/g;->o:I

    iput v2, v7, Lk/G0;->m:I

    iput-boolean v6, v7, Lk/G0;->z:Z

    iget-object v2, v7, Lk/G0;->A:Lk/A;

    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v2, v7, Lk/G0;->A:Lk/A;

    const/4 v8, 0x2

    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    invoke-virtual {v7, v4}, Lk/G0;->o(Landroid/widget/ListAdapter;)V

    invoke-virtual {v7, v5}, Lk/G0;->r(I)V

    iget v2, v0, Lj/g;->o:I

    iput v2, v7, Lk/G0;->m:I

    iget-object v2, v0, Lj/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v9, 0x0

    if-lez v4, :cond_a

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v6

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj/f;

    iget-object v11, v4, Lj/f;->b:Lj/m;

    iget-object v12, v11, Lj/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    move v13, v9

    :goto_1
    if-ge v13, v12, :cond_3

    invoke-virtual {v11, v13}, Lj/m;->getItem(I)Landroid/view/MenuItem;

    move-result-object v14

    invoke-interface {v14}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v14}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v15

    if-ne v1, v15, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_3
    move-object v14, v10

    :goto_2
    if-nez v14, :cond_4

    move-object v6, v10

    goto :goto_7

    :cond_4
    iget-object v11, v4, Lj/f;->a:Lk/M0;

    iget-object v11, v11, Lk/G0;->d:Lk/u0;

    invoke-virtual {v11}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v12

    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    if-eqz v13, :cond_5

    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    move-result v13

    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v12

    check-cast v12, Lj/j;

    goto :goto_3

    :cond_5
    check-cast v12, Lj/j;

    move v13, v9

    :goto_3
    invoke-virtual {v12}, Lj/j;->getCount()I

    move-result v15

    move v8, v9

    :goto_4
    const/4 v6, -0x1

    if-ge v8, v15, :cond_7

    invoke-virtual {v12, v8}, Lj/j;->b(I)Lj/o;

    move-result-object v10

    if-ne v14, v10, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v8, v8, 0x1

    const/4 v10, 0x0

    goto :goto_4

    :cond_7
    move v8, v6

    :goto_5
    if-ne v8, v6, :cond_8

    goto :goto_6

    :cond_8
    add-int/2addr v8, v13

    invoke-virtual {v11}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v6

    sub-int/2addr v8, v6

    if-ltz v8, :cond_b

    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-lt v8, v6, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v11, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    goto :goto_7

    :cond_a
    const/4 v4, 0x0

    :cond_b
    :goto_6
    const/4 v6, 0x0

    :goto_7
    if-eqz v6, :cond_15

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v10, v7, Lk/G0;->A:Lk/A;

    const/16 v11, 0x1c

    if-gt v8, v11, :cond_c

    sget-object v8, Lk/M0;->E:Ljava/lang/reflect/Method;

    if-eqz v8, :cond_d

    :try_start_0
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8, v10, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :cond_c
    invoke-static {v10, v9}, Lk/J0;->a(Landroid/widget/PopupWindow;Z)V

    :catch_0
    :cond_d
    :goto_8
    iget-object v8, v7, Lk/G0;->A:Lk/A;

    const/4 v10, 0x0

    invoke-static {v8, v10}, Lk/I0;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v10, 0x1

    sub-int/2addr v8, v10

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj/f;

    iget-object v8, v8, Lj/f;->a:Lk/M0;

    iget-object v8, v8, Lk/G0;->d:Lk/u0;

    const/4 v10, 0x2

    new-array v10, v10, [I

    invoke-virtual {v8, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    new-instance v11, Landroid/graphics/Rect;

    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    iget-object v12, v0, Lj/g;->q:Landroid/view/View;

    invoke-virtual {v12, v11}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget v12, v0, Lj/g;->r:I

    const/4 v13, 0x1

    if-ne v12, v13, :cond_10

    aget v10, v10, v9

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v8

    add-int/2addr v8, v10

    add-int/2addr v8, v5

    iget v10, v11, Landroid/graphics/Rect;->right:I

    if-le v8, v10, :cond_f

    :cond_e
    move v10, v9

    const/4 v8, 0x1

    goto :goto_a

    :cond_f
    :goto_9
    const/4 v8, 0x1

    const/4 v10, 0x1

    goto :goto_a

    :cond_10
    aget v8, v10, v9

    sub-int/2addr v8, v5

    if-gez v8, :cond_e

    goto :goto_9

    :goto_a
    if-ne v10, v8, :cond_11

    const/4 v8, 0x1

    goto :goto_b

    :cond_11
    move v8, v9

    :goto_b
    iput v10, v0, Lj/g;->r:I

    iput-object v6, v7, Lk/G0;->p:Landroid/view/View;

    iget v10, v0, Lj/g;->o:I

    const/4 v11, 0x5

    and-int/2addr v10, v11

    if-ne v10, v11, :cond_13

    if-eqz v8, :cond_12

    goto :goto_c

    :cond_12
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v5

    rsub-int/lit8 v5, v5, 0x0

    goto :goto_c

    :cond_13
    if-eqz v8, :cond_14

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v5

    goto :goto_c

    :cond_14
    rsub-int/lit8 v5, v5, 0x0

    :goto_c
    iput v5, v7, Lk/G0;->g:I

    const/4 v5, 0x1

    iput-boolean v5, v7, Lk/G0;->l:Z

    iput-boolean v5, v7, Lk/G0;->k:Z

    invoke-virtual {v7, v9}, Lk/G0;->m(I)V

    goto :goto_e

    :cond_15
    iget-boolean v5, v0, Lj/g;->s:Z

    if-eqz v5, :cond_16

    iget v5, v0, Lj/g;->u:I

    iput v5, v7, Lk/G0;->g:I

    :cond_16
    iget-boolean v5, v0, Lj/g;->t:Z

    if-eqz v5, :cond_17

    iget v5, v0, Lj/g;->v:I

    invoke-virtual {v7, v5}, Lk/G0;->m(I)V

    :cond_17
    iget-object v5, v0, Lj/u;->b:Landroid/graphics/Rect;

    if-eqz v5, :cond_18

    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_d

    :cond_18
    const/4 v10, 0x0

    :goto_d
    iput-object v10, v7, Lk/G0;->y:Landroid/graphics/Rect;

    :goto_e
    new-instance v5, Lj/f;

    iget v6, v0, Lj/g;->r:I

    invoke-direct {v5, v7, v1, v6}, Lj/f;-><init>(Lk/M0;Lj/m;I)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Lk/G0;->i()V

    iget-object v2, v7, Lk/G0;->d:Lk/u0;

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    if-nez v4, :cond_19

    iget-boolean v4, v0, Lj/g;->x:Z

    if-eqz v4, :cond_19

    iget-object v4, v1, Lj/m;->m:Ljava/lang/CharSequence;

    if-eqz v4, :cond_19

    const v4, 0x7f0b0012

    invoke-virtual {v3, v4, v2, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v4, 0x1020016

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v3, v9}, Landroid/view/View;->setEnabled(Z)V

    iget-object v1, v1, Lj/m;->m:Ljava/lang/CharSequence;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    invoke-virtual {v2, v3, v1, v9}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    invoke-virtual {v7}, Lk/G0;->i()V

    :cond_19
    return-void
.end method
