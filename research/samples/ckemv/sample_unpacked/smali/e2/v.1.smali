.class public abstract Le2/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld1/f;

.field public static final b:Ld1/f;

.field public static final c:Ld1/f;

.field public static final d:Ld1/f;

.field public static final e:Ld1/f;

.field public static final f:Ld1/f;

.field public static final g:Ld1/f;

.field public static final h:Ld1/f;

.field public static final i:Le2/D;

.field public static final j:Le2/D;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Ld1/f;

    const-string v1, "RESUME_TOKEN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le2/v;->a:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "REMOVED_TASK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le2/v;->b:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le2/v;->c:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "COMPLETING_ALREADY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le2/v;->d:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le2/v;->e:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le2/v;->f:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le2/v;->g:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "SEALED"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le2/v;->h:Ld1/f;

    new-instance v0, Le2/D;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le2/D;-><init>(Z)V

    sput-object v0, Le2/v;->i:Le2/D;

    new-instance v0, Le2/D;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Le2/D;-><init>(Z)V

    sput-object v0, Le2/v;->j:Le2/D;

    return-void
.end method

.method public static final a(LO1/i;)Lj2/e;
    .locals 2

    new-instance v0, Lj2/e;

    sget-object v1, Le2/s;->c:Le2/s;

    invoke-interface {p0, v1}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Le2/v;->b()Le2/U;

    move-result-object v1

    invoke-interface {p0, v1}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lj2/e;-><init>(LO1/i;)V

    return-object v0
.end method

.method public static b()Le2/U;
    .locals 2

    new-instance v0, Le2/U;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le2/U;-><init>(Le2/Q;)V

    return-object v0
.end method

