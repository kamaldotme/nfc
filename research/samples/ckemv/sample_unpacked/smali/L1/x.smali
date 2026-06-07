.class public abstract LL1/x;
.super La/a;
.source "SourceFile"


# direct methods
.method public static O(I)I
    .locals 1

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    if-ge p0, v0, :cond_1

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    if-ge p0, v0, :cond_2

    int-to-float p0, p0

    const/high16 v0, 0x3f400000    # 0.75f

    div-float/2addr p0, v0

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr p0, v0

    float-to-int p0, p0

    goto :goto_0

    :cond_2
    const p0, 0x7fffffff

    :goto_0
    return p0
.end method

.method public static P(Ljava/util/ArrayList;)Ljava/util/Map;
    .locals 2

    sget-object v0, LL1/u;->b:LL1/u;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    if-eq v1, v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-static {v1}, LL1/x;->O(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-static {p0, v0}, LL1/x;->Q(Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LK1/c;

    const-string v0, "pair"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LK1/c;->b:Ljava/lang/Object;

    iget-object p0, p0, LK1/c;->c:Ljava/lang/Object;

    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string p0, "singletonMap(...)"

    invoke-static {v0, p0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final Q(Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)V
    .locals 2

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK1/c;

    iget-object v1, v0, LK1/c;->b:Ljava/lang/Object;

    iget-object v0, v0, LK1/c;->c:Ljava/lang/Object;

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final R(Ljava/util/LinkedHashMap;)Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "with(...)"

    invoke-static {p0, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
