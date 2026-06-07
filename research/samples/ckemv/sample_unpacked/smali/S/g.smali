.class public final LS/g;
.super Lu2/d;
.source "SourceFile"


# instance fields
.field public final a:LS/f;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LS/f;

    invoke-direct {v0, p1}, LS/f;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LS/g;->a:LS/f;

    return-void
.end method


# virtual methods
.method public final D(Z)V
    .locals 2

    sget-object v0, Landroidx/emoji2/text/j;->j:Landroidx/emoji2/text/j;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LS/g;->a:LS/f;

    invoke-virtual {v0, p1}, LS/f;->D(Z)V

    return-void
.end method

.method public final E(Z)V
    .locals 2

    sget-object v0, Landroidx/emoji2/text/j;->j:Landroidx/emoji2/text/j;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    iget-object v1, p0, LS/g;->a:LS/f;

    if-eqz v0, :cond_1

    iput-boolean p1, v1, LS/f;->c:Z

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1}, LS/f;->E(Z)V

    :goto_1
    return-void
.end method

.method public final m([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 2

    sget-object v0, Landroidx/emoji2/text/j;->j:Landroidx/emoji2/text/j;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    iget-object v0, p0, LS/g;->a:LS/f;

    invoke-virtual {v0, p1}, LS/f;->m([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method
