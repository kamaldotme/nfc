.class public final La0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Le0/b;

.field public final d:LA/h;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:I

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/util/Set;

.field public final m:Ljava/util/List;

.field public final n:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Le0/b;LA/h;Ljava/util/ArrayList;ZILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLjava/util/LinkedHashSet;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "migrationContainer"

    invoke-static {p4, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "journalMode"

    invoke-static {v0, p7}, LX/d;->o(Ljava/lang/String;I)V

    const-string v0, "typeConverters"

    invoke-static {p13, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoMigrationSpecs"

    invoke-static {p14, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/b;->a:Landroid/content/Context;

    iput-object p2, p0, La0/b;->b:Ljava/lang/String;

    iput-object p3, p0, La0/b;->c:Le0/b;

    iput-object p4, p0, La0/b;->d:LA/h;

    iput-object p5, p0, La0/b;->e:Ljava/util/List;

    iput-boolean p6, p0, La0/b;->f:Z

    iput p7, p0, La0/b;->g:I

    iput-object p8, p0, La0/b;->h:Ljava/util/concurrent/Executor;

    iput-object p9, p0, La0/b;->i:Ljava/util/concurrent/Executor;

    iput-boolean p10, p0, La0/b;->j:Z

    iput-boolean p11, p0, La0/b;->k:Z

    iput-object p12, p0, La0/b;->l:Ljava/util/Set;

    iput-object p13, p0, La0/b;->m:Ljava/util/List;

    iput-object p14, p0, La0/b;->n:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(II)Z
    .locals 1

    const/4 v0, 0x0

    if-le p1, p2, :cond_0

    iget-boolean p2, p0, La0/b;->k:Z

    if-eqz p2, :cond_0

    return v0

    :cond_0
    iget-boolean p2, p0, La0/b;->j:Z

    if-eqz p2, :cond_2

    iget-object p2, p0, La0/b;->l:Ljava/util/Set;

    if-eqz p2, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method
