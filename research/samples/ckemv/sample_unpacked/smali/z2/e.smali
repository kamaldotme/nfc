.class public Lz2/e;
.super Lz2/x;
.source "SourceFile"


# static fields
.field public static final h:Ljava/util/concurrent/locks/ReentrantLock;

.field public static final i:Ljava/util/concurrent/locks/Condition;

.field public static final j:J

.field public static final k:J

.field public static l:Lz2/e;


# instance fields
.field public e:Z

.field public f:Lz2/e;

.field public g:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lz2/e;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    const-string v1, "newCondition(...)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lz2/e;->i:Ljava/util/concurrent/locks/Condition;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lz2/e;->j:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lz2/e;->k:J

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 9

    iget-wide v0, p0, Lz2/x;->c:J

    iget-boolean v2, p0, Lz2/x;->a:Z

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    if-nez v2, :cond_0

    return-void

    :cond_0
    sget-object v4, Lz2/e;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-boolean v5, p0, Lz2/e;->e:Z

    const/4 v6, 0x1

    xor-int/2addr v5, v6

    if-eqz v5, :cond_8

    iput-boolean v6, p0, Lz2/e;->e:Z

    sget-object v5, Lz2/e;->l:Lz2/e;

    if-nez v5, :cond_1

    new-instance v5, Lz2/e;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    sput-object v5, Lz2/e;->l:Lz2/e;

    new-instance v5, Lz2/b;

    const-string v7, "Okio Watchdog"

    invoke-direct {v5, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lz2/x;->c()J

    move-result-wide v2

    sub-long/2addr v2, v5

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    add-long/2addr v0, v5

    iput-wide v0, p0, Lz2/e;->g:J

    goto :goto_1

    :cond_2
    if-eqz v3, :cond_3

    add-long/2addr v0, v5

    iput-wide v0, p0, Lz2/e;->g:J

    goto :goto_1

    :cond_3
    if-eqz v2, :cond_7

    invoke-virtual {p0}, Lz2/x;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lz2/e;->g:J

    :goto_1
    iget-wide v0, p0, Lz2/e;->g:J

    sub-long/2addr v0, v5

    sget-object v2, Lz2/e;->l:Lz2/e;

    invoke-static {v2}, LX1/g;->b(Ljava/lang/Object;)V

    :goto_2
    iget-object v3, v2, Lz2/e;->f:Lz2/e;

    if-eqz v3, :cond_5

    iget-wide v7, v3, Lz2/e;->g:J

    sub-long/2addr v7, v5

    cmp-long v7, v0, v7

    if-gez v7, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, v3

    goto :goto_2

    :cond_5
    :goto_3
    iput-object v3, p0, Lz2/e;->f:Lz2/e;

    iput-object p0, v2, Lz2/e;->f:Lz2/e;

    sget-object v0, Lz2/e;->l:Lz2/e;

    if-ne v2, v0, :cond_6

    sget-object v0, Lz2/e;->i:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :cond_7
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_8
    const-string v0, "Unbalanced enter/exit"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final i()Z
    .locals 4

    sget-object v0, Lz2/e;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-boolean v1, p0, Lz2/e;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_1

    :cond_0
    :try_start_1
    iput-boolean v2, p0, Lz2/e;->e:Z

    sget-object v1, Lz2/e;->l:Lz2/e;

    :goto_0
    if-eqz v1, :cond_2

    iget-object v3, v1, Lz2/e;->f:Lz2/e;

    if-ne v3, p0, :cond_1

    iget-object v3, p0, Lz2/e;->f:Lz2/e;

    iput-object v3, v1, Lz2/e;->f:Lz2/e;

    const/4 v1, 0x0

    iput-object v1, p0, Lz2/e;->f:Lz2/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    move-object v1, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const/4 v2, 0x1

    :goto_1
    return v2

    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v1
.end method

.method public j(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public k()V
    .locals 0

    return-void
.end method
