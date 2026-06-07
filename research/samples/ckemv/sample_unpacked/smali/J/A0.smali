.class public final LJ/A0;
.super Lm0/z;
.source "SourceFile"


# instance fields
.field public final d:Landroid/view/WindowInsetsController;

.field public final e:LA/h;

.field public f:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/WindowInsetsController;LA/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ/A0;->d:Landroid/view/WindowInsetsController;

    iput-object p2, p0, LJ/A0;->e:LA/h;

    return-void
.end method


# virtual methods
.method public final d0(Z)V
    .locals 1

    iget-object v0, p0, LJ/A0;->f:Landroid/view/Window;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    or-int/lit8 v0, v0, 0x10

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    iget-object p1, p0, LJ/A0;->d:Landroid/view/WindowInsetsController;

    invoke-static {p1}, LJ/u;->x(Landroid/view/WindowInsetsController;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit8 v0, v0, -0x11

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_2
    iget-object p1, p0, LJ/A0;->d:Landroid/view/WindowInsetsController;

    invoke-static {p1}, LJ/u;->z(Landroid/view/WindowInsetsController;)V

    :goto_0
    return-void
.end method

.method public final e0(Z)V
    .locals 1

    iget-object v0, p0, LJ/A0;->f:Landroid/view/Window;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    or-int/lit16 v0, v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    iget-object p1, p0, LJ/A0;->d:Landroid/view/WindowInsetsController;

    invoke-static {p1}, LJ/u;->q(Landroid/view/WindowInsetsController;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit16 v0, v0, -0x2001

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_2
    iget-object p1, p0, LJ/A0;->d:Landroid/view/WindowInsetsController;

    invoke-static {p1}, LJ/u;->v(Landroid/view/WindowInsetsController;)V

    :goto_0
    return-void
.end method

.method public final i0()V
    .locals 2

    iget-object v0, p0, LJ/A0;->e:LA/h;

    iget-object v0, v0, LA/h;->c:Ljava/lang/Object;

    check-cast v0, LA/h;

    invoke-virtual {v0}, LA/h;->t()V

    iget-object v0, p0, LJ/A0;->d:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LJ/u;->r(Landroid/view/WindowInsetsController;I)V

    return-void
.end method
