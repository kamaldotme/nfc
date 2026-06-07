.class public final Lj2/h;
.super Le2/A;
.source "SourceFile"

# interfaces
.implements LQ1/c;
.implements LO1/d;


# static fields
.field public static final i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _reusableCancellableContinuation:Ljava/lang/Object;

.field public final e:Le2/r;

.field public final f:LO1/d;

.field public g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_reusableCancellableContinuation"

    const-class v2, Lj2/h;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lj2/h;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Le2/r;LQ1/b;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Le2/A;-><init>(I)V

    iput-object p1, p0, Lj2/h;->e:Le2/r;

    iput-object p2, p0, Lj2/h;->f:LO1/d;

    sget-object p1, Lj2/a;->c:Ld1/f;

    iput-object p1, p0, Lj2/h;->g:Ljava/lang/Object;

    iget-object p1, p2, LQ1/b;->c:LO1/i;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Lj2/a;->m(LO1/i;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lj2/h;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    instance-of v0, p1, Le2/n;

    if-eqz v0, :cond_0

    check-cast p1, Le2/n;

    iget-object p1, p1, Le2/n;->b:LW1/l;

    invoke-interface {p1, p2}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lj2/h;->f:LO1/d;

    invoke-interface {v0}, LO1/d;->j()LO1/i;

    move-result-object v1

    invoke-static {p1}, LK1/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v4, p1

    goto :goto_0

    :cond_0
    new-instance v4, Le2/m;

    invoke-direct {v4, v2, v3}, Le2/m;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    iget-object v2, p0, Lj2/h;->e:Le2/r;

    invoke-virtual {v2}, Le2/r;->K()Z

    move-result v5

    if-eqz v5, :cond_1

    iput-object v4, p0, Lj2/h;->g:Ljava/lang/Object;

    iput v3, p0, Le2/A;->d:I

    invoke-virtual {v2, v1, p0}, Le2/r;->I(LO1/i;Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_1
    invoke-static {}, Le2/h0;->a()Le2/I;

    move-result-object v1

    invoke-virtual {v1}, Le2/I;->P()Z

    move-result v2

    if-eqz v2, :cond_2

    iput-object v4, p0, Lj2/h;->g:Ljava/lang/Object;

    iput v3, p0, Le2/A;->d:I

    invoke-virtual {v1, p0}, Le2/I;->M(Le2/A;)V

    goto :goto_3

    :cond_2
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Le2/I;->O(Z)V

    :try_start_0
    invoke-interface {v0}, LO1/d;->j()LO1/i;

    move-result-object v2

    iget-object v3, p0, Lj2/h;->h:Ljava/lang/Object;

    invoke-static {v2, v3}, Lj2/a;->n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0, p1}, LO1/d;->c(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v2, v3}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {v1}, Le2/I;->Q()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_3

    :goto_1
    invoke-virtual {v1}, Le2/I;->L()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-static {v2, v3}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    const/4 v0, 0x0

    :try_start_4
    invoke-virtual {p0, p1, v0}, Le2/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :goto_3
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Le2/I;->L()V

    throw p1
.end method

.method public final d()LO1/d;
    .locals 0

    return-object p0
.end method

.method public final f()LQ1/c;
    .locals 2

    iget-object v0, p0, Lj2/h;->f:LO1/d;

    instance-of v1, v0, LQ1/c;

    if-eqz v1, :cond_0

    check-cast v0, LQ1/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj2/h;->g:Ljava/lang/Object;

    sget-object v1, Lj2/a;->c:Ld1/f;

    iput-object v1, p0, Lj2/h;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final j()LO1/i;
    .locals 1

    iget-object v0, p0, Lj2/h;->f:LO1/d;

    invoke-interface {v0}, LO1/d;->j()LO1/i;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DispatchedContinuation["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lj2/h;->e:Le2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj2/h;->f:LO1/d;

    invoke-static {v1}, Le2/v;->n(LO1/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
