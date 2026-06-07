.class public Landroidx/work/impl/background/systemalarm/SystemAlarmService;
.super Landroidx/lifecycle/u;
.source "SourceFile"

# interfaces
.implements Lp0/i;


# instance fields
.field public c:Lp0/j;

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemAlarmService"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/lifecycle/u;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->d:Z

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Lw0/p;->a:I

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v2, Lw0/q;->a:Lw0/q;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lw0/q;->b:Ljava/util/WeakHashMap;

    invoke-interface {v1, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/PowerManager$WakeLock;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v2

    if-ne v2, v0, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method public final onCreate()V
    .locals 2

    invoke-super {p0}, Landroidx/lifecycle/u;->onCreate()V

    new-instance v0, Lp0/j;

    invoke-direct {v0, p0}, Lp0/j;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->c:Lp0/j;

    iget-object v1, v0, Lp0/j;->j:Lp0/i;

    if-eqz v1, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    iput-object p0, v0, Lp0/j;->j:Lp0/i;

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->d:Z

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    invoke-super {p0}, Landroidx/lifecycle/u;->onDestroy()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->d:Z

    iget-object v0, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->c:Lp0/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lp0/j;->e:Ln0/g;

    invoke-virtual {v1, v0}, Ln0/g;->f(Ln0/c;)V

    const/4 v1, 0x0

    iput-object v1, v0, Lp0/j;->j:Lp0/i;

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/lifecycle/u;->onStartCommand(Landroid/content/Intent;II)I

    iget-boolean p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->d:Z

    if-eqz p2, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->c:Lp0/j;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p2, Lp0/j;->e:Ln0/g;

    invoke-virtual {v0, p2}, Ln0/g;->f(Ln0/c;)V

    const/4 v0, 0x0

    iput-object v0, p2, Lp0/j;->j:Lp0/i;

    new-instance p2, Lp0/j;

    invoke-direct {p2, p0}, Lp0/j;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->c:Lp0/j;

    iget-object v0, p2, Lp0/j;->j:Lp0/i;

    if-eqz v0, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    iput-object p0, p2, Lp0/j;->j:Lp0/i;

    :goto_0
    const/4 p2, 0x0

    iput-boolean p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->d:Z

    :cond_1
    if-eqz p1, :cond_2

    iget-object p2, p0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->c:Lp0/j;

    invoke-virtual {p2, p1, p3}, Lp0/j;->a(Landroid/content/Intent;I)V

    :cond_2
    const/4 p1, 0x3

    return p1
.end method
