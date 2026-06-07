.class public final Lc0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V
    .locals 1

    const-string v0, "foreignKeys"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lc0/e;->b:Ljava/util/Map;

    iput-object p3, p0, Lc0/e;->c:Ljava/util/Set;

    iput-object p4, p0, Lc0/e;->d:Ljava/util/Set;

    return-void
.end method

.method public static final a(Lf0/c;Ljava/lang/String;)Lc0/e;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "seq"

    const-string v3, "id"

    const-string v4, "type"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "PRAGMA table_info(`"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "`)"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lf0/c;->L(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    :try_start_0
    invoke-interface {v5}, Landroid/database/Cursor;->getColumnCount()I

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v8, 0x0

    const-string v9, "name"

    if-gtz v7, :cond_0

    :try_start_1
    sget-object v4, LL1/u;->b:LL1/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v5, v8}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_0
    move-object v1, v0

    goto/16 :goto_16

    :cond_0
    :try_start_2
    invoke-interface {v5, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v5, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    const-string v13, "notnull"

    invoke-interface {v5, v13}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    const-string v14, "pk"

    invoke-interface {v5, v14}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    const-string v15, "dflt_value"

    invoke-interface {v5, v15}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    new-instance v11, LM1/e;

    invoke-direct {v11}, LM1/e;-><init>()V

    :goto_1
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v16

    if-eqz v16, :cond_2

    invoke-interface {v5, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v17

    if-eqz v17, :cond_1

    const/16 v20, 0x1

    goto :goto_2

    :cond_1
    const/16 v20, 0x0

    :goto_2
    invoke-interface {v5, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v21

    invoke-interface {v5, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v22

    invoke-static {v10, v9}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v24, v7

    new-instance v7, Lc0/a;

    invoke-static {v8, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v23, 0x2

    move-object/from16 v17, v7

    move-object/from16 v18, v10

    move-object/from16 v19, v8

    invoke-direct/range {v17 .. v23}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v11, v10, v7}, LM1/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v7, v24

    const/4 v8, 0x0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_2
    invoke-virtual {v11}, LM1/e;->b()LM1/e;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v7, 0x0

    invoke-static {v5, v7}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "PRAGMA foreign_key_list(`"

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lf0/c;->L(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    :try_start_3
    invoke-interface {v5, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v5, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    const-string v10, "table"

    invoke-interface {v5, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    const-string v11, "on_delete"

    invoke-interface {v5, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    const-string v12, "on_update"

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    invoke-interface {v5, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v5, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    const-string v13, "from"

    invoke-interface {v5, v13}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    const-string v14, "to"

    invoke-interface {v5, v14}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    new-instance v15, LM1/b;

    invoke-direct {v15}, LM1/b;-><init>()V

    :goto_4
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v17

    if-eqz v17, :cond_3

    move-object/from16 v17, v4

    new-instance v4, Lc0/c;

    move-object/from16 v18, v9

    invoke-interface {v5, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    move/from16 v19, v3

    invoke-interface {v5, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    move/from16 v20, v2

    invoke-interface {v5, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    move/from16 v21, v13

    const-string v13, "cursor.getString(fromColumnIndex)"

    invoke-static {v2, v13}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    move/from16 v22, v14

    const-string v14, "cursor.getString(toColumnIndex)"

    invoke-static {v13, v14}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v9, v3, v2, v13}, Lc0/c;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v15, v4}, LM1/b;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, v17

    move-object/from16 v9, v18

    move/from16 v3, v19

    move/from16 v2, v20

    move/from16 v13, v21

    move/from16 v14, v22

    goto :goto_4

    :cond_3
    move-object/from16 v17, v4

    move-object/from16 v18, v9

    invoke-static {v15}, Lv0/f;->k(LM1/b;)LM1/b;

    move-result-object v2

    const-string v3, "<this>"

    invoke-static {v2, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, LM1/b;->a()I

    move-result v3

    const/4 v4, 0x1

    if-gt v3, v4, :cond_4

    invoke-static {v2}, LL1/k;->Y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x0

    goto :goto_5

    :cond_4
    const/4 v4, 0x0

    new-array v3, v4, [Ljava/lang/Comparable;

    invoke-virtual {v2, v3}, LM1/b;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, [Ljava/lang/Comparable;

    array-length v9, v3

    const/4 v13, 0x1

    if-le v9, v13, :cond_5

    invoke-static {v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    :cond_5
    invoke-static {v2}, LL1/j;->Q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :goto_5
    const/4 v3, -0x1

    invoke-interface {v5, v3}, Landroid/database/Cursor;->moveToPosition(I)Z

    new-instance v9, LM1/h;

    invoke-direct {v9}, LM1/h;-><init>()V

    :goto_6
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v5, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_6

    :cond_6
    invoke-interface {v5, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_7
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_8

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v21, v2

    move-object v2, v3

    check-cast v2, Lc0/c;

    iget v2, v2, Lc0/c;->b:I

    if-ne v2, v13, :cond_7

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object/from16 v2, v21

    const/4 v3, -0x1

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto/16 :goto_15

    :cond_8
    move-object/from16 v21, v2

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc0/c;

    iget-object v4, v3, Lc0/c;->d:Ljava/lang/String;

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v3, Lc0/c;->e:Ljava/lang/String;

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_9
    new-instance v2, Lc0/b;

    invoke-interface {v5, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "cursor.getString(tableColumnIndex)"

    invoke-static {v3, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v13, "cursor.getString(onDeleteColumnIndex)"

    invoke-static {v4, v13}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    move/from16 v19, v7

    const-string v7, "cursor.getString(onUpdateColumnIndex)"

    invoke-static {v13, v7}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v24, v2

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    move-object/from16 v27, v13

    move-object/from16 v28, v14

    move-object/from16 v29, v15

    invoke-direct/range {v24 .. v29}, Lc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v9, v2}, LM1/h;->add(Ljava/lang/Object;)Z

    move/from16 v7, v19

    move-object/from16 v2, v21

    const/4 v3, -0x1

    const/4 v4, 0x0

    goto/16 :goto_6

    :cond_a
    invoke-static {v9}, Lm0/z;->c(LM1/h;)LM1/h;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v3, 0x0

    invoke-static {v5, v3}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PRAGMA index_list(`"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lf0/c;->L(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    move-object/from16 v4, v18

    :try_start_4
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    const-string v7, "origin"

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    const-string v8, "unique"

    invoke-interface {v3, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    const/4 v9, -0x1

    if-eq v5, v9, :cond_b

    if-eq v7, v9, :cond_b

    if-ne v8, v9, :cond_c

    :cond_b
    const/4 v0, 0x0

    goto/16 :goto_12

    :cond_c
    new-instance v9, LM1/h;

    invoke-direct {v9}, LM1/h;-><init>()V

    :goto_9
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v10

    if-eqz v10, :cond_15

    invoke-interface {v3, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "c"

    invoke-static {v11, v10}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_e

    move v11, v12

    goto :goto_a

    :cond_e
    const/4 v11, 0x0

    :goto_a
    invoke-static {v10, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "PRAGMA index_xinfo(`"

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v13}, Lf0/c;->L(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    const-string v14, "seqno"

    invoke-interface {v13, v14}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    const-string v15, "cid"

    invoke-interface {v13, v15}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    const-string v0, "desc"

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v18, v4

    const/4 v4, -0x1

    if-eq v14, v4, :cond_f

    if-eq v15, v4, :cond_f

    if-eq v12, v4, :cond_f

    if-ne v0, v4, :cond_10

    :cond_f
    move/from16 v19, v5

    move-object/from16 v22, v6

    move/from16 v23, v7

    move/from16 v25, v8

    const/4 v0, 0x0

    goto/16 :goto_e

    :cond_10
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    move/from16 v19, v5

    new-instance v5, Ljava/util/TreeMap;

    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    :goto_b
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    move-result v21

    if-eqz v21, :cond_13

    invoke-interface {v13, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v21

    if-gez v21, :cond_11

    goto :goto_b

    :cond_11
    invoke-interface {v13, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v21

    move-object/from16 v22, v6

    invoke-interface {v13, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v23

    if-lez v23, :cond_12

    const-string v23, "DESC"

    :goto_c
    move/from16 v24, v0

    move-object/from16 v0, v23

    move/from16 v23, v7

    goto :goto_d

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto/16 :goto_10

    :cond_12
    const-string v23, "ASC"

    goto :goto_c

    :goto_d
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move/from16 v25, v8

    const-string v8, "columnName"

    invoke-static {v6, v8}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v7, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, v22

    move/from16 v7, v23

    move/from16 v0, v24

    move/from16 v8, v25

    goto :goto_b

    :cond_13
    move-object/from16 v22, v6

    move/from16 v23, v7

    move/from16 v25, v8

    invoke-virtual {v4}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v4, "columnsMap.values"

    invoke-static {v0, v4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LL1/k;->Y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v4

    const-string v5, "ordersMap.values"

    invoke-static {v4, v5}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, LL1/k;->Y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lc0/d;

    invoke-direct {v5, v10, v11, v0, v4}, Lc0/d;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    const/4 v0, 0x0

    :try_start_6
    invoke-static {v13, v0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_f

    :goto_e
    invoke-static {v13, v0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v5, v0

    :goto_f
    if-nez v5, :cond_14

    invoke-static {v3, v0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const/4 v8, 0x0

    goto :goto_13

    :cond_14
    :try_start_7
    invoke-virtual {v9, v5}, LM1/h;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-object/from16 v0, p0

    move-object/from16 v4, v18

    move/from16 v5, v19

    move-object/from16 v6, v22

    move/from16 v7, v23

    move/from16 v8, v25

    goto/16 :goto_9

    :catchall_3
    move-exception v0

    move-object v1, v0

    goto :goto_14

    :goto_10
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v0

    move-object v2, v0

    :try_start_9
    invoke-static {v13, v1}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :cond_15
    invoke-static {v9}, Lm0/z;->c(LM1/h;)LM1/h;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    const/4 v4, 0x0

    invoke-static {v3, v4}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    :goto_11
    move-object v8, v0

    goto :goto_13

    :goto_12
    invoke-static {v3, v0}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_11

    :goto_13
    new-instance v0, Lc0/e;

    move-object/from16 v4, v17

    invoke-direct {v0, v1, v4, v2, v8}, Lc0/e;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    return-object v0

    :goto_14
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    move-exception v0

    move-object v2, v0

    invoke-static {v3, v1}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :goto_15
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :catchall_6
    move-exception v0

    move-object v2, v0

    invoke-static {v5, v1}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :goto_16
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :catchall_7
    move-exception v0

    move-object v2, v0

    invoke-static {v5, v1}, La/a;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc0/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc0/e;

    iget-object v1, p1, Lc0/e;->a:Ljava/lang/String;

    iget-object v3, p0, Lc0/e;->a:Ljava/lang/String;

    invoke-static {v3, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc0/e;->b:Ljava/util/Map;

    iget-object v3, p1, Lc0/e;->b:Ljava/util/Map;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc0/e;->c:Ljava/util/Set;

    iget-object v3, p1, Lc0/e;->c:Ljava/util/Set;

    invoke-static {v1, v3}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lc0/e;->d:Ljava/util/Set;

    if-eqz v1, :cond_6

    iget-object p1, p1, Lc0/e;->d:Ljava/util/Set;

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {v1, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :cond_6
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lc0/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc0/e;->b:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lc0/e;->c:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TableInfo{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lc0/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', columns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/e;->b:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", foreignKeys="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/e;->c:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", indices="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc0/e;->d:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
