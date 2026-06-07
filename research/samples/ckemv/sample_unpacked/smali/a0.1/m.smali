.class public abstract La0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/m;->a:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La0/m;->b:Ljava/lang/Object;

    new-instance p1, La0/l;

    invoke-direct {p1, v0, p0}, La0/l;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, La/a;->A(LW1/a;)LK1/f;

    move-result-object p1

    iput-object p1, p0, La0/m;->c:Ljava/lang/Object;

    return-void
.end method

.method public static o(Ljava/util/Set;Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Ljava/util/Set;

    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v1, v3, :cond_1

    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :catch_0
    :cond_2
    return v2
.end method

.method public static q(Ljava/util/Map;Ljava/util/Collection;)Z
    .locals 3

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result p0

    if-eq v0, p0, :cond_2

    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    return p0
.end method


# virtual methods
.method public a()Lf0/i;
    .locals 3

    iget-object v0, p0, La0/m;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->a()V

    iget-object v0, p0, La0/m;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La0/m;->c:Ljava/lang/Object;

    check-cast v0, LK1/f;

    invoke-virtual {v0}, LK1/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/i;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, La0/m;->m()Lf0/i;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public b()Lm0/A;
    .locals 37

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, La0/m;->c()Lm0/A;

    move-result-object v1

    iget-object v2, v0, La0/m;->b:Ljava/lang/Object;

    check-cast v2, Lv0/o;

    iget-object v2, v2, Lv0/o;->j:Lm0/d;

    iget-object v3, v2, Lm0/d;->h:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-nez v3, :cond_1

    iget-boolean v3, v2, Lm0/d;->d:Z

    if-nez v3, :cond_1

    iget-boolean v3, v2, Lm0/d;->b:Z

    if-nez v3, :cond_1

    iget-boolean v2, v2, Lm0/d;->c:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v4

    :goto_1
    iget-object v3, v0, La0/m;->b:Ljava/lang/Object;

    check-cast v3, Lv0/o;

    iget-boolean v5, v3, Lv0/o;->q:Z

    if-eqz v5, :cond_4

    xor-int/2addr v2, v4

    if-eqz v2, :cond_3

    iget-wide v2, v3, Lv0/o;->g:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Expedited jobs cannot be delayed"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Expedited jobs only support network and storage constraints"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    const-string v3, "randomUUID()"

    invoke-static {v2, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, La0/m;->a:Ljava/lang/Object;

    new-instance v3, Lv0/o;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v2, "id.toString()"

    invoke-static {v5, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, La0/m;->b:Ljava/lang/Object;

    check-cast v2, Lv0/o;

    const-string v4, "other"

    invoke-static {v2, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v6, v2, Lv0/o;->b:I

    new-instance v4, Lm0/g;

    move-object v9, v4

    iget-object v7, v2, Lv0/o;->e:Lm0/g;

    invoke-direct {v4, v7}, Lm0/g;-><init>(Lm0/g;)V

    new-instance v4, Lm0/g;

    move-object v10, v4

    iget-object v7, v2, Lv0/o;->f:Lm0/g;

    invoke-direct {v4, v7}, Lm0/g;-><init>(Lm0/g;)V

    iget-wide v13, v2, Lv0/o;->h:J

    iget-wide v7, v2, Lv0/o;->i:J

    move-wide v15, v7

    new-instance v4, Lm0/d;

    move-object/from16 v17, v4

    iget-object v7, v2, Lv0/o;->j:Lm0/d;

    invoke-direct {v4, v7}, Lm0/d;-><init>(Lm0/d;)V

    iget-wide v7, v2, Lv0/o;->n:J

    move-wide/from16 v22, v7

    iget-boolean v4, v2, Lv0/o;->q:Z

    move/from16 v28, v4

    iget-wide v7, v2, Lv0/o;->u:J

    move-wide/from16 v31, v7

    iget v4, v2, Lv0/o;->v:I

    move/from16 v33, v4

    iget-object v7, v2, Lv0/o;->c:Ljava/lang/String;

    iget-object v8, v2, Lv0/o;->d:Ljava/lang/String;

    iget-wide v11, v2, Lv0/o;->g:J

    iget v4, v2, Lv0/o;->k:I

    move/from16 v18, v4

    iget v4, v2, Lv0/o;->l:I

    move/from16 v19, v4

    move-object/from16 v36, v1

    iget-wide v0, v2, Lv0/o;->m:J

    move-wide/from16 v20, v0

    iget-wide v0, v2, Lv0/o;->o:J

    move-wide/from16 v24, v0

    iget-wide v0, v2, Lv0/o;->p:J

    move-wide/from16 v26, v0

    iget v0, v2, Lv0/o;->r:I

    move/from16 v29, v0

    iget v0, v2, Lv0/o;->s:I

    move/from16 v30, v0

    iget v0, v2, Lv0/o;->w:I

    move/from16 v34, v0

    const/high16 v35, 0x80000

    move-object v4, v3

    invoke-direct/range {v4 .. v35}, Lv0/o;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lm0/g;Lm0/g;JJJLm0/d;IIJJJJZIIJIII)V

    move-object/from16 v0, p0

    iput-object v3, v0, La0/m;->b:Ljava/lang/Object;

    return-object v36
.end method

.method public abstract c()Lm0/A;
.end method

.method public abstract d()V
.end method

.method public abstract e(II)Ljava/lang/Object;
.end method

.method public abstract f()Ljava/util/Map;
.end method

.method public abstract g()I
.end method

.method public abstract h(Ljava/lang/Object;)I
.end method

.method public abstract i(Ljava/lang/Object;)I
.end method

.method public abstract j(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract k(I)V
.end method

.method public abstract l(ILjava/lang/Object;)Ljava/lang/Object;
.end method

.method public m()Lf0/i;
    .locals 2

    invoke-virtual {p0}, La0/m;->n()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, La0/m;->a:Ljava/lang/Object;

    check-cast v1, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->a()V

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->b()V

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v1

    invoke-interface {v1}, Le0/c;->s()Lf0/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lf0/c;->i(Ljava/lang/String;)Lf0/i;

    move-result-object v0

    return-object v0
.end method

.method public abstract n()Ljava/lang/String;
.end method

.method public p(Lf0/i;)V
    .locals 1

    const-string v0, "statement"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La0/m;->c:Ljava/lang/Object;

    check-cast v0, LK1/f;

    invoke-virtual {v0}, LK1/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/i;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, La0/m;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method

.method public r(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, La0/m;->g()I

    move-result v0

    array-length v1, p2

    if-ge v1, v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Object;

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1, p1}, La0/m;->e(II)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length p1, p2

    if-le p1, v0, :cond_2

    const/4 p1, 0x0

    aput-object p1, p2, v0

    :cond_2
    return-object p2
.end method
