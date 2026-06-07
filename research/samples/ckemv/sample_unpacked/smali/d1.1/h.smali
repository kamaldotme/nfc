.class public final Ld1/h;
.super Lb1/x;
.source "SourceFile"


# instance fields
.field public a:Lb1/x;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lb1/l;

.field public final synthetic e:Lcom/google/gson/reflect/TypeToken;

.field public final synthetic f:Ld1/i;


# direct methods
.method public constructor <init>(Ld1/i;ZZLb1/l;Lcom/google/gson/reflect/TypeToken;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/h;->f:Ld1/i;

    iput-boolean p2, p0, Ld1/h;->b:Z

    iput-boolean p3, p0, Ld1/h;->c:Z

    iput-object p4, p0, Ld1/h;->d:Lb1/l;

    iput-object p5, p0, Ld1/h;->e:Lcom/google/gson/reflect/TypeToken;

    return-void
.end method


# virtual methods
.method public final a(Li1/a;)Ljava/lang/Object;
    .locals 6

    iget-boolean v0, p0, Ld1/h;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Li1/a;->c0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Ld1/h;->a:Lb1/x;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ld1/h;->d:Lb1/l;

    iget-object v1, v0, Lb1/l;->e:Ljava/util/List;

    iget-object v2, p0, Ld1/h;->f:Ld1/i;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v2, v0, Lb1/l;->d:Le1/c;

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    iget-object v5, p0, Ld1/h;->e:Lcom/google/gson/reflect/TypeToken;

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb1/y;

    if-nez v3, :cond_4

    if-ne v4, v2, :cond_3

    const/4 v3, 0x1

    goto :goto_0

    :cond_4
    invoke-interface {v4, v0, v5}, Lb1/y;->a(Lb1/l;Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object v4

    if-eqz v4, :cond_3

    iput-object v4, p0, Ld1/h;->a:Lb1/x;

    move-object v0, v4

    :goto_1
    invoke-virtual {v0, p1}, Lb1/x;->a(Li1/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GSON cannot serialize "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Li1/b;Ljava/lang/Object;)V
    .locals 6

    iget-boolean v0, p0, Ld1/h;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Li1/b;->J()Li1/b;

    return-void

    :cond_0
    iget-object v0, p0, Ld1/h;->a:Lb1/x;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ld1/h;->d:Lb1/l;

    iget-object v1, v0, Lb1/l;->e:Ljava/util/List;

    iget-object v2, p0, Ld1/h;->f:Ld1/i;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v2, v0, Lb1/l;->d:Le1/c;

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    iget-object v5, p0, Ld1/h;->e:Lcom/google/gson/reflect/TypeToken;

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb1/y;

    if-nez v3, :cond_4

    if-ne v4, v2, :cond_3

    const/4 v3, 0x1

    goto :goto_0

    :cond_4
    invoke-interface {v4, v0, v5}, Lb1/y;->a(Lb1/l;Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object v4

    if-eqz v4, :cond_3

    iput-object v4, p0, Ld1/h;->a:Lb1/x;

    move-object v0, v4

    :goto_1
    invoke-virtual {v0, p1, p2}, Lb1/x;->b(Li1/b;Ljava/lang/Object;)V

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "GSON cannot serialize "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
