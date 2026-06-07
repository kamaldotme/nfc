.class public final LJ/B0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm0/z;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, LA/h;

    invoke-direct {v0, p2}, LA/h;-><init>(Landroid/view/View;)V

    .line 5
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt p2, v1, :cond_0

    .line 6
    new-instance p2, LJ/A0;

    .line 7
    invoke-static {p1}, LJ/u;->l(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v1

    invoke-direct {p2, v1, v0}, LJ/A0;-><init>(Landroid/view/WindowInsetsController;LA/h;)V

    .line 8
    iput-object p1, p2, LJ/A0;->f:Landroid/view/Window;

    .line 9
    iput-object p2, p0, LJ/B0;->a:Lm0/z;

    goto :goto_0

    .line 10
    :cond_0
    new-instance p2, LJ/z0;

    .line 11
    invoke-direct {p2, p1, v0}, LJ/z0;-><init>(Landroid/view/Window;LA/h;)V

    .line 12
    iput-object p2, p0, LJ/B0;->a:Lm0/z;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LJ/A0;

    new-instance v1, LA/h;

    invoke-direct {v1, p1}, LA/h;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, v1}, LJ/A0;-><init>(Landroid/view/WindowInsetsController;LA/h;)V

    iput-object v0, p0, LJ/B0;->a:Lm0/z;

    return-void
.end method
