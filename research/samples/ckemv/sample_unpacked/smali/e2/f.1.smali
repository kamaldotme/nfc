.class public final Le2/f;
.super Le2/A;
.source "SourceFile"

# interfaces
.implements Le2/e;
.implements LQ1/c;
.implements Le2/l0;


# static fields
.field public static final g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _decisionAndIndex:I

.field private volatile _parentHandle:Ljava/lang/Object;

.field private volatile _state:Ljava/lang/Object;

.field public final e:LO1/d;

.field public final f:LO1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_decisionAndIndex"

    const-class v1, Le2/f;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Le2/f;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "_state"

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Le2/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(ILO1/d;)V
    .locals 0

    invoke-direct {p0, p1}, Le2/A;-><init>(I)V

    iput-object p2, p0, Le2/f;->e:LO1/d;

    invoke-interface {p2}, LO1/d;->j()LO1/i;

    move-result-object p1

    iput-object p1, p0, Le2/f;->f:LO1/i;

    const p1, 0x1fffffff

    iput p1, p0, Le2/f;->_decisionAndIndex:I

    sget-object p1, Le2/b;->b:Le2/b;

    iput-object p1, p0, Le2/f;->_state:Ljava/lang/Object;

    return-void
.end method

.method public static A(Le2/d0;Ljava/lang/Object;ILW1/l;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Le2/m;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p2}, Le2/v;->j(I)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_2

    :cond_1
    if-nez p3, :cond_2

    instance-of p2, p0, Le2/d;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p2, Le2/l;

    instance-of v0, p0, Le2/d;

    if-eqz v0, :cond_3

    check-cast p0, Le2/d;

    :goto_0
    move-object v2, p0

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    const/16 v5, 0x10

    const/4 v4, 0x0

    move-object v0, p2

    move-object v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Le2/l;-><init>(Ljava/lang/Object;Le2/d;LW1/l;Ljava/util/concurrent/CancellationException;I)V

    move-object p1, p2

    :goto_2
    return-object p1
.end method

