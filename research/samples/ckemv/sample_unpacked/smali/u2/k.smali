.class public final Lu2/k;
.super Lu2/n;
.source "SourceFile"


# static fields
.field public static final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 14

    const/4 v0, 0x1

    const/16 v1, 0xa

    const-string v2, "java.specification.version"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_9

    invoke-static {v1}, Lv0/f;->n(I)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x30

    invoke-static {v6, v7}, LX1/g;->f(II)I

    move-result v7

    const v8, -0x7fffffff

    if-gez v7, :cond_3

    if-ne v5, v0, :cond_1

    goto :goto_3

    :cond_1
    const/16 v7, 0x2d

    if-ne v6, v7, :cond_2

    const/high16 v8, -0x80000000

    move v6, v0

    :goto_0
    move v7, v6

    goto :goto_1

    :cond_2
    const/16 v7, 0x2b

    if-ne v6, v7, :cond_9

    move v6, v0

    move v7, v3

    goto :goto_1

    :cond_3
    move v6, v3

    goto :goto_0

    :goto_1
    const v9, -0x38e38e3

    move v10, v3

    move v11, v9

    :goto_2
    if-ge v6, v5, :cond_7

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-static {v12, v1}, Ljava/lang/Character;->digit(II)I

    move-result v12

    if-gez v12, :cond_4

    goto :goto_3

    :cond_4
    if-ge v10, v11, :cond_5

    if-ne v11, v9, :cond_9

    div-int/lit8 v11, v8, 0xa

    if-ge v10, v11, :cond_5

    goto :goto_3

    :cond_5
    mul-int/2addr v10, v1

    add-int v13, v8, v12

    if-ge v10, v13, :cond_6

    goto :goto_3

    :cond_6
    sub-int/2addr v10, v12

    add-int/2addr v6, v0

    goto :goto_2

    :cond_7
    if-eqz v7, :cond_8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_4

    :cond_8
    neg-int v1, v10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_4

    :cond_9
    :goto_3
    move-object v1, v4

    :goto_4
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x9

    if-lt v1, v2, :cond_a

    goto :goto_5

    :catch_0
    :cond_a
    move v0, v3

    goto :goto_5

    :cond_b
    :try_start_0
    const-class v1, Ljavax/net/ssl/SSLSocket;

    const-string v2, "getApplicationProtocol"

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_5
    sput-boolean v0, Lu2/k;->c:Z

    return-void
.end method


# virtual methods
.method public final d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 4

    const-string p2, "protocols"

    invoke-static {p3, p2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSSLParameters()Ljavax/net/ssl/SSLParameters;

    move-result-object p2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lm2/p;

    sget-object v3, Lm2/p;->c:Lm2/p;

    if-eq v2, v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p3, Ljava/util/ArrayList;

    invoke-static {v0}, LL1/m;->S(Ljava/lang/Iterable;)I

    move-result v1

    invoke-direct {p3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/p;

    iget-object v1, v1, Lm2/p;->b:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    invoke-static {p2, p3}, Lj0/x;->e(Ljavax/net/ssl/SSLParameters;[Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setSSLParameters(Ljavax/net/ssl/SSLParameters;)V

    return-void
.end method

.method public final f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Lj0/x;->b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, ""

    invoke-static {p1, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    :catch_0
    :goto_0
    return-object v0
.end method
