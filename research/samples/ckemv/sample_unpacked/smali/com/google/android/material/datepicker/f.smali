.class public final Lcom/google/android/material/datepicker/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/google/android/material/datepicker/s;

.field public final synthetic d:Lcom/google/android/material/datepicker/k;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/s;I)V
    .locals 0

    iput p3, p0, Lcom/google/android/material/datepicker/f;->b:I

    iput-object p1, p0, Lcom/google/android/material/datepicker/f;->d:Lcom/google/android/material/datepicker/k;

    iput-object p2, p0, Lcom/google/android/material/datepicker/f;->c:Lcom/google/android/material/datepicker/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, Lcom/google/android/material/datepicker/f;->b:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/f;->d:Lcom/google/android/material/datepicker/k;

    iget-object v0, p1, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, LZ/H;->v()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0(IIZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, LZ/H;->F(Landroid/view/View;)I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    iget-object v1, p1, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()LZ/z;

    move-result-object v1

    invoke-virtual {v1}, LZ/z;->a()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->c:Lcom/google/android/material/datepicker/s;

    iget-object v1, v1, Lcom/google/android/material/datepicker/s;->c:Lcom/google/android/material/datepicker/b;

    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->b:Lcom/google/android/material/datepicker/o;

    iget-object v1, v1, Lcom/google/android/material/datepicker/o;->b:Ljava/util/Calendar;

    invoke-static {v1}, Lcom/google/android/material/datepicker/w;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    new-instance v0, Lcom/google/android/material/datepicker/o;

    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/o;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/k;->A(Lcom/google/android/material/datepicker/o;)V

    :cond_1
    return-void

    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/f;->d:Lcom/google/android/material/datepicker/k;

    iget-object v0, p1, Lcom/google/android/material/datepicker/k;->Z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LZ/H;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->c:Lcom/google/android/material/datepicker/s;

    iget-object v1, v1, Lcom/google/android/material/datepicker/s;->c:Lcom/google/android/material/datepicker/b;

    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->b:Lcom/google/android/material/datepicker/o;

    iget-object v1, v1, Lcom/google/android/material/datepicker/o;->b:Ljava/util/Calendar;

    invoke-static {v1}, Lcom/google/android/material/datepicker/w;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    new-instance v0, Lcom/google/android/material/datepicker/o;

    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/o;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/k;->A(Lcom/google/android/material/datepicker/o;)V

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
