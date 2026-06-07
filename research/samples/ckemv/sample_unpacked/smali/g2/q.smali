.class public final Lg2/q;
.super Le2/a;
.source "SourceFile"

# interfaces
.implements Lg2/r;
.implements Lg2/h;


# instance fields
.field public final e:Lg2/h;


# direct methods
.method public constructor <init>(LO1/i;Lg2/d;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Le2/a;-><init>(LO1/i;Z)V

    iput-object p2, p0, Lg2/q;->e:Lg2/h;

    return-void
.end method


# virtual methods
.method public final V(Ljava/lang/Throwable;Z)V
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0, p1}, Lg2/u;->k(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    iget-object p2, p0, Le2/a;->d:LO1/i;

    invoke-static {p2, p1}, Le2/v;->h(LO1/i;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final W(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, LK1/h;

    const/4 p1, 0x0

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0, p1}, Lg2/u;->k(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final a(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    invoke-virtual {p0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Le2/m;

    if-nez v1, :cond_2

    instance-of v1, v0, Le2/X;

    if-eqz v1, :cond_0

    check-cast v0, Le2/X;

    invoke-virtual {v0}, Le2/X;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Le2/S;

    invoke-virtual {p0}, Le2/a;->v()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Le2/S;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le2/Q;)V

    :cond_1
    invoke-virtual {p0, p1}, Lg2/q;->t(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final b()Z
    .locals 1

    invoke-super {p0}, Le2/a;->b()Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0}, Lg2/u;->d()Z

    move-result v0

    return v0
.end method

.method public final e(LL1/a;)V
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0, p1}, Lg2/u;->e(LL1/a;)V

    return-void
.end method

.method public final g(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0, p1, p2}, Lg2/u;->g(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0}, Lg2/t;->h()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Lg2/a;
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0}, Lg2/t;->iterator()Lg2/a;

    move-result-object v0

    return-object v0
.end method

.method public final k(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0, p1}, Lg2/u;->k(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0, p1}, Lg2/u;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n(LO1/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0, p1}, Lg2/t;->n(LO1/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final t(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    iget-object v0, p0, Lg2/q;->e:Lg2/h;

    invoke-interface {v0, p1}, Lg2/t;->a(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {p0, p1}, Le2/Z;->s(Ljava/lang/Object;)Z

    return-void
.end method
