.class public final Ls0/b;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/a;


# instance fields
.field public final synthetic c:Ls0/e;

.field public final synthetic d:Ls0/c;


# direct methods
.method public constructor <init>(Ls0/e;Ls0/c;)V
    .locals 0

    iput-object p1, p0, Ls0/b;->c:Ls0/e;

    iput-object p2, p0, Ls0/b;->d:Ls0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LX1/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ls0/b;->c:Ls0/e;

    iget-object v0, v0, Ls0/e;->a:Lt0/e;

    iget-object v1, p0, Ls0/b;->d:Ls0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "listener"

    invoke-static {v1, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lt0/e;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, v0, Lt0/e;->d:Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lt0/e;->d:Ljava/util/LinkedHashSet;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lt0/e;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v2

    sget-object v0, LK1/h;->a:LK1/h;

    return-object v0

    :goto_1
    monitor-exit v2

    throw v0
.end method
