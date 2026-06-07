.class public abstract LY1/a;
.super LY1/e;
.source "SourceFile"


# virtual methods
.method public final a(I)I
    .locals 2

    invoke-virtual {p0}, LY1/a;->d()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    rsub-int/lit8 v1, p1, 0x20

    ushr-int/2addr v0, v1

    neg-int p1, p1

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    return p1
.end method

.method public final b()I
    .locals 1

    invoke-virtual {p0}, LY1/a;->d()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    return v0
.end method

.method public abstract d()Ljava/util/Random;
.end method
