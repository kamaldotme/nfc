.class public final LJ1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Ljava/util/ArrayList;


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Z

.field public final d:Landroid/hardware/Camera;

.field public final e:Landroid/os/Handler;

.field public final f:LJ1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, LJ1/b;->g:Ljava/util/ArrayList;

    const-string v1, "auto"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "macro"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Landroid/hardware/Camera;LJ1/j;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LI1/c;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, LI1/c;-><init>(ILjava/lang/Object;)V

    new-instance v1, LJ1/a;

    invoke-direct {v1, p0}, LJ1/a;-><init>(LJ1/b;)V

    iput-object v1, p0, LJ1/b;->f:LJ1/a;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v1, p0, LJ1/b;->e:Landroid/os/Handler;

    iput-object p1, p0, LJ1/b;->d:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getFocusMode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, LJ1/b;->g:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, LJ1/b;->c:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, LJ1/b;->a:Z

    invoke-virtual {p0}, LJ1/b;->b()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LJ1/b;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LJ1/b;->e:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LJ1/b;->e:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final b()V
    .locals 2

    iget-boolean v0, p0, LJ1/b;->c:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LJ1/b;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LJ1/b;->b:Z

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, LJ1/b;->d:Landroid/hardware/Camera;

    iget-object v1, p0, LJ1/b;->f:LJ1/a;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LJ1/b;->b:Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, LJ1/b;->a()V

    :cond_0
    :goto_0
    return-void
.end method
