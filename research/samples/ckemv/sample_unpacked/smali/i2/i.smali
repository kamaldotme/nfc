.class public final Li2/i;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lh2/b;

.field public final synthetic i:Lh2/g;


# direct methods
.method public constructor <init>(LO1/d;Lh2/b;Lh2/g;)V
    .locals 0

    iput-object p2, p0, Li2/i;->h:Lh2/b;

    iput-object p3, p0, Li2/i;->i:Lh2/g;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 3

    new-instance v0, Li2/i;

    iget-object v1, p0, Li2/i;->h:Lh2/b;

    iget-object v2, p0, Li2/i;->i:Lh2/g;

    invoke-direct {v0, p1, v1, v2}, Li2/i;-><init>(LO1/d;Lh2/b;Lh2/g;)V

    iput-object p2, v0, Li2/i;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Li2/i;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Li2/i;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Li2/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, Li2/i;->f:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, Li2/i;->g:Ljava/lang/Object;

    check-cast p1, Le2/t;

    new-instance v1, LX1/j;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, LX1/j;-><init>(I)V

    iget-object v3, p0, Li2/i;->h:Lh2/b;

    iget-object v4, v3, Lh2/b;->e:Ljava/lang/Object;

    check-cast v4, Lh2/f;

    new-instance v5, Li2/h;

    iget-object v6, p0, Li2/i;->i:Lh2/g;

    invoke-direct {v5, v1, p1, v3, v6}, Li2/h;-><init>(LX1/j;Le2/t;Lh2/b;Lh2/g;)V

    iput v2, p0, Li2/i;->f:I

    invoke-interface {v4, v5, p0}, Lh2/f;->a(Lh2/g;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
