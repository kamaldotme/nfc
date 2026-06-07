.class public Lf0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/d;


# instance fields
.field public final b:Landroid/database/sqlite/SQLiteProgram;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteProgram;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/h;->b:Landroid/database/sqlite/SQLiteProgram;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lf0/h;->b:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    return-void
.end method

.method public final f(I[B)V
    .locals 1

    iget-object v0, p0, Lf0/h;->b:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindBlob(I[B)V

    return-void
.end method

.method public final g(I)V
    .locals 1

    iget-object v0, p0, Lf0/h;->b:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteProgram;->bindNull(I)V

    return-void
.end method

.method public final h(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf0/h;->b:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p2, p1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    return-void
.end method

.method public final l(ID)V
    .locals 1

    iget-object v0, p0, Lf0/h;->b:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteProgram;->bindDouble(ID)V

    return-void
.end method

.method public final x(IJ)V
    .locals 1

    iget-object v0, p0, Lf0/h;->b:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    return-void
.end method
