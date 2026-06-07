.class public final Lq2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lp2/c;

.field public final d:Lp2/b;

.field public final e:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method public constructor <init>(Lp2/d;Ljava/util/concurrent/TimeUnit;)V
    .locals 2

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lq2/m;->a:I

    const-wide/16 v0, 0x5

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lq2/m;->b:J

    invoke-virtual {p1}, Lp2/d;->f()Lp2/c;

    move-result-object p1

    iput-object p1, p0, Lq2/m;->c:Lp2/c;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p2, Ln2/b;->f:Ljava/lang/String;

    const-string v0, " ConnectionPool"

    invoke-static {p1, p2, v0}, LX/d;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lp2/b;

    invoke-direct {p2, p0, p1}, Lp2/b;-><init>(Lq2/m;Ljava/lang/String;)V

    iput-object p2, p0, Lq2/m;->d:Lp2/b;

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lq2/m;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-void
.end method


# virtual methods
.method public final a(Lm2/a;Lq2/i;Ljava/util/ArrayList;Z)Z
    .locals 3

    const-string v0, "address"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/m;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq2/l;

    const-string v2, "connection"

    invoke-static {v1, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v1

    if-eqz p4, :cond_0

    :try_start_0
    iget-object v2, v1, Lq2/l;->g:Lt2/q;

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {v1, p1, p3}, Lq2/l;->h(Lm2/a;Ljava/util/ArrayList;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p2, v1}, Lq2/i;->a(Lq2/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v1

    goto :goto_0

    :goto_1
    monitor-exit v1

    throw p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lq2/l;J)I
    .locals 7

    const/4 v0, 0x1

    sget-object v1, Ln2/b;->a:[B

    iget-object v1, p1, Lq2/l;->p:Ljava/util/ArrayList;

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/Reference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_1

    add-int/2addr v3, v0

    goto :goto_0

    :cond_1
    check-cast v4, Lq2/g;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "A connection to "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, p1, Lq2/l;->b:Lm2/t;

    iget-object v6, v6, Lm2/t;->a:Lm2/a;

    iget-object v6, v6, Lm2/a;->h:Lm2/l;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " was leaked. Did you forget to close a response body?"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lu2/n;->a:Lu2/n;

    sget-object v6, Lu2/n;->a:Lu2/n;

    iget-object v4, v4, Lq2/g;->a:Ljava/lang/Object;

    invoke-virtual {v6, v4, v5}, Lu2/n;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iput-boolean v0, p1, Lq2/l;->j:Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-wide v0, p0, Lq2/m;->b:J

    sub-long/2addr p2, v0

    iput-wide p2, p1, Lq2/l;->q:J

    return v2

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    return p1
.end method

.method public final c(Lq2/l;)V
    .locals 3

    sget-object v0, Ln2/b;->a:[B

    iget-object v0, p0, Lq2/m;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    const-wide/16 v0, 0x0

    iget-object p1, p0, Lq2/m;->c:Lp2/c;

    iget-object v2, p0, Lq2/m;->d:Lp2/b;

    invoke-virtual {p1, v2, v0, v1}, Lp2/c;->c(Lp2/a;J)V

    return-void
.end method
