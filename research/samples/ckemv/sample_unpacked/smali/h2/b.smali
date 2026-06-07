.class public final Lh2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/f;


# instance fields
.field public final a:LO1/i;

.field public final b:I

.field public final c:I

.field public final synthetic d:I

.field public final e:Ljava/lang/Object;

.field public final f:LK1/a;


# direct methods
.method public constructor <init>(LO1/i;II)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lh2/b;->a:LO1/i;

    .line 7
    iput p2, p0, Lh2/b;->b:I

    .line 8
    iput p3, p0, Lh2/b;->c:I

    return-void
.end method

.method public constructor <init>(LW1/p;LO1/i;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh2/b;->d:I

    .line 9
    invoke-direct {p0, p2, p3, p4}, Lh2/b;-><init>(LO1/i;II)V

    .line 10
    iput-object p1, p0, Lh2/b;->e:Ljava/lang/Object;

    .line 11
    iput-object p1, p0, Lh2/b;->f:LK1/a;

    return-void
.end method

.method public constructor <init>(LW1/q;Lh2/f;LO1/i;II)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh2/b;->d:I

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lh2/b;->d:I

    .line 2
    invoke-direct {p0, p3, p4, p5}, Lh2/b;-><init>(LO1/i;II)V

    .line 3
    iput-object p2, p0, Lh2/b;->e:Ljava/lang/Object;

    .line 4
    iput-object p1, p0, Lh2/b;->f:LK1/a;

    return-void
.end method


# virtual methods
.method public a(Lh2/g;LO1/d;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lh2/b;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lh2/b;->b(Lh2/g;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget-object v0, LP1/a;->b:LP1/a;

    sget-object v1, LK1/h;->a:LK1/h;

    iget v2, p0, Lh2/b;->b:I

    const/4 v3, -0x3

    if-ne v2, v3, :cond_4

    invoke-interface {p2}, LO1/d;->j()LO1/i;

    move-result-object v2

    iget-object v3, p0, Lh2/b;->a:LO1/i;

    invoke-interface {v2, v3}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object v3

    invoke-static {v3, v2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, p1, p2}, Lh2/b;->e(Lh2/g;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_0
    move-object v1, p1

    goto :goto_3

    :cond_0
    sget-object v4, LO1/e;->b:LO1/e;

    invoke-interface {v3, v4}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v5

    invoke-interface {v2, v4}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v2

    invoke-static {v5, v2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, LO1/d;->j()LO1/i;

    move-result-object v2

    instance-of v4, p1, Li2/r;

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    instance-of v4, p1, Li2/p;

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    new-instance v4, Lh2/d;

    invoke-direct {v4, p1, v2}, Lh2/d;-><init>(Lh2/g;LO1/i;)V

    move-object p1, v4

    :goto_1
    new-instance v2, Li2/e;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Li2/e;-><init>(Lh2/b;LO1/d;)V

    invoke-static {v3}, Lj2/a;->m(LO1/i;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, p1, v4, v2, p2}, Li2/q;->a(LO1/i;Ljava/lang/Object;Ljava/lang/Object;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v1

    :goto_2
    if-ne p1, v0, :cond_5

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p1, p2}, Lh2/b;->b(Lh2/g;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_0

    :cond_5
    :goto_3
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lh2/g;LO1/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Li2/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Li2/c;-><init>(LO1/d;Lh2/b;Lh2/g;)V

    invoke-static {v0, p2}, Le2/v;->c(LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LP1/a;->b:LP1/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, LK1/h;->a:LK1/h;

    :goto_0
    return-object p1
.end method

.method public final c(Lg2/r;LO1/d;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lh2/b;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Li2/r;

    invoke-direct {v0, p1}, Li2/r;-><init>(Lg2/u;)V

    invoke-virtual {p0, v0, p2}, Lh2/b;->e(Lh2/g;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LP1/a;->b:LP1/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, LK1/h;->a:LK1/h;

    :goto_0
    return-object p1

    :pswitch_0
    instance-of v0, p2, Lh2/a;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lh2/a;

    iget v1, v0, Lh2/a;->h:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_1

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/a;->h:I

    goto :goto_1

    :cond_1
    new-instance v0, Lh2/a;

    invoke-direct {v0, p0, p2}, Lh2/a;-><init>(Lh2/b;LO1/d;)V

    :goto_1
    iget-object p2, v0, Lh2/a;->f:Ljava/lang/Object;

    sget-object v1, LP1/a;->b:LP1/a;

    iget v2, v0, Lh2/a;->h:I

    sget-object v3, LK1/h;->a:LK1/h;

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v4, :cond_2

    iget-object p1, v0, Lh2/a;->e:Lg2/r;

    invoke-static {p2}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p2}, Lm0/z;->m0(Ljava/lang/Object;)V

    iput-object p1, v0, Lh2/a;->e:Lg2/r;

    iput v4, v0, Lh2/a;->h:I

    iget-object p2, p0, Lh2/b;->e:Ljava/lang/Object;

    check-cast p2, LW1/p;

    invoke-interface {p2, p1, v0}, LW1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p2, v3

    :goto_2
    if-ne p2, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    check-cast p1, Lg2/q;

    iget-object p1, p1, Lg2/q;->e:Lg2/h;

    invoke-interface {p1}, Lg2/u;->d()Z

    move-result p1

    if-eqz p1, :cond_6

    move-object v1, v3

    :goto_4
    return-object v1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(LO1/i;II)Lh2/b;
    .locals 7

    iget v0, p0, Lh2/b;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lh2/b;

    iget-object v1, p0, Lh2/b;->f:LK1/a;

    move-object v2, v1

    check-cast v2, LW1/q;

    iget-object v1, p0, Lh2/b;->e:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lh2/f;

    move-object v1, v0

    move-object v4, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lh2/b;-><init>(LW1/q;Lh2/f;LO1/i;II)V

    return-object v0

    :pswitch_0
    new-instance v0, Lh2/b;

    iget-object v1, p0, Lh2/b;->f:LK1/a;

    check-cast v1, LW1/p;

    invoke-direct {v0, v1, p1, p2, p3}, Lh2/b;-><init>(LW1/p;LO1/i;II)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Lh2/g;LO1/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Li2/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Li2/i;-><init>(LO1/d;Lh2/b;Lh2/g;)V

    invoke-static {v0, p2}, Le2/v;->c(LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LP1/a;->b:LP1/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method

.method public final f(LO1/i;II)Lh2/f;
    .locals 4

    iget-object v0, p0, Lh2/b;->a:LO1/i;

    invoke-interface {p1, v0}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p1

    const/4 v1, 0x1

    iget v2, p0, Lh2/b;->c:I

    iget v3, p0, Lh2/b;->b:I

    if-eq p3, v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 p3, -0x3

    if-ne v3, p3, :cond_1

    goto :goto_1

    :cond_1
    if-ne p2, p3, :cond_2

    :goto_0
    move p2, v3

    goto :goto_1

    :cond_2
    const/4 p3, -0x2

    if-ne v3, p3, :cond_3

    goto :goto_1

    :cond_3
    if-ne p2, p3, :cond_4

    goto :goto_0

    :cond_4
    add-int/2addr p2, v3

    if-ltz p2, :cond_5

    goto :goto_1

    :cond_5
    const p2, 0x7fffffff

    :goto_1
    move p3, v2

    :goto_2
    invoke-static {p1, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-ne p2, v3, :cond_6

    if-ne p3, v2, :cond_6

    return-object p0

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, Lh2/b;->d(LO1/i;II)Lh2/b;

    move-result-object p1

    return-object p1
.end method

.method public final g()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v1, LO1/j;->b:LO1/j;

    iget-object v2, p0, Lh2/b;->a:LO1/i;

    if-eq v2, v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "context="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v1, -0x3

    iget v2, p0, Lh2/b;->b:I

    if-eq v2, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "capacity="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const/4 v1, 0x1

    iget v2, p0, Lh2/b;->c:I

    if-eq v2, v1, :cond_2

    invoke-static {v2}, LX/d;->w(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onBufferOverflow="

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v1, ", "

    const/4 v2, 0x0

    const/16 v5, 0x3e

    invoke-static/range {v0 .. v5}, LL1/k;->W(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW1/l;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lh2/b;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lh2/b;->e:Ljava/lang/Object;

    check-cast v1, Lh2/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lh2/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "block["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh2/b;->e:Ljava/lang/Object;

    check-cast v1, LW1/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lh2/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
