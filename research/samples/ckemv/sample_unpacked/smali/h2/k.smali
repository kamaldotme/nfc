.class public final Lh2/k;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/q;


# instance fields
.field public f:I

.field public synthetic g:Lh2/g;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:LW1/p;


# direct methods
.method public constructor <init>(LW1/p;LO1/d;)V
    .locals 0

    iput-object p1, p0, Lh2/k;->i:LW1/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lh2/g;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p3, LO1/d;

    new-instance v0, Lh2/k;

    iget-object v1, p0, Lh2/k;->i:LW1/p;

    invoke-direct {v0, v1, p3}, Lh2/k;-><init>(LW1/p;LO1/d;)V

    iput-object p1, v0, Lh2/k;->g:Lh2/g;

    iput-object p2, v0, Lh2/k;->h:Ljava/lang/Object;

    sget-object p1, LK1/h;->a:LK1/h;

    invoke-virtual {v0, p1}, Lh2/k;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, Lh2/k;->f:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lh2/k;->g:Lh2/g;

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object v1, p0, Lh2/k;->g:Lh2/g;

    iget-object p1, p0, Lh2/k;->h:Ljava/lang/Object;

    iput-object v1, p0, Lh2/k;->g:Lh2/g;

    iput v3, p0, Lh2/k;->f:I

    iget-object v3, p0, Lh2/k;->i:LW1/p;

    invoke-interface {v3, p1, p0}, LW1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    const/4 v3, 0x0

    iput-object v3, p0, Lh2/k;->g:Lh2/g;

    iput v2, p0, Lh2/k;->f:I

    invoke-interface {v1, p0, p1}, Lh2/g;->b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method
