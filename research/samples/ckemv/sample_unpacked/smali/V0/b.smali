.class public final synthetic LV0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK/B;


# instance fields
.field public final synthetic b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV0/b;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iput p2, p0, LV0/b;->c:I

    return-void
.end method


# virtual methods
.method public final e(Landroid/view/View;)Z
    .locals 5

    iget-object p1, p0, LV0/b;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    iget v1, p0, LV0/b;->c:I

    if-eq v1, v0, :cond_4

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_2

    :cond_0
    iget-object v2, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    new-instance v3, LV0/c;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4, p1}, LV0/c;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroid/view/ViewParent;->isLayoutRequested()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v2}, LJ/E;->b(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, LV0/c;->run()V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {p1, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    :goto_1
    return v0

    :cond_4
    :goto_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "STATE_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-ne v1, v0, :cond_5

    const-string v0, "DRAGGING"

    goto :goto_3

    :cond_5
    const-string v0, "SETTLING"

    :goto_3
    const-string v1, " should not be set externally."

    invoke-static {v2, v0, v1}, LX/d;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
