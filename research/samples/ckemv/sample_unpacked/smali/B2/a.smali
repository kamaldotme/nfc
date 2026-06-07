.class public final LB2/a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/16 v1, 0x8

    const-string v2, "CkemvHarvest.db"

    invoke-direct {p0, p1, v2, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/util/List;)V
    .locals 8

    const-string v0, "cves"

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, v0, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    new-instance v3, Lb1/l;

    invoke-direct {v3}, Lb1/l;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxyz/happify/ckemv/CveConfig;

    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    const-string v6, "id"

    invoke-virtual {v4}, Lxyz/happify/ckemv/CveConfig;->getId()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v6, "name"

    invoke-virtual {v4}, Lxyz/happify/ckemv/CveConfig;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "amount"

    invoke-virtual {v4}, Lxyz/happify/ckemv/CveConfig;->getAmount()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v6, "mc_tags"

    invoke-virtual {v4}, Lxyz/happify/ckemv/CveConfig;->getMastercard_tags()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v3, v7}, Lb1/l;->f(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "visa_tags"

    invoke-virtual {v4}, Lxyz/happify/ckemv/CveConfig;->getVisa_tags()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v4}, Lb1/l;->f(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :goto_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw p1
.end method

.method public final a(J)V
    .locals 4

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "transactions"

    const-string v3, "card_id = ?"

    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const-string p2, "cards"

    const-string v1, "id = ?"

    invoke-virtual {v0, p2, v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 13

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "SELECT * FROM cves"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    new-instance v2, Lb1/l;

    invoke-direct {v2}, Lb1/l;-><init>()V

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_0
    const-string v3, "mc_tags"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v1, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    const-string v5, "{}"

    if-eqz v4, :cond_1

    move-object v3, v5

    goto :goto_0

    :cond_1
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    const-string v4, "visa_tags"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    new-instance v4, Lxyz/happify/ckemv/DatabaseHelper$getAllCves$type$1;

    invoke-direct {v4}, Lxyz/happify/ckemv/DatabaseHelper$getAllCves$type$1;-><init>()V

    invoke-virtual {v4}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v6

    invoke-virtual {v2, v3, v6}, Lb1/l;->c(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    sget-object v6, LL1/u;->b:LL1/u;

    if-nez v3, :cond_3

    move-object v11, v6

    goto :goto_2

    :cond_3
    move-object v11, v3

    :goto_2
    invoke-static {v4}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v3

    invoke-virtual {v2, v5, v3}, Lb1/l;->c(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-nez v3, :cond_4

    move-object v12, v6

    goto :goto_3

    :cond_4
    move-object v12, v3

    :goto_3
    new-instance v3, Lxyz/happify/ckemv/CveConfig;

    const-string v4, "id"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    const-string v4, "name"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v4, "getString(...)"

    invoke-static {v9, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "amount"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    move-object v7, v3

    invoke-direct/range {v7 .. v12}, Lxyz/happify/ckemv/CveConfig;-><init>(ILjava/lang/String;ILjava/util/Map;Ljava/util/Map;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_0

    :cond_5
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "SELECT api_key FROM stats WHERE id = 1"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v2
.end method

.method public final o(Lxyz/happify/ckemv/CardRecord;)J
    .locals 8

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "pan"

    invoke-virtual {p1}, Lxyz/happify/ckemv/CardRecord;->getPan()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "aid"

    invoke-virtual {p1}, Lxyz/happify/ckemv/CardRecord;->getAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "network"

    invoke-virtual {p1}, Lxyz/happify/ckemv/CardRecord;->getNetwork()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "raw_data"

    invoke-virtual {p1}, Lxyz/happify/ckemv/CardRecord;->getRawData()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cards"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v1

    const-wide/16 v4, -0x1

    cmp-long v4, v1, v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Lxyz/happify/ckemv/CardRecord;->getTxs()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxyz/happify/ckemv/HarvestedTx;

    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "card_id"

    invoke-virtual {v5, v7, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v4}, Lxyz/happify/ckemv/HarvestedTx;->getAtc()Ljava/lang/String;

    move-result-object v6

    const-string v7, "atc"

    invoke-virtual {v5, v7, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "arqc"

    invoke-virtual {v4}, Lxyz/happify/ckemv/HarvestedTx;->getArqc()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lxyz/happify/ckemv/HarvestedTx;->getTimeMs()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const-string v7, "time_ms"

    invoke-virtual {v5, v7, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    const-string v6, "params"

    invoke-virtual {v4}, Lxyz/happify/ckemv/HarvestedTx;->getParams()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lxyz/happify/ckemv/HarvestedTx;->getCve_id()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v6, "cve_id"

    invoke-virtual {v5, v6, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "transactions"

    invoke-virtual {v0, v4, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\n            CREATE TABLE cards (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                pan TEXT,\n                aid TEXT,\n                network TEXT,\n                raw_data TEXT,\n                timestamp DATETIME DEFAULT CURRENT_TIMESTAMP\n            )\n        "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "\n            CREATE TABLE transactions (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                card_id INTEGER,\n                atc TEXT,\n                arqc TEXT,\n                time_ms REAL,\n                params TEXT,\n                cve_id INTEGER,\n                FOREIGN KEY(card_id) REFERENCES cards(id)\n            )\n        "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "\n            CREATE TABLE stats (\n                id INTEGER PRIMARY KEY AUTOINCREMENT,\n                total_scans INTEGER DEFAULT 0,\n                api_key TEXT\n            )\n        "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "\n            CREATE TABLE cves (\n                id INTEGER PRIMARY KEY,\n                name TEXT,\n                amount INTEGER,\n                mc_tags TEXT,\n                visa_tags TEXT\n            )\n        "

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "INSERT INTO stats (total_scans, api_key) VALUES (0, NULL)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    const-string p3, "db"

    invoke-static {p1, p3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p3, 0x8

    if-ge p2, p3, :cond_0

    const-string p2, "DROP TABLE IF EXISTS transactions"

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p2, "DROP TABLE IF EXISTS cards"

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p2, "DROP TABLE IF EXISTS stats"

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p2, "DROP TABLE IF EXISTS terminals"

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p2, "DROP TABLE IF EXISTS cves"

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LB2/a;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_0
    return-void
.end method