.method public static w(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", already has "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Lj2/u;I)V
    .locals 4

    :cond_0
    sget-object v0, Le2/f;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x1fffffff

    and-int v3, v1, v2

    if-ne v3, v2, :cond_1

    shr-int/lit8 v2, v1, 0x1d

    shl-int/lit8 v2, v2, 0x1d

    add-int/2addr v2, p2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Le2/f;->u(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "invokeOnCancellation should be called at most once"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 8

    :goto_0
    sget-object p1, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v0, v6, Le2/d0;

    if-nez v0, :cond_a

    instance-of v0, v6, Le2/m;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    instance-of v0, v6, Le2/l;

    if-eqz v0, :cond_7

    move-object v0, v6

    check-cast v0, Le2/l;

    iget-object v1, v0, Le2/l;->e:Ljava/lang/Throwable;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    xor-int/2addr v1, v2

    if-eqz v1, :cond_6

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-static {v0, v2, p2, v1}, Le2/l;->a(Le2/l;Le2/d;Ljava/util/concurrent/CancellationException;I)Le2/l;

    move-result-object v1

    :cond_2
    invoke-virtual {p1, p0, v6, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object p1, v0, Le2/l;->b:Le2/d;

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1, p2}, Le2/f;->k(Le2/d;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p1, v0, Le2/l;->c:LW1/l;

    if-eqz p1, :cond_4

    invoke-virtual {p0, p1, p2}, Le2/f;->l(LW1/l;Ljava/lang/Throwable;)V

    :cond_4
    return-void

    :cond_5
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v6, :cond_2

    goto :goto_0

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Must be called at most once"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance v7, Le2/l;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0xe

    move-object v0, v7

    move-object v1, v6

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Le2/l;-><init>(Ljava/lang/Object;Le2/d;LW1/l;Ljava/util/concurrent/CancellationException;I)V

    :cond_8
    invoke-virtual {p1, p0, v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return-void

    :cond_9
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v6, :cond_8

    goto :goto_0

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not completed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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
    iget v0, p0, Le2/A;->d:I

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Le2/f;->y(Ljava/lang/Object;ILW1/l;)V

    return-void
.end method

.method public final d()LO1/d;
    .locals 1

    iget-object v0, p0, Le2/f;->e:LO1/d;

    return-object v0
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    invoke-super {p0, p1}, Le2/A;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final f()LQ1/c;
    .locals 2

    iget-object v0, p0, Le2/f;->e:LO1/d;

    instance-of v1, v0, LQ1/c;

    if-eqz v1, :cond_0

    check-cast v0, LQ1/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Le2/l;

    if-eqz v0, :cond_0

    check-cast p1, Le2/l;

    iget-object p1, p1, Le2/l;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    sget-object v0, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final j()LO1/i;
    .locals 1

    iget-object v0, p0, Le2/f;->f:LO1/i;

    return-object v0
.end method

.method public final k(Le2/d;Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    invoke-virtual {p1, p2}, Le2/d;->b(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance p2, LK1/b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception in invokeOnCancellation handler for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Le2/f;->f:LO1/i;

    invoke-static {p1, p2}, Le2/v;->h(LO1/i;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final l(LW1/l;Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    invoke-interface {p1, p2}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance p2, LK1/b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception in resume onCancellation handler for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Le2/f;->f:LO1/i;

    invoke-static {p1, p2}, Le2/v;->h(LO1/i;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final m(Lj2/u;Ljava/lang/Throwable;)V
    .locals 3

    iget-object p2, p0, Le2/f;->f:LO1/i;

    sget-object v0, Le2/f;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x1fffffff

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    :try_start_0
    invoke-virtual {p1, v0, p2}, Lj2/u;->g(ILO1/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v0, LK1/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Exception in invokeOnCancellation handler for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p2, v0}, Le2/v;->h(LO1/i;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The index for Segment.onCancellation(..) is broken"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 4

    :goto_0
    sget-object v0, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Le2/d0;

    if-nez v2, :cond_0

    return-void

    :cond_0
    new-instance v2, Le2/g;

    instance-of v3, v1, Le2/d;

    if-nez v3, :cond_2

    instance-of v3, v1, Lj2/u;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v3, 0x1

    :goto_2
    invoke-direct {v2, p0, p1, v3}, Le2/g;-><init>(LO1/d;Ljava/lang/Throwable;Z)V

    :cond_3
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    move-object v0, v1

    check-cast v0, Le2/d0;

    instance-of v2, v0, Le2/d;

    if-eqz v2, :cond_4

    check-cast v1, Le2/d;

    invoke-virtual {p0, v1, p1}, Le2/f;->k(Le2/d;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    instance-of v0, v0, Lj2/u;

    if-eqz v0, :cond_5

    check-cast v1, Lj2/u;

    invoke-virtual {p0, v1, p1}, Le2/f;->m(Lj2/u;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    invoke-virtual {p0}, Le2/f;->v()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p0}, Le2/f;->o()V

    :cond_6
    iget p1, p0, Le2/A;->d:I

    invoke-virtual {p0, p1}, Le2/f;->p(I)V

    return-void

    :cond_7
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_3

    goto :goto_0
.end method

.method public final o()V
    .locals 2

    sget-object v0, Le2/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le2/C;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-interface {v1}, Le2/C;->f()V

    sget-object v1, Le2/c0;->b:Le2/c0;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final p(I)V
    .locals 4

    :cond_0
    sget-object v0, Le2/f;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    shr-int/lit8 v2, v1, 0x1d

    if-eqz v2, :cond_7

    const/4 v0, 0x1

    if-ne v2, v0, :cond_6

    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Le2/f;->e:LO1/d;

    if-nez v1, :cond_5

    instance-of v3, v2, Lj2/h;

    if-eqz v3, :cond_5

    invoke-static {p1}, Le2/v;->j(I)Z

    move-result p1

    iget v3, p0, Le2/A;->d:I

    invoke-static {v3}, Le2/v;->j(I)Z

    move-result v3

    if-ne p1, v3, :cond_5

    move-object p1, v2

    check-cast p1, Lj2/h;

    iget-object p1, p1, Lj2/h;->e:Le2/r;

    move-object v1, v2

    check-cast v1, Lj2/h;

    iget-object v1, v1, Lj2/h;->f:LO1/d;

    invoke-interface {v1}, LO1/d;->j()LO1/i;

    move-result-object v1

    invoke-virtual {p1}, Le2/r;->K()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v1, p0}, Le2/r;->I(LO1/i;Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_2
    invoke-static {}, Le2/h0;->a()Le2/I;

    move-result-object p1

    invoke-virtual {p1}, Le2/I;->P()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, p0}, Le2/I;->M(Le2/A;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p1, v0}, Le2/I;->O(Z)V

    :try_start_0
    invoke-static {p0, v2, v0}, Le2/v;->m(Le2/A;LO1/d;Z)V

    :cond_4
    invoke-virtual {p1}, Le2/I;->Q()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_4

    :goto_1
    invoke-virtual {p1}, Le2/I;->L()V

    goto :goto_2

    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {p0, v0, v1}, Le2/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p1}, Le2/I;->L()V

    throw v0

    :cond_5
    invoke-static {p0, v2, v1}, Le2/v;->m(Le2/A;LO1/d;Z)V

    :goto_2
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already resumed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    const v2, 0x1fffffff

    and-int/2addr v2, v1

    const/high16 v3, 0x40000000    # 2.0f

    add-int/2addr v3, v2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final q()Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Le2/f;->v()Z

    move-result v0

    :cond_0
    sget-object v1, Le2/f;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    shr-int/lit8 v3, v2, 0x1d

    if-eqz v3, :cond_6

    const/4 v1, 0x2

    if-ne v3, v1, :cond_5

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Le2/f;->x()V

    :cond_1
    sget-object v0, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Le2/m;

    if-nez v1, :cond_4

    iget v1, p0, Le2/A;->d:I

    invoke-static {v1}, Le2/v;->j(I)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Le2/s;->c:Le2/s;

    iget-object v2, p0, Le2/f;->f:LO1/i;

    invoke-interface {v2, v1}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v1

    check-cast v1, Le2/Q;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Le2/Q;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    check-cast v1, Le2/Z;

    invoke-virtual {v1}, Le2/Z;->B()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Le2/f;->b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    throw v1

    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Le2/f;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_4
    check-cast v0, Le2/m;

    iget-object v0, v0, Le2/m;->a:Ljava/lang/Throwable;

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const v3, 0x1fffffff

    and-int/2addr v3, v2

    const/high16 v4, 0x20000000

    add-int/2addr v4, v3

    invoke-virtual {v1, p0, v2, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Le2/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le2/C;

    if-nez v1, :cond_7

    invoke-virtual {p0}, Le2/f;->s()Le2/C;

    :cond_7
    if-eqz v0, :cond_8

    invoke-virtual {p0}, Le2/f;->x()V

    :cond_8
    sget-object v0, LP1/a;->b:LP1/a;

    return-object v0
.end method

.method public final r()V
    .locals 2

    invoke-virtual {p0}, Le2/f;->s()Le2/C;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Le2/d0;

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Le2/C;->f()V

    sget-object v0, Le2/c0;->b:Le2/c0;

    sget-object v1, Le2/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final s()Le2/C;
    .locals 5

    sget-object v0, Le2/s;->c:Le2/s;

    iget-object v1, p0, Le2/f;->f:LO1/i;

    invoke-interface {v1, v0}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v0

    check-cast v0, Le2/Q;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, Le2/h;

    invoke-direct {v2, p0}, Le2/h;-><init>(Le2/f;)V

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v0, v4, v2, v3}, Le2/v;->i(Le2/Q;ZLe2/V;I)Le2/C;

    move-result-object v0

    :cond_1
    sget-object v2, Le2/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    return-object v0
.end method

.method public final t(LW1/l;)V
    .locals 2

    instance-of v0, p1, Le2/d;

    if-eqz v0, :cond_0

    check-cast p1, Le2/d;

    goto :goto_0

    :cond_0
    new-instance v0, Le2/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Le2/d;-><init>(ILjava/lang/Object;)V

    move-object p1, v0

    :goto_0
    invoke-virtual {p0, p1}, Le2/f;->u(Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CancellableContinuation("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le2/f;->e:LO1/d;

    invoke-static {v1}, Le2/v;->n(LO1/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Le2/d0;

    if-eqz v2, :cond_0

    const-string v1, "Active"

    goto :goto_0

    :cond_0
    instance-of v1, v1, Le2/g;

    if-eqz v1, :cond_1

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v1, "Completed"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Le2/v;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Ljava/lang/Object;)V
    .locals 9

    :goto_0
    sget-object v0, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v1, v7, Le2/b;

    if-eqz v1, :cond_2

    :cond_0
    invoke-virtual {v0, p0, v7, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v7, :cond_0

    goto :goto_0

    :cond_2
    instance-of v1, v7, Le2/d;

    const/4 v2, 0x0

    if-nez v1, :cond_12

    instance-of v1, v7, Lj2/u;

    if-nez v1, :cond_12

    instance-of v1, v7, Le2/m;

    if-eqz v1, :cond_8

    move-object v0, v7

    check-cast v0, Le2/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    sget-object v3, Le2/m;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_7

    instance-of v1, v7, Le2/g;

    if-eqz v1, :cond_6

    instance-of v1, v7, Le2/m;

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    iget-object v2, v0, Le2/m;->a:Ljava/lang/Throwable;

    :cond_4
    instance-of v0, p1, Le2/d;

    if-eqz v0, :cond_5

    check-cast p1, Le2/d;

    invoke-virtual {p0, p1, v2}, Le2/f;->k(Le2/d;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"

    invoke-static {p1, v0}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj2/u;

    invoke-virtual {p0, p1, v2}, Le2/f;->m(Lj2/u;Ljava/lang/Throwable;)V

    :cond_6
    :goto_2
    return-void

    :cond_7
    invoke-static {p1, v7}, Le2/f;->w(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v2

    :cond_8
    instance-of v1, v7, Le2/l;

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"

    if-eqz v1, :cond_e

    move-object v1, v7

    check-cast v1, Le2/l;

    iget-object v4, v1, Le2/l;->b:Le2/d;

    if-nez v4, :cond_d

    instance-of v4, p1, Lj2/u;

    if-eqz v4, :cond_9

    return-void

    :cond_9
    invoke-static {p1, v3}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    check-cast v3, Le2/d;

    iget-object v4, v1, Le2/l;->e:Ljava/lang/Throwable;

    if-eqz v4, :cond_a

    invoke-virtual {p0, v3, v4}, Le2/f;->k(Le2/d;Ljava/lang/Throwable;)V

    return-void

    :cond_a
    const/16 v4, 0x1d

    invoke-static {v1, v3, v2, v4}, Le2/l;->a(Le2/l;Le2/d;Ljava/util/concurrent/CancellationException;I)Le2/l;

    move-result-object v1

    :cond_b
    invoke-virtual {v0, p0, v7, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    return-void

    :cond_c
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v7, :cond_b

    goto/16 :goto_0

    :cond_d
    invoke-static {p1, v7}, Le2/f;->w(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v2

    :cond_e
    instance-of v1, p1, Lj2/u;

    if-eqz v1, :cond_f

    return-void

    :cond_f
    invoke-static {p1, v3}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    check-cast v3, Le2/d;

    new-instance v8, Le2/l;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    move-object v1, v8

    move-object v2, v7

    invoke-direct/range {v1 .. v6}, Le2/l;-><init>(Ljava/lang/Object;Le2/d;LW1/l;Ljava/util/concurrent/CancellationException;I)V

    :cond_10
    invoke-virtual {v0, p0, v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    return-void

    :cond_11
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v7, :cond_10

    goto/16 :goto_0

    :cond_12
    invoke-static {p1, v7}, Le2/f;->w(Ljava/lang/Object;Ljava/lang/Object;)V

    throw v2
.end method

.method public final v()Z
    .locals 2

    iget v0, p0, Le2/A;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    iget-object v1, p0, Le2/f;->e:LO1/d;

    invoke-static {v1, v0}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lj2/h;

    sget-object v0, Lj2/h;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final x()V
    .locals 5

    iget-object v0, p0, Le2/f;->e:LO1/d;

    instance-of v1, v0, Lj2/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lj2/h;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_8

    :goto_1
    sget-object v1, Lj2/h;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lj2/a;->d:Ld1/f;

    if-ne v3, v4, :cond_3

    :cond_1
    invoke-virtual {v1, v0, v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_3
    instance-of v4, v3, Ljava/lang/Throwable;

    if-eqz v4, :cond_7

    :goto_2
    invoke-virtual {v1, v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move-object v2, v3

    check-cast v2, Ljava/lang/Throwable;

    :goto_3
    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Le2/f;->o()V

    invoke-virtual {p0, v2}, Le2/f;->n(Ljava/lang/Throwable;)V

    return-void

    :cond_5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Inconsistent state "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_4
    return-void
.end method

.method public final y(Ljava/lang/Object;ILW1/l;)V
    .locals 4

    :goto_0
    sget-object v0, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Le2/d0;

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, Le2/d0;

    invoke-static {v2, p1, p2, p3}, Le2/f;->A(Le2/d0;Ljava/lang/Object;ILW1/l;)Ljava/lang/Object;

    move-result-object v2

    :cond_0
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Le2/f;->v()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Le2/f;->o()V

    :cond_1
    invoke-virtual {p0, p2}, Le2/f;->p(I)V

    return-void

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_0

    goto :goto_0

    :cond_3
    instance-of p2, v1, Le2/g;

    if-eqz p2, :cond_5

    check-cast v1, Le2/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Le2/g;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-virtual {p2, v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result p2

    if-eqz p2, :cond_5

    if-eqz p3, :cond_4

    iget-object p1, v1, Le2/m;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p1}, Le2/f;->l(LW1/l;Ljava/lang/Throwable;)V

    :cond_4
    return-void

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Already resumed, but proposed with update "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final z(Le2/r;)V
    .locals 4

    sget-object v0, LK1/h;->a:LK1/h;

    iget-object v1, p0, Le2/f;->e:LO1/d;

    instance-of v2, v1, Lj2/h;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lj2/h;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, v1, Lj2/h;->e:Le2/r;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    if-ne v1, p1, :cond_2

    const/4 p1, 0x4

    goto :goto_2

    :cond_2
    iget p1, p0, Le2/A;->d:I

    :goto_2
    invoke-virtual {p0, v0, p1, v3}, Le2/f;->y(Ljava/lang/Object;ILW1/l;)V

    return-void
.end method
