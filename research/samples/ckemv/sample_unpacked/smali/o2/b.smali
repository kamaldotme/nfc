.class public final Lo2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Lr2/f;)Lm2/r;
    .locals 19

    move-object/from16 v0, p1

    const/4 v1, 0x6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v2, v0, Lr2/f;->e:Lk/s;

    const-string v3, "request"

    invoke-static {v2, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lv0/e;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v1, v4}, Lv0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v5, v2, Lk/s;->g:Ljava/lang/Object;

    check-cast v5, Lm2/c;

    if-nez v5, :cond_0

    sget v5, Lm2/c;->n:I

    iget-object v5, v2, Lk/s;->d:Ljava/lang/Object;

    check-cast v5, Lm2/j;

    invoke-static {v5}, Lv0/f;->H(Lm2/j;)Lm2/c;

    move-result-object v5

    iput-object v5, v2, Lk/s;->g:Ljava/lang/Object;

    :cond_0
    iget-boolean v5, v5, Lm2/c;->j:Z

    if-eqz v5, :cond_1

    new-instance v3, Lv0/e;

    invoke-direct {v3, v4, v1, v4}, Lv0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_1
    iget-object v1, v0, Lr2/f;->a:Lq2/i;

    instance-of v5, v1, Lq2/i;

    if-eqz v5, :cond_2

    move-object v5, v1

    goto :goto_0

    :cond_2
    move-object v5, v4

    :goto_0
    if-eqz v5, :cond_3

    iget-object v5, v5, Lq2/i;->f:Lm2/b;

    :cond_3
    const-string v5, "call"

    iget-object v6, v3, Lv0/e;->b:Ljava/lang/Object;

    check-cast v6, Lk/s;

    iget-object v3, v3, Lv0/e;->c:Ljava/lang/Object;

    check-cast v3, Lm2/r;

    if-nez v6, :cond_4

    if-nez v3, :cond_4

    new-instance v0, Lm2/q;

    invoke-direct {v0}, Lm2/q;-><init>()V

    iput-object v2, v0, Lm2/q;->a:Lk/s;

    sget-object v2, Lm2/p;->d:Lm2/p;

    iput-object v2, v0, Lm2/q;->b:Lm2/p;

    const/16 v2, 0x1f8

    iput v2, v0, Lm2/q;->c:I

    const-string v2, "Unsatisfiable Request (only-if-cached)"

    iput-object v2, v0, Lm2/q;->d:Ljava/lang/String;

    sget-object v2, Ln2/b;->c:Lm2/s;

    iput-object v2, v0, Lm2/q;->g:Lm2/s;

    const-wide/16 v2, -0x1

    iput-wide v2, v0, Lm2/q;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lm2/q;->l:J

    invoke-virtual {v0}, Lm2/q;->a()Lm2/r;

    move-result-object v0

    invoke-static {v1, v5}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_4
    const-string v2, "cacheResponse"

    if-nez v6, :cond_5

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm2/r;->b()Lm2/q;

    move-result-object v0

    invoke-static {v3}, Lo2/a;->a(Lm2/r;)Lm2/r;

    move-result-object v3

    invoke-static {v2, v3}, Lm2/q;->b(Ljava/lang/String;Lm2/r;)V

    iput-object v3, v0, Lm2/q;->i:Lm2/r;

    invoke-virtual {v0}, Lm2/q;->a()Lm2/r;

    move-result-object v0

    invoke-static {v1, v5}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_5
    if-eqz v3, :cond_6

    invoke-static {v1, v5}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v0, v6}, Lr2/f;->b(Lk/s;)Lm2/r;

    move-result-object v0

    const-string v1, "networkResponse"

    if-eqz v3, :cond_11

    const/16 v5, 0x130

    iget v6, v0, Lm2/r;->e:I

    if-ne v6, v5, :cond_10

    invoke-virtual {v3}, Lm2/r;->b()Lm2/q;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0x14

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v7, v3, Lm2/r;->g:Lm2/j;

    invoke-virtual {v7}, Lm2/j;->size()I

    move-result v8

    const/4 v10, 0x0

    :goto_1
    const-string v11, "value"

    const-string v12, "name"

    const-string v13, "Content-Type"

    const-string v14, "Content-Encoding"

    const-string v15, "Content-Length"

    iget-object v4, v0, Lm2/r;->g:Lm2/j;

    if-ge v10, v8, :cond_c

    invoke-virtual {v7, v10}, Lm2/j;->b(I)Ljava/lang/String;

    move-result-object v9

    move/from16 v16, v8

    invoke-virtual {v7, v10}, Lm2/j;->d(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v17, v7

    const-string v7, "Warning"

    invoke-static {v7, v9}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    const-string v7, "1"

    move-object/from16 v18, v1

    const/4 v1, 0x0

    invoke-static {v8, v7, v1}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_3

    :cond_7
    move-object/from16 v18, v1

    :cond_8
    invoke-static {v15, v9}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-static {v14, v9}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-static {v13, v9}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v9}, Lo2/a;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v4, v9}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_b

    :cond_a
    :goto_2
    invoke-static {v9, v12}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v11}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v8}, Ld2/d;->n0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_3
    add-int/lit8 v10, v10, 0x1

    move/from16 v8, v16

    move-object/from16 v7, v17

    move-object/from16 v1, v18

    const/4 v4, 0x0

    goto :goto_1

    :cond_c
    move-object/from16 v18, v1

    invoke-virtual {v4}, Lm2/j;->size()I

    move-result v1

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v1, :cond_f

    invoke-virtual {v4, v7}, Lm2/j;->b(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v15, v8}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_e

    invoke-static {v14, v8}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_e

    invoke-static {v13, v8}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_5

    :cond_d
    invoke-static {v8}, Lo2/a;->b(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-virtual {v4, v7}, Lm2/j;->d(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v12}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v11}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v9}, Ld2/d;->n0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_f
    new-instance v1, Lm2/j;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/String;

    invoke-direct {v1, v4}, Lm2/j;-><init>([Ljava/lang/String;)V

    invoke-virtual {v1}, Lm2/j;->c()Lf/G;

    move-result-object v1

    iput-object v1, v5, Lm2/q;->f:Lf/G;

    iget-wide v6, v0, Lm2/r;->l:J

    iput-wide v6, v5, Lm2/q;->k:J

    iget-wide v6, v0, Lm2/r;->m:J

    iput-wide v6, v5, Lm2/q;->l:J

    invoke-static {v3}, Lo2/a;->a(Lm2/r;)Lm2/r;

    move-result-object v1

    invoke-static {v2, v1}, Lm2/q;->b(Ljava/lang/String;Lm2/r;)V

    iput-object v1, v5, Lm2/q;->i:Lm2/r;

    invoke-static {v0}, Lo2/a;->a(Lm2/r;)Lm2/r;

    move-result-object v1

    move-object/from16 v4, v18

    invoke-static {v4, v1}, Lm2/q;->b(Ljava/lang/String;Lm2/r;)V

    iput-object v1, v5, Lm2/q;->h:Lm2/r;

    invoke-virtual {v5}, Lm2/q;->a()Lm2/r;

    iget-object v0, v0, Lm2/r;->h:Lm2/s;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm2/s;->close()V

    const/4 v0, 0x0

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    throw v0

    :cond_10
    move-object v4, v1

    iget-object v1, v3, Lm2/r;->h:Lm2/s;

    if-eqz v1, :cond_12

    invoke-static {v1}, Ln2/b;->c(Ljava/io/Closeable;)V

    goto :goto_6

    :cond_11
    move-object v4, v1

    :cond_12
    :goto_6
    invoke-virtual {v0}, Lm2/r;->b()Lm2/q;

    move-result-object v1

    invoke-static {v3}, Lo2/a;->a(Lm2/r;)Lm2/r;

    move-result-object v3

    invoke-static {v2, v3}, Lm2/q;->b(Ljava/lang/String;Lm2/r;)V

    iput-object v3, v1, Lm2/q;->i:Lm2/r;

    invoke-static {v0}, Lo2/a;->a(Lm2/r;)Lm2/r;

    move-result-object v0

    invoke-static {v4, v0}, Lm2/q;->b(Ljava/lang/String;Lm2/r;)V

    iput-object v0, v1, Lm2/q;->h:Lm2/r;

    invoke-virtual {v1}, Lm2/q;->a()Lm2/r;

    move-result-object v0

    return-object v0
.end method
