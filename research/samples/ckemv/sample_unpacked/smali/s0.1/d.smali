.class public final Ls0/d;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ls0/e;


# direct methods
.method public constructor <init>(Ls0/e;LO1/d;)V
    .locals 0

    iput-object p1, p0, Ls0/d;->h:Ls0/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 2

    new-instance v0, Ls0/d;

    iget-object v1, p0, Ls0/d;->h:Ls0/e;

    invoke-direct {v0, v1, p1}, Ls0/d;-><init>(Ls0/e;LO1/d;)V

    iput-object p2, v0, Ls0/d;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg2/r;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, Ls0/d;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, Ls0/d;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, Ls0/d;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, LP1/a;->b:LP1/a;

    iget v1, p0, Ls0/d;->f:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    iget-object p1, p0, Ls0/d;->g:Ljava/lang/Object;

    check-cast p1, Lg2/r;

    new-instance v1, Ls0/c;

    iget-object v3, p0, Ls0/d;->h:Ls0/e;

    invoke-direct {v1, v3, p1}, Ls0/c;-><init>(Ls0/e;Lg2/r;)V

    iget-object v3, v3, Ls0/e;->a:Lt0/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Lt0/e;->c:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, v3, Lt0/e;->d:Ljava/util/LinkedHashSet;

    invoke-virtual {v5, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, v3, Lt0/e;->d:Ljava/util/LinkedHashSet;

    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-ne v5, v2, :cond_2

    invoke-virtual {v3}, Lt0/e;->a()Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v3, Lt0/e;->e:Ljava/lang/Object;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v5

    sget v6, Lt0/f;->a:I

    iget-object v6, v3, Lt0/e;->e:Ljava/lang/Object;

    invoke-static {v6}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Lt0/e;->c()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    iget-object v3, v3, Lt0/e;->e:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ls0/c;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit v4

    new-instance v3, Ls0/b;

    iget-object v4, p0, Ls0/d;->h:Ls0/e;

    invoke-direct {v3, v4, v1}, Ls0/b;-><init>(Ls0/e;Ls0/c;)V

    iput v2, p0, Ls0/d;->f:I

    invoke-static {p1, v3, p0}, Lu2/l;->b(Lg2/r;Ls0/b;LO1/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1

    :goto_2
    monitor-exit v4

    throw p1
.end method
