.class public final Lx1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[I


# instance fields
.field public final a:[I

.field public final b:Ljava/lang/StringBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lx1/i;->c:[I

    return-void

    :array_0
    .array-data 4
        0x18
        0x14
        0x12
        0x11
        0xc
        0x6
        0x3
        0xa
        0x9
        0x5
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x4

    new-array p1, p1, [I

    iput-object p1, p0, Lx1/i;->a:[I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lx1/i;->b:Ljava/lang/StringBuilder;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x4

    new-array p1, p1, [I

    iput-object p1, p0, Lx1/i;->a:[I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lx1/i;->b:Ljava/lang/StringBuilder;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(ILp1/a;[I)Lj1/l;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Lx1/i;->b:Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    iget-object v4, v0, Lx1/i;->a:[I

    aput v3, v4, v3

    const/4 v5, 0x1

    aput v3, v4, v5

    const/4 v6, 0x2

    aput v3, v4, v6

    const/4 v7, 0x3

    aput v3, v4, v7

    iget v8, v1, Lp1/a;->c:I

    aget v9, p3, v5

    move v10, v3

    move v11, v10

    :goto_0
    const/16 v12, 0xa

    const/4 v13, 0x5

    const/16 v14, 0x30

    if-ge v10, v13, :cond_3

    if-ge v9, v8, :cond_3

    sget-object v13, Lx1/k;->g:[[I

    invoke-static {v1, v4, v9, v13}, Lx1/k;->j(Lp1/a;[II[[I)I

    move-result v13

    rem-int/lit8 v15, v13, 0xa

    add-int/2addr v15, v14

    int-to-char v14, v15

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    array-length v14, v4

    move v15, v3

    :goto_1
    if-ge v15, v14, :cond_0

    aget v16, v4, v15

    add-int v9, v9, v16

    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    :cond_0
    if-lt v13, v12, :cond_1

    rsub-int/lit8 v12, v10, 0x4

    shl-int v12, v5, v12

    or-int/2addr v11, v12

    :cond_1
    const/4 v12, 0x4

    if-eq v10, v12, :cond_2

    invoke-virtual {v1, v9}, Lp1/a;->b(I)I

    move-result v9

    invoke-virtual {v1, v9}, Lp1/a;->c(I)I

    move-result v9

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-ne v1, v13, :cond_13

    move v1, v3

    :goto_2
    if-ge v1, v12, :cond_12

    sget-object v4, Lx1/i;->c:[I

    aget v4, v4, v1

    if-ne v11, v4, :cond_11

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v10, v8, -0x2

    move v11, v3

    :goto_3
    if-ltz v10, :cond_4

    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    move-result v15

    sub-int/2addr v15, v14

    add-int/2addr v11, v15

    add-int/lit8 v10, v10, -0x2

    goto :goto_3

    :cond_4
    mul-int/2addr v11, v7

    sub-int/2addr v8, v5

    :goto_4
    if-ltz v8, :cond_5

    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    sub-int/2addr v10, v14

    add-int/2addr v11, v10

    add-int/lit8 v8, v8, -0x2

    goto :goto_4

    :cond_5
    mul-int/2addr v11, v7

    rem-int/2addr v11, v12

    if-ne v11, v1, :cond_10

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x0

    if-eq v2, v13, :cond_6

    :goto_5
    move-object v6, v4

    goto/16 :goto_b

    :cond_6
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v14, :cond_c

    const/16 v7, 0x35

    if-eq v2, v7, :cond_b

    const/16 v7, 0x39

    const-string v8, ""

    if-eq v2, v7, :cond_7

    goto :goto_8

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v7, -0x1

    sparse-switch v2, :sswitch_data_0

    :goto_6
    move v6, v7

    goto :goto_7

    :sswitch_0
    const-string v2, "99991"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_6

    :sswitch_1
    const-string v2, "99990"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_6

    :cond_8
    move v6, v5

    goto :goto_7

    :sswitch_2
    const-string v2, "90000"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_6

    :cond_9
    move v6, v3

    :cond_a
    :goto_7
    packed-switch v6, :pswitch_data_0

    goto :goto_8

    :pswitch_0
    const-string v2, "0.00"

    goto :goto_a

    :pswitch_1
    const-string v2, "Used"

    goto :goto_a

    :pswitch_2
    move-object v2, v4

    goto :goto_a

    :cond_b
    const-string v8, "$"

    goto :goto_8

    :cond_c
    const-string v8, "\u00a3"

    :goto_8
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    div-int/lit8 v6, v2, 0x64

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    rem-int/lit8 v2, v2, 0x64

    if-ge v2, v12, :cond_d

    const-string v7, "0"

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_9

    :cond_d
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :goto_9
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x2e

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_a
    if-nez v2, :cond_e

    goto/16 :goto_5

    :cond_e
    new-instance v6, Ljava/util/EnumMap;

    const-class v7, Lj1/m;

    invoke-direct {v6, v7}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v7, Lj1/m;->f:Lj1/m;

    invoke-virtual {v6, v7, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_b
    new-instance v2, Lj1/l;

    new-instance v7, Lj1/n;

    aget v3, p3, v3

    aget v5, p3, v5

    add-int/2addr v3, v5

    int-to-float v3, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v3, v5

    move/from16 v8, p1

    int-to-float v5, v8

    invoke-direct {v7, v3, v5}, Lj1/n;-><init>(FF)V

    new-instance v3, Lj1/n;

    int-to-float v8, v9

    invoke-direct {v3, v8, v5}, Lj1/n;-><init>(FF)V

    filled-new-array {v7, v3}, [Lj1/n;

    move-result-object v3

    sget-object v5, Lj1/a;->r:Lj1/a;

    invoke-direct {v2, v1, v4, v3, v5}, Lj1/l;-><init>(Ljava/lang/String;[B[Lj1/n;Lj1/a;)V

    if-eqz v6, :cond_f

    invoke-virtual {v2, v6}, Lj1/l;->a(Ljava/util/Map;)V

    :cond_f
    return-object v2

    :cond_10
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_11
    move/from16 v8, p1

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2

    :cond_12
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :cond_13
    sget-object v1, Lj1/h;->d:Lj1/h;

    throw v1

    :sswitch_data_0
    .sparse-switch
        0x339c7b9 -> :sswitch_2
        0x33e01f0 -> :sswitch_1
        0x33e01f1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
