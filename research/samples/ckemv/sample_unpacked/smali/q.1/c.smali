.class public Lq/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lq/i;

.field public b:F

.field public c:Ljava/util/ArrayList;

.field public d:Lq/b;

.field public e:Z


# direct methods
.method public constructor <init>(Lv0/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lq/c;->a:Lq/i;

    const/4 v0, 0x0

    iput v0, p0, Lq/c;->b:F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq/c;->c:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq/c;->e:Z

    new-instance v0, Lq/a;

    invoke-direct {v0, p0, p1}, Lq/a;-><init>(Lq/c;Lv0/i;)V

    iput-object v0, p0, Lq/c;->d:Lq/b;

    return-void
.end method


# virtual methods
.method public final a(Lq/e;I)V
    .locals 3

    iget-object v0, p0, Lq/c;->d:Lq/b;

    invoke-virtual {p1, p2}, Lq/e;->i(I)Lq/i;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface {v0, v1, v2}, Lq/b;->g(Lq/i;F)V

    iget-object v0, p0, Lq/c;->d:Lq/b;

    invoke-virtual {p1, p2}, Lq/e;->i(I)Lq/i;

    move-result-object p1

    const/high16 p2, -0x40800000    # -1.0f

    invoke-interface {v0, p1, p2}, Lq/b;->g(Lq/i;F)V

    return-void
.end method

.method public final b(Lq/i;Lq/i;Lq/i;I)V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz p4, :cond_2

    if-gez p4, :cond_0

    mul-int/lit8 p4, p4, -0x1

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    int-to-float p4, p4

    iput p4, p0, Lq/c;->b:F

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object p4, p0, Lq/c;->d:Lq/b;

    invoke-interface {p4, p1, v0}, Lq/b;->g(Lq/i;F)V

    iget-object p1, p0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p2, v1}, Lq/b;->g(Lq/i;F)V

    iget-object p1, p0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p3, v1}, Lq/b;->g(Lq/i;F)V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p4, p0, Lq/c;->d:Lq/b;

    invoke-interface {p4, p1, v1}, Lq/b;->g(Lq/i;F)V

    iget-object p1, p0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p2, v0}, Lq/b;->g(Lq/i;F)V

    iget-object p1, p0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p3, v0}, Lq/b;->g(Lq/i;F)V

    :goto_2
    return-void
.end method

.method public final c(Lq/i;Lq/i;Lq/i;I)V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz p4, :cond_2

    if-gez p4, :cond_0

    mul-int/lit8 p4, p4, -0x1

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    int-to-float p4, p4

    iput p4, p0, Lq/c;->b:F

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object p4, p0, Lq/c;->d:Lq/b;

    invoke-interface {p4, p1, v0}, Lq/b;->g(Lq/i;F)V

    iget-object p1, p0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p2, v1}, Lq/b;->g(Lq/i;F)V

    iget-object p1, p0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p3, v0}, Lq/b;->g(Lq/i;F)V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p4, p0, Lq/c;->d:Lq/b;

    invoke-interface {p4, p1, v1}, Lq/b;->g(Lq/i;F)V

    iget-object p1, p0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p2, v0}, Lq/b;->g(Lq/i;F)V

    iget-object p1, p0, Lq/c;->d:Lq/b;

    invoke-interface {p1, p3, v1}, Lq/b;->g(Lq/i;F)V

    :goto_2
    return-void
.end method

