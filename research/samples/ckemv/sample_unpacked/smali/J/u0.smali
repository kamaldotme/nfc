.class public LJ/u0;
.super LJ/t0;
.source "SourceFile"


# instance fields
.field public n:LA/d;

.field public o:LA/d;

.field public p:LA/d;


# direct methods
.method public constructor <init>(LJ/y0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LJ/t0;-><init>(LJ/y0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, LJ/u0;->n:LA/d;

    iput-object p1, p0, LJ/u0;->o:LA/d;

    iput-object p1, p0, LJ/u0;->p:LA/d;

    return-void
.end method


# virtual methods
.method public g()LA/d;
    .locals 1

    iget-object v0, p0, LJ/u0;->o:LA/d;

    if-nez v0, :cond_0

    iget-object v0, p0, LJ/r0;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LA/b;->s(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LA/d;->c(Landroid/graphics/Insets;)LA/d;

    move-result-object v0

    iput-object v0, p0, LJ/u0;->o:LA/d;

    :cond_0
    iget-object v0, p0, LJ/u0;->o:LA/d;

    return-object v0
.end method

.method public i()LA/d;
    .locals 1

    iget-object v0, p0, LJ/u0;->n:LA/d;

    if-nez v0, :cond_0

    iget-object v0, p0, LJ/r0;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LA/b;->x(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LA/d;->c(Landroid/graphics/Insets;)LA/d;

    move-result-object v0

    iput-object v0, p0, LJ/u0;->n:LA/d;

    :cond_0
    iget-object v0, p0, LJ/u0;->n:LA/d;

    return-object v0
.end method

.method public k()LA/d;
    .locals 1

    iget-object v0, p0, LJ/u0;->p:LA/d;

    if-nez v0, :cond_0

    iget-object v0, p0, LJ/r0;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, LA/b;->c(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LA/d;->c(Landroid/graphics/Insets;)LA/d;

    move-result-object v0

    iput-object v0, p0, LJ/u0;->p:LA/d;

    :cond_0
    iget-object v0, p0, LJ/u0;->p:LA/d;

    return-object v0
.end method

.method public l(IIII)LJ/y0;
    .locals 1

    iget-object v0, p0, LJ/r0;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, LA/b;->h(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, LJ/y0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LJ/y0;

    move-result-object p1

    return-object p1
.end method

.method public q(LA/d;)V
    .locals 0

    return-void
.end method
