.class public final Ls2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr2/d;


# instance fields
.field public a:Lz2/h;

.field public b:Lz2/g;

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm2/o;Lq2/l;Lz2/h;Lz2/g;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls2/g;->d:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Ls2/g;->e:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Ls2/g;->a:Lz2/h;

    .line 5
    iput-object p4, p0, Ls2/g;->b:Lz2/g;

    .line 6
    new-instance p1, LZ/b;

    invoke-direct {p1, p3}, LZ/b;-><init>(Lz2/h;)V

    iput-object p1, p0, Ls2/g;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp2/d;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Ls2/g;->d:Ljava/lang/Object;

    .line 9
    sget-object p1, Lt2/h;->a:Lt2/g;

    iput-object p1, p0, Ls2/g;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lm2/r;)Lz2/v;
    .locals 8

    invoke-static {p1}, Lr2/e;->a(Lm2/r;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ls2/g;->i(J)Ls2/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-static {v0, p1}, Lm2/r;->a(Ljava/lang/String;Lm2/r;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-static {v1, v0}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const-string v1, "state: "

    const/4 v2, 0x5

    const/4 v3, 0x4

    if-eqz v0, :cond_2

    iget-object p1, p1, Lm2/r;->b:Lk/s;

    iget-object p1, p1, Lk/s;->b:Ljava/lang/Object;

    check-cast p1, Lm2/l;

    iget v0, p0, Ls2/g;->c:I

    if-ne v0, v3, :cond_1

    iput v2, p0, Ls2/g;->c:I

    new-instance v0, Ls2/c;

    invoke-direct {v0, p0, p1}, Ls2/c;-><init>(Ls2/g;Lm2/l;)V

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Ls2/g;->c:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {p1}, Ln2/b;->j(Lm2/r;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long p1, v4, v6

    if-eqz p1, :cond_3

    invoke-virtual {p0, v4, v5}, Ls2/g;->i(J)Ls2/d;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget p1, p0, Ls2/g;->c:I

    if-ne p1, v3, :cond_4

    iput v2, p0, Ls2/g;->c:I

    iget-object p1, p0, Ls2/g;->e:Ljava/lang/Object;

    check-cast p1, Lq2/l;

    invoke-virtual {p1}, Lq2/l;->k()V

    new-instance p1, Ls2/f;

    invoke-direct {p1, p0}, Ls2/a;-><init>(Ls2/g;)V

    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Ls2/g;->c:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lk/s;)V
    .locals 4

    iget-object v0, p0, Ls2/g;->e:Ljava/lang/Object;

    check-cast v0, Lq2/l;

    iget-object v0, v0, Lq2/l;->b:Lm2/t;

    iget-object v0, v0, Lm2/t;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    const-string v1, "connection.route().proxy.type()"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Lk/s;->c:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lk/s;->b:Ljava/lang/Object;

    check-cast v2, Lm2/l;

    iget-boolean v3, v2, Lm2/l;->i:Z

    if-nez v3, :cond_0

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lm2/l;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lm2/l;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3f

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v0, " HTTP/1.1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lk/s;->d:Ljava/lang/Object;

    check-cast p1, Lm2/j;

    invoke-virtual {p0, p1, v0}, Ls2/g;->j(Lm2/j;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lm2/r;)J
    .locals 2

    invoke-static {p1}, Lr2/e;->a(Lm2/r;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-static {v0, p1}, Lm2/r;->a(Ljava/lang/String;Lm2/r;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-static {v1, v0}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ln2/b;->j(Lm2/r;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Ls2/g;->e:Ljava/lang/Object;

    check-cast v0, Lq2/l;

    iget-object v0, v0, Lq2/l;->c:Ljava/net/Socket;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ln2/b;->d(Ljava/net/Socket;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Ls2/g;->b:Lz2/g;

    invoke-interface {v0}, Lz2/g;->flush()V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Ls2/g;->b:Lz2/g;

    invoke-interface {v0}, Lz2/g;->flush()V

    return-void
.end method

.method public f(Z)Lm2/q;
    .locals 11

    iget-object v0, p0, Ls2/g;->f:Ljava/lang/Object;

    check-cast v0, LZ/b;

    iget v1, p0, Ls2/g;->c:I

    const/4 v2, 0x1

    const/4 v3, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "state: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Ls2/g;->c:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, v0, LZ/b;->c:Ljava/lang/Object;

    check-cast v2, Lz2/h;

    iget-wide v4, v0, LZ/b;->b:J

    invoke-interface {v2, v4, v5}, Lz2/h;->r(J)Ljava/lang/String;

    move-result-object v2

    iget-wide v4, v0, LZ/b;->b:J

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    int-to-long v6, v6

    sub-long/2addr v4, v6

    iput-wide v4, v0, LZ/b;->b:J

    invoke-static {v2}, Lm0/z;->Z(Ljava/lang/String;)LJ1/l;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget v4, v2, LJ1/l;->b:I

    :try_start_1
    new-instance v5, Lm2/q;

    invoke-direct {v5}, Lm2/q;-><init>()V

    iget-object v6, v2, LJ1/l;->c:Ljava/lang/Object;

    check-cast v6, Lm2/p;

    const-string v7, "protocol"

    invoke-static {v6, v7}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v5, Lm2/q;->b:Lm2/p;

    iput v4, v5, Lm2/q;->c:I

    iget-object v2, v2, LJ1/l;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v6, "message"

    invoke-static {v2, v6}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v5, Lm2/q;->d:Ljava/lang/String;

    invoke-virtual {v0}, LZ/b;->f()Lm2/j;

    move-result-object v0

    invoke-virtual {v0}, Lm2/j;->c()Lf/G;

    move-result-object v0

    iput-object v0, v5, Lm2/q;->f:Lf/G;

    const/16 v0, 0x64

    if-eqz p1, :cond_2

    if-ne v4, v0, :cond_2

    goto :goto_2

    :cond_2
    if-ne v4, v0, :cond_3

    iput v3, p0, Ls2/g;->c:I

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_3
    const/16 p1, 0x66

    if-gt p1, v4, :cond_4

    const/16 p1, 0xc8

    if-ge v4, p1, :cond_4

    iput v3, p0, Ls2/g;->c:I

    goto :goto_1

    :cond_4
    const/4 p1, 0x4

    iput p1, p0, Ls2/g;->c:I
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    move-object v1, v5

    :goto_2
    return-object v1

    :goto_3
    iget-object v0, p0, Ls2/g;->e:Ljava/lang/Object;

    check-cast v0, Lq2/l;

    iget-object v0, v0, Lq2/l;->b:Lm2/t;

    iget-object v0, v0, Lm2/t;->a:Lm2/a;

    iget-object v0, v0, Lm2/a;->h:Lm2/l;

    const-string v2, "/..."

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2
    new-instance v3, Lm2/k;

    invoke-direct {v3}, Lm2/k;-><init>()V

    invoke-virtual {v3, v0, v2}, Lm2/k;->d(Lm2/l;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    move-object v1, v3

    :catch_1
    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v10, 0xfb

    invoke-static/range {v2 .. v10}, Lm2/b;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lm2/k;->e:Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v10, 0xfb

    invoke-static/range {v2 .. v10}, Lm2/b;->b(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lm2/k;->f:Ljava/lang/Object;

    invoke-virtual {v1}, Lm2/k;->a()Lm2/l;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unexpected end of stream on "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lm2/l;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public g()Lq2/l;
    .locals 1

    iget-object v0, p0, Ls2/g;->e:Ljava/lang/Object;

    check-cast v0, Lq2/l;

    return-object v0
.end method

.method public h(Lk/s;J)Lz2/t;
    .locals 5

    iget-object p1, p1, Lk/s;->d:Ljava/lang/Object;

    check-cast p1, Lm2/j;

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    invoke-static {v0, p1}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    const-string v1, "state: "

    const/4 v2, 0x2

    if-eqz p1, :cond_1

    iget p1, p0, Ls2/g;->c:I

    if-ne p1, v0, :cond_0

    iput v2, p0, Ls2/g;->c:I

    new-instance p1, Ls2/b;

    invoke-direct {p1, p0}, Ls2/b;-><init>(Ls2/g;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Ls2/g;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    const-wide/16 v3, -0x1

    cmp-long p1, p2, v3

    if-eqz p1, :cond_3

    iget p1, p0, Ls2/g;->c:I

    if-ne p1, v0, :cond_2

    iput v2, p0, Ls2/g;->c:I

    new-instance p1, Ls2/e;

    invoke-direct {p1, p0}, Ls2/e;-><init>(Ls2/g;)V

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Ls2/g;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i(J)Ls2/d;
    .locals 2

    iget v0, p0, Ls2/g;->c:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, Ls2/g;->c:I

    new-instance v0, Ls2/d;

    invoke-direct {v0, p0, p1, p2}, Ls2/d;-><init>(Ls2/g;J)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "state: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Ls2/g;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public j(Lm2/j;Ljava/lang/String;)V
    .locals 5

    const-string v0, "headers"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestLine"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Ls2/g;->c:I

    if-nez v0, :cond_1

    iget-object v0, p0, Ls2/g;->b:Lz2/g;

    invoke-interface {v0, p2}, Lz2/g;->q(Ljava/lang/String;)Lz2/g;

    move-result-object p2

    const-string v1, "\r\n"

    invoke-interface {p2, v1}, Lz2/g;->q(Ljava/lang/String;)Lz2/g;

    invoke-virtual {p1}, Lm2/j;->size()I

    move-result p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_0

    invoke-virtual {p1, v2}, Lm2/j;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lz2/g;->q(Ljava/lang/String;)Lz2/g;

    move-result-object v3

    const-string v4, ": "

    invoke-interface {v3, v4}, Lz2/g;->q(Ljava/lang/String;)Lz2/g;

    move-result-object v3

    invoke-virtual {p1, v2}, Lm2/j;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lz2/g;->q(Ljava/lang/String;)Lz2/g;

    move-result-object v3

    invoke-interface {v3, v1}, Lz2/g;->q(Ljava/lang/String;)Lz2/g;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Lz2/g;->q(Ljava/lang/String;)Lz2/g;

    const/4 p1, 0x1

    iput p1, p0, Ls2/g;->c:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "state: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Ls2/g;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
