.class public final LJ/a;
.super Landroid/view/View$AccessibilityDelegate;
.source "SourceFile"


# instance fields
.field public final a:LJ/c;


# direct methods
.method public constructor <init>(LJ/c;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    iput-object p1, p0, LJ/a;->a:LJ/c;

    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, LJ/a;->a:LJ/c;

    invoke-virtual {v0, p1, p2}, LJ/c;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    iget-object v0, p0, LJ/a;->a:LJ/c;

    invoke-virtual {v0, p1}, LJ/c;->b(Landroid/view/View;)LK/r;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, LK/r;->a:Ljava/lang/Object;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, LJ/a;->a:LJ/c;

    invoke-virtual {v0, p1, p2}, LJ/c;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 11

    const/4 v0, 0x1

    new-instance v1, LK/p;

    invoke-direct {v1, p2}, LK/p;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sget-object v2, LJ/T;->a:Ljava/util/WeakHashMap;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const-class v3, Ljava/lang/Boolean;

    const/4 v4, 0x0

    const/16 v5, 0x1c

    if-lt v2, v5, :cond_0

    invoke-static {p1}, LJ/L;->d(Landroid/view/View;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_0

    :cond_0
    const v2, 0x7f08018a

    invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v4

    :goto_0
    check-cast v2, Ljava/lang/Boolean;

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v0

    goto :goto_1

    :cond_2
    move v2, v6

    :goto_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    if-lt v7, v5, :cond_3

    invoke-static {p2, v2}, LH/d;->t(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, LK/k;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9, v8, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v10

    and-int/lit8 v10, v10, -0x2

    or-int/2addr v2, v10

    invoke-virtual {v9, v8, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_4
    :goto_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v5, :cond_5

    invoke-static {p1}, LJ/L;->c(Landroid/view/View;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_3

    :cond_5
    const v2, 0x7f080185

    invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    move-object v2, v4

    :goto_3
    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_7

    move v2, v0

    goto :goto_4

    :cond_7
    move v2, v6

    :goto_4
    if-lt v7, v5, :cond_8

    invoke-static {p2, v2}, LH/d;->y(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    goto :goto_6

    :cond_8
    invoke-static {p2}, LK/k;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3, v8, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v9

    and-int/lit8 v9, v9, -0x3

    if-eqz v2, :cond_9

    const/4 v2, 0x2

    goto :goto_5

    :cond_9
    move v2, v6

    :goto_5
    or-int/2addr v2, v9

    invoke-virtual {v3, v8, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_a
    :goto_6
    invoke-static {p1}, LJ/T;->d(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v2

    if-lt v7, v5, :cond_b

    invoke-static {p2, v2}, LH/d;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    goto :goto_7

    :cond_b
    invoke-static {p2}, LK/k;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v3

    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    invoke-virtual {v3, v5, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :goto_7
    const/16 v2, 0x1e

    if-lt v7, v2, :cond_c

    invoke-static {p1}, LJ/N;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_8

    :cond_c
    const v3, 0x7f08018b

    invoke-virtual {p1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    const-class v5, Ljava/lang/CharSequence;

    invoke-virtual {v5, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    move-object v4, v3

    :cond_d
    :goto_8
    check-cast v4, Ljava/lang/CharSequence;

    if-lt v7, v2, :cond_e

    invoke-static {p2, v4}, LK/l;->c(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    goto :goto_9

    :cond_e
    invoke-static {p2}, LK/k;->c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :goto_9
    iget-object v2, p0, LJ/a;->a:LJ/c;

    invoke-virtual {v2, p1, v1}, LJ/c;->d(Landroid/view/View;LK/p;)V

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    const p2, 0x7f080183

    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_f

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_f
    :goto_a
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-ge v6, p2, :cond_10

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LK/j;

    invoke-virtual {v1, p2}, LK/p;->b(LK/j;)V

    add-int/2addr v6, v0

    goto :goto_a

    :cond_10
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, LJ/a;->a:LJ/c;

    invoke-virtual {v0, p1, p2}, LJ/c;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, LJ/a;->a:LJ/c;

    invoke-virtual {v0, p1, p2, p3}, LJ/c;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, LJ/a;->a:LJ/c;

    invoke-virtual {v0, p1, p2, p3}, LJ/c;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, LJ/a;->a:LJ/c;

    invoke-virtual {v0, p1, p2}, LJ/c;->h(Landroid/view/View;I)V

    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, LJ/a;->a:LJ/c;

    invoke-virtual {v0, p1, p2}, LJ/c;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
