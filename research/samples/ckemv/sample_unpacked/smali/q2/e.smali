.class public final Lq2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq2/i;

.field public final b:Lm2/b;

.field public final c:Lq2/f;

.field public final d:Lr2/d;

.field public e:Z

.field public f:Z

.field public final g:Lq2/l;


# direct methods
.method public constructor <init>(Lq2/i;Lm2/b;Lq2/f;Lr2/d;)V
    .locals 1

    const-string v0, "eventListener"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/e;->a:Lq2/i;

    iput-object p2, p0, Lq2/e;->b:Lm2/b;

    iput-object p3, p0, Lq2/e;->c:Lq2/f;

    iput-object p4, p0, Lq2/e;->d:Lr2/d;

    invoke-interface {p4}, Lr2/d;->g()Lq2/l;

    move-result-object p1

    iput-object p1, p0, Lq2/e;->g:Lq2/l;

    return-void
.end method


# virtual methods
.method public final a(ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    if-eqz p3, :cond_0

    invoke-virtual {p0, p3}, Lq2/e;->d(Ljava/io/IOException;)V

    :cond_0
    const-string v0, "call"

    iget-object v1, p0, Lq2/e;->b:Lm2/b;

    iget-object v2, p0, Lq2/e;->a:Lq2/i;

    if-eqz p2, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    :goto_1
    invoke-virtual {v2, p0, p2, p1, p3}, Lq2/i;->f(Lq2/e;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lm2/r;)Lm2/s;
    .locals 4

    iget-object v0, p0, Lq2/e;->d:Lr2/d;

    :try_start_0
    const-string v1, "Content-Type"

    invoke-static {v1, p1}, Lm2/r;->a(Ljava/lang/String;Lm2/r;)Ljava/lang/String;

    invoke-interface {v0, p1}, Lr2/d;->c(Lm2/r;)J

    move-result-wide v1

    invoke-interface {v0, p1}, Lr2/d;->a(Lm2/r;)Lz2/v;

    move-result-object p1

    new-instance v0, Lq2/d;

    invoke-direct {v0, p0, p1, v1, v2}, Lq2/d;-><init>(Lq2/e;Lz2/v;J)V

    new-instance p1, Lm2/s;

    new-instance v3, Lz2/p;

    invoke-direct {v3, v0}, Lz2/p;-><init>(Lz2/v;)V

    const/4 v0, 0x1

    invoke-direct {p1, v1, v2, v3, v0}, Lm2/s;-><init>(JLz2/h;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lq2/e;->b:Lm2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "call"

    iget-object v1, p0, Lq2/e;->a:Lq2/i;

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lq2/e;->d(Ljava/io/IOException;)V

    throw p1
.end method

.method public final c(Z)Lm2/q;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lq2/e;->d:Lr2/d;

    invoke-interface {v0, p1}, Lr2/d;->f(Z)Lm2/q;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p0, p1, Lm2/q;->m:Lq2/e;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lq2/e;->b:Lm2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "call"

    iget-object v1, p0, Lq2/e;->a:Lq2/i;

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lq2/e;->d(Ljava/io/IOException;)V

    throw p1
.end method

.method public final d(Ljava/io/IOException;)V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq2/e;->f:Z

    iget-object v1, p0, Lq2/e;->c:Lq2/f;

    invoke-virtual {v1, p1}, Lq2/f;->c(Ljava/io/IOException;)V

    iget-object v1, p0, Lq2/e;->d:Lr2/d;

    invoke-interface {v1}, Lr2/d;->g()Lq2/l;

    move-result-object v1

    iget-object v2, p0, Lq2/e;->a:Lq2/i;

    monitor-enter v1

    :try_start_0
    const-string v3, "call"

    invoke-static {v2, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, p1, Lt2/D;

    if-eqz v3, :cond_2

    move-object v3, p1

    check-cast v3, Lt2/D;

    iget v3, v3, Lt2/D;->b:I

    const/16 v4, 0x8

    if-ne v3, v4, :cond_0

    iget p1, v1, Lq2/l;->n:I

    add-int/2addr p1, v0

    iput p1, v1, Lq2/l;->n:I

    if-le p1, v0, :cond_4

    iput-boolean v0, v1, Lq2/l;->j:Z

    iget p1, v1, Lq2/l;->l:I

    add-int/2addr p1, v0

    iput p1, v1, Lq2/l;->l:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    check-cast p1, Lt2/D;

    iget p1, p1, Lt2/D;->b:I

    const/16 v3, 0x9

    if-ne p1, v3, :cond_1

    iget-boolean p1, v2, Lq2/i;->q:Z

    if-nez p1, :cond_4

    :cond_1
    iput-boolean v0, v1, Lq2/l;->j:Z

    iget p1, v1, Lq2/l;->l:I

    add-int/2addr p1, v0

    iput p1, v1, Lq2/l;->l:I

    goto :goto_0

    :cond_2
    iget-object v3, v1, Lq2/l;->g:Lt2/q;

    if-eqz v3, :cond_3

    instance-of v3, p1, Lt2/a;

    if-eqz v3, :cond_4

    :cond_3
    iput-boolean v0, v1, Lq2/l;->j:Z

    iget v3, v1, Lq2/l;->m:I

    if-nez v3, :cond_4

    iget-object v2, v2, Lq2/i;->b:Lm2/o;

    iget-object v3, v1, Lq2/l;->b:Lm2/t;

    invoke-static {v2, v3, p1}, Lq2/l;->d(Lm2/o;Lm2/t;Ljava/io/IOException;)V

    iget p1, v1, Lq2/l;->l:I

    add-int/2addr p1, v0

    iput p1, v1, Lq2/l;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw p1
.end method
