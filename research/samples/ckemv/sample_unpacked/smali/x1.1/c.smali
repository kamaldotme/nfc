.class public final Lx1/c;
.super Lx1/h;
.source "SourceFile"


# static fields
.field public static final d:[I


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/StringBuilder;

.field public final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lx1/c;->d:[I

    return-void

    :array_0
    .array-data 4
        0x34
        0x121
        0x61
        0x160
        0x31
        0x130
        0x70
        0x25
        0x124
        0x64
        0x109
        0x49
        0x148
        0x19
        0x118
        0x58
        0xd
        0x10c
        0x4c
        0x1c
        0x103
        0x43
        0x142
        0x13
        0x112
        0x52
        0x7
        0x106
        0x46
        0x16
        0x181
        0xc1
        0x1c0
        0x91
        0x190
        0xd0
        0x85
        0x184
        0xc4
        0xa8
        0xa2
        0x8a
        0x2a
    .end array-data
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lx1/c;->a:Z

    new-instance p1, Ljava/lang/StringBuilder;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object p1, p0, Lx1/c;->b:Ljava/lang/StringBuilder;

    const/16 p1, 0x9

    new-array p1, p1, [I

    iput-object p1, p0, Lx1/c;->c:[I

    return-void
.end method

.method public static i([I)I
    .locals 10

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p0

    const v4, 0x7fffffff

    move v5, v1

    :goto_1
    if-ge v5, v3, :cond_1

    aget v6, p0, v5

    if-ge v6, v4, :cond_0

    if-le v6, v2, :cond_0

    move v4, v6

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    move v2, v1

    move v3, v2

    move v5, v3

    move v6, v5

    :goto_2
    if-ge v2, v0, :cond_3

    aget v7, p0, v2

    if-le v7, v4, :cond_2

    add-int/lit8 v8, v0, -0x1

    sub-int/2addr v8, v2

    const/4 v9, 0x1

    shl-int v8, v9, v8

    or-int/2addr v5, v8

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v6, v7

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, -0x1

    const/4 v7, 0x3

    if-ne v3, v7, :cond_6

    :goto_3
    if-ge v1, v0, :cond_5

    if-lez v3, :cond_5

    aget v7, p0, v1

    if-le v7, v4, :cond_4

    add-int/lit8 v3, v3, -0x1

    shl-int/lit8 v7, v7, 0x1

    if-lt v7, v6, :cond_4

    return v2

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    return v5

    :cond_6
    if-gt v3, v7, :cond_7

    return v2

    :cond_7
    move v2, v4

    goto :goto_0
.end method


# virtual methods
.method public final d(ILp1/a;Ljava/util/Map;)Lj1/l;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Lx1/c;->c:[I

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/util/Arrays;->fill([II)V

    iget-object v4, v0, Lx1/c;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    iget v5, v1, Lp1/a;->c:I

    invoke-virtual {v1, v3}, Lp1/a;->b(I)I

    move-result v6

    array-length v7, v2

    move v9, v3

    move v10, v9

    move v8, v6

    :goto_0
    if-ge v6, v5, :cond_10

    invoke-virtual {v1, v6}, Lp1/a;->a(I)Z

    move-result v11

    const/4 v12, 0x1

    if-eq v11, v9, :cond_0

    aget v11, v2, v10

    add-int/2addr v11, v12

    aput v11, v2, v10

    move/from16 v11, p1

    goto/16 :goto_a

    :cond_0
    add-int/lit8 v11, v7, -0x1

    if-ne v10, v11, :cond_f

    invoke-static {v2}, Lx1/c;->i([I)I

    move-result v11

    const/16 v13, 0x94

    const/4 v14, 0x2

    if-ne v11, v13, :cond_e

    sub-int v11, v6, v8

    div-int/2addr v11, v14

    sub-int v11, v8, v11

    invoke-static {v3, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    invoke-virtual {v1, v11, v8}, Lp1/a;->d(II)Z

    move-result v11

    if-eqz v11, :cond_e

    filled-new-array {v8, v6}, [I

    move-result-object v5

    aget v6, v5, v12

    invoke-virtual {v1, v6}, Lp1/a;->b(I)I

    move-result v6

    :goto_1
    invoke-static {v6, v1, v2}, Lx1/h;->g(ILp1/a;[I)V

    invoke-static {v2}, Lx1/c;->i([I)I

    move-result v7

    if-ltz v7, :cond_d

    move v8, v3

    :goto_2
    const/16 v9, 0x2a

    const-string v10, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%"

    const/16 v11, 0x2b

    if-ge v8, v11, :cond_2

    sget-object v14, Lx1/c;->d:[I

    aget v14, v14, v8

    if-ne v14, v7, :cond_1

    invoke-virtual {v10, v8}, Ljava/lang/String;->charAt(I)C

    move-result v7

    goto :goto_3

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_2
    if-ne v7, v13, :cond_c

    move v7, v9

    :goto_3
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    array-length v8, v2

    move v14, v3

    move v15, v6

    :goto_4
    if-ge v14, v8, :cond_3

    aget v16, v2, v14

    add-int v15, v15, v16

    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_3
    invoke-virtual {v1, v15}, Lp1/a;->b(I)I

    move-result v8

    if-ne v7, v9, :cond_b

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    sub-int/2addr v7, v12

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    array-length v7, v2

    move v9, v3

    move v13, v9

    :goto_5
    if-ge v9, v7, :cond_4

    aget v14, v2, v9

    add-int/2addr v13, v14

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_4
    sub-int v2, v8, v6

    sub-int/2addr v2, v13

    iget v1, v1, Lp1/a;->c:I

    if-eq v8, v1, :cond_6

    shl-int/lit8 v1, v2, 0x1

    if-lt v1, v13, :cond_5

    goto :goto_6

    :cond_5
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_6
    :goto_6
    iget-boolean v1, v0, Lx1/c;->a:Z

    if-eqz v1, :cond_9

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    sub-int/2addr v1, v12

    move v2, v3

    move v7, v2

    :goto_7
    if-ge v2, v1, :cond_7

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v8

    invoke-virtual {v10, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    add-int/2addr v7, v8

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_7
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v2

    rem-int/2addr v7, v11

    invoke-virtual {v10, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v2, v7, :cond_8

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_8

    :cond_8
    invoke-static {}, Lj1/b;->a()Lj1/b;

    move-result-object v1

    throw v1

    :cond_9
    :goto_8
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aget v2, v5, v12

    aget v3, v5, v3

    add-int/2addr v2, v3

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    int-to-float v4, v6

    int-to-float v5, v13

    div-float/2addr v5, v3

    add-float/2addr v5, v4

    new-instance v3, Lj1/l;

    new-instance v4, Lj1/n;

    move/from16 v11, p1

    int-to-float v6, v11

    invoke-direct {v4, v2, v6}, Lj1/n;-><init>(FF)V

    new-instance v2, Lj1/n;

    invoke-direct {v2, v5, v6}, Lj1/n;-><init>(FF)V

    filled-new-array {v4, v2}, [Lj1/n;

    move-result-object v2

    sget-object v4, Lj1/a;->d:Lj1/a;

    const/4 v5, 0x0

    invoke-direct {v3, v1, v5, v2, v4}, Lj1/l;-><init>(Ljava/lang/String;[B[Lj1/n;Lj1/a;)V

    return-object v3

    :cond_a
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_b
    move/from16 v11, p1

    move v6, v8

    goto/16 :goto_1

    :cond_c
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_d
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_e
    move/from16 v11, p1

    aget v13, v2, v3

    aget v15, v2, v12

    add-int/2addr v13, v15

    add-int/2addr v8, v13

    add-int/lit8 v13, v10, -0x1

    invoke-static {v2, v14, v2, v3, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput v3, v2, v13

    aput v3, v2, v10

    add-int/lit8 v10, v10, -0x1

    goto :goto_9

    :cond_f
    move/from16 v11, p1

    add-int/lit8 v10, v10, 0x1

    :goto_9
    aput v12, v2, v10

    xor-int/lit8 v9, v9, 0x1

    :goto_a
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_10
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1
.end method
