.class public final Lf0/i;
.super Lf0/h;
.source "SourceFile"

# interfaces
.implements Le0/d;


# instance fields
.field public final c:Landroid/database/sqlite/SQLiteStatement;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteStatement;)V
    .locals 0

    invoke-direct {p0, p1}, Lf0/h;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    iput-object p1, p0, Lf0/i;->c:Landroid/database/sqlite/SQLiteStatement;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Lf0/i;->c:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lf0/i;->c:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    move-result v0

    return v0
.end method
