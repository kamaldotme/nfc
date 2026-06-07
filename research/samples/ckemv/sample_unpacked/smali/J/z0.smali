.class public final LJ/z0;
.super Lm0/z;
.source "SourceFile"


# instance fields
.field public final d:Landroid/view/Window;

.field public final e:LA/h;


# direct methods
.method public constructor <init>(Landroid/view/Window;LA/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ/z0;->d:Landroid/view/Window;

    iput-object p2, p0, LJ/z0;->e:LA/h;

    return-void
.end method


# virtual methods
.method public final d0(Z)V
    .locals 2

    const/16 v0, 0x10

    if-eqz p1, :cond_0

    iget-object p1, p0, LJ/z0;->d:Landroid/view/Window;

    const/high16 v1, 0x8000000

    invoke-virtual {p1, v1}, Landroid/view/Window;->clearFlags(I)V

    const/high16 v1, -0x80000000

    invoke-virtual {p1, v1}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LJ/z0;->p0(I)V

    :goto_0
    return-void
.end method

.method public final e0(Z)V
    .locals 2

    const/16 v0, 0x2000

    if-eqz p1, :cond_0

    iget-object p1, p0, LJ/z0;->d:Landroid/view/Window;

    const/high16 v1, 0x4000000

    invoke-virtual {p1, v1}, Landroid/view/Window;->clearFlags(I)V

    const/high16 v1, -0x80000000

    invoke-virtual {p1, v1}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LJ/z0;->p0(I)V

    :goto_0
    return-void
.end method

.method public final i0()V
    .locals 4

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_4

    const/16 v2, 0x8

    and-int v3, v2, v1

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    if-eq v1, v0, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, LJ/z0;->e:LA/h;

    iget-object v2, v2, LA/h;->c:Ljava/lang/Object;

    check-cast v2, LA/h;

    invoke-virtual {v2}, LA/h;->t()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v3}, LJ/z0;->p0(I)V

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    invoke-virtual {p0, v2}, LJ/z0;->p0(I)V

    iget-object v2, p0, LJ/z0;->d:Landroid/view/Window;

    const/16 v3, 0x400

    invoke-virtual {v2, v3}, Landroid/view/Window;->clearFlags(I)V

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final p0(I)V
    .locals 2

    iget-object v0, p0, LJ/z0;->d:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    not-int p1, p1

    and-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
