.class public final LZ1/a;
.super LY1/a;
.source "SourceFile"


# virtual methods
.method public final c(II)I
    .locals 1

    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ThreadLocalRandom;->nextInt(II)I

    move-result p1

    return p1
.end method

.method public final d()Ljava/util/Random;
    .locals 2

    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    const-string v1, "current(...)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
