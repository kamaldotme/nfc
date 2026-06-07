.class public abstract LK/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IIIIZ)LK/o;
    .locals 1

    new-instance v0, LK/o;

    invoke-static {p0, p1, p2, p3, p4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object p0

    invoke-direct {v0, p0}, LK/o;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    return-object v0
.end method

.method public static b(IFFF)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/os/Bundle;
    .locals 0

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method
