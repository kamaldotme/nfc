.class public final LI1/s;
.super LI1/m;
.source "SourceFile"


# instance fields
.field public c:Z


# virtual methods
.method public final b(Lj1/i;)Lv0/e;
    .locals 3

    iget-boolean v0, p0, LI1/s;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LI1/s;->c:Z

    new-instance v0, Lv0/e;

    new-instance v1, Lp1/e;

    new-instance v2, Lj1/e;

    invoke-direct {v2, p1}, Lj1/e;-><init>(Lj1/f;)V

    invoke-direct {v1, v2}, Lp1/e;-><init>(Lj1/f;)V

    invoke-direct {v0, v1}, Lv0/e;-><init>(Lp1/e;)V

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LI1/s;->c:Z

    new-instance v0, Lv0/e;

    new-instance v1, Lp1/e;

    invoke-direct {v1, p1}, Lp1/e;-><init>(Lj1/f;)V

    invoke-direct {v0, v1}, Lv0/e;-><init>(Lp1/e;)V

    return-object v0
.end method
