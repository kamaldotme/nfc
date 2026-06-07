.class public final LZ/Y;
.super LJ/c;
.source "SourceFile"


# instance fields
.field public final d:Landroidx/recyclerview/widget/RecyclerView;

.field public final e:LZ/X;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, LJ/c;-><init>()V

    iput-object p1, p0, LZ/Y;->d:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p0, LZ/Y;->e:LZ/X;

    if-eqz p1, :cond_0

    iput-object p1, p0, LZ/Y;->e:LZ/X;

    goto :goto_0

    :cond_0
    new-instance p1, LZ/X;

    invoke-direct {p1, p0}, LZ/X;-><init>(LZ/Y;)V

    iput-object p1, p0, LZ/Y;->e:LZ/X;

    :goto_0
    return-void
.end method


# virtual methods
.method public final c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1, p2}, LJ/c;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, LZ/Y;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->K()Z

    move-result v0

    if-nez v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object p1

    invoke-virtual {p1, p2}, LZ/H;->Q(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_0
    return-void
.end method

.method public final d(Landroid/view/View;LK/p;)V
    .locals 6

    iget-object v0, p0, LJ/c;->a:Landroid/view/View$AccessibilityDelegate;

    iget-object v1, p2, LK/p;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object p1, p0, LZ/Y;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->K()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object p1

    iget-object v0, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    const/4 v3, -0x1

    invoke-virtual {v0, v3}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_0

    iget-object v4, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v3}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    const/16 v3, 0x2000

    invoke-virtual {p2, v3}, LK/p;->a(I)V

    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    :cond_1
    iget-object v3, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v5}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v5}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    const/16 v3, 0x1000

    invoke-virtual {p2, v3}, LK/p;->a(I)V

    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    :cond_3
    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {p1, v2, p2}, LZ/H;->H(LZ/N;LZ/T;)I

    move-result v0

    invoke-virtual {p1, v2, p2}, LZ/H;->x(LZ/N;LZ/T;)I

    move-result p1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, p2}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    :cond_4
    return-void
.end method

.method public final g(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 3

    invoke-super {p0, p1, p2, p3}, LJ/c;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    const/4 p3, 0x1

    if-eqz p1, :cond_0

    return p3

    :cond_0
    iget-object p1, p0, LZ/Y;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->K()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_7

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object p1

    iget-object v0, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    const/16 v2, 0x1000

    if-eq p2, v2, :cond_4

    const/16 v2, 0x2000

    if-eq p2, v2, :cond_1

    move p2, v1

    move v0, p2

    goto :goto_2

    :cond_1
    const/4 p2, -0x1

    invoke-virtual {v0, p2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p1, LZ/H;->o:I

    invoke-virtual {p1}, LZ/H;->E()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p1}, LZ/H;->B()I

    move-result v2

    sub-int/2addr v0, v2

    neg-int v0, v0

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    iget-object v2, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, p2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p2

    if-eqz p2, :cond_3

    iget p2, p1, LZ/H;->n:I

    invoke-virtual {p1}, LZ/H;->C()I

    move-result v2

    sub-int/2addr p2, v2

    invoke-virtual {p1}, LZ/H;->D()I

    move-result v2

    sub-int/2addr p2, v2

    neg-int p2, p2

    goto :goto_2

    :cond_3
    move p2, v1

    goto :goto_2

    :cond_4
    invoke-virtual {v0, p3}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p2

    if-eqz p2, :cond_5

    iget p2, p1, LZ/H;->o:I

    invoke-virtual {p1}, LZ/H;->E()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p1}, LZ/H;->B()I

    move-result v0

    sub-int/2addr p2, v0

    move v0, p2

    goto :goto_1

    :cond_5
    move v0, v1

    :goto_1
    iget-object p2, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p3}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p2

    if-eqz p2, :cond_3

    iget p2, p1, LZ/H;->n:I

    invoke-virtual {p1}, LZ/H;->C()I

    move-result v2

    sub-int/2addr p2, v2

    invoke-virtual {p1}, LZ/H;->D()I

    move-result v2

    sub-int/2addr p2, v2

    :goto_2
    if-nez v0, :cond_6

    if-nez p2, :cond_6

    move p3, v1

    goto :goto_3

    :cond_6
    iget-object p1, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p2, v0, p3}, Landroidx/recyclerview/widget/RecyclerView;->b0(IIZ)V

    :goto_3
    return p3

    :cond_7
    return v1
.end method
