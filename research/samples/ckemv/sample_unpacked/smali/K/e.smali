.class public final LK/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# instance fields
.field public final a:LK/d;


# direct methods
.method public constructor <init>(LK/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/e;->a:LK/d;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LK/e;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LK/e;

    iget-object v0, p0, LK/e;->a:LK/d;

    iget-object p1, p1, LK/e;->a:LK/d;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LK/e;->a:LK/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final onTouchExplorationStateChanged(Z)V
    .locals 2

    iget-object v0, p0, LK/e;->a:LK/d;

    check-cast v0, LB2/b;

    iget-object v0, v0, LB2/b;->b:Ljava/lang/Object;

    check-cast v0, LX0/k;

    iget-object v1, v0, LX0/k;->h:Landroid/widget/AutoCompleteTextView;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lu2/l;->w(Landroid/widget/EditText;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    sget-object v1, LJ/T;->a:Ljava/util/WeakHashMap;

    iget-object v0, v0, LX0/q;->d:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-static {v0, p1}, LJ/B;->s(Landroid/view/View;I)V

    :cond_1
    return-void
.end method
