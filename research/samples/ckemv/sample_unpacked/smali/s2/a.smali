.class public abstract Ls2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/v;


# instance fields
.field public final b:Lz2/j;

.field public c:Z

.field public final synthetic d:Ls2/g;


# direct methods
.method public constructor <init>(Ls2/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/a;->d:Ls2/g;

    new-instance v0, Lz2/j;

    iget-object p1, p1, Ls2/g;->a:Lz2/h;

    invoke-interface {p1}, Lz2/v;->c()Lz2/x;

    move-result-object p1

    invoke-direct {v0, p1}, Lz2/j;-><init>(Lz2/x;)V

    iput-object v0, p0, Ls2/a;->b:Lz2/j;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Ls2/a;->d:Ls2/g;

    iget v1, v0, Ls2/g;->c:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x5

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ls2/a;->b:Lz2/j;

    iget-object v3, v1, Lz2/j;->e:Lz2/x;

    sget-object v4, Lz2/x;->d:Lz2/w;

    iput-object v4, v1, Lz2/j;->e:Lz2/x;

    invoke-virtual {v3}, Lz2/x;->a()Lz2/x;

    invoke-virtual {v3}, Lz2/x;->b()Lz2/x;

    iput v2, v0, Ls2/g;->c:I

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Ls2/g;->c:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c()Lz2/x;
    .locals 1

    iget-object v0, p0, Ls2/a;->b:Lz2/j;

    return-object v0
.end method

.method public z(Lz2/f;J)J
    .locals 2

    iget-object v0, p0, Ls2/a;->d:Ls2/g;

    const-string v1, "sink"

    invoke-static {p1, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, v0, Ls2/g;->a:Lz2/h;

    invoke-interface {v1, p1, p2, p3}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, v0, Ls2/g;->e:Ljava/lang/Object;

    check-cast p2, Lq2/l;

    invoke-virtual {p2}, Lq2/l;->k()V

    invoke-virtual {p0}, Ls2/a;->a()V

    throw p1
.end method
