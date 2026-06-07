.class public final Lo0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf/G;

.field public final b:Lv0/c;

.field public final c:J

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lf/G;Lv0/c;)V
    .locals 3

    const-string v0, "runnableScheduler"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5a

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/d;->a:Lf/G;

    iput-object p2, p0, Lo0/d;->b:Lv0/c;

    iput-wide v0, p0, Lo0/d;->c:J

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/d;->d:Ljava/lang/Object;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lo0/d;->e:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a(Ln0/m;)V
    .locals 2

    const-string v0, "token"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo0/d;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo0/d;->e:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lo0/d;->a:Lf/G;

    iget-object v0, v0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b(Ln0/m;)V
    .locals 3

    new-instance v0, LI1/k;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1, p1}, LI1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v1, p0, Lo0/d;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lo0/d;->e:Ljava/util/LinkedHashMap;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object p1, p0, Lo0/d;->a:Lf/G;

    iget-wide v1, p0, Lo0/d;->c:J

    iget-object p1, p1, Lf/G;->b:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1
.end method
