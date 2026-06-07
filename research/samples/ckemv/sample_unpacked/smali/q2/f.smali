.class public final Lq2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq2/m;

.field public final b:Lm2/a;

.field public final c:Lq2/i;

.field public final d:Lm2/b;

.field public e:LF0/e;

.field public f:Lm2/k;

.field public g:I

.field public h:I

.field public i:I

.field public j:Lm2/t;


# direct methods
.method public constructor <init>(Lq2/m;Lm2/a;Lq2/i;Lm2/b;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/f;->a:Lq2/m;

    iput-object p2, p0, Lq2/f;->b:Lm2/a;

    iput-object p3, p0, Lq2/f;->c:Lq2/i;

    iput-object p4, p0, Lq2/f;->d:Lm2/b;

    return-void
.end method


# virtual methods
.method public final a(IIIZZ)Lq2/l;
    .locals 13

    move-object v1, p0

    const/4 v0, 0x1

    :cond_0
    :goto_0
    iget-object v2, v1, Lq2/f;->c:Lq2/i;

    iget-boolean v2, v2, Lq2/i;->q:Z

    if-nez v2, :cond_23

    iget-object v2, v1, Lq2/f;->c:Lq2/i;

    iget-object v2, v2, Lq2/i;->k:Lq2/l;

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    monitor-enter v2

    :try_start_0
    iget-boolean v4, v2, Lq2/l;->j:Z

    if-nez v4, :cond_2

    iget-object v4, v2, Lq2/l;->b:Lm2/t;

    iget-object v4, v4, Lm2/t;->a:Lm2/a;

    iget-object v4, v4, Lm2/a;->h:Lm2/l;

    invoke-virtual {p0, v4}, Lq2/f;->b(Lm2/l;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_1
    iget-object v4, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v4}, Lq2/i;->h()Ljava/net/Socket;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit v2

    iget-object v5, v1, Lq2/f;->c:Lq2/i;

    iget-object v5, v5, Lq2/i;->k:Lq2/l;

    if-eqz v5, :cond_4

    if-nez v4, :cond_3

    :goto_3
    move/from16 v3, p5

    goto/16 :goto_11

    :cond_3
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    if-eqz v4, :cond_5

    invoke-static {v4}, Ln2/b;->d(Ljava/net/Socket;)V

    :cond_5
    iget-object v2, v1, Lq2/f;->d:Lm2/b;

    iget-object v4, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "call"

    invoke-static {v4, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :goto_4
    monitor-exit v2

    throw v0

    :cond_6
    :goto_5
    const/4 v2, 0x0

    iput v2, v1, Lq2/f;->g:I

    iput v2, v1, Lq2/f;->h:I

    iput v2, v1, Lq2/f;->i:I

    iget-object v4, v1, Lq2/f;->a:Lq2/m;

    iget-object v5, v1, Lq2/f;->b:Lm2/a;

    iget-object v6, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v4, v5, v6, v3, v2}, Lq2/m;->a(Lm2/a;Lq2/i;Ljava/util/ArrayList;Z)Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v2, v1, Lq2/f;->c:Lq2/i;

    iget-object v2, v2, Lq2/i;->k:Lq2/l;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v3, v1, Lq2/f;->d:Lm2/b;

    iget-object v4, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "call"

    invoke-static {v4, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    iget-object v4, v1, Lq2/f;->j:Lm2/t;

    if-eqz v4, :cond_8

    iput-object v3, v1, Lq2/f;->j:Lm2/t;

    :goto_6
    move-object v5, v3

    goto/16 :goto_10

    :cond_8
    iget-object v4, v1, Lq2/f;->e:LF0/e;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, LF0/e;->b()Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v2, v1, Lq2/f;->e:LF0/e;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, LF0/e;->b()Z

    move-result v4

    if-eqz v4, :cond_9

    iget v4, v2, LF0/e;->b:I

    add-int/lit8 v5, v4, 0x1

    iput v5, v2, LF0/e;->b:I

    iget-object v2, v2, LF0/e;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lm2/t;

    goto :goto_6

    :cond_9
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_a
    iget-object v4, v1, Lq2/f;->f:Lm2/k;

    if-nez v4, :cond_b

    new-instance v4, Lm2/k;

    iget-object v5, v1, Lq2/f;->b:Lm2/a;

    iget-object v6, v1, Lq2/f;->c:Lq2/i;

    iget-object v7, v6, Lq2/i;->b:Lm2/o;

    iget-object v7, v7, Lm2/o;->z:Lf/G;

    iget-object v8, v1, Lq2/f;->d:Lm2/b;

    invoke-direct {v4, v5, v7, v6, v8}, Lm2/k;-><init>(Lm2/a;Lf/G;Lq2/i;Lm2/b;)V

    iput-object v4, v1, Lq2/f;->f:Lm2/k;

    :cond_b
    invoke-virtual {v4}, Lm2/k;->c()Z

    move-result v5

    if-eqz v5, :cond_22

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_c
    iget v6, v4, Lm2/k;->b:I

    iget-object v7, v4, Lm2/k;->h:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_1a

    iget v6, v4, Lm2/k;->b:I

    iget-object v7, v4, Lm2/k;->h:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_d

    move v6, v0

    goto :goto_7

    :cond_d
    move v6, v2

    :goto_7
    iget-object v7, v4, Lm2/k;->d:Ljava/lang/Object;

    check-cast v7, Lm2/a;

    const-string v8, "No route to "

    if-eqz v6, :cond_19

    iget-object v6, v4, Lm2/k;->h:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget v9, v4, Lm2/k;->b:I

    add-int/lit8 v10, v9, 0x1

    iput v10, v4, Lm2/k;->b:I

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/net/Proxy;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, v4, Lm2/k;->i:Ljava/util/List;

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v10

    sget-object v11, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v10, v11, :cond_11

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v10

    sget-object v11, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v10, v11, :cond_e

    goto :goto_9

    :cond_e
    invoke-virtual {v6}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v10

    instance-of v11, v10, Ljava/net/InetSocketAddress;

    if-eqz v11, :cond_10

    const-string v11, "proxyAddress"

    invoke-static {v10, v11}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/net/InetSocketAddress;

    const-string v11, "<this>"

    invoke-static {v10, v11}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v11

    if-nez v11, :cond_f

    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "hostName"

    invoke-static {v11, v12}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_8

    :cond_f
    invoke-virtual {v11}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v11

    const-string v12, "address.hostAddress"

    invoke-static {v11, v12}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_8
    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v10

    goto :goto_a

    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Proxy.address() is not an InetSocketAddress: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_11
    :goto_9
    iget-object v10, v7, Lm2/a;->h:Lm2/l;

    iget-object v11, v10, Lm2/l;->d:Ljava/lang/String;

    iget v10, v10, Lm2/l;->e:I

    :goto_a
    if-gt v0, v10, :cond_18

    const/high16 v12, 0x10000

    if-ge v10, v12, :cond_18

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v8

    sget-object v12, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v8, v12, :cond_12

    invoke-static {v11, v10}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    move-result-object v7

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_12
    sget-object v8, Ln2/b;->a:[B

    const-string v8, "<this>"

    invoke-static {v11, v8}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Ln2/b;->e:LX1/j;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v8, LX1/j;->c:Ljava/lang/Object;

    check-cast v8, Ljava/util/regex/Pattern;

    invoke-virtual {v8, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-static {v11}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v7

    invoke-static {v7}, Lv0/f;->B(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_b

    :cond_13
    iget-object v8, v4, Lm2/k;->g:Ljava/lang/Object;

    check-cast v8, Lm2/b;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v4, Lm2/k;->f:Ljava/lang/Object;

    check-cast v8, Lq2/i;

    const-string v12, "call"

    invoke-static {v8, v12}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v7, Lm2/a;->a:Lm2/b;

    invoke-virtual {v8, v11}, Lm2/b;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_17

    move-object v7, v8

    :goto_b
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/net/InetAddress;

    new-instance v11, Ljava/net/InetSocketAddress;

    invoke-direct {v11, v8, v10}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_14
    :goto_d
    iget-object v7, v4, Lm2/k;->i:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/net/InetSocketAddress;

    new-instance v9, Lm2/t;

    iget-object v10, v4, Lm2/k;->d:Ljava/lang/Object;

    check-cast v10, Lm2/a;

    invoke-direct {v9, v10, v6, v8}, Lm2/t;-><init>(Lm2/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    iget-object v8, v4, Lm2/k;->e:Ljava/lang/Object;

    check-cast v8, Lf/G;

    monitor-enter v8

    :try_start_1
    iget-object v10, v8, Lf/G;->b:Ljava/lang/Object;

    check-cast v10, Ljava/util/LinkedHashSet;

    invoke-interface {v10, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v8

    if-eqz v10, :cond_15

    iget-object v8, v4, Lm2/k;->c:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_15
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :catchall_1
    move-exception v0

    monitor-exit v8

    throw v0

    :cond_16
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v0

    if-eqz v6, :cond_c

    goto :goto_f

    :cond_17
    new-instance v0, Ljava/net/UnknownHostException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v7, Lm2/a;->a:Lm2/b;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " returned no addresses for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    new-instance v0, Ljava/net/SocketException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3a

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "; port is out of range"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    new-instance v0, Ljava/net/SocketException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v7, Lm2/a;->h:Lm2/l;

    iget-object v3, v3, Lm2/l;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; exhausted proxy configurations: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v4, Lm2/k;->h:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    :goto_f
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1b

    iget-object v6, v4, Lm2/k;->c:Ljava/util/ArrayList;

    invoke-static {v5, v6}, LL1/q;->T(Ljava/util/ArrayList;Ljava/util/List;)V

    iget-object v4, v4, Lm2/k;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    :cond_1b
    new-instance v4, LF0/e;

    invoke-direct {v4, v5}, LF0/e;-><init>(Ljava/util/ArrayList;)V

    iput-object v4, v1, Lq2/f;->e:LF0/e;

    iget-object v6, v1, Lq2/f;->c:Lq2/i;

    iget-boolean v6, v6, Lq2/i;->q:Z

    if-nez v6, :cond_21

    iget-object v6, v1, Lq2/f;->a:Lq2/m;

    iget-object v7, v1, Lq2/f;->b:Lm2/a;

    iget-object v8, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v6, v7, v8, v5, v2}, Lq2/m;->a(Lm2/a;Lq2/i;Ljava/util/ArrayList;Z)Z

    move-result v2

    if-eqz v2, :cond_1c

    iget-object v2, v1, Lq2/f;->c:Lq2/i;

    iget-object v2, v2, Lq2/i;->k:Lq2/l;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v3, v1, Lq2/f;->d:Lm2/b;

    iget-object v4, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "call"

    invoke-static {v4, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_1c
    invoke-virtual {v4}, LF0/e;->b()Z

    move-result v2

    if-eqz v2, :cond_20

    iget v2, v4, LF0/e;->b:I

    add-int/lit8 v6, v2, 0x1

    iput v6, v4, LF0/e;->b:I

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lm2/t;

    :goto_10
    new-instance v2, Lq2/l;

    iget-object v6, v1, Lq2/f;->a:Lq2/m;

    invoke-direct {v2, v6, v4}, Lq2/l;-><init>(Lq2/m;Lm2/t;)V

    iget-object v6, v1, Lq2/f;->c:Lq2/i;

    iput-object v2, v6, Lq2/i;->s:Lq2/l;

    :try_start_2
    iget-object v11, v1, Lq2/f;->c:Lq2/i;

    iget-object v12, v1, Lq2/f;->d:Lm2/b;

    move-object v6, v2

    move v7, p1

    move v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-virtual/range {v6 .. v12}, Lq2/l;->c(IIIZLq2/i;Lm2/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    iget-object v6, v1, Lq2/f;->c:Lq2/i;

    iput-object v3, v6, Lq2/i;->s:Lq2/l;

    iget-object v3, v1, Lq2/f;->c:Lq2/i;

    iget-object v3, v3, Lq2/i;->b:Lm2/o;

    iget-object v3, v3, Lm2/o;->z:Lf/G;

    monitor-enter v3

    :try_start_3
    iget-object v6, v3, Lf/G;->b:Ljava/lang/Object;

    check-cast v6, Ljava/util/LinkedHashSet;

    invoke-interface {v6, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    monitor-exit v3

    iget-object v3, v1, Lq2/f;->a:Lq2/m;

    iget-object v6, v1, Lq2/f;->b:Lm2/a;

    iget-object v7, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v3, v6, v7, v5, v0}, Lq2/m;->a(Lm2/a;Lq2/i;Ljava/util/ArrayList;Z)Z

    move-result v3

    if-eqz v3, :cond_1d

    iget-object v3, v1, Lq2/f;->c:Lq2/i;

    iget-object v3, v3, Lq2/i;->k:Lq2/l;

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    iput-object v4, v1, Lq2/f;->j:Lm2/t;

    iget-object v2, v2, Lq2/l;->d:Ljava/net/Socket;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-static {v2}, Ln2/b;->d(Ljava/net/Socket;)V

    iget-object v2, v1, Lq2/f;->d:Lm2/b;

    iget-object v4, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "call"

    invoke-static {v4, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v3

    goto/16 :goto_3

    :cond_1d
    monitor-enter v2

    :try_start_4
    iget-object v3, v1, Lq2/f;->a:Lq2/m;

    invoke-virtual {v3, v2}, Lq2/m;->c(Lq2/l;)V

    iget-object v3, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v3, v2}, Lq2/i;->a(Lq2/l;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v2

    iget-object v3, v1, Lq2/f;->d:Lm2/b;

    iget-object v4, v1, Lq2/f;->c:Lq2/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "call"

    invoke-static {v4, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_3

    :goto_11
    invoke-virtual {v2, v3}, Lq2/l;->i(Z)Z

    move-result v4

    if-eqz v4, :cond_1e

    return-object v2

    :cond_1e
    invoke-virtual {v2}, Lq2/l;->k()V

    iget-object v2, v1, Lq2/f;->j:Lm2/t;

    if-nez v2, :cond_0

    iget-object v2, v1, Lq2/f;->e:LF0/e;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LF0/e;->b()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Lq2/f;->f:Lm2/k;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lm2/k;->c()Z

    move-result v2

    if-eqz v2, :cond_1f

    goto/16 :goto_0

    :cond_1f
    new-instance v0, Ljava/io/IOException;

    const-string v2, "exhausted all routes"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    monitor-exit v2

    throw v0

    :catchall_3
    move-exception v0

    monitor-exit v3

    throw v0

    :catchall_4
    move-exception v0

    iget-object v2, v1, Lq2/f;->c:Lq2/i;

    iput-object v3, v2, Lq2/i;->s:Lq2/l;

    throw v0

    :cond_20
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_21
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_23
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lm2/l;)Z
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/f;->b:Lm2/a;

    iget-object v0, v0, Lm2/a;->h:Lm2/l;

    iget v1, v0, Lm2/l;->e:I

    iget v2, p1, Lm2/l;->e:I

    if-ne v2, v1, :cond_0

    iget-object p1, p1, Lm2/l;->d:Ljava/lang/String;

    iget-object v0, v0, Lm2/l;->d:Ljava/lang/String;

    invoke-static {p1, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lq2/f;->j:Lm2/t;

    instance-of v0, p1, Lt2/D;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lt2/D;

    const/16 v1, 0x8

    iget v0, v0, Lt2/D;->b:I

    if-ne v0, v1, :cond_0

    iget p1, p0, Lq2/f;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lq2/f;->g:I

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lt2/a;

    if-eqz p1, :cond_1

    iget p1, p0, Lq2/f;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lq2/f;->h:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lq2/f;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lq2/f;->i:I

    :goto_0
    return-void
.end method
