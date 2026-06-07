.class public final LF0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Z

.field public final d:Ljava/lang/Runnable;

.field public final synthetic e:Lv/a;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LF0/i;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/i;->e:Lv/a;

    .line 4
    new-instance p1, LF0/h;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p0}, LF0/h;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, LF0/i;->d:Ljava/lang/Runnable;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LF0/i;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/i;->e:Lv/a;

    .line 2
    new-instance p1, LB2/u;

    const/4 v0, 0x4

    invoke-direct {p1, v0, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, LF0/i;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    const/4 v0, 0x1

    iget-object v1, p0, LF0/i;->d:Ljava/lang/Runnable;

    iget-object v2, p0, LF0/i;->e:Lv/a;

    iget v3, p0, LF0/i;->a:I

    packed-switch v3, :pswitch_data_0

    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, LF0/i;->b:I

    iget-boolean p1, p0, LF0/i;->c:Z

    if-nez p1, :cond_1

    iget-object p1, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v2, LJ/T;->a:Ljava/util/WeakHashMap;

    check-cast v1, LB2/u;

    invoke-static {p1, v1}, LJ/B;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-boolean v0, p0, LF0/i;->c:Z

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    iput p1, p0, LF0/i;->b:I

    iget-boolean p1, p0, LF0/i;->c:Z

    if-nez p1, :cond_3

    iget-object p1, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v2, LJ/T;->a:Ljava/util/WeakHashMap;

    check-cast v1, LF0/h;

    invoke-static {p1, v1}, LJ/B;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-boolean v0, p0, LF0/i;->c:Z

    :cond_3
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
