.class public final Lb1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ThreadLocal;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Landroidx/activity/l;

.field public final d:Le1/c;

.field public final e:Ljava/util/List;

.field public final f:Z


# direct methods
.method public constructor <init>()V
    .locals 9

    sget-object v0, Ld1/i;->d:Ld1/i;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ljava/lang/ThreadLocal;

    invoke-direct {v4}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v4, p0, Lb1/l;->a:Ljava/lang/ThreadLocal;

    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v4, p0, Lb1/l;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v4, Landroidx/activity/l;

    invoke-direct {v4, v1, v3}, Landroidx/activity/l;-><init>(Ljava/util/Map;Ljava/util/List;)V

    iput-object v4, p0, Lb1/l;->c:Landroidx/activity/l;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lb1/l;->f:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Le1/u;->A:Le1/r;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Le1/k;->c:Le1/i;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v2, Le1/u;->p:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->g:Le1/s;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->d:Le1/s;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->e:Le1/s;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->f:Le1/s;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->k:Lb1/i;

    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    new-instance v6, Le1/s;

    const-class v7, Ljava/lang/Long;

    invoke-direct {v6, v5, v7, v2}, Le1/s;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lb1/x;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    new-instance v6, Lb1/i;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lb1/i;-><init>(I)V

    new-instance v7, Le1/s;

    const-class v8, Ljava/lang/Double;

    invoke-direct {v7, v5, v8, v6}, Le1/s;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lb1/x;)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    new-instance v6, Lb1/i;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lb1/i;-><init>(I)V

    new-instance v7, Le1/s;

    const-class v8, Ljava/lang/Float;

    invoke-direct {v7, v5, v8, v6}, Le1/s;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lb1/x;)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Le1/j;->b:Le1/i;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Le1/u;->h:Le1/r;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Le1/u;->i:Le1/r;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lb1/j;

    const/4 v6, 0x0

    invoke-direct {v5, v2, v6}, Lb1/j;-><init>(Lb1/x;I)V

    new-instance v6, Lb1/j;

    const/4 v7, 0x2

    invoke-direct {v6, v5, v7}, Lb1/j;-><init>(Lb1/x;I)V

    new-instance v5, Le1/r;

    const-class v7, Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v8, 0x0

    invoke-direct {v5, v7, v6, v8}, Le1/r;-><init>(Ljava/lang/Class;Lb1/x;I)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lb1/j;

    const/4 v6, 0x1

    invoke-direct {v5, v2, v6}, Lb1/j;-><init>(Lb1/x;I)V

    new-instance v2, Lb1/j;

    const/4 v6, 0x2

    invoke-direct {v2, v5, v6}, Lb1/j;-><init>(Lb1/x;I)V

    new-instance v5, Le1/r;

    const-class v6, Ljava/util/concurrent/atomic/AtomicLongArray;

    const/4 v7, 0x0

    invoke-direct {v5, v6, v2, v7}, Le1/r;-><init>(Ljava/lang/Class;Lb1/x;I)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->j:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->l:Le1/s;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->q:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->r:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->m:Lb1/i;

    new-instance v5, Le1/r;

    const-class v6, Ljava/math/BigDecimal;

    const/4 v7, 0x0

    invoke-direct {v5, v6, v2, v7}, Le1/r;-><init>(Ljava/lang/Class;Lb1/x;I)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->n:Lb1/i;

    new-instance v5, Le1/r;

    const-class v6, Ljava/math/BigInteger;

    const/4 v7, 0x0

    invoke-direct {v5, v6, v2, v7}, Le1/r;-><init>(Ljava/lang/Class;Lb1/x;I)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->o:Lb1/i;

    new-instance v5, Le1/r;

    const-class v6, Ld1/k;

    const/4 v7, 0x0

    invoke-direct {v5, v6, v2, v7}, Le1/r;-><init>(Ljava/lang/Class;Lb1/x;I)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->s:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->t:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->v:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->w:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->y:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->u:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->b:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/d;->b:Le1/a;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->x:Le1/s;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-boolean v2, Lh1/b;->a:Z

    if-eqz v2, :cond_0

    sget-object v2, Lh1/b;->c:Le1/a;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Lh1/b;->b:Le1/a;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Lh1/b;->d:Le1/a;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v2, Le1/b;->d:Le1/a;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Le1/u;->a:Le1/r;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Le1/c;

    const/4 v5, 0x0

    invoke-direct {v2, v4, v5}, Le1/c;-><init>(Landroidx/activity/l;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Le1/h;

    invoke-direct {v2, v4}, Le1/h;-><init>(Landroidx/activity/l;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Le1/c;

    const/4 v5, 0x1

    invoke-direct {v2, v4, v5}, Le1/c;-><init>(Landroidx/activity/l;I)V

    iput-object v2, p0, Lb1/l;->d:Le1/c;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v5, Le1/u;->B:Le1/a;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Le1/p;

    invoke-direct {v5, v4, v0, v2, v3}, Le1/p;-><init>(Landroidx/activity/l;Ld1/i;Le1/c;Ljava/util/List;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lb1/l;->e:Ljava/util/List;

    return-void
.end method

.method public static a(D)V
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    const-class v0, Lxyz/happify/ckemv/MeResponse;

    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lb1/l;->c(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_0

    const-class v0, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_1

    const-class v0, Ljava/lang/Float;

    goto :goto_0

    :cond_1
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_2

    const-class v0, Ljava/lang/Byte;

    goto :goto_0

    :cond_2
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_3

    const-class v0, Ljava/lang/Double;

    goto :goto_0

    :cond_3
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_4

    const-class v0, Ljava/lang/Long;

    goto :goto_0

    :cond_4
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_5

    const-class v0, Ljava/lang/Character;

    goto :goto_0

    :cond_5
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_6

    const-class v0, Ljava/lang/Boolean;

    goto :goto_0

    :cond_6
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_7

    const-class v0, Ljava/lang/Short;

    goto :goto_0

    :cond_7
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_8

    const-class v0, Ljava/lang/Void;

    :cond_8
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/StringReader;

    invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    new-instance p1, Li1/a;

    invoke-direct {p1, v1}, Li1/a;-><init>(Ljava/io/StringReader;)V

    const-string v1, "AssertionError (GSON 2.10.1): "

    const/4 v2, 0x1

    iput-boolean v2, p1, Li1/a;->c:Z

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p1}, Li1/a;->W()I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0, p2}, Lb1/l;->d(Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object p2

    invoke-virtual {p2, p1}, Lb1/x;->a(Li1/a;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v3, p1, Li1/a;->c:Z

    goto :goto_5

    :catchall_0
    move-exception p2

    goto :goto_9

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    goto :goto_2

    :catch_2
    move-exception p2

    goto :goto_3

    :catch_3
    move-exception p2

    move v2, v3

    goto :goto_4

    :goto_1
    :try_start_2
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_2
    new-instance v0, Lb1/o;

    invoke-direct {v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_3
    new-instance v0, Lb1/o;

    invoke-direct {v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_4
    move-exception p2

    :goto_4
    if-eqz v2, :cond_3

    goto :goto_0

    :goto_5
    if-eqz v0, :cond_2

    :try_start_3
    invoke-virtual {p1}, Li1/a;->W()I

    move-result p1

    const/16 p2, 0xa

    if-ne p1, p2, :cond_1

    goto :goto_8

    :cond_1
    new-instance p1, Lb1/o;

    const-string p2, "JSON document was not fully consumed."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Li1/c; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    :catch_5
    move-exception p1

    goto :goto_6

    :catch_6
    move-exception p1

    goto :goto_7

    :goto_6
    new-instance p2, Lb1/o;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_7
    new-instance p2, Lb1/o;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    :goto_8
    return-object v0

    :cond_3
    :try_start_4
    new-instance v0, Lb1/o;

    invoke-direct {v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_9
    iput-boolean v3, p1, Li1/a;->c:Z

    throw p2
.end method

.method public final d(Lcom/google/gson/reflect/TypeToken;)Lb1/x;
    .locals 8

    const-string v0, "type must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lb1/l;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb1/x;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v1, p0, Lb1/l;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb1/x;

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    const/4 v3, 0x0

    :goto_0
    :try_start_0
    new-instance v4, Lb1/k;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x0

    iput-object v5, v4, Lb1/k;->a:Lb1/x;

    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, p0, Lb1/l;->e:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb1/y;

    invoke-interface {v5, p0, p1}, Lb1/y;->a(Lb1/l;Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-object v6, v4, Lb1/k;->a:Lb1/x;

    if-nez v6, :cond_4

    iput-object v5, v4, Lb1/k;->a:Lb1/x;

    invoke-interface {v2, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Delegate is already set"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_6
    if-eqz v5, :cond_8

    if-eqz v3, :cond_7

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    :cond_7
    return-object v5

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GSON (2.10.1) cannot handle "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    if-eqz v3, :cond_9

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_9
    throw p1
.end method

.method public final e(Ljava/io/Writer;)Li1/b;
    .locals 1

    new-instance v0, Li1/b;

    invoke-direct {v0, p1}, Li1/b;-><init>(Ljava/io/Writer;)V

    iget-boolean p1, p0, Lb1/l;->f:Z

    iput-boolean p1, v0, Li1/b;->g:Z

    const/4 p1, 0x0

    iput-boolean p1, v0, Li1/b;->f:Z

    iput-boolean p1, v0, Li1/b;->i:Z

    return-object v0
.end method

.method public final f(Ljava/util/Map;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    new-instance p1, Ljava/io/StringWriter;

    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1}, Lb1/l;->e(Ljava/io/Writer;)Li1/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb1/l;->g(Li1/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lb1/o;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    :try_start_1
    invoke-virtual {p0, v1}, Lb1/l;->e(Ljava/io/Writer;)Li1/b;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v2}, Lb1/l;->h(Ljava/util/Map;Ljava/lang/Class;Li1/b;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    new-instance v0, Lb1/o;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final g(Li1/b;)V
    .locals 7

    sget-object v0, Lb1/p;->b:Lb1/p;

    const-string v1, "AssertionError (GSON 2.10.1): "

    iget-boolean v2, p1, Li1/b;->f:Z

    const/4 v3, 0x1

    iput-boolean v3, p1, Li1/b;->f:Z

    iget-boolean v3, p1, Li1/b;->g:Z

    iget-boolean v4, p0, Lb1/l;->f:Z

    iput-boolean v4, p1, Li1/b;->g:Z

    iget-boolean v4, p1, Li1/b;->i:Z

    const/4 v5, 0x0

    iput-boolean v5, p1, Li1/b;->i:Z

    :try_start_0
    sget-object v5, Le1/u;->a:Le1/r;

    invoke-static {p1, v0}, Lb1/i;->d(Li1/b;Lb1/n;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, p1, Li1/b;->f:Z

    iput-boolean v3, p1, Li1/b;->g:Z

    iput-boolean v4, p1, Li1/b;->i:Z

    return-void

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v5, Ljava/lang/AssertionError;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v5

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Lb1/o;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v2, p1, Li1/b;->f:Z

    iput-boolean v3, p1, Li1/b;->g:Z

    iput-boolean v4, p1, Li1/b;->i:Z

    throw v0
.end method

.method public final h(Ljava/util/Map;Ljava/lang/Class;Li1/b;)V
    .locals 5

    const-string v0, "AssertionError (GSON 2.10.1): "

    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    invoke-virtual {p0, p2}, Lb1/l;->d(Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object p2

    iget-boolean v1, p3, Li1/b;->f:Z

    const/4 v2, 0x1

    iput-boolean v2, p3, Li1/b;->f:Z

    iget-boolean v2, p3, Li1/b;->g:Z

    iget-boolean v3, p0, Lb1/l;->f:Z

    iput-boolean v3, p3, Li1/b;->g:Z

    iget-boolean v3, p3, Li1/b;->i:Z

    const/4 v4, 0x0

    iput-boolean v4, p3, Li1/b;->i:Z

    :try_start_0
    invoke-virtual {p2, p3, p1}, Lb1/x;->b(Li1/b;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p3, Li1/b;->f:Z

    iput-boolean v2, p3, Li1/b;->g:Z

    iput-boolean v3, p3, Li1/b;->i:Z

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Lb1/o;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v1, p3, Li1/b;->f:Z

    iput-boolean v2, p3, Li1/b;->g:Z

    iput-boolean v3, p3, Li1/b;->i:Z

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:false,factories:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lb1/l;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb1/l;->c:Landroidx/activity/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
