.class public final Lk1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/j;


# virtual methods
.method public final a(Lv0/e;Ljava/util/Map;)Lj1/l;
    .locals 8

    new-instance v0, Lm1/a;

    invoke-virtual {p1}, Lv0/e;->e()Lp1/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lm1/a;-><init>(Lp1/b;)V

    const/4 p1, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p1}, Lm1/a;->a(Z)Lk1/a;

    move-result-object v2

    iget-object v3, v2, Lk1/a;->b:[Lj1/n;
    :try_end_0
    .catch Lj1/h; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lj1/d; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    new-instance v4, Ll1/a;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v2}, Ll1/a;->a(Lk1/a;)Lp1/d;

    move-result-object v2
    :try_end_1
    .catch Lj1/h; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lj1/d; {:try_start_1 .. :try_end_1} :catch_0

    move-object v4, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v3

    goto :goto_4

    :catch_0
    move-exception v2

    goto :goto_2

    :catch_1
    move-exception v2

    goto :goto_3

    :goto_0
    move-object v3, v1

    goto :goto_2

    :goto_1
    move-object v3, v1

    goto :goto_3

    :catch_2
    move-exception v2

    goto :goto_0

    :goto_2
    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto :goto_4

    :catch_3
    move-exception v2

    goto :goto_1

    :goto_3
    move-object v4, v3

    move-object v3, v1

    :goto_4
    if-nez v1, :cond_0

    const/4 v1, 0x1

    :try_start_2
    invoke-virtual {v0, v1}, Lm1/a;->a(Z)Lk1/a;

    move-result-object v0

    iget-object v4, v0, Lk1/a;->b:[Lj1/n;

    new-instance v1, Ll1/a;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v0}, Ll1/a;->a(Lk1/a;)Lp1/d;

    move-result-object v1
    :try_end_2
    .catch Lj1/h; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lj1/d; {:try_start_2 .. :try_end_2} :catch_4

    :cond_0
    move-object v5, v4

    goto :goto_6

    :catch_4
    move-exception p1

    goto :goto_5

    :catch_5
    move-exception p1

    :goto_5
    if-nez v2, :cond_2

    if-eqz v3, :cond_1

    throw v3

    :cond_1
    throw p1

    :cond_2
    throw v2

    :goto_6
    if-eqz p2, :cond_3

    sget-object v0, Lj1/c;->k:Lj1/c;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj1/o;

    if-eqz p2, :cond_3

    array-length v0, v5

    :goto_7
    if-ge p1, v0, :cond_3

    aget-object v2, v5, p1

    invoke-interface {p2, v2}, Lj1/o;->a(Lj1/n;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    :cond_3
    new-instance p1, Lj1/l;

    sget-object v6, Lj1/a;->b:Lj1/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v4, v1, Lp1/d;->a:[B

    const/4 v7, 0x0

    iget-object v3, v1, Lp1/d;->b:Ljava/lang/String;

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lj1/l;-><init>(Ljava/lang/String;[B[Lj1/n;Lj1/a;I)V

    iget-object p2, v1, Lp1/d;->c:Ljava/util/List;

    if-eqz p2, :cond_4

    sget-object v0, Lj1/m;->c:Lj1/m;

    invoke-virtual {p1, v0, p2}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    :cond_4
    iget-object p2, v1, Lp1/d;->d:Ljava/lang/String;

    if-eqz p2, :cond_5

    sget-object v0, Lj1/m;->d:Lj1/m;

    invoke-virtual {p1, v0, p2}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    :cond_5
    return-object p1
.end method

.method public final b(Lv0/e;)Lj1/l;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lk1/b;->a(Lv0/e;Ljava/util/Map;)Lj1/l;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 0

    return-void
.end method
