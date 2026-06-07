.class public final Lr2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/m;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm2/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr2/a;->a:I

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm2/o;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lr2/a;->a:I

    const-string v0, "client"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static d(Lm2/r;I)I
    .locals 1

    const-string v0, "Retry-After"

    invoke-static {v0, p0}, Lm2/r;->a(Ljava/lang/String;Lm2/r;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return p1

    :cond_0
    const-string p1, "\\d+"

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    const-string v0, "compile(...)"

    invoke-static {p1, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "valueOf(header)"

    invoke-static {p0, p1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0

    :cond_1
    const p0, 0x7fffffff

    return p0
.end method


# virtual methods
.method public final a(Lr2/f;)Lm2/r;
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget v0, v1, Lr2/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Lr2/f;->e:Lk/s;

    iget-object v3, v2, Lr2/f;->a:Lq2/i;

    sget-object v4, LL1/t;->b:LL1/t;

    const/4 v5, 0x1

    move-object v8, v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, v0

    move v0, v5

    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "request"

    invoke-static {v4, v11}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v3, Lq2/i;->m:Lq2/e;

    if-nez v11, :cond_11

    monitor-enter v3

    :try_start_0
    iget-boolean v11, v3, Lq2/i;->o:Z

    xor-int/2addr v11, v5

    if-eqz v11, :cond_10

    iget-boolean v11, v3, Lq2/i;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    xor-int/2addr v11, v5

    if-eqz v11, :cond_f

    monitor-exit v3

    if-eqz v0, :cond_2

    new-instance v0, Lq2/f;

    iget-object v11, v3, Lq2/i;->e:Lq2/m;

    iget-object v12, v4, Lk/s;->b:Ljava/lang/Object;

    check-cast v12, Lm2/l;

    iget-boolean v13, v12, Lm2/l;->i:Z

    iget-object v14, v3, Lq2/i;->b:Lm2/o;

    if-eqz v13, :cond_1

    iget-object v13, v14, Lm2/o;->p:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v13, :cond_0

    iget-object v15, v14, Lm2/o;->t:Ly2/c;

    iget-object v7, v14, Lm2/o;->u:Lm2/d;

    move-object/from16 v23, v7

    move-object/from16 v21, v13

    move-object/from16 v22, v15

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "CLEARTEXT-only client"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    :goto_1
    new-instance v7, Lm2/a;

    iget-object v13, v14, Lm2/o;->l:Lm2/b;

    iget-object v15, v14, Lm2/o;->o:Ljavax/net/SocketFactory;

    iget-object v5, v14, Lm2/o;->n:Lm2/b;

    iget-object v6, v14, Lm2/o;->s:Ljava/util/List;

    move-object/from16 v28, v8

    iget-object v8, v14, Lm2/o;->r:Ljava/util/List;

    iget-object v14, v14, Lm2/o;->m:Ljava/net/ProxySelector;

    move/from16 v29, v10

    iget-object v10, v12, Lm2/l;->d:Ljava/lang/String;

    iget v12, v12, Lm2/l;->e:I

    move-object/from16 v16, v7

    move-object/from16 v17, v10

    move/from16 v18, v12

    move-object/from16 v19, v13

    move-object/from16 v20, v15

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v26, v8

    move-object/from16 v27, v14

    invoke-direct/range {v16 .. v27}, Lm2/a;-><init>(Ljava/lang/String;ILm2/b;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ly2/c;Lm2/d;Lm2/b;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    iget-object v5, v3, Lq2/i;->f:Lm2/b;

    invoke-direct {v0, v11, v7, v3, v5}, Lq2/f;-><init>(Lq2/m;Lm2/a;Lq2/i;Lm2/b;)V

    iput-object v0, v3, Lq2/i;->j:Lq2/f;

    goto :goto_2

    :cond_2
    move-object/from16 v28, v8

    move/from16 v29, v10

    :goto_2
    :try_start_1
    iget-boolean v0, v3, Lq2/i;->q:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_e

    :try_start_2
    invoke-virtual {v2, v4}, Lr2/f;->b(Lk/s;)Lm2/r;

    move-result-object v0
    :try_end_2
    .catch Lq2/n; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v9, :cond_4

    :try_start_3
    invoke-virtual {v0}, Lm2/r;->b()Lm2/q;

    move-result-object v0

    invoke-virtual {v9}, Lm2/r;->b()Lm2/q;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, v4, Lm2/q;->g:Lm2/s;

    invoke-virtual {v4}, Lm2/q;->a()Lm2/r;

    move-result-object v4

    iget-object v6, v4, Lm2/r;->h:Lm2/s;

    if-nez v6, :cond_3

    iput-object v4, v0, Lm2/q;->j:Lm2/r;

    invoke-virtual {v0}, Lm2/q;->a()Lm2/r;

    move-result-object v0

    :goto_3
    move-object v9, v0

    goto :goto_4

    :catchall_0
    move-exception v0

    const/4 v2, 0x1

    goto/16 :goto_8

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "priorResponse.body != null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v5, 0x0

    goto :goto_3

    :goto_4
    iget-object v0, v3, Lq2/i;->m:Lq2/e;

    invoke-virtual {v1, v9, v0}, Lr2/a;->b(Lm2/r;Lq2/e;)Lk/s;

    move-result-object v4

    if-nez v4, :cond_7

    if-eqz v0, :cond_5

    iget-boolean v0, v0, Lq2/e;->e:Z

    if-eqz v0, :cond_5

    iget-boolean v0, v3, Lq2/i;->l:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-eqz v0, :cond_6

    iput-boolean v2, v3, Lq2/i;->l:Z

    iget-object v0, v3, Lq2/i;->g:Lq2/h;

    invoke-virtual {v0}, Lz2/e;->i()Z

    :cond_5
    const/4 v2, 0x0

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_5
    invoke-virtual {v3, v2}, Lq2/i;->d(Z)V

    return-object v9

    :cond_7
    :try_start_4
    iget-object v0, v9, Lm2/r;->h:Lm2/s;

    if-eqz v0, :cond_8

    invoke-static {v0}, Ln2/b;->c(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_8
    add-int/lit8 v10, v29, 0x1

    const/16 v0, 0x14

    if-gt v10, v0, :cond_9

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Lq2/i;->d(Z)V

    move-object/from16 v8, v28

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto/16 :goto_0

    :cond_9
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Too many follow-up requests: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    const/4 v5, 0x0

    move-object v6, v0

    nop

    instance-of v0, v6, Lt2/a;

    const/4 v7, 0x1

    xor-int/2addr v0, v7

    invoke-virtual {v1, v6, v3, v4, v0}, Lr2/a;->c(Ljava/io/IOException;Lq2/i;Lk/s;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface/range {v28 .. v28}, Ljava/util/Collection;->size()I

    move-result v8

    add-int/2addr v8, v7

    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v8, v28

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v3, v7}, Lq2/i;->d(Z)V

    move-object v8, v0

    move v5, v7

    move/from16 v10, v29

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_a
    move-object/from16 v8, v28

    :try_start_6
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Exception;

    invoke-static {v6, v2}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_b
    throw v6

    :catch_1
    move-exception v0

    move-object/from16 v8, v28

    const/4 v5, 0x0

    move-object v6, v0

    iget-object v0, v6, Lq2/n;->c:Ljava/io/IOException;

    const/4 v7, 0x0

    invoke-virtual {v1, v0, v3, v4, v7}, Lr2/a;->c(Ljava/io/IOException;Lq2/i;Lk/s;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, v6, Lq2/n;->b:Ljava/io/IOException;

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v11, 0x1

    add-int/2addr v10, v11

    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {v3, v11}, Lq2/i;->d(Z)V

    move-object v8, v6

    move v0, v7

    move v5, v11

    move/from16 v10, v29

    goto/16 :goto_0

    :cond_c
    :try_start_7
    iget-object v0, v6, Lq2/n;->b:Ljava/io/IOException;

    const-string v2, "<this>"

    invoke-static {v0, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Exception;

    invoke-static {v0, v4}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_7

    :cond_d
    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_8
    invoke-virtual {v3, v2}, Lq2/i;->d(Z)V

    throw v0

    :cond_f
    :try_start_8
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_1
    move-exception v0

    goto :goto_9

    :cond_10
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_9
    monitor-exit v3

    throw v0

    :cond_11
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_0
    iget-object v0, v2, Lr2/f;->e:Lk/s;

    invoke-virtual {v0}, Lk/s;->e()LG/e;

    move-result-object v3

    const-wide/16 v4, -0x1

    const-string v6, "Content-Type"

    const-string v7, "Content-Length"

    iget-object v8, v0, Lk/s;->e:Ljava/lang/Object;

    check-cast v8, LX0/o;

    if-eqz v8, :cond_14

    iget-object v9, v8, LX0/o;->c:Ljava/lang/Object;

    check-cast v9, Lm2/n;

    if-eqz v9, :cond_12

    iget-object v9, v9, Lm2/n;->a:Ljava/lang/String;

    invoke-virtual {v3, v6, v9}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_12
    iget v8, v8, LX0/o;->a:I

    int-to-long v8, v8

    cmp-long v10, v8, v4

    const-string v11, "Transfer-Encoding"

    if-eqz v10, :cond_13

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v8, v3, LG/e;->d:Ljava/lang/Object;

    check-cast v8, Lf/G;

    invoke-virtual {v8, v11}, Lf/G;->q(Ljava/lang/String;)V

    goto :goto_a

    :cond_13
    const-string v8, "chunked"

    invoke-virtual {v3, v11, v8}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v8, v3, LG/e;->d:Ljava/lang/Object;

    check-cast v8, Lf/G;

    invoke-virtual {v8, v7}, Lf/G;->q(Ljava/lang/String;)V

    :cond_14
    :goto_a
    iget-object v8, v0, Lk/s;->d:Ljava/lang/Object;

    check-cast v8, Lm2/j;

    const-string v9, "Host"

    invoke-virtual {v8, v9}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    iget-object v12, v0, Lk/s;->b:Ljava/lang/Object;

    check-cast v12, Lm2/l;

    if-nez v10, :cond_15

    invoke-static {v12, v11}, Ln2/b;->u(Lm2/l;Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v9, v10}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_15
    const-string v9, "Connection"

    invoke-virtual {v8, v9}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_16

    const-string v10, "Keep-Alive"

    invoke-virtual {v3, v9, v10}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_16
    const-string v9, "Accept-Encoding"

    invoke-virtual {v8, v9}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v13, "gzip"

    if-nez v10, :cond_17

    const-string v10, "Range"

    invoke-virtual {v8, v10}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_17

    invoke-virtual {v3, v9, v13}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x1

    :cond_17
    iget-object v9, v1, Lr2/a;->b:Ljava/lang/Object;

    check-cast v9, Lm2/b;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "url"

    invoke-static {v12, v10}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "User-Agent"

    invoke-virtual {v8, v10}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_18

    const-string v8, "okhttp/4.12.0"

    invoke-virtual {v3, v10, v8}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_18
    invoke-virtual {v3}, LG/e;->a()Lk/s;

    move-result-object v3

    invoke-virtual {v2, v3}, Lr2/f;->b(Lk/s;)Lm2/r;

    move-result-object v2

    iget-object v3, v2, Lm2/r;->g:Lm2/j;

    invoke-static {v9, v12, v3}, Lr2/e;->b(Lm2/b;Lm2/l;Lm2/j;)V

    invoke-virtual {v2}, Lm2/r;->b()Lm2/q;

    move-result-object v8

    iput-object v0, v8, Lm2/q;->a:Lk/s;

    if-eqz v11, :cond_19

    const-string v0, "Content-Encoding"

    invoke-static {v0, v2}, Lm2/r;->a(Ljava/lang/String;Lm2/r;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v13, v9}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-static {v2}, Lr2/e;->a(Lm2/r;)Z

    move-result v9

    if-eqz v9, :cond_19

    iget-object v9, v2, Lm2/r;->h:Lm2/s;

    if-eqz v9, :cond_19

    new-instance v10, Lz2/k;

    invoke-virtual {v9}, Lm2/s;->b()Lz2/h;

    move-result-object v9

    invoke-direct {v10, v9}, Lz2/k;-><init>(Lz2/v;)V

    invoke-virtual {v3}, Lm2/j;->c()Lf/G;

    move-result-object v3

    invoke-virtual {v3, v0}, Lf/G;->q(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Lf/G;->q(Ljava/lang/String;)V

    invoke-virtual {v3}, Lf/G;->l()Lm2/j;

    move-result-object v0

    invoke-virtual {v0}, Lm2/j;->c()Lf/G;

    move-result-object v0

    iput-object v0, v8, Lm2/q;->f:Lf/G;

    invoke-static {v6, v2}, Lm2/r;->a(Ljava/lang/String;Lm2/r;)Ljava/lang/String;

    new-instance v0, Lm2/s;

    new-instance v2, Lz2/p;

    invoke-direct {v2, v10}, Lz2/p;-><init>(Lz2/v;)V

    const/4 v3, 0x1

    invoke-direct {v0, v4, v5, v2, v3}, Lm2/s;-><init>(JLz2/h;I)V

    iput-object v0, v8, Lm2/q;->g:Lm2/s;

    :cond_19
    invoke-virtual {v8}, Lm2/q;->a()Lm2/r;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lm2/r;Lq2/e;)Lk/s;
    .locals 10

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object v1, p2, Lq2/e;->g:Lq2/l;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lq2/l;->b:Lm2/t;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    iget v2, p1, Lm2/r;->e:I

    iget-object v3, p1, Lm2/r;->b:Lk/s;

    iget-object v3, v3, Lk/s;->c:Ljava/io/Serializable;

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    const/16 v5, 0x134

    const/16 v6, 0x133

    const/4 v7, 0x1

    if-eq v2, v6, :cond_e

    if-eq v2, v5, :cond_e

    const/16 v8, 0x191

    if-eq v2, v8, :cond_d

    const/16 v8, 0x1a5

    if-eq v2, v8, :cond_a

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_7

    const/16 p2, 0x197

    if-eq v2, p2, :cond_5

    const/16 p2, 0x198

    if-eq v2, p2, :cond_1

    packed-switch v2, :pswitch_data_0

    return-object v0

    :cond_1
    iget-object v1, p0, Lr2/a;->b:Ljava/lang/Object;

    check-cast v1, Lm2/o;

    iget-boolean v1, v1, Lm2/o;->g:Z

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    iget-object v1, p1, Lm2/r;->k:Lm2/r;

    if-eqz v1, :cond_3

    iget v1, v1, Lm2/r;->e:I

    if-ne v1, p2, :cond_3

    return-object v0

    :cond_3
    invoke-static {p1, v4}, Lr2/a;->d(Lm2/r;I)I

    move-result p2

    if-lez p2, :cond_4

    return-object v0

    :cond_4
    iget-object p1, p1, Lm2/r;->b:Lk/s;

    return-object p1

    :cond_5
    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object p1, v1, Lm2/t;->b:Ljava/net/Proxy;

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p1

    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p1, p2, :cond_6

    iget-object p1, p0, Lr2/a;->b:Ljava/lang/Object;

    check-cast p1, Lm2/o;

    iget-object p1, p1, Lm2/o;->n:Lm2/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget-object v1, p1, Lm2/r;->k:Lm2/r;

    if-eqz v1, :cond_8

    iget v1, v1, Lm2/r;->e:I

    if-ne v1, p2, :cond_8

    return-object v0

    :cond_8
    const p2, 0x7fffffff

    invoke-static {p1, p2}, Lr2/a;->d(Lm2/r;I)I

    move-result p2

    if-nez p2, :cond_9

    iget-object p1, p1, Lm2/r;->b:Lk/s;

    return-object p1

    :cond_9
    return-object v0

    :cond_a
    if-eqz p2, :cond_c

    iget-object v1, p2, Lq2/e;->c:Lq2/f;

    iget-object v1, v1, Lq2/f;->b:Lm2/a;

    iget-object v1, v1, Lm2/a;->h:Lm2/l;

    iget-object v1, v1, Lm2/l;->d:Ljava/lang/String;

    iget-object v2, p2, Lq2/e;->g:Lq2/l;

    iget-object v2, v2, Lq2/l;->b:Lm2/t;

    iget-object v2, v2, Lm2/t;->a:Lm2/a;

    iget-object v2, v2, Lm2/a;->h:Lm2/l;

    iget-object v2, v2, Lm2/l;->d:Ljava/lang/String;

    invoke-static {v1, v2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v7

    if-nez v1, :cond_b

    goto :goto_1

    :cond_b
    iget-object p2, p2, Lq2/e;->g:Lq2/l;

    monitor-enter p2

    :try_start_0
    iput-boolean v7, p2, Lq2/l;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    iget-object p1, p1, Lm2/r;->b:Lk/s;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_c
    :goto_1
    return-object v0

    :cond_d
    iget-object p1, p0, Lr2/a;->b:Ljava/lang/Object;

    check-cast p1, Lm2/o;

    iget-object p1, p1, Lm2/o;->h:Lm2/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :cond_e
    :pswitch_0
    iget-object p2, p0, Lr2/a;->b:Ljava/lang/Object;

    check-cast p2, Lm2/o;

    iget-boolean v1, p2, Lm2/o;->i:Z

    if-nez v1, :cond_f

    goto/16 :goto_5

    :cond_f
    const-string v1, "Location"

    invoke-static {v1, p1}, Lm2/r;->a(Ljava/lang/String;Lm2/r;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_10

    goto/16 :goto_5

    :cond_10
    iget-object v2, p1, Lm2/r;->b:Lk/s;

    iget-object v8, v2, Lk/s;->b:Ljava/lang/Object;

    check-cast v8, Lm2/l;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    new-instance v9, Lm2/k;

    invoke-direct {v9}, Lm2/k;-><init>()V

    invoke-virtual {v9, v8, v1}, Lm2/k;->d(Lm2/l;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-object v9, v0

    :goto_2
    if-eqz v9, :cond_11

    invoke-virtual {v9}, Lm2/k;->a()Lm2/l;

    move-result-object v1

    goto :goto_3

    :cond_11
    move-object v1, v0

    :goto_3
    if-nez v1, :cond_12

    goto/16 :goto_5

    :cond_12
    iget-object v8, v2, Lk/s;->b:Ljava/lang/Object;

    check-cast v8, Lm2/l;

    iget-object v8, v8, Lm2/l;->a:Ljava/lang/String;

    iget-object v9, v1, Lm2/l;->a:Ljava/lang/String;

    invoke-static {v9, v8}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    iget-boolean p2, p2, Lm2/o;->j:Z

    if-nez p2, :cond_13

    goto :goto_5

    :cond_13
    invoke-virtual {v2}, Lk/s;->e()LG/e;

    move-result-object p2

    invoke-static {v3}, La/a;->H(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_18

    const-string v8, "PROPFIND"

    invoke-static {v3, v8}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    iget p1, p1, Lm2/r;->e:I

    if-nez v9, :cond_14

    if-eq p1, v5, :cond_14

    if-ne p1, v6, :cond_15

    :cond_14
    move v4, v7

    :cond_15
    invoke-static {v3, v8}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    xor-int/2addr v7, v8

    if-eqz v7, :cond_16

    if-eq p1, v5, :cond_16

    if-eq p1, v6, :cond_16

    const-string p1, "GET"

    invoke-virtual {p2, p1, v0}, LG/e;->j(Ljava/lang/String;LX0/o;)V

    goto :goto_4

    :cond_16
    if-eqz v4, :cond_17

    iget-object p1, v2, Lk/s;->e:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LX0/o;

    :cond_17
    invoke-virtual {p2, v3, v0}, LG/e;->j(Ljava/lang/String;LX0/o;)V

    :goto_4
    if-nez v4, :cond_18

    const-string p1, "Transfer-Encoding"

    iget-object v0, p2, LG/e;->d:Ljava/lang/Object;

    check-cast v0, Lf/G;

    invoke-virtual {v0, p1}, Lf/G;->q(Ljava/lang/String;)V

    const-string p1, "Content-Length"

    iget-object v0, p2, LG/e;->d:Ljava/lang/Object;

    check-cast v0, Lf/G;

    invoke-virtual {v0, p1}, Lf/G;->q(Ljava/lang/String;)V

    const-string p1, "Content-Type"

    iget-object v0, p2, LG/e;->d:Ljava/lang/Object;

    check-cast v0, Lf/G;

    invoke-virtual {v0, p1}, Lf/G;->q(Ljava/lang/String;)V

    :cond_18
    iget-object p1, v2, Lk/s;->b:Ljava/lang/Object;

    check-cast p1, Lm2/l;

    invoke-static {p1, v1}, Ln2/b;->a(Lm2/l;Lm2/l;)Z

    move-result p1

    if-nez p1, :cond_19

    const-string p1, "Authorization"

    iget-object v0, p2, LG/e;->d:Ljava/lang/Object;

    check-cast v0, Lf/G;

    invoke-virtual {v0, p1}, Lf/G;->q(Ljava/lang/String;)V

    :cond_19
    iput-object v1, p2, LG/e;->c:Ljava/lang/Object;

    invoke-virtual {p2}, LG/e;->a()Lk/s;

    move-result-object v0

    :goto_5
    return-object v0

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/io/IOException;Lq2/i;Lk/s;Z)Z
    .locals 3

    iget-object p3, p0, Lr2/a;->b:Ljava/lang/Object;

    check-cast p3, Lm2/o;

    iget-boolean p3, p3, Lm2/o;->g:Z

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    if-eqz p4, :cond_1

    instance-of p3, p1, Ljava/io/FileNotFoundException;

    if-eqz p3, :cond_1

    return v0

    :cond_1
    instance-of p3, p1, Ljava/net/ProtocolException;

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    if-eqz p3, :cond_3

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_5

    if-nez p4, :cond_5

    goto :goto_1

    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p3, :cond_4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    instance-of p3, p3, Ljava/security/cert/CertificateException;

    if-eqz p3, :cond_4

    goto :goto_0

    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_6

    :cond_5
    :goto_0
    return v0

    :cond_6
    :goto_1
    iget-object p1, p2, Lq2/i;->j:Lq2/f;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    iget p2, p1, Lq2/f;->g:I

    if-nez p2, :cond_7

    iget p3, p1, Lq2/f;->h:I

    if-nez p3, :cond_7

    iget p3, p1, Lq2/f;->i:I

    if-nez p3, :cond_7

    goto :goto_3

    :cond_7
    iget-object p3, p1, Lq2/f;->j:Lm2/t;

    const/4 p4, 0x1

    if-eqz p3, :cond_8

    goto :goto_4

    :cond_8
    const/4 p3, 0x0

    if-gt p2, p4, :cond_d

    iget p2, p1, Lq2/f;->h:I

    if-gt p2, p4, :cond_d

    iget p2, p1, Lq2/f;->i:I

    if-lez p2, :cond_9

    goto :goto_2

    :cond_9
    iget-object p2, p1, Lq2/f;->c:Lq2/i;

    iget-object p2, p2, Lq2/i;->k:Lq2/l;

    if-nez p2, :cond_a

    goto :goto_2

    :cond_a
    monitor-enter p2

    :try_start_0
    iget v1, p2, Lq2/l;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_b

    monitor-exit p2

    goto :goto_2

    :cond_b
    :try_start_1
    iget-object v1, p2, Lq2/l;->b:Lm2/t;

    iget-object v1, v1, Lm2/t;->a:Lm2/a;

    iget-object v1, v1, Lm2/a;->h:Lm2/l;

    iget-object v2, p1, Lq2/f;->b:Lm2/a;

    iget-object v2, v2, Lm2/a;->h:Lm2/l;

    invoke-static {v1, v2}, Ln2/b;->a(Lm2/l;Lm2/l;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_c

    monitor-exit p2

    goto :goto_2

    :cond_c
    :try_start_2
    iget-object p3, p2, Lq2/l;->b:Lm2/t;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p2

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_d
    :goto_2
    if-eqz p3, :cond_e

    iput-object p3, p1, Lq2/f;->j:Lm2/t;

    goto :goto_4

    :cond_e
    iget-object p2, p1, Lq2/f;->e:LF0/e;

    if-eqz p2, :cond_f

    invoke-virtual {p2}, LF0/e;->b()Z

    move-result p2

    if-ne p2, p4, :cond_f

    goto :goto_4

    :cond_f
    iget-object p1, p1, Lq2/f;->f:Lm2/k;

    if-nez p1, :cond_10

    goto :goto_4

    :cond_10
    invoke-virtual {p1}, Lm2/k;->c()Z

    move-result p1

    if-nez p1, :cond_11

    :goto_3
    return v0

    :cond_11
    :goto_4
    return p4
.end method
