.class public final synthetic LB2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/b;
.implements LK/d;
.implements Le0/b;


# instance fields
.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lm2/b;->d:Lm2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LB2/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-object p1, p0, LB2/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, LI1/w;

    sget v0, Lxyz/happify/ckemv/MainActivity;->F:I

    iget-object v0, p0, LB2/b;->b:Ljava/lang/Object;

    check-cast v0, Lxyz/happify/ckemv/MainActivity;

    const-string v1, "this$0"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "result"

    invoke-static {p1, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, LI1/w;->a:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object v0, v0, Lxyz/happify/ckemv/MainActivity;->A:LB2/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "api_key"

    invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "id = 1"

    const-string v3, "stats"

    invoke-virtual {v0, v3, v2, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string p1, "dbHelper"

    invoke-static {p1}, LX1/g;->h(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Le0/a;)Le0/c;
    .locals 7

    iget-object v0, p0, LB2/b;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    const-string v0, "$context"

    invoke-static {v2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    iget-object v4, p1, Le0/a;->c:LJ1/l;

    invoke-static {v4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Le0/a;->b:Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lf0/g;

    const/4 v6, 0x1

    move-object v1, p1

    move v5, v6

    invoke-direct/range {v1 .. v6}, Lf0/g;-><init>(Landroid/content/Context;Ljava/lang/String;LJ1/l;ZZ)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must set a non-null database name to a configuration that uses the no backup directory."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
