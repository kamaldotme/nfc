.class public final Lz2/j;
.super Lz2/x;
.source "SourceFile"


# instance fields
.field public e:Lz2/x;


# direct methods
.method public constructor <init>(Lz2/x;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/j;->e:Lz2/x;

    return-void
.end method


# virtual methods
.method public final a()Lz2/x;
    .locals 1

    iget-object v0, p0, Lz2/j;->e:Lz2/x;

    invoke-virtual {v0}, Lz2/x;->a()Lz2/x;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lz2/x;
    .locals 1

    iget-object v0, p0, Lz2/j;->e:Lz2/x;

    invoke-virtual {v0}, Lz2/x;->b()Lz2/x;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lz2/j;->e:Lz2/x;

    invoke-virtual {v0}, Lz2/x;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Lz2/x;
    .locals 1

    iget-object v0, p0, Lz2/j;->e:Lz2/x;

    invoke-virtual {v0, p1, p2}, Lz2/x;->d(J)Lz2/x;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lz2/j;->e:Lz2/x;

    invoke-virtual {v0}, Lz2/x;->e()Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lz2/j;->e:Lz2/x;

    invoke-virtual {v0}, Lz2/x;->f()V

    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lz2/x;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz2/j;->e:Lz2/x;

    invoke-virtual {v0, p1, p2, p3}, Lz2/x;->g(JLjava/util/concurrent/TimeUnit;)Lz2/x;

    move-result-object p1

    return-object p1
.end method
