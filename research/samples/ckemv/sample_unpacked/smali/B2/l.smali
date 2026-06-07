.class public final LB2/l;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public final synthetic g:Lxyz/happify/ckemv/MainActivity;


# direct methods
.method public constructor <init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V
    .locals 0

    iput-object p1, p0, LB2/l;->g:Lxyz/happify/ckemv/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 1

    new-instance p2, LB2/l;

    iget-object v0, p0, LB2/l;->g:Lxyz/happify/ckemv/MainActivity;

    invoke-direct {p2, v0, p1}, LB2/l;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, LB2/l;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, LB2/l;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, LB2/l;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, LB2/l;->f:I

    sget-object v2, LK1/h;->a:LK1/h;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, LB2/l;->g:Lxyz/happify/ckemv/MainActivity;

    iget-object v6, p1, Lxyz/happify/ckemv/MainActivity;->D:Lh2/o;

    new-instance v1, LB2/k;

    const/4 v4, 0x0

    invoke-direct {v1, p1, v4}, LB2/k;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    iput v3, p0, LB2/l;->f:I

    sget p1, Lh2/l;->a:I

    new-instance v5, Lh2/k;

    invoke-direct {v5, v1, v4}, Lh2/k;-><init>(LW1/p;LO1/d;)V

    new-instance p1, Lh2/b;

    sget-object v1, LO1/j;->b:LO1/j;

    const/4 v8, -0x2

    const/4 v3, 0x1

    move-object v4, p1

    move-object v7, v1

    move v9, v3

    invoke-direct/range {v4 .. v9}, Lh2/b;-><init>(LW1/q;Lh2/f;LO1/i;II)V

    const/4 v4, 0x0

    invoke-virtual {p1, v1, v4, v3}, Lh2/b;->f(LO1/i;II)Lh2/f;

    move-result-object p1

    sget-object v1, Li2/p;->a:Li2/p;

    invoke-interface {p1, v1, p0}, Lh2/f;->a(Lh2/g;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    return-object v2
.end method
