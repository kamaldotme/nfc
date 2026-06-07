.class public final Ls2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/t;


# instance fields
.field public final b:Lz2/j;

.field public c:Z

.field public final synthetic d:Ls2/g;


# direct methods
.method public constructor <init>(Ls2/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/e;->d:Ls2/g;

    new-instance v0, Lz2/j;

    iget-object p1, p1, Ls2/g;->b:Lz2/g;

    invoke-interface {p1}, Lz2/t;->c()Lz2/x;

    move-result-object p1

    invoke-direct {v0, p1}, Lz2/j;-><init>(Lz2/x;)V

    iput-object v0, p0, Ls2/e;->b:Lz2/j;

    return-void
.end method


# virtual methods
.method public final c()Lz2/x;
    .locals 1

    iget-object v0, p0, Ls2/e;->b:Lz2/j;

    return-object v0
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, Ls2/e;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ls2/e;->c:Z

    iget-object v0, p0, Ls2/e;->d:Ls2/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Ls2/e;->b:Lz2/j;

    iget-object v2, v1, Lz2/j;->e:Lz2/x;

    sget-object v3, Lz2/x;->d:Lz2/w;

    iput-object v3, v1, Lz2/j;->e:Lz2/x;

    invoke-virtual {v2}, Lz2/x;->a()Lz2/x;

    invoke-virtual {v2}, Lz2/x;->b()Lz2/x;

    const/4 v1, 0x3

    iput v1, v0, Ls2/g;->c:I

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-boolean v0, p0, Ls2/e;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls2/e;->d:Ls2/g;

    iget-object v0, v0, Ls2/g;->b:Lz2/g;

    invoke-interface {v0}, Lz2/g;->flush()V

    return-void
.end method

.method public final m(Lz2/f;J)V
    .locals 7

    const-string v0, "source"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ls2/e;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-wide v1, p1, Lz2/f;->c:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Ln2/b;->b(JJJ)V

    iget-object v0, p0, Ls2/e;->d:Ls2/g;

    iget-object v0, v0, Ls2/g;->b:Lz2/g;

    invoke-interface {v0, p1, p2, p3}, Lz2/t;->m(Lz2/f;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
