.class public final LB2/k;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public synthetic f:I

.field public final synthetic g:Lxyz/happify/ckemv/MainActivity;


# direct methods
.method public constructor <init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V
    .locals 0

    iput-object p1, p0, LB2/k;->g:Lxyz/happify/ckemv/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 2

    new-instance v0, LB2/k;

    iget-object v1, p0, LB2/k;->g:Lxyz/happify/ckemv/MainActivity;

    invoke-direct {v0, v1, p1}, LB2/k;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v0, LB2/k;->f:I

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, LO1/d;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, LB2/k;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, LB2/k;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, LB2/k;->k(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget p1, p0, LB2/k;->f:I

    iget-object v0, p0, LB2/k;->g:Lxyz/happify/ckemv/MainActivity;

    iget-object v0, v0, Lxyz/happify/ckemv/MainActivity;->C:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1

    :cond_0
    const-string p1, "progressBar"

    invoke-static {p1}, LX1/g;->h(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
