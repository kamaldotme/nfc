.class public final LK/q;
.super Landroid/view/accessibility/AccessibilityNodeProvider;
.source "SourceFile"


# instance fields
.field public final a:LK/r;


# direct methods
.method public constructor <init>(LK/r;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    iput-object p1, p0, LK/q;->a:LK/r;

    return-void
.end method


# virtual methods
.method public final addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, LK/q;->a:LK/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    iget-object v0, p0, LK/q;->a:LK/r;

    invoke-virtual {v0, p1}, LK/r;->a(I)LK/p;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, LK/p;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    return-object p1
.end method

.method public final findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    .locals 0

    iget-object p1, p0, LK/q;->a:LK/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    iget-object v0, p0, LK/q;->a:LK/r;

    invoke-virtual {v0, p1}, LK/r;->b(I)LK/p;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, LK/p;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    return-object p1
.end method

.method public final performAction(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, LK/q;->a:LK/r;

    invoke-virtual {v0, p1, p2, p3}, LK/r;->c(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