.method public static final c(LW1/p;LO1/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lj2/t;

    invoke-interface {p1}, LO1/d;->j()LO1/i;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lj2/t;-><init>(LO1/d;LO1/i;)V

    invoke-static {v0, v0, p0}, Lv0/f;->N(Lj2/t;Lj2/t;LW1/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(JLO1/d;)Ljava/lang/Object;
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    sget-object v1, LK1/h;->a:LK1/h;

    if-gtz v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Le2/f;

    invoke-static {p2}, Lv0/f;->y(LO1/d;)LO1/d;

    move-result-object p2

    const/4 v2, 0x1

    invoke-direct {v0, v2, p2}, Le2/f;-><init>(ILO1/d;)V

    invoke-virtual {v0}, Le2/f;->r()V

    const-wide v2, 0x7fffffffffffffffL

    cmp-long p2, p0, v2

    if-gez p2, :cond_3

    sget-object p2, LO1/e;->b:LO1/e;

    iget-object v2, v0, Le2/f;->f:LO1/i;

    invoke-interface {v2, p2}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object p2

    instance-of v2, p2, Le2/y;

    if-eqz v2, :cond_1

    check-cast p2, Le2/y;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_2

    sget-object p2, Le2/x;->a:Le2/y;

    :cond_2
    invoke-interface {p2, p0, p1, v0}, Le2/y;->G(JLe2/f;)V

    :cond_3
    invoke-virtual {v0}, Le2/f;->q()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, LP1/a;->b:LP1/a;

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    return-object v1
.end method

.method public static final e(LO1/i;LO1/i;Z)LO1/i;
    .locals 4

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v0, Le2/o;->e:Le2/o;

    invoke-interface {p0, p2, v0}, LO1/i;->D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {p1, p2, v0}, LO1/i;->D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez v1, :cond_0

    if-nez p2, :cond_0

    invoke-interface {p0, p1}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, LO1/j;->b:LO1/j;

    new-instance v1, Le2/o;

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Le2/o;-><init>(II)V

    invoke-interface {p0, v0, v1}, LO1/i;->D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LO1/i;

    if-eqz p2, :cond_1

    check-cast p1, LO1/i;

    sget-object p2, Le2/o;->d:Le2/o;

    invoke-interface {p1, v0, p2}, LO1/i;->D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    move-result-object p1

    :cond_1
    check-cast p1, LO1/i;

    invoke-interface {p0, p1}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LO1/d;)Le2/f;
    .locals 6

    instance-of v0, p0, Lj2/h;

    if-nez v0, :cond_0

    new-instance v0, Le2/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Le2/f;-><init>(ILO1/d;)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Lj2/h;

    :cond_1
    :goto_0
    sget-object v1, Lj2/h;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lj2/a;->d:Ld1/f;

    const/4 v4, 0x0

    if-nez v2, :cond_2

    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v4

    goto :goto_1

    :cond_2
    instance-of v5, v2, Le2/f;

    if-eqz v5, :cond_8

    :cond_3
    invoke-virtual {v1, v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    check-cast v2, Le2/f;

    :goto_1
    if-eqz v2, :cond_6

    sget-object v0, Le2/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Le2/l;

    if-eqz v3, :cond_4

    check-cast v1, Le2/l;

    iget-object v1, v1, Le2/l;->d:Ljava/lang/Object;

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Le2/f;->o()V

    goto :goto_2

    :cond_4
    sget-object v1, Le2/f;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const v3, 0x1fffffff

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    sget-object v1, Le2/b;->b:Le2/b;

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v4, v2

    :goto_2
    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    return-object v4

    :cond_6
    :goto_3
    new-instance v0, Le2/f;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Le2/f;-><init>(ILO1/d;)V

    return-object v0

    :cond_7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v2, :cond_3

    goto :goto_0

    :cond_8
    if-eq v2, v3, :cond_1

    instance-of v1, v2, Ljava/lang/Throwable;

    if-eqz v1, :cond_9

    goto :goto_0

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Inconsistent state "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final h(LO1/i;Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    sget-object v0, Le2/s;->b:Le2/s;

    invoke-interface {p0, v0}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v0

    check-cast v0, Lf2/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lf2/b;->I(LO1/i;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    invoke-static {p0, p1}, Lj2/a;->e(LO1/i;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v0

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Exception while trying to handle coroutine exception"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1, p1}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_0
    invoke-static {p0, p1}, Lj2/a;->e(LO1/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic i(Le2/Q;ZLe2/V;I)Le2/C;
    .locals 2

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 v1, 0x1

    :cond_1
    check-cast p0, Le2/Z;

    invoke-virtual {p0, p1, v1, p2}, Le2/Z;->J(ZZLW1/l;)Le2/C;

    move-result-object p0

    return-object p0
.end method

.method public static final j(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public static k(Le2/t;ILW1/p;I)Le2/f0;
    .locals 3

    sget-object v0, LO1/j;->b:LO1/j;

    const/4 v1, 0x2

    and-int/2addr p3, v1

    const/4 v2, 0x1

    if-eqz p3, :cond_0

    move p1, v2

    :cond_0
    invoke-interface {p0}, Le2/t;->m()LO1/i;

    move-result-object p0

    invoke-static {p0, v0, v2}, Le2/v;->e(LO1/i;LO1/i;Z)LO1/i;

    move-result-object p0

    sget-object p3, Le2/B;->a:Ll2/d;

    if-eq p0, p3, :cond_1

    sget-object v0, LO1/e;->b:LO1/e;

    invoke-interface {p0, v0}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p0, p3}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p0

    :cond_1
    if-eqz p1, :cond_3

    if-ne p1, v1, :cond_2

    new-instance p3, Le2/a0;

    invoke-direct {p3, p0, p2}, Le2/a0;-><init>(LO1/i;LW1/p;)V

    goto :goto_0

    :cond_2
    new-instance p3, Le2/f0;

    invoke-direct {p3, p0, v2}, Le2/a;-><init>(LO1/i;Z)V

    :goto_0
    invoke-virtual {p3, p1, p3, p2}, Le2/a;->X(ILe2/a;LW1/p;)V

    return-object p3

    :cond_3
    const/4 p0, 0x0

    throw p0
.end method

.method public static final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Le2/m;

    if-eqz v0, :cond_0

    check-cast p0, Le2/m;

    iget-object p0, p0, Le2/m;->a:Ljava/lang/Throwable;

    invoke-static {p0}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final m(Le2/A;LO1/d;Z)V
    .locals 2

    invoke-virtual {p0}, Le2/A;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Le2/A;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Le2/A;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    if-eqz p2, :cond_5

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    invoke-static {p1, p2}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj2/h;

    iget-object p2, p1, Lj2/h;->f:LO1/d;

    invoke-interface {p2}, LO1/d;->j()LO1/i;

    move-result-object v0

    iget-object p1, p1, Lj2/h;->h:Ljava/lang/Object;

    invoke-static {v0, p1}, Lj2/a;->n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lj2/a;->f:Ld1/f;

    if-eq p1, v1, :cond_1

    invoke-static {p2, v0, p1}, Le2/v;->o(LO1/d;LO1/i;Ljava/lang/Object;)Le2/j0;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    :try_start_0
    invoke-interface {p2, p0}, LO1/d;->c(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Le2/j0;->Y()Z

    move-result p0

    if-eqz p0, :cond_6

    :cond_2
    invoke-static {v0, p1}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Le2/j0;->Y()Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    invoke-static {v0, p1}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    :cond_4
    throw p0

    :cond_5
    invoke-interface {p1, p0}, LO1/d;->c(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public static final n(LO1/d;)Ljava/lang/String;
    .locals 3

    instance-of v0, p0, Lj2/h;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_0
    const/16 v0, 0x40

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Le2/v;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object v1

    :goto_0
    invoke-static {v1}, LK1/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Le2/v;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    move-object p0, v1

    check-cast p0, Ljava/lang/String;

    :goto_2
    return-object p0
.end method

.method public static final o(LO1/d;LO1/i;Ljava/lang/Object;)Le2/j0;
    .locals 2

    instance-of v0, p0, LQ1/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Le2/k0;->b:Le2/k0;

    invoke-interface {p1, v0}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast p0, LQ1/c;

    :cond_1
    instance-of v0, p0, Le2/z;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p0}, LQ1/c;->f()LQ1/c;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    instance-of v0, p0, Le2/j0;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Le2/j0;

    :goto_0
    if-eqz v1, :cond_4

    invoke-virtual {v1, p1, p2}, Le2/j0;->Z(LO1/i;Ljava/lang/Object;)V

    :cond_4
    return-object v1
.end method

.method public static final p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;
    .locals 4

    invoke-interface {p2}, LO1/d;->j()LO1/i;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-interface {v0, p0}, LO1/i;->o(LO1/i;)LO1/i;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {v0, p0, v2}, Le2/v;->e(LO1/i;LO1/i;Z)LO1/i;

    move-result-object p0

    :goto_0
    sget-object v1, Le2/s;->c:Le2/s;

    invoke-interface {p0, v1}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v1

    check-cast v1, Le2/Q;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Le2/Q;->b()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast v1, Le2/Z;

    invoke-virtual {v1}, Le2/Z;->B()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0

    :cond_2
    :goto_1
    if-ne p0, v0, :cond_3

    new-instance v0, Lj2/t;

    invoke-direct {v0, p2, p0}, Lj2/t;-><init>(LO1/d;LO1/i;)V

    invoke-static {v0, v0, p1}, Lv0/f;->N(Lj2/t;Lj2/t;LW1/p;)Ljava/lang/Object;

    move-result-object p0

    goto/16 :goto_3

    :cond_3
    sget-object v1, LO1/e;->b:LO1/e;

    invoke-interface {p0, v1}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v3

    invoke-interface {v0, v1}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v0

    invoke-static {v3, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    new-instance v0, Le2/j0;

    invoke-direct {v0, p2, p0}, Le2/j0;-><init>(LO1/d;LO1/i;)V

    iget-object p0, v0, Le2/a;->d:LO1/i;

    invoke-static {p0, v1}, Lj2/a;->n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :try_start_0
    invoke-static {v0, v0, p1}, Lv0/f;->N(Lj2/t;Lj2/t;LW1/p;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, p2}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    move-object p0, p1

    goto :goto_3

    :catchall_0
    move-exception p1

    invoke-static {p0, p2}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    throw p1

    :cond_4
    new-instance v0, Le2/z;

    invoke-direct {v0, p2, p0}, Lj2/t;-><init>(LO1/d;LO1/i;)V

    invoke-static {p1, v0, v0}, Lu2/l;->M(LW1/p;Le2/a;Le2/a;)V

    :cond_5
    sget-object p0, Le2/z;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_b

    const/4 p0, 0x2

    if-ne p1, p0, :cond_a

    invoke-virtual {v0}, Le2/Z;->F()Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Le2/N;

    if-eqz p1, :cond_6

    move-object v1, p0

    check-cast v1, Le2/N;

    :cond_6
    if-eqz v1, :cond_8

    iget-object p1, v1, Le2/N;->a:Le2/M;

    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    move-object p0, p1

    :cond_8
    :goto_2
    nop

    instance-of p1, p0, Le2/m;

    if-nez p1, :cond_9

    goto :goto_3

    :cond_9
    check-cast p0, Le2/m;

    iget-object p0, p0, Le2/m;->a:Ljava/lang/Throwable;

    throw p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Already suspended"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    const/4 p1, 0x1

    invoke-virtual {p0, v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, LP1/a;->b:LP1/a;

    :goto_3
    return-object p0
.end method
