.class public final La0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Class;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Ljava/util/concurrent/Executor;

.field public i:Le0/b;

.field public j:Z

.field public final k:I

.field public l:Z

.field public m:Z

.field public final n:J

.field public final o:LA/h;

.field public final p:Ljava/util/LinkedHashSet;

.field public q:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La0/i;->a:Landroid/content/Context;

    const-class p1, Landroidx/work/impl/WorkDatabase;

    iput-object p1, p0, La0/i;->b:Ljava/lang/Class;

    iput-object p2, p0, La0/i;->c:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La0/i;->d:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La0/i;->e:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La0/i;->f:Ljava/util/ArrayList;

    const/4 p1, 0x1

    iput p1, p0, La0/i;->k:I

    iput-boolean p1, p0, La0/i;->l:Z

    const-wide/16 p1, -0x1

    iput-wide p1, p0, La0/i;->n:J

    new-instance p1, LA/h;

    const/16 p2, 0x14

    invoke-direct {p1, p2}, LA/h;-><init>(I)V

    iput-object p1, p0, La0/i;->o:LA/h;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, La0/i;->p:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public final varargs a([Lb0/a;)V
    .locals 5

    iget-object v0, p0, La0/i;->q:Ljava/util/HashSet;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, La0/i;->q:Ljava/util/HashSet;

    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    iget-object v3, p0, La0/i;->q:Ljava/util/HashSet;

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    iget v4, v2, Lb0/a;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, La0/i;->q:Ljava/util/HashSet;

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    iget v2, v2, Lb0/a;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lb0/a;

    iget-object v0, p0, La0/i;->o:LA/h;

    invoke-virtual {v0, p1}, LA/h;->p([Lb0/a;)V

    return-void
.end method
