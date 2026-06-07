.class public final Lf0/f;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field public static final synthetic i:I


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Lf/G;

.field public final d:LJ1/l;

.field public final e:Z

.field public f:Z

.field public final g:Lg0/a;

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lf/G;LJ1/l;Z)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lf0/d;

    invoke-direct {v6, p4, p3}, Lf0/d;-><init>(LJ1/l;Lf/G;)V

    const/4 v4, 0x0

    iget v5, p4, LJ1/l;->b:I

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    iput-object p1, p0, Lf0/f;->b:Landroid/content/Context;

    iput-object p3, p0, Lf0/f;->c:Lf/G;

    iput-object p4, p0, Lf0/f;->d:LJ1/l;

    iput-boolean p5, p0, Lf0/f;->e:Z

    new-instance p3, Lg0/a;

    if-nez p2, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p4, "randomUUID().toString()"

    invoke-static {p2, p4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string p4, "context.cacheDir"

    invoke-static {p1, p4}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p4, 0x0

    invoke-direct {p3, p2, p1, p4}, Lg0/a;-><init>(Ljava/lang/String;Ljava/io/File;Z)V

    iput-object p3, p0, Lf0/f;->g:Lg0/a;

    return-void
.end method


# virtual methods
.method public final a(Z)Lf0/c;
    .locals 3

    iget-object v0, p0, Lf0/f;->g:Lg0/a;

    :try_start_0
    iget-boolean v1, p0, Lf0/f;->h:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lg0/a;->a(Z)V

    iput-boolean v2, p0, Lf0/f;->f:Z

    invoke-virtual {p0, p1}, Lf0/f;->o(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iget-boolean v2, p0, Lf0/f;->f:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lf0/f;->close()V

    invoke-virtual {p0, p1}, Lf0/f;->a(Z)Lf0/c;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lg0/a;->b()V

    return-object p1

    :cond_1
    :try_start_1
    invoke-virtual {p0, v1}, Lf0/f;->b(Landroid/database/sqlite/SQLiteDatabase;)Lf0/c;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Lg0/a;->b()V

    return-object p1

    :goto_1
    invoke-virtual {v0}, Lg0/a;->b()V

    throw p1
.end method

.method public final b(Landroid/database/sqlite/SQLiteDatabase;)Lf0/c;
    .locals 1

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf0/f;->c:Lf/G;

    invoke-static {v0, p1}, Lv0/f;->x(Lf/G;Landroid/database/sqlite/SQLiteDatabase;)Lf0/c;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lf0/f;->g:Lg0/a;

    :try_start_0
    iget-boolean v1, v0, Lg0/a;->a:Z

    invoke-virtual {v0, v1}, Lg0/a;->a(Z)V

    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    iget-object v1, p0, Lf0/f;->c:Lf/G;

    const/4 v2, 0x0

    iput-object v2, v1, Lf/G;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lf0/f;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lg0/a;->b()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lg0/a;->b()V

    throw v1
.end method

.method public final i(Z)Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    const-string v0, "{\n                super.\u2026eDatabase()\n            }"

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    invoke-static {p1, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    invoke-static {p1, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public final o(Z)Landroid/database/sqlite/SQLiteDatabase;
    .locals 5

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lf0/f;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lf0/f;->i(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    const-wide/16 v2, 0x1f4

    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :try_start_2
    invoke-virtual {p0, p1}, Lf0/f;->i(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object p1

    :catchall_1
    move-exception v2

    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    instance-of v3, v2, Lf0/e;

    if-eqz v3, :cond_3

    check-cast v2, Lf0/e;

    iget v3, v2, Lf0/e;->b:I

    invoke-static {v3}, Lq/h;->a(I)I

    move-result v3

    iget-object v2, v2, Lf0/e;->c:Ljava/lang/Throwable;

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2

    instance-of v3, v2, Landroid/database/sqlite/SQLiteException;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    throw v2

    :cond_2
    throw v2

    :cond_3
    instance-of v3, v2, Landroid/database/sqlite/SQLiteException;

    if-eqz v3, :cond_5

    if-eqz v0, :cond_4

    iget-boolean v3, p0, Lf0/f;->e:Z

    if-eqz v3, :cond_4

    :goto_0
    invoke-virtual {v1, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    :try_start_3
    invoke-virtual {p0, p1}, Lf0/f;->i(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1
    :try_end_3
    .catch Lf0/e; {:try_start_3 .. :try_end_3} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    iget-object p1, p1, Lf0/e;->c:Ljava/lang/Throwable;

    throw p1

    :cond_4
    throw v2

    :cond_5
    throw v2
.end method

.method public final onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "db"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lf0/f;->d:LJ1/l;

    invoke-virtual {p0, p1}, Lf0/f;->b(Landroid/database/sqlite/SQLiteDatabase;)Lf0/c;

    move-result-object p1

    invoke-virtual {v0, p1}, LJ1/l;->f(Lf0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lf0/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lf0/e;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lf0/f;->d:LJ1/l;

    invoke-virtual {p0, p1}, Lf0/f;->b(Landroid/database/sqlite/SQLiteDatabase;)Lf0/c;

    move-result-object p1

    invoke-virtual {v0, p1}, LJ1/l;->g(Lf0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lf0/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Lf0/e;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf0/f;->f:Z

    :try_start_0
    iget-object v0, p0, Lf0/f;->d:LJ1/l;

    invoke-virtual {p0, p1}, Lf0/f;->b(Landroid/database/sqlite/SQLiteDatabase;)Lf0/c;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, LJ1/l;->h(Lf0/c;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lf0/e;

    const/4 p3, 0x4

    invoke-direct {p2, p3, p1}, Lf0/e;-><init>(ILjava/lang/Throwable;)V

    throw p2
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "db"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lf0/f;->f:Z

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lf0/f;->d:LJ1/l;

    invoke-virtual {p0, p1}, Lf0/f;->b(Landroid/database/sqlite/SQLiteDatabase;)Lf0/c;

    move-result-object p1

    invoke-virtual {v0, p1}, LJ1/l;->i(Lf0/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v0, Lf0/e;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1}, Lf0/e;-><init>(ILjava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lf0/f;->h:Z

    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf0/f;->f:Z

    :try_start_0
    iget-object v0, p0, Lf0/f;->d:LJ1/l;

    invoke-virtual {p0, p1}, Lf0/f;->b(Landroid/database/sqlite/SQLiteDatabase;)Lf0/c;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, LJ1/l;->j(Lf0/c;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lf0/e;

    const/4 p3, 0x3

    invoke-direct {p2, p3, p1}, Lf0/e;-><init>(ILjava/lang/Throwable;)V

    throw p2
.end method
