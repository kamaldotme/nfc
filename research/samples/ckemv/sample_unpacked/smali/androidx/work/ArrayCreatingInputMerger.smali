.class public final Landroidx/work/ArrayCreatingInputMerger;
.super Lm0/j;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)Lm0/g;
    .locals 12

    new-instance v0, Lf/G;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lf/G;-><init>(I)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/g;

    iget-object v2, v2, Lm0/g;->a:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "input.keyValueMap"

    invoke-static {v2, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    goto :goto_1

    :cond_1
    const-class v5, Ljava/lang/String;

    :goto_1
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "key"

    invoke-static {v4, v7}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "newArray"

    const/4 v8, 0x0

    if-nez v6, :cond_3

    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    const/4 v6, 0x1

    invoke-static {v5, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v8, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v5, v7}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    move-object v3, v5

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v5}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const-string v5, "value"

    invoke-static {v3, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v9

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v10

    invoke-static {v10}, LX1/g;->b(Ljava/lang/Object;)V

    add-int v11, v5, v9

    invoke-static {v10, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6, v8, v10, v8, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v3, v8, v10, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10, v7}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v10

    goto :goto_3

    :cond_4
    invoke-virtual {v9}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v5}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-static {v6}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v9

    add-int/lit8 v10, v9, 0x1

    invoke-static {v5, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v8, v5, v8, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v5, v9, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v5, v7}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :goto_3
    const-string v5, "if (existingValue == nul\u2026      }\n                }"

    invoke-static {v3, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_6
    invoke-virtual {v0, v1}, Lf/G;->p(Ljava/util/HashMap;)V

    new-instance p1, Lm0/g;

    iget-object v0, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-direct {p1, v0}, Lm0/g;-><init>(Ljava/util/HashMap;)V

    invoke-static {p1}, Lm0/g;->b(Lm0/g;)[B

    return-object p1
.end method
