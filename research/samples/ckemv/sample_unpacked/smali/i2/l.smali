.class public final Li2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/g;


# instance fields
.field public final synthetic a:Lg2/h;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Lg2/h;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/l;->a:Lg2/h;

    iput p2, p0, Li2/l;->b:I

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Li2/k;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Li2/k;

    iget v1, v0, Li2/k;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li2/k;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Li2/k;

    invoke-direct {v0, p0, p1}, Li2/k;-><init>(Li2/l;LO1/d;)V

    :goto_0
    iget-object p1, v0, Li2/k;->e:Ljava/lang/Object;

    sget-object v1, LP1/a;->b:LP1/a;

    iget v2, v0, Li2/k;->g:I

    sget-object v3, LK1/h;->a:LK1/h;

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    new-instance p1, LL1/w;

    iget v2, p0, Li2/l;->b:I

    invoke-direct {p1, v2, p2}, LL1/w;-><init>(ILjava/lang/Object;)V

    iput v4, v0, Li2/k;->g:I

    iget-object p2, p0, Li2/l;->a:Lg2/h;

    invoke-interface {p2, v0, p1}, Lg2/u;->g(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    iput v5, v0, Li2/k;->g:I

    iget-object p1, v0, LQ1/b;->c:LO1/i;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    sget-object p2, Le2/s;->c:Le2/s;

    invoke-interface {p1, p2}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object p2

    check-cast p2, Le2/Q;

    if-eqz p2, :cond_6

    invoke-interface {p2}, Le2/Q;->b()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    check-cast p2, Le2/Z;

    invoke-virtual {p2}, Le2/Z;->B()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    throw p1

    :cond_6
    :goto_2
    invoke-static {v0}, Lv0/f;->y(LO1/d;)LO1/d;

    move-result-object p2

    instance-of v0, p2, Lj2/h;

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    check-cast p2, Lj2/h;

    goto :goto_3

    :cond_7
    move-object p2, v2

    :goto_3
    if-nez p2, :cond_9

    :cond_8
    :goto_4
    move-object p1, v3

    goto :goto_7

    :cond_9
    iget-object v0, p2, Lj2/h;->e:Le2/r;

    invoke-virtual {v0}, Le2/r;->K()Z

    move-result v5

    if-eqz v5, :cond_a

    iput-object v3, p2, Lj2/h;->g:Ljava/lang/Object;

    iput v4, p2, Le2/A;->d:I

    invoke-virtual {v0, p1, p2}, Le2/r;->J(LO1/i;Ljava/lang/Runnable;)V

    goto :goto_5

    :cond_a
    new-instance v5, Le2/m0;

    sget-object v6, Le2/m0;->d:Le2/s;

    invoke-direct {v5, v6}, LO1/a;-><init>(LO1/h;)V

    invoke-interface {p1, v5}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p1

    iput-object v3, p2, Lj2/h;->g:Ljava/lang/Object;

    iput v4, p2, Le2/A;->d:I

    invoke-virtual {v0, p1, p2}, Le2/r;->J(LO1/i;Ljava/lang/Runnable;)V

    iget-boolean p1, v5, Le2/m0;->c:Z

    if-eqz p1, :cond_c

    invoke-static {}, Le2/h0;->a()Le2/I;

    move-result-object p1

    iget-object v0, p1, Le2/I;->f:LL1/i;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, LL1/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {p1}, Le2/I;->P()Z

    move-result v0

    if-eqz v0, :cond_d

    iput-object v3, p2, Lj2/h;->g:Ljava/lang/Object;

    iput v4, p2, Le2/A;->d:I

    invoke-virtual {p1, p2}, Le2/I;->M(Le2/A;)V

    :cond_c
    :goto_5
    move-object p1, v1

    goto :goto_7

    :cond_d
    invoke-virtual {p1, v4}, Le2/I;->O(Z)V

    :try_start_0
    invoke-virtual {p2}, Le2/A;->run()V

    :cond_e
    invoke-virtual {p1}, Le2/I;->Q()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_e

    :goto_6
    invoke-virtual {p1}, Le2/I;->L()V

    goto :goto_4

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-virtual {p2, v0, v2}, Le2/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p2

    invoke-virtual {p1}, Le2/I;->L()V

    throw p2

    :goto_7
    if-ne p1, v1, :cond_f

    goto :goto_8

    :cond_f
    move-object p1, v3

    :goto_8
    if-ne p1, v1, :cond_10

    return-object v1

    :cond_10
    :goto_9
    return-object v3
.end method
