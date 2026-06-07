.class public final LB2/i;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 1

    new-instance p2, LB2/i;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p1}, LQ1/g;-><init>(ILO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, LB2/i;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, LB2/i;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, LB2/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
