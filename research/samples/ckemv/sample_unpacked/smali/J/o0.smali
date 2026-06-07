.class public LJ/o0;
.super LJ/q0;
.source "SourceFile"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LJ/q0;-><init>()V

    .line 2
    invoke-static {}, LA/b;->e()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LJ/o0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(LJ/y0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LJ/q0;-><init>(LJ/y0;)V

    .line 4
    invoke-virtual {p1}, LJ/y0;->f()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, LA/b;->f(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, LA/b;->e()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LJ/o0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()LJ/y0;
    .locals 3

    invoke-virtual {p0}, LJ/q0;->a()V

    iget-object v0, p0, LJ/o0;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, LA/b;->g(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LJ/y0;->g(Landroid/view/View;Landroid/view/WindowInsets;)LJ/y0;

    move-result-object v0

    iget-object v1, p0, LJ/q0;->b:[LA/d;

    iget-object v2, v0, LJ/y0;->a:LJ/w0;

    invoke-virtual {v2, v1}, LJ/w0;->o([LA/d;)V

    return-object v0
.end method

.method public d(LA/d;)V
    .locals 1

    iget-object v0, p0, LJ/o0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LA/d;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA/b;->C(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public e(LA/d;)V
    .locals 1

    iget-object v0, p0, LJ/o0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LA/d;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA/b;->v(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public f(LA/d;)V
    .locals 1

    iget-object v0, p0, LJ/o0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LA/d;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA/b;->z(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public g(LA/d;)V
    .locals 1

    iget-object v0, p0, LJ/o0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LA/d;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA/b;->o(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public h(LA/d;)V
    .locals 1

    iget-object v0, p0, LJ/o0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LA/d;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LA/b;->D(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method
