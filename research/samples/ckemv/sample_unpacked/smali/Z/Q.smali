.class public final LZ/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Landroid/view/animation/Interpolator;

.field public f:Z


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 5

    iget v0, p0, LZ/Q;->d:I

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v2, -0x1

    iput v2, p0, LZ/Q;->d:I

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->M(I)V

    iput-boolean v1, p0, LZ/Q;->f:Z

    return-void

    :cond_0
    iget-boolean v0, p0, LZ/Q;->f:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, LZ/Q;->e:Landroid/view/animation/Interpolator;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget v3, p0, LZ/Q;->c:I

    if-lt v3, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "If you provide an interpolator, you must set a positive duration"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iget v3, p0, LZ/Q;->c:I

    if-lt v3, v2, :cond_3

    iget v2, p0, LZ/Q;->a:I

    iget v4, p0, LZ/Q;->b:I

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->a0:LZ/V;

    invoke-virtual {p1, v2, v4, v3, v0}, LZ/V;->b(IIILandroid/view/animation/Interpolator;)V

    iput-boolean v1, p0, LZ/Q;->f:Z

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Scroll duration must be a positive number"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-void
.end method
