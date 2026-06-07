.class public final Le1/g;
.super Lb1/x;
.source "SourceFile"


# instance fields
.field public final a:Le1/q;

.field public final b:Le1/q;

.field public final c:Ld1/p;

.field public final synthetic d:Le1/h;


# direct methods
.method public constructor <init>(Le1/h;Lb1/l;Ljava/lang/reflect/Type;Lb1/x;Ljava/lang/reflect/Type;Lb1/x;Ld1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/g;->d:Le1/h;

    new-instance p1, Le1/q;

    invoke-direct {p1, p2, p4, p3}, Le1/q;-><init>(Lb1/l;Lb1/x;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Le1/g;->a:Le1/q;

    new-instance p1, Le1/q;

    invoke-direct {p1, p2, p6, p5}, Le1/q;-><init>(Lb1/l;Lb1/x;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Le1/g;->b:Le1/q;

    iput-object p7, p0, Le1/g;->c:Ld1/p;

    return-void
.end method


# virtual methods
.method public final a(Li1/a;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p1}, Li1/a;->W()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Li1/a;->S()V

    const/4 p1, 0x0

    goto/16 :goto_4

    :cond_0
    iget-object v2, p0, Le1/g;->c:Ld1/p;

    invoke-interface {v2}, Ld1/p;->g()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    const/4 v3, 0x1

    iget-object v4, p0, Le1/g;->b:Le1/q;

    iget-object v5, p0, Le1/g;->a:Le1/q;

    const-string v6, "duplicate key: "

    if-ne v0, v3, :cond_3

    invoke-virtual {p1}, Li1/a;->a()V

    :goto_0
    invoke-virtual {p1}, Li1/a;->J()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li1/a;->a()V

    iget-object v0, v5, Le1/q;->c:Ljava/lang/Object;

    check-cast v0, Lb1/x;

    invoke-virtual {v0, p1}, Lb1/x;->a(Li1/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, v4, Le1/q;->c:Ljava/lang/Object;

    check-cast v1, Lb1/x;

    invoke-virtual {v1, p1}, Lb1/x;->a(Li1/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Li1/a;->A()V

    goto :goto_0

    :cond_1
    new-instance p1, Lb1/o;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Li1/a;->A()V

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p1}, Li1/a;->b()V

    :goto_1
    invoke-virtual {p1}, Li1/a;->J()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Ld1/e;->c:Ld1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Li1/a;->i:I

    if-nez v0, :cond_4

    invoke-virtual {p1}, Li1/a;->o()I

    move-result v0

    :cond_4
    const/16 v3, 0xd

    if-ne v0, v3, :cond_5

    iput v1, p1, Li1/a;->i:I

    goto :goto_2

    :cond_5
    const/16 v3, 0xc

    if-ne v0, v3, :cond_6

    const/16 v0, 0x8

    iput v0, p1, Li1/a;->i:I

    goto :goto_2

    :cond_6
    const/16 v3, 0xe

    if-ne v0, v3, :cond_8

    const/16 v0, 0xa

    iput v0, p1, Li1/a;->i:I

    :goto_2
    iget-object v0, v5, Le1/q;->c:Ljava/lang/Object;

    check-cast v0, Lb1/x;

    invoke-virtual {v0, p1}, Lb1/x;->a(Li1/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, v4, Le1/q;->c:Ljava/lang/Object;

    check-cast v3, Lb1/x;

    invoke-virtual {v3, p1}, Lb1/x;->a(Li1/a;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_1

    :cond_7
    new-instance p1, Lb1/o;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a name but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Li1/a;->W()I

    move-result v2

    invoke-static {v2}, LX/d;->x(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Li1/a;->L()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-virtual {p1}, Li1/a;->D()V

    :goto_3
    move-object p1, v2

    :goto_4
    return-object p1
.end method

.method public final b(Li1/b;Ljava/lang/Object;)V
    .locals 9

    check-cast p2, Ljava/util/Map;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Li1/b;->J()Li1/b;

    goto/16 :goto_8

    :cond_0
    iget-object v0, p0, Le1/g;->d:Le1/h;

    iget-boolean v0, v0, Le1/h;->c:Z

    iget-object v1, p0, Le1/g;->b:Le1/q;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Li1/b;->i()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Li1/b;->G(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Le1/q;->b(Li1/b;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Li1/b;->D()V

    goto/16 :goto_8

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    iget-object v7, p0, Le1/g;->a:Le1/q;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    new-instance v8, Le1/f;

    invoke-direct {v8}, Le1/f;-><init>()V

    invoke-virtual {v7, v8, v6}, Le1/q;->b(Li1/b;Ljava/lang/Object;)V

    iget-object v6, v8, Le1/f;->m:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v6, v8, Le1/f;->o:Lb1/n;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v5, v6, Lb1/m;

    if-nez v5, :cond_4

    instance-of v5, v6, Lb1/q;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    move v5, v3

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v5, 0x1

    :goto_3
    or-int/2addr v4, v5

    goto :goto_1

    :cond_5
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expected one JSON element but was "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    new-instance p2, Lb1/o;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_6
    if-eqz v4, :cond_8

    invoke-virtual {p1}, Li1/b;->b()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    :goto_4
    if-ge v3, p2, :cond_7

    invoke-virtual {p1}, Li1/b;->b()V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb1/n;

    sget-object v5, Le1/u;->z:Lb1/i;

    invoke-virtual {v5, p1, v4}, Lb1/i;->b(Li1/b;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, Le1/q;->b(Li1/b;Ljava/lang/Object;)V

    invoke-virtual {p1}, Li1/b;->A()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Li1/b;->A()V

    goto/16 :goto_8

    :cond_8
    invoke-virtual {p1}, Li1/b;->i()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    :goto_5
    if-ge v3, p2, :cond_10

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb1/n;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v5, v4, Lb1/r;

    if-eqz v5, :cond_e

    if-eqz v5, :cond_d

    check-cast v4, Lb1/r;

    iget-object v5, v4, Lb1/r;->b:Ljava/io/Serializable;

    instance-of v6, v5, Ljava/lang/Number;

    if-eqz v6, :cond_9

    invoke-virtual {v4}, Lb1/r;->a()Ljava/lang/Number;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_7

    :cond_9
    instance-of v6, v5, Ljava/lang/Boolean;

    if-eqz v6, :cond_b

    instance-of v6, v5, Ljava/lang/Boolean;

    if-eqz v6, :cond_a

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    goto :goto_6

    :cond_a
    invoke-virtual {v4}, Lb1/r;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v4

    :goto_6
    invoke-static {v4}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v4

    goto :goto_7

    :cond_b
    instance-of v5, v5, Ljava/lang/String;

    if-eqz v5, :cond_c

    invoke-virtual {v4}, Lb1/r;->b()Ljava/lang/String;

    move-result-object v4

    goto :goto_7

    :cond_c
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Not a JSON Primitive: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    instance-of v4, v4, Lb1/p;

    if-eqz v4, :cond_f

    const-string v4, "null"

    :goto_7
    invoke-virtual {p1, v4}, Li1/b;->G(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, Le1/q;->b(Li1/b;Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_f
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_10
    invoke-virtual {p1}, Li1/b;->D()V

    :goto_8
    return-void
.end method
