.class public abstract Le2/I;
.super Le2/r;
.source "SourceFile"


# instance fields
.field public d:J

.field public e:Z

.field public f:LL1/i;


# virtual methods
.method public final L()V
    .locals 4

    iget-wide v0, p0, Le2/I;->d:J

    const-wide v2, 0x100000000L

    sub-long/2addr v0, v2

    iput-wide v0, p0, Le2/I;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Le2/I;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Le2/I;->S()V

    :cond_1
    return-void
.end method

.method public final M(Le2/A;)V
    .locals 1

    iget-object v0, p0, Le2/I;->f:LL1/i;

    if-nez v0, :cond_0

    new-instance v0, LL1/i;

    invoke-direct {v0}, LL1/i;-><init>()V

    iput-object v0, p0, Le2/I;->f:LL1/i;

    :cond_0
    invoke-virtual {v0, p1}, LL1/i;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public abstract N()Ljava/lang/Thread;
.end method

.method public final O(Z)V
    .locals 4

    iget-wide v0, p0, Le2/I;->d:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v2, v0

    iput-wide v2, p0, Le2/I;->d:J

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Le2/I;->e:Z

    :cond_1
    return-void
.end method

.method public final P()Z
    .locals 4

    iget-wide v0, p0, Le2/I;->d:J

    const-wide v2, 0x100000000L

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final Q()Z
    .locals 3

    iget-object v0, p0, Le2/I;->f:LL1/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, LL1/i;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LL1/i;->h()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Le2/A;

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {v0}, Le2/A;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public R(JLe2/F;)V
    .locals 1

    sget-object v0, Le2/w;->j:Le2/w;

    invoke-virtual {v0, p1, p2, p3}, Le2/H;->X(JLe2/F;)V

    return-void
.end method

.method public abstract S()V
.end method
