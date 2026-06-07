.class public final Lr2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq2/i;

.field public final b:Ljava/util/List;

.field public final c:I

.field public final d:Lq2/e;

.field public final e:Lk/s;

.field public final f:I

.field public final g:I

.field public final h:I

.field public i:I


# direct methods
.method public constructor <init>(Lq2/i;Ljava/util/List;ILq2/e;Lk/s;III)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptors"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p5, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/f;->a:Lq2/i;

    iput-object p2, p0, Lr2/f;->b:Ljava/util/List;

    iput p3, p0, Lr2/f;->c:I

    iput-object p4, p0, Lr2/f;->d:Lq2/e;

    iput-object p5, p0, Lr2/f;->e:Lk/s;

    iput p6, p0, Lr2/f;->f:I

    iput p7, p0, Lr2/f;->g:I

    iput p8, p0, Lr2/f;->h:I

    return-void
.end method

.method public static a(Lr2/f;ILq2/e;Lk/s;I)Lr2/f;
    .locals 9

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    iget p1, p0, Lr2/f;->c:I

    :cond_0
    move v3, p1

    and-int/lit8 p1, p4, 0x2

    if-eqz p1, :cond_1

    iget-object p2, p0, Lr2/f;->d:Lq2/e;

    :cond_1
    move-object v4, p2

    and-int/lit8 p1, p4, 0x4

    if-eqz p1, :cond_2

    iget-object p3, p0, Lr2/f;->e:Lk/s;

    :cond_2
    move-object v5, p3

    iget v6, p0, Lr2/f;->f:I

    iget v7, p0, Lr2/f;->g:I

    iget v8, p0, Lr2/f;->h:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "request"

    invoke-static {v5, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lr2/f;

    iget-object v1, p0, Lr2/f;->a:Lq2/i;

    iget-object v2, p0, Lr2/f;->b:Ljava/util/List;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lr2/f;-><init>(Lq2/i;Ljava/util/List;ILq2/e;Lk/s;III)V

    return-object p1
.end method


# virtual methods
.method public final b(Lk/s;)Lm2/r;
    .locals 9

    const-string v0, "request"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr2/f;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lr2/f;->c:I

    if-ge v2, v1, :cond_7

    iget v1, p0, Lr2/f;->i:I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    iput v1, p0, Lr2/f;->i:I

    const-string v1, " must call proceed() exactly once"

    iget-object v4, p0, Lr2/f;->d:Lq2/e;

    const-string v5, "network interceptor "

    if-eqz v4, :cond_2

    iget-object v6, p1, Lk/s;->b:Ljava/lang/Object;

    check-cast v6, Lm2/l;

    iget-object v7, v4, Lq2/e;->c:Lq2/f;

    invoke-virtual {v7, v6}, Lq2/f;->b(Lm2/l;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget v6, p0, Lr2/f;->i:I

    if-ne v6, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int/2addr v2, v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int/2addr v2, v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " must retain the same host and port"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    add-int/lit8 v6, v2, 0x1

    const/16 v7, 0x3a

    const/4 v8, 0x0

    invoke-static {p0, v6, v8, p1, v7}, Lr2/f;->a(Lr2/f;ILq2/e;Lk/s;I)Lr2/f;

    move-result-object p1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm2/m;

    invoke-interface {v2, p1}, Lm2/m;->a(Lr2/f;)Lm2/r;

    move-result-object v7

    const-string v8, "interceptor "

    if-eqz v7, :cond_6

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    iget p1, p1, Lr2/f;->i:I

    if-ne p1, v3, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    iget-object p1, v7, Lm2/r;->h:Lm2/s;

    if-eqz p1, :cond_5

    return-object v7

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " returned a response with no body"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
