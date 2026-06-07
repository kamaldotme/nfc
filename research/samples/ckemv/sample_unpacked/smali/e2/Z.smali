.class public Le2/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le2/Q;
.implements Le2/k;
.implements Le2/e0;


# static fields
.field public static final b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _parentHandle:Ljava/lang/Object;

.field private volatile _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_state"

    const-class v1, Le2/Z;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Le2/Z;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    sget-object p1, Le2/v;->j:Le2/D;

    goto :goto_0

    :cond_0
    sget-object p1, Le2/v;->i:Le2/D;

    :goto_0
    iput-object p1, p0, Le2/Z;->_state:Ljava/lang/Object;

    return-void
.end method

.method public static N(Lj2/k;)Le2/j;
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lj2/k;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lj2/k;->j()Lj2/k;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v1, Lj2/k;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj2/k;

    :goto_1
    invoke-virtual {p0}, Lj2/k;->n()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj2/k;

    goto :goto_1

    :cond_1
    move-object p0, v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lj2/k;->m()Lj2/k;

    move-result-object p0

    invoke-virtual {p0}, Lj2/k;->n()Z

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, p0, Le2/j;

    if-eqz v0, :cond_3

    check-cast p0, Le2/j;

    return-object p0

    :cond_3
    instance-of v0, p0, Le2/b0;

    if-eqz v0, :cond_2

    const/4 p0, 0x0

    return-object p0
.end method

