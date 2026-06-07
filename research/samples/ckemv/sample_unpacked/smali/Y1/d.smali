.class public final LY1/d;
.super LY1/e;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# virtual methods
.method public final a(I)I
    .locals 1

    sget-object v0, LY1/e;->c:LY1/a;

    invoke-virtual {v0, p1}, LY1/a;->a(I)I

    move-result p1

    return p1
.end method

.method public final b()I
    .locals 1

    sget-object v0, LY1/e;->c:LY1/a;

    invoke-virtual {v0}, LY1/a;->b()I

    move-result v0

    return v0
.end method

.method public final c(II)I
    .locals 1

    sget-object v0, LY1/e;->c:LY1/a;

    invoke-virtual {v0, p1, p2}, LY1/e;->c(II)I

    move-result p1

    return p1
.end method
