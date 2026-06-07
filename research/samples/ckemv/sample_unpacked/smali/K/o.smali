.class public final LK/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/o;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(IIIIZ)LK/o;
    .locals 7

    new-instance v0, LK/o;

    const/4 v5, 0x0

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v6, p4

    invoke-static/range {v1 .. v6}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object p0

    invoke-direct {v0, p0}, LK/o;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    return-object v0
.end method
