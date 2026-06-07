.class public Lj0/y;
.super Lm0/z;
.source "SourceFile"


# static fields
.field public static d:Z = true

.field public static e:Z = true

.field public static f:Z = true

.field public static g:Z = true


# virtual methods
.method public g0(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, Lm0/z;->g0(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj0/y;->g:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, Lj0/x;->c(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lj0/y;->g:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public p0(Landroid/view/View;IIII)V
    .locals 1

    sget-boolean v0, Lj0/y;->f:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, LA/b;->l(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lj0/y;->f:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public q0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, Lj0/y;->d:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LA/b;->m(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lj0/y;->d:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public r0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, Lj0/y;->e:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LA/b;->u(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lj0/y;->e:Z

    :cond_0
    :goto_0
    return-void
.end method
