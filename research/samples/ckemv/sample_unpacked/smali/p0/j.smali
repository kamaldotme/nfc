.class public final Lp0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/c;


# static fields
.field public static final synthetic l:I


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Lv0/i;

.field public final d:Lw0/x;

.field public final e:Ln0/g;

.field public final f:Ln0/s;

.field public final g:Lp0/c;

.field public final h:Ljava/util/ArrayList;

.field public i:Landroid/content/Intent;

.field public j:Lp0/i;

.field public final k:Lv0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemAlarmDispatcher"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lp0/j;->b:Landroid/content/Context;

    new-instance v1, Lv0/r;

    invoke-direct {v1}, Lv0/r;-><init>()V

    invoke-static {p1}, Ln0/s;->p0(Landroid/content/Context;)Ln0/s;

    move-result-object p1

    iput-object p1, p0, Lp0/j;->f:Ln0/s;

    new-instance v2, Lp0/c;

    iget-object v3, p1, Ln0/s;->e:Lm0/a;

    iget-object v4, v3, Lm0/a;->c:Lm0/r;

    invoke-direct {v2, v0, v4, v1}, Lp0/c;-><init>(Landroid/content/Context;Lm0/r;Lv0/r;)V

    iput-object v2, p0, Lp0/j;->g:Lp0/c;

    new-instance v0, Lw0/x;

    iget-object v1, v3, Lm0/a;->f:Lf/G;

    invoke-direct {v0, v1}, Lw0/x;-><init>(Lf/G;)V

    iput-object v0, p0, Lp0/j;->d:Lw0/x;

    iget-object v0, p1, Ln0/s;->i:Ln0/g;

    iput-object v0, p0, Lp0/j;->e:Ln0/g;

    iget-object p1, p1, Ln0/s;->g:Lv0/i;

    iput-object p1, p0, Lp0/j;->c:Lv0/i;

    new-instance v1, Lv0/c;

    invoke-direct {v1, v0, p1}, Lv0/c;-><init>(Ln0/g;Lv0/i;)V

    iput-object v1, p0, Lp0/j;->k:Lv0/c;

    invoke-virtual {v0, p0}, Ln0/g;->a(Ln0/c;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lp0/j;->h:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput-object p1, p0, Lp0/j;->i:Landroid/content/Intent;

    return-void
.end method

.method public static b()V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Needs to be invoked on the main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Landroid/content/Intent;I)V
    .locals 4

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lp0/j;->b()V

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    const-string v1, "ACTION_CONSTRAINTS_CHANGED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "ACTION_CONSTRAINTS_CHANGED"

    invoke-static {}, Lp0/j;->b()V

    iget-object v1, p0, Lp0/j;->h:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lp0/j;->h:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Intent;

    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    monitor-exit v1

    goto :goto_1

    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_1
    const-string v0, "KEY_START_ID"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p2, p0, Lp0/j;->h:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_1
    iget-object v0, p0, Lp0/j;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lp0/j;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lp0/j;->c()V

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_2
    monitor-exit p2

    return-void

    :goto_3
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1
.end method

.method public final c()V
    .locals 4

    invoke-static {}, Lp0/j;->b()V

    iget-object v0, p0, Lp0/j;->b:Landroid/content/Context;

    const-string v1, "ProcessCommand"

    invoke-static {v0, v1}, Lw0/p;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    iget-object v1, p0, Lp0/j;->f:Ln0/s;

    iget-object v1, v1, Ln0/s;->g:Lv0/i;

    new-instance v2, Lp0/h;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lp0/h;-><init>(Lp0/j;I)V

    invoke-virtual {v1, v2}, Lv0/i;->f(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    throw v1
.end method

.method public final d(Lv0/j;Z)V
    .locals 5

    iget-object v0, p0, Lp0/j;->c:Lv0/i;

    iget-object v0, v0, Lv0/i;->e:Ljava/lang/Object;

    check-cast v0, Ly0/a;

    new-instance v1, LF0/b;

    sget v2, Lp0/c;->g:I

    new-instance v2, Landroid/content/Intent;

    const-class v3, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    iget-object v4, p0, Lp0/j;->b:Landroid/content/Context;

    invoke-direct {v2, v4, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "ACTION_EXECUTION_COMPLETED"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "KEY_NEEDS_RESCHEDULE"

    invoke-virtual {v2, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {v2, p1}, Lp0/c;->c(Landroid/content/Intent;Lv0/j;)V

    const/4 p1, 0x0

    const/4 p2, 0x4

    invoke-direct {v1, p0, v2, p1, p2}, LF0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v0, v1}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
