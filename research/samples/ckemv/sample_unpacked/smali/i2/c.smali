.class public final Li2/c;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lh2/g;

.field public final synthetic i:Lh2/b;


# direct methods
.method public constructor <init>(LO1/d;Lh2/b;Lh2/g;)V
    .locals 0

    iput-object p3, p0, Li2/c;->h:Lh2/g;

    iput-object p2, p0, Li2/c;->i:Lh2/b;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 3

    new-instance v0, Li2/c;

    iget-object v1, p0, Li2/c;->h:Lh2/g;

    iget-object v2, p0, Li2/c;->i:Lh2/b;

    invoke-direct {v0, p1, v2, v1}, Li2/c;-><init>(LO1/d;Lh2/b;Lh2/g;)V

    iput-object p2, v0, Li2/c;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Li2/c;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Li2/c;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Li2/c;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, Li2/c;->f:I

    sget-object v2, LK1/h;->a:LK1/h;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, Li2/c;->g:Ljava/lang/Object;

    check-cast p1, Le2/t;

    iget-object v1, p0, Li2/c;->i:Lh2/b;

    iget v4, v1, Lh2/b;->b:I

    const/4 v5, -0x3

    if-ne v4, v5, :cond_2

    const/4 v4, -0x2

    :cond_2
    new-instance v5, Li2/d;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, Li2/d;-><init>(Lh2/b;LO1/d;)V

    const/4 v6, 0x4

    iget v7, v1, Lh2/b;->c:I

    invoke-static {v4, v7, v6}, Lu2/d;->a(III)Lg2/d;

    move-result-object v4

    invoke-interface {p1}, Le2/t;->m()LO1/i;

    move-result-object p1

    iget-object v1, v1, Lh2/b;->a:LO1/i;

    invoke-static {p1, v1, v3}, Le2/v;->e(LO1/i;LO1/i;Z)LO1/i;

    move-result-object p1

    sget-object v1, Le2/B;->a:Ll2/d;

    if-eq p1, v1, :cond_3

    sget-object v6, LO1/e;->b:LO1/e;

    invoke-interface {p1, v6}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-interface {p1, v1}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p1

    :cond_3
    new-instance v1, Lg2/q;

    invoke-direct {v1, p1, v4}, Lg2/q;-><init>(LO1/i;Lg2/d;)V

    const/4 p1, 0x3

    invoke-virtual {v1, p1, v1, v5}, Le2/a;->X(ILe2/a;LW1/p;)V

    iput v3, p0, Li2/c;->f:I

    iget-object p1, p0, Li2/c;->h:Lh2/g;

    invoke-static {p1, v1, v3, p0}, Lh2/p;->a(Lh2/g;Lg2/q;ZLO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    return-object v2
.end method
