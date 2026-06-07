.class public final Lq2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/m;


# static fields
.field public static final a:Lq2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq2/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq2/a;->a:Lq2/a;

    return-void
.end method


# virtual methods
.method public final a(Lr2/f;)Lm2/r;
    .locals 10

    iget-object v0, p1, Lr2/f;->a:Lq2/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lq2/i;->p:Z

    if-eqz v1, :cond_3

    iget-boolean v1, v0, Lq2/i;->o:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lq2/i;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    monitor-exit v0

    iget-object v1, v0, Lq2/i;->j:Lq2/f;

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v9, v0, Lq2/i;->b:Lm2/o;

    const-string v3, "client"

    invoke-static {v9, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget v4, p1, Lr2/f;->f:I

    iget v5, p1, Lr2/f;->g:I

    iget v6, p1, Lr2/f;->h:I

    iget-boolean v7, v9, Lm2/o;->g:Z

    iget-object v3, p1, Lr2/f;->e:Lk/s;

    iget-object v3, v3, Lk/s;->c:Ljava/io/Serializable;

    check-cast v3, Ljava/lang/String;

    const-string v8, "GET"

    invoke-static {v3, v8}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v8, v3, 0x1

    move-object v3, v1

    invoke-virtual/range {v3 .. v8}, Lq2/f;->a(IIIZZ)Lq2/l;

    move-result-object v3

    invoke-virtual {v3, v9, p1}, Lq2/l;->j(Lm2/o;Lr2/f;)Lr2/d;

    move-result-object v3
    :try_end_1
    .catch Lq2/n; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    new-instance v4, Lq2/e;

    iget-object v5, v0, Lq2/i;->f:Lm2/b;

    invoke-direct {v4, v0, v5, v1, v3}, Lq2/e;-><init>(Lq2/i;Lm2/b;Lq2/f;Lr2/d;)V

    iput-object v4, v0, Lq2/i;->m:Lq2/e;

    iput-object v4, v0, Lq2/i;->r:Lq2/e;

    monitor-enter v0

    :try_start_2
    iput-boolean v2, v0, Lq2/i;->n:Z

    iput-boolean v2, v0, Lq2/i;->o:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    iget-boolean v0, v0, Lq2/i;->q:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x3d

    invoke-static {p1, v0, v4, v1, v2}, Lr2/f;->a(Lr2/f;ILq2/e;Lk/s;I)Lr2/f;

    move-result-object v0

    iget-object p1, p1, Lr2/f;->e:Lk/s;

    invoke-virtual {v0, p1}, Lr2/f;->b(Lk/s;)Lm2/r;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-virtual {v1, p1}, Lq2/f;->c(Ljava/io/IOException;)V

    new-instance v0, Lq2/n;

    invoke-direct {v0, p1}, Lq2/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :goto_1
    iget-object v0, p1, Lq2/n;->c:Ljava/io/IOException;

    invoke-virtual {v1, v0}, Lq2/f;->c(Ljava/io/IOException;)V

    throw p1

    :cond_1
    :try_start_3
    const-string p1, "Check failed."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    const-string p1, "Check failed."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    const-string p1, "released"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    monitor-exit v0

    throw p1
.end method
