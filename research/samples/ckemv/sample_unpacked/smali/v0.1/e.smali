.class public final Lv0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lv0/e;->a:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ln/k;

    invoke-direct {v0}, Ln/k;-><init>()V

    iput-object v0, p0, Lv0/e;->b:Ljava/lang/Object;

    .line 22
    new-instance v0, Ln/e;

    invoke-direct {v0}, Ln/e;-><init>()V

    iput-object v0, p0, Lv0/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lv0/e;->a:I

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, Lv0/e;->b:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 55
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Lv0/e;->c:Ljava/lang/Object;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lv0/e;->a:I

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, Lv0/e;->b:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 58
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Lv0/e;->c:Ljava/lang/Object;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(LD1/a;[I)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lv0/e;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    array-length v0, p2

    if-eqz v0, :cond_3

    .line 4
    iput-object p1, p0, Lv0/e;->b:Ljava/lang/Object;

    .line 5
    array-length p1, p2

    const/4 v0, 0x1

    if-le p1, v0, :cond_2

    const/4 v1, 0x0

    .line 6
    aget v2, p2, v1

    if-nez v2, :cond_2

    :goto_0
    if-ge v0, p1, :cond_0

    .line 7
    aget v2, p2, v0

    if-nez v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-ne v0, p1, :cond_1

    .line 8
    filled-new-array {v1}, [I

    move-result-object p1

    iput-object p1, p0, Lv0/e;->c:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    sub-int/2addr p1, v0

    .line 9
    new-array v2, p1, [I

    iput-object v2, p0, Lv0/e;->c:Ljava/lang/Object;

    .line 10
    invoke-static {p2, v0, v2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 11
    :cond_2
    iput-object p2, p0, Lv0/e;->c:Ljava/lang/Object;

    :goto_1
    return-void

    .line 12
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public constructor <init>(Landroidx/lifecycle/r;Landroidx/lifecycle/O;)V
    .locals 5

    const/4 v0, 0x3

    iput v0, p0, Lv0/e;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lv0/e;->b:Ljava/lang/Object;

    .line 25
    const-string p1, "store"

    invoke-static {p2, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LW/a;->d:LU0/e;

    const-string v0, "factory"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    sget-object v0, LV/a;->b:LV/a;

    .line 27
    const-string v1, "defaultCreationExtras"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    const-class v1, LW/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 29
    const-string v3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 30
    const-string v3, "key"

    invoke-static {v2, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object p2, p2, Landroidx/lifecycle/O;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p2, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/M;

    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 33
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    invoke-static {v3, p1}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 34
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    iget-object v0, v0, LV/b;->a:Ljava/util/LinkedHashMap;

    .line 36
    invoke-interface {v3, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 37
    sget-object v0, Landroidx/lifecycle/N;->b:Landroidx/lifecycle/N;

    .line 38
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :try_start_0
    invoke-virtual {p1, v1}, LU0/e;->b(Ljava/lang/Class;)Landroidx/lifecycle/M;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v3, p1

    goto :goto_1

    .line 40
    :catch_0
    invoke-virtual {p1, v1}, LU0/e;->b(Ljava/lang/Class;)Landroidx/lifecycle/M;

    move-result-object p1

    goto :goto_0

    .line 41
    :goto_1
    const-string p1, "viewModel"

    invoke-static {v3, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-interface {p2, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/M;

    if-eqz p1, :cond_1

    .line 43
    invoke-virtual {p1}, Landroidx/lifecycle/M;->a()V

    .line 44
    :cond_1
    :goto_2
    check-cast v3, LW/a;

    .line 45
    iput-object v3, p0, Lv0/e;->c:Ljava/lang/Object;

    return-void

    .line 46
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lv0/e;->a:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lv0/e;->b:Ljava/lang/Object;

    .line 15
    new-instance v0, Lv0/b;

    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p1, v1}, Lv0/b;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    .line 17
    iput-object v0, p0, Lv0/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lv0/e;->a:I

    iput-object p1, p0, Lv0/e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lv0/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    const/4 v0, 0x7

    iput v0, p0, Lv0/e;->a:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 49
    new-array v1, v0, [I

    iput-object v1, p0, Lv0/e;->b:Ljava/lang/Object;

    .line 50
    new-array v1, v0, [F

    iput-object v1, p0, Lv0/e;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 51
    iget-object v2, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v2, [I

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    .line 52
    iget-object v2, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v2, [F

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lp1/e;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lv0/e;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lv0/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lv0/e;)Lv0/e;
    .locals 8

    iget-object v0, p1, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, LD1/a;

    iget-object v1, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v1, LD1/a;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lv0/e;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lv0/e;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    iget-object v0, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, [I

    array-length v2, v0

    iget-object p1, p1, Lv0/e;->c:Ljava/lang/Object;

    check-cast p1, [I

    array-length v3, p1

    if-le v2, v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_0
    array-length v2, v0

    new-array v2, v2, [I

    array-length v3, v0

    array-length v4, p1

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v4, v3

    :goto_1
    array-length v5, v0

    if-ge v4, v5, :cond_3

    sub-int v5, v4, v3

    aget v5, p1, v5

    aget v6, v0, v4

    invoke-virtual {v1, v5, v6}, LD1/a;->a(II)I

    move-result v5

    aput v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Lv0/e;

    invoke-direct {p1, v1, v2}, Lv0/e;-><init>(LD1/a;[I)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ModulusPolys do not have same ModulusGF field"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(LZ/W;LA1/i;)V
    .locals 2

    iget-object v0, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ/f0;

    if-nez v1, :cond_0

    invoke-static {}, LZ/f0;->a()LZ/f0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v1, LZ/f0;->c:LA1/i;

    iget p1, v1, LZ/f0;->a:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v1, LZ/f0;->a:I

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/io/PrintWriter;)V
    .locals 3

    iget-object v0, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, LW/a;

    iget-object v0, v0, LW/a;->c:Ln/l;

    iget v1, v0, Ln/l;->d:I

    if-lez v1, :cond_1

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Loaders:"

    invoke-virtual {p2, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget v1, v0, Ln/l;->d:I

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Ln/l;->c:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v1}, LX/d;->q(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  #"

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p1, v0, Ln/l;->b:[I

    aget p1, p1, v2

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(I)V

    const-string p1, ": "

    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public d(I)I
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Lv0/e;->g(I)I

    move-result p1

    return p1

    :cond_0
    iget-object v1, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v1, LD1/a;

    iget-object v2, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v2, [I

    const/4 v3, 0x1

    if-ne p1, v3, :cond_2

    array-length p1, v2

    move v3, v0

    :goto_0
    if-ge v0, p1, :cond_1

    aget v4, v2, v0

    invoke-virtual {v1, v3, v4}, LD1/a;->a(II)I

    move-result v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v3

    :cond_2
    aget v0, v2, v0

    array-length v4, v2

    :goto_1
    if-ge v3, v4, :cond_3

    invoke-virtual {v1, p1, v0}, LD1/a;->c(II)I

    move-result v0

    aget v5, v2, v3

    invoke-virtual {v1, v0, v5}, LD1/a;->a(II)I

    move-result v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return v0
.end method

.method public e()Lp1/b;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v1, Lp1/b;

    if-nez v1, :cond_20

    iget-object v1, v0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v1, Lp1/e;

    iget-object v2, v1, Lp1/e;->d:Lp1/b;

    if-eqz v2, :cond_0

    goto/16 :goto_12

    :cond_0
    iget-object v2, v1, Lp1/e;->a:Lj1/f;

    iget v3, v2, Lj1/f;->a:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/16 v6, 0x28

    iget v8, v2, Lj1/f;->b:I

    if-lt v3, v6, :cond_18

    if-lt v8, v6, :cond_18

    invoke-virtual {v2}, Lj1/f;->a()[B

    move-result-object v2

    shr-int/lit8 v6, v3, 0x3

    and-int/lit8 v9, v3, 0x7

    if-eqz v9, :cond_1

    add-int/lit8 v6, v6, 0x1

    :cond_1
    shr-int/lit8 v9, v8, 0x3

    and-int/lit8 v10, v8, 0x7

    if-eqz v10, :cond_2

    add-int/lit8 v9, v9, 0x1

    :cond_2
    add-int/lit8 v10, v8, -0x8

    add-int/lit8 v11, v3, -0x8

    const/4 v12, 0x2

    new-array v13, v12, [I

    aput v6, v13, v5

    aput v9, v13, v4

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v14, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, [[I

    move v14, v4

    :goto_0
    const/16 v15, 0x8

    if-ge v14, v9, :cond_d

    shl-int/lit8 v4, v14, 0x3

    if-le v4, v10, :cond_3

    move v4, v10

    :cond_3
    const/4 v12, 0x0

    :goto_1
    if-ge v12, v6, :cond_c

    shl-int/lit8 v5, v12, 0x3

    if-le v5, v11, :cond_4

    move v5, v11

    :cond_4
    mul-int v18, v4, v3

    add-int v18, v18, v5

    const/4 v5, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xff

    :goto_2
    if-ge v5, v15, :cond_a

    move/from16 v22, v4

    move/from16 v7, v20

    move/from16 v4, v21

    const/4 v0, 0x0

    :goto_3
    if-ge v0, v15, :cond_7

    add-int v20, v18, v0

    aget-byte v15, v2, v20

    move-object/from16 v23, v1

    const/16 v1, 0xff

    and-int/2addr v15, v1

    add-int v19, v19, v15

    if-ge v15, v4, :cond_5

    move v4, v15

    :cond_5
    if-le v15, v7, :cond_6

    move v7, v15

    :cond_6
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, v23

    const/16 v15, 0x8

    goto :goto_3

    :cond_7
    move-object/from16 v23, v1

    sub-int v0, v7, v4

    const/16 v1, 0x18

    if-le v0, v1, :cond_9

    :cond_8
    add-int/lit8 v5, v5, 0x1

    add-int v18, v18, v3

    const/16 v0, 0x8

    if-ge v5, v0, :cond_9

    const/4 v1, 0x0

    :goto_4
    if-ge v1, v0, :cond_8

    add-int v0, v18, v1

    aget-byte v0, v2, v0

    const/16 v15, 0xff

    and-int/2addr v0, v15

    add-int v19, v19, v0

    add-int/lit8 v1, v1, 0x1

    const/16 v0, 0x8

    goto :goto_4

    :cond_9
    const/4 v0, 0x1

    add-int/2addr v5, v0

    add-int v18, v18, v3

    const/16 v15, 0x8

    move-object/from16 v0, p0

    move/from16 v21, v4

    move/from16 v20, v7

    move/from16 v4, v22

    move-object/from16 v1, v23

    goto :goto_2

    :cond_a
    move-object/from16 v23, v1

    move/from16 v22, v4

    shr-int/lit8 v0, v19, 0x6

    move/from16 v4, v21

    sub-int v1, v20, v4

    const/16 v5, 0x18

    if-gt v1, v5, :cond_b

    div-int/lit8 v0, v4, 0x2

    if-lez v14, :cond_b

    if-lez v12, :cond_b

    add-int/lit8 v1, v14, -0x1

    aget-object v1, v13, v1

    aget v5, v1, v12

    aget-object v7, v13, v14

    add-int/lit8 v15, v12, -0x1

    aget v7, v7, v15

    const/16 v16, 0x2

    mul-int/lit8 v7, v7, 0x2

    add-int/2addr v7, v5

    aget v1, v1, v15

    add-int/2addr v7, v1

    div-int/lit8 v1, v7, 0x4

    if-ge v4, v1, :cond_b

    move v0, v1

    :cond_b
    aget-object v1, v13, v14

    aput v0, v1, v12

    add-int/lit8 v12, v12, 0x1

    const/4 v5, 0x1

    const/16 v15, 0x8

    move-object/from16 v0, p0

    move/from16 v4, v22

    move-object/from16 v1, v23

    goto/16 :goto_1

    :cond_c
    move-object/from16 v23, v1

    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v12, 0x2

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_d
    move-object/from16 v23, v1

    new-instance v0, Lp1/b;

    invoke-direct {v0, v3, v8}, Lp1/b;-><init>(II)V

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v9, :cond_17

    shl-int/lit8 v4, v1, 0x3

    if-le v4, v10, :cond_e

    move v4, v10

    :cond_e
    add-int/lit8 v5, v9, -0x3

    const/4 v7, 0x2

    if-ge v1, v7, :cond_f

    const/4 v5, 0x2

    goto :goto_6

    :cond_f
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    :goto_6
    const/4 v7, 0x0

    :goto_7
    if-ge v7, v6, :cond_16

    shl-int/lit8 v8, v7, 0x3

    if-le v8, v11, :cond_10

    move v8, v11

    :cond_10
    add-int/lit8 v12, v6, -0x3

    const/4 v14, 0x2

    if-ge v7, v14, :cond_11

    move v12, v14

    goto :goto_8

    :cond_11
    invoke-static {v7, v12}, Ljava/lang/Math;->min(II)I

    move-result v16

    move/from16 v12, v16

    :goto_8
    const/4 v15, -0x2

    const/16 v17, 0x0

    :goto_9
    if-gt v15, v14, :cond_12

    add-int v14, v5, v15

    aget-object v14, v13, v14

    add-int/lit8 v18, v12, -0x2

    aget v18, v14, v18

    add-int/lit8 v19, v12, -0x1

    aget v19, v14, v19

    add-int v18, v18, v19

    aget v19, v14, v12

    add-int v18, v18, v19

    add-int/lit8 v19, v12, 0x1

    aget v19, v14, v19

    add-int v18, v18, v19

    const/16 v16, 0x2

    add-int/lit8 v19, v12, 0x2

    aget v14, v14, v19

    add-int v18, v18, v14

    add-int v17, v18, v17

    add-int/lit8 v15, v15, 0x1

    move/from16 v14, v16

    goto :goto_9

    :cond_12
    move/from16 v16, v14

    div-int/lit8 v12, v17, 0x19

    mul-int v14, v4, v3

    add-int/2addr v14, v8

    move/from16 v17, v5

    const/4 v5, 0x0

    :goto_a
    const/16 v15, 0x8

    if-ge v5, v15, :cond_15

    move/from16 v18, v6

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v15, :cond_14

    add-int v19, v14, v6

    aget-byte v15, v2, v19

    move-object/from16 v19, v2

    const/16 v2, 0xff

    and-int/2addr v15, v2

    if-gt v15, v12, :cond_13

    add-int v2, v8, v6

    add-int v15, v4, v5

    invoke-virtual {v0, v2, v15}, Lp1/b;->f(II)V

    :cond_13
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v2, v19

    const/16 v15, 0x8

    goto :goto_b

    :cond_14
    move-object/from16 v19, v2

    add-int/lit8 v5, v5, 0x1

    add-int/2addr v14, v3

    move/from16 v6, v18

    goto :goto_a

    :cond_15
    move-object/from16 v19, v2

    move/from16 v18, v6

    add-int/lit8 v7, v7, 0x1

    move/from16 v5, v17

    goto :goto_7

    :cond_16
    move-object/from16 v19, v2

    move/from16 v18, v6

    const/16 v16, 0x2

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_5

    :cond_17
    move-object/from16 v1, v23

    iput-object v0, v1, Lp1/e;->d:Lp1/b;

    goto/16 :goto_11

    :cond_18
    new-instance v0, Lp1/b;

    invoke-direct {v0, v3, v8}, Lp1/b;-><init>(II)V

    iget-object v4, v1, Lp1/e;->b:[B

    array-length v4, v4

    if-ge v4, v3, :cond_19

    new-array v4, v3, [B

    iput-object v4, v1, Lp1/e;->b:[B

    :cond_19
    const/4 v4, 0x0

    :goto_c
    const/16 v5, 0x20

    iget-object v6, v1, Lp1/e;->c:[I

    if-ge v4, v5, :cond_1a

    const/4 v5, 0x0

    aput v5, v6, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_1a
    const/4 v5, 0x0

    const/4 v4, 0x1

    :goto_d
    const/4 v7, 0x5

    if-ge v4, v7, :cond_1c

    mul-int v9, v8, v4

    div-int/2addr v9, v7

    iget-object v10, v1, Lp1/e;->b:[B

    invoke-virtual {v2, v9, v10}, Lj1/f;->b(I[B)[B

    move-result-object v9

    shl-int/lit8 v10, v3, 0x2

    div-int/2addr v10, v7

    div-int/lit8 v7, v3, 0x5

    :goto_e
    if-ge v7, v10, :cond_1b

    aget-byte v11, v9, v7

    const/16 v12, 0xff

    and-int/2addr v11, v12

    shr-int/lit8 v11, v11, 0x3

    aget v12, v6, v11

    const/4 v13, 0x1

    add-int/2addr v12, v13

    aput v12, v6, v11

    add-int/lit8 v7, v7, 0x1

    goto :goto_e

    :cond_1b
    const/4 v13, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_d

    :cond_1c
    invoke-static {v6}, Lp1/e;->a([I)I

    move-result v4

    invoke-virtual {v2}, Lj1/f;->a()[B

    move-result-object v2

    move v6, v5

    :goto_f
    if-ge v6, v8, :cond_1f

    mul-int v7, v6, v3

    move v9, v5

    :goto_10
    if-ge v9, v3, :cond_1e

    add-int v10, v7, v9

    aget-byte v10, v2, v10

    const/16 v11, 0xff

    and-int/2addr v10, v11

    if-ge v10, v4, :cond_1d

    invoke-virtual {v0, v9, v6}, Lp1/b;->f(II)V

    :cond_1d
    add-int/lit8 v9, v9, 0x1

    goto :goto_10

    :cond_1e
    const/16 v11, 0xff

    add-int/lit8 v6, v6, 0x1

    goto :goto_f

    :cond_1f
    iput-object v0, v1, Lp1/e;->d:Lp1/b;

    :goto_11
    iget-object v2, v1, Lp1/e;->d:Lp1/b;

    move-object/from16 v0, p0

    :goto_12
    iput-object v2, v0, Lv0/e;->c:Ljava/lang/Object;

    :cond_20
    iget-object v1, v0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v1, Lp1/b;

    return-object v1
.end method

.method public f(Lp1/a;I)Lp1/a;
    .locals 10

    iget-object v0, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, Lp1/e;

    iget-object v1, v0, Lp1/e;->a:Lj1/f;

    iget v2, v1, Lj1/f;->a:I

    iget v3, p1, Lp1/a;->c:I

    const/4 v4, 0x0

    if-ge v3, v2, :cond_0

    new-instance p1, Lp1/a;

    invoke-direct {p1, v2}, Lp1/a;-><init>(I)V

    goto :goto_1

    :cond_0
    iget-object v3, p1, Lp1/a;->b:[I

    array-length v3, v3

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    iget-object v6, p1, Lp1/a;->b:[I

    aput v4, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v3, v0, Lp1/e;->b:[B

    array-length v3, v3

    if-ge v3, v2, :cond_2

    new-array v3, v2, [B

    iput-object v3, v0, Lp1/e;->b:[B

    :cond_2
    move v3, v4

    :goto_2
    const/16 v5, 0x20

    iget-object v6, v0, Lp1/e;->c:[I

    if-ge v3, v5, :cond_3

    aput v4, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v0, v0, Lp1/e;->b:[B

    invoke-virtual {v1, p2, v0}, Lj1/f;->b(I[B)[B

    move-result-object p2

    move v0, v4

    :goto_3
    const/4 v1, 0x1

    const/4 v3, 0x3

    if-ge v0, v2, :cond_4

    aget-byte v5, p2, v0

    and-int/lit16 v5, v5, 0xff

    shr-int/lit8 v3, v5, 0x3

    aget v5, v6, v3

    add-int/2addr v5, v1

    aput v5, v6, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    invoke-static {v6}, Lp1/e;->a([I)I

    move-result v0

    if-ge v2, v3, :cond_6

    :goto_4
    if-ge v4, v2, :cond_8

    aget-byte v1, p2, v4

    and-int/lit16 v1, v1, 0xff

    if-ge v1, v0, :cond_5

    invoke-virtual {p1, v4}, Lp1/a;->f(I)V

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_6
    aget-byte v3, p2, v4

    and-int/lit16 v3, v3, 0xff

    aget-byte v4, p2, v1

    and-int/lit16 v4, v4, 0xff

    move v5, v1

    move v9, v4

    move v4, v3

    move v3, v9

    :goto_5
    add-int/lit8 v6, v2, -0x1

    if-ge v5, v6, :cond_8

    add-int/lit8 v6, v5, 0x1

    aget-byte v7, p2, v6

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v8, v3, 0x2

    sub-int/2addr v8, v4

    sub-int/2addr v8, v7

    div-int/lit8 v8, v8, 0x2

    if-ge v8, v0, :cond_7

    invoke-virtual {p1, v5}, Lp1/a;->f(I)V

    :cond_7
    move v4, v3

    move v5, v6

    move v3, v7

    goto :goto_5

    :cond_8
    return-object p1
.end method

.method public g(I)I
    .locals 2

    iget-object v0, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, [I

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    aget p1, v0, v1

    return p1
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, [I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public i(Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    const-string v0, "SELECT long_value FROM Preference where `key`=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, La0/j;->h(Ljava/lang/String;I)V

    iget-object p1, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->b()V

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    return-object v1

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, La0/j;->o()V

    throw v1
.end method

.method public j(Lv0/d;)V
    .locals 2

    iget-object v0, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->b()V

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    iget-object v1, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v1, Lv0/b;

    invoke-virtual {v1, p1}, Lv0/b;->t(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->k()V

    throw p1
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public l(I)Lv0/e;
    .locals 6

    iget-object v0, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, LD1/a;

    if-nez p1, :cond_0

    iget-object p1, v0, LD1/a;->c:Lv0/e;

    return-object p1

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    return-object p0

    :cond_1
    iget-object v1, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    new-array v3, v2, [I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget v5, v1, v4

    invoke-virtual {v0, v5, p1}, LD1/a;->c(II)I

    move-result v5

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lv0/e;

    invoke-direct {p1, v0, v3}, Lv0/e;-><init>(LD1/a;[I)V

    return-object p1
.end method

.method public m(Lv0/e;)Lv0/e;
    .locals 12

    iget-object v0, p1, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, LD1/a;

    iget-object v1, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v1, LD1/a;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lv0/e;->k()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lv0/e;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, [I

    array-length v2, v0

    iget-object p1, p1, Lv0/e;->c:Ljava/lang/Object;

    check-cast p1, [I

    array-length v3, p1

    add-int v4, v2, v3

    add-int/lit8 v4, v4, -0x1

    new-array v4, v4, [I

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v2, :cond_2

    aget v7, v0, v6

    move v8, v5

    :goto_1
    if-ge v8, v3, :cond_1

    add-int v9, v6, v8

    aget v10, v4, v9

    aget v11, p1, v8

    invoke-virtual {v1, v7, v11}, LD1/a;->c(II)I

    move-result v11

    invoke-virtual {v1, v10, v11}, LD1/a;->a(II)I

    move-result v10

    aput v10, v4, v9

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lv0/e;

    invoke-direct {p1, v1, v4}, Lv0/e;-><init>(LD1/a;[I)V

    return-object p1

    :cond_3
    :goto_2
    iget-object p1, v1, LD1/a;->c:Lv0/e;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ModulusPolys do not have same ModulusGF field"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(LZ/W;I)LA1/i;
    .locals 5

    iget-object v0, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, Ln/k;

    invoke-virtual {v0, p1}, Ln/k;->e(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, 0x0

    if-gez p1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Ln/k;->j(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZ/f0;

    if-eqz v2, :cond_4

    iget v3, v2, LZ/f0;->a:I

    and-int v4, v3, p2

    if-eqz v4, :cond_4

    not-int v4, p2

    and-int/2addr v3, v4

    iput v3, v2, LZ/f0;->a:I

    const/4 v4, 0x4

    if-ne p2, v4, :cond_1

    iget-object p2, v2, LZ/f0;->b:LA1/i;

    goto :goto_0

    :cond_1
    const/16 v4, 0x8

    if-ne p2, v4, :cond_3

    iget-object p2, v2, LZ/f0;->c:LA1/i;

    :goto_0
    and-int/lit8 v3, v3, 0xc

    if-nez v3, :cond_2

    invoke-virtual {v0, p1}, Ln/k;->i(I)Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v2, LZ/f0;->a:I

    iput-object v1, v2, LZ/f0;->b:LA1/i;

    iput-object v1, v2, LZ/f0;->c:LA1/i;

    sget-object p1, LZ/f0;->d:LI/b;

    invoke-virtual {p1, v2}, LI/b;->c(Ljava/lang/Object;)Z

    :cond_2
    return-object p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must provide flag PRE or POST"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v1
.end method

.method public o(LZ/W;)V
    .locals 2

    iget-object v0, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZ/f0;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p1, LZ/f0;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, LZ/f0;->a:I

    return-void
.end method

.method public p(LZ/W;)V
    .locals 6

    iget-object v0, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, Ln/e;

    invoke-virtual {v0}, Ln/e;->f()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {v0, v1}, Ln/e;->g(I)Ljava/lang/Object;

    move-result-object v3

    if-ne p1, v3, :cond_0

    iget-object v3, v0, Ln/e;->d:[Ljava/lang/Object;

    aget-object v4, v3, v1

    sget-object v5, Ln/e;->f:Ljava/lang/Object;

    if-eq v4, v5, :cond_1

    aput-object v5, v3, v1

    iput-boolean v2, v0, Ln/e;->b:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, Ln/k;

    invoke-virtual {v0, p1}, Ln/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZ/f0;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    iput v0, p1, LZ/f0;->a:I

    const/4 v0, 0x0

    iput-object v0, p1, LZ/f0;->b:LA1/i;

    iput-object v0, p1, LZ/f0;->c:LA1/i;

    sget-object v0, LZ/f0;->d:LI/b;

    invoke-virtual {v0, p1}, LI/b;->c(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public q(Lv0/e;)Lv0/e;
    .locals 6

    iget-object v0, p1, Lv0/e;->b:Ljava/lang/Object;

    check-cast v0, LD1/a;

    iget-object v1, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v1, LD1/a;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lv0/e;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p1, Lv0/e;->c:Ljava/lang/Object;

    check-cast v0, [I

    array-length v1, v0

    new-array v2, v1, [I

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p1, Lv0/e;->b:Ljava/lang/Object;

    check-cast v4, LD1/a;

    if-ge v3, v1, :cond_1

    aget v5, v0, v3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    rsub-int v4, v5, 0x3a1

    rem-int/lit16 v4, v4, 0x3a1

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lv0/e;

    invoke-direct {p1, v4, v2}, Lv0/e;-><init>(LD1/a;[I)V

    invoke-virtual {p0, p1}, Lv0/e;->a(Lv0/e;)Lv0/e;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ModulusPolys do not have same ModulusGF field"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lv0/e;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    :try_start_0
    invoke-virtual {p0}, Lv0/e;->e()Lp1/b;

    move-result-object v0

    invoke-virtual {v0}, Lp1/b;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lj1/h; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, ""

    :goto_0
    return-object v0

    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/r;

    if-nez v1, :cond_0

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-gtz v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-lez v3, :cond_1

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bounds{lower="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv0/e;->b:Ljava/lang/Object;

    check-cast v1, LA/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv0/e;->c:Ljava/lang/Object;

    check-cast v1, LA/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lv0/e;->h()I

    move-result v1

    mul-int/lit8 v1, v1, 0x8

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Lv0/e;->h()I

    move-result v1

    :goto_2
    if-ltz v1, :cond_8

    invoke-virtual {p0, v1}, Lv0/e;->g(I)I

    move-result v2

    if-eqz v2, :cond_7

    if-gez v2, :cond_2

    const-string v3, " - "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    neg-int v2, v2

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_3

    const-string v3, " + "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_3
    const/4 v3, 0x1

    if-eqz v1, :cond_4

    if-eq v2, v3, :cond_5

    :cond_4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    if-eqz v1, :cond_7

    if-ne v1, v3, :cond_6

    const/16 v2, 0x78

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_6
    const-string v2, "x^"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_7
    :goto_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
