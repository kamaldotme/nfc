.class public final Le1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/y;


# instance fields
.field public final b:Landroidx/activity/l;

.field public final c:Z


# direct methods
.method public constructor <init>(Landroidx/activity/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/h;->b:Landroidx/activity/l;

    const/4 p1, 0x0

    iput-boolean p1, p0, Le1/h;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lb1/l;Lcom/google/gson/reflect/TypeToken;)Lb1/x;
    .locals 12

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ljava/util/Map;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-nez v6, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-class v6, Ljava/util/Properties;

    if-ne v3, v6, :cond_1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v3, Ljava/lang/String;

    aput-object v3, v0, v2

    aput-object v3, v0, v1

    goto :goto_0

    :cond_1
    instance-of v6, v3, Ljava/lang/reflect/WildcardType;

    if-eqz v6, :cond_2

    check-cast v3, Ljava/lang/reflect/WildcardType;

    invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v3

    aget-object v3, v3, v2

    :cond_2
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    invoke-static {v6}, Ld1/d;->b(Z)V

    invoke-static {v3, v4, v5}, Ld1/d;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v5

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-static {v3, v4, v5, v6}, Ld1/d;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v3, Ljava/lang/Object;

    aput-object v3, v0, v2

    aput-object v3, v0, v1

    :goto_0
    aget-object v3, v0, v2

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v3, v4, :cond_5

    const-class v4, Ljava/lang/Boolean;

    if-ne v3, v4, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v3}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v3

    invoke-virtual {p1, v3}, Lb1/l;->d(Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object v3

    :goto_1
    move-object v8, v3

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v3, Le1/u;->c:Lb1/i;

    goto :goto_1

    :goto_3
    aget-object v3, v0, v1

    invoke-static {v3}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v3

    invoke-virtual {p1, v3}, Lb1/l;->d(Lcom/google/gson/reflect/TypeToken;)Lb1/x;

    move-result-object v10

    iget-object v3, p0, Le1/h;->b:Landroidx/activity/l;

    invoke-virtual {v3, p2}, Landroidx/activity/l;->b(Lcom/google/gson/reflect/TypeToken;)Ld1/p;

    move-result-object v11

    new-instance p2, Le1/g;

    aget-object v7, v0, v2

    aget-object v9, v0, v1

    move-object v4, p2

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v4 .. v11}, Le1/g;-><init>(Le1/h;Lb1/l;Ljava/lang/reflect/Type;Lb1/x;Ljava/lang/reflect/Type;Lb1/x;Ld1/p;)V

    return-object p2
.end method
