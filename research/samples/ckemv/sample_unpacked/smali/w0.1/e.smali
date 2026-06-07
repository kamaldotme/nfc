.class public final Lw0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Ln0/n;

.field public final c:Lv0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "EnqueueRunnable"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ln0/n;Lv0/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/e;->b:Ln0/n;

    iput-object p2, p0, Lw0/e;->c:Lv0/l;

    return-void
.end method

.method public static a(Ln0/n;)Z
    .locals 24

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p0 .. p0}, Ln0/n;->S(Ln0/n;)Ljava/util/HashSet;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iget-object v3, v0, Ln0/n;->e:Ln0/s;

    iget-object v4, v3, Ln0/s;->e:Lm0/a;

    iget-object v4, v4, Lm0/a;->c:Lm0/r;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    if-eqz v1, :cond_0

    array-length v7, v1

    if-lez v7, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    move v7, v2

    :goto_0
    iget-object v8, v3, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x6

    if-eqz v7, :cond_6

    array-length v12, v1

    move v13, v2

    move v15, v13

    move/from16 v16, v15

    const/4 v14, 0x1

    :goto_1
    if-ge v13, v12, :cond_7

    aget-object v2, v1, v13

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v6

    invoke-virtual {v6, v2}, Lv0/p;->i(Ljava/lang/String;)Lv0/o;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :goto_2
    const/4 v1, 0x1

    const/4 v2, 0x0

    goto/16 :goto_16

    :cond_2
    iget v2, v2, Lv0/o;->b:I

    if-ne v2, v10, :cond_3

    const/4 v6, 0x1

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    :goto_3
    and-int/2addr v14, v6

    if-ne v2, v9, :cond_4

    const/16 v16, 0x1

    goto :goto_4

    :cond_4
    if-ne v2, v11, :cond_5

    const/4 v15, 0x1

    :cond_5
    :goto_4
    add-int/lit8 v13, v13, 0x1

    const/4 v2, 0x0

    goto :goto_1

    :cond_6
    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    :cond_7
    iget-object v2, v0, Ln0/n;->f:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const/4 v12, 0x1

    xor-int/2addr v6, v12

    if-eqz v6, :cond_19

    if-nez v7, :cond_19

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v12

    invoke-virtual {v12, v2}, Lv0/p;->j(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_19

    iget v13, v0, Ln0/n;->g:I

    if-eq v13, v10, :cond_c

    if-ne v13, v9, :cond_8

    goto :goto_7

    :cond_8
    const/4 v10, 0x2

    if-ne v13, v10, :cond_a

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_a

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v11, v18

    check-cast v11, Lv0/n;

    iget v11, v11, Lv0/n;->b:I

    const/4 v9, 0x1

    if-eq v11, v9, :cond_1

    if-ne v11, v10, :cond_9

    goto :goto_2

    :cond_9
    const/4 v9, 0x4

    const/4 v11, 0x6

    goto :goto_5

    :cond_a
    new-instance v9, Lw0/c;

    invoke-direct {v9, v3, v2}, Lw0/c;-><init>(Ln0/s;Ljava/lang/String;)V

    invoke-virtual {v9}, Lw0/d;->run()V

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v9

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lv0/n;

    iget-object v11, v11, Lv0/n;->a:Ljava/lang/String;

    invoke-virtual {v9, v11}, Lv0/p;->a(Ljava/lang/String;)V

    goto :goto_6

    :cond_b
    move/from16 v21, v6

    const/4 v6, 0x1

    goto/16 :goto_11

    :cond_c
    :goto_7
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->f()Lv0/c;

    move-result-object v7

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lv0/n;

    iget-object v10, v12, Lv0/n;->a:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v20, v11

    const-string v11, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"

    move/from16 v21, v6

    const/4 v6, 0x1

    invoke-static {v11, v6}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v11

    if-nez v10, :cond_d

    invoke-virtual {v11, v6}, La0/j;->g(I)V

    goto :goto_9

    :cond_d
    invoke-virtual {v11, v10, v6}, La0/j;->h(Ljava/lang/String;I)V

    :goto_9
    iget-object v6, v7, Lv0/c;->c:Ljava/lang/Object;

    check-cast v6, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->b()V

    const/4 v10, 0x0

    invoke-virtual {v6, v11, v10}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v6

    :try_start_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v10

    if-eqz v10, :cond_e

    const/4 v10, 0x0

    invoke-interface {v6, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v17
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v17, :cond_f

    const/16 v17, 0x1

    goto :goto_a

    :catchall_0
    move-exception v0

    goto :goto_e

    :cond_e
    const/4 v10, 0x0

    :cond_f
    move/from16 v17, v10

    :goto_a
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    invoke-virtual {v11}, La0/j;->o()V

    if-nez v17, :cond_13

    iget v6, v12, Lv0/n;->b:I

    const/4 v11, 0x3

    if-ne v6, v11, :cond_10

    const/16 v17, 0x1

    goto :goto_b

    :cond_10
    move/from16 v17, v10

    :goto_b
    and-int v14, v14, v17

    const/4 v10, 0x4

    if-ne v6, v10, :cond_11

    const/16 v16, 0x1

    goto :goto_c

    :cond_11
    const/4 v10, 0x6

    if-ne v6, v10, :cond_12

    const/4 v15, 0x1

    :cond_12
    :goto_c
    iget-object v6, v12, Lv0/n;->a:Ljava/lang/String;

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_13
    const/4 v11, 0x3

    :goto_d
    move v10, v11

    move-object/from16 v11, v20

    move/from16 v6, v21

    goto :goto_8

    :goto_e
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    invoke-virtual {v11}, La0/j;->o()V

    throw v0

    :cond_14
    move/from16 v21, v6

    const/4 v6, 0x4

    if-ne v13, v6, :cond_17

    if-nez v15, :cond_15

    if-eqz v16, :cond_17

    :cond_15
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v6

    invoke-virtual {v6, v2}, Lv0/p;->j(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lv0/n;

    iget-object v9, v9, Lv0/n;->a:Ljava/lang/String;

    invoke-virtual {v6, v9}, Lv0/p;->a(Ljava/lang/String;)V

    goto :goto_f

    :cond_16
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    const/4 v15, 0x0

    const/16 v16, 0x0

    :cond_17
    invoke-interface {v9, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    array-length v6, v1

    if-lez v6, :cond_18

    const/4 v7, 0x1

    goto :goto_10

    :cond_18
    const/4 v7, 0x0

    :goto_10
    const/4 v6, 0x0

    goto :goto_11

    :cond_19
    move/from16 v21, v6

    goto :goto_10

    :goto_11
    iget-object v9, v0, Ln0/n;->h:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v12, v6

    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm0/A;

    iget-object v10, v6, Lm0/A;->b:Lv0/o;

    if-eqz v7, :cond_1c

    if-nez v14, :cond_1c

    if-eqz v16, :cond_1a

    const/4 v11, 0x4

    iput v11, v10, Lv0/o;->b:I

    const/4 v13, 0x6

    goto :goto_13

    :cond_1a
    const/4 v11, 0x4

    if-eqz v15, :cond_1b

    const/4 v13, 0x6

    iput v13, v10, Lv0/o;->b:I

    goto :goto_13

    :cond_1b
    const/4 v13, 0x6

    const/4 v11, 0x5

    iput v11, v10, Lv0/o;->b:I

    goto :goto_13

    :cond_1c
    const/4 v13, 0x6

    iput-wide v4, v10, Lv0/o;->n:J

    :goto_13
    iget v11, v10, Lv0/o;->b:I

    const/4 v13, 0x1

    if-ne v11, v13, :cond_1d

    const/4 v12, 0x1

    :cond_1d
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v11

    iget-object v13, v3, Ln0/s;->h:Ljava/util/List;

    move-object/from16 v19, v3

    const-string v3, "schedulers"

    invoke-static {v13, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v11, Lv0/p;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->b()V

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_1
    iget-object v11, v11, Lv0/p;->b:Lv0/b;

    invoke-virtual {v11, v10}, Lv0/b;->t(Ljava/lang/Object;)V

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    const-string v3, "id.toString()"

    iget-object v10, v6, Lm0/A;->a:Ljava/util/UUID;

    if-eqz v7, :cond_1e

    array-length v11, v1

    const/4 v13, 0x0

    :goto_14
    if-ge v13, v11, :cond_1e

    move-wide/from16 v22, v4

    aget-object v4, v1, v13

    new-instance v5, Lv0/a;

    move-object/from16 v20, v1

    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v1, v4}, Lv0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->f()Lv0/c;

    move-result-object v1

    iget-object v4, v1, Lv0/c;->c:Ljava/lang/Object;

    check-cast v4, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->b()V

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_2
    iget-object v1, v1, Lv0/c;->d:Ljava/lang/Object;

    check-cast v1, Lv0/b;

    invoke-virtual {v1, v5}, Lv0/b;->t(Ljava/lang/Object;)V

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->k()V

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, v20

    move-wide/from16 v4, v22

    goto :goto_14

    :catchall_1
    move-exception v0

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v0

    :cond_1e
    move-object/from16 v20, v1

    move-wide/from16 v22, v4

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->v()Lv0/r;

    move-result-object v1

    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v6, Lm0/A;->c:Ljava/util/Set;

    invoke-virtual {v1, v4, v5}, Lv0/r;->u(Ljava/lang/String;Ljava/util/Set;)V

    if-eqz v21, :cond_1f

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->s()Lv0/l;

    move-result-object v1

    new-instance v4, Lv0/k;

    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v2, v5}, Lv0/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v1, Lv0/l;->d:Ljava/lang/Object;

    check-cast v3, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->b()V

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_3
    iget-object v1, v1, Lv0/l;->e:Ljava/lang/Object;

    check-cast v1, Lv0/b;

    invoke-virtual {v1, v4}, Lv0/b;->t(Ljava/lang/Object;)V

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    goto :goto_15

    :catchall_2
    move-exception v0

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v0

    :cond_1f
    :goto_15
    move-object/from16 v3, v19

    move-object/from16 v1, v20

    move-wide/from16 v4, v22

    goto/16 :goto_12

    :catchall_3
    move-exception v0

    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v0

    :cond_20
    move v2, v12

    const/4 v1, 0x1

    :goto_16
    iput-boolean v1, v0, Ln0/n;->k:Z

    return v2
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lw0/e;->c:Lv0/l;

    iget-object v1, p0, Lw0/e;->b:Ln0/n;

    const-string v2, "WorkContinuation has cycles ("

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v3, v1, Ln0/n;->e:Ln0/s;

    :try_start_1
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-static {v1, v4}, Ln0/n;->R(Ln0/n;Ljava/util/HashSet;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v2, v3, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v4, v3, Ln0/s;->e:Lm0/a;

    invoke-static {v2, v4, v1}, Lv0/f;->l(Landroidx/work/impl/WorkDatabase;Lm0/a;Ln0/n;)V

    invoke-static {v1}, Lw0/e;->a(Ln0/n;)Z

    move-result v1

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    if-eqz v1, :cond_0

    iget-object v1, v3, Ln0/s;->d:Landroid/content/Context;

    const-class v2, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    const/4 v4, 0x1

    invoke-static {v1, v2, v4}, Lw0/m;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    iget-object v1, v3, Ln0/s;->e:Lm0/a;

    iget-object v2, v3, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    iget-object v3, v3, Ln0/s;->h:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ln0/l;->b(Lm0/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lm0/x;->a:Lm0/w;

    invoke-virtual {v0, v1}, Lv0/l;->h(Lu2/d;)V

    goto :goto_2

    :catchall_1
    move-exception v1

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v1

    :cond_1
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    new-instance v2, Lm0/u;

    invoke-direct {v2, v1}, Lm0/u;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Lv0/l;->h(Lu2/d;)V

    :goto_2
    return-void
.end method
