.class public final Lg2/o;
.super Lg2/d;
.source "SourceFile"


# instance fields
.field public final m:I


# direct methods
.method public constructor <init>(IILW1/l;)V
    .locals 3

    invoke-direct {p0, p1, p3}, Lg2/d;-><init>(ILW1/l;)V

    iput p2, p0, Lg2/o;->m:I

    const/4 p3, 0x1

    if-eq p2, p3, :cond_1

    if-lt p1, p3, :cond_0

    return-void

    :cond_0
    const-string p2, "Buffered channel capacity must be at least 1, but "

    const-string p3, " was specified"

    invoke-static {p2, p1, p3}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "This implementation does not support suspension for senders, use "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object p2, LX1/k;->a:LX1/l;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, LX1/d;

    const-class v0, Lg2/d;

    invoke-direct {p2, v0}, LX1/d;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result p2

    const/4 v1, 0x0

    if-nez p2, :cond_8

    invoke-virtual {v0}, Ljava/lang/Class;->isLocalClass()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    move-result-object v1

    const/16 v2, 0x24

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingConstructor()Ljava/lang/reflect/Constructor;

    move-result-object v0

    if-nez v0, :cond_3

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {p2, v2, v1, v1, v0}, Ld2/d;->b0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    :goto_0
    move-object v1, p2

    goto/16 :goto_1

    :cond_2
    add-int/2addr v0, p3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    invoke-virtual {p2, v0, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    const-string p3, "substring(...)"

    invoke-static {p2, p3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Ld2/d;->k0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Ld2/d;->k0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result p2

    sget-object p3, LX1/d;->c:Ljava/util/LinkedHashMap;

    if-eqz p2, :cond_7

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    const-string v2, "Array"

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_6

    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_6
    if-nez v1, :cond_8

    move-object v1, v2

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_8

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    :cond_8
    :goto_1
    const-string p2, " instead"

    invoke-static {p1, v1, p2}, LX/d;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final I(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 20

    move-object/from16 v8, p0

    sget-object v9, LK1/h;->a:LK1/h;

    iget v0, v8, Lg2/o;->m:I

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-ne v0, v10, :cond_3

    invoke-super/range {p0 .. p1}, Lg2/d;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lg2/j;

    xor-int/2addr v1, v12

    if-nez v1, :cond_2

    instance-of v1, v0, Lg2/i;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_10

    iget-object v0, v8, Lg2/d;->c:LW1/l;

    if-eqz v0, :cond_10

    move-object/from16 v13, p1

    invoke-static {v0, v13, v11}, Lj2/a;->b(LW1/l;Ljava/lang/Object;LK1/b;)LK1/b;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_5

    :cond_1
    throw v0

    :cond_2
    :goto_0
    move-object v9, v0

    goto/16 :goto_5

    :cond_3
    move-object/from16 v13, p1

    sget-object v14, Lg2/f;->d:Ld1/f;

    sget-object v0, Lg2/d;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg2/l;

    :goto_1
    sget-object v1, Lg2/d;->d:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v1, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v1

    const-wide v3, 0xfffffffffffffffL

    and-long v15, v1, v3

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v2, v3}, Lg2/d;->v(JZ)Z

    move-result v17

    sget v7, Lg2/f;->b:I

    int-to-long v4, v7

    div-long v1, v15, v4

    rem-long v10, v15, v4

    long-to-int v10, v10

    iget-wide v12, v0, Lj2/u;->d:J

    cmp-long v3, v12, v1

    if-eqz v3, :cond_6

    invoke-static {v8, v1, v2, v0}, Lg2/d;->b(Lg2/d;JLg2/l;)Lg2/l;

    move-result-object v1

    if-nez v1, :cond_5

    if-eqz v17, :cond_4

    invoke-virtual/range {p0 .. p0}, Lg2/d;->s()Ljava/lang/Throwable;

    move-result-object v0

    new-instance v9, Lg2/i;

    invoke-direct {v9, v0}, Lg2/i;-><init>(Ljava/lang/Throwable;)V

    goto/16 :goto_5

    :cond_4
    move-object/from16 v13, p1

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x1

    goto :goto_1

    :cond_5
    move-object v12, v1

    goto :goto_2

    :cond_6
    move-object v12, v0

    :goto_2
    move-object/from16 v0, p0

    move-object v1, v12

    move v2, v10

    move-object/from16 v3, p1

    move-wide/from16 v18, v4

    move-wide v4, v15

    move-object v6, v14

    move v13, v7

    move/from16 v7, v17

    invoke-static/range {v0 .. v7}, Lg2/d;->f(Lg2/d;Lg2/l;ILjava/lang/Object;JLjava/lang/Object;Z)I

    move-result v0

    if-eqz v0, :cond_f

    const/4 v1, 0x1

    if-eq v0, v1, :cond_10

    const/4 v2, 0x2

    if-eq v0, v2, :cond_b

    const/4 v2, 0x3

    if-eq v0, v2, :cond_a

    const/4 v3, 0x4

    if-eq v0, v3, :cond_8

    const/4 v3, 0x5

    if-eq v0, v3, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v12}, Lj2/d;->a()V

    :goto_3
    move-object/from16 v13, p1

    move v10, v2

    move-object v0, v12

    const/4 v11, 0x0

    move v12, v1

    goto :goto_1

    :cond_8
    sget-object v0, Lg2/d;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    cmp-long v0, v15, v0

    if-gez v0, :cond_9

    invoke-virtual {v12}, Lj2/d;->a()V

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lg2/d;->s()Ljava/lang/Throwable;

    move-result-object v0

    new-instance v9, Lg2/i;

    invoke-direct {v9, v0}, Lg2/i;-><init>(Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    if-eqz v17, :cond_c

    invoke-virtual {v12}, Lj2/u;->h()V

    invoke-virtual/range {p0 .. p0}, Lg2/d;->s()Ljava/lang/Throwable;

    move-result-object v0

    new-instance v9, Lg2/i;

    invoke-direct {v9, v0}, Lg2/i;-><init>(Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_c
    instance-of v0, v14, Le2/l0;

    if-eqz v0, :cond_d

    move-object v11, v14

    check-cast v11, Le2/l0;

    goto :goto_4

    :cond_d
    const/4 v11, 0x0

    :goto_4
    if-eqz v11, :cond_e

    add-int v7, v10, v13

    invoke-interface {v11, v12, v7}, Le2/l0;->a(Lj2/u;I)V

    :cond_e
    iget-wide v0, v12, Lj2/u;->d:J

    mul-long v0, v0, v18

    int-to-long v2, v10

    add-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lg2/d;->o(J)V

    goto :goto_5

    :cond_f
    invoke-virtual {v12}, Lj2/d;->a()V

    :cond_10
    :goto_5
    return-object v9
.end method

.method public final g(LO1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 p1, 0x1

    invoke-virtual {p0, p2, p1}, Lg2/o;->I(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lg2/i;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lg2/d;->c:LW1/l;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lj2/a;->b(LW1/l;Ljava/lang/Object;LK1/b;)LK1/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lg2/d;->s()Ljava/lang/Throwable;

    move-result-object p2

    invoke-static {p1, p2}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p1

    :cond_0
    invoke-virtual {p0}, Lg2/d;->s()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_1
    sget-object p1, LK1/h;->a:LK1/h;

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lg2/o;->I(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final w()Z
    .locals 2

    const/4 v0, 0x2

    iget v1, p0, Lg2/o;->m:I

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
