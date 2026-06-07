.class public abstract Landroidx/work/impl/WorkDatabase;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:Lf0/c;

.field public b:Ljava/util/concurrent/Executor;

.field public c:Le0/c;

.field public final d:La0/f;

.field public e:Z

.field public f:Ljava/util/List;

.field public final g:Ljava/util/LinkedHashMap;

.field public final h:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final i:Ljava/lang/ThreadLocal;

.field public final j:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->d()La0/f;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase;->d:La0/f;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase;->g:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase;->h:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase;->i:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "synchronizedMap(mutableMapOf())"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase;->j:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static r(Ljava/lang/Class;Le0/c;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p1, La0/c;

    if-eqz v0, :cond_1

    check-cast p1, La0/c;

    invoke-interface {p1}, La0/c;->a()Le0/c;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/work/impl/WorkDatabase;->r(Ljava/lang/Class;Le0/c;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, Landroidx/work/impl/WorkDatabase;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v2

    if-eqz v0, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 2

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    invoke-interface {v0}, Le0/c;->s()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->G()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase;->i:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on a different coroutine context inherited from a suspending transaction."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 2

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->a()V

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->a()V

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    invoke-interface {v0}, Le0/c;->s()Lf0/c;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/impl/WorkDatabase;->d:La0/f;

    invoke-virtual {v1, v0}, La0/f;->c(Lf0/c;)V

    invoke-virtual {v0}, Lf0/c;->I()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lf0/c;->b()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf0/c;->a()V

    :goto_0
    return-void
.end method

.method public abstract d()La0/f;
.end method

.method public abstract e(La0/b;)Le0/c;
.end method

.method public abstract f()Lv0/c;
.end method

.method public g(Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 1

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LL1/t;->b:LL1/t;

    return-object p1
.end method

.method public final h()Le0/c;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase;->c:Le0/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "internalOpenHelper"

    invoke-static {v0}, LX1/g;->h(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public i()Ljava/util/Set;
    .locals 1

    sget-object v0, LL1/v;->b:LL1/v;

    return-object v0
.end method

.method public j()Ljava/util/Map;
    .locals 1

    sget-object v0, LL1/u;->b:LL1/u;

    return-object v0
.end method

.method public final k()V
    .locals 4

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    invoke-interface {v0}, Le0/c;->s()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->o()V

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    invoke-interface {v0}, Le0/c;->s()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->G()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase;->d:La0/f;

    iget-object v1, v0, La0/f;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, La0/f;->a:Landroidx/work/impl/WorkDatabase;

    iget-object v1, v1, Landroidx/work/impl/WorkDatabase;->b:Ljava/util/concurrent/Executor;

    if-eqz v1, :cond_0

    iget-object v0, v0, La0/f;->l:LF0/h;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    const-string v0, "internalQueryExecutor"

    invoke-static {v0}, LX1/g;->h(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final l()Z
    .locals 2

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase;->a:Lf0/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf0/c;->isOpen()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public abstract m()Lv0/e;
.end method

.method public final n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->a()V

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->b()V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    invoke-interface {v0}, Le0/c;->s()Lf0/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf0/c;->K(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object p2

    invoke-interface {p2}, Le0/c;->s()Lf0/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lf0/c;->J(Le0/e;)Landroid/database/Cursor;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final o(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->k()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->k()V

    throw p1
.end method

.method public final p()V
    .locals 1

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->h()Le0/c;

    move-result-object v0

    invoke-interface {v0}, Le0/c;->s()Lf0/c;

    move-result-object v0

    invoke-virtual {v0}, Lf0/c;->M()V

    return-void
.end method

.method public abstract q()Lv0/i;
.end method

.method public abstract s()Lv0/l;
.end method

.method public abstract t()Lv0/m;
.end method

.method public abstract u()Lv0/p;
.end method

.method public abstract v()Lv0/r;
.end method
