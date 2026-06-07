.class public final Lm2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final b:Lk/s;

.field public final c:Lm2/p;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Lm2/i;

.field public final g:Lm2/j;

.field public final h:Lm2/s;

.field public final i:Lm2/r;

.field public final j:Lm2/r;

.field public final k:Lm2/r;

.field public final l:J

.field public final m:J

.field public final n:Lq2/e;


# direct methods
.method public constructor <init>(Lk/s;Lm2/p;Ljava/lang/String;ILm2/i;Lm2/j;Lm2/s;Lm2/r;Lm2/r;Lm2/r;JJLq2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm2/r;->b:Lk/s;

    iput-object p2, p0, Lm2/r;->c:Lm2/p;

    iput-object p3, p0, Lm2/r;->d:Ljava/lang/String;

    iput p4, p0, Lm2/r;->e:I

    iput-object p5, p0, Lm2/r;->f:Lm2/i;

    iput-object p6, p0, Lm2/r;->g:Lm2/j;

    iput-object p7, p0, Lm2/r;->h:Lm2/s;

    iput-object p8, p0, Lm2/r;->i:Lm2/r;

    iput-object p9, p0, Lm2/r;->j:Lm2/r;

    iput-object p10, p0, Lm2/r;->k:Lm2/r;

    iput-wide p11, p0, Lm2/r;->l:J

    iput-wide p13, p0, Lm2/r;->m:J

    iput-object p15, p0, Lm2/r;->n:Lq2/e;

    return-void
.end method

.method public static a(Ljava/lang/String;Lm2/r;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lm2/r;->g:Lm2/j;

    invoke-virtual {p1, p0}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final b()Lm2/q;
    .locals 3

    new-instance v0, Lm2/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lm2/r;->b:Lk/s;

    iput-object v1, v0, Lm2/q;->a:Lk/s;

    iget-object v1, p0, Lm2/r;->c:Lm2/p;

    iput-object v1, v0, Lm2/q;->b:Lm2/p;

    iget v1, p0, Lm2/r;->e:I

    iput v1, v0, Lm2/q;->c:I

    iget-object v1, p0, Lm2/r;->d:Ljava/lang/String;

    iput-object v1, v0, Lm2/q;->d:Ljava/lang/String;

    iget-object v1, p0, Lm2/r;->f:Lm2/i;

    iput-object v1, v0, Lm2/q;->e:Lm2/i;

    iget-object v1, p0, Lm2/r;->g:Lm2/j;

    invoke-virtual {v1}, Lm2/j;->c()Lf/G;

    move-result-object v1

    iput-object v1, v0, Lm2/q;->f:Lf/G;

    iget-object v1, p0, Lm2/r;->h:Lm2/s;

    iput-object v1, v0, Lm2/q;->g:Lm2/s;

    iget-object v1, p0, Lm2/r;->i:Lm2/r;

    iput-object v1, v0, Lm2/q;->h:Lm2/r;

    iget-object v1, p0, Lm2/r;->j:Lm2/r;

    iput-object v1, v0, Lm2/q;->i:Lm2/r;

    iget-object v1, p0, Lm2/r;->k:Lm2/r;

    iput-object v1, v0, Lm2/q;->j:Lm2/r;

    iget-wide v1, p0, Lm2/r;->l:J

    iput-wide v1, v0, Lm2/q;->k:J

    iget-wide v1, p0, Lm2/r;->m:J

    iput-wide v1, v0, Lm2/q;->l:J

    iget-object v1, p0, Lm2/r;->n:Lq2/e;

    iput-object v1, v0, Lm2/q;->m:Lq2/e;

    return-object v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lm2/r;->h:Lm2/s;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm2/s;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Response{protocol="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lm2/r;->c:Lm2/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm2/r;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm2/r;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm2/r;->b:Lk/s;

    iget-object v1, v1, Lk/s;->b:Ljava/lang/Object;

    check-cast v1, Lm2/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
