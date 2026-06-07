.class public final Li2/f;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public final synthetic g:Lh2/b;

.field public final synthetic h:Lh2/g;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh2/b;Lh2/g;Ljava/lang/Object;LO1/d;)V
    .locals 0

    iput-object p1, p0, Li2/f;->g:Lh2/b;

    iput-object p2, p0, Li2/f;->h:Lh2/g;

    iput-object p3, p0, Li2/f;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 3

    new-instance p2, Li2/f;

    iget-object v0, p0, Li2/f;->h:Lh2/g;

    iget-object v1, p0, Li2/f;->i:Ljava/lang/Object;

    iget-object v2, p0, Li2/f;->g:Lh2/b;

    invoke-direct {p2, v2, v0, v1, p1}, Li2/f;-><init>(Lh2/b;Lh2/g;Ljava/lang/Object;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Li2/f;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Li2/f;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Li2/f;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, Li2/f;->f:I

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

    iget-object p1, p0, Li2/f;->g:Lh2/b;

    iget-object p1, p1, Lh2/b;->f:LK1/a;

    check-cast p1, LW1/q;

    iput v2, p0, Li2/f;->f:I

    iget-object v1, p0, Li2/f;->h:Lh2/g;

    iget-object v2, p0, Li2/f;->i:Ljava/lang/Object;

    invoke-interface {p1, v1, v2, p0}, LW1/q;->a(Lh2/g;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
