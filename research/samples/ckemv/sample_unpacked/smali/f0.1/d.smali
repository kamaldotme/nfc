.class public final synthetic Lf0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# instance fields
.field public final synthetic a:LJ1/l;

.field public final synthetic b:Lf/G;


# direct methods
.method public synthetic constructor <init>(LJ1/l;Lf/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/d;->a:LJ1/l;

    iput-object p2, p0, Lf0/d;->b:Lf/G;

    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 3

    const-string v0, "$callback"

    iget-object v1, p0, Lf0/d;->a:LJ1/l;

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf0/d;->b:Lf/G;

    const-string v1, "$dbRef"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lf0/f;->i:I

    const-string v1, "dbObj"

    invoke-static {p1, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lv0/f;->x(Lf/G;Landroid/database/sqlite/SQLiteDatabase;)Lf0/c;

    move-result-object p1

    const-string v0, "p.second"

    iget-object v1, p1, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, LJ1/l;->c(Ljava/lang/String;)V

    goto :goto_3

    :cond_0
    const/4 v2, 0x0

    :try_start_0
    iget-object v2, p1, Lf0/c;->c:Ljava/util/List;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :try_start_1
    invoke-virtual {p1}, Lf0/c;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-static {v2, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, LJ1/l;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, LJ1/l;->c(Ljava/lang/String;)V

    :cond_2
    throw p1

    :catch_1
    :goto_1
    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-static {v1, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, LJ1/l;->c(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, LJ1/l;->c(Ljava/lang/String;)V

    :cond_4
    :goto_3
    return-void
.end method
