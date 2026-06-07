.class public final LB2/q;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:Ljava/lang/Object;

.field public g:I

.field public final synthetic h:Lxyz/happify/ckemv/MainActivity;

.field public final synthetic i:Landroid/nfc/tech/IsoDep;


# direct methods
.method public constructor <init>(Lxyz/happify/ckemv/MainActivity;Landroid/nfc/tech/IsoDep;LO1/d;)V
    .locals 0

    iput-object p1, p0, LB2/q;->h:Lxyz/happify/ckemv/MainActivity;

    iput-object p2, p0, LB2/q;->i:Landroid/nfc/tech/IsoDep;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 2

    new-instance p2, LB2/q;

    iget-object v0, p0, LB2/q;->h:Lxyz/happify/ckemv/MainActivity;

    iget-object v1, p0, LB2/q;->i:Landroid/nfc/tech/IsoDep;

    invoke-direct {p2, v0, v1, p1}, LB2/q;-><init>(Lxyz/happify/ckemv/MainActivity;Landroid/nfc/tech/IsoDep;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, LB2/q;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, LB2/q;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, LB2/q;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    move-object/from16 v1, p0

    const-string v3, "params"

    const-string v4, "raw_data"

    const-string v5, "A000000003"

    sget-object v6, LP1/a;->b:LP1/a;

    iget v0, v1, LB2/q;->g:I

    sget-object v7, LK1/h;->a:LK1/h;

    iget-object v9, v1, LB2/q;->i:Landroid/nfc/tech/IsoDep;

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    iget-object v13, v1, LB2/q;->h:Lxyz/happify/ckemv/MainActivity;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v1, LB2/q;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    move-object v3, v1

    goto/16 :goto_22

    :pswitch_1
    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    move-object v3, v1

    move-object/from16 v25, v7

    goto/16 :goto_24

    :pswitch_2
    iget-object v0, v1, LB2/q;->f:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, LK1/h;

    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_3
    iget-object v0, v1, LB2/q;->f:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, LK1/h;

    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_4
    :try_start_0
    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v3, v1

    move-object v1, v6

    goto/16 :goto_21

    :catch_0
    move-object v3, v1

    move-object v1, v6

    move-object/from16 v25, v7

    goto/16 :goto_20

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    :try_start_1
    iget-object v0, v13, Lxyz/happify/ckemv/MainActivity;->D:Lh2/o;

    new-instance v14, Ljava/lang/Integer;

    invoke-direct {v14, v10}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v14}, Lh2/o;->c(Ljava/lang/Object;)V

    sget-object v0, Le2/B;->a:Ll2/d;

    sget-object v0, Lj2/o;->a:Lf2/d;

    new-instance v14, LB2/m;

    invoke-direct {v14, v13, v12}, LB2/m;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    iput v11, v1, LB2/q;->g:I

    invoke-static {v0, v14, v1}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_0

    return-object v6

    :cond_0
    :goto_0
    invoke-virtual {v9}, Landroid/nfc/tech/IsoDep;->connect()V

    const/16 v0, 0x2710

    invoke-virtual {v9, v0}, Landroid/nfc/tech/IsoDep;->setTimeout(I)V

    iget-object v0, v13, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v14, "dbHelper"

    if-eqz v0, :cond_24

    :try_start_2
    invoke-virtual {v0}, LB2/a;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v15
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :cond_2

    :try_start_3
    invoke-virtual {v9}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_1
    sget-object v0, Le2/B;->a:Ll2/d;

    sget-object v0, Lj2/o;->a:Lf2/d;

    new-instance v2, LB2/p;

    invoke-direct {v2, v13, v12}, LB2/p;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    iput-object v7, v1, LB2/q;->f:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v1, LB2/q;->g:I

    invoke-static {v0, v2, v1}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_1

    return-object v6

    :cond_1
    :goto_1
    return-object v7

    :cond_2
    :try_start_4
    const-string v15, "00A404000E325041592E5359532E444446303100"

    invoke-static {v13, v15}, Lxyz/happify/ckemv/MainActivity;->x(Lxyz/happify/ckemv/MainActivity;Ljava/lang/String;)[B

    move-result-object v15
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v9, v15}, Landroid/nfc/tech/IsoDep;->transceive([B)[B

    move-result-object v15
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    :catch_2
    move-object v15, v12

    :goto_2
    const-string v16, ""

    if-eqz v15, :cond_3

    :try_start_6
    invoke-static {v13, v15}, Lxyz/happify/ckemv/MainActivity;->v(Lxyz/happify/ckemv/MainActivity;[B)Ljava/lang/String;

    move-result-object v15

    goto :goto_3

    :cond_3
    move-object/from16 v15, v16

    :goto_3
    invoke-static {v15, v5}, Ld2/d;->X(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v17
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const-string v18, "Unknown"

    const-string v10, "A000000004"

    const-string v8, "Mastercard"

    const-string v2, "Visa"

    if-eqz v17, :cond_4

    move-object v15, v2

    goto :goto_4

    :cond_4
    :try_start_7
    invoke-static {v15, v10}, Ld2/d;->X(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_5

    move-object v15, v8

    goto :goto_4

    :cond_5
    move-object/from16 v15, v18

    :goto_4
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v21, v11

    check-cast v21, Lxyz/happify/ckemv/CveConfig;

    invoke-static {v15, v2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_6

    invoke-virtual/range {v21 .. v21}, Lxyz/happify/ckemv/CveConfig;->getVisa_tags()Ljava/util/Map;

    move-result-object v22

    invoke-interface/range {v22 .. v22}, Ljava/util/Map;->isEmpty()Z

    move-result v22

    const/16 v20, 0x1

    xor-int/lit8 v22, v22, 0x1

    if-nez v22, :cond_7

    :cond_6
    invoke-static {v15, v8}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_8

    invoke-virtual/range {v21 .. v21}, Lxyz/happify/ckemv/CveConfig;->getMastercard_tags()Ljava/util/Map;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/util/Map;->isEmpty()Z

    move-result v21

    const/16 v20, 0x1

    xor-int/lit8 v21, v21, 0x1

    if-eqz v21, :cond_8

    :cond_7
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    const/4 v11, 0x1

    goto :goto_5

    :cond_9
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const/4 v11, 0x3

    if-eqz v0, :cond_b

    :try_start_8
    invoke-virtual {v9}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :catch_3
    sget-object v0, Le2/B;->a:Ll2/d;

    sget-object v0, Lj2/o;->a:Lf2/d;

    new-instance v2, LB2/p;

    const/4 v3, 0x0

    invoke-direct {v2, v13, v3}, LB2/p;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    iput-object v7, v1, LB2/q;->f:Ljava/lang/Object;

    iput v11, v1, LB2/q;->g:I

    invoke-static {v0, v2, v1}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_a

    return-object v6

    :cond_a
    :goto_6
    return-object v7

    :cond_b
    :try_start_9
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v21, v8

    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v0, "yyMMdd"
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-object/from16 v25, v7

    :try_start_a
    sget-object v7, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {v8, v0, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v7, v0, 0x14

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move-object/from16 v0, v16

    move-object/from16 v22, v0

    const/16 v23, 0x0

    const/16 v24, 0x0

    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v26
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_d
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-object/from16 v27, v6

    if-eqz v26, :cond_1b

    :try_start_b
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Lxyz/happify/ckemv/CveConfig;

    invoke-static {v15, v2}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v28
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_9
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    if-eqz v28, :cond_c

    :try_start_c
    invoke-virtual/range {v26 .. v26}, Lxyz/happify/ckemv/CveConfig;->getVisa_tags()Ljava/util/Map;

    move-result-object v28
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    :goto_8
    move-object/from16 v6, v28

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v3, v1

    :goto_9
    move-object/from16 v1, v27

    goto/16 :goto_21

    :catch_4
    move-object v3, v1

    :catch_5
    :goto_a
    move-object/from16 v1, v27

    goto/16 :goto_20

    :cond_c
    :try_start_d
    invoke-virtual/range {v26 .. v26}, Lxyz/happify/ckemv/CveConfig;->getMastercard_tags()Ljava/util/Map;

    move-result-object v28

    goto :goto_8

    :goto_b
    move-object/from16 v29, v12

    move/from16 v28, v24

    const/4 v12, 0x3

    move-object/from16 v24, v23

    move-object/from16 v23, v2

    const/4 v2, 0x0

    :goto_c
    if-ge v2, v12, :cond_18

    if-eqz v2, :cond_d

    const/4 v12, 0x1

    if-eq v2, v12, :cond_d

    move-object/from16 v30, v0

    const/4 v12, 0x4

    goto :goto_d

    :cond_d
    move-object/from16 v30, v0

    const/16 v12, 0x8

    :goto_d
    invoke-virtual/range {v26 .. v26}, Lxyz/happify/ckemv/CveConfig;->getAmount()I

    move-result v0

    move-object/from16 v31, v14

    move-object/from16 v32, v15

    int-to-long v14, v0

    const/4 v0, 0x0

    :goto_e
    if-ge v0, v12, :cond_17

    const/16 v20, 0x1

    add-int/lit8 v28, v28, 0x1

    const/16 v19, 0x64

    mul-int/lit8 v33, v28, 0x64

    move/from16 v34, v12

    div-int v12, v33, v7

    move/from16 v33, v7

    iget-object v7, v13, Lxyz/happify/ckemv/MainActivity;->D:Lh2/o;

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v12}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v7, v1}, Lh2/o;->c(Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    const/16 v1, 0x5f

    move-object v7, v3

    move-object v12, v4

    int-to-long v3, v1

    mul-long/2addr v14, v3

    const/16 v1, 0x64

    int-to-long v3, v1

    :try_start_e
    div-long/2addr v14, v3

    new-instance v3, La2/c;

    const/16 v4, 0x65

    const/4 v1, 0x1

    invoke-direct {v3, v1, v4, v1}, La2/a;-><init>(III)V

    sget-object v1, LY1/e;->b:LY1/d;

    invoke-static {v1, v3}, Lu2/l;->D(LY1/d;La2/c;)I

    move-result v1

    int-to-long v3, v1

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    sub-long/2addr v14, v3

    const-wide/16 v3, 0x64

    cmp-long v1, v14, v3

    if-ltz v1, :cond_15

    const-string v1, "<this>"

    invoke-static {v6, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v6}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    const/4 v4, 0x6

    invoke-virtual {v3, v4, v2}, Ljava/util/Calendar;->add(II)V

    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "9A"

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "9F02"

    const-string v4, "%012d"
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_8
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    move-object/from16 v35, v6

    :try_start_f
    new-instance v6, Ljava/lang/Long;

    invoke-direct {v6, v14, v15}, Ljava/lang/Long;-><init>(J)V

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    move-object/from16 v36, v8

    const/4 v8, 0x1

    :try_start_10
    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "toString(...)"

    invoke-static {v1, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lxyz/happify/ckemv/EmvKernel;->INSTANCE:Lxyz/happify/ckemv/EmvKernel;

    const/4 v4, 0x1

    invoke-virtual {v3, v4, v1}, Lxyz/happify/ckemv/EmvKernel;->initialize(ZLjava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    :goto_f
    sget-object v1, Lxyz/happify/ckemv/EmvKernel;->INSTANCE:Lxyz/happify/ckemv/EmvKernel;

    invoke-virtual {v1}, Lxyz/happify/ckemv/EmvKernel;->getStatus()Ljava/lang/String;

    move-result-object v6

    const-string v8, "InProgress"

    invoke-static {v6, v8}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-virtual {v1}, Lxyz/happify/ckemv/EmvKernel;->getNextCommand()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_e

    goto :goto_11

    :cond_e
    invoke-static {v13, v6}, Lxyz/happify/ckemv/MainActivity;->x(Lxyz/happify/ckemv/MainActivity;Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v9, v6}, Landroid/nfc/tech/IsoDep;->transceive([B)[B

    move-result-object v6

    invoke-static {v6}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-static {v13, v6}, Lxyz/happify/ckemv/MainActivity;->v(Lxyz/happify/ckemv/MainActivity;[B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lxyz/happify/ckemv/EmvKernel;->processResponse(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_f

    :catchall_2
    move-exception v0

    :goto_10
    move-object/from16 v3, p0

    goto/16 :goto_9

    :catch_6
    move-exception v0

    goto/16 :goto_16

    :cond_f
    :goto_11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v37

    sub-long v3, v37, v3

    long-to-double v3, v3

    invoke-virtual {v1}, Lxyz/happify/ckemv/EmvKernel;->getAtc()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_10

    const-string v6, "N/A"

    :cond_10
    move-object/from16 v38, v6

    invoke-virtual {v1}, Lxyz/happify/ckemv/EmvKernel;->getArqc()Ljava/lang/String;

    move-result-object v39

    invoke-virtual/range {v39 .. v39}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_11

    :goto_12
    const/4 v1, 0x1

    goto :goto_13

    :cond_11
    invoke-virtual {v1}, Lxyz/happify/ckemv/EmvKernel;->getPan()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_12

    move-object/from16 v30, v6

    :cond_12
    invoke-virtual {v1}, Lxyz/happify/ckemv/EmvKernel;->getAid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_13

    move-object/from16 v16, v6

    :cond_13
    invoke-virtual {v1}, Lxyz/happify/ckemv/EmvKernel;->getRawData()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_14

    move-object/from16 v22, v6

    :cond_14
    invoke-virtual {v1}, Lxyz/happify/ckemv/EmvKernel;->getTxParameters()Ljava/lang/String;

    move-result-object v42

    new-instance v1, Lxyz/happify/ckemv/HarvestedTx;

    invoke-virtual/range {v26 .. v26}, Lxyz/happify/ckemv/CveConfig;->getId()I

    move-result v43

    move-object/from16 v37, v1

    move-wide/from16 v40, v3

    invoke-direct/range {v37 .. v43}, Lxyz/happify/ckemv/HarvestedTx;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;I)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    goto :goto_12

    :goto_13
    add-int/2addr v0, v1

    move-object/from16 v1, p0

    move-object v3, v7

    move-object v4, v12

    move/from16 v7, v33

    move/from16 v12, v34

    move-object/from16 v6, v35

    move-object/from16 v8, v36

    goto/16 :goto_e

    :catch_7
    move-exception v0

    :goto_14
    move-object/from16 v36, v8

    goto :goto_16

    :catch_8
    move-exception v0

    move-object/from16 v35, v6

    goto :goto_14

    :cond_15
    move-object/from16 v35, v6

    move-object/from16 v36, v8

    :goto_15
    move-object/from16 v0, v30

    goto :goto_18

    :goto_16
    :try_start_11
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_16

    const-string v0, "Lost connection to card"
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_9
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    goto :goto_17

    :catch_9
    move-object/from16 v3, p0

    goto/16 :goto_a

    :cond_16
    :goto_17
    move-object/from16 v24, v0

    goto :goto_15

    :cond_17
    move-object v12, v4

    move-object/from16 v35, v6

    move/from16 v33, v7

    move-object/from16 v36, v8

    move-object v7, v3

    goto :goto_15

    :goto_18
    if-nez v24, :cond_19

    const/4 v1, 0x1

    add-int/2addr v2, v1

    move-object/from16 v1, p0

    move-object v3, v7

    move-object v4, v12

    move-object/from16 v14, v31

    move-object/from16 v15, v32

    move/from16 v7, v33

    move-object/from16 v6, v35

    move-object/from16 v8, v36

    const/4 v12, 0x3

    goto/16 :goto_c

    :cond_18
    move-object/from16 v30, v0

    move-object v12, v4

    move/from16 v33, v7

    move-object/from16 v36, v8

    move-object/from16 v31, v14

    move-object/from16 v32, v15

    move-object v7, v3

    :cond_19
    if-eqz v24, :cond_1a

    :goto_19
    move-object/from16 v1, v16

    move-object/from16 v2, v22

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p0

    move-object v3, v7

    move-object v4, v12

    move-object/from16 v2, v23

    move-object/from16 v23, v24

    move-object/from16 v6, v27

    move/from16 v24, v28

    move-object/from16 v12, v29

    move-object/from16 v14, v31

    move-object/from16 v15, v32

    move/from16 v7, v33

    move-object/from16 v8, v36

    goto/16 :goto_7

    :cond_1b
    move-object/from16 v23, v2

    move-object v7, v3

    move-object v12, v4

    move-object/from16 v31, v14

    goto :goto_19

    :goto_1a
    :try_start_12
    invoke-virtual {v9}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_a
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    :catch_a
    :try_start_13
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_9
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-eqz v3, :cond_23

    const/4 v3, 0x0

    :try_start_14
    invoke-static {v1, v5, v3}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1c

    move-object/from16 v22, v23

    goto :goto_1b

    :cond_1c
    invoke-static {v1, v10, v3}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_9
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    if-eqz v4, :cond_1d

    move-object/from16 v22, v21

    goto :goto_1b

    :cond_1d
    move-object/from16 v22, v18

    :goto_1b
    :try_start_15
    new-instance v3, Lxyz/happify/ckemv/CardRecord;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1e

    const-string v0, "Unknown PAN"

    :cond_1e
    move-object/from16 v20, v0

    move-object/from16 v19, v3

    move-object/from16 v21, v1

    move-object/from16 v23, v2

    move-object/from16 v24, v11

    invoke-direct/range {v19 .. v24}, Lxyz/happify/ckemv/CardRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_9
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    :try_start_16
    iget-object v0, v13, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_9
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    if-eqz v0, :cond_22

    :try_start_17
    invoke-virtual {v0, v3}, LB2/a;->o(Lxyz/happify/ckemv/CardRecord;)J

    move-result-wide v36
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_9
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    :try_start_18
    iget-object v0, v13, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_9
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    if-eqz v0, :cond_21

    :try_start_19
    invoke-virtual {v0}, LB2/a;->i()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1f

    const-string v0, "no-key"

    :cond_1f
    move-object/from16 v34, v0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "pan"

    invoke-virtual {v3}, Lxyz/happify/ckemv/CardRecord;->getPan()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "aid"

    invoke-virtual {v3}, Lxyz/happify/ckemv/CardRecord;->getAid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "network"

    invoke-virtual {v3}, Lxyz/happify/ckemv/CardRecord;->getNetwork()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "tx_count"

    invoke-virtual {v3}, Lxyz/happify/ckemv/CardRecord;->getTxs()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_9
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    :try_start_1a
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {v3}, Lxyz/happify/ckemv/CardRecord;->getRawData()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_b
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    goto :goto_1c

    :catch_b
    :try_start_1b
    invoke-virtual {v3}, Lxyz/happify/ckemv/CardRecord;->getRawData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_1c
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v3}, Lxyz/happify/ckemv/CardRecord;->getTxs()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxyz/happify/ckemv/HarvestedTx;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "atc"

    invoke-virtual {v3}, Lxyz/happify/ckemv/HarvestedTx;->getAtc()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "arqc"

    invoke-virtual {v3}, Lxyz/happify/ckemv/HarvestedTx;->getArqc()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "time_ms"

    invoke-virtual {v3}, Lxyz/happify/ckemv/HarvestedTx;->getTimeMs()D

    move-result-wide v10

    invoke-virtual {v4, v5, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v5, "cve_id"

    invoke-virtual {v3}, Lxyz/happify/ckemv/HarvestedTx;->getCve_id()I

    move-result v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_9
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    :try_start_1c
    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {v3}, Lxyz/happify/ckemv/HarvestedTx;->getParams()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    goto :goto_1e

    :catch_c
    :try_start_1d
    invoke-virtual {v3}, Lxyz/happify/ckemv/HarvestedTx;->getParams()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_1e
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1d

    :cond_20
    const-string v2, "harvested_txs"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_9
    .catchall {:try_start_1d .. :try_end_1d} :catchall_2

    :try_start_1e
    sget-object v1, Le2/B;->b:Ll2/c;
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_9
    .catchall {:try_start_1e .. :try_end_1e} :catchall_4

    :try_start_1f
    invoke-static {v1}, Le2/v;->a(LO1/i;)Lj2/e;

    move-result-object v1

    new-instance v2, LB2/o;
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_9
    .catchall {:try_start_1f .. :try_end_1f} :catchall_2

    move-object/from16 v3, p0

    :try_start_20
    iget-object v4, v3, LB2/q;->h:Lxyz/happify/ckemv/MainActivity;

    const/16 v38, 0x0

    move-object/from16 v32, v2

    move-object/from16 v33, v0

    move-object/from16 v35, v4

    invoke-direct/range {v32 .. v38}, LB2/o;-><init>(Lorg/json/JSONObject;Ljava/lang/String;Lxyz/happify/ckemv/MainActivity;JLO1/d;)V

    const/4 v4, 0x0

    const/4 v5, 0x3

    invoke-static {v1, v4, v2, v5}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    goto :goto_1f

    :catchall_3
    move-exception v0

    goto/16 :goto_9

    :catchall_4
    move-exception v0

    goto/16 :goto_10

    :cond_21
    move-object/from16 v3, p0

    invoke-static/range {v31 .. v31}, LX1/g;->h(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    :cond_22
    move-object/from16 v3, p0

    invoke-static/range {v31 .. v31}, LX1/g;->h(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_5
    .catchall {:try_start_20 .. :try_end_20} :catchall_3

    :cond_23
    move-object/from16 v3, p0

    :goto_1f
    sget-object v0, Le2/B;->a:Ll2/d;

    sget-object v0, Lj2/o;->a:Lf2/d;

    new-instance v1, LB2/p;

    const/4 v2, 0x0

    invoke-direct {v1, v13, v2}, LB2/p;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    const/4 v2, 0x4

    iput v2, v3, LB2/q;->g:I

    invoke-static {v0, v1, v3}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v27

    if-ne v0, v1, :cond_26

    return-object v1

    :catch_d
    move-object v3, v1

    move-object v1, v6

    goto :goto_20

    :cond_24
    move-object v3, v1

    move-object v1, v6

    move-object/from16 v25, v7

    move-object/from16 v31, v14

    :try_start_21
    invoke-static/range {v31 .. v31}, LX1/g;->h(Ljava/lang/String;)V

    const/4 v2, 0x0

    throw v2
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_e
    .catchall {:try_start_21 .. :try_end_21} :catchall_5

    :catch_e
    :goto_20
    :try_start_22
    invoke-virtual {v9}, Landroid/nfc/tech/IsoDep;->close()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_f
    .catchall {:try_start_22 .. :try_end_22} :catchall_5

    goto :goto_23

    :catchall_5
    move-exception v0

    :goto_21
    sget-object v2, Le2/B;->a:Ll2/d;

    sget-object v2, Lj2/o;->a:Lf2/d;

    new-instance v4, LB2/p;

    const/4 v5, 0x0

    invoke-direct {v4, v13, v5}, LB2/p;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    iput-object v0, v3, LB2/q;->f:Ljava/lang/Object;

    const/4 v5, 0x6

    iput v5, v3, LB2/q;->g:I

    invoke-static {v2, v4, v3}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_25

    return-object v1

    :cond_25
    :goto_22
    throw v0

    :catch_f
    :goto_23
    sget-object v0, Le2/B;->a:Ll2/d;

    sget-object v0, Lj2/o;->a:Lf2/d;

    new-instance v2, LB2/p;

    const/4 v4, 0x0

    invoke-direct {v2, v13, v4}, LB2/p;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    const/4 v4, 0x5

    iput v4, v3, LB2/q;->g:I

    invoke-static {v0, v2, v3}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_26

    return-object v1

    :cond_26
    :goto_24
    return-object v25

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
