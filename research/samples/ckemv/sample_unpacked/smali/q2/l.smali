.class public final Lq2/l;
.super Lt2/h;
.source "SourceFile"


# instance fields
.field public final b:Lm2/t;

.field public c:Ljava/net/Socket;

.field public d:Ljava/net/Socket;

.field public e:Lm2/i;

.field public f:Lm2/p;

.field public g:Lt2/q;

.field public h:Lz2/p;

.field public i:Lz2/o;

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public final p:Ljava/util/ArrayList;

.field public q:J


# direct methods
.method public constructor <init>(Lq2/m;Lm2/t;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "route"

    invoke-static {p2, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq2/l;->b:Lm2/t;

    const/4 p1, 0x1

    iput p1, p0, Lq2/l;->o:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lq2/l;->p:Ljava/util/ArrayList;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lq2/l;->q:J

    return-void
.end method

.method public static d(Lm2/o;Lm2/t;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failedRoute"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failure"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lm2/t;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    iget-object v0, p1, Lm2/t;->a:Lm2/a;

    iget-object v1, v0, Lm2/a;->g:Ljava/net/ProxySelector;

    iget-object v0, v0, Lm2/a;->h:Lm2/l;

    invoke-virtual {v0}, Lm2/l;->f()Ljava/net/URI;

    move-result-object v0

    iget-object v2, p1, Lm2/t;->b:Ljava/net/Proxy;

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_0
    iget-object p0, p0, Lm2/o;->z:Lf/G;

    monitor-enter p0

    :try_start_0
    iget-object p2, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/LinkedHashSet;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized a(Lt2/q;Lt2/C;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "connection"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p2, Lt2/C;->a:I

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_0

    iget-object p1, p2, Lt2/C;->b:[I

    const/4 p2, 0x4

    aget p1, p1, p2

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    :goto_0
    iput p1, p0, Lq2/l;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(Lt2/y;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lt2/y;->c(ILjava/io/IOException;)V

    return-void
.end method

.method public final c(IIIZLq2/i;Lm2/b;)V
    .locals 15

    move-object v7, p0

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    const-string v10, "proxy"

    const-string v11, "inetSocketAddress"

    const-string v0, "call"

    invoke-static {v8, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {v9, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, Lq2/l;->f:Lm2/p;

    if-nez v0, :cond_d

    iget-object v0, v7, Lq2/l;->b:Lm2/t;

    iget-object v0, v0, Lm2/t;->a:Lm2/a;

    iget-object v0, v0, Lm2/a;->j:Ljava/util/List;

    new-instance v12, Lq2/b;

    invoke-direct {v12, v0}, Lq2/b;-><init>(Ljava/util/List;)V

    iget-object v1, v7, Lq2/l;->b:Lm2/t;

    iget-object v1, v1, Lm2/t;->a:Lm2/a;

    iget-object v2, v1, Lm2/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v2, :cond_2

    sget-object v1, Lm2/g;->f:Lm2/g;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v7, Lq2/l;->b:Lm2/t;

    iget-object v0, v0, Lm2/t;->a:Lm2/a;

    iget-object v0, v0, Lm2/a;->h:Lm2/l;

    iget-object v0, v0, Lm2/l;->d:Ljava/lang/String;

    sget-object v1, Lu2/n;->a:Lu2/n;

    sget-object v1, Lu2/n;->a:Lu2/n;

    invoke-virtual {v1, v0}, Lu2/n;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lq2/n;

    new-instance v2, Ljava/net/UnknownServiceException;

    const-string v3, "CLEARTEXT communication to "

    const-string v4, " not permitted by network security policy"

    invoke-static {v3, v0, v4}, LX/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lq2/n;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_1
    new-instance v0, Lq2/n;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lq2/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_2
    iget-object v0, v1, Lm2/a;->i:Ljava/util/List;

    sget-object v1, Lm2/p;->g:Lm2/p;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :goto_0
    const/4 v13, 0x0

    move-object v14, v13

    :goto_1
    :try_start_0
    iget-object v0, v7, Lq2/l;->b:Lm2/t;

    iget-object v1, v0, Lm2/t;->a:Lm2/a;

    iget-object v1, v1, Lm2/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_4

    iget-object v0, v0, Lm2/t;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_4

    move-object v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v6}, Lq2/l;->f(IIILq2/i;Lm2/b;)V

    iget-object v0, v7, Lq2/l;->c:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_2

    :catch_0
    move-exception v0

    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_5

    :cond_4
    move/from16 v1, p1

    move/from16 v2, p2

    :try_start_1
    invoke-virtual {p0, v1, v2, v8, v9}, Lq2/l;->e(IILq2/i;Lm2/b;)V

    :goto_2
    invoke-virtual {p0, v12, v8, v9}, Lq2/l;->g(Lq2/b;Lq2/i;Lm2/b;)V

    iget-object v0, v7, Lq2/l;->b:Lm2/t;

    iget-object v3, v0, Lm2/t;->c:Ljava/net/InetSocketAddress;

    iget-object v0, v0, Lm2/t;->b:Ljava/net/Proxy;

    invoke-static {v3, v11}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v10}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    iget-object v0, v7, Lq2/l;->b:Lm2/t;

    iget-object v1, v0, Lm2/t;->a:Lm2/a;

    iget-object v1, v1, Lm2/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_6

    iget-object v0, v0, Lm2/t;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_6

    iget-object v0, v7, Lq2/l;->c:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    new-instance v0, Lq2/n;

    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Too many tunnel connections attempted: 21"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lq2/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_6
    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v7, Lq2/l;->q:J

    return-void

    :catch_1
    move-exception v0

    :goto_5
    iget-object v3, v7, Lq2/l;->d:Ljava/net/Socket;

    if-eqz v3, :cond_7

    invoke-static {v3}, Ln2/b;->d(Ljava/net/Socket;)V

    :cond_7
    iget-object v3, v7, Lq2/l;->c:Ljava/net/Socket;

    if-eqz v3, :cond_8

    invoke-static {v3}, Ln2/b;->d(Ljava/net/Socket;)V

    :cond_8
    iput-object v13, v7, Lq2/l;->d:Ljava/net/Socket;

    iput-object v13, v7, Lq2/l;->c:Ljava/net/Socket;

    iput-object v13, v7, Lq2/l;->h:Lz2/p;

    iput-object v13, v7, Lq2/l;->i:Lz2/o;

    iput-object v13, v7, Lq2/l;->e:Lm2/i;

    iput-object v13, v7, Lq2/l;->f:Lm2/p;

    iput-object v13, v7, Lq2/l;->g:Lt2/q;

    const/4 v3, 0x1

    iput v3, v7, Lq2/l;->o:I

    iget-object v4, v7, Lq2/l;->b:Lm2/t;

    iget-object v5, v4, Lm2/t;->c:Ljava/net/InetSocketAddress;

    iget-object v4, v4, Lm2/t;->b:Ljava/net/Proxy;

    invoke-static {v5, v11}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v10}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v14, :cond_9

    new-instance v14, Lq2/n;

    invoke-direct {v14, v0}, Lq2/n;-><init>(Ljava/io/IOException;)V

    goto :goto_6

    :cond_9
    iget-object v4, v14, Lq2/n;->b:Ljava/io/IOException;

    invoke-static {v4, v0}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iput-object v0, v14, Lq2/n;->c:Ljava/io/IOException;

    :goto_6
    if-eqz p4, :cond_b

    iput-boolean v3, v12, Lq2/b;->d:Z

    iget-boolean v3, v12, Lq2/b;->c:Z

    if-eqz v3, :cond_b

    instance-of v3, v0, Ljava/net/ProtocolException;

    if-nez v3, :cond_b

    instance-of v3, v0, Ljava/io/InterruptedIOException;

    if-nez v3, :cond_b

    instance-of v3, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v3, v3, Ljava/security/cert/CertificateException;

    if-nez v3, :cond_b

    :cond_a
    instance-of v3, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-nez v3, :cond_b

    instance-of v0, v0, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_b

    goto/16 :goto_1

    :cond_b
    throw v14

    :cond_c
    new-instance v0, Lq2/n;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lq2/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(IILq2/i;Lm2/b;)V
    .locals 4

    iget-object v0, p0, Lq2/l;->b:Lm2/t;

    iget-object v1, v0, Lm2/t;->b:Ljava/net/Proxy;

    iget-object v0, v0, Lm2/t;->a:Lm2/a;

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    :cond_0
    sget-object v3, Lq2/j;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lm2/a;->b:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    :goto_1
    iput-object v0, p0, Lq2/l;->c:Ljava/net/Socket;

    iget-object v1, p0, Lq2/l;->b:Lm2/t;

    iget-object v1, v1, Lm2/t;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p4, "call"

    invoke-static {p3, p4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "inetSocketAddress"

    invoke-static {v1, p3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    sget-object p2, Lu2/n;->a:Lu2/n;

    sget-object p2, Lu2/n;->a:Lu2/n;

    iget-object p3, p0, Lq2/l;->b:Lm2/t;

    iget-object p3, p3, Lm2/t;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p2, v0, p3, p1}, Lu2/n;->e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v0}, Lm0/z;->l0(Ljava/net/Socket;)Lz2/d;

    move-result-object p1

    new-instance p2, Lz2/p;

    invoke-direct {p2, p1}, Lz2/p;-><init>(Lz2/v;)V

    iput-object p2, p0, Lq2/l;->h:Lz2/p;

    invoke-static {v0}, Lm0/z;->j0(Ljava/net/Socket;)Lz2/c;

    move-result-object p1

    new-instance p2, Lz2/o;

    invoke-direct {p2, p1}, Lz2/o;-><init>(Lz2/t;)V

    iput-object p2, p0, Lq2/l;->i:Lz2/o;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-static {p2, p3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed to connect to "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, Lq2/l;->b:Lm2/t;

    iget-object p4, p4, Lm2/t;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method public final f(IIILq2/i;Lm2/b;)V
    .locals 14

    move-object v0, p0

    move/from16 v1, p2

    new-instance v2, LG/e;

    invoke-direct {v2}, LG/e;-><init>()V

    iget-object v3, v0, Lq2/l;->b:Lm2/t;

    iget-object v4, v3, Lm2/t;->a:Lm2/a;

    iget-object v4, v4, Lm2/a;->h:Lm2/l;

    const-string v5, "url"

    invoke-static {v4, v5}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v2, LG/e;->c:Ljava/lang/Object;

    const-string v4, "CONNECT"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, LG/e;->j(Ljava/lang/String;LX0/o;)V

    iget-object v3, v3, Lm2/t;->a:Lm2/a;

    iget-object v4, v3, Lm2/a;->h:Lm2/l;

    const/4 v6, 0x1

    invoke-static {v4, v6}, Ln2/b;->u(Lm2/l;Z)Ljava/lang/String;

    move-result-object v4

    const-string v7, "Host"

    invoke-virtual {v2, v7, v4}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Proxy-Connection"

    const-string v7, "Keep-Alive"

    invoke-virtual {v2, v4, v7}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "User-Agent"

    const-string v7, "okhttp/4.12.0"

    invoke-virtual {v2, v4, v7}, LG/e;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, LG/e;->a()Lk/s;

    move-result-object v2

    new-instance v4, Lm2/q;

    invoke-direct {v4}, Lm2/q;-><init>()V

    iput-object v2, v4, Lm2/q;->a:Lk/s;

    sget-object v7, Lm2/p;->d:Lm2/p;

    iput-object v7, v4, Lm2/q;->b:Lm2/p;

    const/16 v7, 0x197

    iput v7, v4, Lm2/q;->c:I

    const-string v8, "Preemptive Authenticate"

    iput-object v8, v4, Lm2/q;->d:Ljava/lang/String;

    sget-object v8, Ln2/b;->c:Lm2/s;

    iput-object v8, v4, Lm2/q;->g:Lm2/s;

    const-wide/16 v8, -0x1

    iput-wide v8, v4, Lm2/q;->k:J

    iput-wide v8, v4, Lm2/q;->l:J

    iget-object v10, v4, Lm2/q;->f:Lf/G;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "Proxy-Authenticate"

    invoke-static {v11}, Lu2/d;->c(Ljava/lang/String;)V

    const-string v12, "OkHttp-Preemptive"

    invoke-static {v12, v11}, Lu2/d;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Lf/G;->q(Ljava/lang/String;)V

    invoke-virtual {v10, v11, v12}, Lf/G;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lm2/q;->a()Lm2/r;

    iget-object v4, v3, Lm2/a;->f:Lm2/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v4, p1

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-virtual {p0, p1, v1, v10, v11}, Lq2/l;->e(IILq2/i;Lm2/b;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v10, "CONNECT "

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v2, Lk/s;->b:Ljava/lang/Object;

    check-cast v10, Lm2/l;

    invoke-static {v10, v6}, Ln2/b;->u(Lm2/l;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " HTTP/1.1"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v6, v0, Lq2/l;->h:Lz2/p;

    invoke-static {v6}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v10, v0, Lq2/l;->i:Lz2/o;

    invoke-static {v10}, LX1/g;->b(Ljava/lang/Object;)V

    new-instance v11, Ls2/g;

    invoke-direct {v11, v5, p0, v6, v10}, Ls2/g;-><init>(Lm2/o;Lq2/l;Lz2/h;Lz2/g;)V

    iget-object v5, v6, Lz2/p;->b:Lz2/v;

    invoke-interface {v5}, Lz2/v;->c()Lz2/x;

    move-result-object v5

    int-to-long v12, v1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v12, v13, v1}, Lz2/x;->g(JLjava/util/concurrent/TimeUnit;)Lz2/x;

    iget-object v5, v10, Lz2/o;->b:Lz2/t;

    invoke-interface {v5}, Lz2/t;->c()Lz2/x;

    move-result-object v5

    move/from16 v12, p3

    int-to-long v12, v12

    invoke-virtual {v5, v12, v13, v1}, Lz2/x;->g(JLjava/util/concurrent/TimeUnit;)Lz2/x;

    iget-object v5, v2, Lk/s;->d:Ljava/lang/Object;

    check-cast v5, Lm2/j;

    invoke-virtual {v11, v5, v4}, Ls2/g;->j(Lm2/j;Ljava/lang/String;)V

    invoke-virtual {v11}, Ls2/g;->d()V

    const/4 v4, 0x0

    invoke-virtual {v11, v4}, Ls2/g;->f(Z)Lm2/q;

    move-result-object v4

    invoke-static {v4}, LX1/g;->b(Ljava/lang/Object;)V

    iput-object v2, v4, Lm2/q;->a:Lk/s;

    invoke-virtual {v4}, Lm2/q;->a()Lm2/r;

    move-result-object v2

    invoke-static {v2}, Ln2/b;->j(Lm2/r;)J

    move-result-wide v4

    cmp-long v8, v4, v8

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v4, v5}, Ls2/g;->i(J)Ls2/d;

    move-result-object v4

    const v5, 0x7fffffff

    invoke-static {v4, v5, v1}, Ln2/b;->s(Lz2/v;ILjava/util/concurrent/TimeUnit;)Z

    invoke-virtual {v4}, Ls2/d;->close()V

    :goto_0
    const/16 v1, 0xc8

    iget v2, v2, Lm2/r;->e:I

    if-eq v2, v1, :cond_2

    if-ne v2, v7, :cond_1

    iget-object v1, v3, Lm2/a;->f:Lm2/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to authenticate with proxy"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Unexpected response code for CONNECT: "

    invoke-static {v3, v2}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v6, Lz2/p;->c:Lz2/f;

    invoke-virtual {v1}, Lz2/f;->v()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v10, Lz2/o;->c:Lz2/f;

    invoke-virtual {v1}, Lz2/f;->v()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TLS tunnel buffered too many bytes!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final g(Lq2/b;Lq2/i;Lm2/b;)V
    .locals 9

    iget-object v0, p0, Lq2/l;->b:Lm2/t;

    iget-object v0, v0, Lm2/t;->a:Lm2/a;

    iget-object v1, v0, Lm2/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v2, Lm2/p;->d:Lm2/p;

    if-nez v1, :cond_1

    iget-object p1, v0, Lm2/a;->i:Ljava/util/List;

    sget-object p2, Lm2/p;->g:Lm2/p;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq2/l;->c:Ljava/net/Socket;

    iput-object p1, p0, Lq2/l;->d:Ljava/net/Socket;

    iput-object p2, p0, Lq2/l;->f:Lm2/p;

    invoke-virtual {p0}, Lq2/l;->l()V

    return-void

    :cond_0
    iget-object p1, p0, Lq2/l;->c:Ljava/net/Socket;

    iput-object p1, p0, Lq2/l;->d:Ljava/net/Socket;

    iput-object v2, p0, Lq2/l;->f:Lm2/p;

    return-void

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "call"

    invoke-static {p2, p3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "Hostname "

    const-string p3, "\n              |Hostname "

    iget-object v0, p0, Lq2/l;->b:Lm2/t;

    iget-object v0, v0, Lm2/t;->a:Lm2/a;

    iget-object v1, v0, Lm2/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v4, p0, Lq2/l;->c:Ljava/net/Socket;

    iget-object v5, v0, Lm2/a;->h:Lm2/l;

    iget-object v6, v5, Lm2/l;->d:Ljava/lang/String;

    iget v5, v5, Lm2/l;->e:I

    const/4 v7, 0x1

    invoke-virtual {v1, v4, v6, v5, v7}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-static {v1, v4}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v1}, Lq2/b;->a(Ljavax/net/ssl/SSLSocket;)Lm2/g;

    move-result-object p1

    iget-boolean v4, p1, Lm2/g;->b:Z

    if-eqz v4, :cond_2

    sget-object v4, Lu2/n;->a:Lu2/n;

    sget-object v4, Lu2/n;->a:Lu2/n;

    iget-object v5, v0, Lm2/a;->h:Lm2/l;

    iget-object v5, v5, Lm2/l;->d:Ljava/lang/String;

    iget-object v6, v0, Lm2/a;->i:Ljava/util/List;

    invoke-virtual {v4, v1, v5, v6}, Lu2/n;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v3, v1

    goto/16 :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v4

    const-string v5, "sslSocketSession"

    invoke-static {v4, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lm0/z;->x(Ljavax/net/ssl/SSLSession;)Lm2/i;

    move-result-object v5

    iget-object v6, v0, Lm2/a;->d:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v6}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v8, v0, Lm2/a;->h:Lm2/l;

    iget-object v8, v8, Lm2/l;->d:Ljava/lang/String;

    invoke-interface {v6, v8, v4}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v5}, Lm2/i;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v7

    if-eqz v2, :cond_3

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p1, p2}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, v0, Lm2/a;->h:Lm2/l;

    iget-object p3, p3, Lm2/l;->d:Ljava/lang/String;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " not verified:\n              |    certificate: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Lm2/d;->c:Lm2/d;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "sha256/"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lz2/i;->e:Lz2/i;

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    const-string v3, "publicKey.encoded"

    invoke-static {v0, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld1/e;->l([B)Lz2/i;

    move-result-object v0

    const-string v3, "SHA-256"

    invoke-virtual {v0, v3}, Lz2/i;->b(Ljava/lang/String;)Lz2/i;

    move-result-object v0

    invoke-virtual {v0}, Lz2/i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n              |    DN: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object p3

    invoke-interface {p3}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n              |    subjectAltNames: "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p3, 0x7

    invoke-static {p1, p3}, Ly2/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p3

    const/4 v0, 0x2

    invoke-static {p1, v0}, Ly2/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v4

    add-int/2addr v4, v3

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n              "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ld2/e;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, v0, Lm2/a;->h:Lm2/l;

    iget-object p2, p2, Lm2/l;->d:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not verified (no certificates)"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object p2, v0, Lm2/a;->e:Lm2/d;

    invoke-static {p2}, LX1/g;->b(Ljava/lang/Object;)V

    new-instance p3, Lm2/i;

    iget-object v4, v5, Lm2/i;->a:Lm2/u;

    iget-object v6, v5, Lm2/i;->b:Lm2/f;

    iget-object v7, v5, Lm2/i;->c:Ljava/util/List;

    new-instance v8, Lq2/k;

    invoke-direct {v8, p2, v5, v0}, Lq2/k;-><init>(Lm2/d;Lm2/i;Lm2/a;)V

    invoke-direct {p3, v4, v6, v7, v8}, Lm2/i;-><init>(Lm2/u;Lm2/f;Ljava/util/List;LW1/a;)V

    iput-object p3, p0, Lq2/l;->e:Lm2/i;

    iget-object p3, v0, Lm2/a;->h:Lm2/l;

    iget-object p3, p3, Lm2/l;->d:Ljava/lang/String;

    const-string v0, "hostname"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p2, Lm2/d;->a:Ljava/util/Set;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-nez p3, :cond_8

    iget-boolean p1, p1, Lm2/g;->b:Z

    if-eqz p1, :cond_5

    sget-object p1, Lu2/n;->a:Lu2/n;

    sget-object p1, Lu2/n;->a:Lu2/n;

    invoke-virtual {p1, v1}, Lu2/n;->f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v3

    :cond_5
    iput-object v1, p0, Lq2/l;->d:Ljava/net/Socket;

    invoke-static {v1}, Lm0/z;->l0(Ljava/net/Socket;)Lz2/d;

    move-result-object p1

    new-instance p2, Lz2/p;

    invoke-direct {p2, p1}, Lz2/p;-><init>(Lz2/v;)V

    iput-object p2, p0, Lq2/l;->h:Lz2/p;

    invoke-static {v1}, Lm0/z;->j0(Ljava/net/Socket;)Lz2/c;

    move-result-object p1

    new-instance p2, Lz2/o;

    invoke-direct {p2, p1}, Lz2/o;-><init>(Lz2/t;)V

    iput-object p2, p0, Lq2/l;->i:Lz2/o;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lv0/f;->v(Ljava/lang/String;)Lm2/p;

    move-result-object v2

    :cond_6
    iput-object v2, p0, Lq2/l;->f:Lm2/p;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lu2/n;->a:Lu2/n;

    sget-object p1, Lu2/n;->a:Lu2/n;

    invoke-virtual {p1, v1}, Lu2/n;->a(Ljavax/net/ssl/SSLSocket;)V

    iget-object p1, p0, Lq2/l;->f:Lm2/p;

    sget-object p2, Lm2/p;->f:Lm2/p;

    if-ne p1, p2, :cond_7

    invoke-virtual {p0}, Lq2/l;->l()V

    :cond_7
    return-void

    :cond_8
    :try_start_2
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_1
    move-exception p1

    :goto_1
    if-eqz v3, :cond_9

    sget-object p2, Lu2/n;->a:Lu2/n;

    sget-object p2, Lu2/n;->a:Lu2/n;

    invoke-virtual {p2, v3}, Lu2/n;->a(Ljavax/net/ssl/SSLSocket;)V

    :cond_9
    if-eqz v3, :cond_a

    invoke-static {v3}, Ln2/b;->d(Ljava/net/Socket;)V

    :cond_a
    throw p1
.end method

.method public final h(Lm2/a;Ljava/util/ArrayList;)Z
    .locals 9

    const-string v0, "hostname"

    const-string v1, "address"

    invoke-static {p1, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ln2/b;->a:[B

    iget-object v1, p0, Lq2/l;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, p0, Lq2/l;->o:I

    const/4 v3, 0x0

    if-ge v1, v2, :cond_a

    iget-boolean v1, p0, Lq2/l;->j:Z

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, Lq2/l;->b:Lm2/t;

    iget-object v2, v1, Lm2/t;->a:Lm2/a;

    invoke-virtual {v2, p1}, Lm2/a;->a(Lm2/a;)Z

    move-result v2

    if-nez v2, :cond_1

    return v3

    :cond_1
    iget-object v2, p1, Lm2/a;->h:Lm2/l;

    iget-object v4, v2, Lm2/l;->d:Ljava/lang/String;

    iget-object v5, v1, Lm2/t;->a:Lm2/a;

    iget-object v6, v5, Lm2/a;->h:Lm2/l;

    iget-object v6, v6, Lm2/l;->d:Ljava/lang/String;

    invoke-static {v4, v6}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    return v6

    :cond_2
    iget-object v4, p0, Lq2/l;->g:Lt2/q;

    if-nez v4, :cond_3

    return v3

    :cond_3
    if-eqz p2, :cond_a

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_1

    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm2/t;

    iget-object v7, v4, Lm2/t;->b:Ljava/net/Proxy;

    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v7

    sget-object v8, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v7, v8, :cond_5

    iget-object v7, v1, Lm2/t;->b:Ljava/net/Proxy;

    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v7

    if-ne v7, v8, :cond_5

    iget-object v4, v4, Lm2/t;->c:Ljava/net/InetSocketAddress;

    iget-object v7, v1, Lm2/t;->c:Ljava/net/InetSocketAddress;

    invoke-static {v7, v4}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object p2, Ly2/c;->a:Ly2/c;

    iget-object v1, p1, Lm2/a;->d:Ljavax/net/ssl/HostnameVerifier;

    if-eq v1, p2, :cond_6

    return v3

    :cond_6
    sget-object p2, Ln2/b;->a:[B

    iget-object p2, v5, Lm2/a;->h:Lm2/l;

    iget v1, p2, Lm2/l;->e:I

    iget v4, v2, Lm2/l;->e:I

    if-eq v4, v1, :cond_7

    goto :goto_1

    :cond_7
    iget-object p2, p2, Lm2/l;->d:Ljava/lang/String;

    iget-object v1, v2, Lm2/l;->d:Ljava/lang/String;

    invoke-static {v1, p2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_0

    :cond_8
    iget-boolean p2, p0, Lq2/l;->k:Z

    if-nez p2, :cond_a

    iget-object p2, p0, Lq2/l;->e:Lm2/i;

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lm2/i;->a()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v6

    if-eqz v2, :cond_a

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p2, v2}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-static {v1, p2}, Ly2/c;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p2

    if-eqz p2, :cond_a

    :goto_0
    :try_start_0
    iget-object p1, p1, Lm2/a;->e:Lm2/d;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lq2/l;->e:Lm2/i;

    invoke-static {p2}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lm2/i;->a()Ljava/util/List;

    move-result-object p2

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerCertificates"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lm2/d;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_9

    return v6

    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_a
    :goto_1
    return v3
.end method

.method public final i(Z)Z
    .locals 9

    sget-object v0, Ln2/b;->a:[B

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lq2/l;->c:Ljava/net/Socket;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Lq2/l;->d:Ljava/net/Socket;

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v4, p0, Lq2/l;->h:Lz2/p;

    invoke-static {v4}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    :cond_0
    iget-object v2, p0, Lq2/l;->g:Lt2/q;

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    monitor-enter v2

    :try_start_0
    iget-boolean p1, v2, Lt2/q;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit v2

    goto :goto_0

    :cond_1
    :try_start_1
    iget-wide v3, v2, Lt2/q;->q:J

    iget-wide v7, v2, Lt2/q;->p:J

    cmp-long p1, v3, v7

    if-gez p1, :cond_2

    iget-wide v3, v2, Lt2/q;->r:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, v0, v3

    if-ltz p1, :cond_2

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    monitor-exit v2

    move v5, v6

    :goto_0
    return v5

    :goto_1
    monitor-exit v2

    throw p1

    :cond_3
    monitor-enter p0

    :try_start_2
    iget-wide v7, p0, Lq2/l;->q:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    sub-long/2addr v0, v7

    monitor-exit p0

    const-wide v7, 0x2540be400L

    cmp-long v0, v0, v7

    if-ltz v0, :cond_4

    if-eqz p1, :cond_4

    :try_start_3
    invoke-virtual {v3}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    invoke-virtual {v3, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {v4}, Lz2/p;->v()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    xor-int/2addr v0, v6

    :try_start_5
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    move v5, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v0
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_0
    move v5, v6

    :catch_1
    :goto_2
    return v5

    :cond_4
    return v6

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_5
    :goto_3
    return v5
.end method

.method public final j(Lm2/o;Lr2/f;)Lr2/d;
    .locals 6

    iget-object v0, p0, Lq2/l;->d:Ljava/net/Socket;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lq2/l;->h:Lz2/p;

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lq2/l;->i:Lz2/o;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Lq2/l;->g:Lt2/q;

    if-eqz v3, :cond_0

    new-instance v0, Lt2/r;

    invoke-direct {v0, p1, p0, p2, v3}, Lt2/r;-><init>(Lm2/o;Lq2/l;Lr2/f;Lt2/q;)V

    goto :goto_0

    :cond_0
    iget v3, p2, Lr2/f;->g:I

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v0, v1, Lz2/p;->b:Lz2/v;

    invoke-interface {v0}, Lz2/v;->c()Lz2/x;

    move-result-object v0

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Lz2/x;->g(JLjava/util/concurrent/TimeUnit;)Lz2/x;

    iget-object v0, v2, Lz2/o;->b:Lz2/t;

    invoke-interface {v0}, Lz2/t;->c()Lz2/x;

    move-result-object v0

    iget p2, p2, Lr2/f;->h:I

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4, v5}, Lz2/x;->g(JLjava/util/concurrent/TimeUnit;)Lz2/x;

    new-instance v0, Ls2/g;

    invoke-direct {v0, p1, p0, v1, v2}, Ls2/g;-><init>(Lm2/o;Lq2/l;Lz2/h;Lz2/g;)V

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized k()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lq2/l;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final l()V
    .locals 9

    iget-object v0, p0, Lq2/l;->d:Ljava/net/Socket;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lq2/l;->h:Lz2/p;

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lq2/l;->i:Lz2/o;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v4, Ls2/g;

    sget-object v5, Lp2/d;->h:Lp2/d;

    invoke-direct {v4, v5}, Ls2/g;-><init>(Lp2/d;)V

    iget-object v6, p0, Lq2/l;->b:Lm2/t;

    iget-object v6, v6, Lm2/t;->a:Lm2/a;

    iget-object v6, v6, Lm2/a;->h:Lm2/l;

    iget-object v6, v6, Lm2/l;->d:Ljava/lang/String;

    const-string v7, "peerName"

    invoke-static {v6, v7}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v4, Ls2/g;->e:Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Ln2/b;->f:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v6, "<set-?>"

    invoke-static {v0, v6}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v4, Ls2/g;->f:Ljava/lang/Object;

    iput-object v1, v4, Ls2/g;->a:Lz2/h;

    iput-object v2, v4, Ls2/g;->b:Lz2/g;

    iput-object p0, v4, Ls2/g;->g:Ljava/lang/Object;

    iput v3, v4, Ls2/g;->c:I

    new-instance v0, Lt2/q;

    invoke-direct {v0, v4}, Lt2/q;-><init>(Ls2/g;)V

    iput-object v0, p0, Lq2/l;->g:Lt2/q;

    sget-object v1, Lt2/q;->C:Lt2/C;

    iget v2, v1, Lt2/C;->a:I

    and-int/lit8 v2, v2, 0x10

    const/4 v4, 0x4

    if-eqz v2, :cond_0

    iget-object v1, v1, Lt2/C;->b:[I

    aget v1, v1, v4

    goto :goto_0

    :cond_0
    const v1, 0x7fffffff

    :goto_0
    iput v1, p0, Lq2/l;->o:I

    iget-object v1, v0, Lt2/q;->z:Lt2/z;

    const-string v2, ">> CONNECTION "

    monitor-enter v1

    :try_start_0
    iget-boolean v6, v1, Lt2/z;->f:Z

    if-nez v6, :cond_9

    iget-boolean v6, v1, Lt2/z;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_1

    monitor-exit v1

    goto :goto_2

    :cond_1
    :try_start_1
    sget-object v6, Lt2/z;->h:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v6, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lt2/f;->a:Lz2/i;

    invoke-virtual {v2}, Lz2/i;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v7}, Ln2/b;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_2
    :goto_1
    iget-object v2, v1, Lt2/z;->b:Lz2/g;

    sget-object v6, Lt2/f;->a:Lz2/i;

    invoke-interface {v2, v6}, Lz2/g;->F(Lz2/i;)Lz2/g;

    iget-object v2, v1, Lt2/z;->b:Lz2/g;

    invoke-interface {v2}, Lz2/g;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    :goto_2
    iget-object v1, v0, Lt2/q;->z:Lt2/z;

    iget-object v2, v0, Lt2/q;->s:Lt2/C;

    monitor-enter v1

    :try_start_2
    const-string v6, "settings"

    invoke-static {v2, v6}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v6, v1, Lt2/z;->f:Z

    if-nez v6, :cond_8

    iget v6, v2, Lt2/C;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    move-result v6

    mul-int/lit8 v6, v6, 0x6

    invoke-virtual {v1, v3, v6, v4, v3}, Lt2/z;->i(IIII)V

    move v6, v3

    :goto_3
    const/16 v7, 0xa

    if-ge v6, v7, :cond_6

    const/4 v7, 0x1

    shl-int/2addr v7, v6

    iget v8, v2, Lt2/C;->a:I

    and-int/2addr v7, v8

    if-eqz v7, :cond_5

    if-eq v6, v4, :cond_4

    const/4 v7, 0x7

    if-eq v6, v7, :cond_3

    move v7, v6

    goto :goto_4

    :cond_3
    move v7, v4

    goto :goto_4

    :cond_4
    const/4 v7, 0x3

    :goto_4
    iget-object v8, v1, Lt2/z;->b:Lz2/g;

    invoke-interface {v8, v7}, Lz2/g;->B(I)Lz2/g;

    iget-object v7, v1, Lt2/z;->b:Lz2/g;

    iget-object v8, v2, Lt2/C;->b:[I

    aget v8, v8, v6

    invoke-interface {v7, v8}, Lz2/g;->e(I)Lz2/g;

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_5
    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    iget-object v2, v1, Lt2/z;->b:Lz2/g;

    invoke-interface {v2}, Lz2/g;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    iget-object v1, v0, Lt2/q;->s:Lt2/C;

    invoke-virtual {v1}, Lt2/C;->a()I

    move-result v1

    const v2, 0xffff

    if-eq v1, v2, :cond_7

    iget-object v4, v0, Lt2/q;->z:Lt2/z;

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v4, v3, v1, v2}, Lt2/z;->G(IJ)V

    :cond_7
    invoke-virtual {v5}, Lp2/d;->f()Lp2/c;

    move-result-object v1

    iget-object v2, v0, Lt2/q;->e:Ljava/lang/String;

    iget-object v0, v0, Lt2/q;->A:Lt2/l;

    new-instance v3, Lp2/b;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v0, v4}, Lp2/b;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v3, v4, v5}, Lp2/c;->c(Lp2/a;J)V

    return-void

    :cond_8
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_6
    monitor-exit v1

    throw v0

    :cond_9
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_7
    monitor-exit v1

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connection{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq2/l;->b:Lm2/t;

    iget-object v2, v1, Lm2/t;->a:Lm2/a;

    iget-object v2, v2, Lm2/a;->h:Lm2/l;

    iget-object v2, v2, Lm2/l;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lm2/t;->a:Lm2/a;

    iget-object v2, v2, Lm2/a;->h:Lm2/l;

    iget v2, v2, Lm2/l;->e:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", proxy="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lm2/t;->b:Ljava/net/Proxy;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " hostAddress="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lm2/t;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq2/l;->e:Lm2/i;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lm2/i;->b:Lm2/f;

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "none"

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq2/l;->f:Lm2/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
