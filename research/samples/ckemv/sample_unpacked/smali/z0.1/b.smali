.class public abstract Lz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "DiagnosticsWrkr"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(\"DiagnosticsWrkr\")"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final a(Lv0/l;Lv0/r;Lv0/i;Ljava/util/ArrayList;)V
    .locals 17

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv0/o;

    invoke-static {v2}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v3

    move-object/from16 v4, p2

    invoke-virtual {v4, v3}, Lv0/i;->i(Lv0/j;)Lv0/g;

    move-result-object v3

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget v3, v3, Lv0/g;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, v5

    :goto_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "SELECT name FROM workname WHERE work_spec_id=?"

    const/4 v7, 0x1

    invoke-static {v6, v7}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v6

    iget-object v8, v2, Lv0/o;->a:Ljava/lang/String;

    if-nez v8, :cond_1

    invoke-virtual {v6, v7}, La0/j;->g(I)V

    :goto_2
    move-object/from16 v7, p0

    goto :goto_3

    :cond_1
    invoke-virtual {v6, v8, v7}, La0/j;->h(Ljava/lang/String;I)V

    goto :goto_2

    :goto_3
    iget-object v9, v7, Lv0/l;->d:Ljava/lang/Object;

    check-cast v9, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->b()V

    invoke-virtual {v9, v6, v5}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v9

    :try_start_0
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    :goto_4
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v11

    if-eqz v11, :cond_3

    const/4 v11, 0x0

    invoke-interface {v9, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_2

    move-object v11, v5

    goto :goto_5

    :cond_2
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    :goto_5
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_3
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    invoke-virtual {v6}, La0/j;->o()V

    const/4 v13, 0x0

    const/16 v15, 0x3e

    const-string v11, ","

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v15}, LL1/k;->W(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW1/l;I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v10, p1

    invoke-virtual {v10, v8}, Lv0/r;->t(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    const/16 v16, 0x3e

    const-string v12, ","

    const/4 v15, 0x0

    invoke-static/range {v11 .. v16}, LL1/k;->W(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW1/l;I)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v11, "\n"

    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\t "

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v2, Lv0/o;->c:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v2, Lv0/o;->b:I

    invoke-static {v2}, LX/d;->s(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x9

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :goto_6
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    invoke-virtual {v6}, La0/j;->o()V

    throw v0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
