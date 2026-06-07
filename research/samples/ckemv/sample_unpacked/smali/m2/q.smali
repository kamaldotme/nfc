.class public final Lm2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lk/s;

.field public b:Lm2/p;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lm2/i;

.field public f:Lf/G;

.field public g:Lm2/s;

.field public h:Lm2/r;

.field public i:Lm2/r;

.field public j:Lm2/r;

.field public k:J

.field public l:J

.field public m:Lq2/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lm2/q;->c:I

    new-instance v0, Lf/G;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lf/G;-><init>(I)V

    iput-object v0, p0, Lm2/q;->f:Lf/G;

    return-void
.end method

.method public static b(Ljava/lang/String;Lm2/r;)V
    .locals 1

    if-eqz p1, :cond_4

    iget-object v0, p1, Lm2/r;->h:Lm2/s;

    if-nez v0, :cond_3

    iget-object v0, p1, Lm2/r;->i:Lm2/r;

    if-nez v0, :cond_2

    iget-object v0, p1, Lm2/r;->j:Lm2/r;

    if-nez v0, :cond_1

    iget-object p1, p1, Lm2/r;->k:Lm2/r;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ".priorResponse != null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p1, ".cacheResponse != null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const-string p1, ".networkResponse != null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const-string p1, ".body != null"

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()Lm2/r;
    .locals 18

    move-object/from16 v0, p0

    iget v5, v0, Lm2/q;->c:I

    if-ltz v5, :cond_3

    iget-object v2, v0, Lm2/q;->a:Lk/s;

    if-eqz v2, :cond_2

    iget-object v3, v0, Lm2/q;->b:Lm2/p;

    if-eqz v3, :cond_1

    iget-object v4, v0, Lm2/q;->d:Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v6, v0, Lm2/q;->e:Lm2/i;

    iget-object v1, v0, Lm2/q;->f:Lf/G;

    invoke-virtual {v1}, Lf/G;->l()Lm2/j;

    move-result-object v7

    iget-object v8, v0, Lm2/q;->g:Lm2/s;

    iget-object v9, v0, Lm2/q;->h:Lm2/r;

    iget-object v10, v0, Lm2/q;->i:Lm2/r;

    iget-object v11, v0, Lm2/q;->j:Lm2/r;

    iget-wide v12, v0, Lm2/q;->k:J

    iget-wide v14, v0, Lm2/q;->l:J

    iget-object v1, v0, Lm2/q;->m:Lq2/e;

    new-instance v17, Lm2/r;

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, Lm2/r;-><init>(Lk/s;Lm2/p;Ljava/lang/String;ILm2/i;Lm2/j;Lm2/s;Lm2/r;Lm2/r;Lm2/r;JJLq2/e;)V

    return-object v17

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "message == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "protocol == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "request == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "code < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v0, Lm2/q;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
