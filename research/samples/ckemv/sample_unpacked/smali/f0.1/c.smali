.class public final Lf0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final d:[Ljava/lang/String;

.field public static final e:[Ljava/lang/String;


# instance fields
.field public final b:Landroid/database/sqlite/SQLiteDatabase;

.field public final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v4, " OR IGNORE "

    const-string v5, " OR REPLACE "

    const-string v0, ""

    const-string v1, " OR ROLLBACK "

    const-string v2, " OR ABORT "

    const-string v3, " OR FAIL "

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lf0/c;->d:[Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lf0/c;->e:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->getAttachedDbs()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lf0/c;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)V
    .locals 1

    const-string v0, "sql"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public final D(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "sql"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bindArgs"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final G()Z
    .locals 1

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    return v0
.end method

.method public final I()Z
    .locals 2

    const-string v0, "sQLiteDatabase"

    iget-object v1, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->isWriteAheadLoggingEnabled()Z

    move-result v0

    return v0
.end method

.method public final J(Le0/e;)Landroid/database/Cursor;
    .locals 4

    new-instance v0, Lf0/b;

    invoke-direct {v0, p1}, Lf0/b;-><init>(Le0/e;)V

    new-instance v1, Lf0/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Lf0/a;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1}, Le0/e;->i()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lf0/c;->e:[Ljava/lang/String;

    const/4 v2, 0x0

    iget-object v3, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v3, v1, p1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    const-string v0, "delegate.rawQueryWithFac\u2026EMPTY_STRING_ARRAY, null)"

    invoke-static {p1, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final K(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 6

    invoke-interface {p1}, Le0/e;->i()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lf0/c;->e:[Ljava/lang/String;

    invoke-static {p2}, LX1/g;->b(Ljava/lang/Object;)V

    new-instance v1, Lf0/a;

    const/4 v0, 0x0

    invoke-direct {v1, v0, p1}, Lf0/a;-><init>(ILjava/lang/Object;)V

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string p1, "sQLiteDatabase"

    invoke-static {v0, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sql"

    invoke-static {v2, p1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    const-string p2, "sQLiteDatabase.rawQueryW\u2026ationSignal\n            )"

    invoke-static {p1, p2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final L(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld1/f;

    invoke-direct {v0, p1}, Ld1/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lf0/c;->J(Le0/e;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public final M()V
    .locals 1

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    return-void
.end method

.method public final N(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 6

    const-string v0, "table"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/content/ContentValues;->size()I

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p3}, Landroid/content/ContentValues;->size()I

    move-result v0

    if-nez p5, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    array-length v1, p5

    add-int/2addr v1, v0

    :goto_0
    new-array v2, v1, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "UPDATE "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Lf0/c;->d:[Ljava/lang/String;

    aget-object p2, v4, p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " SET "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/content/ContentValues;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-lez p2, :cond_1

    const-string v5, ","

    goto :goto_2

    :cond_1
    const-string v5, ""

    :goto_2
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, p2, 0x1

    invoke-virtual {p3, v4}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, p2

    const-string p2, "=?"

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move p2, v5

    goto :goto_1

    :cond_2
    if-eqz p5, :cond_3

    move p1, v0

    :goto_3
    if-ge p1, v1, :cond_3

    sub-int p2, p1, v0

    aget-object p2, p5, p2

    aput-object p2, v2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, " WHERE "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lf0/c;->i(Ljava/lang/String;)Lf0/i;

    move-result-object p1

    invoke-static {p1, v2}, Lm0/z;->b(Le0/d;[Ljava/lang/Object;)V

    iget-object p1, p1, Lf0/i;->c:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    move-result p1

    return p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Empty values"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V

    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    return-void
.end method

.method public final i(Ljava/lang/String;)Lf0/i;
    .locals 2

    const-string v0, "sql"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf0/i;

    iget-object v1, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    const-string v1, "delegate.compileStatement(sql)"

    invoke-static {p1, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lf0/i;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    return-object v0
.end method

.method public final isOpen()Z
    .locals 1

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    return v0
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Lf0/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void
.end method
