.class public final Lj2/i;
.super Le2/r;
.source "SourceFile"

# interfaces
.implements Le2/y;


# static fields
.field public static final i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final d:Le2/r;

.field public final e:I

.field public final synthetic f:Le2/y;

.field public final g:Lj2/l;

.field public final h:Ljava/lang/Object;

.field private volatile runningWorkers:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lj2/i;

    const-string v1, "runningWorkers"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lj2/i;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ll2/l;I)V
    .locals 0

    invoke-direct {p0}, Le2/r;-><init>()V

    iput-object p1, p0, Lj2/i;->d:Le2/r;

    iput p2, p0, Lj2/i;->e:I

    instance-of p2, p1, Le2/y;

    if-eqz p2, :cond_0

    check-cast p1, Le2/y;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Le2/x;->a:Le2/y;

    :cond_1
    iput-object p1, p0, Lj2/i;->f:Le2/y;

    new-instance p1, Lj2/l;

    invoke-direct {p1}, Lj2/l;-><init>()V

    iput-object p1, p0, Lj2/i;->g:Lj2/l;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj2/i;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final G(JLe2/f;)V
    .locals 1

    iget-object v0, p0, Lj2/i;->f:Le2/y;

    invoke-interface {v0, p1, p2, p3}, Le2/y;->G(JLe2/f;)V

    return-void
.end method

.method public final I(LO1/i;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Lj2/i;->g:Lj2/l;

    invoke-virtual {p1, p2}, Lj2/l;->a(Ljava/lang/Object;)Z

    sget-object p1, Lj2/i;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lj2/i;->e:I

    if-ge p1, p2, :cond_1

    invoke-virtual {p0}, Lj2/i;->M()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lj2/i;->L()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, LD0/c;

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {p2, p0, p1, v0, v1}, LD0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    iget-object p1, p0, Lj2/i;->d:Le2/r;

    invoke-virtual {p1, p0, p2}, Le2/r;->I(LO1/i;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final J(LO1/i;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Lj2/i;->g:Lj2/l;

    invoke-virtual {p1, p2}, Lj2/l;->a(Ljava/lang/Object;)Z

    sget-object p1, Lj2/i;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, Lj2/i;->e:I

    if-ge p1, p2, :cond_1

    invoke-virtual {p0}, Lj2/i;->M()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lj2/i;->L()Ljava/lang/Runnable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, LD0/c;

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {p2, p0, p1, v0, v1}, LD0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    iget-object p1, p0, Lj2/i;->d:Le2/r;

    invoke-virtual {p1, p0, p2}, Le2/r;->J(LO1/i;Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final L()Ljava/lang/Runnable;
    .locals 3

    :goto_0
    iget-object v0, p0, Lj2/i;->g:Lj2/l;

    invoke-virtual {v0}, Lj2/l;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    iget-object v0, p0, Lj2/i;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj2/i;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v2, p0, Lj2/i;->g:Lj2/l;

    invoke-virtual {v2}, Lj2/l;->c()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method

.method public final M()Z
    .locals 4

    iget-object v0, p0, Lj2/i;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj2/i;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    iget v3, p0, Lj2/i;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v2, v3, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