.method public static T(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p0, Le2/X;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p0, Le2/X;

    invoke-virtual {p0}, Le2/X;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Le2/X;->f()Z

    move-result p0

    if-eqz p0, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p0, Le2/M;

    if-eqz v0, :cond_3

    check-cast p0, Le2/M;

    invoke-interface {p0}, Le2/M;->b()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p0, p0, Le2/m;

    if-eqz p0, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method


# virtual methods
.method public final A(LO1/h;)LO1/g;
    .locals 0

    invoke-static {p0, p1}, Lu2/d;->l(LO1/g;LO1/h;)LO1/g;

    move-result-object p1

    return-object p1
.end method

.method public final B()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Le2/X;

    const/4 v2, 0x0

    const-string v3, "Job is still new or active: "

    if-eqz v1, :cond_3

    check-cast v0, Le2/X;

    invoke-virtual {v0}, Le2/X;->d()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v2, :cond_6

    new-instance v2, Le2/S;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Le2/Z;->v()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {v2, v1, v0, p0}, Le2/S;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le2/Q;)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    instance-of v1, v0, Le2/M;

    if-nez v1, :cond_7

    instance-of v1, v0, Le2/m;

    if-eqz v1, :cond_5

    check-cast v0, Le2/m;

    iget-object v0, v0, Le2/m;->a:Ljava/lang/Throwable;

    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_4

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_4
    if-nez v2, :cond_6

    new-instance v1, Le2/S;

    invoke-virtual {p0}, Le2/Z;->v()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0}, Le2/S;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le2/Q;)V

    move-object v2, v1

    goto :goto_0

    :cond_5
    new-instance v0, Le2/S;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Le2/S;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le2/Q;)V

    move-object v2, v0

    :cond_6
    :goto_0
    return-object v2

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public C()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, LW1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final E(Le2/M;)Le2/b0;
    .locals 3

    invoke-interface {p1}, Le2/M;->c()Le2/b0;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Le2/D;

    if-eqz v0, :cond_0

    new-instance v0, Le2/b0;

    invoke-direct {v0}, Lj2/k;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Le2/V;

    if-eqz v0, :cond_1

    check-cast p1, Le2/V;

    invoke-virtual {p0, p1}, Le2/Z;->R(Le2/V;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State should have list: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final F()Ljava/lang/Object;
    .locals 2

    :goto_0
    sget-object v0, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lj2/q;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lj2/q;

    invoke-virtual {v0, p0}, Lj2/q;->a(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public G(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public H(LK1/b;)V
    .locals 0

    throw p1
.end method

.method public final I(Le2/Q;)V
    .locals 5

    sget-object v0, Le2/c0;->b:Le2/c0;

    sget-object v1, Le2/Z;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    if-nez p1, :cond_0

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    check-cast p1, Le2/Z;

    :goto_0
    invoke-virtual {p1}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Le2/Z;->S(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Le2/j;

    invoke-direct {v2, p0}, Le2/j;-><init>(Le2/Z;)V

    const/4 v4, 0x2

    invoke-static {p1, v3, v2, v4}, Le2/v;->i(Le2/Q;ZLe2/V;I)Le2/C;

    move-result-object p1

    check-cast p1, Le2/i;

    invoke-virtual {v1, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Le2/M;

    xor-int/2addr v2, v3

    if-eqz v2, :cond_2

    invoke-interface {p1}, Le2/C;->f()V

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final J(ZZLW1/l;)Le2/C;
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p3, Le2/T;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Le2/T;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_4

    new-instance v1, Le2/O;

    invoke-direct {v1, p3}, Le2/O;-><init>(LW1/l;)V

    goto :goto_2

    :cond_1
    instance-of v1, p3, Le2/V;

    if-eqz v1, :cond_2

    move-object v1, p3

    check-cast v1, Le2/V;

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Le2/P;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p3}, Le2/P;-><init>(ILjava/lang/Object;)V

    :cond_4
    :goto_2
    iput-object p0, v1, Le2/V;->e:Le2/Z;

    :cond_5
    :goto_3
    invoke-virtual {p0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Le2/D;

    if-eqz v3, :cond_c

    move-object v3, v2

    check-cast v3, Le2/D;

    iget-boolean v4, v3, Le2/D;->b:Z

    if-eqz v4, :cond_8

    sget-object v4, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_6
    invoke-virtual {v4, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    return-object v1

    :cond_7
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v2, :cond_6

    goto :goto_3

    :cond_8
    new-instance v2, Le2/b0;

    invoke-direct {v2}, Lj2/k;-><init>()V

    iget-boolean v4, v3, Le2/D;->b:Z

    if-eqz v4, :cond_9

    move-object v4, v2

    goto :goto_4

    :cond_9
    new-instance v4, Le2/L;

    invoke-direct {v4, v2}, Le2/L;-><init>(Le2/b0;)V

    :cond_a
    :goto_4
    sget-object v2, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_3

    :cond_b
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v3, :cond_a

    goto :goto_3

    :cond_c
    instance-of v3, v2, Le2/M;

    if-eqz v3, :cond_15

    move-object v3, v2

    check-cast v3, Le2/M;

    invoke-interface {v3}, Le2/M;->c()Le2/b0;

    move-result-object v3

    if-nez v3, :cond_d

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v2, v3}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Le2/V;

    invoke-virtual {p0, v2}, Le2/Z;->R(Le2/V;)V

    goto :goto_3

    :cond_d
    sget-object v4, Le2/c0;->b:Le2/c0;

    if-eqz p1, :cond_12

    instance-of v5, v2, Le2/X;

    if-eqz v5, :cond_12

    monitor-enter v2

    :try_start_0
    move-object v5, v2

    check-cast v5, Le2/X;

    invoke-virtual {v5}, Le2/X;->d()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_e

    instance-of v6, p3, Le2/j;

    if-eqz v6, :cond_11

    move-object v6, v2

    check-cast v6, Le2/X;

    invoke-virtual {v6}, Le2/X;->f()Z

    move-result v6

    if-nez v6, :cond_11

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_e
    :goto_5
    move-object v4, v2

    check-cast v4, Le2/M;

    invoke-virtual {p0, v4, v3, v1}, Le2/Z;->p(Le2/M;Le2/b0;Le2/V;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_f

    monitor-exit v2

    goto/16 :goto_3

    :cond_f
    if-nez v5, :cond_10

    monitor-exit v2

    return-object v1

    :cond_10
    move-object v4, v1

    :cond_11
    monitor-exit v2

    goto :goto_7

    :goto_6
    monitor-exit v2

    throw p1

    :cond_12
    move-object v5, v0

    :goto_7
    if-eqz v5, :cond_14

    if-eqz p2, :cond_13

    invoke-interface {p3, v5}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    return-object v4

    :cond_14
    check-cast v2, Le2/M;

    invoke-virtual {p0, v2, v3, v1}, Le2/Z;->p(Le2/M;Le2/b0;Le2/V;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object v1

    :cond_15
    if-eqz p2, :cond_18

    instance-of p1, v2, Le2/m;

    if-eqz p1, :cond_16

    check-cast v2, Le2/m;

    goto :goto_8

    :cond_16
    move-object v2, v0

    :goto_8
    if-eqz v2, :cond_17

    iget-object v0, v2, Le2/m;->a:Ljava/lang/Throwable;

    :cond_17
    invoke-interface {p3, v0}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    sget-object p1, Le2/c0;->b:Le2/c0;

    return-object p1
.end method

.method public K()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final L(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    :cond_0
    invoke-virtual {p0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Le2/Z;->U(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Le2/v;->d:Ld1/f;

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Job "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    instance-of v2, p1, Le2/m;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast p1, Le2/m;

    goto :goto_0

    :cond_1
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_2

    iget-object v3, p1, Le2/m;->a:Ljava/lang/Throwable;

    :cond_2
    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    sget-object v1, Le2/v;->f:Ld1/f;

    if-eq v0, v1, :cond_0

    return-object v0
.end method

.method public M()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final O(Le2/b0;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, Lj2/k;->l()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v1}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lj2/k;

    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Le2/T;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Le2/V;

    :try_start_0
    invoke-virtual {v2, p2}, Le2/V;->p(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, LK1/b;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Exception in completion handler "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lj2/k;->m()Lj2/k;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Le2/Z;->H(LK1/b;)V

    :cond_3
    invoke-virtual {p0, p2}, Le2/Z;->u(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public P(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public Q()V
    .locals 0

    return-void
.end method

.method public final R(Le2/V;)V
    .locals 3

    new-instance v0, Le2/b0;

    invoke-direct {v0}, Lj2/k;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lj2/k;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lj2/k;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, Lj2/k;->l()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p1, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, p1}, Lj2/k;->k(Lj2/k;)V

    :goto_1
    invoke-virtual {p1}, Lj2/k;->m()Lj2/k;

    move-result-object v2

    :cond_1
    sget-object v0, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_1

    :goto_2
    return-void

    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_0
.end method

.method public final S(Ljava/lang/Object;)I
    .locals 5

    instance-of v0, p1, Le2/D;

    const/4 v1, 0x1

    const/4 v2, -0x1

    sget-object v3, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Le2/D;

    iget-boolean v0, v0, Le2/D;->b:Z

    if-eqz v0, :cond_0

    return v4

    :cond_0
    sget-object v0, Le2/v;->j:Le2/D;

    :cond_1
    invoke-virtual {v3, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Le2/Z;->Q()V

    return v1

    :cond_2
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, p1, :cond_1

    return v2

    :cond_3
    instance-of v0, p1, Le2/L;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Le2/L;

    iget-object v0, v0, Le2/L;->b:Le2/b0;

    :cond_4
    invoke-virtual {v3, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {p0}, Le2/Z;->Q()V

    return v1

    :cond_5
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, p1, :cond_4

    return v2

    :cond_6
    return v4
.end method

.method public final U(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Le2/M;

    if-nez v0, :cond_0

    sget-object p1, Le2/v;->d:Ld1/f;

    return-object p1

    :cond_0
    instance-of v0, p1, Le2/D;

    if-nez v0, :cond_1

    instance-of v0, p1, Le2/V;

    if-eqz v0, :cond_5

    :cond_1
    instance-of v0, p1, Le2/j;

    if-nez v0, :cond_5

    instance-of v0, p2, Le2/m;

    if-nez v0, :cond_5

    move-object v0, p1

    check-cast v0, Le2/M;

    instance-of p1, p2, Le2/M;

    if-eqz p1, :cond_2

    new-instance p1, Le2/N;

    move-object v1, p2

    check-cast v1, Le2/M;

    invoke-direct {p1, v1}, Le2/N;-><init>(Le2/M;)V

    move-object v1, p1

    goto :goto_0

    :cond_2
    move-object v1, p2

    :cond_3
    :goto_0
    sget-object p1, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, p2}, Le2/Z;->P(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p2}, Le2/Z;->x(Le2/M;Ljava/lang/Object;)V

    return-object p2

    :cond_4
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v0, :cond_3

    sget-object p1, Le2/v;->f:Ld1/f;

    return-object p1

    :cond_5
    check-cast p1, Le2/M;

    invoke-virtual {p0, p1}, Le2/Z;->E(Le2/M;)Le2/b0;

    move-result-object v0

    if-nez v0, :cond_6

    sget-object p1, Le2/v;->f:Ld1/f;

    goto/16 :goto_7

    :cond_6
    instance-of v1, p1, Le2/X;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    move-object v1, p1

    check-cast v1, Le2/X;

    goto :goto_1

    :cond_7
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_8

    new-instance v1, Le2/X;

    invoke-direct {v1, v0, v2}, Le2/X;-><init>(Le2/b0;Ljava/lang/Throwable;)V

    :cond_8
    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Le2/X;->f()Z

    move-result v3

    if-eqz v3, :cond_9

    sget-object p1, Le2/v;->d:Ld1/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto/16 :goto_7

    :cond_9
    :try_start_1
    sget-object v3, Le2/X;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    if-eq v1, p1, :cond_c

    sget-object v3, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_a
    invoke-virtual {v3, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, p1, :cond_a

    sget-object p1, Le2/v;->f:Ld1/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_7

    :catchall_0
    move-exception p1

    goto :goto_8

    :cond_c
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Le2/X;->e()Z

    move-result v3

    instance-of v5, p2, Le2/m;

    if-eqz v5, :cond_d

    move-object v5, p2

    check-cast v5, Le2/m;

    goto :goto_3

    :cond_d
    move-object v5, v2

    :goto_3
    if-eqz v5, :cond_e

    iget-object v5, v5, Le2/m;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v5}, Le2/X;->a(Ljava/lang/Throwable;)V

    :cond_e
    invoke-virtual {v1}, Le2/X;->d()Ljava/lang/Throwable;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    xor-int/2addr v3, v4

    if-eqz v3, :cond_f

    goto :goto_4

    :cond_f
    move-object v5, v2

    :goto_4
    monitor-exit v1

    if-eqz v5, :cond_10

    invoke-virtual {p0, v0, v5}, Le2/Z;->O(Le2/b0;Ljava/lang/Throwable;)V

    :cond_10
    instance-of v0, p1, Le2/j;

    if-eqz v0, :cond_11

    move-object v0, p1

    check-cast v0, Le2/j;

    goto :goto_5

    :cond_11
    move-object v0, v2

    :goto_5
    if-nez v0, :cond_12

    invoke-interface {p1}, Le2/M;->c()Le2/b0;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-static {p1}, Le2/Z;->N(Lj2/k;)Le2/j;

    move-result-object v2

    goto :goto_6

    :cond_12
    move-object v2, v0

    :cond_13
    :goto_6
    if-eqz v2, :cond_16

    :cond_14
    new-instance p1, Le2/W;

    invoke-direct {p1, p0, v1, v2, p2}, Le2/W;-><init>(Le2/Z;Le2/X;Le2/j;Ljava/lang/Object;)V

    iget-object v0, v2, Le2/j;->f:Le2/k;

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v4}, Le2/v;->i(Le2/Q;ZLe2/V;I)Le2/C;

    move-result-object p1

    sget-object v0, Le2/c0;->b:Le2/c0;

    if-eq p1, v0, :cond_15

    sget-object p1, Le2/v;->e:Ld1/f;

    goto :goto_7

    :cond_15
    invoke-static {v2}, Le2/Z;->N(Lj2/k;)Le2/j;

    move-result-object v2

    if-nez v2, :cond_14

    :cond_16
    invoke-virtual {p0, v1, p2}, Le2/Z;->z(Le2/X;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_7
    return-object p1

    :goto_8
    monitor-exit v1

    throw p1
.end method

.method public a(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Le2/S;

    invoke-virtual {p0}, Le2/Z;->v()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Le2/S;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le2/Q;)V

    :cond_0
    invoke-virtual {p0, p1}, Le2/Z;->t(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public b()Z
    .locals 2

    invoke-virtual {p0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Le2/M;

    if-eqz v1, :cond_0

    check-cast v0, Le2/M;

    invoke-interface {v0}, Le2/M;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getKey()LO1/h;
    .locals 1

    sget-object v0, Le2/s;->c:Le2/s;

    return-object v0
.end method

.method public final i(LO1/h;)LO1/i;
    .locals 0

    invoke-static {p0, p1}, Lu2/d;->t(LO1/g;LO1/h;)LO1/i;

    move-result-object p1

    return-object p1
.end method

.method public final o(LO1/i;)LO1/i;
    .locals 0

    invoke-static {p0, p1}, Lu2/d;->x(LO1/g;LO1/i;)LO1/i;

    move-result-object p1

    return-object p1
.end method

.method public final p(Le2/M;Le2/b0;Le2/V;)Z
    .locals 6

    new-instance v0, Le2/Y;

    invoke-direct {v0, p3, p0, p1}, Le2/Y;-><init>(Lj2/k;Le2/Z;Le2/M;)V

    :goto_0
    invoke-virtual {p2}, Lj2/k;->j()Lj2/k;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object v1, Lj2/k;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj2/k;

    :goto_1
    invoke-virtual {p1}, Lj2/k;->n()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj2/k;

    goto :goto_1

    :cond_1
    :goto_2
    sget-object v1, Lj2/k;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lj2/k;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, v0, Le2/Y;->c:Lj2/k;

    :cond_2
    invoke-virtual {v1, p1, p2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v0, p1}, Lj2/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    move p1, v5

    goto :goto_3

    :cond_3
    move p1, v4

    goto :goto_3

    :cond_4
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p2, :cond_2

    move p1, v3

    :goto_3
    if-eq p1, v5, :cond_5

    if-eq p1, v4, :cond_6

    goto :goto_0

    :cond_5
    move v3, v5

    :cond_6
    return v3
.end method

.method public q(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public r(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Le2/Z;->q(Ljava/lang/Object;)V

    return-void
.end method

.method public final s(Ljava/lang/Object;)Z
    .locals 9

    sget-object v0, Le2/v;->d:Ld1/f;

    instance-of v1, p0, Le2/U;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    :cond_0
    invoke-virtual {p0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Le2/M;

    if-eqz v1, :cond_2

    instance-of v1, v0, Le2/X;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Le2/X;

    invoke-virtual {v1}, Le2/X;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Le2/m;

    invoke-virtual {p0, p1}, Le2/Z;->y(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    invoke-direct {v1, v4, v2}, Le2/m;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v0, v1}, Le2/Z;->U(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Le2/v;->f:Ld1/f;

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Le2/v;->d:Ld1/f;

    :goto_1
    sget-object v1, Le2/v;->e:Ld1/f;

    if-ne v0, v1, :cond_3

    return v3

    :cond_3
    sget-object v1, Le2/v;->d:Ld1/f;

    if-ne v0, v1, :cond_11

    const/4 v0, 0x0

    move-object v1, v0

    :cond_4
    :goto_2
    invoke-virtual {p0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Le2/X;

    if-eqz v5, :cond_9

    monitor-enter v4

    :try_start_0
    move-object v5, v4

    check-cast v5, Le2/X;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Le2/X;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Le2/v;->h:Ld1/f;

    if-ne v5, v6, :cond_5

    sget-object p1, Le2/v;->g:Ld1/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    :goto_3
    move-object v0, p1

    goto/16 :goto_6

    :cond_5
    :try_start_1
    move-object v5, v4

    check-cast v5, Le2/X;

    invoke-virtual {v5}, Le2/X;->e()Z

    move-result v5

    if-nez v1, :cond_6

    invoke-virtual {p0, p1}, Le2/Z;->y(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_6
    :goto_4
    move-object p1, v4

    check-cast p1, Le2/X;

    invoke-virtual {p1, v1}, Le2/X;->a(Ljava/lang/Throwable;)V

    move-object p1, v4

    check-cast p1, Le2/X;

    invoke-virtual {p1}, Le2/X;->d()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v5, 0x1

    if-eqz v1, :cond_7

    move-object v0, p1

    :cond_7
    monitor-exit v4

    if-eqz v0, :cond_8

    check-cast v4, Le2/X;

    iget-object p1, v4, Le2/X;->b:Le2/b0;

    invoke-virtual {p0, p1, v0}, Le2/Z;->O(Le2/b0;Ljava/lang/Throwable;)V

    :cond_8
    sget-object p1, Le2/v;->d:Ld1/f;

    goto :goto_3

    :goto_5
    monitor-exit v4

    throw p1

    :cond_9
    instance-of v5, v4, Le2/M;

    if-eqz v5, :cond_10

    if-nez v1, :cond_a

    invoke-virtual {p0, p1}, Le2/Z;->y(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_a
    move-object v5, v4

    check-cast v5, Le2/M;

    invoke-interface {v5}, Le2/M;->b()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {p0, v5}, Le2/Z;->E(Le2/M;)Le2/b0;

    move-result-object v6

    if-nez v6, :cond_b

    goto :goto_2

    :cond_b
    new-instance v7, Le2/X;

    invoke-direct {v7, v6, v1}, Le2/X;-><init>(Le2/b0;Ljava/lang/Throwable;)V

    :cond_c
    sget-object v4, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v4, p0, v5, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-virtual {p0, v6, v1}, Le2/Z;->O(Le2/b0;Ljava/lang/Throwable;)V

    sget-object p1, Le2/v;->d:Ld1/f;

    goto :goto_3

    :cond_d
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v5, :cond_c

    goto/16 :goto_2

    :cond_e
    new-instance v5, Le2/m;

    invoke-direct {v5, v1, v2}, Le2/m;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v4, v5}, Le2/Z;->U(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Le2/v;->d:Ld1/f;

    if-eq v5, v6, :cond_f

    sget-object v4, Le2/v;->f:Ld1/f;

    if-eq v5, v4, :cond_4

    move-object v0, v5

    goto :goto_6

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot happen in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    sget-object p1, Le2/v;->g:Ld1/f;

    goto/16 :goto_3

    :cond_11
    :goto_6
    sget-object p1, Le2/v;->d:Ld1/f;

    if-ne v0, p1, :cond_12

    :goto_7
    move v2, v3

    goto :goto_8

    :cond_12
    sget-object p1, Le2/v;->e:Ld1/f;

    if-ne v0, p1, :cond_13

    goto :goto_7

    :cond_13
    sget-object p1, Le2/v;->g:Ld1/f;

    if-ne v0, p1, :cond_14

    goto :goto_8

    :cond_14
    invoke-virtual {p0, v0}, Le2/Z;->q(Ljava/lang/Object;)V

    goto :goto_7

    :goto_8
    return v2
.end method

.method public t(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    invoke-virtual {p0, p1}, Le2/Z;->s(Ljava/lang/Object;)Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Le2/Z;->M()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Le2/Z;->T(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Le2/v;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Le2/Z;->K()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    sget-object v2, Le2/Z;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le2/i;

    if-eqz v2, :cond_4

    sget-object v3, Le2/c0;->b:Le2/c0;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Le2/i;->i(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public w(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Le2/Z;->s(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Le2/Z;->C()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final x(Le2/M;Ljava/lang/Object;)V
    .locals 7

    sget-object v0, Le2/Z;->c:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le2/i;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Le2/C;->f()V

    sget-object v1, Le2/c0;->b:Le2/c0;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    instance-of v0, p2, Le2/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Le2/m;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Le2/m;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_2
    move-object p2, v1

    :goto_1
    instance-of v0, p1, Le2/V;

    const-string v2, " for "

    const-string v3, "Exception in completion handler "

    if-eqz v0, :cond_3

    :try_start_0
    move-object v0, p1

    check-cast v0, Le2/V;

    invoke-virtual {v0, p2}, Le2/V;->p(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p2

    new-instance v0, LK1/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Le2/Z;->H(LK1/b;)V

    goto :goto_4

    :cond_3
    invoke-interface {p1}, Le2/M;->c()Le2/b0;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lj2/k;->l()Ljava/lang/Object;

    move-result-object v0

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v4}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lj2/k;

    :goto_2
    invoke-static {v0, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    instance-of v4, v0, Le2/V;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Le2/V;

    :try_start_1
    invoke-virtual {v4, p2}, Le2/V;->p(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v5

    if-eqz v1, :cond_4

    invoke-static {v1, v5}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    new-instance v1, LK1/b;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    invoke-virtual {v0}, Lj2/k;->m()Lj2/k;

    move-result-object v0

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {p0, v1}, Le2/Z;->H(LK1/b;)V

    :cond_7
    :goto_4
    return-void
.end method

.method public final y(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 4

    instance-of v0, p1, Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Throwable;

    goto :goto_1

    :cond_0
    check-cast p1, Le2/e0;

    check-cast p1, Le2/Z;

    invoke-virtual {p1}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Le2/X;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Le2/X;

    invoke-virtual {v1}, Le2/X;->d()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Le2/m;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Le2/m;

    iget-object v1, v1, Le2/m;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Le2/M;

    if-nez v1, :cond_5

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_3
    if-nez v2, :cond_4

    new-instance v2, Le2/S;

    invoke-static {v0}, Le2/Z;->T(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Parent job is "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p1}, Le2/S;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le2/Q;)V

    :cond_4
    move-object p1, v2

    :goto_1
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot be cancelling child in this state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z(Le2/X;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Le2/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le2/m;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Le2/m;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Le2/X;->e()Z

    invoke-virtual {p1, v0}, Le2/X;->g(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Le2/X;->e()Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Le2/S;

    invoke-virtual {p0}, Le2/Z;->v()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, v1, p0}, Le2/S;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Le2/Q;)V

    move-object v1, v3

    goto :goto_2

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/Throwable;

    instance-of v7, v7, Ljava/util/concurrent/CancellationException;

    xor-int/2addr v7, v4

    if-eqz v7, :cond_3

    move-object v1, v6

    :cond_4
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    :cond_6
    :goto_2
    if-eqz v1, :cond_9

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-gt v3, v4, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-instance v6, Ljava/util/IdentityHashMap;

    invoke-direct {v6, v3}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v6}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Throwable;

    if-eq v6, v1, :cond_8

    if-eq v6, v1, :cond_8

    instance-of v7, v6, Ljava/util/concurrent/CancellationException;

    if-nez v7, :cond_8

    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-static {v1, v6}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_9
    :goto_4
    monitor-exit p1

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    if-ne v1, v0, :cond_b

    goto :goto_5

    :cond_b
    new-instance p2, Le2/m;

    invoke-direct {p2, v1, v5}, Le2/m;-><init>(Ljava/lang/Throwable;Z)V

    :goto_5
    if-eqz v1, :cond_d

    invoke-virtual {p0, v1}, Le2/Z;->u(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-virtual {p0, v1}, Le2/Z;->G(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_c
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v0}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Le2/m;

    sget-object v1, Le2/m;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, v0, v5, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    :cond_d
    invoke-virtual {p0, p2}, Le2/Z;->P(Ljava/lang/Object;)V

    sget-object v0, Le2/Z;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    instance-of v1, p2, Le2/M;

    if-eqz v1, :cond_e

    new-instance v1, Le2/N;

    move-object v2, p2

    check-cast v2, Le2/M;

    invoke-direct {v1, v2}, Le2/N;-><init>(Le2/M;)V

    goto :goto_6

    :cond_e
    move-object v1, p2

    :cond_f
    :goto_6
    invoke-virtual {v0, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_7

    :cond_10
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_f

    :goto_7
    invoke-virtual {p0, p1, p2}, Le2/Z;->x(Le2/M;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method
