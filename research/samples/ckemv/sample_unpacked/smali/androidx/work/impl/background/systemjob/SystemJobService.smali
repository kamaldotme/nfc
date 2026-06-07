.class public Landroidx/work/impl/background/systemjob/SystemJobService;
.super Landroid/app/job/JobService;
.source "SourceFile"

# interfaces
.implements Ln0/c;


# static fields
.field public static final synthetic f:I


# instance fields
.field public b:Ln0/s;

.field public final c:Ljava/util/HashMap;

.field public final d:Lv0/r;

.field public e:Lv0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemJobService"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->c:Ljava/util/HashMap;

    new-instance v0, Lv0/r;

    invoke-direct {v0}, Lv0/r;-><init>()V

    iput-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->d:Lv0/r;

    return-void
.end method

.method public static a(Landroid/app/job/JobParameters;)Lv0/j;
    .locals 3

    const-string v0, "EXTRA_WORK_SPEC_ID"

    :try_start_0
    invoke-virtual {p0}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lv0/j;

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "EXTRA_WORK_SPEC_GENERATION"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-direct {v1, v0, p0}, Lv0/j;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final d(Lv0/j;Z)V
    .locals 2

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    iget-object v1, p1, Lv0/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->c:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/job/JobParameters;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->d:Lv0/r;

    invoke-virtual {v0, p1}, Lv0/r;->A(Lv0/j;)Ln0/m;

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1, p2}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ln0/s;->p0(Landroid/content/Context;)Ln0/s;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->b:Ln0/s;

    iget-object v1, v0, Ln0/s;->i:Ln0/g;

    new-instance v2, Lv0/c;

    iget-object v0, v0, Ln0/s;->g:Lv0/i;

    invoke-direct {v2, v1, v0}, Lv0/c;-><init>(Ln0/g;Lv0/i;)V

    iput-object v2, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->e:Lv0/c;

    invoke-virtual {v1, p0}, Ln0/g;->a(Ln0/c;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Landroid/app/Application;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate()."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    iget-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->b:Ln0/s;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ln0/s;->i:Ln0/g;

    invoke-virtual {v0, p0}, Ln0/g;->f(Ln0/c;)V

    :cond_0
    return-void
.end method

.method public final onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 5

    iget-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->b:Ln0/s;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1, v1}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    return v2

    :cond_0
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService;->a(Landroid/app/job/JobParameters;)Lv0/j;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v2

    :cond_1
    iget-object v3, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->c:Ljava/util/HashMap;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {v0}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-exit v3

    return v2

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    invoke-virtual {v0}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v3, Lm0/r;

    invoke-direct {v3}, Lm0/r;-><init>()V

    invoke-static {p1}, Lq0/c;->b(Landroid/app/job/JobParameters;)[Landroid/net/Uri;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {p1}, Lq0/c;->b(Landroid/app/job/JobParameters;)[Landroid/net/Uri;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    :cond_3
    invoke-static {p1}, Lq0/c;->a(Landroid/app/job/JobParameters;)[Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {p1}, Lq0/c;->a(Landroid/app/job/JobParameters;)[Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    :cond_4
    const/16 v4, 0x1c

    if-lt v2, v4, :cond_5

    invoke-static {p1}, Lq0/d;->a(Landroid/app/job/JobParameters;)Landroid/net/Network;

    :cond_5
    iget-object p1, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->e:Lv0/c;

    iget-object v2, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->d:Lv0/r;

    invoke-virtual {v2, v0}, Lv0/r;->D(Lv0/j;)Ln0/m;

    move-result-object v0

    new-instance v2, LG/m;

    iget-object v4, p1, Lv0/c;->c:Ljava/lang/Object;

    check-cast v4, Ln0/g;

    invoke-direct {v2, v4, v0, v3}, LG/m;-><init>(Ln0/g;Ln0/m;Lm0/r;)V

    iget-object p1, p1, Lv0/c;->d:Ljava/lang/Object;

    check-cast p1, Lv0/i;

    invoke-virtual {p1, v2}, Lv0/i;->f(Ljava/lang/Runnable;)V

    return v1

    :goto_0
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 5

    iget-object v0, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->b:Ln0/s;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    :cond_0
    invoke-static {p1}, Landroidx/work/impl/background/systemjob/SystemJobService;->a(Landroid/app/job/JobParameters;)Lv0/j;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    invoke-virtual {v0}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->c:Ljava/util/HashMap;

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v2, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->d:Lv0/r;

    invoke-virtual {v2, v0}, Lv0/r;->A(Lv0/j;)Ln0/m;

    move-result-object v2

    if-eqz v2, :cond_3

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v3, v4, :cond_2

    invoke-static {p1}, Lq0/e;->a(Landroid/app/job/JobParameters;)I

    move-result p1

    goto :goto_0

    :cond_2
    const/16 p1, -0x200

    :goto_0
    iget-object v3, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->e:Lv0/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v2, p1}, Lv0/c;->p(Ln0/m;I)V

    :cond_3
    iget-object p1, p0, Landroidx/work/impl/background/systemjob/SystemJobService;->b:Ln0/s;

    iget-object p1, p1, Ln0/s;->i:Ln0/g;

    iget-object v0, v0, Lv0/j;->a:Ljava/lang/String;

    iget-object v3, p1, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v3

    :try_start_1
    iget-object p1, p1, Ln0/g;->i:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v3

    xor-int/2addr p1, v1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method
