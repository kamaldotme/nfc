.class public final Ld1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld1/p;
.implements Le0/b;
.implements Lj/y;


# static fields
.field public static c:Ld1/e;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ld1/e;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final d([B[[BI)Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, -0x1

    const/4 v3, 0x1

    sget-object v4, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->e:[B

    array-length v4, v0

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_b

    add-int v7, v6, v4

    div-int/lit8 v7, v7, 0x2

    :goto_1
    const/16 v8, 0xa

    if-le v7, v2, :cond_0

    aget-byte v9, v0, v7

    if-eq v9, v8, :cond_0

    add-int/2addr v7, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v9, v7, 0x1

    move v10, v3

    :goto_2
    add-int v11, v9, v10

    aget-byte v12, v0, v11

    if-eq v12, v8, :cond_1

    add-int/2addr v10, v3

    goto :goto_2

    :cond_1
    sub-int v8, v11, v9

    move/from16 v12, p2

    move v10, v5

    move v13, v10

    move v14, v13

    :goto_3
    if-eqz v10, :cond_2

    const/16 v10, 0x2e

    move v15, v5

    goto :goto_4

    :cond_2
    aget-object v15, v1, v12

    aget-byte v15, v15, v13

    sget-object v16, Ln2/b;->a:[B

    and-int/lit16 v15, v15, 0xff

    move/from16 v17, v15

    move v15, v10

    move/from16 v10, v17

    :goto_4
    add-int v16, v9, v14

    aget-byte v2, v0, v16

    sget-object v16, Ln2/b;->a:[B

    and-int/lit16 v2, v2, 0xff

    sub-int/2addr v10, v2

    if-nez v10, :cond_5

    add-int/2addr v14, v3

    add-int/2addr v13, v3

    if-eq v14, v8, :cond_5

    aget-object v2, v1, v12

    array-length v2, v2

    if-ne v2, v13, :cond_4

    array-length v2, v1

    sub-int/2addr v2, v3

    if-ne v12, v2, :cond_3

    goto :goto_5

    :cond_3
    add-int/2addr v12, v3

    move v10, v3

    const/4 v2, -0x1

    const/4 v13, -0x1

    goto :goto_3

    :cond_4
    move v10, v15

    const/4 v2, -0x1

    goto :goto_3

    :cond_5
    :goto_5
    if-gez v10, :cond_6

    :goto_6
    move v4, v7

    :goto_7
    const/4 v2, -0x1

    goto :goto_0

    :cond_6
    if-lez v10, :cond_7

    :goto_8
    add-int/lit8 v6, v11, 0x1

    goto :goto_7

    :cond_7
    sub-int v2, v8, v14

    aget-object v10, v1, v12

    array-length v10, v10

    sub-int/2addr v10, v13

    add-int/2addr v12, v3

    array-length v13, v1

    :goto_9
    if-ge v12, v13, :cond_8

    aget-object v14, v1, v12

    array-length v14, v14

    add-int/2addr v10, v14

    add-int/2addr v12, v3

    goto :goto_9

    :cond_8
    if-ge v10, v2, :cond_9

    goto :goto_6

    :cond_9
    if-le v10, v2, :cond_a

    goto :goto_8

    :cond_a
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "UTF_8"

    invoke-static {v1, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, v9, v8, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_a

    :cond_b
    const/4 v2, 0x0

    :goto_a
    return-object v2
.end method

.method public static e(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    const-string v0, "protocols"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lm2/p;

    sget-object v3, Lm2/p;->c:Lm2/p;

    if-eq v2, v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-static {v0}, LL1/m;->S(Ljava/lang/Iterable;)I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

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

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object p0
.end method

.method public static f(Ljava/util/List;)[B
    .locals 3

    const-string v0, "protocols"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz2/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Ld1/e;->e(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2}, Lz2/f;->L(I)V

    invoke-virtual {v0, v1}, Lz2/f;->Q(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-wide v1, v0, Lz2/f;->c:J

    invoke-virtual {v0, v1, v2}, Lz2/f;->o(J)[B

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/lang/String;)Lz2/i;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, LA2/b;->a(C)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, LA2/b;->a(C)I

    move-result v3

    add-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Lz2/i;

    invoke-direct {p0, v1}, Lz2/i;-><init>([B)V

    return-object p0

    :cond_1
    const-string v0, "Unexpected hex string: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static i(Ljava/lang/String;)Lz2/i;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz2/i;

    sget-object v1, Ld2/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "this as java.lang.String).getBytes(charset)"

    invoke-static {v1, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lz2/i;-><init>([B)V

    iput-object p0, v0, Lz2/i;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static j(FFFF)Landroid/graphics/Path;
    .locals 1

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    invoke-virtual {v0, p0, p1}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {v0, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    return-object v0
.end method

.method public static k()Z
    .locals 2

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Dalvik"

    invoke-static {v1, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static l([B)Lz2/i;
    .locals 8

    sget-object v0, Lz2/i;->e:Lz2/i;

    array-length v0, p0

    array-length v1, p0

    int-to-long v2, v1

    const/4 v1, 0x0

    int-to-long v4, v1

    int-to-long v6, v0

    invoke-static/range {v2 .. v7}, Lv0/f;->m(JJJ)V

    new-instance v2, Lz2/i;

    array-length v3, p0

    invoke-static {v0, v3}, Lu2/l;->e(II)V

    invoke-static {p0, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    const-string v0, "copyOfRange(...)"

    invoke-static {p0, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p0}, Lz2/i;-><init>([B)V

    return-object v2
.end method


# virtual methods
.method public a(Lj/m;Z)V
    .locals 0

    return-void
.end method

.method public b(Lj/m;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public c(Le0/a;)Le0/c;
    .locals 7

    new-instance v6, Lf0/g;

    iget-object v2, p1, Le0/a;->b:Ljava/lang/String;

    iget-object v3, p1, Le0/a;->c:LJ1/l;

    iget-object v1, p1, Le0/a;->a:Landroid/content/Context;

    iget-boolean v4, p1, Le0/a;->d:Z

    iget-boolean v5, p1, Le0/a;->e:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lf0/g;-><init>(Landroid/content/Context;Ljava/lang/String;LJ1/l;ZZ)V

    return-object v6
.end method

.method public g()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ld1/e;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld1/o;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld1/o;-><init>(Z)V

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
