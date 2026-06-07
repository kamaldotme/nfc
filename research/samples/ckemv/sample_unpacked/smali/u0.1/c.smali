.class public final Lu0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/e;
.implements Ln0/c;


# static fields
.field public static final synthetic k:I


# instance fields
.field public final b:Ln0/s;

.field public final c:Lv0/i;

.field public final d:Ljava/lang/Object;

.field public e:Lv0/j;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Ljava/util/HashMap;

.field public final h:Ljava/util/HashMap;

.field public final i:Lf/G;

.field public j:Lu0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemFgDispatcher"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lu0/c;->d:Ljava/lang/Object;

    invoke-static {p1}, Ln0/s;->p0(Landroid/content/Context;)Ln0/s;

    move-result-object p1

    iput-object p1, p0, Lu0/c;->b:Ln0/s;

    iget-object v0, p1, Ln0/s;->g:Lv0/i;

    iput-object v0, p0, Lu0/c;->c:Lv0/i;

    const/4 v0, 0x0

    iput-object v0, p0, Lu0/c;->e:Lv0/j;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lu0/c;->f:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu0/c;->h:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu0/c;->g:Ljava/util/HashMap;

    new-instance v0, Lf/G;

    iget-object v1, p1, Ln0/s;->m:Lv0/i;

    invoke-direct {v0, v1}, Lf/G;-><init>(Lv0/i;)V

    iput-object v0, p0, Lu0/c;->i:Lf/G;

    iget-object p1, p1, Ln0/s;->i:Ln0/g;

    invoke-virtual {p1, p0}, Ln0/g;->a(Ln0/c;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lv0/j;Lm0/h;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Landroidx/work/impl/foreground/SystemForegroundService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "ACTION_NOTIFY"

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget p0, p2, Lm0/h;->a:I

    const-string v1, "KEY_NOTIFICATION_ID"

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "KEY_FOREGROUND_SERVICE_TYPE"

    iget v1, p2, Lm0/h;->b:I

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "KEY_NOTIFICATION"

    iget-object p2, p2, Lm0/h;->c:Landroid/app/Notification;

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "KEY_WORKSPEC_ID"

    iget-object p2, p1, Lv0/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "KEY_GENERATION"

    iget p1, p1, Lv0/j;->b:I

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Lv0/j;Lm0/h;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Landroidx/work/impl/foreground/SystemForegroundService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "ACTION_START_FOREGROUND"

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "KEY_WORKSPEC_ID"

    iget-object v1, p1, Lv0/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p0, "KEY_GENERATION"

    iget p1, p1, Lv0/j;->b:I

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget p0, p2, Lm0/h;->a:I

    const-string p1, "KEY_NOTIFICATION_ID"

    invoke-virtual {v0, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "KEY_FOREGROUND_SERVICE_TYPE"

    iget p1, p2, Lm0/h;->b:I

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "KEY_NOTIFICATION"

    iget-object p1, p2, Lm0/h;->c:Landroid/app/Notification;

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method public final c(Lv0/o;Lr0/c;)V
    .locals 4

    instance-of p2, p2, Lr0/b;

    if-eqz p2, :cond_0

    iget-object p2, p1, Lv0/o;->a:Ljava/lang/String;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object p1

    iget-object p2, p0, Lu0/c;->b:Ln0/s;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lw0/o;

    new-instance v1, Ln0/m;

    invoke-direct {v1, p1}, Ln0/m;-><init>(Lv0/j;)V

    iget-object p1, p2, Ln0/s;->i:Ln0/g;

    const-string v2, "processor"

    invoke-static {p1, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, -0x200

    const/4 v3, 0x1

    invoke-direct {v0, p1, v1, v3, v2}, Lw0/o;-><init>(Ln0/g;Ln0/m;ZI)V

    iget-object p1, p2, Ln0/s;->g:Lv0/i;

    invoke-virtual {p1, v0}, Lv0/i;->f(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final d(Lv0/j;Z)V
    .locals 7

    iget-object p2, p0, Lu0/c;->d:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lu0/c;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/o;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu0/c;->h:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le2/Q;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Le2/Q;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lu0/c;->f:Ljava/util/LinkedHashMap;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lm0/h;

    iget-object v0, p0, Lu0/c;->e:Lv0/j;

    invoke-virtual {p1, v0}, Lv0/j;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lu0/c;->f:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lu0/c;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/j;

    iput-object v0, p0, Lu0/c;->e:Lv0/j;

    iget-object v0, p0, Lu0/c;->j:Lu0/b;

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/h;

    iget-object v1, p0, Lu0/c;->j:Lu0/b;

    iget v2, v0, Lm0/h;->a:I

    iget v3, v0, Lm0/h;->b:I

    iget-object v4, v0, Lm0/h;->c:Landroid/app/Notification;

    check-cast v1, Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object v5, v1, Landroidx/work/impl/foreground/SystemForegroundService;->c:Landroid/os/Handler;

    new-instance v6, Lu0/d;

    invoke-direct {v6, v1, v2, v4, v3}, Lu0/d;-><init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Lu0/c;->j:Lu0/b;

    iget v0, v0, Lm0/h;->a:I

    check-cast v1, Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object v2, v1, Landroidx/work/impl/foreground/SystemForegroundService;->c:Landroid/os/Handler;

    new-instance v3, LG/a;

    const/4 v4, 0x3

    invoke-direct {v3, v0, v4, v1}, LG/a;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_3
    iput-object v1, p0, Lu0/c;->e:Lv0/j;

    :cond_4
    :goto_2
    iget-object v0, p0, Lu0/c;->j:Lu0/b;

    if-eqz p2, :cond_5

    if-eqz v0, :cond_5

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {p1}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p2, Lm0/h;->a:I

    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object p2, v0, Landroidx/work/impl/foreground/SystemForegroundService;->c:Landroid/os/Handler;

    new-instance v1, LG/a;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2, v0}, LG/a;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_5
    return-void

    :goto_3
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final e(Landroid/content/Intent;)V
    .locals 8

    const-string v0, "KEY_NOTIFICATION_ID"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "KEY_FOREGROUND_SERVICE_TYPE"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "KEY_WORKSPEC_ID"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "KEY_GENERATION"

    invoke-virtual {p1, v4, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    new-instance v5, Lv0/j;

    invoke-direct {v5, v3, v4}, Lv0/j;-><init>(Ljava/lang/String;I)V

    const-string v3, "KEY_NOTIFICATION"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/app/Notification;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_2

    iget-object v3, p0, Lu0/c;->j:Lu0/b;

    if-eqz v3, :cond_2

    new-instance v3, Lm0/h;

    invoke-direct {v3, v0, p1, v2}, Lm0/h;-><init>(ILandroid/app/Notification;I)V

    iget-object v4, p0, Lu0/c;->f:Ljava/util/LinkedHashMap;

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lu0/c;->e:Lv0/j;

    if-nez v3, :cond_0

    iput-object v5, p0, Lu0/c;->e:Lv0/j;

    iget-object v1, p0, Lu0/c;->j:Lu0/b;

    check-cast v1, Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object v3, v1, Landroidx/work/impl/foreground/SystemForegroundService;->c:Landroid/os/Handler;

    new-instance v4, Lu0/d;

    invoke-direct {v4, v1, v0, p1, v2}, Lu0/d;-><init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lu0/c;->j:Lu0/b;

    check-cast v3, Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object v5, v3, Landroidx/work/impl/foreground/SystemForegroundService;->c:Landroid/os/Handler;

    new-instance v6, LF0/b;

    const/4 v7, 0x5

    invoke-direct {v6, v3, v0, p1, v7}, LF0/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    if-eqz v2, :cond_2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_2

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/h;

    iget v0, v0, Lm0/h;->b:I

    or-int/2addr v1, v0

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lu0/c;->e:Lv0/j;

    invoke-virtual {v4, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/h;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lu0/c;->j:Lu0/b;

    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    iget-object v2, v0, Landroidx/work/impl/foreground/SystemForegroundService;->c:Landroid/os/Handler;

    new-instance v3, Lu0/d;

    iget v4, p1, Lm0/h;->a:I

    iget-object p1, p1, Lm0/h;->c:Landroid/app/Notification;

    invoke-direct {v3, v0, v4, p1, v1}, Lu0/d;-><init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public final f()V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lu0/c;->j:Lu0/b;

    iget-object v1, p0, Lu0/c;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lu0/c;->h:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le2/Q;

    invoke-interface {v3, v0}, Le2/Q;->a(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lu0/c;->b:Ln0/s;

    iget-object v0, v0, Ln0/s;->i:Ln0/g;

    invoke-virtual {v0, p0}, Ln0/g;->f(Ln0/c;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
