.class public final Li2/t;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lh2/g;


# direct methods
.method public constructor <init>(Lh2/g;LO1/d;)V
    .locals 0

    iput-object p1, p0, Li2/t;->h:Lh2/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 2

    new-instance v0, Li2/t;

    iget-object v1, p0, Li2/t;->h:Lh2/g;

    invoke-direct {v0, v1, p1}, Li2/t;-><init>(Lh2/g;LO1/d;)V

    iput-object p2, v0, Li2/t;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Li2/t;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Li2/t;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Li2/t;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, Li2/t;->f:I

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

    iget-object p1, p0, Li2/t;->g:Ljava/lang/Object;

    iput v2, p0, Li2/t;->f:I

    iget-object v1, p0, Li2/t;->h:Lh2/g;

    invoke-interface {v1, p0, p1}, Lh2/g;->b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
