.class public final LB2/n;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public final synthetic f:Lxyz/happify/ckemv/MainActivity;


# direct methods
.method public constructor <init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V
    .locals 0

    iput-object p1, p0, LB2/n;->f:Lxyz/happify/ckemv/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 1

    new-instance p2, LB2/n;

    iget-object v0, p0, LB2/n;->f:Lxyz/happify/ckemv/MainActivity;

    invoke-direct {p2, v0, p1}, LB2/n;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, LB2/n;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, LB2/n;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, LB2/n;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, LB2/n;->f:Lxyz/happify/ckemv/MainActivity;

    const-string v0, "\u2705"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    const/16 v0, 0x11

    invoke-virtual {p1, v0, v1, v1}, Landroid/widget/Toast;->setGravity(III)V

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-object p1
.end method
