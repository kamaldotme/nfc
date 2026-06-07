.class public final Lv1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/j;


# static fields
.field public static final b:[Lj1/n;


# instance fields
.field public final a:LG1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lj1/n;

    sput-object v0, Lv1/a;->b:[Lj1/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LG1/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, LG1/d;-><init>(I)V

    iput-object v0, p0, Lv1/a;->a:LG1/d;

    return-void
.end method


# virtual methods
.method public final a(Lv0/e;Ljava/util/Map;)Lj1/l;
    .locals 26

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v7, 0x5

    const/4 v11, 0x2

    const/16 v12, 0x1f

    const/4 v14, 0x1

    invoke-virtual/range {p1 .. p1}, Lv0/e;->e()Lp1/b;

    move-result-object v15

    iget v4, v15, Lp1/b;->b:I

    iget v5, v15, Lp1/b;->c:I

    move v6, v2

    move v0, v3

    move v9, v0

    move v13, v5

    :goto_0
    if-ge v6, v5, :cond_7

    move v8, v2

    :goto_1
    iget v10, v15, Lp1/b;->d:I

    if-ge v8, v10, :cond_6

    mul-int/2addr v10, v6

    add-int/2addr v10, v8

    iget-object v1, v15, Lp1/b;->e:[I

    aget v1, v1, v10

    if-eqz v1, :cond_5

    if-ge v6, v13, :cond_0

    move v13, v6

    :cond_0
    if-le v6, v0, :cond_1

    move v0, v6

    :cond_1
    shl-int/lit8 v10, v8, 0x5

    if-ge v10, v4, :cond_3

    move/from16 v18, v2

    :goto_2
    rsub-int/lit8 v19, v18, 0x1f

    shl-int v19, v1, v19

    if-nez v19, :cond_2

    add-int/lit8 v18, v18, 0x1

    goto :goto_2

    :cond_2
    add-int v7, v10, v18

    if-ge v7, v4, :cond_3

    move v4, v7

    :cond_3
    add-int/lit8 v7, v10, 0x1f

    if-le v7, v9, :cond_5

    move v7, v12

    :goto_3
    ushr-int v18, v1, v7

    if-nez v18, :cond_4

    add-int/2addr v7, v3

    goto :goto_3

    :cond_4
    add-int/2addr v10, v7

    if-le v10, v9, :cond_5

    move v9, v10

    :cond_5
    add-int/2addr v8, v14

    const/4 v7, 0x5

    goto :goto_1

    :cond_6
    add-int/2addr v6, v14

    const/4 v7, 0x5

    goto :goto_0

    :cond_7
    if-lt v9, v4, :cond_9

    if-ge v0, v13, :cond_8

    goto :goto_4

    :cond_8
    sub-int/2addr v9, v4

    add-int/2addr v9, v14

    sub-int/2addr v0, v13

    add-int/2addr v0, v14

    filled-new-array {v4, v13, v9, v0}, [I

    move-result-object v0

    goto :goto_5

    :cond_9
    :goto_4
    const/4 v0, 0x0

    :goto_5
    if-eqz v0, :cond_19

    aget v1, v0, v2

    aget v3, v0, v14

    aget v4, v0, v11

    const/4 v5, 0x3

    aget v0, v0, v5

    const/16 v5, 0x1e

    add-int/lit8 v10, v5, 0x1f

    div-int/lit8 v10, v10, 0x20

    const/16 v5, 0x21

    mul-int/lit8 v8, v10, 0x21

    new-array v6, v8, [I

    move v7, v2

    :goto_6
    if-ge v7, v5, :cond_c

    mul-int v8, v7, v0

    div-int/lit8 v9, v0, 0x2

    add-int/2addr v9, v8

    div-int/2addr v9, v5

    add-int/2addr v9, v3

    move v5, v2

    :goto_7
    const/16 v8, 0x1e

    if-ge v5, v8, :cond_b

    mul-int v13, v5, v4

    div-int/lit8 v17, v4, 0x2

    add-int v17, v17, v13

    and-int/lit8 v13, v7, 0x1

    mul-int/2addr v13, v4

    div-int/2addr v13, v11

    add-int v13, v13, v17

    div-int/2addr v13, v8

    add-int/2addr v13, v1

    invoke-virtual {v15, v13, v9}, Lp1/b;->b(II)Z

    move-result v8

    if-eqz v8, :cond_a

    mul-int v8, v7, v10

    div-int/lit8 v13, v5, 0x20

    add-int/2addr v13, v8

    aget v8, v6, v13

    and-int/lit8 v18, v5, 0x1f

    shl-int v18, v14, v18

    or-int v8, v8, v18

    aput v8, v6, v13

    :cond_a
    add-int/2addr v5, v14

    goto :goto_7

    :cond_b
    add-int/2addr v7, v14

    const/16 v5, 0x21

    goto :goto_6

    :cond_c
    move-object/from16 v5, p0

    iget-object v0, v5, Lv1/a;->a:LG1/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0x90

    new-array v3, v1, [B

    move v4, v2

    const/16 v7, 0x21

    :goto_8
    if-ge v4, v7, :cond_10

    sget-object v8, Lw1/a;->a:[[I

    aget-object v8, v8, v4

    move v9, v2

    :goto_9
    const/16 v13, 0x1e

    if-ge v9, v13, :cond_f

    aget v13, v8, v9

    if-ltz v13, :cond_e

    mul-int v15, v4, v10

    div-int/lit8 v16, v9, 0x20

    add-int v16, v16, v15

    aget v15, v6, v16

    and-int/lit8 v16, v9, 0x1f

    ushr-int v15, v15, v16

    and-int/2addr v15, v14

    if-eqz v15, :cond_d

    move v15, v14

    goto :goto_a

    :cond_d
    move v15, v2

    :goto_a
    if-eqz v15, :cond_e

    const/4 v15, 0x6

    div-int/lit8 v16, v13, 0x6

    aget-byte v18, v3, v16

    rem-int/2addr v13, v15

    const/4 v15, 0x5

    rsub-int/lit8 v13, v13, 0x5

    shl-int v13, v14, v13

    int-to-byte v13, v13

    or-int v13, v18, v13

    int-to-byte v13, v13

    aput-byte v13, v3, v16

    :cond_e
    add-int/2addr v9, v14

    goto :goto_9

    :cond_f
    add-int/2addr v4, v14

    goto :goto_8

    :cond_10
    const/16 v22, 0x0

    const/16 v23, 0xa

    const/16 v24, 0xa

    const/16 v25, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, v3

    invoke-virtual/range {v20 .. v25}, LG1/d;->a([BIIII)V

    aget-byte v4, v3, v2

    and-int/lit8 v4, v4, 0xf

    if-eq v4, v11, :cond_12

    const/4 v6, 0x3

    if-eq v4, v6, :cond_12

    const/4 v6, 0x4

    if-eq v4, v6, :cond_12

    const/4 v6, 0x5

    if-ne v4, v6, :cond_11

    const/16 v22, 0x14

    const/16 v23, 0x44

    const/16 v24, 0x38

    const/16 v25, 0x1

    move-object/from16 v20, v0

    move-object/from16 v21, v3

    invoke-virtual/range {v20 .. v25}, LG1/d;->a([BIIII)V

    const/16 v25, 0x2

    invoke-virtual/range {v20 .. v25}, LG1/d;->a([BIIII)V

    const/16 v0, 0x4e

    new-array v0, v0, [B

    :goto_b
    const/16 v6, 0xa

    goto :goto_c

    :cond_11
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object v0

    throw v0

    :cond_12
    const/16 v22, 0x14

    const/16 v23, 0x54

    const/16 v24, 0x28

    const/16 v25, 0x1

    move-object/from16 v20, v0

    move-object/from16 v21, v3

    invoke-virtual/range {v20 .. v25}, LG1/d;->a([BIIII)V

    const/16 v25, 0x2

    invoke-virtual/range {v20 .. v25}, LG1/d;->a([BIIII)V

    const/16 v0, 0x5e

    new-array v0, v0, [B

    goto :goto_b

    :goto_c
    invoke-static {v3, v2, v0, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v7, v0

    sub-int/2addr v7, v6

    const/16 v8, 0x14

    invoke-static {v3, v8, v0, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    if-eq v4, v11, :cond_15

    const/4 v1, 0x3

    if-eq v4, v1, :cond_15

    const/4 v1, 0x4

    if-eq v4, v1, :cond_14

    const/4 v1, 0x5

    if-eq v4, v1, :cond_13

    goto/16 :goto_e

    :cond_13
    const/16 v1, 0x4d

    invoke-static {v14, v1, v0}, Lw1/a;->b(II[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_e

    :cond_14
    const/16 v1, 0x5d

    invoke-static {v14, v1, v0}, Lw1/a;->b(II[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_e

    :cond_15
    if-ne v4, v11, :cond_16

    const/16 v1, 0x1e

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    invoke-static {v0, v1}, Lw1/a;->a([B[B)I

    move-result v1

    new-instance v6, Ljava/text/DecimalFormat;

    const/4 v7, 0x6

    new-array v7, v7, [B

    fill-array-data v7, :array_1

    invoke-static {v0, v7}, Lw1/a;->a([B[B)I

    move-result v7

    const-string v8, "0000000000"

    invoke-virtual {v8, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    int-to-long v7, v1

    invoke-virtual {v6, v7, v8}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_d

    :cond_16
    sget-object v1, Lw1/a;->b:[Ljava/lang/String;

    aget-object v6, v1, v2

    const/4 v7, 0x6

    new-array v8, v7, [B

    fill-array-data v8, :array_2

    invoke-static {v0, v8}, Lw1/a;->a([B[B)I

    move-result v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->charAt(I)C

    move-result v6

    aget-object v8, v1, v2

    new-array v9, v7, [B

    fill-array-data v9, :array_3

    invoke-static {v0, v9}, Lw1/a;->a([B[B)I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    move-result v8

    aget-object v9, v1, v2

    new-array v10, v7, [B

    fill-array-data v10, :array_4

    invoke-static {v0, v10}, Lw1/a;->a([B[B)I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->charAt(I)C

    move-result v9

    aget-object v10, v1, v2

    new-array v12, v7, [B

    fill-array-data v12, :array_5

    invoke-static {v0, v12}, Lw1/a;->a([B[B)I

    move-result v12

    invoke-virtual {v10, v12}, Ljava/lang/String;->charAt(I)C

    move-result v10

    aget-object v12, v1, v2

    new-array v13, v7, [B

    fill-array-data v13, :array_6

    invoke-static {v0, v13}, Lw1/a;->a([B[B)I

    move-result v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->charAt(I)C

    move-result v12

    aget-object v1, v1, v2

    new-array v13, v7, [B

    fill-array-data v13, :array_7

    invoke-static {v0, v13}, Lw1/a;->a([B[B)I

    move-result v13

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v1

    new-array v7, v7, [C

    aput-char v6, v7, v2

    aput-char v8, v7, v14

    aput-char v9, v7, v11

    const/4 v6, 0x3

    aput-char v10, v7, v6

    const/4 v6, 0x4

    aput-char v12, v7, v6

    const/4 v6, 0x5

    aput-char v1, v7, v6

    invoke-static {v7}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v1

    :goto_d
    new-instance v6, Ljava/text/DecimalFormat;

    const-string v7, "000"

    invoke-direct {v6, v7}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    const/16 v7, 0xa

    new-array v8, v7, [B

    fill-array-data v8, :array_8

    invoke-static {v0, v8}, Lw1/a;->a([B[B)I

    move-result v8

    int-to-long v8, v8

    invoke-virtual {v6, v8, v9}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v8

    new-array v9, v7, [B

    fill-array-data v9, :array_9

    invoke-static {v0, v9}, Lw1/a;->a([B[B)I

    move-result v9

    int-to-long v9, v9

    invoke-virtual {v6, v9, v10}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v6

    const/16 v9, 0x54

    invoke-static {v7, v9, v0}, Lw1/a;->b(II[B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v9, "[)>\u001e01\u001d"

    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_17

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x1d

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v3, v2, v1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_e

    :cond_17
    const/16 v7, 0x1d

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    :goto_e
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lj1/l;

    sget-object v4, Lv1/a;->b:[Lj1/n;

    sget-object v6, Lj1/a;->k:Lj1/a;

    invoke-direct {v3, v1, v0, v4, v6}, Lj1/l;-><init>(Ljava/lang/String;[B[Lj1/n;Lj1/a;)V

    if-eqz v2, :cond_18

    sget-object v0, Lj1/m;->d:Lj1/m;

    invoke-virtual {v3, v0, v2}, Lj1/l;->b(Lj1/m;Ljava/lang/Object;)V

    :cond_18
    return-object v3

    :cond_19
    move-object/from16 v5, p0

    sget-object v0, Lj1/h;->d:Lj1/h;

    throw v0

    nop

    :array_0
    .array-data 1
        0x21t
        0x22t
        0x23t
        0x24t
        0x19t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0x1t
        0x2t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x27t
        0x28t
        0x29t
        0x2at
        0x1ft
        0x20t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x27t
        0x28t
        0x29t
        0x2at
        0x1ft
        0x20t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x21t
        0x22t
        0x23t
        0x24t
        0x19t
        0x1at
    .end array-data

    nop

    :array_4
    .array-data 1
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x13t
        0x14t
    .end array-data

    nop

    :array_5
    .array-data 1
        0x15t
        0x16t
        0x17t
        0x18t
        0xdt
        0xet
    .end array-data

    nop

    :array_6
    .array-data 1
        0xft
        0x10t
        0x11t
        0x12t
        0x7t
        0x8t
    .end array-data

    nop

    :array_7
    .array-data 1
        0x9t
        0xat
        0xbt
        0xct
        0x1t
        0x2t
    .end array-data

    nop

    :array_8
    .array-data 1
        0x35t
        0x36t
        0x2bt
        0x2ct
        0x2dt
        0x2et
        0x2ft
        0x30t
        0x25t
        0x26t
    .end array-data

    nop

    :array_9
    .array-data 1
        0x37t
        0x38t
        0x39t
        0x3at
        0x3bt
        0x3ct
        0x31t
        0x32t
        0x33t
        0x34t
    .end array-data
.end method

.method public final b(Lv0/e;)Lj1/l;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lv1/a;->a(Lv0/e;Ljava/util/Map;)Lj1/l;

    move-result-object p1

    return-object p1
.end method

.method public final c()V
    .locals 0

    return-void
.end method
