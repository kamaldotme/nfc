.class public final LZ/X;
.super LJ/c;
.source "SourceFile"


# instance fields
.field public final d:LZ/Y;

.field public final e:Ljava/util/WeakHashMap;


# direct methods
.method public constructor <init>(LZ/Y;)V
    .locals 1

    invoke-direct {p0}, LJ/c;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    iput-object p1, p0, LZ/X;->d:LZ/Y;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LJ/c;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, LJ/c;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final b(Landroid/view/View;)LK/r;
    .locals 1

    iget-object v0, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LJ/c;->b(Landroid/view/View;)LK/r;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1}, LJ/c;->b(Landroid/view/View;)LK/r;

    move-result-object p1

    return-object p1
.end method

.method public final c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LJ/c;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, LJ/c;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_0
    return-void
.end method

.method public final d(Landroid/view/View;LK/p;)V
    .locals 4

    iget-object v0, p0, LZ/X;->d:LZ/Y;

    iget-object v1, v0, LZ/Y;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->K()Z

    move-result v1

    iget-object v2, p0, LJ/c;->a:Landroid/view/View$AccessibilityDelegate;

    iget-object v3, p2, LK/p;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-nez v1, :cond_1

    iget-object v0, v0, LZ/Y;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LZ/H;->S(Landroid/view/View;LK/p;)V

    iget-object v0, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LJ/c;->d(Landroid/view/View;LK/p;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2, p1, v3}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2, p1, v3}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :goto_0
    return-void
.end method

.method public final e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LJ/c;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, LJ/c;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_0
    return-void
.end method

.method public final f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, LJ/c;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, LJ/c;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final g(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 3

    iget-object v0, p0, LZ/X;->d:LZ/Y;

    iget-object v1, v0, LZ/Y;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->K()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v0, v0, LZ/Y;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ/c;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2, p3}, LJ/c;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v2

    :cond_0
    invoke-super {p0, p1, p2, p3}, LJ/c;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v2

    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object p1

    iget-object p1, p1, LZ/H;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-super {p0, p1, p2, p3}, LJ/c;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final h(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LJ/c;->h(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, LJ/c;->h(Landroid/view/View;I)V

    :goto_0
    return-void
.end method

.method public final i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, LZ/X;->e:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LJ/c;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, LJ/c;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_0
    return-void
.end method
