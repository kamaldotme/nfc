.class public final Le2/j0;
.super Lj2/t;
.source "SourceFile"


# instance fields
.field public final f:Ljava/lang/ThreadLocal;

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(LO1/d;LO1/i;)V
    .locals 2

    sget-object v0, Le2/k0;->b:Le2/k0;

    invoke-interface {p2, v0}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p2, v0}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    invoke-direct {p0, p1, v0}, Lj2/t;-><init>(LO1/d;LO1/i;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Le2/j0;->f:Ljava/lang/ThreadLocal;

    invoke-interface {p1}, LO1/d;->j()LO1/i;

    move-result-object p1

    sget-object v0, LO1/e;->b:LO1/e;

    invoke-interface {p1, v0}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object p1

    instance-of p1, p1, Le2/r;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-static {p2, p1}, Lj2/a;->n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    invoke-virtual {p0, p2, p1}, Le2/j0;->Z(LO1/i;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final Y()Z
    .locals 3

    iget-boolean v0, p0, Le2/j0;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Le2/j0;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Le2/j0;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/2addr v0, v1

    return v0
.end method

.method public final Z(LO1/i;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Le2/j0;->threadLocalIsSet:Z

    iget-object v0, p0, Le2/j0;->f:Ljava/lang/ThreadLocal;

    new-instance v1, LK1/c;

    invoke-direct {v1, p1, p2}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 5

    iget-boolean v0, p0, Le2/j0;->threadLocalIsSet:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Le2/j0;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK1/c;

    if-eqz v0, :cond_0

    iget-object v1, v0, LK1/c;->b:Ljava/lang/Object;

    check-cast v1, LO1/i;

    iget-object v0, v0, LK1/c;->c:Ljava/lang/Object;

    invoke-static {v1, v0}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Le2/j0;->f:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_1
    invoke-static {p1}, Le2/v;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lj2/t;->e:LO1/d;

    invoke-interface {v0}, LO1/d;->j()LO1/i;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lj2/a;->n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lj2/a;->f:Ld1/f;

    if-eq v3, v4, :cond_2

    invoke-static {v0, v1, v3}, Le2/v;->o(LO1/d;LO1/i;Ljava/lang/Object;)Le2/j0;

    move-result-object v2

    :cond_2
    :try_start_0
    iget-object v0, p0, Lj2/t;->e:LO1/d;

    invoke-interface {v0, p1}, LO1/d;->c(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Le2/j0;->Y()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v1, v3}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Le2/j0;->Y()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    invoke-static {v1, v3}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    :cond_6
    throw p1
.end method