.method public d([Z)Lq/i;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lq/c;->e([ZLq/i;)Lq/i;

    move-result-object p1

    return-object p1
.end method

.method public final e([ZLq/i;)Lq/i;
    .locals 9

    iget-object v0, p0, Lq/c;->d:Lq/b;

    invoke-interface {v0}, Lq/b;->k()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v1

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v5, p0, Lq/c;->d:Lq/b;

    invoke-interface {v5, v3}, Lq/b;->a(I)F

    move-result v5

    cmpg-float v6, v5, v1

    if-gez v6, :cond_2

    iget-object v6, p0, Lq/c;->d:Lq/b;

    invoke-interface {v6, v3}, Lq/b;->b(I)Lq/i;

    move-result-object v6

    if-eqz p1, :cond_0

    iget v7, v6, Lq/i;->b:I

    aget-boolean v7, p1, v7

    if-nez v7, :cond_2

    :cond_0
    if-eq v6, p2, :cond_2

    iget v7, v6, Lq/i;->l:I

    const/4 v8, 0x3

    if-eq v7, v8, :cond_1

    const/4 v8, 0x4

    if-ne v7, v8, :cond_2

    :cond_1
    cmpg-float v7, v5, v4

    if-gez v7, :cond_2

    move v4, v5

    move-object v2, v6

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public final f(Lq/i;)V
    .locals 3

    iget-object v0, p0, Lq/c;->a:Lq/i;

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v0, :cond_0

    iget-object v2, p0, Lq/c;->d:Lq/b;

    invoke-interface {v2, v0, v1}, Lq/b;->g(Lq/i;F)V

    const/4 v0, 0x0

    iput-object v0, p0, Lq/c;->a:Lq/i;

    :cond_0
    iget-object v0, p0, Lq/c;->d:Lq/b;

    const/4 v2, 0x1

    invoke-interface {v0, p1, v2}, Lq/b;->c(Lq/i;Z)F

    move-result v0

    mul-float/2addr v0, v1

    iput-object p1, p0, Lq/c;->a:Lq/i;

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget p1, p0, Lq/c;->b:F

    div-float/2addr p1, v0

    iput p1, p0, Lq/c;->b:F

    iget-object p1, p0, Lq/c;->d:Lq/b;

    invoke-interface {p1, v0}, Lq/b;->e(F)V

    return-void
.end method

.method public final g(Lq/i;Z)V
    .locals 3

    iget-boolean v0, p1, Lq/i;->f:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lq/c;->d:Lq/b;

    invoke-interface {v0, p1}, Lq/b;->h(Lq/i;)F

    move-result v0

    iget v1, p0, Lq/c;->b:F

    iget v2, p1, Lq/i;->e:F

    mul-float/2addr v2, v0

    add-float/2addr v2, v1

    iput v2, p0, Lq/c;->b:F

    iget-object v0, p0, Lq/c;->d:Lq/b;

    invoke-interface {v0, p1, p2}, Lq/b;->c(Lq/i;Z)F

    if-eqz p2, :cond_1

    invoke-virtual {p1, p0}, Lq/i;->b(Lq/c;)V

    :cond_1
    return-void
.end method

.method public h(Lq/c;Z)V
    .locals 3

    iget-object v0, p0, Lq/c;->d:Lq/b;

    invoke-interface {v0, p1, p2}, Lq/b;->i(Lq/c;Z)F

    move-result v0

    iget v1, p0, Lq/c;->b:F

    iget v2, p1, Lq/c;->b:F

    mul-float/2addr v2, v0

    add-float/2addr v2, v1

    iput v2, p0, Lq/c;->b:F

    if-eqz p2, :cond_0

    iget-object p1, p1, Lq/c;->a:Lq/i;

    invoke-virtual {p1, p0}, Lq/i;->b(Lq/c;)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lq/c;->a:Lq/i;

    if-nez v0, :cond_0

    const-string v0, "0"

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq/c;->a:Lq/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, " = "

    invoke-static {v0, v1}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lq/c;->b:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lq/c;->b:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    iget-object v5, p0, Lq/c;->d:Lq/b;

    invoke-interface {v5}, Lq/b;->k()I

    move-result v5

    :goto_2
    if-ge v4, v5, :cond_8

    iget-object v6, p0, Lq/c;->d:Lq/b;

    invoke-interface {v6, v4}, Lq/b;->b(I)Lq/i;

    move-result-object v6

    if-nez v6, :cond_2

    goto :goto_6

    :cond_2
    iget-object v7, p0, Lq/c;->d:Lq/b;

    invoke-interface {v7, v4}, Lq/b;->a(I)F

    move-result v7

    cmpl-float v8, v7, v2

    if-nez v8, :cond_3

    goto :goto_6

    :cond_3
    invoke-virtual {v6}, Lq/i;->toString()Ljava/lang/String;

    move-result-object v6

    const/high16 v9, -0x40800000    # -1.0f

    if-nez v1, :cond_4

    cmpg-float v1, v7, v2

    if-gez v1, :cond_6

    const-string v1, "- "

    invoke-static {v0, v1}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    mul-float/2addr v7, v9

    goto :goto_4

    :cond_4
    if-lez v8, :cond_5

    const-string v1, " + "

    invoke-static {v0, v1}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    const-string v1, " - "

    invoke-static {v0, v1}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    :goto_4
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, v7, v1

    if-nez v1, :cond_7

    invoke-static {v0, v6}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_5
    move v1, v3

    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    if-nez v1, :cond_9

    const-string v1, "0.0"

    invoke-static {v0, v1}, LX/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_9
    return-object v0
.end method
