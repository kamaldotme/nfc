.class public abstract Le2/a;
.super Le2/Z;
.source "SourceFile"

# interfaces
.implements LO1/d;
.implements Le2/t;


# instance fields
.field public final d:LO1/i;


# direct methods
.method public constructor <init>(LO1/i;Z)V
    .locals 0

    invoke-direct {p0, p2}, Le2/Z;-><init>(Z)V

    sget-object p2, Le2/s;->c:Le2/s;

    invoke-interface {p1, p2}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object p2

    check-cast p2, Le2/Q;

    invoke-virtual {p0, p2}, Le2/Z;->I(Le2/Q;)V

    invoke-interface {p1, p0}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p1

    iput-object p1, p0, Le2/a;->d:LO1/i;

    return-void
.end method


# virtual methods
.method public final H(LK1/b;)V
    .locals 1

    iget-object v0, p0, Le2/a;->d:LO1/i;

    invoke-static {v0, p1}, Le2/v;->h(LO1/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final M()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Le2/Z;->M()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final P(Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p1, Le2/m;

    if-eqz v0, :cond_1

    check-cast p1, Le2/m;

    iget-object v0, p1, Le2/m;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Le2/m;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, v0, p1}, Le2/a;->V(Ljava/lang/Throwable;Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Le2/a;->W(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public V(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method public W(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final X(ILe2/a;LW1/p;)V
    .locals 2

    invoke-static {p1}, Lq/h;->a(I)I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    :try_start_0
    iget-object p1, p0, Le2/a;->d:LO1/i;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lj2/a;->n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v0, p3}, LX1/m;->a(ILjava/lang/Object;)V

    invoke-interface {p3, p2, p0}, LW1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {p1, v1}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget-object p1, LP1/a;->b:LP1/a;

    if-eq p2, p1, :cond_3

    invoke-virtual {p0, p2}, Le2/a;->c(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_3
    invoke-static {p1, v1}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    invoke-static {p1}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Le2/a;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, LK1/b;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    invoke-static {p3, p2, p0}, Lv0/f;->q(LW1/p;Ljava/lang/Object;LO1/d;)LO1/d;

    move-result-object p1

    invoke-static {p1}, Lv0/f;->y(LO1/d;)LO1/d;

    move-result-object p1

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-interface {p1, p2}, LO1/d;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p3, p2, p0}, Lu2/l;->M(LW1/p;Le2/a;Le2/a;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public b()Z
    .locals 1

    invoke-super {p0}, Le2/Z;->b()Z

    move-result v0

    return v0
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, LK1/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Le2/m;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Le2/m;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    invoke-virtual {p0, p1}, Le2/Z;->L(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Le2/v;->e:Ld1/f;

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Le2/a;->r(Ljava/lang/Object;)V

    return-void
.end method

.method public final j()LO1/i;
    .locals 1

    iget-object v0, p0, Le2/a;->d:LO1/i;

    return-object v0
.end method

.method public final m()LO1/i;
    .locals 1

    iget-object v0, p0, Le2/a;->d:LO1/i;

    return-object v0
.end method

.method public final v()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
