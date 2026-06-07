.class public abstract Lj2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld1/f;

.field public static final b:Ld1/f;

.field public static final c:Ld1/f;

.field public static final d:Ld1/f;

.field public static final e:Ld1/f;

.field public static final f:Ld1/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Ld1/f;

    const-string v1, "NO_DECISION"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj2/a;->a:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "CLOSED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj2/a;->b:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj2/a;->c:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj2/a;->d:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "CONDITION_FALSE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj2/a;->e:Ld1/f;

    new-instance v0, Ld1/f;

    const-string v1, "NO_THREAD_ELEMENTS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld1/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj2/a;->f:Ld1/f;

    return-void
.end method

.method public static final a(LW1/l;Ljava/lang/Object;LO1/i;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lj2/a;->b(LW1/l;Ljava/lang/Object;LK1/b;)LK1/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p2, p0}, Le2/v;->h(LO1/i;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static final b(LW1/l;Ljava/lang/Object;LK1/b;)LK1/b;
    .locals 2

    :try_start_0
    invoke-interface {p0, p1}, LW1/l;->h(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eq v0, p0, :cond_0

    invoke-static {p2, p0}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    return-object p2

    :cond_0
    new-instance p2, LK1/b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Exception in undelivered element handler for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public static final c(Lj2/u;J)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lg2/e;->j:Lg2/e;

    :goto_0
    iget-wide v1, p0, Lj2/u;->d:J

    cmp-long v3, v1, p1

    if-ltz v3, :cond_1

    invoke-virtual {p0}, Lj2/u;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    return-object p0

    :cond_1
    :goto_1
    sget-object v3, Lj2/d;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lj2/a;->b:Ld1/f;

    if-ne v3, v4, :cond_2

    return-object v4

    :cond_2
    check-cast v3, Lj2/d;

    check-cast v3, Lj2/u;

    if-eqz v3, :cond_3

    move-object p0, v3

    goto :goto_0

    :cond_3
    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lg2/e;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj2/u;

    :cond_4
    sget-object v2, Lj2/d;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v3, 0x0

    invoke-virtual {v2, p0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lj2/u;->c()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lj2/d;->d()V

    :cond_5
    move-object p0, v1

    goto :goto_0

    :cond_6
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    goto :goto_0
.end method

.method public static final d(Ljava/lang/Object;)Lj2/u;
    .locals 1

    sget-object v0, Lj2/a;->b:Ld1/f;

    if-eq p0, v0, :cond_0

    const-string v0, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed"

    invoke-static {p0, v0}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lj2/u;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Does not contain segment"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(LO1/i;Ljava/lang/Throwable;)V
    .locals 4

    sget-object v0, Lj2/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf2/b;

    :try_start_0
    invoke-virtual {v1, p0, p1}, Lf2/b;->I(LO1/i;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    if-ne p1, v1, :cond_0

    move-object v2, p1

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Exception while trying to handle coroutine exception"

    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v2, p1}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v3

    invoke-interface {v3, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance v0, Lj2/g;

    invoke-direct {v0, p0}, Lj2/g;-><init>(LO1/i;)V

    invoke-static {p1, v0}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final f(Ljava/lang/Object;)Z
    .locals 1

    sget-object v0, Lj2/a;->b:Ld1/f;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-nez p0, :cond_0

    move-object p0, p1

    goto :goto_0

    :cond_0
    instance-of v0, p0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final h(LO1/i;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, Lj2/a;->f:Ld1/f;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lj2/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lj2/z;

    iget-object p0, p1, Lj2/z;->b:[Le2/g0;

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_1

    return-void

    :cond_1
    aget-object p0, p0, v0

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object p0, p1, Lj2/z;->a:[Ljava/lang/Object;

    aget-object p0, p0, v0

    throw v1

    :cond_2
    sget-object p1, Lj2/x;->e:Lj2/x;

    invoke-interface {p0, v1, p1}, LO1/i;->D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p0, p1}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LX/d;->n(Ljava/lang/Object;)V

    throw v1
.end method

.method public static final i(LO1/d;Ljava/lang/Object;LW1/l;)V
    .locals 5

    instance-of v0, p0, Lj2/h;

    if-eqz v0, :cond_a

    check-cast p0, Lj2/h;

    invoke-static {p1}, LK1/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    new-instance v0, Le2/n;

    invoke-direct {v0, p1, p2}, Le2/n;-><init>(Ljava/lang/Object;LW1/l;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    goto :goto_0

    :cond_1
    new-instance p2, Le2/m;

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Le2/m;-><init>(Ljava/lang/Throwable;Z)V

    move-object v0, p2

    :goto_0
    iget-object p2, p0, Lj2/h;->e:Le2/r;

    iget-object v1, p0, Lj2/h;->f:LO1/d;

    invoke-interface {v1}, LO1/d;->j()LO1/i;

    invoke-virtual {p2}, Le2/r;->K()Z

    move-result p2

    const/4 v2, 0x1

    if-eqz p2, :cond_2

    iput-object v0, p0, Lj2/h;->g:Ljava/lang/Object;

    iput v2, p0, Le2/A;->d:I

    invoke-interface {v1}, LO1/d;->j()LO1/i;

    move-result-object p1

    iget-object p2, p0, Lj2/h;->e:Le2/r;

    invoke-virtual {p2, p1, p0}, Le2/r;->I(LO1/i;Ljava/lang/Runnable;)V

    goto/16 :goto_5

    :cond_2
    invoke-static {}, Le2/h0;->a()Le2/I;

    move-result-object p2

    invoke-virtual {p2}, Le2/I;->P()Z

    move-result v3

    if-eqz v3, :cond_3

    iput-object v0, p0, Lj2/h;->g:Ljava/lang/Object;

    iput v2, p0, Le2/A;->d:I

    invoke-virtual {p2, p0}, Le2/I;->M(Le2/A;)V

    goto/16 :goto_5

    :cond_3
    invoke-virtual {p2, v2}, Le2/I;->O(Z)V

    const/4 v2, 0x0

    :try_start_0
    invoke-interface {v1}, LO1/d;->j()LO1/i;

    move-result-object v3

    sget-object v4, Le2/s;->c:Le2/s;

    invoke-interface {v3, v4}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v3

    check-cast v3, Le2/Q;

    if-eqz v3, :cond_4

    invoke-interface {v3}, Le2/Q;->b()Z

    move-result v4

    if-nez v4, :cond_4

    check-cast v3, Le2/Z;

    invoke-virtual {v3}, Le2/Z;->B()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lj2/h;->b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    invoke-static {p1}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj2/h;->c(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lj2/h;->h:Ljava/lang/Object;

    invoke-interface {v1}, LO1/d;->j()LO1/i;

    move-result-object v3

    invoke-static {v3, v0}, Lj2/a;->n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lj2/a;->f:Ld1/f;

    if-eq v0, v4, :cond_5

    invoke-static {v1, v3, v0}, Le2/v;->o(LO1/d;LO1/i;Ljava/lang/Object;)Le2/j0;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_5
    move-object v4, v2

    :goto_1
    :try_start_1
    invoke-interface {v1, p1}, LO1/d;->c(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_6

    :try_start_2
    invoke-virtual {v4}, Le2/j0;->Y()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_6
    invoke-static {v3, v0}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    :cond_7
    :goto_2
    invoke-virtual {p2}, Le2/I;->Q()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_7

    :goto_3
    invoke-virtual {p2}, Le2/I;->L()V

    goto :goto_5

    :catchall_1
    move-exception p1

    if-eqz v4, :cond_8

    :try_start_3
    invoke-virtual {v4}, Le2/j0;->Y()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_8
    invoke-static {v3, v0}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    :cond_9
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_4
    :try_start_4
    invoke-virtual {p0, p1, v2}, Le2/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p0

    invoke-virtual {p2}, Le2/I;->L()V

    throw p0

    :cond_a
    invoke-interface {p0, p1}, LO1/d;->c(Ljava/lang/Object;)V

    :goto_5
    return-void
.end method

.method public static synthetic j(LO1/d;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lj2/a;->i(LO1/d;Ljava/lang/Object;LW1/l;)V

    return-void
.end method

.method public static final k(Ljava/lang/String;JJJ)J
    .locals 22

    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    move-wide/from16 v3, p5

    const/4 v5, 0x1

    sget v6, Lj2/w;->a:I

    :try_start_0
    invoke-static/range {p0 .. p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v7, 0x0

    :goto_0
    if-nez v7, :cond_0

    move-wide/from16 v5, p1

    goto/16 :goto_6

    :cond_0
    const/16 v8, 0xa

    invoke-static {v8}, Lv0/f;->n(I)V

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_2

    :cond_1
    :goto_1
    const/4 v6, 0x0

    goto/16 :goto_5

    :cond_2
    const/4 v10, 0x0

    invoke-virtual {v7, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v12, 0x30

    invoke-static {v11, v12}, LX1/g;->f(II)I

    move-result v12

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    if-gez v12, :cond_4

    if-ne v9, v5, :cond_3

    goto :goto_1

    :cond_3
    const/16 v12, 0x2d

    if-ne v11, v12, :cond_5

    const-wide/high16 v13, -0x8000000000000000L

    move v10, v5

    :cond_4
    move v11, v10

    goto :goto_2

    :cond_5
    const/16 v12, 0x2b

    if-ne v11, v12, :cond_1

    move v11, v10

    move v10, v5

    :goto_2
    const-wide v15, -0x38e38e38e38e38eL    # -2.772000429909333E291

    const-wide/16 v17, 0x0

    move-wide/from16 v5, v17

    move-wide/from16 v18, v15

    :goto_3
    if-ge v10, v9, :cond_9

    invoke-virtual {v7, v10}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-static {v12, v8}, Ljava/lang/Character;->digit(II)I

    move-result v12

    if-gez v12, :cond_6

    goto :goto_1

    :cond_6
    cmp-long v20, v5, v18

    if-gez v20, :cond_7

    cmp-long v18, v18, v15

    if-nez v18, :cond_1

    int-to-long v3, v8

    div-long v18, v13, v3

    cmp-long v3, v5, v18

    if-gez v3, :cond_7

    goto :goto_1

    :cond_7
    int-to-long v3, v8

    mul-long/2addr v5, v3

    int-to-long v3, v12

    add-long v20, v13, v3

    cmp-long v12, v5, v20

    if-gez v12, :cond_8

    goto :goto_1

    :cond_8
    sub-long/2addr v5, v3

    const/4 v3, 0x1

    add-int/2addr v10, v3

    move-wide/from16 v3, p5

    goto :goto_3

    :cond_9
    if-eqz v11, :cond_a

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :goto_4
    move-object v6, v3

    goto :goto_5

    :cond_a
    neg-long v3, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_4

    :goto_5
    const/16 v3, 0x27

    const-string v4, "System property \'"

    if-eqz v6, :cond_d

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v7, v1, v5

    if-gtz v7, :cond_b

    move-wide/from16 v7, p5

    cmp-long v9, v5, v7

    if-gtz v9, :cond_c

    :goto_6
    return-wide v5

    :cond_b
    move-wide/from16 v7, p5

    :cond_c
    new-instance v9, Ljava/lang/IllegalStateException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' should be in range "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ".."

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", but is \'"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v9

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' has unrecognized value \'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static l(Ljava/lang/String;IIII)I
    .locals 7

    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    const p3, 0x7fffffff

    :cond_1
    int-to-long v1, p1

    int-to-long v3, p2

    int-to-long v5, p3

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lj2/a;->k(Ljava/lang/String;JJJ)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method

.method public static final m(LO1/i;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lj2/x;->d:Lj2/x;

    invoke-interface {p0, v0, v1}, LO1/i;->D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LX1/g;->b(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lj2/a;->m(LO1/i;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lj2/a;->f:Ld1/f;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lj2/z;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p1, p0}, Lj2/z;-><init>(ILO1/i;)V

    sget-object p1, Lj2/x;->f:Lj2/x;

    invoke-interface {p0, v0, p1}, LO1/i;->D(Ljava/lang/Object;LW1/p;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_2
    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method
