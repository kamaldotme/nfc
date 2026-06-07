.class public final Lk/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:LA/h;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/w;->a:Landroid/widget/TextView;

    new-instance v0, LA/h;

    invoke-direct {v0, p1}, LA/h;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lk/w;->b:LA/h;

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/AttributeSet;I)V
    .locals 3

    iget-object v0, p0, Lk/w;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Le/a;->i:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0xe

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0, v1}, Lk/w;->c(Z)V

    return-void

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lk/w;->b:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Lu2/d;

    invoke-virtual {v0, p1}, Lu2/d;->D(Z)V

    return-void
.end method

.method public final c(Z)V
    .locals 1

    iget-object v0, p0, Lk/w;->b:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, Lu2/d;

    invoke-virtual {v0, p1}, Lu2/d;->E(Z)V

    return-void
.end method
