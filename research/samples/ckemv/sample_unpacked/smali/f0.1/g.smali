.class public final Lf0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/c;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:LJ1/l;

.field public final e:Z

.field public final f:Z

.field public final g:LK1/f;

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LJ1/l;ZZ)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/g;->b:Landroid/content/Context;

    iput-object p2, p0, Lf0/g;->c:Ljava/lang/String;

    iput-object p3, p0, Lf0/g;->d:LJ1/l;

    iput-boolean p4, p0, Lf0/g;->e:Z

    iput-boolean p5, p0, Lf0/g;->f:Z

    new-instance p1, La0/l;

    const/4 p2, 0x2

    invoke-direct {p1, p2, p0}, La0/l;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, La/a;->A(LW1/a;)LK1/f;

    move-result-object p1

    iput-object p1, p0, Lf0/g;->g:LK1/f;

    return-void
.end method


# virtual methods
.method public final a()Lf0/f;
    .locals 1

    iget-object v0, p0, Lf0/g;->g:LK1/f;

    invoke-virtual {v0}, LK1/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/f;

    return-object v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lf0/g;->g:LK1/f;

    iget-object v0, v0, LK1/f;->c:Ljava/lang/Object;

    sget-object v1, LK1/g;->a:LK1/g;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lf0/g;->a()Lf0/f;

    move-result-object v0

    invoke-virtual {v0}, Lf0/f;->close()V

    :cond_0
    return-void
.end method

.method public final s()Lf0/c;
    .locals 2

    invoke-virtual {p0}, Lf0/g;->a()Lf0/f;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf0/f;->a(Z)Lf0/c;

    move-result-object v0

    return-object v0
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 2

    iget-object v0, p0, Lf0/g;->g:LK1/f;

    iget-object v0, v0, LK1/f;->c:Ljava/lang/Object;

    sget-object v1, LK1/g;->a:LK1/g;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lf0/g;->a()Lf0/f;

    move-result-object v0

    const-string v1, "sQLiteOpenHelper"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    :cond_0
    iput-boolean p1, p0, Lf0/g;->h:Z

    return-void
.end method
