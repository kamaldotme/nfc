.class public final Lk/H;
.super Lk/x0;
.source "SourceFile"


# instance fields
.field public final synthetic k:Lk/O;

.field public final synthetic l:Lk/S;


# direct methods
.method public constructor <init>(Lk/S;Landroid/view/View;Lk/O;)V
    .locals 0

    iput-object p1, p0, Lk/H;->l:Lk/S;

    iput-object p3, p0, Lk/H;->k:Lk/O;

    invoke-direct {p0, p2}, Lk/x0;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lj/D;
    .locals 1

    iget-object v0, p0, Lk/H;->k:Lk/O;

    return-object v0
.end method

.method public final c()Z
    .locals 3

    iget-object v0, p0, Lk/H;->l:Lk/S;

    invoke-virtual {v0}, Lk/S;->getInternalPopup()Lk/Q;

    move-result-object v1

    invoke-interface {v1}, Lk/Q;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lk/J;->b(Landroid/view/View;)I

    move-result v1

    invoke-static {v0}, Lk/J;->a(Landroid/view/View;)I

    move-result v2

    iget-object v0, v0, Lk/S;->g:Lk/Q;

    invoke-interface {v0, v1, v2}, Lk/Q;->g(II)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
